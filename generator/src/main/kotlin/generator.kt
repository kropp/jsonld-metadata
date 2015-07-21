import org.semarglproject.rdf.TurtleSerializer
import org.semarglproject.rdf.rdfa.RdfaParser
import org.semarglproject.sink.CharOutputSink
import org.semarglproject.sink.CharSink
import org.semarglproject.sink.DataSink
import org.semarglproject.sink.TripleSink
import org.semarglproject.source.StreamProcessor
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.util.*
import kotlin.properties.Delegates
import kotlin.text.Regex

/**
 * @author Victor Kropp
 */

class Type() {
    var isInterface: Boolean = false
    var name: String? = null
    var parentType: String? = null
    var comment: String? = null
    var source: String? = null
    var equivalent: String? = null
    val subTypes: MutableList<String> = ArrayList()
    val interfaces: MutableList<String> = ArrayList()
    var isField = false
    val dataTypes: MutableList<String> = ArrayList()
}

val Type.classOrInterface: String
    get() = when(isInterface) { true -> "interface"; else -> "class" }

class GeneratorSink : TripleSink {
    private var uri: String = "http://schema.org/"

    private val types = HashMap<String, Type>()
    private val interfaces = HashSet<String>()

    override fun setProperty(key: String, value: Any): Boolean {
        println("Property: $key=$value")
        return true
    }

    override fun endStream() {
        for (type in types.values()) {
            if (type.isField && type.isInterface) {
                type.isField = false
                type.dataTypes.forEach { types.get(it).interfaces.add(type.name!!.capitalize()) }
            }
        }
    }

    override fun setBaseUri(baseUri: String) {
        uri = baseUri
    }

    override fun startStream() {
    }

    override fun addNonLiteral(subj: String, pred: String, obj: String) {
        when(pred) {
            "http://www.w3.org/1999/02/22-rdf-syntax-ns#type" -> { if(!types.containsKey(subj)) types.put(subj, Type()) }
            "http://www.w3.org/2000/01/rdf-schema#subClassOf" -> types.get(subj).parentType = obj
            "http://schema.org/domainIncludes" -> {
                val objType = types.get(obj)

                if (objType != null) {
                    val subjType = types.get(subj)
//                    if (!subjType.isInterface) {
                        subjType.isField = true
                        objType.subTypes.add(subj)
/*
                    } else {
                        objType.interfaces.add(getInterfaceName(subj))
                    }
*/
                } else {
                    val type = Type()
                    type.interfaces.add(getInterfaceName(subj))
                    types.put(obj, type)
                }
            }
            "http://schema.org/rangeIncludes" -> types.get(subj).dataTypes.add(obj)
            "http://purl.org/dc/terms/source" -> types.get(subj).source = obj
            "http://www.w3.org/2002/07/owl#equivalentClass" -> types.get(subj).equivalent = obj
            "http://www.w3.org/2002/07/owl#equivalentProperty" -> types.get(subj).equivalent = obj
            "http://schema.org/inverseOf" -> { /* ignore */ }
            "http://schema.org/supersededBy" -> { /* ignore */ }
            "http://www.w3.org/2000/01/rdf-schema#subPropertyOf" -> {
                val interfaceType = Type()
                interfaceType.name = getInterfaceName(obj)
                interfaceType.isInterface = true
                types.put(obj, interfaceType)

                if (!types.containsKey(subj)) types.put(subj, Type())
                val type = types.get(subj)
                if (type.isField) {
                    type.dataTypes.add(obj)
                } else {
                    type.interfaces.add(interfaceType.name!!)
                }
            }
            else -> System.err.println("Unknown non-literal: $pred")
        }
    }

    private fun getInterfaceName(obj: String): String = obj.substring(uri.length()).capitalize()

    override fun addPlainLiteral(subj: String, pred: String, content: String, lang: String?) {
        when(pred) {
            "http://www.w3.org/2000/01/rdf-schema#label" -> types.get(subj).name = content.replace(" ", "").replace(".", "")
            "http://www.w3.org/2000/01/rdf-schema#comment" -> types.get(subj).comment = content
            else -> System.err.println("Unknown plain literal: $pred")
        }
    }

    override fun addTypedLiteral(subj: String, pred: String, content: String, type: String) {
        System.err.println("Unknown typed literal: $pred")
    }

    private fun getFieldType(names: List<String>): String? {
        val name = names.firstOrNull { types.get(it).isInterface } ?: names.firstOrNull()
        return when(types.get(name)?.name) {
            "Text", "URL" -> "String"
            "DateTime", "Date", "Time" -> "java.util.Date"
            else -> types.get(name)?.name?.capitalize()
        }
    }

    private fun shouldSkip(name: String): Boolean {
        return arrayOf("Text", "DateTime", "Date", "Time", "Boolean", "Float", "Double", "URL").contains(name) ||
                name.contains("#") || name.contains("/")
    }

