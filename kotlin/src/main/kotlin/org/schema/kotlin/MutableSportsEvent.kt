package org.schema.kotlin
import org.schema.*
class MutableSportsEvent {
  private val map = HashMap<String,Any>()
  var homeTeam: Competitor by map
  var awayTeam: Competitor by map
  var competitor: Competitor by map
  var about: Thing by map
  fun about(builder: MutableThing.() -> Unit) { about = MutableThing().apply(builder).build() }
  var actor: Person by map
  fun actor(builder: MutablePerson.() -> Unit) { actor = MutablePerson().apply(builder).build() }
  var aggregateRating: AggregateRating by map
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { aggregateRating = MutableAggregateRating().apply(builder).build() }
  var organizer: Any by map
  fun organizerOrganization(builder: MutableOrganization.() -> Unit) { organizer = MutableOrganization().apply(builder).build() }
  fun organizerPerson(builder: MutablePerson.() -> Unit) { organizer = MutablePerson().apply(builder).build() }
  var attendee: Any by map
  fun attendeeOrganization(builder: MutableOrganization.() -> Unit) { attendee = MutableOrganization().apply(builder).build() }
  fun attendeePerson(builder: MutablePerson.() -> Unit) { attendee = MutablePerson().apply(builder).build() }
  var contributor: Any by map
  fun contributorOrganization(builder: MutableOrganization.() -> Unit) { contributor = MutableOrganization().apply(builder).build() }
  fun contributorPerson(builder: MutablePerson.() -> Unit) { contributor = MutablePerson().apply(builder).build() }
  var director: Person by map
  fun director(builder: MutablePerson.() -> Unit) { director = MutablePerson().apply(builder).build() }
  var doorTime: java.util.Date by map
  var endDate: java.util.Date by map
  var eventStatus: EventStatusType by map
  var isAccessibleForFree: Boolean by map
  var inLanguage: Any by map
  fun inLanguageLanguage(builder: MutableLanguage.() -> Unit) { inLanguage = MutableLanguage().apply(builder).build() }
  var maximumAttendeeCapacity: Int by map
  var remainingAttendeeCapacity: Int by map
  var offers: Offer by map
  fun offers(builder: MutableOffer.() -> Unit) { offers = MutableOffer().apply(builder).build() }
  var performer: Any by map
  fun performerOrganization(builder: MutableOrganization.() -> Unit) { performer = MutableOrganization().apply(builder).build() }
  fun performerPerson(builder: MutablePerson.() -> Unit) { performer = MutablePerson().apply(builder).build() }
  var previousStartDate: java.util.Date by map
  var recordedIn: CreativeWork by map
  fun recordedIn(builder: MutableCreativeWork.() -> Unit) { recordedIn = MutableCreativeWork().apply(builder).build() }
  var review: Review by map
  fun review(builder: MutableReview.() -> Unit) { review = MutableReview().apply(builder).build() }
  var funder: Any by map
  fun funderOrganization(builder: MutableOrganization.() -> Unit) { funder = MutableOrganization().apply(builder).build() }
  fun funderPerson(builder: MutablePerson.() -> Unit) { funder = MutablePerson().apply(builder).build() }
  var startDate: java.util.Date by map
  var subEvent: Event by map
  fun subEvent(builder: MutableEvent.() -> Unit) { subEvent = MutableEvent().apply(builder).build() }
  var superEvent: Event by map
  fun superEvent(builder: MutableEvent.() -> Unit) { superEvent = MutableEvent().apply(builder).build() }
  var typicalAgeRange: String by map
  var workPerformed: CreativeWork by map
  fun workPerformed(builder: MutableCreativeWork.() -> Unit) { workPerformed = MutableCreativeWork().apply(builder).build() }
  var workFeatured: WorkFeatured by map
  var translator: Any by map
  fun translatorOrganization(builder: MutableOrganization.() -> Unit) { translator = MutableOrganization().apply(builder).build() }
  fun translatorPerson(builder: MutablePerson.() -> Unit) { translator = MutablePerson().apply(builder).build() }
  var composer: Any by map
  fun composerOrganization(builder: MutableOrganization.() -> Unit) { composer = MutableOrganization().apply(builder).build() }
  fun composerPerson(builder: MutablePerson.() -> Unit) { composer = MutablePerson().apply(builder).build() }
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
  fun build() = org.schema.SportsEvent.Builder(map).build()
}
