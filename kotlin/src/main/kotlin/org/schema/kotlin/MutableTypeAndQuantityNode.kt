package org.schema.kotlin
import org.schema.Action
import org.schema.BusinessFunction

class MutableTypeAndQuantityNode {
  private val map = HashMap<String,Any>()
  var amountOfThisGood: Any by map
  var businessFunction: BusinessFunction by map
  var typeOfGood: Any by map
  fun typeOfGoodProduct(builder: MutableProduct.() -> Unit) { typeOfGood = MutableProduct().apply(builder).build() }
  fun typeOfGoodService(builder: MutableService.() -> Unit) { typeOfGood = MutableService().apply(builder).build() }
  var unitCode: String by map
  var unitText: String by map
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
  fun build() = org.schema.TypeAndQuantityNode.Builder(map).build()
}
