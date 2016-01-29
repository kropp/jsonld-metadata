package org.schema.generator

import java.io.File

/**
 * @author Victor Kropp
 */

class ClassesGenerator(private val sink: GeneratorSink, private val banner: String? = null) {
    fun generate(dir: File, ns: String) {
        val packageDir = ns.split(Regex("\\.")).fold(dir) { d, s -> File(d, s) }
        packageDir.mkdirs()
        generateTypes(ns, packageDir)
        generateBuilders(ns, packageDir)
    }

    private fun generateTypes(ns: String, packageDir: File) {
        for (type in sink.types.values) {
            if (type.name.isNullOrEmpty() || (type.isField && !type.isInterface) || sink.shouldSkip(type.name!!))
                continue

            val typeName = type.name!!.capitalize()

            val annotations = if (typeName == "Thing") { listOf("@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)") } else null

            klass(packageDir, ns, typeName, listOf("com.fasterxml.jackson.databind.annotation.*", "com.fasterxml.jackson.annotation.*", "org.jetbrains.annotations.NotNull"), annotations, banner) {
                if (typeName == "Thing") {
                    method("getJsonLdType", "String", annotations = listOf("@JsonProperty(\"@type\")")) {
                        line("return getClass().getSimpleName();")
                    }
                    method("getJsonLdContext", "String", annotations = listOf("@JsonProperty(\"@context\")")) {
                        line("return \"http://schema.org/\";")
                    }
                }

                for (field in type.subTypes) {
                    sink.types[field]?.let {
                        if (it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class") {
                            val fieldType = sink.getEitherFieldType(it)!!
                            val name = it.name!!.capitalize()
//                            it.comment?
                            val annotations = arrayListOf<String>()
                            if (fieldType == "java.util.Date") {
                                annotations += "@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = \"yyyy-MM-dd'T'HH:mm:ss'Z'\")"
                            }
                            if (name == "Id") {
                                annotations += "@JsonProperty(\"@id\")"
                            }
                            field(name, fieldType) {
                                getter()
                            }
                        }
                    }

                    if (!type.isInterface) {
                        konstructor("protected")
                        hashCodeAndEquals(typeName != "Thing")
                    }
                }
            }

            with(StringBuilder()) {
/*
                appendln(banner)
                appendln()
                appendln("package $ns;")
                appendln()
                appendln("import com.fasterxml.jackson.databind.annotation.*;")
                appendln("import com.fasterxml.jackson.annotation.*;")
                appendln("import org.jetbrains.annotations.*;")
                appendln()
*/

                appendln("/**")
                type.comment?.let { appendln(" * ${it.replace("\n", "\n  * ")}") }
                type.source?.let { appendln(" * Source: $it") }
                type.equivalent?.let { appendln(" * Equivalent class: $it") }
                appendln(" */")

/*
                if (typeName == "Thing") {
                    appendln("@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)")
                }
*/
                append("public ${type.classOrInterface} $typeName")
                type.parentType?.let { sink.types[it]?.let { append(" extends ${it.name}") } }
                val interfaces = type.interfaces.filter { i -> sink.types.values.any { it.name == i && !it.isField } }
                if (interfaces.any()) {
                    append(" implements ")
                    append(interfaces.joinToString(", "))
                }
                appendln(" {")

/*                if (typeName == "Thing") {
                    appendln("""  @JsonProperty("@type")
  public String getJsonLdType() {
    return getClass().getSimpleName();
  }

  @JsonProperty("@context")
  public String getJsonLdContext() {
    return "http://schema.org/";
  }
""")
                }*/

                // getters
                for (field in type.subTypes) {
                    sink.types[field]?.let {
                        if (it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class") {
                            val fieldType = sink.getEitherFieldType(it)
                            val name = it.name!!.capitalize()
                            it.comment?.let {
                                appendln("  /**")
                                appendln("   * $it")
                                appendln("   */")
                            }
                            if (fieldType == "java.util.Date") {
                                appendln("    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = \"yyyy-MM-dd'T'HH:mm:ss'Z'\")")
                            }
                            if (name == "Id") {
                                appendln("  @JsonProperty(\"@id\")");
                            }
                            appendln("  public $fieldType get$name() {")
                            appendln("    return my$name;")
                            appendln("  }")
                        }
                    }
                }

                // builder
                val allFields = sink.getAllFields(type)
                if (!type.isInterface) {
                    appendln("  /**")
                    appendln("   * Builder for {@link $typeName}")
                    appendln("   */")
                    appendln("  static final class ${typeName}ThingBuilder implements Builder {")
                    appendln("    /**")
                    appendln("     * Creates new {@link $typeName} instance.")
                    appendln("     */")
                    appendln("    public $typeName build() {")
                    append("      return new $typeName(")
                    append(allFields.map { it.name?.decapitalize() }.filterNotNull().joinToString(", "))
                    val fromMapIfStatements = allFields.map {
                        val varName = it.name!!.decapitalize()
                        val fieldTypes = sink.getEitherTypes(it)
                        fieldTypes.map {
                            "if (\"${varName.let { if(it == "id") "@id" else it }}\".equals(key) && value instanceof $it) { $varName(($it)value); continue; }"
                        }.joinToString("\n        ")
                    }
                    appendln(");")
                    appendln("    }")
                    val interfaceMethods = arrayListOf<String>()
                    for (field in allFields) {
                        if (field.name != null) {
                            val name = field.name!!.capitalize()
                            val eitherTypes = sink.getEitherTypes(field)
                            eitherTypes.forEach { fieldType ->
                                field.comment?.let {
                                    appendln("    /**")
                                    appendln("     * $it")
                                    appendln("     */")
                                }

                                interfaceMethods += "@NotNull Builder ${name.decapitalize()}(@NotNull $fieldType ${getVariableName(fieldType, name)});"
                                appendln("    @NotNull public Builder ${name.decapitalize()}(@NotNull $fieldType ${getVariableName(fieldType, name)}) {")
                                if (eitherTypes.size < 2) {
                                    appendln("      this.${name.decapitalize()} = ${getVariableName(fieldType, name)};")
                                } else {
                                    appendln("      if (this.${name.decapitalize()} == null) this.${name.decapitalize()} = new ${sink.getEitherFieldType(field)}();")
                                    appendln("      this.${name.decapitalize()}.set$fieldType(${getVariableName(fieldType, name)});")
                                }
                                appendln("      return this;")
                                appendln("    }")

                                // add overload accepting ThingBuilder<T>
                                if (!sink.shouldSkip(fieldType) && findType(fieldType)?.isInterface != true && fieldType != "String" && fieldType != "Integer" && fieldType != "java.util.Date" && fieldType != "HasPart") {
                                    field.comment?.let {
                                        appendln("    /**")
                                        appendln("     * $it")
                                        appendln("     */")
                                    }
                                    interfaceMethods += "@NotNull Builder ${name.decapitalize()}(@NotNull $fieldType.Builder ${getVariableName(fieldType, name)});"
                                    appendln("    @NotNull public Builder ${name.decapitalize()}(@NotNull $fieldType.Builder ${getVariableName(fieldType, name)}) {")
                                    appendln("      return this.${name.decapitalize()}(${getVariableName(fieldType, name)}.build());")
                                    appendln("    }")
                                }
                            }
                        }
                    }

                    // support for integer id on all builders that have id
                    if (allFields.any { it.name?.equals("id", true) ?: false }) {
                        appendln("    public Builder id(long id) {")
                        appendln("      return id(Long.toString(id));")
                        appendln("    }")
                    }

                    appendln()
                    appendln("    @Override public void fromMap(java.util.Map<String, Object> map) {")
                    appendln("      for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {")
                    appendln("        final String key = entry.getKey();")
                    appendln("        Object value = entry.getValue();")
                    appendln("        if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }")
                    appendln("        " + fromMapIfStatements.joinToString("\n        "))
                    appendln("      }")
                    appendln("    }")

                    allFields.forEach { appendln("    private ${sink.getEitherFieldType(it)} ${getVariableName(it.name!!)};") }
                    appendln("  }")
                    appendln("  public interface Builder extends ThingBuilder<$typeName> {")
                    appendln("    " + interfaceMethods.joinToString("\n    "))
                    appendln("  }")
                    appendln()
                }

                val fields = type.subTypes.mapNotNull { sink.types[it] }.filter { it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class" }


                appendln("}")

                //File(packageDir, "$typeName.java").writeText(toString())
            }
        }
    }

    private fun generateBuilders(ns: String, packageDir: File) {
        // public API
        with(StringBuilder()) {
            appendln(banner)
            appendln()
            appendln("package $ns;")
            appendln()
            appendln("import com.fasterxml.jackson.core.JsonProcessingException;")
            appendln("import com.fasterxml.jackson.databind.JsonNode;")
            appendln("import com.fasterxml.jackson.databind.ObjectMapper;")
            appendln("import org.jetbrains.annotations.NotNull;")
            appendln()
            appendln("public class SchemaOrg {")

            for (type in sink.types.values) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || sink.shouldSkip(type.name!!))
                    continue

                val typeName = type.name!!.capitalize()

                type.comment?.let {
                    appendln("  /**")
                    appendln("   * $it")
                    appendln("   */")
                }
                appendln("  public static $typeName.Builder ${typeName.decapitalize()}() { return new $typeName.${typeName}ThingBuilder(); }")
            }
            appendln()
            appendln("  public static ThingBuilder getBuilder(@NotNull String type) {")
            for (type in sink.types.values) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || sink.shouldSkip(type.name!!))
                    continue

