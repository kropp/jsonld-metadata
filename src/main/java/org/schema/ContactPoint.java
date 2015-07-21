/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

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
  public Product getProductSupported() {
    return myProductSupported;
  }
  /**
   * The telephone number.
   */
  public String getTelephone() {
    return myTelephone;
  }
  /**
   * Builder for {@see ContactPoint}
   */
  public static final class Builder {
    public ContactPoint build() {
      return new ContactPoint(email, faxNumber, productSupported, mainEntityOfPage, contactOption, availableLanguage, telephone, alternateName, potentialAction, contactType, additionalType, url, sameAs, hoursAvailable, name, image, description, areaServed);
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
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
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
     * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
     */
    public Builder contactType(String value) {
      contactType = value;
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
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
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
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
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
    private String email;
    private String faxNumber;
    private Product productSupported;
    private CreativeWork mainEntityOfPage;
    private ContactPointOption contactOption;
    private Language availableLanguage;
    private String telephone;
    private String alternateName;
    private Action potentialAction;
    private String contactType;
    private String additionalType;
    private String url;
    private String sameAs;
    private OpeningHoursSpecification hoursAvailable;
    private String name;
    private Image image;
    private String description;
    private AdministrativeArea areaServed;
  }

  protected ContactPoint(String email, String faxNumber, Product productSupported, CreativeWork mainEntityOfPage, ContactPointOption contactOption, Language availableLanguage, String telephone, String alternateName, Action potentialAction, String contactType, String additionalType, String url, String sameAs, OpeningHoursSpecification hoursAvailable, String name, Image image, String description, AdministrativeArea areaServed) {
    super(mainEntityOfPage, name, image, potentialAction, alternateName, url, additionalType, description, sameAs);
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
  private Product myProductSupported;
  private String myTelephone;
}
