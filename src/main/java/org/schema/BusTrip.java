/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A trip on a commercial bus line.
 */
public class BusTrip extends Intangible {
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public Person getProvider() {
    return myProvider;
  }
  /**
   * The expected departure time.
   */
  public java.util.Date getDepartureTime() {
    return myDepartureTime;
  }
  /**
   * The expected arrival time.
   */
  public java.util.Date getArrivalTime() {
    return myArrivalTime;
  }
  /**
   * The unique identifier for the bus.
   */
  public String getBusNumber() {
    return myBusNumber;
  }
  /**
   * The name of the bus (e.g. Bolt Express).
   */
  public String getBusName() {
    return myBusName;
  }
  /**
   * The stop or station from which the bus departs.
   */
  public BusStation getDepartureBusStop() {
    return myDepartureBusStop;
  }
  /**
   * The stop or station from which the bus arrives.
   */
  public BusStation getArrivalBusStop() {
    return myArrivalBusStop;
  }
  /**
   * Builder for {@see BusTrip}
   */
  public static final class Builder {
    public BusTrip build() {
      return new BusTrip(mainEntityOfPage, potentialAction, alternateName, url, additionalType, busName, sameAs, image, name, departureTime, departureBusStop, arrivalTime, busNumber, arrivalBusStop, description, provider);
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
     * The name of the bus (e.g. Bolt Express).
     */
    public Builder busName(String value) {
      busName = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
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
     * The expected departure time.
     */
    public Builder departureTime(java.util.Date value) {
      departureTime = value;
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    public Builder departureBusStop(BusStation value) {
      departureBusStop = value;
      return this;
    }
    /**
     * The expected arrival time.
     */
    public Builder arrivalTime(java.util.Date value) {
      arrivalTime = value;
      return this;
    }
    /**
     * The unique identifier for the bus.
     */
    public Builder busNumber(String value) {
      busNumber = value;
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    public Builder arrivalBusStop(BusStation value) {
      arrivalBusStop = value;
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
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person value) {
      provider = value;
      return this;
    }
    private CreativeWork mainEntityOfPage;
    private Action potentialAction;
    private String alternateName;
    private String url;
    private String additionalType;
    private String busName;
    private String sameAs;
    private Image image;
    private String name;
    private java.util.Date departureTime;
    private BusStation departureBusStop;
    private java.util.Date arrivalTime;
    private String busNumber;
    private BusStation arrivalBusStop;
    private String description;
    private Person provider;
  }

  protected BusTrip(CreativeWork mainEntityOfPage, Action potentialAction, String alternateName, String url, String additionalType, String busName, String sameAs, Image image, String name, java.util.Date departureTime, BusStation departureBusStop, java.util.Date arrivalTime, String busNumber, BusStation arrivalBusStop, String description, Person provider) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    myProvider = provider;
    myDepartureTime = departureTime;
    myArrivalTime = arrivalTime;
    myBusNumber = busNumber;
    myBusName = busName;
    myDepartureBusStop = departureBusStop;
    myArrivalBusStop = arrivalBusStop;
  }
  private Person myProvider;
  private java.util.Date myDepartureTime;
  private java.util.Date myArrivalTime;
  private String myBusNumber;
  private String myBusName;
  private BusStation myDepartureBusStop;
  private BusStation myArrivalBusStop;
}
