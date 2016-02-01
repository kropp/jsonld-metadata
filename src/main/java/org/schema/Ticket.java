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
import org.jetbrains.annotations.NotNull;

/**
 * Used to describe a ticket to an event, a flight, a bus ride, etc.
 */
public class Ticket extends Intangible {
  /**
   * The person or organization the reservation or ticket is for.
   */
  public OrganizationOrPerson getUnderName() { return myUnderName; }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  public Number getTotalPrice() { return myTotalPrice; }
  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
   */
  public String getPriceCurrency() { return myPriceCurrency; }
  /**
   * The organization issuing the ticket or permit.
   */
  public Organization getIssuedBy() { return myIssuedBy; }
  /**
   * The date the ticket was issued.
   */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getDateIssued() { return myDateIssued; }
  /**
   * The seat associated with the ticket.
   */
  public Seat getTicketedSeat() { return myTicketedSeat; }
  /**
   * The unique identifier for the ticket.
   */
  public String getTicketNumber() { return myTicketNumber; }
  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
   */
  public String getTicketToken() { return myTicketToken; }
  protected Ticket(OrganizationOrPerson underName, Number totalPrice, String priceCurrency, Organization issuedBy, java.util.Date dateIssued, Seat ticketedSeat, String ticketNumber, String ticketToken, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myUnderName = underName;
    myTotalPrice = totalPrice;
    myPriceCurrency = priceCurrency;
    myIssuedBy = issuedBy;
    myDateIssued = dateIssued;
    myTicketedSeat = ticketedSeat;
    myTicketNumber = ticketNumber;
    myTicketToken = ticketToken;
    myUnderName = underName;
    myTotalPrice = totalPrice;
    myPriceCurrency = priceCurrency;
    myIssuedBy = issuedBy;
    myDateIssued = dateIssued;
    myTicketedSeat = ticketedSeat;
    myTicketNumber = ticketNumber;
    myTicketToken = ticketToken;
  }
  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myUnderName != null ? myUnderName.hashCode() : 0);
    result = 31 * result + (myTotalPrice != null ? myTotalPrice.hashCode() : 0);
    result = 31 * result + (myPriceCurrency != null ? myPriceCurrency.hashCode() : 0);
    result = 31 * result + (myIssuedBy != null ? myIssuedBy.hashCode() : 0);
    result = 31 * result + (myDateIssued != null ? myDateIssued.hashCode() : 0);
    result = 31 * result + (myTicketedSeat != null ? myTicketedSeat.hashCode() : 0);
    result = 31 * result + (myTicketNumber != null ? myTicketNumber.hashCode() : 0);
    result = 31 * result + (myTicketToken != null ? myTicketToken.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Ticket ticket = (Ticket) o;
    if (!super.equals(o)) return false;
    if (myUnderName != null ? !myUnderName.equals(ticket.myUnderName) : ticket.myUnderName != null) return false;
    if (myTotalPrice != null ? !myTotalPrice.equals(ticket.myTotalPrice) : ticket.myTotalPrice != null) return false;
    if (myPriceCurrency != null ? !myPriceCurrency.equals(ticket.myPriceCurrency) : ticket.myPriceCurrency != null) return false;
    if (myIssuedBy != null ? !myIssuedBy.equals(ticket.myIssuedBy) : ticket.myIssuedBy != null) return false;
    if (myDateIssued != null ? !myDateIssued.equals(ticket.myDateIssued) : ticket.myDateIssued != null) return false;
    if (myTicketedSeat != null ? !myTicketedSeat.equals(ticket.myTicketedSeat) : ticket.myTicketedSeat != null) return false;
    if (myTicketNumber != null ? !myTicketNumber.equals(ticket.myTicketNumber) : ticket.myTicketNumber != null) return false;
    if (myTicketToken != null ? !myTicketToken.equals(ticket.myTicketToken) : ticket.myTicketToken != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link Ticket}
   */
  public static class Builder implements ThingBuilder<Ticket> {
    public Ticket build() {
      return new Ticket(underName, totalPrice, priceCurrency, issuedBy, dateIssued, ticketedSeat, ticketNumber, ticketToken, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Organization organization) {
      if (this.underName == null) this.underName = new OrganizationOrPerson();
      this.underName.setOrganization(organization);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Organization.Builder organization) {
      return this.underName(organization.build());
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Person person) {
      if (this.underName == null) this.underName = new OrganizationOrPerson();
      this.underName.setPerson(person);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    @NotNull public Builder underName(@NotNull Person.Builder person) {
      return this.underName(person.build());
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    @NotNull public Builder totalPrice(@NotNull Integer integer) {
      if (this.totalPrice == null) this.totalPrice = new Number();
      this.totalPrice.setInteger(integer);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    @NotNull public Builder totalPrice(@NotNull Long totalPrice) {
      if (this.totalPrice == null) this.totalPrice = new Number();
      this.totalPrice.setLong(totalPrice);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    @NotNull public Builder totalPrice(@NotNull Float totalPrice) {
      if (this.totalPrice == null) this.totalPrice = new Number();
      this.totalPrice.setFloat(totalPrice);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    @NotNull public Builder totalPrice(@NotNull Double totalPrice) {
      if (this.totalPrice == null) this.totalPrice = new Number();
      this.totalPrice.setDouble(totalPrice);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    @NotNull public Builder totalPrice(@NotNull String totalPrice) {
      if (this.totalPrice == null) this.totalPrice = new Number();
      this.totalPrice.setString(totalPrice);
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    @NotNull public Builder priceCurrency(@NotNull String priceCurrency) {
      this.priceCurrency = priceCurrency;
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    @NotNull public Builder issuedBy(@NotNull Organization organization) {
      this.issuedBy = organization;
      return this;
    }
    /**
     * The organization issuing the ticket or permit.
     */
    @NotNull public Builder issuedBy(@NotNull Organization.Builder organization) {
      return this.issuedBy(organization.build());
    }
    /**
     * The date the ticket was issued.
     */
    @NotNull public Builder dateIssued(@NotNull java.util.Date date) {
      this.dateIssued = date;
      return this;
    }
    /**
     * The seat associated with the ticket.
     */
    @NotNull public Builder ticketedSeat(@NotNull Seat seat) {
      this.ticketedSeat = seat;
      return this;
    }
    /**
     * The seat associated with the ticket.
     */
    @NotNull public Builder ticketedSeat(@NotNull Seat.Builder seat) {
      return this.ticketedSeat(seat.build());
    }
    /**
     * The unique identifier for the ticket.
     */
    @NotNull public Builder ticketNumber(@NotNull String ticketNumber) {
      this.ticketNumber = ticketNumber;
      return this;
    }
    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     */
    @NotNull public Builder ticketToken(@NotNull String ticketToken) {
      this.ticketToken = ticketToken;
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
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
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
        if ("underName".equals(key) && value instanceof Organization) { underName((Organization)value); continue; }
        if ("underName".equals(key) && value instanceof Person) { underName((Person)value); continue; }
        if ("totalPrice".equals(key) && value instanceof Integer) { totalPrice((Integer)value); continue; }
        if ("totalPrice".equals(key) && value instanceof Long) { totalPrice((Long)value); continue; }
        if ("totalPrice".equals(key) && value instanceof Float) { totalPrice((Float)value); continue; }
        if ("totalPrice".equals(key) && value instanceof Double) { totalPrice((Double)value); continue; }
        if ("totalPrice".equals(key) && value instanceof String) { totalPrice((String)value); continue; }
        if ("priceCurrency".equals(key) && value instanceof String) { priceCurrency((String)value); continue; }
        if ("issuedBy".equals(key) && value instanceof Organization) { issuedBy((Organization)value); continue; }
        if ("dateIssued".equals(key) && value instanceof java.util.Date) { dateIssued((java.util.Date)value); continue; }
        if ("ticketedSeat".equals(key) && value instanceof Seat) { ticketedSeat((Seat)value); continue; }
        if ("ticketNumber".equals(key) && value instanceof String) { ticketNumber((String)value); continue; }
        if ("ticketToken".equals(key) && value instanceof String) { ticketToken((String)value); continue; }
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
    private OrganizationOrPerson underName;
    private Number totalPrice;
    private String priceCurrency;
    private Organization issuedBy;
    private java.util.Date dateIssued;
    private Seat ticketedSeat;
    private String ticketNumber;
    private String ticketToken;
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
  
  private OrganizationOrPerson myUnderName;
  private Number myTotalPrice;
  private String myPriceCurrency;
  private Organization myIssuedBy;
  private java.util.Date myDateIssued;
  private Seat myTicketedSeat;
  private String myTicketNumber;
  private String myTicketToken;
}
