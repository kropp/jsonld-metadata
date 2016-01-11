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

/**
 * A trip on a commercial bus line.
 */
public class BusTrip extends Intangible {
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public OrganizationOrPerson getProvider() {
    return myProvider;
  }
  /**
   * The expected departure time.
   */
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getDepartureTime() {
    return myDepartureTime;
  }
  /**
   * The expected arrival time.
   */
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
  public BusStationOrBusStop getDepartureBusStop() {
    return myDepartureBusStop;
  }
  /**
   * The stop or station from which the bus arrives.
   */
  public BusStationOrBusStop getArrivalBusStop() {
    return myArrivalBusStop;
  }
  /**
   * Builder for {@link BusTrip}
   */
  public static final class BusTripThingBuilder implements Builder {
    /**
     * Creates new {@link BusTrip} instance.
     */
    public BusTrip build() {
      return new BusTrip(provider, departureTime, arrivalTime, busNumber, busName, departureBusStop, arrivalBusStop, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization organization) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization.Builder organization) {
      return this.provider(organization.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person person) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setPerson(person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person.Builder person) {
      return this.provider(person.build());
    }
    /**
     * The expected departure time.
     */
    public Builder departureTime(java.util.Date date) {
      this.departureTime = date;
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
     * The unique identifier for the bus.
     */
    public Builder busNumber(String busNumber) {
      this.busNumber = busNumber;
      return this;
    }
    /**
     * The name of the bus (e.g. Bolt Express).
     */
    public Builder busName(String busName) {
      this.busName = busName;
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    public Builder departureBusStop(BusStation busStation) {
      if (this.departureBusStop == null) this.departureBusStop = new BusStationOrBusStop();
      this.departureBusStop.setBusStation(busStation);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    public Builder departureBusStop(BusStation.Builder busStation) {
      return this.departureBusStop(busStation.build());
    }
    /**
     * The stop or station from which the bus departs.
     */
    public Builder departureBusStop(BusStop busStop) {
      if (this.departureBusStop == null) this.departureBusStop = new BusStationOrBusStop();
      this.departureBusStop.setBusStop(busStop);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    public Builder departureBusStop(BusStop.Builder busStop) {
      return this.departureBusStop(busStop.build());
    }
    /**
     * The stop or station from which the bus arrives.
     */
    public Builder arrivalBusStop(BusStation busStation) {
      if (this.arrivalBusStop == null) this.arrivalBusStop = new BusStationOrBusStop();
      this.arrivalBusStop.setBusStation(busStation);
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    public Builder arrivalBusStop(BusStation.Builder busStation) {
      return this.arrivalBusStop(busStation.build());
    }
    /**
     * The stop or station from which the bus arrives.
     */
    public Builder arrivalBusStop(BusStop busStop) {
      if (this.arrivalBusStop == null) this.arrivalBusStop = new BusStationOrBusStop();
      this.arrivalBusStop.setBusStop(busStop);
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    public Builder arrivalBusStop(BusStop.Builder busStop) {
      return this.arrivalBusStop(busStop.build());
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
    public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
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
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private OrganizationOrPerson provider;
    private java.util.Date departureTime;
    private java.util.Date arrivalTime;
    private String busNumber;
    private String busName;
    private BusStationOrBusStop departureBusStop;
    private BusStationOrBusStop arrivalBusStop;
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
  public interface Builder extends ThingBuilder<BusTrip> {
  Builder provider(Organization organization);
  Builder provider(Organization.Builder organization);
  Builder provider(Person person);
  Builder provider(Person.Builder person);
  Builder departureTime(java.util.Date date);
  Builder arrivalTime(java.util.Date date);
  Builder busNumber(String busNumber);
  Builder busName(String busName);
  Builder departureBusStop(BusStation busStation);
  Builder departureBusStop(BusStation.Builder busStation);
  Builder departureBusStop(BusStop busStop);
  Builder departureBusStop(BusStop.Builder busStop);
  Builder arrivalBusStop(BusStation busStation);
  Builder arrivalBusStop(BusStation.Builder busStation);
  Builder arrivalBusStop(BusStop busStop);
  Builder arrivalBusStop(BusStop.Builder busStop);
  Builder additionalType(String additionalType);
  Builder alternateName(String alternateName);
  Builder description(String description);
  Builder mainEntityOfPage(CreativeWork creativeWork);
  Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
  Builder mainEntityOfPage(String mainEntityOfPage);
  Builder name(String name);
  Builder sameAs(String sameAs);
  Builder url(String url);
  Builder potentialAction(Action action);
  Builder potentialAction(Action.Builder action);
  Builder id(String id);
  }

  protected BusTrip(OrganizationOrPerson provider, java.util.Date departureTime, java.util.Date arrivalTime, String busNumber, String busName, BusStationOrBusStop departureBusStop, BusStationOrBusStop arrivalBusStop, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myProvider = provider;
    myDepartureTime = departureTime;
    myArrivalTime = arrivalTime;
    myBusNumber = busNumber;
    myBusName = busName;
    myDepartureBusStop = departureBusStop;
    myArrivalBusStop = arrivalBusStop;
  }
  private OrganizationOrPerson myProvider;
  private java.util.Date myDepartureTime;
  private java.util.Date myArrivalTime;
  private String myBusNumber;
  private String myBusName;
  private BusStationOrBusStop myDepartureBusStop;
  private BusStationOrBusStop myArrivalBusStop;
}
