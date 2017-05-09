/*
 * Copyright 2015-2017 JetBrains s.r.o.
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * A trip on a commercial bus line.
 */
public class BusTrip extends Intangible {
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Organization getProviderOrganization() {
    return (Organization) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Collection<Organization> getProviderOrganizations() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Person getProviderPerson() {
    return (Person) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Collection<Person> getProviderPersons() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The expected departure time.
   */
  @JsonIgnore public java.util.Date getDepartureTime() {
    return (java.util.Date) getValue("departureTime");
  }
  /**
   * The expected departure time.
   */
  @JsonIgnore public Collection<java.util.Date> getDepartureTimes() {
    final Object current = myData.get("departureTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The expected arrival time.
   */
  @JsonIgnore public java.util.Date getArrivalTime() {
    return (java.util.Date) getValue("arrivalTime");
  }
  /**
   * The expected arrival time.
   */
  @JsonIgnore public Collection<java.util.Date> getArrivalTimes() {
    final Object current = myData.get("arrivalTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The unique identifier for the bus.
   */
  @JsonIgnore public String getBusNumber() {
    return (String) getValue("busNumber");
  }
  /**
   * The unique identifier for the bus.
   */
  @JsonIgnore public Collection<String> getBusNumbers() {
    final Object current = myData.get("busNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The name of the bus (e.g. Bolt Express).
   */
  @JsonIgnore public String getBusName() {
    return (String) getValue("busName");
  }
  /**
   * The name of the bus (e.g. Bolt Express).
   */
  @JsonIgnore public Collection<String> getBusNames() {
    final Object current = myData.get("busName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The stop or station from which the bus departs.
   */
  @JsonIgnore public BusStation getDepartureBusStopBusStation() {
    return (BusStation) getValue("departureBusStop");
  }
  /**
   * The stop or station from which the bus departs.
   */
  @JsonIgnore public Collection<BusStation> getDepartureBusStopBusStations() {
    final Object current = myData.get("departureBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BusStation>) current;
    }
    return Arrays.asList((BusStation) current);
  }
  /**
   * The stop or station from which the bus departs.
   */
  @JsonIgnore public BusStop getDepartureBusStopBusStop() {
    return (BusStop) getValue("departureBusStop");
  }
  /**
   * The stop or station from which the bus departs.
   */
  @JsonIgnore public Collection<BusStop> getDepartureBusStopBusStops() {
    final Object current = myData.get("departureBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BusStop>) current;
    }
    return Arrays.asList((BusStop) current);
  }
  /**
   * The stop or station from which the bus arrives.
   */
  @JsonIgnore public BusStation getArrivalBusStopBusStation() {
    return (BusStation) getValue("arrivalBusStop");
  }
  /**
   * The stop or station from which the bus arrives.
   */
  @JsonIgnore public Collection<BusStation> getArrivalBusStopBusStations() {
    final Object current = myData.get("arrivalBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BusStation>) current;
    }
    return Arrays.asList((BusStation) current);
  }
  /**
   * The stop or station from which the bus arrives.
   */
  @JsonIgnore public BusStop getArrivalBusStopBusStop() {
    return (BusStop) getValue("arrivalBusStop");
  }
  /**
   * The stop or station from which the bus arrives.
   */
  @JsonIgnore public Collection<BusStop> getArrivalBusStopBusStops() {
    final Object current = myData.get("arrivalBusStop");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BusStop>) current;
    }
    return Arrays.asList((BusStop) current);
  }
  protected BusTrip(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link BusTrip}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public BusTrip build() {
      return new BusTrip(myData);
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * The expected departure time.
     */
    @NotNull public Builder departureTime(@NotNull java.util.Date date) {
      putValue("departureTime", date);
      return this;
    }
    /**
     * The expected arrival time.
     */
    @NotNull public Builder arrivalTime(@NotNull java.util.Date date) {
      putValue("arrivalTime", date);
      return this;
    }
    /**
     * The unique identifier for the bus.
     */
    @NotNull public Builder busNumber(@NotNull String busNumber) {
      putValue("busNumber", busNumber);
      return this;
    }
    /**
     * The name of the bus (e.g. Bolt Express).
     */
    @NotNull public Builder busName(@NotNull String busName) {
      putValue("busName", busName);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStation busStation) {
      putValue("departureBusStop", busStation);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStation.Builder busStation) {
      putValue("departureBusStop", busStation.build());
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStop busStop) {
      putValue("departureBusStop", busStop);
      return this;
    }
    /**
     * The stop or station from which the bus departs.
     */
    @NotNull public Builder departureBusStop(@NotNull BusStop.Builder busStop) {
      putValue("departureBusStop", busStop.build());
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStation busStation) {
      putValue("arrivalBusStop", busStation);
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStation.Builder busStation) {
      putValue("arrivalBusStop", busStation.build());
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStop busStop) {
      putValue("arrivalBusStop", busStop);
      return this;
    }
    /**
     * The stop or station from which the bus arrives.
     */
    @NotNull public Builder arrivalBusStop(@NotNull BusStop.Builder busStop) {
      putValue("arrivalBusStop", busStop.build());
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("provider".equals(key) && value instanceof Organization) { provider((Organization)value); return; }
      if ("providers".equals(key) && value instanceof Organization) { provider((Organization)value); return; }
      if ("provider".equals(key) && value instanceof Person) { provider((Person)value); return; }
      if ("providers".equals(key) && value instanceof Person) { provider((Person)value); return; }
      if ("departureTime".equals(key) && value instanceof java.util.Date) { departureTime((java.util.Date)value); return; }
      if ("departureTimes".equals(key) && value instanceof java.util.Date) { departureTime((java.util.Date)value); return; }
      if ("arrivalTime".equals(key) && value instanceof java.util.Date) { arrivalTime((java.util.Date)value); return; }
      if ("arrivalTimes".equals(key) && value instanceof java.util.Date) { arrivalTime((java.util.Date)value); return; }
      if ("busNumber".equals(key) && value instanceof String) { busNumber((String)value); return; }
      if ("busNumbers".equals(key) && value instanceof String) { busNumber((String)value); return; }
      if ("busName".equals(key) && value instanceof String) { busName((String)value); return; }
      if ("busNames".equals(key) && value instanceof String) { busName((String)value); return; }
      if ("departureBusStop".equals(key) && value instanceof BusStation) { departureBusStop((BusStation)value); return; }
      if ("departureBusStops".equals(key) && value instanceof BusStation) { departureBusStop((BusStation)value); return; }
      if ("departureBusStop".equals(key) && value instanceof BusStop) { departureBusStop((BusStop)value); return; }
      if ("departureBusStops".equals(key) && value instanceof BusStop) { departureBusStop((BusStop)value); return; }
      if ("arrivalBusStop".equals(key) && value instanceof BusStation) { arrivalBusStop((BusStation)value); return; }
      if ("arrivalBusStops".equals(key) && value instanceof BusStation) { arrivalBusStop((BusStation)value); return; }
      if ("arrivalBusStop".equals(key) && value instanceof BusStop) { arrivalBusStop((BusStop)value); return; }
      if ("arrivalBusStops".equals(key) && value instanceof BusStop) { arrivalBusStop((BusStop)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
