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

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Used to describe a ticket to an event, a flight, a bus ride, etc.
 */
public class Ticket extends Intangible {
  /**
   * The person or organization the reservation or ticket is for.
   */
  @JsonIgnore public Organization getUnderNameOrganization() {
    return (Organization) getValue("underName");
  }
  /**
   * The person or organization the reservation or ticket is for.
   */
  @JsonIgnore public Collection<Organization> getUnderNameOrganizations() {
    final Object current = myData.get("underName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The person or organization the reservation or ticket is for.
   */
  @JsonIgnore public Person getUnderNamePerson() {
    return (Person) getValue("underName");
  }
  /**
   * The person or organization the reservation or ticket is for.
   */
  @JsonIgnore public Collection<Person> getUnderNamePersons() {
    final Object current = myData.get("underName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  @JsonIgnore public Integer getTotalPriceInteger() {
    return (Integer) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  @JsonIgnore public Collection<Integer> getTotalPriceIntegers() {
    final Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  @JsonIgnore public Long getTotalPriceLong() {
    return (Long) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  @JsonIgnore public Collection<Long> getTotalPriceLongs() {
    final Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  @JsonIgnore public Float getTotalPriceFloat() {
    return (Float) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  @JsonIgnore public Collection<Float> getTotalPriceFloats() {
    final Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  @JsonIgnore public Double getTotalPriceDouble() {
    return (Double) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  @JsonIgnore public Collection<Double> getTotalPriceDoubles() {
    final Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  @JsonIgnore public String getTotalPriceString() {
    return (String) getValue("totalPrice");
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  @JsonIgnore public Collection<String> getTotalPriceStrings() {
    final Object current = myData.get("totalPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to [[PriceSpecification]] and its subtypes.
   */
  @JsonIgnore public String getPriceCurrency() {
    return (String) getValue("priceCurrency");
  }
  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to [[PriceSpecification]] and its subtypes.
   */
  @JsonIgnore public Collection<String> getPriceCurrencys() {
    final Object current = myData.get("priceCurrency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The organization issuing the ticket or permit.
   */
  @JsonIgnore public Organization getIssuedBy() {
    return (Organization) getValue("issuedBy");
  }
  /**
   * The organization issuing the ticket or permit.
   */
  @JsonIgnore public Collection<Organization> getIssuedBys() {
    final Object current = myData.get("issuedBy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The date the ticket was issued.
   */
  @JsonIgnore public java.util.Date getDateIssued() {
    return (java.util.Date) getValue("dateIssued");
  }
  /**
   * The date the ticket was issued.
   */
  @JsonIgnore public Collection<java.util.Date> getDateIssueds() {
    final Object current = myData.get("dateIssued");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The seat associated with the ticket.
   */
  @JsonIgnore public Seat getTicketedSeat() {
    return (Seat) getValue("ticketedSeat");
  }
  /**
   * The seat associated with the ticket.
   */
  @JsonIgnore public Collection<Seat> getTicketedSeats() {
    final Object current = myData.get("ticketedSeat");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Seat>) current;
    }
    return Arrays.asList((Seat) current);
  }
  /**
   * The unique identifier for the ticket.
   */
  @JsonIgnore public String getTicketNumber() {
    return (String) getValue("ticketNumber");
  }
  /**
   * The unique identifier for the ticket.
   */
  @JsonIgnore public Collection<String> getTicketNumbers() {
    final Object current = myData.get("ticketNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
   */
  @JsonIgnore public String getTicketToken() {
    return (String) getValue("ticketToken");
  }
  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
   */
  @JsonIgnore public Collection<String> getTicketTokens() {
    final Object current = myData.get("ticketToken");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Ticket(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Ticket}
   */
  public static class Builder extends Intangible.Builder {
    @NotNull public Ticket build() {
      return new Ticket(myData);
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Organization organization) {
      putValue("underName", organization);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Organization.Builder organization) {
      putValue("underName", organization.build());
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Person person) {
      putValue("underName", person);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Person.Builder person) {
      putValue("underName", person.build());
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    @NotNull public Builder totalPrice(@NotNull Integer integer) {
      putValue("totalPrice", integer);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    @NotNull public Builder totalPrice(@NotNull Long totalPrice) {
      putValue("totalPrice", totalPrice);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    @NotNull public Builder totalPrice(@NotNull Float totalPrice) {
      putValue("totalPrice", totalPrice);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    @NotNull public Builder totalPrice(@NotNull Double totalPrice) {
      putValue("totalPrice", totalPrice);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    @NotNull public Builder totalPrice(@NotNull String totalPrice) {
      putValue("totalPrice", totalPrice);
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to [[PriceSpecification]] and its subtypes.
     */
    @NotNull public Builder priceCurrency(@NotNull String priceCurrency) {
      putValue("priceCurrency", priceCurrency);
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    @NotNull public Builder issuedBy(@NotNull Organization organization) {
      putValue("issuedBy", organization);
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    @NotNull public Builder issuedBy(@NotNull Organization.Builder organization) {
      putValue("issuedBy", organization.build());
      return this;
    }
    /**
     * The date the ticket was issued.
     */
    @NotNull public Builder dateIssued(@NotNull java.util.Date date) {
      putValue("dateIssued", date);
      return this;
    }
    /**
     * The seat associated with the ticket.
     */
    @NotNull public Builder ticketedSeat(@NotNull Seat seat) {
      putValue("ticketedSeat", seat);
      return this;
    }
    /**
     * The seat associated with the ticket.
     */
    @NotNull public Builder ticketedSeat(@NotNull Seat.Builder seat) {
      putValue("ticketedSeat", seat.build());
      return this;
    }
    /**
     * The unique identifier for the ticket.
     */
    @NotNull public Builder ticketNumber(@NotNull String ticketNumber) {
      putValue("ticketNumber", ticketNumber);
      return this;
    }
    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     */
    @NotNull public Builder ticketToken(@NotNull String ticketToken) {
      putValue("ticketToken", ticketToken);
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
      putValue("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("underName".equals(key) && value instanceof Organization) { underName((Organization)value); return; }
      if ("underName".equals(key) && value instanceof Person) { underName((Person)value); return; }
      if ("totalPrice".equals(key) && value instanceof Integer) { totalPrice((Integer)value); return; }
      if ("totalPrice".equals(key) && value instanceof Long) { totalPrice((Long)value); return; }
      if ("totalPrice".equals(key) && value instanceof Float) { totalPrice((Float)value); return; }
      if ("totalPrice".equals(key) && value instanceof Double) { totalPrice((Double)value); return; }
      if ("totalPrice".equals(key) && value instanceof String) { totalPrice((String)value); return; }
      if ("priceCurrency".equals(key) && value instanceof String) { priceCurrency((String)value); return; }
      if ("issuedBy".equals(key) && value instanceof Organization) { issuedBy((Organization)value); return; }
      if ("dateIssued".equals(key) && value instanceof java.util.Date) { dateIssued((java.util.Date)value); return; }
      if ("ticketedSeat".equals(key) && value instanceof Seat) { ticketedSeat((Seat)value); return; }
      if ("ticketNumber".equals(key) && value instanceof String) { ticketNumber((String)value); return; }
      if ("ticketToken".equals(key) && value instanceof String) { ticketToken((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
