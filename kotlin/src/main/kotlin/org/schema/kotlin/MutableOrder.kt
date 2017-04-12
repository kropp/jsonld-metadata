package org.schema.kotlin
import org.schema.*
class MutableOrder {
  private val map = HashMap<String,Any>()
  var orderDelivery: ParcelDelivery
    get() = map["orderDelivery"] as ParcelDelivery
    set(value) { map["orderDelivery"] = value }
  fun orderDelivery(builder: MutableParcelDelivery.() -> Unit) { map["orderDelivery"] = MutableParcelDelivery().apply(builder).build() }
  var acceptedOffer: Offer
    get() = map["acceptedOffer"] as Offer
    set(value) { map["acceptedOffer"] = value }
  fun acceptedOffer(builder: MutableOffer.() -> Unit) { map["acceptedOffer"] = MutableOffer().apply(builder).build() }
  var billingAddress: PostalAddress
    get() = map["billingAddress"] as PostalAddress
    set(value) { map["billingAddress"] = value }
  fun billingAddress(builder: MutablePostalAddress.() -> Unit) { map["billingAddress"] = MutablePostalAddress().apply(builder).build() }
  var confirmationNumber: Identifier
    get() = map["confirmationNumber"] as Identifier
    set(value) { map["confirmationNumber"] = value }
  var customer: Any
    get() = map["customer"]!!
    set(value) { map["customer"] = value }
  fun customerOrganization(builder: MutableOrganization.() -> Unit) { map["customer"] = MutableOrganization().apply(builder).build() }
  fun customerPerson(builder: MutablePerson.() -> Unit) { map["customer"] = MutablePerson().apply(builder).build() }
  var discount: Any
    get() = map["discount"]!!
    set(value) { map["discount"] = value }
  var discountCode: String
    get() = map["discountCode"] as String
    set(value) { map["discountCode"] = value }
  var discountCurrency: String
    get() = map["discountCurrency"] as String
    set(value) { map["discountCurrency"] = value }
  var isGift: Boolean
    get() = map["isGift"] as Boolean
    set(value) { map["isGift"] = value }
  var orderDate: java.util.Date
    get() = map["orderDate"] as java.util.Date
    set(value) { map["orderDate"] = value }
  var orderedItem: Any
    get() = map["orderedItem"]!!
    set(value) { map["orderedItem"] = value }
  fun orderedItemOrderItem(builder: MutableOrderItem.() -> Unit) { map["orderedItem"] = MutableOrderItem().apply(builder).build() }
  fun orderedItemProduct(builder: MutableProduct.() -> Unit) { map["orderedItem"] = MutableProduct().apply(builder).build() }
  var orderNumber: Identifier
    get() = map["orderNumber"] as Identifier
    set(value) { map["orderNumber"] = value }
  var orderStatus: OrderStatus
    get() = map["orderStatus"] as OrderStatus
    set(value) { map["orderStatus"] = value }
  var partOfInvoice: Invoice
    get() = map["partOfInvoice"] as Invoice
    set(value) { map["partOfInvoice"] = value }
  fun partOfInvoice(builder: MutableInvoice.() -> Unit) { map["partOfInvoice"] = MutableInvoice().apply(builder).build() }
  var paymentMethod: PaymentMethod
    get() = map["paymentMethod"] as PaymentMethod
    set(value) { map["paymentMethod"] = value }
  var paymentMethodId: String
    get() = map["paymentMethodId"] as String
    set(value) { map["paymentMethodId"] = value }
  var paymentUrl: String
    get() = map["paymentUrl"] as String
    set(value) { map["paymentUrl"] = value }
  var seller: Participant
    get() = map["seller"] as Participant
    set(value) { map["seller"] = value }
  var paymentDueDate: java.util.Date
    get() = map["paymentDueDate"] as java.util.Date
    set(value) { map["paymentDueDate"] = value }
  var broker: Any
    get() = map["broker"]!!
    set(value) { map["broker"] = value }
  fun brokerOrganization(builder: MutableOrganization.() -> Unit) { map["broker"] = MutableOrganization().apply(builder).build() }
  fun brokerPerson(builder: MutablePerson.() -> Unit) { map["broker"] = MutablePerson().apply(builder).build() }
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
  fun build() = org.schema.Order.Builder(map).build()
}
