/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

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
   * Builder for {@see PostalAddress}
   */
  public static final class Builder {
    public PostalAddress build() {
      return new PostalAddress(addressLocality, email, faxNumber, productSupported, mainEntityOfPage, contactOption, availableLanguage, telephone, addressCountry, potentialAction, alternateName, postalCode, contactType, postOfficeBoxNumber, url, additionalType, sameAs, hoursAvailable, streetAddress, addressRegion, image, name, description, areaServed);
    }
    /**
     * The locality. For example, Mountain View.
     */
    public Builder addressLocality(String value) {
      addressLocality = value;
      return this;
    }
    /**
     * Email address.
     */
    public Builder email(String value) {
      email = value;
      return this;
    }
    /**
     * The fax number.
     */
    public Builder faxNumber(String value) {
      faxNumber = value;
      return this;
    }
    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     */
    public Builder productSupported(Product value) {
      productSupported = value;
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
    public Builder mainEntityOfPage(CreativeWork value) {
      mainEntityOfPage = value;
      return this;
    }
    /**
     * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
     */
    public Builder contactOption(ContactPointOption value) {
      contactOption = value;
      return this;
    }
    /**
     * A language someone may use with the item.
     */
    public Builder availableLanguage(Language value) {
      availableLanguage = value;
      return this;
    }
    /**
     * The telephone number.
     */
    public Builder telephone(String value) {
      telephone = value;
      return this;
    }
    /**
     * The country. For example, USA. You can also provide the two-letter <a href='http://en.wikipedia.org/wiki/ISO_3166-1'>ISO 3166-1 alpha-2 country code</a>.
     */
    public Builder addressCountry(Country value) {
      addressCountry = value;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
      return this;
    }
    /**
     * The postal code. For example, 94043.
     */
    public Builder postalCode(String value) {
      postalCode = value;
      return this;
    }
    /**
     * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
     */
    public Builder contactType(String value) {
      contactType = value;
      return this;
    }
    /**
     * The post office box number for PO box addresses.
     */
    public Builder postOfficeBoxNumber(String value) {
      postOfficeBoxNumber = value;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * The hours during which this contact point is available.
     */
    public Builder hoursAvailable(OpeningHoursSpecification value) {
      hoursAvailable = value;
      return this;
    }
    /**
     * The street address. For example, 1600 Amphitheatre Pkwy.
     */
    public Builder streetAddress(String value) {
      streetAddress = value;
      return this;
    }
    /**
     * The region. For example, CA.
     */
    public Builder addressRegion(String value) {
      addressRegion = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    /**
     * The location served by this contact point (e.g., a phone number intended for Europeans vs. North Americans or only within the United States).
     */
    public Builder areaServed(AdministrativeArea value) {
      areaServed = value;
      return this;
    }
    private String addressLocality;
    private String email;
    private String faxNumber;
    private Product productSupported;
    private CreativeWork mainEntityOfPage;
    private ContactPointOption contactOption;
    private Language availableLanguage;
    private String telephone;
    private Country addressCountry;
    private Action potentialAction;
    private String alternateName;
    private String postalCode;
    private String contactType;
    private String postOfficeBoxNumber;
    private String url;
    private String additionalType;
    private String sameAs;
    private OpeningHoursSpecification hoursAvailable;
    private String streetAddress;
    private String addressRegion;
    private Image image;
    private String name;
    private String description;
    private AdministrativeArea areaServed;
  }

  protected PostalAddress(String addressLocality, String email, String faxNumber, Product productSupported, CreativeWork mainEntityOfPage, ContactPointOption contactOption, Language availableLanguage, String telephone, Country addressCountry, Action potentialAction, String alternateName, String postalCode, String contactType, String postOfficeBoxNumber, String url, String additionalType, String sameAs, OpeningHoursSpecification hoursAvailable, String streetAddress, String addressRegion, Image image, String name, String description, AdministrativeArea areaServed) {
    super(email, faxNumber, productSupported, mainEntityOfPage, contactOption, availableLanguage, telephone, alternateName, potentialAction, contactType, additionalType, url, sameAs, hoursAvailable, name, image, description, areaServed);
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
