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
 */

package org.schema.generator

import java.io.Closeable
import java.io.File

/**
 * @author Victor Kropp
 */

class SourcesRoot(val directory: File) {}

class Package(val directory: File, val name: String) {
    fun writeClass(name: String, body: StringBuilder.() -> Unit) {
        val builder = StringBuilder()

        builder.body()

        writeClass(name, builder.toString())
    }

    fun writeClass(name: String, text: String) {
        val packageDir = this.name.split(Regex("\\.")).fold(directory) { d, s -> File(d, s) }
        packageDir.mkdirs()
        File(packageDir, "$name.java").writeText(text)
    }
}

fun sources(directory: File, body: SourcesRoot.() -> Unit) {
    SourcesRoot(directory).body()
}

fun SourcesRoot.pakage(name: String, body: Package.() -> Unit) {
    Package(this.directory, name).body()
}



class Klass(val sourceDirectory: File, val namespace: String?, val name: String, private val classOrInterface: String? = "class") {
    var extends : String? = null
    var implements: Collection<String>? = null
    var imports: Collection<String>? = null
    var annotations: Collection<String>? = null
    var comment: String? = null
    var copyright: String? = null

    internal val text = StringBuilder()

    val fields = arrayListOf<Field>()

    fun field(name: String, type: String, prefix: String = "my", body: Field.() -> Unit = {}) {
        val field = Field(this, name.capitalize(), type, prefix)
        fields += field

        field.body()
    }

    fun constant(name: String, type: String, value: String) {
        text.appendln("  private static final $type $name = $value;");
    }

    fun konstructor(visibility: String = "public", parameters: Collection<Parameter>? = null, superParameters: Collection<String>? = null) {
        text.append("  $visibility $name(")
        text.append(parameters?.map { "${it.type} ${it.name}" }?.joinToString(", ") ?: "")
        text.appendln(") {")

        if (superParameters != null) {
            text.append("    super(")
            text.append(superParameters.joinToString(", "))
            text.appendln(");")
        }

        parameters?.filter { superParameters?.contains(it.name) == false }?.forEach {
            text.appendln("    my${it.name.capitalize()} = ${it.name.decapitalize()};")
        }
        fields.forEach {
            text.appendln("    ${it.prefix}${it.name} = ${it.name.decapitalize()};")
        }
        text.appendln("  }")
    }

    fun method(name: String, type: String = "void", body: Method.() -> Unit) {
        Method(this, name, type).use { it.body() }
    }

    fun hashCodeAndEquals(callSuper: Boolean = true) {
        with(text) {
            // hashCode
            appendln("  @Override public int hashCode() {")
            if (callSuper) {
                appendln("    int result = super.hashCode();")
            } else {
                appendln("    int result = 0;")
            }
            fields.forEach {
                appendln("    result = 31 * result + (my${it.name} != null ? my${it.name}.hashCode() : 0);")
            }
            appendln("    return result;")
            appendln("  }")

            // equals
            appendln("  @Override public boolean equals(Object o) {")
            appendln("    if (this == o) return true;")
            appendln("    if (o == null || getClass() != o.getClass()) return false;")
            val other = name.decapitalize()
            appendln("    $name $other = ($name) o;")
            if (callSuper) {
                appendln("    if (!super.equals(o)) return false;")
            }
            fields.forEach {
                appendln("    if (my${it.name} != null ? !my${it.name}.equals($other.my${it.name}) : $other.my${it.name} != null) return false;")
            }
            appendln("    return true;")
            appendln("  }")
        }
    }

    internal fun generate() {
        text.insert(0, with(StringBuilder()) {
            copyright?.let {
                appendln(it)
                appendln()
            }
            namespace?.let {
                appendln("package $it;")
                appendln()
            }
            imports?.forEach {
                appendln("import $it;")
            }
            appendln()
            comment?.let {
                appendln("/**")
                it.split("\n").forEach { appendln(" * $it") }
                appendln(" */")
            }
            annotations?.forEach {
                appendln(it)
            }
            append("public $classOrInterface $name")

            extends?.let { append(" extends $it")}
            if (implements?.any() == true) {
                append(" implements ")
                append(implements!!.joinToString(", "))
            }
            appendln(" {")
        }.toString())

        fields.forEach {
            text.appendln("  ${it.fieldDeclaration};")
        }

        text.appendln("}")
    }

    fun save() {
        generate()

        val packageDir = namespace?.split(Regex("\\."))?.fold(sourceDirectory) { d, s -> File(d, s) }
        packageDir?.mkdirs()
        File(packageDir ?: File("."), "$name.java").writeText(text.toString())
    }
}

fun Package.klass(name: String, classOrInterface: String? = "class", body: Klass.() -> Unit) {
    val c = Klass(this.directory, this.name, name, classOrInterface)
    c.body()
    c.save()
}

fun Klass.klass(name: String, body: Klass.() -> Unit) {
    val c = Klass(this.sourceDirectory, null, name, classOrInterface = "static class")
    c.body()
    c.generate()

    c.text.split("\n").forEach {
        text.appendln("  $it")
    }
}

class Field(val c: Klass, val name: String, val type: String, val prefix: String) {
    fun getter(annotations: Collection<String>? = null, comment: String? = null) {
        comment?.let {
            c.text.appendln("  /**")
            c.text.appendln("   * $it")
            c.text.appendln("   */")
        }
        annotations?.forEach { c.text.appendln("  $it") }
        c.text.appendln("  public $type get$name() { return $prefix$name; }")
    }
    fun setter(methodCallBefore: String? = null, isPublic: Boolean = true) {
        c.text.append(if (isPublic) "  public" else "  ")
        val paramName = getVariableName(type, "value")
        c.text.append("void set$type($type $paramName) {")
        methodCallBefore?.let { c.text.append(" $it();") }
        c.text.appendln(" $prefix$name = $paramName; }")
    }
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
    val fieldDeclaration: String
        get() = "private $type $prefix" + (if (prefix.isEmpty()) name.decapitalize() else name)
}

class Parameter(val name: String, val type: String, val annotations: Collection<String>? = null)

class Method(val c: Klass, val name: String, val type: String): Closeable {
    var annotations: Collection<String>? = null
    var parameters: Collection<Parameter>? = null
    var throws: String? = null

    private val body = StringBuilder()

    fun line(line: String) {
        body.appendln("    " + line)
    }

    override fun close() {
        annotations?.forEach {
            c.text.appendln("  $it")
        }
        c.text.append("  public $type $name(")
        c.text.append(parameters?.map { (it.annotations?.joinToString { " " } ?: "") + "${it.type} ${it.name}" }?.joinToString(", ") ?: "")
        c.text.append(")")
        throws?.let { c.text.append(" throws $it") }
        c.text.appendln(" {")

        c.text.append(body.toString())

        c.text.appendln("  }")
    }
}