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
 * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
 */
public class Rating extends Intangible {
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
  @JsonIgnore public String getRatingValue() {
    return (String) getValue("ratingValue");
  }
  /**
   * The rating for the content.
   */
  @JsonIgnore public Collection<String> getRatingValues() {
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
    public Rating build() {
      return new Rating(myData);
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
      if ("bestRating".equals(key) && value instanceof Integer) { bestRating((Integer)value); return; }
      if ("bestRating".equals(key) && value instanceof Long) { bestRating((Long)value); return; }
      if ("bestRating".equals(key) && value instanceof Float) { bestRating((Float)value); return; }
      if ("bestRating".equals(key) && value instanceof Double) { bestRating((Double)value); return; }
      if ("bestRating".equals(key) && value instanceof String) { bestRating((String)value); return; }
      if ("ratingValue".equals(key) && value instanceof String) { ratingValue((String)value); return; }
      if ("worstRating".equals(key) && value instanceof Integer) { worstRating((Integer)value); return; }
      if ("worstRating".equals(key) && value instanceof Long) { worstRating((Long)value); return; }
      if ("worstRating".equals(key) && value instanceof Float) { worstRating((Float)value); return; }
      if ("worstRating".equals(key) && value instanceof Double) { worstRating((Double)value); return; }
      if ("worstRating".equals(key) && value instanceof String) { worstRating((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
