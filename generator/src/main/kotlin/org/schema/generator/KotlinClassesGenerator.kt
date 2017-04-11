package org.schema.generator

/**
 * @author Victor Kropp
 */

class KotlinClassesGenerator(private val sink: GeneratorSink, private val banner: String? = null) {
    fun generate(p: Package) {
        p.writeClass("SchemaOrg", "kt") {
            appendln("package org.schema.kotlin")
            appendln("import org.schema.*")
            appendln("")

            for ((_, type) in sink.types) {
                if (type.isInterface) continue
                if (type.name.isNullOrEmpty() || type.isField || sink.shouldSkip(type.name!!)) continue
                if (type.parentType == null && type.name != "Thing") continue
                if (type.name == "http://schema.org/Enumeration" || (type.parentType?.let { sink.types[it] }?.isEnum == true)) continue
                if (type.isEnum) continue

                val typeName = type.name!!.capitalize()

                generateMutableClass(p, typeName, type)

                appendln("fun ${typeName.decapitalize()}(builder: Mutable$typeName.() -> Unit) = Mutable$typeName().apply(builder).build()")
            }
        }
    }

    private fun generateMutableClass(p: Package, typeName: String, type: GeneratorSink.Type) {
        p.writeClass("Mutable$typeName", "kt") {
            appendln("package org.schema.kotlin")
            appendln("import org.schema.*")
            appendln("class Mutable$typeName {")
            appendln("  private val map = HashMap<String,Any>()")
            val allFields = sink.getAllFields(type)
            allFields.forEach {
                val eitherTypes = sink.getEitherTypes(it)
                eitherTypes.forEachIndexed { i, fieldType ->
                    val suffix = if (eitherTypes.size > 1) {
                        if (fieldType == "java.util.Date") "Date" else fieldType
                    } else ""
                    val type = if (fieldType == "Map") "org.schema.Map" else fieldType
                    val nameWithSuffix = "${it.name!!.decapitalize()}$suffix"
                    appendln("  var $nameWithSuffix: $type by map")

                    val isEnum = findType(fieldType)?.isEnum != true && (i >= it.dataTypes.size || sink.types[it.dataTypes[i]]?.isEnum != true)
                    if (!sink.shouldSkip(fieldType) && findType(fieldType)?.isInterface != true && isEnum && fieldType != "String" && fieldType != "Integer" && fieldType != "java.util.Date") {
                        appendln("  fun $nameWithSuffix(builder: Mutable$type.() -> Unit) { $nameWithSuffix = Mutable$type().apply(builder).build() }")
                    }
                }
            }
            appendln("  fun build() = org.schema.$typeName.Builder(map).build()")
            appendln("}")
        }
    }

    private fun findType(fieldType: String): GeneratorSink.Type? = sink.types.values.firstOrNull { it.name == fieldType }
}