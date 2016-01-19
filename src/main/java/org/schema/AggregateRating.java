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
 * The average rating based on multiple ratings or reviews.
 */
public class AggregateRating extends Rating {
  /**
   * The item that is being reviewed/rated.
   */
  public Thing getItemReviewed() {
    return myItemReviewed;
  }
  /**
   * The count of total number of ratings.
   */
  public Integer getRatingCount() {
    return myRatingCount;
  }
  /**
   * The count of total number of reviews.
   */
  public Integer getReviewCount() {
    return myReviewCount;
  }
  /**
   * Builder for {@link AggregateRating}
   */
  static final class AggregateRatingThingBuilder implements Builder {
    /**
     * Creates new {@link AggregateRating} instance.
     */
    public AggregateRating build() {
      return new AggregateRating(itemReviewed, ratingCount, reviewCount, bestRating, ratingValue, worstRating, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The item that is being reviewed/rated.
     */
    @NotNull public Builder itemReviewed(@NotNull Thing thing) {
      this.itemReviewed = thing;
      return this;
    }
    /**
     * The item that is being reviewed/rated.
     */
    @NotNull public Builder itemReviewed(@NotNull Thing.Builder thing) {
      return this.itemReviewed(thing.build());
    }
    /**
     * The count of total number of ratings.
     */
    @NotNull public Builder ratingCount(@NotNull Integer integer) {
      this.ratingCount = integer;
      return this;
    }
    /**
     * The count of total number of reviews.
     */
    @NotNull public Builder reviewCount(@NotNull Integer integer) {
      this.reviewCount = integer;
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Integer integer) {
      if (this.bestRating == null) this.bestRating = new Number();
      this.bestRating.setInteger(integer);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Long bestRating) {
      if (this.bestRating == null) this.bestRating = new Number();
      this.bestRating.setLong(bestRating);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Float bestRating) {
      if (this.bestRating == null) this.bestRating = new Number();
      this.bestRating.setFloat(bestRating);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull Double bestRating) {
      if (this.bestRating == null) this.bestRating = new Number();
      this.bestRating.setDouble(bestRating);
      return this;
    }
    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @NotNull public Builder bestRating(@NotNull String bestRating) {
      if (this.bestRating == null) this.bestRating = new Number();
      this.bestRating.setString(bestRating);
      return this;
    }
    /**
     * The rating for the content.
     */
    @NotNull public Builder ratingValue(@NotNull String ratingValue) {
      this.ratingValue = ratingValue;
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull Integer integer) {
      if (this.worstRating == null) this.worstRating = new Number();
      this.worstRating.setInteger(integer);
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull Long worstRating) {
      if (this.worstRating == null) this.worstRating = new Number();
      this.worstRating.setLong(worstRating);
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull Float worstRating) {
      if (this.worstRating == null) this.worstRating = new Number();
      this.worstRating.setFloat(worstRating);
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull Double worstRating) {
      if (this.worstRating == null) this.worstRating = new Number();
      this.worstRating.setDouble(worstRating);
      return this;
    }
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @NotNull public Builder worstRating(@NotNull String worstRating) {
      if (this.worstRating == null) this.worstRating = new Number();
      this.worstRating.setString(worstRating);
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
        if ("itemReviewed".equals(key) && value instanceof Thing) { itemReviewed((Thing)value); continue; }
        if ("ratingCount".equals(key) && value instanceof Integer) { ratingCount((Integer)value); continue; }
        if ("reviewCount".equals(key) && value instanceof Integer) { reviewCount((Integer)value); continue; }
        if ("bestRating".equals(key) && value instanceof Integer) { bestRating((Integer)value); continue; }
        if ("bestRating".equals(key) && value instanceof Long) { bestRating((Long)value); continue; }
        if ("bestRating".equals(key) && value instanceof Float) { bestRating((Float)value); continue; }
        if ("bestRating".equals(key) && value instanceof Double) { bestRating((Double)value); continue; }
        if ("bestRating".equals(key) && value instanceof String) { bestRating((String)value); continue; }
        if ("ratingValue".equals(key) && value instanceof String) { ratingValue((String)value); continue; }
        if ("worstRating".equals(key) && value instanceof Integer) { worstRating((Integer)value); continue; }
        if ("worstRating".equals(key) && value instanceof Long) { worstRating((Long)value); continue; }
        if ("worstRating".equals(key) && value instanceof Float) { worstRating((Float)value); continue; }
        if ("worstRating".equals(key) && value instanceof Double) { worstRating((Double)value); continue; }
        if ("worstRating".equals(key) && value instanceof String) { worstRating((String)value); continue; }
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
    private Thing itemReviewed;
    private Integer ratingCount;
    private Integer reviewCount;
    private Number bestRating;
    private String ratingValue;
    private Number worstRating;
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
  public interface Builder extends ThingBuilder<AggregateRating> {
    @NotNull Builder itemReviewed(@NotNull Thing thing);
    @NotNull Builder itemReviewed(@NotNull Thing.Builder thing);
    @NotNull Builder ratingCount(@NotNull Integer integer);
    @NotNull Builder reviewCount(@NotNull Integer integer);
    @NotNull Builder bestRating(@NotNull Integer integer);
    @NotNull Builder bestRating(@NotNull Long bestRating);
    @NotNull Builder bestRating(@NotNull Float bestRating);
    @NotNull Builder bestRating(@NotNull Double bestRating);
    @NotNull Builder bestRating(@NotNull String bestRating);
    @NotNull Builder ratingValue(@NotNull String ratingValue);
    @NotNull Builder worstRating(@NotNull Integer integer);
    @NotNull Builder worstRating(@NotNull Long worstRating);
    @NotNull Builder worstRating(@NotNull Float worstRating);
    @NotNull Builder worstRating(@NotNull Double worstRating);
    @NotNull Builder worstRating(@NotNull String worstRating);
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

  protected AggregateRating(Thing itemReviewed, Integer ratingCount, Integer reviewCount, Number bestRating, String ratingValue, Number worstRating, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(bestRating, ratingValue, worstRating, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myItemReviewed = itemReviewed;
    myRatingCount = ratingCount;
    myReviewCount = reviewCount;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myItemReviewed != null ? myItemReviewed.hashCode() : 0);
    result = 31 * result + (myRatingCount != null ? myRatingCount.hashCode() : 0);
    result = 31 * result + (myReviewCount != null ? myReviewCount.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AggregateRating aggregateRating = (AggregateRating) o;
    if (!super.equals(o)) return false;
    if (myItemReviewed != null ? !myItemReviewed.equals(aggregateRating.myItemReviewed) : aggregateRating.myItemReviewed != null) return false;
    if (myRatingCount != null ? !myRatingCount.equals(aggregateRating.myRatingCount) : aggregateRating.myRatingCount != null) return false;
    if (myReviewCount != null ? !myReviewCount.equals(aggregateRating.myReviewCount) : aggregateRating.myReviewCount != null) return false;
    return true;
  }

  private Thing myItemReviewed;
  private Integer myRatingCount;
  private Integer myReviewCount;
}
