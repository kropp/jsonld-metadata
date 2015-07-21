/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
 */
public class Vehicle extends Product {
  /**
   * The number of doors.<br />
Typical unit code(s): C62
   */
  public QuantitativeValue getNumberOfDoors() {
    return myNumberOfDoors;
  }
  /**
   * The number or type of airbags in the vehicle.
   */
  public Number getNumberOfAirbags() {
    return myNumberOfAirbags;
  }
  /**
   * The number of axles.<br />
Typical unit code(s): C62
   */
  public QuantitativeValue getNumberOfAxles() {
    return myNumberOfAxles;
  }
  /**
   * Information about the engine or engines of the vehicle.
   */
  public EngineSpecification getVehicleEngine() {
    return myVehicleEngine;
  }
  /**
   * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).<br />
Note 1: There are unfortunately no standard unit codes for liters per 100 km.<br />
Use <a href="unitText">unitText</a> to indicate the unit of measurement, e.g. L/100 km.
Note 2: There are two ways of indicating the fuel consumption, <a href="fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a href="fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.<br />
Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a href="valueReference">valueReference</a> to link the value for the fuel consumption to another value.
   */
  public QuantitativeValue getFuelConsumption() {
    return myFuelConsumption;
  }
  /**
   * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).<br />
Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter.<br />
Use <a href="unitText">unitText</a> to indicate the unit of measurement, e.g. mpg or km/L.
Note 2: There are two ways of indicating the fuel consumption, <a href="fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a href="fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.<br />
Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a href="valueReference">valueReference</a> to link the value for the fuel economy to another value.
   */
  public QuantitativeValue getFuelEfficiency() {
    return myFuelEfficiency;
  }
  /**
   * The total number of forward gears available for the transmission system of the vehicle.<br />
Typical unit code(s): C62
   */
  public QuantitativeValue getNumberOfForwardGears() {
    return myNumberOfForwardGears;
  }
  /**
   * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
   */
  public String getVin() {
    return myVin;
  }
  /**
   * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.<br />
Typical unit code(s): LTR for liters, FTQ for cubic foot/feet<br />

Note: You can use <a href="minValue">minValue</a> and <a href="maxValue">maxValue</a> to indicate ranges.
   */
  public QuantitativeValue getCargoVolume() {
    return myCargoVolume;
  }
  /**
   * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
   */
  public String getVehicleConfiguration() {
    return myVehicleConfiguration;
  }
  /**
   * A textual description of known damages, both repaired and unrepaired.
   */
  public String getKnownVehicleDamages() {
    return myKnownVehicleDamages;
  }
  /**
   * The date of the first registration of the vehicle with the respective public authorities.
   */
  public java.util.Date getDateVehicleFirstRegistered() {
    return myDateVehicleFirstRegistered;
  }
  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
   */
  public DriveWheelConfigurationValue getDriveWheelConfiguration() {
    return myDriveWheelConfiguration;
  }
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
   */
  public String getFuelType() {
    return myFuelType;
  }
  /**
   * The color or color combination of the interior of the vehicle.
   */
  public String getVehicleInteriorColor() {
    return myVehicleInteriorColor;
  }
  /**
   * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
   */
  public String getVehicleInteriorType() {
    return myVehicleInteriorType;
  }
  /**
   * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.<br />
Typical unit code(s): KMT for kilometers, SMI for statute miles
   */
  public QuantitativeValue getMileageFromOdometer() {
    return myMileageFromOdometer;
  }
  /**
   * The release date of a vehicle model (often used to differentiate versions of the same make and model).
   */
  public java.util.Date getVehicleModelDate() {
    return myVehicleModelDate;
  }
  /**
   * The number of owners of the vehicle, including the current one.<br />
Typical unit code(s): C62
   */
  public QuantitativeValue getNumberOfPreviousOwners() {
    return myNumberOfPreviousOwners;
  }
  /**
   * The date of production of the item, e.g. vehicle.
   */
  public java.util.Date getProductionDate() {
    return myProductionDate;
  }
  /**
   * The date the item e.g. vehicle was purchased by the current owner.
   */
  public java.util.Date getPurchaseDate() {
    return myPurchaseDate;
  }
  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.<br />
Typical unit code(s): C62 for persons 
   */
  public QuantitativeValue getVehicleSeatingCapacity() {
    return myVehicleSeatingCapacity;
  }
  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
   */
  public String getVehicleTransmission() {
    return myVehicleTransmission;
  }
  /**
   * The position of the steering wheel or similar device (mostly for cars).
   */
  public SteeringPositionValue getSteeringPosition() {
    return mySteeringPosition;
  }
  /**
   * Builder for {@see Vehicle}
   */
  public static final class Builder {
    public Vehicle build() {
      return new Vehicle(review, numberOfAxles, productID, offers, vin, fuelEfficiency, fuelConsumption, itemCondition, additionalType, numberOfPreviousOwners, logo, image, vehicleConfiguration, vehicleModelDate, isAccessoryOrSparePartFor, gtin12, vehicleInteriorColor, brand, gtin13, alternateName, isConsumableFor, gtin14, url, gtin8, isSimilarTo, vehicleTransmission, driveWheelConfiguration, depth, mileageFromOdometer, additionalProperty, numberOfDoors, productionDate, width, steeringPosition, vehicleSeatingCapacity, potentialAction, weight, audience, isRelatedTo, fuelType, knownVehicleDamages, cargoVolume, vehicleInteriorType, description, model, mainEntityOfPage, manufacturer, color, purchaseDate, numberOfAirbags, aggregateRating, sameAs, numberOfForwardGears, vehicleEngine, dateVehicleFirstRegistered, height, releaseDate, name, category, sku, mpn, award);
    }
    /**
     * A review of the item.
     */
    public Builder review(Review value) {
      review = value;
      return this;
    }
    /**
     * The number of axles.<br />
Typical unit code(s): C62
     */
    public Builder numberOfAxles(QuantitativeValue value) {
      numberOfAxles = value;
      return this;
    }
    /**
     * The product identifier, such as ISBN. For example: <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>.
     */
    public Builder productID(String value) {
      productID = value;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer value) {
      offers = value;
      return this;
    }
    /**
     * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
     */
    public Builder vin(String value) {
      vin = value;
      return this;
    }
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).<br />
Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter.<br />
Use <a href="unitText">unitText</a> to indicate the unit of measurement, e.g. mpg or km/L.
Note 2: There are two ways of indicating the fuel consumption, <a href="fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a href="fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.<br />
Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a href="valueReference">valueReference</a> to link the value for the fuel economy to another value.
     */
    public Builder fuelEfficiency(QuantitativeValue value) {
      fuelEfficiency = value;
      return this;
    }
    /**
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).<br />
Note 1: There are unfortunately no standard unit codes for liters per 100 km.<br />
Use <a href="unitText">unitText</a> to indicate the unit of measurement, e.g. L/100 km.
Note 2: There are two ways of indicating the fuel consumption, <a href="fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a href="fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.<br />
Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a href="valueReference">valueReference</a> to link the value for the fuel consumption to another value.
     */
    public Builder fuelConsumption(QuantitativeValue value) {
      fuelConsumption = value;
      return this;
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    public Builder itemCondition(OfferItemCondition value) {
      itemCondition = value;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * The number of owners of the vehicle, including the current one.<br />
Typical unit code(s): C62
     */
    public Builder numberOfPreviousOwners(QuantitativeValue value) {
      numberOfPreviousOwners = value;
      return this;
    }
    /**
     * An associated logo.
     */
    public Builder logo(ImageObject value) {
      logo = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
     */
    public Builder vehicleConfiguration(String value) {
      vehicleConfiguration = value;
      return this;
    }
    /**
     * The release date of a vehicle model (often used to differentiate versions of the same make and model).
     */
    public Builder vehicleModelDate(java.util.Date value) {
      vehicleModelDate = value;
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    public Builder isAccessoryOrSparePartFor(Product value) {
      isAccessoryOrSparePartFor = value;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin12(String value) {
      gtin12 = value;
      return this;
    }
    /**
     * The color or color combination of the interior of the vehicle.
     */
    public Builder vehicleInteriorColor(String value) {
      vehicleInteriorColor = value;
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    public Builder brand(Brand value) {
      brand = value;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin13(String value) {
      gtin13 = value;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    public Builder isConsumableFor(Product value) {
      isConsumableFor = value;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin14(String value) {
      gtin14 = value;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin8(String value) {
      gtin8 = value;
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    public Builder isSimilarTo(Product value) {
      isSimilarTo = value;
      return this;
    }
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
     */
    public Builder vehicleTransmission(String value) {
      vehicleTransmission = value;
      return this;
    }
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     */
    public Builder driveWheelConfiguration(DriveWheelConfigurationValue value) {
      driveWheelConfiguration = value;
      return this;
    }
    /**
     * The depth of the item.
     */
    public Builder depth(Distance value) {
      depth = value;
      return this;
    }
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.<br />
Typical unit code(s): KMT for kilometers, SMI for statute miles
     */
    public Builder mileageFromOdometer(QuantitativeValue value) {
      mileageFromOdometer = value;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    public Builder additionalProperty(PropertyValue value) {
      additionalProperty = value;
      return this;
    }
    /**
     * The number of doors.<br />
Typical unit code(s): C62
     */
    public Builder numberOfDoors(QuantitativeValue value) {
      numberOfDoors = value;
      return this;
    }
    /**
     * The date of production of the item, e.g. vehicle.
     */
    public Builder productionDate(java.util.Date value) {
      productionDate = value;
      return this;
    }
    /**
     * The width of the item.
     */
    public Builder width(Distance value) {
      width = value;
      return this;
    }
    /**
     * The position of the steering wheel or similar device (mostly for cars).
     */
    public Builder steeringPosition(SteeringPositionValue value) {
      steeringPosition = value;
      return this;
    }
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.<br />
Typical unit code(s): C62 for persons 
     */
    public Builder vehicleSeatingCapacity(QuantitativeValue value) {
      vehicleSeatingCapacity = value;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * The weight of the product or person.
     */
    public Builder weight(QuantitativeValue value) {
      weight = value;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience value) {
      audience = value;
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    public Builder isRelatedTo(Product value) {
      isRelatedTo = value;
      return this;
    }
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    public Builder fuelType(String value) {
      fuelType = value;
      return this;
    }
    /**
     * A textual description of known damages, both repaired and unrepaired.
     */
    public Builder knownVehicleDamages(String value) {
      knownVehicleDamages = value;
      return this;
    }
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.<br />
Typical unit code(s): LTR for liters, FTQ for cubic foot/feet<br />

Note: You can use <a href="minValue">minValue</a> and <a href="maxValue">maxValue</a> to indicate ranges.
     */
    public Builder cargoVolume(QuantitativeValue value) {
      cargoVolume = value;
      return this;
    }
    /**
     * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
     */
    public Builder vehicleInteriorType(String value) {
      vehicleInteriorType = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    public Builder model(ProductModel value) {
      model = value;
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
    public Builder mainEntityOfPage(CreativeWork value) {
      mainEntityOfPage = value;
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    public Builder manufacturer(Organization value) {
      manufacturer = value;
      return this;
    }
    /**
     * The color of the product.
     */
    public Builder color(String value) {
      color = value;
      return this;
    }
    /**
     * The date the item e.g. vehicle was purchased by the current owner.
     */
    public Builder purchaseDate(java.util.Date value) {
      purchaseDate = value;
      return this;
    }
    /**
     * The number or type of airbags in the vehicle.
     */
    public Builder numberOfAirbags(Number value) {
      numberOfAirbags = value;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating value) {
      aggregateRating = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * The total number of forward gears available for the transmission system of the vehicle.<br />
Typical unit code(s): C62
     */
    public Builder numberOfForwardGears(QuantitativeValue value) {
      numberOfForwardGears = value;
      return this;
    }
    /**
     * Information about the engine or engines of the vehicle.
     */
    public Builder vehicleEngine(EngineSpecification value) {
      vehicleEngine = value;
      return this;
    }
    /**
     * The date of the first registration of the vehicle with the respective public authorities.
     */
    public Builder dateVehicleFirstRegistered(java.util.Date value) {
      dateVehicleFirstRegistered = value;
      return this;
    }
    /**
     * The height of the item.
     */
    public Builder height(Distance value) {
      height = value;
      return this;
    }
    /**
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     */
    public Builder releaseDate(java.util.Date value) {
      releaseDate = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(PhysicalActivityCategory value) {
      category = value;
      return this;
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    public Builder sku(String value) {
      sku = value;
      return this;
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    public Builder mpn(String value) {
      mpn = value;
      return this;
    }
    /**
     * An award won by or for this item.
     */
    public Builder award(String value) {
      award = value;
      return this;
    }
    private Review review;
    private QuantitativeValue numberOfAxles;
    private String productID;
    private Offer offers;
    private String vin;
    private QuantitativeValue fuelEfficiency;
    private QuantitativeValue fuelConsumption;
    private OfferItemCondition itemCondition;
    private String additionalType;
    private QuantitativeValue numberOfPreviousOwners;
    private ImageObject logo;
    private Image image;
    private String vehicleConfiguration;
    private java.util.Date vehicleModelDate;
    private Product isAccessoryOrSparePartFor;
    private String gtin12;
    private String vehicleInteriorColor;
    private Brand brand;
    private String gtin13;
    private String alternateName;
    private Product isConsumableFor;
    private String gtin14;
    private String url;
    private String gtin8;
    private Product isSimilarTo;
    private String vehicleTransmission;
    private DriveWheelConfigurationValue driveWheelConfiguration;
    private Distance depth;
    private QuantitativeValue mileageFromOdometer;
    private PropertyValue additionalProperty;
    private QuantitativeValue numberOfDoors;
    private java.util.Date productionDate;
    private Distance width;
    private SteeringPositionValue steeringPosition;
    private QuantitativeValue vehicleSeatingCapacity;
    private Action potentialAction;
    private QuantitativeValue weight;
    private Audience audience;
    private Product isRelatedTo;
    private String fuelType;
    private String knownVehicleDamages;
    private QuantitativeValue cargoVolume;
    private String vehicleInteriorType;
    private String description;
    private ProductModel model;
    private CreativeWork mainEntityOfPage;
    private Organization manufacturer;
    private String color;
    private java.util.Date purchaseDate;
    private Number numberOfAirbags;
    private AggregateRating aggregateRating;
    private String sameAs;
    private QuantitativeValue numberOfForwardGears;
    private EngineSpecification vehicleEngine;
    private java.util.Date dateVehicleFirstRegistered;
    private Distance height;
    private java.util.Date releaseDate;
    private String name;
    private PhysicalActivityCategory category;
    private String sku;
    private String mpn;
    private String award;
  }

  protected Vehicle(Review review, QuantitativeValue numberOfAxles, String productID, Offer offers, String vin, QuantitativeValue fuelEfficiency, QuantitativeValue fuelConsumption, OfferItemCondition itemCondition, String additionalType, QuantitativeValue numberOfPreviousOwners, ImageObject logo, Image image, String vehicleConfiguration, java.util.Date vehicleModelDate, Product isAccessoryOrSparePartFor, String gtin12, String vehicleInteriorColor, Brand brand, String gtin13, String alternateName, Product isConsumableFor, String gtin14, String url, String gtin8, Product isSimilarTo, String vehicleTransmission, DriveWheelConfigurationValue driveWheelConfiguration, Distance depth, QuantitativeValue mileageFromOdometer, PropertyValue additionalProperty, QuantitativeValue numberOfDoors, java.util.Date productionDate, Distance width, SteeringPositionValue steeringPosition, QuantitativeValue vehicleSeatingCapacity, Action potentialAction, QuantitativeValue weight, Audience audience, Product isRelatedTo, String fuelType, String knownVehicleDamages, QuantitativeValue cargoVolume, String vehicleInteriorType, String description, ProductModel model, CreativeWork mainEntityOfPage, Organization manufacturer, String color, java.util.Date purchaseDate, Number numberOfAirbags, AggregateRating aggregateRating, String sameAs, QuantitativeValue numberOfForwardGears, EngineSpecification vehicleEngine, java.util.Date dateVehicleFirstRegistered, Distance height, java.util.Date releaseDate, String name, PhysicalActivityCategory category, String sku, String mpn, String award) {
    super(review, productionDate, width, productID, offers, itemCondition, potentialAction, weight, audience, additionalType, logo, isRelatedTo, image, description, isAccessoryOrSparePartFor, gtin12, model, brand, mainEntityOfPage, manufacturer, gtin13, color, purchaseDate, alternateName, isConsumableFor, url, gtin14, gtin8, sameAs, aggregateRating, isSimilarTo, height, releaseDate, name, depth, category, additionalProperty, sku, mpn, award);
    myNumberOfDoors = numberOfDoors;
    myNumberOfAirbags = numberOfAirbags;
    myNumberOfAxles = numberOfAxles;
    myVehicleEngine = vehicleEngine;
    myFuelConsumption = fuelConsumption;
    myFuelEfficiency = fuelEfficiency;
    myNumberOfForwardGears = numberOfForwardGears;
    myVin = vin;
    myCargoVolume = cargoVolume;
    myVehicleConfiguration = vehicleConfiguration;
    myKnownVehicleDamages = knownVehicleDamages;
    myDateVehicleFirstRegistered = dateVehicleFirstRegistered;
    myDriveWheelConfiguration = driveWheelConfiguration;
    myFuelType = fuelType;
    myVehicleInteriorColor = vehicleInteriorColor;
    myVehicleInteriorType = vehicleInteriorType;
    myMileageFromOdometer = mileageFromOdometer;
    myVehicleModelDate = vehicleModelDate;
    myNumberOfPreviousOwners = numberOfPreviousOwners;
    myProductionDate = productionDate;
    myPurchaseDate = purchaseDate;
    myVehicleSeatingCapacity = vehicleSeatingCapacity;
    myVehicleTransmission = vehicleTransmission;
    mySteeringPosition = steeringPosition;
  }
  private QuantitativeValue myNumberOfDoors;
  private Number myNumberOfAirbags;
  private QuantitativeValue myNumberOfAxles;
  private EngineSpecification myVehicleEngine;
  private QuantitativeValue myFuelConsumption;
  private QuantitativeValue myFuelEfficiency;
  private QuantitativeValue myNumberOfForwardGears;
  private String myVin;
  private QuantitativeValue myCargoVolume;
  private String myVehicleConfiguration;
  private String myKnownVehicleDamages;
  private java.util.Date myDateVehicleFirstRegistered;
  private DriveWheelConfigurationValue myDriveWheelConfiguration;
  private String myFuelType;
  private String myVehicleInteriorColor;
  private String myVehicleInteriorType;
  private QuantitativeValue myMileageFromOdometer;
  private java.util.Date myVehicleModelDate;
  private QuantitativeValue myNumberOfPreviousOwners;
  private java.util.Date myProductionDate;
  private java.util.Date myPurchaseDate;
  private QuantitativeValue myVehicleSeatingCapacity;
  private String myVehicleTransmission;
  private SteeringPositionValue mySteeringPosition;
}
