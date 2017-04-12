package org.schema.kotlin
import org.schema.Action
import org.schema.Mass

class MutableNutritionInformation {
  private val map = HashMap<String,Any>()
  var carbohydrateContent: Mass
    get() = map["carbohydrateContent"] as Mass
    set(value) { map["carbohydrateContent"] = value }
  fun carbohydrateContent(builder: MutableMass.() -> Unit) { map["carbohydrateContent"] = MutableMass().apply(builder).build() }
  var cholesterolContent: Mass
    get() = map["cholesterolContent"] as Mass
    set(value) { map["cholesterolContent"] = value }
  fun cholesterolContent(builder: MutableMass.() -> Unit) { map["cholesterolContent"] = MutableMass().apply(builder).build() }
  var fiberContent: Mass
    get() = map["fiberContent"] as Mass
    set(value) { map["fiberContent"] = value }
  fun fiberContent(builder: MutableMass.() -> Unit) { map["fiberContent"] = MutableMass().apply(builder).build() }
  var proteinContent: Mass
    get() = map["proteinContent"] as Mass
    set(value) { map["proteinContent"] = value }
  fun proteinContent(builder: MutableMass.() -> Unit) { map["proteinContent"] = MutableMass().apply(builder).build() }
  var saturatedFatContent: Mass
    get() = map["saturatedFatContent"] as Mass
    set(value) { map["saturatedFatContent"] = value }
  fun saturatedFatContent(builder: MutableMass.() -> Unit) { map["saturatedFatContent"] = MutableMass().apply(builder).build() }
  var servingSize: String
    get() = map["servingSize"] as String
    set(value) { map["servingSize"] = value }
  var sodiumContent: Mass
    get() = map["sodiumContent"] as Mass
    set(value) { map["sodiumContent"] = value }
  fun sodiumContent(builder: MutableMass.() -> Unit) { map["sodiumContent"] = MutableMass().apply(builder).build() }
  var sugarContent: Mass
    get() = map["sugarContent"] as Mass
    set(value) { map["sugarContent"] = value }
  fun sugarContent(builder: MutableMass.() -> Unit) { map["sugarContent"] = MutableMass().apply(builder).build() }
  var fatContent: Mass
    get() = map["fatContent"] as Mass
    set(value) { map["fatContent"] = value }
  fun fatContent(builder: MutableMass.() -> Unit) { map["fatContent"] = MutableMass().apply(builder).build() }
  var transFatContent: Mass
    get() = map["transFatContent"] as Mass
    set(value) { map["transFatContent"] = value }
  fun transFatContent(builder: MutableMass.() -> Unit) { map["transFatContent"] = MutableMass().apply(builder).build() }
  var unsaturatedFatContent: Mass
    get() = map["unsaturatedFatContent"] as Mass
    set(value) { map["unsaturatedFatContent"] = value }
  fun unsaturatedFatContent(builder: MutableMass.() -> Unit) { map["unsaturatedFatContent"] = MutableMass().apply(builder).build() }
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
  fun build() = org.schema.NutritionInformation.Builder(map).build()
}
