package org.schema.kotlin
import org.schema.*
class MutableLandmarksOrHistoricalBuildings {
  private val map = HashMap<String,Any>()
  var address: Any
    get() = map["address"]!!
    set(value) { map["address"] = value }
  fun addressPostalAddress(builder: MutablePostalAddress.() -> Unit) { map["address"] = MutablePostalAddress().apply(builder).build() }
  var aggregateRating: AggregateRating
    get() = map["aggregateRating"] as AggregateRating
    set(value) { map["aggregateRating"] = value }
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { map["aggregateRating"] = MutableAggregateRating().apply(builder).build() }
  var branchCode: String
    get() = map["branchCode"] as String
    set(value) { map["branchCode"] = value }
  var containedInPlace: Place
    get() = map["containedInPlace"] as Place
    set(value) { map["containedInPlace"] = value }
  fun containedInPlace(builder: MutablePlace.() -> Unit) { map["containedInPlace"] = MutablePlace().apply(builder).build() }
  var containsPlace: Place
    get() = map["containsPlace"] as Place
    set(value) { map["containsPlace"] = value }
  fun containsPlace(builder: MutablePlace.() -> Unit) { map["containsPlace"] = MutablePlace().apply(builder).build() }
  var event: Event
    get() = map["event"] as Event
    set(value) { map["event"] = value }
  fun event(builder: MutableEvent.() -> Unit) { map["event"] = MutableEvent().apply(builder).build() }
  var faxNumber: String
    get() = map["faxNumber"] as String
    set(value) { map["faxNumber"] = value }
  var geo: Any
    get() = map["geo"]!!
    set(value) { map["geo"] = value }
  fun geoGeoCoordinates(builder: MutableGeoCoordinates.() -> Unit) { map["geo"] = MutableGeoCoordinates().apply(builder).build() }
  fun geoGeoShape(builder: MutableGeoShape.() -> Unit) { map["geo"] = MutableGeoShape().apply(builder).build() }
  var globalLocationNumber: Identifier
    get() = map["globalLocationNumber"] as Identifier
    set(value) { map["globalLocationNumber"] = value }
  var isicV4: String
    get() = map["isicV4"] as String
    set(value) { map["isicV4"] = value }
  var logo: Any
    get() = map["logo"]!!
    set(value) { map["logo"] = value }
  fun logoImageObject(builder: MutableImageObject.() -> Unit) { map["logo"] = MutableImageObject().apply(builder).build() }
  var hasMap: Any
    get() = map["hasMap"]!!
    set(value) { map["hasMap"] = value }
  fun hasMapMap(builder: MutableMap.() -> Unit) { map["hasMap"] = MutableMap().apply(builder).build() }
  var maximumAttendeeCapacity: Int
    get() = map["maximumAttendeeCapacity"] as Int
    set(value) { map["maximumAttendeeCapacity"] = value }
  var openingHoursSpecification: OpeningHoursSpecification
    get() = map["openingHoursSpecification"] as OpeningHoursSpecification
    set(value) { map["openingHoursSpecification"] = value }
  fun openingHoursSpecification(builder: MutableOpeningHoursSpecification.() -> Unit) { map["openingHoursSpecification"] = MutableOpeningHoursSpecification().apply(builder).build() }
  var specialOpeningHoursSpecification: OpeningHoursSpecification
    get() = map["specialOpeningHoursSpecification"] as OpeningHoursSpecification
    set(value) { map["specialOpeningHoursSpecification"] = value }
  fun specialOpeningHoursSpecification(builder: MutableOpeningHoursSpecification.() -> Unit) { map["specialOpeningHoursSpecification"] = MutableOpeningHoursSpecification().apply(builder).build() }
  var photo: Any
    get() = map["photo"]!!
    set(value) { map["photo"] = value }
  fun photoImageObject(builder: MutableImageObject.() -> Unit) { map["photo"] = MutableImageObject().apply(builder).build() }
  fun photoPhotograph(builder: MutablePhotograph.() -> Unit) { map["photo"] = MutablePhotograph().apply(builder).build() }
  var review: Review
    get() = map["review"] as Review
    set(value) { map["review"] = value }
  fun review(builder: MutableReview.() -> Unit) { map["review"] = MutableReview().apply(builder).build() }
  var telephone: String
    get() = map["telephone"] as String
    set(value) { map["telephone"] = value }
  var additionalProperty: PropertyValue
    get() = map["additionalProperty"] as PropertyValue
    set(value) { map["additionalProperty"] = value }
  fun additionalProperty(builder: MutablePropertyValue.() -> Unit) { map["additionalProperty"] = MutablePropertyValue().apply(builder).build() }
  var amenityFeature: LocationFeatureSpecification
    get() = map["amenityFeature"] as LocationFeatureSpecification
    set(value) { map["amenityFeature"] = value }
  fun amenityFeature(builder: MutableLocationFeatureSpecification.() -> Unit) { map["amenityFeature"] = MutableLocationFeatureSpecification().apply(builder).build() }
  var smokingAllowed: Boolean
    get() = map["smokingAllowed"] as Boolean
    set(value) { map["smokingAllowed"] = value }
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
  fun build() = org.schema.LandmarksOrHistoricalBuildings.Builder(map).build()
}
