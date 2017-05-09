package org.schema.kotlin
import org.schema.*
class MutableExhibitionEvent {
  private val map = HashMap<String,Any>()
  var about: Thing
    get() = map["about"] as Thing
    set(value) { map["about"] = value }
  fun about(builder: MutableThing.() -> Unit) { map["about"] = MutableThing().apply(builder).build() }
  var actor: Person
    get() = map["actor"] as Person
    set(value) { map["actor"] = value }
  fun actor(builder: MutablePerson.() -> Unit) { map["actor"] = MutablePerson().apply(builder).build() }
  var aggregateRating: AggregateRating
    get() = map["aggregateRating"] as AggregateRating
    set(value) { map["aggregateRating"] = value }
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { map["aggregateRating"] = MutableAggregateRating().apply(builder).build() }
  var organizer: Any
    get() = map["organizer"]!!
    set(value) { map["organizer"] = value }
  fun organizerOrganization(builder: MutableOrganization.() -> Unit) { map["organizer"] = MutableOrganization().apply(builder).build() }
  fun organizerPerson(builder: MutablePerson.() -> Unit) { map["organizer"] = MutablePerson().apply(builder).build() }
  var attendee: Any
    get() = map["attendee"]!!
    set(value) { map["attendee"] = value }
  fun attendeeOrganization(builder: MutableOrganization.() -> Unit) { map["attendee"] = MutableOrganization().apply(builder).build() }
  fun attendeePerson(builder: MutablePerson.() -> Unit) { map["attendee"] = MutablePerson().apply(builder).build() }
  var audience: Audience
    get() = map["audience"] as Audience
    set(value) { map["audience"] = value }
  fun audience(builder: MutableAudience.() -> Unit) { map["audience"] = MutableAudience().apply(builder).build() }
  var contributor: Any
    get() = map["contributor"]!!
    set(value) { map["contributor"] = value }
  fun contributorOrganization(builder: MutableOrganization.() -> Unit) { map["contributor"] = MutableOrganization().apply(builder).build() }
  fun contributorPerson(builder: MutablePerson.() -> Unit) { map["contributor"] = MutablePerson().apply(builder).build() }
  var director: Person
    get() = map["director"] as Person
    set(value) { map["director"] = value }
  fun director(builder: MutablePerson.() -> Unit) { map["director"] = MutablePerson().apply(builder).build() }
  var doorTime: java.util.Date
    get() = map["doorTime"] as java.util.Date
    set(value) { map["doorTime"] = value }
  var endDate: java.util.Date
    get() = map["endDate"] as java.util.Date
    set(value) { map["endDate"] = value }
  var eventStatus: EventStatusType
    get() = map["eventStatus"] as EventStatusType
    set(value) { map["eventStatus"] = value }
  var isAccessibleForFree: Boolean
    get() = map["isAccessibleForFree"] as Boolean
    set(value) { map["isAccessibleForFree"] = value }
  var inLanguage: Any
    get() = map["inLanguage"]!!
    set(value) { map["inLanguage"] = value }
  fun inLanguageLanguage(builder: MutableLanguage.() -> Unit) { map["inLanguage"] = MutableLanguage().apply(builder).build() }
  var maximumAttendeeCapacity: Int
    get() = map["maximumAttendeeCapacity"] as Int
    set(value) { map["maximumAttendeeCapacity"] = value }
  var remainingAttendeeCapacity: Int
    get() = map["remainingAttendeeCapacity"] as Int
    set(value) { map["remainingAttendeeCapacity"] = value }
  var offers: Offer
    get() = map["offers"] as Offer
    set(value) { map["offers"] = value }
  fun offers(builder: MutableOffer.() -> Unit) { map["offers"] = MutableOffer().apply(builder).build() }
  var performer: Any
    get() = map["performer"]!!
    set(value) { map["performer"] = value }
  fun performerOrganization(builder: MutableOrganization.() -> Unit) { map["performer"] = MutableOrganization().apply(builder).build() }
  fun performerPerson(builder: MutablePerson.() -> Unit) { map["performer"] = MutablePerson().apply(builder).build() }
  var previousStartDate: java.util.Date
    get() = map["previousStartDate"] as java.util.Date
    set(value) { map["previousStartDate"] = value }
  var recordedIn: CreativeWork
    get() = map["recordedIn"] as CreativeWork
    set(value) { map["recordedIn"] = value }
  fun recordedIn(builder: MutableCreativeWork.() -> Unit) { map["recordedIn"] = MutableCreativeWork().apply(builder).build() }
  var review: Review
    get() = map["review"] as Review
    set(value) { map["review"] = value }
  fun review(builder: MutableReview.() -> Unit) { map["review"] = MutableReview().apply(builder).build() }
  var funder: Any
    get() = map["funder"]!!
    set(value) { map["funder"] = value }
  fun funderOrganization(builder: MutableOrganization.() -> Unit) { map["funder"] = MutableOrganization().apply(builder).build() }
  fun funderPerson(builder: MutablePerson.() -> Unit) { map["funder"] = MutablePerson().apply(builder).build() }
  var startDate: java.util.Date
    get() = map["startDate"] as java.util.Date
    set(value) { map["startDate"] = value }
  var subEvent: Event
    get() = map["subEvent"] as Event
    set(value) { map["subEvent"] = value }
  fun subEvent(builder: MutableEvent.() -> Unit) { map["subEvent"] = MutableEvent().apply(builder).build() }
  var superEvent: Event
    get() = map["superEvent"] as Event
    set(value) { map["superEvent"] = value }
  fun superEvent(builder: MutableEvent.() -> Unit) { map["superEvent"] = MutableEvent().apply(builder).build() }
  var typicalAgeRange: String
    get() = map["typicalAgeRange"] as String
    set(value) { map["typicalAgeRange"] = value }
  var workPerformed: CreativeWork
    get() = map["workPerformed"] as CreativeWork
    set(value) { map["workPerformed"] = value }
  fun workPerformed(builder: MutableCreativeWork.() -> Unit) { map["workPerformed"] = MutableCreativeWork().apply(builder).build() }
  var workFeatured: WorkFeatured
    get() = map["workFeatured"] as WorkFeatured
    set(value) { map["workFeatured"] = value }
  var translator: Any
    get() = map["translator"]!!
    set(value) { map["translator"] = value }
  fun translatorOrganization(builder: MutableOrganization.() -> Unit) { map["translator"] = MutableOrganization().apply(builder).build() }
  fun translatorPerson(builder: MutablePerson.() -> Unit) { map["translator"] = MutablePerson().apply(builder).build() }
  var composer: Any
    get() = map["composer"]!!
    set(value) { map["composer"] = value }
  fun composerOrganization(builder: MutableOrganization.() -> Unit) { map["composer"] = MutableOrganization().apply(builder).build() }
  fun composerPerson(builder: MutablePerson.() -> Unit) { map["composer"] = MutablePerson().apply(builder).build() }
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
  fun build() = org.schema.ExhibitionEvent.Builder(map).build()
}
