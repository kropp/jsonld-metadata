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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getDepartureTime() {
    return myDepartureTime;
  }
  /**
   * The expected arrival time.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
  public DurationOrString getEstimatedFlightDuration() {
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getWebCheckinTime() {
    return myWebCheckinTime;
  }
  /**
   * Builder for {@link Flight}
   */
  static final class FlightThingBuilder implements Builder {
    /**
     * Creates new {@link Flight} instance.
     */
    public Flight build() {
      return new Flight(seller, provider, flightNumber, departureTime, arrivalTime, departureAirport, arrivalAirport, departureGate, arrivalGate, boardingPolicy, departureTerminal, arrivalTerminal, aircraft, mealService, estimatedFlightDuration, flightDistance, webCheckinTime, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @NotNull public Builder seller(@NotNull Participant participant) {
      this.seller = participant;
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      return this.provider(organization.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setPerson(person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      return this.provider(person.build());
    }
    /**
     * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
     */
    @NotNull public Builder flightNumber(@NotNull String flightNumber) {
      this.flightNumber = flightNumber;
      return this;
    }
    /**
     * The expected departure time.
     */
    @NotNull public Builder departureTime(@NotNull java.util.Date date) {
      this.departureTime = date;
      return this;
    }
    /**
     * The expected arrival time.
     */
    @NotNull public Builder arrivalTime(@NotNull java.util.Date date) {
      this.arrivalTime = date;
      return this;
    }
    /**
     * The airport where the flight originates.
     */
    @NotNull public Builder departureAirport(@NotNull Airport airport) {
      this.departureAirport = airport;
      return this;
    }
    /**
     * The airport where the flight originates.
     */
    @NotNull public Builder departureAirport(@NotNull Airport.Builder airport) {
      return this.departureAirport(airport.build());
    }
    /**
     * The airport where the flight terminates.
     */
    @NotNull public Builder arrivalAirport(@NotNull Airport airport) {
      this.arrivalAirport = airport;
      return this;
    }
    /**
     * The airport where the flight terminates.
     */
    @NotNull public Builder arrivalAirport(@NotNull Airport.Builder airport) {
      return this.arrivalAirport(airport.build());
    }
    /**
     * Identifier of the flight's departure gate.
     */
    @NotNull public Builder departureGate(@NotNull String departureGate) {
      this.departureGate = departureGate;
      return this;
    }
    /**
     * Identifier of the flight's arrival gate.
     */
    @NotNull public Builder arrivalGate(@NotNull String arrivalGate) {
      this.arrivalGate = arrivalGate;
      return this;
    }
    /**
     * The type of boarding policy used by the airline (e.g. zone-based or group-based).
     */
    @NotNull public Builder boardingPolicy(@NotNull BoardingPolicyType boardingPolicyType) {
      this.boardingPolicy = boardingPolicyType;
      return this;
    }
    /**
     * The type of boarding policy used by the airline (e.g. zone-based or group-based).
     */
    @NotNull public Builder boardingPolicy(@NotNull BoardingPolicyType.Builder boardingPolicyType) {
      return this.boardingPolicy(boardingPolicyType.build());
    }
    /**
     * Identifier of the flight's departure terminal.
     */
    @NotNull public Builder departureTerminal(@NotNull String departureTerminal) {
      this.departureTerminal = departureTerminal;
      return this;
    }
    /**
     * Identifier of the flight's arrival terminal.
     */
    @NotNull public Builder arrivalTerminal(@NotNull String arrivalTerminal) {
      this.arrivalTerminal = arrivalTerminal;
      return this;
    }
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     */
    @NotNull public Builder aircraft(@NotNull String aircraft) {
      if (this.aircraft == null) this.aircraft = new StringOrVehicle();
      this.aircraft.setString(aircraft);
      return this;
    }
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     */
    @NotNull public Builder aircraft(@NotNull Vehicle vehicle) {
      if (this.aircraft == null) this.aircraft = new StringOrVehicle();
      this.aircraft.setVehicle(vehicle);
      return this;
    }
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     */
    @NotNull public Builder aircraft(@NotNull Vehicle.Builder vehicle) {
      return this.aircraft(vehicle.build());
    }
    /**
     * Description of the meals that will be provided or available for purchase.
     */
    @NotNull public Builder mealService(@NotNull String mealService) {
      this.mealService = mealService;
      return this;
    }
    /**
     * The estimated time the flight will take.
     */
    @NotNull public Builder estimatedFlightDuration(@NotNull Duration duration) {
      if (this.estimatedFlightDuration == null) this.estimatedFlightDuration = new DurationOrString();
      this.estimatedFlightDuration.setDuration(duration);
      return this;
    }
    /**
     * The estimated time the flight will take.
     */
    @NotNull public Builder estimatedFlightDuration(@NotNull Duration.Builder duration) {
      return this.estimatedFlightDuration(duration.build());
    }
    /**
     * The estimated time the flight will take.
     */
    @NotNull public Builder estimatedFlightDuration(@NotNull String estimatedFlightDuration) {
      if (this.estimatedFlightDuration == null) this.estimatedFlightDuration = new DurationOrString();
      this.estimatedFlightDuration.setString(estimatedFlightDuration);
      return this;
    }
    /**
     * The distance of the flight.
     */
    @NotNull public Builder flightDistance(@NotNull Distance distance) {
      if (this.flightDistance == null) this.flightDistance = new DistanceOrString();
      this.flightDistance.setDistance(distance);
      return this;
    }
    /**
     * The distance of the flight.
     */
    @NotNull public Builder flightDistance(@NotNull Distance.Builder distance) {
      return this.flightDistance(distance.build());
    }
    /**
     * The distance of the flight.
     */
    @NotNull public Builder flightDistance(@NotNull String flightDistance) {
      if (this.flightDistance == null) this.flightDistance = new DistanceOrString();
      this.flightDistance.setString(flightDistance);
      return this;
    }
    /**
     * The time when a passenger can check into the flight online.
     */
    @NotNull public Builder webCheckinTime(@NotNull java.util.Date date) {
      this.webCheckinTime = date;
      return this;
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
        if ("seller".equals(key) && value instanceof Participant) { seller((Participant)value); continue; }
        if ("provider".equals(key) && value instanceof Organization) { provider((Organization)value); continue; }
        if ("provider".equals(key) && value instanceof Person) { provider((Person)value); continue; }
        if ("flightNumber".equals(key) && value instanceof String) { flightNumber((String)value); continue; }
        if ("departureTime".equals(key) && value instanceof java.util.Date) { departureTime((java.util.Date)value); continue; }
        if ("arrivalTime".equals(key) && value instanceof java.util.Date) { arrivalTime((java.util.Date)value); continue; }
        if ("departureAirport".equals(key) && value instanceof Airport) { departureAirport((Airport)value); continue; }
        if ("arrivalAirport".equals(key) && value instanceof Airport) { arrivalAirport((Airport)value); continue; }
        if ("departureGate".equals(key) && value instanceof String) { departureGate((String)value); continue; }
        if ("arrivalGate".equals(key) && value instanceof String) { arrivalGate((String)value); continue; }
        if ("boardingPolicy".equals(key) && value instanceof BoardingPolicyType) { boardingPolicy((BoardingPolicyType)value); continue; }
        if ("departureTerminal".equals(key) && value instanceof String) { departureTerminal((String)value); continue; }
        if ("arrivalTerminal".equals(key) && value instanceof String) { arrivalTerminal((String)value); continue; }
        if ("aircraft".equals(key) && value instanceof String) { aircraft((String)value); continue; }
        if ("aircraft".equals(key) && value instanceof Vehicle) { aircraft((Vehicle)value); continue; }
        if ("mealService".equals(key) && value instanceof String) { mealService((String)value); continue; }
        if ("estimatedFlightDuration".equals(key) && value instanceof Duration) { estimatedFlightDuration((Duration)value); continue; }
        if ("estimatedFlightDuration".equals(key) && value instanceof String) { estimatedFlightDuration((String)value); continue; }
        if ("flightDistance".equals(key) && value instanceof Distance) { flightDistance((Distance)value); continue; }
        if ("flightDistance".equals(key) && value instanceof String) { flightDistance((String)value); continue; }
        if ("webCheckinTime".equals(key) && value instanceof java.util.Date) { webCheckinTime((java.util.Date)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private Participant seller;
    private OrganizationOrPerson provider;
    private String flightNumber;
    private java.util.Date departureTime;
    private java.util.Date arrivalTime;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private String departureGate;
    private String arrivalGate;
    private BoardingPolicyType boardingPolicy;
    private String departureTerminal;
    private String arrivalTerminal;
    private StringOrVehicle aircraft;
    private String mealService;
    private DurationOrString estimatedFlightDuration;
    private DistanceOrString flightDistance;
    private java.util.Date webCheckinTime;
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
  public interface Builder extends ThingBuilder<Flight> {
    @NotNull Builder seller(@NotNull Participant participant);
    @NotNull Builder provider(@NotNull Organization organization);
    @NotNull Builder provider(@NotNull Organization.Builder organization);
    @NotNull Builder provider(@NotNull Person person);
    @NotNull Builder provider(@NotNull Person.Builder person);
    @NotNull Builder flightNumber(@NotNull String flightNumber);
    @NotNull Builder departureTime(@NotNull java.util.Date date);
    @NotNull Builder arrivalTime(@NotNull java.util.Date date);
    @NotNull Builder departureAirport(@NotNull Airport airport);
    @NotNull Builder departureAirport(@NotNull Airport.Builder airport);
    @NotNull Builder arrivalAirport(@NotNull Airport airport);
    @NotNull Builder arrivalAirport(@NotNull Airport.Builder airport);
    @NotNull Builder departureGate(@NotNull String departureGate);
    @NotNull Builder arrivalGate(@NotNull String arrivalGate);
    @NotNull Builder boardingPolicy(@NotNull BoardingPolicyType boardingPolicyType);
    @NotNull Builder boardingPolicy(@NotNull BoardingPolicyType.Builder boardingPolicyType);
    @NotNull Builder departureTerminal(@NotNull String departureTerminal);
    @NotNull Builder arrivalTerminal(@NotNull String arrivalTerminal);
    @NotNull Builder aircraft(@NotNull String aircraft);
    @NotNull Builder aircraft(@NotNull Vehicle vehicle);
    @NotNull Builder aircraft(@NotNull Vehicle.Builder vehicle);
    @NotNull Builder mealService(@NotNull String mealService);
    @NotNull Builder estimatedFlightDuration(@NotNull Duration duration);
    @NotNull Builder estimatedFlightDuration(@NotNull Duration.Builder duration);
    @NotNull Builder estimatedFlightDuration(@NotNull String estimatedFlightDuration);
    @NotNull Builder flightDistance(@NotNull Distance distance);
    @NotNull Builder flightDistance(@NotNull Distance.Builder distance);
    @NotNull Builder flightDistance(@NotNull String flightDistance);
    @NotNull Builder webCheckinTime(@NotNull java.util.Date date);
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

  protected Flight(Participant seller, OrganizationOrPerson provider, String flightNumber, java.util.Date departureTime, java.util.Date arrivalTime, Airport departureAirport, Airport arrivalAirport, String departureGate, String arrivalGate, BoardingPolicyType boardingPolicy, String departureTerminal, String arrivalTerminal, StringOrVehicle aircraft, String mealService, DurationOrString estimatedFlightDuration, DistanceOrString flightDistance, java.util.Date webCheckinTime, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
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
  private DurationOrString myEstimatedFlightDuration;
  private DistanceOrString myFlightDistance;
  private java.util.Date myWebCheckinTime;
}
