package org.schema.generator

/**
 * @author Victor Kropp
 */

class ApiGenerator(private val sink: GeneratorSink, private val banner: String? = null) {
    fun generate(p: Package) {
        p.writeClass("SchemaOrg") {
            appendln(banner)
            appendln()
            appendln("package ${p.name};")
            appendln()
            appendln("import com.fasterxml.jackson.core.JsonProcessingException;")
            appendln("import com.fasterxml.jackson.databind.JsonNode;")
            appendln("import com.fasterxml.jackson.databind.ObjectMapper;")
            appendln("import org.jetbrains.annotations.NotNull;")
            appendln()
            appendln("public class SchemaOrg {")

            for (type in sink.types.values) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || sink.shouldSkip(type.name!!) || (type.parentType == null && type.name != "Thing" && !type.isInterface))
                    continue
                if (type.isEnum || type.name == "http://schema.org/Enumeration" || (type.parentType?.let{ sink.types[it] }?.isEnum == true)) continue

                val typeName = type.name!!.capitalize()

                type.comment?.let {
                    appendln("  /**")
                    appendln("   * $it")
                    appendln("   */")
                }
                appendln("  @NotNull public static $typeName.Builder ${typeName.decapitalize()}() { return new $typeName.Builder(); }")
            }
            appendln()
            appendln("  public static ThingBuilder getBuilder(@NotNull String type) {")
            for (type in sink.types.values) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || type.isEnum || sink.shouldSkip(type.name!!) || (type.parentType == null && type.name != "Thing" && !type.isInterface && !type.isEnum))
                    continue
                if (type.isEnum || type.name == "http://schema.org/Enumeration" || (type.parentType?.let{ sink.types[it] }?.isEnum == true)) continue

                val typeName = type.name!!.capitalize()

                appendln("    if (\"$typeName\".equals(type)) { return new $typeName.Builder(); }")
            }
            appendln("    return null;")
            appendln("  }")
            appendln()
            appendln("  private static final ObjectMapper objectMapper = new ObjectMapper();")
            appendln("  static {")
            appendln("    objectMapper.registerModule(new JsonLdModule());")
            appendln("  }")
            appendln("  @NotNull public static String writeJson(@NotNull Thing thing) throws JsonProcessingException {")
            appendln("    return objectMapper.writeValueAsString(thing);")
            appendln("  }")
            appendln("  public static Thing readJson(@NotNull String json) throws java.io.IOException {")
            appendln("    return objectMapper.readValue(json, Thing.class);")
            appendln("  }")
            appendln("  public static Thing readJson(@NotNull JsonNode node) {")
            appendln("    return ThingDeserializer.fromMap(objectMapper.convertValue(node, java.util.Map.class));")
            appendln("  }")
            appendln("  public static Thing fromMap(@NotNull java.util.Map<String, Object> map) {")
            appendln("    return ThingDeserializer.fromMap(map);")
            appendln("  }")
            appendln("  public static java.util.Map<String, Object> toMap(@NotNull Thing thing) {")
            appendln("    final java.util.HashMap<String, Object> result = new java.util.HashMap<String, Object>();")
            appendln("    for (java.util.Map.Entry<String, Object> entry : thing.myData.entrySet()) {")
            appendln("    if (entry.getValue() instanceof Thing) {")
            appendln("        result.put(entry.getKey(), toMap((Thing) entry.getValue()));")
            appendln("      } else if (entry.getValue() instanceof java.util.List) {")
            appendln("        final java.util.ArrayList<Object> list = new java.util.ArrayList<Object>();")
            appendln("        for (Object o : ((java.util.List) entry.getValue())) {")
            appendln("          if (o instanceof Thing) {")
            appendln("            list.add(toMap((Thing) o));")
            appendln("          } else {")
            appendln("            list.add(o);")
            appendln("          }")
            appendln("        }")
            appendln("        result.put(entry.getKey(), list);")
            appendln("      } else {")
            appendln("        result.put(entry.getKey(), entry.getValue());")
            appendln("      }")
            appendln("    }")
            appendln("    return result;")
            appendln("  }")
            appendln("}")
        }

        p.writeClass("ThingBuilder", """$banner

package ${p.name};

public interface ThingBuilder<T> {
  void fromMap(java.util.Map<String,Object> map);
  T build();
}""")
        p.writeClass("JsonLdModule", """$banner

package ${p.name};

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonLdModule extends SimpleModule {
    public JsonLdModule() {
        super("JsonLD Module", new Version(1, 0, 0, null, null, null));
        addDeserializer(Thing.class, new ThingDeserializer());
        addSerializer(Date.class, new DateSerializer());
    }
    private static class DateSerializer extends JsonSerializer<Date> {
        private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXX");
        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(DATE_FORMAT.format(value));
        }
    }
}""")
        p.writeClass("ThingDeserializer", """$banner

package ${p.name};

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.jetbrains.annotations.Nullable;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.text.*;

/**
 * Typed deserializer for {@link org.schema.Thing}
 */
class ThingDeserializer extends JsonDeserializer<Thing> {
    private static final DateFormat dateFormat = new ISO8601DateFormat();

    @Override
    public Thing deserialize(JsonParser p, DeserializationContext ctx) throws IOException {
        return fromMap(p.<HashMap<String, Object>>readValueAs(new TypeReference<HashMap<String, Object>>() {
        }));
    }

    @Nullable
    static Thing fromMap(Map<String, Object> result) {
        if (!"http://schema.org/".equals(result.get("@context"))) {
            return null;
        }

        final Object type = result.get("@type");
        if (type == null || !(type instanceof String)) {
            return null;
        }

        final ThingBuilder builder = SchemaOrg.getBuilder((String) type);
        if (builder == null) {
            return null;
        }

        for (Map.Entry<String, Object> entry : result.entrySet()) {
            if (entry.getValue() instanceof String) {
                try {
                    final Date date = dateFormat.parse((String) entry.getValue());
                    result.put(entry.getKey(), date);
                } catch (ParseException ignored) {
                }
            }
        }

        builder.fromMap(result);
        return (Thing) builder.build();
    }
}""")
    }
}