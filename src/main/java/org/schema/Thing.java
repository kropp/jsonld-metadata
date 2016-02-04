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
 * The most generic type of item.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Thing {
  @JsonProperty("@type") public String getJsonLdType() {
    return getClass().getSimpleName();
  }
  @JsonProperty("@context") public String getJsonLdContext() {
    return "http://schema.org/";
  }
  @JsonAnyGetter
  public java.util.Map<String,Object> getData() { return myData; }
  protected Object getValue(String key) {
    final Object current = myData.get(key);
    if (current instanceof Collection) {
      return ((Collection) current).iterator().next();
    }
    return current;
  }
  /**
   * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
   */
  @JsonIgnore public String getAdditionalType() {
    return (String) getValue("additionalType");
  }
  /**
   * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
   */
  @JsonIgnore public Collection<String> getAdditionalTypes() {
    final Object current = myData.get("additionalType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An alias for the item.
   */
  @JsonIgnore public String getAlternateName() {
    return (String) getValue("alternateName");
  }
  /**
   * An alias for the item.
   */
  @JsonIgnore public Collection<String> getAlternateNames() {
    final Object current = myData.get("alternateName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A short description of the item.
   */
  @JsonIgnore public String getDescription() {
    return (String) getValue("description");
  }
  /**
   * A short description of the item.
   */
  @JsonIgnore public Collection<String> getDescriptions() {
    final Object current = myData.get("description");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
  @JsonIgnore public CreativeWork getMainEntityOfPageCreativeWork() {
    return (CreativeWork) getValue("mainEntityOfPage");
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
  @JsonIgnore public Collection<CreativeWork> getMainEntityOfPageCreativeWorks() {
    final Object current = myData.get("mainEntityOfPage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
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
  @JsonIgnore public String getMainEntityOfPageString() {
    return (String) getValue("mainEntityOfPage");
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
  @JsonIgnore public Collection<String> getMainEntityOfPageStrings() {
    final Object current = myData.get("mainEntityOfPage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The name of the item.
   */
  @JsonIgnore public String getName() {
    return (String) getValue("name");
  }
  /**
   * The name of the item.
   */
  @JsonIgnore public Collection<String> getNames() {
    final Object current = myData.get("name");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
   */
  @JsonIgnore public String getSameAs() {
    return (String) getValue("sameAs");
  }
  /**
   * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
   */
  @JsonIgnore public Collection<String> getSameAss() {
    final Object current = myData.get("sameAs");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * URL of the item.
   */
  @JsonIgnore public String getUrl() {
    return (String) getValue("url");
  }
  /**
   * URL of the item.
   */
  @JsonIgnore public Collection<String> getUrls() {
    final Object current = myData.get("url");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
   */
  @JsonIgnore public Action getPotentialAction() {
    return (Action) getValue("potentialAction");
  }
  /**
   * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
   */
  @JsonIgnore public Collection<Action> getPotentialActions() {
    final Object current = myData.get("potentialAction");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Action>) current;
    }
    return Arrays.asList((Action) current);
  }
  @JsonProperty("@id") public String getId() {
    return (String) getValue("id");
  }
  protected Thing(java.util.Map<String,Object> data) {
    myData = data;
  }
  @Override public int hashCode() {
    int result = 0;
    result = 31 * result + (myData != null ? myData.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Thing thing = (Thing) o;
    if (myData != null ? !myData.equals(thing.myData) : thing.myData != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link Thing}
   */
  public static class Builder implements ThingBuilder<Thing> {
    public void putValue(String key, Object value) {
      if (myData.containsKey(key)) {
        final Object current = myData.get(key);
        final Collection list;
        if (current instanceof Collection) {
          list = (Collection) current;
        } else {
          list = new ArrayList<Object>();
          list.add(current);
          myData.put(key, list);
        }
        list.add(value);
      } else {
        myData.put(key, value);
      }
    }
    public Thing build() {
      return new Thing(myData);
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
    public void fromMap(java.util.Map<String, Object> map) {
      for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
        final String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }
        fromMap(key, value);
      }
    }
    protected void fromMap(String key, Object value) {
      if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); return; }
      if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); return; }
      if ("description".equals(key) && value instanceof String) { description((String)value); return; }
      if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); return; }
      if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); return; }
      if ("name".equals(key) && value instanceof String) { name((String)value); return; }
      if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); return; }
      if ("url".equals(key) && value instanceof String) { url((String)value); return; }
      if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); return; }
      if ("@id".equals(key) && value instanceof String) { id((String)value); return; }
    }
    protected HashMap<String,Object> myData = new HashMap<String,Object>();
  }
  
  protected java.util.Map<String,Object> myData;
}
