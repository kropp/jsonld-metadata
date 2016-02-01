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

/**
 * The act of participating in exertive activity for the purposes of improving health and fitness.
 */
public class ExerciseAction extends PlayAction {
  /**
   * A sub property of location. The course where this action was taken.
   */
  public Place getExerciseCourse() { return myExerciseCourse; }
  /**
   * A sub property of instrument. The diet used in this action.
   */
  public Diet getExerciseRelatedDiet() { return myExerciseRelatedDiet; }
  /**
   * The distance travelled, e.g. exercising or travelling.
   */
  public Distance getDistance() { return myDistance; }
  /**
   * A sub property of instrument. The exercise plan used on this action.
   */
  public ExercisePlan getExercisePlan() { return myExercisePlan; }
  /**
   * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
   */
  public String getExerciseType() { return myExerciseType; }
  /**
   * A sub property of location. The original location of the object or the agent before the action.
   */
  public Place getFromLocation() { return myFromLocation; }
  /**
   * A sub property of participant. The opponent on this action.
   */
  public Person getOpponent() { return myOpponent; }
  /**
   * A sub property of location. The sports activity location where this action occurred.
   */
  public SportsActivityLocation getSportsActivityLocation() { return mySportsActivityLocation; }
  /**
   * A sub property of location. The sports event where this action occurred.
   */
  public SportsEvent getSportsEvent() { return mySportsEvent; }
  /**
   * A sub property of participant. The sports team that participated on this action.
   */
  public SportsTeam getSportsTeam() { return mySportsTeam; }
  /**
   * A sub property of location. The final location of the object or the agent after the action.
   */
  public Place getToLocation() { return myToLocation; }
  protected ExerciseAction(Place exerciseCourse, Diet exerciseRelatedDiet, Distance distance, ExercisePlan exercisePlan, String exerciseType, Place fromLocation, Person opponent, SportsActivityLocation sportsActivityLocation, SportsEvent sportsEvent, SportsTeam sportsTeam, Place toLocation, Audience audience, Event event, OrganizationOrPerson agent, java.util.Date endTime, java.util.Date startTime, ActionStatusType actionStatus, Thing error, EntryPoint target, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(audience, event, agent, endTime, startTime, actionStatus, error, target, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myExerciseCourse = exerciseCourse;
    myExerciseRelatedDiet = exerciseRelatedDiet;
    myDistance = distance;
    myExercisePlan = exercisePlan;
    myExerciseType = exerciseType;
    myFromLocation = fromLocation;
    myOpponent = opponent;
    mySportsActivityLocation = sportsActivityLocation;
    mySportsEvent = sportsEvent;
    mySportsTeam = sportsTeam;
    myToLocation = toLocation;
    myExerciseCourse = exerciseCourse;
    myExerciseRelatedDiet = exerciseRelatedDiet;
    myDistance = distance;
    myExercisePlan = exercisePlan;
    myExerciseType = exerciseType;
    myFromLocation = fromLocation;
    myOpponent = opponent;
    mySportsActivityLocation = sportsActivityLocation;
    mySportsEvent = sportsEvent;
    mySportsTeam = sportsTeam;
    myToLocation = toLocation;
  }
  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myExerciseCourse != null ? myExerciseCourse.hashCode() : 0);
    result = 31 * result + (myExerciseRelatedDiet != null ? myExerciseRelatedDiet.hashCode() : 0);
    result = 31 * result + (myDistance != null ? myDistance.hashCode() : 0);
    result = 31 * result + (myExercisePlan != null ? myExercisePlan.hashCode() : 0);
    result = 31 * result + (myExerciseType != null ? myExerciseType.hashCode() : 0);
    result = 31 * result + (myFromLocation != null ? myFromLocation.hashCode() : 0);
    result = 31 * result + (myOpponent != null ? myOpponent.hashCode() : 0);
    result = 31 * result + (mySportsActivityLocation != null ? mySportsActivityLocation.hashCode() : 0);
    result = 31 * result + (mySportsEvent != null ? mySportsEvent.hashCode() : 0);
    result = 31 * result + (mySportsTeam != null ? mySportsTeam.hashCode() : 0);
    result = 31 * result + (myToLocation != null ? myToLocation.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExerciseAction exerciseAction = (ExerciseAction) o;
    if (!super.equals(o)) return false;
    if (myExerciseCourse != null ? !myExerciseCourse.equals(exerciseAction.myExerciseCourse) : exerciseAction.myExerciseCourse != null) return false;
    if (myExerciseRelatedDiet != null ? !myExerciseRelatedDiet.equals(exerciseAction.myExerciseRelatedDiet) : exerciseAction.myExerciseRelatedDiet != null) return false;
    if (myDistance != null ? !myDistance.equals(exerciseAction.myDistance) : exerciseAction.myDistance != null) return false;
    if (myExercisePlan != null ? !myExercisePlan.equals(exerciseAction.myExercisePlan) : exerciseAction.myExercisePlan != null) return false;
    if (myExerciseType != null ? !myExerciseType.equals(exerciseAction.myExerciseType) : exerciseAction.myExerciseType != null) return false;
    if (myFromLocation != null ? !myFromLocation.equals(exerciseAction.myFromLocation) : exerciseAction.myFromLocation != null) return false;
    if (myOpponent != null ? !myOpponent.equals(exerciseAction.myOpponent) : exerciseAction.myOpponent != null) return false;
    if (mySportsActivityLocation != null ? !mySportsActivityLocation.equals(exerciseAction.mySportsActivityLocation) : exerciseAction.mySportsActivityLocation != null) return false;
    if (mySportsEvent != null ? !mySportsEvent.equals(exerciseAction.mySportsEvent) : exerciseAction.mySportsEvent != null) return false;
    if (mySportsTeam != null ? !mySportsTeam.equals(exerciseAction.mySportsTeam) : exerciseAction.mySportsTeam != null) return false;
    if (myToLocation != null ? !myToLocation.equals(exerciseAction.myToLocation) : exerciseAction.myToLocation != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link ExerciseAction}
   */
  public static class Builder implements ThingBuilder<ExerciseAction> {
    public ExerciseAction build() {
      return new ExerciseAction(exerciseCourse, exerciseRelatedDiet, distance, exercisePlan, exerciseType, fromLocation, opponent, sportsActivityLocation, sportsEvent, sportsTeam, toLocation, audience, event, agent, endTime, startTime, actionStatus, error, target, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A sub property of location. The course where this action was taken.
     */
    @NotNull public Builder exerciseCourse(@NotNull Place place) {
      this.exerciseCourse = place;
      return this;
    }
    /**
     * A sub property of location. The course where this action was taken.
     */
    @NotNull public Builder exerciseCourse(@NotNull Place.Builder place) {
      return this.exerciseCourse(place.build());
    }
    /**
     * A sub property of instrument. The diet used in this action.
     */
    @NotNull public Builder exerciseRelatedDiet(@NotNull Diet diet) {
      this.exerciseRelatedDiet = diet;
      return this;
    }
    /**
     * A sub property of instrument. The diet used in this action.
     */
    @NotNull public Builder exerciseRelatedDiet(@NotNull Diet.Builder diet) {
      return this.exerciseRelatedDiet(diet.build());
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     */
    @NotNull public Builder distance(@NotNull Distance distance) {
      this.distance = distance;
      return this;
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     */
    @NotNull public Builder distance(@NotNull Distance.Builder distance) {
      return this.distance(distance.build());
    }
    /**
     * A sub property of instrument. The exercise plan used on this action.
     */
    @NotNull public Builder exercisePlan(@NotNull ExercisePlan exercisePlan) {
      this.exercisePlan = exercisePlan;
      return this;
    }
    /**
     * A sub property of instrument. The exercise plan used on this action.
     */
    @NotNull public Builder exercisePlan(@NotNull ExercisePlan.Builder exercisePlan) {
      return this.exercisePlan(exercisePlan.build());
    }
    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     */
    @NotNull public Builder exerciseType(@NotNull String exerciseType) {
      this.exerciseType = exerciseType;
      return this;
    }
    /**
     * A sub property of location. The original location of the object or the agent before the action.
     */
    @NotNull public Builder fromLocation(@NotNull Place place) {
      this.fromLocation = place;
      return this;
    }
    /**
     * A sub property of location. The original location of the object or the agent before the action.
     */
    @NotNull public Builder fromLocation(@NotNull Place.Builder place) {
      return this.fromLocation(place.build());
    }
    /**
     * A sub property of participant. The opponent on this action.
     */
    @NotNull public Builder opponent(@NotNull Person person) {
      this.opponent = person;
      return this;
    }
    /**
     * A sub property of participant. The opponent on this action.
     */
    @NotNull public Builder opponent(@NotNull Person.Builder person) {
      return this.opponent(person.build());
    }
    /**
     * A sub property of location. The sports activity location where this action occurred.
     */
    @NotNull public Builder sportsActivityLocation(@NotNull SportsActivityLocation sportsActivityLocation) {
      this.sportsActivityLocation = sportsActivityLocation;
      return this;
    }
    /**
     * A sub property of location. The sports activity location where this action occurred.
     */
    @NotNull public Builder sportsActivityLocation(@NotNull SportsActivityLocation.Builder sportsActivityLocation) {
      return this.sportsActivityLocation(sportsActivityLocation.build());
    }
    /**
     * A sub property of location. The sports event where this action occurred.
     */
    @NotNull public Builder sportsEvent(@NotNull SportsEvent sportsEvent) {
      this.sportsEvent = sportsEvent;
      return this;
    }
    /**
     * A sub property of location. The sports event where this action occurred.
     */
    @NotNull public Builder sportsEvent(@NotNull SportsEvent.Builder sportsEvent) {
      return this.sportsEvent(sportsEvent.build());
    }
    /**
     * A sub property of participant. The sports team that participated on this action.
     */
    @NotNull public Builder sportsTeam(@NotNull SportsTeam sportsTeam) {
      this.sportsTeam = sportsTeam;
      return this;
    }
    /**
     * A sub property of participant. The sports team that participated on this action.
     */
    @NotNull public Builder sportsTeam(@NotNull SportsTeam.Builder sportsTeam) {
      return this.sportsTeam(sportsTeam.build());
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    @NotNull public Builder toLocation(@NotNull Place place) {
      this.toLocation = place;
      return this;
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    @NotNull public Builder toLocation(@NotNull Place.Builder place) {
      return this.toLocation(place.build());
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      this.audience = audience;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      return this.audience(audience.build());
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event event) {
      this.event = event;
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      return this.event(event.build());
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization organization) {
      if (this.agent == null) this.agent = new OrganizationOrPerson();
      this.agent.setOrganization(organization);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization.Builder organization) {
      return this.agent(organization.build());
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person person) {
      if (this.agent == null) this.agent = new OrganizationOrPerson();
      this.agent.setPerson(person);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person.Builder person) {
      return this.agent(person.build());
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*.
     * 
     * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder endTime(@NotNull java.util.Date date) {
      this.endTime = date;
      return this;
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December.
     * 
     * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      this.startTime = date;
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    @NotNull public Builder actionStatus(@NotNull ActionStatusType actionStatusType) {
      this.actionStatus = actionStatusType;
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    @NotNull public Builder actionStatus(@NotNull ActionStatusType.Builder actionStatusType) {
      return this.actionStatus(actionStatusType.build());
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing thing) {
      this.error = thing;
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing.Builder thing) {
      return this.error(thing.build());
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint entryPoint) {
      this.target = entryPoint;
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint.Builder entryPoint) {
      return this.target(entryPoint.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      this.description = description;
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
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
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
      return this.mainEntityOfPage(creativeWork.build());
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
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(@NotNull String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override public void fromMap(java.util.Map<String, Object> map) {
      for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
        final String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }
        if ("exerciseCourse".equals(key) && value instanceof Place) { exerciseCourse((Place)value); continue; }
        if ("exerciseRelatedDiet".equals(key) && value instanceof Diet) { exerciseRelatedDiet((Diet)value); continue; }
        if ("distance".equals(key) && value instanceof Distance) { distance((Distance)value); continue; }
        if ("exercisePlan".equals(key) && value instanceof ExercisePlan) { exercisePlan((ExercisePlan)value); continue; }
        if ("exerciseType".equals(key) && value instanceof String) { exerciseType((String)value); continue; }
        if ("fromLocation".equals(key) && value instanceof Place) { fromLocation((Place)value); continue; }
        if ("opponent".equals(key) && value instanceof Person) { opponent((Person)value); continue; }
        if ("sportsActivityLocation".equals(key) && value instanceof SportsActivityLocation) { sportsActivityLocation((SportsActivityLocation)value); continue; }
        if ("sportsEvent".equals(key) && value instanceof SportsEvent) { sportsEvent((SportsEvent)value); continue; }
        if ("sportsTeam".equals(key) && value instanceof SportsTeam) { sportsTeam((SportsTeam)value); continue; }
        if ("toLocation".equals(key) && value instanceof Place) { toLocation((Place)value); continue; }
        if ("audience".equals(key) && value instanceof Audience) { audience((Audience)value); continue; }
        if ("event".equals(key) && value instanceof Event) { event((Event)value); continue; }
        if ("agent".equals(key) && value instanceof Organization) { agent((Organization)value); continue; }
        if ("agent".equals(key) && value instanceof Person) { agent((Person)value); continue; }
        if ("endTime".equals(key) && value instanceof java.util.Date) { endTime((java.util.Date)value); continue; }
        if ("startTime".equals(key) && value instanceof java.util.Date) { startTime((java.util.Date)value); continue; }
        if ("actionStatus".equals(key) && value instanceof ActionStatusType) { actionStatus((ActionStatusType)value); continue; }
        if ("error".equals(key) && value instanceof Thing) { error((Thing)value); continue; }
        if ("target".equals(key) && value instanceof EntryPoint) { target((EntryPoint)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("@id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private Place exerciseCourse;
    private Diet exerciseRelatedDiet;
    private Distance distance;
    private ExercisePlan exercisePlan;
    private String exerciseType;
    private Place fromLocation;
    private Person opponent;
    private SportsActivityLocation sportsActivityLocation;
    private SportsEvent sportsEvent;
    private SportsTeam sportsTeam;
    private Place toLocation;
    private Audience audience;
    private Event event;
    private OrganizationOrPerson agent;
    private java.util.Date endTime;
    private java.util.Date startTime;
    private ActionStatusType actionStatus;
    private Thing error;
    private EntryPoint target;
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
  
  private Place myExerciseCourse;
  private Diet myExerciseRelatedDiet;
  private Distance myDistance;
  private ExercisePlan myExercisePlan;
  private String myExerciseType;
  private Place myFromLocation;
  private Person myOpponent;
  private SportsActivityLocation mySportsActivityLocation;
  private SportsEvent mySportsEvent;
  private SportsTeam mySportsTeam;
  private Place myToLocation;
}
