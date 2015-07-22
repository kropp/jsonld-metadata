/*
 * Copyright 2015 JetBrains s.r.o.
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
 * Generated on Jul 22, 2015.
 */

package org.schema;

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
  public static final class Builder {
    /**
     * Creates new {@link Permit} instance.
     */
    public Permit build() {
      return new Permit(permitAudience, name, validUntil, mainEntityOfPage, validFor, validFrom, additionalType, url, sameAs, issuedThrough, alternateName, potentialAction, validIn, description, issuedBy);
    }
    /**
     * The target audience for this permit.
     */
    public Builder permitAudience(Audience audience) {
      this.permitAudience = audience;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * The date when the item is no longer valid.
     */
    public Builder validUntil(java.util.Date date) {
      this.validUntil = date;
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      this.mainEntityOfPage.setString(mainEntityOfPage);
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
    public Builder mainEntityOfPage(CreativeWork creativeWork) {
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * The time validity of the permit.
     */
    public Builder validFor(Duration duration) {
      this.validFor = duration;
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    public Builder validFrom(java.util.Date date) {
      this.validFrom = date;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * The service through with the permit was granted.
     */
    public Builder issuedThrough(Service service) {
      this.issuedThrough = service;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * The geographic area where the permit is valid.
     */
    public Builder validIn(AdministrativeArea administrativeArea) {
      this.validIn = administrativeArea;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    public Builder issuedBy(Organization organization) {
      this.issuedBy = organization;
      return this;
    }
    private Audience permitAudience;
    private String name;
    private java.util.Date validUntil;
    private StringOrCreativeWork mainEntityOfPage;
    private Duration validFor;
    private java.util.Date validFrom;
    private String additionalType;
    private String url;
    private String sameAs;
    private Service issuedThrough;
    private String alternateName;
    private Action potentialAction;
    private AdministrativeArea validIn;
    private String description;
    private Organization issuedBy;
  }

  protected Permit(Audience permitAudience, String name, java.util.Date validUntil, StringOrCreativeWork mainEntityOfPage, Duration validFor, java.util.Date validFrom, String additionalType, String url, String sameAs, Service issuedThrough, String alternateName, Action potentialAction, AdministrativeArea validIn, String description, Organization issuedBy) {
    super(additionalType, url, sameAs, alternateName, description, potentialAction, name, mainEntityOfPage);
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
