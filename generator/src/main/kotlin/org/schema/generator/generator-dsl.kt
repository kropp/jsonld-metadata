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

class SourcesRoot(val directory: File)

class Package(val directory: File, val name: String) {
    fun writeClass(name: String, body: StringBuilder.() -> Unit) {
        val builder = StringBuilder()

        builder.body()

        writeClass(name, builder.toString())
    }

    fun writeClass(name: String, text: String) {
        val packageDir = this.name.split(Regex("\\.")).fold(directory, ::File)
        packageDir.mkdirs()
        File(packageDir, "$name.java").writeText(text)
    }
}

fun sources(directory: File, body: SourcesRoot.() -> Unit) {
    SourcesRoot(directory).body()
}

fun sources(directory: String, body: SourcesRoot.() -> Unit) {
    SourcesRoot(File(directory)).body()
}

fun SourcesRoot.pakage(name: String, body: Package.() -> Unit) {
    Package(this.directory, name).body()
}



class Klass(val sourceDirectory: File, val namespace: String?, val name: String, private val classOrInterface: String? = "class") {
    var extends : Collection<String>? = null
    var implements: Collection<String>? = null
    var imports: Collection<String>? = null
    var annotations: Collection<String>? = null
    var comment: String? = null
    var copyright: String? = null

    internal val indent = "  "

    internal val text = StringBuilder()

    val fields = arrayListOf<Field>()

    fun field(name: String, type: String, access: String = "private", prefix: String = "my", body: Field.() -> Unit = {}) {
        val field = Field(this, name.capitalize(), type, access, prefix)
        fields += field

        field.body()
    }

    fun constant(name: String, type: String, value: String) {
        text.appendln("  private static final $type $name = $value;")
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

            extends?.let { if(it.isNotEmpty()) append(" extends ${it.joinToString(", ")}")}
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

class Enumeration(val sourceDirectory: File, val namespace: String?, val name: String) {
    var copyright: String? = null
    var comment: String? = null
    var members: List<String>? = null

    internal val text = StringBuilder()

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
            appendln()
            comment?.let {
                appendln("/**")
                it.split("\n").flatMap { it.split("\\n") }.forEach { appendln(" * $it") }
                appendln(" */")
            }
        }.toString())

        text.appendln("enum $name {")

        members?.let { text.appendln("  " + it.joinToString(", ")) }

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

fun Package.enumeration(name: String, body: Enumeration.() -> Unit) {
    val c = Enumeration(this.directory, this.name, name)
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

class Field(val c: Klass, val name: String, val type: String, val access: String, val prefix: String) {
    var initial: String? = null
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
        get() = "$access $type $prefix" + (if (prefix.isEmpty()) name.decapitalize() else name) + (if (initial == null) "" else " = $initial")
}

class Parameter(val name: String, val type: String, val annotations: Collection<String>? = null)

class Method(val c: Klass, val name: String, val type: String): Closeable {
    var annotations: Collection<String>? = null
    var parameters: Collection<Parameter>? = null
    var comment: String? = null
    var throws: String? = null
    var access: String = "public"

    private val body = StringBuilder()

    fun parameters(vararg param: Pair<String, String>) {
        parameters = param.map { Parameter(it.first, it.second) }
    }

    fun line(line: String) {
        body.appendln("    " + line)
    }

    fun lines(lines: Iterable<String>) {
        lines.forEach { line(it) }
    }

    override fun close() {
        appendComment(c.text, "  ", comment)
        if (annotations?.size == 1) {
            c.text.append("  ").append(annotations?.single()).append(" ")
        } else {
            annotations?.forEach {
                c.text.appendln("  $it")
            }
            c.text.append("  ")
        }
        c.text.append("$access $type $name(")
        c.text.append(parameters?.map { (it.annotations?.joinToString(" ")?.plus(" ") ?: "") + "${it.type} ${it.name}" }?.joinToString(", ") ?: "")
        c.text.append(")")
        throws?.let { c.text.append(" throws $it") }
        c.text.appendln(" {")

        c.text.append(body.toString())

        c.text.appendln("  }")
    }
}

private fun appendComment(stringBuilder: StringBuilder, indent: String, comment: String?) {
    comment?.let {
        stringBuilder.appendln("$indent/**")
        stringBuilder.appendln("$indent * ${it.replace("\n", "\n$indent * ")}")
        stringBuilder.appendln("$indent */")
    }
}
