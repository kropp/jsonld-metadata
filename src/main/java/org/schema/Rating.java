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
 * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
 */
public class Rating extends Intangible {
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Organization getAuthorOrganization() {
    return (Organization) getValue("author");
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Collection<Organization> getAuthorOrganizations() {
    final Object current = myData.get("author");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Person getAuthorPerson() {
    return (Person) getValue("author");
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Collection<Person> getAuthorPersons() {
    final Object current = myData.get("author");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Integer getBestRatingInteger() {
    return (Integer) getValue("bestRating");
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Collection<Integer> getBestRatingIntegers() {
    final Object current = myData.get("bestRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Long getBestRatingLong() {
    return (Long) getValue("bestRating");
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Collection<Long> getBestRatingLongs() {
    final Object current = myData.get("bestRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Float getBestRatingFloat() {
    return (Float) getValue("bestRating");
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Collection<Float> getBestRatingFloats() {
    final Object current = myData.get("bestRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Double getBestRatingDouble() {
    return (Double) getValue("bestRating");
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Collection<Double> getBestRatingDoubles() {
    final Object current = myData.get("bestRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public String getBestRatingString() {
    return (String) getValue("bestRating");
  }
  /**
   * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
   */
  @JsonIgnore public Collection<String> getBestRatingStrings() {
    final Object current = myData.get("bestRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The rating for the content.
   */
  @JsonIgnore public Number getRatingValueNumber() {
    return (Number) getValue("ratingValue");
  }
  /**
   * The rating for the content.
   */
  @JsonIgnore public Collection<Number> getRatingValueNumbers() {
    final Object current = myData.get("ratingValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The rating for the content.
   */
  @JsonIgnore public String getRatingValueString() {
    return (String) getValue("ratingValue");
  }
  /**
   * The rating for the content.
   */
  @JsonIgnore public Collection<String> getRatingValueStrings() {
    final Object current = myData.get("ratingValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public Integer getWorstRatingInteger() {
    return (Integer) getValue("worstRating");
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public Collection<Integer> getWorstRatingIntegers() {
    final Object current = myData.get("worstRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public Long getWorstRatingLong() {
    return (Long) getValue("worstRating");
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public Collection<Long> getWorstRatingLongs() {
    final Object current = myData.get("worstRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public Float getWorstRatingFloat() {
    return (Float) getValue("worstRating");
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public Collection<Float> getWorstRatingFloats() {
    final Object current = myData.get("worstRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public Double getWorstRatingDouble() {
    return (Double) getValue("worstRating");
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public Collection<Double> getWorstRatingDoubles() {
    final Object current = myData.get("worstRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public String getWorstRatingString() {
    return (String) getValue("worstRating");
  }
  /**
   * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
   */
  @JsonIgnore public Collection<String> getWorstRatingStrings() {
    final Object current = myData.get("worstRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Rating(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Rating}
   */
  public static class Builder extends Intangible.Builder {
    @NotNull public Rating build() {
      return new Rating(myData);
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Organization organization) {
      putValue("author", organization);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Organization.Builder organization) {
      putValue("author", organization.build());
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Person person) {
      putValue("author", person);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Person.Builder person) {
      putValue("author", person.build());
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Integer integer) {
      putValue("bestRating", integer);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Long bestRating) {
      putValue("bestRating", bestRating);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Float bestRating) {
      putValue("bestRating", bestRating);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Double bestRating) {
      putValue("bestRating", bestRating);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull String bestRating) {
      putValue("bestRating", bestRating);
      return this;
    }
    /**
     * The rating for the content.
     */
    @NotNull public Builder ratingValue(@NotNull Number number) {
      putValue("ratingValue", number);
      return this;
    }
    /**
     * The rating for the content.
     */
    @NotNull public Builder ratingValue(@NotNull String ratingValue) {
      putValue("ratingValue", ratingValue);
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull Integer integer) {
      putValue("worstRating", integer);
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull Long worstRating) {
      putValue("worstRating", worstRating);
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull Float worstRating) {
      putValue("worstRating", worstRating);
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull Double worstRating) {
      putValue("worstRating", worstRating);
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull String worstRating) {
      putValue("worstRating", worstRating);
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
      if ("author".equals(key) && value instanceof Organization) { author((Organization)value); return; }
      if ("authors".equals(key) && value instanceof Organization) { author((Organization)value); return; }
      if ("author".equals(key) && value instanceof Person) { author((Person)value); return; }
      if ("authors".equals(key) && value instanceof Person) { author((Person)value); return; }
      if ("bestRating".equals(key) && value instanceof Integer) { bestRating((Integer)value); return; }
      if ("bestRatings".equals(key) && value instanceof Integer) { bestRating((Integer)value); return; }
      if ("bestRating".equals(key) && value instanceof Long) { bestRating((Long)value); return; }
      if ("bestRatings".equals(key) && value instanceof Long) { bestRating((Long)value); return; }
      if ("bestRating".equals(key) && value instanceof Float) { bestRating((Float)value); return; }
      if ("bestRatings".equals(key) && value instanceof Float) { bestRating((Float)value); return; }
      if ("bestRating".equals(key) && value instanceof Double) { bestRating((Double)value); return; }
      if ("bestRatings".equals(key) && value instanceof Double) { bestRating((Double)value); return; }
      if ("bestRating".equals(key) && value instanceof String) { bestRating((String)value); return; }
      if ("bestRatings".equals(key) && value instanceof String) { bestRating((String)value); return; }
      if ("ratingValue".equals(key) && value instanceof Number) { ratingValue((Number)value); return; }
      if ("ratingValues".equals(key) && value instanceof Number) { ratingValue((Number)value); return; }
      if ("ratingValue".equals(key) && value instanceof String) { ratingValue((String)value); return; }
      if ("ratingValues".equals(key) && value instanceof String) { ratingValue((String)value); return; }
      if ("worstRating".equals(key) && value instanceof Integer) { worstRating((Integer)value); return; }
      if ("worstRatings".equals(key) && value instanceof Integer) { worstRating((Integer)value); return; }
      if ("worstRating".equals(key) && value instanceof Long) { worstRating((Long)value); return; }
      if ("worstRatings".equals(key) && value instanceof Long) { worstRating((Long)value); return; }
      if ("worstRating".equals(key) && value instanceof Float) { worstRating((Float)value); return; }
      if ("worstRatings".equals(key) && value instanceof Float) { worstRating((Float)value); return; }
      if ("worstRating".equals(key) && value instanceof Double) { worstRating((Double)value); return; }
      if ("worstRatings".equals(key) && value instanceof Double) { worstRating((Double)value); return; }
      if ("worstRating".equals(key) && value instanceof String) { worstRating((String)value); return; }
      if ("worstRatings".equals(key) && value instanceof String) { worstRating((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
