package org.schema.kotlin
import org.schema.Action
import org.schema.Thing

class MutableAggregateRating {
  private val map = HashMap<String,Any>()
  var itemReviewed: Thing by map
  fun itemReviewed(builder: MutableThing.() -> Unit) { itemReviewed = MutableThing().apply(builder).build() }
  var ratingCount: Int by map
  var reviewCount: Int by map
  var author: Any by map
  fun authorOrganization(builder: MutableOrganization.() -> Unit) { author = MutableOrganization().apply(builder).build() }
  fun authorPerson(builder: MutablePerson.() -> Unit) { author = MutablePerson().apply(builder).build() }
  var bestRating: Any by map
  var ratingValue: Any by map
  var worstRating: Any by map
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
  fun build() = org.schema.AggregateRating.Builder(map).build()
}
