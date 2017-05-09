package org.schema.kotlin
import org.schema.*
class MutableMenu {
  private val map = HashMap<String,Any>()
  var hasMenuItem: MenuItem
    get() = map["hasMenuItem"] as MenuItem
    set(value) { map["hasMenuItem"] = value }
  fun hasMenuItem(builder: MutableMenuItem.() -> Unit) { map["hasMenuItem"] = MutableMenuItem().apply(builder).build() }
  var hasMenuSection: MenuSection
    get() = map["hasMenuSection"] as MenuSection
    set(value) { map["hasMenuSection"] = value }
  fun hasMenuSection(builder: MutableMenuSection.() -> Unit) { map["hasMenuSection"] = MutableMenuSection().apply(builder).build() }
  var schemaVersion: String
    get() = map["schemaVersion"] as String
    set(value) { map["schemaVersion"] = value }
  var about: Thing
    get() = map["about"] as Thing
    set(value) { map["about"] = value }
  fun about(builder: MutableThing.() -> Unit) { map["about"] = MutableThing().apply(builder).build() }
  var accessibilityAPI: String
    get() = map["accessibilityAPI"] as String
    set(value) { map["accessibilityAPI"] = value }
  var accessibilityControl: String
    get() = map["accessibilityControl"] as String
    set(value) { map["accessibilityControl"] = value }
  var accessibilityFeature: String
    get() = map["accessibilityFeature"] as String
    set(value) { map["accessibilityFeature"] = value }
  var accessibilityHazard: String
    get() = map["accessibilityHazard"] as String
    set(value) { map["accessibilityHazard"] = value }
  var accountablePerson: Person
    get() = map["accountablePerson"] as Person
    set(value) { map["accountablePerson"] = value }
  fun accountablePerson(builder: MutablePerson.() -> Unit) { map["accountablePerson"] = MutablePerson().apply(builder).build() }
  var aggregateRating: AggregateRating
    get() = map["aggregateRating"] as AggregateRating
    set(value) { map["aggregateRating"] = value }
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { map["aggregateRating"] = MutableAggregateRating().apply(builder).build() }
  var alternativeHeadline: String
    get() = map["alternativeHeadline"] as String
    set(value) { map["alternativeHeadline"] = value }
  var associatedMedia: MediaObject
    get() = map["associatedMedia"] as MediaObject
    set(value) { map["associatedMedia"] = value }
  fun associatedMedia(builder: MutableMediaObject.() -> Unit) { map["associatedMedia"] = MutableMediaObject().apply(builder).build() }
  var audience: Audience
    get() = map["audience"] as Audience
    set(value) { map["audience"] = value }
  fun audience(builder: MutableAudience.() -> Unit) { map["audience"] = MutableAudience().apply(builder).build() }
  var audio: AudioObject
    get() = map["audio"] as AudioObject
    set(value) { map["audio"] = value }
  fun audio(builder: MutableAudioObject.() -> Unit) { map["audio"] = MutableAudioObject().apply(builder).build() }
  var author: Any
    get() = map["author"]!!
    set(value) { map["author"] = value }
  fun authorOrganization(builder: MutableOrganization.() -> Unit) { map["author"] = MutableOrganization().apply(builder).build() }
  fun authorPerson(builder: MutablePerson.() -> Unit) { map["author"] = MutablePerson().apply(builder).build() }
  var award: String
    get() = map["award"] as String
    set(value) { map["award"] = value }
  var citation: Any
    get() = map["citation"]!!
    set(value) { map["citation"] = value }
  fun citationCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["citation"] = MutableCreativeWork().apply(builder).build() }
  var comment: Comment
    get() = map["comment"] as Comment
    set(value) { map["comment"] = value }
  fun comment(builder: MutableComment.() -> Unit) { map["comment"] = MutableComment().apply(builder).build() }
  var locationCreated: Place
    get() = map["locationCreated"] as Place
    set(value) { map["locationCreated"] = value }
  fun locationCreated(builder: MutablePlace.() -> Unit) { map["locationCreated"] = MutablePlace().apply(builder).build() }
  var contentRating: String
    get() = map["contentRating"] as String
    set(value) { map["contentRating"] = value }
  var contributor: Any
    get() = map["contributor"]!!
    set(value) { map["contributor"] = value }
  fun contributorOrganization(builder: MutableOrganization.() -> Unit) { map["contributor"] = MutableOrganization().apply(builder).build() }
  fun contributorPerson(builder: MutablePerson.() -> Unit) { map["contributor"] = MutablePerson().apply(builder).build() }
  var copyrightHolder: Any
    get() = map["copyrightHolder"]!!
    set(value) { map["copyrightHolder"] = value }
  fun copyrightHolderOrganization(builder: MutableOrganization.() -> Unit) { map["copyrightHolder"] = MutableOrganization().apply(builder).build() }
  fun copyrightHolderPerson(builder: MutablePerson.() -> Unit) { map["copyrightHolder"] = MutablePerson().apply(builder).build() }
  var copyrightYear: Any
    get() = map["copyrightYear"]!!
    set(value) { map["copyrightYear"] = value }
  var creator: Any
    get() = map["creator"]!!
    set(value) { map["creator"] = value }
  fun creatorOrganization(builder: MutableOrganization.() -> Unit) { map["creator"] = MutableOrganization().apply(builder).build() }
  fun creatorPerson(builder: MutablePerson.() -> Unit) { map["creator"] = MutablePerson().apply(builder).build() }
  var dateCreated: java.util.Date
    get() = map["dateCreated"] as java.util.Date
    set(value) { map["dateCreated"] = value }
  var dateModified: java.util.Date
    get() = map["dateModified"] as java.util.Date
    set(value) { map["dateModified"] = value }
  var datePublished: java.util.Date
    get() = map["datePublished"] as java.util.Date
    set(value) { map["datePublished"] = value }
  var discussionUrl: String
    get() = map["discussionUrl"] as String
    set(value) { map["discussionUrl"] = value }
  var editor: Person
    get() = map["editor"] as Person
    set(value) { map["editor"] = value }
  fun editor(builder: MutablePerson.() -> Unit) { map["editor"] = MutablePerson().apply(builder).build() }
  var educationalAlignment: AlignmentObject
    get() = map["educationalAlignment"] as AlignmentObject
    set(value) { map["educationalAlignment"] = value }
  fun educationalAlignment(builder: MutableAlignmentObject.() -> Unit) { map["educationalAlignment"] = MutableAlignmentObject().apply(builder).build() }
  var educationalUse: String
    get() = map["educationalUse"] as String
    set(value) { map["educationalUse"] = value }
  var encoding: MediaObject
    get() = map["encoding"] as MediaObject
    set(value) { map["encoding"] = value }
  fun encoding(builder: MutableMediaObject.() -> Unit) { map["encoding"] = MutableMediaObject().apply(builder).build() }
  var fileFormat: String
    get() = map["fileFormat"] as String
    set(value) { map["fileFormat"] = value }
  var isAccessibleForFree: Boolean
    get() = map["isAccessibleForFree"] as Boolean
    set(value) { map["isAccessibleForFree"] = value }
  var genre: String
    get() = map["genre"] as String
    set(value) { map["genre"] = value }
  var headline: String
    get() = map["headline"] as String
    set(value) { map["headline"] = value }
  var inLanguage: Any
    get() = map["inLanguage"]!!
    set(value) { map["inLanguage"] = value }
  fun inLanguageLanguage(builder: MutableLanguage.() -> Unit) { map["inLanguage"] = MutableLanguage().apply(builder).build() }
  var interactivityType: String
    get() = map["interactivityType"] as String
    set(value) { map["interactivityType"] = value }
  var isBasedOn: Any
    get() = map["isBasedOn"]!!
    set(value) { map["isBasedOn"] = value }
  fun isBasedOnCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["isBasedOn"] = MutableCreativeWork().apply(builder).build() }
  fun isBasedOnProduct(builder: MutableProduct.() -> Unit) { map["isBasedOn"] = MutableProduct().apply(builder).build() }
  var isFamilyFriendly: Boolean
    get() = map["isFamilyFriendly"] as Boolean
    set(value) { map["isFamilyFriendly"] = value }
  var keywords: String
    get() = map["keywords"] as String
    set(value) { map["keywords"] = value }
  var license: Any
    get() = map["license"]!!
    set(value) { map["license"] = value }
  fun licenseCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["license"] = MutableCreativeWork().apply(builder).build() }
  var learningResourceType: String
    get() = map["learningResourceType"] as String
    set(value) { map["learningResourceType"] = value }
  var mainEntity: Thing
    get() = map["mainEntity"] as Thing
    set(value) { map["mainEntity"] = value }
  fun mainEntity(builder: MutableThing.() -> Unit) { map["mainEntity"] = MutableThing().apply(builder).build() }
  var mentions: Thing
    get() = map["mentions"] as Thing
    set(value) { map["mentions"] = value }
  fun mentions(builder: MutableThing.() -> Unit) { map["mentions"] = MutableThing().apply(builder).build() }
  var offers: Offer
    get() = map["offers"] as Offer
    set(value) { map["offers"] = value }
  fun offers(builder: MutableOffer.() -> Unit) { map["offers"] = MutableOffer().apply(builder).build() }
  var producer: Any
    get() = map["producer"]!!
    set(value) { map["producer"] = value }
  fun producerOrganization(builder: MutableOrganization.() -> Unit) { map["producer"] = MutableOrganization().apply(builder).build() }
  fun producerPerson(builder: MutablePerson.() -> Unit) { map["producer"] = MutablePerson().apply(builder).build() }
  var publication: PublicationEvent
    get() = map["publication"] as PublicationEvent
    set(value) { map["publication"] = value }
  fun publication(builder: MutablePublicationEvent.() -> Unit) { map["publication"] = MutablePublicationEvent().apply(builder).build() }
  var publisher: Any
    get() = map["publisher"]!!
    set(value) { map["publisher"] = value }
  fun publisherOrganization(builder: MutableOrganization.() -> Unit) { map["publisher"] = MutableOrganization().apply(builder).build() }
  fun publisherPerson(builder: MutablePerson.() -> Unit) { map["publisher"] = MutablePerson().apply(builder).build() }
  var publishingPrinciples: String
    get() = map["publishingPrinciples"] as String
    set(value) { map["publishingPrinciples"] = value }
  var recordedAt: Event
    get() = map["recordedAt"] as Event
    set(value) { map["recordedAt"] = value }
  fun recordedAt(builder: MutableEvent.() -> Unit) { map["recordedAt"] = MutableEvent().apply(builder).build() }
  var review: Review
    get() = map["review"] as Review
    set(value) { map["review"] = value }
  fun review(builder: MutableReview.() -> Unit) { map["review"] = MutableReview().apply(builder).build() }
  var sourceOrganization: Organization
    get() = map["sourceOrganization"] as Organization
    set(value) { map["sourceOrganization"] = value }
  fun sourceOrganization(builder: MutableOrganization.() -> Unit) { map["sourceOrganization"] = MutableOrganization().apply(builder).build() }
  var spatialCoverage: Place
    get() = map["spatialCoverage"] as Place
    set(value) { map["spatialCoverage"] = value }
  fun spatialCoverage(builder: MutablePlace.() -> Unit) { map["spatialCoverage"] = MutablePlace().apply(builder).build() }
  var funder: Any
    get() = map["funder"]!!
    set(value) { map["funder"] = value }
  fun funderOrganization(builder: MutableOrganization.() -> Unit) { map["funder"] = MutableOrganization().apply(builder).build() }
  fun funderPerson(builder: MutablePerson.() -> Unit) { map["funder"] = MutablePerson().apply(builder).build() }
  var temporalCoverage: Any
    get() = map["temporalCoverage"]!!
    set(value) { map["temporalCoverage"] = value }
  var text: String
    get() = map["text"] as String
    set(value) { map["text"] = value }
  var thumbnailUrl: String
    get() = map["thumbnailUrl"] as String
    set(value) { map["thumbnailUrl"] = value }
  var timeRequired: Duration
    get() = map["timeRequired"] as Duration
    set(value) { map["timeRequired"] = value }
  var typicalAgeRange: String
    get() = map["typicalAgeRange"] as String
    set(value) { map["typicalAgeRange"] = value }
  var version: Any
    get() = map["version"]!!
    set(value) { map["version"] = value }
  var video: VideoObject
    get() = map["video"] as VideoObject
    set(value) { map["video"] = value }
  fun video(builder: MutableVideoObject.() -> Unit) { map["video"] = MutableVideoObject().apply(builder).build() }
  var provider: Any
    get() = map["provider"]!!
    set(value) { map["provider"] = value }
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { map["provider"] = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { map["provider"] = MutablePerson().apply(builder).build() }
  var commentCount: Int
    get() = map["commentCount"] as Int
    set(value) { map["commentCount"] = value }
  var hasPart: HasPart
    get() = map["hasPart"] as HasPart
    set(value) { map["hasPart"] = value }
  var workExample: CreativeWork
    get() = map["workExample"] as CreativeWork
    set(value) { map["workExample"] = value }
  fun workExample(builder: MutableCreativeWork.() -> Unit) { map["workExample"] = MutableCreativeWork().apply(builder).build() }
  var exampleOfWork: CreativeWork
    get() = map["exampleOfWork"] as CreativeWork
    set(value) { map["exampleOfWork"] = value }
  fun exampleOfWork(builder: MutableCreativeWork.() -> Unit) { map["exampleOfWork"] = MutableCreativeWork().apply(builder).build() }
  var character: Person
    get() = map["character"] as Person
    set(value) { map["character"] = value }
  fun character(builder: MutablePerson.() -> Unit) { map["character"] = MutablePerson().apply(builder).build() }
  var translator: Any
    get() = map["translator"]!!
    set(value) { map["translator"] = value }
  fun translatorOrganization(builder: MutableOrganization.() -> Unit) { map["translator"] = MutableOrganization().apply(builder).build() }
  fun translatorPerson(builder: MutablePerson.() -> Unit) { map["translator"] = MutablePerson().apply(builder).build() }
  var releasedEvent: PublicationEvent
    get() = map["releasedEvent"] as PublicationEvent
    set(value) { map["releasedEvent"] = value }
  fun releasedEvent(builder: MutablePublicationEvent.() -> Unit) { map["releasedEvent"] = MutablePublicationEvent().apply(builder).build() }
  var interactionStatistic: InteractionCounter
    get() = map["interactionStatistic"] as InteractionCounter
    set(value) { map["interactionStatistic"] = value }
  fun interactionStatistic(builder: MutableInteractionCounter.() -> Unit) { map["interactionStatistic"] = MutableInteractionCounter().apply(builder).build() }
  var accessMode: String
    get() = map["accessMode"] as String
    set(value) { map["accessMode"] = value }
  var accessModeSufficient: String
    get() = map["accessModeSufficient"] as String
    set(value) { map["accessModeSufficient"] = value }
  var accessibilitySummary: String
    get() = map["accessibilitySummary"] as String
    set(value) { map["accessibilitySummary"] = value }
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
  fun build() = org.schema.Menu.Builder(map).build()
}
