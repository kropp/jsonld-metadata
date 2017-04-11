package org.schema.kotlin
import org.schema.*
class MutableOffer {
  private val map = HashMap<String,Any>()
  var acceptedPaymentMethod: Any by map
  fun acceptedPaymentMethodLoanOrCredit(builder: MutableLoanOrCredit.() -> Unit) { acceptedPaymentMethod = MutableLoanOrCredit().apply(builder).build() }
  var addOn: Offer by map
  fun addOn(builder: MutableOffer.() -> Unit) { addOn = MutableOffer().apply(builder).build() }
  var advanceBookingRequirement: QuantitativeValue by map
  fun advanceBookingRequirement(builder: MutableQuantitativeValue.() -> Unit) { advanceBookingRequirement = MutableQuantitativeValue().apply(builder).build() }
  var aggregateRating: AggregateRating by map
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { aggregateRating = MutableAggregateRating().apply(builder).build() }
  var availability: ItemAvailability by map
  var availabilityEnds: java.util.Date by map
  var availabilityStarts: java.util.Date by map
  var availableAtOrFrom: Place by map
  fun availableAtOrFrom(builder: MutablePlace.() -> Unit) { availableAtOrFrom = MutablePlace().apply(builder).build() }
  var availableDeliveryMethod: DeliveryMethod by map
  var businessFunction: BusinessFunction by map
  var category: Any by map
  fun categoryThing(builder: MutableThing.() -> Unit) { category = MutableThing().apply(builder).build() }
  var deliveryLeadTime: QuantitativeValue by map
  fun deliveryLeadTime(builder: MutableQuantitativeValue.() -> Unit) { deliveryLeadTime = MutableQuantitativeValue().apply(builder).build() }
  var eligibleCustomerType: BusinessEntityType by map
  var eligibleDuration: QuantitativeValue by map
  fun eligibleDuration(builder: MutableQuantitativeValue.() -> Unit) { eligibleDuration = MutableQuantitativeValue().apply(builder).build() }
  var eligibleQuantity: QuantitativeValue by map
  fun eligibleQuantity(builder: MutableQuantitativeValue.() -> Unit) { eligibleQuantity = MutableQuantitativeValue().apply(builder).build() }
  var eligibleRegion: Any by map
  fun eligibleRegionGeoShape(builder: MutableGeoShape.() -> Unit) { eligibleRegion = MutableGeoShape().apply(builder).build() }
  fun eligibleRegionPlace(builder: MutablePlace.() -> Unit) { eligibleRegion = MutablePlace().apply(builder).build() }
  var ineligibleRegion: Any by map
  fun ineligibleRegionGeoShape(builder: MutableGeoShape.() -> Unit) { ineligibleRegion = MutableGeoShape().apply(builder).build() }
  fun ineligibleRegionPlace(builder: MutablePlace.() -> Unit) { ineligibleRegion = MutablePlace().apply(builder).build() }
  var eligibleTransactionVolume: PriceSpecification by map
  fun eligibleTransactionVolume(builder: MutablePriceSpecification.() -> Unit) { eligibleTransactionVolume = MutablePriceSpecification().apply(builder).build() }
  var gtin12: Identifier by map
  var gtin13: Identifier by map
  var gtin14: Identifier by map
  var gtin8: Identifier by map
  var includesObject: TypeAndQuantityNode by map
  fun includesObject(builder: MutableTypeAndQuantityNode.() -> Unit) { includesObject = MutableTypeAndQuantityNode().apply(builder).build() }
  var inventoryLevel: QuantitativeValue by map
  fun inventoryLevel(builder: MutableQuantitativeValue.() -> Unit) { inventoryLevel = MutableQuantitativeValue().apply(builder).build() }
  var itemCondition: OfferItemCondition by map
  var itemOffered: Any by map
  fun itemOfferedProduct(builder: MutableProduct.() -> Unit) { itemOffered = MutableProduct().apply(builder).build() }
  fun itemOfferedService(builder: MutableService.() -> Unit) { itemOffered = MutableService().apply(builder).build() }
  var offeredBy: Any by map
  fun offeredByOrganization(builder: MutableOrganization.() -> Unit) { offeredBy = MutableOrganization().apply(builder).build() }
  fun offeredByPerson(builder: MutablePerson.() -> Unit) { offeredBy = MutablePerson().apply(builder).build() }
  var mpn: String by map
  var price: Any by map
  var priceSpecification: PriceSpecification by map
  fun priceSpecification(builder: MutablePriceSpecification.() -> Unit) { priceSpecification = MutablePriceSpecification().apply(builder).build() }
  var priceValidUntil: java.util.Date by map
  var review: Review by map
  fun review(builder: MutableReview.() -> Unit) { review = MutableReview().apply(builder).build() }
  var seller: Participant by map
  var sku: Identifier by map
  var validFrom: java.util.Date by map
  var validThrough: java.util.Date by map
  var warranty: WarrantyPromise by map
  fun warranty(builder: MutableWarrantyPromise.() -> Unit) { warranty = MutableWarrantyPromise().apply(builder).build() }
  var priceCurrency: String by map
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
  fun build() = org.schema.Offer.Builder(map).build()
}
