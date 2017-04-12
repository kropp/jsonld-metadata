package org.schema.kotlin
import org.schema.Action
import org.schema.BusinessFunction

class MutableTypeAndQuantityNode {
  private val map = HashMap<String,Any>()
  var amountOfThisGood: Any
    get() = map["amountOfThisGood"]!!
    set(value) { map["amountOfThisGood"] = value }
  var businessFunction: BusinessFunction
    get() = map["businessFunction"] as BusinessFunction
    set(value) { map["businessFunction"] = value }
  var typeOfGood: Any
    get() = map["typeOfGood"]!!
    set(value) { map["typeOfGood"] = value }
  fun typeOfGoodProduct(builder: MutableProduct.() -> Unit) { map["typeOfGood"] = MutableProduct().apply(builder).build() }
  fun typeOfGoodService(builder: MutableService.() -> Unit) { map["typeOfGood"] = MutableService().apply(builder).build() }
  var unitCode: String
    get() = map["unitCode"] as String
    set(value) { map["unitCode"] = value }
  var unitText: String
    get() = map["unitText"] as String
    set(value) { map["unitText"] = value }
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
  fun build() = org.schema.TypeAndQuantityNode.Builder(map).build()
}
