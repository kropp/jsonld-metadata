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
 * A delivery service through which content is provided via broadcast over the air or online.
 */
public class BroadcastService extends Thing {
  /**
   * The organization owning or operating the broadcast service.
   */
  @JsonIgnore public Organization getBroadcaster() {
    return (Organization) getValue("broadcaster");
  }
  /**
   * The organization owning or operating the broadcast service.
   */
  @JsonIgnore public Collection<Organization> getBroadcasters() {
    final Object current = myData.get("broadcaster");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
   */
  @JsonIgnore public BroadcastService getParentService() {
    return (BroadcastService) getValue("parentService");
  }
  /**
   * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
   */
  @JsonIgnore public Collection<BroadcastService> getParentServices() {
    final Object current = myData.get("parentService");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BroadcastService>) current;
    }
    return Arrays.asList((BroadcastService) current);
  }
  /**
   * The media network(s) whose content is broadcast on this station.
   */
  @JsonIgnore public Organization getBroadcastAffiliateOf() {
    return (Organization) getValue("broadcastAffiliateOf");
  }
  /**
   * The media network(s) whose content is broadcast on this station.
   */
  @JsonIgnore public Collection<Organization> getBroadcastAffiliateOfs() {
    final Object current = myData.get("broadcastAffiliateOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The name displayed in the channel guide. For many US affiliates, it is the network name.
   */
  @JsonIgnore public String getBroadcastDisplayName() {
    return (String) getValue("broadcastDisplayName");
  }
  /**
   * The name displayed in the channel guide. For many US affiliates, it is the network name.
   */
  @JsonIgnore public Collection<String> getBroadcastDisplayNames() {
    final Object current = myData.get("broadcastDisplayName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The timezone in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 format</a> for which the service bases its broadcasts.
   */
  @JsonIgnore public String getTimezone() {
    return (String) getValue("timezone");
  }
  /**
   * The timezone in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 format</a> for which the service bases its broadcasts.
   */
  @JsonIgnore public Collection<String> getTimezones() {
    final Object current = myData.get("timezone");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected BroadcastService(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link BroadcastService}
   */
  public static class Builder extends Thing.Builder {
    public BroadcastService build() {
      return new BroadcastService(myData);
    }
    /**
     * The organization owning or operating the broadcast service.
     */
    @NotNull public Builder broadcaster(@NotNull Organization organization) {
      putValue("broadcaster", organization);
      return this;
    }
    /**
     * The organization owning or operating the broadcast service.
     */
    @NotNull public Builder broadcaster(@NotNull Organization.Builder organization) {
      putValue("broadcaster", organization.build());
      return this;
    }
    /**
     * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
     */
    @NotNull public Builder parentService(@NotNull BroadcastService broadcastService) {
      putValue("parentService", broadcastService);
      return this;
    }
    /**
     * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
     */
    @NotNull public Builder parentService(@NotNull BroadcastService.Builder broadcastService) {
      putValue("parentService", broadcastService.build());
      return this;
    }
    /**
     * The media network(s) whose content is broadcast on this station.
     */
    @NotNull public Builder broadcastAffiliateOf(@NotNull Organization organization) {
      putValue("broadcastAffiliateOf", organization);
      return this;
    }
    /**
     * The media network(s) whose content is broadcast on this station.
     */
    @NotNull public Builder broadcastAffiliateOf(@NotNull Organization.Builder organization) {
      putValue("broadcastAffiliateOf", organization.build());
      return this;
    }
    /**
     * The name displayed in the channel guide. For many US affiliates, it is the network name.
     */
    @NotNull public Builder broadcastDisplayName(@NotNull String broadcastDisplayName) {
      putValue("broadcastDisplayName", broadcastDisplayName);
      return this;
    }
    /**
     * The timezone in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 format</a> for which the service bases its broadcasts.
     */
    @NotNull public Builder timezone(@NotNull String timezone) {
      putValue("timezone", timezone);
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
      if ("broadcaster".equals(key) && value instanceof Organization) { broadcaster((Organization)value); return; }
      if ("parentService".equals(key) && value instanceof BroadcastService) { parentService((BroadcastService)value); return; }
      if ("broadcastAffiliateOf".equals(key) && value instanceof Organization) { broadcastAffiliateOf((Organization)value); return; }
      if ("broadcastDisplayName".equals(key) && value instanceof String) { broadcastDisplayName((String)value); return; }
      if ("timezone".equals(key) && value instanceof String) { timezone((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
