package org.schema.kotlin
import org.schema.Action
import org.schema.Organization
import org.schema.Seat

class MutableTicket {
  private val map = HashMap<String,Any>()
  var underName: Any by map
  fun underNameOrganization(builder: MutableOrganization.() -> Unit) { underName = MutableOrganization().apply(builder).build() }
  fun underNamePerson(builder: MutablePerson.() -> Unit) { underName = MutablePerson().apply(builder).build() }
  var totalPrice: Any by map
  var priceCurrency: String by map
  var issuedBy: Organization by map
  fun issuedBy(builder: MutableOrganization.() -> Unit) { issuedBy = MutableOrganization().apply(builder).build() }
  var dateIssued: java.util.Date by map
  var ticketedSeat: Seat by map
  fun ticketedSeat(builder: MutableSeat.() -> Unit) { ticketedSeat = MutableSeat().apply(builder).build() }
  var ticketNumber: String by map
  var ticketToken: String by map
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
  fun build() = org.schema.Ticket.Builder(map).build()
}
