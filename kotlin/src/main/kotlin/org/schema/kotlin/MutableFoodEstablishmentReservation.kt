package org.schema.kotlin
import org.schema.*
class MutableFoodEstablishmentReservation {
  private val map = HashMap<String,Any>()
  var startTime: java.util.Date by map
  var partySize: Any by map
  fun partySizeQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { partySize = MutableQuantitativeValue().apply(builder).build() }
  var reservationId: String by map
  var reservationStatus: ReservationStatusType by map
  var reservationFor: Thing by map
  fun reservationFor(builder: MutableThing.() -> Unit) { reservationFor = MutableThing().apply(builder).build() }
  var underName: Any by map
  fun underNameOrganization(builder: MutableOrganization.() -> Unit) { underName = MutableOrganization().apply(builder).build() }
  fun underNamePerson(builder: MutablePerson.() -> Unit) { underName = MutablePerson().apply(builder).build() }
  var provider: Any by map
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { provider = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { provider = MutablePerson().apply(builder).build() }
  var bookingTime: java.util.Date by map
  var modifiedTime: java.util.Date by map
  var programMembershipUsed: ProgramMembership by map
  fun programMembershipUsed(builder: MutableProgramMembership.() -> Unit) { programMembershipUsed = MutableProgramMembership().apply(builder).build() }
  var reservedTicket: Ticket by map
  fun reservedTicket(builder: MutableTicket.() -> Unit) { reservedTicket = MutableTicket().apply(builder).build() }
  var totalPrice: Any by map
  var priceCurrency: String by map
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
  fun build() = org.schema.FoodEstablishmentReservation.Builder(map).build()
}