                val typeName = type.name!!.capitalize()

                appendln("    if (\"$typeName\".equals(type)) { return new $typeName.${typeName}ThingBuilder(); }")
            }
            appendln("    return null;")
            appendln("  }")
            appendln()
            appendln("  @NotNull public static String writeJson(@NotNull Thing thing) throws JsonProcessingException {")
            appendln("    return new ObjectMapper().writeValueAsString(thing);")
            appendln("  }")
            appendln("  public static Thing readJson(String json) throws java.io.IOException {")
            appendln("    final ObjectMapper objectMapper = new ObjectMapper();")
            appendln("    objectMapper.registerModule(new JsonLdModule());")
            appendln("    return objectMapper.readValue(json, Thing.class);")
            appendln("  }")
            appendln("  public static Thing readJson(JsonNode node) {")
            appendln("    final ObjectMapper objectMapper = new ObjectMapper();")
            appendln("    return ThingDeserializer.fromMap(objectMapper.convertValue(node, java.util.Map.class));")
            appendln("  }")
            appendln("}")

            File(packageDir, "SchemaOrg.java").writeText(toString())
        }

        File(packageDir, "ThingBuilder.java").writeText("""$banner

package $ns;

public interface ThingBuilder<T> {
  void fromMap(java.util.Map<String,Object> map);
  T build();
}""")
        File(packageDir, "JsonLdModule.java").writeText("""$banner

package $ns;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonLdModule extends SimpleModule {
    public JsonLdModule() {
        super("JsonLD Module", new Version(1, 0, 0, null, null, null));
        addDeserializer(Thing.class, new ThingDeserializer());
    }
}""")
        File(packageDir, "ThingDeserializer.java").writeText("""$banner

package $ns;

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

    private fun findType(fieldType: String): GeneratorSink.Type? = sink.types.values.firstOrNull { it.name == fieldType }

    private fun getVariableName(typeName: String, entityName: String? = null): String {
        val indexOfDot = typeName.lastIndexOf('.')
        if (indexOfDot > 0) {
            return typeName.substring(indexOfDot+1).decapitalize()
        }
        if (entityName != null && arrayOf("Boolean", "String", "Class", "Long", "Int", "Double", "Float").contains(typeName)) {
            return entityName.decapitalize()
        }
        return typeName.decapitalize()
    }
}