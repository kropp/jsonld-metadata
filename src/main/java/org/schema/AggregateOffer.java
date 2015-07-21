/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.
 */
public class AggregateOffer extends Offer {
  /**
   * The highest price of all offers available.
   */
  public Number getHighPrice() {
    return myHighPrice;
  }
  /**
   * The lowest price of all offers available.
   */
  public Number getLowPrice() {
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
   * Builder for {@see AggregateOffer}
   */
  public static final class Builder {
    public AggregateOffer build() {
      return new AggregateOffer(priceSpecification, deliveryLeadTime, acceptedPaymentMethod, review, offers, eligibleTransactionVolume, itemCondition, potentialAction, advanceBookingRequirement, additionalType, eligibleRegion, validFrom, itemOffered, includesObject, image, lowPrice, validThrough, inventoryLevel, serialNumber, availableDeliveryMethod, ineligibleRegion, eligibleDuration, eligibleQuantity, warranty, description, gtin12, price, seller, availability, availabilityEnds, eligibleCustomerType, mainEntityOfPage, businessFunction, priceCurrency, gtin13, priceValidUntil, alternateName, highPrice, addOn, gtin14, url, gtin8, aggregateRating, sameAs, offerCount, availableAtOrFrom, availabilityStarts, name, category, sku, mpn);
    }
    /**
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     */
    public Builder priceSpecification(PriceSpecification value) {
      priceSpecification = value;
      return this;
    }
    /**
     * The typical delay between the receipt of the order and the goods leaving the warehouse.
     */
    public Builder deliveryLeadTime(QuantitativeValue value) {
      deliveryLeadTime = value;
      return this;
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     */
    public Builder acceptedPaymentMethod(PaymentMethod value) {
      acceptedPaymentMethod = value;
      return this;
    }
    /**
     * A review of the item.
     */
    public Builder review(Review value) {
      review = value;
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
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    public Builder eligibleTransactionVolume(PriceSpecification value) {
      eligibleTransactionVolume = value;
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
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     */
    public Builder advanceBookingRequirement(QuantitativeValue value) {
      advanceBookingRequirement = value;
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
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    public Builder eligibleRegion(GeoShape value) {
      eligibleRegion = value;
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    public Builder validFrom(java.util.Date value) {
      validFrom = value;
      return this;
    }
    /**
     * The item being offered.
     */
    public Builder itemOffered(Product value) {
      itemOffered = value;
      return this;
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in the offer.
     */
    public Builder includesObject(TypeAndQuantityNode value) {
      includesObject = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * The lowest price of all offers available.
     */
    public Builder lowPrice(Number value) {
      lowPrice = value;
      return this;
    }
    /**
     * The end of the validity of offer, price specification, or opening hours data.
     */
    public Builder validThrough(java.util.Date value) {
      validThrough = value;
      return this;
    }
    /**
     * The current approximate inventory level for the item or items.
     */
    public Builder inventoryLevel(QuantitativeValue value) {
      inventoryLevel = value;
      return this;
    }
    public Builder serialNumber(SerialNumber value) {
      serialNumber = value;
      return this;
    }
    /**
     * The delivery method(s) available for this offer.
     */
    public Builder availableDeliveryMethod(DeliveryMethod value) {
      availableDeliveryMethod = value;
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    public Builder ineligibleRegion(GeoShape value) {
      ineligibleRegion = value;
      return this;
    }
    /**
     * The duration for which the given offer is valid.
     */
    public Builder eligibleDuration(QuantitativeValue value) {
      eligibleDuration = value;
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    public Builder eligibleQuantity(QuantitativeValue value) {
      eligibleQuantity = value;
      return this;
    }
    /**
     * The warranty promise(s) included in the offer.
     */
    public Builder warranty(WarrantyPromise value) {
      warranty = value;
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
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    public Builder gtin12(String value) {
      gtin12 = value;
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
    public Builder price(Number value) {
      price = value;
      return this;
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    public Builder seller(Participant value) {
      seller = value;
      return this;
    }
    /**
     * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
     */
    public Builder availability(ItemAvailability value) {
      availability = value;
      return this;
    }
    /**
     * The end of the availability of the product or service included in the offer.
     */
    public Builder availabilityEnds(java.util.Date value) {
      availabilityEnds = value;
      return this;
    }
    /**
     * The type(s) of customers for which the given offer is valid.
     */
    public Builder eligibleCustomerType(BusinessEntityType value) {
      eligibleCustomerType = value;
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
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    public Builder businessFunction(BusinessFunction value) {
      businessFunction = value;
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    public Builder priceCurrency(String value) {
      priceCurrency = value;
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
     * The date after which the price is no longer available.
     */
    public Builder priceValidUntil(java.util.Date value) {
      priceValidUntil = value;
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
     * The highest price of all offers available.
     */
    public Builder highPrice(Number value) {
      highPrice = value;
      return this;
    }
    /**
     * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).
     */
    public Builder addOn(Offer value) {
      addOn = value;
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
     * The number of offers for the product.
     */
    public Builder offerCount(Integer value) {
      offerCount = value;
      return this;
    }
    /**
     * The place(s) from which the offer can be obtained (e.g. store locations).
     */
    public Builder availableAtOrFrom(Place value) {
      availableAtOrFrom = value;
      return this;
    }
    /**
     * The beginning of the availability of the product or service included in the offer.
     */
    public Builder availabilityStarts(java.util.Date value) {
      availabilityStarts = value;
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
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    public Builder mpn(String value) {
      mpn = value;
      return this;
    }
    private PriceSpecification priceSpecification;
    private QuantitativeValue deliveryLeadTime;
    private PaymentMethod acceptedPaymentMethod;
    private Review review;
    private Offer offers;
    private PriceSpecification eligibleTransactionVolume;
    private OfferItemCondition itemCondition;
    private Action potentialAction;
    private QuantitativeValue advanceBookingRequirement;
    private String additionalType;
    private GeoShape eligibleRegion;
    private java.util.Date validFrom;
    private Product itemOffered;
    private TypeAndQuantityNode includesObject;
    private Image image;
    private Number lowPrice;
    private java.util.Date validThrough;
    private QuantitativeValue inventoryLevel;
    private SerialNumber serialNumber;
    private DeliveryMethod availableDeliveryMethod;
    private GeoShape ineligibleRegion;
    private QuantitativeValue eligibleDuration;
    private QuantitativeValue eligibleQuantity;
    private WarrantyPromise warranty;
    private String description;
    private String gtin12;
    private Number price;
    private Participant seller;
    private ItemAvailability availability;
    private java.util.Date availabilityEnds;
    private BusinessEntityType eligibleCustomerType;
    private CreativeWork mainEntityOfPage;
    private BusinessFunction businessFunction;
    private String priceCurrency;
    private String gtin13;
    private java.util.Date priceValidUntil;
    private String alternateName;
    private Number highPrice;
    private Offer addOn;
    private String gtin14;
    private String url;
    private String gtin8;
    private AggregateRating aggregateRating;
    private String sameAs;
    private Integer offerCount;
    private Place availableAtOrFrom;
    private java.util.Date availabilityStarts;
    private String name;
    private PhysicalActivityCategory category;
    private String sku;
    private String mpn;
  }

  protected AggregateOffer(PriceSpecification priceSpecification, QuantitativeValue deliveryLeadTime, PaymentMethod acceptedPaymentMethod, Review review, Offer offers, PriceSpecification eligibleTransactionVolume, OfferItemCondition itemCondition, Action potentialAction, QuantitativeValue advanceBookingRequirement, String additionalType, GeoShape eligibleRegion, java.util.Date validFrom, Product itemOffered, TypeAndQuantityNode includesObject, Image image, Number lowPrice, java.util.Date validThrough, QuantitativeValue inventoryLevel, SerialNumber serialNumber, DeliveryMethod availableDeliveryMethod, GeoShape ineligibleRegion, QuantitativeValue eligibleDuration, QuantitativeValue eligibleQuantity, WarrantyPromise warranty, String description, String gtin12, Number price, Participant seller, ItemAvailability availability, java.util.Date availabilityEnds, BusinessEntityType eligibleCustomerType, CreativeWork mainEntityOfPage, BusinessFunction businessFunction, String priceCurrency, String gtin13, java.util.Date priceValidUntil, String alternateName, Number highPrice, Offer addOn, String gtin14, String url, String gtin8, AggregateRating aggregateRating, String sameAs, Integer offerCount, Place availableAtOrFrom, java.util.Date availabilityStarts, String name, PhysicalActivityCategory category, String sku, String mpn) {
    super(priceSpecification, deliveryLeadTime, review, acceptedPaymentMethod, eligibleTransactionVolume, itemCondition, potentialAction, advanceBookingRequirement, additionalType, eligibleRegion, validFrom, itemOffered, includesObject, image, validThrough, inventoryLevel, serialNumber, availableDeliveryMethod, ineligibleRegion, eligibleDuration, warranty, eligibleQuantity, description, seller, price, gtin12, availability, eligibleCustomerType, availabilityEnds, mainEntityOfPage, priceCurrency, businessFunction, gtin13, alternateName, priceValidUntil, url, gtin14, addOn, gtin8, sameAs, aggregateRating, availableAtOrFrom, availabilityStarts, name, category, sku, mpn);
    myHighPrice = highPrice;
    myLowPrice = lowPrice;
    myOfferCount = offerCount;
    myOffers = offers;
  }
  private Number myHighPrice;
  private Number myLowPrice;
  private Integer myOfferCount;
  private Offer myOffers;
}
