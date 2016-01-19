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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getExpectedArrivalFrom() {
    return myExpectedArrivalFrom;
  }
  /**
   * The latest date the package may arrive.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
  static final class ParcelDeliveryThingBuilder implements Builder {
    /**
     * Creates new {@link ParcelDelivery} instance.
     */
    public ParcelDelivery build() {
      return new ParcelDelivery(deliveryAddress, deliveryStatus, expectedArrivalFrom, expectedArrivalUntil, hasDeliveryMethod, itemShipped, originAddress, partOfOrder, trackingNumber, trackingUrl, provider, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Destination address.
     */
    @NotNull public Builder deliveryAddress(@NotNull PostalAddress postalAddress) {
      this.deliveryAddress = postalAddress;
      return this;
    }
    /**
     * Destination address.
     */
    @NotNull public Builder deliveryAddress(@NotNull PostalAddress.Builder postalAddress) {
      return this.deliveryAddress(postalAddress.build());
    }
    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     */
    @NotNull public Builder deliveryStatus(@NotNull DeliveryEvent deliveryEvent) {
      this.deliveryStatus = deliveryEvent;
      return this;
    }
    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     */
    @NotNull public Builder deliveryStatus(@NotNull DeliveryEvent.Builder deliveryEvent) {
      return this.deliveryStatus(deliveryEvent.build());
    }
    /**
     * The earliest date the package may arrive.
     */
    @NotNull public Builder expectedArrivalFrom(@NotNull java.util.Date date) {
      this.expectedArrivalFrom = date;
      return this;
    }
    /**
     * The latest date the package may arrive.
     */
    @NotNull public Builder expectedArrivalUntil(@NotNull java.util.Date date) {
      this.expectedArrivalUntil = date;
      return this;
    }
    /**
     * Method used for delivery or shipping.
     */
    @NotNull public Builder hasDeliveryMethod(@NotNull DeliveryMethod deliveryMethod) {
      this.hasDeliveryMethod = deliveryMethod;
      return this;
    }
    /**
     * Method used for delivery or shipping.
     */
    @NotNull public Builder hasDeliveryMethod(@NotNull DeliveryMethod.Builder deliveryMethod) {
      return this.hasDeliveryMethod(deliveryMethod.build());
    }
    /**
     * Item(s) being shipped.
     */
    @NotNull public Builder itemShipped(@NotNull Product product) {
      this.itemShipped = product;
      return this;
    }
    /**
     * Item(s) being shipped.
     */
    @NotNull public Builder itemShipped(@NotNull Product.Builder product) {
      return this.itemShipped(product.build());
    }
    /**
     * Shipper's address.
     */
    @NotNull public Builder originAddress(@NotNull PostalAddress postalAddress) {
      this.originAddress = postalAddress;
      return this;
    }
    /**
     * Shipper's address.
     */
    @NotNull public Builder originAddress(@NotNull PostalAddress.Builder postalAddress) {
      return this.originAddress(postalAddress.build());
    }
    /**
     * The overall order the items in this delivery were included in.
     */
    @NotNull public Builder partOfOrder(@NotNull IsPartOf isPartOf) {
      this.partOfOrder = isPartOf;
      return this;
    }
    /**
     * Shipper tracking number.
     */
    @NotNull public Builder trackingNumber(@NotNull String trackingNumber) {
      this.trackingNumber = trackingNumber;
      return this;
    }
    /**
     * Tracking url for the parcel delivery.
     */
    @NotNull public Builder trackingUrl(@NotNull String trackingUrl) {
      this.trackingUrl = trackingUrl;
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      return this.provider(organization.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setPerson(person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      return this.provider(person.build());
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
        if ("deliveryAddress".equals(key) && value instanceof PostalAddress) { deliveryAddress((PostalAddress)value); continue; }
        if ("deliveryStatus".equals(key) && value instanceof DeliveryEvent) { deliveryStatus((DeliveryEvent)value); continue; }
        if ("expectedArrivalFrom".equals(key) && value instanceof java.util.Date) { expectedArrivalFrom((java.util.Date)value); continue; }
        if ("expectedArrivalUntil".equals(key) && value instanceof java.util.Date) { expectedArrivalUntil((java.util.Date)value); continue; }
        if ("hasDeliveryMethod".equals(key) && value instanceof DeliveryMethod) { hasDeliveryMethod((DeliveryMethod)value); continue; }
        if ("itemShipped".equals(key) && value instanceof Product) { itemShipped((Product)value); continue; }
        if ("originAddress".equals(key) && value instanceof PostalAddress) { originAddress((PostalAddress)value); continue; }
        if ("partOfOrder".equals(key) && value instanceof IsPartOf) { partOfOrder((IsPartOf)value); continue; }
        if ("trackingNumber".equals(key) && value instanceof String) { trackingNumber((String)value); continue; }
        if ("trackingUrl".equals(key) && value instanceof String) { trackingUrl((String)value); continue; }
        if ("provider".equals(key) && value instanceof Organization) { provider((Organization)value); continue; }
        if ("provider".equals(key) && value instanceof Person) { provider((Person)value); continue; }
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
    @NotNull Builder deliveryAddress(@NotNull PostalAddress postalAddress);
    @NotNull Builder deliveryAddress(@NotNull PostalAddress.Builder postalAddress);
    @NotNull Builder deliveryStatus(@NotNull DeliveryEvent deliveryEvent);
    @NotNull Builder deliveryStatus(@NotNull DeliveryEvent.Builder deliveryEvent);
    @NotNull Builder expectedArrivalFrom(@NotNull java.util.Date date);
    @NotNull Builder expectedArrivalUntil(@NotNull java.util.Date date);
    @NotNull Builder hasDeliveryMethod(@NotNull DeliveryMethod deliveryMethod);
    @NotNull Builder hasDeliveryMethod(@NotNull DeliveryMethod.Builder deliveryMethod);
    @NotNull Builder itemShipped(@NotNull Product product);
    @NotNull Builder itemShipped(@NotNull Product.Builder product);
    @NotNull Builder originAddress(@NotNull PostalAddress postalAddress);
    @NotNull Builder originAddress(@NotNull PostalAddress.Builder postalAddress);
    @NotNull Builder partOfOrder(@NotNull IsPartOf isPartOf);
    @NotNull Builder trackingNumber(@NotNull String trackingNumber);
    @NotNull Builder trackingUrl(@NotNull String trackingUrl);
    @NotNull Builder provider(@NotNull Organization organization);
    @NotNull Builder provider(@NotNull Organization.Builder organization);
    @NotNull Builder provider(@NotNull Person person);
    @NotNull Builder provider(@NotNull Person.Builder person);
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

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myDeliveryAddress != null ? myDeliveryAddress.hashCode() : 0);
    result = 31 * result + (myDeliveryStatus != null ? myDeliveryStatus.hashCode() : 0);
    result = 31 * result + (myExpectedArrivalFrom != null ? myExpectedArrivalFrom.hashCode() : 0);
    result = 31 * result + (myExpectedArrivalUntil != null ? myExpectedArrivalUntil.hashCode() : 0);
    result = 31 * result + (myHasDeliveryMethod != null ? myHasDeliveryMethod.hashCode() : 0);
    result = 31 * result + (myItemShipped != null ? myItemShipped.hashCode() : 0);
    result = 31 * result + (myOriginAddress != null ? myOriginAddress.hashCode() : 0);
    result = 31 * result + (myPartOfOrder != null ? myPartOfOrder.hashCode() : 0);
    result = 31 * result + (myTrackingNumber != null ? myTrackingNumber.hashCode() : 0);
    result = 31 * result + (myTrackingUrl != null ? myTrackingUrl.hashCode() : 0);
    result = 31 * result + (myProvider != null ? myProvider.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ParcelDelivery parcelDelivery = (ParcelDelivery) o;
    if (!super.equals(o)) return false;
    if (myDeliveryAddress != null ? !myDeliveryAddress.equals(parcelDelivery.myDeliveryAddress) : parcelDelivery.myDeliveryAddress != null) return false;
    if (myDeliveryStatus != null ? !myDeliveryStatus.equals(parcelDelivery.myDeliveryStatus) : parcelDelivery.myDeliveryStatus != null) return false;
    if (myExpectedArrivalFrom != null ? !myExpectedArrivalFrom.equals(parcelDelivery.myExpectedArrivalFrom) : parcelDelivery.myExpectedArrivalFrom != null) return false;
    if (myExpectedArrivalUntil != null ? !myExpectedArrivalUntil.equals(parcelDelivery.myExpectedArrivalUntil) : parcelDelivery.myExpectedArrivalUntil != null) return false;
    if (myHasDeliveryMethod != null ? !myHasDeliveryMethod.equals(parcelDelivery.myHasDeliveryMethod) : parcelDelivery.myHasDeliveryMethod != null) return false;
    if (myItemShipped != null ? !myItemShipped.equals(parcelDelivery.myItemShipped) : parcelDelivery.myItemShipped != null) return false;
    if (myOriginAddress != null ? !myOriginAddress.equals(parcelDelivery.myOriginAddress) : parcelDelivery.myOriginAddress != null) return false;
    if (myPartOfOrder != null ? !myPartOfOrder.equals(parcelDelivery.myPartOfOrder) : parcelDelivery.myPartOfOrder != null) return false;
    if (myTrackingNumber != null ? !myTrackingNumber.equals(parcelDelivery.myTrackingNumber) : parcelDelivery.myTrackingNumber != null) return false;
    if (myTrackingUrl != null ? !myTrackingUrl.equals(parcelDelivery.myTrackingUrl) : parcelDelivery.myTrackingUrl != null) return false;
    if (myProvider != null ? !myProvider.equals(parcelDelivery.myProvider) : parcelDelivery.myProvider != null) return false;
    return true;
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
