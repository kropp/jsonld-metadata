package org.schema.kotlin
import org.schema.*
class MutableIndividualProduct {
  private val map = HashMap<String,Any>()
  var aggregateRating: AggregateRating by map
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { aggregateRating = MutableAggregateRating().apply(builder).build() }
  var audience: Audience by map
  fun audience(builder: MutableAudience.() -> Unit) { audience = MutableAudience().apply(builder).build() }
  var award: String by map
  var brand: Any by map
  fun brandBrand(builder: MutableBrand.() -> Unit) { brand = MutableBrand().apply(builder).build() }
  fun brandOrganization(builder: MutableOrganization.() -> Unit) { brand = MutableOrganization().apply(builder).build() }
  var category: Any by map
  fun categoryThing(builder: MutableThing.() -> Unit) { category = MutableThing().apply(builder).build() }
  var color: String by map
  var depth: Any by map
  fun depthDistance(builder: MutableDistance.() -> Unit) { depth = MutableDistance().apply(builder).build() }
  fun depthQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { depth = MutableQuantitativeValue().apply(builder).build() }
  var gtin12: Identifier by map
  var gtin13: Identifier by map
  var gtin14: Identifier by map
  var gtin8: Identifier by map
  var height: Any by map
  fun heightDistance(builder: MutableDistance.() -> Unit) { height = MutableDistance().apply(builder).build() }
  fun heightQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { height = MutableQuantitativeValue().apply(builder).build() }
  var isAccessoryOrSparePartFor: Product by map
  fun isAccessoryOrSparePartFor(builder: MutableProduct.() -> Unit) { isAccessoryOrSparePartFor = MutableProduct().apply(builder).build() }
  var isConsumableFor: Product by map
  fun isConsumableFor(builder: MutableProduct.() -> Unit) { isConsumableFor = MutableProduct().apply(builder).build() }
  var isRelatedTo: Any by map
  fun isRelatedToProduct(builder: MutableProduct.() -> Unit) { isRelatedTo = MutableProduct().apply(builder).build() }
  fun isRelatedToService(builder: MutableService.() -> Unit) { isRelatedTo = MutableService().apply(builder).build() }
  var isSimilarTo: Any by map
  fun isSimilarToProduct(builder: MutableProduct.() -> Unit) { isSimilarTo = MutableProduct().apply(builder).build() }
  fun isSimilarToService(builder: MutableService.() -> Unit) { isSimilarTo = MutableService().apply(builder).build() }
  var itemCondition: OfferItemCondition by map
  var logo: Any by map
  fun logoImageObject(builder: MutableImageObject.() -> Unit) { logo = MutableImageObject().apply(builder).build() }
  var model: Any by map
  fun modelProductModel(builder: MutableProductModel.() -> Unit) { model = MutableProductModel().apply(builder).build() }
  var mpn: String by map
  var manufacturer: Organization by map
  fun manufacturer(builder: MutableOrganization.() -> Unit) { manufacturer = MutableOrganization().apply(builder).build() }
  var offers: Offer by map
  fun offers(builder: MutableOffer.() -> Unit) { offers = MutableOffer().apply(builder).build() }
  var productID: Identifier by map
  var releaseDate: java.util.Date by map
  var review: Review by map
  fun review(builder: MutableReview.() -> Unit) { review = MutableReview().apply(builder).build() }
  var sku: Identifier by map
  var weight: QuantitativeValue by map
  fun weight(builder: MutableQuantitativeValue.() -> Unit) { weight = MutableQuantitativeValue().apply(builder).build() }
  var width: Any by map
  fun widthDistance(builder: MutableDistance.() -> Unit) { width = MutableDistance().apply(builder).build() }
  fun widthQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { width = MutableQuantitativeValue().apply(builder).build() }
  var additionalProperty: PropertyValue by map
  fun additionalProperty(builder: MutablePropertyValue.() -> Unit) { additionalProperty = MutablePropertyValue().apply(builder).build() }
  var productionDate: java.util.Date by map
  var purchaseDate: java.util.Date by map
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
  fun build() = org.schema.IndividualProduct.Builder(map).build()
}
