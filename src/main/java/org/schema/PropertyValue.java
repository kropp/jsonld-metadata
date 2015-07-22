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
 */

package org.schema;

/**
 * A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.
  *         <br/><br/>
  *         Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.
  *     
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class PropertyValue extends StructuredValue {
  /**
   * The lower value of some characteristic or property.
   */
  public Number getMinValue() {
    return myMinValue;
  }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   */
  public String getUnitCode() {
    return myUnitCode;
  }
  /**
   * The value of the quantitative value or property value node. For QuantitativeValue, the recommended type for values is 'Number'. For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  public BooleanOrNumberOrStringOrStructuredValue getValue() {
    return myValue;
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  public EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue getValueReference() {
    return myValueReference;
  }
  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
<a href='unitCode'>unitCode</a>.
   */
  public String getUnitText() {
    return myUnitText;
  }
  /**
   * A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. propertyID can be
(1) a prefixed string, mainly meant to be used with standards for product properties; (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), or (3)
a URL indicating the type of the property, either pointing to an external vocabulary, or a Web resource that describes the property (e.g. a glossary entry).
Standards bodies should promote a standard prefix for the identifiers of properties from their standards.
   */
  public String getPropertyID() {
    return myPropertyID;
  }
  /**
   * Builder for {@link PropertyValue}
   */
  public static final class Builder {
    /**
     * Creates new {@link PropertyValue} instance.
     */
    public PropertyValue build() {
      return new PropertyValue(minValue, unitCode, value, valueReference, unitText, propertyID, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
    }
    /**
     * The lower value of some characteristic or property.
     */
    public Builder minValue(Number number) {
      this.minValue = number;
      return this;
    }
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    public Builder unitCode(String unitCode) {
      this.unitCode = unitCode;
      return this;
    }
    /**
     * The value of the quantitative value or property value node. For QuantitativeValue, the recommended type for values is 'Number'. For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    public Builder value(Boolean value) {
      if(this.value == null) this.value = new BooleanOrNumberOrStringOrStructuredValue();
      this.value.setBoolean(value);
      return this;
    }
    /**
     * The value of the quantitative value or property value node. For QuantitativeValue, the recommended type for values is 'Number'. For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    public Builder value(Number number) {
      if(this.value == null) this.value = new BooleanOrNumberOrStringOrStructuredValue();
      this.value.setNumber(number);
      return this;
    }
    /**
     * The value of the quantitative value or property value node. For QuantitativeValue, the recommended type for values is 'Number'. For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    public Builder value(String value) {
      if(this.value == null) this.value = new BooleanOrNumberOrStringOrStructuredValue();
      this.value.setString(value);
      return this;
    }
    /**
     * The value of the quantitative value or property value node. For QuantitativeValue, the recommended type for values is 'Number'. For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    public Builder value(StructuredValue structuredValue) {
      if(this.value == null) this.value = new BooleanOrNumberOrStringOrStructuredValue();
      this.value.setStructuredValue(structuredValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(Enumeration enumeration) {
      if(this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setEnumeration(enumeration);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(PropertyValue propertyValue) {
      if(this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setPropertyValue(propertyValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(QualitativeValue qualitativeValue) {
      if(this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setQualitativeValue(qualitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(QuantitativeValue quantitativeValue) {
      if(this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    public Builder valueReference(StructuredValue structuredValue) {
      if(this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setStructuredValue(structuredValue);
      return this;
    }
    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
<a href='unitCode'>unitCode</a>.
     */
    public Builder unitText(String unitText) {
      this.unitText = unitText;
      return this;
    }
    /**
     * A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. propertyID can be
(1) a prefixed string, mainly meant to be used with standards for product properties; (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), or (3)
a URL indicating the type of the property, either pointing to an external vocabulary, or a Web resource that describes the property (e.g. a glossary entry).
Standards bodies should promote a standard prefix for the identifiers of properties from their standards.
     */
    public Builder propertyID(String propertyID) {
      this.propertyID = propertyID;
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
      if(this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      if(this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
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
    private Number minValue;
    private String unitCode;
    private BooleanOrNumberOrStringOrStructuredValue value;
    private EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue valueReference;
    private String unitText;
    private String propertyID;
    private String additionalType;
    private String alternateName;
    private String description;
    private CreativeWorkOrString mainEntityOfPage;
    private String name;
    private String sameAs;
    private String url;
    private Action potentialAction;
  }

  protected PropertyValue(Number minValue, String unitCode, BooleanOrNumberOrStringOrStructuredValue value, EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue valueReference, String unitText, String propertyID, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
    myMinValue = minValue;
    myUnitCode = unitCode;
    myValue = value;
    myValueReference = valueReference;
    myUnitText = unitText;
    myPropertyID = propertyID;
  }
  private Number myMinValue;
  private String myUnitCode;
  private BooleanOrNumberOrStringOrStructuredValue myValue;
  private EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue myValueReference;
  private String myUnitText;
  private String myPropertyID;
}
