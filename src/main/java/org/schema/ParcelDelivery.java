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
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getExpectedArrivalFrom() {
    return myExpectedArrivalFrom;
  }
  /**
   * The latest date the package may arrive.
   */
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
  public static final class ParcelDeliveryThingBuilder implements Builder {
    /**
     * Creates new {@link ParcelDelivery} instance.
     */
    public ParcelDelivery build() {
      return new ParcelDelivery(deliveryAddress, deliveryStatus, expectedArrivalFrom, expectedArrivalUntil, hasDeliveryMethod, itemShipped, originAddress, partOfOrder, trackingNumber, trackingUrl, provider, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Destination address.
     */
    public Builder deliveryAddress(PostalAddress postalAddress) {
      this.deliveryAddress = postalAddress;
      return this;
    }
    /**
     * Destination address.
     */
    public Builder deliveryAddress(PostalAddress.Builder postalAddress) {
      return this.deliveryAddress(postalAddress.build());
    }
    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     */
    public Builder deliveryStatus(DeliveryEvent deliveryEvent) {
      this.deliveryStatus = deliveryEvent;
      return this;
    }
    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     */
    public Builder deliveryStatus(DeliveryEvent.Builder deliveryEvent) {
      return this.deliveryStatus(deliveryEvent.build());
    }
    /**
     * The earliest date the package may arrive.
     */
    public Builder expectedArrivalFrom(java.util.Date date) {
      this.expectedArrivalFrom = date;
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
     * Method used for delivery or shipping.
     */
    public Builder hasDeliveryMethod(DeliveryMethod deliveryMethod) {
      this.hasDeliveryMethod = deliveryMethod;
      return this;
    }
    /**
     * Method used for delivery or shipping.
     */
    public Builder hasDeliveryMethod(DeliveryMethod.Builder deliveryMethod) {
      return this.hasDeliveryMethod(deliveryMethod.build());
    }
    /**
     * Item(s) being shipped.
     */
    public Builder itemShipped(Product product) {
      this.itemShipped = product;
      return this;
    }
    /**
     * Item(s) being shipped.
     */
    public Builder itemShipped(Product.Builder product) {
      return this.itemShipped(product.build());
    }
    /**
     * Shipper's address.
     */
    public Builder originAddress(PostalAddress postalAddress) {
      this.originAddress = postalAddress;
      return this;
    }
    /**
     * Shipper's address.
     */
    public Builder originAddress(PostalAddress.Builder postalAddress) {
      return this.originAddress(postalAddress.build());
    }
    /**
     * The overall order the items in this delivery were included in.
     */
    public Builder partOfOrder(IsPartOf isPartOf) {
      this.partOfOrder = isPartOf;
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
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization organization) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization.Builder organization) {
      return this.provider(organization.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person person) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setPerson(person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person.Builder person) {
      return this.provider(person.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * A short description of the item.
     */
    public Builder description(String description) {
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
    public Builder mainEntityOfPage(CreativeWork creativeWork) {
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
    public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private PostalAddress deliveryAddress;
    private DeliveryEvent deliveryStatus;
    private java.util.Date expectedArrivalFrom;
    private java.util.Date expectedArrivalUntil;
    private DeliveryMethod hasDeliveryMethod;
    private Product itemShipped;
    private PostalAddress originAddress;
    private IsPartOf partOfOrder;
    private String trackingNumber;
    private String trackingUrl;
    private OrganizationOrPerson provider;
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
  public interface Builder extends ThingBuilder<ParcelDelivery> {
  Builder deliveryAddress(PostalAddress postalAddress);
  Builder deliveryAddress(PostalAddress.Builder postalAddress);
  Builder deliveryStatus(DeliveryEvent deliveryEvent);
  Builder deliveryStatus(DeliveryEvent.Builder deliveryEvent);
  Builder expectedArrivalFrom(java.util.Date date);
  Builder expectedArrivalUntil(java.util.Date date);
  Builder hasDeliveryMethod(DeliveryMethod deliveryMethod);
  Builder hasDeliveryMethod(DeliveryMethod.Builder deliveryMethod);
  Builder itemShipped(Product product);
  Builder itemShipped(Product.Builder product);
  Builder originAddress(PostalAddress postalAddress);
  Builder originAddress(PostalAddress.Builder postalAddress);
  Builder partOfOrder(IsPartOf isPartOf);
  Builder trackingNumber(String trackingNumber);
  Builder trackingUrl(String trackingUrl);
  Builder provider(Organization organization);
  Builder provider(Organization.Builder organization);
  Builder provider(Person person);
  Builder provider(Person.Builder person);
  Builder additionalType(String additionalType);
  Builder alternateName(String alternateName);
  Builder description(String description);
  Builder mainEntityOfPage(CreativeWork creativeWork);
  Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
  Builder mainEntityOfPage(String mainEntityOfPage);
  Builder name(String name);
  Builder sameAs(String sameAs);
  Builder url(String url);
  Builder potentialAction(Action action);
  Builder potentialAction(Action.Builder action);
  Builder id(String id);
  }

  protected ParcelDelivery(PostalAddress deliveryAddress, DeliveryEvent deliveryStatus, java.util.Date expectedArrivalFrom, java.util.Date expectedArrivalUntil, DeliveryMethod hasDeliveryMethod, Product itemShipped, PostalAddress originAddress, IsPartOf partOfOrder, String trackingNumber, String trackingUrl, OrganizationOrPerson provider, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
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
