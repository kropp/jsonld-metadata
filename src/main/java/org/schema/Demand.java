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
import org.jetbrains.annotations.NotNull;

/**
 * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class Demand extends Intangible {
  /**
   * The payment method(s) accepted by seller for this offer.
   */
  public PaymentMethod getAcceptedPaymentMethod() { return myAcceptedPaymentMethod; }
  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
   */
  public QuantitativeValue getAdvanceBookingRequirement() { return myAdvanceBookingRequirement; }
  /**
   * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
   */
  public ItemAvailability getAvailability() { return myAvailability; }
  /**
   * The end of the availability of the product or service included in the offer.
   */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getAvailabilityEnds() { return myAvailabilityEnds; }
  /**
   * The beginning of the availability of the product or service included in the offer.
   */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getAvailabilityStarts() { return myAvailabilityStarts; }
  /**
   * The place(s) from which the offer can be obtained (e.g. store locations).
   */
  public Place getAvailableAtOrFrom() { return myAvailableAtOrFrom; }
  /**
   * The delivery method(s) available for this offer.
   */
  public DeliveryMethod getAvailableDeliveryMethod() { return myAvailableDeliveryMethod; }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   */
  public BusinessFunction getBusinessFunction() { return myBusinessFunction; }
  /**
   * The typical delay between the receipt of the order and the goods leaving the warehouse.
   */
  public QuantitativeValue getDeliveryLeadTime() { return myDeliveryLeadTime; }
  /**
   * The type(s) of customers for which the given offer is valid.
   */
  public BusinessEntityType getEligibleCustomerType() { return myEligibleCustomerType; }
  /**
   * The duration for which the given offer is valid.
   */
  public QuantitativeValue getEligibleDuration() { return myEligibleDuration; }
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  public QuantitativeValue getEligibleQuantity() { return myEligibleQuantity; }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   */
  public GeoShapeOrPlaceOrString getEligibleRegion() { return myEligibleRegion; }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   */
  public GeoShapeOrPlaceOrString getIneligibleRegion() { return myIneligibleRegion; }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  public PriceSpecification getEligibleTransactionVolume() { return myEligibleTransactionVolume; }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String getGtin12() { return myGtin12; }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String getGtin13() { return myGtin13; }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String getGtin14() { return myGtin14; }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  public String getGtin8() { return myGtin8; }
  /**
   * This links to a node or nodes indicating the exact quantity of the products included in the offer.
   */
  public TypeAndQuantityNode getIncludesObject() { return myIncludesObject; }
  /**
   * The current approximate inventory level for the item or items.
   */
  public QuantitativeValue getInventoryLevel() { return myInventoryLevel; }
  /**
   * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
   */
  public OfferItemCondition getItemCondition() { return myItemCondition; }
  /**
   * The item being offered.
   */
  public Product getItemOffered() { return myItemOffered; }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   */
  public String getMpn() { return myMpn; }
  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
   */
  public PriceSpecification getPriceSpecification() { return myPriceSpecification; }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  public Participant getSeller() { return mySeller; }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   */
  public String getSku() { return mySku; }
  /**
   * The date when the item becomes valid.
   */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getValidFrom() { return myValidFrom; }
  /**
   * The end of the validity of offer, price specification, or opening hours data.
   */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getValidThrough() { return myValidThrough; }
  /**
   * The warranty promise(s) included in the offer.
   */
  public WarrantyPromise getWarranty() { return myWarranty; }
  protected Demand(PaymentMethod acceptedPaymentMethod, QuantitativeValue advanceBookingRequirement, ItemAvailability availability, java.util.Date availabilityEnds, java.util.Date availabilityStarts, Place availableAtOrFrom, DeliveryMethod availableDeliveryMethod, BusinessFunction businessFunction, QuantitativeValue deliveryLeadTime, BusinessEntityType eligibleCustomerType, QuantitativeValue eligibleDuration, QuantitativeValue eligibleQuantity, GeoShapeOrPlaceOrString eligibleRegion, GeoShapeOrPlaceOrString ineligibleRegion, PriceSpecification eligibleTransactionVolume, String gtin12, String gtin13, String gtin14, String gtin8, TypeAndQuantityNode includesObject, QuantitativeValue inventoryLevel, OfferItemCondition itemCondition, Product itemOffered, String mpn, PriceSpecification priceSpecification, Participant seller, String sku, java.util.Date validFrom, java.util.Date validThrough, WarrantyPromise warranty, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
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
  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myAcceptedPaymentMethod != null ? myAcceptedPaymentMethod.hashCode() : 0);
    result = 31 * result + (myAdvanceBookingRequirement != null ? myAdvanceBookingRequirement.hashCode() : 0);
    result = 31 * result + (myAvailability != null ? myAvailability.hashCode() : 0);
    result = 31 * result + (myAvailabilityEnds != null ? myAvailabilityEnds.hashCode() : 0);
    result = 31 * result + (myAvailabilityStarts != null ? myAvailabilityStarts.hashCode() : 0);
    result = 31 * result + (myAvailableAtOrFrom != null ? myAvailableAtOrFrom.hashCode() : 0);
    result = 31 * result + (myAvailableDeliveryMethod != null ? myAvailableDeliveryMethod.hashCode() : 0);
    result = 31 * result + (myBusinessFunction != null ? myBusinessFunction.hashCode() : 0);
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
    result = 31 * result + (myPriceSpecification != null ? myPriceSpecification.hashCode() : 0);
    result = 31 * result + (mySeller != null ? mySeller.hashCode() : 0);
    result = 31 * result + (mySku != null ? mySku.hashCode() : 0);
    result = 31 * result + (myValidFrom != null ? myValidFrom.hashCode() : 0);
    result = 31 * result + (myValidThrough != null ? myValidThrough.hashCode() : 0);
    result = 31 * result + (myWarranty != null ? myWarranty.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Demand demand = (Demand) o;
    if (!super.equals(o)) return false;
    if (myAcceptedPaymentMethod != null ? !myAcceptedPaymentMethod.equals(demand.myAcceptedPaymentMethod) : demand.myAcceptedPaymentMethod != null) return false;
    if (myAdvanceBookingRequirement != null ? !myAdvanceBookingRequirement.equals(demand.myAdvanceBookingRequirement) : demand.myAdvanceBookingRequirement != null) return false;
    if (myAvailability != null ? !myAvailability.equals(demand.myAvailability) : demand.myAvailability != null) return false;
    if (myAvailabilityEnds != null ? !myAvailabilityEnds.equals(demand.myAvailabilityEnds) : demand.myAvailabilityEnds != null) return false;
    if (myAvailabilityStarts != null ? !myAvailabilityStarts.equals(demand.myAvailabilityStarts) : demand.myAvailabilityStarts != null) return false;
    if (myAvailableAtOrFrom != null ? !myAvailableAtOrFrom.equals(demand.myAvailableAtOrFrom) : demand.myAvailableAtOrFrom != null) return false;
    if (myAvailableDeliveryMethod != null ? !myAvailableDeliveryMethod.equals(demand.myAvailableDeliveryMethod) : demand.myAvailableDeliveryMethod != null) return false;
    if (myBusinessFunction != null ? !myBusinessFunction.equals(demand.myBusinessFunction) : demand.myBusinessFunction != null) return false;
    if (myDeliveryLeadTime != null ? !myDeliveryLeadTime.equals(demand.myDeliveryLeadTime) : demand.myDeliveryLeadTime != null) return false;
    if (myEligibleCustomerType != null ? !myEligibleCustomerType.equals(demand.myEligibleCustomerType) : demand.myEligibleCustomerType != null) return false;
    if (myEligibleDuration != null ? !myEligibleDuration.equals(demand.myEligibleDuration) : demand.myEligibleDuration != null) return false;
    if (myEligibleQuantity != null ? !myEligibleQuantity.equals(demand.myEligibleQuantity) : demand.myEligibleQuantity != null) return false;
    if (myEligibleRegion != null ? !myEligibleRegion.equals(demand.myEligibleRegion) : demand.myEligibleRegion != null) return false;
    if (myIneligibleRegion != null ? !myIneligibleRegion.equals(demand.myIneligibleRegion) : demand.myIneligibleRegion != null) return false;
    if (myEligibleTransactionVolume != null ? !myEligibleTransactionVolume.equals(demand.myEligibleTransactionVolume) : demand.myEligibleTransactionVolume != null) return false;
    if (myGtin12 != null ? !myGtin12.equals(demand.myGtin12) : demand.myGtin12 != null) return false;
    if (myGtin13 != null ? !myGtin13.equals(demand.myGtin13) : demand.myGtin13 != null) return false;
    if (myGtin14 != null ? !myGtin14.equals(demand.myGtin14) : demand.myGtin14 != null) return false;
    if (myGtin8 != null ? !myGtin8.equals(demand.myGtin8) : demand.myGtin8 != null) return false;
    if (myIncludesObject != null ? !myIncludesObject.equals(demand.myIncludesObject) : demand.myIncludesObject != null) return false;
    if (myInventoryLevel != null ? !myInventoryLevel.equals(demand.myInventoryLevel) : demand.myInventoryLevel != null) return false;
    if (myItemCondition != null ? !myItemCondition.equals(demand.myItemCondition) : demand.myItemCondition != null) return false;
    if (myItemOffered != null ? !myItemOffered.equals(demand.myItemOffered) : demand.myItemOffered != null) return false;
    if (myMpn != null ? !myMpn.equals(demand.myMpn) : demand.myMpn != null) return false;
    if (myPriceSpecification != null ? !myPriceSpecification.equals(demand.myPriceSpecification) : demand.myPriceSpecification != null) return false;
    if (mySeller != null ? !mySeller.equals(demand.mySeller) : demand.mySeller != null) return false;
    if (mySku != null ? !mySku.equals(demand.mySku) : demand.mySku != null) return false;
    if (myValidFrom != null ? !myValidFrom.equals(demand.myValidFrom) : demand.myValidFrom != null) return false;
    if (myValidThrough != null ? !myValidThrough.equals(demand.myValidThrough) : demand.myValidThrough != null) return false;
    if (myWarranty != null ? !myWarranty.equals(demand.myWarranty) : demand.myWarranty != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link Demand}
   */
  public static class Builder implements ThingBuilder<Demand> {
    public Demand build() {
      return new Demand(acceptedPaymentMethod, advanceBookingRequirement, availability, availabilityEnds, availabilityStarts, availableAtOrFrom, availableDeliveryMethod, businessFunction, deliveryLeadTime, eligibleCustomerType, eligibleDuration, eligibleQuantity, eligibleRegion, ineligibleRegion, eligibleTransactionVolume, gtin12, gtin13, gtin14, gtin8, includesObject, inventoryLevel, itemCondition, itemOffered, mpn, priceSpecification, seller, sku, validFrom, validThrough, warranty, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
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
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
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
        if ("advanceBookingRequirement".equals(key) && value instanceof QuantitativeValue) { advanceBookingRequirement((QuantitativeValue)value); continue; }
        if ("availability".equals(key) && value instanceof ItemAvailability) { availability((ItemAvailability)value); continue; }
        if ("availabilityEnds".equals(key) && value instanceof java.util.Date) { availabilityEnds((java.util.Date)value); continue; }
        if ("availabilityStarts".equals(key) && value instanceof java.util.Date) { availabilityStarts((java.util.Date)value); continue; }
        if ("availableAtOrFrom".equals(key) && value instanceof Place) { availableAtOrFrom((Place)value); continue; }
        if ("availableDeliveryMethod".equals(key) && value instanceof DeliveryMethod) { availableDeliveryMethod((DeliveryMethod)value); continue; }
        if ("businessFunction".equals(key) && value instanceof BusinessFunction) { businessFunction((BusinessFunction)value); continue; }
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
        if ("priceSpecification".equals(key) && value instanceof PriceSpecification) { priceSpecification((PriceSpecification)value); continue; }
        if ("seller".equals(key) && value instanceof Participant) { seller((Participant)value); continue; }
        if ("sku".equals(key) && value instanceof String) { sku((String)value); continue; }
        if ("validFrom".equals(key) && value instanceof java.util.Date) { validFrom((java.util.Date)value); continue; }
        if ("validThrough".equals(key) && value instanceof java.util.Date) { validThrough((java.util.Date)value); continue; }
        if ("warranty".equals(key) && value instanceof WarrantyPromise) { warranty((WarrantyPromise)value); continue; }
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
    private QuantitativeValue advanceBookingRequirement;
    private ItemAvailability availability;
    private java.util.Date availabilityEnds;
    private java.util.Date availabilityStarts;
    private Place availableAtOrFrom;
    private DeliveryMethod availableDeliveryMethod;
    private BusinessFunction businessFunction;
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
    private PriceSpecification priceSpecification;
    private Participant seller;
    private String sku;
    private java.util.Date validFrom;
    private java.util.Date validThrough;
    private WarrantyPromise warranty;
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
  private PriceSpecification myPriceSpecification;
  private Participant mySeller;
  private String mySku;
  private java.util.Date myValidFrom;
  private java.util.Date myValidThrough;
  private WarrantyPromise myWarranty;
}
