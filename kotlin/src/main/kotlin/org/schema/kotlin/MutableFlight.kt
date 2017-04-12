package org.schema.kotlin
import org.schema.*
class MutableFlight {
  private val map = HashMap<String,Any>()
  var seller: Participant
    get() = map["seller"] as Participant
    set(value) { map["seller"] = value }
  var provider: Any
    get() = map["provider"]!!
    set(value) { map["provider"] = value }
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { map["provider"] = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { map["provider"] = MutablePerson().apply(builder).build() }
  var flightNumber: Identifier
    get() = map["flightNumber"] as Identifier
    set(value) { map["flightNumber"] = value }
  var departureTime: java.util.Date
    get() = map["departureTime"] as java.util.Date
    set(value) { map["departureTime"] = value }
  var arrivalTime: java.util.Date
    get() = map["arrivalTime"] as java.util.Date
    set(value) { map["arrivalTime"] = value }
  var departureAirport: Airport
    get() = map["departureAirport"] as Airport
    set(value) { map["departureAirport"] = value }
  fun departureAirport(builder: MutableAirport.() -> Unit) { map["departureAirport"] = MutableAirport().apply(builder).build() }
  var arrivalAirport: Airport
    get() = map["arrivalAirport"] as Airport
    set(value) { map["arrivalAirport"] = value }
  fun arrivalAirport(builder: MutableAirport.() -> Unit) { map["arrivalAirport"] = MutableAirport().apply(builder).build() }
  var departureGate: String
    get() = map["departureGate"] as String
    set(value) { map["departureGate"] = value }
  var arrivalGate: String
    get() = map["arrivalGate"] as String
    set(value) { map["arrivalGate"] = value }
  var boardingPolicy: BoardingPolicyType
    get() = map["boardingPolicy"] as BoardingPolicyType
    set(value) { map["boardingPolicy"] = value }
  var departureTerminal: String
    get() = map["departureTerminal"] as String
    set(value) { map["departureTerminal"] = value }
  var arrivalTerminal: String
    get() = map["arrivalTerminal"] as String
    set(value) { map["arrivalTerminal"] = value }
  var aircraft: Any
    get() = map["aircraft"]!!
    set(value) { map["aircraft"] = value }
  fun aircraftVehicle(builder: MutableVehicle.() -> Unit) { map["aircraft"] = MutableVehicle().apply(builder).build() }
  var mealService: String
    get() = map["mealService"] as String
    set(value) { map["mealService"] = value }
  var estimatedFlightDuration: Any
    get() = map["estimatedFlightDuration"]!!
    set(value) { map["estimatedFlightDuration"] = value }
  var flightDistance: Any
    get() = map["flightDistance"]!!
    set(value) { map["flightDistance"] = value }
  fun flightDistanceDistance(builder: MutableDistance.() -> Unit) { map["flightDistance"] = MutableDistance().apply(builder).build() }
  var webCheckinTime: java.util.Date
    get() = map["webCheckinTime"] as java.util.Date
    set(value) { map["webCheckinTime"] = value }
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
  fun build() = org.schema.Flight.Builder(map).build()
}
