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
 * A reservation for train travel.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
 */
public class TrainReservation extends Reservation {
  /**
   * Builder for {@link TrainReservation}
   */
  public static final class Builder {
    /**
     * Creates new {@link TrainReservation} instance.
     */
    public TrainReservation build() {
      return new TrainReservation(bookingTime, reservationStatus, modifiedTime, provider, totalPrice, reservationId, priceCurrency, name, underName, mainEntityOfPage, reservedTicket, additionalType, url, sameAs, broker, programMembershipUsed, reservationFor, alternateName, description, potentialAction);
    }
    /**
     * The date and time the reservation was booked.
     */
    public Builder bookingTime(java.util.Date date) {
      this.bookingTime = date;
      return this;
    }
    /**
     * The current status of the reservation.
     */
    public Builder reservationStatus(ReservationStatusType reservationStatusType) {
      this.reservationStatus = reservationStatusType;
      return this;
    }
    /**
     * The date and time the reservation was modified.
     */
    public Builder modifiedTime(java.util.Date date) {
      this.modifiedTime = date;
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
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(PriceSpecification priceSpecification) {
      this.totalPrice.setPriceSpecification(priceSpecification);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(String totalPrice) {
      this.totalPrice.setString(totalPrice);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(Number number) {
      this.totalPrice.setNumber(number);
      return this;
    }
    /**
     * A unique identifier for the reservation.
     */
    public Builder reservationId(String reservationId) {
      this.reservationId = reservationId;
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    public Builder priceCurrency(String priceCurrency) {
      this.priceCurrency = priceCurrency;
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
     * The person or organization the reservation or ticket is for.
     */
    public Builder underName(Organization organization) {
      this.underName.setOrganization(organization);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    public Builder underName(Person person) {
      this.underName.setPerson(person);
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
     * A ticket associated with the reservation.
     */
    public Builder reservedTicket(Ticket ticket) {
      this.reservedTicket = ticket;
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
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
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
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Organization organization) {
      this.broker.setOrganization(organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Person person) {
      this.broker.setPerson(person);
      return this;
    }
    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     */
    public Builder programMembershipUsed(ProgramMembership programMembership) {
      this.programMembershipUsed = programMembership;
      return this;
    }
    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     */
    public Builder reservationFor(Thing thing) {
      this.reservationFor = thing;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    private java.util.Date bookingTime;
    private ReservationStatusType reservationStatus;
    private java.util.Date modifiedTime;
    private OrganizationOrPerson provider;
    private PriceSpecificationOrStringOrNumber totalPrice;
    private String reservationId;
    private String priceCurrency;
    private String name;
    private OrganizationOrPerson underName;
    private StringOrCreativeWork mainEntityOfPage;
    private Ticket reservedTicket;
    private String additionalType;
    private String url;
    private String sameAs;
    private OrganizationOrPerson broker;
    private ProgramMembership programMembershipUsed;
    private Thing reservationFor;
    private String alternateName;
    private String description;
    private Action potentialAction;
  }

  protected TrainReservation(java.util.Date bookingTime, ReservationStatusType reservationStatus, java.util.Date modifiedTime, OrganizationOrPerson provider, PriceSpecificationOrStringOrNumber totalPrice, String reservationId, String priceCurrency, String name, OrganizationOrPerson underName, StringOrCreativeWork mainEntityOfPage, Ticket reservedTicket, String additionalType, String url, String sameAs, OrganizationOrPerson broker, ProgramMembership programMembershipUsed, Thing reservationFor, String alternateName, String description, Action potentialAction) {
    super(bookingTime, reservationStatus, modifiedTime, provider, reservationId, totalPrice, priceCurrency, name, underName, mainEntityOfPage, reservedTicket, sameAs, url, additionalType, broker, reservationFor, programMembershipUsed, alternateName, potentialAction, description);
  }
}
