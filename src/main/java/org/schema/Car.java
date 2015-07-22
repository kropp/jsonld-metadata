/*
 * Copyright 2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 * Generated on Jul 22, 2015.
 */

package org.schema;

/**
 * A car is a wheeled, self-powered motor vehicle used for transportation.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group
 */
public class Car extends Vehicle {
  /**
   * Builder for {@link Car}
   */
  public static final class Builder {
    /**
     * Creates new {@link Car} instance.
     */
    public Car build() {
      return new Car(aggregateRating, purchaseDate, review, vehicleInteriorColor, isSimilarTo, gtin14, vin, award, driveWheelConfiguration, color, gtin12, sku, knownVehicleDamages, potentialAction, vehicleSeatingCapacity, fuelEfficiency, cargoVolume, category, numberOfAxles, steeringPosition, vehicleModelDate, mpn, gtin8, audience, url, itemCondition, isRelatedTo, vehicleEngine, gtin13, description, offers, isConsumableFor, weight, width, depth, logo, additionalType, sameAs, numberOfDoors, productID, fuelConsumption, numberOfForwardGears, isAccessoryOrSparePartFor, brand, vehicleTransmission, manufacturer, additionalProperty, name, mainEntityOfPage, dateVehicleFirstRegistered, numberOfPreviousOwners, model, productionDate, height, mileageFromOdometer, alternateName, releaseDate, fuelType, numberOfAirbags, vehicleInteriorType, vehicleConfiguration);
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * The date the item e.g. vehicle was purchased by the current owner.
     */
    public Builder purchaseDate(java.util.Date date) {
      this.purchaseDate = date;
      return this;
    }
    /**
     * A review of the item.
     */
    public Builder review(Review review) {
      this.review = review;
      return this;
    }
    /**
     * The color or color combination of the interior of the vehicle.
     */
    public Builder vehicleInteriorColor(String vehicleInteriorColor) {
      this.vehicleInteriorColor = vehicleInteriorColor;
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    public Builder isSimilarTo(Product product) {
      this.isSimilarTo = product;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin14(String gtin14) {
      this.gtin14 = gtin14;
      return this;
    }
    /**
     * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
     */
    public Builder vin(String vin) {
      this.vin = vin;
      return this;
    }
    /**
     * An award won by or for this item.
     */
    public Builder award(String award) {
      this.award = award;
      return this;
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     */
    public Builder driveWheelConfiguration(String driveWheelConfiguration) {
      this.driveWheelConfiguration.setString(driveWheelConfiguration);
      return this;
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     */
    public Builder driveWheelConfiguration(DriveWheelConfigurationValue driveWheelConfigurationValue) {
      this.driveWheelConfiguration.setDriveWheelConfigurationValue(driveWheelConfigurationValue);
      return this;
    }
    /**
     * The color of the product.
     */
    public Builder color(String color) {
      this.color = color;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin12(String gtin12) {
      this.gtin12 = gtin12;
      return this;
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }
    /**
     * A textual description of known damages, both repaired and unrepaired.
     */
    public Builder knownVehicleDamages(String knownVehicleDamages) {
      this.knownVehicleDamages = knownVehicleDamages;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.<br />
Typical unit code(s): C62 for persons 
     */
    public Builder vehicleSeatingCapacity(Number number) {
      this.vehicleSeatingCapacity.setNumber(number);
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.<br />
Typical unit code(s): C62 for persons 
     */
    public Builder vehicleSeatingCapacity(QuantitativeValue quantitativeValue) {
      this.vehicleSeatingCapacity.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).<br />
Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter.<br />
Use <a href="unitText">unitText</a> to indicate the unit of measurement, e.g. mpg or km/L.
Note 2: There are two ways of indicating the fuel consumption, <a href="fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a href="fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.<br />
Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a href="valueReference">valueReference</a> to link the value for the fuel economy to another value.
     */
    public Builder fuelEfficiency(QuantitativeValue quantitativeValue) {
      this.fuelEfficiency = quantitativeValue;
      return this;
    }
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.<br />
Typical unit code(s): LTR for liters, FTQ for cubic foot/feet<br />

Note: You can use <a href="minValue">minValue</a> and <a href="maxValue">maxValue</a> to indicate ranges.
     */
    public Builder cargoVolume(QuantitativeValue quantitativeValue) {
      this.cargoVolume = quantitativeValue;
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(Thing thing) {
      this.category.setThing(thing);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(String category) {
      this.category.setString(category);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(PhysicalActivityCategory physicalActivityCategory) {
      this.category.setPhysicalActivityCategory(physicalActivityCategory);
      return this;
    }
    /**
     * The number of axles.<br />
Typical unit code(s): C62
     */
    public Builder numberOfAxles(Number number) {
      this.numberOfAxles.setNumber(number);
      return this;
    }
    /**
     * The number of axles.<br />
Typical unit code(s): C62
     */
    public Builder numberOfAxles(QuantitativeValue quantitativeValue) {
      this.numberOfAxles.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The position of the steering wheel or similar device (mostly for cars).
     */
    public Builder steeringPosition(SteeringPositionValue steeringPositionValue) {
      this.steeringPosition = steeringPositionValue;
      return this;
    }
    /**
     * The release date of a vehicle model (often used to differentiate versions of the same make and model).
     */
    public Builder vehicleModelDate(java.util.Date date) {
      this.vehicleModelDate = date;
      return this;
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    public Builder mpn(String mpn) {
      this.mpn = mpn;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin8(String gtin8) {
      this.gtin8 = gtin8;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience audience) {
      this.audience = audience;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    public Builder itemCondition(OfferItemCondition offerItemCondition) {
      this.itemCondition = offerItemCondition;
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    public Builder isRelatedTo(Product product) {
      this.isRelatedTo = product;
      return this;
    }
    /**
     * Information about the engine or engines of the vehicle.
     */
    public Builder vehicleEngine(EngineSpecification engineSpecification) {
      this.vehicleEngine = engineSpecification;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin13(String gtin13) {
      this.gtin13 = gtin13;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer offer) {
      this.offers = offer;
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    public Builder isConsumableFor(Product product) {
      this.isConsumableFor = product;
      return this;
    }
    /**
     * The weight of the product or person.
     */
    public Builder weight(QuantitativeValue quantitativeValue) {
      this.weight = quantitativeValue;
      return this;
    }
    /**
     * The width of the item.
     */
    public Builder width(QuantitativeValue quantitativeValue) {
      this.width.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The width of the item.
     */
    public Builder width(Distance distance) {
      this.width.setDistance(distance);
      return this;
    }
    /**
     * The depth of the item.
     */
    public Builder depth(QuantitativeValue quantitativeValue) {
      this.depth.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The depth of the item.
     */
    public Builder depth(Distance distance) {
      this.depth.setDistance(distance);
      return this;
    }
    /**
     * An associated logo.
     */
    public Builder logo(ImageObject imageObject) {
      this.logo.setImageObject(imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    public Builder logo(String logo) {
      this.logo.setString(logo);
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * The number of doors.<br />
Typical unit code(s): C62
     */
    public Builder numberOfDoors(Number number) {
      this.numberOfDoors.setNumber(number);
      return this;
    }
    /**
     * The number of doors.<br />
Typical unit code(s): C62
     */
    public Builder numberOfDoors(QuantitativeValue quantitativeValue) {
      this.numberOfDoors.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The product identifier, such as ISBN. For example: <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>.
     */
    public Builder productID(String productID) {
      this.productID = productID;
      return this;
    }
    /**
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).<br />
Note 1: There are unfortunately no standard unit codes for liters per 100 km.<br />
Use <a href="unitText">unitText</a> to indicate the unit of measurement, e.g. L/100 km.
Note 2: There are two ways of indicating the fuel consumption, <a href="fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a href="fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.<br />
Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a href="valueReference">valueReference</a> to link the value for the fuel consumption to another value.
     */
    public Builder fuelConsumption(QuantitativeValue quantitativeValue) {
      this.fuelConsumption = quantitativeValue;
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.<br />
Typical unit code(s): C62
     */
    public Builder numberOfForwardGears(Number number) {
      this.numberOfForwardGears.setNumber(number);
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.<br />
Typical unit code(s): C62
     */
    public Builder numberOfForwardGears(QuantitativeValue quantitativeValue) {
      this.numberOfForwardGears.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    public Builder isAccessoryOrSparePartFor(Product product) {
      this.isAccessoryOrSparePartFor = product;
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    public Builder brand(Organization organization) {
      this.brand.setOrganization(organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    public Builder brand(Brand brand) {
      this.brand.setBrand(brand);
      return this;
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
     */
    public Builder vehicleTransmission(String vehicleTransmission) {
      this.vehicleTransmission.setString(vehicleTransmission);
      return this;
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
     */
    public Builder vehicleTransmission(QualitativeValue qualitativeValue) {
      this.vehicleTransmission.setQualitativeValue(qualitativeValue);
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    public Builder manufacturer(Organization organization) {
      this.manufacturer = organization;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    public Builder additionalProperty(PropertyValue propertyValue) {
      this.additionalProperty = propertyValue;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
      <br /><br />
      Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
      example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
      represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
      between the page and the primary entity.
      <br /><br />

      Related properties include sameAs, about, and url.
      <br /><br />

      The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
      official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
      to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
      serves more to clarify which of several entities is the main one for that page.
      <br /><br />

      mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
      for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
      mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
      <br /><br />

      about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
      while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
      describes some other entity. For example, one web page may display a news article about a particular person.
      Another page may display a product review for a particular product. In these cases, mainEntity for the pages
      should refer to the news article or review, respectively, while about would more properly refer to the person or product.
      
     */
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
      <br /><br />
      Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
      example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
      represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
      between the page and the primary entity.
      <br /><br />

      Related properties include sameAs, about, and url.
      <br /><br />

      The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
      official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
      to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
      serves more to clarify which of several entities is the main one for that page.
      <br /><br />

      mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
      for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
      mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
      <br /><br />

      about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
      while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
      describes some other entity. For example, one web page may display a news article about a particular person.
      Another page may display a product review for a particular product. In these cases, mainEntity for the pages
      should refer to the news article or review, respectively, while about would more properly refer to the person or product.
      
     */
    public Builder mainEntityOfPage(CreativeWork creativeWork) {
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * The date of the first registration of the vehicle with the respective public authorities.
     */
    public Builder dateVehicleFirstRegistered(java.util.Date date) {
      this.dateVehicleFirstRegistered = date;
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.<br />
Typical unit code(s): C62
     */
    public Builder numberOfPreviousOwners(Number number) {
      this.numberOfPreviousOwners.setNumber(number);
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.<br />
Typical unit code(s): C62
     */
    public Builder numberOfPreviousOwners(QuantitativeValue quantitativeValue) {
      this.numberOfPreviousOwners.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    public Builder model(ProductModel productModel) {
      this.model.setProductModel(productModel);
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    public Builder model(String model) {
      this.model.setString(model);
      return this;
    }
    /**
     * The date of production of the item, e.g. vehicle.
     */
    public Builder productionDate(java.util.Date date) {
      this.productionDate = date;
      return this;
    }
    /**
     * The height of the item.
     */
    public Builder height(QuantitativeValue quantitativeValue) {
      this.height.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     */
    public Builder height(Distance distance) {
      this.height.setDistance(distance);
      return this;
    }
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.<br />
Typical unit code(s): KMT for kilometers, SMI for statute miles
     */
    public Builder mileageFromOdometer(QuantitativeValue quantitativeValue) {
      this.mileageFromOdometer = quantitativeValue;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     */
    public Builder releaseDate(java.util.Date date) {
      this.releaseDate = date;
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    public Builder fuelType(String fuelType) {
      this.fuelType.setString(fuelType);
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    public Builder fuelType(QualitativeValue qualitativeValue) {
      this.fuelType.setQualitativeValue(qualitativeValue);
      return this;
    }
    /**
     * The number or type of airbags in the vehicle.
     */
    public Builder numberOfAirbags(String numberOfAirbags) {
      this.numberOfAirbags.setString(numberOfAirbags);
      return this;
    }
    /**
     * The number or type of airbags in the vehicle.
     */
    public Builder numberOfAirbags(Number number) {
      this.numberOfAirbags.setNumber(number);
      return this;
    }
    /**
     * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
     */
    public Builder vehicleInteriorType(String vehicleInteriorType) {
      this.vehicleInteriorType = vehicleInteriorType;
      return this;
    }
    /**
     * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
     */
    public Builder vehicleConfiguration(String vehicleConfiguration) {
      this.vehicleConfiguration = vehicleConfiguration;
      return this;
    }
    private AggregateRating aggregateRating;
    private java.util.Date purchaseDate;
    private Review review;
    private String vehicleInteriorColor;
    private Product isSimilarTo;
    private String gtin14;
    private String vin;
    private String award;
    private StringOrDriveWheelConfigurationValue driveWheelConfiguration;
    private String color;
    private String gtin12;
    private String sku;
    private String knownVehicleDamages;
    private Action potentialAction;
    private NumberOrQuantitativeValue vehicleSeatingCapacity;
    private QuantitativeValue fuelEfficiency;
    private QuantitativeValue cargoVolume;
    private ThingOrStringOrPhysicalActivityCategory category;
    private NumberOrQuantitativeValue numberOfAxles;
    private SteeringPositionValue steeringPosition;
    private java.util.Date vehicleModelDate;
    private String mpn;
    private String gtin8;
    private Audience audience;
    private String url;
    private OfferItemCondition itemCondition;
    private Product isRelatedTo;
    private EngineSpecification vehicleEngine;
    private String gtin13;
    private String description;
    private Offer offers;
    private Product isConsumableFor;
    private QuantitativeValue weight;
    private QuantitativeValueOrDistance width;
    private QuantitativeValueOrDistance depth;
    private ImageObjectOrString logo;
    private String additionalType;
    private String sameAs;
    private NumberOrQuantitativeValue numberOfDoors;
    private String productID;
    private QuantitativeValue fuelConsumption;
    private NumberOrQuantitativeValue numberOfForwardGears;
    private Product isAccessoryOrSparePartFor;
    private OrganizationOrBrand brand;
    private StringOrQualitativeValue vehicleTransmission;
    private Organization manufacturer;
    private PropertyValue additionalProperty;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private java.util.Date dateVehicleFirstRegistered;
    private NumberOrQuantitativeValue numberOfPreviousOwners;
    private ProductModelOrString model;
    private java.util.Date productionDate;
    private QuantitativeValueOrDistance height;
    private QuantitativeValue mileageFromOdometer;
    private String alternateName;
    private java.util.Date releaseDate;
    private StringOrQualitativeValue fuelType;
    private StringOrNumber numberOfAirbags;
    private String vehicleInteriorType;
    private String vehicleConfiguration;
  }

  protected Car(AggregateRating aggregateRating, java.util.Date purchaseDate, Review review, String vehicleInteriorColor, Product isSimilarTo, String gtin14, String vin, String award, StringOrDriveWheelConfigurationValue driveWheelConfiguration, String color, String gtin12, String sku, String knownVehicleDamages, Action potentialAction, NumberOrQuantitativeValue vehicleSeatingCapacity, QuantitativeValue fuelEfficiency, QuantitativeValue cargoVolume, ThingOrStringOrPhysicalActivityCategory category, NumberOrQuantitativeValue numberOfAxles, SteeringPositionValue steeringPosition, java.util.Date vehicleModelDate, String mpn, String gtin8, Audience audience, String url, OfferItemCondition itemCondition, Product isRelatedTo, EngineSpecification vehicleEngine, String gtin13, String description, Offer offers, Product isConsumableFor, QuantitativeValue weight, QuantitativeValueOrDistance width, QuantitativeValueOrDistance depth, ImageObjectOrString logo, String additionalType, String sameAs, NumberOrQuantitativeValue numberOfDoors, String productID, QuantitativeValue fuelConsumption, NumberOrQuantitativeValue numberOfForwardGears, Product isAccessoryOrSparePartFor, OrganizationOrBrand brand, StringOrQualitativeValue vehicleTransmission, Organization manufacturer, PropertyValue additionalProperty, String name, StringOrCreativeWork mainEntityOfPage, java.util.Date dateVehicleFirstRegistered, NumberOrQuantitativeValue numberOfPreviousOwners, ProductModelOrString model, java.util.Date productionDate, QuantitativeValueOrDistance height, QuantitativeValue mileageFromOdometer, String alternateName, java.util.Date releaseDate, StringOrQualitativeValue fuelType, StringOrNumber numberOfAirbags, String vehicleInteriorType, String vehicleConfiguration) {
    super(purchaseDate, aggregateRating, review, vehicleInteriorColor, isSimilarTo, gtin14, vin, award, driveWheelConfiguration, color, gtin12, sku, knownVehicleDamages, potentialAction, vehicleSeatingCapacity, fuelEfficiency, cargoVolume, category, steeringPosition, numberOfAxles, vehicleModelDate, mpn, gtin8, audience, url, itemCondition, isRelatedTo, vehicleEngine, gtin13, description, offers, isConsumableFor, weight, width, depth, logo, additionalType, sameAs, numberOfDoors, productID, fuelConsumption, numberOfForwardGears, isAccessoryOrSparePartFor, brand, vehicleTransmission, manufacturer, additionalProperty, name, dateVehicleFirstRegistered, mainEntityOfPage, numberOfPreviousOwners, model, height, productionDate, mileageFromOdometer, alternateName, releaseDate, fuelType, vehicleInteriorType, numberOfAirbags, vehicleConfiguration);
  }
}
