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
import java.util.*;

/**
 * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the 'offers' property. Repeated events may be structured as separate Event objects.Equivalent class: http://purl.org/dc/dcmitype/Event
 */
public class Event extends Thing {
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  @JsonIgnore public AggregateRating getAggregateRating() {
    return (AggregateRating) getValue("aggregateRating");
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  @JsonIgnore public Collection<AggregateRating> getAggregateRatings() {
    final Object current = myData.get("aggregateRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AggregateRating>) current;
    }
    return Arrays.asList((AggregateRating) current);
  }
  /**
   * An organizer of an Event.
   */
  @JsonIgnore public Organization getOrganizerOrganization() {
    return (Organization) getValue("organizer");
  }
  /**
   * An organizer of an Event.
   */
  @JsonIgnore public Collection<Organization> getOrganizerOrganizations() {
    final Object current = myData.get("organizer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * An organizer of an Event.
   */
  @JsonIgnore public Person getOrganizerPerson() {
    return (Person) getValue("organizer");
  }
  /**
   * An organizer of an Event.
   */
  @JsonIgnore public Collection<Person> getOrganizerPersons() {
    final Object current = myData.get("organizer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A person or organization attending the event.
   */
  @JsonIgnore public Organization getAttendeeOrganization() {
    return (Organization) getValue("attendee");
  }
  /**
   * A person or organization attending the event.
   */
  @JsonIgnore public Collection<Organization> getAttendeeOrganizations() {
    final Object current = myData.get("attendee");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A person or organization attending the event.
   */
  @JsonIgnore public Person getAttendeePerson() {
    return (Person) getValue("attendee");
  }
  /**
   * A person or organization attending the event.
   */
  @JsonIgnore public Collection<Person> getAttendeePersons() {
    final Object current = myData.get("attendee");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The time admission will commence.
   */
  @JsonIgnore public java.util.Date getDoorTime() {
    return (java.util.Date) getValue("doorTime");
  }
  /**
   * The time admission will commence.
   */
  @JsonIgnore public Collection<java.util.Date> getDoorTimes() {
    final Object current = myData.get("doorTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>.
   */
  @JsonIgnore public Duration getDuration() {
    return (Duration) getValue("duration");
  }
  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>.
   */
  @JsonIgnore public Collection<Duration> getDurations() {
    final Object current = myData.get("duration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The end date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
   */
  @JsonIgnore public java.util.Date getEndDate() {
    return (java.util.Date) getValue("endDate");
  }
  /**
   * The end date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
   */
  @JsonIgnore public Collection<java.util.Date> getEndDates() {
    final Object current = myData.get("endDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
   */
  @JsonIgnore public EventStatusType getEventStatus() {
    return (EventStatusType) getValue("eventStatus");
  }
  /**
   * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
   */
  @JsonIgnore public Collection<EventStatusType> getEventStatuss() {
    final Object current = myData.get("eventStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<EventStatusType>) current;
    }
    return Arrays.asList((EventStatusType) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
   */
  @JsonIgnore public Language getInLanguageLanguage() {
    return (Language) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
   */
  @JsonIgnore public Collection<Language> getInLanguageLanguages() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
   */
  @JsonIgnore public String getInLanguageString() {
    return (String) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
   */
  @JsonIgnore public Collection<String> getInLanguageStrings() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
   */
  @JsonIgnore public Offer getOffers() {
    return (Offer) getValue("offers");
  }
  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
   */
  @JsonIgnore public Collection<Offer> getOfferss() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
   */
  @JsonIgnore public Organization getPerformerOrganization() {
    return (Organization) getValue("performer");
  }
  /**
   * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
   */
  @JsonIgnore public Collection<Organization> getPerformerOrganizations() {
    final Object current = myData.get("performer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
   */
  @JsonIgnore public Person getPerformerPerson() {
    return (Person) getValue("performer");
  }
  /**
   * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
   */
  @JsonIgnore public Collection<Person> getPerformerPersons() {
    final Object current = myData.get("performer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
   */
  @JsonIgnore public java.util.Date getPreviousStartDate() {
    return (java.util.Date) getValue("previousStartDate");
  }
  /**
   * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
   */
  @JsonIgnore public Collection<java.util.Date> getPreviousStartDates() {
    final Object current = myData.get("previousStartDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The CreativeWork that captured all or part of this Event.
   */
  @JsonIgnore public CreativeWork getRecordedIn() {
    return (CreativeWork) getValue("recordedIn");
  }
  /**
   * The CreativeWork that captured all or part of this Event.
   */
  @JsonIgnore public Collection<CreativeWork> getRecordedIns() {
    final Object current = myData.get("recordedIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A review of the item.
   */
  @JsonIgnore public Review getReview() {
    return (Review) getValue("review");
  }
  /**
   * A review of the item.
   */
  @JsonIgnore public Collection<Review> getReviews() {
    final Object current = myData.get("review");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Review>) current;
    }
    return Arrays.asList((Review) current);
  }
  /**
   * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
   */
  @JsonIgnore public java.util.Date getStartDate() {
    return (java.util.Date) getValue("startDate");
  }
  /**
   * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
   */
  @JsonIgnore public Collection<java.util.Date> getStartDates() {
    final Object current = myData.get("startDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
   */
  @JsonIgnore public Event getSubEvent() {
    return (Event) getValue("subEvent");
  }
  /**
   * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
   */
  @JsonIgnore public Collection<Event> getSubEvents() {
    final Object current = myData.get("subEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
   */
  @JsonIgnore public Event getSuperEvent() {
    return (Event) getValue("superEvent");
  }
  /**
   * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
   */
  @JsonIgnore public Collection<Event> getSuperEvents() {
    final Object current = myData.get("superEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   */
  @JsonIgnore public String getTypicalAgeRange() {
    return (String) getValue("typicalAgeRange");
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   */
  @JsonIgnore public Collection<String> getTypicalAgeRanges() {
    final Object current = myData.get("typicalAgeRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A work performed in some event, for example a play performed in a TheaterEvent.
   */
  @JsonIgnore public CreativeWork getWorkPerformed() {
    return (CreativeWork) getValue("workPerformed");
  }
  /**
   * A work performed in some event, for example a play performed in a TheaterEvent.
   */
  @JsonIgnore public Collection<CreativeWork> getWorkPerformeds() {
    final Object current = myData.get("workPerformed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  protected Event(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Event}
   */
  public static class Builder extends Thing.Builder {
    public Event build() {
      return new Event(myData);
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(@NotNull Organization organization) {
      putValue("organizer", organization);
      return this;
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(@NotNull Organization.Builder organization) {
      putValue("organizer", organization.build());
      return this;
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(@NotNull Person person) {
      putValue("organizer", person);
      return this;
    }
    /**
     * An organizer of an Event.
     */
    @NotNull public Builder organizer(@NotNull Person.Builder person) {
      putValue("organizer", person.build());
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(@NotNull Organization organization) {
      putValue("attendee", organization);
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(@NotNull Organization.Builder organization) {
      putValue("attendee", organization.build());
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(@NotNull Person person) {
      putValue("attendee", person);
      return this;
    }
    /**
     * A person or organization attending the event.
     */
    @NotNull public Builder attendee(@NotNull Person.Builder person) {
      putValue("attendee", person.build());
      return this;
    }
    /**
     * The time admission will commence.
     */
    @NotNull public Builder doorTime(@NotNull java.util.Date date) {
      putValue("doorTime", date);
      return this;
    }
    /**
     * The duration of the item (movie, audio recording, event, etc.) in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>.
     */
    @NotNull public Builder duration(@NotNull Duration duration) {
      putValue("duration", duration);
      return this;
    }
    /**
     * The duration of the item (movie, audio recording, event, etc.) in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>.
     */
    @NotNull public Builder duration(@NotNull Duration.Builder duration) {
      putValue("duration", duration.build());
      return this;
    }
    /**
     * The end date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    @NotNull public Builder endDate(@NotNull java.util.Date date) {
      putValue("endDate", date);
      return this;
    }
    /**
     * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
     */
    @NotNull public Builder eventStatus(@NotNull EventStatusType eventStatusType) {
      putValue("eventStatus", eventStatusType);
      return this;
    }
    /**
     * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
     */
    @NotNull public Builder eventStatus(@NotNull EventStatusType.Builder eventStatusType) {
      putValue("eventStatus", eventStatusType.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
      return this;
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(@NotNull Organization organization) {
      putValue("performer", organization);
      return this;
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(@NotNull Organization.Builder organization) {
      putValue("performer", organization.build());
      return this;
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(@NotNull Person person) {
      putValue("performer", person);
      return this;
    }
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    @NotNull public Builder performer(@NotNull Person.Builder person) {
      putValue("performer", person.build());
      return this;
    }
    /**
     * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
     */
    @NotNull public Builder previousStartDate(@NotNull java.util.Date date) {
      putValue("previousStartDate", date);
      return this;
    }
    /**
     * The CreativeWork that captured all or part of this Event.
     */
    @NotNull public Builder recordedIn(@NotNull CreativeWork creativeWork) {
      putValue("recordedIn", creativeWork);
      return this;
    }
    /**
     * The CreativeWork that captured all or part of this Event.
     */
    @NotNull public Builder recordedIn(@NotNull CreativeWork.Builder creativeWork) {
      putValue("recordedIn", creativeWork.build());
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    @NotNull public Builder startDate(@NotNull java.util.Date date) {
      putValue("startDate", date);
      return this;
    }
    /**
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     */
    @NotNull public Builder subEvent(@NotNull Event event) {
      putValue("subEvent", event);
      return this;
    }
    /**
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     */
    @NotNull public Builder subEvent(@NotNull Event.Builder event) {
      putValue("subEvent", event.build());
      return this;
    }
    /**
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     */
    @NotNull public Builder superEvent(@NotNull Event event) {
      putValue("superEvent", event);
      return this;
    }
    /**
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     */
    @NotNull public Builder superEvent(@NotNull Event.Builder event) {
      putValue("superEvent", event.build());
      return this;
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    @NotNull public Builder typicalAgeRange(@NotNull String typicalAgeRange) {
      putValue("typicalAgeRange", typicalAgeRange);
      return this;
    }
    /**
     * A work performed in some event, for example a play performed in a TheaterEvent.
     */
    @NotNull public Builder workPerformed(@NotNull CreativeWork creativeWork) {
      putValue("workPerformed", creativeWork);
      return this;
    }
    /**
     * A work performed in some event, for example a play performed in a TheaterEvent.
     */
    @NotNull public Builder workPerformed(@NotNull CreativeWork.Builder creativeWork) {
      putValue("workPerformed", creativeWork.build());
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
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
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
      putValue("mainEntityOfPage", creativeWork);
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
      putValue("mainEntityOfPage", creativeWork.build());
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
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
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); return; }
      if ("organizer".equals(key) && value instanceof Organization) { organizer((Organization)value); return; }
      if ("organizer".equals(key) && value instanceof Person) { organizer((Person)value); return; }
      if ("attendee".equals(key) && value instanceof Organization) { attendee((Organization)value); return; }
      if ("attendee".equals(key) && value instanceof Person) { attendee((Person)value); return; }
      if ("doorTime".equals(key) && value instanceof java.util.Date) { doorTime((java.util.Date)value); return; }
      if ("duration".equals(key) && value instanceof Duration) { duration((Duration)value); return; }
      if ("endDate".equals(key) && value instanceof java.util.Date) { endDate((java.util.Date)value); return; }
      if ("eventStatus".equals(key) && value instanceof EventStatusType) { eventStatus((EventStatusType)value); return; }
      if ("inLanguage".equals(key) && value instanceof Language) { inLanguage((Language)value); return; }
      if ("inLanguage".equals(key) && value instanceof String) { inLanguage((String)value); return; }
      if ("offers".equals(key) && value instanceof Offer) { offers((Offer)value); return; }
      if ("performer".equals(key) && value instanceof Organization) { performer((Organization)value); return; }
      if ("performer".equals(key) && value instanceof Person) { performer((Person)value); return; }
      if ("previousStartDate".equals(key) && value instanceof java.util.Date) { previousStartDate((java.util.Date)value); return; }
      if ("recordedIn".equals(key) && value instanceof CreativeWork) { recordedIn((CreativeWork)value); return; }
      if ("review".equals(key) && value instanceof Review) { review((Review)value); return; }
      if ("startDate".equals(key) && value instanceof java.util.Date) { startDate((java.util.Date)value); return; }
      if ("subEvent".equals(key) && value instanceof Event) { subEvent((Event)value); return; }
      if ("superEvent".equals(key) && value instanceof Event) { superEvent((Event)value); return; }
      if ("typicalAgeRange".equals(key) && value instanceof String) { typicalAgeRange((String)value); return; }
      if ("workPerformed".equals(key) && value instanceof CreativeWork) { workPerformed((CreativeWork)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
