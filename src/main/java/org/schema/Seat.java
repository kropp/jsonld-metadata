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
 * Used to describe a seat, such as a reserved seat in an event reservation.
 */
public class Seat extends Intangible {
  /**
   * The location of the reserved seat (e.g., 27).
   */
  @JsonIgnore public String getSeatNumber() {
    return (String) getValue("seatNumber");
  }
  /**
   * The location of the reserved seat (e.g., 27).
   */
  @JsonIgnore public Collection<String> getSeatNumbers() {
    final Object current = myData.get("seatNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The row location of the reserved seat (e.g., B).
   */
  @JsonIgnore public String getSeatRow() {
    return (String) getValue("seatRow");
  }
  /**
   * The row location of the reserved seat (e.g., B).
   */
  @JsonIgnore public Collection<String> getSeatRows() {
    final Object current = myData.get("seatRow");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The section location of the reserved seat (e.g. Orchestra).
   */
  @JsonIgnore public String getSeatSection() {
    return (String) getValue("seatSection");
  }
  /**
   * The section location of the reserved seat (e.g. Orchestra).
   */
  @JsonIgnore public Collection<String> getSeatSections() {
    final Object current = myData.get("seatSection");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The type/class of the seat.
   */
  @JsonIgnore public QualitativeValue getSeatingTypeQualitativeValue() {
    return (QualitativeValue) getValue("seatingType");
  }
  /**
   * The type/class of the seat.
   */
  @JsonIgnore public Collection<QualitativeValue> getSeatingTypeQualitativeValues() {
    final Object current = myData.get("seatingType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * The type/class of the seat.
   */
  @JsonIgnore public String getSeatingTypeString() {
    return (String) getValue("seatingType");
  }
  /**
   * The type/class of the seat.
   */
  @JsonIgnore public Collection<String> getSeatingTypeStrings() {
    final Object current = myData.get("seatingType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Seat(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Seat}
   */
  public static class Builder extends Intangible.Builder {
    @NotNull public Seat build() {
      return new Seat(myData);
    }
    /**
     * The location of the reserved seat (e.g., 27).
     */
    @NotNull public Builder seatNumber(@NotNull String seatNumber) {
      putValue("seatNumber", seatNumber);
      return this;
    }
    /**
     * The row location of the reserved seat (e.g., B).
     */
    @NotNull public Builder seatRow(@NotNull String seatRow) {
      putValue("seatRow", seatRow);
      return this;
    }
    /**
     * The section location of the reserved seat (e.g. Orchestra).
     */
    @NotNull public Builder seatSection(@NotNull String seatSection) {
      putValue("seatSection", seatSection);
      return this;
    }
    /**
     * The type/class of the seat.
     */
    @NotNull public Builder seatingType(@NotNull QualitativeValue qualitativeValue) {
      putValue("seatingType", qualitativeValue);
      return this;
    }
    /**
     * The type/class of the seat.
     */
    @NotNull public Builder seatingType(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("seatingType", qualitativeValue.build());
      return this;
    }
    /**
     * The type/class of the seat.
     */
    @NotNull public Builder seatingType(@NotNull String seatingType) {
      putValue("seatingType", seatingType);
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
      if ("seatNumber".equals(key) && value instanceof String) { seatNumber((String)value); return; }
      if ("seatRow".equals(key) && value instanceof String) { seatRow((String)value); return; }
      if ("seatSection".equals(key) && value instanceof String) { seatSection((String)value); return; }
      if ("seatingType".equals(key) && value instanceof QualitativeValue) { seatingType((QualitativeValue)value); return; }
      if ("seatingType".equals(key) && value instanceof String) { seatingType((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
