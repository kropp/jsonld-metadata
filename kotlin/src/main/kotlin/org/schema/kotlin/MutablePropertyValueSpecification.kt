package org.schema.kotlin
import org.schema.Action

class MutablePropertyValueSpecification {
  private val map = HashMap<String,Any>()
  var minValue: Any
    get() = map["minValue"]!!
    set(value) { map["minValue"] = value }
  var valueName: String
    get() = map["valueName"] as String
    set(value) { map["valueName"] = value }
  var valueRequired: Boolean
    get() = map["valueRequired"] as Boolean
    set(value) { map["valueRequired"] = value }
  var defaultValue: Any
    get() = map["defaultValue"]!!
    set(value) { map["defaultValue"] = value }
  fun defaultValueThing(builder: MutableThing.() -> Unit) { map["defaultValue"] = MutableThing().apply(builder).build() }
  var readonlyValue: Boolean
    get() = map["readonlyValue"] as Boolean
    set(value) { map["readonlyValue"] = value }
  var multipleValues: Boolean
    get() = map["multipleValues"] as Boolean
    set(value) { map["multipleValues"] = value }
  var valueMinLength: Any
    get() = map["valueMinLength"]!!
    set(value) { map["valueMinLength"] = value }
  var valueMaxLength: Any
    get() = map["valueMaxLength"]!!
    set(value) { map["valueMaxLength"] = value }
  var valuePattern: String
    get() = map["valuePattern"] as String
    set(value) { map["valuePattern"] = value }
  var stepValue: Any
    get() = map["stepValue"]!!
    set(value) { map["stepValue"] = value }
  var additionalType: String
    get() = map["additionalType"] as String
    set(value) { map["additionalType"] = value }
  var alternateName: String
    get() = map["alternateName"] as String
    set(value) { map["alternateName"] = value }
  var disambiguatingDescription: String
    get() = map["disambiguatingDescription"] as String
    set(value) { map["disambiguatingDescription"] = value }
  var mainEntityOfPage: Any
    get() = map["mainEntityOfPage"]!!
    set(value) { map["mainEntityOfPage"] = value }
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["mainEntityOfPage"] = MutableCreativeWork().apply(builder).build() }
  var name: String
    get() = map["name"] as String
    set(value) { map["name"] = value }
  var sameAs: String
    get() = map["sameAs"] as String
    set(value) { map["sameAs"] = value }
  var url: String
    get() = map["url"] as String
    set(value) { map["url"] = value }
  var potentialAction: Action
    get() = map["potentialAction"] as Action
    set(value) { map["potentialAction"] = value }
  fun potentialAction(builder: MutableAction.() -> Unit) { map["potentialAction"] = MutableAction().apply(builder).build() }
  var id: String
    get() = map["id"] as String
    set(value) { map["id"] = value }
  fun build() = org.schema.PropertyValueSpecification.Builder(map).build()
}
