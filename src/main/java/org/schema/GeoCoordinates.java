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
 * The geographic coordinates of a place or event.
 */
public class GeoCoordinates extends StructuredValue {
  /**
   * The elevation of a location.
   */
  @JsonIgnore public Integer getElevationInteger() {
    return (Integer) getValue("elevation");
  }
  /**
   * The elevation of a location.
   */
  @JsonIgnore public Collection<Integer> getElevationIntegers() {
    final Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The elevation of a location.
   */
  @JsonIgnore public Long getElevationLong() {
    return (Long) getValue("elevation");
  }
  /**
   * The elevation of a location.
   */
  @JsonIgnore public Collection<Long> getElevationLongs() {
    final Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The elevation of a location.
   */
  @JsonIgnore public Float getElevationFloat() {
    return (Float) getValue("elevation");
  }
  /**
   * The elevation of a location.
   */
  @JsonIgnore public Collection<Float> getElevationFloats() {
    final Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The elevation of a location.
   */
  @JsonIgnore public Double getElevationDouble() {
    return (Double) getValue("elevation");
  }
  /**
   * The elevation of a location.
   */
  @JsonIgnore public Collection<Double> getElevationDoubles() {
    final Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The elevation of a location.
   */
  @JsonIgnore public String getElevationString() {
    return (String) getValue("elevation");
  }
  /**
   * The elevation of a location.
   */
  @JsonIgnore public Collection<String> getElevationStrings() {
    final Object current = myData.get("elevation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  @JsonIgnore public Integer getLatitudeInteger() {
    return (Integer) getValue("latitude");
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  @JsonIgnore public Collection<Integer> getLatitudeIntegers() {
    final Object current = myData.get("latitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  @JsonIgnore public Long getLatitudeLong() {
    return (Long) getValue("latitude");
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  @JsonIgnore public Collection<Long> getLatitudeLongs() {
    final Object current = myData.get("latitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  @JsonIgnore public Float getLatitudeFloat() {
    return (Float) getValue("latitude");
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  @JsonIgnore public Collection<Float> getLatitudeFloats() {
    final Object current = myData.get("latitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  @JsonIgnore public Double getLatitudeDouble() {
    return (Double) getValue("latitude");
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  @JsonIgnore public Collection<Double> getLatitudeDoubles() {
    final Object current = myData.get("latitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  @JsonIgnore public String getLatitudeString() {
    return (String) getValue("latitude");
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  @JsonIgnore public Collection<String> getLatitudeStrings() {
    final Object current = myData.get("latitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  @JsonIgnore public Integer getLongitudeInteger() {
    return (Integer) getValue("longitude");
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  @JsonIgnore public Collection<Integer> getLongitudeIntegers() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  @JsonIgnore public Long getLongitudeLong() {
    return (Long) getValue("longitude");
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  @JsonIgnore public Collection<Long> getLongitudeLongs() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  @JsonIgnore public Float getLongitudeFloat() {
    return (Float) getValue("longitude");
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  @JsonIgnore public Collection<Float> getLongitudeFloats() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  @JsonIgnore public Double getLongitudeDouble() {
    return (Double) getValue("longitude");
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  @JsonIgnore public Collection<Double> getLongitudeDoubles() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  @JsonIgnore public String getLongitudeString() {
    return (String) getValue("longitude");
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  @JsonIgnore public Collection<String> getLongitudeStrings() {
    final Object current = myData.get("longitude");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected GeoCoordinates(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link GeoCoordinates}
   */
  public static class Builder extends StructuredValue.Builder {
    public GeoCoordinates build() {
      return new GeoCoordinates(myData);
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Integer integer) {
      putValue("elevation", integer);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Long elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Float elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Double elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull String elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The latitude of a location. For example <code>37.42242</code>.
     */
    @NotNull public Builder latitude(@NotNull Integer integer) {
      putValue("latitude", integer);
      return this;
    }
    /**
     * The latitude of a location. For example <code>37.42242</code>.
     */
    @NotNull public Builder latitude(@NotNull Long latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * The latitude of a location. For example <code>37.42242</code>.
     */
    @NotNull public Builder latitude(@NotNull Float latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * The latitude of a location. For example <code>37.42242</code>.
     */
    @NotNull public Builder latitude(@NotNull Double latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * The latitude of a location. For example <code>37.42242</code>.
     */
    @NotNull public Builder latitude(@NotNull String latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    @NotNull public Builder longitude(@NotNull Integer integer) {
      putValue("longitude", integer);
      return this;
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    @NotNull public Builder longitude(@NotNull Long longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    @NotNull public Builder longitude(@NotNull Float longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    @NotNull public Builder longitude(@NotNull Double longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    @NotNull public Builder longitude(@NotNull String longitude) {
      putValue("longitude", longitude);
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
      if ("elevation".equals(key) && value instanceof Integer) { elevation((Integer)value); return; }
      if ("elevation".equals(key) && value instanceof Long) { elevation((Long)value); return; }
      if ("elevation".equals(key) && value instanceof Float) { elevation((Float)value); return; }
      if ("elevation".equals(key) && value instanceof Double) { elevation((Double)value); return; }
      if ("elevation".equals(key) && value instanceof String) { elevation((String)value); return; }
      if ("latitude".equals(key) && value instanceof Integer) { latitude((Integer)value); return; }
      if ("latitude".equals(key) && value instanceof Long) { latitude((Long)value); return; }
      if ("latitude".equals(key) && value instanceof Float) { latitude((Float)value); return; }
      if ("latitude".equals(key) && value instanceof Double) { latitude((Double)value); return; }
      if ("latitude".equals(key) && value instanceof String) { latitude((String)value); return; }
      if ("longitude".equals(key) && value instanceof Integer) { longitude((Integer)value); return; }
      if ("longitude".equals(key) && value instanceof Long) { longitude((Long)value); return; }
      if ("longitude".equals(key) && value instanceof Float) { longitude((Float)value); return; }
      if ("longitude".equals(key) && value instanceof Double) { longitude((Double)value); return; }
      if ("longitude".equals(key) && value instanceof String) { longitude((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
