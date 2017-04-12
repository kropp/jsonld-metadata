package org.schema.kotlin
import org.schema.*
class MutableVehicle {
  private val map = HashMap<String,Any>()
  var numberOfDoors: Any
    get() = map["numberOfDoors"]!!
    set(value) { map["numberOfDoors"] = value }
  fun numberOfDoorsQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["numberOfDoors"] = MutableQuantitativeValue().apply(builder).build() }
  var numberOfAirbags: Any
    get() = map["numberOfAirbags"]!!
    set(value) { map["numberOfAirbags"] = value }
  var numberOfAxles: Any
    get() = map["numberOfAxles"]!!
    set(value) { map["numberOfAxles"] = value }
  fun numberOfAxlesQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["numberOfAxles"] = MutableQuantitativeValue().apply(builder).build() }
  var vehicleEngine: EngineSpecification
    get() = map["vehicleEngine"] as EngineSpecification
    set(value) { map["vehicleEngine"] = value }
  fun vehicleEngine(builder: MutableEngineSpecification.() -> Unit) { map["vehicleEngine"] = MutableEngineSpecification().apply(builder).build() }
  var fuelConsumption: QuantitativeValue
    get() = map["fuelConsumption"] as QuantitativeValue
    set(value) { map["fuelConsumption"] = value }
  fun fuelConsumption(builder: MutableQuantitativeValue.() -> Unit) { map["fuelConsumption"] = MutableQuantitativeValue().apply(builder).build() }
  var fuelEfficiency: QuantitativeValue
    get() = map["fuelEfficiency"] as QuantitativeValue
    set(value) { map["fuelEfficiency"] = value }
  fun fuelEfficiency(builder: MutableQuantitativeValue.() -> Unit) { map["fuelEfficiency"] = MutableQuantitativeValue().apply(builder).build() }
  var numberOfForwardGears: Any
    get() = map["numberOfForwardGears"]!!
    set(value) { map["numberOfForwardGears"] = value }
  fun numberOfForwardGearsQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["numberOfForwardGears"] = MutableQuantitativeValue().apply(builder).build() }
  var vehicleIdentificationNumber: String
    get() = map["vehicleIdentificationNumber"] as String
    set(value) { map["vehicleIdentificationNumber"] = value }
  var cargoVolume: QuantitativeValue
    get() = map["cargoVolume"] as QuantitativeValue
    set(value) { map["cargoVolume"] = value }
  fun cargoVolume(builder: MutableQuantitativeValue.() -> Unit) { map["cargoVolume"] = MutableQuantitativeValue().apply(builder).build() }
  var vehicleConfiguration: String
    get() = map["vehicleConfiguration"] as String
    set(value) { map["vehicleConfiguration"] = value }
  var knownVehicleDamages: String
    get() = map["knownVehicleDamages"] as String
    set(value) { map["knownVehicleDamages"] = value }
  var dateVehicleFirstRegistered: java.util.Date
    get() = map["dateVehicleFirstRegistered"] as java.util.Date
    set(value) { map["dateVehicleFirstRegistered"] = value }
  var driveWheelConfiguration: Any
    get() = map["driveWheelConfiguration"]!!
    set(value) { map["driveWheelConfiguration"] = value }
  fun driveWheelConfigurationDriveWheelConfigurationValue(builder: MutableDriveWheelConfigurationValue.() -> Unit) { map["driveWheelConfiguration"] = MutableDriveWheelConfigurationValue().apply(builder).build() }
  var fuelType: Any
    get() = map["fuelType"]!!
    set(value) { map["fuelType"] = value }
  fun fuelTypeQualitativeValue(builder: MutableQualitativeValue.() -> Unit) { map["fuelType"] = MutableQualitativeValue().apply(builder).build() }
  var vehicleInteriorColor: String
    get() = map["vehicleInteriorColor"] as String
    set(value) { map["vehicleInteriorColor"] = value }
  var vehicleInteriorType: String
    get() = map["vehicleInteriorType"] as String
    set(value) { map["vehicleInteriorType"] = value }
  var mileageFromOdometer: QuantitativeValue
    get() = map["mileageFromOdometer"] as QuantitativeValue
    set(value) { map["mileageFromOdometer"] = value }
  fun mileageFromOdometer(builder: MutableQuantitativeValue.() -> Unit) { map["mileageFromOdometer"] = MutableQuantitativeValue().apply(builder).build() }
  var vehicleModelDate: java.util.Date
    get() = map["vehicleModelDate"] as java.util.Date
    set(value) { map["vehicleModelDate"] = value }
  var numberOfPreviousOwners: Any
    get() = map["numberOfPreviousOwners"]!!
    set(value) { map["numberOfPreviousOwners"] = value }
  fun numberOfPreviousOwnersQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["numberOfPreviousOwners"] = MutableQuantitativeValue().apply(builder).build() }
  var productionDate: java.util.Date
    get() = map["productionDate"] as java.util.Date
    set(value) { map["productionDate"] = value }
  var purchaseDate: java.util.Date
    get() = map["purchaseDate"] as java.util.Date
    set(value) { map["purchaseDate"] = value }
  var vehicleSeatingCapacity: Any
    get() = map["vehicleSeatingCapacity"]!!
    set(value) { map["vehicleSeatingCapacity"] = value }
  fun vehicleSeatingCapacityQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["vehicleSeatingCapacity"] = MutableQuantitativeValue().apply(builder).build() }
  var vehicleTransmission: Any
    get() = map["vehicleTransmission"]!!
    set(value) { map["vehicleTransmission"] = value }
  fun vehicleTransmissionQualitativeValue(builder: MutableQualitativeValue.() -> Unit) { map["vehicleTransmission"] = MutableQualitativeValue().apply(builder).build() }
  var steeringPosition: SteeringPositionValue
    get() = map["steeringPosition"] as SteeringPositionValue
    set(value) { map["steeringPosition"] = value }
  fun steeringPosition(builder: MutableSteeringPositionValue.() -> Unit) { map["steeringPosition"] = MutableSteeringPositionValue().apply(builder).build() }
  var vehicleSpecialUsage: String
    get() = map["vehicleSpecialUsage"] as String
    set(value) { map["vehicleSpecialUsage"] = value }
  var aggregateRating: AggregateRating
    get() = map["aggregateRating"] as AggregateRating
    set(value) { map["aggregateRating"] = value }
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { map["aggregateRating"] = MutableAggregateRating().apply(builder).build() }
  var audience: Audience
    get() = map["audience"] as Audience
    set(value) { map["audience"] = value }
  fun audience(builder: MutableAudience.() -> Unit) { map["audience"] = MutableAudience().apply(builder).build() }
  var award: String
    get() = map["award"] as String
    set(value) { map["award"] = value }
  var brand: Any
    get() = map["brand"]!!
    set(value) { map["brand"] = value }
  fun brandBrand(builder: MutableBrand.() -> Unit) { map["brand"] = MutableBrand().apply(builder).build() }
  fun brandOrganization(builder: MutableOrganization.() -> Unit) { map["brand"] = MutableOrganization().apply(builder).build() }
  var category: Any
    get() = map["category"]!!
    set(value) { map["category"] = value }
  fun categoryThing(builder: MutableThing.() -> Unit) { map["category"] = MutableThing().apply(builder).build() }
  var color: String
    get() = map["color"] as String
    set(value) { map["color"] = value }
  var depth: Any
    get() = map["depth"]!!
    set(value) { map["depth"] = value }
  fun depthDistance(builder: MutableDistance.() -> Unit) { map["depth"] = MutableDistance().apply(builder).build() }
  fun depthQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["depth"] = MutableQuantitativeValue().apply(builder).build() }
  var gtin12: Identifier
    get() = map["gtin12"] as Identifier
    set(value) { map["gtin12"] = value }
  var gtin13: Identifier
    get() = map["gtin13"] as Identifier
    set(value) { map["gtin13"] = value }
  var gtin14: Identifier
    get() = map["gtin14"] as Identifier
    set(value) { map["gtin14"] = value }
  var gtin8: Identifier
    get() = map["gtin8"] as Identifier
    set(value) { map["gtin8"] = value }
  var height: Any
    get() = map["height"]!!
    set(value) { map["height"] = value }
  fun heightDistance(builder: MutableDistance.() -> Unit) { map["height"] = MutableDistance().apply(builder).build() }
  fun heightQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["height"] = MutableQuantitativeValue().apply(builder).build() }
  var isAccessoryOrSparePartFor: Product
    get() = map["isAccessoryOrSparePartFor"] as Product
    set(value) { map["isAccessoryOrSparePartFor"] = value }
  fun isAccessoryOrSparePartFor(builder: MutableProduct.() -> Unit) { map["isAccessoryOrSparePartFor"] = MutableProduct().apply(builder).build() }
  var isConsumableFor: Product
    get() = map["isConsumableFor"] as Product
    set(value) { map["isConsumableFor"] = value }
  fun isConsumableFor(builder: MutableProduct.() -> Unit) { map["isConsumableFor"] = MutableProduct().apply(builder).build() }
  var isRelatedTo: Any
    get() = map["isRelatedTo"]!!
    set(value) { map["isRelatedTo"] = value }
  fun isRelatedToProduct(builder: MutableProduct.() -> Unit) { map["isRelatedTo"] = MutableProduct().apply(builder).build() }
  fun isRelatedToService(builder: MutableService.() -> Unit) { map["isRelatedTo"] = MutableService().apply(builder).build() }
  var isSimilarTo: Any
    get() = map["isSimilarTo"]!!
    set(value) { map["isSimilarTo"] = value }
  fun isSimilarToProduct(builder: MutableProduct.() -> Unit) { map["isSimilarTo"] = MutableProduct().apply(builder).build() }
  fun isSimilarToService(builder: MutableService.() -> Unit) { map["isSimilarTo"] = MutableService().apply(builder).build() }
  var itemCondition: OfferItemCondition
    get() = map["itemCondition"] as OfferItemCondition
    set(value) { map["itemCondition"] = value }
  var logo: Any
    get() = map["logo"]!!
    set(value) { map["logo"] = value }
  fun logoImageObject(builder: MutableImageObject.() -> Unit) { map["logo"] = MutableImageObject().apply(builder).build() }
  var model: Any
    get() = map["model"]!!
    set(value) { map["model"] = value }
  fun modelProductModel(builder: MutableProductModel.() -> Unit) { map["model"] = MutableProductModel().apply(builder).build() }
  var mpn: String
    get() = map["mpn"] as String
    set(value) { map["mpn"] = value }
  var manufacturer: Organization
    get() = map["manufacturer"] as Organization
    set(value) { map["manufacturer"] = value }
  fun manufacturer(builder: MutableOrganization.() -> Unit) { map["manufacturer"] = MutableOrganization().apply(builder).build() }
  var offers: Offer
    get() = map["offers"] as Offer
    set(value) { map["offers"] = value }
  fun offers(builder: MutableOffer.() -> Unit) { map["offers"] = MutableOffer().apply(builder).build() }
  var productID: Identifier
    get() = map["productID"] as Identifier
    set(value) { map["productID"] = value }
  var releaseDate: java.util.Date
    get() = map["releaseDate"] as java.util.Date
    set(value) { map["releaseDate"] = value }
  var review: Review
    get() = map["review"] as Review
    set(value) { map["review"] = value }
  fun review(builder: MutableReview.() -> Unit) { map["review"] = MutableReview().apply(builder).build() }
  var sku: Identifier
    get() = map["sku"] as Identifier
    set(value) { map["sku"] = value }
  var weight: QuantitativeValue
    get() = map["weight"] as QuantitativeValue
    set(value) { map["weight"] = value }
  fun weight(builder: MutableQuantitativeValue.() -> Unit) { map["weight"] = MutableQuantitativeValue().apply(builder).build() }
  var width: Any
    get() = map["width"]!!
    set(value) { map["width"] = value }
  fun widthDistance(builder: MutableDistance.() -> Unit) { map["width"] = MutableDistance().apply(builder).build() }
  fun widthQuantitativeValue(builder: MutableQuantitativeValue.() -> Unit) { map["width"] = MutableQuantitativeValue().apply(builder).build() }
  var additionalProperty: PropertyValue
    get() = map["additionalProperty"] as PropertyValue
    set(value) { map["additionalProperty"] = value }
  fun additionalProperty(builder: MutablePropertyValue.() -> Unit) { map["additionalProperty"] = MutablePropertyValue().apply(builder).build() }
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
  fun build() = org.schema.Vehicle.Builder(map).build()
}
