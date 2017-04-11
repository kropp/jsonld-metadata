package org.schema.kotlin
import org.schema.Action
import org.schema.ListItem
import org.schema.Thing

class MutableListItem {
  private val map = HashMap<String,Any>()
  var item: Thing by map
  fun item(builder: MutableThing.() -> Unit) { item = MutableThing().apply(builder).build() }
  var previousItem: ListItem by map
  fun previousItem(builder: MutableListItem.() -> Unit) { previousItem = MutableListItem().apply(builder).build() }
  var nextItem: ListItem by map
  fun nextItem(builder: MutableListItem.() -> Unit) { nextItem = MutableListItem().apply(builder).build() }
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
  fun build() = org.schema.ListItem.Builder(map).build()
}
