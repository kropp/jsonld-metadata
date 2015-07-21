/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A trip on a commercial train line.
 */
public class TrainTrip extends Intangible {
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
   * The unique identifier for the train.
   */
  public String getTrainNumber() {
    return myTrainNumber;
  }
  /**
   * The name of the train (e.g. The Orient Express).
   */
  public String getTrainName() {
    return myTrainName;
  }
  /**
   * The station from which the train departs.
   */
  public TrainStation getDepartureStation() {
    return myDepartureStation;
  }
  /**
   * The station where the train trip ends.
   */
  public TrainStation getArrivalStation() {
    return myArrivalStation;
  }
  /**
   * The platform from which the train departs.
   */
  public String getDeparturePlatform() {
    return myDeparturePlatform;
  }
  /**
   * The platform where the train arrives.
   */
  public String getArrivalPlatform() {
    return myArrivalPlatform;
  }
  /**
   * Builder for {@see TrainTrip}
   */
  public static final class Builder {
    public TrainTrip build() {
      return new TrainTrip(mainEntityOfPage, alternateName, potentialAction, arrivalStation, url, additionalType, departureStation, sameAs, departurePlatform, trainName, image, name, departureTime, trainNumber, arrivalPlatform, arrivalTime, description, provider);
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
     * The station where the train trip ends.
     */
    public Builder arrivalStation(TrainStation value) {
      arrivalStation = value;
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
     * The station from which the train departs.
     */
    public Builder departureStation(TrainStation value) {
      departureStation = value;
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
     * The platform from which the train departs.
     */
    public Builder departurePlatform(String value) {
      departurePlatform = value;
      return this;
    }
    /**
     * The name of the train (e.g. The Orient Express).
     */
    public Builder trainName(String value) {
      trainName = value;
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
     * The unique identifier for the train.
     */
    public Builder trainNumber(String value) {
      trainNumber = value;
      return this;
    }
    /**
     * The platform where the train arrives.
     */
    public Builder arrivalPlatform(String value) {
      arrivalPlatform = value;
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
    private String alternateName;
    private Action potentialAction;
    private TrainStation arrivalStation;
    private String url;
    private String additionalType;
    private TrainStation departureStation;
    private String sameAs;
    private String departurePlatform;
    private String trainName;
    private Image image;
    private String name;
    private java.util.Date departureTime;
    private String trainNumber;
    private String arrivalPlatform;
    private java.util.Date arrivalTime;
    private String description;
    private Person provider;
  }

  protected TrainTrip(CreativeWork mainEntityOfPage, String alternateName, Action potentialAction, TrainStation arrivalStation, String url, String additionalType, TrainStation departureStation, String sameAs, String departurePlatform, String trainName, Image image, String name, java.util.Date departureTime, String trainNumber, String arrivalPlatform, java.util.Date arrivalTime, String description, Person provider) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    myProvider = provider;
    myDepartureTime = departureTime;
    myArrivalTime = arrivalTime;
    myTrainNumber = trainNumber;
    myTrainName = trainName;
    myDepartureStation = departureStation;
    myArrivalStation = arrivalStation;
    myDeparturePlatform = departurePlatform;
    myArrivalPlatform = arrivalPlatform;
  }
  private Person myProvider;
  private java.util.Date myDepartureTime;
  private java.util.Date myArrivalTime;
  private String myTrainNumber;
  private String myTrainName;
  private TrainStation myDepartureStation;
  private TrainStation myArrivalStation;
  private String myDeparturePlatform;
  private String myArrivalPlatform;
}
