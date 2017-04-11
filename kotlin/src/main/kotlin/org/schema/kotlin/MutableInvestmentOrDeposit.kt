package org.schema.kotlin
import org.schema.*
class MutableInvestmentOrDeposit {
  private val map = HashMap<String,Any>()
  var annualPercentageRate: Any by map
  fun annualPercentageRateQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { annualPercentageRate = MutableQuantitativeValue().apply(builder).build() }
  var feesAndCommissionsSpecification: String by map
  var interestRate: Any by map
  fun interestRateQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { interestRate = MutableQuantitativeValue().apply(builder).build() }
  var aggregateRating: AggregateRating by map
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { aggregateRating = MutableAggregateRating().apply(builder).build() }
  var audience: Audience by map
  fun audience(builder: MutableAudience.() -> Unit) { audience = MutableAudience().apply(builder).build() }
  var availableChannel: ServiceChannel by map
  fun availableChannel(builder: MutableServiceChannel.() -> Unit) { availableChannel = MutableServiceChannel().apply(builder).build() }
  var award: String by map
  var brand: Any by map
  fun brandBrand(builder: MutableBrand.() -> Unit) { brand = MutableBrand().apply(builder).build() }
  fun brandOrganization(builder: MutableOrganization.() -> Unit) { brand = MutableOrganization().apply(builder).build() }
  var category: Any by map
  fun categoryThing(builder: MutableThing.() -> Unit) { category = MutableThing().apply(builder).build() }
  var hoursAvailable: OpeningHoursSpecification by map
  fun hoursAvailable(builder: MutableOpeningHoursSpecification.() -> Unit) { hoursAvailable = MutableOpeningHoursSpecification().apply(builder).build() }
  var isRelatedTo: Any by map
  fun isRelatedToProduct(builder: MutableProduct.() -> Unit) { isRelatedTo = MutableProduct().apply(builder).build() }
  fun isRelatedToService(builder: MutableService.() -> Unit) { isRelatedTo = MutableService().apply(builder).build() }
  var isSimilarTo: Any by map
  fun isSimilarToProduct(builder: MutableProduct.() -> Unit) { isSimilarTo = MutableProduct().apply(builder).build() }
  fun isSimilarToService(builder: MutableService.() -> Unit) { isSimilarTo = MutableService().apply(builder).build() }
  var logo: Any by map
  fun logoImageObject(builder: MutableImageObject.() -> Unit) { logo = MutableImageObject().apply(builder).build() }
  var offers: Offer by map
  fun offers(builder: MutableOffer.() -> Unit) { offers = MutableOffer().apply(builder).build() }
  var serviceOutput: Thing by map
  fun serviceOutput(builder: MutableThing.() -> Unit) { serviceOutput = MutableThing().apply(builder).build() }
  var review: Review by map
  fun review(builder: MutableReview.() -> Unit) { review = MutableReview().apply(builder).build() }
  var serviceType: String by map
  var provider: Any by map
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { provider = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { provider = MutablePerson().apply(builder).build() }
  var providerMobility: String by map
  var broker: Any by map
  fun brokerOrganization(builder: MutableOrganization.() -> Unit) { broker = MutableOrganization().apply(builder).build() }
  fun brokerPerson(builder: MutablePerson.() -> Unit) { broker = MutablePerson().apply(builder).build() }
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
  fun build() = org.schema.InvestmentOrDeposit.Builder(map).build()
}
