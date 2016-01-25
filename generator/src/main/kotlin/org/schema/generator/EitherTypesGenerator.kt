package org.schema.generator

import java.io.File

/**
 * @author Victor Kropp
 */
class EitherTypesGenerator(private val sink: GeneratorSink, private val banner: String? = null) {
    fun generate(packageDir: File, ns: String) {
        sink.eitherTypes.forEach { generateEither(ns, packageDir, it.key, it.value) }
    }

    private fun generateEither(ns: String, packageDir: File, eitherName: String, types: Collection<String>) {
        klass(packageDir, ns, eitherName, listOf("com.fasterxml.jackson.databind.annotation.JsonSerialize"), listOf("@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)"), banner) {
            types.forEach {
                field(it.decapitalize(), it) {
                    setter("clear", false)
                    getter()
                }
            }

            method("getJsonLdValue", "Object", annotations = listOf("@com.fasterxml.jackson.annotation.JsonValue")) {
                fields.forEach {
                    line("if (my${it.name} != null) return my${it.name};")
                }
                line("return null;")
            }

            val filteredTypes = types.filterNot { sink.shouldSkip(it) || it == "Boolean" || it == "Number" || it == "Integer" }
            if (filteredTypes.any() && !filteredTypes.contains("Thing") && !filteredTypes.contains("String")) {
                method("getThing", "Thing") {
                    filteredTypes.forEach {
                        line("if (my$it != null) return my$it;")
                    }
                    line("return null;")
                }
            }

            method("clear") {
                fields.forEach {
                    line("my${it.name} = null;")
                }
            }

            hashCodeAndEquals(callSuper = false)
        }
    }
}