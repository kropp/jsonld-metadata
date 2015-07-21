/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * Used to describe a ticket to an event, a flight, a bus ride, etc.
 */
public class Ticket extends Intangible {
  /**
   * The person or organization the reservation or ticket is for.
   */
  public Person getUnderName() {
    return myUnderName;
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
   * The organization issuing the ticket or permit.
   */
  public Organization getIssuedBy() {
    return myIssuedBy;
  }
  /**
   * The date the ticket was issued.
   */
  public java.util.Date getDateIssued() {
    return myDateIssued;
  }
  /**
   * The seat associated with the ticket.
   */
  public Seat getTicketedSeat() {
    return myTicketedSeat;
  }
  /**
   * The unique identifier for the ticket.
   */
  public String getTicketNumber() {
    return myTicketNumber;
  }
  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
   */
  public String getTicketToken() {
    return myTicketToken;
  }
  /**
   * Builder for {@see Ticket}
   */
  public static final class Builder {
    public Ticket build() {
      return new Ticket(mainEntityOfPage, priceCurrency, issuedBy, alternateName, potentialAction, dateIssued, url, additionalType, sameAs, underName, ticketNumber, image, name, ticketedSeat, ticketToken, description, totalPrice);
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
     * The organization issuing the ticket or permit.
     */
    public Builder issuedBy(Organization value) {
      issuedBy = value;
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
     * The date the ticket was issued.
     */
    public Builder dateIssued(java.util.Date value) {
      dateIssued = value;
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
     * The unique identifier for the ticket.
     */
    public Builder ticketNumber(String value) {
      ticketNumber = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    /**
     * The seat associated with the ticket.
     */
    public Builder ticketedSeat(Seat value) {
      ticketedSeat = value;
      return this;
    }
    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     */
    public Builder ticketToken(String value) {
      ticketToken = value;
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
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
     */
    public Builder totalPrice(Number value) {
      totalPrice = value;
      return this;
    }
    private CreativeWork mainEntityOfPage;
    private String priceCurrency;
    private Organization issuedBy;
    private String alternateName;
    private Action potentialAction;
    private java.util.Date dateIssued;
    private String url;
    private String additionalType;
    private String sameAs;
    private Person underName;
    private String ticketNumber;
    private Image image;
    private String name;
    private Seat ticketedSeat;
    private String ticketToken;
    private String description;
    private Number totalPrice;
  }

  protected Ticket(CreativeWork mainEntityOfPage, String priceCurrency, Organization issuedBy, String alternateName, Action potentialAction, java.util.Date dateIssued, String url, String additionalType, String sameAs, Person underName, String ticketNumber, Image image, String name, Seat ticketedSeat, String ticketToken, String description, Number totalPrice) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    myUnderName = underName;
    myTotalPrice = totalPrice;
    myPriceCurrency = priceCurrency;
    myIssuedBy = issuedBy;
    myDateIssued = dateIssued;
    myTicketedSeat = ticketedSeat;
    myTicketNumber = ticketNumber;
    myTicketToken = ticketToken;
  }
  private Person myUnderName;
  private Number myTotalPrice;
  private String myPriceCurrency;
  private Organization myIssuedBy;
  private java.util.Date myDateIssued;
  private Seat myTicketedSeat;
  private String myTicketNumber;
  private String myTicketToken;
}
