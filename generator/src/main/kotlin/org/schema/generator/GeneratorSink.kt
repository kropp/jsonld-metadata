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

import org.semarglproject.sink.TripleSink
import java.util.*

class GeneratorSink : TripleSink {
    private var uri: String = "http://schema.org/"

    private val ID_TYPE = "http://schema.org/@id"

    private val NUMBER_UNDERLYING_TYPES = listOf("Integer", "Long", "Float", "Double", "String")

    class Type {
        var isSuperseded: Boolean = false
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

        val classOrInterface: String
            get() = when(isInterface) { true -> "interface"; else -> "class" }
    }

    val types = hashMapOf<String, Type>()

    override fun setProperty(key: String, value: Any): Boolean {
        return true
    }

    override fun endStream() {
    }

    fun postProcess() {
        for (type in types.values) {
            if (type.isField && type.isInterface) {
                type.isField = false
                type.dataTypes.forEach { types[it]!!.interfaces.add(type.name!!.capitalize()) }
            }
            if (type.name == "Thing") {
                type.subTypes.add(ID_TYPE)
            }
        }
        val idType = Type()
        idType.name = "Id"
        idType.isField = true
        idType.dataTypes.add("http://schema.org/Text")
        types.put(ID_TYPE, idType)
    }

    override fun setBaseUri(baseUri: String) {
        uri = baseUri
    }

    override fun startStream() {
    }

    override fun addNonLiteral(subj: String, pred: String, obj: String) {
        when(pred) {
            "http://www.w3.org/1999/02/22-rdf-syntax-ns#type" -> { if(!types.containsKey(subj)) types.put(subj, Type()) }
            "http://www.w3.org/2000/01/rdf-schema#subClassOf" -> types[subj]!!.parentType = obj
            "http://schema.org/domainIncludes" -> {
                val objType = types[obj]

                if (objType != null) {
                    val subjType = types[subj]!!
                    subjType.isField = true
                    if (!objType.subTypes.contains(subj)) {
                        objType.subTypes.add(subj)
                    }
                } else {
                    val type = Type()
                    type.interfaces.add(getInterfaceName(subj))
                    types.put(obj, type)
                }
            }
            "http://schema.org/rangeIncludes" -> types[subj]!!.dataTypes.add(obj)
            "http://purl.org/dc/terms/source" -> types[subj]!!.source = obj
            "http://www.w3.org/2002/07/owl#equivalentClass" -> types[subj]!!.equivalent = obj
            "http://www.w3.org/2002/07/owl#equivalentProperty" -> types[subj]!!.equivalent = obj
            "http://schema.org/inverseOf" -> { /* ignore */ }
            "http://schema.org/supersededBy" -> { types[subj]!!.isSuperseded = true }
            "http://www.w3.org/2000/01/rdf-schema#subPropertyOf" -> {
                val interfaceType = Type()
                interfaceType.name = getInterfaceName(obj)
                interfaceType.isInterface = true
                types.put(obj, interfaceType)

                if (!types.containsKey(subj)) types.put(subj, Type())
                val type = types[subj]!!
                if (type.isField) {
                    type.dataTypes.add(obj)
                } else {
                    type.interfaces.add(interfaceType.name!!)
                }
            }
            else -> System.err.println("Unknown non-literal: $pred")
        }
    }

    private fun getInterfaceName(obj: String): String = obj.substring(uri.length).capitalize()

    override fun addPlainLiteral(subj: String, pred: String, content: String, lang: String?) {
        when(pred) {
            "http://www.w3.org/2000/01/rdf-schema#label" -> types[subj]!!.name = content.replace(" ", "").replace(".", "").capitalize()
            "http://www.w3.org/2000/01/rdf-schema#comment" -> types[subj]!!.comment = content
            else -> System.err.println("Unknown plain literal: $pred")
        }
    }

    override fun addTypedLiteral(subj: String, pred: String, content: String, type: String) {
        System.err.println("Unknown typed literal: $pred")
    }

    private fun getBasicTypeName(name: String?): String? {
        return when(name) {
            "Text", "URL" -> "String"
            "DateTime", "Date", "Time" -> "java.util.Date"
            "Class" -> null
            else -> name?.capitalize()
        }
    }

    private fun getFieldType(field: Type): String? {
        if (field.isInterface && field.name != null)
            return field.name!!.capitalize()

        val name = field.dataTypes.firstOrNull { types[it]!!.isInterface } ?: field.dataTypes.firstOrNull()
        return getBasicTypeName(types[name]?.name)
    }

    fun getEitherTypes(field: Type): Collection<String> {
        if (field.isInterface && field.name != null)
            return listOf(field.name!!.capitalize())

        if (field.dataTypes[0] == "http://schema.org/Number") {
            return NUMBER_UNDERLYING_TYPES
        }

        if (field.dataTypes.size < 2) {
            return listOf(getFieldType(field) ?: "")
        }

        val interfaceName = field.dataTypes.firstOrNull { types[it]!!.isInterface }
        if (interfaceName != null)
            return listOf(types[interfaceName]!!.name!!)

        return field.dataTypes.map { getBasicTypeName(types[it]?.name) }.filterNotNull().distinct().sorted()
    }

    fun shouldSkip(name: String): Boolean {
        return arrayOf("Text", "DataType", "DateTime", "Date", "Time", "Boolean", "Number", "Integer", "Int", "Long", "Float", "Double", "URL", "True", "False", "Class", "Object").contains(name) ||
                name.contains("#") || name.contains("/")
    }

    fun getAllFields(type: Type?): Iterable<Type> {
        if (type == null) {
            return emptyList()
        }
        val fieldTypes = type.subTypes.map { types[it] }.filterNotNull().filter { it.name != null && !it.isSuperseded && it.dataTypes.any() && it.dataTypes[0] != "http://schema.org/Class" }.toMutableList()
        getAllFields(types[type.parentType]).filterNot { i -> fieldTypes.any { it.name == i.name} }.forEach { fieldTypes.add(it) }
        return fieldTypes
    }
}