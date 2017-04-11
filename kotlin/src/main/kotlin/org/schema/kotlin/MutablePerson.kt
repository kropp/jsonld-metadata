package org.schema.kotlin
import org.schema.*
class MutablePerson {
  private val map = HashMap<String,Any>()
  var additionalName: String by map
  var address: Any by map
  fun addressPostalAddress(builder: MutablePostalAddress.() -> Unit) { address = MutablePostalAddress().apply(builder).build() }
  var affiliation: MemberOf by map
  var alumniOf: Any by map
  fun alumniOfEducationalOrganization(builder: MutableEducationalOrganization.() -> Unit) { alumniOf = MutableEducationalOrganization().apply(builder).build() }
  fun alumniOfOrganization(builder: MutableOrganization.() -> Unit) { alumniOf = MutableOrganization().apply(builder).build() }
  var award: String by map
  var birthDate: java.util.Date by map
  var brand: Any by map
  fun brandBrand(builder: MutableBrand.() -> Unit) { brand = MutableBrand().apply(builder).build() }
  fun brandOrganization(builder: MutableOrganization.() -> Unit) { brand = MutableOrganization().apply(builder).build() }
  var children: Person by map
  fun children(builder: MutablePerson.() -> Unit) { children = MutablePerson().apply(builder).build() }
  var colleague: Any by map
  fun colleaguePerson(builder: MutablePerson.() -> Unit) { colleague = MutablePerson().apply(builder).build() }
  var contactPoint: ContactPoint by map
  fun contactPoint(builder: MutableContactPoint.() -> Unit) { contactPoint = MutableContactPoint().apply(builder).build() }
  var deathDate: java.util.Date by map
  var duns: Identifier by map
  var email: String by map
  var familyName: String by map
  var faxNumber: String by map
  var follows: Person by map
  fun follows(builder: MutablePerson.() -> Unit) { follows = MutablePerson().apply(builder).build() }
  var gender: Any by map
  var givenName: String by map
  var globalLocationNumber: Identifier by map
  var hasPOS: Place by map
  fun hasPOS(builder: MutablePlace.() -> Unit) { hasPOS = MutablePlace().apply(builder).build() }
  var height: Any by map
  fun heightDistance(builder: MutableDistance.() -> Unit) { height = MutableDistance().apply(builder).build() }
  fun heightQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { height = MutableQuantitativeValue().apply(builder).build() }
  var homeLocation: Any by map
  fun homeLocationContactPoint(builder: MutableContactPoint.() -> Unit) { homeLocation = MutableContactPoint().apply(builder).build() }
  fun homeLocationPlace(builder: MutablePlace.() -> Unit) { homeLocation = MutablePlace().apply(builder).build() }
  var honorificPrefix: String by map
  var honorificSuffix: String by map
  var isicV4: String by map
  var jobTitle: String by map
  var knows: Person by map
  fun knows(builder: MutablePerson.() -> Unit) { knows = MutablePerson().apply(builder).build() }
  var makesOffer: Offer by map
  fun makesOffer(builder: MutableOffer.() -> Unit) { makesOffer = MutableOffer().apply(builder).build() }
  var memberOf: MemberOf by map
  var naics: String by map
  var nationality: Country by map
  fun nationality(builder: MutableCountry.() -> Unit) { nationality = MutableCountry().apply(builder).build() }
  var netWorth: Any by map
  fun netWorthMonetaryAmount(builder: MutableMonetaryAmount.() -> Unit) { netWorth = MutableMonetaryAmount().apply(builder).build() }
  fun netWorthPriceSpecification(builder: MutablePriceSpecification.() -> Unit) { netWorth = MutablePriceSpecification().apply(builder).build() }
  var owns: Any by map
  fun ownsOwnershipInfo(builder: MutableOwnershipInfo.() -> Unit) { owns = MutableOwnershipInfo().apply(builder).build() }
  fun ownsProduct(builder: MutableProduct.() -> Unit) { owns = MutableProduct().apply(builder).build() }
  var parent: Person by map
  fun parent(builder: MutablePerson.() -> Unit) { parent = MutablePerson().apply(builder).build() }
  var performerIn: Event by map
  fun performerIn(builder: MutableEvent.() -> Unit) { performerIn = MutableEvent().apply(builder).build() }
  var relatedTo: Person by map
  fun relatedTo(builder: MutablePerson.() -> Unit) { relatedTo = MutablePerson().apply(builder).build() }
  var seeks: Demand by map
  fun seeks(builder: MutableDemand.() -> Unit) { seeks = MutableDemand().apply(builder).build() }
  var sibling: Person by map
  fun sibling(builder: MutablePerson.() -> Unit) { sibling = MutablePerson().apply(builder).build() }
  var funder: Any by map
  fun funderOrganization(builder: MutableOrganization.() -> Unit) { funder = MutableOrganization().apply(builder).build() }
  fun funderPerson(builder: MutablePerson.() -> Unit) { funder = MutablePerson().apply(builder).build() }
  var spouse: Person by map
  fun spouse(builder: MutablePerson.() -> Unit) { spouse = MutablePerson().apply(builder).build() }
  var taxID: Identifier by map
  var telephone: String by map
  var vatID: String by map
  var weight: QuantitativeValue by map
  fun weight(builder: MutableQuantitativeValue.() -> Unit) { weight = MutableQuantitativeValue().apply(builder).build() }
  var workLocation: Any by map
  fun workLocationContactPoint(builder: MutableContactPoint.() -> Unit) { workLocation = MutableContactPoint().apply(builder).build() }
  fun workLocationPlace(builder: MutablePlace.() -> Unit) { workLocation = MutablePlace().apply(builder).build() }
  var worksFor: Organization by map
  fun worksFor(builder: MutableOrganization.() -> Unit) { worksFor = MutableOrganization().apply(builder).build() }
  var birthPlace: Place by map
  fun birthPlace(builder: MutablePlace.() -> Unit) { birthPlace = MutablePlace().apply(builder).build() }
  var deathPlace: Place by map
  fun deathPlace(builder: MutablePlace.() -> Unit) { deathPlace = MutablePlace().apply(builder).build() }
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
  fun build() = org.schema.Person.Builder(map).build()
}
