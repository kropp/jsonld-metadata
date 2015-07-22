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
  public OrganizationOrPerson getProvider() {
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
  public StringOrVehicle getAircraft() {
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
  public StringOrDuration getEstimatedFlightDuration() {
    return myEstimatedFlightDuration;
  }
  /**
   * The distance of the flight.
   */
  public DistanceOrString getFlightDistance() {
    return myFlightDistance;
  }
  /**
   * The time when a passenger can check into the flight online.
   */
  public java.util.Date getWebCheckinTime() {
    return myWebCheckinTime;
  }
  /**
   * Builder for {@link Flight}
   */
  public static final class Builder {
    /**
     * Creates new {@link Flight} instance.
     */
    public Flight build() {
      return new Flight(boardingPolicy, arrivalAirport, flightNumber, mealService, departureAirport, seller, arrivalGate, webCheckinTime, additionalType, sameAs, estimatedFlightDuration, aircraft, potentialAction, flightDistance, departureTime, arrivalTerminal, provider, departureTerminal, name, mainEntityOfPage, url, departureGate, alternateName, arrivalTime, description);
    }
    /**
     * The type of boarding policy used by the airline (e.g. zone-based or group-based).
     */
    public Builder boardingPolicy(BoardingPolicyType boardingPolicyType) {
      this.boardingPolicy = boardingPolicyType;
      return this;
    }
    /**
     * The airport where the flight terminates.
     */
    public Builder arrivalAirport(Airport airport) {
      this.arrivalAirport = airport;
      return this;
    }
    /**
     * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
     */
    public Builder flightNumber(String flightNumber) {
      this.flightNumber = flightNumber;
      return this;
    }
    /**
     * Description of the meals that will be provided or available for purchase.
     */
    public Builder mealService(String mealService) {
      this.mealService = mealService;
      return this;
    }
    /**
     * The airport where the flight originates.
     */
    public Builder departureAirport(Airport airport) {
      this.departureAirport = airport;
      return this;
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    public Builder seller(Participant participant) {
      this.seller = participant;
      return this;
    }
    /**
     * Identifier of the flight's arrival gate.
     */
    public Builder arrivalGate(String arrivalGate) {
      this.arrivalGate = arrivalGate;
      return this;
    }
    /**
     * The time when a passenger can check into the flight online.
     */
    public Builder webCheckinTime(java.util.Date date) {
      this.webCheckinTime = date;
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
     * The estimated time the flight will take.
     */
    public Builder estimatedFlightDuration(String estimatedFlightDuration) {
      this.estimatedFlightDuration.setString(estimatedFlightDuration);
      return this;
    }
    /**
     * The estimated time the flight will take.
     */
    public Builder estimatedFlightDuration(Duration duration) {
      this.estimatedFlightDuration.setDuration(duration);
      return this;
    }
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     */
    public Builder aircraft(String aircraft) {
      this.aircraft.setString(aircraft);
      return this;
    }
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     */
    public Builder aircraft(Vehicle vehicle) {
      this.aircraft.setVehicle(vehicle);
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
     * The distance of the flight.
     */
    public Builder flightDistance(Distance distance) {
      this.flightDistance.setDistance(distance);
      return this;
    }
    /**
     * The distance of the flight.
     */
    public Builder flightDistance(String flightDistance) {
      this.flightDistance.setString(flightDistance);
      return this;
    }
    /**
     * The expected departure time.
     */
    public Builder departureTime(java.util.Date date) {
      this.departureTime = date;
      return this;
    }
    /**
     * Identifier of the flight's arrival terminal.
     */
    public Builder arrivalTerminal(String arrivalTerminal) {
      this.arrivalTerminal = arrivalTerminal;
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization organization) {
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person person) {
      this.provider.setPerson(person);
      return this;
    }
    /**
     * Identifier of the flight's departure terminal.
     */
    public Builder departureTerminal(String departureTerminal) {
      this.departureTerminal = departureTerminal;
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
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Identifier of the flight's departure gate.
     */
    public Builder departureGate(String departureGate) {
      this.departureGate = departureGate;
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
     * The expected arrival time.
     */
    public Builder arrivalTime(java.util.Date date) {
      this.arrivalTime = date;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
    private BoardingPolicyType boardingPolicy;
    private Airport arrivalAirport;
    private String flightNumber;
    private String mealService;
    private Airport departureAirport;
    private Participant seller;
    private String arrivalGate;
    private java.util.Date webCheckinTime;
    private String additionalType;
    private String sameAs;
    private StringOrDuration estimatedFlightDuration;
    private StringOrVehicle aircraft;
    private Action potentialAction;
    private DistanceOrString flightDistance;
    private java.util.Date departureTime;
    private String arrivalTerminal;
    private OrganizationOrPerson provider;
    private String departureTerminal;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private String url;
    private String departureGate;
    private String alternateName;
    private java.util.Date arrivalTime;
    private String description;
  }

  protected Flight(BoardingPolicyType boardingPolicy, Airport arrivalAirport, String flightNumber, String mealService, Airport departureAirport, Participant seller, String arrivalGate, java.util.Date webCheckinTime, String additionalType, String sameAs, StringOrDuration estimatedFlightDuration, StringOrVehicle aircraft, Action potentialAction, DistanceOrString flightDistance, java.util.Date departureTime, String arrivalTerminal, OrganizationOrPerson provider, String departureTerminal, String name, StringOrCreativeWork mainEntityOfPage, String url, String departureGate, String alternateName, java.util.Date arrivalTime, String description) {
    super(additionalType, url, sameAs, alternateName, description, potentialAction, name, mainEntityOfPage);
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
  private OrganizationOrPerson myProvider;
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
  private StringOrVehicle myAircraft;
  private String myMealService;
  private StringOrDuration myEstimatedFlightDuration;
  private DistanceOrString myFlightDistance;
  private java.util.Date myWebCheckinTime;
}
