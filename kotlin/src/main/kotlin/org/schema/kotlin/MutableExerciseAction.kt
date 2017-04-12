package org.schema.kotlin
import org.schema.*
class MutableExerciseAction {
  private val map = HashMap<String,Any>()
  var exerciseCourse: Place
    get() = map["exerciseCourse"] as Place
    set(value) { map["exerciseCourse"] = value }
  fun exerciseCourse(builder: MutablePlace.() -> Unit) { map["exerciseCourse"] = MutablePlace().apply(builder).build() }
  var distance: Distance
    get() = map["distance"] as Distance
    set(value) { map["distance"] = value }
  fun distance(builder: MutableDistance.() -> Unit) { map["distance"] = MutableDistance().apply(builder).build() }
  var fromLocation: Place
    get() = map["fromLocation"] as Place
    set(value) { map["fromLocation"] = value }
  fun fromLocation(builder: MutablePlace.() -> Unit) { map["fromLocation"] = MutablePlace().apply(builder).build() }
  var opponent: Person
    get() = map["opponent"] as Person
    set(value) { map["opponent"] = value }
  fun opponent(builder: MutablePerson.() -> Unit) { map["opponent"] = MutablePerson().apply(builder).build() }
  var sportsActivityLocation: SportsActivityLocation
    get() = map["sportsActivityLocation"] as SportsActivityLocation
    set(value) { map["sportsActivityLocation"] = value }
  fun sportsActivityLocation(builder: MutableSportsActivityLocation.() -> Unit) { map["sportsActivityLocation"] = MutableSportsActivityLocation().apply(builder).build() }
  var sportsEvent: SportsEvent
    get() = map["sportsEvent"] as SportsEvent
    set(value) { map["sportsEvent"] = value }
  fun sportsEvent(builder: MutableSportsEvent.() -> Unit) { map["sportsEvent"] = MutableSportsEvent().apply(builder).build() }
  var sportsTeam: SportsTeam
    get() = map["sportsTeam"] as SportsTeam
    set(value) { map["sportsTeam"] = value }
  fun sportsTeam(builder: MutableSportsTeam.() -> Unit) { map["sportsTeam"] = MutableSportsTeam().apply(builder).build() }
  var toLocation: Place
    get() = map["toLocation"] as Place
    set(value) { map["toLocation"] = value }
  fun toLocation(builder: MutablePlace.() -> Unit) { map["toLocation"] = MutablePlace().apply(builder).build() }
  var audience: Audience
    get() = map["audience"] as Audience
    set(value) { map["audience"] = value }
  fun audience(builder: MutableAudience.() -> Unit) { map["audience"] = MutableAudience().apply(builder).build() }
  var event: Event
    get() = map["event"] as Event
    set(value) { map["event"] = value }
  fun event(builder: MutableEvent.() -> Unit) { map["event"] = MutableEvent().apply(builder).build() }
  var agent: Any
    get() = map["agent"]!!
    set(value) { map["agent"] = value }
  fun agentOrganization(builder: MutableOrganization.() -> Unit) { map["agent"] = MutableOrganization().apply(builder).build() }
  fun agentPerson(builder: MutablePerson.() -> Unit) { map["agent"] = MutablePerson().apply(builder).build() }
  var endTime: java.util.Date
    get() = map["endTime"] as java.util.Date
    set(value) { map["endTime"] = value }
  var startTime: java.util.Date
    get() = map["startTime"] as java.util.Date
    set(value) { map["startTime"] = value }
  var actionStatus: ActionStatusType
    get() = map["actionStatus"] as ActionStatusType
    set(value) { map["actionStatus"] = value }
  var error: Thing
    get() = map["error"] as Thing
    set(value) { map["error"] = value }
  fun error(builder: MutableThing.() -> Unit) { map["error"] = MutableThing().apply(builder).build() }
  var target: EntryPoint
    get() = map["target"] as EntryPoint
    set(value) { map["target"] = value }
  fun target(builder: MutableEntryPoint.() -> Unit) { map["target"] = MutableEntryPoint().apply(builder).build() }
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
  fun build() = org.schema.ExerciseAction.Builder(map).build()
}
