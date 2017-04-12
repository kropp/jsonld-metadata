package org.schema.kotlin
import org.schema.Action
import org.schema.TrainStation

class MutableTrainTrip {
  private val map = HashMap<String,Any>()
  var provider: Any
    get() = map["provider"]!!
    set(value) { map["provider"] = value }
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { map["provider"] = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { map["provider"] = MutablePerson().apply(builder).build() }
  var departureTime: java.util.Date
    get() = map["departureTime"] as java.util.Date
    set(value) { map["departureTime"] = value }
  var arrivalTime: java.util.Date
    get() = map["arrivalTime"] as java.util.Date
    set(value) { map["arrivalTime"] = value }
  var trainNumber: String
    get() = map["trainNumber"] as String
    set(value) { map["trainNumber"] = value }
  var trainName: String
    get() = map["trainName"] as String
    set(value) { map["trainName"] = value }
  var departureStation: TrainStation
    get() = map["departureStation"] as TrainStation
    set(value) { map["departureStation"] = value }
  fun departureStation(builder: MutableTrainStation.() -> Unit) { map["departureStation"] = MutableTrainStation().apply(builder).build() }
  var arrivalStation: TrainStation
    get() = map["arrivalStation"] as TrainStation
    set(value) { map["arrivalStation"] = value }
  fun arrivalStation(builder: MutableTrainStation.() -> Unit) { map["arrivalStation"] = MutableTrainStation().apply(builder).build() }
  var departurePlatform: String
    get() = map["departurePlatform"] as String
    set(value) { map["departurePlatform"] = value }
  var arrivalPlatform: String
    get() = map["arrivalPlatform"] as String
    set(value) { map["arrivalPlatform"] = value }
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
  fun build() = org.schema.TrainTrip.Builder(map).build()
}
