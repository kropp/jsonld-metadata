package org.schema.kotlin
import org.schema.Action
import org.schema.OrderStatus
import org.schema.ParcelDelivery

class MutableOrderItem {
  private val map = HashMap<String,Any>()
  var orderQuantity: Any by map
  var orderItemStatus: OrderStatus by map
  var orderItemNumber: String by map
  var orderDelivery: ParcelDelivery by map
  fun orderDelivery(builder: MutableParcelDelivery.() -> Unit) { orderDelivery = MutableParcelDelivery().apply(builder).build() }
  var orderedItem: Any by map
  fun orderedItemOrderItem(builder: MutableOrderItem.() -> Unit) { orderedItem = MutableOrderItem().apply(builder).build() }
  fun orderedItemProduct(builder: MutableProduct.() -> Unit) { orderedItem = MutableProduct().apply(builder).build() }
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
  fun build() = org.schema.OrderItem.Builder(map).build()
}
