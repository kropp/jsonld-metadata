/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:11 CEST 2015 */

package org.schema;

/**
 * An intangible item that describes an alignment between a learning resource and a node in an educational framework.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_LRMIClass
 */
public class AlignmentObject extends Intangible {
  /**
   * A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationLevel'.
   */
  public String getAlignmentType() {
    return myAlignmentType;
  }
  /**
   * The framework to which the resource being described is aligned.
   */
  public String getEducationalFramework() {
    return myEducationalFramework;
  }
  /**
   * The description of a node in an established educational framework.
   */
  public String getTargetDescription() {
    return myTargetDescription;
  }
  /**
   * The name of a node in an established educational framework.
   */
  public String getTargetName() {
    return myTargetName;
  }
  /**
   * The URL of a node in an established educational framework.
   */
  public String getTargetUrl() {
    return myTargetUrl;
  }
  /**
   * Builder for {@see AlignmentObject}
   */
  public static final class Builder {
    public AlignmentObject build() {
      return new AlignmentObject(mainEntityOfPage, targetDescription, potentialAction, alternateName, targetUrl, additionalType, url, sameAs, educationalFramework, targetName, image, name, description, alignmentType);
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
     * The description of a node in an established educational framework.
     */
    public Builder targetDescription(String value) {
      targetDescription = value;
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
     * The URL of a node in an established educational framework.
     */
    public Builder targetUrl(String value) {
      targetUrl = value;
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
     * The framework to which the resource being described is aligned.
     */
    public Builder educationalFramework(String value) {
      educationalFramework = value;
      return this;
    }
    /**
     * The name of a node in an established educational framework.
     */
    public Builder targetName(String value) {
      targetName = value;
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
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    /**
     * A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationLevel'.
     */
    public Builder alignmentType(String value) {
      alignmentType = value;
      return this;
    }
    private CreativeWork mainEntityOfPage;
    private String targetDescription;
    private Action potentialAction;
    private String alternateName;
    private String targetUrl;
    private String additionalType;
    private String url;
    private String sameAs;
    private String educationalFramework;
    private String targetName;
    private Image image;
    private String name;
    private String description;
    private String alignmentType;
  }

  protected AlignmentObject(CreativeWork mainEntityOfPage, String targetDescription, Action potentialAction, String alternateName, String targetUrl, String additionalType, String url, String sameAs, String educationalFramework, String targetName, Image image, String name, String description, String alignmentType) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    myAlignmentType = alignmentType;
    myEducationalFramework = educationalFramework;
    myTargetDescription = targetDescription;
    myTargetName = targetName;
    myTargetUrl = targetUrl;
  }
  private String myAlignmentType;
  private String myEducationalFramework;
  private String myTargetDescription;
  private String myTargetName;
  private String myTargetUrl;
}
