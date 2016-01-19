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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getOwnedFrom() {
    return myOwnedFrom;
  }
  /**
   * The date and time of giving up ownership on the product.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
  static final class OwnershipInfoThingBuilder implements Builder {
    /**
     * Creates new {@link OwnershipInfo} instance.
     */
    public OwnershipInfo build() {
      return new OwnershipInfo(acquiredFrom, ownedFrom, ownedThrough, typeOfGood, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The organization or person from which the product was acquired.
     */
    @NotNull public Builder acquiredFrom(@NotNull Organization organization) {
      if (this.acquiredFrom == null) this.acquiredFrom = new OrganizationOrPerson();
      this.acquiredFrom.setOrganization(organization);
      return this;
    }
    /**
     * The organization or person from which the product was acquired.
     */
    @NotNull public Builder acquiredFrom(@NotNull Organization.Builder organization) {
      return this.acquiredFrom(organization.build());
    }
    /**
     * The organization or person from which the product was acquired.
     */
    @NotNull public Builder acquiredFrom(@NotNull Person person) {
      if (this.acquiredFrom == null) this.acquiredFrom = new OrganizationOrPerson();
      this.acquiredFrom.setPerson(person);
      return this;
    }
    /**
     * The organization or person from which the product was acquired.
     */
    @NotNull public Builder acquiredFrom(@NotNull Person.Builder person) {
      return this.acquiredFrom(person.build());
    }
    /**
     * The date and time of obtaining the product.
     */
    @NotNull public Builder ownedFrom(@NotNull java.util.Date date) {
      this.ownedFrom = date;
      return this;
    }
    /**
     * The date and time of giving up ownership on the product.
     */
    @NotNull public Builder ownedThrough(@NotNull java.util.Date date) {
      this.ownedThrough = date;
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Product product) {
      this.typeOfGood = product;
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Product.Builder product) {
      return this.typeOfGood(product.build());
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
        if ("acquiredFrom".equals(key) && value instanceof Organization) { acquiredFrom((Organization)value); continue; }
        if ("acquiredFrom".equals(key) && value instanceof Person) { acquiredFrom((Person)value); continue; }
        if ("ownedFrom".equals(key) && value instanceof java.util.Date) { ownedFrom((java.util.Date)value); continue; }
        if ("ownedThrough".equals(key) && value instanceof java.util.Date) { ownedThrough((java.util.Date)value); continue; }
        if ("typeOfGood".equals(key) && value instanceof Product) { typeOfGood((Product)value); continue; }
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
    private OrganizationOrPerson acquiredFrom;
    private java.util.Date ownedFrom;
    private java.util.Date ownedThrough;
    private Product typeOfGood;
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
  public interface Builder extends ThingBuilder<OwnershipInfo> {
    @NotNull Builder acquiredFrom(@NotNull Organization organization);
    @NotNull Builder acquiredFrom(@NotNull Organization.Builder organization);
    @NotNull Builder acquiredFrom(@NotNull Person person);
    @NotNull Builder acquiredFrom(@NotNull Person.Builder person);
    @NotNull Builder ownedFrom(@NotNull java.util.Date date);
    @NotNull Builder ownedThrough(@NotNull java.util.Date date);
    @NotNull Builder typeOfGood(@NotNull Product product);
    @NotNull Builder typeOfGood(@NotNull Product.Builder product);
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

  protected OwnershipInfo(OrganizationOrPerson acquiredFrom, java.util.Date ownedFrom, java.util.Date ownedThrough, Product typeOfGood, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myAcquiredFrom = acquiredFrom;
    myOwnedFrom = ownedFrom;
    myOwnedThrough = ownedThrough;
    myTypeOfGood = typeOfGood;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myAcquiredFrom != null ? myAcquiredFrom.hashCode() : 0);
    result = 31 * result + (myOwnedFrom != null ? myOwnedFrom.hashCode() : 0);
    result = 31 * result + (myOwnedThrough != null ? myOwnedThrough.hashCode() : 0);
    result = 31 * result + (myTypeOfGood != null ? myTypeOfGood.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OwnershipInfo ownershipInfo = (OwnershipInfo) o;
    if (!super.equals(o)) return false;
    if (myAcquiredFrom != null ? !myAcquiredFrom.equals(ownershipInfo.myAcquiredFrom) : ownershipInfo.myAcquiredFrom != null) return false;
    if (myOwnedFrom != null ? !myOwnedFrom.equals(ownershipInfo.myOwnedFrom) : ownershipInfo.myOwnedFrom != null) return false;
    if (myOwnedThrough != null ? !myOwnedThrough.equals(ownershipInfo.myOwnedThrough) : ownershipInfo.myOwnedThrough != null) return false;
    if (myTypeOfGood != null ? !myTypeOfGood.equals(ownershipInfo.myTypeOfGood) : ownershipInfo.myTypeOfGood != null) return false;
    return true;
  }

  private OrganizationOrPerson myAcquiredFrom;
  private java.util.Date myOwnedFrom;
  private java.util.Date myOwnedThrough;
  private Product myTypeOfGood;
}
