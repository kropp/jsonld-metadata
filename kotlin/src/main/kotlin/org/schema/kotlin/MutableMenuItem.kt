package org.schema.kotlin
import org.schema.Action
import org.schema.MenuSection
import org.schema.NutritionInformation
import org.schema.RestrictedDiet

class MutableMenuItem {
  private val map = HashMap<String,Any>()
  var suitableForDiet: RestrictedDiet by map
  var nutrition: NutritionInformation by map
  fun nutrition(builder: MutableNutritionInformation.() -> Unit) { nutrition = MutableNutritionInformation().apply(builder).build() }
  var menuAddOn: MenuSection by map
  fun menuAddOn(builder: MutableMenuSection.() -> Unit) { menuAddOn = MutableMenuSection().apply(builder).build() }
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
  fun build() = org.schema.MenuItem.Builder(map).build()
}
