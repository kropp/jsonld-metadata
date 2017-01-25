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
 * A nightclub or discotheque.
 */
public class NightClub extends EntertainmentBusiness {
  protected NightClub(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link NightClub}
   */
  public static class Builder extends EntertainmentBusiness.Builder {
    public NightClub build() {
      return new NightClub(myData);
    }
    /**
     * The currency accepted (in [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217)).
     */
    @NotNull public Builder currenciesAccepted(@NotNull String currenciesAccepted) {
      putValue("currenciesAccepted", currenciesAccepted);
      return this;
    }
    /**
     * The general opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.\n\n* Days are specified using the following two-letter combinations: ```Mo```, ```Tu```, ```We```, ```Th```, ```Fr```, ```Sa```, ```Su```.\n* Times are specified using 24:00 time. For example, 3pm is specified as ```15:00```. \n* Here is an example: <code>&lt;time itemprop="openingHours" datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>.\n* If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.
     */
    @NotNull public Builder openingHours(@NotNull String openingHours) {
      putValue("openingHours", openingHours);
      return this;
    }
    /**
     * Cash, credit card, etc.
     */
    @NotNull public Builder paymentAccepted(@NotNull String paymentAccepted) {
      putValue("paymentAccepted", paymentAccepted);
      return this;
    }
    /**
     * The price range of the business, for example ```$$$```.
     */
    @NotNull public Builder priceRange(@NotNull String priceRange) {
      putValue("priceRange", priceRange);
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress postalAddress) {
      putValue("address", postalAddress);
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress.Builder postalAddress) {
      putValue("address", postalAddress.build());
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull String address) {
      putValue("address", address);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch.
     *       
     */
    @NotNull public Builder branchCode(@NotNull String branchCode) {
      putValue("branchCode", branchCode);
      return this;
    }
    /**
     * The basic containment relation between a place and one that contains it.
     */
    @NotNull public Builder containedInPlace(@NotNull Place place) {
      putValue("containedInPlace", place);
      return this;
    }
    /**
     * The basic containment relation between a place and one that contains it.
     */
    @NotNull public Builder containedInPlace(@NotNull Place.Builder place) {
      putValue("containedInPlace", place.build());
      return this;
    }
    /**
     * The basic containment relation between a place and another that it contains.
     */
    @NotNull public Builder containsPlace(@NotNull Place place) {
      putValue("containsPlace", place);
      return this;
    }
    /**
     * The basic containment relation between a place and another that it contains.
     */
    @NotNull public Builder containsPlace(@NotNull Place.Builder place) {
      putValue("containsPlace", place.build());
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event event) {
      putValue("event", event);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      putValue("event", event.build());
      return this;
    }
    /**
     * The fax number.
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      putValue("faxNumber", faxNumber);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoCoordinates geoCoordinates) {
      putValue("geo", geoCoordinates);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoCoordinates.Builder geoCoordinates) {
      putValue("geo", geoCoordinates.build());
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoShape geoShape) {
      putValue("geo", geoShape);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoShape.Builder geoShape) {
      putValue("geo", geoShape.build());
      return this;
    }
    /**
     * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(@NotNull Identifier identifier) {
      putValue("globalLocationNumber", identifier);
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      putValue("isicV4", isicV4);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject imageObject) {
      putValue("logo", imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject.Builder imageObject) {
      putValue("logo", imageObject.build());
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull String logo) {
      putValue("logo", logo);
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull Map map) {
      putValue("hasMap", map);
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull Map.Builder map) {
      putValue("hasMap", map.build());
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull String hasMap) {
      putValue("hasMap", hasMap);
      return this;
    }
    /**
     * The total number of individuals that may attend an event or venue.
     */
    @NotNull public Builder maximumAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumAttendeeCapacity", integer);
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    @NotNull public Builder openingHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("openingHoursSpecification", openingHoursSpecification);
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    @NotNull public Builder openingHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("openingHoursSpecification", openingHoursSpecification.build());
      return this;
    }
    /**
     * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
     *       
     */
    @NotNull public Builder specialOpeningHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("specialOpeningHoursSpecification", openingHoursSpecification);
      return this;
    }
    /**
     * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
     *       
     */
    @NotNull public Builder specialOpeningHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("specialOpeningHoursSpecification", openingHoursSpecification.build());
      return this;
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(@NotNull ImageObject imageObject) {
      putValue("photo", imageObject);
      return this;
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(@NotNull ImageObject.Builder imageObject) {
      putValue("photo", imageObject.build());
      return this;
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(@NotNull Photograph photograph) {
      putValue("photo", photograph);
      return this;
    }
    /**
     * A photograph of this place.
     */
    @NotNull public Builder photo(@NotNull Photograph.Builder photograph) {
      putValue("photo", photograph.build());
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * The telephone number.
     */
    @NotNull public Builder telephone(@NotNull String telephone) {
      putValue("telephone", telephone);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      putValue("additionalProperty", propertyValue);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      putValue("additionalProperty", propertyValue.build());
      return this;
    }
    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     */
    @NotNull public Builder amenityFeature(@NotNull LocationFeatureSpecification locationFeatureSpecification) {
      putValue("amenityFeature", locationFeatureSpecification);
      return this;
    }
    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     */
    @NotNull public Builder amenityFeature(@NotNull LocationFeatureSpecification.Builder locationFeatureSpecification) {
      putValue("amenityFeature", locationFeatureSpecification.build());
      return this;
    }
    /**
     * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
     */
    @NotNull public Builder smokingAllowed(@NotNull Boolean smokingAllowed) {
      putValue("smokingAllowed", smokingAllowed);
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
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
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
      super.fromMap(key, value);
    }
  }
  
}
