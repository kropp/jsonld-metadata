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

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *  A point value or interval for product characteristics and other purposes.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class QuantitativeValue extends StructuredValue {
  /**
   * The upper value of some characteristic or property.
   */
  @JsonIgnore public Integer getMaxValueInteger() {
    return (Integer) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
   */
  @JsonIgnore public Collection<Integer> getMaxValueIntegers() {
    final Object current = myData.get("maxValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The upper value of some characteristic or property.
   */
  @JsonIgnore public Long getMaxValueLong() {
    return (Long) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
   */
  @JsonIgnore public Collection<Long> getMaxValueLongs() {
    final Object current = myData.get("maxValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The upper value of some characteristic or property.
   */
  @JsonIgnore public Float getMaxValueFloat() {
    return (Float) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
   */
  @JsonIgnore public Collection<Float> getMaxValueFloats() {
    final Object current = myData.get("maxValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The upper value of some characteristic or property.
   */
  @JsonIgnore public Double getMaxValueDouble() {
    return (Double) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
   */
  @JsonIgnore public Collection<Double> getMaxValueDoubles() {
    final Object current = myData.get("maxValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The upper value of some characteristic or property.
   */
  @JsonIgnore public String getMaxValueString() {
    return (String) getValue("maxValue");
  }
  /**
   * The upper value of some characteristic or property.
   */
  @JsonIgnore public Collection<String> getMaxValueStrings() {
    final Object current = myData.get("maxValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The lower value of some characteristic or property.
   */
  @JsonIgnore public Integer getMinValueInteger() {
    return (Integer) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
   */
  @JsonIgnore public Collection<Integer> getMinValueIntegers() {
    final Object current = myData.get("minValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The lower value of some characteristic or property.
   */
  @JsonIgnore public Long getMinValueLong() {
    return (Long) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
   */
  @JsonIgnore public Collection<Long> getMinValueLongs() {
    final Object current = myData.get("minValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The lower value of some characteristic or property.
   */
  @JsonIgnore public Float getMinValueFloat() {
    return (Float) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
   */
  @JsonIgnore public Collection<Float> getMinValueFloats() {
    final Object current = myData.get("minValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The lower value of some characteristic or property.
   */
  @JsonIgnore public Double getMinValueDouble() {
    return (Double) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
   */
  @JsonIgnore public Collection<Double> getMinValueDoubles() {
    final Object current = myData.get("minValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The lower value of some characteristic or property.
   */
  @JsonIgnore public String getMinValueString() {
    return (String) getValue("minValue");
  }
  /**
   * The lower value of some characteristic or property.
   */
  @JsonIgnore public Collection<String> getMinValueStrings() {
    final Object current = myData.get("minValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   */
  @JsonIgnore public String getUnitCode() {
    return (String) getValue("unitCode");
  }
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
   */
  @JsonIgnore public Collection<String> getUnitCodes() {
    final Object current = myData.get("unitCode");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  @JsonIgnore public Integer getValueInteger() {
    return (Integer) getValue("value");
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  @JsonIgnore public Collection<Integer> getValueIntegers() {
    final Object current = myData.get("value");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  @JsonIgnore public Long getValueLong() {
    return (Long) getValue("value");
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  @JsonIgnore public Collection<Long> getValueLongs() {
    final Object current = myData.get("value");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  @JsonIgnore public Float getValueFloat() {
    return (Float) getValue("value");
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  @JsonIgnore public Collection<Float> getValueFloats() {
    final Object current = myData.get("value");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  @JsonIgnore public Double getValueDouble() {
    return (Double) getValue("value");
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  @JsonIgnore public Collection<Double> getValueDoubles() {
    final Object current = myData.get("value");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  @JsonIgnore public String getValueString() {
    return (String) getValue("value");
  }
  /**
   * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
   */
  @JsonIgnore public Collection<String> getValueStrings() {
    final Object current = myData.get("value");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  @JsonIgnore public Enumeration getValueReferenceEnumeration() {
    return (Enumeration) getValue("valueReference");
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  @JsonIgnore public Collection<Enumeration> getValueReferenceEnumerations() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Enumeration>) current;
    }
    return Arrays.asList((Enumeration) current);
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  @JsonIgnore public PropertyValue getValueReferencePropertyValue() {
    return (PropertyValue) getValue("valueReference");
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  @JsonIgnore public Collection<PropertyValue> getValueReferencePropertyValues() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  @JsonIgnore public QualitativeValue getValueReferenceQualitativeValue() {
    return (QualitativeValue) getValue("valueReference");
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  @JsonIgnore public Collection<QualitativeValue> getValueReferenceQualitativeValues() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QualitativeValue>) current;
    }
    return Arrays.asList((QualitativeValue) current);
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  @JsonIgnore public QuantitativeValue getValueReferenceQuantitativeValue() {
    return (QuantitativeValue) getValue("valueReference");
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  @JsonIgnore public Collection<QuantitativeValue> getValueReferenceQuantitativeValues() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  @JsonIgnore public StructuredValue getValueReferenceStructuredValue() {
    return (StructuredValue) getValue("valueReference");
  }
  /**
   * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
   */
  @JsonIgnore public Collection<StructuredValue> getValueReferenceStructuredValues() {
    final Object current = myData.get("valueReference");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<StructuredValue>) current;
    }
    return Arrays.asList((StructuredValue) current);
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   */
  @JsonIgnore public PropertyValue getAdditionalProperty() {
    return (PropertyValue) getValue("additionalProperty");
  }
  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   * 
   */
  @JsonIgnore public Collection<PropertyValue> getAdditionalPropertys() {
    final Object current = myData.get("additionalProperty");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PropertyValue>) current;
    }
    return Arrays.asList((PropertyValue) current);
  }
  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
   * <a href='unitCode'>unitCode</a>.
   */
  @JsonIgnore public String getUnitText() {
    return (String) getValue("unitText");
  }
  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
   * <a href='unitCode'>unitCode</a>.
   */
  @JsonIgnore public Collection<String> getUnitTexts() {
    final Object current = myData.get("unitText");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected QuantitativeValue(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link QuantitativeValue}
   */
  public static class Builder extends StructuredValue.Builder {
    @NotNull public QuantitativeValue build() {
      return new QuantitativeValue(myData);
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Integer integer) {
      putValue("maxValue", integer);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Long maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Float maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull Double maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The upper value of some characteristic or property.
     */
    @NotNull public Builder maxValue(@NotNull String maxValue) {
      putValue("maxValue", maxValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Integer integer) {
      putValue("minValue", integer);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Long minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Float minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull Double minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(@NotNull String minValue) {
      putValue("minValue", minValue);
      return this;
    }
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @NotNull public Builder unitCode(@NotNull String unitCode) {
      putValue("unitCode", unitCode);
      return this;
    }
    /**
     * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    @NotNull public Builder value(@NotNull Integer integer) {
      putValue("value", integer);
      return this;
    }
    /**
     * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    @NotNull public Builder value(@NotNull Long value) {
      putValue("value", value);
      return this;
    }
    /**
     * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    @NotNull public Builder value(@NotNull Float value) {
      putValue("value", value);
      return this;
    }
    /**
     * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    @NotNull public Builder value(@NotNull Double value) {
      putValue("value", value);
      return this;
    }
    /**
     * The value of the quantitative value or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
     */
    @NotNull public Builder value(@NotNull String value) {
      putValue("value", value);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull Enumeration enumeration) {
      putValue("valueReference", enumeration);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull Enumeration.Builder enumeration) {
      putValue("valueReference", enumeration.build());
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull PropertyValue propertyValue) {
      putValue("valueReference", propertyValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull PropertyValue.Builder propertyValue) {
      putValue("valueReference", propertyValue.build());
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QualitativeValue qualitativeValue) {
      putValue("valueReference", qualitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("valueReference", qualitativeValue.build());
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QuantitativeValue quantitativeValue) {
      putValue("valueReference", quantitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("valueReference", quantitativeValue.build());
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull StructuredValue structuredValue) {
      putValue("valueReference", structuredValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull StructuredValue.Builder structuredValue) {
      putValue("valueReference", structuredValue.build());
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      putValue("additionalProperty", propertyValue);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      putValue("additionalProperty", propertyValue.build());
      return this;
    }
    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * <a href='unitCode'>unitCode</a>.
     */
    @NotNull public Builder unitText(@NotNull String unitText) {
      putValue("unitText", unitText);
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("maxValue".equals(key) && value instanceof Integer) { maxValue((Integer)value); return; }
      if ("maxValue".equals(key) && value instanceof Long) { maxValue((Long)value); return; }
      if ("maxValue".equals(key) && value instanceof Float) { maxValue((Float)value); return; }
      if ("maxValue".equals(key) && value instanceof Double) { maxValue((Double)value); return; }
      if ("maxValue".equals(key) && value instanceof String) { maxValue((String)value); return; }
      if ("minValue".equals(key) && value instanceof Integer) { minValue((Integer)value); return; }
      if ("minValue".equals(key) && value instanceof Long) { minValue((Long)value); return; }
      if ("minValue".equals(key) && value instanceof Float) { minValue((Float)value); return; }
      if ("minValue".equals(key) && value instanceof Double) { minValue((Double)value); return; }
      if ("minValue".equals(key) && value instanceof String) { minValue((String)value); return; }
      if ("unitCode".equals(key) && value instanceof String) { unitCode((String)value); return; }
      if ("value".equals(key) && value instanceof Integer) { value((Integer)value); return; }
      if ("value".equals(key) && value instanceof Long) { value((Long)value); return; }
      if ("value".equals(key) && value instanceof Float) { value((Float)value); return; }
      if ("value".equals(key) && value instanceof Double) { value((Double)value); return; }
      if ("value".equals(key) && value instanceof String) { value((String)value); return; }
      if ("valueReference".equals(key) && value instanceof Enumeration) { valueReference((Enumeration)value); return; }
      if ("valueReference".equals(key) && value instanceof PropertyValue) { valueReference((PropertyValue)value); return; }
      if ("valueReference".equals(key) && value instanceof QualitativeValue) { valueReference((QualitativeValue)value); return; }
      if ("valueReference".equals(key) && value instanceof QuantitativeValue) { valueReference((QuantitativeValue)value); return; }
      if ("valueReference".equals(key) && value instanceof StructuredValue) { valueReference((StructuredValue)value); return; }
      if ("additionalProperty".equals(key) && value instanceof PropertyValue) { additionalProperty((PropertyValue)value); return; }
      if ("unitText".equals(key) && value instanceof String) { unitText((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
