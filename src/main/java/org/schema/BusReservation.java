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
 * A reservation for bus travel.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
 */
public class BusReservation extends Reservation {
  /**
   * Builder for {@link BusReservation}
   */
  public static final class BusReservationThingBuilder implements Builder {
    /**
     * Creates new {@link BusReservation} instance.
     */
    public BusReservation build() {
      return new BusReservation(reservationId, reservationStatus, reservationFor, underName, provider, bookingTime, modifiedTime, programMembershipUsed, reservedTicket, totalPrice, priceCurrency, broker, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A unique identifier for the reservation.
     */
    public Builder reservationId(String reservationId) {
      this.reservationId = reservationId;
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
     * The current status of the reservation.
     */
    public Builder reservationStatus(ReservationStatusType.Builder reservationStatusType) {
      return this.reservationStatus(reservationStatusType.build());
    }
    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     */
    public Builder reservationFor(Thing thing) {
      this.reservationFor = thing;
      return this;
    }
    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     */
    public Builder reservationFor(Thing.Builder thing) {
      return this.reservationFor(thing.build());
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    public Builder underName(Organization organization) {
      if (this.underName == null) this.underName = new OrganizationOrPerson();
      this.underName.setOrganization(organization);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    public Builder underName(Organization.Builder organization) {
      return this.underName(organization.build());
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    public Builder underName(Person person) {
      if (this.underName == null) this.underName = new OrganizationOrPerson();
      this.underName.setPerson(person);
      return this;
    }
    /**
     * The person or organization the reservation or ticket is for.
     */
    public Builder underName(Person.Builder person) {
      return this.underName(person.build());
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
     * The date and time the reservation was booked.
     */
    public Builder bookingTime(java.util.Date date) {
      this.bookingTime = date;
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
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     */
    public Builder programMembershipUsed(ProgramMembership programMembership) {
      this.programMembershipUsed = programMembership;
      return this;
    }
    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     */
    public Builder programMembershipUsed(ProgramMembership.Builder programMembership) {
      return this.programMembershipUsed(programMembership.build());
    }
    /**
     * A ticket associated with the reservation.
     */
    public Builder reservedTicket(Ticket ticket) {
      this.reservedTicket = ticket;
      return this;
    }
    /**
     * A ticket associated with the reservation.
     */
    public Builder reservedTicket(Ticket.Builder ticket) {
      return this.reservedTicket(ticket.build());
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(Number number) {
      if (this.totalPrice == null) this.totalPrice = new NumberOrPriceSpecificationOrString();
      this.totalPrice.setNumber(number);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(PriceSpecification priceSpecification) {
      if (this.totalPrice == null) this.totalPrice = new NumberOrPriceSpecificationOrString();
      this.totalPrice.setPriceSpecification(priceSpecification);
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(PriceSpecification.Builder priceSpecification) {
      return this.totalPrice(priceSpecification.build());
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(String totalPrice) {
      if (this.totalPrice == null) this.totalPrice = new NumberOrPriceSpecificationOrString();
      this.totalPrice.setString(totalPrice);
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
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Organization organization) {
      if (this.broker == null) this.broker = new OrganizationOrPerson();
      this.broker.setOrganization(organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Organization.Builder organization) {
      return this.broker(organization.build());
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Person person) {
      if (this.broker == null) this.broker = new OrganizationOrPerson();
      this.broker.setPerson(person);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Person.Builder person) {
      return this.broker(person.build());
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
    private String reservationId;
    private ReservationStatusType reservationStatus;
    private Thing reservationFor;
    private OrganizationOrPerson underName;
    private OrganizationOrPerson provider;
    private java.util.Date bookingTime;
    private java.util.Date modifiedTime;
    private ProgramMembership programMembershipUsed;
    private Ticket reservedTicket;
    private NumberOrPriceSpecificationOrString totalPrice;
    private String priceCurrency;
    private OrganizationOrPerson broker;
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
  public interface Builder extends ThingBuilder<BusReservation> {
  Builder reservationId(String reservationId);
  Builder reservationStatus(ReservationStatusType reservationStatusType);
  Builder reservationStatus(ReservationStatusType.Builder reservationStatusType);
  Builder reservationFor(Thing thing);
  Builder reservationFor(Thing.Builder thing);
  Builder underName(Organization organization);
  Builder underName(Organization.Builder organization);
  Builder underName(Person person);
  Builder underName(Person.Builder person);
  Builder provider(Organization organization);
  Builder provider(Organization.Builder organization);
  Builder provider(Person person);
  Builder provider(Person.Builder person);
  Builder bookingTime(java.util.Date date);
  Builder modifiedTime(java.util.Date date);
  Builder programMembershipUsed(ProgramMembership programMembership);
  Builder programMembershipUsed(ProgramMembership.Builder programMembership);
  Builder reservedTicket(Ticket ticket);
  Builder reservedTicket(Ticket.Builder ticket);
  Builder totalPrice(Number number);
  Builder totalPrice(PriceSpecification priceSpecification);
  Builder totalPrice(PriceSpecification.Builder priceSpecification);
  Builder totalPrice(String totalPrice);
  Builder priceCurrency(String priceCurrency);
  Builder broker(Organization organization);
  Builder broker(Organization.Builder organization);
  Builder broker(Person person);
  Builder broker(Person.Builder person);
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

  protected BusReservation(String reservationId, ReservationStatusType reservationStatus, Thing reservationFor, OrganizationOrPerson underName, OrganizationOrPerson provider, java.util.Date bookingTime, java.util.Date modifiedTime, ProgramMembership programMembershipUsed, Ticket reservedTicket, NumberOrPriceSpecificationOrString totalPrice, String priceCurrency, OrganizationOrPerson broker, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(reservationId, reservationStatus, reservationFor, underName, provider, bookingTime, modifiedTime, programMembershipUsed, reservedTicket, totalPrice, priceCurrency, broker, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
  }
}
