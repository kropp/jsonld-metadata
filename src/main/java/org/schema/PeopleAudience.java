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
import org.jetbrains.annotations.NotNull;

/**
 * A set of characteristics belonging to people, e.g. who compose an item's target audience.
 */
public class PeopleAudience extends Audience {
  /**
   * Expectations for health conditions of target audience.
   */
  public MedicalCondition getHealthCondition() { return myHealthCondition; }
  /**
   * Audiences defined by a person's gender.
   */
  public String getRequiredGender() { return myRequiredGender; }
  /**
   * Audiences defined by a person's maximum age.
   */
  public Integer getRequiredMaxAge() { return myRequiredMaxAge; }
  /**
   * Audiences defined by a person's minimum age.
   */
  public Integer getRequiredMinAge() { return myRequiredMinAge; }
  /**
   * The gender of the person or audience.
   */
  public String getSuggestedGender() { return mySuggestedGender; }
  /**
   * Maximal age recommended for viewing content.
   */
  public Number getSuggestedMaxAge() { return mySuggestedMaxAge; }
  /**
   * Minimal age recommended for viewing content.
   */
  public Number getSuggestedMinAge() { return mySuggestedMinAge; }
  protected PeopleAudience(MedicalCondition healthCondition, String requiredGender, Integer requiredMaxAge, Integer requiredMinAge, String suggestedGender, Number suggestedMaxAge, Number suggestedMinAge, String audienceType, AdministrativeArea geographicArea, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(audienceType, geographicArea, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myHealthCondition = healthCondition;
    myRequiredGender = requiredGender;
    myRequiredMaxAge = requiredMaxAge;
    myRequiredMinAge = requiredMinAge;
    mySuggestedGender = suggestedGender;
    mySuggestedMaxAge = suggestedMaxAge;
    mySuggestedMinAge = suggestedMinAge;
    myHealthCondition = healthCondition;
    myRequiredGender = requiredGender;
    myRequiredMaxAge = requiredMaxAge;
    myRequiredMinAge = requiredMinAge;
    mySuggestedGender = suggestedGender;
    mySuggestedMaxAge = suggestedMaxAge;
    mySuggestedMinAge = suggestedMinAge;
  }
  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myHealthCondition != null ? myHealthCondition.hashCode() : 0);
    result = 31 * result + (myRequiredGender != null ? myRequiredGender.hashCode() : 0);
    result = 31 * result + (myRequiredMaxAge != null ? myRequiredMaxAge.hashCode() : 0);
    result = 31 * result + (myRequiredMinAge != null ? myRequiredMinAge.hashCode() : 0);
    result = 31 * result + (mySuggestedGender != null ? mySuggestedGender.hashCode() : 0);
    result = 31 * result + (mySuggestedMaxAge != null ? mySuggestedMaxAge.hashCode() : 0);
    result = 31 * result + (mySuggestedMinAge != null ? mySuggestedMinAge.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PeopleAudience peopleAudience = (PeopleAudience) o;
    if (!super.equals(o)) return false;
    if (myHealthCondition != null ? !myHealthCondition.equals(peopleAudience.myHealthCondition) : peopleAudience.myHealthCondition != null) return false;
    if (myRequiredGender != null ? !myRequiredGender.equals(peopleAudience.myRequiredGender) : peopleAudience.myRequiredGender != null) return false;
    if (myRequiredMaxAge != null ? !myRequiredMaxAge.equals(peopleAudience.myRequiredMaxAge) : peopleAudience.myRequiredMaxAge != null) return false;
    if (myRequiredMinAge != null ? !myRequiredMinAge.equals(peopleAudience.myRequiredMinAge) : peopleAudience.myRequiredMinAge != null) return false;
    if (mySuggestedGender != null ? !mySuggestedGender.equals(peopleAudience.mySuggestedGender) : peopleAudience.mySuggestedGender != null) return false;
    if (mySuggestedMaxAge != null ? !mySuggestedMaxAge.equals(peopleAudience.mySuggestedMaxAge) : peopleAudience.mySuggestedMaxAge != null) return false;
    if (mySuggestedMinAge != null ? !mySuggestedMinAge.equals(peopleAudience.mySuggestedMinAge) : peopleAudience.mySuggestedMinAge != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link PeopleAudience}
   */
  public static class Builder implements ThingBuilder<PeopleAudience> {
    public PeopleAudience build() {
      return new PeopleAudience(healthCondition, requiredGender, requiredMaxAge, requiredMinAge, suggestedGender, suggestedMaxAge, suggestedMinAge, audienceType, geographicArea, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Expectations for health conditions of target audience.
     */
    @NotNull public Builder healthCondition(@NotNull MedicalCondition medicalCondition) {
      this.healthCondition = medicalCondition;
      return this;
    }
    /**
     * Expectations for health conditions of target audience.
     */
    @NotNull public Builder healthCondition(@NotNull MedicalCondition.Builder medicalCondition) {
      return this.healthCondition(medicalCondition.build());
    }
    /**
     * Audiences defined by a person's gender.
     */
    @NotNull public Builder requiredGender(@NotNull String requiredGender) {
      this.requiredGender = requiredGender;
      return this;
    }
    /**
     * Audiences defined by a person's maximum age.
     */
    @NotNull public Builder requiredMaxAge(@NotNull Integer integer) {
      this.requiredMaxAge = integer;
      return this;
    }
    /**
     * Audiences defined by a person's minimum age.
     */
    @NotNull public Builder requiredMinAge(@NotNull Integer integer) {
      this.requiredMinAge = integer;
      return this;
    }
    /**
     * The gender of the person or audience.
     */
    @NotNull public Builder suggestedGender(@NotNull String suggestedGender) {
      this.suggestedGender = suggestedGender;
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Integer integer) {
      if (this.suggestedMaxAge == null) this.suggestedMaxAge = new Number();
      this.suggestedMaxAge.setInteger(integer);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Long suggestedMaxAge) {
      if (this.suggestedMaxAge == null) this.suggestedMaxAge = new Number();
      this.suggestedMaxAge.setLong(suggestedMaxAge);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Float suggestedMaxAge) {
      if (this.suggestedMaxAge == null) this.suggestedMaxAge = new Number();
      this.suggestedMaxAge.setFloat(suggestedMaxAge);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(@NotNull Double suggestedMaxAge) {
      if (this.suggestedMaxAge == null) this.suggestedMaxAge = new Number();
      this.suggestedMaxAge.setDouble(suggestedMaxAge);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(@NotNull String suggestedMaxAge) {
      if (this.suggestedMaxAge == null) this.suggestedMaxAge = new Number();
      this.suggestedMaxAge.setString(suggestedMaxAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(@NotNull Integer integer) {
      if (this.suggestedMinAge == null) this.suggestedMinAge = new Number();
      this.suggestedMinAge.setInteger(integer);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(@NotNull Long suggestedMinAge) {
      if (this.suggestedMinAge == null) this.suggestedMinAge = new Number();
      this.suggestedMinAge.setLong(suggestedMinAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(@NotNull Float suggestedMinAge) {
      if (this.suggestedMinAge == null) this.suggestedMinAge = new Number();
      this.suggestedMinAge.setFloat(suggestedMinAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(@NotNull Double suggestedMinAge) {
      if (this.suggestedMinAge == null) this.suggestedMinAge = new Number();
      this.suggestedMinAge.setDouble(suggestedMinAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(@NotNull String suggestedMinAge) {
      if (this.suggestedMinAge == null) this.suggestedMinAge = new Number();
      this.suggestedMinAge.setString(suggestedMinAge);
      return this;
    }
    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     */
    @NotNull public Builder audienceType(@NotNull String audienceType) {
      this.audienceType = audienceType;
      return this;
    }
    /**
     * The geographic area associated with the audience.
     */
    @NotNull public Builder geographicArea(@NotNull AdministrativeArea administrativeArea) {
      this.geographicArea = administrativeArea;
      return this;
    }
    /**
     * The geographic area associated with the audience.
     */
    @NotNull public Builder geographicArea(@NotNull AdministrativeArea.Builder administrativeArea) {
      return this.geographicArea(administrativeArea.build());
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
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
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
        if ("healthCondition".equals(key) && value instanceof MedicalCondition) { healthCondition((MedicalCondition)value); continue; }
        if ("requiredGender".equals(key) && value instanceof String) { requiredGender((String)value); continue; }
        if ("requiredMaxAge".equals(key) && value instanceof Integer) { requiredMaxAge((Integer)value); continue; }
        if ("requiredMinAge".equals(key) && value instanceof Integer) { requiredMinAge((Integer)value); continue; }
        if ("suggestedGender".equals(key) && value instanceof String) { suggestedGender((String)value); continue; }
        if ("suggestedMaxAge".equals(key) && value instanceof Integer) { suggestedMaxAge((Integer)value); continue; }
        if ("suggestedMaxAge".equals(key) && value instanceof Long) { suggestedMaxAge((Long)value); continue; }
        if ("suggestedMaxAge".equals(key) && value instanceof Float) { suggestedMaxAge((Float)value); continue; }
        if ("suggestedMaxAge".equals(key) && value instanceof Double) { suggestedMaxAge((Double)value); continue; }
        if ("suggestedMaxAge".equals(key) && value instanceof String) { suggestedMaxAge((String)value); continue; }
        if ("suggestedMinAge".equals(key) && value instanceof Integer) { suggestedMinAge((Integer)value); continue; }
        if ("suggestedMinAge".equals(key) && value instanceof Long) { suggestedMinAge((Long)value); continue; }
        if ("suggestedMinAge".equals(key) && value instanceof Float) { suggestedMinAge((Float)value); continue; }
        if ("suggestedMinAge".equals(key) && value instanceof Double) { suggestedMinAge((Double)value); continue; }
        if ("suggestedMinAge".equals(key) && value instanceof String) { suggestedMinAge((String)value); continue; }
        if ("audienceType".equals(key) && value instanceof String) { audienceType((String)value); continue; }
        if ("geographicArea".equals(key) && value instanceof AdministrativeArea) { geographicArea((AdministrativeArea)value); continue; }
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
  
  private MedicalCondition myHealthCondition;
  private String myRequiredGender;
  private Integer myRequiredMaxAge;
  private Integer myRequiredMinAge;
  private String mySuggestedGender;
  private Number mySuggestedMaxAge;
  private Number mySuggestedMinAge;
}
