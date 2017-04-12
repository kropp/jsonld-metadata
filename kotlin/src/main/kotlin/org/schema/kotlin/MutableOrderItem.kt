package org.schema.kotlin
import org.schema.Action
import org.schema.OrderStatus
import org.schema.ParcelDelivery

class MutableOrderItem {
  private val map = HashMap<String,Any>()
  var orderQuantity: Any
    get() = map["orderQuantity"]!!
    set(value) { map["orderQuantity"] = value }
  var orderItemStatus: OrderStatus
    get() = map["orderItemStatus"] as OrderStatus
    set(value) { map["orderItemStatus"] = value }
  var orderItemNumber: String
    get() = map["orderItemNumber"] as String
    set(value) { map["orderItemNumber"] = value }
  var orderDelivery: ParcelDelivery
    get() = map["orderDelivery"] as ParcelDelivery
    set(value) { map["orderDelivery"] = value }
  fun orderDelivery(builder: MutableParcelDelivery.() -> Unit) { map["orderDelivery"] = MutableParcelDelivery().apply(builder).build() }
  var orderedItem: Any
    get() = map["orderedItem"]!!
    set(value) { map["orderedItem"] = value }
  fun orderedItemOrderItem(builder: MutableOrderItem.() -> Unit) { map["orderedItem"] = MutableOrderItem().apply(builder).build() }
  fun orderedItemProduct(builder: MutableProduct.() -> Unit) { map["orderedItem"] = MutableProduct().apply(builder).build() }
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
  fun build() = org.schema.OrderItem.Builder(map).build()
}
