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
 * Any bodily activity that enhances or maintains physical fitness and overall health and wellness. Includes activity that is part of daily living and routine, structured exercise, and exercise prescribed as part of a medical treatment or recovery plan.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class PhysicalActivity extends LifestyleModification {
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  public SuperficialAnatomyOrAnatomicalSystemOrAnatomicalStructure getAssociatedAnatomy() {
    return myAssociatedAnatomy;
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  public ThingOrStringOrPhysicalActivityCategory getCategory() {
    return myCategory;
  }
  /**
   * The characteristics of associated patients, such as age, gender, race etc.
   */
  public String getEpidemiology() {
    return myEpidemiology;
  }
  /**
   * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
   */
  public String getPathophysiology() {
    return myPathophysiology;
  }
  /**
   * Builder for {@link PhysicalActivity}
   */
  public static final class Builder {
    /**
     * Creates new {@link PhysicalActivity} instance.
     */
    public PhysicalActivity build() {
      return new PhysicalActivity(recognizingAuthority, epidemiology, indication, code, category, name, adverseOutcome, mainEntityOfPage, seriousAdverseOutcome, guideline, sameAs, url, additionalType, associatedAnatomy, duplicateTherapy, alternateName, contraindication, pathophysiology, study, potentialAction, description, relevantSpecialty, medicineSystem);
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization organization) {
      this.recognizingAuthority = organization;
      return this;
    }
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    public Builder epidemiology(String epidemiology) {
      this.epidemiology = epidemiology;
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
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode medicalCode) {
      this.code = medicalCode;
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(Thing thing) {
      this.category.setThing(thing);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(String category) {
      this.category.setString(category);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(PhysicalActivityCategory physicalActivityCategory) {
      this.category.setPhysicalActivityCategory(physicalActivityCategory);
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
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    public Builder adverseOutcome(MedicalEntity medicalEntity) {
      this.adverseOutcome = medicalEntity;
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
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    public Builder seriousAdverseOutcome(MedicalEntity medicalEntity) {
      this.seriousAdverseOutcome = medicalEntity;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(SuperficialAnatomy superficialAnatomy) {
      this.associatedAnatomy.setSuperficialAnatomy(superficialAnatomy);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(AnatomicalSystem anatomicalSystem) {
      this.associatedAnatomy.setAnatomicalSystem(anatomicalSystem);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(AnatomicalStructure anatomicalStructure) {
      this.associatedAnatomy.setAnatomicalStructure(anatomicalStructure);
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
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
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    public Builder pathophysiology(String pathophysiology) {
      this.pathophysiology = pathophysiology;
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
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    public Builder relevantSpecialty(MedicalSpecialty medicalSpecialty) {
      this.relevantSpecialty = medicalSpecialty;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    public Builder medicineSystem(MedicineSystem medicineSystem) {
      this.medicineSystem = medicineSystem;
      return this;
    }
    private Organization recognizingAuthority;
    private String epidemiology;
    private MedicalIndication indication;
    private MedicalCode code;
    private ThingOrStringOrPhysicalActivityCategory category;
    private String name;
    private MedicalEntity adverseOutcome;
    private StringOrCreativeWork mainEntityOfPage;
    private MedicalEntity seriousAdverseOutcome;
    private MedicalGuideline guideline;
    private String sameAs;
    private String url;
    private String additionalType;
    private SuperficialAnatomyOrAnatomicalSystemOrAnatomicalStructure associatedAnatomy;
    private MedicalTherapy duplicateTherapy;
    private String alternateName;
    private MedicalContraindication contraindication;
    private String pathophysiology;
    private MedicalStudy study;
    private Action potentialAction;
    private String description;
    private MedicalSpecialty relevantSpecialty;
    private MedicineSystem medicineSystem;
  }

  protected PhysicalActivity(Organization recognizingAuthority, String epidemiology, MedicalIndication indication, MedicalCode code, ThingOrStringOrPhysicalActivityCategory category, String name, MedicalEntity adverseOutcome, StringOrCreativeWork mainEntityOfPage, MedicalEntity seriousAdverseOutcome, MedicalGuideline guideline, String sameAs, String url, String additionalType, SuperficialAnatomyOrAnatomicalSystemOrAnatomicalStructure associatedAnatomy, MedicalTherapy duplicateTherapy, String alternateName, MedicalContraindication contraindication, String pathophysiology, MedicalStudy study, Action potentialAction, String description, MedicalSpecialty relevantSpecialty, MedicineSystem medicineSystem) {
    super(recognizingAuthority, indication, code, name, adverseOutcome, mainEntityOfPage, seriousAdverseOutcome, guideline, additionalType, url, sameAs, duplicateTherapy, contraindication, alternateName, study, description, potentialAction, relevantSpecialty, medicineSystem);
    myAssociatedAnatomy = associatedAnatomy;
    myCategory = category;
    myEpidemiology = epidemiology;
    myPathophysiology = pathophysiology;
  }
  private SuperficialAnatomyOrAnatomicalSystemOrAnatomicalStructure myAssociatedAnatomy;
  private ThingOrStringOrPhysicalActivityCategory myCategory;
  private String myEpidemiology;
  private String myPathophysiology;
}
