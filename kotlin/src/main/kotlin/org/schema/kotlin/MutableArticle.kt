package org.schema.kotlin
import org.schema.*
class MutableArticle {
  private val map = HashMap<String,Any>()
  var articleBody: String by map
  var articleSection: String by map
  var wordCount: Int by map
  var pageEnd: Any by map
  var pageStart: Any by map
  var pagination: String by map
  var schemaVersion: String by map
  var about: Thing by map
  fun about(builder: MutableThing.() -> Unit) { about = MutableThing().apply(builder).build() }
  var accessibilityAPI: String by map
  var accessibilityControl: String by map
  var accessibilityFeature: String by map
  var accessibilityHazard: String by map
  var accountablePerson: Person by map
  fun accountablePerson(builder: MutablePerson.() -> Unit) { accountablePerson = MutablePerson().apply(builder).build() }
  var aggregateRating: AggregateRating by map
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { aggregateRating = MutableAggregateRating().apply(builder).build() }
  var alternativeHeadline: String by map
  var associatedMedia: MediaObject by map
  fun associatedMedia(builder: MutableMediaObject.() -> Unit) { associatedMedia = MutableMediaObject().apply(builder).build() }
  var audience: Audience by map
  fun audience(builder: MutableAudience.() -> Unit) { audience = MutableAudience().apply(builder).build() }
  var audio: AudioObject by map
  fun audio(builder: MutableAudioObject.() -> Unit) { audio = MutableAudioObject().apply(builder).build() }
  var author: Any by map
  fun authorOrganization(builder: MutableOrganization.() -> Unit) { author = MutableOrganization().apply(builder).build() }
  fun authorPerson(builder: MutablePerson.() -> Unit) { author = MutablePerson().apply(builder).build() }
  var award: String by map
  var citation: Any by map
  fun citationCreativeWork(builder: MutableCreativeWork.() -> Unit) { citation = MutableCreativeWork().apply(builder).build() }
  var comment: Comment by map
  fun comment(builder: MutableComment.() -> Unit) { comment = MutableComment().apply(builder).build() }
  var locationCreated: Place by map
  fun locationCreated(builder: MutablePlace.() -> Unit) { locationCreated = MutablePlace().apply(builder).build() }
  var contentRating: String by map
  var contributor: Any by map
  fun contributorOrganization(builder: MutableOrganization.() -> Unit) { contributor = MutableOrganization().apply(builder).build() }
  fun contributorPerson(builder: MutablePerson.() -> Unit) { contributor = MutablePerson().apply(builder).build() }
  var copyrightHolder: Any by map
  fun copyrightHolderOrganization(builder: MutableOrganization.() -> Unit) { copyrightHolder = MutableOrganization().apply(builder).build() }
  fun copyrightHolderPerson(builder: MutablePerson.() -> Unit) { copyrightHolder = MutablePerson().apply(builder).build() }
  var copyrightYear: Any by map
  var creator: Any by map
  fun creatorOrganization(builder: MutableOrganization.() -> Unit) { creator = MutableOrganization().apply(builder).build() }
  fun creatorPerson(builder: MutablePerson.() -> Unit) { creator = MutablePerson().apply(builder).build() }
  var dateCreated: java.util.Date by map
  var dateModified: java.util.Date by map
  var datePublished: java.util.Date by map
  var discussionUrl: String by map
  var editor: Person by map
  fun editor(builder: MutablePerson.() -> Unit) { editor = MutablePerson().apply(builder).build() }
  var educationalAlignment: AlignmentObject by map
  fun educationalAlignment(builder: MutableAlignmentObject.() -> Unit) { educationalAlignment = MutableAlignmentObject().apply(builder).build() }
  var educationalUse: String by map
  var encoding: MediaObject by map
  fun encoding(builder: MutableMediaObject.() -> Unit) { encoding = MutableMediaObject().apply(builder).build() }
  var fileFormat: String by map
  var isAccessibleForFree: Boolean by map
  var genre: String by map
  var headline: String by map
  var inLanguage: Any by map
  fun inLanguageLanguage(builder: MutableLanguage.() -> Unit) { inLanguage = MutableLanguage().apply(builder).build() }
  var interactivityType: String by map
  var isBasedOn: Any by map
  fun isBasedOnCreativeWork(builder: MutableCreativeWork.() -> Unit) { isBasedOn = MutableCreativeWork().apply(builder).build() }
  fun isBasedOnProduct(builder: MutableProduct.() -> Unit) { isBasedOn = MutableProduct().apply(builder).build() }
  var isFamilyFriendly: Boolean by map
  var keywords: String by map
  var license: Any by map
  fun licenseCreativeWork(builder: MutableCreativeWork.() -> Unit) { license = MutableCreativeWork().apply(builder).build() }
  var learningResourceType: String by map
  var mainEntity: Thing by map
  fun mainEntity(builder: MutableThing.() -> Unit) { mainEntity = MutableThing().apply(builder).build() }
  var mentions: Thing by map
  fun mentions(builder: MutableThing.() -> Unit) { mentions = MutableThing().apply(builder).build() }
  var offers: Offer by map
  fun offers(builder: MutableOffer.() -> Unit) { offers = MutableOffer().apply(builder).build() }
  var producer: Any by map
  fun producerOrganization(builder: MutableOrganization.() -> Unit) { producer = MutableOrganization().apply(builder).build() }
  fun producerPerson(builder: MutablePerson.() -> Unit) { producer = MutablePerson().apply(builder).build() }
  var publication: PublicationEvent by map
  fun publication(builder: MutablePublicationEvent.() -> Unit) { publication = MutablePublicationEvent().apply(builder).build() }
  var publisher: Any by map
  fun publisherOrganization(builder: MutableOrganization.() -> Unit) { publisher = MutableOrganization().apply(builder).build() }
  fun publisherPerson(builder: MutablePerson.() -> Unit) { publisher = MutablePerson().apply(builder).build() }
  var publishingPrinciples: String by map
  var recordedAt: Event by map
  fun recordedAt(builder: MutableEvent.() -> Unit) { recordedAt = MutableEvent().apply(builder).build() }
  var review: Review by map
  fun review(builder: MutableReview.() -> Unit) { review = MutableReview().apply(builder).build() }
  var sourceOrganization: Organization by map
  fun sourceOrganization(builder: MutableOrganization.() -> Unit) { sourceOrganization = MutableOrganization().apply(builder).build() }
  var spatialCoverage: Place by map
  fun spatialCoverage(builder: MutablePlace.() -> Unit) { spatialCoverage = MutablePlace().apply(builder).build() }
  var funder: Any by map
  fun funderOrganization(builder: MutableOrganization.() -> Unit) { funder = MutableOrganization().apply(builder).build() }
  fun funderPerson(builder: MutablePerson.() -> Unit) { funder = MutablePerson().apply(builder).build() }
  var temporalCoverage: Any by map
  var text: String by map
  var thumbnailUrl: String by map
  var timeRequired: Duration by map
  var typicalAgeRange: String by map
  var version: Any by map
  var video: VideoObject by map
  fun video(builder: MutableVideoObject.() -> Unit) { video = MutableVideoObject().apply(builder).build() }
  var provider: Any by map
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { provider = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { provider = MutablePerson().apply(builder).build() }
  var commentCount: Int by map
  var hasPart: HasPart by map
  var workExample: CreativeWork by map
  fun workExample(builder: MutableCreativeWork.() -> Unit) { workExample = MutableCreativeWork().apply(builder).build() }
  var exampleOfWork: CreativeWork by map
  fun exampleOfWork(builder: MutableCreativeWork.() -> Unit) { exampleOfWork = MutableCreativeWork().apply(builder).build() }
  var character: Person by map
  fun character(builder: MutablePerson.() -> Unit) { character = MutablePerson().apply(builder).build() }
  var translator: Any by map
  fun translatorOrganization(builder: MutableOrganization.() -> Unit) { translator = MutableOrganization().apply(builder).build() }
  fun translatorPerson(builder: MutablePerson.() -> Unit) { translator = MutablePerson().apply(builder).build() }
  var releasedEvent: PublicationEvent by map
  fun releasedEvent(builder: MutablePublicationEvent.() -> Unit) { releasedEvent = MutablePublicationEvent().apply(builder).build() }
  var interactionStatistic: InteractionCounter by map
  fun interactionStatistic(builder: MutableInteractionCounter.() -> Unit) { interactionStatistic = MutableInteractionCounter().apply(builder).build() }
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
  fun build() = org.schema.Article.Builder(map).build()
}
