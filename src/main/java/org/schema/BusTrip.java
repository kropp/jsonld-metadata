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
  static final class BusTripThingBuilder implements Builder {
    /**
     * Creates new {@link BusTrip} instance.
     */
    public BusTrip build() {
      return new BusTrip(provider, departureTime, arrivalTime, busNumber, busName, departureBusStop, arrivalBusStop, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
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
     * The unique identifier for the bus.
     */
    @NotNull public Builder busNumber(@NotNull String busNumber) {
      this.busNumber = busNumber;
      return this;
    }
    /**
     * The name of the bus (e.g. Bolt Express).
     */
    @NotNull public Builder busName(@NotNull String busName) {
      this.busName = busName;
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStation busStation) {
      if (this.departureBusStop == null) this.departureBusStop = new BusStationOrBusStop();
      this.departureBusStop.setBusStation(busStation);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStation.Builder busStation) {
      return this.departureBusStop(busStation.build());
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStop busStop) {
      if (this.departureBusStop == null) this.departureBusStop = new BusStationOrBusStop();
      this.departureBusStop.setBusStop(busStop);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStop.Builder busStop) {
      return this.departureBusStop(busStop.build());
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStation busStation) {
      if (this.arrivalBusStop == null) this.arrivalBusStop = new BusStationOrBusStop();
      this.arrivalBusStop.setBusStation(busStation);
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStation.Builder busStation) {
      return this.arrivalBusStop(busStation.build());
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStop busStop) {
      if (this.arrivalBusStop == null) this.arrivalBusStop = new BusStationOrBusStop();
      this.arrivalBusStop.setBusStop(busStop);
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStop.Builder busStop) {
      return this.arrivalBusStop(busStop.build());
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
        if ("provider".equals(key) && value instanceof Organization) { provider((Organization)value); continue; }
        if ("provider".equals(key) && value instanceof Person) { provider((Person)value); continue; }
        if ("departureTime".equals(key) && value instanceof java.util.Date) { departureTime((java.util.Date)value); continue; }
        if ("arrivalTime".equals(key) && value instanceof java.util.Date) { arrivalTime((java.util.Date)value); continue; }
        if ("busNumber".equals(key) && value instanceof String) { busNumber((String)value); continue; }
        if ("busName".equals(key) && value instanceof String) { busName((String)value); continue; }
        if ("departureBusStop".equals(key) && value instanceof BusStation) { departureBusStop((BusStation)value); continue; }
        if ("departureBusStop".equals(key) && value instanceof BusStop) { departureBusStop((BusStop)value); continue; }
        if ("arrivalBusStop".equals(key) && value instanceof BusStation) { arrivalBusStop((BusStation)value); continue; }
        if ("arrivalBusStop".equals(key) && value instanceof BusStop) { arrivalBusStop((BusStop)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("@id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
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
    @NotNull Builder provider(@NotNull Organization organization);
    @NotNull Builder provider(@NotNull Organization.Builder organization);
    @NotNull Builder provider(@NotNull Person person);
    @NotNull Builder provider(@NotNull Person.Builder person);
    @NotNull Builder departureTime(@NotNull java.util.Date date);
    @NotNull Builder arrivalTime(@NotNull java.util.Date date);
    @NotNull Builder busNumber(@NotNull String busNumber);
    @NotNull Builder busName(@NotNull String busName);
    @NotNull Builder departureBusStop(@NotNull BusStation busStation);
    @NotNull Builder departureBusStop(@NotNull BusStation.Builder busStation);
    @NotNull Builder departureBusStop(@NotNull BusStop busStop);
    @NotNull Builder departureBusStop(@NotNull BusStop.Builder busStop);
    @NotNull Builder arrivalBusStop(@NotNull BusStation busStation);
    @NotNull Builder arrivalBusStop(@NotNull BusStation.Builder busStation);
    @NotNull Builder arrivalBusStop(@NotNull BusStop busStop);
    @NotNull Builder arrivalBusStop(@NotNull BusStop.Builder busStop);
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

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myProvider != null ? myProvider.hashCode() : 0);
    result = 31 * result + (myDepartureTime != null ? myDepartureTime.hashCode() : 0);
    result = 31 * result + (myArrivalTime != null ? myArrivalTime.hashCode() : 0);
    result = 31 * result + (myBusNumber != null ? myBusNumber.hashCode() : 0);
    result = 31 * result + (myBusName != null ? myBusName.hashCode() : 0);
    result = 31 * result + (myDepartureBusStop != null ? myDepartureBusStop.hashCode() : 0);
    result = 31 * result + (myArrivalBusStop != null ? myArrivalBusStop.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BusTrip busTrip = (BusTrip) o;
    if (!super.equals(o)) return false;
    if (myProvider != null ? !myProvider.equals(busTrip.myProvider) : busTrip.myProvider != null) return false;
    if (myDepartureTime != null ? !myDepartureTime.equals(busTrip.myDepartureTime) : busTrip.myDepartureTime != null) return false;
    if (myArrivalTime != null ? !myArrivalTime.equals(busTrip.myArrivalTime) : busTrip.myArrivalTime != null) return false;
    if (myBusNumber != null ? !myBusNumber.equals(busTrip.myBusNumber) : busTrip.myBusNumber != null) return false;
    if (myBusName != null ? !myBusName.equals(busTrip.myBusName) : busTrip.myBusName != null) return false;
    if (myDepartureBusStop != null ? !myDepartureBusStop.equals(busTrip.myDepartureBusStop) : busTrip.myDepartureBusStop != null) return false;
    if (myArrivalBusStop != null ? !myArrivalBusStop.equals(busTrip.myArrivalBusStop) : busTrip.myArrivalBusStop != null) return false;
    return true;
  }

  private OrganizationOrPerson myProvider;
  private java.util.Date myDepartureTime;
  private java.util.Date myArrivalTime;
  private String myBusNumber;
  private String myBusName;
  private BusStationOrBusStop myDepartureBusStop;
  private BusStationOrBusStop myArrivalBusStop;
}
