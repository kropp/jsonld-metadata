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
 * The mailing address.
 */
public class PostalAddress extends ContactPoint {
  /**
   * The country. For example, USA. You can also provide the two-letter <a href='http://en.wikipedia.org/wiki/ISO_3166-1'>ISO 3166-1 alpha-2 country code</a>.
   */
  public Country getAddressCountry() {
    return myAddressCountry;
  }
  /**
   * The locality. For example, Mountain View.
   */
  public String getAddressLocality() {
    return myAddressLocality;
  }
  /**
   * The region. For example, CA.
   */
  public String getAddressRegion() {
    return myAddressRegion;
  }
  /**
   * The postal code. For example, 94043.
   */
  public String getPostalCode() {
    return myPostalCode;
  }
  /**
   * The post office box number for PO box addresses.
   */
  public String getPostOfficeBoxNumber() {
    return myPostOfficeBoxNumber;
  }
  /**
   * The street address. For example, 1600 Amphitheatre Pkwy.
   */
  public String getStreetAddress() {
    return myStreetAddress;
  }
  /**
   * Builder for {@link PostalAddress}
   */
  public static final class Builder {
    /**
     * Creates new {@link PostalAddress} instance.
     */
    public PostalAddress build() {
      return new PostalAddress(availableLanguage, email, addressCountry, addressLocality, streetAddress, areaServed, name, postOfficeBoxNumber, hoursAvailable, addressRegion, mainEntityOfPage, productSupported, postalCode, url, additionalType, sameAs, faxNumber, alternateName, telephone, description, potentialAction, contactType, contactOption);
    }
    /**
     * A language someone may use with the item.
     */
    public Builder availableLanguage(Language language) {
      this.availableLanguage = language;
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
     * The country. For example, USA. You can also provide the two-letter <a href='http://en.wikipedia.org/wiki/ISO_3166-1'>ISO 3166-1 alpha-2 country code</a>.
     */
    public Builder addressCountry(Country country) {
      this.addressCountry = country;
      return this;
    }
    /**
     * The locality. For example, Mountain View.
     */
    public Builder addressLocality(String addressLocality) {
      this.addressLocality = addressLocality;
      return this;
    }
    /**
     * The street address. For example, 1600 Amphitheatre Pkwy.
     */
    public Builder streetAddress(String streetAddress) {
      this.streetAddress = streetAddress;
      return this;
    }
    /**
     * The location served by this contact point (e.g., a phone number intended for Europeans vs. North Americans or only within the United States).
     */
    public Builder areaServed(AdministrativeArea administrativeArea) {
      this.areaServed = administrativeArea;
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
     * The post office box number for PO box addresses.
     */
    public Builder postOfficeBoxNumber(String postOfficeBoxNumber) {
      this.postOfficeBoxNumber = postOfficeBoxNumber;
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
     * The region. For example, CA.
     */
    public Builder addressRegion(String addressRegion) {
      this.addressRegion = addressRegion;
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
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     */
    public Builder productSupported(Product product) {
      this.productSupported.setProduct(product);
      return this;
    }
    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     */
    public Builder productSupported(String productSupported) {
      this.productSupported.setString(productSupported);
      return this;
    }
    /**
     * The postal code. For example, 94043.
     */
    public Builder postalCode(String postalCode) {
      this.postalCode = postalCode;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * The fax number.
     */
    public Builder faxNumber(String faxNumber) {
      this.faxNumber = faxNumber;
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
     * The telephone number.
     */
    public Builder telephone(String telephone) {
      this.telephone = telephone;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
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
     * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
     */
    public Builder contactOption(ContactPointOption contactPointOption) {
      this.contactOption = contactPointOption;
      return this;
    }
    private Language availableLanguage;
    private String email;
    private Country addressCountry;
    private String addressLocality;
    private String streetAddress;
    private AdministrativeArea areaServed;
    private String name;
    private String postOfficeBoxNumber;
    private OpeningHoursSpecification hoursAvailable;
    private String addressRegion;
    private StringOrCreativeWork mainEntityOfPage;
    private ProductOrString productSupported;
    private String postalCode;
    private String url;
    private String additionalType;
    private String sameAs;
    private String faxNumber;
    private String alternateName;
    private String telephone;
    private String description;
    private Action potentialAction;
    private String contactType;
    private ContactPointOption contactOption;
  }

  protected PostalAddress(Language availableLanguage, String email, Country addressCountry, String addressLocality, String streetAddress, AdministrativeArea areaServed, String name, String postOfficeBoxNumber, OpeningHoursSpecification hoursAvailable, String addressRegion, StringOrCreativeWork mainEntityOfPage, ProductOrString productSupported, String postalCode, String url, String additionalType, String sameAs, String faxNumber, String alternateName, String telephone, String description, Action potentialAction, String contactType, ContactPointOption contactOption) {
    super(availableLanguage, email, areaServed, name, hoursAvailable, mainEntityOfPage, productSupported, sameAs, additionalType, url, alternateName, faxNumber, telephone, potentialAction, description, contactType, contactOption);
    myAddressCountry = addressCountry;
    myAddressLocality = addressLocality;
    myAddressRegion = addressRegion;
    myPostalCode = postalCode;
    myPostOfficeBoxNumber = postOfficeBoxNumber;
    myStreetAddress = streetAddress;
  }
  private Country myAddressCountry;
  private String myAddressLocality;
  private String myAddressRegion;
  private String myPostalCode;
  private String myPostOfficeBoxNumber;
  private String myStreetAddress;
}
