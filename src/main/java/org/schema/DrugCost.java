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
 * The cost per unit of a medical drug. Note that this type is not meant to represent the price in an offer of a drug for sale; see the Offer type for that. This type will typically be used to tag wholesale or average retail cost of a drug, or maximum reimbursable cost. Costs of medical drugs vary widely depending on how and where they are paid for, so while this type captures some of the variables, costs should be used with caution by consumers of this schema's markup.
 */
public class DrugCost extends MedicalIntangible {
  /**
   * The location in which the status applies.
   */
  public AdministrativeArea getApplicableLocation() {
    return myApplicableLocation;
  }
  /**
   * The category of cost, such as wholesale, retail, reimbursement cap, etc.
   */
  public DrugCostCategory getCostCategory() {
    return myCostCategory;
  }
  /**
   * The currency (in 3-letter <a href=http://en.wikipedia.org/wiki/ISO_4217>ISO 4217 format</a>) of the drug cost.
   */
  public String getCostCurrency() {
    return myCostCurrency;
  }
  /**
   * Additional details to capture the origin of the cost data. For example, 'Medicare Part B'.
   */
  public String getCostOrigin() {
    return myCostOrigin;
  }
  /**
   * The cost per unit of the drug.
   */
  public NumberOrString getCostPerUnit() {
    return myCostPerUnit;
  }
  /**
   * The unit in which the drug is measured, e.g. '5 mg tablet'.
   */
  public String getDrugUnit() {
    return myDrugUnit;
  }
  /**
   * Builder for {@link DrugCost}
   */
  static final class DrugCostThingBuilder implements Builder {
    /**
     * Creates new {@link DrugCost} instance.
     */
    public DrugCost build() {
      return new DrugCost(applicableLocation, costCategory, costCurrency, costOrigin, costPerUnit, drugUnit, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The location in which the status applies.
     */
    @NotNull public Builder applicableLocation(AdministrativeArea administrativeArea) {
      this.applicableLocation = administrativeArea;
      return this;
    }
    /**
     * The location in which the status applies.
     */
    @NotNull public Builder applicableLocation(AdministrativeArea.Builder administrativeArea) {
      return this.applicableLocation(administrativeArea.build());
    }
    /**
     * The category of cost, such as wholesale, retail, reimbursement cap, etc.
     */
    @NotNull public Builder costCategory(DrugCostCategory drugCostCategory) {
      this.costCategory = drugCostCategory;
      return this;
    }
    /**
     * The category of cost, such as wholesale, retail, reimbursement cap, etc.
     */
    @NotNull public Builder costCategory(DrugCostCategory.Builder drugCostCategory) {
      return this.costCategory(drugCostCategory.build());
    }
    /**
     * The currency (in 3-letter <a href=http://en.wikipedia.org/wiki/ISO_4217>ISO 4217 format</a>) of the drug cost.
     */
    @NotNull public Builder costCurrency(String costCurrency) {
      this.costCurrency = costCurrency;
      return this;
    }
    /**
     * Additional details to capture the origin of the cost data. For example, 'Medicare Part B'.
     */
    @NotNull public Builder costOrigin(String costOrigin) {
      this.costOrigin = costOrigin;
      return this;
    }
    /**
     * The cost per unit of the drug.
     */
    @NotNull public Builder costPerUnit(Number number) {
      if (this.costPerUnit == null) this.costPerUnit = new NumberOrString();
      this.costPerUnit.setNumber(number);
      return this;
    }
    /**
     * The cost per unit of the drug.
     */
    @NotNull public Builder costPerUnit(String costPerUnit) {
      if (this.costPerUnit == null) this.costPerUnit = new NumberOrString();
      this.costPerUnit.setString(costPerUnit);
      return this;
    }
    /**
     * The unit in which the drug is measured, e.g. '5 mg tablet'.
     */
    @NotNull public Builder drugUnit(String drugUnit) {
      this.drugUnit = drugUnit;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(MedicalCode medicalCode) {
      this.code = medicalCode;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(MedicalCode.Builder medicalCode) {
      return this.code(medicalCode.build());
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(MedicalGuideline medicalGuideline) {
      this.guideline = medicalGuideline;
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(MedicalGuideline.Builder medicalGuideline) {
      return this.guideline(medicalGuideline.build());
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(MedicineSystem medicineSystem) {
      this.medicineSystem = medicineSystem;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(MedicineSystem.Builder medicineSystem) {
      return this.medicineSystem(medicineSystem.build());
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(Organization organization) {
      this.recognizingAuthority = organization;
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(Organization.Builder organization) {
      return this.recognizingAuthority(organization.build());
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(MedicalSpecialty medicalSpecialty) {
      this.relevantSpecialty = medicalSpecialty;
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(MedicalSpecialty.Builder medicalSpecialty) {
      return this.relevantSpecialty(medicalSpecialty.build());
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(MedicalStudy medicalStudy) {
      this.study = medicalStudy;
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(MedicalStudy.Builder medicalStudy) {
      return this.study(medicalStudy.build());
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
    private AdministrativeArea applicableLocation;
    private DrugCostCategory costCategory;
    private String costCurrency;
    private String costOrigin;
    private NumberOrString costPerUnit;
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
  public interface Builder extends ThingBuilder<DrugCost> {
    @NotNull Builder applicableLocation(AdministrativeArea administrativeArea);
    @NotNull Builder applicableLocation(AdministrativeArea.Builder administrativeArea);
    @NotNull Builder costCategory(DrugCostCategory drugCostCategory);
    @NotNull Builder costCategory(DrugCostCategory.Builder drugCostCategory);
    @NotNull Builder costCurrency(String costCurrency);
    @NotNull Builder costOrigin(String costOrigin);
    @NotNull Builder costPerUnit(Number number);
    @NotNull Builder costPerUnit(String costPerUnit);
    @NotNull Builder drugUnit(String drugUnit);
    @NotNull Builder code(MedicalCode medicalCode);
    @NotNull Builder code(MedicalCode.Builder medicalCode);
    @NotNull Builder guideline(MedicalGuideline medicalGuideline);
    @NotNull Builder guideline(MedicalGuideline.Builder medicalGuideline);
    @NotNull Builder medicineSystem(MedicineSystem medicineSystem);
    @NotNull Builder medicineSystem(MedicineSystem.Builder medicineSystem);
    @NotNull Builder recognizingAuthority(Organization organization);
    @NotNull Builder recognizingAuthority(Organization.Builder organization);
    @NotNull Builder relevantSpecialty(MedicalSpecialty medicalSpecialty);
    @NotNull Builder relevantSpecialty(MedicalSpecialty.Builder medicalSpecialty);
    @NotNull Builder study(MedicalStudy medicalStudy);
    @NotNull Builder study(MedicalStudy.Builder medicalStudy);
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

  protected DrugCost(AdministrativeArea applicableLocation, DrugCostCategory costCategory, String costCurrency, String costOrigin, NumberOrString costPerUnit, String drugUnit, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myApplicableLocation = applicableLocation;
    myCostCategory = costCategory;
    myCostCurrency = costCurrency;
    myCostOrigin = costOrigin;
    myCostPerUnit = costPerUnit;
    myDrugUnit = drugUnit;
  }
  private AdministrativeArea myApplicableLocation;
  private DrugCostCategory myCostCategory;
  private String myCostCurrency;
  private String myCostOrigin;
  private NumberOrString myCostPerUnit;
  private String myDrugUnit;
}
