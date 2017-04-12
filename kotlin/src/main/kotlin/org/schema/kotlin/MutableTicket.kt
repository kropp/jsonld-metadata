package org.schema.kotlin
import org.schema.Action
import org.schema.Organization
import org.schema.Seat

class MutableTicket {
  private val map = HashMap<String,Any>()
  var underName: Any
    get() = map["underName"]!!
    set(value) { map["underName"] = value }
  fun underNameOrganization(builder: MutableOrganization.() -> Unit) { map["underName"] = MutableOrganization().apply(builder).build() }
  fun underNamePerson(builder: MutablePerson.() -> Unit) { map["underName"] = MutablePerson().apply(builder).build() }
  var totalPrice: Any
    get() = map["totalPrice"]!!
    set(value) { map["totalPrice"] = value }
  var priceCurrency: String
    get() = map["priceCurrency"] as String
    set(value) { map["priceCurrency"] = value }
  var issuedBy: Organization
    get() = map["issuedBy"] as Organization
    set(value) { map["issuedBy"] = value }
  fun issuedBy(builder: MutableOrganization.() -> Unit) { map["issuedBy"] = MutableOrganization().apply(builder).build() }
  var dateIssued: java.util.Date
    get() = map["dateIssued"] as java.util.Date
    set(value) { map["dateIssued"] = value }
  var ticketedSeat: Seat
    get() = map["ticketedSeat"] as Seat
    set(value) { map["ticketedSeat"] = value }
  fun ticketedSeat(builder: MutableSeat.() -> Unit) { map["ticketedSeat"] = MutableSeat().apply(builder).build() }
  var ticketNumber: String
    get() = map["ticketNumber"] as String
    set(value) { map["ticketNumber"] = value }
  var ticketToken: String
    get() = map["ticketToken"] as String
    set(value) { map["ticketToken"] = value }
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
  fun build() = org.schema.Ticket.Builder(map).build()
}
