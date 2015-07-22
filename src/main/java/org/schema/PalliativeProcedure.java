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
 * A medical procedure intended primarily for palliative purposes, aimed at relieving the symptoms of an underlying health condition.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class PalliativeProcedure extends MedicalTherapy {
  /**
   * Builder for {@link PalliativeProcedure}
   */
  public static final class Builder {
    /**
     * Creates new {@link PalliativeProcedure} instance.
     */
    public PalliativeProcedure build() {
      return new PalliativeProcedure(adverseOutcome, contraindication, duplicateTherapy, indication, seriousAdverseOutcome, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    public Builder adverseOutcome(MedicalEntity medicalEntity) {
      this.adverseOutcome = medicalEntity;
      return this;
    }
    /**
     * A contraindication for this therapy.
     */
    public Builder contraindication(MedicalContraindication medicalContraindication) {
      this.contraindication = medicalContraindication;
      return this;
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    public Builder duplicateTherapy(MedicalTherapy medicalTherapy) {
      this.duplicateTherapy = medicalTherapy;
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    public Builder indication(MedicalIndication medicalIndication) {
      this.indication = medicalIndication;
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    public Builder seriousAdverseOutcome(MedicalEntity medicalEntity) {
      this.seriousAdverseOutcome = medicalEntity;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode medicalCode) {
      this.code = medicalCode;
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    public Builder guideline(MedicalGuideline medicalGuideline) {
      this.guideline = medicalGuideline;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    public Builder medicineSystem(MedicineSystem medicineSystem) {
      this.medicineSystem = medicineSystem;
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization organization) {
      this.recognizingAuthority = organization;
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    public Builder relevantSpecialty(MedicalSpecialty medicalSpecialty) {
      this.relevantSpecialty = medicalSpecialty;
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    public Builder study(MedicalStudy medicalStudy) {
      this.study = medicalStudy;
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
    private MedicalEntity adverseOutcome;
    private MedicalContraindication contraindication;
    private MedicalTherapy duplicateTherapy;
    private MedicalIndication indication;
    private MedicalEntity seriousAdverseOutcome;
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
  }

  protected PalliativeProcedure(MedicalEntity adverseOutcome, MedicalContraindication contraindication, MedicalTherapy duplicateTherapy, MedicalIndication indication, MedicalEntity seriousAdverseOutcome, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction) {
    super(adverseOutcome, contraindication, duplicateTherapy, indication, seriousAdverseOutcome, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
  }
}
