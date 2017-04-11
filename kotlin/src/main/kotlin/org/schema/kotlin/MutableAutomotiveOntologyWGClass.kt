package org.schema.kotlin
import org.schema.*
class MutableAutomotiveOntologyWGClass {
  private val map = HashMap<String,Any>()
  var hasOfferCatalog: OfferCatalog by map
  fun hasOfferCatalog(builder: MutableOfferCatalog.() -> Unit) { hasOfferCatalog = MutableOfferCatalog().apply(builder).build() }
  var address: Any by map
  fun addressPostalAddress(builder: MutablePostalAddress.() -> Unit) { address = MutablePostalAddress().apply(builder).build() }
  var aggregateRating: AggregateRating by map
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { aggregateRating = MutableAggregateRating().apply(builder).build() }
  var alumni: Person by map
  fun alumni(builder: MutablePerson.() -> Unit) { alumni = MutablePerson().apply(builder).build() }
  var award: String by map
  var parentOrganization: Organization by map
  fun parentOrganization(builder: MutableOrganization.() -> Unit) { parentOrganization = MutableOrganization().apply(builder).build() }
  var brand: Any by map
  fun brandBrand(builder: MutableBrand.() -> Unit) { brand = MutableBrand().apply(builder).build() }
  fun brandOrganization(builder: MutableOrganization.() -> Unit) { brand = MutableOrganization().apply(builder).build() }
  var contactPoint: ContactPoint by map
  fun contactPoint(builder: MutableContactPoint.() -> Unit) { contactPoint = MutableContactPoint().apply(builder).build() }
  var department: Organization by map
  fun department(builder: MutableOrganization.() -> Unit) { department = MutableOrganization().apply(builder).build() }
  var duns: Identifier by map
  var email: String by map
  var employee: Person by map
  fun employee(builder: MutablePerson.() -> Unit) { employee = MutablePerson().apply(builder).build() }
  var event: Event by map
  fun event(builder: MutableEvent.() -> Unit) { event = MutableEvent().apply(builder).build() }
  var faxNumber: String by map
  var founder: Person by map
  fun founder(builder: MutablePerson.() -> Unit) { founder = MutablePerson().apply(builder).build() }
  var dissolutionDate: java.util.Date by map
  var foundingDate: java.util.Date by map
  var globalLocationNumber: Identifier by map
  var hasPOS: Place by map
  fun hasPOS(builder: MutablePlace.() -> Unit) { hasPOS = MutablePlace().apply(builder).build() }
  var isicV4: String by map
  var legalName: String by map
  var logo: Any by map
  fun logoImageObject(builder: MutableImageObject.() -> Unit) { logo = MutableImageObject().apply(builder).build() }
  var makesOffer: Offer by map
  fun makesOffer(builder: MutableOffer.() -> Unit) { makesOffer = MutableOffer().apply(builder).build() }
  var member: Any by map
  fun memberOrganization(builder: MutableOrganization.() -> Unit) { member = MutableOrganization().apply(builder).build() }
  fun memberPerson(builder: MutablePerson.() -> Unit) { member = MutablePerson().apply(builder).build() }
  var memberOf: MemberOf by map
  var naics: String by map
  var numberOfEmployees: QuantitativeValue by map
  fun numberOfEmployees(builder: MutableQuantitativeValue.() -> Unit) { numberOfEmployees = MutableQuantitativeValue().apply(builder).build() }
  var owns: Any by map
  fun ownsOwnershipInfo(builder: MutableOwnershipInfo.() -> Unit) { owns = MutableOwnershipInfo().apply(builder).build() }
  fun ownsProduct(builder: MutableProduct.() -> Unit) { owns = MutableProduct().apply(builder).build() }
  var review: Review by map
  fun review(builder: MutableReview.() -> Unit) { review = MutableReview().apply(builder).build() }
  var seeks: Demand by map
  fun seeks(builder: MutableDemand.() -> Unit) { seeks = MutableDemand().apply(builder).build() }
  var funder: Any by map
  fun funderOrganization(builder: MutableOrganization.() -> Unit) { funder = MutableOrganization().apply(builder).build() }
  fun funderPerson(builder: MutablePerson.() -> Unit) { funder = MutablePerson().apply(builder).build() }
  var subOrganization: Organization by map
  fun subOrganization(builder: MutableOrganization.() -> Unit) { subOrganization = MutableOrganization().apply(builder).build() }
  var taxID: Identifier by map
  var telephone: String by map
  var vatID: String by map
  var foundingLocation: Place by map
  fun foundingLocation(builder: MutablePlace.() -> Unit) { foundingLocation = MutablePlace().apply(builder).build() }
  var leiCode: Identifier by map
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
  fun build() = org.schema.AutomotiveOntologyWGClass.Builder(map).build()
}
