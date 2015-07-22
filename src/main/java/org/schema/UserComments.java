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
 * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
  *           <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
  *       
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews
 */
public class UserComments extends UserInteraction {
  /**
   * The text of the UserComment.
   */
  public String getCommentText() {
    return myCommentText;
  }
  /**
   * The time at which the UserComment was made.
   */
  public java.util.Date getCommentTime() {
    return myCommentTime;
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  public OrganizationOrPerson getCreator() {
    return myCreator;
  }
  /**
   * Specifies the CreativeWork associated with the UserComment.
   */
  public CreativeWork getDiscusses() {
    return myDiscusses;
  }
  /**
   * The URL at which a reply may be posted to the specified UserComment.
   */
  public String getReplyToUrl() {
    return myReplyToUrl;
  }
  /**
   * Builder for {@link UserComments}
   */
  public static final class Builder {
    /**
     * Creates new {@link UserComments} instance.
     */
    public UserComments build() {
      return new UserComments(aggregateRating, review, endDate, attendee, additionalType, sameAs, commentTime, subEvent, workPerformed, potentialAction, eventStatus, commentText, duration, startDate, typicalAgeRange, organizer, doorTime, inLanguage, superEvent, name, mainEntityOfPage, recordedIn, previousStartDate, url, replyToUrl, performer, alternateName, description, offers, discusses, creator);
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * A review of the item.
     */
    public Builder review(Review review) {
      this.review = review;
      return this;
    }
    /**
     * The end date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    public Builder endDate(java.util.Date date) {
      this.endDate = date;
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    public Builder attendee(Organization organization) {
      this.attendee.setOrganization(organization);
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    public Builder attendee(Person person) {
      this.attendee.setPerson(person);
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * The time at which the UserComment was made.
     */
    public Builder commentTime(java.util.Date date) {
      this.commentTime = date;
      return this;
    }
    /**
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     */
    public Builder subEvent(Event event) {
      this.subEvent = event;
      return this;
    }
    /**
     * A work performed in some event, for example a play performed in a TheaterEvent.
     */
    public Builder workPerformed(CreativeWork creativeWork) {
      this.workPerformed = creativeWork;
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
     * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
     */
    public Builder eventStatus(EventStatusType eventStatusType) {
      this.eventStatus = eventStatusType;
      return this;
    }
    /**
     * The text of the UserComment.
     */
    public Builder commentText(String commentText) {
      this.commentText = commentText;
      return this;
    }
    /**
     * The duration of the item (movie, audio recording, event, etc.) in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>.
     */
    public Builder duration(Duration duration) {
      this.duration = duration;
      return this;
    }
    /**
     * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    public Builder startDate(java.util.Date date) {
      this.startDate = date;
      return this;
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    public Builder typicalAgeRange(String typicalAgeRange) {
      this.typicalAgeRange = typicalAgeRange;
      return this;
    }
    /**
     * An organizer of an Event.
     */
    public Builder organizer(Organization organization) {
      this.organizer.setOrganization(organization);
      return this;
    }
    /**
     * An organizer of an Event.
     */
    public Builder organizer(Person person) {
      this.organizer.setPerson(person);
      return this;
    }
    /**
     * The time admission will commence.
     */
    public Builder doorTime(java.util.Date date) {
      this.doorTime = date;
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    public Builder inLanguage(Language language) {
      this.inLanguage.setLanguage(language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    public Builder inLanguage(String inLanguage) {
      this.inLanguage.setString(inLanguage);
      return this;
    }
    /**
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     */
    public Builder superEvent(Event event) {
      this.superEvent = event;
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
     * The CreativeWork that captured all or part of this Event.
     */
    public Builder recordedIn(CreativeWork creativeWork) {
      this.recordedIn = creativeWork;
      return this;
    }
    /**
     * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
     */
    public Builder previousStartDate(java.util.Date date) {
      this.previousStartDate = date;
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
     * The URL at which a reply may be posted to the specified UserComment.
     */
    public Builder replyToUrl(String replyToUrl) {
      this.replyToUrl = replyToUrl;
      return this;
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    public Builder performer(Organization organization) {
      this.performer.setOrganization(organization);
      return this;
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    public Builder performer(Person person) {
      this.performer.setPerson(person);
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
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer offer) {
      this.offers = offer;
      return this;
    }
    /**
     * Specifies the CreativeWork associated with the UserComment.
     */
    public Builder discusses(CreativeWork creativeWork) {
      this.discusses = creativeWork;
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    public Builder creator(Organization organization) {
      this.creator.setOrganization(organization);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    public Builder creator(Person person) {
      this.creator.setPerson(person);
      return this;
    }
    private AggregateRating aggregateRating;
    private Review review;
    private java.util.Date endDate;
    private OrganizationOrPerson attendee;
    private String additionalType;
    private String sameAs;
    private java.util.Date commentTime;
    private Event subEvent;
    private CreativeWork workPerformed;
    private Action potentialAction;
    private EventStatusType eventStatus;
    private String commentText;
    private Duration duration;
    private java.util.Date startDate;
    private String typicalAgeRange;
    private OrganizationOrPerson organizer;
    private java.util.Date doorTime;
    private LanguageOrString inLanguage;
    private Event superEvent;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private CreativeWork recordedIn;
    private java.util.Date previousStartDate;
    private String url;
    private String replyToUrl;
    private OrganizationOrPerson performer;
    private String alternateName;
    private String description;
    private Offer offers;
    private CreativeWork discusses;
    private OrganizationOrPerson creator;
  }

  protected UserComments(AggregateRating aggregateRating, Review review, java.util.Date endDate, OrganizationOrPerson attendee, String additionalType, String sameAs, java.util.Date commentTime, Event subEvent, CreativeWork workPerformed, Action potentialAction, EventStatusType eventStatus, String commentText, Duration duration, java.util.Date startDate, String typicalAgeRange, OrganizationOrPerson organizer, java.util.Date doorTime, LanguageOrString inLanguage, Event superEvent, String name, StringOrCreativeWork mainEntityOfPage, CreativeWork recordedIn, java.util.Date previousStartDate, String url, String replyToUrl, OrganizationOrPerson performer, String alternateName, String description, Offer offers, CreativeWork discusses, OrganizationOrPerson creator) {
    super(aggregateRating, review, endDate, attendee, sameAs, additionalType, subEvent, workPerformed, potentialAction, eventStatus, duration, startDate, typicalAgeRange, organizer, doorTime, inLanguage, superEvent, name, mainEntityOfPage, recordedIn, previousStartDate, url, performer, alternateName, description, offers);
    myCommentText = commentText;
    myCommentTime = commentTime;
    myCreator = creator;
    myDiscusses = discusses;
    myReplyToUrl = replyToUrl;
  }
  private String myCommentText;
  private java.util.Date myCommentTime;
  private OrganizationOrPerson myCreator;
  private CreativeWork myDiscusses;
  private String myReplyToUrl;
}
