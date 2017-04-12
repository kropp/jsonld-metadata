package org.schema.kotlin
import org.schema.Action

class MutableItemList {
  private val map = HashMap<String,Any>()
  var numberOfItems: Int
    get() = map["numberOfItems"] as Int
    set(value) { map["numberOfItems"] = value }
  var itemListOrder: Any
    get() = map["itemListOrder"]!!
    set(value) { map["itemListOrder"] = value }
  var itemListElement: Any
    get() = map["itemListElement"]!!
    set(value) { map["itemListElement"] = value }
  fun itemListElementListItem(builder: MutableListItem.() -> Unit) { map["itemListElement"] = MutableListItem().apply(builder).build() }
  fun itemListElementThing(builder: MutableThing.() -> Unit) { map["itemListElement"] = MutableThing().apply(builder).build() }
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
  fun build() = org.schema.ItemList.Builder(map).build()
}
