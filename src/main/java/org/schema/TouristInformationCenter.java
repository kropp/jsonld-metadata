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
 * A tourist information center.
 */
public class TouristInformationCenter extends LocalBusiness {
  /**
   * Builder for {@link TouristInformationCenter}
   */
  static final class TouristInformationCenterThingBuilder implements Builder {
    /**
     * Creates new {@link TouristInformationCenter} instance.
     */
    public TouristInformationCenter build() {
      return new TouristInformationCenter(parentOrganization, currenciesAccepted, openingHours, paymentAccepted, priceRange, address, aggregateRating, containedIn, event, faxNumber, geo, globalLocationNumber, isicV4, logo, hasMap, openingHoursSpecification, photo, review, telephone, additionalProperty, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The larger organization that this local business is a branch of, if any.
     */
    @NotNull public Builder parentOrganization(Organization organization) {
      this.parentOrganization = organization;
      return this;
    }
    /**
     * The larger organization that this local business is a branch of, if any.
     */
    @NotNull public Builder parentOrganization(Organization.Builder organization) {
      return this.parentOrganization(organization.build());
    }
    /**
     * The currency accepted (in <a href='http://en.wikipedia.org/wiki/ISO_4217'>ISO 4217 currency format</a>).
     */
    @NotNull public Builder currenciesAccepted(String currenciesAccepted) {
      this.currenciesAccepted = currenciesAccepted;
      return this;
    }
    /**
     * The opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.<br />- Days are specified using the following two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>, <code>Fr</code>, <code>Sa</code>, <code>Su</code>.<br />- Times are specified using 24:00 time. For example, 3pm is specified as <code>15:00</code>. <br />- Here is an example: <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>. <br />- If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.
     */
    @NotNull public Builder openingHours(String openingHours) {
      this.openingHours = openingHours;
      return this;
    }
    /**
     * Cash, credit card, etc.
     */
    @NotNull public Builder paymentAccepted(String paymentAccepted) {
      this.paymentAccepted = paymentAccepted;
      return this;
    }
    /**
     * The price range of the business, for example <code>$$$</code>.
     */
    @NotNull public Builder priceRange(String priceRange) {
      this.priceRange = priceRange;
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(PostalAddress postalAddress) {
      this.address = postalAddress;
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(PostalAddress.Builder postalAddress) {
      return this.address(postalAddress.build());
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(AggregateRating.Builder aggregateRating) {
      return this.aggregateRating(aggregateRating.build());
    }
    /**
     * The basic containment relation between places.
     */
    @NotNull public Builder containedIn(Place place) {
      this.containedIn = place;
      return this;
    }
    /**
     * The basic containment relation between places.
     */
    @NotNull public Builder containedIn(Place.Builder place) {
      return this.containedIn(place.build());
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(Event event) {
      this.event = event;
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(Event.Builder event) {
      return this.event(event.build());
    }
    /**
     * The fax number.
     */
    @NotNull public Builder faxNumber(String faxNumber) {
      this.faxNumber = faxNumber;
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(GeoCoordinates geoCoordinates) {
      if (this.geo == null) this.geo = new GeoCoordinatesOrGeoShape();
      this.geo.setGeoCoordinates(geoCoordinates);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(GeoCoordinates.Builder geoCoordinates) {
      return this.geo(geoCoordinates.build());
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(GeoShape geoShape) {
      if (this.geo == null) this.geo = new GeoCoordinatesOrGeoShape();
      this.geo.setGeoShape(geoShape);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(GeoShape.Builder geoShape) {
      return this.geo(geoShape.build());
    }
    /**
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(String globalLocationNumber) {
      this.globalLocationNumber = globalLocationNumber;
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(String isicV4) {
      this.isicV4 = isicV4;
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(ImageObject imageObject) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setImageObject(imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(ImageObject.Builder imageObject) {
      return this.logo(imageObject.build());
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(String logo) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setString(logo);
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(Map map) {
      if (this.hasMap == null) this.hasMap = new MapOrString();
      this.hasMap.setMap(map);
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(Map.Builder map) {
      return this.hasMap(map.build());
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(String hasMap) {
      if (this.hasMap == null) this.hasMap = new MapOrString();
      this.hasMap.setString(hasMap);
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    @NotNull public Builder openingHoursSpecification(OpeningHoursSpecification openingHoursSpecification) {
      this.openingHoursSpecification = openingHoursSpecification;
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    @NotNull public Builder openingHoursSpecification(OpeningHoursSpecification.Builder openingHoursSpecification) {
      return this.openingHoursSpecification(openingHoursSpecification.build());
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(ImageObject imageObject) {
      if (this.photo == null) this.photo = new ImageObjectOrPhotograph();
      this.photo.setImageObject(imageObject);
      return this;
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(ImageObject.Builder imageObject) {
      return this.photo(imageObject.build());
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(Photograph photograph) {
      if (this.photo == null) this.photo = new ImageObjectOrPhotograph();
      this.photo.setPhotograph(photograph);
      return this;
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(Photograph.Builder photograph) {
      return this.photo(photograph.build());
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(Review review) {
      this.review = review;
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(Review.Builder review) {
      return this.review(review.build());
    }
    /**
     * The telephone number.
     */
    @NotNull public Builder telephone(String telephone) {
      this.telephone = telephone;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    @NotNull public Builder additionalProperty(PropertyValue propertyValue) {
      this.additionalProperty = propertyValue;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    @NotNull public Builder additionalProperty(PropertyValue.Builder propertyValue) {
      return this.additionalProperty(propertyValue.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(String description) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private Organization parentOrganization;
    private String currenciesAccepted;
    private String openingHours;
    private String paymentAccepted;
    private String priceRange;
    private PostalAddress address;
    private AggregateRating aggregateRating;
    private Place containedIn;
    private Event event;
    private String faxNumber;
    private GeoCoordinatesOrGeoShape geo;
    private String globalLocationNumber;
    private String isicV4;
    private ImageObjectOrString logo;
    private MapOrString hasMap;
    private OpeningHoursSpecification openingHoursSpecification;
    private ImageObjectOrPhotograph photo;
    private Review review;
    private String telephone;
    private PropertyValue additionalProperty;
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
  public interface Builder extends ThingBuilder<TouristInformationCenter> {
    @NotNull Builder parentOrganization(Organization organization);
    @NotNull Builder parentOrganization(Organization.Builder organization);
    @NotNull Builder currenciesAccepted(String currenciesAccepted);
    @NotNull Builder openingHours(String openingHours);
    @NotNull Builder paymentAccepted(String paymentAccepted);
    @NotNull Builder priceRange(String priceRange);
    @NotNull Builder address(PostalAddress postalAddress);
    @NotNull Builder address(PostalAddress.Builder postalAddress);
    @NotNull Builder aggregateRating(AggregateRating aggregateRating);
    @NotNull Builder aggregateRating(AggregateRating.Builder aggregateRating);
    @NotNull Builder containedIn(Place place);
    @NotNull Builder containedIn(Place.Builder place);
    @NotNull Builder event(Event event);
    @NotNull Builder event(Event.Builder event);
    @NotNull Builder faxNumber(String faxNumber);
    @NotNull Builder geo(GeoCoordinates geoCoordinates);
    @NotNull Builder geo(GeoCoordinates.Builder geoCoordinates);
    @NotNull Builder geo(GeoShape geoShape);
    @NotNull Builder geo(GeoShape.Builder geoShape);
    @NotNull Builder globalLocationNumber(String globalLocationNumber);
    @NotNull Builder isicV4(String isicV4);
    @NotNull Builder logo(ImageObject imageObject);
    @NotNull Builder logo(ImageObject.Builder imageObject);
    @NotNull Builder logo(String logo);
    @NotNull Builder hasMap(Map map);
    @NotNull Builder hasMap(Map.Builder map);
    @NotNull Builder hasMap(String hasMap);
    @NotNull Builder openingHoursSpecification(OpeningHoursSpecification openingHoursSpecification);
    @NotNull Builder openingHoursSpecification(OpeningHoursSpecification.Builder openingHoursSpecification);
    @NotNull Builder photo(ImageObject imageObject);
    @NotNull Builder photo(ImageObject.Builder imageObject);
    @NotNull Builder photo(Photograph photograph);
    @NotNull Builder photo(Photograph.Builder photograph);
    @NotNull Builder review(Review review);
    @NotNull Builder review(Review.Builder review);
    @NotNull Builder telephone(String telephone);
    @NotNull Builder additionalProperty(PropertyValue propertyValue);
    @NotNull Builder additionalProperty(PropertyValue.Builder propertyValue);
    @NotNull Builder additionalType(String additionalType);
    @NotNull Builder alternateName(String alternateName);
    @NotNull Builder description(String description);
    @NotNull Builder mainEntityOfPage(CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(String mainEntityOfPage);
    @NotNull Builder name(String name);
    @NotNull Builder sameAs(String sameAs);
    @NotNull Builder url(String url);
    @NotNull Builder potentialAction(Action action);
    @NotNull Builder potentialAction(Action.Builder action);
    @NotNull Builder id(String id);
  }

  protected TouristInformationCenter(Organization parentOrganization, String currenciesAccepted, String openingHours, String paymentAccepted, String priceRange, PostalAddress address, AggregateRating aggregateRating, Place containedIn, Event event, String faxNumber, GeoCoordinatesOrGeoShape geo, String globalLocationNumber, String isicV4, ImageObjectOrString logo, MapOrString hasMap, OpeningHoursSpecification openingHoursSpecification, ImageObjectOrPhotograph photo, Review review, String telephone, PropertyValue additionalProperty, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(parentOrganization, currenciesAccepted, openingHours, paymentAccepted, priceRange, address, aggregateRating, containedIn, event, faxNumber, geo, globalLocationNumber, isicV4, logo, hasMap, openingHoursSpecification, photo, review, telephone, additionalProperty, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
  }
}
