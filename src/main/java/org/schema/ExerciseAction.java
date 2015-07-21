/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

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
   * Builder for {@see ExerciseAction}
   */
  public static final class Builder {
    public ExerciseAction build() {
      return new ExerciseAction(instrument, sportsActivityLocation, endTime, potentialAction, audience, additionalType, startTime, actionStatus, exerciseType, image, error, sportsTeam, description, sportsEvent, event, opponent, toLocation, mainEntityOfPage, distance, agent, alternateName, fromLocation, participant, url, exerciseRelatedDiet, sameAs, result, name, exercisePlan, target, exerciseCourse, object, location);
    }
    public Builder instrument(Instrument value) {
      instrument = value;
      return this;
    }
    /**
     * A sub property of location. The sports activity location where this action occurred.
     */
    public Builder sportsActivityLocation(SportsActivityLocation value) {
      sportsActivityLocation = value;
      return this;
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*.

Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    public Builder endTime(java.util.Date value) {
      endTime = value;
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
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience value) {
      audience = value;
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
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December.

Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    public Builder startTime(java.util.Date value) {
      startTime = value;
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    public Builder actionStatus(ActionStatusType value) {
      actionStatus = value;
      return this;
    }
    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     */
    public Builder exerciseType(String value) {
      exerciseType = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    public Builder error(Thing value) {
      error = value;
      return this;
    }
    /**
     * A sub property of participant. The sports team that participated on this action.
     */
    public Builder sportsTeam(SportsTeam value) {
      sportsTeam = value;
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
     * A sub property of location. The sports event where this action occurred.
     */
    public Builder sportsEvent(SportsEvent value) {
      sportsEvent = value;
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    public Builder event(Event value) {
      event = value;
      return this;
    }
    /**
     * A sub property of participant. The opponent on this action.
     */
    public Builder opponent(Person value) {
      opponent = value;
      return this;
    }
    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    public Builder toLocation(Place value) {
      toLocation = value;
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
     * The distance travelled, e.g. exercising or travelling.
     */
    public Builder distance(Distance value) {
      distance = value;
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    public Builder agent(Organization value) {
      agent = value;
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
     * A sub property of location. The original location of the object or the agent before the action.
     */
    public Builder fromLocation(Place value) {
      fromLocation = value;
      return this;
    }
    public Builder participant(Participant value) {
      participant = value;
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
     * A sub property of instrument. The diet used in this action.
     */
    public Builder exerciseRelatedDiet(Diet value) {
      exerciseRelatedDiet = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    public Builder result(Result value) {
      result = value;
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
     * A sub property of instrument. The exercise plan used on this action.
     */
    public Builder exercisePlan(ExercisePlan value) {
      exercisePlan = value;
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    public Builder target(EntryPoint value) {
      target = value;
      return this;
    }
    /**
     * A sub property of location. The course where this action was taken.
     */
    public Builder exerciseCourse(Place value) {
      exerciseCourse = value;
      return this;
    }
    public Builder object(Object value) {
      object = value;
      return this;
    }
    public Builder location(Location value) {
      location = value;
      return this;
    }
    private Instrument instrument;
    private SportsActivityLocation sportsActivityLocation;
    private java.util.Date endTime;
    private Action potentialAction;
    private Audience audience;
    private String additionalType;
    private java.util.Date startTime;
    private ActionStatusType actionStatus;
    private String exerciseType;
    private Image image;
    private Thing error;
    private SportsTeam sportsTeam;
    private String description;
    private SportsEvent sportsEvent;
    private Event event;
    private Person opponent;
    private Place toLocation;
    private CreativeWork mainEntityOfPage;
    private Distance distance;
    private Organization agent;
    private String alternateName;
    private Place fromLocation;
    private Participant participant;
    private String url;
    private Diet exerciseRelatedDiet;
    private String sameAs;
    private Result result;
    private String name;
    private ExercisePlan exercisePlan;
    private EntryPoint target;
    private Place exerciseCourse;
    private Object object;
    private Location location;
  }

  protected ExerciseAction(Instrument instrument, SportsActivityLocation sportsActivityLocation, java.util.Date endTime, Action potentialAction, Audience audience, String additionalType, java.util.Date startTime, ActionStatusType actionStatus, String exerciseType, Image image, Thing error, SportsTeam sportsTeam, String description, SportsEvent sportsEvent, Event event, Person opponent, Place toLocation, CreativeWork mainEntityOfPage, Distance distance, Organization agent, String alternateName, Place fromLocation, Participant participant, String url, Diet exerciseRelatedDiet, String sameAs, Result result, String name, ExercisePlan exercisePlan, EntryPoint target, Place exerciseCourse, Object object, Location location) {
    super(event, instrument, mainEntityOfPage, agent, endTime, alternateName, potentialAction, audience, participant, additionalType, url, startTime, sameAs, actionStatus, result, error, name, image, target, object, location, description);
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
