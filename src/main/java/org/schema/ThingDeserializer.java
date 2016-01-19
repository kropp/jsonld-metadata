/*
 * Copyright 2015-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

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
}