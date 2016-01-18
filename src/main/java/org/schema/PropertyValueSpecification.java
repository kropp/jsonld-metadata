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
    @NotNull public Builder minValue(int minValue) {
      if (this.minValue == null) this.minValue = new Number();
      this.minValue.setInt(minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(long minValue) {
      if (this.minValue == null) this.minValue = new Number();
      this.minValue.setLong(minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(float minValue) {
      if (this.minValue == null) this.minValue = new Number();
      this.minValue.setFloat(minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(double minValue) {
      if (this.minValue == null) this.minValue = new Number();
      this.minValue.setDouble(minValue);
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    @NotNull public Builder minValue(String minValue) {
      if (this.minValue == null) this.minValue = new Number();
      this.minValue.setString(minValue);
      return this;
    }
    /**
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     */
    @NotNull public Builder valueName(String valueName) {
      this.valueName = valueName;
      return this;
    }
    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     */
    @NotNull public Builder valueRequired(Boolean valueRequired) {
      this.valueRequired = valueRequired;
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @NotNull public Builder defaultValue(String defaultValue) {
      if (this.defaultValue == null) this.defaultValue = new StringOrThing();
      this.defaultValue.setString(defaultValue);
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @NotNull public Builder defaultValue(Thing thing) {
      if (this.defaultValue == null) this.defaultValue = new StringOrThing();
      this.defaultValue.setThing(thing);
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @NotNull public Builder defaultValue(Thing.Builder thing) {
      return this.defaultValue(thing.build());
    }
    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
     */
    @NotNull public Builder readonlyValue(Boolean readonlyValue) {
      this.readonlyValue = readonlyValue;
      return this;
    }
    /**
     * Whether multiple values are allowed for the property.  Default is false.
     */
    @NotNull public Builder multipleValues(Boolean multipleValues) {
      this.multipleValues = multipleValues;
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(int valueMinLength) {
      if (this.valueMinLength == null) this.valueMinLength = new Number();
      this.valueMinLength.setInt(valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(long valueMinLength) {
      if (this.valueMinLength == null) this.valueMinLength = new Number();
      this.valueMinLength.setLong(valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(float valueMinLength) {
      if (this.valueMinLength == null) this.valueMinLength = new Number();
      this.valueMinLength.setFloat(valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(double valueMinLength) {
      if (this.valueMinLength == null) this.valueMinLength = new Number();
      this.valueMinLength.setDouble(valueMinLength);
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMinLength(String valueMinLength) {
      if (this.valueMinLength == null) this.valueMinLength = new Number();
      this.valueMinLength.setString(valueMinLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(int valueMaxLength) {
      if (this.valueMaxLength == null) this.valueMaxLength = new Number();
      this.valueMaxLength.setInt(valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(long valueMaxLength) {
      if (this.valueMaxLength == null) this.valueMaxLength = new Number();
      this.valueMaxLength.setLong(valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(float valueMaxLength) {
      if (this.valueMaxLength == null) this.valueMaxLength = new Number();
      this.valueMaxLength.setFloat(valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(double valueMaxLength) {
      if (this.valueMaxLength == null) this.valueMaxLength = new Number();
      this.valueMaxLength.setDouble(valueMaxLength);
      return this;
    }
    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @NotNull public Builder valueMaxLength(String valueMaxLength) {
      if (this.valueMaxLength == null) this.valueMaxLength = new Number();
      this.valueMaxLength.setString(valueMaxLength);
      return this;
    }
    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     */
    @NotNull public Builder valuePattern(String valuePattern) {
      this.valuePattern = valuePattern;
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(int stepValue) {
      if (this.stepValue == null) this.stepValue = new Number();
      this.stepValue.setInt(stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(long stepValue) {
      if (this.stepValue == null) this.stepValue = new Number();
      this.stepValue.setLong(stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(float stepValue) {
      if (this.stepValue == null) this.stepValue = new Number();
      this.stepValue.setFloat(stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(double stepValue) {
      if (this.stepValue == null) this.stepValue = new Number();
      this.stepValue.setDouble(stepValue);
      return this;
    }
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @NotNull public Builder stepValue(String stepValue) {
      if (this.stepValue == null) this.stepValue = new Number();
      this.stepValue.setString(stepValue);
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(String description) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
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
    @NotNull Builder minValue(int minValue);
    @NotNull Builder minValue(long minValue);
    @NotNull Builder minValue(float minValue);
    @NotNull Builder minValue(double minValue);
    @NotNull Builder minValue(String minValue);
    @NotNull Builder valueName(String valueName);
    @NotNull Builder valueRequired(Boolean valueRequired);
    @NotNull Builder defaultValue(String defaultValue);
    @NotNull Builder defaultValue(Thing thing);
    @NotNull Builder defaultValue(Thing.Builder thing);
    @NotNull Builder readonlyValue(Boolean readonlyValue);
    @NotNull Builder multipleValues(Boolean multipleValues);
    @NotNull Builder valueMinLength(int valueMinLength);
    @NotNull Builder valueMinLength(long valueMinLength);
    @NotNull Builder valueMinLength(float valueMinLength);
    @NotNull Builder valueMinLength(double valueMinLength);
    @NotNull Builder valueMinLength(String valueMinLength);
    @NotNull Builder valueMaxLength(int valueMaxLength);
    @NotNull Builder valueMaxLength(long valueMaxLength);
    @NotNull Builder valueMaxLength(float valueMaxLength);
    @NotNull Builder valueMaxLength(double valueMaxLength);
    @NotNull Builder valueMaxLength(String valueMaxLength);
    @NotNull Builder valuePattern(String valuePattern);
    @NotNull Builder stepValue(int stepValue);
    @NotNull Builder stepValue(long stepValue);
    @NotNull Builder stepValue(float stepValue);
    @NotNull Builder stepValue(double stepValue);
    @NotNull Builder stepValue(String stepValue);
    @NotNull Builder additionalType(String additionalType);
    @NotNull Builder alternateName(String alternateName);
    @NotNull Builder description(String description);
    @NotNull Builder mainEntityOfPage(CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(String mainEntityOfPage);
    @NotNull Builder name(String name);
    @NotNull Builder sameAs(String sameAs);
    @NotNull Builder url(String url);
    @NotNull Builder potentialAction(Action action);
    @NotNull Builder potentialAction(Action.Builder action);
    @NotNull Builder id(String id);
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
