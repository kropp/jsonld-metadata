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
 * A structured value providing information about when a certain organization or person owned a certain product.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class OwnershipInfo extends StructuredValue {
  /**
   * The organization or person from which the product was acquired.
   */
  public OrganizationOrPerson getAcquiredFrom() {
    return myAcquiredFrom;
  }
  /**
   * The date and time of obtaining the product.
   */
  public java.util.Date getOwnedFrom() {
    return myOwnedFrom;
  }
  /**
   * The date and time of giving up ownership on the product.
   */
  public java.util.Date getOwnedThrough() {
    return myOwnedThrough;
  }
  /**
   * The product that this structured value is referring to.
   */
  public Product getTypeOfGood() {
    return myTypeOfGood;
  }
  /**
   * Builder for {@link OwnershipInfo}
   */
  public static final class Builder {
    /**
     * Creates new {@link OwnershipInfo} instance.
     */
    public OwnershipInfo build() {
      return new OwnershipInfo(url, sameAs, additionalType, ownedThrough, alternateName, ownedFrom, potentialAction, description, name, typeOfGood, mainEntityOfPage, acquiredFrom);
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * The date and time of giving up ownership on the product.
     */
    public Builder ownedThrough(java.util.Date date) {
      this.ownedThrough = date;
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
     * The date and time of obtaining the product.
     */
    public Builder ownedFrom(java.util.Date date) {
      this.ownedFrom = date;
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
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
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
     * The product that this structured value is referring to.
     */
    public Builder typeOfGood(Product product) {
      this.typeOfGood = product;
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
     * The organization or person from which the product was acquired.
     */
    public Builder acquiredFrom(Organization organization) {
      this.acquiredFrom.setOrganization(organization);
      return this;
    }
    /**
     * The organization or person from which the product was acquired.
     */
    public Builder acquiredFrom(Person person) {
      this.acquiredFrom.setPerson(person);
      return this;
    }
    private String url;
    private String sameAs;
    private String additionalType;
    private java.util.Date ownedThrough;
    private String alternateName;
    private java.util.Date ownedFrom;
    private Action potentialAction;
    private String description;
    private String name;
    private Product typeOfGood;
    private StringOrCreativeWork mainEntityOfPage;
    private OrganizationOrPerson acquiredFrom;
  }

  protected OwnershipInfo(String url, String sameAs, String additionalType, java.util.Date ownedThrough, String alternateName, java.util.Date ownedFrom, Action potentialAction, String description, String name, Product typeOfGood, StringOrCreativeWork mainEntityOfPage, OrganizationOrPerson acquiredFrom) {
    super(sameAs, additionalType, url, alternateName, name, description, potentialAction, mainEntityOfPage);
    myAcquiredFrom = acquiredFrom;
    myOwnedFrom = ownedFrom;
    myOwnedThrough = ownedThrough;
    myTypeOfGood = typeOfGood;
  }
  private OrganizationOrPerson myAcquiredFrom;
  private java.util.Date myOwnedFrom;
  private java.util.Date myOwnedThrough;
  private Product myTypeOfGood;
}
