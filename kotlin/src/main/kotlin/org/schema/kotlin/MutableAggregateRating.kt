package org.schema.kotlin
import org.schema.Action
import org.schema.Thing

class MutableAggregateRating {
  private val map = HashMap<String,Any>()
  var itemReviewed: Thing
    get() = map["itemReviewed"] as Thing
    set(value) { map["itemReviewed"] = value }
  fun itemReviewed(builder: MutableThing.() -> Unit) { map["itemReviewed"] = MutableThing().apply(builder).build() }
  var ratingCount: Int
    get() = map["ratingCount"] as Int
    set(value) { map["ratingCount"] = value }
  var reviewCount: Int
    get() = map["reviewCount"] as Int
    set(value) { map["reviewCount"] = value }
  var author: Any
    get() = map["author"]!!
    set(value) { map["author"] = value }
  fun authorOrganization(builder: MutableOrganization.() -> Unit) { map["author"] = MutableOrganization().apply(builder).build() }
  fun authorPerson(builder: MutablePerson.() -> Unit) { map["author"] = MutablePerson().apply(builder).build() }
  var bestRating: Any
    get() = map["bestRating"]!!
    set(value) { map["bestRating"] = value }
  var ratingValue: Any
    get() = map["ratingValue"]!!
    set(value) { map["ratingValue"] = value }
  var worstRating: Any
    get() = map["worstRating"]!!
    set(value) { map["worstRating"] = value }
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
  fun build() = org.schema.AggregateRating.Builder(map).build()
}
