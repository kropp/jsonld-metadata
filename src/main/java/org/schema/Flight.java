/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * An airline flight.
 */
public class Flight extends Intangible {
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  public Participant getSeller() {
    return mySeller;
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public Person getProvider() {
    return myProvider;
  }
  /**
   * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
   */
  public String getFlightNumber() {
    return myFlightNumber;
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
   * The airport where the flight originates.
   */
  public Airport getDepartureAirport() {
    return myDepartureAirport;
  }
  /**
   * The airport where the flight terminates.
   */
  public Airport getArrivalAirport() {
    return myArrivalAirport;
  }
  /**
   * Identifier of the flight's departure gate.
   */
  public String getDepartureGate() {
    return myDepartureGate;
  }
  /**
   * Identifier of the flight's arrival gate.
   */
  public String getArrivalGate() {
    return myArrivalGate;
  }
  /**
   * The type of boarding policy used by the airline (e.g. zone-based or group-based).
   */
  public BoardingPolicyType getBoardingPolicy() {
    return myBoardingPolicy;
  }
  /**
   * Identifier of the flight's departure terminal.
   */
  public String getDepartureTerminal() {
    return myDepartureTerminal;
  }
  /**
   * Identifier of the flight's arrival terminal.
   */
  public String getArrivalTerminal() {
    return myArrivalTerminal;
  }
  /**
   * The kind of aircraft (e.g., "Boeing 747").
   */
  public String getAircraft() {
    return myAircraft;
  }
  /**
   * Description of the meals that will be provided or available for purchase.
   */
  public String getMealService() {
    return myMealService;
  }
  /**
   * The estimated time the flight will take.
   */
  public String getEstimatedFlightDuration() {
    return myEstimatedFlightDuration;
  }
  /**
   * The distance of the flight.
   */
  public String getFlightDistance() {
    return myFlightDistance;
  }
  /**
   * The time when a passenger can check into the flight online.
   */
  public java.util.Date getWebCheckinTime() {
    return myWebCheckinTime;
  }
  /**
   * Builder for {@see Flight}
   */
  public static final class Builder {
    public Flight build() {
      return new Flight(arrivalGate, mealService, departureGate, aircraft, boardingPolicy, potentialAction, departureAirport, additionalType, arrivalAirport, flightNumber, image, departureTime, arrivalTime, description, seller, provider, arrivalTerminal, departureTerminal, mainEntityOfPage, alternateName, url, sameAs, estimatedFlightDuration, name, webCheckinTime, flightDistance);
    }
    /**
     * Identifier of the flight's arrival gate.
     */
    public Builder arrivalGate(String value) {
      arrivalGate = value;
      return this;
    }
    /**
     * Description of the meals that will be provided or available for purchase.
     */
    public Builder mealService(String value) {
      mealService = value;
      return this;
    }
    /**
     * Identifier of the flight's departure gate.
     */
    public Builder departureGate(String value) {
      departureGate = value;
      return this;
    }
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     */
    public Builder aircraft(String value) {
      aircraft = value;
      return this;
    }
    /**
     * The type of boarding policy used by the airline (e.g. zone-based or group-based).
     */
    public Builder boardingPolicy(BoardingPolicyType value) {
      boardingPolicy = value;
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
     * The airport where the flight originates.
     */
    public Builder departureAirport(Airport value) {
      departureAirport = value;
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
     * The airport where the flight terminates.
     */
    public Builder arrivalAirport(Airport value) {
      arrivalAirport = value;
      return this;
    }
    /**
     * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
     */
    public Builder flightNumber(String value) {
      flightNumber = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
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
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    public Builder seller(Participant value) {
      seller = value;
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person value) {
      provider = value;
      return this;
    }
    /**
     * Identifier of the flight's arrival terminal.
     */
    public Builder arrivalTerminal(String value) {
      arrivalTerminal = value;
      return this;
    }
    /**
     * Identifier of the flight's departure terminal.
     */
    public Builder departureTerminal(String value) {
      departureTerminal = value;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * The estimated time the flight will take.
     */
    public Builder estimatedFlightDuration(String value) {
      estimatedFlightDuration = value;
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
     * The time when a passenger can check into the flight online.
     */
    public Builder webCheckinTime(java.util.Date value) {
      webCheckinTime = value;
      return this;
    }
    /**
     * The distance of the flight.
     */
    public Builder flightDistance(String value) {
      flightDistance = value;
      return this;
    }
    private String arrivalGate;
    private String mealService;
    private String departureGate;
    private String aircraft;
    private BoardingPolicyType boardingPolicy;
    private Action potentialAction;
    private Airport departureAirport;
    private String additionalType;
    private Airport arrivalAirport;
    private String flightNumber;
    private Image image;
    private java.util.Date departureTime;
    private java.util.Date arrivalTime;
    private String description;
    private Participant seller;
    private Person provider;
    private String arrivalTerminal;
    private String departureTerminal;
    private CreativeWork mainEntityOfPage;
    private String alternateName;
    private String url;
    private String sameAs;
    private String estimatedFlightDuration;
    private String name;
    private java.util.Date webCheckinTime;
    private String flightDistance;
  }

  protected Flight(String arrivalGate, String mealService, String departureGate, String aircraft, BoardingPolicyType boardingPolicy, Action potentialAction, Airport departureAirport, String additionalType, Airport arrivalAirport, String flightNumber, Image image, java.util.Date departureTime, java.util.Date arrivalTime, String description, Participant seller, Person provider, String arrivalTerminal, String departureTerminal, CreativeWork mainEntityOfPage, String alternateName, String url, String sameAs, String estimatedFlightDuration, String name, java.util.Date webCheckinTime, String flightDistance) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    mySeller = seller;
    myProvider = provider;
    myFlightNumber = flightNumber;
    myDepartureTime = departureTime;
    myArrivalTime = arrivalTime;
    myDepartureAirport = departureAirport;
    myArrivalAirport = arrivalAirport;
    myDepartureGate = departureGate;
    myArrivalGate = arrivalGate;
    myBoardingPolicy = boardingPolicy;
    myDepartureTerminal = departureTerminal;
    myArrivalTerminal = arrivalTerminal;
    myAircraft = aircraft;
    myMealService = mealService;
    myEstimatedFlightDuration = estimatedFlightDuration;
    myFlightDistance = flightDistance;
    myWebCheckinTime = webCheckinTime;
  }
  private Participant mySeller;
  private Person myProvider;
  private String myFlightNumber;
  private java.util.Date myDepartureTime;
  private java.util.Date myArrivalTime;
  private Airport myDepartureAirport;
  private Airport myArrivalAirport;
  private String myDepartureGate;
  private String myArrivalGate;
  private BoardingPolicyType myBoardingPolicy;
  private String myDepartureTerminal;
  private String myArrivalTerminal;
  private String myAircraft;
  private String myMealService;
  private String myEstimatedFlightDuration;
  private String myFlightDistance;
  private java.util.Date myWebCheckinTime;
}
