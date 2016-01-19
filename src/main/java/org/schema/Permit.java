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
 * A permit issued by an organization, e.g. a parking pass.
 */
public class Permit extends Intangible {
  /**
   * The service through with the permit was granted.
   */
  public Service getIssuedThrough() {
    return myIssuedThrough;
  }
  /**
   * The target audience for this permit.
   */
  public Audience getPermitAudience() {
    return myPermitAudience;
  }
  /**
   * The time validity of the permit.
   */
  public Duration getValidFor() {
    return myValidFor;
  }
  /**
   * The date when the item becomes valid.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getValidFrom() {
    return myValidFrom;
  }
  /**
   * The geographic area where the permit is valid.
   */
  public AdministrativeArea getValidIn() {
    return myValidIn;
  }
  /**
   * The date when the item is no longer valid.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getValidUntil() {
    return myValidUntil;
  }
  /**
   * The organization issuing the ticket or permit.
   */
  public Organization getIssuedBy() {
    return myIssuedBy;
  }
  /**
   * Builder for {@link Permit}
   */
  static final class PermitThingBuilder implements Builder {
    /**
     * Creates new {@link Permit} instance.
     */
    public Permit build() {
      return new Permit(issuedThrough, permitAudience, validFor, validFrom, validIn, validUntil, issuedBy, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The service through with the permit was granted.
     */
    @NotNull public Builder issuedThrough(@NotNull Service service) {
      this.issuedThrough = service;
      return this;
    }
    /**
     * The service through with the permit was granted.
     */
    @NotNull public Builder issuedThrough(@NotNull Service.Builder service) {
      return this.issuedThrough(service.build());
    }
    /**
     * The target audience for this permit.
     */
    @NotNull public Builder permitAudience(@NotNull Audience audience) {
      this.permitAudience = audience;
      return this;
    }
    /**
     * The target audience for this permit.
     */
    @NotNull public Builder permitAudience(@NotNull Audience.Builder audience) {
      return this.permitAudience(audience.build());
    }
    /**
     * The time validity of the permit.
     */
    @NotNull public Builder validFor(@NotNull Duration duration) {
      this.validFor = duration;
      return this;
    }
    /**
     * The time validity of the permit.
     */
    @NotNull public Builder validFor(@NotNull Duration.Builder duration) {
      return this.validFor(duration.build());
    }
    /**
     * The date when the item becomes valid.
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      this.validFrom = date;
      return this;
    }
    /**
     * The geographic area where the permit is valid.
     */
    @NotNull public Builder validIn(@NotNull AdministrativeArea administrativeArea) {
      this.validIn = administrativeArea;
      return this;
    }
    /**
     * The geographic area where the permit is valid.
     */
    @NotNull public Builder validIn(@NotNull AdministrativeArea.Builder administrativeArea) {
      return this.validIn(administrativeArea.build());
    }
    /**
     * The date when the item is no longer valid.
     */
    @NotNull public Builder validUntil(@NotNull java.util.Date date) {
      this.validUntil = date;
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    @NotNull public Builder issuedBy(@NotNull Organization organization) {
      this.issuedBy = organization;
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    @NotNull public Builder issuedBy(@NotNull Organization.Builder organization) {
      return this.issuedBy(organization.build());
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
        if ("issuedThrough".equals(key) && value instanceof Service) { issuedThrough((Service)value); continue; }
        if ("permitAudience".equals(key) && value instanceof Audience) { permitAudience((Audience)value); continue; }
        if ("validFor".equals(key) && value instanceof Duration) { validFor((Duration)value); continue; }
        if ("validFrom".equals(key) && value instanceof java.util.Date) { validFrom((java.util.Date)value); continue; }
        if ("validIn".equals(key) && value instanceof AdministrativeArea) { validIn((AdministrativeArea)value); continue; }
        if ("validUntil".equals(key) && value instanceof java.util.Date) { validUntil((java.util.Date)value); continue; }
        if ("issuedBy".equals(key) && value instanceof Organization) { issuedBy((Organization)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private Service issuedThrough;
    private Audience permitAudience;
    private Duration validFor;
    private java.util.Date validFrom;
    private AdministrativeArea validIn;
    private java.util.Date validUntil;
    private Organization issuedBy;
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
  public interface Builder extends ThingBuilder<Permit> {
    @NotNull Builder issuedThrough(@NotNull Service service);
    @NotNull Builder issuedThrough(@NotNull Service.Builder service);
    @NotNull Builder permitAudience(@NotNull Audience audience);
    @NotNull Builder permitAudience(@NotNull Audience.Builder audience);
    @NotNull Builder validFor(@NotNull Duration duration);
    @NotNull Builder validFor(@NotNull Duration.Builder duration);
    @NotNull Builder validFrom(@NotNull java.util.Date date);
    @NotNull Builder validIn(@NotNull AdministrativeArea administrativeArea);
    @NotNull Builder validIn(@NotNull AdministrativeArea.Builder administrativeArea);
    @NotNull Builder validUntil(@NotNull java.util.Date date);
    @NotNull Builder issuedBy(@NotNull Organization organization);
    @NotNull Builder issuedBy(@NotNull Organization.Builder organization);
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

  protected Permit(Service issuedThrough, Audience permitAudience, Duration validFor, java.util.Date validFrom, AdministrativeArea validIn, java.util.Date validUntil, Organization issuedBy, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myIssuedThrough = issuedThrough;
    myPermitAudience = permitAudience;
    myValidFor = validFor;
    myValidFrom = validFrom;
    myValidIn = validIn;
    myValidUntil = validUntil;
    myIssuedBy = issuedBy;
  }
  private Service myIssuedThrough;
  private Audience myPermitAudience;
  private Duration myValidFor;
  private java.util.Date myValidFrom;
  private AdministrativeArea myValidIn;
  private java.util.Date myValidUntil;
  private Organization myIssuedBy;
}
