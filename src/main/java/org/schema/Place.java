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
 * Entities that have a somewhat fixed, physical extension.
 */
public class Place extends Thing {
  /**
   * Physical address of the item.
   */
  public PostalAddress getAddress() {
    return myAddress;
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating getAggregateRating() {
    return myAggregateRating;
  }
  /**
   * The basic containment relation between places.
   */
  public Place getContainedIn() {
    return myContainedIn;
  }
  /**
   * Upcoming or past event associated with this place, organization, or action.
   */
  public Event getEvent() {
    return myEvent;
  }
  /**
   * The fax number.
   */
  public String getFaxNumber() {
    return myFaxNumber;
  }
  /**
   * The geo coordinates of the place.
   */
  public GeoCoordinatesOrGeoShape getGeo() {
    return myGeo;
  }
  /**
   * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  public String getGlobalLocationNumber() {
    return myGlobalLocationNumber;
  }
  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  public String getIsicV4() {
    return myIsicV4;
  }
  /**
   * An associated logo.
   */
  public ImageObjectOrString getLogo() {
    return myLogo;
  }
  /**
   * A URL to a map of the place.
   */
  public MapOrString getHasMap() {
    return myHasMap;
  }
  /**
   * The opening hours of a certain place.
   */
  public OpeningHoursSpecification getOpeningHoursSpecification() {
    return myOpeningHoursSpecification;
  }
  /**
   * A photograph of this place.
   */
  public ImageObjectOrPhotograph getPhoto() {
    return myPhoto;
  }
  /**
   * A review of the item.
   */
  public Review getReview() {
    return myReview;
  }
  /**
   * The telephone number.
   */
  public String getTelephone() {
    return myTelephone;
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

   */
  public PropertyValue getAdditionalProperty() {
    return myAdditionalProperty;
  }
  /**
   * Builder for {@link Place}
   */
  static final class PlaceThingBuilder implements Builder {
    /**
     * Creates new {@link Place} instance.
     */
    public Place build() {
      return new Place(address, aggregateRating, containedIn, event, faxNumber, geo, globalLocationNumber, isicV4, logo, hasMap, openingHoursSpecification, photo, review, telephone, additionalProperty, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress postalAddress) {
      this.address = postalAddress;
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress.Builder postalAddress) {
      return this.address(postalAddress.build());
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      return this.aggregateRating(aggregateRating.build());
    }
    /**
     * The basic containment relation between places.
     */
    @NotNull public Builder containedIn(@NotNull Place place) {
      this.containedIn = place;
      return this;
    }
    /**
     * The basic containment relation between places.
     */
    @NotNull public Builder containedIn(@NotNull Place.Builder place) {
      return this.containedIn(place.build());
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event event) {
      this.event = event;
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      return this.event(event.build());
    }
    /**
     * The fax number.
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      this.faxNumber = faxNumber;
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoCoordinates geoCoordinates) {
      if (this.geo == null) this.geo = new GeoCoordinatesOrGeoShape();
      this.geo.setGeoCoordinates(geoCoordinates);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoCoordinates.Builder geoCoordinates) {
      return this.geo(geoCoordinates.build());
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoShape geoShape) {
      if (this.geo == null) this.geo = new GeoCoordinatesOrGeoShape();
      this.geo.setGeoShape(geoShape);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoShape.Builder geoShape) {
      return this.geo(geoShape.build());
    }
    /**
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(@NotNull String globalLocationNumber) {
      this.globalLocationNumber = globalLocationNumber;
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      this.isicV4 = isicV4;
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject imageObject) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setImageObject(imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject.Builder imageObject) {
      return this.logo(imageObject.build());
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull String logo) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setString(logo);
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull Map map) {
      if (this.hasMap == null) this.hasMap = new MapOrString();
      this.hasMap.setMap(map);
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull Map.Builder map) {
      return this.hasMap(map.build());
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull String hasMap) {
      if (this.hasMap == null) this.hasMap = new MapOrString();
      this.hasMap.setString(hasMap);
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    @NotNull public Builder openingHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      this.openingHoursSpecification = openingHoursSpecification;
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    @NotNull public Builder openingHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      return this.openingHoursSpecification(openingHoursSpecification.build());
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(@NotNull ImageObject imageObject) {
      if (this.photo == null) this.photo = new ImageObjectOrPhotograph();
      this.photo.setImageObject(imageObject);
      return this;
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(@NotNull ImageObject.Builder imageObject) {
      return this.photo(imageObject.build());
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(@NotNull Photograph photograph) {
      if (this.photo == null) this.photo = new ImageObjectOrPhotograph();
      this.photo.setPhotograph(photograph);
      return this;
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(@NotNull Photograph.Builder photograph) {
      return this.photo(photograph.build());
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      this.review = review;
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      return this.review(review.build());
    }
    /**
     * The telephone number.
     */
    @NotNull public Builder telephone(@NotNull String telephone) {
      this.telephone = telephone;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      this.additionalProperty = propertyValue;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      return this.additionalProperty(propertyValue.build());
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
        if ("address".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); continue; }
        if ("aggregateRating".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); continue; }
        if ("containedIn".equals(key) && value instanceof Place) { containedIn((Place)value); continue; }
        if ("event".equals(key) && value instanceof Event) { event((Event)value); continue; }
        if ("faxNumber".equals(key) && value instanceof String) { faxNumber((String)value); continue; }
        if ("geo".equals(key) && value instanceof GeoCoordinates) { geo((GeoCoordinates)value); continue; }
        if ("geo".equals(key) && value instanceof GeoShape) { geo((GeoShape)value); continue; }
        if ("globalLocationNumber".equals(key) && value instanceof String) { globalLocationNumber((String)value); continue; }
        if ("isicV4".equals(key) && value instanceof String) { isicV4((String)value); continue; }
        if ("logo".equals(key) && value instanceof ImageObject) { logo((ImageObject)value); continue; }
        if ("logo".equals(key) && value instanceof String) { logo((String)value); continue; }
        if ("hasMap".equals(key) && value instanceof Map) { hasMap((Map)value); continue; }
        if ("hasMap".equals(key) && value instanceof String) { hasMap((String)value); continue; }
        if ("openingHoursSpecification".equals(key) && value instanceof OpeningHoursSpecification) { openingHoursSpecification((OpeningHoursSpecification)value); continue; }
        if ("photo".equals(key) && value instanceof ImageObject) { photo((ImageObject)value); continue; }
        if ("photo".equals(key) && value instanceof Photograph) { photo((Photograph)value); continue; }
        if ("review".equals(key) && value instanceof Review) { review((Review)value); continue; }
        if ("telephone".equals(key) && value instanceof String) { telephone((String)value); continue; }
        if ("additionalProperty".equals(key) && value instanceof PropertyValue) { additionalProperty((PropertyValue)value); continue; }
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
  public interface Builder extends ThingBuilder<Place> {
    @NotNull Builder address(@NotNull PostalAddress postalAddress);
    @NotNull Builder address(@NotNull PostalAddress.Builder postalAddress);
    @NotNull Builder aggregateRating(@NotNull AggregateRating aggregateRating);
    @NotNull Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating);
    @NotNull Builder containedIn(@NotNull Place place);
    @NotNull Builder containedIn(@NotNull Place.Builder place);
    @NotNull Builder event(@NotNull Event event);
    @NotNull Builder event(@NotNull Event.Builder event);
    @NotNull Builder faxNumber(@NotNull String faxNumber);
    @NotNull Builder geo(@NotNull GeoCoordinates geoCoordinates);
    @NotNull Builder geo(@NotNull GeoCoordinates.Builder geoCoordinates);
    @NotNull Builder geo(@NotNull GeoShape geoShape);
    @NotNull Builder geo(@NotNull GeoShape.Builder geoShape);
    @NotNull Builder globalLocationNumber(@NotNull String globalLocationNumber);
    @NotNull Builder isicV4(@NotNull String isicV4);
    @NotNull Builder logo(@NotNull ImageObject imageObject);
    @NotNull Builder logo(@NotNull ImageObject.Builder imageObject);
    @NotNull Builder logo(@NotNull String logo);
    @NotNull Builder hasMap(@NotNull Map map);
    @NotNull Builder hasMap(@NotNull Map.Builder map);
    @NotNull Builder hasMap(@NotNull String hasMap);
    @NotNull Builder openingHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification);
    @NotNull Builder openingHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification);
    @NotNull Builder photo(@NotNull ImageObject imageObject);
    @NotNull Builder photo(@NotNull ImageObject.Builder imageObject);
    @NotNull Builder photo(@NotNull Photograph photograph);
    @NotNull Builder photo(@NotNull Photograph.Builder photograph);
    @NotNull Builder review(@NotNull Review review);
    @NotNull Builder review(@NotNull Review.Builder review);
    @NotNull Builder telephone(@NotNull String telephone);
    @NotNull Builder additionalProperty(@NotNull PropertyValue propertyValue);
    @NotNull Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue);
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

