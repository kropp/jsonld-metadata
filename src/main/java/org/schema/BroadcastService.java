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
 * A delivery service through which content is provided via broadcast over the air or online.
 */
public class BroadcastService extends Thing {
  /**
   * The organization owning or operating the broadcast service.
   */
  public Organization getBroadcaster() {
    return myBroadcaster;
  }
  /**
   * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
   */
  public BroadcastService getParentService() {
    return myParentService;
  }
  /**
   * The media network(s) whose content is broadcast on this station.
   */
  public Organization getBroadcastAffiliateOf() {
    return myBroadcastAffiliateOf;
  }
  /**
   * The name displayed in the channel guide. For many US affiliates, it is the network name.
   */
  public String getBroadcastDisplayName() {
    return myBroadcastDisplayName;
  }
  /**
   * The timezone in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 format</a> for which the service bases its broadcasts.
   */
  public String getTimezone() {
    return myTimezone;
  }
  /**
   * Builder for {@link BroadcastService}
   */
  static final class BroadcastServiceThingBuilder implements Builder {
    /**
     * Creates new {@link BroadcastService} instance.
     */
    public BroadcastService build() {
      return new BroadcastService(broadcaster, parentService, broadcastAffiliateOf, broadcastDisplayName, timezone, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The organization owning or operating the broadcast service.
     */
    @NotNull public Builder broadcaster(@NotNull Organization organization) {
      this.broadcaster = organization;
      return this;
    }
    /**
     * The organization owning or operating the broadcast service.
     */
    @NotNull public Builder broadcaster(@NotNull Organization.Builder organization) {
      return this.broadcaster(organization.build());
    }
    /**
     * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
     */
    @NotNull public Builder parentService(@NotNull BroadcastService broadcastService) {
      this.parentService = broadcastService;
      return this;
    }
    /**
     * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
     */
    @NotNull public Builder parentService(@NotNull BroadcastService.Builder broadcastService) {
      return this.parentService(broadcastService.build());
    }
    /**
     * The media network(s) whose content is broadcast on this station.
     */
    @NotNull public Builder broadcastAffiliateOf(@NotNull Organization organization) {
      this.broadcastAffiliateOf = organization;
      return this;
    }
    /**
     * The media network(s) whose content is broadcast on this station.
     */
    @NotNull public Builder broadcastAffiliateOf(@NotNull Organization.Builder organization) {
      return this.broadcastAffiliateOf(organization.build());
    }
    /**
     * The name displayed in the channel guide. For many US affiliates, it is the network name.
     */
    @NotNull public Builder broadcastDisplayName(@NotNull String broadcastDisplayName) {
      this.broadcastDisplayName = broadcastDisplayName;
      return this;
    }
    /**
     * The timezone in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 format</a> for which the service bases its broadcasts.
     */
    @NotNull public Builder timezone(@NotNull String timezone) {
      this.timezone = timezone;
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
        if ("broadcaster".equals(key) && value instanceof Organization) { broadcaster((Organization)value); continue; }
        if ("parentService".equals(key) && value instanceof BroadcastService) { parentService((BroadcastService)value); continue; }
        if ("broadcastAffiliateOf".equals(key) && value instanceof Organization) { broadcastAffiliateOf((Organization)value); continue; }
        if ("broadcastDisplayName".equals(key) && value instanceof String) { broadcastDisplayName((String)value); continue; }
        if ("timezone".equals(key) && value instanceof String) { timezone((String)value); continue; }
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
    private Organization broadcaster;
    private BroadcastService parentService;
    private Organization broadcastAffiliateOf;
    private String broadcastDisplayName;
    private String timezone;
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
  public interface Builder extends ThingBuilder<BroadcastService> {
    @NotNull Builder broadcaster(@NotNull Organization organization);
    @NotNull Builder broadcaster(@NotNull Organization.Builder organization);
    @NotNull Builder parentService(@NotNull BroadcastService broadcastService);
    @NotNull Builder parentService(@NotNull BroadcastService.Builder broadcastService);
    @NotNull Builder broadcastAffiliateOf(@NotNull Organization organization);
    @NotNull Builder broadcastAffiliateOf(@NotNull Organization.Builder organization);
    @NotNull Builder broadcastDisplayName(@NotNull String broadcastDisplayName);
    @NotNull Builder timezone(@NotNull String timezone);
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

  protected BroadcastService(Organization broadcaster, BroadcastService parentService, Organization broadcastAffiliateOf, String broadcastDisplayName, String timezone, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myBroadcaster = broadcaster;
    myParentService = parentService;
    myBroadcastAffiliateOf = broadcastAffiliateOf;
    myBroadcastDisplayName = broadcastDisplayName;
    myTimezone = timezone;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myBroadcaster != null ? myBroadcaster.hashCode() : 0);
    result = 31 * result + (myParentService != null ? myParentService.hashCode() : 0);
    result = 31 * result + (myBroadcastAffiliateOf != null ? myBroadcastAffiliateOf.hashCode() : 0);
    result = 31 * result + (myBroadcastDisplayName != null ? myBroadcastDisplayName.hashCode() : 0);
    result = 31 * result + (myTimezone != null ? myTimezone.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BroadcastService broadcastService = (BroadcastService) o;
    if (!super.equals(o)) return false;
    if (myBroadcaster != null ? !myBroadcaster.equals(broadcastService.myBroadcaster) : broadcastService.myBroadcaster != null) return false;
    if (myParentService != null ? !myParentService.equals(broadcastService.myParentService) : broadcastService.myParentService != null) return false;
    if (myBroadcastAffiliateOf != null ? !myBroadcastAffiliateOf.equals(broadcastService.myBroadcastAffiliateOf) : broadcastService.myBroadcastAffiliateOf != null) return false;
    if (myBroadcastDisplayName != null ? !myBroadcastDisplayName.equals(broadcastService.myBroadcastDisplayName) : broadcastService.myBroadcastDisplayName != null) return false;
    if (myTimezone != null ? !myTimezone.equals(broadcastService.myTimezone) : broadcastService.myTimezone != null) return false;
    return true;
  }

  private Organization myBroadcaster;
  private BroadcastService myParentService;
  private Organization myBroadcastAffiliateOf;
  private String myBroadcastDisplayName;
  private String myTimezone;
}
