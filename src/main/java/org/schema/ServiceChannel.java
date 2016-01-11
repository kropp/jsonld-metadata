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
 * A means for accessing a service, e.g. a government office location, web site, or phone number.
 */
public class ServiceChannel extends Intangible {
  /**
   * A language someone may use with the item.
   */
  public Language getAvailableLanguage() {
    return myAvailableLanguage;
  }
  /**
   * Estimated processing time for the service using this channel.
   */
  public Duration getProcessingTime() {
    return myProcessingTime;
  }
  /**
   * The service provided by this channel.
   */
  public Service getProvidesService() {
    return myProvidesService;
  }
  /**
   * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
   */
  public Place getServiceLocation() {
    return myServiceLocation;
  }
  /**
   * The phone number to use to access the service.
   */
  public ContactPoint getServicePhone() {
    return myServicePhone;
  }
  /**
   * The address for accessing the service by mail.
   */
  public PostalAddress getServicePostalAddress() {
    return myServicePostalAddress;
  }
  /**
   * The number to access the service by text message.
   */
  public ContactPoint getServiceSmsNumber() {
    return myServiceSmsNumber;
  }
  /**
   * The website to access the service.
   */
  public String getServiceUrl() {
    return myServiceUrl;
  }
  /**
   * Builder for {@link ServiceChannel}
   */
  public static final class ServiceChannelThingBuilder implements Builder {
    /**
     * Creates new {@link ServiceChannel} instance.
     */
    public ServiceChannel build() {
      return new ServiceChannel(availableLanguage, processingTime, providesService, serviceLocation, servicePhone, servicePostalAddress, serviceSmsNumber, serviceUrl, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A language someone may use with the item.
     */
    public Builder availableLanguage(Language language) {
      this.availableLanguage = language;
      return this;
    }
    /**
     * A language someone may use with the item.
     */
    public Builder availableLanguage(Language.Builder language) {
      return this.availableLanguage(language.build());
    }
    /**
     * Estimated processing time for the service using this channel.
     */
    public Builder processingTime(Duration duration) {
      this.processingTime = duration;
      return this;
    }
    /**
     * Estimated processing time for the service using this channel.
     */
    public Builder processingTime(Duration.Builder duration) {
      return this.processingTime(duration.build());
    }
    /**
     * The service provided by this channel.
     */
    public Builder providesService(Service service) {
      this.providesService = service;
      return this;
    }
    /**
     * The service provided by this channel.
     */
    public Builder providesService(Service.Builder service) {
      return this.providesService(service.build());
    }
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     */
    public Builder serviceLocation(Place place) {
      this.serviceLocation = place;
      return this;
    }
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     */
    public Builder serviceLocation(Place.Builder place) {
      return this.serviceLocation(place.build());
    }
    /**
     * The phone number to use to access the service.
     */
    public Builder servicePhone(ContactPoint contactPoint) {
      this.servicePhone = contactPoint;
      return this;
    }
    /**
     * The phone number to use to access the service.
     */
    public Builder servicePhone(ContactPoint.Builder contactPoint) {
      return this.servicePhone(contactPoint.build());
    }
    /**
     * The address for accessing the service by mail.
     */
    public Builder servicePostalAddress(PostalAddress postalAddress) {
      this.servicePostalAddress = postalAddress;
      return this;
    }
    /**
     * The address for accessing the service by mail.
     */
    public Builder servicePostalAddress(PostalAddress.Builder postalAddress) {
      return this.servicePostalAddress(postalAddress.build());
    }
    /**
     * The number to access the service by text message.
     */
    public Builder serviceSmsNumber(ContactPoint contactPoint) {
      this.serviceSmsNumber = contactPoint;
      return this;
    }
    /**
     * The number to access the service by text message.
     */
    public Builder serviceSmsNumber(ContactPoint.Builder contactPoint) {
      return this.serviceSmsNumber(contactPoint.build());
    }
    /**
     * The website to access the service.
     */
    public Builder serviceUrl(String serviceUrl) {
      this.serviceUrl = serviceUrl;
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
    private Language availableLanguage;
    private Duration processingTime;
    private Service providesService;
    private Place serviceLocation;
    private ContactPoint servicePhone;
    private PostalAddress servicePostalAddress;
    private ContactPoint serviceSmsNumber;
    private String serviceUrl;
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
  public interface Builder extends ThingBuilder<ServiceChannel> {
  Builder availableLanguage(Language language);
  Builder availableLanguage(Language.Builder language);
  Builder processingTime(Duration duration);
  Builder processingTime(Duration.Builder duration);
  Builder providesService(Service service);
  Builder providesService(Service.Builder service);
  Builder serviceLocation(Place place);
  Builder serviceLocation(Place.Builder place);
  Builder servicePhone(ContactPoint contactPoint);
  Builder servicePhone(ContactPoint.Builder contactPoint);
  Builder servicePostalAddress(PostalAddress postalAddress);
  Builder servicePostalAddress(PostalAddress.Builder postalAddress);
  Builder serviceSmsNumber(ContactPoint contactPoint);
  Builder serviceSmsNumber(ContactPoint.Builder contactPoint);
  Builder serviceUrl(String serviceUrl);
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

  protected ServiceChannel(Language availableLanguage, Duration processingTime, Service providesService, Place serviceLocation, ContactPoint servicePhone, PostalAddress servicePostalAddress, ContactPoint serviceSmsNumber, String serviceUrl, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myAvailableLanguage = availableLanguage;
    myProcessingTime = processingTime;
    myProvidesService = providesService;
    myServiceLocation = serviceLocation;
    myServicePhone = servicePhone;
    myServicePostalAddress = servicePostalAddress;
    myServiceSmsNumber = serviceSmsNumber;
    myServiceUrl = serviceUrl;
  }
  private Language myAvailableLanguage;
  private Duration myProcessingTime;
  private Service myProvidesService;
  private Place myServiceLocation;
  private ContactPoint myServicePhone;
  private PostalAddress myServicePostalAddress;
  private ContactPoint myServiceSmsNumber;
  private String myServiceUrl;
}
