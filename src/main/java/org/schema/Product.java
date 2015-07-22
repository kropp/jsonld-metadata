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
  public OrganizationOrBrand getBrand() {
    return myBrand;
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  public ThingOrStringOrPhysicalActivityCategory getCategory() {
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
  public QuantitativeValueOrDistance getDepth() {
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
  public QuantitativeValueOrDistance getHeight() {
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
  public QuantitativeValueOrDistance getWidth() {
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
   * Builder for {@link Product}
   */
  public static final class Builder {
    /**
     * Creates new {@link Product} instance.
     */
    public Product build() {
      return new Product(purchaseDate, aggregateRating, review, depth, logo, isSimilarTo, gtin14, additionalType, sameAs, award, color, productID, gtin12, isAccessoryOrSparePartFor, brand, sku, manufacturer, potentialAction, additionalProperty, category, name, mpn, mainEntityOfPage, gtin8, audience, model, url, itemCondition, productionDate, isRelatedTo, height, alternateName, releaseDate, gtin13, description, offers, width, weight, isConsumableFor);
    }
    /**
     * The date the item e.g. vehicle was purchased by the current owner.
     */
    public Builder purchaseDate(java.util.Date date) {
      this.purchaseDate = date;
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
     * A review of the item.
     */
    public Builder review(Review review) {
      this.review = review;
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
     * An award won by or for this item.
     */
    public Builder award(String award) {
      this.award = award;
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
     * The product identifier, such as ISBN. For example: <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>.
     */
    public Builder productID(String productID) {
      this.productID = productID;
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
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    public Builder sku(String sku) {
      this.sku = sku;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
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
     * The date of production of the item, e.g. vehicle.
     */
    public Builder productionDate(java.util.Date date) {
      this.productionDate = date;
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
     * The weight of the product or person.
     */
    public Builder weight(QuantitativeValue quantitativeValue) {
      this.weight = quantitativeValue;
      return this;
    }
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    public Builder isConsumableFor(Product product) {
      this.isConsumableFor = product;
      return this;
    }
    private java.util.Date purchaseDate;
    private AggregateRating aggregateRating;
    private Review review;
    private QuantitativeValueOrDistance depth;
    private ImageObjectOrString logo;
    private Product isSimilarTo;
    private String gtin14;
    private String additionalType;
    private String sameAs;
    private String award;
    private String color;
    private String productID;
    private String gtin12;
    private Product isAccessoryOrSparePartFor;
    private OrganizationOrBrand brand;
    private String sku;
    private Organization manufacturer;
    private Action potentialAction;
    private PropertyValue additionalProperty;
    private ThingOrStringOrPhysicalActivityCategory category;
    private String name;
    private String mpn;
    private StringOrCreativeWork mainEntityOfPage;
    private String gtin8;
    private Audience audience;
    private ProductModelOrString model;
    private String url;
    private OfferItemCondition itemCondition;
    private java.util.Date productionDate;
    private Product isRelatedTo;
    private QuantitativeValueOrDistance height;
    private String alternateName;
    private java.util.Date releaseDate;
    private String gtin13;
    private String description;
    private Offer offers;
    private QuantitativeValueOrDistance width;
    private QuantitativeValue weight;
    private Product isConsumableFor;
  }

  protected Product(java.util.Date purchaseDate, AggregateRating aggregateRating, Review review, QuantitativeValueOrDistance depth, ImageObjectOrString logo, Product isSimilarTo, String gtin14, String additionalType, String sameAs, String award, String color, String productID, String gtin12, Product isAccessoryOrSparePartFor, OrganizationOrBrand brand, String sku, Organization manufacturer, Action potentialAction, PropertyValue additionalProperty, ThingOrStringOrPhysicalActivityCategory category, String name, String mpn, StringOrCreativeWork mainEntityOfPage, String gtin8, Audience audience, ProductModelOrString model, String url, OfferItemCondition itemCondition, java.util.Date productionDate, Product isRelatedTo, QuantitativeValueOrDistance height, String alternateName, java.util.Date releaseDate, String gtin13, String description, Offer offers, QuantitativeValueOrDistance width, QuantitativeValue weight, Product isConsumableFor) {
    super(url, sameAs, additionalType, alternateName, potentialAction, name, description, mainEntityOfPage);
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
  private AggregateRating myAggregateRating;
  private Audience myAudience;
  private String myAward;
  private OrganizationOrBrand myBrand;
  private ThingOrStringOrPhysicalActivityCategory myCategory;
  private String myColor;
  private QuantitativeValueOrDistance myDepth;
  private String myGtin12;
  private String myGtin13;
  private String myGtin14;
  private String myGtin8;
  private QuantitativeValueOrDistance myHeight;
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
  private QuantitativeValueOrDistance myWidth;
  private PropertyValue myAdditionalProperty;
  private java.util.Date myProductionDate;
  private java.util.Date myPurchaseDate;
}
