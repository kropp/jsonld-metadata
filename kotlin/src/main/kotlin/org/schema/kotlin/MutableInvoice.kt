package org.schema.kotlin
import org.schema.*
class MutableInvoice {
  private val map = HashMap<String,Any>()
  var confirmationNumber: Identifier by map
  var customer: Any by map
  fun customerOrganization(builder: MutableOrganization.() -> Unit) { customer = MutableOrganization().apply(builder).build() }
  fun customerPerson(builder: MutablePerson.() -> Unit) { customer = MutablePerson().apply(builder).build() }
  var paymentMethod: PaymentMethod by map
  var paymentMethodId: String by map
  var paymentDueDate: java.util.Date by map
  var provider: Any by map
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { provider = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { provider = MutablePerson().apply(builder).build() }
  var broker: Any by map
  fun brokerOrganization(builder: MutableOrganization.() -> Unit) { broker = MutableOrganization().apply(builder).build() }
  fun brokerPerson(builder: MutablePerson.() -> Unit) { broker = MutablePerson().apply(builder).build() }
  var totalPaymentDue: Any by map
  fun totalPaymentDueMonetaryAmount(builder: MutableMonetaryAmount.() -> Unit) { totalPaymentDue = MutableMonetaryAmount().apply(builder).build() }
  fun totalPaymentDuePriceSpecification(builder: MutablePriceSpecification.() -> Unit) { totalPaymentDue = MutablePriceSpecification().apply(builder).build() }
  var minimumPaymentDue: Any by map
  fun minimumPaymentDueMonetaryAmount(builder: MutableMonetaryAmount.() -> Unit) { minimumPaymentDue = MutableMonetaryAmount().apply(builder).build() }
  fun minimumPaymentDuePriceSpecification(builder: MutablePriceSpecification.() -> Unit) { minimumPaymentDue = MutablePriceSpecification().apply(builder).build() }
  var accountId: Identifier by map
  var scheduledPaymentDate: java.util.Date by map
  var billingPeriod: Duration by map
  var paymentStatus: Any by map
  var referencesOrder: Order by map
  fun referencesOrder(builder: MutableOrder.() -> Unit) { referencesOrder = MutableOrder().apply(builder).build() }
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
  fun build() = org.schema.Invoice.Builder(map).build()
}
