/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

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
   * Builder for {@see ProductModel}
   */
  public static final class Builder {
    public ProductModel build() {
      return new ProductModel(review, productID, productionDate, width, offers, itemCondition, isVariantOf, weight, potentialAction, audience, additionalType, logo, isRelatedTo, image, description, isAccessoryOrSparePartFor, gtin12, model, brand, mainEntityOfPage, manufacturer, color, gtin13, purchaseDate, alternateName, isConsumableFor, gtin14, url, gtin8, aggregateRating, sameAs, isSimilarTo, height, releaseDate, depth, name, category, sku, additionalProperty, mpn, predecessorOf, successorOf, award);
    }
    /**
     * A review of the item.
     */
    public Builder review(Review value) {
      review = value;
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
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer value) {
      offers = value;
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
     * A pointer to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive.
     */
    public Builder isVariantOf(ProductModel value) {
      isVariantOf = value;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * An associated logo.
     */
    public Builder logo(ImageObject value) {
      logo = value;
      return this;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    public Builder isRelatedTo(Product value) {
      isRelatedTo = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
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
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    public Builder model(ProductModel value) {
      model = value;
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
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin13(String value) {
      gtin13 = value;
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
     * A pointer to another, functionally similar product (or multiple products).
     */
    public Builder isSimilarTo(Product value) {
      isSimilarTo = value;
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
     * The depth of the item.
     */
    public Builder depth(Distance value) {
      depth = value;
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
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    public Builder additionalProperty(PropertyValue value) {
      additionalProperty = value;
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
     * A pointer from a previous, often discontinued variant of the product to its newer variant.
     */
    public Builder predecessorOf(ProductModel value) {
      predecessorOf = value;
      return this;
    }
    /**
     * A pointer from a newer variant of a product  to its previous, often discontinued predecessor.
     */
    public Builder successorOf(ProductModel value) {
      successorOf = value;
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
    private String productID;
    private java.util.Date productionDate;
    private Distance width;
    private Offer offers;
    private OfferItemCondition itemCondition;
    private ProductModel isVariantOf;
    private QuantitativeValue weight;
    private Action potentialAction;
    private Audience audience;
    private String additionalType;
    private ImageObject logo;
    private Product isRelatedTo;
    private Image image;
    private String description;
    private Product isAccessoryOrSparePartFor;
    private String gtin12;
    private ProductModel model;
    private Brand brand;
    private CreativeWork mainEntityOfPage;
    private Organization manufacturer;
    private String color;
    private String gtin13;
    private java.util.Date purchaseDate;
    private String alternateName;
    private Product isConsumableFor;
    private String gtin14;
    private String url;
    private String gtin8;
    private AggregateRating aggregateRating;
    private String sameAs;
    private Product isSimilarTo;
    private Distance height;
    private java.util.Date releaseDate;
    private Distance depth;
    private String name;
    private PhysicalActivityCategory category;
    private String sku;
    private PropertyValue additionalProperty;
    private String mpn;
    private ProductModel predecessorOf;
    private ProductModel successorOf;
    private String award;
  }

  protected ProductModel(Review review, String productID, java.util.Date productionDate, Distance width, Offer offers, OfferItemCondition itemCondition, ProductModel isVariantOf, QuantitativeValue weight, Action potentialAction, Audience audience, String additionalType, ImageObject logo, Product isRelatedTo, Image image, String description, Product isAccessoryOrSparePartFor, String gtin12, ProductModel model, Brand brand, CreativeWork mainEntityOfPage, Organization manufacturer, String color, String gtin13, java.util.Date purchaseDate, String alternateName, Product isConsumableFor, String gtin14, String url, String gtin8, AggregateRating aggregateRating, String sameAs, Product isSimilarTo, Distance height, java.util.Date releaseDate, Distance depth, String name, PhysicalActivityCategory category, String sku, PropertyValue additionalProperty, String mpn, ProductModel predecessorOf, ProductModel successorOf, String award) {
    super(review, productionDate, width, productID, offers, itemCondition, potentialAction, weight, audience, additionalType, logo, isRelatedTo, image, description, isAccessoryOrSparePartFor, gtin12, model, brand, mainEntityOfPage, manufacturer, gtin13, color, purchaseDate, alternateName, isConsumableFor, url, gtin14, gtin8, sameAs, aggregateRating, isSimilarTo, height, releaseDate, name, depth, category, additionalProperty, sku, mpn, award);
    myIsVariantOf = isVariantOf;
    myPredecessorOf = predecessorOf;
    mySuccessorOf = successorOf;
  }
  private ProductModel myIsVariantOf;
  private ProductModel myPredecessorOf;
  private ProductModel mySuccessorOf;
}
