package org.schema.generator

/**
 * @author Victor Kropp
 */

class ClassesGenerator(private val sink: GeneratorSink, private val banner: String? = null) {
    private val NOT_NULL = listOf("@NotNull")
    private val OVERRIDE = listOf("@Override")

    fun generate(p: Package) {
        for (type in sink.types.values) {
            if (type.name.isNullOrEmpty() || (type.isField && !type.isInterface) || sink.shouldSkip(type.name!!) || (type.parentType == null && type.name != "Thing" && !type.isInterface))
                continue

            val typeName = type.name!!.capitalize()

            p.klass(typeName, type.classOrInterface) {
                copyright = banner
                extends = type.parentType?.let { sink.types[it]?.name }
                implements = type.interfaces.filter { i -> sink.types.values.any { it.name == i && !it.isField && it.name != "HasPart" } }
                imports = listOf("com.fasterxml.jackson.databind.annotation.*", "com.fasterxml.jackson.annotation.*", "org.jetbrains.annotations.NotNull", "java.util.*")
                annotations = if (typeName == "Thing") { listOf("@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)") } else null
                comment = (type.comment ?: "") + (type.source?.let { "Source: $it" } ?: "") + (type.equivalent?.let { "Equivalent class: $it" } ?: "")

                if (typeName == "Thing") {
                    method("getJsonLdType", "String") {
                        annotations = listOf("@JsonProperty(\"@type\")")

                        line("return getClass().getSimpleName();")
                    }
                    method("getJsonLdContext", "String") {
                        annotations = listOf("@JsonProperty(\"@context\")")

                        line("return \"http://schema.org/\";")
                    }
                    field("data", "java.util.Map<String,Object>", "protected") {
                        getter(listOf("@JsonAnyGetter"))
                    }
                }

                val ownFields = type.subTypes.mapNotNull { sink.types[it] }.filter { it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class" && it.dataTypes[0] != "http://schema.org/HasPart"}
                ownFields.forEach {
                    val fieldTypes = sink.getEitherTypes(it)
                    val fieldType = if (fieldTypes.size == 1) fieldTypes.first() else "Object"
                    val name = it.name!!.capitalize()

                    val getterAnnotations: List<String> //= arrayListOf<String>()
/*
                    if (fieldType == "java.util.Date") {
                        getterAnnotations = listOf=("@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = \"yyyy-MM-dd'T'HH:mm:ss'Z'\")"
                    }
*/
                    if (name == "Id") {
                        getterAnnotations = listOf("@JsonProperty(\"@id\")")
                    } else {
                        getterAnnotations = listOf("@JsonIgnore")
                    }

/*
                    field(name, fieldType) {
                        getter(getterAnnotations, comment = it.comment)
                    }
*/
                    fieldTypes.forEach { fieldType ->
                        val methodName = if (fieldTypes.size == 1) "get$name" else "get$name$fieldType"
                        method(methodName, fieldType) {
                            comment = it.comment
                            annotations = getterAnnotations

                            line("return ($fieldType) myData.get(\"${name.decapitalize()}\");")
                        }
                    }
                }

                val allFields = sink.getAllFields(type)

                if (!type.isInterface) {
                    konstructor("protected",
                            parameters = listOf(Parameter("data", "java.util.Map<String,Object>")),
                            superParameters = type.parentType?.let { listOf("data") }
/*
                            parameters = allFields.filter { it.name != null && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class"}.map { Parameter(it.name!!.decapitalize(), sink.getEitherFieldType(it)!!) },
                            superParameters = type.parentType?.let { sink.getAllFields(sink.types[it]) }?.map { it.name!!.decapitalize() }
*/
                    )

                    if (typeName == "Thing") {
                        hashCodeAndEquals(false)
                    }

                    klass("Builder") {
                        comment = "Builder for {@link $typeName}"
                        extends = type.parentType?.let { sink.types[it]?.name?.plus(".Builder") }
                        if (type.parentType == null) {
                            implements = listOf("ThingBuilder<$typeName>")

                            field("data", "HashMap<String,Object>", "protected") {
                                initial = "new HashMap<String,Object>()"
                            }
                        }

                        method("build", typeName) {
                            //line("return new $typeName(" + allFields.mapNotNull { it.name?.decapitalize() }.joinToString(", ") + ");")
                            line("return new $typeName(myData);")
                        }

                        allFields.filter { it.name != null }.forEach { field ->
                            val name = field.name!!.capitalize()
                            val eitherTypes = sink.getEitherTypes(field)
                            eitherTypes.forEach { fieldType ->

                                method(name.decapitalize(), "Builder") {
                                    comment = field.comment
                                    parameters = listOf(Parameter(getVariableName(fieldType, name), fieldType, NOT_NULL))
                                    annotations = NOT_NULL

/*
                                    if (eitherTypes.size < 2) {
*/
                                        line("myData.put(\"${name.decapitalize()}\", ${getVariableName(fieldType, name)});")
/*
                                    } else {
                                        line("if (this.${name.decapitalize()} == null) this.${name.decapitalize()} = new ${sink.getEitherFieldType(field)}();")
                                        line("this.${name.decapitalize()}.set$fieldType(${getVariableName(fieldType, name)});")
                                    }
*/
                                    line("return this;")
                                }

                                // add overload accepting ThingBuilder<T>
                                if (!sink.shouldSkip(fieldType) && findType(fieldType)?.isInterface != true && fieldType != "String" && fieldType != "Integer" && fieldType != "java.util.Date") {
                                    method(name.decapitalize(), "Builder") {
                                        comment = field.comment
                                        parameters = listOf(Parameter(getVariableName(fieldType, name), "$fieldType.Builder", NOT_NULL))
                                        annotations = NOT_NULL

                                        line("return this.${name.decapitalize()}(${getVariableName(fieldType, name)}.build());")
                                    }
                                }
                            }
                        }

                        // support for integer id on all builders that have id
                        if (allFields.any { it.name?.equals("id", true) ?: false }) {
                            method("id", "Builder") {
                                parameters("id" to "long")
                                line("return id(Long.toString(id));")
                            }
                        }

                        if (type.parentType == null) {
                            method("fromMap") {
                                parameters("map" to "java.util.Map<String, Object>")

                                line("for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {")
                                line("  final String key = entry.getKey();")
                                line("  Object value = entry.getValue();")
                                line("  if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }")
                                line("  fromMap(key, value);")
                                line("}")
                            }
                        }

                        method("fromMap") {
                            access = "protected"
                            parameters("key" to "String", "value" to "Object")

                            lines(ownFields.flatMap {
                                val varName = it.name!!.decapitalize()
                                val fieldTypes = sink.getEitherTypes(it)

                                fieldTypes.map {
                                    "if (\"${varName.let { if (it == "id") "@id" else it }}\".equals(key) && value instanceof $it) { $varName(($it)value); return; }"
                                }
                            })

                            if (type.parentType != null) {
                                annotations = OVERRIDE
                                line("super.fromMap(key, value);")
                            }
                        }

/*
                        ownFields.forEach {
                            field(getVariableName(it.name!!), sink.getEitherFieldType(it)!!, access = "protected", prefix = "")
                        }
*/
                    }
                }
            }
        }
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