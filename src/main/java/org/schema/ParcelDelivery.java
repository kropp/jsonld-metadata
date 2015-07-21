/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * The delivery of a parcel either via the postal service or a commercial service.
 */
public class ParcelDelivery extends Intangible {
  /**
   * Destination address.
   */
  public PostalAddress getDeliveryAddress() {
    return myDeliveryAddress;
  }
  /**
   * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
   */
  public DeliveryEvent getDeliveryStatus() {
    return myDeliveryStatus;
  }
  /**
   * The earliest date the package may arrive.
   */
  public java.util.Date getExpectedArrivalFrom() {
    return myExpectedArrivalFrom;
  }
  /**
   * The latest date the package may arrive.
   */
  public java.util.Date getExpectedArrivalUntil() {
    return myExpectedArrivalUntil;
  }
  /**
   * Method used for delivery or shipping.
   */
  public DeliveryMethod getHasDeliveryMethod() {
    return myHasDeliveryMethod;
  }
  /**
   * Item(s) being shipped.
   */
  public Product getItemShipped() {
    return myItemShipped;
  }
  /**
   * Shipper's address.
   */
  public PostalAddress getOriginAddress() {
    return myOriginAddress;
  }
  /**
   * The overall order the items in this delivery were included in.
   */
  public IsPartOf getPartOfOrder() {
    return myPartOfOrder;
  }
  /**
   * Shipper tracking number.
   */
  public String getTrackingNumber() {
    return myTrackingNumber;
  }
  /**
   * Tracking url for the parcel delivery.
   */
  public String getTrackingUrl() {
    return myTrackingUrl;
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public Person getProvider() {
    return myProvider;
  }
  /**
   * Builder for {@see ParcelDelivery}
   */
  public static final class Builder {
    public ParcelDelivery build() {
      return new ParcelDelivery(mainEntityOfPage, expectedArrivalUntil, originAddress, trackingNumber, alternateName, potentialAction, itemShipped, url, additionalType, sameAs, expectedArrivalFrom, hasDeliveryMethod, name, image, deliveryAddress, partOfOrder, deliveryStatus, trackingUrl, description, provider);
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
     * The latest date the package may arrive.
     */
    public Builder expectedArrivalUntil(java.util.Date value) {
      expectedArrivalUntil = value;
      return this;
    }
    /**
     * Shipper's address.
     */
    public Builder originAddress(PostalAddress value) {
      originAddress = value;
      return this;
    }
    /**
     * Shipper tracking number.
     */
    public Builder trackingNumber(String value) {
      trackingNumber = value;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * Item(s) being shipped.
     */
    public Builder itemShipped(Product value) {
      itemShipped = value;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
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
     * The earliest date the package may arrive.
     */
    public Builder expectedArrivalFrom(java.util.Date value) {
      expectedArrivalFrom = value;
      return this;
    }
    /**
     * Method used for delivery or shipping.
     */
    public Builder hasDeliveryMethod(DeliveryMethod value) {
      hasDeliveryMethod = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * Destination address.
     */
    public Builder deliveryAddress(PostalAddress value) {
      deliveryAddress = value;
      return this;
    }
    /**
     * The overall order the items in this delivery were included in.
     */
    public Builder partOfOrder(IsPartOf value) {
      partOfOrder = value;
      return this;
    }
    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     */
    public Builder deliveryStatus(DeliveryEvent value) {
      deliveryStatus = value;
      return this;
    }
    /**
     * Tracking url for the parcel delivery.
     */
    public Builder trackingUrl(String value) {
      trackingUrl = value;
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
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person value) {
      provider = value;
      return this;
    }
    private CreativeWork mainEntityOfPage;
    private java.util.Date expectedArrivalUntil;
    private PostalAddress originAddress;
    private String trackingNumber;
    private String alternateName;
    private Action potentialAction;
    private Product itemShipped;
    private String url;
    private String additionalType;
    private String sameAs;
    private java.util.Date expectedArrivalFrom;
    private DeliveryMethod hasDeliveryMethod;
    private String name;
    private Image image;
    private PostalAddress deliveryAddress;
    private IsPartOf partOfOrder;
    private DeliveryEvent deliveryStatus;
    private String trackingUrl;
    private String description;
    private Person provider;
  }

  protected ParcelDelivery(CreativeWork mainEntityOfPage, java.util.Date expectedArrivalUntil, PostalAddress originAddress, String trackingNumber, String alternateName, Action potentialAction, Product itemShipped, String url, String additionalType, String sameAs, java.util.Date expectedArrivalFrom, DeliveryMethod hasDeliveryMethod, String name, Image image, PostalAddress deliveryAddress, IsPartOf partOfOrder, DeliveryEvent deliveryStatus, String trackingUrl, String description, Person provider) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    myDeliveryAddress = deliveryAddress;
    myDeliveryStatus = deliveryStatus;
    myExpectedArrivalFrom = expectedArrivalFrom;
    myExpectedArrivalUntil = expectedArrivalUntil;
    myHasDeliveryMethod = hasDeliveryMethod;
    myItemShipped = itemShipped;
    myOriginAddress = originAddress;
    myPartOfOrder = partOfOrder;
    myTrackingNumber = trackingNumber;
    myTrackingUrl = trackingUrl;
    myProvider = provider;
  }
  private PostalAddress myDeliveryAddress;
  private DeliveryEvent myDeliveryStatus;
  private java.util.Date myExpectedArrivalFrom;
  private java.util.Date myExpectedArrivalUntil;
  private DeliveryMethod myHasDeliveryMethod;
  private Product myItemShipped;
  private PostalAddress myOriginAddress;
  private IsPartOf myPartOfOrder;
  private String myTrackingNumber;
  private String myTrackingUrl;
  private Person myProvider;
}
