/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

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
  public Brand getBrand() {
    return myBrand;
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  public PhysicalActivityCategory getCategory() {
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
  public Distance getDepth() {
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
  public Distance getHeight() {
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
  public ImageObject getLogo() {
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
  public ProductModel getModel() {
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
  public Distance getWidth() {
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
   * Builder for {@see Product}
   */
  public static final class Builder {
    public Product build() {
      return new Product(review, productionDate, width, productID, offers, itemCondition, potentialAction, weight, audience, additionalType, logo, isRelatedTo, image, description, isAccessoryOrSparePartFor, gtin12, model, brand, mainEntityOfPage, manufacturer, gtin13, color, purchaseDate, alternateName, isConsumableFor, url, gtin14, gtin8, sameAs, aggregateRating, isSimilarTo, height, releaseDate, name, depth, category, additionalProperty, sku, mpn, award);
    }
    /**
     * A review of the item.
     */
    public Builder review(Review value) {
      review = value;
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
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    public Builder itemCondition(OfferItemCondition value) {
      itemCondition = value;
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
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin13(String value) {
      gtin13 = value;
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
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
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
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin8(String value) {
      gtin8 = value;
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
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating value) {
      aggregateRating = value;
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
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
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
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(PhysicalActivityCategory value) {
      category = value;
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
    private java.util.Date productionDate;
    private Distance width;
    private String productID;
    private Offer offers;
    private OfferItemCondition itemCondition;
    private Action potentialAction;
    private QuantitativeValue weight;
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
    private String gtin13;
    private String color;
    private java.util.Date purchaseDate;
    private String alternateName;
    private Product isConsumableFor;
    private String url;
    private String gtin14;
    private String gtin8;
    private String sameAs;
    private AggregateRating aggregateRating;
    private Product isSimilarTo;
    private Distance height;
    private java.util.Date releaseDate;
    private String name;
    private Distance depth;
    private PhysicalActivityCategory category;
    private PropertyValue additionalProperty;
    private String sku;
    private String mpn;
    private String award;
  }

  protected Product(Review review, java.util.Date productionDate, Distance width, String productID, Offer offers, OfferItemCondition itemCondition, Action potentialAction, QuantitativeValue weight, Audience audience, String additionalType, ImageObject logo, Product isRelatedTo, Image image, String description, Product isAccessoryOrSparePartFor, String gtin12, ProductModel model, Brand brand, CreativeWork mainEntityOfPage, Organization manufacturer, String gtin13, String color, java.util.Date purchaseDate, String alternateName, Product isConsumableFor, String url, String gtin14, String gtin8, String sameAs, AggregateRating aggregateRating, Product isSimilarTo, Distance height, java.util.Date releaseDate, String name, Distance depth, PhysicalActivityCategory category, PropertyValue additionalProperty, String sku, String mpn, String award) {
    super(mainEntityOfPage, name, image, potentialAction, alternateName, url, additionalType, description, sameAs);
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
  private Brand myBrand;
  private PhysicalActivityCategory myCategory;
  private String myColor;
  private Distance myDepth;
  private String myGtin12;
  private String myGtin13;
  private String myGtin14;
  private String myGtin8;
  private Distance myHeight;
  private Product myIsAccessoryOrSparePartFor;
  private Product myIsConsumableFor;
  private Product myIsRelatedTo;
  private Product myIsSimilarTo;
  private OfferItemCondition myItemCondition;
  private ImageObject myLogo;
  private Organization myManufacturer;
  private ProductModel myModel;
  private String myMpn;
  private Offer myOffers;
  private String myProductID;
  private java.util.Date myReleaseDate;
  private Review myReview;
  private String mySku;
  private QuantitativeValue myWeight;
  private Distance myWidth;
  private PropertyValue myAdditionalProperty;
  private java.util.Date myProductionDate;
  private java.util.Date myPurchaseDate;
}
