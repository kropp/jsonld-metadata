package org.schema.kotlin
import org.schema.*
class MutableFlight {
  private val map = HashMap<String,Any>()
  var seller: Participant by map
  var provider: Any by map
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { provider = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { provider = MutablePerson().apply(builder).build() }
  var flightNumber: Identifier by map
  var departureTime: java.util.Date by map
  var arrivalTime: java.util.Date by map
  var departureAirport: Airport by map
  fun departureAirport(builder: MutableAirport.() -> Unit) { departureAirport = MutableAirport().apply(builder).build() }
  var arrivalAirport: Airport by map
  fun arrivalAirport(builder: MutableAirport.() -> Unit) { arrivalAirport = MutableAirport().apply(builder).build() }
  var departureGate: String by map
  var arrivalGate: String by map
  var boardingPolicy: BoardingPolicyType by map
  var departureTerminal: String by map
  var arrivalTerminal: String by map
  var aircraft: Any by map
  fun aircraftVehicle(builder: MutableVehicle.() -> Unit) { aircraft = MutableVehicle().apply(builder).build() }
  var mealService: String by map
  var estimatedFlightDuration: Any by map
  var flightDistance: Any by map
  fun flightDistanceDistance(builder: MutableDistance.() -> Unit) { flightDistance = MutableDistance().apply(builder).build() }
  var webCheckinTime: java.util.Date by map
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
  fun build() = org.schema.Flight.Builder(map).build()
}
