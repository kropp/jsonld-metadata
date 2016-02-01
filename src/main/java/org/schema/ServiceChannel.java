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
import org.jetbrains.annotations.NotNull;

/**
 * A means for accessing a service, e.g. a government office location, web site, or phone number.
 */
public class ServiceChannel extends Intangible {
  /**
   * A language someone may use with the item.
   */
  public Language getAvailableLanguage() { return myAvailableLanguage; }
  /**
   * Estimated processing time for the service using this channel.
   */
  public Duration getProcessingTime() { return myProcessingTime; }
  /**
   * The service provided by this channel.
   */
  public Service getProvidesService() { return myProvidesService; }
  /**
   * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
   */
  public Place getServiceLocation() { return myServiceLocation; }
  /**
   * The phone number to use to access the service.
   */
  public ContactPoint getServicePhone() { return myServicePhone; }
  /**
   * The address for accessing the service by mail.
   */
  public PostalAddress getServicePostalAddress() { return myServicePostalAddress; }
  /**
   * The number to access the service by text message.
   */
  public ContactPoint getServiceSmsNumber() { return myServiceSmsNumber; }
  /**
   * The website to access the service.
   */
  public String getServiceUrl() { return myServiceUrl; }
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
    myAvailableLanguage = availableLanguage;
    myProcessingTime = processingTime;
    myProvidesService = providesService;
    myServiceLocation = serviceLocation;
    myServicePhone = servicePhone;
    myServicePostalAddress = servicePostalAddress;
    myServiceSmsNumber = serviceSmsNumber;
    myServiceUrl = serviceUrl;
  }
  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myAvailableLanguage != null ? myAvailableLanguage.hashCode() : 0);
    result = 31 * result + (myProcessingTime != null ? myProcessingTime.hashCode() : 0);
    result = 31 * result + (myProvidesService != null ? myProvidesService.hashCode() : 0);
    result = 31 * result + (myServiceLocation != null ? myServiceLocation.hashCode() : 0);
    result = 31 * result + (myServicePhone != null ? myServicePhone.hashCode() : 0);
    result = 31 * result + (myServicePostalAddress != null ? myServicePostalAddress.hashCode() : 0);
    result = 31 * result + (myServiceSmsNumber != null ? myServiceSmsNumber.hashCode() : 0);
    result = 31 * result + (myServiceUrl != null ? myServiceUrl.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServiceChannel serviceChannel = (ServiceChannel) o;
    if (!super.equals(o)) return false;
    if (myAvailableLanguage != null ? !myAvailableLanguage.equals(serviceChannel.myAvailableLanguage) : serviceChannel.myAvailableLanguage != null) return false;
    if (myProcessingTime != null ? !myProcessingTime.equals(serviceChannel.myProcessingTime) : serviceChannel.myProcessingTime != null) return false;
    if (myProvidesService != null ? !myProvidesService.equals(serviceChannel.myProvidesService) : serviceChannel.myProvidesService != null) return false;
    if (myServiceLocation != null ? !myServiceLocation.equals(serviceChannel.myServiceLocation) : serviceChannel.myServiceLocation != null) return false;
    if (myServicePhone != null ? !myServicePhone.equals(serviceChannel.myServicePhone) : serviceChannel.myServicePhone != null) return false;
    if (myServicePostalAddress != null ? !myServicePostalAddress.equals(serviceChannel.myServicePostalAddress) : serviceChannel.myServicePostalAddress != null) return false;
    if (myServiceSmsNumber != null ? !myServiceSmsNumber.equals(serviceChannel.myServiceSmsNumber) : serviceChannel.myServiceSmsNumber != null) return false;
    if (myServiceUrl != null ? !myServiceUrl.equals(serviceChannel.myServiceUrl) : serviceChannel.myServiceUrl != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link ServiceChannel}
   */
  public static class Builder implements ThingBuilder<ServiceChannel> {
    public ServiceChannel build() {
      return new ServiceChannel(availableLanguage, processingTime, providesService, serviceLocation, servicePhone, servicePostalAddress, serviceSmsNumber, serviceUrl, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A language someone may use with the item.
     */
    @NotNull public Builder availableLanguage(@NotNull Language language) {
      this.availableLanguage = language;
      return this;
    }
    /**
     * A language someone may use with the item.
     */
    @NotNull public Builder availableLanguage(@NotNull Language.Builder language) {
      return this.availableLanguage(language.build());
    }
    /**
     * Estimated processing time for the service using this channel.
     */
    @NotNull public Builder processingTime(@NotNull Duration duration) {
      this.processingTime = duration;
      return this;
    }
    /**
     * Estimated processing time for the service using this channel.
     */
    @NotNull public Builder processingTime(@NotNull Duration.Builder duration) {
      return this.processingTime(duration.build());
    }
    /**
     * The service provided by this channel.
     */
    @NotNull public Builder providesService(@NotNull Service service) {
      this.providesService = service;
      return this;
    }
    /**
     * The service provided by this channel.
     */
    @NotNull public Builder providesService(@NotNull Service.Builder service) {
      return this.providesService(service.build());
    }
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     */
    @NotNull public Builder serviceLocation(@NotNull Place place) {
      this.serviceLocation = place;
      return this;
    }
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     */
    @NotNull public Builder serviceLocation(@NotNull Place.Builder place) {
      return this.serviceLocation(place.build());
    }
    /**
     * The phone number to use to access the service.
     */
    @NotNull public Builder servicePhone(@NotNull ContactPoint contactPoint) {
      this.servicePhone = contactPoint;
      return this;
    }
    /**
     * The phone number to use to access the service.
     */
    @NotNull public Builder servicePhone(@NotNull ContactPoint.Builder contactPoint) {
      return this.servicePhone(contactPoint.build());
    }
    /**
     * The address for accessing the service by mail.
     */
    @NotNull public Builder servicePostalAddress(@NotNull PostalAddress postalAddress) {
      this.servicePostalAddress = postalAddress;
      return this;
    }
    /**
     * The address for accessing the service by mail.
     */
    @NotNull public Builder servicePostalAddress(@NotNull PostalAddress.Builder postalAddress) {
      return this.servicePostalAddress(postalAddress.build());
    }
    /**
     * The number to access the service by text message.
     */
    @NotNull public Builder serviceSmsNumber(@NotNull ContactPoint contactPoint) {
      this.serviceSmsNumber = contactPoint;
      return this;
    }
    /**
     * The number to access the service by text message.
     */
    @NotNull public Builder serviceSmsNumber(@NotNull ContactPoint.Builder contactPoint) {
      return this.serviceSmsNumber(contactPoint.build());
    }
    /**
     * The website to access the service.
     */
    @NotNull public Builder serviceUrl(@NotNull String serviceUrl) {
      this.serviceUrl = serviceUrl;
      return this;
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
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
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
        if ("availableLanguage".equals(key) && value instanceof Language) { availableLanguage((Language)value); continue; }
        if ("processingTime".equals(key) && value instanceof Duration) { processingTime((Duration)value); continue; }
        if ("providesService".equals(key) && value instanceof Service) { providesService((Service)value); continue; }
        if ("serviceLocation".equals(key) && value instanceof Place) { serviceLocation((Place)value); continue; }
        if ("servicePhone".equals(key) && value instanceof ContactPoint) { servicePhone((ContactPoint)value); continue; }
        if ("servicePostalAddress".equals(key) && value instanceof PostalAddress) { servicePostalAddress((PostalAddress)value); continue; }
        if ("serviceSmsNumber".equals(key) && value instanceof ContactPoint) { serviceSmsNumber((ContactPoint)value); continue; }
        if ("serviceUrl".equals(key) && value instanceof String) { serviceUrl((String)value); continue; }
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
  
  private Language myAvailableLanguage;
  private Duration myProcessingTime;
  private Service myProvidesService;
  private Place myServiceLocation;
  private ContactPoint myServicePhone;
  private PostalAddress myServicePostalAddress;
  private ContactPoint myServiceSmsNumber;
  private String myServiceUrl;
}
