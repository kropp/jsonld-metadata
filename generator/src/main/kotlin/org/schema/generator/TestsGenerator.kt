package org.schema.generator

/**
 * @author Victor Kropp
 */
class TestsGenerator (private val sink: GeneratorSink, private val banner: String? = null) {
    fun generate(p: Package) {
        p.klass("SmokeTest") {
            copyright = banner
            imports = listOf("java.io.IOException", "org.junit.Test", "java.util.Date", "static org.junit.Assert.assertEquals")

            constant("NOW", "Date", "new Date(1234567890000L)")

            for (type in sink.types.values) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || type.parentType.isNullOrEmpty() || sink.shouldSkip(type.name!!))
                    continue
                if (type.isEnum || type.name == "http://schema.org/Enumeration" || (type.parentType?.let{ sink.types[it] }?.isEnum == true)) continue

                val typeName = type.name!!.capitalize()
                val varName = typeName.decapitalize()

                method("test$typeName", "void") {
                    annotations = listOf("@Test")
                    throws = "IOException"

                    line("final $typeName $varName = SchemaOrg.$varName()")

                    for (field in sink.getAllFields(type)) {
                        when (sink.getEitherTypes(field).first()) {
                            "String" -> "\"Test String\""
                            "Float" -> ".1342"
                            "Double" -> ".1342"
                            "Integer" -> "42"
                            "Long" -> "42L"
                            "Boolean" -> "true"
                            "java.util.Date" -> "NOW"
                            else -> null
                        }?.let {
                            line("  .${field.name!!.decapitalize()}($it)")
                        }
                    }
                    line("  .build();")
                    line("final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson($varName));")
                    line("assertEquals($varName, thing);")
                }
            }
        }
    }

}