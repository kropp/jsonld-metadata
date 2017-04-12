package org.schema.kotlin
import org.schema.Action
import org.schema.PropertyValue
import org.schema.QualitativeValue

class MutableSteeringPositionValue {
  private val map = HashMap<String,Any>()
  var equal: QualitativeValue
    get() = map["equal"] as QualitativeValue
    set(value) { map["equal"] = value }
  fun equal(builder: MutableQualitativeValue.() -> Unit) { map["equal"] = MutableQualitativeValue().apply(builder).build() }
  var greater: QualitativeValue
    get() = map["greater"] as QualitativeValue
    set(value) { map["greater"] = value }
  fun greater(builder: MutableQualitativeValue.() -> Unit) { map["greater"] = MutableQualitativeValue().apply(builder).build() }
  var greaterOrEqual: QualitativeValue
    get() = map["greaterOrEqual"] as QualitativeValue
    set(value) { map["greaterOrEqual"] = value }
  fun greaterOrEqual(builder: MutableQualitativeValue.() -> Unit) { map["greaterOrEqual"] = MutableQualitativeValue().apply(builder).build() }
  var lesser: QualitativeValue
    get() = map["lesser"] as QualitativeValue
    set(value) { map["lesser"] = value }
  fun lesser(builder: MutableQualitativeValue.() -> Unit) { map["lesser"] = MutableQualitativeValue().apply(builder).build() }
  var lesserOrEqual: QualitativeValue
    get() = map["lesserOrEqual"] as QualitativeValue
    set(value) { map["lesserOrEqual"] = value }
  fun lesserOrEqual(builder: MutableQualitativeValue.() -> Unit) { map["lesserOrEqual"] = MutableQualitativeValue().apply(builder).build() }
  var nonEqual: QualitativeValue
    get() = map["nonEqual"] as QualitativeValue
    set(value) { map["nonEqual"] = value }
  fun nonEqual(builder: MutableQualitativeValue.() -> Unit) { map["nonEqual"] = MutableQualitativeValue().apply(builder).build() }
  var valueReference: Any
    get() = map["valueReference"]!!
    set(value) { map["valueReference"] = value }
  fun valueReferenceEnumeration(builder: MutableEnumeration.() -> Unit) { map["valueReference"] = MutableEnumeration().apply(builder).build() }
  fun valueReferencePropertyValue(builder: MutablePropertyValue.() -> Unit) { map["valueReference"] = MutablePropertyValue().apply(builder).build() }
  fun valueReferenceQualitativeValue(builder: MutableQualitativeValue.() -> Unit) { map["valueReference"] = MutableQualitativeValue().apply(builder).build() }
  fun valueReferenceQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["valueReference"] = MutableQuantitativeValue().apply(builder).build() }
  fun valueReferenceStructuredValue(builder: MutableStructuredValue.() -> Unit) { map["valueReference"] = MutableStructuredValue().apply(builder).build() }
  var additionalProperty: PropertyValue
    get() = map["additionalProperty"] as PropertyValue
    set(value) { map["additionalProperty"] = value }
  fun additionalProperty(builder: MutablePropertyValue.() -> Unit) { map["additionalProperty"] = MutablePropertyValue().apply(builder).build() }
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
  fun build() = org.schema.SteeringPositionValue.Builder(map).build()
}
