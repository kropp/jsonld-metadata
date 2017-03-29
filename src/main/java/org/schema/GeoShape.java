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

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews
 */
public class GeoShape extends StructuredValue {
  /**
   * Physical address of the item.
   */
  @JsonIgnore public PostalAddress getAddressPostalAddress() {
    return (PostalAddress) getValue("address");
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public Collection<PostalAddress> getAddressPostalAddresss() {
    final Object current = myData.get("address");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public String getAddressString() {
    return (String) getValue("address");
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public Collection<String> getAddressStrings() {
    final Object current = myData.get("address");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
   */
  @JsonIgnore public Country getAddressCountryCountry() {
    return (Country) getValue("addressCountry");
  }
  /**
   * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
   */
  @JsonIgnore public Collection<Country> getAddressCountryCountrys() {
    final Object current = myData.get("addressCountry");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Country>) current;
    }
    return Arrays.asList((Country) current);
  }
  /**
   * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
   */
  @JsonIgnore public String getAddressCountryString() {
    return (String) getValue("addressCountry");
  }
  /**
   * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
   */
  @JsonIgnore public Collection<String> getAddressCountryStrings() {
    final Object current = myData.get("addressCountry");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
   */
  @JsonIgnore public String getBox() {
    return (String) getValue("box");
  }
  /**
   * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
   */
  @JsonIgnore public Collection<String> getBoxs() {
    final Object current = myData.get("box");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
   */
  @JsonIgnore public String getCircle() {
    return (String) getValue("circle");
  }
  /**
   * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
   */
  @JsonIgnore public Collection<String> getCircles() {
    final Object current = myData.get("circle");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Integer getElevationInteger() {
    return (Integer) getValue("elevation");
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Long getElevationLong() {
    return (Long) getValue("elevation");
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Float getElevationFloat() {
    return (Float) getValue("elevation");
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Double getElevationDouble() {
    return (Double) getValue("elevation");
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public String getElevationString() {
    return (String) getValue("elevation");
  }
  /**
   * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
   */
  @JsonIgnore public String getLine() {
    return (String) getValue("line");
  }
  /**
   * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
   */
  @JsonIgnore public Collection<String> getLines() {
    final Object current = myData.get("line");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
   */
  @JsonIgnore public String getPolygon() {
    return (String) getValue("polygon");
  }
  /**
   * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
   */
  @JsonIgnore public Collection<String> getPolygons() {
    final Object current = myData.get("polygon");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The postal code. For example, 94043.
   */
  @JsonIgnore public String getPostalCode() {
    return (String) getValue("postalCode");
  }
  /**
   * The postal code. For example, 94043.
   */
  @JsonIgnore public Collection<String> getPostalCodes() {
    final Object current = myData.get("postalCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected GeoShape(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link GeoShape}
   */
  public static class Builder extends StructuredValue.Builder {
    @NotNull public GeoShape build() {
      return new GeoShape(myData);
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
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     */
    @NotNull public Builder addressCountry(@NotNull Country country) {
      putValue("addressCountry", country);
      return this;
    }
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     */
    @NotNull public Builder addressCountry(@NotNull Country.Builder country) {
      putValue("addressCountry", country.build());
      return this;
    }
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     */
    @NotNull public Builder addressCountry(@NotNull String addressCountry) {
      putValue("addressCountry", addressCountry);
      return this;
    }
    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     */
    @NotNull public Builder box(@NotNull String box) {
      putValue("box", box);
      return this;
    }
    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     */
    @NotNull public Builder circle(@NotNull String circle) {
      putValue("circle", circle);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder elevation(@NotNull Integer integer) {
      putValue("elevation", integer);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder elevation(@NotNull Long elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder elevation(@NotNull Float elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder elevation(@NotNull Double elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder elevation(@NotNull String elevation) {
      putValue("elevation", elevation);
      return this;
    }
    /**
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     */
    @NotNull public Builder line(@NotNull String line) {
      putValue("line", line);
      return this;
    }
    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     */
    @NotNull public Builder polygon(@NotNull String polygon) {
      putValue("polygon", polygon);
      return this;
    }
    /**
     * The postal code. For example, 94043.
     */
    @NotNull public Builder postalCode(@NotNull String postalCode) {
      putValue("postalCode", postalCode);
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
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("address".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); return; }
      if ("addresss".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); return; }
      if ("address".equals(key) && value instanceof String) { address((String)value); return; }
      if ("addresss".equals(key) && value instanceof String) { address((String)value); return; }
      if ("addressCountry".equals(key) && value instanceof Country) { addressCountry((Country)value); return; }
      if ("addressCountrys".equals(key) && value instanceof Country) { addressCountry((Country)value); return; }
      if ("addressCountry".equals(key) && value instanceof String) { addressCountry((String)value); return; }
      if ("addressCountrys".equals(key) && value instanceof String) { addressCountry((String)value); return; }
      if ("box".equals(key) && value instanceof String) { box((String)value); return; }
      if ("boxs".equals(key) && value instanceof String) { box((String)value); return; }
      if ("circle".equals(key) && value instanceof String) { circle((String)value); return; }
      if ("circles".equals(key) && value instanceof String) { circle((String)value); return; }
      if ("elevation".equals(key) && value instanceof Integer) { elevation((Integer)value); return; }
      if ("elevations".equals(key) && value instanceof Integer) { elevation((Integer)value); return; }
      if ("elevation".equals(key) && value instanceof Long) { elevation((Long)value); return; }
      if ("elevations".equals(key) && value instanceof Long) { elevation((Long)value); return; }
      if ("elevation".equals(key) && value instanceof Float) { elevation((Float)value); return; }
      if ("elevations".equals(key) && value instanceof Float) { elevation((Float)value); return; }
      if ("elevation".equals(key) && value instanceof Double) { elevation((Double)value); return; }
      if ("elevations".equals(key) && value instanceof Double) { elevation((Double)value); return; }
      if ("elevation".equals(key) && value instanceof String) { elevation((String)value); return; }
      if ("elevations".equals(key) && value instanceof String) { elevation((String)value); return; }
      if ("line".equals(key) && value instanceof String) { line((String)value); return; }
      if ("lines".equals(key) && value instanceof String) { line((String)value); return; }
      if ("polygon".equals(key) && value instanceof String) { polygon((String)value); return; }
      if ("polygons".equals(key) && value instanceof String) { polygon((String)value); return; }
      if ("postalCode".equals(key) && value instanceof String) { postalCode((String)value); return; }
      if ("postalCodes".equals(key) && value instanceof String) { postalCode((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
