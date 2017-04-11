package org.schema.kotlin
import org.schema.*
class MutableExerciseAction {
  private val map = HashMap<String,Any>()
  var exerciseCourse: Place by map
  fun exerciseCourse(builder: MutablePlace.() -> Unit) { exerciseCourse = MutablePlace().apply(builder).build() }
  var distance: Distance by map
  fun distance(builder: MutableDistance.() -> Unit) { distance = MutableDistance().apply(builder).build() }
  var fromLocation: Place by map
  fun fromLocation(builder: MutablePlace.() -> Unit) { fromLocation = MutablePlace().apply(builder).build() }
  var opponent: Person by map
  fun opponent(builder: MutablePerson.() -> Unit) { opponent = MutablePerson().apply(builder).build() }
  var sportsActivityLocation: SportsActivityLocation by map
  fun sportsActivityLocation(builder: MutableSportsActivityLocation.() -> Unit) { sportsActivityLocation = MutableSportsActivityLocation().apply(builder).build() }
  var sportsEvent: SportsEvent by map
  fun sportsEvent(builder: MutableSportsEvent.() -> Unit) { sportsEvent = MutableSportsEvent().apply(builder).build() }
  var sportsTeam: SportsTeam by map
  fun sportsTeam(builder: MutableSportsTeam.() -> Unit) { sportsTeam = MutableSportsTeam().apply(builder).build() }
  var toLocation: Place by map
  fun toLocation(builder: MutablePlace.() -> Unit) { toLocation = MutablePlace().apply(builder).build() }
  var audience: Audience by map
  fun audience(builder: MutableAudience.() -> Unit) { audience = MutableAudience().apply(builder).build() }
  var event: Event by map
  fun event(builder: MutableEvent.() -> Unit) { event = MutableEvent().apply(builder).build() }
  var agent: Any by map
  fun agentOrganization(builder: MutableOrganization.() -> Unit) { agent = MutableOrganization().apply(builder).build() }
  fun agentPerson(builder: MutablePerson.() -> Unit) { agent = MutablePerson().apply(builder).build() }
  var endTime: java.util.Date by map
  var startTime: java.util.Date by map
  var actionStatus: ActionStatusType by map
  var error: Thing by map
  fun error(builder: MutableThing.() -> Unit) { error = MutableThing().apply(builder).build() }
  var target: EntryPoint by map
  fun target(builder: MutableEntryPoint.() -> Unit) { target = MutableEntryPoint().apply(builder).build() }
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
  fun build() = org.schema.ExerciseAction.Builder(map).build()
}
