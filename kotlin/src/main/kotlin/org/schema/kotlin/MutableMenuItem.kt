package org.schema.kotlin
import org.schema.Action
import org.schema.MenuSection
import org.schema.NutritionInformation
import org.schema.RestrictedDiet

class MutableMenuItem {
  private val map = HashMap<String,Any>()
  var suitableForDiet: RestrictedDiet
    get() = map["suitableForDiet"] as RestrictedDiet
    set(value) { map["suitableForDiet"] = value }
  var nutrition: NutritionInformation
    get() = map["nutrition"] as NutritionInformation
    set(value) { map["nutrition"] = value }
  fun nutrition(builder: MutableNutritionInformation.() -> Unit) { map["nutrition"] = MutableNutritionInformation().apply(builder).build() }
  var menuAddOn: MenuSection
    get() = map["menuAddOn"] as MenuSection
    set(value) { map["menuAddOn"] = value }
  fun menuAddOn(builder: MutableMenuSection.() -> Unit) { map["menuAddOn"] = MutableMenuSection().apply(builder).build() }
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
  fun build() = org.schema.MenuItem.Builder(map).build()
}
