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
 * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class Demand extends Intangible {
  /**
   * The payment method(s) accepted by seller for this offer.
   */
  public PaymentMethod getAcceptedPaymentMethod() {
    return myAcceptedPaymentMethod;
  }
  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
   */
  public QuantitativeValue getAdvanceBookingRequirement() {
    return myAdvanceBookingRequirement;
  }
  /**
   * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
   */
  public ItemAvailability getAvailability() {
    return myAvailability;
  }
  /**
   * The end of the availability of the product or service included in the offer.
   */
  public java.util.Date getAvailabilityEnds() {
    return myAvailabilityEnds;
  }
  /**
   * The beginning of the availability of the product or service included in the offer.
   */
  public java.util.Date getAvailabilityStarts() {
    return myAvailabilityStarts;
  }
  /**
   * The place(s) from which the offer can be obtained (e.g. store locations).
   */
  public Place getAvailableAtOrFrom() {
    return myAvailableAtOrFrom;
  }
  /**
   * The delivery method(s) available for this offer.
   */
  public DeliveryMethod getAvailableDeliveryMethod() {
    return myAvailableDeliveryMethod;
  }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   */
  public BusinessFunction getBusinessFunction() {
    return myBusinessFunction;
  }
  /**
   * The typical delay between the receipt of the order and the goods leaving the warehouse.
   */
  public QuantitativeValue getDeliveryLeadTime() {
    return myDeliveryLeadTime;
  }
  /**
   * The type(s) of customers for which the given offer is valid.
   */
  public BusinessEntityType getEligibleCustomerType() {
    return myEligibleCustomerType;
  }
  /**
   * The duration for which the given offer is valid.
   */
  public QuantitativeValue getEligibleDuration() {
    return myEligibleDuration;
  }
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  public QuantitativeValue getEligibleQuantity() {
    return myEligibleQuantity;
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   */
  public PlaceOrGeoShapeOrString getEligibleRegion() {
    return myEligibleRegion;
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   */
  public PlaceOrGeoShapeOrString getIneligibleRegion() {
    return myIneligibleRegion;
  }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  public PriceSpecification getEligibleTransactionVolume() {
    return myEligibleTransactionVolume;
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String getGtin12() {
    return myGtin12;
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String getGtin13() {
    return myGtin13;
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String getGtin14() {
    return myGtin14;
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String getGtin8() {
    return myGtin8;
  }
  /**
   * This links to a node or nodes indicating the exact quantity of the products included in the offer.
   */
  public TypeAndQuantityNode getIncludesObject() {
    return myIncludesObject;
  }
  /**
   * The current approximate inventory level for the item or items.
   */
  public QuantitativeValue getInventoryLevel() {
    return myInventoryLevel;
  }
  /**
   * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
   */
  public OfferItemCondition getItemCondition() {
    return myItemCondition;
  }
  /**
   * The item being offered.
   */
  public Product getItemOffered() {
    return myItemOffered;
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   */
  public String getMpn() {
    return myMpn;
  }
  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
   */
  public PriceSpecification getPriceSpecification() {
    return myPriceSpecification;
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  public Participant getSeller() {
    return mySeller;
  }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   */
  public String getSku() {
    return mySku;
  }
  /**
   * The date when the item becomes valid.
   */
  public java.util.Date getValidFrom() {
    return myValidFrom;
  }
  /**
   * The end of the validity of offer, price specification, or opening hours data.
   */
  public java.util.Date getValidThrough() {
    return myValidThrough;
  }
  /**
   * The warranty promise(s) included in the offer.
   */
  public WarrantyPromise getWarranty() {
    return myWarranty;
  }
  /**
   * Builder for {@link Demand}
   */
  public static final class Builder {
    /**
     * Creates new {@link Demand} instance.
     */
    public Demand build() {
      return new Demand(availabilityEnds, availableDeliveryMethod, acceptedPaymentMethod, businessFunction, gtin14, seller, deliveryLeadTime, sameAs, additionalType, gtin12, validThrough, eligibleDuration, availabilityStarts, sku, potentialAction, eligibleQuantity, availableAtOrFrom, advanceBookingRequirement, name, mpn, includesObject, eligibleTransactionVolume, mainEntityOfPage, itemOffered, ineligibleRegion, availability, gtin8, eligibleRegion, url, validFrom, itemCondition, alternateName, eligibleCustomerType, inventoryLevel, gtin13, description, priceSpecification, warranty);
    }
    /**
     * The end of the availability of the product or service included in the offer.
     */
    public Builder availabilityEnds(java.util.Date date) {
      this.availabilityEnds = date;
      return this;
    }
    /**
     * The delivery method(s) available for this offer.
     */
    public Builder availableDeliveryMethod(DeliveryMethod deliveryMethod) {
      this.availableDeliveryMethod = deliveryMethod;
      return this;
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     */
    public Builder acceptedPaymentMethod(PaymentMethod paymentMethod) {
      this.acceptedPaymentMethod = paymentMethod;
      return this;
    }
    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    public Builder businessFunction(BusinessFunction businessFunction) {
      this.businessFunction = businessFunction;
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
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    public Builder seller(Participant participant) {
      this.seller = participant;
      return this;
    }
    /**
     * The typical delay between the receipt of the order and the goods leaving the warehouse.
     */
    public Builder deliveryLeadTime(QuantitativeValue quantitativeValue) {
      this.deliveryLeadTime = quantitativeValue;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * The end of the validity of offer, price specification, or opening hours data.
     */
    public Builder validThrough(java.util.Date date) {
      this.validThrough = date;
      return this;
    }
    /**
     * The duration for which the given offer is valid.
     */
    public Builder eligibleDuration(QuantitativeValue quantitativeValue) {
      this.eligibleDuration = quantitativeValue;
      return this;
    }
    /**
     * The beginning of the availability of the product or service included in the offer.
     */
    public Builder availabilityStarts(java.util.Date date) {
      this.availabilityStarts = date;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    public Builder eligibleQuantity(QuantitativeValue quantitativeValue) {
      this.eligibleQuantity = quantitativeValue;
      return this;
    }
    /**
     * The place(s) from which the offer can be obtained (e.g. store locations).
     */
    public Builder availableAtOrFrom(Place place) {
      this.availableAtOrFrom = place;
      return this;
    }
    /**
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     */
    public Builder advanceBookingRequirement(QuantitativeValue quantitativeValue) {
      this.advanceBookingRequirement = quantitativeValue;
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
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    public Builder mpn(String mpn) {
      this.mpn = mpn;
      return this;
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in the offer.
     */
    public Builder includesObject(TypeAndQuantityNode typeAndQuantityNode) {
      this.includesObject = typeAndQuantityNode;
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    public Builder eligibleTransactionVolume(PriceSpecification priceSpecification) {
      this.eligibleTransactionVolume = priceSpecification;
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
     * The item being offered.
     */
    public Builder itemOffered(Product product) {
      this.itemOffered = product;
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    public Builder ineligibleRegion(Place place) {
      this.ineligibleRegion.setPlace(place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    public Builder ineligibleRegion(GeoShape geoShape) {
      this.ineligibleRegion.setGeoShape(geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    public Builder ineligibleRegion(String ineligibleRegion) {
      this.ineligibleRegion.setString(ineligibleRegion);
      return this;
    }
    /**
     * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
     */
    public Builder availability(ItemAvailability itemAvailability) {
      this.availability = itemAvailability;
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
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    public Builder eligibleRegion(Place place) {
      this.eligibleRegion.setPlace(place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    public Builder eligibleRegion(GeoShape geoShape) {
      this.eligibleRegion.setGeoShape(geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    public Builder eligibleRegion(String eligibleRegion) {
      this.eligibleRegion.setString(eligibleRegion);
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
     * The date when the item becomes valid.
     */
    public Builder validFrom(java.util.Date date) {
      this.validFrom = date;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * The type(s) of customers for which the given offer is valid.
     */
    public Builder eligibleCustomerType(BusinessEntityType businessEntityType) {
      this.eligibleCustomerType = businessEntityType;
      return this;
    }
    /**
     * The current approximate inventory level for the item or items.
     */
    public Builder inventoryLevel(QuantitativeValue quantitativeValue) {
      this.inventoryLevel = quantitativeValue;
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
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     */
    public Builder priceSpecification(PriceSpecification priceSpecification) {
      this.priceSpecification = priceSpecification;
      return this;
    }
    /**
     * The warranty promise(s) included in the offer.
     */
    public Builder warranty(WarrantyPromise warrantyPromise) {
      this.warranty = warrantyPromise;
      return this;
    }
    private java.util.Date availabilityEnds;
    private DeliveryMethod availableDeliveryMethod;
    private PaymentMethod acceptedPaymentMethod;
    private BusinessFunction businessFunction;
    private String gtin14;
    private Participant seller;
    private QuantitativeValue deliveryLeadTime;
    private String sameAs;
    private String additionalType;
    private String gtin12;
    private java.util.Date validThrough;
    private QuantitativeValue eligibleDuration;
    private java.util.Date availabilityStarts;
    private String sku;
    private Action potentialAction;
    private QuantitativeValue eligibleQuantity;
    private Place availableAtOrFrom;
    private QuantitativeValue advanceBookingRequirement;
    private String name;
    private String mpn;
    private TypeAndQuantityNode includesObject;
    private PriceSpecification eligibleTransactionVolume;
    private StringOrCreativeWork mainEntityOfPage;
    private Product itemOffered;
    private PlaceOrGeoShapeOrString ineligibleRegion;
    private ItemAvailability availability;
    private String gtin8;
    private PlaceOrGeoShapeOrString eligibleRegion;
    private String url;
    private java.util.Date validFrom;
    private OfferItemCondition itemCondition;
    private String alternateName;
    private BusinessEntityType eligibleCustomerType;
    private QuantitativeValue inventoryLevel;
    private String gtin13;
    private String description;
    private PriceSpecification priceSpecification;
    private WarrantyPromise warranty;
  }

  protected Demand(java.util.Date availabilityEnds, DeliveryMethod availableDeliveryMethod, PaymentMethod acceptedPaymentMethod, BusinessFunction businessFunction, String gtin14, Participant seller, QuantitativeValue deliveryLeadTime, String sameAs, String additionalType, String gtin12, java.util.Date validThrough, QuantitativeValue eligibleDuration, java.util.Date availabilityStarts, String sku, Action potentialAction, QuantitativeValue eligibleQuantity, Place availableAtOrFrom, QuantitativeValue advanceBookingRequirement, String name, String mpn, TypeAndQuantityNode includesObject, PriceSpecification eligibleTransactionVolume, StringOrCreativeWork mainEntityOfPage, Product itemOffered, PlaceOrGeoShapeOrString ineligibleRegion, ItemAvailability availability, String gtin8, PlaceOrGeoShapeOrString eligibleRegion, String url, java.util.Date validFrom, OfferItemCondition itemCondition, String alternateName, BusinessEntityType eligibleCustomerType, QuantitativeValue inventoryLevel, String gtin13, String description, PriceSpecification priceSpecification, WarrantyPromise warranty) {
    super(additionalType, url, sameAs, alternateName, description, potentialAction, name, mainEntityOfPage);
    myAcceptedPaymentMethod = acceptedPaymentMethod;
    myAdvanceBookingRequirement = advanceBookingRequirement;
    myAvailability = availability;
    myAvailabilityEnds = availabilityEnds;
    myAvailabilityStarts = availabilityStarts;
    myAvailableAtOrFrom = availableAtOrFrom;
    myAvailableDeliveryMethod = availableDeliveryMethod;
    myBusinessFunction = businessFunction;
    myDeliveryLeadTime = deliveryLeadTime;
    myEligibleCustomerType = eligibleCustomerType;
    myEligibleDuration = eligibleDuration;
    myEligibleQuantity = eligibleQuantity;
    myEligibleRegion = eligibleRegion;
    myIneligibleRegion = ineligibleRegion;
    myEligibleTransactionVolume = eligibleTransactionVolume;
    myGtin12 = gtin12;
    myGtin13 = gtin13;
    myGtin14 = gtin14;
    myGtin8 = gtin8;
    myIncludesObject = includesObject;
    myInventoryLevel = inventoryLevel;
    myItemCondition = itemCondition;
    myItemOffered = itemOffered;
    myMpn = mpn;
    myPriceSpecification = priceSpecification;
    mySeller = seller;
    mySku = sku;
    myValidFrom = validFrom;
    myValidThrough = validThrough;
    myWarranty = warranty;
  }
  private PaymentMethod myAcceptedPaymentMethod;
  private QuantitativeValue myAdvanceBookingRequirement;
  private ItemAvailability myAvailability;
  private java.util.Date myAvailabilityEnds;
  private java.util.Date myAvailabilityStarts;
  private Place myAvailableAtOrFrom;
  private DeliveryMethod myAvailableDeliveryMethod;
  private BusinessFunction myBusinessFunction;
  private QuantitativeValue myDeliveryLeadTime;
  private BusinessEntityType myEligibleCustomerType;
  private QuantitativeValue myEligibleDuration;
  private QuantitativeValue myEligibleQuantity;
  private PlaceOrGeoShapeOrString myEligibleRegion;
  private PlaceOrGeoShapeOrString myIneligibleRegion;
  private PriceSpecification myEligibleTransactionVolume;
  private String myGtin12;
  private String myGtin13;
  private String myGtin14;
  private String myGtin8;
  private TypeAndQuantityNode myIncludesObject;
  private QuantitativeValue myInventoryLevel;
  private OfferItemCondition myItemCondition;
  private Product myItemOffered;
  private String myMpn;
  private PriceSpecification myPriceSpecification;
  private Participant mySeller;
  private String mySku;
  private java.util.Date myValidFrom;
  private java.util.Date myValidThrough;
  private WarrantyPromise myWarranty;
}
