package org.schema.kotlin
import org.schema.Action
import org.schema.ListItem
import org.schema.Thing

class MutableListItem {
  private val map = HashMap<String,Any>()
  var item: Thing
    get() = map["item"] as Thing
    set(value) { map["item"] = value }
  fun item(builder: MutableThing.() -> Unit) { map["item"] = MutableThing().apply(builder).build() }
  var previousItem: ListItem
    get() = map["previousItem"] as ListItem
    set(value) { map["previousItem"] = value }
  fun previousItem(builder: MutableListItem.() -> Unit) { map["previousItem"] = MutableListItem().apply(builder).build() }
  var nextItem: ListItem
    get() = map["nextItem"] as ListItem
    set(value) { map["nextItem"] = value }
  fun nextItem(builder: MutableListItem.() -> Unit) { map["nextItem"] = MutableListItem().apply(builder).build() }
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
  fun build() = org.schema.ListItem.Builder(map).build()
}
