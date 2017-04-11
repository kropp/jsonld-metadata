package org.schema.kotlin
import org.schema.Action

class MutableOwnershipInfo {
  private val map = HashMap<String,Any>()
  var acquiredFrom: Any by map
  fun acquiredFromOrganization(builder: MutableOrganization.() -> Unit) { acquiredFrom = MutableOrganization().apply(builder).build() }
  fun acquiredFromPerson(builder: MutablePerson.() -> Unit) { acquiredFrom = MutablePerson().apply(builder).build() }
  var ownedFrom: java.util.Date by map
  var ownedThrough: java.util.Date by map
  var typeOfGood: Any by map
  fun typeOfGoodProduct(builder: MutableProduct.() -> Unit) { typeOfGood = MutableProduct().apply(builder).build() }
  fun typeOfGoodService(builder: MutableService.() -> Unit) { typeOfGood = MutableService().apply(builder).build() }
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
  fun build() = org.schema.OwnershipInfo.Builder(map).build()
}
