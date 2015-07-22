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
  public OrganizationOrPerson getProvider() {
    return myProvider;
  }
  /**
   * Builder for {@link ParcelDelivery}
   */
  public static final class Builder {
    /**
     * Creates new {@link ParcelDelivery} instance.
     */
    public ParcelDelivery build() {
      return new ParcelDelivery(deliveryAddress, expectedArrivalUntil, provider, hasDeliveryMethod, name, deliveryStatus, mainEntityOfPage, sameAs, url, itemShipped, partOfOrder, additionalType, trackingNumber, trackingUrl, alternateName, potentialAction, description, expectedArrivalFrom, originAddress);
    }
    /**
     * Destination address.
     */
    public Builder deliveryAddress(PostalAddress postalAddress) {
      this.deliveryAddress = postalAddress;
      return this;
    }
    /**
     * The latest date the package may arrive.
     */
    public Builder expectedArrivalUntil(java.util.Date date) {
      this.expectedArrivalUntil = date;
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization organization) {
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person person) {
      this.provider.setPerson(person);
      return this;
    }
    /**
     * Method used for delivery or shipping.
     */
    public Builder hasDeliveryMethod(DeliveryMethod deliveryMethod) {
      this.hasDeliveryMethod = deliveryMethod;
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
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     */
    public Builder deliveryStatus(DeliveryEvent deliveryEvent) {
      this.deliveryStatus = deliveryEvent;
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
     * Item(s) being shipped.
     */
    public Builder itemShipped(Product product) {
      this.itemShipped = product;
      return this;
    }
    /**
     * The overall order the items in this delivery were included in.
     */
    public Builder partOfOrder(IsPartOf isPartOf) {
      this.partOfOrder = isPartOf;
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
     * Shipper tracking number.
     */
    public Builder trackingNumber(String trackingNumber) {
      this.trackingNumber = trackingNumber;
      return this;
    }
    /**
     * Tracking url for the parcel delivery.
     */
    public Builder trackingUrl(String trackingUrl) {
      this.trackingUrl = trackingUrl;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
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
     * The earliest date the package may arrive.
     */
    public Builder expectedArrivalFrom(java.util.Date date) {
      this.expectedArrivalFrom = date;
      return this;
    }
    /**
     * Shipper's address.
     */
    public Builder originAddress(PostalAddress postalAddress) {
      this.originAddress = postalAddress;
      return this;
    }
    private PostalAddress deliveryAddress;
    private java.util.Date expectedArrivalUntil;
    private OrganizationOrPerson provider;
    private DeliveryMethod hasDeliveryMethod;
    private String name;
    private DeliveryEvent deliveryStatus;
    private StringOrCreativeWork mainEntityOfPage;
    private String sameAs;
    private String url;
    private Product itemShipped;
    private IsPartOf partOfOrder;
    private String additionalType;
    private String trackingNumber;
    private String trackingUrl;
    private String alternateName;
    private Action potentialAction;
    private String description;
    private java.util.Date expectedArrivalFrom;
    private PostalAddress originAddress;
  }

  protected ParcelDelivery(PostalAddress deliveryAddress, java.util.Date expectedArrivalUntil, OrganizationOrPerson provider, DeliveryMethod hasDeliveryMethod, String name, DeliveryEvent deliveryStatus, StringOrCreativeWork mainEntityOfPage, String sameAs, String url, Product itemShipped, IsPartOf partOfOrder, String additionalType, String trackingNumber, String trackingUrl, String alternateName, Action potentialAction, String description, java.util.Date expectedArrivalFrom, PostalAddress originAddress) {
    super(additionalType, url, sameAs, alternateName, description, potentialAction, name, mainEntityOfPage);
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
  private OrganizationOrPerson myProvider;
}
