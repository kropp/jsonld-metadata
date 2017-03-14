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

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * The act of participating in exertive activity for the purposes of improving health and fitness.
 */
public class ExerciseAction extends PlayAction {
  /**
   * A sub property of location. The course where this action was taken.
   */
  @JsonIgnore public Place getExerciseCourse() {
    return (Place) getValue("exerciseCourse");
  }
  /**
   * A sub property of location. The course where this action was taken.
   */
  @JsonIgnore public Collection<Place> getExerciseCourses() {
    final Object current = myData.get("exerciseCourse");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The distance travelled, e.g. exercising or travelling.
   */
  @JsonIgnore public Distance getDistance() {
    return (Distance) getValue("distance");
  }
  /**
   * The distance travelled, e.g. exercising or travelling.
   */
  @JsonIgnore public Collection<Distance> getDistances() {
    final Object current = myData.get("distance");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * A sub property of location. The original location of the object or the agent before the action.
   */
  @JsonIgnore public Place getFromLocation() {
    return (Place) getValue("fromLocation");
  }
  /**
   * A sub property of location. The original location of the object or the agent before the action.
   */
  @JsonIgnore public Collection<Place> getFromLocations() {
    final Object current = myData.get("fromLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * A sub property of participant. The opponent on this action.
   */
  @JsonIgnore public Person getOpponent() {
    return (Person) getValue("opponent");
  }
  /**
   * A sub property of participant. The opponent on this action.
   */
  @JsonIgnore public Collection<Person> getOpponents() {
    final Object current = myData.get("opponent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A sub property of location. The sports activity location where this action occurred.
   */
  @JsonIgnore public SportsActivityLocation getSportsActivityLocation() {
    return (SportsActivityLocation) getValue("sportsActivityLocation");
  }
  /**
   * A sub property of location. The sports activity location where this action occurred.
   */
  @JsonIgnore public Collection<SportsActivityLocation> getSportsActivityLocations() {
    final Object current = myData.get("sportsActivityLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SportsActivityLocation>) current;
    }
    return Arrays.asList((SportsActivityLocation) current);
  }
  /**
   * A sub property of location. The sports event where this action occurred.
   */
  @JsonIgnore public SportsEvent getSportsEvent() {
    return (SportsEvent) getValue("sportsEvent");
  }
  /**
   * A sub property of location. The sports event where this action occurred.
   */
  @JsonIgnore public Collection<SportsEvent> getSportsEvents() {
    final Object current = myData.get("sportsEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SportsEvent>) current;
    }
    return Arrays.asList((SportsEvent) current);
  }
  /**
   * A sub property of participant. The sports team that participated on this action.
   */
  @JsonIgnore public SportsTeam getSportsTeam() {
    return (SportsTeam) getValue("sportsTeam");
  }
  /**
   * A sub property of participant. The sports team that participated on this action.
   */
  @JsonIgnore public Collection<SportsTeam> getSportsTeams() {
    final Object current = myData.get("sportsTeam");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SportsTeam>) current;
    }
    return Arrays.asList((SportsTeam) current);
  }
  /**
   * A sub property of location. The final location of the object or the agent after the action.
   */
  @JsonIgnore public Place getToLocation() {
    return (Place) getValue("toLocation");
  }
  /**
   * A sub property of location. The final location of the object or the agent after the action.
   */
  @JsonIgnore public Collection<Place> getToLocations() {
    final Object current = myData.get("toLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  protected ExerciseAction(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ExerciseAction}
   */
  public static class Builder extends PlayAction.Builder {
    public ExerciseAction build() {
      return new ExerciseAction(myData);
    }
    /**
     * A sub property of location. The course where this action was taken.
     */
    @NotNull public Builder exerciseCourse(@NotNull Place place) {
      putValue("exerciseCourse", place);
      return this;
    }
    /**
     * A sub property of location. The course where this action was taken.
     */
    @NotNull public Builder exerciseCourse(@NotNull Place.Builder place) {
      putValue("exerciseCourse", place.build());
      return this;
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     */
    @NotNull public Builder distance(@NotNull Distance distance) {
      putValue("distance", distance);
      return this;
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     */
    @NotNull public Builder distance(@NotNull Distance.Builder distance) {
      putValue("distance", distance.build());
      return this;
    }
    /**
     * A sub property of location. The original location of the object or the agent before the action.
     */
    @NotNull public Builder fromLocation(@NotNull Place place) {
      putValue("fromLocation", place);
      return this;
    }
    /**
     * A sub property of location. The original location of the object or the agent before the action.
     */
    @NotNull public Builder fromLocation(@NotNull Place.Builder place) {
      putValue("fromLocation", place.build());
      return this;
    }
    /**
     * A sub property of participant. The opponent on this action.
     */
    @NotNull public Builder opponent(@NotNull Person person) {
      putValue("opponent", person);
      return this;
    }
    /**
     * A sub property of participant. The opponent on this action.
     */
    @NotNull public Builder opponent(@NotNull Person.Builder person) {
      putValue("opponent", person.build());
      return this;
    }
    /**
     * A sub property of location. The sports activity location where this action occurred.
     */
    @NotNull public Builder sportsActivityLocation(@NotNull SportsActivityLocation sportsActivityLocation) {
      putValue("sportsActivityLocation", sportsActivityLocation);
      return this;
    }
    /**
     * A sub property of location. The sports activity location where this action occurred.
     */
    @NotNull public Builder sportsActivityLocation(@NotNull SportsActivityLocation.Builder sportsActivityLocation) {
      putValue("sportsActivityLocation", sportsActivityLocation.build());
      return this;
    }
    /**
     * A sub property of location. The sports event where this action occurred.
     */
    @NotNull public Builder sportsEvent(@NotNull SportsEvent sportsEvent) {
      putValue("sportsEvent", sportsEvent);
      return this;
    }
    /**
     * A sub property of location. The sports event where this action occurred.
     */
    @NotNull public Builder sportsEvent(@NotNull SportsEvent.Builder sportsEvent) {
      putValue("sportsEvent", sportsEvent.build());
      return this;
    }
    /**
     * A sub property of participant. The sports team that participated on this action.
     */
    @NotNull public Builder sportsTeam(@NotNull SportsTeam sportsTeam) {
      putValue("sportsTeam", sportsTeam);
      return this;
    }
    /**
     * A sub property of participant. The sports team that participated on this action.
     */
    @NotNull public Builder sportsTeam(@NotNull SportsTeam.Builder sportsTeam) {
      putValue("sportsTeam", sportsTeam.build());
      return this;
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    @NotNull public Builder toLocation(@NotNull Place place) {
      putValue("toLocation", place);
      return this;
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    @NotNull public Builder toLocation(@NotNull Place.Builder place) {
      putValue("toLocation", place.build());
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      putValue("audience", audience);
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      putValue("audience", audience.build());
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event event) {
      putValue("event", event);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      putValue("event", event.build());
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization organization) {
      putValue("agent", organization);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization.Builder organization) {
      putValue("agent", organization.build());
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person person) {
      putValue("agent", person);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person.Builder person) {
      putValue("agent", person.build());
      return this;
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder endTime(@NotNull java.util.Date date) {
      putValue("endTime", date);
      return this;
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      putValue("startTime", date);
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    @NotNull public Builder actionStatus(@NotNull ActionStatusType actionStatusType) {
      putValue("actionStatus", actionStatusType);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing thing) {
      putValue("error", thing);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing.Builder thing) {
      putValue("error", thing.build());
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint entryPoint) {
      putValue("target", entryPoint);
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint.Builder entryPoint) {
      putValue("target", entryPoint.build());
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
      putValue("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("exerciseCourse".equals(key) && value instanceof Place) { exerciseCourse((Place)value); return; }
      if ("distance".equals(key) && value instanceof Distance) { distance((Distance)value); return; }
      if ("fromLocation".equals(key) && value instanceof Place) { fromLocation((Place)value); return; }
      if ("opponent".equals(key) && value instanceof Person) { opponent((Person)value); return; }
      if ("sportsActivityLocation".equals(key) && value instanceof SportsActivityLocation) { sportsActivityLocation((SportsActivityLocation)value); return; }
      if ("sportsEvent".equals(key) && value instanceof SportsEvent) { sportsEvent((SportsEvent)value); return; }
      if ("sportsTeam".equals(key) && value instanceof SportsTeam) { sportsTeam((SportsTeam)value); return; }
      if ("toLocation".equals(key) && value instanceof Place) { toLocation((Place)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
