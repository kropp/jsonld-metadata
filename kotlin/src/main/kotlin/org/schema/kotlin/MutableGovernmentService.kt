package org.schema.kotlin
import org.schema.*
class MutableGovernmentService {
  private val map = HashMap<String,Any>()
  var serviceOperator: Organization
    get() = map["serviceOperator"] as Organization
    set(value) { map["serviceOperator"] = value }
  fun serviceOperator(builder: MutableOrganization.() -> Unit) { map["serviceOperator"] = MutableOrganization().apply(builder).build() }
  var aggregateRating: AggregateRating
    get() = map["aggregateRating"] as AggregateRating
    set(value) { map["aggregateRating"] = value }
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { map["aggregateRating"] = MutableAggregateRating().apply(builder).build() }
  var audience: Audience
    get() = map["audience"] as Audience
    set(value) { map["audience"] = value }
  fun audience(builder: MutableAudience.() -> Unit) { map["audience"] = MutableAudience().apply(builder).build() }
  var availableChannel: ServiceChannel
    get() = map["availableChannel"] as ServiceChannel
    set(value) { map["availableChannel"] = value }
  fun availableChannel(builder: MutableServiceChannel.() -> Unit) { map["availableChannel"] = MutableServiceChannel().apply(builder).build() }
  var award: String
    get() = map["award"] as String
    set(value) { map["award"] = value }
  var brand: Any
    get() = map["brand"]!!
    set(value) { map["brand"] = value }
  fun brandBrand(builder: MutableBrand.() -> Unit) { map["brand"] = MutableBrand().apply(builder).build() }
  fun brandOrganization(builder: MutableOrganization.() -> Unit) { map["brand"] = MutableOrganization().apply(builder).build() }
  var category: Any
    get() = map["category"]!!
    set(value) { map["category"] = value }
  fun categoryThing(builder: MutableThing.() -> Unit) { map["category"] = MutableThing().apply(builder).build() }
  var hoursAvailable: OpeningHoursSpecification
    get() = map["hoursAvailable"] as OpeningHoursSpecification
    set(value) { map["hoursAvailable"] = value }
  fun hoursAvailable(builder: MutableOpeningHoursSpecification.() -> Unit) { map["hoursAvailable"] = MutableOpeningHoursSpecification().apply(builder).build() }
  var isRelatedTo: Any
    get() = map["isRelatedTo"]!!
    set(value) { map["isRelatedTo"] = value }
  fun isRelatedToProduct(builder: MutableProduct.() -> Unit) { map["isRelatedTo"] = MutableProduct().apply(builder).build() }
  fun isRelatedToService(builder: MutableService.() -> Unit) { map["isRelatedTo"] = MutableService().apply(builder).build() }
  var isSimilarTo: Any
    get() = map["isSimilarTo"]!!
    set(value) { map["isSimilarTo"] = value }
  fun isSimilarToProduct(builder: MutableProduct.() -> Unit) { map["isSimilarTo"] = MutableProduct().apply(builder).build() }
  fun isSimilarToService(builder: MutableService.() -> Unit) { map["isSimilarTo"] = MutableService().apply(builder).build() }
  var logo: Any
    get() = map["logo"]!!
    set(value) { map["logo"] = value }
  fun logoImageObject(builder: MutableImageObject.() -> Unit) { map["logo"] = MutableImageObject().apply(builder).build() }
  var offers: Offer
    get() = map["offers"] as Offer
    set(value) { map["offers"] = value }
  fun offers(builder: MutableOffer.() -> Unit) { map["offers"] = MutableOffer().apply(builder).build() }
  var serviceOutput: Thing
    get() = map["serviceOutput"] as Thing
    set(value) { map["serviceOutput"] = value }
  fun serviceOutput(builder: MutableThing.() -> Unit) { map["serviceOutput"] = MutableThing().apply(builder).build() }
  var review: Review
    get() = map["review"] as Review
    set(value) { map["review"] = value }
  fun review(builder: MutableReview.() -> Unit) { map["review"] = MutableReview().apply(builder).build() }
  var serviceType: String
    get() = map["serviceType"] as String
    set(value) { map["serviceType"] = value }
  var provider: Any
    get() = map["provider"]!!
    set(value) { map["provider"] = value }
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { map["provider"] = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { map["provider"] = MutablePerson().apply(builder).build() }
  var providerMobility: String
    get() = map["providerMobility"] as String
    set(value) { map["providerMobility"] = value }
  var broker: Any
    get() = map["broker"]!!
    set(value) { map["broker"] = value }
  fun brokerOrganization(builder: MutableOrganization.() -> Unit) { map["broker"] = MutableOrganization().apply(builder).build() }
  fun brokerPerson(builder: MutablePerson.() -> Unit) { map["broker"] = MutablePerson().apply(builder).build() }
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
  fun build() = org.schema.GovernmentService.Builder(map).build()
}
