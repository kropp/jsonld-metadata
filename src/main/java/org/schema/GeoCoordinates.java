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
 * The geographic coordinates of a place or event.
 */
public class GeoCoordinates extends StructuredValue {
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
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Integer getLatitudeInteger() {
    return (Integer) getValue("latitude");
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Long getLatitudeLong() {
    return (Long) getValue("latitude");
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Float getLatitudeFloat() {
    return (Float) getValue("latitude");
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Double getLatitudeDouble() {
    return (Double) getValue("latitude");
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public String getLatitudeString() {
    return (String) getValue("latitude");
  }
  /**
   * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Integer getLongitudeInteger() {
    return (Integer) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Long getLongitudeLong() {
    return (Long) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Float getLongitudeFloat() {
    return (Float) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Double getLongitudeDouble() {
    return (Double) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
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
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public String getLongitudeString() {
    return (String) getValue("longitude");
  }
  /**
   * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
   */
  @JsonIgnore public Collection<String> getLongitudeStrings() {
    final Object current = myData.get("longitude");
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
  protected GeoCoordinates(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link GeoCoordinates}
   */
  public static class Builder extends StructuredValue.Builder {
    @NotNull public GeoCoordinates build() {
      return new GeoCoordinates(myData);
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
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder latitude(@NotNull Integer integer) {
      putValue("latitude", integer);
      return this;
    }
    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder latitude(@NotNull Long latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder latitude(@NotNull Float latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder latitude(@NotNull Double latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder latitude(@NotNull String latitude) {
      putValue("latitude", latitude);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder longitude(@NotNull Integer integer) {
      putValue("longitude", integer);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder longitude(@NotNull Long longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder longitude(@NotNull Float longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder longitude(@NotNull Double longitude) {
      putValue("longitude", longitude);
      return this;
    }
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     */
    @NotNull public Builder longitude(@NotNull String longitude) {
      putValue("longitude", longitude);
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
      putValue("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("address".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); return; }
      if ("address".equals(key) && value instanceof String) { address((String)value); return; }
      if ("addressCountry".equals(key) && value instanceof Country) { addressCountry((Country)value); return; }
      if ("addressCountry".equals(key) && value instanceof String) { addressCountry((String)value); return; }
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
      if ("postalCode".equals(key) && value instanceof String) { postalCode((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
