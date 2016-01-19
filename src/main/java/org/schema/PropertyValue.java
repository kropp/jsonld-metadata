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

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.*;

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
  public Number getValue() {
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
  static final class PropertyValueThingBuilder implements Builder {
    /**
     * Creates new {@link PropertyValue} instance.
     */
    public PropertyValue build() {
      return new PropertyValue(minValue, unitCode, value, valueReference, unitText, propertyID, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Integer integer) {
      if (this.minValue == null) this.minValue = new Number();
      this.minValue.setInteger(integer);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Long minValue) {
      if (this.minValue == null) this.minValue = new Number();
      this.minValue.setLong(minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Float minValue) {
      if (this.minValue == null) this.minValue = new Number();
      this.minValue.setFloat(minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Double minValue) {
      if (this.minValue == null) this.minValue = new Number();
      this.minValue.setDouble(minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull String minValue) {
      if (this.minValue == null) this.minValue = new Number();
      this.minValue.setString(minValue);
      return this;
    }
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @NotNull public Builder unitCode(@NotNull String unitCode) {
      this.unitCode = unitCode;
      return this;
    }
    /**
     * The value of the quantitative value or property value node. For QuantitativeValue, the recommended type for values is 'Number'. For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    @NotNull public Builder value(@NotNull Integer integer) {
      if (this.value == null) this.value = new Number();
      this.value.setInteger(integer);
      return this;
    }
    /**
     * The value of the quantitative value or property value node. For QuantitativeValue, the recommended type for values is 'Number'. For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    @NotNull public Builder value(@NotNull Long value) {
      if (this.value == null) this.value = new Number();
      this.value.setLong(value);
      return this;
    }
    /**
     * The value of the quantitative value or property value node. For QuantitativeValue, the recommended type for values is 'Number'. For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    @NotNull public Builder value(@NotNull Float value) {
      if (this.value == null) this.value = new Number();
      this.value.setFloat(value);
      return this;
    }
    /**
     * The value of the quantitative value or property value node. For QuantitativeValue, the recommended type for values is 'Number'. For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    @NotNull public Builder value(@NotNull Double value) {
      if (this.value == null) this.value = new Number();
      this.value.setDouble(value);
      return this;
    }
    /**
     * The value of the quantitative value or property value node. For QuantitativeValue, the recommended type for values is 'Number'. For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    @NotNull public Builder value(@NotNull String value) {
      if (this.value == null) this.value = new Number();
      this.value.setString(value);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull Enumeration enumeration) {
      if (this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setEnumeration(enumeration);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull Enumeration.Builder enumeration) {
      return this.valueReference(enumeration.build());
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull PropertyValue propertyValue) {
      if (this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setPropertyValue(propertyValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull PropertyValue.Builder propertyValue) {
      return this.valueReference(propertyValue.build());
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QualitativeValue qualitativeValue) {
      if (this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setQualitativeValue(qualitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QualitativeValue.Builder qualitativeValue) {
      return this.valueReference(qualitativeValue.build());
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QuantitativeValue quantitativeValue) {
      if (this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.valueReference(quantitativeValue.build());
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull StructuredValue structuredValue) {
      if (this.valueReference == null) this.valueReference = new EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue();
      this.valueReference.setStructuredValue(structuredValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull StructuredValue.Builder structuredValue) {
      return this.valueReference(structuredValue.build());
    }
    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
<a href='unitCode'>unitCode</a>.
     */
    @NotNull public Builder unitText(@NotNull String unitText) {
      this.unitText = unitText;
      return this;
    }
    /**
     * A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. propertyID can be
(1) a prefixed string, mainly meant to be used with standards for product properties; (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), or (3)
a URL indicating the type of the property, either pointing to an external vocabulary, or a Web resource that describes the property (e.g. a glossary entry).
Standards bodies should promote a standard prefix for the identifiers of properties from their standards.
     */
    @NotNull public Builder propertyID(@NotNull String propertyID) {
      this.propertyID = propertyID;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(@NotNull String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }

    @Override public void fromMap(java.util.Map<String, Object> map) {
      for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
        final String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }
        if ("minValue".equals(key) && value instanceof Integer) { minValue((Integer)value); continue; }
        if ("minValue".equals(key) && value instanceof Long) { minValue((Long)value); continue; }
        if ("minValue".equals(key) && value instanceof Float) { minValue((Float)value); continue; }
        if ("minValue".equals(key) && value instanceof Double) { minValue((Double)value); continue; }
        if ("minValue".equals(key) && value instanceof String) { minValue((String)value); continue; }
        if ("unitCode".equals(key) && value instanceof String) { unitCode((String)value); continue; }
        if ("value".equals(key) && value instanceof Integer) { value((Integer)value); continue; }
        if ("value".equals(key) && value instanceof Long) { value((Long)value); continue; }
        if ("value".equals(key) && value instanceof Float) { value((Float)value); continue; }
        if ("value".equals(key) && value instanceof Double) { value((Double)value); continue; }
        if ("value".equals(key) && value instanceof String) { value((String)value); continue; }
        if ("valueReference".equals(key) && value instanceof Enumeration) { valueReference((Enumeration)value); continue; }
        if ("valueReference".equals(key) && value instanceof PropertyValue) { valueReference((PropertyValue)value); continue; }
        if ("valueReference".equals(key) && value instanceof QualitativeValue) { valueReference((QualitativeValue)value); continue; }
        if ("valueReference".equals(key) && value instanceof QuantitativeValue) { valueReference((QuantitativeValue)value); continue; }
        if ("valueReference".equals(key) && value instanceof StructuredValue) { valueReference((StructuredValue)value); continue; }
        if ("unitText".equals(key) && value instanceof String) { unitText((String)value); continue; }
        if ("propertyID".equals(key) && value instanceof String) { propertyID((String)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("@id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private Number minValue;
    private String unitCode;
    private Number value;
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
    private String id;
  }
  public interface Builder extends ThingBuilder<PropertyValue> {
    @NotNull Builder minValue(@NotNull Integer integer);
    @NotNull Builder minValue(@NotNull Long minValue);
    @NotNull Builder minValue(@NotNull Float minValue);
    @NotNull Builder minValue(@NotNull Double minValue);
    @NotNull Builder minValue(@NotNull String minValue);
    @NotNull Builder unitCode(@NotNull String unitCode);
    @NotNull Builder value(@NotNull Integer integer);
    @NotNull Builder value(@NotNull Long value);
    @NotNull Builder value(@NotNull Float value);
    @NotNull Builder value(@NotNull Double value);
    @NotNull Builder value(@NotNull String value);
    @NotNull Builder valueReference(@NotNull Enumeration enumeration);
    @NotNull Builder valueReference(@NotNull Enumeration.Builder enumeration);
    @NotNull Builder valueReference(@NotNull PropertyValue propertyValue);
    @NotNull Builder valueReference(@NotNull PropertyValue.Builder propertyValue);
    @NotNull Builder valueReference(@NotNull QualitativeValue qualitativeValue);
    @NotNull Builder valueReference(@NotNull QualitativeValue.Builder qualitativeValue);
    @NotNull Builder valueReference(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder valueReference(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder valueReference(@NotNull StructuredValue structuredValue);
    @NotNull Builder valueReference(@NotNull StructuredValue.Builder structuredValue);
    @NotNull Builder unitText(@NotNull String unitText);
    @NotNull Builder propertyID(@NotNull String propertyID);
    @NotNull Builder additionalType(@NotNull String additionalType);
    @NotNull Builder alternateName(@NotNull String alternateName);
    @NotNull Builder description(@NotNull String description);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull String mainEntityOfPage);
    @NotNull Builder name(@NotNull String name);
    @NotNull Builder sameAs(@NotNull String sameAs);
    @NotNull Builder url(@NotNull String url);
    @NotNull Builder potentialAction(@NotNull Action action);
    @NotNull Builder potentialAction(@NotNull Action.Builder action);
    @NotNull Builder id(@NotNull String id);
  }

  protected PropertyValue(Number minValue, String unitCode, Number value, EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue valueReference, String unitText, String propertyID, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myMinValue = minValue;
    myUnitCode = unitCode;
    myValue = value;
    myValueReference = valueReference;
    myUnitText = unitText;
    myPropertyID = propertyID;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myMinValue != null ? myMinValue.hashCode() : 0);
    result = 31 * result + (myUnitCode != null ? myUnitCode.hashCode() : 0);
    result = 31 * result + (myValue != null ? myValue.hashCode() : 0);
    result = 31 * result + (myValueReference != null ? myValueReference.hashCode() : 0);
    result = 31 * result + (myUnitText != null ? myUnitText.hashCode() : 0);
    result = 31 * result + (myPropertyID != null ? myPropertyID.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PropertyValue propertyValue = (PropertyValue) o;
    if (!super.equals(o)) return false;
    if (myMinValue != null ? !myMinValue.equals(propertyValue.myMinValue) : propertyValue.myMinValue != null) return false;
    if (myUnitCode != null ? !myUnitCode.equals(propertyValue.myUnitCode) : propertyValue.myUnitCode != null) return false;
    if (myValue != null ? !myValue.equals(propertyValue.myValue) : propertyValue.myValue != null) return false;
    if (myValueReference != null ? !myValueReference.equals(propertyValue.myValueReference) : propertyValue.myValueReference != null) return false;
    if (myUnitText != null ? !myUnitText.equals(propertyValue.myUnitText) : propertyValue.myUnitText != null) return false;
    if (myPropertyID != null ? !myPropertyID.equals(propertyValue.myPropertyID) : propertyValue.myPropertyID != null) return false;
    return true;
  }

  private Number myMinValue;
  private String myUnitCode;
  private Number myValue;
  private EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue myValueReference;
  private String myUnitText;
  private String myPropertyID;
}
