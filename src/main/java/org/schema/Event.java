/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the 'offers' property. Repeated events may be structured as separate Event objects.
 * Equivalent class: http://purl.org/dc/dcmitype/Event
 */
public class Event extends Thing {
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating getAggregateRating() {
    return myAggregateRating;
  }
  /**
   * An organizer of an Event.
   */
  public Person getOrganizer() {
    return myOrganizer;
  }
  /**
   * A person or organization attending the event.
   */
  public Organization getAttendee() {
    return myAttendee;
  }
  /**
   * The time admission will commence.
   */
  public java.util.Date getDoorTime() {
    return myDoorTime;
  }
  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>.
   */
  public Duration getDuration() {
    return myDuration;
  }
  /**
   * The end date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
   */
  public java.util.Date getEndDate() {
    return myEndDate;
  }
  /**
   * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
   */
  public EventStatusType getEventStatus() {
    return myEventStatus;
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
   */
  public String getInLanguage() {
    return myInLanguage;
  }
  public Location getLocation() {
    return myLocation;
  }
  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
   */
  public Offer getOffers() {
    return myOffers;
  }
  /**
   * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
   */
  public Organization getPerformer() {
    return myPerformer;
  }
  /**
   * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
   */
  public java.util.Date getPreviousStartDate() {
    return myPreviousStartDate;
  }
  /**
   * The CreativeWork that captured all or part of this Event.
   */
  public CreativeWork getRecordedIn() {
    return myRecordedIn;
  }
  /**
   * A review of the item.
   */
  public Review getReview() {
    return myReview;
  }
  /**
   * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
   */
  public java.util.Date getStartDate() {
    return myStartDate;
  }
  /**
   * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
   */
  public Event getSubEvent() {
    return mySubEvent;
  }
  /**
   * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
   */
  public Event getSuperEvent() {
    return mySuperEvent;
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   */
  public String getTypicalAgeRange() {
    return myTypicalAgeRange;
  }
  /**
   * A work performed in some event, for example a play performed in a TheaterEvent.
   */
  public CreativeWork getWorkPerformed() {
    return myWorkPerformed;
  }
  /**
   * Builder for {@see Event}
   */
  public static final class Builder {
    public Event build() {
      return new Event(performer, review, offers, endDate, potentialAction, duration, additionalType, inLanguage, image, workPerformed, attendee, previousStartDate, description, mainEntityOfPage, organizer, doorTime, alternateName, eventStatus, url, superEvent, sameAs, aggregateRating, startDate, subEvent, name, recordedIn, typicalAgeRange, location);
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    public Builder performer(Organization value) {
      performer = value;
      return this;
    }
    /**
     * A review of the item.
     */
    public Builder review(Review value) {
      review = value;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer value) {
      offers = value;
      return this;
    }
    /**
     * The end date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    public Builder endDate(java.util.Date value) {
      endDate = value;
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
     * The duration of the item (movie, audio recording, event, etc.) in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>.
     */
    public Builder duration(Duration value) {
      duration = value;
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
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    public Builder inLanguage(String value) {
      inLanguage = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * A work performed in some event, for example a play performed in a TheaterEvent.
     */
    public Builder workPerformed(CreativeWork value) {
      workPerformed = value;
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    public Builder attendee(Organization value) {
      attendee = value;
      return this;
    }
    /**
     * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
     */
    public Builder previousStartDate(java.util.Date value) {
      previousStartDate = value;
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
     * An organizer of an Event.
     */
    public Builder organizer(Person value) {
      organizer = value;
      return this;
    }
    /**
     * The time admission will commence.
     */
    public Builder doorTime(java.util.Date value) {
      doorTime = value;
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
     * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
     */
    public Builder eventStatus(EventStatusType value) {
      eventStatus = value;
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
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     */
    public Builder superEvent(Event value) {
      superEvent = value;
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
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating value) {
      aggregateRating = value;
      return this;
    }
    /**
     * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    public Builder startDate(java.util.Date value) {
      startDate = value;
      return this;
    }
    /**
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     */
    public Builder subEvent(Event value) {
      subEvent = value;
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
     * The CreativeWork that captured all or part of this Event.
     */
    public Builder recordedIn(CreativeWork value) {
      recordedIn = value;
      return this;
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    public Builder typicalAgeRange(String value) {
      typicalAgeRange = value;
      return this;
    }
    public Builder location(Location value) {
      location = value;
      return this;
    }
    private Organization performer;
    private Review review;
    private Offer offers;
    private java.util.Date endDate;
    private Action potentialAction;
    private Duration duration;
    private String additionalType;
    private String inLanguage;
    private Image image;
    private CreativeWork workPerformed;
    private Organization attendee;
    private java.util.Date previousStartDate;
    private String description;
    private CreativeWork mainEntityOfPage;
    private Person organizer;
    private java.util.Date doorTime;
    private String alternateName;
    private EventStatusType eventStatus;
    private String url;
    private Event superEvent;
    private String sameAs;
    private AggregateRating aggregateRating;
    private java.util.Date startDate;
    private Event subEvent;
    private String name;
    private CreativeWork recordedIn;
    private String typicalAgeRange;
    private Location location;
  }

  protected Event(Organization performer, Review review, Offer offers, java.util.Date endDate, Action potentialAction, Duration duration, String additionalType, String inLanguage, Image image, CreativeWork workPerformed, Organization attendee, java.util.Date previousStartDate, String description, CreativeWork mainEntityOfPage, Person organizer, java.util.Date doorTime, String alternateName, EventStatusType eventStatus, String url, Event superEvent, String sameAs, AggregateRating aggregateRating, java.util.Date startDate, Event subEvent, String name, CreativeWork recordedIn, String typicalAgeRange, Location location) {
    super(mainEntityOfPage, name, image, potentialAction, alternateName, url, additionalType, description, sameAs);
    myAggregateRating = aggregateRating;
    myOrganizer = organizer;
    myAttendee = attendee;
    myDoorTime = doorTime;
    myDuration = duration;
    myEndDate = endDate;
    myEventStatus = eventStatus;
    myInLanguage = inLanguage;
    myLocation = location;
    myOffers = offers;
    myPerformer = performer;
    myPreviousStartDate = previousStartDate;
    myRecordedIn = recordedIn;
    myReview = review;
    myStartDate = startDate;
    mySubEvent = subEvent;
    mySuperEvent = superEvent;
    myTypicalAgeRange = typicalAgeRange;
    myWorkPerformed = workPerformed;
  }
  private AggregateRating myAggregateRating;
  private Person myOrganizer;
  private Organization myAttendee;
  private java.util.Date myDoorTime;
  private Duration myDuration;
  private java.util.Date myEndDate;
  private EventStatusType myEventStatus;
  private String myInLanguage;
  private Location myLocation;
  private Offer myOffers;
  private Organization myPerformer;
  private java.util.Date myPreviousStartDate;
  private CreativeWork myRecordedIn;
  private Review myReview;
  private java.util.Date myStartDate;
  private Event mySubEvent;
  private Event mySuperEvent;
  private String myTypicalAgeRange;
  private CreativeWork myWorkPerformed;
}
