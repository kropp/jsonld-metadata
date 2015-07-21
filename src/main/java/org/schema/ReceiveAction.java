/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * The act of physically/electronically taking delivery of an object thathas been transferred from an origin to a destination. Reciprocal of SendAction.<p>Related actions:</p><ul><li><a href="http://schema.org/SendAction">SendAction</a>: The reciprocal of ReceiveAction.</li><li><a href="http://schema.org/TakeAction">TakeAction</a>: Unlike TakeAction, ReceiveAction does not imply that the ownership has been transfered (e.g. I can receive a package, but it does not mean the package is now mine)</li></ul>.
 */
public class ReceiveAction extends TransferAction {
  /**
   * A sub property of instrument. The method of delivery.
   */
  public DeliveryMethod getDeliveryMethod() {
    return myDeliveryMethod;
  }
  /**
   * A sub property of participant. The participant who is at the sending end of the action.
   */
  public Audience getSender() {
    return mySender;
  }
  /**
   * Builder for {@see ReceiveAction}
   */
  public static final class Builder {
    public ReceiveAction build() {
      return new ReceiveAction(instrument, toLocation, mainEntityOfPage, sender, agent, endTime, alternateName, potentialAction, fromLocation, participant, url, additionalType, sameAs, startTime, actionStatus, result, deliveryMethod, image, name, error, target, object, description, location);
    }
    public Builder instrument(Instrument value) {
      instrument = value;
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
     * A sub property of participant. The participant who is at the sending end of the action.
     */
    public Builder sender(Audience value) {
      sender = value;
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
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*.

Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    public Builder endTime(java.util.Date value) {
      endTime = value;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
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
    public Builder result(Result value) {
      result = value;
      return this;
    }
    /**
     * A sub property of instrument. The method of delivery.
     */
    public Builder deliveryMethod(DeliveryMethod value) {
      deliveryMethod = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
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
     * For failed actions, more information on the cause of the failure.
     */
    public Builder error(Thing value) {
      error = value;
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    public Builder target(EntryPoint value) {
      target = value;
      return this;
    }
    public Builder object(Object value) {
      object = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    public Builder location(Location value) {
      location = value;
      return this;
    }
    private Instrument instrument;
    private Place toLocation;
    private CreativeWork mainEntityOfPage;
    private Audience sender;
    private Organization agent;
    private java.util.Date endTime;
    private String alternateName;
    private Action potentialAction;
    private Place fromLocation;
    private Participant participant;
    private String url;
    private String additionalType;
    private String sameAs;
    private java.util.Date startTime;
    private ActionStatusType actionStatus;
    private Result result;
    private DeliveryMethod deliveryMethod;
    private Image image;
    private String name;
    private Thing error;
    private EntryPoint target;
    private Object object;
    private String description;
    private Location location;
  }

  protected ReceiveAction(Instrument instrument, Place toLocation, CreativeWork mainEntityOfPage, Audience sender, Organization agent, java.util.Date endTime, String alternateName, Action potentialAction, Place fromLocation, Participant participant, String url, String additionalType, String sameAs, java.util.Date startTime, ActionStatusType actionStatus, Result result, DeliveryMethod deliveryMethod, Image image, String name, Thing error, EntryPoint target, Object object, String description, Location location) {
    super(instrument, mainEntityOfPage, toLocation, agent, endTime, alternateName, potentialAction, fromLocation, participant, additionalType, url, startTime, sameAs, actionStatus, result, error, name, image, target, object, location, description);
    myDeliveryMethod = deliveryMethod;
    mySender = sender;
  }
  private DeliveryMethod myDeliveryMethod;
  private Audience mySender;
}