  protected Place(PostalAddress address, AggregateRating aggregateRating, Place containedIn, Event event, String faxNumber, GeoCoordinatesOrGeoShape geo, String globalLocationNumber, String isicV4, ImageObjectOrString logo, MapOrString hasMap, OpeningHoursSpecification openingHoursSpecification, ImageObjectOrPhotograph photo, Review review, String telephone, PropertyValue additionalProperty, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myAddress = address;
    myAggregateRating = aggregateRating;
    myContainedIn = containedIn;
    myEvent = event;
    myFaxNumber = faxNumber;
    myGeo = geo;
    myGlobalLocationNumber = globalLocationNumber;
    myIsicV4 = isicV4;
    myLogo = logo;
    myHasMap = hasMap;
    myOpeningHoursSpecification = openingHoursSpecification;
    myPhoto = photo;
    myReview = review;
    myTelephone = telephone;
    myAdditionalProperty = additionalProperty;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myAddress != null ? myAddress.hashCode() : 0);
    result = 31 * result + (myAggregateRating != null ? myAggregateRating.hashCode() : 0);
    result = 31 * result + (myContainedIn != null ? myContainedIn.hashCode() : 0);
    result = 31 * result + (myEvent != null ? myEvent.hashCode() : 0);
    result = 31 * result + (myFaxNumber != null ? myFaxNumber.hashCode() : 0);
    result = 31 * result + (myGeo != null ? myGeo.hashCode() : 0);
    result = 31 * result + (myGlobalLocationNumber != null ? myGlobalLocationNumber.hashCode() : 0);
    result = 31 * result + (myIsicV4 != null ? myIsicV4.hashCode() : 0);
    result = 31 * result + (myLogo != null ? myLogo.hashCode() : 0);
    result = 31 * result + (myHasMap != null ? myHasMap.hashCode() : 0);
    result = 31 * result + (myOpeningHoursSpecification != null ? myOpeningHoursSpecification.hashCode() : 0);
    result = 31 * result + (myPhoto != null ? myPhoto.hashCode() : 0);
    result = 31 * result + (myReview != null ? myReview.hashCode() : 0);
    result = 31 * result + (myTelephone != null ? myTelephone.hashCode() : 0);
    result = 31 * result + (myAdditionalProperty != null ? myAdditionalProperty.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Place place = (Place) o;
    if (!super.equals(o)) return false;
    if (myAddress != null ? !myAddress.equals(place.myAddress) : place.myAddress != null) return false;
    if (myAggregateRating != null ? !myAggregateRating.equals(place.myAggregateRating) : place.myAggregateRating != null) return false;
    if (myContainedIn != null ? !myContainedIn.equals(place.myContainedIn) : place.myContainedIn != null) return false;
    if (myEvent != null ? !myEvent.equals(place.myEvent) : place.myEvent != null) return false;
    if (myFaxNumber != null ? !myFaxNumber.equals(place.myFaxNumber) : place.myFaxNumber != null) return false;
    if (myGeo != null ? !myGeo.equals(place.myGeo) : place.myGeo != null) return false;
    if (myGlobalLocationNumber != null ? !myGlobalLocationNumber.equals(place.myGlobalLocationNumber) : place.myGlobalLocationNumber != null) return false;
    if (myIsicV4 != null ? !myIsicV4.equals(place.myIsicV4) : place.myIsicV4 != null) return false;
    if (myLogo != null ? !myLogo.equals(place.myLogo) : place.myLogo != null) return false;
    if (myHasMap != null ? !myHasMap.equals(place.myHasMap) : place.myHasMap != null) return false;
    if (myOpeningHoursSpecification != null ? !myOpeningHoursSpecification.equals(place.myOpeningHoursSpecification) : place.myOpeningHoursSpecification != null) return false;
    if (myPhoto != null ? !myPhoto.equals(place.myPhoto) : place.myPhoto != null) return false;
    if (myReview != null ? !myReview.equals(place.myReview) : place.myReview != null) return false;
    if (myTelephone != null ? !myTelephone.equals(place.myTelephone) : place.myTelephone != null) return false;
    if (myAdditionalProperty != null ? !myAdditionalProperty.equals(place.myAdditionalProperty) : place.myAdditionalProperty != null) return false;
    return true;
  }

  private PostalAddress myAddress;
  private AggregateRating myAggregateRating;
  private Place myContainedIn;
  private Event myEvent;
  private String myFaxNumber;
  private GeoCoordinatesOrGeoShape myGeo;
  private String myGlobalLocationNumber;
  private String myIsicV4;
  private ImageObjectOrString myLogo;
  private MapOrString myHasMap;
  private OpeningHoursSpecification myOpeningHoursSpecification;
  private ImageObjectOrPhotograph myPhoto;
  private Review myReview;
  private String myTelephone;
  private PropertyValue myAdditionalProperty;
}
