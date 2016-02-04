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
import java.util.*;

/**
 * A specific strength in which a medical drug is available in a specific country.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class DrugStrength extends MedicalIntangible {
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   */
  @JsonIgnore public String getActiveIngredient() {
    return (String) getValue("activeIngredient");
  }
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   */
  @JsonIgnore public Collection<String> getActiveIngredients() {
    final Object current = myData.get("activeIngredient");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The location in which the strength is available.
   */
  @JsonIgnore public AdministrativeArea getAvailableIn() {
    return (AdministrativeArea) getValue("availableIn");
  }
  /**
   * The location in which the strength is available.
   */
  @JsonIgnore public Collection<AdministrativeArea> getAvailableIns() {
    final Object current = myData.get("availableIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AdministrativeArea>) current;
    }
    return Arrays.asList((AdministrativeArea) current);
  }
  /**
   * The units of an active ingredient's strength, e.g. mg.
   */
  @JsonIgnore public String getStrengthUnit() {
    return (String) getValue("strengthUnit");
  }
  /**
   * The units of an active ingredient's strength, e.g. mg.
   */
  @JsonIgnore public Collection<String> getStrengthUnits() {
    final Object current = myData.get("strengthUnit");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  @JsonIgnore public Integer getStrengthValueInteger() {
    return (Integer) getValue("strengthValue");
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  @JsonIgnore public Collection<Integer> getStrengthValueIntegers() {
    final Object current = myData.get("strengthValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  @JsonIgnore public Long getStrengthValueLong() {
    return (Long) getValue("strengthValue");
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  @JsonIgnore public Collection<Long> getStrengthValueLongs() {
    final Object current = myData.get("strengthValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  @JsonIgnore public Float getStrengthValueFloat() {
    return (Float) getValue("strengthValue");
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  @JsonIgnore public Collection<Float> getStrengthValueFloats() {
    final Object current = myData.get("strengthValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  @JsonIgnore public Double getStrengthValueDouble() {
    return (Double) getValue("strengthValue");
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  @JsonIgnore public Collection<Double> getStrengthValueDoubles() {
    final Object current = myData.get("strengthValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  @JsonIgnore public String getStrengthValueString() {
    return (String) getValue("strengthValue");
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  @JsonIgnore public Collection<String> getStrengthValueStrings() {
    final Object current = myData.get("strengthValue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected DrugStrength(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link DrugStrength}
   */
  public static class Builder extends MedicalIntangible.Builder {
    public DrugStrength build() {
      return new DrugStrength(myData);
    }
    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     */
    @NotNull public Builder activeIngredient(@NotNull String activeIngredient) {
      putValue("activeIngredient", activeIngredient);
      return this;
    }
    /**
     * The location in which the strength is available.
     */
    @NotNull public Builder availableIn(@NotNull AdministrativeArea administrativeArea) {
      putValue("availableIn", administrativeArea);
      return this;
    }
    /**
     * The location in which the strength is available.
     */
    @NotNull public Builder availableIn(@NotNull AdministrativeArea.Builder administrativeArea) {
      putValue("availableIn", administrativeArea.build());
      return this;
    }
    /**
     * The units of an active ingredient's strength, e.g. mg.
     */
    @NotNull public Builder strengthUnit(@NotNull String strengthUnit) {
      putValue("strengthUnit", strengthUnit);
      return this;
    }
    /**
     * The value of an active ingredient's strength, e.g. 325.
     */
    @NotNull public Builder strengthValue(@NotNull Integer integer) {
      putValue("strengthValue", integer);
      return this;
    }
    /**
     * The value of an active ingredient's strength, e.g. 325.
     */
    @NotNull public Builder strengthValue(@NotNull Long strengthValue) {
      putValue("strengthValue", strengthValue);
      return this;
    }
    /**
     * The value of an active ingredient's strength, e.g. 325.
     */
    @NotNull public Builder strengthValue(@NotNull Float strengthValue) {
      putValue("strengthValue", strengthValue);
      return this;
    }
    /**
     * The value of an active ingredient's strength, e.g. 325.
     */
    @NotNull public Builder strengthValue(@NotNull Double strengthValue) {
      putValue("strengthValue", strengthValue);
      return this;
    }
    /**
     * The value of an active ingredient's strength, e.g. 325.
     */
    @NotNull public Builder strengthValue(@NotNull String strengthValue) {
      putValue("strengthValue", strengthValue);
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(@NotNull MedicalCode medicalCode) {
      putValue("code", medicalCode);
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(@NotNull MedicalCode.Builder medicalCode) {
      putValue("code", medicalCode.build());
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline medicalGuideline) {
      putValue("guideline", medicalGuideline);
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline.Builder medicalGuideline) {
      putValue("guideline", medicalGuideline.build());
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem medicineSystem) {
      putValue("medicineSystem", medicineSystem);
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem.Builder medicineSystem) {
      putValue("medicineSystem", medicineSystem.build());
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization organization) {
      putValue("recognizingAuthority", organization);
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization.Builder organization) {
      putValue("recognizingAuthority", organization.build());
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty medicalSpecialty) {
      putValue("relevantSpecialty", medicalSpecialty);
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty.Builder medicalSpecialty) {
      putValue("relevantSpecialty", medicalSpecialty.build());
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(@NotNull MedicalStudy medicalStudy) {
      putValue("study", medicalStudy);
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(@NotNull MedicalStudy.Builder medicalStudy) {
      putValue("study", medicalStudy.build());
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
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
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
      putValue("mainEntityOfPage", creativeWork);
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
      putValue("mainEntityOfPage", creativeWork.build());
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
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
      putValue("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("activeIngredient".equals(key) && value instanceof String) { activeIngredient((String)value); return; }
      if ("availableIn".equals(key) && value instanceof AdministrativeArea) { availableIn((AdministrativeArea)value); return; }
      if ("strengthUnit".equals(key) && value instanceof String) { strengthUnit((String)value); return; }
      if ("strengthValue".equals(key) && value instanceof Integer) { strengthValue((Integer)value); return; }
      if ("strengthValue".equals(key) && value instanceof Long) { strengthValue((Long)value); return; }
      if ("strengthValue".equals(key) && value instanceof Float) { strengthValue((Float)value); return; }
      if ("strengthValue".equals(key) && value instanceof Double) { strengthValue((Double)value); return; }
      if ("strengthValue".equals(key) && value instanceof String) { strengthValue((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
