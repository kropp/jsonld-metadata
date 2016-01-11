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
 * A predefined value for a product characteristic, e.g. the power cord plug type "US" or the garment sizes "S", "M", "L", and "XL".
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class QualitativeValue extends Enumeration {
  /**
   * This ordering relation for qualitative values indicates that the subject is equal to the object.
   */
  public QualitativeValue getEqual() {
    return myEqual;
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is greater than the object.
   */
  public QualitativeValue getGreater() {
    return myGreater;
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
   */
  public QualitativeValue getGreaterOrEqual() {
    return myGreaterOrEqual;
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is lesser than the object.
   */
  public QualitativeValue getLesser() {
    return myLesser;
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
   */
  public QualitativeValue getLesserOrEqual() {
    return myLesserOrEqual;
  }
  /**
   * This ordering relation for qualitative values indicates that the subject is not equal to the object.
   */
  public QualitativeValue getNonEqual() {
    return myNonEqual;
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  public EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue getValueReference() {
    return myValueReference;
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

   */
  public PropertyValue getAdditionalProperty() {
    return myAdditionalProperty;
  }
  /**
   * Builder for {@link QualitativeValue}
   */
  public static final class QualitativeValueThingBuilder implements Builder {
    /**
     * Creates new {@link QualitativeValue} instance.
     */
    public QualitativeValue build() {
      return new QualitativeValue(equal, greater, greaterOrEqual, lesser, lesserOrEqual, nonEqual, valueReference, additionalProperty, supersededBy, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     */
    public Builder equal(QualitativeValue qualitativeValue) {
      this.equal = qualitativeValue;
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     */
    public Builder equal(QualitativeValue.Builder qualitativeValue) {
      return this.equal(qualitativeValue.build());
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     */
    public Builder greater(QualitativeValue qualitativeValue) {
      this.greater = qualitativeValue;
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     */
    public Builder greater(QualitativeValue.Builder qualitativeValue) {
      return this.greater(qualitativeValue.build());
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     */
    public Builder greaterOrEqual(QualitativeValue qualitativeValue) {
      this.greaterOrEqual = qualitativeValue;
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     */
    public Builder greaterOrEqual(QualitativeValue.Builder qualitativeValue) {
      return this.greaterOrEqual(qualitativeValue.build());
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     */
    public Builder lesser(QualitativeValue qualitativeValue) {
      this.lesser = qualitativeValue;
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     */
    public Builder lesser(QualitativeValue.Builder qualitativeValue) {
      return this.lesser(qualitativeValue.build());
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     */
    public Builder lesserOrEqual(QualitativeValue qualitativeValue) {
      this.lesserOrEqual = qualitativeValue;
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     */
    public Builder lesserOrEqual(QualitativeValue.Builder qualitativeValue) {
      return this.lesserOrEqual(qualitativeValue.build());
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     */
    public Builder nonEqual(QualitativeValue qualitativeValue) {
      this.nonEqual = qualitativeValue;
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     */
    public Builder nonEqual(QualitativeValue.Builder qualitativeValue) {
      return this.nonEqual(qualitativeValue.build());
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(Enumeration enumeration) {
      if (this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setEnumeration(enumeration);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(Enumeration.Builder enumeration) {
      return this.valueReference(enumeration.build());
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(PropertyValue propertyValue) {
      if (this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setPropertyValue(propertyValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(PropertyValue.Builder propertyValue) {
      return this.valueReference(propertyValue.build());
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(QualitativeValue qualitativeValue) {
      if (this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setQualitativeValue(qualitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(QualitativeValue.Builder qualitativeValue) {
      return this.valueReference(qualitativeValue.build());
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(QuantitativeValue quantitativeValue) {
      if (this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(QuantitativeValue.Builder quantitativeValue) {
      return this.valueReference(quantitativeValue.build());
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(StructuredValue structuredValue) {
      if (this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setStructuredValue(structuredValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(StructuredValue.Builder structuredValue) {
      return this.valueReference(structuredValue.build());
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
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    public Builder additionalProperty(PropertyValue.Builder propertyValue) {
      return this.additionalProperty(propertyValue.build());
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    public Builder supersededBy(Enumeration enumeration) {
      if (this.supersededBy == null) this.supersededBy = new EnumerationOrProperty();
      this.supersededBy.setEnumeration(enumeration);
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    public Builder supersededBy(Enumeration.Builder enumeration) {
      return this.supersededBy(enumeration.build());
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    public Builder supersededBy(Property property) {
      if (this.supersededBy == null) this.supersededBy = new EnumerationOrProperty();
      this.supersededBy.setProperty(property);
      return this;
    }
    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    public Builder supersededBy(Property.Builder property) {
      return this.supersededBy(property.build());
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
    private QualitativeValue equal;
    private QualitativeValue greater;
    private QualitativeValue greaterOrEqual;
    private QualitativeValue lesser;
    private QualitativeValue lesserOrEqual;
    private QualitativeValue nonEqual;
    private EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue valueReference;
    private PropertyValue additionalProperty;
    private EnumerationOrProperty supersededBy;
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
  public interface Builder extends ThingBuilder<QualitativeValue> {
  Builder equal(QualitativeValue qualitativeValue);
  Builder equal(QualitativeValue.Builder qualitativeValue);
  Builder greater(QualitativeValue qualitativeValue);
  Builder greater(QualitativeValue.Builder qualitativeValue);
  Builder greaterOrEqual(QualitativeValue qualitativeValue);
  Builder greaterOrEqual(QualitativeValue.Builder qualitativeValue);
  Builder lesser(QualitativeValue qualitativeValue);
  Builder lesser(QualitativeValue.Builder qualitativeValue);
  Builder lesserOrEqual(QualitativeValue qualitativeValue);
  Builder lesserOrEqual(QualitativeValue.Builder qualitativeValue);
  Builder nonEqual(QualitativeValue qualitativeValue);
  Builder nonEqual(QualitativeValue.Builder qualitativeValue);
  Builder valueReference(Enumeration enumeration);
  Builder valueReference(Enumeration.Builder enumeration);
  Builder valueReference(PropertyValue propertyValue);
  Builder valueReference(PropertyValue.Builder propertyValue);
  Builder valueReference(QualitativeValue qualitativeValue);
  Builder valueReference(QualitativeValue.Builder qualitativeValue);
  Builder valueReference(QuantitativeValue quantitativeValue);
  Builder valueReference(QuantitativeValue.Builder quantitativeValue);
  Builder valueReference(StructuredValue structuredValue);
  Builder valueReference(StructuredValue.Builder structuredValue);
  Builder additionalProperty(PropertyValue propertyValue);
  Builder additionalProperty(PropertyValue.Builder propertyValue);
  Builder supersededBy(Enumeration enumeration);
  Builder supersededBy(Enumeration.Builder enumeration);
  Builder supersededBy(Property property);
  Builder supersededBy(Property.Builder property);
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

  protected QualitativeValue(QualitativeValue equal, QualitativeValue greater, QualitativeValue greaterOrEqual, QualitativeValue lesser, QualitativeValue lesserOrEqual, QualitativeValue nonEqual, EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue valueReference, PropertyValue additionalProperty, EnumerationOrProperty supersededBy, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(supersededBy, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myEqual = equal;
    myGreater = greater;
    myGreaterOrEqual = greaterOrEqual;
    myLesser = lesser;
    myLesserOrEqual = lesserOrEqual;
    myNonEqual = nonEqual;
    myValueReference = valueReference;
    myAdditionalProperty = additionalProperty;
  }
  private QualitativeValue myEqual;
  private QualitativeValue myGreater;
  private QualitativeValue myGreaterOrEqual;
  private QualitativeValue myLesser;
  private QualitativeValue myLesserOrEqual;
  private QualitativeValue myNonEqual;
  private EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue myValueReference;
  private PropertyValue myAdditionalProperty;
}
