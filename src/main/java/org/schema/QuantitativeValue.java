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
 *  A point value or interval for product characteristics and other purposes.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class QuantitativeValue extends StructuredValue {
  /**
   * The upper value of some characteristic or property.
   */
  public Number getMaxValue() {
    return myMaxValue;
  }
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
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

   */
  public PropertyValue getAdditionalProperty() {
    return myAdditionalProperty;
  }
  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
<a href='unitCode'>unitCode</a>.
   */
  public String getUnitText() {
    return myUnitText;
  }
  /**
   * Builder for {@link QuantitativeValue}
   */
  static final class QuantitativeValueThingBuilder implements Builder {
    /**
     * Creates new {@link QuantitativeValue} instance.
     */
    public QuantitativeValue build() {
      return new QuantitativeValue(maxValue, minValue, unitCode, value, valueReference, additionalProperty, unitText, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Integer integer) {
      if (this.maxValue == null) this.maxValue = new Number();
      this.maxValue.setInteger(integer);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Long maxValue) {
      if (this.maxValue == null) this.maxValue = new Number();
      this.maxValue.setLong(maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Float maxValue) {
      if (this.maxValue == null) this.maxValue = new Number();
      this.maxValue.setFloat(maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Double maxValue) {
      if (this.maxValue == null) this.maxValue = new Number();
      this.maxValue.setDouble(maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull String maxValue) {
      if (this.maxValue == null) this.maxValue = new Number();
      this.maxValue.setString(maxValue);
      return this;
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
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      this.additionalProperty = propertyValue;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      return this.additionalProperty(propertyValue.build());
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
        if ("maxValue".equals(key) && value instanceof Integer) { maxValue((Integer)value); continue; }
        if ("maxValue".equals(key) && value instanceof Long) { maxValue((Long)value); continue; }
        if ("maxValue".equals(key) && value instanceof Float) { maxValue((Float)value); continue; }
        if ("maxValue".equals(key) && value instanceof Double) { maxValue((Double)value); continue; }
        if ("maxValue".equals(key) && value instanceof String) { maxValue((String)value); continue; }
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
        if ("additionalProperty".equals(key) && value instanceof PropertyValue) { additionalProperty((PropertyValue)value); continue; }
        if ("unitText".equals(key) && value instanceof String) { unitText((String)value); continue; }
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
    private Number maxValue;
    private Number minValue;
    private String unitCode;
    private Number value;
    private EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue valueReference;
    private PropertyValue additionalProperty;
    private String unitText;
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
  public interface Builder extends ThingBuilder<QuantitativeValue> {
    @NotNull Builder maxValue(@NotNull Integer integer);
    @NotNull Builder maxValue(@NotNull Long maxValue);
    @NotNull Builder maxValue(@NotNull Float maxValue);
    @NotNull Builder maxValue(@NotNull Double maxValue);
    @NotNull Builder maxValue(@NotNull String maxValue);
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
    @NotNull Builder additionalProperty(@NotNull PropertyValue propertyValue);
    @NotNull Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue);
    @NotNull Builder unitText(@NotNull String unitText);
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

  protected QuantitativeValue(Number maxValue, Number minValue, String unitCode, Number value, EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue valueReference, PropertyValue additionalProperty, String unitText, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myMaxValue = maxValue;
    myMinValue = minValue;
    myUnitCode = unitCode;
    myValue = value;
    myValueReference = valueReference;
    myAdditionalProperty = additionalProperty;
    myUnitText = unitText;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myMaxValue != null ? myMaxValue.hashCode() : 0);
    result = 31 * result + (myMinValue != null ? myMinValue.hashCode() : 0);
    result = 31 * result + (myUnitCode != null ? myUnitCode.hashCode() : 0);
    result = 31 * result + (myValue != null ? myValue.hashCode() : 0);
    result = 31 * result + (myValueReference != null ? myValueReference.hashCode() : 0);
    result = 31 * result + (myAdditionalProperty != null ? myAdditionalProperty.hashCode() : 0);
    result = 31 * result + (myUnitText != null ? myUnitText.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantitativeValue quantitativeValue = (QuantitativeValue) o;
    if (!super.equals(o)) return false;
    if (myMaxValue != null ? !myMaxValue.equals(quantitativeValue.myMaxValue) : quantitativeValue.myMaxValue != null) return false;
    if (myMinValue != null ? !myMinValue.equals(quantitativeValue.myMinValue) : quantitativeValue.myMinValue != null) return false;
    if (myUnitCode != null ? !myUnitCode.equals(quantitativeValue.myUnitCode) : quantitativeValue.myUnitCode != null) return false;
    if (myValue != null ? !myValue.equals(quantitativeValue.myValue) : quantitativeValue.myValue != null) return false;
    if (myValueReference != null ? !myValueReference.equals(quantitativeValue.myValueReference) : quantitativeValue.myValueReference != null) return false;
    if (myAdditionalProperty != null ? !myAdditionalProperty.equals(quantitativeValue.myAdditionalProperty) : quantitativeValue.myAdditionalProperty != null) return false;
    if (myUnitText != null ? !myUnitText.equals(quantitativeValue.myUnitText) : quantitativeValue.myUnitText != null) return false;
    return true;
  }

  private Number myMaxValue;
  private Number myMinValue;
  private String myUnitCode;
  private Number myValue;
  private EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue myValueReference;
  private PropertyValue myAdditionalProperty;
  private String myUnitText;
}
