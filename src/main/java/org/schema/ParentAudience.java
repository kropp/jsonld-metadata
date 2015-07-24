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
 * A set of characteristics describing parents, who can be interested in viewing some content.
 */
public class ParentAudience extends PeopleAudience {
  /**
   * Maximal age of the child.
   */
  public Number getChildMaxAge() {
    return myChildMaxAge;
  }
  /**
   * Minimal age of the child.
   */
  public Number getChildMinAge() {
    return myChildMinAge;
  }
  /**
   * Builder for {@link ParentAudience}
   */
  public static final class Builder {
    /**
     * Creates new {@link ParentAudience} instance.
     */
    public ParentAudience build() {
      return new ParentAudience(childMaxAge, childMinAge, healthCondition, requiredGender, requiredMaxAge, requiredMinAge, suggestedGender, suggestedMaxAge, suggestedMinAge, audienceType, geographicArea, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Maximal age of the child.
     */
    public Builder childMaxAge(Number number) {
      this.childMaxAge = number;
      return this;
    }
    /**
     * Minimal age of the child.
     */
    public Builder childMinAge(Number number) {
      this.childMinAge = number;
      return this;
    }
    /**
     * Expectations for health conditions of target audience.
     */
    public Builder healthCondition(MedicalCondition medicalCondition) {
      this.healthCondition = medicalCondition;
      return this;
    }
    /**
     * Audiences defined by a person's gender.
     */
    public Builder requiredGender(String requiredGender) {
      this.requiredGender = requiredGender;
      return this;
    }
    /**
     * Audiences defined by a person's maximum age.
     */
    public Builder requiredMaxAge(Integer integer) {
      this.requiredMaxAge = integer;
      return this;
    }
    /**
     * Audiences defined by a person's minimum age.
     */
    public Builder requiredMinAge(Integer integer) {
      this.requiredMinAge = integer;
      return this;
    }
    /**
     * The gender of the person or audience.
     */
    public Builder suggestedGender(String suggestedGender) {
      this.suggestedGender = suggestedGender;
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    public Builder suggestedMaxAge(Number number) {
      this.suggestedMaxAge = number;
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    public Builder suggestedMinAge(Number number) {
      this.suggestedMinAge = number;
      return this;
    }
    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     */
    public Builder audienceType(String audienceType) {
      this.audienceType = audienceType;
      return this;
    }
    /**
     * The geographic area associated with the audience.
     */
    public Builder geographicArea(AdministrativeArea administrativeArea) {
      this.geographicArea = administrativeArea;
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
    public Builder id(String id) {
      this.id = id;
      return this;
    }
    private Number childMaxAge;
    private Number childMinAge;
    private MedicalCondition healthCondition;
    private String requiredGender;
    private Integer requiredMaxAge;
    private Integer requiredMinAge;
    private String suggestedGender;
    private Number suggestedMaxAge;
    private Number suggestedMinAge;
    private String audienceType;
    private AdministrativeArea geographicArea;
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

  protected ParentAudience(Number childMaxAge, Number childMinAge, MedicalCondition healthCondition, String requiredGender, Integer requiredMaxAge, Integer requiredMinAge, String suggestedGender, Number suggestedMaxAge, Number suggestedMinAge, String audienceType, AdministrativeArea geographicArea, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(healthCondition, requiredGender, requiredMaxAge, requiredMinAge, suggestedGender, suggestedMaxAge, suggestedMinAge, audienceType, geographicArea, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myChildMaxAge = childMaxAge;
    myChildMinAge = childMinAge;
  }
  private Number myChildMaxAge;
  private Number myChildMinAge;
}
