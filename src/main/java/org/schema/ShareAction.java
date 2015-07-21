/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * The act of distributing content to people for their amusement or edification.
 */
public class ShareAction extends CommunicateAction {
  /**
   * Builder for {@see ShareAction}
   */
  public static final class Builder {
    public ShareAction build() {
      return new ShareAction(instrument, recipient, mainEntityOfPage, agent, endTime, potentialAction, alternateName, participant, additionalType, url, about, startTime, sameAs, actionStatus, inLanguage, result, error, name, image, target, object, location, description);
    }
    public Builder instrument(Instrument value) {
      instrument = value;
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    public Builder recipient(Audience value) {
      recipient = value;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
      return this;
    }
    public Builder participant(Participant value) {
      participant = value;
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
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
      return this;
    }
    /**
     * The subject matter of the content.
     */
    public Builder about(Thing value) {
      about = value;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
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
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    public Builder inLanguage(String value) {
      inLanguage = value;
      return this;
    }
    public Builder result(Result value) {
      result = value;
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
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
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
    public Builder location(Location value) {
      location = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    private Instrument instrument;
    private Audience recipient;
    private CreativeWork mainEntityOfPage;
    private Organization agent;
    private java.util.Date endTime;
    private Action potentialAction;
    private String alternateName;
    private Participant participant;
    private String additionalType;
    private String url;
    private Thing about;
    private java.util.Date startTime;
    private String sameAs;
    private ActionStatusType actionStatus;
    private String inLanguage;
    private Result result;
    private Thing error;
    private String name;
    private Image image;
    private EntryPoint target;
    private Object object;
    private Location location;
    private String description;
  }

  protected ShareAction(Instrument instrument, Audience recipient, CreativeWork mainEntityOfPage, Organization agent, java.util.Date endTime, Action potentialAction, String alternateName, Participant participant, String additionalType, String url, Thing about, java.util.Date startTime, String sameAs, ActionStatusType actionStatus, String inLanguage, Result result, Thing error, String name, Image image, EntryPoint target, Object object, Location location, String description) {
    super(instrument, recipient, mainEntityOfPage, agent, endTime, potentialAction, alternateName, participant, additionalType, url, startTime, sameAs, about, actionStatus, result, inLanguage, image, name, error, target, object, description, location);
  }
}