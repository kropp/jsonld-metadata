package org.schema.kotlin
import org.schema.Action

class MutablePropertyValue {
  private val map = HashMap<String,Any>()
  var minValue: Any
    get() = map["minValue"]!!
    set(value) { map["minValue"] = value }
  var unitCode: String
    get() = map["unitCode"] as String
    set(value) { map["unitCode"] = value }
  var value: Any
    get() = map["value"]!!
    set(value) { map["value"] = value }
  var valueReference: Any
    get() = map["valueReference"]!!
    set(value) { map["valueReference"] = value }
  fun valueReferenceEnumeration(builder: MutableEnumeration.() -> Unit) { map["valueReference"] = MutableEnumeration().apply(builder).build() }
  fun valueReferencePropertyValue(builder: MutablePropertyValue.() -> Unit) { map["valueReference"] = MutablePropertyValue().apply(builder).build() }
  fun valueReferenceQualitativeValue(builder: MutableQualitativeValue.() -> Unit) { map["valueReference"] = MutableQualitativeValue().apply(builder).build() }
  fun valueReferenceQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["valueReference"] = MutableQuantitativeValue().apply(builder).build() }
  fun valueReferenceStructuredValue(builder: MutableStructuredValue.() -> Unit) { map["valueReference"] = MutableStructuredValue().apply(builder).build() }
  var unitText: String
    get() = map["unitText"] as String
    set(value) { map["unitText"] = value }
  var propertyID: String
    get() = map["propertyID"] as String
    set(value) { map["propertyID"] = value }
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
  fun build() = org.schema.PropertyValue.Builder(map).build()
}
