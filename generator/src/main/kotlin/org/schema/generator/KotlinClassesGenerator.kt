package org.schema.generator

/**
 * @author Victor Kropp
 */

class KotlinClassesGenerator(private val sink: GeneratorSink, private val banner: String? = null) {
    private val NOT_NULL = listOf("@NotNull")
    private val OVERRIDE = listOf("@Override")

    fun generate(p: Package) {
        for ((key, type) in sink.types) {
            if (type.isInterface) continue
            if (type.name.isNullOrEmpty() || type.isField || sink.shouldSkip(type.name!!)) continue
            if (type.parentType == null && type.name != "Thing") continue
            if (type.name == "http://schema.org/Enumeration" || (type.parentType?.let{ sink.types[it] }?.isEnum == true)) continue
            if (type.isEnum) continue

            val typeName = type.name!!.capitalize()


            p.writeClass("Mutable$typeName", "kt") {
                appendln("package org.schema.kotlin")
                appendln("import org.schema.*")
                appendln("class Mutable$typeName {")
                appendln("  private val map = HashMap<String,Any>()")
                val allFields = sink.getAllFields(type)
                allFields.forEach {
                    val eitherTypes = sink.getEitherTypes(it)
                    eitherTypes.forEach { fieldType ->
                        val suffix = if (eitherTypes.size > 1) {
                            if (fieldType == "java.util.Date") "Date" else fieldType
                        } else ""
                        val type = if (fieldType == "Map") "org.schema.Map" else fieldType
                        appendln("  var ${it.name!!.decapitalize()}$suffix: $type by map")
                    }
                }
                appendln("  fun build() = org.schema.$typeName.Builder(map).build()")
                appendln("}")
            }

/*
            p.klass(typeName, type.classOrInterface) {
                copyright = banner
                if (type.isInterface) {
                    extends = type.interfaces.filter { i -> sink.types.values.any { it.name == i && !it.isField && it.name != "HasPart" } }
                } else {
                    extends = type.parentType?.let { sink.types[it]?.name }?.let { listOf(it) }
                    implements = type.interfaces.filter { i -> sink.types.values.any { it.name == i && !it.isField && it.name != "HasPart" } }
                }
                imports = listOf("com.fasterxml.jackson.databind.annotation.*", "com.fasterxml.jackson.annotation.*", "org.jetbrains.annotations.NotNull", "java.util.*")
                annotations = if (typeName == "Thing") { listOf("@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)") } else null
                comment = (type.comment ?: "") + (type.source?.let { "Source: $it" } ?: "") + (type.equivalent?.let { "Equivalent class: $it" } ?: "")


                val allFields = sink.getAllFields(type)

                if (!type.isInterface) {
                    konstructor("protected",
                            parameters = listOf(Parameter("data", "java.util.Map<String,Object>")),
                            superParameters = type.parentType?.let { listOf("data") }
                    )

                    if (typeName == "Thing") {
                        hashCodeAndEquals(false)
                    }

                    klass("Builder") {
                        comment = "Builder for {@link $typeName}"
                        extends = type.parentType?.let { sink.types[it]?.name?.plus(".Builder") }?.let { listOf(it) }
                        if (type.parentType == null) {
                            implements = listOf("ThingBuilder<$typeName>")

                            field("data", "HashMap<String,Object>", "protected")

                            method("putValue") {
                                parameters("key" to "String", "value" to "Object")
                                line("if (myData.containsKey(key)) {")
                                line("  final Object current = myData.get(key);")
                                line("  final Collection list;")
                                line("  if (current instanceof Collection) {")
                                line("    list = (Collection) current;")
                                line("  } else {")
                                line("    list = new ArrayList<Object>();")
                                line("    list.add(current);")
                                line("    myData.put(key, list);")
                                line("  }")
                                line("  list.add(value);")
                                line("} else {")
                                line("  myData.put(key, value);")
                                line("}")
                            }
                        }

                        konstructor("public", listOf(Parameter("data", "HashMap<String,Object>", NOT_NULL)), type.parentType?.let { listOf("data") })

                        method("build", typeName) {
                            annotations = NOT_NULL
                            line("return new $typeName(myData);")
                        }

                        allFields.filter { it.name != null }.forEach { field ->
                            val name = field.name!!.capitalize()
                            val eitherTypes = sink.getEitherTypes(field)
                            eitherTypes.forEachIndexed { i, fieldType ->

                                method(name.decapitalize(), "Builder") {
                                    comment = field.comment
                                    parameters = listOf(Parameter(getVariableName(fieldType, name), fieldType, NOT_NULL))
                                    annotations = NOT_NULL

                                    if (name != "Id") {
                                        line("putValue(\"${name.decapitalize()}\", ${getVariableName(fieldType, name)});")
                                    } else {
                                        line("myData.put(\"${name.decapitalize()}\", ${getVariableName(fieldType, name)});")
                                    }
                                    line("return this;")
                                }

                                // add overload accepting ThingBuilder<T>
                                val isEnum = findType(fieldType)?.isEnum != true && (i >= field.dataTypes.size || sink.types[field.dataTypes[i]]?.isEnum != true)
                                if (!sink.shouldSkip(fieldType) && findType(fieldType)?.isInterface != true && isEnum && fieldType != "String" && fieldType != "Integer" && fieldType != "java.util.Date") {
                                    method(name.decapitalize(), "Builder") {
                                        comment = field.comment
                                        parameters = listOf(Parameter(getVariableName(fieldType, name), "$fieldType.Builder", NOT_NULL))
                                        annotations = NOT_NULL

                                        line("putValue(\"${name.decapitalize()}\", ${getVariableName(fieldType, name)}.build());")
                                        line("return this;")
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


                    }
                }
            }
*/
        }
    }

    private fun getMethodName(fieldType: String, fieldTypes: Collection<String>, name: String) = when {
        fieldTypes.size == 1 -> "get$name"
        fieldType == "java.util.Date" -> "get${name}Date"
        else -> "get$name$fieldType"
    }


    private fun findType(fieldType: String): GeneratorSink.Type? = sink.types.values.firstOrNull { it.name == fieldType }

    private fun subTypes(typeName: String) = sink.types.filter { it.value.parentType == typeName }

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