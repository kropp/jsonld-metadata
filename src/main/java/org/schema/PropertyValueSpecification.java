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
 * A Property value specification.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass
 */
public class PropertyValueSpecification extends Intangible {
  /**
   * The lower value of some characteristic or property.
   */
  public Number getMinValue() {
    return myMinValue;
  }
  /**
   * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
   */
  public String getValueName() {
    return myValueName;
  }
  /**
   * Whether the property must be filled in to complete the action.  Default is false.
   */
  public Boolean getValueRequired() {
    return myValueRequired;
  }
  /**
   * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
   */
  public StringOrThing getDefaultValue() {
    return myDefaultValue;
  }
  /**
   * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
   */
  public Boolean getReadonlyValue() {
    return myReadonlyValue;
  }
  /**
   * Whether multiple values are allowed for the property.  Default is false.
   */
  public Boolean getMultipleValues() {
    return myMultipleValues;
  }
  /**
   * Specifies the minimum allowed range for number of characters in a literal value.
   */
  public Number getValueMinLength() {
    return myValueMinLength;
  }
  /**
   * Specifies the allowed range for number of characters in a literal value.
   */
  public Number getValueMaxLength() {
    return myValueMaxLength;
  }
  /**
   * Specifies a regular expression for testing literal values according to the HTML spec.
   */
  public String getValuePattern() {
    return myValuePattern;
  }
  /**
   * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
   */
  public Number getStepValue() {
    return myStepValue;
  }
  /**
   * Builder for {@link PropertyValueSpecification}
   */
  static final class PropertyValueSpecificationThingBuilder implements Builder {
    /**
     * Creates new {@link PropertyValueSpecification} instance.
     */
    public PropertyValueSpecification build() {
      return new PropertyValueSpecification(minValue, valueName, valueRequired, defaultValue, readonlyValue, multipleValues, valueMinLength, valueMaxLength, valuePattern, stepValue, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
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
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     */
    @NotNull public Builder valueName(@NotNull String valueName) {
      this.valueName = valueName;
      return this;
    }
    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     */
    @NotNull public Builder valueRequired(@NotNull Boolean valueRequired) {
      this.valueRequired = valueRequired;
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @NotNull public Builder defaultValue(@NotNull String defaultValue) {
      if (this.defaultValue == null) this.defaultValue = new StringOrThing();
      this.defaultValue.setString(defaultValue);
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @NotNull public Builder defaultValue(@NotNull Thing thing) {
      if (this.defaultValue == null) this.defaultValue = new StringOrThing();
      this.defaultValue.setThing(thing);
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @NotNull public Builder defaultValue(@NotNull Thing.Builder thing) {
      return this.defaultValue(thing.build());
    }
    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
     */
    @NotNull public Builder readonlyValue(@NotNull Boolean readonlyValue) {
      this.readonlyValue = readonlyValue;
      return this;
    }
    /**
     * Whether multiple values are allowed for the property.  Default is false.
     */
    @NotNull public Builder multipleValues(@NotNull Boolean multipleValues) {
      this.multipleValues = multipleValues;
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(@NotNull Integer integer) {
      if (this.valueMinLength == null) this.valueMinLength = new Number();
      this.valueMinLength.setInteger(integer);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(@NotNull Long valueMinLength) {
      if (this.valueMinLength == null) this.valueMinLength = new Number();
      this.valueMinLength.setLong(valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(@NotNull Float valueMinLength) {
      if (this.valueMinLength == null) this.valueMinLength = new Number();
      this.valueMinLength.setFloat(valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(@NotNull Double valueMinLength) {
      if (this.valueMinLength == null) this.valueMinLength = new Number();
      this.valueMinLength.setDouble(valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(@NotNull String valueMinLength) {
      if (this.valueMinLength == null) this.valueMinLength = new Number();
      this.valueMinLength.setString(valueMinLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(@NotNull Integer integer) {
      if (this.valueMaxLength == null) this.valueMaxLength = new Number();
      this.valueMaxLength.setInteger(integer);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(@NotNull Long valueMaxLength) {
      if (this.valueMaxLength == null) this.valueMaxLength = new Number();
      this.valueMaxLength.setLong(valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(@NotNull Float valueMaxLength) {
      if (this.valueMaxLength == null) this.valueMaxLength = new Number();
      this.valueMaxLength.setFloat(valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(@NotNull Double valueMaxLength) {
      if (this.valueMaxLength == null) this.valueMaxLength = new Number();
      this.valueMaxLength.setDouble(valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(@NotNull String valueMaxLength) {
      if (this.valueMaxLength == null) this.valueMaxLength = new Number();
      this.valueMaxLength.setString(valueMaxLength);
      return this;
    }
    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     */
    @NotNull public Builder valuePattern(@NotNull String valuePattern) {
      this.valuePattern = valuePattern;
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(@NotNull Integer integer) {
      if (this.stepValue == null) this.stepValue = new Number();
      this.stepValue.setInteger(integer);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(@NotNull Long stepValue) {
      if (this.stepValue == null) this.stepValue = new Number();
      this.stepValue.setLong(stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(@NotNull Float stepValue) {
      if (this.stepValue == null) this.stepValue = new Number();
      this.stepValue.setFloat(stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(@NotNull Double stepValue) {
      if (this.stepValue == null) this.stepValue = new Number();
      this.stepValue.setDouble(stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(@NotNull String stepValue) {
      if (this.stepValue == null) this.stepValue = new Number();
      this.stepValue.setString(stepValue);
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
        if ("valueName".equals(key) && value instanceof String) { valueName((String)value); continue; }
        if ("valueRequired".equals(key) && value instanceof Boolean) { valueRequired((Boolean)value); continue; }
        if ("defaultValue".equals(key) && value instanceof String) { defaultValue((String)value); continue; }
        if ("defaultValue".equals(key) && value instanceof Thing) { defaultValue((Thing)value); continue; }
        if ("readonlyValue".equals(key) && value instanceof Boolean) { readonlyValue((Boolean)value); continue; }
        if ("multipleValues".equals(key) && value instanceof Boolean) { multipleValues((Boolean)value); continue; }
        if ("valueMinLength".equals(key) && value instanceof Integer) { valueMinLength((Integer)value); continue; }
        if ("valueMinLength".equals(key) && value instanceof Long) { valueMinLength((Long)value); continue; }
        if ("valueMinLength".equals(key) && value instanceof Float) { valueMinLength((Float)value); continue; }
        if ("valueMinLength".equals(key) && value instanceof Double) { valueMinLength((Double)value); continue; }
        if ("valueMinLength".equals(key) && value instanceof String) { valueMinLength((String)value); continue; }
        if ("valueMaxLength".equals(key) && value instanceof Integer) { valueMaxLength((Integer)value); continue; }
        if ("valueMaxLength".equals(key) && value instanceof Long) { valueMaxLength((Long)value); continue; }
        if ("valueMaxLength".equals(key) && value instanceof Float) { valueMaxLength((Float)value); continue; }
        if ("valueMaxLength".equals(key) && value instanceof Double) { valueMaxLength((Double)value); continue; }
        if ("valueMaxLength".equals(key) && value instanceof String) { valueMaxLength((String)value); continue; }
        if ("valuePattern".equals(key) && value instanceof String) { valuePattern((String)value); continue; }
        if ("stepValue".equals(key) && value instanceof Integer) { stepValue((Integer)value); continue; }
        if ("stepValue".equals(key) && value instanceof Long) { stepValue((Long)value); continue; }
        if ("stepValue".equals(key) && value instanceof Float) { stepValue((Float)value); continue; }
        if ("stepValue".equals(key) && value instanceof Double) { stepValue((Double)value); continue; }
        if ("stepValue".equals(key) && value instanceof String) { stepValue((String)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private Number minValue;
    private String valueName;
    private Boolean valueRequired;
    private StringOrThing defaultValue;
    private Boolean readonlyValue;
    private Boolean multipleValues;
    private Number valueMinLength;
    private Number valueMaxLength;
    private String valuePattern;
    private Number stepValue;
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
  public interface Builder extends ThingBuilder<PropertyValueSpecification> {
    @NotNull Builder minValue(@NotNull Integer integer);
    @NotNull Builder minValue(@NotNull Long minValue);
    @NotNull Builder minValue(@NotNull Float minValue);
    @NotNull Builder minValue(@NotNull Double minValue);
    @NotNull Builder minValue(@NotNull String minValue);
    @NotNull Builder valueName(@NotNull String valueName);
    @NotNull Builder valueRequired(@NotNull Boolean valueRequired);
    @NotNull Builder defaultValue(@NotNull String defaultValue);
    @NotNull Builder defaultValue(@NotNull Thing thing);
    @NotNull Builder defaultValue(@NotNull Thing.Builder thing);
    @NotNull Builder readonlyValue(@NotNull Boolean readonlyValue);
    @NotNull Builder multipleValues(@NotNull Boolean multipleValues);
    @NotNull Builder valueMinLength(@NotNull Integer integer);
    @NotNull Builder valueMinLength(@NotNull Long valueMinLength);
    @NotNull Builder valueMinLength(@NotNull Float valueMinLength);
    @NotNull Builder valueMinLength(@NotNull Double valueMinLength);
    @NotNull Builder valueMinLength(@NotNull String valueMinLength);
    @NotNull Builder valueMaxLength(@NotNull Integer integer);
    @NotNull Builder valueMaxLength(@NotNull Long valueMaxLength);
    @NotNull Builder valueMaxLength(@NotNull Float valueMaxLength);
    @NotNull Builder valueMaxLength(@NotNull Double valueMaxLength);
    @NotNull Builder valueMaxLength(@NotNull String valueMaxLength);
    @NotNull Builder valuePattern(@NotNull String valuePattern);
    @NotNull Builder stepValue(@NotNull Integer integer);
    @NotNull Builder stepValue(@NotNull Long stepValue);
    @NotNull Builder stepValue(@NotNull Float stepValue);
    @NotNull Builder stepValue(@NotNull Double stepValue);
    @NotNull Builder stepValue(@NotNull String stepValue);
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

  protected PropertyValueSpecification(Number minValue, String valueName, Boolean valueRequired, StringOrThing defaultValue, Boolean readonlyValue, Boolean multipleValues, Number valueMinLength, Number valueMaxLength, String valuePattern, Number stepValue, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myMinValue = minValue;
    myValueName = valueName;
    myValueRequired = valueRequired;
    myDefaultValue = defaultValue;
    myReadonlyValue = readonlyValue;
    myMultipleValues = multipleValues;
    myValueMinLength = valueMinLength;
    myValueMaxLength = valueMaxLength;
    myValuePattern = valuePattern;
    myStepValue = stepValue;
  }
  private Number myMinValue;
  private String myValueName;
  private Boolean myValueRequired;
  private StringOrThing myDefaultValue;
  private Boolean myReadonlyValue;
  private Boolean myMultipleValues;
  private Number myValueMinLength;
  private Number myValueMaxLength;
  private String myValuePattern;
  private Number myStepValue;
}
