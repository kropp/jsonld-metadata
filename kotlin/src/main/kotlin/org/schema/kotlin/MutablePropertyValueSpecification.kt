package org.schema.kotlin
import org.schema.Action

class MutablePropertyValueSpecification {
  private val map = HashMap<String,Any>()
  var minValue: Any by map
  var valueName: String by map
  var valueRequired: Boolean by map
  var defaultValue: Any by map
  fun defaultValueThing(builder: MutableThing.() -> Unit) { defaultValue = MutableThing().apply(builder).build() }
  var readonlyValue: Boolean by map
  var multipleValues: Boolean by map
  var valueMinLength: Any by map
  var valueMaxLength: Any by map
  var valuePattern: String by map
  var stepValue: Any by map
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
  fun build() = org.schema.PropertyValueSpecification.Builder(map).build()
}
