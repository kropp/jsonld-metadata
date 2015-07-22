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
 * An offer to transfer some rights to an item or to provide a service&#x2014;for example, an offer to sell tickets to an event, to rent the DVD of a movie, to stream a TV show over the internet, to repair a motorcycle, or to loan a book.
  *       <br/><br/>
  *       For <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GTIN</a>-related fields, see
  *       <a href="http://www.gs1.org/barcodes/support/check_digit_calculator">Check Digit calculator</a>
  *       and <a href="http://www.gs1us.org/resources/standards/gtin-validation-guide">validation guide</a>
  *       from <a href="http://www.gs1.org/">GS1</a>.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsProperties
 */
public class Offer extends Intangible {
  /**
   * The payment method(s) accepted by seller for this offer.
   */
  public PaymentMethod getAcceptedPaymentMethod() {
    return myAcceptedPaymentMethod;
  }
  /**
   * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).
   */
  public Offer getAddOn() {
    return myAddOn;
  }
  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
   */
  public QuantitativeValue getAdvanceBookingRequirement() {
    return myAdvanceBookingRequirement;
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating getAggregateRating() {
    return myAggregateRating;
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
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getAvailabilityEnds() {
    return myAvailabilityEnds;
  }
  /**
   * The beginning of the availability of the product or service included in the offer.
   */
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  public PhysicalActivityCategoryOrStringOrThing getCategory() {
    return myCategory;
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
  public GeoShapeOrPlaceOrString getEligibleRegion() {
    return myEligibleRegion;
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   */
  public GeoShapeOrPlaceOrString getIneligibleRegion() {
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
  public NumberOrString getPrice() {
    return myPrice;
  }
  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
   */
  public PriceSpecification getPriceSpecification() {
    return myPriceSpecification;
  }
  /**
   * The date after which the price is no longer available.
   */
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getPriceValidUntil() {
    return myPriceValidUntil;
  }
  /**
   * A review of the item.
   */
  public Review getReview() {
    return myReview;
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
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getValidFrom() {
    return myValidFrom;
  }
  /**
   * The end of the validity of offer, price specification, or opening hours data.
   */
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
   */
  public String getPriceCurrency() {
    return myPriceCurrency;
  }
  /**
   * Builder for {@link Offer}
   */
  public static final class Builder {
    /**
     * Creates new {@link Offer} instance.
     */
    public Offer build() {
      return new Offer(acceptedPaymentMethod, addOn, advanceBookingRequirement, aggregateRating, availability, availabilityEnds, availabilityStarts, availableAtOrFrom, availableDeliveryMethod, businessFunction, category, deliveryLeadTime, eligibleCustomerType, eligibleDuration, eligibleQuantity, eligibleRegion, ineligibleRegion, eligibleTransactionVolume, gtin12, gtin13, gtin14, gtin8, includesObject, inventoryLevel, itemCondition, itemOffered, mpn, price, priceSpecification, priceValidUntil, review, seller, sku, validFrom, validThrough, warranty, priceCurrency, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
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

  protected Offer(PaymentMethod acceptedPaymentMethod, Offer addOn, QuantitativeValue advanceBookingRequirement, AggregateRating aggregateRating, ItemAvailability availability, java.util.Date availabilityEnds, java.util.Date availabilityStarts, Place availableAtOrFrom, DeliveryMethod availableDeliveryMethod, BusinessFunction businessFunction, PhysicalActivityCategoryOrStringOrThing category, QuantitativeValue deliveryLeadTime, BusinessEntityType eligibleCustomerType, QuantitativeValue eligibleDuration, QuantitativeValue eligibleQuantity, GeoShapeOrPlaceOrString eligibleRegion, GeoShapeOrPlaceOrString ineligibleRegion, PriceSpecification eligibleTransactionVolume, String gtin12, String gtin13, String gtin14, String gtin8, TypeAndQuantityNode includesObject, QuantitativeValue inventoryLevel, OfferItemCondition itemCondition, Product itemOffered, String mpn, NumberOrString price, PriceSpecification priceSpecification, java.util.Date priceValidUntil, Review review, Participant seller, String sku, java.util.Date validFrom, java.util.Date validThrough, WarrantyPromise warranty, String priceCurrency, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
    myAcceptedPaymentMethod = acceptedPaymentMethod;
    myAddOn = addOn;
    myAdvanceBookingRequirement = advanceBookingRequirement;
    myAggregateRating = aggregateRating;
    myAvailability = availability;
    myAvailabilityEnds = availabilityEnds;
    myAvailabilityStarts = availabilityStarts;
    myAvailableAtOrFrom = availableAtOrFrom;
    myAvailableDeliveryMethod = availableDeliveryMethod;
    myBusinessFunction = businessFunction;
    myCategory = category;
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
    myPrice = price;
    myPriceSpecification = priceSpecification;
    myPriceValidUntil = priceValidUntil;
    myReview = review;
    mySeller = seller;
    mySku = sku;
    myValidFrom = validFrom;
    myValidThrough = validThrough;
    myWarranty = warranty;
    myPriceCurrency = priceCurrency;
  }
  private PaymentMethod myAcceptedPaymentMethod;
  private Offer myAddOn;
  private QuantitativeValue myAdvanceBookingRequirement;
  private AggregateRating myAggregateRating;
  private ItemAvailability myAvailability;
  private java.util.Date myAvailabilityEnds;
  private java.util.Date myAvailabilityStarts;
  private Place myAvailableAtOrFrom;
  private DeliveryMethod myAvailableDeliveryMethod;
  private BusinessFunction myBusinessFunction;
  private PhysicalActivityCategoryOrStringOrThing myCategory;
  private QuantitativeValue myDeliveryLeadTime;
  private BusinessEntityType myEligibleCustomerType;
  private QuantitativeValue myEligibleDuration;
  private QuantitativeValue myEligibleQuantity;
  private GeoShapeOrPlaceOrString myEligibleRegion;
  private GeoShapeOrPlaceOrString myIneligibleRegion;
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
  private NumberOrString myPrice;
  private PriceSpecification myPriceSpecification;
  private java.util.Date myPriceValidUntil;
  private Review myReview;
  private Participant mySeller;
  private String mySku;
  private java.util.Date myValidFrom;
  private java.util.Date myValidThrough;
  private WarrantyPromise myWarranty;
  private String myPriceCurrency;
}
