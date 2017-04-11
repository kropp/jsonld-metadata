package org.schema.kotlin
import org.schema.Action
import org.schema.PropertyValue
import org.schema.QualitativeValue

class MutableAllWheelDriveConfiguration {
  private val map = HashMap<String,Any>()
  var equal: QualitativeValue by map
  fun equal(builder: MutableQualitativeValue.() -> Unit) { equal = MutableQualitativeValue().apply(builder).build() }
  var greater: QualitativeValue by map
  fun greater(builder: MutableQualitativeValue.() -> Unit) { greater = MutableQualitativeValue().apply(builder).build() }
  var greaterOrEqual: QualitativeValue by map
  fun greaterOrEqual(builder: MutableQualitativeValue.() -> Unit) { greaterOrEqual = MutableQualitativeValue().apply(builder).build() }
  var lesser: QualitativeValue by map
  fun lesser(builder: MutableQualitativeValue.() -> Unit) { lesser = MutableQualitativeValue().apply(builder).build() }
  var lesserOrEqual: QualitativeValue by map
  fun lesserOrEqual(builder: MutableQualitativeValue.() -> Unit) { lesserOrEqual = MutableQualitativeValue().apply(builder).build() }
  var nonEqual: QualitativeValue by map
  fun nonEqual(builder: MutableQualitativeValue.() -> Unit) { nonEqual = MutableQualitativeValue().apply(builder).build() }
  var valueReference: Any by map
  fun valueReferenceEnumeration(builder: MutableEnumeration.() -> Unit) { valueReference = MutableEnumeration().apply(builder).build() }
  fun valueReferencePropertyValue(builder: MutablePropertyValue.() -> Unit) { valueReference = MutablePropertyValue().apply(builder).build() }
  fun valueReferenceQualitativeValue(builder: MutableQualitativeValue.() -> Unit) { valueReference = MutableQualitativeValue().apply(builder).build() }
  fun valueReferenceQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { valueReference = MutableQuantitativeValue().apply(builder).build() }
  fun valueReferenceStructuredValue(builder: MutableStructuredValue.() -> Unit) { valueReference = MutableStructuredValue().apply(builder).build() }
  var additionalProperty: PropertyValue by map
  fun additionalProperty(builder: MutablePropertyValue.() -> Unit) { additionalProperty = MutablePropertyValue().apply(builder).build() }
  var additionalType: String by map
  var alternateName: String by map
  var disambiguatingDescription: String by map
  var mainEntityOfPage: Any by map
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { mainEntityOfPage = MutableCreativeWork().apply(builder).build() }
  var name: String by map
  var sameAs: String by map
  var url: String by map
  var potentialAction: Action by map
  fun potentialAction(builder: MutableAction.() -> Unit) { potentialAction = MutableAction().apply(builder).build() }
  var id: String by map
  fun build() = org.schema.AllWheelDriveConfiguration.Builder(map).build()
}
