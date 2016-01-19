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
 * Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsProperties
 */
public class Product extends Thing {
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating getAggregateRating() {
    return myAggregateRating;
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   */
  public Audience getAudience() {
    return myAudience;
  }
  /**
   * An award won by or for this item.
   */
  public String getAward() {
    return myAward;
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public BrandOrOrganization getBrand() {
    return myBrand;
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  public PhysicalActivityCategoryOrStringOrThing getCategory() {
    return myCategory;
  }
  /**
   * The color of the product.
   */
  public String getColor() {
    return myColor;
  }
  /**
   * The depth of the item.
   */
  public DistanceOrQuantitativeValue getDepth() {
    return myDepth;
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
   * The height of the item.
   */
  public DistanceOrQuantitativeValue getHeight() {
    return myHeight;
  }
  /**
   * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
   */
  public Product getIsAccessoryOrSparePartFor() {
    return myIsAccessoryOrSparePartFor;
  }
  /**
   * A pointer to another product (or multiple products) for which this product is a consumable.
   */
  public Product getIsConsumableFor() {
    return myIsConsumableFor;
  }
  /**
   * A pointer to another, somehow related product (or multiple products).
   */
  public Product getIsRelatedTo() {
    return myIsRelatedTo;
  }
  /**
   * A pointer to another, functionally similar product (or multiple products).
   */
  public Product getIsSimilarTo() {
    return myIsSimilarTo;
  }
  /**
   * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
   */
  public OfferItemCondition getItemCondition() {
    return myItemCondition;
  }
  /**
   * An associated logo.
   */
  public ImageObjectOrString getLogo() {
    return myLogo;
  }
  /**
   * The manufacturer of the product.
   */
  public Organization getManufacturer() {
    return myManufacturer;
  }
  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
   */
  public ProductModelOrString getModel() {
    return myModel;
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   */
  public String getMpn() {
    return myMpn;
  }
  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
   */
  public Offer getOffers() {
    return myOffers;
  }
  /**
   * The product identifier, such as ISBN. For example: <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>.
   */
  public String getProductID() {
    return myProductID;
  }
  /**
   * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getReleaseDate() {
    return myReleaseDate;
  }
  /**
   * A review of the item.
   */
  public Review getReview() {
    return myReview;
  }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   */
  public String getSku() {
    return mySku;
  }
  /**
   * The weight of the product or person.
   */
  public QuantitativeValue getWeight() {
    return myWeight;
  }
  /**
   * The width of the item.
   */
  public DistanceOrQuantitativeValue getWidth() {
    return myWidth;
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

   */
  public PropertyValue getAdditionalProperty() {
    return myAdditionalProperty;
  }
  /**
   * The date of production of the item, e.g. vehicle.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getProductionDate() {
    return myProductionDate;
  }
  /**
   * The date the item e.g. vehicle was purchased by the current owner.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getPurchaseDate() {
    return myPurchaseDate;
  }
  /**
   * Builder for {@link Product}
   */
  static final class ProductThingBuilder implements Builder {
    /**
     * Creates new {@link Product} instance.
     */
    public Product build() {
      return new Product(aggregateRating, audience, award, brand, category, color, depth, gtin12, gtin13, gtin14, gtin8, height, isAccessoryOrSparePartFor, isConsumableFor, isRelatedTo, isSimilarTo, itemCondition, logo, manufacturer, model, mpn, offers, productID, releaseDate, review, sku, weight, width, additionalProperty, productionDate, purchaseDate, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
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
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      this.audience = audience;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      return this.audience(audience.build());
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      this.award = award;
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      if (this.brand == null) this.brand = new BrandOrOrganization();
      this.brand.setBrand(brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      return this.brand(brand.build());
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      if (this.brand == null) this.brand = new BrandOrOrganization();
      this.brand.setOrganization(organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      return this.brand(organization.build());
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
     * The color of the product.
     */
    @NotNull public Builder color(@NotNull String color) {
      this.color = color;
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull Distance distance) {
      if (this.depth == null) this.depth = new DistanceOrQuantitativeValue();
      this.depth.setDistance(distance);
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull Distance.Builder distance) {
      return this.depth(distance.build());
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull QuantitativeValue quantitativeValue) {
      if (this.depth == null) this.depth = new DistanceOrQuantitativeValue();
      this.depth.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.depth(quantitativeValue.build());
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
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull Distance distance) {
      if (this.height == null) this.height = new DistanceOrQuantitativeValue();
      this.height.setDistance(distance);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull Distance.Builder distance) {
      return this.height(distance.build());
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull QuantitativeValue quantitativeValue) {
      if (this.height == null) this.height = new DistanceOrQuantitativeValue();
      this.height.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.height(quantitativeValue.build());
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    @NotNull public Builder isAccessoryOrSparePartFor(@NotNull Product product) {
      this.isAccessoryOrSparePartFor = product;
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    @NotNull public Builder isAccessoryOrSparePartFor(@NotNull Product.Builder product) {
      return this.isAccessoryOrSparePartFor(product.build());
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    @NotNull public Builder isConsumableFor(@NotNull Product product) {
      this.isConsumableFor = product;
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    @NotNull public Builder isConsumableFor(@NotNull Product.Builder product) {
      return this.isConsumableFor(product.build());
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Product product) {
      this.isRelatedTo = product;
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(@NotNull Product.Builder product) {
      return this.isRelatedTo(product.build());
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Product product) {
      this.isSimilarTo = product;
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(@NotNull Product.Builder product) {
      return this.isSimilarTo(product.build());
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
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject imageObject) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setImageObject(imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject.Builder imageObject) {
      return this.logo(imageObject.build());
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull String logo) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setString(logo);
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(@NotNull Organization organization) {
      this.manufacturer = organization;
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(@NotNull Organization.Builder organization) {
      return this.manufacturer(organization.build());
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(@NotNull ProductModel productModel) {
      if (this.model == null) this.model = new ProductModelOrString();
      this.model.setProductModel(productModel);
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(@NotNull ProductModel.Builder productModel) {
      return this.model(productModel.build());
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(@NotNull String model) {
      if (this.model == null) this.model = new ProductModelOrString();
      this.model.setString(model);
      return this;
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    @NotNull public Builder mpn(@NotNull String mpn) {
      this.mpn = mpn;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      this.offers = offer;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      return this.offers(offer.build());
    }
    /**
     * The product identifier, such as ISBN. For example: <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>.
     */
    @NotNull public Builder productID(@NotNull String productID) {
      this.productID = productID;
      return this;
    }
    /**
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     */
    @NotNull public Builder releaseDate(@NotNull java.util.Date date) {
      this.releaseDate = date;
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
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    @NotNull public Builder sku(@NotNull String sku) {
      this.sku = sku;
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue quantitativeValue) {
      this.weight = quantitativeValue;
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.weight(quantitativeValue.build());
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull Distance distance) {
      if (this.width == null) this.width = new DistanceOrQuantitativeValue();
      this.width.setDistance(distance);
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull Distance.Builder distance) {
      return this.width(distance.build());
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull QuantitativeValue quantitativeValue) {
      if (this.width == null) this.width = new DistanceOrQuantitativeValue();
      this.width.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.width(quantitativeValue.build());
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      this.additionalProperty = propertyValue;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      return this.additionalProperty(propertyValue.build());
    }
    /**
     * The date of production of the item, e.g. vehicle.
     */
    @NotNull public Builder productionDate(@NotNull java.util.Date date) {
      this.productionDate = date;
      return this;
    }
    /**
     * The date the item e.g. vehicle was purchased by the current owner.
     */
    @NotNull public Builder purchaseDate(@NotNull java.util.Date date) {
      this.purchaseDate = date;
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
        if ("aggregateRating".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); continue; }
        if ("audience".equals(key) && value instanceof Audience) { audience((Audience)value); continue; }
        if ("award".equals(key) && value instanceof String) { award((String)value); continue; }
        if ("brand".equals(key) && value instanceof Brand) { brand((Brand)value); continue; }
        if ("brand".equals(key) && value instanceof Organization) { brand((Organization)value); continue; }
        if ("category".equals(key) && value instanceof PhysicalActivityCategory) { category((PhysicalActivityCategory)value); continue; }
        if ("category".equals(key) && value instanceof String) { category((String)value); continue; }
        if ("category".equals(key) && value instanceof Thing) { category((Thing)value); continue; }
        if ("color".equals(key) && value instanceof String) { color((String)value); continue; }
        if ("depth".equals(key) && value instanceof Distance) { depth((Distance)value); continue; }
        if ("depth".equals(key) && value instanceof QuantitativeValue) { depth((QuantitativeValue)value); continue; }
        if ("gtin12".equals(key) && value instanceof String) { gtin12((String)value); continue; }
        if ("gtin13".equals(key) && value instanceof String) { gtin13((String)value); continue; }
        if ("gtin14".equals(key) && value instanceof String) { gtin14((String)value); continue; }
        if ("gtin8".equals(key) && value instanceof String) { gtin8((String)value); continue; }
        if ("height".equals(key) && value instanceof Distance) { height((Distance)value); continue; }
        if ("height".equals(key) && value instanceof QuantitativeValue) { height((QuantitativeValue)value); continue; }
        if ("isAccessoryOrSparePartFor".equals(key) && value instanceof Product) { isAccessoryOrSparePartFor((Product)value); continue; }
        if ("isConsumableFor".equals(key) && value instanceof Product) { isConsumableFor((Product)value); continue; }
        if ("isRelatedTo".equals(key) && value instanceof Product) { isRelatedTo((Product)value); continue; }
        if ("isSimilarTo".equals(key) && value instanceof Product) { isSimilarTo((Product)value); continue; }
        if ("itemCondition".equals(key) && value instanceof OfferItemCondition) { itemCondition((OfferItemCondition)value); continue; }
        if ("logo".equals(key) && value instanceof ImageObject) { logo((ImageObject)value); continue; }
        if ("logo".equals(key) && value instanceof String) { logo((String)value); continue; }
        if ("manufacturer".equals(key) && value instanceof Organization) { manufacturer((Organization)value); continue; }
        if ("model".equals(key) && value instanceof ProductModel) { model((ProductModel)value); continue; }
        if ("model".equals(key) && value instanceof String) { model((String)value); continue; }
        if ("mpn".equals(key) && value instanceof String) { mpn((String)value); continue; }
        if ("offers".equals(key) && value instanceof Offer) { offers((Offer)value); continue; }
        if ("productID".equals(key) && value instanceof String) { productID((String)value); continue; }
        if ("releaseDate".equals(key) && value instanceof java.util.Date) { releaseDate((java.util.Date)value); continue; }
        if ("review".equals(key) && value instanceof Review) { review((Review)value); continue; }
        if ("sku".equals(key) && value instanceof String) { sku((String)value); continue; }
        if ("weight".equals(key) && value instanceof QuantitativeValue) { weight((QuantitativeValue)value); continue; }
        if ("width".equals(key) && value instanceof Distance) { width((Distance)value); continue; }
        if ("width".equals(key) && value instanceof QuantitativeValue) { width((QuantitativeValue)value); continue; }
        if ("additionalProperty".equals(key) && value instanceof PropertyValue) { additionalProperty((PropertyValue)value); continue; }
        if ("productionDate".equals(key) && value instanceof java.util.Date) { productionDate((java.util.Date)value); continue; }
        if ("purchaseDate".equals(key) && value instanceof java.util.Date) { purchaseDate((java.util.Date)value); continue; }
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
    private AggregateRating aggregateRating;
    private Audience audience;
    private String award;
    private BrandOrOrganization brand;
    private PhysicalActivityCategoryOrStringOrThing category;
    private String color;
    private DistanceOrQuantitativeValue depth;
    private String gtin12;
    private String gtin13;
    private String gtin14;
    private String gtin8;
    private DistanceOrQuantitativeValue height;
    private Product isAccessoryOrSparePartFor;
    private Product isConsumableFor;
    private Product isRelatedTo;
    private Product isSimilarTo;
    private OfferItemCondition itemCondition;
    private ImageObjectOrString logo;
    private Organization manufacturer;
    private ProductModelOrString model;
    private String mpn;
    private Offer offers;
    private String productID;
    private java.util.Date releaseDate;
    private Review review;
    private String sku;
    private QuantitativeValue weight;
    private DistanceOrQuantitativeValue width;
    private PropertyValue additionalProperty;
    private java.util.Date productionDate;
    private java.util.Date purchaseDate;
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
  public interface Builder extends ThingBuilder<Product> {
    @NotNull Builder aggregateRating(@NotNull AggregateRating aggregateRating);
    @NotNull Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating);
    @NotNull Builder audience(@NotNull Audience audience);
    @NotNull Builder audience(@NotNull Audience.Builder audience);
    @NotNull Builder award(@NotNull String award);
    @NotNull Builder brand(@NotNull Brand brand);
    @NotNull Builder brand(@NotNull Brand.Builder brand);
    @NotNull Builder brand(@NotNull Organization organization);
    @NotNull Builder brand(@NotNull Organization.Builder organization);
    @NotNull Builder category(@NotNull PhysicalActivityCategory physicalActivityCategory);
    @NotNull Builder category(@NotNull PhysicalActivityCategory.Builder physicalActivityCategory);
    @NotNull Builder category(@NotNull String category);
    @NotNull Builder category(@NotNull Thing thing);
    @NotNull Builder category(@NotNull Thing.Builder thing);
    @NotNull Builder color(@NotNull String color);
    @NotNull Builder depth(@NotNull Distance distance);
    @NotNull Builder depth(@NotNull Distance.Builder distance);
    @NotNull Builder depth(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder depth(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder gtin12(@NotNull String gtin12);
    @NotNull Builder gtin13(@NotNull String gtin13);
    @NotNull Builder gtin14(@NotNull String gtin14);
    @NotNull Builder gtin8(@NotNull String gtin8);
    @NotNull Builder height(@NotNull Distance distance);
    @NotNull Builder height(@NotNull Distance.Builder distance);
    @NotNull Builder height(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder height(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder isAccessoryOrSparePartFor(@NotNull Product product);
    @NotNull Builder isAccessoryOrSparePartFor(@NotNull Product.Builder product);
    @NotNull Builder isConsumableFor(@NotNull Product product);
    @NotNull Builder isConsumableFor(@NotNull Product.Builder product);
    @NotNull Builder isRelatedTo(@NotNull Product product);
    @NotNull Builder isRelatedTo(@NotNull Product.Builder product);
    @NotNull Builder isSimilarTo(@NotNull Product product);
    @NotNull Builder isSimilarTo(@NotNull Product.Builder product);
    @NotNull Builder itemCondition(@NotNull OfferItemCondition offerItemCondition);
    @NotNull Builder itemCondition(@NotNull OfferItemCondition.Builder offerItemCondition);
    @NotNull Builder logo(@NotNull ImageObject imageObject);
    @NotNull Builder logo(@NotNull ImageObject.Builder imageObject);
    @NotNull Builder logo(@NotNull String logo);
    @NotNull Builder manufacturer(@NotNull Organization organization);
    @NotNull Builder manufacturer(@NotNull Organization.Builder organization);
    @NotNull Builder model(@NotNull ProductModel productModel);
    @NotNull Builder model(@NotNull ProductModel.Builder productModel);
    @NotNull Builder model(@NotNull String model);
    @NotNull Builder mpn(@NotNull String mpn);
    @NotNull Builder offers(@NotNull Offer offer);
    @NotNull Builder offers(@NotNull Offer.Builder offer);
    @NotNull Builder productID(@NotNull String productID);
    @NotNull Builder releaseDate(@NotNull java.util.Date date);
    @NotNull Builder review(@NotNull Review review);
    @NotNull Builder review(@NotNull Review.Builder review);
    @NotNull Builder sku(@NotNull String sku);
    @NotNull Builder weight(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder weight(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder width(@NotNull Distance distance);
    @NotNull Builder width(@NotNull Distance.Builder distance);
    @NotNull Builder width(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder width(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder additionalProperty(@NotNull PropertyValue propertyValue);
    @NotNull Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue);
    @NotNull Builder productionDate(@NotNull java.util.Date date);
    @NotNull Builder purchaseDate(@NotNull java.util.Date date);
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

  protected Product(AggregateRating aggregateRating, Audience audience, String award, BrandOrOrganization brand, PhysicalActivityCategoryOrStringOrThing category, String color, DistanceOrQuantitativeValue depth, String gtin12, String gtin13, String gtin14, String gtin8, DistanceOrQuantitativeValue height, Product isAccessoryOrSparePartFor, Product isConsumableFor, Product isRelatedTo, Product isSimilarTo, OfferItemCondition itemCondition, ImageObjectOrString logo, Organization manufacturer, ProductModelOrString model, String mpn, Offer offers, String productID, java.util.Date releaseDate, Review review, String sku, QuantitativeValue weight, DistanceOrQuantitativeValue width, PropertyValue additionalProperty, java.util.Date productionDate, java.util.Date purchaseDate, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myAggregateRating = aggregateRating;
    myAudience = audience;
    myAward = award;
    myBrand = brand;
    myCategory = category;
    myColor = color;
    myDepth = depth;
    myGtin12 = gtin12;
    myGtin13 = gtin13;
    myGtin14 = gtin14;
    myGtin8 = gtin8;
    myHeight = height;
    myIsAccessoryOrSparePartFor = isAccessoryOrSparePartFor;
    myIsConsumableFor = isConsumableFor;
    myIsRelatedTo = isRelatedTo;
    myIsSimilarTo = isSimilarTo;
    myItemCondition = itemCondition;
    myLogo = logo;
    myManufacturer = manufacturer;
    myModel = model;
    myMpn = mpn;
    myOffers = offers;
    myProductID = productID;
    myReleaseDate = releaseDate;
    myReview = review;
    mySku = sku;
    myWeight = weight;
    myWidth = width;
    myAdditionalProperty = additionalProperty;
    myProductionDate = productionDate;
    myPurchaseDate = purchaseDate;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myAggregateRating != null ? myAggregateRating.hashCode() : 0);
    result = 31 * result + (myAudience != null ? myAudience.hashCode() : 0);
    result = 31 * result + (myAward != null ? myAward.hashCode() : 0);
    result = 31 * result + (myBrand != null ? myBrand.hashCode() : 0);
    result = 31 * result + (myCategory != null ? myCategory.hashCode() : 0);
    result = 31 * result + (myColor != null ? myColor.hashCode() : 0);
    result = 31 * result + (myDepth != null ? myDepth.hashCode() : 0);
    result = 31 * result + (myGtin12 != null ? myGtin12.hashCode() : 0);
    result = 31 * result + (myGtin13 != null ? myGtin13.hashCode() : 0);
    result = 31 * result + (myGtin14 != null ? myGtin14.hashCode() : 0);
    result = 31 * result + (myGtin8 != null ? myGtin8.hashCode() : 0);
    result = 31 * result + (myHeight != null ? myHeight.hashCode() : 0);
    result = 31 * result + (myIsAccessoryOrSparePartFor != null ? myIsAccessoryOrSparePartFor.hashCode() : 0);
    result = 31 * result + (myIsConsumableFor != null ? myIsConsumableFor.hashCode() : 0);
    result = 31 * result + (myIsRelatedTo != null ? myIsRelatedTo.hashCode() : 0);
    result = 31 * result + (myIsSimilarTo != null ? myIsSimilarTo.hashCode() : 0);
    result = 31 * result + (myItemCondition != null ? myItemCondition.hashCode() : 0);
    result = 31 * result + (myLogo != null ? myLogo.hashCode() : 0);
    result = 31 * result + (myManufacturer != null ? myManufacturer.hashCode() : 0);
    result = 31 * result + (myModel != null ? myModel.hashCode() : 0);
    result = 31 * result + (myMpn != null ? myMpn.hashCode() : 0);
    result = 31 * result + (myOffers != null ? myOffers.hashCode() : 0);
    result = 31 * result + (myProductID != null ? myProductID.hashCode() : 0);
    result = 31 * result + (myReleaseDate != null ? myReleaseDate.hashCode() : 0);
    result = 31 * result + (myReview != null ? myReview.hashCode() : 0);
    result = 31 * result + (mySku != null ? mySku.hashCode() : 0);
    result = 31 * result + (myWeight != null ? myWeight.hashCode() : 0);
    result = 31 * result + (myWidth != null ? myWidth.hashCode() : 0);
    result = 31 * result + (myAdditionalProperty != null ? myAdditionalProperty.hashCode() : 0);
    result = 31 * result + (myProductionDate != null ? myProductionDate.hashCode() : 0);
    result = 31 * result + (myPurchaseDate != null ? myPurchaseDate.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    if (!super.equals(o)) return false;
    if (myAggregateRating != null ? !myAggregateRating.equals(product.myAggregateRating) : product.myAggregateRating != null) return false;
    if (myAudience != null ? !myAudience.equals(product.myAudience) : product.myAudience != null) return false;
    if (myAward != null ? !myAward.equals(product.myAward) : product.myAward != null) return false;
    if (myBrand != null ? !myBrand.equals(product.myBrand) : product.myBrand != null) return false;
    if (myCategory != null ? !myCategory.equals(product.myCategory) : product.myCategory != null) return false;
    if (myColor != null ? !myColor.equals(product.myColor) : product.myColor != null) return false;
    if (myDepth != null ? !myDepth.equals(product.myDepth) : product.myDepth != null) return false;
    if (myGtin12 != null ? !myGtin12.equals(product.myGtin12) : product.myGtin12 != null) return false;
    if (myGtin13 != null ? !myGtin13.equals(product.myGtin13) : product.myGtin13 != null) return false;
    if (myGtin14 != null ? !myGtin14.equals(product.myGtin14) : product.myGtin14 != null) return false;
    if (myGtin8 != null ? !myGtin8.equals(product.myGtin8) : product.myGtin8 != null) return false;
    if (myHeight != null ? !myHeight.equals(product.myHeight) : product.myHeight != null) return false;
    if (myIsAccessoryOrSparePartFor != null ? !myIsAccessoryOrSparePartFor.equals(product.myIsAccessoryOrSparePartFor) : product.myIsAccessoryOrSparePartFor != null) return false;
    if (myIsConsumableFor != null ? !myIsConsumableFor.equals(product.myIsConsumableFor) : product.myIsConsumableFor != null) return false;
    if (myIsRelatedTo != null ? !myIsRelatedTo.equals(product.myIsRelatedTo) : product.myIsRelatedTo != null) return false;
    if (myIsSimilarTo != null ? !myIsSimilarTo.equals(product.myIsSimilarTo) : product.myIsSimilarTo != null) return false;
    if (myItemCondition != null ? !myItemCondition.equals(product.myItemCondition) : product.myItemCondition != null) return false;
    if (myLogo != null ? !myLogo.equals(product.myLogo) : product.myLogo != null) return false;
    if (myManufacturer != null ? !myManufacturer.equals(product.myManufacturer) : product.myManufacturer != null) return false;
    if (myModel != null ? !myModel.equals(product.myModel) : product.myModel != null) return false;
    if (myMpn != null ? !myMpn.equals(product.myMpn) : product.myMpn != null) return false;
    if (myOffers != null ? !myOffers.equals(product.myOffers) : product.myOffers != null) return false;
    if (myProductID != null ? !myProductID.equals(product.myProductID) : product.myProductID != null) return false;
    if (myReleaseDate != null ? !myReleaseDate.equals(product.myReleaseDate) : product.myReleaseDate != null) return false;
    if (myReview != null ? !myReview.equals(product.myReview) : product.myReview != null) return false;
    if (mySku != null ? !mySku.equals(product.mySku) : product.mySku != null) return false;
    if (myWeight != null ? !myWeight.equals(product.myWeight) : product.myWeight != null) return false;
    if (myWidth != null ? !myWidth.equals(product.myWidth) : product.myWidth != null) return false;
    if (myAdditionalProperty != null ? !myAdditionalProperty.equals(product.myAdditionalProperty) : product.myAdditionalProperty != null) return false;
    if (myProductionDate != null ? !myProductionDate.equals(product.myProductionDate) : product.myProductionDate != null) return false;
    if (myPurchaseDate != null ? !myPurchaseDate.equals(product.myPurchaseDate) : product.myPurchaseDate != null) return false;
    return true;
  }

  private AggregateRating myAggregateRating;
  private Audience myAudience;
  private String myAward;
  private BrandOrOrganization myBrand;
  private PhysicalActivityCategoryOrStringOrThing myCategory;
  private String myColor;
  private DistanceOrQuantitativeValue myDepth;
  private String myGtin12;
  private String myGtin13;
  private String myGtin14;
  private String myGtin8;
  private DistanceOrQuantitativeValue myHeight;
  private Product myIsAccessoryOrSparePartFor;
  private Product myIsConsumableFor;
  private Product myIsRelatedTo;
  private Product myIsSimilarTo;
  private OfferItemCondition myItemCondition;
  private ImageObjectOrString myLogo;
  private Organization myManufacturer;
  private ProductModelOrString myModel;
  private String myMpn;
  private Offer myOffers;
  private String myProductID;
  private java.util.Date myReleaseDate;
  private Review myReview;
  private String mySku;
  private QuantitativeValue myWeight;
  private DistanceOrQuantitativeValue myWidth;
  private PropertyValue myAdditionalProperty;
  private java.util.Date myProductionDate;
  private java.util.Date myPurchaseDate;
}
