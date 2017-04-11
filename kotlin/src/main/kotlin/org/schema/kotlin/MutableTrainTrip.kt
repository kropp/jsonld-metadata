package org.schema.kotlin
import org.schema.Action
import org.schema.TrainStation

class MutableTrainTrip {
  private val map = HashMap<String,Any>()
  var provider: Any by map
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { provider = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { provider = MutablePerson().apply(builder).build() }
  var departureTime: java.util.Date by map
  var arrivalTime: java.util.Date by map
  var trainNumber: String by map
  var trainName: String by map
  var departureStation: TrainStation by map
  fun departureStation(builder: MutableTrainStation.() -> Unit) { departureStation = MutableTrainStation().apply(builder).build() }
  var arrivalStation: TrainStation by map
  fun arrivalStation(builder: MutableTrainStation.() -> Unit) { arrivalStation = MutableTrainStation().apply(builder).build() }
  var departurePlatform: String by map
  var arrivalPlatform: String by map
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
  fun build() = org.schema.TrainTrip.Builder(map).build()
}
