package org.schema.kotlin
import org.schema.Action

class MutableEngineSpecification {
  private val map = HashMap<String,Any>()
  var fuelType: Any by map
  fun fuelTypeQualitativeValue(builder: MutableQualitativeValue.() -> Unit) { fuelType = MutableQualitativeValue().apply(builder).build() }
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
  fun build() = org.schema.EngineSpecification.Builder(map).build()
}
