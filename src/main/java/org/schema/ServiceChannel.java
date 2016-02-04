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
import java.util.*;

/**
 * A means for accessing a service, e.g. a government office location, web site, or phone number.
 */
public class ServiceChannel extends Intangible {
  /**
   * A language someone may use with the item.
   */
  @JsonIgnore public Language getAvailableLanguage() {
    return (Language) getValue("availableLanguage");
  }
  /**
   * A language someone may use with the item.
   */
  @JsonIgnore public Collection<Language> getAvailableLanguages() {
    final Object current = myData.get("availableLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * Estimated processing time for the service using this channel.
   */
  @JsonIgnore public Duration getProcessingTime() {
    return (Duration) getValue("processingTime");
  }
  /**
   * Estimated processing time for the service using this channel.
   */
  @JsonIgnore public Collection<Duration> getProcessingTimes() {
    final Object current = myData.get("processingTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The service provided by this channel.
   */
  @JsonIgnore public Service getProvidesService() {
    return (Service) getValue("providesService");
  }
  /**
   * The service provided by this channel.
   */
  @JsonIgnore public Collection<Service> getProvidesServices() {
    final Object current = myData.get("providesService");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  /**
   * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
   */
  @JsonIgnore public Place getServiceLocation() {
    return (Place) getValue("serviceLocation");
  }
  /**
   * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
   */
  @JsonIgnore public Collection<Place> getServiceLocations() {
    final Object current = myData.get("serviceLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The phone number to use to access the service.
   */
  @JsonIgnore public ContactPoint getServicePhone() {
    return (ContactPoint) getValue("servicePhone");
  }
  /**
   * The phone number to use to access the service.
   */
  @JsonIgnore public Collection<ContactPoint> getServicePhones() {
    final Object current = myData.get("servicePhone");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * The address for accessing the service by mail.
   */
  @JsonIgnore public PostalAddress getServicePostalAddress() {
    return (PostalAddress) getValue("servicePostalAddress");
  }
  /**
   * The address for accessing the service by mail.
   */
  @JsonIgnore public Collection<PostalAddress> getServicePostalAddresss() {
    final Object current = myData.get("servicePostalAddress");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * The number to access the service by text message.
   */
  @JsonIgnore public ContactPoint getServiceSmsNumber() {
    return (ContactPoint) getValue("serviceSmsNumber");
  }
  /**
   * The number to access the service by text message.
   */
  @JsonIgnore public Collection<ContactPoint> getServiceSmsNumbers() {
    final Object current = myData.get("serviceSmsNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * The website to access the service.
   */
  @JsonIgnore public String getServiceUrl() {
    return (String) getValue("serviceUrl");
  }
  /**
   * The website to access the service.
   */
  @JsonIgnore public Collection<String> getServiceUrls() {
    final Object current = myData.get("serviceUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected ServiceChannel(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ServiceChannel}
   */
  public static class Builder extends Intangible.Builder {
    public ServiceChannel build() {
      return new ServiceChannel(myData);
    }
    /**
     * A language someone may use with the item.
     */
    @NotNull public Builder availableLanguage(@NotNull Language language) {
      putValue("availableLanguage", language);
      return this;
    }
    /**
     * A language someone may use with the item.
     */
    @NotNull public Builder availableLanguage(@NotNull Language.Builder language) {
      putValue("availableLanguage", language.build());
      return this;
    }
    /**
     * Estimated processing time for the service using this channel.
     */
    @NotNull public Builder processingTime(@NotNull Duration duration) {
      putValue("processingTime", duration);
      return this;
    }
    /**
     * Estimated processing time for the service using this channel.
     */
    @NotNull public Builder processingTime(@NotNull Duration.Builder duration) {
      putValue("processingTime", duration.build());
      return this;
    }
    /**
     * The service provided by this channel.
     */
    @NotNull public Builder providesService(@NotNull Service service) {
      putValue("providesService", service);
      return this;
    }
    /**
     * The service provided by this channel.
     */
    @NotNull public Builder providesService(@NotNull Service.Builder service) {
      putValue("providesService", service.build());
      return this;
    }
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     */
    @NotNull public Builder serviceLocation(@NotNull Place place) {
      putValue("serviceLocation", place);
      return this;
    }
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     */
    @NotNull public Builder serviceLocation(@NotNull Place.Builder place) {
      putValue("serviceLocation", place.build());
      return this;
    }
    /**
     * The phone number to use to access the service.
     */
    @NotNull public Builder servicePhone(@NotNull ContactPoint contactPoint) {
      putValue("servicePhone", contactPoint);
      return this;
    }
    /**
     * The phone number to use to access the service.
     */
    @NotNull public Builder servicePhone(@NotNull ContactPoint.Builder contactPoint) {
      putValue("servicePhone", contactPoint.build());
      return this;
    }
    /**
     * The address for accessing the service by mail.
     */
    @NotNull public Builder servicePostalAddress(@NotNull PostalAddress postalAddress) {
      putValue("servicePostalAddress", postalAddress);
      return this;
    }
    /**
     * The address for accessing the service by mail.
     */
    @NotNull public Builder servicePostalAddress(@NotNull PostalAddress.Builder postalAddress) {
      putValue("servicePostalAddress", postalAddress.build());
      return this;
    }
    /**
     * The number to access the service by text message.
     */
    @NotNull public Builder serviceSmsNumber(@NotNull ContactPoint contactPoint) {
      putValue("serviceSmsNumber", contactPoint);
      return this;
    }
    /**
     * The number to access the service by text message.
     */
    @NotNull public Builder serviceSmsNumber(@NotNull ContactPoint.Builder contactPoint) {
      putValue("serviceSmsNumber", contactPoint.build());
      return this;
    }
    /**
     * The website to access the service.
     */
    @NotNull public Builder serviceUrl(@NotNull String serviceUrl) {
      putValue("serviceUrl", serviceUrl);
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
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
      putValue("mainEntityOfPage", creativeWork);
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
      putValue("mainEntityOfPage", creativeWork.build());
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
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      putValue("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("availableLanguage".equals(key) && value instanceof Language) { availableLanguage((Language)value); return; }
      if ("processingTime".equals(key) && value instanceof Duration) { processingTime((Duration)value); return; }
      if ("providesService".equals(key) && value instanceof Service) { providesService((Service)value); return; }
      if ("serviceLocation".equals(key) && value instanceof Place) { serviceLocation((Place)value); return; }
      if ("servicePhone".equals(key) && value instanceof ContactPoint) { servicePhone((ContactPoint)value); return; }
      if ("servicePostalAddress".equals(key) && value instanceof PostalAddress) { servicePostalAddress((PostalAddress)value); return; }
      if ("serviceSmsNumber".equals(key) && value instanceof ContactPoint) { serviceSmsNumber((ContactPoint)value); return; }
      if ("serviceUrl".equals(key) && value instanceof String) { serviceUrl((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
