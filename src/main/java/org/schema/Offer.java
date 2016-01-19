/*
 * Copyright 2015-2016 JetBrains s.r.o.
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

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.*;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getAvailabilityEnds() {
    return myAvailabilityEnds;
  }
  /**
   * The beginning of the availability of the product or service included in the offer.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
  public Number getPrice() {
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getValidFrom() {
    return myValidFrom;
  }
  /**
   * The end of the validity of offer, price specification, or opening hours data.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
  static final class OfferThingBuilder implements Builder {
    /**
     * Creates new {@link Offer} instance.
     */
    public Offer build() {
      return new Offer(acceptedPaymentMethod, addOn, advanceBookingRequirement, aggregateRating, availability, availabilityEnds, availabilityStarts, availableAtOrFrom, availableDeliveryMethod, businessFunction, category, deliveryLeadTime, eligibleCustomerType, eligibleDuration, eligibleQuantity, eligibleRegion, ineligibleRegion, eligibleTransactionVolume, gtin12, gtin13, gtin14, gtin8, includesObject, inventoryLevel, itemCondition, itemOffered, mpn, price, priceSpecification, priceValidUntil, review, seller, sku, validFrom, validThrough, warranty, priceCurrency, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     */
    @NotNull public Builder acceptedPaymentMethod(@NotNull PaymentMethod paymentMethod) {
      this.acceptedPaymentMethod = paymentMethod;
      return this;
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     */
    @NotNull public Builder acceptedPaymentMethod(@NotNull PaymentMethod.Builder paymentMethod) {
      return this.acceptedPaymentMethod(paymentMethod.build());
    }
    /**
     * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).
     */
    @NotNull public Builder addOn(@NotNull Offer offer) {
      this.addOn = offer;
      return this;
    }
    /**
     * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).
     */
    @NotNull public Builder addOn(@NotNull Offer.Builder offer) {
      return this.addOn(offer.build());
    }
    /**
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     */
    @NotNull public Builder advanceBookingRequirement(@NotNull QuantitativeValue quantitativeValue) {
      this.advanceBookingRequirement = quantitativeValue;
      return this;
    }
    /**
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     */
    @NotNull public Builder advanceBookingRequirement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.advanceBookingRequirement(quantitativeValue.build());
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      return this.aggregateRating(aggregateRating.build());
    }
    /**
     * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
     */
    @NotNull public Builder availability(@NotNull ItemAvailability itemAvailability) {
      this.availability = itemAvailability;
      return this;
    }
    /**
     * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
     */
    @NotNull public Builder availability(@NotNull ItemAvailability.Builder itemAvailability) {
      return this.availability(itemAvailability.build());
    }
    /**
     * The end of the availability of the product or service included in the offer.
     */
    @NotNull public Builder availabilityEnds(@NotNull java.util.Date date) {
      this.availabilityEnds = date;
      return this;
    }
    /**
     * The beginning of the availability of the product or service included in the offer.
     */
    @NotNull public Builder availabilityStarts(@NotNull java.util.Date date) {
      this.availabilityStarts = date;
      return this;
    }
    /**
     * The place(s) from which the offer can be obtained (e.g. store locations).
     */
    @NotNull public Builder availableAtOrFrom(@NotNull Place place) {
      this.availableAtOrFrom = place;
      return this;
    }
    /**
     * The place(s) from which the offer can be obtained (e.g. store locations).
     */
    @NotNull public Builder availableAtOrFrom(@NotNull Place.Builder place) {
      return this.availableAtOrFrom(place.build());
    }
    /**
     * The delivery method(s) available for this offer.
     */
    @NotNull public Builder availableDeliveryMethod(@NotNull DeliveryMethod deliveryMethod) {
      this.availableDeliveryMethod = deliveryMethod;
      return this;
    }
    /**
     * The delivery method(s) available for this offer.
     */
    @NotNull public Builder availableDeliveryMethod(@NotNull DeliveryMethod.Builder deliveryMethod) {
      return this.availableDeliveryMethod(deliveryMethod.build());
    }
    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    @NotNull public Builder businessFunction(@NotNull BusinessFunction businessFunction) {
      this.businessFunction = businessFunction;
      return this;
    }
    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    @NotNull public Builder businessFunction(@NotNull BusinessFunction.Builder businessFunction) {
      return this.businessFunction(businessFunction.build());
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull PhysicalActivityCategory physicalActivityCategory) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setPhysicalActivityCategory(physicalActivityCategory);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull PhysicalActivityCategory.Builder physicalActivityCategory) {
      return this.category(physicalActivityCategory.build());
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull String category) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setString(category);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Thing thing) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setThing(thing);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Thing.Builder thing) {
      return this.category(thing.build());
    }
    /**
     * The typical delay between the receipt of the order and the goods leaving the warehouse.
     */
    @NotNull public Builder deliveryLeadTime(@NotNull QuantitativeValue quantitativeValue) {
      this.deliveryLeadTime = quantitativeValue;
      return this;
    }
    /**
     * The typical delay between the receipt of the order and the goods leaving the warehouse.
     */
    @NotNull public Builder deliveryLeadTime(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.deliveryLeadTime(quantitativeValue.build());
    }
    /**
     * The type(s) of customers for which the given offer is valid.
     */
    @NotNull public Builder eligibleCustomerType(@NotNull BusinessEntityType businessEntityType) {
      this.eligibleCustomerType = businessEntityType;
      return this;
    }
    /**
     * The type(s) of customers for which the given offer is valid.
     */
    @NotNull public Builder eligibleCustomerType(@NotNull BusinessEntityType.Builder businessEntityType) {
      return this.eligibleCustomerType(businessEntityType.build());
    }
    /**
     * The duration for which the given offer is valid.
     */
    @NotNull public Builder eligibleDuration(@NotNull QuantitativeValue quantitativeValue) {
      this.eligibleDuration = quantitativeValue;
      return this;
    }
    /**
     * The duration for which the given offer is valid.
     */
    @NotNull public Builder eligibleDuration(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.eligibleDuration(quantitativeValue.build());
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue quantitativeValue) {
      this.eligibleQuantity = quantitativeValue;
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.eligibleQuantity(quantitativeValue.build());
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    @NotNull public Builder eligibleRegion(@NotNull GeoShape geoShape) {
      if (this.eligibleRegion == null) this.eligibleRegion = new GeoShapeOrPlaceOrString();
      this.eligibleRegion.setGeoShape(geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    @NotNull public Builder eligibleRegion(@NotNull GeoShape.Builder geoShape) {
      return this.eligibleRegion(geoShape.build());
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    @NotNull public Builder eligibleRegion(@NotNull Place place) {
      if (this.eligibleRegion == null) this.eligibleRegion = new GeoShapeOrPlaceOrString();
      this.eligibleRegion.setPlace(place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    @NotNull public Builder eligibleRegion(@NotNull Place.Builder place) {
      return this.eligibleRegion(place.build());
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    @NotNull public Builder eligibleRegion(@NotNull String eligibleRegion) {
      if (this.eligibleRegion == null) this.eligibleRegion = new GeoShapeOrPlaceOrString();
      this.eligibleRegion.setString(eligibleRegion);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    @NotNull public Builder ineligibleRegion(@NotNull GeoShape geoShape) {
      if (this.ineligibleRegion == null) this.ineligibleRegion = new GeoShapeOrPlaceOrString();
      this.ineligibleRegion.setGeoShape(geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    @NotNull public Builder ineligibleRegion(@NotNull GeoShape.Builder geoShape) {
      return this.ineligibleRegion(geoShape.build());
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    @NotNull public Builder ineligibleRegion(@NotNull Place place) {
      if (this.ineligibleRegion == null) this.ineligibleRegion = new GeoShapeOrPlaceOrString();
      this.ineligibleRegion.setPlace(place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    @NotNull public Builder ineligibleRegion(@NotNull Place.Builder place) {
      return this.ineligibleRegion(place.build());
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    @NotNull public Builder ineligibleRegion(@NotNull String ineligibleRegion) {
      if (this.ineligibleRegion == null) this.ineligibleRegion = new GeoShapeOrPlaceOrString();
      this.ineligibleRegion.setString(ineligibleRegion);
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification priceSpecification) {
      this.eligibleTransactionVolume = priceSpecification;
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification.Builder priceSpecification) {
      return this.eligibleTransactionVolume(priceSpecification.build());
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin12(@NotNull String gtin12) {
      this.gtin12 = gtin12;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin13(@NotNull String gtin13) {
      this.gtin13 = gtin13;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin14(@NotNull String gtin14) {
      this.gtin14 = gtin14;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin8(@NotNull String gtin8) {
      this.gtin8 = gtin8;
      return this;
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in the offer.
     */
    @NotNull public Builder includesObject(@NotNull TypeAndQuantityNode typeAndQuantityNode) {
      this.includesObject = typeAndQuantityNode;
      return this;
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in the offer.
     */
    @NotNull public Builder includesObject(@NotNull TypeAndQuantityNode.Builder typeAndQuantityNode) {
      return this.includesObject(typeAndQuantityNode.build());
    }
    /**
     * The current approximate inventory level for the item or items.
     */
    @NotNull public Builder inventoryLevel(@NotNull QuantitativeValue quantitativeValue) {
      this.inventoryLevel = quantitativeValue;
      return this;
    }
    /**
     * The current approximate inventory level for the item or items.
     */
    @NotNull public Builder inventoryLevel(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.inventoryLevel(quantitativeValue.build());
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition offerItemCondition) {
      this.itemCondition = offerItemCondition;
      return this;
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition.Builder offerItemCondition) {
      return this.itemCondition(offerItemCondition.build());
    }
    /**
     * The item being offered.
     */
    @NotNull public Builder itemOffered(@NotNull Product product) {
      this.itemOffered = product;
      return this;
    }
    /**
     * The item being offered.
     */
    @NotNull public Builder itemOffered(@NotNull Product.Builder product) {
      return this.itemOffered(product.build());
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    @NotNull public Builder mpn(@NotNull String mpn) {
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
    @NotNull public Builder price(@NotNull Integer integer) {
      if (this.price == null) this.price = new Number();
      this.price.setInteger(integer);
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
    @NotNull public Builder price(@NotNull Long price) {
      if (this.price == null) this.price = new Number();
      this.price.setLong(price);
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
    @NotNull public Builder price(@NotNull Float price) {
      if (this.price == null) this.price = new Number();
      this.price.setFloat(price);
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
    @NotNull public Builder price(@NotNull Double price) {
      if (this.price == null) this.price = new Number();
      this.price.setDouble(price);
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
    @NotNull public Builder price(@NotNull String price) {
      if (this.price == null) this.price = new Number();
      this.price.setString(price);
      return this;
    }
    /**
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     */
    @NotNull public Builder priceSpecification(@NotNull PriceSpecification priceSpecification) {
      this.priceSpecification = priceSpecification;
      return this;
    }
    /**
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     */
    @NotNull public Builder priceSpecification(@NotNull PriceSpecification.Builder priceSpecification) {
      return this.priceSpecification(priceSpecification.build());
    }
    /**
     * The date after which the price is no longer available.
     */
    @NotNull public Builder priceValidUntil(@NotNull java.util.Date date) {
      this.priceValidUntil = date;
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      this.review = review;
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      return this.review(review.build());
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @NotNull public Builder seller(@NotNull Participant participant) {
      this.seller = participant;
      return this;
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    @NotNull public Builder sku(@NotNull String sku) {
      this.sku = sku;
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      this.validFrom = date;
      return this;
    }
    /**
     * The end of the validity of offer, price specification, or opening hours data.
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      this.validThrough = date;
      return this;
    }
    /**
     * The warranty promise(s) included in the offer.
     */
    @NotNull public Builder warranty(@NotNull WarrantyPromise warrantyPromise) {
      this.warranty = warrantyPromise;
      return this;
    }
    /**
     * The warranty promise(s) included in the offer.
     */
    @NotNull public Builder warranty(@NotNull WarrantyPromise.Builder warrantyPromise) {
      return this.warranty(warrantyPromise.build());
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    @NotNull public Builder priceCurrency(@NotNull String priceCurrency) {
      this.priceCurrency = priceCurrency;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
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
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(@NotNull String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }

    @Override public void fromMap(java.util.Map<String, Object> map) {
      for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
        final String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }
        if ("acceptedPaymentMethod".equals(key) && value instanceof PaymentMethod) { acceptedPaymentMethod((PaymentMethod)value); continue; }
        if ("addOn".equals(key) && value instanceof Offer) { addOn((Offer)value); continue; }
        if ("advanceBookingRequirement".equals(key) && value instanceof QuantitativeValue) { advanceBookingRequirement((QuantitativeValue)value); continue; }
        if ("aggregateRating".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); continue; }
        if ("availability".equals(key) && value instanceof ItemAvailability) { availability((ItemAvailability)value); continue; }
        if ("availabilityEnds".equals(key) && value instanceof java.util.Date) { availabilityEnds((java.util.Date)value); continue; }
        if ("availabilityStarts".equals(key) && value instanceof java.util.Date) { availabilityStarts((java.util.Date)value); continue; }
        if ("availableAtOrFrom".equals(key) && value instanceof Place) { availableAtOrFrom((Place)value); continue; }
        if ("availableDeliveryMethod".equals(key) && value instanceof DeliveryMethod) { availableDeliveryMethod((DeliveryMethod)value); continue; }
        if ("businessFunction".equals(key) && value instanceof BusinessFunction) { businessFunction((BusinessFunction)value); continue; }
        if ("category".equals(key) && value instanceof PhysicalActivityCategory) { category((PhysicalActivityCategory)value); continue; }
        if ("category".equals(key) && value instanceof String) { category((String)value); continue; }
        if ("category".equals(key) && value instanceof Thing) { category((Thing)value); continue; }
        if ("deliveryLeadTime".equals(key) && value instanceof QuantitativeValue) { deliveryLeadTime((QuantitativeValue)value); continue; }
        if ("eligibleCustomerType".equals(key) && value instanceof BusinessEntityType) { eligibleCustomerType((BusinessEntityType)value); continue; }
        if ("eligibleDuration".equals(key) && value instanceof QuantitativeValue) { eligibleDuration((QuantitativeValue)value); continue; }
        if ("eligibleQuantity".equals(key) && value instanceof QuantitativeValue) { eligibleQuantity((QuantitativeValue)value); continue; }
        if ("eligibleRegion".equals(key) && value instanceof GeoShape) { eligibleRegion((GeoShape)value); continue; }
        if ("eligibleRegion".equals(key) && value instanceof Place) { eligibleRegion((Place)value); continue; }
        if ("eligibleRegion".equals(key) && value instanceof String) { eligibleRegion((String)value); continue; }
        if ("ineligibleRegion".equals(key) && value instanceof GeoShape) { ineligibleRegion((GeoShape)value); continue; }
        if ("ineligibleRegion".equals(key) && value instanceof Place) { ineligibleRegion((Place)value); continue; }
        if ("ineligibleRegion".equals(key) && value instanceof String) { ineligibleRegion((String)value); continue; }
        if ("eligibleTransactionVolume".equals(key) && value instanceof PriceSpecification) { eligibleTransactionVolume((PriceSpecification)value); continue; }
        if ("gtin12".equals(key) && value instanceof String) { gtin12((String)value); continue; }
        if ("gtin13".equals(key) && value instanceof String) { gtin13((String)value); continue; }
        if ("gtin14".equals(key) && value instanceof String) { gtin14((String)value); continue; }
        if ("gtin8".equals(key) && value instanceof String) { gtin8((String)value); continue; }
        if ("includesObject".equals(key) && value instanceof TypeAndQuantityNode) { includesObject((TypeAndQuantityNode)value); continue; }
        if ("inventoryLevel".equals(key) && value instanceof QuantitativeValue) { inventoryLevel((QuantitativeValue)value); continue; }
        if ("itemCondition".equals(key) && value instanceof OfferItemCondition) { itemCondition((OfferItemCondition)value); continue; }
        if ("itemOffered".equals(key) && value instanceof Product) { itemOffered((Product)value); continue; }
        if ("mpn".equals(key) && value instanceof String) { mpn((String)value); continue; }
        if ("price".equals(key) && value instanceof Integer) { price((Integer)value); continue; }
        if ("price".equals(key) && value instanceof Long) { price((Long)value); continue; }
        if ("price".equals(key) && value instanceof Float) { price((Float)value); continue; }
        if ("price".equals(key) && value instanceof Double) { price((Double)value); continue; }
        if ("price".equals(key) && value instanceof String) { price((String)value); continue; }
        if ("priceSpecification".equals(key) && value instanceof PriceSpecification) { priceSpecification((PriceSpecification)value); continue; }
        if ("priceValidUntil".equals(key) && value instanceof java.util.Date) { priceValidUntil((java.util.Date)value); continue; }
        if ("review".equals(key) && value instanceof Review) { review((Review)value); continue; }
        if ("seller".equals(key) && value instanceof Participant) { seller((Participant)value); continue; }
        if ("sku".equals(key) && value instanceof String) { sku((String)value); continue; }
        if ("validFrom".equals(key) && value instanceof java.util.Date) { validFrom((java.util.Date)value); continue; }
        if ("validThrough".equals(key) && value instanceof java.util.Date) { validThrough((java.util.Date)value); continue; }
        if ("warranty".equals(key) && value instanceof WarrantyPromise) { warranty((WarrantyPromise)value); continue; }
        if ("priceCurrency".equals(key) && value instanceof String) { priceCurrency((String)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("@id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
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
    private Number price;
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
    private String id;
  }
  public interface Builder extends ThingBuilder<Offer> {
    @NotNull Builder acceptedPaymentMethod(@NotNull PaymentMethod paymentMethod);
    @NotNull Builder acceptedPaymentMethod(@NotNull PaymentMethod.Builder paymentMethod);
    @NotNull Builder addOn(@NotNull Offer offer);
    @NotNull Builder addOn(@NotNull Offer.Builder offer);
    @NotNull Builder advanceBookingRequirement(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder advanceBookingRequirement(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder aggregateRating(@NotNull AggregateRating aggregateRating);
    @NotNull Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating);
    @NotNull Builder availability(@NotNull ItemAvailability itemAvailability);
    @NotNull Builder availability(@NotNull ItemAvailability.Builder itemAvailability);
    @NotNull Builder availabilityEnds(@NotNull java.util.Date date);
    @NotNull Builder availabilityStarts(@NotNull java.util.Date date);
    @NotNull Builder availableAtOrFrom(@NotNull Place place);
    @NotNull Builder availableAtOrFrom(@NotNull Place.Builder place);
    @NotNull Builder availableDeliveryMethod(@NotNull DeliveryMethod deliveryMethod);
    @NotNull Builder availableDeliveryMethod(@NotNull DeliveryMethod.Builder deliveryMethod);
    @NotNull Builder businessFunction(@NotNull BusinessFunction businessFunction);
    @NotNull Builder businessFunction(@NotNull BusinessFunction.Builder businessFunction);
    @NotNull Builder category(@NotNull PhysicalActivityCategory physicalActivityCategory);
    @NotNull Builder category(@NotNull PhysicalActivityCategory.Builder physicalActivityCategory);
    @NotNull Builder category(@NotNull String category);
    @NotNull Builder category(@NotNull Thing thing);
    @NotNull Builder category(@NotNull Thing.Builder thing);
    @NotNull Builder deliveryLeadTime(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder deliveryLeadTime(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder eligibleCustomerType(@NotNull BusinessEntityType businessEntityType);
    @NotNull Builder eligibleCustomerType(@NotNull BusinessEntityType.Builder businessEntityType);
    @NotNull Builder eligibleDuration(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder eligibleDuration(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder eligibleQuantity(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder eligibleQuantity(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder eligibleRegion(@NotNull GeoShape geoShape);
    @NotNull Builder eligibleRegion(@NotNull GeoShape.Builder geoShape);
    @NotNull Builder eligibleRegion(@NotNull Place place);
    @NotNull Builder eligibleRegion(@NotNull Place.Builder place);
    @NotNull Builder eligibleRegion(@NotNull String eligibleRegion);
    @NotNull Builder ineligibleRegion(@NotNull GeoShape geoShape);
    @NotNull Builder ineligibleRegion(@NotNull GeoShape.Builder geoShape);
    @NotNull Builder ineligibleRegion(@NotNull Place place);
    @NotNull Builder ineligibleRegion(@NotNull Place.Builder place);
    @NotNull Builder ineligibleRegion(@NotNull String ineligibleRegion);
    @NotNull Builder eligibleTransactionVolume(@NotNull PriceSpecification priceSpecification);
    @NotNull Builder eligibleTransactionVolume(@NotNull PriceSpecification.Builder priceSpecification);
    @NotNull Builder gtin12(@NotNull String gtin12);
    @NotNull Builder gtin13(@NotNull String gtin13);
    @NotNull Builder gtin14(@NotNull String gtin14);
    @NotNull Builder gtin8(@NotNull String gtin8);
    @NotNull Builder includesObject(@NotNull TypeAndQuantityNode typeAndQuantityNode);
    @NotNull Builder includesObject(@NotNull TypeAndQuantityNode.Builder typeAndQuantityNode);
    @NotNull Builder inventoryLevel(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder inventoryLevel(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder itemCondition(@NotNull OfferItemCondition offerItemCondition);
    @NotNull Builder itemCondition(@NotNull OfferItemCondition.Builder offerItemCondition);
    @NotNull Builder itemOffered(@NotNull Product product);
    @NotNull Builder itemOffered(@NotNull Product.Builder product);
    @NotNull Builder mpn(@NotNull String mpn);
    @NotNull Builder price(@NotNull Integer integer);
    @NotNull Builder price(@NotNull Long price);
    @NotNull Builder price(@NotNull Float price);
    @NotNull Builder price(@NotNull Double price);
    @NotNull Builder price(@NotNull String price);
    @NotNull Builder priceSpecification(@NotNull PriceSpecification priceSpecification);
    @NotNull Builder priceSpecification(@NotNull PriceSpecification.Builder priceSpecification);
    @NotNull Builder priceValidUntil(@NotNull java.util.Date date);
    @NotNull Builder review(@NotNull Review review);
    @NotNull Builder review(@NotNull Review.Builder review);
    @NotNull Builder seller(@NotNull Participant participant);
    @NotNull Builder sku(@NotNull String sku);
    @NotNull Builder validFrom(@NotNull java.util.Date date);
    @NotNull Builder validThrough(@NotNull java.util.Date date);
    @NotNull Builder warranty(@NotNull WarrantyPromise warrantyPromise);
    @NotNull Builder warranty(@NotNull WarrantyPromise.Builder warrantyPromise);
    @NotNull Builder priceCurrency(@NotNull String priceCurrency);
    @NotNull Builder additionalType(@NotNull String additionalType);
    @NotNull Builder alternateName(@NotNull String alternateName);
    @NotNull Builder description(@NotNull String description);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull String mainEntityOfPage);
    @NotNull Builder name(@NotNull String name);
    @NotNull Builder sameAs(@NotNull String sameAs);
    @NotNull Builder url(@NotNull String url);
    @NotNull Builder potentialAction(@NotNull Action action);
    @NotNull Builder potentialAction(@NotNull Action.Builder action);
    @NotNull Builder id(@NotNull String id);
  }

  protected Offer(PaymentMethod acceptedPaymentMethod, Offer addOn, QuantitativeValue advanceBookingRequirement, AggregateRating aggregateRating, ItemAvailability availability, java.util.Date availabilityEnds, java.util.Date availabilityStarts, Place availableAtOrFrom, DeliveryMethod availableDeliveryMethod, BusinessFunction businessFunction, PhysicalActivityCategoryOrStringOrThing category, QuantitativeValue deliveryLeadTime, BusinessEntityType eligibleCustomerType, QuantitativeValue eligibleDuration, QuantitativeValue eligibleQuantity, GeoShapeOrPlaceOrString eligibleRegion, GeoShapeOrPlaceOrString ineligibleRegion, PriceSpecification eligibleTransactionVolume, String gtin12, String gtin13, String gtin14, String gtin8, TypeAndQuantityNode includesObject, QuantitativeValue inventoryLevel, OfferItemCondition itemCondition, Product itemOffered, String mpn, Number price, PriceSpecification priceSpecification, java.util.Date priceValidUntil, Review review, Participant seller, String sku, java.util.Date validFrom, java.util.Date validThrough, WarrantyPromise warranty, String priceCurrency, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
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

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myAcceptedPaymentMethod != null ? myAcceptedPaymentMethod.hashCode() : 0);
    result = 31 * result + (myAddOn != null ? myAddOn.hashCode() : 0);
    result = 31 * result + (myAdvanceBookingRequirement != null ? myAdvanceBookingRequirement.hashCode() : 0);
    result = 31 * result + (myAggregateRating != null ? myAggregateRating.hashCode() : 0);
    result = 31 * result + (myAvailability != null ? myAvailability.hashCode() : 0);
    result = 31 * result + (myAvailabilityEnds != null ? myAvailabilityEnds.hashCode() : 0);
    result = 31 * result + (myAvailabilityStarts != null ? myAvailabilityStarts.hashCode() : 0);
    result = 31 * result + (myAvailableAtOrFrom != null ? myAvailableAtOrFrom.hashCode() : 0);
    result = 31 * result + (myAvailableDeliveryMethod != null ? myAvailableDeliveryMethod.hashCode() : 0);
    result = 31 * result + (myBusinessFunction != null ? myBusinessFunction.hashCode() : 0);
    result = 31 * result + (myCategory != null ? myCategory.hashCode() : 0);
    result = 31 * result + (myDeliveryLeadTime != null ? myDeliveryLeadTime.hashCode() : 0);
    result = 31 * result + (myEligibleCustomerType != null ? myEligibleCustomerType.hashCode() : 0);
    result = 31 * result + (myEligibleDuration != null ? myEligibleDuration.hashCode() : 0);
    result = 31 * result + (myEligibleQuantity != null ? myEligibleQuantity.hashCode() : 0);
    result = 31 * result + (myEligibleRegion != null ? myEligibleRegion.hashCode() : 0);
    result = 31 * result + (myIneligibleRegion != null ? myIneligibleRegion.hashCode() : 0);
    result = 31 * result + (myEligibleTransactionVolume != null ? myEligibleTransactionVolume.hashCode() : 0);
    result = 31 * result + (myGtin12 != null ? myGtin12.hashCode() : 0);
    result = 31 * result + (myGtin13 != null ? myGtin13.hashCode() : 0);
    result = 31 * result + (myGtin14 != null ? myGtin14.hashCode() : 0);
    result = 31 * result + (myGtin8 != null ? myGtin8.hashCode() : 0);
    result = 31 * result + (myIncludesObject != null ? myIncludesObject.hashCode() : 0);
    result = 31 * result + (myInventoryLevel != null ? myInventoryLevel.hashCode() : 0);
    result = 31 * result + (myItemCondition != null ? myItemCondition.hashCode() : 0);
    result = 31 * result + (myItemOffered != null ? myItemOffered.hashCode() : 0);
    result = 31 * result + (myMpn != null ? myMpn.hashCode() : 0);
    result = 31 * result + (myPrice != null ? myPrice.hashCode() : 0);
    result = 31 * result + (myPriceSpecification != null ? myPriceSpecification.hashCode() : 0);
    result = 31 * result + (myPriceValidUntil != null ? myPriceValidUntil.hashCode() : 0);
    result = 31 * result + (myReview != null ? myReview.hashCode() : 0);
    result = 31 * result + (mySeller != null ? mySeller.hashCode() : 0);
    result = 31 * result + (mySku != null ? mySku.hashCode() : 0);
    result = 31 * result + (myValidFrom != null ? myValidFrom.hashCode() : 0);
    result = 31 * result + (myValidThrough != null ? myValidThrough.hashCode() : 0);
    result = 31 * result + (myWarranty != null ? myWarranty.hashCode() : 0);
    result = 31 * result + (myPriceCurrency != null ? myPriceCurrency.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Offer offer = (Offer) o;
    if (!super.equals(o)) return false;
    if (myAcceptedPaymentMethod != null ? !myAcceptedPaymentMethod.equals(offer.myAcceptedPaymentMethod) : offer.myAcceptedPaymentMethod != null) return false;
    if (myAddOn != null ? !myAddOn.equals(offer.myAddOn) : offer.myAddOn != null) return false;
    if (myAdvanceBookingRequirement != null ? !myAdvanceBookingRequirement.equals(offer.myAdvanceBookingRequirement) : offer.myAdvanceBookingRequirement != null) return false;
    if (myAggregateRating != null ? !myAggregateRating.equals(offer.myAggregateRating) : offer.myAggregateRating != null) return false;
    if (myAvailability != null ? !myAvailability.equals(offer.myAvailability) : offer.myAvailability != null) return false;
    if (myAvailabilityEnds != null ? !myAvailabilityEnds.equals(offer.myAvailabilityEnds) : offer.myAvailabilityEnds != null) return false;
    if (myAvailabilityStarts != null ? !myAvailabilityStarts.equals(offer.myAvailabilityStarts) : offer.myAvailabilityStarts != null) return false;
    if (myAvailableAtOrFrom != null ? !myAvailableAtOrFrom.equals(offer.myAvailableAtOrFrom) : offer.myAvailableAtOrFrom != null) return false;
    if (myAvailableDeliveryMethod != null ? !myAvailableDeliveryMethod.equals(offer.myAvailableDeliveryMethod) : offer.myAvailableDeliveryMethod != null) return false;
    if (myBusinessFunction != null ? !myBusinessFunction.equals(offer.myBusinessFunction) : offer.myBusinessFunction != null) return false;
    if (myCategory != null ? !myCategory.equals(offer.myCategory) : offer.myCategory != null) return false;
    if (myDeliveryLeadTime != null ? !myDeliveryLeadTime.equals(offer.myDeliveryLeadTime) : offer.myDeliveryLeadTime != null) return false;
    if (myEligibleCustomerType != null ? !myEligibleCustomerType.equals(offer.myEligibleCustomerType) : offer.myEligibleCustomerType != null) return false;
    if (myEligibleDuration != null ? !myEligibleDuration.equals(offer.myEligibleDuration) : offer.myEligibleDuration != null) return false;
    if (myEligibleQuantity != null ? !myEligibleQuantity.equals(offer.myEligibleQuantity) : offer.myEligibleQuantity != null) return false;
    if (myEligibleRegion != null ? !myEligibleRegion.equals(offer.myEligibleRegion) : offer.myEligibleRegion != null) return false;
    if (myIneligibleRegion != null ? !myIneligibleRegion.equals(offer.myIneligibleRegion) : offer.myIneligibleRegion != null) return false;
    if (myEligibleTransactionVolume != null ? !myEligibleTransactionVolume.equals(offer.myEligibleTransactionVolume) : offer.myEligibleTransactionVolume != null) return false;
    if (myGtin12 != null ? !myGtin12.equals(offer.myGtin12) : offer.myGtin12 != null) return false;
    if (myGtin13 != null ? !myGtin13.equals(offer.myGtin13) : offer.myGtin13 != null) return false;
    if (myGtin14 != null ? !myGtin14.equals(offer.myGtin14) : offer.myGtin14 != null) return false;
    if (myGtin8 != null ? !myGtin8.equals(offer.myGtin8) : offer.myGtin8 != null) return false;
    if (myIncludesObject != null ? !myIncludesObject.equals(offer.myIncludesObject) : offer.myIncludesObject != null) return false;
    if (myInventoryLevel != null ? !myInventoryLevel.equals(offer.myInventoryLevel) : offer.myInventoryLevel != null) return false;
    if (myItemCondition != null ? !myItemCondition.equals(offer.myItemCondition) : offer.myItemCondition != null) return false;
    if (myItemOffered != null ? !myItemOffered.equals(offer.myItemOffered) : offer.myItemOffered != null) return false;
    if (myMpn != null ? !myMpn.equals(offer.myMpn) : offer.myMpn != null) return false;
    if (myPrice != null ? !myPrice.equals(offer.myPrice) : offer.myPrice != null) return false;
    if (myPriceSpecification != null ? !myPriceSpecification.equals(offer.myPriceSpecification) : offer.myPriceSpecification != null) return false;
    if (myPriceValidUntil != null ? !myPriceValidUntil.equals(offer.myPriceValidUntil) : offer.myPriceValidUntil != null) return false;
    if (myReview != null ? !myReview.equals(offer.myReview) : offer.myReview != null) return false;
    if (mySeller != null ? !mySeller.equals(offer.mySeller) : offer.mySeller != null) return false;
    if (mySku != null ? !mySku.equals(offer.mySku) : offer.mySku != null) return false;
    if (myValidFrom != null ? !myValidFrom.equals(offer.myValidFrom) : offer.myValidFrom != null) return false;
    if (myValidThrough != null ? !myValidThrough.equals(offer.myValidThrough) : offer.myValidThrough != null) return false;
    if (myWarranty != null ? !myWarranty.equals(offer.myWarranty) : offer.myWarranty != null) return false;
    if (myPriceCurrency != null ? !myPriceCurrency.equals(offer.myPriceCurrency) : offer.myPriceCurrency != null) return false;
    return true;
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
  private Number myPrice;
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
