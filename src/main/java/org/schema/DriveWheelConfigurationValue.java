/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:11 CEST 2015 */

package org.schema;

/**
 * A value indicating which roadwheels will receive torque.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group
 */
public class DriveWheelConfigurationValue extends QualitativeValue {
  /**
   * Builder for {@see DriveWheelConfigurationValue}
   */
  public static final class Builder {
    public DriveWheelConfigurationValue build() {
      return new DriveWheelConfigurationValue(mainEntityOfPage, nonEqual, valueReference, potentialAction, alternateName, equal, lesserOrEqual, additionalType, url, sameAs, greaterOrEqual, name, image, greater, supersededBy, lesser, additionalProperty, description);
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
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     */
    public Builder nonEqual(QualitativeValue value) {
      nonEqual = value;
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(Enumeration value) {
      valueReference = value;
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
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     */
    public Builder equal(QualitativeValue value) {
      equal = value;
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     */
    public Builder lesserOrEqual(QualitativeValue value) {
      lesserOrEqual = value;
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
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     */
    public Builder greaterOrEqual(QualitativeValue value) {
      greaterOrEqual = value;
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
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     */
    public Builder greater(QualitativeValue value) {
      greater = value;
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    public Builder supersededBy(Property value) {
      supersededBy = value;
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     */
    public Builder lesser(QualitativeValue value) {
      lesser = value;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    public Builder additionalProperty(PropertyValue value) {
      additionalProperty = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    private CreativeWork mainEntityOfPage;
    private QualitativeValue nonEqual;
    private Enumeration valueReference;
    private Action potentialAction;
    private String alternateName;
    private QualitativeValue equal;
    private QualitativeValue lesserOrEqual;
    private String additionalType;
    private String url;
    private String sameAs;
    private QualitativeValue greaterOrEqual;
    private String name;
    private Image image;
    private QualitativeValue greater;
    private Property supersededBy;
    private QualitativeValue lesser;
    private PropertyValue additionalProperty;
    private String description;
  }

  protected DriveWheelConfigurationValue(CreativeWork mainEntityOfPage, QualitativeValue nonEqual, Enumeration valueReference, Action potentialAction, String alternateName, QualitativeValue equal, QualitativeValue lesserOrEqual, String additionalType, String url, String sameAs, QualitativeValue greaterOrEqual, String name, Image image, QualitativeValue greater, Property supersededBy, QualitativeValue lesser, PropertyValue additionalProperty, String description) {
    super(mainEntityOfPage, nonEqual, alternateName, potentialAction, valueReference, equal, lesserOrEqual, additionalType, url, sameAs, greaterOrEqual, greater, image, name, lesser, supersededBy, additionalProperty, description);
  }
}
