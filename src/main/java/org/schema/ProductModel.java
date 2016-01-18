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
 * A datasheet or vendor specification of a product (in the sense of a prototypical description).
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class ProductModel extends Product {
  /**
   * A pointer to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive.
   */
  public ProductModel getIsVariantOf() {
    return myIsVariantOf;
  }
  /**
   * A pointer from a previous, often discontinued variant of the product to its newer variant.
   */
  public ProductModel getPredecessorOf() {
    return myPredecessorOf;
  }
  /**
   * A pointer from a newer variant of a product  to its previous, often discontinued predecessor.
   */
  public ProductModel getSuccessorOf() {
    return mySuccessorOf;
  }
  /**
   * Builder for {@link ProductModel}
   */
  static final class ProductModelThingBuilder implements Builder {
    /**
     * Creates new {@link ProductModel} instance.
     */
    public ProductModel build() {
      return new ProductModel(isVariantOf, predecessorOf, successorOf, aggregateRating, audience, award, brand, category, color, depth, gtin12, gtin13, gtin14, gtin8, height, isAccessoryOrSparePartFor, isConsumableFor, isRelatedTo, isSimilarTo, itemCondition, logo, manufacturer, model, mpn, offers, productID, releaseDate, review, sku, weight, width, additionalProperty, productionDate, purchaseDate, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A pointer to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive.
     */
    @NotNull public Builder isVariantOf(ProductModel productModel) {
      this.isVariantOf = productModel;
      return this;
    }
    /**
     * A pointer to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive.
     */
    @NotNull public Builder isVariantOf(ProductModel.Builder productModel) {
      return this.isVariantOf(productModel.build());
    }
    /**
     * A pointer from a previous, often discontinued variant of the product to its newer variant.
     */
    @NotNull public Builder predecessorOf(ProductModel productModel) {
      this.predecessorOf = productModel;
      return this;
    }
    /**
     * A pointer from a previous, often discontinued variant of the product to its newer variant.
     */
    @NotNull public Builder predecessorOf(ProductModel.Builder productModel) {
      return this.predecessorOf(productModel.build());
    }
    /**
     * A pointer from a newer variant of a product  to its previous, often discontinued predecessor.
     */
    @NotNull public Builder successorOf(ProductModel productModel) {
      this.successorOf = productModel;
      return this;
    }
    /**
     * A pointer from a newer variant of a product  to its previous, often discontinued predecessor.
     */
    @NotNull public Builder successorOf(ProductModel.Builder productModel) {
      return this.successorOf(productModel.build());
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(AggregateRating.Builder aggregateRating) {
      return this.aggregateRating(aggregateRating.build());
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(Audience audience) {
      this.audience = audience;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(Audience.Builder audience) {
      return this.audience(audience.build());
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(String award) {
      this.award = award;
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(Brand brand) {
      if (this.brand == null) this.brand = new BrandOrOrganization();
      this.brand.setBrand(brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(Brand.Builder brand) {
      return this.brand(brand.build());
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(Organization organization) {
      if (this.brand == null) this.brand = new BrandOrOrganization();
      this.brand.setOrganization(organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(Organization.Builder organization) {
      return this.brand(organization.build());
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(PhysicalActivityCategory physicalActivityCategory) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setPhysicalActivityCategory(physicalActivityCategory);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(PhysicalActivityCategory.Builder physicalActivityCategory) {
      return this.category(physicalActivityCategory.build());
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(String category) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setString(category);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(Thing thing) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setThing(thing);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(Thing.Builder thing) {
      return this.category(thing.build());
    }
    /**
     * The color of the product.
     */
    @NotNull public Builder color(String color) {
      this.color = color;
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(Distance distance) {
      if (this.depth == null) this.depth = new DistanceOrQuantitativeValue();
      this.depth.setDistance(distance);
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(Distance.Builder distance) {
      return this.depth(distance.build());
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(QuantitativeValue quantitativeValue) {
      if (this.depth == null) this.depth = new DistanceOrQuantitativeValue();
      this.depth.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The depth of the item.
     */
    @NotNull public Builder depth(QuantitativeValue.Builder quantitativeValue) {
      return this.depth(quantitativeValue.build());
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin12(String gtin12) {
      this.gtin12 = gtin12;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin13(String gtin13) {
      this.gtin13 = gtin13;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin14(String gtin14) {
      this.gtin14 = gtin14;
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin8(String gtin8) {
      this.gtin8 = gtin8;
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(Distance distance) {
      if (this.height == null) this.height = new DistanceOrQuantitativeValue();
      this.height.setDistance(distance);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(Distance.Builder distance) {
      return this.height(distance.build());
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(QuantitativeValue quantitativeValue) {
      if (this.height == null) this.height = new DistanceOrQuantitativeValue();
      this.height.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(QuantitativeValue.Builder quantitativeValue) {
      return this.height(quantitativeValue.build());
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    @NotNull public Builder isAccessoryOrSparePartFor(Product product) {
      this.isAccessoryOrSparePartFor = product;
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    @NotNull public Builder isAccessoryOrSparePartFor(Product.Builder product) {
      return this.isAccessoryOrSparePartFor(product.build());
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    @NotNull public Builder isConsumableFor(Product product) {
      this.isConsumableFor = product;
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    @NotNull public Builder isConsumableFor(Product.Builder product) {
      return this.isConsumableFor(product.build());
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(Product product) {
      this.isRelatedTo = product;
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @NotNull public Builder isRelatedTo(Product.Builder product) {
      return this.isRelatedTo(product.build());
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(Product product) {
      this.isSimilarTo = product;
      return this;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @NotNull public Builder isSimilarTo(Product.Builder product) {
      return this.isSimilarTo(product.build());
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    @NotNull public Builder itemCondition(OfferItemCondition offerItemCondition) {
      this.itemCondition = offerItemCondition;
      return this;
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    @NotNull public Builder itemCondition(OfferItemCondition.Builder offerItemCondition) {
      return this.itemCondition(offerItemCondition.build());
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(ImageObject imageObject) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setImageObject(imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(ImageObject.Builder imageObject) {
      return this.logo(imageObject.build());
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(String logo) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setString(logo);
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(Organization organization) {
      this.manufacturer = organization;
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(Organization.Builder organization) {
      return this.manufacturer(organization.build());
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(ProductModel productModel) {
      if (this.model == null) this.model = new ProductModelOrString();
      this.model.setProductModel(productModel);
      return this;
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(ProductModel.Builder productModel) {
      return this.model(productModel.build());
    }
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @NotNull public Builder model(String model) {
      if (this.model == null) this.model = new ProductModelOrString();
      this.model.setString(model);
      return this;
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    @NotNull public Builder mpn(String mpn) {
      this.mpn = mpn;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(Offer offer) {
      this.offers = offer;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(Offer.Builder offer) {
      return this.offers(offer.build());
    }
    /**
     * The product identifier, such as ISBN. For example: <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>.
     */
    @NotNull public Builder productID(String productID) {
      this.productID = productID;
      return this;
    }
    /**
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     */
    @NotNull public Builder releaseDate(java.util.Date date) {
      this.releaseDate = date;
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(Review review) {
      this.review = review;
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(Review.Builder review) {
      return this.review(review.build());
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    @NotNull public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(QuantitativeValue quantitativeValue) {
      this.weight = quantitativeValue;
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(QuantitativeValue.Builder quantitativeValue) {
      return this.weight(quantitativeValue.build());
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(Distance distance) {
      if (this.width == null) this.width = new DistanceOrQuantitativeValue();
      this.width.setDistance(distance);
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(Distance.Builder distance) {
      return this.width(distance.build());
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(QuantitativeValue quantitativeValue) {
      if (this.width == null) this.width = new DistanceOrQuantitativeValue();
      this.width.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The width of the item.
     */
    @NotNull public Builder width(QuantitativeValue.Builder quantitativeValue) {
      return this.width(quantitativeValue.build());
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    @NotNull public Builder additionalProperty(PropertyValue propertyValue) {
      this.additionalProperty = propertyValue;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    @NotNull public Builder additionalProperty(PropertyValue.Builder propertyValue) {
      return this.additionalProperty(propertyValue.build());
    }
    /**
     * The date of production of the item, e.g. vehicle.
     */
    @NotNull public Builder productionDate(java.util.Date date) {
      this.productionDate = date;
      return this;
    }
    /**
     * The date the item e.g. vehicle was purchased by the current owner.
     */
    @NotNull public Builder purchaseDate(java.util.Date date) {
      this.purchaseDate = date;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(String description) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private ProductModel isVariantOf;
    private ProductModel predecessorOf;
    private ProductModel successorOf;
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
  public interface Builder extends ThingBuilder<ProductModel> {
    @NotNull Builder isVariantOf(ProductModel productModel);
    @NotNull Builder isVariantOf(ProductModel.Builder productModel);
    @NotNull Builder predecessorOf(ProductModel productModel);
    @NotNull Builder predecessorOf(ProductModel.Builder productModel);
    @NotNull Builder successorOf(ProductModel productModel);
    @NotNull Builder successorOf(ProductModel.Builder productModel);
    @NotNull Builder aggregateRating(AggregateRating aggregateRating);
    @NotNull Builder aggregateRating(AggregateRating.Builder aggregateRating);
    @NotNull Builder audience(Audience audience);
    @NotNull Builder audience(Audience.Builder audience);
    @NotNull Builder award(String award);
    @NotNull Builder brand(Brand brand);
    @NotNull Builder brand(Brand.Builder brand);
    @NotNull Builder brand(Organization organization);
    @NotNull Builder brand(Organization.Builder organization);
    @NotNull Builder category(PhysicalActivityCategory physicalActivityCategory);
    @NotNull Builder category(PhysicalActivityCategory.Builder physicalActivityCategory);
    @NotNull Builder category(String category);
    @NotNull Builder category(Thing thing);
    @NotNull Builder category(Thing.Builder thing);
    @NotNull Builder color(String color);
    @NotNull Builder depth(Distance distance);
    @NotNull Builder depth(Distance.Builder distance);
    @NotNull Builder depth(QuantitativeValue quantitativeValue);
    @NotNull Builder depth(QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder gtin12(String gtin12);
    @NotNull Builder gtin13(String gtin13);
    @NotNull Builder gtin14(String gtin14);
    @NotNull Builder gtin8(String gtin8);
    @NotNull Builder height(Distance distance);
    @NotNull Builder height(Distance.Builder distance);
    @NotNull Builder height(QuantitativeValue quantitativeValue);
    @NotNull Builder height(QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder isAccessoryOrSparePartFor(Product product);
    @NotNull Builder isAccessoryOrSparePartFor(Product.Builder product);
    @NotNull Builder isConsumableFor(Product product);
    @NotNull Builder isConsumableFor(Product.Builder product);
    @NotNull Builder isRelatedTo(Product product);
    @NotNull Builder isRelatedTo(Product.Builder product);
    @NotNull Builder isSimilarTo(Product product);
    @NotNull Builder isSimilarTo(Product.Builder product);
    @NotNull Builder itemCondition(OfferItemCondition offerItemCondition);
    @NotNull Builder itemCondition(OfferItemCondition.Builder offerItemCondition);
    @NotNull Builder logo(ImageObject imageObject);
    @NotNull Builder logo(ImageObject.Builder imageObject);
    @NotNull Builder logo(String logo);
    @NotNull Builder manufacturer(Organization organization);
    @NotNull Builder manufacturer(Organization.Builder organization);
    @NotNull Builder model(ProductModel productModel);
    @NotNull Builder model(ProductModel.Builder productModel);
    @NotNull Builder model(String model);
    @NotNull Builder mpn(String mpn);
    @NotNull Builder offers(Offer offer);
    @NotNull Builder offers(Offer.Builder offer);
    @NotNull Builder productID(String productID);
    @NotNull Builder releaseDate(java.util.Date date);
    @NotNull Builder review(Review review);
    @NotNull Builder review(Review.Builder review);
    @NotNull Builder sku(String sku);
    @NotNull Builder weight(QuantitativeValue quantitativeValue);
    @NotNull Builder weight(QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder width(Distance distance);
    @NotNull Builder width(Distance.Builder distance);
    @NotNull Builder width(QuantitativeValue quantitativeValue);
    @NotNull Builder width(QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder additionalProperty(PropertyValue propertyValue);
    @NotNull Builder additionalProperty(PropertyValue.Builder propertyValue);
    @NotNull Builder productionDate(java.util.Date date);
    @NotNull Builder purchaseDate(java.util.Date date);
    @NotNull Builder additionalType(String additionalType);
    @NotNull Builder alternateName(String alternateName);
    @NotNull Builder description(String description);
    @NotNull Builder mainEntityOfPage(CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(String mainEntityOfPage);
    @NotNull Builder name(String name);
    @NotNull Builder sameAs(String sameAs);
    @NotNull Builder url(String url);
    @NotNull Builder potentialAction(Action action);
    @NotNull Builder potentialAction(Action.Builder action);
    @NotNull Builder id(String id);
  }

  protected ProductModel(ProductModel isVariantOf, ProductModel predecessorOf, ProductModel successorOf, AggregateRating aggregateRating, Audience audience, String award, BrandOrOrganization brand, PhysicalActivityCategoryOrStringOrThing category, String color, DistanceOrQuantitativeValue depth, String gtin12, String gtin13, String gtin14, String gtin8, DistanceOrQuantitativeValue height, Product isAccessoryOrSparePartFor, Product isConsumableFor, Product isRelatedTo, Product isSimilarTo, OfferItemCondition itemCondition, ImageObjectOrString logo, Organization manufacturer, ProductModelOrString model, String mpn, Offer offers, String productID, java.util.Date releaseDate, Review review, String sku, QuantitativeValue weight, DistanceOrQuantitativeValue width, PropertyValue additionalProperty, java.util.Date productionDate, java.util.Date purchaseDate, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(aggregateRating, audience, award, brand, category, color, depth, gtin12, gtin13, gtin14, gtin8, height, isAccessoryOrSparePartFor, isConsumableFor, isRelatedTo, isSimilarTo, itemCondition, logo, manufacturer, model, mpn, offers, productID, releaseDate, review, sku, weight, width, additionalProperty, productionDate, purchaseDate, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myIsVariantOf = isVariantOf;
    myPredecessorOf = predecessorOf;
    mySuccessorOf = successorOf;
  }
  private ProductModel myIsVariantOf;
  private ProductModel myPredecessorOf;
  private ProductModel mySuccessorOf;
}