    fun writeJava(dir: File, ns: String) {
        val packageDir = ns.split(Regex("\\.")).fold(dir) { d, s -> File(d, s) }
        packageDir.mkdirs()
        generateTypes(ns, packageDir)
        generateBuilders(ns, packageDir)
    }

    private fun generateBuilders(ns: String, packageDir: File) {
        val file = File(packageDir, "SchemaOrg.java")
        with(StringBuilder()) {
            appendln("package $ns;")
            appendln()
            appendln("public class SchemaOrg {")

            for (type in types.values()) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || shouldSkip(type.name!!))
                    continue

                val typeName = type.name!!.capitalize()

                appendln("  public static ${typeName}Builder ${typeName.decapitalize()}() { return new ${typeName}Builder(); }")
                appendln()
                appendln("  public static final class ${typeName}Builder {")
                appendln("    public ${typeName} build() {")
                append("      return new ${typeName}(")
                append(type.subTypes.map { types.get(it)?.name?.decapitalize() }.filterNotNull().join(", "))
                appendln(");")
                appendln("    }")
                for (field in type.subTypes) {
                    types.get(field)?.let {
                        if (it.name != null) {
                            val name = it.name!!.capitalize()
                            it.comment?.let {
                                appendln("    /**")
                                appendln("     * $it")
                                appendln("     */")
                            }
                            appendln("    public ${typeName}Builder ${name.decapitalize()}(${getFieldType(it.dataTypes)} value) {")
                            appendln("      ${name.decapitalize()} = value;")
                            appendln("      return this;")
                            appendln("    }")
                        }
                    }
                }
                for (field in type.subTypes) {
                    types.get(field)?.let {
                        if (it.name != null) {
                            appendln("    private ${getFieldType(it.dataTypes)} ${it.name!!.decapitalize()};")
                        }
                    }
                }
                appendln("  }")
                appendln()

            }
            appendln("}")

            file.writeText(toString())
        }
    }

    private fun generateTypes(ns: String, packageDir: File) {
        for (type in types.values()) {
            if (type.name.isNullOrEmpty() || (type.isField && !type.isInterface) || shouldSkip(type.name!!))
                continue

            val typeName = type.name!!.capitalize()
            val file = File(packageDir, typeName + ".java")

            with(StringBuilder()) {
                appendln("/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on ${Date(System.currentTimeMillis())} */")
                appendln()
                appendln("package $ns;")
                appendln()

                appendln("/**")
                type.comment?.let { appendln(" * ${it.replace("\n", "\n  * ")}") }
                type.source?.let { appendln(" * Source: $it") }
                type.equivalent?.let { appendln(" * Equivalent class: $it") }
                appendln(" */")

                append("public ${type.classOrInterface} $typeName")
                type.parentType?.let { types.get(it)?.let { append(" extends ${it.name}") } }
                if (type.interfaces.any()) {
                    append(" implements ")
                    append(type.interfaces.join(", "))
                }
                appendln(" {")

                if (typeName == "Thing") {
                    appendln("""  @com.fasterxml.jackson.annotation.JsonProperty("@type")
  public String getJsonLdType() {
    return getClass().getSimpleName();
  }
""")
                }

                // getters
                for (field in type.subTypes) {
                    types.get(field)?.let {
                        if (it.name != null) {
                            val name = it.name!!.capitalize()
                            it.comment?.let {
                                appendln("  /**")
                                appendln("   * $it")
                                appendln("   */")
                            }
                            appendln("  public ${getFieldType(it.dataTypes)} get$name() {")
                            appendln("    return my$name;")
                            appendln("  }")
                        }
                    }
                }

                // package-local constructor and private fields
                if (!type.isInterface) {
                    append("  $typeName(")
                    append(type.subTypes.map { types.get(it) }.filter { it?.name != null }.map { "${getFieldType(it.dataTypes)} ${it.name!!.decapitalize()}" }.join(", "))
                    appendln(") {")
                    for (field in type.subTypes) {
                        types.get(field)?.let {
                            if (it.name != null) {
                                appendln("    my${it.name!!.capitalize()} = ${it.name!!.decapitalize()};")
                            }
                        }
                    }
                    appendln("  }")
                }
                for (field in type.subTypes) {
                    types.get(field)?.let {
                        if (it.name != null) {
                            appendln("  private ${getFieldType(it.dataTypes)} my${it.name!!.capitalize()};")
                        }
                    }
                }


                appendln("}")

                file.writeText(toString())
            }
        }
    }
}

fun main(args: Array<String>) {
    val generator = GeneratorSink()
    val sp = StreamProcessor(RdfaParser.connect(generator))
    val stream = FileInputStream("generator/resources/schema.rdfa")
    sp.process(stream, "http://schema.org/")

    generator.writeJava(File("src/main/java"), "org.schema")
}