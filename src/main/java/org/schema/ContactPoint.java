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
 */

package org.schema;

/**
 * A contact point&#x2014;for example, a Customer Complaints department.
 */
public class ContactPoint extends StructuredValue {
  /**
   * The location served by this contact point (e.g., a phone number intended for Europeans vs. North Americans or only within the United States).
   */
  public AdministrativeArea getAreaServed() {
    return myAreaServed;
  }
  /**
   * A language someone may use with the item.
   */
  public Language getAvailableLanguage() {
    return myAvailableLanguage;
  }
  /**
   * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
   */
  public ContactPointOption getContactOption() {
    return myContactOption;
  }
  /**
   * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
   */
  public String getContactType() {
    return myContactType;
  }
  /**
   * Email address.
   */
  public String getEmail() {
    return myEmail;
  }
  /**
   * The fax number.
   */
  public String getFaxNumber() {
    return myFaxNumber;
  }
  /**
   * The hours during which this contact point is available.
   */
  public OpeningHoursSpecification getHoursAvailable() {
    return myHoursAvailable;
  }
  /**
   * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
   */
  public ProductOrString getProductSupported() {
    return myProductSupported;
  }
  /**
   * The telephone number.
   */
  public String getTelephone() {
    return myTelephone;
  }
  /**
   * Builder for {@link ContactPoint}
   */
  public static final class Builder {
    /**
     * Creates new {@link ContactPoint} instance.
     */
    public ContactPoint build() {
      return new ContactPoint(areaServed, availableLanguage, contactOption, contactType, email, faxNumber, hoursAvailable, productSupported, telephone, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
    }
    /**
     * The location served by this contact point (e.g., a phone number intended for Europeans vs. North Americans or only within the United States).
     */
    public Builder areaServed(AdministrativeArea administrativeArea) {
      this.areaServed = administrativeArea;
      return this;
    }
    /**
     * A language someone may use with the item.
     */
    public Builder availableLanguage(Language language) {
      this.availableLanguage = language;
      return this;
    }
    /**
     * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
     */
    public Builder contactOption(ContactPointOption contactPointOption) {
      this.contactOption = contactPointOption;
      return this;
    }
    /**
     * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
     */
    public Builder contactType(String contactType) {
      this.contactType = contactType;
      return this;
    }
    /**
     * Email address.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }
    /**
     * The fax number.
     */
    public Builder faxNumber(String faxNumber) {
      this.faxNumber = faxNumber;
      return this;
    }
    /**
     * The hours during which this contact point is available.
     */
    public Builder hoursAvailable(OpeningHoursSpecification openingHoursSpecification) {
      this.hoursAvailable = openingHoursSpecification;
      return this;
    }
    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     */
    public Builder productSupported(Product product) {
      if(this.productSupported == null) this.productSupported = new ProductOrString();
      this.productSupported.setProduct(product);
      return this;
    }
    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     */
    public Builder productSupported(String productSupported) {
      if(this.productSupported == null) this.productSupported = new ProductOrString();
      this.productSupported.setString(productSupported);
      return this;
    }
    /**
     * The telephone number.
     */
    public Builder telephone(String telephone) {
      this.telephone = telephone;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
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
      if(this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      if(this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    private AdministrativeArea areaServed;
    private Language availableLanguage;
    private ContactPointOption contactOption;
    private String contactType;
    private String email;
    private String faxNumber;
    private OpeningHoursSpecification hoursAvailable;
    private ProductOrString productSupported;
    private String telephone;
    private String additionalType;
    private String alternateName;
    private String description;
    private CreativeWorkOrString mainEntityOfPage;
    private String name;
    private String sameAs;
    private String url;
    private Action potentialAction;
  }

  protected ContactPoint(AdministrativeArea areaServed, Language availableLanguage, ContactPointOption contactOption, String contactType, String email, String faxNumber, OpeningHoursSpecification hoursAvailable, ProductOrString productSupported, String telephone, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
    myAreaServed = areaServed;
    myAvailableLanguage = availableLanguage;
    myContactOption = contactOption;
    myContactType = contactType;
    myEmail = email;
    myFaxNumber = faxNumber;
    myHoursAvailable = hoursAvailable;
    myProductSupported = productSupported;
    myTelephone = telephone;
  }
  private AdministrativeArea myAreaServed;
  private Language myAvailableLanguage;
  private ContactPointOption myContactOption;
  private String myContactType;
  private String myEmail;
  private String myFaxNumber;
  private OpeningHoursSpecification myHoursAvailable;
  private ProductOrString myProductSupported;
  private String myTelephone;
}
