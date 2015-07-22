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
  public ThingOrString getDefaultValue() {
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
  public static final class Builder {
    /**
     * Creates new {@link PropertyValueSpecification} instance.
     */
    public PropertyValueSpecification build() {
      return new PropertyValueSpecification(valueName, name, defaultValue, valuePattern, mainEntityOfPage, stepValue, sameAs, valueMaxLength, additionalType, url, minValue, readonlyValue, alternateName, multipleValues, valueRequired, valueMinLength, potentialAction, description);
    }
    /**
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     */
    public Builder valueName(String valueName) {
      this.valueName = valueName;
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
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    public Builder defaultValue(Thing thing) {
      this.defaultValue.setThing(thing);
      return this;
    }
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    public Builder defaultValue(String defaultValue) {
      this.defaultValue.setString(defaultValue);
      return this;
    }
    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     */
    public Builder valuePattern(String valuePattern) {
      this.valuePattern = valuePattern;
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
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    public Builder stepValue(Number number) {
      this.stepValue = number;
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
     * Specifies the allowed range for number of characters in a literal value.
     */
    public Builder valueMaxLength(Number number) {
      this.valueMaxLength = number;
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
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * The lower value of some characteristic or property.
     */
    public Builder minValue(Number number) {
      this.minValue = number;
      return this;
    }
    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
     */
    public Builder readonlyValue(Boolean readonlyValue) {
      this.readonlyValue = readonlyValue;
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
     * Whether multiple values are allowed for the property.  Default is false.
     */
    public Builder multipleValues(Boolean multipleValues) {
      this.multipleValues = multipleValues;
      return this;
    }
    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     */
    public Builder valueRequired(Boolean valueRequired) {
      this.valueRequired = valueRequired;
      return this;
    }
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    public Builder valueMinLength(Number number) {
      this.valueMinLength = number;
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
    private String valueName;
    private String name;
    private ThingOrString defaultValue;
    private String valuePattern;
    private StringOrCreativeWork mainEntityOfPage;
    private Number stepValue;
    private String sameAs;
    private Number valueMaxLength;
    private String additionalType;
    private String url;
    private Number minValue;
    private Boolean readonlyValue;
    private String alternateName;
    private Boolean multipleValues;
    private Boolean valueRequired;
    private Number valueMinLength;
    private Action potentialAction;
    private String description;
  }

  protected PropertyValueSpecification(String valueName, String name, ThingOrString defaultValue, String valuePattern, StringOrCreativeWork mainEntityOfPage, Number stepValue, String sameAs, Number valueMaxLength, String additionalType, String url, Number minValue, Boolean readonlyValue, String alternateName, Boolean multipleValues, Boolean valueRequired, Number valueMinLength, Action potentialAction, String description) {
    super(additionalType, url, sameAs, alternateName, description, potentialAction, name, mainEntityOfPage);
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
  private ThingOrString myDefaultValue;
  private Boolean myReadonlyValue;
  private Boolean myMultipleValues;
  private Number myValueMinLength;
  private Number myValueMaxLength;
  private String myValuePattern;
  private Number myStepValue;
}
