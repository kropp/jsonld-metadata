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
  public static final class Builder {
    /**
     * Creates new {@link ExerciseAction} instance.
     */
    public ExerciseAction build() {
      return new ExerciseAction(opponent, exerciseType, startTime, sportsEvent, error, distance, event, sameAs, additionalType, potentialAction, exerciseCourse, exercisePlan, toLocation, name, mainEntityOfPage, sportsTeam, audience, fromLocation, exerciseRelatedDiet, url, agent, sportsActivityLocation, alternateName, description, target, endTime, actionStatus);
    }
    /**
     * A sub property of participant. The opponent on this action.
     */
    public Builder opponent(Person person) {
      this.opponent = person;
      return this;
    }
    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     */
    public Builder exerciseType(String exerciseType) {
      this.exerciseType = exerciseType;
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
     * A sub property of location. The sports event where this action occurred.
     */
    public Builder sportsEvent(SportsEvent sportsEvent) {
      this.sportsEvent = sportsEvent;
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    public Builder error(Thing thing) {
      this.error = thing;
      return this;
    }
    /**
     * The distance travelled, e.g. exercising or travelling.
     */
    public Builder distance(Distance distance) {
      this.distance = distance;
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    public Builder event(Event event) {
      this.event = event;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * A sub property of location. The course where this action was taken.
     */
    public Builder exerciseCourse(Place place) {
      this.exerciseCourse = place;
      return this;
    }
    /**
     * A sub property of instrument. The exercise plan used on this action.
     */
    public Builder exercisePlan(ExercisePlan exercisePlan) {
      this.exercisePlan = exercisePlan;
      return this;
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    public Builder toLocation(Place place) {
      this.toLocation = place;
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
     * A sub property of participant. The sports team that participated on this action.
     */
    public Builder sportsTeam(SportsTeam sportsTeam) {
      this.sportsTeam = sportsTeam;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience audience) {
      this.audience = audience;
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
     * A sub property of instrument. The diet used in this action.
     */
    public Builder exerciseRelatedDiet(Diet diet) {
      this.exerciseRelatedDiet = diet;
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
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    public Builder agent(Organization organization) {
      this.agent.setOrganization(organization);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    public Builder agent(Person person) {
      this.agent.setPerson(person);
      return this;
    }
    /**
     * A sub property of location. The sports activity location where this action occurred.
     */
    public Builder sportsActivityLocation(SportsActivityLocation sportsActivityLocation) {
      this.sportsActivityLocation = sportsActivityLocation;
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
     * Indicates a target EntryPoint for an Action.
     */
    public Builder target(EntryPoint entryPoint) {
      this.target = entryPoint;
      return this;
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
     * Indicates the current disposition of the Action.
     */
    public Builder actionStatus(ActionStatusType actionStatusType) {
      this.actionStatus = actionStatusType;
      return this;
    }
    private Person opponent;
    private String exerciseType;
    private java.util.Date startTime;
    private SportsEvent sportsEvent;
    private Thing error;
    private Distance distance;
    private Event event;
    private String sameAs;
    private String additionalType;
    private Action potentialAction;
    private Place exerciseCourse;
    private ExercisePlan exercisePlan;
    private Place toLocation;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private SportsTeam sportsTeam;
    private Audience audience;
    private Place fromLocation;
    private Diet exerciseRelatedDiet;
    private String url;
    private OrganizationOrPerson agent;
    private SportsActivityLocation sportsActivityLocation;
    private String alternateName;
    private String description;
    private EntryPoint target;
    private java.util.Date endTime;
    private ActionStatusType actionStatus;
  }

  protected ExerciseAction(Person opponent, String exerciseType, java.util.Date startTime, SportsEvent sportsEvent, Thing error, Distance distance, Event event, String sameAs, String additionalType, Action potentialAction, Place exerciseCourse, ExercisePlan exercisePlan, Place toLocation, String name, StringOrCreativeWork mainEntityOfPage, SportsTeam sportsTeam, Audience audience, Place fromLocation, Diet exerciseRelatedDiet, String url, OrganizationOrPerson agent, SportsActivityLocation sportsActivityLocation, String alternateName, String description, EntryPoint target, java.util.Date endTime, ActionStatusType actionStatus) {
    super(startTime, name, error, mainEntityOfPage, audience, event, url, sameAs, additionalType, agent, alternateName, potentialAction, target, description, endTime, actionStatus);
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
