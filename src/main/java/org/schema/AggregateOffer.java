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
 */

package org.schema;

/**
 * When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.
 */
public class AggregateOffer extends Offer {
  /**
   * The highest price of all offers available.
   */
  public NumberOrString getHighPrice() {
    return myHighPrice;
  }
  /**
   * The lowest price of all offers available.
   */
  public NumberOrString getLowPrice() {
    return myLowPrice;
  }
  /**
   * The number of offers for the product.
   */
  public Integer getOfferCount() {
    return myOfferCount;
  }
  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
   */
  public Offer getOffers() {
    return myOffers;
  }
  /**
   * Builder for {@link AggregateOffer}
   */
  public static final class Builder {
    /**
     * Creates new {@link AggregateOffer} instance.
     */
    public AggregateOffer build() {
      return new AggregateOffer(highPrice, lowPrice, offerCount, offers, acceptedPaymentMethod, addOn, advanceBookingRequirement, aggregateRating, availability, availabilityEnds, availabilityStarts, availableAtOrFrom, availableDeliveryMethod, businessFunction, category, deliveryLeadTime, eligibleCustomerType, eligibleDuration, eligibleQuantity, eligibleRegion, ineligibleRegion, eligibleTransactionVolume, gtin12, gtin13, gtin14, gtin8, includesObject, inventoryLevel, itemCondition, itemOffered, mpn, price, priceSpecification, priceValidUntil, review, seller, sku, validFrom, validThrough, warranty, priceCurrency, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
    }
    /**
     * The highest price of all offers available.
     */
    public Builder highPrice(Number number) {
      if(this.highPrice == null) this.highPrice = new NumberOrString();
      this.highPrice.setNumber(number);
      return this;
    }
    /**
     * The highest price of all offers available.
     */
    public Builder highPrice(String highPrice) {
      if(this.highPrice == null) this.highPrice = new NumberOrString();
      this.highPrice.setString(highPrice);
      return this;
    }
    /**
     * The lowest price of all offers available.
     */
    public Builder lowPrice(Number number) {
      if(this.lowPrice == null) this.lowPrice = new NumberOrString();
      this.lowPrice.setNumber(number);
      return this;
    }
    /**
     * The lowest price of all offers available.
     */
    public Builder lowPrice(String lowPrice) {
      if(this.lowPrice == null) this.lowPrice = new NumberOrString();
      this.lowPrice.setString(lowPrice);
      return this;
    }
    /**
     * The number of offers for the product.
     */
    public Builder offerCount(Integer integer) {
      this.offerCount = integer;
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
     * The payment method(s) accepted by seller for this offer.
     */
    public Builder acceptedPaymentMethod(PaymentMethod paymentMethod) {
      this.acceptedPaymentMethod = paymentMethod;
      return this;
    }
    /**
     * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).
     */
    public Builder addOn(Offer offer) {
      this.addOn = offer;
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
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
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
     * The end of the availability of the product or service included in the offer.
     */
    public Builder availabilityEnds(java.util.Date date) {
      this.availabilityEnds = date;
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
     * The place(s) from which the offer can be obtained (e.g. store locations).
     */
    public Builder availableAtOrFrom(Place place) {
      this.availableAtOrFrom = place;
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
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    public Builder businessFunction(BusinessFunction businessFunction) {
      this.businessFunction = businessFunction;
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(PhysicalActivityCategory physicalActivityCategory) {
      if(this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setPhysicalActivityCategory(physicalActivityCategory);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(String category) {
      if(this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setString(category);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(Thing thing) {
      if(this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setThing(thing);
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
     * The type(s) of customers for which the given offer is valid.
     */
    public Builder eligibleCustomerType(BusinessEntityType businessEntityType) {
      this.eligibleCustomerType = businessEntityType;
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
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    public Builder eligibleQuantity(QuantitativeValue quantitativeValue) {
      this.eligibleQuantity = quantitativeValue;
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    public Builder eligibleRegion(GeoShape geoShape) {
      if(this.eligibleRegion == null) this.eligibleRegion = new GeoShapeOrPlaceOrString();
      this.eligibleRegion.setGeoShape(geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    public Builder eligibleRegion(Place place) {
      if(this.eligibleRegion == null) this.eligibleRegion = new GeoShapeOrPlaceOrString();
      this.eligibleRegion.setPlace(place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    public Builder eligibleRegion(String eligibleRegion) {
      if(this.eligibleRegion == null) this.eligibleRegion = new GeoShapeOrPlaceOrString();
      this.eligibleRegion.setString(eligibleRegion);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    public Builder ineligibleRegion(GeoShape geoShape) {
      if(this.ineligibleRegion == null) this.ineligibleRegion = new GeoShapeOrPlaceOrString();
      this.ineligibleRegion.setGeoShape(geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    public Builder ineligibleRegion(Place place) {
      if(this.ineligibleRegion == null) this.ineligibleRegion = new GeoShapeOrPlaceOrString();
      this.ineligibleRegion.setPlace(place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    public Builder ineligibleRegion(String ineligibleRegion) {
      if(this.ineligibleRegion == null) this.ineligibleRegion = new GeoShapeOrPlaceOrString();
      this.ineligibleRegion.setString(ineligibleRegion);
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
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin12(String gtin12) {
      this.gtin12 = gtin12;
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
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin14(String gtin14) {
      this.gtin14 = gtin14;
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
     * This links to a node or nodes indicating the exact quantity of the products included in the offer.
     */
    public Builder includesObject(TypeAndQuantityNode typeAndQuantityNode) {
      this.includesObject = typeAndQuantityNode;
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
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    public Builder itemCondition(OfferItemCondition offerItemCondition) {
      this.itemCondition = offerItemCondition;
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
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    public Builder mpn(String mpn) {
      this.mpn = mpn;
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
<br />
<br />
      Usage guidelines:
<br />
<ul>
<li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
      including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
</li>
<li>
      Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
</li>
<li>
      Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
      alongside more human-friendly formatting.
</li>
<li>
      Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
</li>
</ul>
      
     */
    public Builder price(Number number) {
      if(this.price == null) this.price = new NumberOrString();
      this.price.setNumber(number);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
<br />
<br />
      Usage guidelines:
<br />
<ul>
<li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
      including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
</li>
<li>
      Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
</li>
<li>
      Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
      alongside more human-friendly formatting.
</li>
<li>
      Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
</li>
</ul>
      
     */
    public Builder price(String price) {
      if(this.price == null) this.price = new NumberOrString();
      this.price.setString(price);
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
     * The date after which the price is no longer available.
     */
    public Builder priceValidUntil(java.util.Date date) {
      this.priceValidUntil = date;
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
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    public Builder seller(Participant participant) {
      this.seller = participant;
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
     * The date when the item becomes valid.
     */
    public Builder validFrom(java.util.Date date) {
      this.validFrom = date;
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
     * The warranty promise(s) included in the offer.
     */
    public Builder warranty(WarrantyPromise warrantyPromise) {
      this.warranty = warrantyPromise;
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    public Builder priceCurrency(String priceCurrency) {
      this.priceCurrency = priceCurrency;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
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
      if(this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
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
      if(this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    private NumberOrString highPrice;
    private NumberOrString lowPrice;
    private Integer offerCount;
    private Offer offers;
    private PaymentMethod acceptedPaymentMethod;
    private Offer addOn;
    private QuantitativeValue advanceBookingRequirement;
    private AggregateRating aggregateRating;
    private ItemAvailability availability;
    private java.util.Date availabilityEnds;
    private java.util.Date availabilityStarts;
    private Place availableAtOrFrom;
    private DeliveryMethod availableDeliveryMethod;
    private BusinessFunction businessFunction;
    private PhysicalActivityCategoryOrStringOrThing category;
    private QuantitativeValue deliveryLeadTime;
    private BusinessEntityType eligibleCustomerType;
    private QuantitativeValue eligibleDuration;
    private QuantitativeValue eligibleQuantity;
    private GeoShapeOrPlaceOrString eligibleRegion;
    private GeoShapeOrPlaceOrString ineligibleRegion;
    private PriceSpecification eligibleTransactionVolume;
    private String gtin12;
    private String gtin13;
    private String gtin14;
    private String gtin8;
    private TypeAndQuantityNode includesObject;
    private QuantitativeValue inventoryLevel;
    private OfferItemCondition itemCondition;
    private Product itemOffered;
    private String mpn;
    private NumberOrString price;
    private PriceSpecification priceSpecification;
    private java.util.Date priceValidUntil;
    private Review review;
    private Participant seller;
    private String sku;
    private java.util.Date validFrom;
    private java.util.Date validThrough;
    private WarrantyPromise warranty;
    private String priceCurrency;
    private String additionalType;
    private String alternateName;
    private String description;
    private CreativeWorkOrString mainEntityOfPage;
    private String name;
    private String sameAs;
    private String url;
    private Action potentialAction;
  }

  protected AggregateOffer(NumberOrString highPrice, NumberOrString lowPrice, Integer offerCount, Offer offers, PaymentMethod acceptedPaymentMethod, Offer addOn, QuantitativeValue advanceBookingRequirement, AggregateRating aggregateRating, ItemAvailability availability, java.util.Date availabilityEnds, java.util.Date availabilityStarts, Place availableAtOrFrom, DeliveryMethod availableDeliveryMethod, BusinessFunction businessFunction, PhysicalActivityCategoryOrStringOrThing category, QuantitativeValue deliveryLeadTime, BusinessEntityType eligibleCustomerType, QuantitativeValue eligibleDuration, QuantitativeValue eligibleQuantity, GeoShapeOrPlaceOrString eligibleRegion, GeoShapeOrPlaceOrString ineligibleRegion, PriceSpecification eligibleTransactionVolume, String gtin12, String gtin13, String gtin14, String gtin8, TypeAndQuantityNode includesObject, QuantitativeValue inventoryLevel, OfferItemCondition itemCondition, Product itemOffered, String mpn, NumberOrString price, PriceSpecification priceSpecification, java.util.Date priceValidUntil, Review review, Participant seller, String sku, java.util.Date validFrom, java.util.Date validThrough, WarrantyPromise warranty, String priceCurrency, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction) {
    super(acceptedPaymentMethod, addOn, advanceBookingRequirement, aggregateRating, availability, availabilityEnds, availabilityStarts, availableAtOrFrom, availableDeliveryMethod, businessFunction, category, deliveryLeadTime, eligibleCustomerType, eligibleDuration, eligibleQuantity, eligibleRegion, ineligibleRegion, eligibleTransactionVolume, gtin12, gtin13, gtin14, gtin8, includesObject, inventoryLevel, itemCondition, itemOffered, mpn, price, priceSpecification, priceValidUntil, review, seller, sku, validFrom, validThrough, warranty, priceCurrency, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
    myHighPrice = highPrice;
    myLowPrice = lowPrice;
    myOfferCount = offerCount;
    myOffers = offers;
  }
  private NumberOrString myHighPrice;
  private NumberOrString myLowPrice;
  private Integer myOfferCount;
  private Offer myOffers;
}
