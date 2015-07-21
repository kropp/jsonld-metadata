/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A means for accessing a service, e.g. a government office location, web site, or phone number.
 */
public class ServiceChannel extends Intangible {
  /**
   * A language someone may use with the item.
   */
  public Language getAvailableLanguage() {
    return myAvailableLanguage;
  }
  /**
   * Estimated processing time for the service using this channel.
   */
  public Duration getProcessingTime() {
    return myProcessingTime;
  }
  /**
   * The service provided by this channel.
   */
  public Service getProvidesService() {
    return myProvidesService;
  }
  /**
   * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
   */
  public Place getServiceLocation() {
    return myServiceLocation;
  }
  /**
   * The phone number to use to access the service.
   */
  public ContactPoint getServicePhone() {
    return myServicePhone;
  }
  /**
   * The address for accessing the service by mail.
   */
  public PostalAddress getServicePostalAddress() {
    return myServicePostalAddress;
  }
  /**
   * The number to access the service by text message.
   */
  public ContactPoint getServiceSmsNumber() {
    return myServiceSmsNumber;
  }
  /**
   * The website to access the service.
   */
  public String getServiceUrl() {
    return myServiceUrl;
  }
  /**
   * Builder for {@see ServiceChannel}
   */
  public static final class Builder {
    public ServiceChannel build() {
      return new ServiceChannel(serviceUrl, mainEntityOfPage, processingTime, serviceSmsNumber, availableLanguage, providesService, alternateName, potentialAction, serviceLocation, servicePhone, url, additionalType, sameAs, servicePostalAddress, image, name, description);
    }
    /**
     * The website to access the service.
     */
    public Builder serviceUrl(String value) {
      serviceUrl = value;
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
     * Estimated processing time for the service using this channel.
     */
    public Builder processingTime(Duration value) {
      processingTime = value;
      return this;
    }
    /**
     * The number to access the service by text message.
     */
    public Builder serviceSmsNumber(ContactPoint value) {
      serviceSmsNumber = value;
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
     * The service provided by this channel.
     */
    public Builder providesService(Service value) {
      providesService = value;
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
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     */
    public Builder serviceLocation(Place value) {
      serviceLocation = value;
      return this;
    }
    /**
     * The phone number to use to access the service.
     */
    public Builder servicePhone(ContactPoint value) {
      servicePhone = value;
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
     * The address for accessing the service by mail.
     */
    public Builder servicePostalAddress(PostalAddress value) {
      servicePostalAddress = value;
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
    private String serviceUrl;
    private CreativeWork mainEntityOfPage;
    private Duration processingTime;
    private ContactPoint serviceSmsNumber;
    private Language availableLanguage;
    private Service providesService;
    private String alternateName;
    private Action potentialAction;
    private Place serviceLocation;
    private ContactPoint servicePhone;
    private String url;
    private String additionalType;
    private String sameAs;
    private PostalAddress servicePostalAddress;
    private Image image;
    private String name;
    private String description;
  }

  protected ServiceChannel(String serviceUrl, CreativeWork mainEntityOfPage, Duration processingTime, ContactPoint serviceSmsNumber, Language availableLanguage, Service providesService, String alternateName, Action potentialAction, Place serviceLocation, ContactPoint servicePhone, String url, String additionalType, String sameAs, PostalAddress servicePostalAddress, Image image, String name, String description) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    myAvailableLanguage = availableLanguage;
    myProcessingTime = processingTime;
    myProvidesService = providesService;
    myServiceLocation = serviceLocation;
    myServicePhone = servicePhone;
    myServicePostalAddress = servicePostalAddress;
    myServiceSmsNumber = serviceSmsNumber;
    myServiceUrl = serviceUrl;
  }
  private Language myAvailableLanguage;
  private Duration myProcessingTime;
  private Service myProvidesService;
  private Place myServiceLocation;
  private ContactPoint myServicePhone;
  private PostalAddress myServicePostalAddress;
  private ContactPoint myServiceSmsNumber;
  private String myServiceUrl;
}
