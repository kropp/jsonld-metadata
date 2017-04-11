package org.schema.kotlin
import org.schema.*
class MutableOrder {
  private val map = HashMap<String,Any>()
  var orderDelivery: ParcelDelivery by map
  fun orderDelivery(builder: MutableParcelDelivery.() -> Unit) { orderDelivery = MutableParcelDelivery().apply(builder).build() }
  var acceptedOffer: Offer by map
  fun acceptedOffer(builder: MutableOffer.() -> Unit) { acceptedOffer = MutableOffer().apply(builder).build() }
  var billingAddress: PostalAddress by map
  fun billingAddress(builder: MutablePostalAddress.() -> Unit) { billingAddress = MutablePostalAddress().apply(builder).build() }
  var confirmationNumber: Identifier by map
  var customer: Any by map
  fun customerOrganization(builder: MutableOrganization.() -> Unit) { customer = MutableOrganization().apply(builder).build() }
  fun customerPerson(builder: MutablePerson.() -> Unit) { customer = MutablePerson().apply(builder).build() }
  var discount: Any by map
  var discountCode: String by map
  var discountCurrency: String by map
  var isGift: Boolean by map
  var orderDate: java.util.Date by map
  var orderedItem: Any by map
  fun orderedItemOrderItem(builder: MutableOrderItem.() -> Unit) { orderedItem = MutableOrderItem().apply(builder).build() }
  fun orderedItemProduct(builder: MutableProduct.() -> Unit) { orderedItem = MutableProduct().apply(builder).build() }
  var orderNumber: Identifier by map
  var orderStatus: OrderStatus by map
  var partOfInvoice: Invoice by map
  fun partOfInvoice(builder: MutableInvoice.() -> Unit) { partOfInvoice = MutableInvoice().apply(builder).build() }
  var paymentMethod: PaymentMethod by map
  var paymentMethodId: String by map
  var paymentUrl: String by map
  var seller: Participant by map
  var paymentDueDate: java.util.Date by map
  var broker: Any by map
  fun brokerOrganization(builder: MutableOrganization.() -> Unit) { broker = MutableOrganization().apply(builder).build() }
  fun brokerPerson(builder: MutablePerson.() -> Unit) { broker = MutablePerson().apply(builder).build() }
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
  fun build() = org.schema.Order.Builder(map).build()
}
