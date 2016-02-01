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
 * The cost per unit of a medical drug. Note that this type is not meant to represent the price in an offer of a drug for sale; see the Offer type for that. This type will typically be used to tag wholesale or average retail cost of a drug, or maximum reimbursable cost. Costs of medical drugs vary widely depending on how and where they are paid for, so while this type captures some of the variables, costs should be used with caution by consumers of this schema's markup.
 */
public class DrugCost extends MedicalIntangible {
  /**
   * The location in which the status applies.
   */
  public AdministrativeArea getApplicableLocation() { return myApplicableLocation; }
  /**
   * The category of cost, such as wholesale, retail, reimbursement cap, etc.
   */
  public DrugCostCategory getCostCategory() { return myCostCategory; }
  /**
   * The currency (in 3-letter <a href=http://en.wikipedia.org/wiki/ISO_4217>ISO 4217 format</a>) of the drug cost.
   */
  public String getCostCurrency() { return myCostCurrency; }
  /**
   * Additional details to capture the origin of the cost data. For example, 'Medicare Part B'.
   */
  public String getCostOrigin() { return myCostOrigin; }
  /**
   * The cost per unit of the drug.
   */
  public Number getCostPerUnit() { return myCostPerUnit; }
  /**
   * The unit in which the drug is measured, e.g. '5 mg tablet'.
   */
  public String getDrugUnit() { return myDrugUnit; }
  protected DrugCost(AdministrativeArea applicableLocation, DrugCostCategory costCategory, String costCurrency, String costOrigin, Number costPerUnit, String drugUnit, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myApplicableLocation = applicableLocation;
    myCostCategory = costCategory;
    myCostCurrency = costCurrency;
    myCostOrigin = costOrigin;
    myCostPerUnit = costPerUnit;
    myDrugUnit = drugUnit;
    myApplicableLocation = applicableLocation;
    myCostCategory = costCategory;
    myCostCurrency = costCurrency;
    myCostOrigin = costOrigin;
    myCostPerUnit = costPerUnit;
    myDrugUnit = drugUnit;
  }
  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myApplicableLocation != null ? myApplicableLocation.hashCode() : 0);
    result = 31 * result + (myCostCategory != null ? myCostCategory.hashCode() : 0);
    result = 31 * result + (myCostCurrency != null ? myCostCurrency.hashCode() : 0);
    result = 31 * result + (myCostOrigin != null ? myCostOrigin.hashCode() : 0);
    result = 31 * result + (myCostPerUnit != null ? myCostPerUnit.hashCode() : 0);
    result = 31 * result + (myDrugUnit != null ? myDrugUnit.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DrugCost drugCost = (DrugCost) o;
    if (!super.equals(o)) return false;
    if (myApplicableLocation != null ? !myApplicableLocation.equals(drugCost.myApplicableLocation) : drugCost.myApplicableLocation != null) return false;
    if (myCostCategory != null ? !myCostCategory.equals(drugCost.myCostCategory) : drugCost.myCostCategory != null) return false;
    if (myCostCurrency != null ? !myCostCurrency.equals(drugCost.myCostCurrency) : drugCost.myCostCurrency != null) return false;
    if (myCostOrigin != null ? !myCostOrigin.equals(drugCost.myCostOrigin) : drugCost.myCostOrigin != null) return false;
    if (myCostPerUnit != null ? !myCostPerUnit.equals(drugCost.myCostPerUnit) : drugCost.myCostPerUnit != null) return false;
    if (myDrugUnit != null ? !myDrugUnit.equals(drugCost.myDrugUnit) : drugCost.myDrugUnit != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link DrugCost}
   */
  public static class Builder implements ThingBuilder<DrugCost> {
    public DrugCost build() {
      return new DrugCost(applicableLocation, costCategory, costCurrency, costOrigin, costPerUnit, drugUnit, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The location in which the status applies.
     */
    @NotNull public Builder applicableLocation(@NotNull AdministrativeArea administrativeArea) {
      this.applicableLocation = administrativeArea;
      return this;
    }
    /**
     * The location in which the status applies.
     */
    @NotNull public Builder applicableLocation(@NotNull AdministrativeArea.Builder administrativeArea) {
      return this.applicableLocation(administrativeArea.build());
    }
    /**
     * The category of cost, such as wholesale, retail, reimbursement cap, etc.
     */
    @NotNull public Builder costCategory(@NotNull DrugCostCategory drugCostCategory) {
      this.costCategory = drugCostCategory;
      return this;
    }
    /**
     * The category of cost, such as wholesale, retail, reimbursement cap, etc.
     */
    @NotNull public Builder costCategory(@NotNull DrugCostCategory.Builder drugCostCategory) {
      return this.costCategory(drugCostCategory.build());
    }
    /**
     * The currency (in 3-letter <a href=http://en.wikipedia.org/wiki/ISO_4217>ISO 4217 format</a>) of the drug cost.
     */
    @NotNull public Builder costCurrency(@NotNull String costCurrency) {
      this.costCurrency = costCurrency;
      return this;
    }
    /**
     * Additional details to capture the origin of the cost data. For example, 'Medicare Part B'.
     */
    @NotNull public Builder costOrigin(@NotNull String costOrigin) {
      this.costOrigin = costOrigin;
      return this;
    }
    /**
     * The cost per unit of the drug.
     */
    @NotNull public Builder costPerUnit(@NotNull Integer integer) {
      if (this.costPerUnit == null) this.costPerUnit = new Number();
      this.costPerUnit.setInteger(integer);
      return this;
    }
    /**
     * The cost per unit of the drug.
     */
    @NotNull public Builder costPerUnit(@NotNull Long costPerUnit) {
      if (this.costPerUnit == null) this.costPerUnit = new Number();
      this.costPerUnit.setLong(costPerUnit);
      return this;
    }
    /**
     * The cost per unit of the drug.
     */
    @NotNull public Builder costPerUnit(@NotNull Float costPerUnit) {
      if (this.costPerUnit == null) this.costPerUnit = new Number();
      this.costPerUnit.setFloat(costPerUnit);
      return this;
    }
    /**
     * The cost per unit of the drug.
     */
    @NotNull public Builder costPerUnit(@NotNull Double costPerUnit) {
      if (this.costPerUnit == null) this.costPerUnit = new Number();
      this.costPerUnit.setDouble(costPerUnit);
      return this;
    }
    /**
     * The cost per unit of the drug.
     */
    @NotNull public Builder costPerUnit(@NotNull String costPerUnit) {
      if (this.costPerUnit == null) this.costPerUnit = new Number();
      this.costPerUnit.setString(costPerUnit);
      return this;
    }
    /**
     * The unit in which the drug is measured, e.g. '5 mg tablet'.
     */
    @NotNull public Builder drugUnit(@NotNull String drugUnit) {
      this.drugUnit = drugUnit;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(@NotNull MedicalCode medicalCode) {
      this.code = medicalCode;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(@NotNull MedicalCode.Builder medicalCode) {
      return this.code(medicalCode.build());
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline medicalGuideline) {
      this.guideline = medicalGuideline;
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline.Builder medicalGuideline) {
      return this.guideline(medicalGuideline.build());
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem medicineSystem) {
      this.medicineSystem = medicineSystem;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem.Builder medicineSystem) {
      return this.medicineSystem(medicineSystem.build());
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization organization) {
      this.recognizingAuthority = organization;
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization.Builder organization) {
      return this.recognizingAuthority(organization.build());
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty medicalSpecialty) {
      this.relevantSpecialty = medicalSpecialty;
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty.Builder medicalSpecialty) {
      return this.relevantSpecialty(medicalSpecialty.build());
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(@NotNull MedicalStudy medicalStudy) {
      this.study = medicalStudy;
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(@NotNull MedicalStudy.Builder medicalStudy) {
      return this.study(medicalStudy.build());
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
        if ("applicableLocation".equals(key) && value instanceof AdministrativeArea) { applicableLocation((AdministrativeArea)value); continue; }
        if ("costCategory".equals(key) && value instanceof DrugCostCategory) { costCategory((DrugCostCategory)value); continue; }
        if ("costCurrency".equals(key) && value instanceof String) { costCurrency((String)value); continue; }
        if ("costOrigin".equals(key) && value instanceof String) { costOrigin((String)value); continue; }
        if ("costPerUnit".equals(key) && value instanceof Integer) { costPerUnit((Integer)value); continue; }
        if ("costPerUnit".equals(key) && value instanceof Long) { costPerUnit((Long)value); continue; }
        if ("costPerUnit".equals(key) && value instanceof Float) { costPerUnit((Float)value); continue; }
        if ("costPerUnit".equals(key) && value instanceof Double) { costPerUnit((Double)value); continue; }
        if ("costPerUnit".equals(key) && value instanceof String) { costPerUnit((String)value); continue; }
        if ("drugUnit".equals(key) && value instanceof String) { drugUnit((String)value); continue; }
        if ("code".equals(key) && value instanceof MedicalCode) { code((MedicalCode)value); continue; }
        if ("guideline".equals(key) && value instanceof MedicalGuideline) { guideline((MedicalGuideline)value); continue; }
        if ("medicineSystem".equals(key) && value instanceof MedicineSystem) { medicineSystem((MedicineSystem)value); continue; }
        if ("recognizingAuthority".equals(key) && value instanceof Organization) { recognizingAuthority((Organization)value); continue; }
        if ("relevantSpecialty".equals(key) && value instanceof MedicalSpecialty) { relevantSpecialty((MedicalSpecialty)value); continue; }
        if ("study".equals(key) && value instanceof MedicalStudy) { study((MedicalStudy)value); continue; }
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
    private AdministrativeArea applicableLocation;
    private DrugCostCategory costCategory;
    private String costCurrency;
    private String costOrigin;
    private Number costPerUnit;
    private String drugUnit;
    private MedicalCode code;
    private MedicalGuideline guideline;
    private MedicineSystem medicineSystem;
    private Organization recognizingAuthority;
    private MedicalSpecialty relevantSpecialty;
    private MedicalStudy study;
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
  
  private AdministrativeArea myApplicableLocation;
  private DrugCostCategory myCostCategory;
  private String myCostCurrency;
  private String myCostOrigin;
  private Number myCostPerUnit;
  private String myDrugUnit;
}
