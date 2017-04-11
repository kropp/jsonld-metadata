package org.schema.kotlin
import org.schema.*
class MutablePoliceStation {
  private val map = HashMap<String,Any>()
  var currenciesAccepted: String by map
  var openingHours: String by map
  var paymentAccepted: String by map
  var priceRange: String by map
  var address: Any by map
  fun addressPostalAddress(builder: MutablePostalAddress.() -> Unit) { address = MutablePostalAddress().apply(builder).build() }
  var aggregateRating: AggregateRating by map
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { aggregateRating = MutableAggregateRating().apply(builder).build() }
  var branchCode: String by map
  var containedInPlace: Place by map
  fun containedInPlace(builder: MutablePlace.() -> Unit) { containedInPlace = MutablePlace().apply(builder).build() }
  var containsPlace: Place by map
  fun containsPlace(builder: MutablePlace.() -> Unit) { containsPlace = MutablePlace().apply(builder).build() }
  var event: Event by map
  fun event(builder: MutableEvent.() -> Unit) { event = MutableEvent().apply(builder).build() }
  var faxNumber: String by map
  var geo: Any by map
  fun geoGeoCoordinates(builder: MutableGeoCoordinates.() -> Unit) { geo = MutableGeoCoordinates().apply(builder).build() }
  fun geoGeoShape(builder: MutableGeoShape.() -> Unit) { geo = MutableGeoShape().apply(builder).build() }
  var globalLocationNumber: Identifier by map
  var isicV4: String by map
  var logo: Any by map
  fun logoImageObject(builder: MutableImageObject.() -> Unit) { logo = MutableImageObject().apply(builder).build() }
  var hasMap: Any by map
  fun hasMapMap(builder: MutableMap.() -> Unit) { hasMap = MutableMap().apply(builder).build() }
  var maximumAttendeeCapacity: Int by map
  var openingHoursSpecification: OpeningHoursSpecification by map
  fun openingHoursSpecification(builder: MutableOpeningHoursSpecification.() -> Unit) { openingHoursSpecification = MutableOpeningHoursSpecification().apply(builder).build() }
  var specialOpeningHoursSpecification: OpeningHoursSpecification by map
  fun specialOpeningHoursSpecification(builder: MutableOpeningHoursSpecification.() -> Unit) { specialOpeningHoursSpecification = MutableOpeningHoursSpecification().apply(builder).build() }
  var photo: Any by map
  fun photoImageObject(builder: MutableImageObject.() -> Unit) { photo = MutableImageObject().apply(builder).build() }
  fun photoPhotograph(builder: MutablePhotograph.() -> Unit) { photo = MutablePhotograph().apply(builder).build() }
  var review: Review by map
  fun review(builder: MutableReview.() -> Unit) { review = MutableReview().apply(builder).build() }
  var telephone: String by map
  var additionalProperty: PropertyValue by map
  fun additionalProperty(builder: MutablePropertyValue.() -> Unit) { additionalProperty = MutablePropertyValue().apply(builder).build() }
  var amenityFeature: LocationFeatureSpecification by map
  fun amenityFeature(builder: MutableLocationFeatureSpecification.() -> Unit) { amenityFeature = MutableLocationFeatureSpecification().apply(builder).build() }
  var smokingAllowed: Boolean by map
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
  fun build() = org.schema.PoliceStation.Builder(map).build()
}
