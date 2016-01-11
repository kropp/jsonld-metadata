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
 * The act of participating in exertive activity for the purposes of improving health and fitness.
 */
public class ExerciseAction extends PlayAction {
  /**
   * A sub property of location. The course where this action was taken.
   */
  public Place getExerciseCourse() {
    return myExerciseCourse;
  }
  /**
   * A sub property of instrument. The diet used in this action.
   */
  public Diet getExerciseRelatedDiet() {
    return myExerciseRelatedDiet;
  }
  /**
   * The distance travelled, e.g. exercising or travelling.
   */
  public Distance getDistance() {
    return myDistance;
  }
  /**
   * A sub property of instrument. The exercise plan used on this action.
   */
  public ExercisePlan getExercisePlan() {
    return myExercisePlan;
  }
  /**
   * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
   */
  public String getExerciseType() {
    return myExerciseType;
  }
  /**
   * A sub property of location. The original location of the object or the agent before the action.
   */
  public Place getFromLocation() {
    return myFromLocation;
  }
  /**
   * A sub property of participant. The opponent on this action.
   */
  public Person getOpponent() {
    return myOpponent;
  }
  /**
   * A sub property of location. The sports activity location where this action occurred.
   */
  public SportsActivityLocation getSportsActivityLocation() {
    return mySportsActivityLocation;
  }
  /**
   * A sub property of location. The sports event where this action occurred.
   */
  public SportsEvent getSportsEvent() {
    return mySportsEvent;
  }
  /**
   * A sub property of participant. The sports team that participated on this action.
   */
  public SportsTeam getSportsTeam() {
    return mySportsTeam;
  }
  /**
   * A sub property of location. The final location of the object or the agent after the action.
   */
  public Place getToLocation() {
    return myToLocation;
  }
  /**
   * Builder for {@link ExerciseAction}
   */
  public static final class ExerciseActionThingBuilder implements Builder {
    /**
     * Creates new {@link ExerciseAction} instance.
     */
    public ExerciseAction build() {
      return new ExerciseAction(exerciseCourse, exerciseRelatedDiet, distance, exercisePlan, exerciseType, fromLocation, opponent, sportsActivityLocation, sportsEvent, sportsTeam, toLocation, audience, event, agent, endTime, startTime, actionStatus, error, target, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A sub property of location. The course where this action was taken.
     */
    public Builder exerciseCourse(Place place) {
      this.exerciseCourse = place;
      return this;
    }
    /**
     * A sub property of location. The course where this action was taken.
     */
    public Builder exerciseCourse(Place.Builder place) {
      return this.exerciseCourse(place.build());
    }
    /**
     * A sub property of instrument. The diet used in this action.
     */
    public Builder exerciseRelatedDiet(Diet diet) {
      this.exerciseRelatedDiet = diet;
      return this;
    }
    /**
     * A sub property of instrument. The diet used in this action.
     */
    public Builder exerciseRelatedDiet(Diet.Builder diet) {
      return this.exerciseRelatedDiet(diet.build());
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     */
    public Builder distance(Distance distance) {
      this.distance = distance;
      return this;
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     */
    public Builder distance(Distance.Builder distance) {
      return this.distance(distance.build());
    }
    /**
     * A sub property of instrument. The exercise plan used on this action.
     */
    public Builder exercisePlan(ExercisePlan exercisePlan) {
      this.exercisePlan = exercisePlan;
      return this;
    }
    /**
     * A sub property of instrument. The exercise plan used on this action.
     */
    public Builder exercisePlan(ExercisePlan.Builder exercisePlan) {
      return this.exercisePlan(exercisePlan.build());
    }
    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     */
    public Builder exerciseType(String exerciseType) {
      this.exerciseType = exerciseType;
      return this;
    }
    /**
     * A sub property of location. The original location of the object or the agent before the action.
     */
    public Builder fromLocation(Place place) {
      this.fromLocation = place;
      return this;
    }
    /**
     * A sub property of location. The original location of the object or the agent before the action.
     */
    public Builder fromLocation(Place.Builder place) {
      return this.fromLocation(place.build());
    }
    /**
     * A sub property of participant. The opponent on this action.
     */
    public Builder opponent(Person person) {
      this.opponent = person;
      return this;
    }
    /**
     * A sub property of participant. The opponent on this action.
     */
    public Builder opponent(Person.Builder person) {
      return this.opponent(person.build());
    }
    /**
     * A sub property of location. The sports activity location where this action occurred.
     */
    public Builder sportsActivityLocation(SportsActivityLocation sportsActivityLocation) {
      this.sportsActivityLocation = sportsActivityLocation;
      return this;
    }
    /**
     * A sub property of location. The sports activity location where this action occurred.
     */
    public Builder sportsActivityLocation(SportsActivityLocation.Builder sportsActivityLocation) {
      return this.sportsActivityLocation(sportsActivityLocation.build());
    }
    /**
     * A sub property of location. The sports event where this action occurred.
     */
    public Builder sportsEvent(SportsEvent sportsEvent) {
      this.sportsEvent = sportsEvent;
      return this;
    }
    /**
     * A sub property of location. The sports event where this action occurred.
     */
    public Builder sportsEvent(SportsEvent.Builder sportsEvent) {
      return this.sportsEvent(sportsEvent.build());
    }
    /**
     * A sub property of participant. The sports team that participated on this action.
     */
    public Builder sportsTeam(SportsTeam sportsTeam) {
      this.sportsTeam = sportsTeam;
      return this;
    }
    /**
     * A sub property of participant. The sports team that participated on this action.
     */
    public Builder sportsTeam(SportsTeam.Builder sportsTeam) {
      return this.sportsTeam(sportsTeam.build());
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    public Builder toLocation(Place place) {
      this.toLocation = place;
      return this;
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    public Builder toLocation(Place.Builder place) {
      return this.toLocation(place.build());
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience audience) {
      this.audience = audience;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience.Builder audience) {
      return this.audience(audience.build());
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    public Builder event(Event event) {
      this.event = event;
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    public Builder event(Event.Builder event) {
      return this.event(event.build());
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    public Builder agent(Organization organization) {
      if (this.agent == null) this.agent = new OrganizationOrPerson();
      this.agent.setOrganization(organization);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    public Builder agent(Organization.Builder organization) {
      return this.agent(organization.build());
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    public Builder agent(Person person) {
      if (this.agent == null) this.agent = new OrganizationOrPerson();
      this.agent.setPerson(person);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    public Builder agent(Person.Builder person) {
      return this.agent(person.build());
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*.

Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    public Builder endTime(java.util.Date date) {
      this.endTime = date;
      return this;
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December.

Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    public Builder startTime(java.util.Date date) {
      this.startTime = date;
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    public Builder actionStatus(ActionStatusType actionStatusType) {
      this.actionStatus = actionStatusType;
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    public Builder actionStatus(ActionStatusType.Builder actionStatusType) {
      return this.actionStatus(actionStatusType.build());
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    public Builder error(Thing thing) {
      this.error = thing;
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    public Builder error(Thing.Builder thing) {
      return this.error(thing.build());
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    public Builder target(EntryPoint entryPoint) {
      this.target = entryPoint;
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    public Builder target(EntryPoint.Builder entryPoint) {
      return this.target(entryPoint.build());
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
  public interface Builder extends ThingBuilder<ExerciseAction> {
  Builder exerciseCourse(Place place);
  Builder exerciseCourse(Place.Builder place);
  Builder exerciseRelatedDiet(Diet diet);
  Builder exerciseRelatedDiet(Diet.Builder diet);
  Builder distance(Distance distance);
  Builder distance(Distance.Builder distance);
  Builder exercisePlan(ExercisePlan exercisePlan);
  Builder exercisePlan(ExercisePlan.Builder exercisePlan);
  Builder exerciseType(String exerciseType);
  Builder fromLocation(Place place);
  Builder fromLocation(Place.Builder place);
  Builder opponent(Person person);
  Builder opponent(Person.Builder person);
  Builder sportsActivityLocation(SportsActivityLocation sportsActivityLocation);
  Builder sportsActivityLocation(SportsActivityLocation.Builder sportsActivityLocation);
  Builder sportsEvent(SportsEvent sportsEvent);
  Builder sportsEvent(SportsEvent.Builder sportsEvent);
  Builder sportsTeam(SportsTeam sportsTeam);
  Builder sportsTeam(SportsTeam.Builder sportsTeam);
  Builder toLocation(Place place);
  Builder toLocation(Place.Builder place);
  Builder audience(Audience audience);
  Builder audience(Audience.Builder audience);
  Builder event(Event event);
  Builder event(Event.Builder event);
  Builder agent(Organization organization);
  Builder agent(Organization.Builder organization);
  Builder agent(Person person);
  Builder agent(Person.Builder person);
  Builder endTime(java.util.Date date);
  Builder startTime(java.util.Date date);
  Builder actionStatus(ActionStatusType actionStatusType);
  Builder actionStatus(ActionStatusType.Builder actionStatusType);
  Builder error(Thing thing);
  Builder error(Thing.Builder thing);
  Builder target(EntryPoint entryPoint);
  Builder target(EntryPoint.Builder entryPoint);
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
