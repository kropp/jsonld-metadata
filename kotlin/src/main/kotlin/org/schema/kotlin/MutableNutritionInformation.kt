package org.schema.kotlin
import org.schema.Action
import org.schema.Mass

class MutableNutritionInformation {
  private val map = HashMap<String,Any>()
  var carbohydrateContent: Mass by map
  fun carbohydrateContent(builder: MutableMass.() -> Unit) { carbohydrateContent = MutableMass().apply(builder).build() }
  var cholesterolContent: Mass by map
  fun cholesterolContent(builder: MutableMass.() -> Unit) { cholesterolContent = MutableMass().apply(builder).build() }
  var fiberContent: Mass by map
  fun fiberContent(builder: MutableMass.() -> Unit) { fiberContent = MutableMass().apply(builder).build() }
  var proteinContent: Mass by map
  fun proteinContent(builder: MutableMass.() -> Unit) { proteinContent = MutableMass().apply(builder).build() }
  var saturatedFatContent: Mass by map
  fun saturatedFatContent(builder: MutableMass.() -> Unit) { saturatedFatContent = MutableMass().apply(builder).build() }
  var servingSize: String by map
  var sodiumContent: Mass by map
  fun sodiumContent(builder: MutableMass.() -> Unit) { sodiumContent = MutableMass().apply(builder).build() }
  var sugarContent: Mass by map
  fun sugarContent(builder: MutableMass.() -> Unit) { sugarContent = MutableMass().apply(builder).build() }
  var fatContent: Mass by map
  fun fatContent(builder: MutableMass.() -> Unit) { fatContent = MutableMass().apply(builder).build() }
  var transFatContent: Mass by map
  fun transFatContent(builder: MutableMass.() -> Unit) { transFatContent = MutableMass().apply(builder).build() }
  var unsaturatedFatContent: Mass by map
  fun unsaturatedFatContent(builder: MutableMass.() -> Unit) { unsaturatedFatContent = MutableMass().apply(builder).build() }
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
  fun build() = org.schema.NutritionInformation.Builder(map).build()
}
