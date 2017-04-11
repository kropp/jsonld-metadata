package org.schema.kotlin
import org.schema.Action

class MutableBusTrip {
  private val map = HashMap<String,Any>()
  var provider: Any by map
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { provider = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { provider = MutablePerson().apply(builder).build() }
  var departureTime: java.util.Date by map
  var arrivalTime: java.util.Date by map
  var busNumber: String by map
  var busName: String by map
  var departureBusStop: Any by map
  fun departureBusStopBusStation(builder: MutableBusStation.() -> Unit) { departureBusStop = MutableBusStation().apply(builder).build() }
  fun departureBusStopBusStop(builder: MutableBusStop.() -> Unit) { departureBusStop = MutableBusStop().apply(builder).build() }
  var arrivalBusStop: Any by map
  fun arrivalBusStopBusStation(builder: MutableBusStation.() -> Unit) { arrivalBusStop = MutableBusStation().apply(builder).build() }
  fun arrivalBusStopBusStop(builder: MutableBusStop.() -> Unit) { arrivalBusStop = MutableBusStop().apply(builder).build() }
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
  fun build() = org.schema.BusTrip.Builder(map).build()
}
