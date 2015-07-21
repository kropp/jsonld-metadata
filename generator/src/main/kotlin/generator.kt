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
    var name: String? = null
    var parentType: String? = null
    var comment: String? = null
    var source: String? = null
    var equivalent: String? = null
    var subTypes: MutableList<String> = ArrayList()
    var isField = false
    var dataType: String? = null
}

class GeneratorSink : TripleSink {
    private var uri: String = "http://schema.org/"

    private val types = HashMap<String, Type>()

    override fun setProperty(key: String, value: Any): Boolean {
        println("Property: $key=$value")
        return true
    }

    override fun endStream() {
    }

    override fun setBaseUri(baseUri: String) {
        uri = baseUri
    }

    override fun startStream() {
    }

    override fun addNonLiteral(subj: String, pred: String, obj: String) {
        when(pred) {
            "http://www.w3.org/1999/02/22-rdf-syntax-ns#type" -> types.put(subj, Type())
            "http://www.w3.org/2000/01/rdf-schema#subClassOf" -> types.get(subj).parentType = obj
            "http://schema.org/domainIncludes" -> {
                val objType = types.get(obj)

                if (objType != null) {
                    val subjType = types.get(subj)
                    subjType.isField = true
                    objType.subTypes.add(subj)
                }
            }
            "http://schema.org/rangeIncludes" -> types.get(subj).dataType = obj
            "http://purl.org/dc/terms/source" -> types.get(subj).source = obj
            "http://www.w3.org/2002/07/owl#equivalentClass" -> types.get(subj).equivalent = obj
            "http://www.w3.org/2002/07/owl#equivalentProperty" -> types.get(subj).equivalent = obj
            "http://schema.org/inverseOf" -> { /* ignore */ }
            "http://schema.org/supersededBy" -> { /* ignore */ }
            "http://www.w3.org/2000/01/rdf-schema#subPropertyOf" -> { /* ignore */ }
            else -> System.err.println("Unknown non-literal: $pred")
        }
    }

    override fun addPlainLiteral(subj: String, pred: String, content: String, lang: String?) {
        when(pred) {
            "http://www.w3.org/2000/01/rdf-schema#label" -> types.get(subj).name = content.trim()
            "http://www.w3.org/2000/01/rdf-schema#comment" -> types.get(subj).comment = content
            else -> System.err.println("Unknown plain literal: $pred")
        }
    }

    override fun addTypedLiteral(subj: String, pred: String, content: String, type: String) {
        System.err.println("Unknown typed literal: $pred")
    }

    fun writeJava(dir: File, ns: String) {
        val packageDir = ns.split(Regex("\\.")).fold(dir) { d, s -> File(d, s) }
        for (type in types.values()) {
            if (type.name.isNullOrEmpty() || type.isField)
                continue

            val file = File(packageDir, type.name + ".java")

            with(StringBuilder()) {
                appendln("package $ns;")
                appendln()

                appendln("/**")
                type.comment?.let { appendln(" * ${it.replace("\n", "\n  * ")}") }
                type.source?.let { appendln(" * Source: $it") }
                type.equivalent?.let { appendln(" * Equivalent class: $it") }
                appendln(" */")

                appendln()
                append("public class ${type.name!!.capitalize()}")
                type.parentType?.let { types.get(it)?.let { append(" extends ${it.name}") } }
                appendln(" {")

                // getters
                for (field in type.subTypes) {
                    types.get(field)?.let {
                        if (it.name != null) {
                            val name = it.name!!.capitalize()
                            appendln("  public ${types.get(it.dataType)?.name} get$name() {")
                            appendln("    return my$name;")
                            appendln("  }")
                        }
                    }
                }

                // private fields
                for (field in type.subTypes) {
                    types.get(field)?.let {
                        if (it.name != null) {
                            appendln("  private ${types.get(it.dataType)?.name} my${it.name!!.capitalize()};")
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