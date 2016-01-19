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
 * The geographic coordinates of a place or event.
 */
public class GeoCoordinates extends StructuredValue {
  /**
   * The elevation of a location.
   */
  public Number getElevation() {
    return myElevation;
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  public Number getLatitude() {
    return myLatitude;
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  public Number getLongitude() {
    return myLongitude;
  }
  /**
   * Builder for {@link GeoCoordinates}
   */
  static final class GeoCoordinatesThingBuilder implements Builder {
    /**
     * Creates new {@link GeoCoordinates} instance.
     */
    public GeoCoordinates build() {
      return new GeoCoordinates(elevation, latitude, longitude, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Integer integer) {
      if (this.elevation == null) this.elevation = new Number();
      this.elevation.setInteger(integer);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Long elevation) {
      if (this.elevation == null) this.elevation = new Number();
      this.elevation.setLong(elevation);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Float elevation) {
      if (this.elevation == null) this.elevation = new Number();
      this.elevation.setFloat(elevation);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Double elevation) {
      if (this.elevation == null) this.elevation = new Number();
      this.elevation.setDouble(elevation);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull String elevation) {
      if (this.elevation == null) this.elevation = new Number();
      this.elevation.setString(elevation);
      return this;
    }
    /**
     * The latitude of a location. For example <code>37.42242</code>.
     */
    @NotNull public Builder latitude(@NotNull Integer integer) {
      if (this.latitude == null) this.latitude = new Number();
      this.latitude.setInteger(integer);
      return this;
    }
    /**
     * The latitude of a location. For example <code>37.42242</code>.
     */
    @NotNull public Builder latitude(@NotNull Long latitude) {
      if (this.latitude == null) this.latitude = new Number();
      this.latitude.setLong(latitude);
      return this;
    }
    /**
     * The latitude of a location. For example <code>37.42242</code>.
     */
    @NotNull public Builder latitude(@NotNull Float latitude) {
      if (this.latitude == null) this.latitude = new Number();
      this.latitude.setFloat(latitude);
      return this;
    }
    /**
     * The latitude of a location. For example <code>37.42242</code>.
     */
    @NotNull public Builder latitude(@NotNull Double latitude) {
      if (this.latitude == null) this.latitude = new Number();
      this.latitude.setDouble(latitude);
      return this;
    }
    /**
     * The latitude of a location. For example <code>37.42242</code>.
     */
    @NotNull public Builder latitude(@NotNull String latitude) {
      if (this.latitude == null) this.latitude = new Number();
      this.latitude.setString(latitude);
      return this;
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    @NotNull public Builder longitude(@NotNull Integer integer) {
      if (this.longitude == null) this.longitude = new Number();
      this.longitude.setInteger(integer);
      return this;
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    @NotNull public Builder longitude(@NotNull Long longitude) {
      if (this.longitude == null) this.longitude = new Number();
      this.longitude.setLong(longitude);
      return this;
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    @NotNull public Builder longitude(@NotNull Float longitude) {
      if (this.longitude == null) this.longitude = new Number();
      this.longitude.setFloat(longitude);
      return this;
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    @NotNull public Builder longitude(@NotNull Double longitude) {
      if (this.longitude == null) this.longitude = new Number();
      this.longitude.setDouble(longitude);
      return this;
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    @NotNull public Builder longitude(@NotNull String longitude) {
      if (this.longitude == null) this.longitude = new Number();
      this.longitude.setString(longitude);
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
        if ("elevation".equals(key) && value instanceof Integer) { elevation((Integer)value); continue; }
        if ("elevation".equals(key) && value instanceof Long) { elevation((Long)value); continue; }
        if ("elevation".equals(key) && value instanceof Float) { elevation((Float)value); continue; }
        if ("elevation".equals(key) && value instanceof Double) { elevation((Double)value); continue; }
        if ("elevation".equals(key) && value instanceof String) { elevation((String)value); continue; }
        if ("latitude".equals(key) && value instanceof Integer) { latitude((Integer)value); continue; }
        if ("latitude".equals(key) && value instanceof Long) { latitude((Long)value); continue; }
        if ("latitude".equals(key) && value instanceof Float) { latitude((Float)value); continue; }
        if ("latitude".equals(key) && value instanceof Double) { latitude((Double)value); continue; }
        if ("latitude".equals(key) && value instanceof String) { latitude((String)value); continue; }
        if ("longitude".equals(key) && value instanceof Integer) { longitude((Integer)value); continue; }
        if ("longitude".equals(key) && value instanceof Long) { longitude((Long)value); continue; }
        if ("longitude".equals(key) && value instanceof Float) { longitude((Float)value); continue; }
        if ("longitude".equals(key) && value instanceof Double) { longitude((Double)value); continue; }
        if ("longitude".equals(key) && value instanceof String) { longitude((String)value); continue; }
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
    private Number elevation;
    private Number latitude;
    private Number longitude;
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
  public interface Builder extends ThingBuilder<GeoCoordinates> {
    @NotNull Builder elevation(@NotNull Integer integer);
    @NotNull Builder elevation(@NotNull Long elevation);
    @NotNull Builder elevation(@NotNull Float elevation);
    @NotNull Builder elevation(@NotNull Double elevation);
    @NotNull Builder elevation(@NotNull String elevation);
    @NotNull Builder latitude(@NotNull Integer integer);
    @NotNull Builder latitude(@NotNull Long latitude);
    @NotNull Builder latitude(@NotNull Float latitude);
    @NotNull Builder latitude(@NotNull Double latitude);
    @NotNull Builder latitude(@NotNull String latitude);
    @NotNull Builder longitude(@NotNull Integer integer);
    @NotNull Builder longitude(@NotNull Long longitude);
    @NotNull Builder longitude(@NotNull Float longitude);
    @NotNull Builder longitude(@NotNull Double longitude);
    @NotNull Builder longitude(@NotNull String longitude);
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

  protected GeoCoordinates(Number elevation, Number latitude, Number longitude, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myElevation = elevation;
    myLatitude = latitude;
    myLongitude = longitude;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myElevation != null ? myElevation.hashCode() : 0);
    result = 31 * result + (myLatitude != null ? myLatitude.hashCode() : 0);
    result = 31 * result + (myLongitude != null ? myLongitude.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GeoCoordinates geoCoordinates = (GeoCoordinates) o;
    if (!super.equals(o)) return false;
    if (myElevation != null ? !myElevation.equals(geoCoordinates.myElevation) : geoCoordinates.myElevation != null) return false;
    if (myLatitude != null ? !myLatitude.equals(geoCoordinates.myLatitude) : geoCoordinates.myLatitude != null) return false;
    if (myLongitude != null ? !myLongitude.equals(geoCoordinates.myLongitude) : geoCoordinates.myLongitude != null) return false;
    return true;
  }

  private Number myElevation;
  private Number myLatitude;
  private Number myLongitude;
}
