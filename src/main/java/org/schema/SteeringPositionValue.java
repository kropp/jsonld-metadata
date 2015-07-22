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
 * A value indicating a steering position.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group
 */
public class SteeringPositionValue extends QualitativeValue {
  /**
   * Builder for {@link SteeringPositionValue}
   */
  public static final class Builder {
    /**
     * Creates new {@link SteeringPositionValue} instance.
     */
    public SteeringPositionValue build() {
      return new SteeringPositionValue(nonEqual, valueReference, equal, greaterOrEqual, name, mainEntityOfPage, lesserOrEqual, url, additionalType, sameAs, alternateName, supersededBy, greater, potentialAction, description, additionalProperty, lesser);
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     */
    public Builder nonEqual(QualitativeValue qualitativeValue) {
      this.nonEqual = qualitativeValue;
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(PropertyValue propertyValue) {
      this.valueReference.setPropertyValue(propertyValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(StructuredValue structuredValue) {
      this.valueReference.setStructuredValue(structuredValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(QualitativeValue qualitativeValue) {
      this.valueReference.setQualitativeValue(qualitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(Enumeration enumeration) {
      this.valueReference.setEnumeration(enumeration);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(QuantitativeValue quantitativeValue) {
      this.valueReference.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     */
    public Builder equal(QualitativeValue qualitativeValue) {
      this.equal = qualitativeValue;
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     */
    public Builder greaterOrEqual(QualitativeValue qualitativeValue) {
      this.greaterOrEqual = qualitativeValue;
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
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     */
    public Builder lesserOrEqual(QualitativeValue qualitativeValue) {
      this.lesserOrEqual = qualitativeValue;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    public Builder supersededBy(Enumeration enumeration) {
      this.supersededBy.setEnumeration(enumeration);
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    public Builder supersededBy(Property property) {
      this.supersededBy.setProperty(property);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     */
    public Builder greater(QualitativeValue qualitativeValue) {
      this.greater = qualitativeValue;
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
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    public Builder additionalProperty(PropertyValue propertyValue) {
      this.additionalProperty = propertyValue;
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     */
    public Builder lesser(QualitativeValue qualitativeValue) {
      this.lesser = qualitativeValue;
      return this;
    }
    private QualitativeValue nonEqual;
    private PropertyValueOrStructuredValueOrQualitativeValueOrEnumerationOrQuantitativeValue valueReference;
    private QualitativeValue equal;
    private QualitativeValue greaterOrEqual;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private QualitativeValue lesserOrEqual;
    private String url;
    private String additionalType;
    private String sameAs;
    private String alternateName;
    private EnumerationOrProperty supersededBy;
    private QualitativeValue greater;
    private Action potentialAction;
    private String description;
    private PropertyValue additionalProperty;
    private QualitativeValue lesser;
  }

  protected SteeringPositionValue(QualitativeValue nonEqual, PropertyValueOrStructuredValueOrQualitativeValueOrEnumerationOrQuantitativeValue valueReference, QualitativeValue equal, QualitativeValue greaterOrEqual, String name, StringOrCreativeWork mainEntityOfPage, QualitativeValue lesserOrEqual, String url, String additionalType, String sameAs, String alternateName, EnumerationOrProperty supersededBy, QualitativeValue greater, Action potentialAction, String description, PropertyValue additionalProperty, QualitativeValue lesser) {
    super(nonEqual, valueReference, equal, greaterOrEqual, name, mainEntityOfPage, lesserOrEqual, url, additionalType, sameAs, alternateName, supersededBy, greater, description, potentialAction, additionalProperty, lesser);
  }
}
