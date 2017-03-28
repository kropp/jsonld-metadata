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
 * A structured value providing information about the opening hours of a place or a certain service inside a place.\n\n
 * The place is __open__ if the [[opens]] property is specified, and __closed__ otherwise.\n\nIf the value for the [[closes]] property is less than the value for the [[opens]] property then the hour range is assumed to span over the next day.
 *       Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class OpeningHoursSpecification extends StructuredValue {
  /**
   * The closing hour of the place or service on the given day(s) of the week.
   */
  @JsonIgnore public java.util.Date getCloses() {
    return (java.util.Date) getValue("closes");
  }
  /**
   * The closing hour of the place or service on the given day(s) of the week.
   */
  @JsonIgnore public Collection<java.util.Date> getClosess() {
    final Object current = myData.get("closes");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The day of the week for which these opening hours are valid.
   */
  @JsonIgnore public DayOfWeek getDayOfWeek() {
    return (DayOfWeek) getValue("dayOfWeek");
  }
  /**
   * The day of the week for which these opening hours are valid.
   */
  @JsonIgnore public Collection<DayOfWeek> getDayOfWeeks() {
    final Object current = myData.get("dayOfWeek");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DayOfWeek>) current;
    }
    return Arrays.asList((DayOfWeek) current);
  }
  /**
   * The opening hour of the place or service on the given day(s) of the week.
   */
  @JsonIgnore public java.util.Date getOpens() {
    return (java.util.Date) getValue("opens");
  }
  /**
   * The opening hour of the place or service on the given day(s) of the week.
   */
  @JsonIgnore public Collection<java.util.Date> getOpenss() {
    final Object current = myData.get("opens");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date when the item becomes valid.
   */
  @JsonIgnore public java.util.Date getValidFrom() {
    return (java.util.Date) getValue("validFrom");
  }
  /**
   * The date when the item becomes valid.
   */
  @JsonIgnore public Collection<java.util.Date> getValidFroms() {
    final Object current = myData.get("validFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  @JsonIgnore public java.util.Date getValidThrough() {
    return (java.util.Date) getValue("validThrough");
  }
  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
   */
  @JsonIgnore public Collection<java.util.Date> getValidThroughs() {
    final Object current = myData.get("validThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  protected OpeningHoursSpecification(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link OpeningHoursSpecification}
   */
  public static class Builder extends StructuredValue.Builder {
    @NotNull public OpeningHoursSpecification build() {
      return new OpeningHoursSpecification(myData);
    }
    /**
     * The closing hour of the place or service on the given day(s) of the week.
     */
    @NotNull public Builder closes(@NotNull java.util.Date date) {
      putValue("closes", date);
      return this;
    }
    /**
     * The day of the week for which these opening hours are valid.
     */
    @NotNull public Builder dayOfWeek(@NotNull DayOfWeek dayOfWeek) {
      putValue("dayOfWeek", dayOfWeek);
      return this;
    }
    /**
     * The opening hour of the place or service on the given day(s) of the week.
     */
    @NotNull public Builder opens(@NotNull java.util.Date date) {
      putValue("opens", date);
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      putValue("validFrom", date);
      return this;
    }
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      putValue("validThrough", date);
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
      if ("closes".equals(key) && value instanceof java.util.Date) { closes((java.util.Date)value); return; }
      if ("dayOfWeek".equals(key) && value instanceof DayOfWeek) { dayOfWeek((DayOfWeek)value); return; }
      if ("opens".equals(key) && value instanceof java.util.Date) { opens((java.util.Date)value); return; }
      if ("validFrom".equals(key) && value instanceof java.util.Date) { validFrom((java.util.Date)value); return; }
      if ("validThrough".equals(key) && value instanceof java.util.Date) { validThrough((java.util.Date)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
