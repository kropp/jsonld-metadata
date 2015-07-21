/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * Describes a reservation for travel, dining or an event. Some reservations require tickets.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use http://schema.org/Offer.
 */
public class Reservation extends Intangible {
  /**
   * A unique identifier for the reservation.
   */
  public String getReservationId() {
    return myReservationId;
  }
  /**
   * The current status of the reservation.
   */
  public ReservationStatusType getReservationStatus() {
    return myReservationStatus;
  }
  /**
   * The thing -- flight, event, restaurant,etc. being reserved.
   */
  public Thing getReservationFor() {
    return myReservationFor;
  }
  /**
   * The person or organization the reservation or ticket is for.
   */
  public Person getUnderName() {
    return myUnderName;
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public Person getProvider() {
    return myProvider;
  }
  /**
   * The date and time the reservation was booked.
   */
  public java.util.Date getBookingTime() {
    return myBookingTime;
  }
  /**
   * The date and time the reservation was modified.
   */
  public java.util.Date getModifiedTime() {
    return myModifiedTime;
  }
  /**
   * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
   */
  public ProgramMembership getProgramMembershipUsed() {
    return myProgramMembershipUsed;
  }
  /**
   * A ticket associated with the reservation.
   */
  public Ticket getReservedTicket() {
    return myReservedTicket;
  }
  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
   */
  public Number getTotalPrice() {
    return myTotalPrice;
  }
  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
   */
  public String getPriceCurrency() {
    return myPriceCurrency;
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  public Person getBroker() {
    return myBroker;
  }
  /**
   * Builder for {@see Reservation}
   */
  public static final class Builder {
    public Reservation build() {
      return new Reservation(reservedTicket, mainEntityOfPage, priceCurrency, reservationStatus, alternateName, potentialAction, url, additionalType, modifiedTime, sameAs, underName, bookingTime, name, image, reservationFor, reservationId, broker, description, programMembershipUsed, totalPrice, provider);
    }
    /**
     * A ticket associated with the reservation.
     */
    public Builder reservedTicket(Ticket value) {
      reservedTicket = value;
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
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    public Builder priceCurrency(String value) {
      priceCurrency = value;
      return this;
    }
    /**
     * The current status of the reservation.
     */
    public Builder reservationStatus(ReservationStatusType value) {
      reservationStatus = value;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * The date and time the reservation was modified.
     */
    public Builder modifiedTime(java.util.Date value) {
      modifiedTime = value;
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
     * The person or organization the reservation or ticket is for.
     */
    public Builder underName(Person value) {
      underName = value;
      return this;
    }
    /**
     * The date and time the reservation was booked.
     */
    public Builder bookingTime(java.util.Date value) {
      bookingTime = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     */
    public Builder reservationFor(Thing value) {
      reservationFor = value;
      return this;
    }
    /**
     * A unique identifier for the reservation.
     */
    public Builder reservationId(String value) {
      reservationId = value;
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Person value) {
      broker = value;
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
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     */
    public Builder programMembershipUsed(ProgramMembership value) {
      programMembershipUsed = value;
      return this;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(Number value) {
      totalPrice = value;
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person value) {
      provider = value;
      return this;
    }
    private Ticket reservedTicket;
    private CreativeWork mainEntityOfPage;
    private String priceCurrency;
    private ReservationStatusType reservationStatus;
    private String alternateName;
    private Action potentialAction;
    private String url;
    private String additionalType;
    private java.util.Date modifiedTime;
    private String sameAs;
    private Person underName;
    private java.util.Date bookingTime;
    private String name;
    private Image image;
    private Thing reservationFor;
    private String reservationId;
    private Person broker;
    private String description;
    private ProgramMembership programMembershipUsed;
    private Number totalPrice;
    private Person provider;
  }

  protected Reservation(Ticket reservedTicket, CreativeWork mainEntityOfPage, String priceCurrency, ReservationStatusType reservationStatus, String alternateName, Action potentialAction, String url, String additionalType, java.util.Date modifiedTime, String sameAs, Person underName, java.util.Date bookingTime, String name, Image image, Thing reservationFor, String reservationId, Person broker, String description, ProgramMembership programMembershipUsed, Number totalPrice, Person provider) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    myReservationId = reservationId;
    myReservationStatus = reservationStatus;
    myReservationFor = reservationFor;
    myUnderName = underName;
    myProvider = provider;
    myBookingTime = bookingTime;
    myModifiedTime = modifiedTime;
    myProgramMembershipUsed = programMembershipUsed;
    myReservedTicket = reservedTicket;
    myTotalPrice = totalPrice;
    myPriceCurrency = priceCurrency;
    myBroker = broker;
  }
  private String myReservationId;
  private ReservationStatusType myReservationStatus;
  private Thing myReservationFor;
  private Person myUnderName;
  private Person myProvider;
  private java.util.Date myBookingTime;
  private java.util.Date myModifiedTime;
  private ProgramMembership myProgramMembershipUsed;
  private Ticket myReservedTicket;
  private Number myTotalPrice;
  private String myPriceCurrency;
  private Person myBroker;
}
