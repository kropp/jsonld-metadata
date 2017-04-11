package org.schema.kotlin
import org.schema.*
class MutableParcelDelivery {
  private val map = HashMap<String,Any>()
  var deliveryAddress: PostalAddress by map
  fun deliveryAddress(builder: MutablePostalAddress.() -> Unit) { deliveryAddress = MutablePostalAddress().apply(builder).build() }
  var deliveryStatus: DeliveryEvent by map
  fun deliveryStatus(builder: MutableDeliveryEvent.() -> Unit) { deliveryStatus = MutableDeliveryEvent().apply(builder).build() }
  var expectedArrivalFrom: java.util.Date by map
  var expectedArrivalUntil: java.util.Date by map
  var hasDeliveryMethod: DeliveryMethod by map
  var itemShipped: Product by map
  fun itemShipped(builder: MutableProduct.() -> Unit) { itemShipped = MutableProduct().apply(builder).build() }
  var originAddress: PostalAddress by map
  fun originAddress(builder: MutablePostalAddress.() -> Unit) { originAddress = MutablePostalAddress().apply(builder).build() }
  var partOfOrder: Order by map
  fun partOfOrder(builder: MutableOrder.() -> Unit) { partOfOrder = MutableOrder().apply(builder).build() }
  var trackingNumber: String by map
  var trackingUrl: String by map
  var provider: Any by map
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { provider = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { provider = MutablePerson().apply(builder).build() }
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
  fun build() = org.schema.ParcelDelivery.Builder(map).build()
}
