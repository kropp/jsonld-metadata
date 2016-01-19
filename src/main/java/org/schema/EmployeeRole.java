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
 * A subclass of OrganizationRole used to describe employee relationships.
 */
public class EmployeeRole extends OrganizationRole {
  /**
   * The currency (coded using ISO 4217, http://en.wikipedia.org/wiki/ISO_4217 ) used for the main salary information in this job posting or for this employee.
   */
  public String getSalaryCurrency() {
    return mySalaryCurrency;
  }
  /**
   * Builder for {@link EmployeeRole}
   */
  static final class EmployeeRoleThingBuilder implements Builder {
    /**
     * Creates new {@link EmployeeRole} instance.
     */
    public EmployeeRole build() {
      return new EmployeeRole(salaryCurrency, numberedPosition, startDate, roleName, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The currency (coded using ISO 4217, http://en.wikipedia.org/wiki/ISO_4217 ) used for the main salary information in this job posting or for this employee.
     */
    @NotNull public Builder salaryCurrency(@NotNull String salaryCurrency) {
      this.salaryCurrency = salaryCurrency;
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     */
    @NotNull public Builder numberedPosition(@NotNull Integer integer) {
      if (this.numberedPosition == null) this.numberedPosition = new Number();
      this.numberedPosition.setInteger(integer);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     */
    @NotNull public Builder numberedPosition(@NotNull Long numberedPosition) {
      if (this.numberedPosition == null) this.numberedPosition = new Number();
      this.numberedPosition.setLong(numberedPosition);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     */
    @NotNull public Builder numberedPosition(@NotNull Float numberedPosition) {
      if (this.numberedPosition == null) this.numberedPosition = new Number();
      this.numberedPosition.setFloat(numberedPosition);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     */
    @NotNull public Builder numberedPosition(@NotNull Double numberedPosition) {
      if (this.numberedPosition == null) this.numberedPosition = new Number();
      this.numberedPosition.setDouble(numberedPosition);
      return this;
    }
    /**
     * A number associated with a role in an organization, for example, the number on an athlete's jersey.
     */
    @NotNull public Builder numberedPosition(@NotNull String numberedPosition) {
      if (this.numberedPosition == null) this.numberedPosition = new Number();
      this.numberedPosition.setString(numberedPosition);
      return this;
    }
    /**
     * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    @NotNull public Builder startDate(@NotNull java.util.Date date) {
      this.startDate = date;
      return this;
    }
    /**
     * A role played, performed or filled by a person or organization. For example, the team of creators for a comic book might fill the roles named 'inker', 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the position named 'Quarterback'.
     */
    @NotNull public Builder roleName(@NotNull String roleName) {
      this.roleName = roleName;
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
        if ("salaryCurrency".equals(key) && value instanceof String) { salaryCurrency((String)value); continue; }
        if ("numberedPosition".equals(key) && value instanceof Integer) { numberedPosition((Integer)value); continue; }
        if ("numberedPosition".equals(key) && value instanceof Long) { numberedPosition((Long)value); continue; }
        if ("numberedPosition".equals(key) && value instanceof Float) { numberedPosition((Float)value); continue; }
        if ("numberedPosition".equals(key) && value instanceof Double) { numberedPosition((Double)value); continue; }
        if ("numberedPosition".equals(key) && value instanceof String) { numberedPosition((String)value); continue; }
        if ("startDate".equals(key) && value instanceof java.util.Date) { startDate((java.util.Date)value); continue; }
        if ("roleName".equals(key) && value instanceof String) { roleName((String)value); continue; }
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
    private String salaryCurrency;
    private Number numberedPosition;
    private java.util.Date startDate;
    private String roleName;
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
  public interface Builder extends ThingBuilder<EmployeeRole> {
    @NotNull Builder salaryCurrency(@NotNull String salaryCurrency);
    @NotNull Builder numberedPosition(@NotNull Integer integer);
    @NotNull Builder numberedPosition(@NotNull Long numberedPosition);
    @NotNull Builder numberedPosition(@NotNull Float numberedPosition);
    @NotNull Builder numberedPosition(@NotNull Double numberedPosition);
    @NotNull Builder numberedPosition(@NotNull String numberedPosition);
    @NotNull Builder startDate(@NotNull java.util.Date date);
    @NotNull Builder roleName(@NotNull String roleName);
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

  protected EmployeeRole(String salaryCurrency, Number numberedPosition, java.util.Date startDate, String roleName, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(numberedPosition, startDate, roleName, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    mySalaryCurrency = salaryCurrency;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (mySalaryCurrency != null ? mySalaryCurrency.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmployeeRole employeeRole = (EmployeeRole) o;
    if (!super.equals(o)) return false;
    if (mySalaryCurrency != null ? !mySalaryCurrency.equals(employeeRole.mySalaryCurrency) : employeeRole.mySalaryCurrency != null) return false;
    return true;
  }

  private String mySalaryCurrency;
}
