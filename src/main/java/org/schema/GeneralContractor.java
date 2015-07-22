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
 * A general contractor.
 */
public class GeneralContractor extends ProfessionalService {
  /**
   * Builder for {@link GeneralContractor}
   */
  public static final class Builder {
    /**
     * Creates new {@link GeneralContractor} instance.
     */
    public GeneralContractor build() {
      return new GeneralContractor(aggregateRating, review, logo, parentOrganization, sameAs, additionalType, containedIn, event, priceRange, openingHoursSpecification, currenciesAccepted, potentialAction, address, additionalProperty, openingHours, globalLocationNumber, isicV4, name, paymentAccepted, mainEntityOfPage, hasMap, url, alternateName, faxNumber, telephone, geo, description, photo);
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * A review of the item.
     */
    public Builder review(Review review) {
      this.review = review;
      return this;
    }
    /**
     * An associated logo.
     */
    public Builder logo(ImageObject imageObject) {
      this.logo.setImageObject(imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    public Builder logo(String logo) {
      this.logo.setString(logo);
      return this;
    }
    /**
     * The larger organization that this local business is a branch of, if any.
     */
    public Builder parentOrganization(Organization organization) {
      this.parentOrganization = organization;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * The basic containment relation between places.
     */
    public Builder containedIn(Place place) {
      this.containedIn = place;
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    public Builder event(Event event) {
      this.event = event;
      return this;
    }
    /**
     * The price range of the business, for example <code>$$$</code>.
     */
    public Builder priceRange(String priceRange) {
      this.priceRange = priceRange;
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    public Builder openingHoursSpecification(OpeningHoursSpecification openingHoursSpecification) {
      this.openingHoursSpecification = openingHoursSpecification;
      return this;
    }
    /**
     * The currency accepted (in <a href='http://en.wikipedia.org/wiki/ISO_4217'>ISO 4217 currency format</a>).
     */
    public Builder currenciesAccepted(String currenciesAccepted) {
      this.currenciesAccepted = currenciesAccepted;
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
     * Physical address of the item.
     */
    public Builder address(PostalAddress postalAddress) {
      this.address = postalAddress;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    public Builder additionalProperty(PropertyValue propertyValue) {
      this.additionalProperty = propertyValue;
      return this;
    }
    /**
     * The opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.<br />- Days are specified using the following two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>, <code>Fr</code>, <code>Sa</code>, <code>Su</code>.<br />- Times are specified using 24:00 time. For example, 3pm is specified as <code>15:00</code>. <br />- Here is an example: <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>. <br />- If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.
     */
    public Builder openingHours(String openingHours) {
      this.openingHours = openingHours;
      return this;
    }
    /**
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    public Builder globalLocationNumber(String globalLocationNumber) {
      this.globalLocationNumber = globalLocationNumber;
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    public Builder isicV4(String isicV4) {
      this.isicV4 = isicV4;
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
     * Cash, credit card, etc.
     */
    public Builder paymentAccepted(String paymentAccepted) {
      this.paymentAccepted = paymentAccepted;
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
     * A URL to a map of the place.
     */
    public Builder hasMap(Map map) {
      this.hasMap.setMap(map);
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    public Builder hasMap(String hasMap) {
      this.hasMap.setString(hasMap);
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * The fax number.
     */
    public Builder faxNumber(String faxNumber) {
      this.faxNumber = faxNumber;
      return this;
    }
    /**
     * The telephone number.
     */
    public Builder telephone(String telephone) {
      this.telephone = telephone;
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    public Builder geo(GeoCoordinates geoCoordinates) {
      this.geo.setGeoCoordinates(geoCoordinates);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    public Builder geo(GeoShape geoShape) {
      this.geo.setGeoShape(geoShape);
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
     * A photograph of this place.
     */
    public Builder photo(ImageObject imageObject) {
      this.photo.setImageObject(imageObject);
      return this;
    }
    /**
     * A photograph of this place.
     */
    public Builder photo(Photograph photograph) {
      this.photo.setPhotograph(photograph);
      return this;
    }
    private AggregateRating aggregateRating;
    private Review review;
    private ImageObjectOrString logo;
    private Organization parentOrganization;
    private String sameAs;
    private String additionalType;
    private Place containedIn;
    private Event event;
    private String priceRange;
    private OpeningHoursSpecification openingHoursSpecification;
    private String currenciesAccepted;
    private Action potentialAction;
    private PostalAddress address;
    private PropertyValue additionalProperty;
    private String openingHours;
    private String globalLocationNumber;
    private String isicV4;
    private String name;
    private String paymentAccepted;
    private StringOrCreativeWork mainEntityOfPage;
    private MapOrString hasMap;
    private String url;
    private String alternateName;
    private String faxNumber;
    private String telephone;
    private GeoCoordinatesOrGeoShape geo;
    private String description;
    private ImageObjectOrPhotograph photo;
  }

  protected GeneralContractor(AggregateRating aggregateRating, Review review, ImageObjectOrString logo, Organization parentOrganization, String sameAs, String additionalType, Place containedIn, Event event, String priceRange, OpeningHoursSpecification openingHoursSpecification, String currenciesAccepted, Action potentialAction, PostalAddress address, PropertyValue additionalProperty, String openingHours, String globalLocationNumber, String isicV4, String name, String paymentAccepted, StringOrCreativeWork mainEntityOfPage, MapOrString hasMap, String url, String alternateName, String faxNumber, String telephone, GeoCoordinatesOrGeoShape geo, String description, ImageObjectOrPhotograph photo) {
    super(aggregateRating, review, logo, parentOrganization, containedIn, event, additionalType, sameAs, priceRange, openingHoursSpecification, currenciesAccepted, potentialAction, address, additionalProperty, openingHours, globalLocationNumber, isicV4, name, paymentAccepted, mainEntityOfPage, hasMap, url, alternateName, faxNumber, geo, telephone, description, photo);
  }
}
