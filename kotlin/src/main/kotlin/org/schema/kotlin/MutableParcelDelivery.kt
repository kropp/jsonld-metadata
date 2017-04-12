package org.schema.kotlin
import org.schema.*
class MutableParcelDelivery {
  private val map = HashMap<String,Any>()
  var deliveryAddress: PostalAddress
    get() = map["deliveryAddress"] as PostalAddress
    set(value) { map["deliveryAddress"] = value }
  fun deliveryAddress(builder: MutablePostalAddress.() -> Unit) { map["deliveryAddress"] = MutablePostalAddress().apply(builder).build() }
  var deliveryStatus: DeliveryEvent
    get() = map["deliveryStatus"] as DeliveryEvent
    set(value) { map["deliveryStatus"] = value }
  fun deliveryStatus(builder: MutableDeliveryEvent.() -> Unit) { map["deliveryStatus"] = MutableDeliveryEvent().apply(builder).build() }
  var expectedArrivalFrom: java.util.Date
    get() = map["expectedArrivalFrom"] as java.util.Date
    set(value) { map["expectedArrivalFrom"] = value }
  var expectedArrivalUntil: java.util.Date
    get() = map["expectedArrivalUntil"] as java.util.Date
    set(value) { map["expectedArrivalUntil"] = value }
  var hasDeliveryMethod: DeliveryMethod
    get() = map["hasDeliveryMethod"] as DeliveryMethod
    set(value) { map["hasDeliveryMethod"] = value }
  var itemShipped: Product
    get() = map["itemShipped"] as Product
    set(value) { map["itemShipped"] = value }
  fun itemShipped(builder: MutableProduct.() -> Unit) { map["itemShipped"] = MutableProduct().apply(builder).build() }
  var originAddress: PostalAddress
    get() = map["originAddress"] as PostalAddress
    set(value) { map["originAddress"] = value }
  fun originAddress(builder: MutablePostalAddress.() -> Unit) { map["originAddress"] = MutablePostalAddress().apply(builder).build() }
  var partOfOrder: Order
    get() = map["partOfOrder"] as Order
    set(value) { map["partOfOrder"] = value }
  fun partOfOrder(builder: MutableOrder.() -> Unit) { map["partOfOrder"] = MutableOrder().apply(builder).build() }
  var trackingNumber: String
    get() = map["trackingNumber"] as String
    set(value) { map["trackingNumber"] = value }
  var trackingUrl: String
    get() = map["trackingUrl"] as String
    set(value) { map["trackingUrl"] = value }
  var provider: Any
    get() = map["provider"]!!
    set(value) { map["provider"] = value }
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { map["provider"] = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { map["provider"] = MutablePerson().apply(builder).build() }
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
  fun build() = org.schema.ParcelDelivery.Builder(map).build()
}
