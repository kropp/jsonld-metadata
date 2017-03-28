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

import org.jetbrains.annotations.NotNull;

/**
 * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
 */
public class UserCheckins extends UserInteraction {
  protected UserCheckins(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link UserCheckins}
   */
  public static class Builder extends UserInteraction.Builder {
    @NotNull public UserCheckins build() {
      return new UserCheckins(myData);
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing thing) {
      putValue("about", thing);
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing.Builder thing) {
      putValue("about", thing.build());
      return this;
    }
    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     */
    @NotNull public Builder actor(@NotNull Person person) {
      putValue("actor", person);
      return this;
    }
    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     */
    @NotNull public Builder actor(@NotNull Person.Builder person) {
      putValue("actor", person.build());
      return this;
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
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Organization organization) {
      putValue("contributor", organization);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Organization.Builder organization) {
      putValue("contributor", organization.build());
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Person person) {
      putValue("contributor", person);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Person.Builder person) {
      putValue("contributor", person.build());
      return this;
    }
    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     */
    @NotNull public Builder director(@NotNull Person person) {
      putValue("director", person);
      return this;
    }
    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     */
    @NotNull public Builder director(@NotNull Person.Builder person) {
      putValue("director", person.build());
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
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
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
     * A flag to signal that the publication is accessible for free.
     */
    @NotNull public Builder isAccessibleForFree(@NotNull Boolean isAccessibleForFree) {
      putValue("isAccessibleForFree", isAccessibleForFree);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * The total number of individuals that may attend an event or venue.
     */
    @NotNull public Builder maximumAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumAttendeeCapacity", integer);
      return this;
    }
    /**
     * The number of attendee places for an event that remain unallocated.
     */
    @NotNull public Builder remainingAttendeeCapacity(@NotNull Integer integer) {
      putValue("remainingAttendeeCapacity", integer);
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
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
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Organization organization) {
      putValue("funder", organization);
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Organization.Builder organization) {
      putValue("funder", organization.build());
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Person person) {
      putValue("funder", person);
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Person.Builder person) {
      putValue("funder", person.build());
      return this;
    }
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
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
     * A work featured in some event, e.g. exhibited in an ExhibitionEvent.
     *        Specific subproperties are available for workPerformed (e.g. a play), or a workPresented (a Movie at a ScreeningEvent).
     */
    @NotNull public Builder workFeatured(@NotNull WorkFeatured workFeatured) {
      putValue("workFeatured", workFeatured);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Organization organization) {
      putValue("translator", organization);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Organization.Builder organization) {
      putValue("translator", organization.build());
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Person person) {
      putValue("translator", person);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Person.Builder person) {
      putValue("translator", person.build());
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @NotNull public Builder composer(@NotNull Organization organization) {
      putValue("composer", organization);
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @NotNull public Builder composer(@NotNull Organization.Builder organization) {
      putValue("composer", organization.build());
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @NotNull public Builder composer(@NotNull Person person) {
      putValue("composer", person);
      return this;
    }
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @NotNull public Builder composer(@NotNull Person.Builder person) {
      putValue("composer", person.build());
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
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      super.fromMap(key, value);
    }
  }
  
}
