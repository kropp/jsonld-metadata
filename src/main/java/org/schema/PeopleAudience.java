/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:11 CEST 2015 */

package org.schema;

/**
 * A set of characteristics belonging to people, e.g. who compose an item's target audience.
 */
public class PeopleAudience extends Audience {
  /**
   * Expectations for health conditions of target audience.
   */
  public MedicalCondition getHealthCondition() {
    return myHealthCondition;
  }
  /**
   * Audiences defined by a person's gender.
   */
  public String getRequiredGender() {
    return myRequiredGender;
  }
  /**
   * Audiences defined by a person's maximum age.
   */
  public Integer getRequiredMaxAge() {
    return myRequiredMaxAge;
  }
  /**
   * Audiences defined by a person's minimum age.
   */
  public Integer getRequiredMinAge() {
    return myRequiredMinAge;
  }
  /**
   * The gender of the person or audience.
   */
  public String getSuggestedGender() {
    return mySuggestedGender;
  }
  /**
   * Maximal age recommended for viewing content.
   */
  public Number getSuggestedMaxAge() {
    return mySuggestedMaxAge;
  }
  /**
   * Minimal age recommended for viewing content.
   */
  public Number getSuggestedMinAge() {
    return mySuggestedMinAge;
  }
  /**
   * Builder for {@see PeopleAudience}
   */
  public static final class Builder {
    public PeopleAudience build() {
      return new PeopleAudience(requiredMinAge, mainEntityOfPage, geographicArea, healthCondition, audienceType, potentialAction, alternateName, suggestedMinAge, suggestedMaxAge, additionalType, url, sameAs, suggestedGender, image, name, requiredMaxAge, requiredGender, description);
    }
    /**
     * Audiences defined by a person's minimum age.
     */
    public Builder requiredMinAge(Integer value) {
      requiredMinAge = value;
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
     * The geographic area associated with the audience.
     */
    public Builder geographicArea(AdministrativeArea value) {
      geographicArea = value;
      return this;
    }
    /**
     * Expectations for health conditions of target audience.
     */
    public Builder healthCondition(MedicalCondition value) {
      healthCondition = value;
      return this;
    }
    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     */
    public Builder audienceType(String value) {
      audienceType = value;
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
    /**
     * Minimal age recommended for viewing content.
     */
    public Builder suggestedMinAge(Number value) {
      suggestedMinAge = value;
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    public Builder suggestedMaxAge(Number value) {
      suggestedMaxAge = value;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * The gender of the person or audience.
     */
    public Builder suggestedGender(String value) {
      suggestedGender = value;
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
     * Audiences defined by a person's maximum age.
     */
    public Builder requiredMaxAge(Integer value) {
      requiredMaxAge = value;
      return this;
    }
    /**
     * Audiences defined by a person's gender.
     */
    public Builder requiredGender(String value) {
      requiredGender = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    private Integer requiredMinAge;
    private CreativeWork mainEntityOfPage;
    private AdministrativeArea geographicArea;
    private MedicalCondition healthCondition;
    private String audienceType;
    private Action potentialAction;
    private String alternateName;
    private Number suggestedMinAge;
    private Number suggestedMaxAge;
    private String additionalType;
    private String url;
    private String sameAs;
    private String suggestedGender;
    private Image image;
    private String name;
    private Integer requiredMaxAge;
    private String requiredGender;
    private String description;
  }

  protected PeopleAudience(Integer requiredMinAge, CreativeWork mainEntityOfPage, AdministrativeArea geographicArea, MedicalCondition healthCondition, String audienceType, Action potentialAction, String alternateName, Number suggestedMinAge, Number suggestedMaxAge, String additionalType, String url, String sameAs, String suggestedGender, Image image, String name, Integer requiredMaxAge, String requiredGender, String description) {
    super(mainEntityOfPage, geographicArea, image, name, audienceType, alternateName, potentialAction, url, additionalType, description, sameAs);
    myHealthCondition = healthCondition;
    myRequiredGender = requiredGender;
    myRequiredMaxAge = requiredMaxAge;
    myRequiredMinAge = requiredMinAge;
    mySuggestedGender = suggestedGender;
    mySuggestedMaxAge = suggestedMaxAge;
    mySuggestedMinAge = suggestedMinAge;
  }
  private MedicalCondition myHealthCondition;
  private String myRequiredGender;
  private Integer myRequiredMaxAge;
  private Integer myRequiredMinAge;
  private String mySuggestedGender;
  private Number mySuggestedMaxAge;
  private Number mySuggestedMinAge;
}
