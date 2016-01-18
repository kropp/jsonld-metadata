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
 * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
  *           <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
  *       
 */
public class UserPageVisits extends UserInteraction {
  /**
   * Builder for {@link UserPageVisits}
   */
  static final class UserPageVisitsThingBuilder implements Builder {
    /**
     * Creates new {@link UserPageVisits} instance.
     */
    public UserPageVisits build() {
      return new UserPageVisits(aggregateRating, organizer, attendee, doorTime, duration, endDate, eventStatus, inLanguage, offers, performer, previousStartDate, recordedIn, review, startDate, subEvent, superEvent, typicalAgeRange, workPerformed, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(AggregateRating.Builder aggregateRating) {
      return this.aggregateRating(aggregateRating.build());
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(Organization organization) {
      if (this.organizer == null) this.organizer = new OrganizationOrPerson();
      this.organizer.setOrganization(organization);
      return this;
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(Organization.Builder organization) {
      return this.organizer(organization.build());
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(Person person) {
      if (this.organizer == null) this.organizer = new OrganizationOrPerson();
      this.organizer.setPerson(person);
      return this;
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(Person.Builder person) {
      return this.organizer(person.build());
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(Organization organization) {
      if (this.attendee == null) this.attendee = new OrganizationOrPerson();
      this.attendee.setOrganization(organization);
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(Organization.Builder organization) {
      return this.attendee(organization.build());
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(Person person) {
      if (this.attendee == null) this.attendee = new OrganizationOrPerson();
      this.attendee.setPerson(person);
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(Person.Builder person) {
      return this.attendee(person.build());
    }
    /**
     * The time admission will commence.
     */
    @NotNull public Builder doorTime(java.util.Date date) {
      this.doorTime = date;
      return this;
    }
    /**
     * The duration of the item (movie, audio recording, event, etc.) in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>.
     */
    @NotNull public Builder duration(Duration duration) {
      this.duration = duration;
      return this;
    }
    /**
     * The duration of the item (movie, audio recording, event, etc.) in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>.
     */
    @NotNull public Builder duration(Duration.Builder duration) {
      return this.duration(duration.build());
    }
    /**
     * The end date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    @NotNull public Builder endDate(java.util.Date date) {
      this.endDate = date;
      return this;
    }
    /**
     * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
     */
    @NotNull public Builder eventStatus(EventStatusType eventStatusType) {
      this.eventStatus = eventStatusType;
      return this;
    }
    /**
     * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
     */
    @NotNull public Builder eventStatus(EventStatusType.Builder eventStatusType) {
      return this.eventStatus(eventStatusType.build());
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(Language language) {
      if (this.inLanguage == null) this.inLanguage = new LanguageOrString();
      this.inLanguage.setLanguage(language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(Language.Builder language) {
      return this.inLanguage(language.build());
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(String inLanguage) {
      if (this.inLanguage == null) this.inLanguage = new LanguageOrString();
      this.inLanguage.setString(inLanguage);
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(Offer offer) {
      this.offers = offer;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(Offer.Builder offer) {
      return this.offers(offer.build());
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(Organization organization) {
      if (this.performer == null) this.performer = new OrganizationOrPerson();
      this.performer.setOrganization(organization);
      return this;
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(Organization.Builder organization) {
      return this.performer(organization.build());
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(Person person) {
      if (this.performer == null) this.performer = new OrganizationOrPerson();
      this.performer.setPerson(person);
      return this;
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(Person.Builder person) {
      return this.performer(person.build());
    }
    /**
     * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
     */
    @NotNull public Builder previousStartDate(java.util.Date date) {
      this.previousStartDate = date;
      return this;
    }
    /**
     * The CreativeWork that captured all or part of this Event.
     */
    @NotNull public Builder recordedIn(CreativeWork creativeWork) {
      this.recordedIn = creativeWork;
      return this;
    }
    /**
     * The CreativeWork that captured all or part of this Event.
     */
    @NotNull public Builder recordedIn(CreativeWork.Builder creativeWork) {
      return this.recordedIn(creativeWork.build());
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(Review review) {
      this.review = review;
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(Review.Builder review) {
      return this.review(review.build());
    }
    /**
     * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    @NotNull public Builder startDate(java.util.Date date) {
      this.startDate = date;
      return this;
    }
    /**
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     */
    @NotNull public Builder subEvent(Event event) {
      this.subEvent = event;
      return this;
    }
    /**
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     */
    @NotNull public Builder subEvent(Event.Builder event) {
      return this.subEvent(event.build());
    }
    /**
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     */
    @NotNull public Builder superEvent(Event event) {
      this.superEvent = event;
      return this;
    }
    /**
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     */
    @NotNull public Builder superEvent(Event.Builder event) {
      return this.superEvent(event.build());
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    @NotNull public Builder typicalAgeRange(String typicalAgeRange) {
      this.typicalAgeRange = typicalAgeRange;
      return this;
    }
    /**
     * A work performed in some event, for example a play performed in a TheaterEvent.
     */
    @NotNull public Builder workPerformed(CreativeWork creativeWork) {
      this.workPerformed = creativeWork;
      return this;
    }
    /**
     * A work performed in some event, for example a play performed in a TheaterEvent.
     */
    @NotNull public Builder workPerformed(CreativeWork.Builder creativeWork) {
      return this.workPerformed(creativeWork.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(String description) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private AggregateRating aggregateRating;
    private OrganizationOrPerson organizer;
    private OrganizationOrPerson attendee;
    private java.util.Date doorTime;
    private Duration duration;
    private java.util.Date endDate;
    private EventStatusType eventStatus;
    private LanguageOrString inLanguage;
    private Offer offers;
    private OrganizationOrPerson performer;
    private java.util.Date previousStartDate;
    private CreativeWork recordedIn;
    private Review review;
    private java.util.Date startDate;
    private Event subEvent;
    private Event superEvent;
    private String typicalAgeRange;
    private CreativeWork workPerformed;
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
  public interface Builder extends ThingBuilder<UserPageVisits> {
    @NotNull Builder aggregateRating(AggregateRating aggregateRating);
    @NotNull Builder aggregateRating(AggregateRating.Builder aggregateRating);
    @NotNull Builder organizer(Organization organization);
    @NotNull Builder organizer(Organization.Builder organization);
    @NotNull Builder organizer(Person person);
    @NotNull Builder organizer(Person.Builder person);
    @NotNull Builder attendee(Organization organization);
    @NotNull Builder attendee(Organization.Builder organization);
    @NotNull Builder attendee(Person person);
    @NotNull Builder attendee(Person.Builder person);
    @NotNull Builder doorTime(java.util.Date date);
    @NotNull Builder duration(Duration duration);
    @NotNull Builder duration(Duration.Builder duration);
    @NotNull Builder endDate(java.util.Date date);
    @NotNull Builder eventStatus(EventStatusType eventStatusType);
    @NotNull Builder eventStatus(EventStatusType.Builder eventStatusType);
    @NotNull Builder inLanguage(Language language);
    @NotNull Builder inLanguage(Language.Builder language);
    @NotNull Builder inLanguage(String inLanguage);
    @NotNull Builder offers(Offer offer);
    @NotNull Builder offers(Offer.Builder offer);
    @NotNull Builder performer(Organization organization);
    @NotNull Builder performer(Organization.Builder organization);
    @NotNull Builder performer(Person person);
    @NotNull Builder performer(Person.Builder person);
    @NotNull Builder previousStartDate(java.util.Date date);
    @NotNull Builder recordedIn(CreativeWork creativeWork);
    @NotNull Builder recordedIn(CreativeWork.Builder creativeWork);
    @NotNull Builder review(Review review);
    @NotNull Builder review(Review.Builder review);
    @NotNull Builder startDate(java.util.Date date);
    @NotNull Builder subEvent(Event event);
    @NotNull Builder subEvent(Event.Builder event);
    @NotNull Builder superEvent(Event event);
    @NotNull Builder superEvent(Event.Builder event);
    @NotNull Builder typicalAgeRange(String typicalAgeRange);
    @NotNull Builder workPerformed(CreativeWork creativeWork);
    @NotNull Builder workPerformed(CreativeWork.Builder creativeWork);
    @NotNull Builder additionalType(String additionalType);
    @NotNull Builder alternateName(String alternateName);
    @NotNull Builder description(String description);
    @NotNull Builder mainEntityOfPage(CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(String mainEntityOfPage);
    @NotNull Builder name(String name);
    @NotNull Builder sameAs(String sameAs);
    @NotNull Builder url(String url);
    @NotNull Builder potentialAction(Action action);
    @NotNull Builder potentialAction(Action.Builder action);
    @NotNull Builder id(String id);
  }

  protected UserPageVisits(AggregateRating aggregateRating, OrganizationOrPerson organizer, OrganizationOrPerson attendee, java.util.Date doorTime, Duration duration, java.util.Date endDate, EventStatusType eventStatus, LanguageOrString inLanguage, Offer offers, OrganizationOrPerson performer, java.util.Date previousStartDate, CreativeWork recordedIn, Review review, java.util.Date startDate, Event subEvent, Event superEvent, String typicalAgeRange, CreativeWork workPerformed, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(aggregateRating, organizer, attendee, doorTime, duration, endDate, eventStatus, inLanguage, offers, performer, previousStartDate, recordedIn, review, startDate, subEvent, superEvent, typicalAgeRange, workPerformed, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
  }
}
