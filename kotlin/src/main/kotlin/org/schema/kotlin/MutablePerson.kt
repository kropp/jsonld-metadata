package org.schema.kotlin
import org.schema.*
class MutablePerson {
  private val map = HashMap<String,Any>()
  var additionalName: String
    get() = map["additionalName"] as String
    set(value) { map["additionalName"] = value }
  var address: Any
    get() = map["address"]!!
    set(value) { map["address"] = value }
  fun addressPostalAddress(builder: MutablePostalAddress.() -> Unit) { map["address"] = MutablePostalAddress().apply(builder).build() }
  var affiliation: MemberOf
    get() = map["affiliation"] as MemberOf
    set(value) { map["affiliation"] = value }
  var alumniOf: Any
    get() = map["alumniOf"]!!
    set(value) { map["alumniOf"] = value }
  fun alumniOfEducationalOrganization(builder: MutableEducationalOrganization.() -> Unit) { map["alumniOf"] = MutableEducationalOrganization().apply(builder).build() }
  fun alumniOfOrganization(builder: MutableOrganization.() -> Unit) { map["alumniOf"] = MutableOrganization().apply(builder).build() }
  var award: String
    get() = map["award"] as String
    set(value) { map["award"] = value }
  var birthDate: java.util.Date
    get() = map["birthDate"] as java.util.Date
    set(value) { map["birthDate"] = value }
  var brand: Any
    get() = map["brand"]!!
    set(value) { map["brand"] = value }
  fun brandBrand(builder: MutableBrand.() -> Unit) { map["brand"] = MutableBrand().apply(builder).build() }
  fun brandOrganization(builder: MutableOrganization.() -> Unit) { map["brand"] = MutableOrganization().apply(builder).build() }
  var children: Person
    get() = map["children"] as Person
    set(value) { map["children"] = value }
  fun children(builder: MutablePerson.() -> Unit) { map["children"] = MutablePerson().apply(builder).build() }
  var colleague: Any
    get() = map["colleague"]!!
    set(value) { map["colleague"] = value }
  fun colleaguePerson(builder: MutablePerson.() -> Unit) { map["colleague"] = MutablePerson().apply(builder).build() }
  var contactPoint: ContactPoint
    get() = map["contactPoint"] as ContactPoint
    set(value) { map["contactPoint"] = value }
  fun contactPoint(builder: MutableContactPoint.() -> Unit) { map["contactPoint"] = MutableContactPoint().apply(builder).build() }
  var deathDate: java.util.Date
    get() = map["deathDate"] as java.util.Date
    set(value) { map["deathDate"] = value }
  var duns: Identifier
    get() = map["duns"] as Identifier
    set(value) { map["duns"] = value }
  var email: String
    get() = map["email"] as String
    set(value) { map["email"] = value }
  var familyName: String
    get() = map["familyName"] as String
    set(value) { map["familyName"] = value }
  var faxNumber: String
    get() = map["faxNumber"] as String
    set(value) { map["faxNumber"] = value }
  var follows: Person
    get() = map["follows"] as Person
    set(value) { map["follows"] = value }
  fun follows(builder: MutablePerson.() -> Unit) { map["follows"] = MutablePerson().apply(builder).build() }
  var gender: Any
    get() = map["gender"]!!
    set(value) { map["gender"] = value }
  var givenName: String
    get() = map["givenName"] as String
    set(value) { map["givenName"] = value }
  var globalLocationNumber: Identifier
    get() = map["globalLocationNumber"] as Identifier
    set(value) { map["globalLocationNumber"] = value }
  var hasPOS: Place
    get() = map["hasPOS"] as Place
    set(value) { map["hasPOS"] = value }
  fun hasPOS(builder: MutablePlace.() -> Unit) { map["hasPOS"] = MutablePlace().apply(builder).build() }
  var height: Any
    get() = map["height"]!!
    set(value) { map["height"] = value }
  fun heightDistance(builder: MutableDistance.() -> Unit) { map["height"] = MutableDistance().apply(builder).build() }
  fun heightQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["height"] = MutableQuantitativeValue().apply(builder).build() }
  var homeLocation: Any
    get() = map["homeLocation"]!!
    set(value) { map["homeLocation"] = value }
  fun homeLocationContactPoint(builder: MutableContactPoint.() -> Unit) { map["homeLocation"] = MutableContactPoint().apply(builder).build() }
  fun homeLocationPlace(builder: MutablePlace.() -> Unit) { map["homeLocation"] = MutablePlace().apply(builder).build() }
  var honorificPrefix: String
    get() = map["honorificPrefix"] as String
    set(value) { map["honorificPrefix"] = value }
  var honorificSuffix: String
    get() = map["honorificSuffix"] as String
    set(value) { map["honorificSuffix"] = value }
  var isicV4: String
    get() = map["isicV4"] as String
    set(value) { map["isicV4"] = value }
  var jobTitle: String
    get() = map["jobTitle"] as String
    set(value) { map["jobTitle"] = value }
  var knows: Person
    get() = map["knows"] as Person
    set(value) { map["knows"] = value }
  fun knows(builder: MutablePerson.() -> Unit) { map["knows"] = MutablePerson().apply(builder).build() }
  var makesOffer: Offer
    get() = map["makesOffer"] as Offer
    set(value) { map["makesOffer"] = value }
  fun makesOffer(builder: MutableOffer.() -> Unit) { map["makesOffer"] = MutableOffer().apply(builder).build() }
  var memberOf: MemberOf
    get() = map["memberOf"] as MemberOf
    set(value) { map["memberOf"] = value }
  var naics: String
    get() = map["naics"] as String
    set(value) { map["naics"] = value }
  var nationality: Country
    get() = map["nationality"] as Country
    set(value) { map["nationality"] = value }
  fun nationality(builder: MutableCountry.() -> Unit) { map["nationality"] = MutableCountry().apply(builder).build() }
  var netWorth: Any
    get() = map["netWorth"]!!
    set(value) { map["netWorth"] = value }
  fun netWorthMonetaryAmount(builder: MutableMonetaryAmount.() -> Unit) { map["netWorth"] = MutableMonetaryAmount().apply(builder).build() }
  fun netWorthPriceSpecification(builder: MutablePriceSpecification.() -> Unit) { map["netWorth"] = MutablePriceSpecification().apply(builder).build() }
  var owns: Any
    get() = map["owns"]!!
    set(value) { map["owns"] = value }
  fun ownsOwnershipInfo(builder: MutableOwnershipInfo.() -> Unit) { map["owns"] = MutableOwnershipInfo().apply(builder).build() }
  fun ownsProduct(builder: MutableProduct.() -> Unit) { map["owns"] = MutableProduct().apply(builder).build() }
  var parent: Person
    get() = map["parent"] as Person
    set(value) { map["parent"] = value }
  fun parent(builder: MutablePerson.() -> Unit) { map["parent"] = MutablePerson().apply(builder).build() }
  var performerIn: Event
    get() = map["performerIn"] as Event
    set(value) { map["performerIn"] = value }
  fun performerIn(builder: MutableEvent.() -> Unit) { map["performerIn"] = MutableEvent().apply(builder).build() }
  var relatedTo: Person
    get() = map["relatedTo"] as Person
    set(value) { map["relatedTo"] = value }
  fun relatedTo(builder: MutablePerson.() -> Unit) { map["relatedTo"] = MutablePerson().apply(builder).build() }
  var seeks: Demand
    get() = map["seeks"] as Demand
    set(value) { map["seeks"] = value }
  fun seeks(builder: MutableDemand.() -> Unit) { map["seeks"] = MutableDemand().apply(builder).build() }
  var sibling: Person
    get() = map["sibling"] as Person
    set(value) { map["sibling"] = value }
  fun sibling(builder: MutablePerson.() -> Unit) { map["sibling"] = MutablePerson().apply(builder).build() }
  var funder: Any
    get() = map["funder"]!!
    set(value) { map["funder"] = value }
  fun funderOrganization(builder: MutableOrganization.() -> Unit) { map["funder"] = MutableOrganization().apply(builder).build() }
  fun funderPerson(builder: MutablePerson.() -> Unit) { map["funder"] = MutablePerson().apply(builder).build() }
  var spouse: Person
    get() = map["spouse"] as Person
    set(value) { map["spouse"] = value }
  fun spouse(builder: MutablePerson.() -> Unit) { map["spouse"] = MutablePerson().apply(builder).build() }
  var taxID: Identifier
    get() = map["taxID"] as Identifier
    set(value) { map["taxID"] = value }
  var telephone: String
    get() = map["telephone"] as String
    set(value) { map["telephone"] = value }
  var vatID: String
    get() = map["vatID"] as String
    set(value) { map["vatID"] = value }
  var weight: QuantitativeValue
    get() = map["weight"] as QuantitativeValue
    set(value) { map["weight"] = value }
  fun weight(builder: MutableQuantitativeValue.() -> Unit) { map["weight"] = MutableQuantitativeValue().apply(builder).build() }
  var workLocation: Any
    get() = map["workLocation"]!!
    set(value) { map["workLocation"] = value }
  fun workLocationContactPoint(builder: MutableContactPoint.() -> Unit) { map["workLocation"] = MutableContactPoint().apply(builder).build() }
  fun workLocationPlace(builder: MutablePlace.() -> Unit) { map["workLocation"] = MutablePlace().apply(builder).build() }
  var worksFor: Organization
    get() = map["worksFor"] as Organization
    set(value) { map["worksFor"] = value }
  fun worksFor(builder: MutableOrganization.() -> Unit) { map["worksFor"] = MutableOrganization().apply(builder).build() }
  var birthPlace: Place
    get() = map["birthPlace"] as Place
    set(value) { map["birthPlace"] = value }
  fun birthPlace(builder: MutablePlace.() -> Unit) { map["birthPlace"] = MutablePlace().apply(builder).build() }
  var deathPlace: Place
    get() = map["deathPlace"] as Place
    set(value) { map["deathPlace"] = value }
  fun deathPlace(builder: MutablePlace.() -> Unit) { map["deathPlace"] = MutablePlace().apply(builder).build() }
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
  fun build() = org.schema.Person.Builder(map).build()
}
