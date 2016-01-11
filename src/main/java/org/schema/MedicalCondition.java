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

/**
 * Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class MedicalCondition extends MedicalEntity {
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  public AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy getAssociatedAnatomy() {
    return myAssociatedAnatomy;
  }
  /**
   * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
   */
  public MedicalCause getCause() {
    return myCause;
  }
  /**
   * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
   */
  public DDxElement getDifferentialDiagnosis() {
    return myDifferentialDiagnosis;
  }
  /**
   * The characteristics of associated patients, such as age, gender, race etc.
   */
  public String getEpidemiology() {
    return myEpidemiology;
  }
  /**
   * The likely outcome in either the short term or long term of the medical condition.
   */
  public String getExpectedPrognosis() {
    return myExpectedPrognosis;
  }
  /**
   * The expected progression of the condition if it is not treated and allowed to progress naturally.
   */
  public String getNaturalProgression() {
    return myNaturalProgression;
  }
  /**
   * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
   */
  public String getPathophysiology() {
    return myPathophysiology;
  }
  /**
   * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
   */
  public String getPossibleComplication() {
    return myPossibleComplication;
  }
  /**
   * A possible treatment to address this condition, sign or symptom.
   */
  public MedicalTherapy getPossibleTreatment() {
    return myPossibleTreatment;
  }
  /**
   * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
   */
  public MedicalTherapy getPrimaryPrevention() {
    return myPrimaryPrevention;
  }
  /**
   * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
   */
  public MedicalRiskFactor getRiskFactor() {
    return myRiskFactor;
  }
  /**
   * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
   */
  public MedicalTherapy getSecondaryPrevention() {
    return mySecondaryPrevention;
  }
  /**
   * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
   */
  public MedicalSignOrSymptom getSignOrSymptom() {
    return mySignOrSymptom;
  }
  /**
   * The stage of the condition, if applicable.
   */
  public MedicalConditionStage getStage() {
    return myStage;
  }
  /**
   * A more specific type of the condition, where applicable, for example 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.
   */
  public String getSubtype() {
    return mySubtype;
  }
  /**
   * A medical test typically performed given this condition.
   */
  public MedicalTest getTypicalTest() {
    return myTypicalTest;
  }
  /**
   * Builder for {@link MedicalCondition}
   */
  public static final class MedicalConditionThingBuilder implements Builder {
    /**
     * Creates new {@link MedicalCondition} instance.
     */
    public MedicalCondition build() {
      return new MedicalCondition(associatedAnatomy, cause, differentialDiagnosis, epidemiology, expectedPrognosis, naturalProgression, pathophysiology, possibleComplication, possibleTreatment, primaryPrevention, riskFactor, secondaryPrevention, signOrSymptom, stage, subtype, typicalTest, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(AnatomicalStructure anatomicalStructure) {
      if (this.associatedAnatomy == null) this.associatedAnatomy = new AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy();
      this.associatedAnatomy.setAnatomicalStructure(anatomicalStructure);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(AnatomicalStructure.Builder anatomicalStructure) {
      return this.associatedAnatomy(anatomicalStructure.build());
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(AnatomicalSystem anatomicalSystem) {
      if (this.associatedAnatomy == null) this.associatedAnatomy = new AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy();
      this.associatedAnatomy.setAnatomicalSystem(anatomicalSystem);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(AnatomicalSystem.Builder anatomicalSystem) {
      return this.associatedAnatomy(anatomicalSystem.build());
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(SuperficialAnatomy superficialAnatomy) {
      if (this.associatedAnatomy == null) this.associatedAnatomy = new AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy();
      this.associatedAnatomy.setSuperficialAnatomy(superficialAnatomy);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(SuperficialAnatomy.Builder superficialAnatomy) {
      return this.associatedAnatomy(superficialAnatomy.build());
    }
    /**
     * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
     */
    public Builder cause(MedicalCause medicalCause) {
      this.cause = medicalCause;
      return this;
    }
    /**
     * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
     */
    public Builder cause(MedicalCause.Builder medicalCause) {
      return this.cause(medicalCause.build());
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    public Builder differentialDiagnosis(DDxElement dDxElement) {
      this.differentialDiagnosis = dDxElement;
      return this;
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    public Builder differentialDiagnosis(DDxElement.Builder dDxElement) {
      return this.differentialDiagnosis(dDxElement.build());
    }
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    public Builder epidemiology(String epidemiology) {
      this.epidemiology = epidemiology;
      return this;
    }
    /**
     * The likely outcome in either the short term or long term of the medical condition.
     */
    public Builder expectedPrognosis(String expectedPrognosis) {
      this.expectedPrognosis = expectedPrognosis;
      return this;
    }
    /**
     * The expected progression of the condition if it is not treated and allowed to progress naturally.
     */
    public Builder naturalProgression(String naturalProgression) {
      this.naturalProgression = naturalProgression;
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
     * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
     */
    public Builder possibleComplication(String possibleComplication) {
      this.possibleComplication = possibleComplication;
      return this;
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    public Builder possibleTreatment(MedicalTherapy medicalTherapy) {
      this.possibleTreatment = medicalTherapy;
      return this;
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    public Builder possibleTreatment(MedicalTherapy.Builder medicalTherapy) {
      return this.possibleTreatment(medicalTherapy.build());
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    public Builder primaryPrevention(MedicalTherapy medicalTherapy) {
      this.primaryPrevention = medicalTherapy;
      return this;
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    public Builder primaryPrevention(MedicalTherapy.Builder medicalTherapy) {
      return this.primaryPrevention(medicalTherapy.build());
    }
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    public Builder riskFactor(MedicalRiskFactor medicalRiskFactor) {
      this.riskFactor = medicalRiskFactor;
      return this;
    }
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    public Builder riskFactor(MedicalRiskFactor.Builder medicalRiskFactor) {
      return this.riskFactor(medicalRiskFactor.build());
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    public Builder secondaryPrevention(MedicalTherapy medicalTherapy) {
      this.secondaryPrevention = medicalTherapy;
      return this;
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    public Builder secondaryPrevention(MedicalTherapy.Builder medicalTherapy) {
      return this.secondaryPrevention(medicalTherapy.build());
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    public Builder signOrSymptom(MedicalSignOrSymptom medicalSignOrSymptom) {
      this.signOrSymptom = medicalSignOrSymptom;
      return this;
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    public Builder signOrSymptom(MedicalSignOrSymptom.Builder medicalSignOrSymptom) {
      return this.signOrSymptom(medicalSignOrSymptom.build());
    }
    /**
     * The stage of the condition, if applicable.
     */
    public Builder stage(MedicalConditionStage medicalConditionStage) {
      this.stage = medicalConditionStage;
      return this;
    }
    /**
     * The stage of the condition, if applicable.
     */
    public Builder stage(MedicalConditionStage.Builder medicalConditionStage) {
      return this.stage(medicalConditionStage.build());
    }
    /**
     * A more specific type of the condition, where applicable, for example 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.
     */
    public Builder subtype(String subtype) {
      this.subtype = subtype;
      return this;
    }
    /**
     * A medical test typically performed given this condition.
     */
    public Builder typicalTest(MedicalTest medicalTest) {
      this.typicalTest = medicalTest;
      return this;
    }
    /**
     * A medical test typically performed given this condition.
     */
    public Builder typicalTest(MedicalTest.Builder medicalTest) {
      return this.typicalTest(medicalTest.build());
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode medicalCode) {
      this.code = medicalCode;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode.Builder medicalCode) {
      return this.code(medicalCode.build());
    }
    /**
     * A medical guideline related to this entity.
     */
    public Builder guideline(MedicalGuideline medicalGuideline) {
      this.guideline = medicalGuideline;
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    public Builder guideline(MedicalGuideline.Builder medicalGuideline) {
      return this.guideline(medicalGuideline.build());
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    public Builder medicineSystem(MedicineSystem medicineSystem) {
      this.medicineSystem = medicineSystem;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    public Builder medicineSystem(MedicineSystem.Builder medicineSystem) {
      return this.medicineSystem(medicineSystem.build());
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization organization) {
      this.recognizingAuthority = organization;
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization.Builder organization) {
      return this.recognizingAuthority(organization.build());
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    public Builder relevantSpecialty(MedicalSpecialty medicalSpecialty) {
      this.relevantSpecialty = medicalSpecialty;
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    public Builder relevantSpecialty(MedicalSpecialty.Builder medicalSpecialty) {
      return this.relevantSpecialty(medicalSpecialty.build());
    }
    /**
     * A medical study or trial related to this entity.
     */
    public Builder study(MedicalStudy medicalStudy) {
      this.study = medicalStudy;
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    public Builder study(MedicalStudy.Builder medicalStudy) {
      return this.study(medicalStudy.build());
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
    public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
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
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy associatedAnatomy;
    private MedicalCause cause;
    private DDxElement differentialDiagnosis;
    private String epidemiology;
    private String expectedPrognosis;
    private String naturalProgression;
    private String pathophysiology;
    private String possibleComplication;
    private MedicalTherapy possibleTreatment;
    private MedicalTherapy primaryPrevention;
    private MedicalRiskFactor riskFactor;
    private MedicalTherapy secondaryPrevention;
    private MedicalSignOrSymptom signOrSymptom;
    private MedicalConditionStage stage;
    private String subtype;
    private MedicalTest typicalTest;
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
  public interface Builder extends ThingBuilder<MedicalCondition> {
  Builder associatedAnatomy(AnatomicalStructure anatomicalStructure);
  Builder associatedAnatomy(AnatomicalStructure.Builder anatomicalStructure);
  Builder associatedAnatomy(AnatomicalSystem anatomicalSystem);
  Builder associatedAnatomy(AnatomicalSystem.Builder anatomicalSystem);
  Builder associatedAnatomy(SuperficialAnatomy superficialAnatomy);
  Builder associatedAnatomy(SuperficialAnatomy.Builder superficialAnatomy);
  Builder cause(MedicalCause medicalCause);
  Builder cause(MedicalCause.Builder medicalCause);
  Builder differentialDiagnosis(DDxElement dDxElement);
  Builder differentialDiagnosis(DDxElement.Builder dDxElement);
  Builder epidemiology(String epidemiology);
  Builder expectedPrognosis(String expectedPrognosis);
  Builder naturalProgression(String naturalProgression);
  Builder pathophysiology(String pathophysiology);
  Builder possibleComplication(String possibleComplication);
  Builder possibleTreatment(MedicalTherapy medicalTherapy);
  Builder possibleTreatment(MedicalTherapy.Builder medicalTherapy);
  Builder primaryPrevention(MedicalTherapy medicalTherapy);
  Builder primaryPrevention(MedicalTherapy.Builder medicalTherapy);
  Builder riskFactor(MedicalRiskFactor medicalRiskFactor);
  Builder riskFactor(MedicalRiskFactor.Builder medicalRiskFactor);
  Builder secondaryPrevention(MedicalTherapy medicalTherapy);
  Builder secondaryPrevention(MedicalTherapy.Builder medicalTherapy);
  Builder signOrSymptom(MedicalSignOrSymptom medicalSignOrSymptom);
  Builder signOrSymptom(MedicalSignOrSymptom.Builder medicalSignOrSymptom);
  Builder stage(MedicalConditionStage medicalConditionStage);
  Builder stage(MedicalConditionStage.Builder medicalConditionStage);
  Builder subtype(String subtype);
  Builder typicalTest(MedicalTest medicalTest);
  Builder typicalTest(MedicalTest.Builder medicalTest);
  Builder code(MedicalCode medicalCode);
  Builder code(MedicalCode.Builder medicalCode);
  Builder guideline(MedicalGuideline medicalGuideline);
  Builder guideline(MedicalGuideline.Builder medicalGuideline);
  Builder medicineSystem(MedicineSystem medicineSystem);
  Builder medicineSystem(MedicineSystem.Builder medicineSystem);
  Builder recognizingAuthority(Organization organization);
  Builder recognizingAuthority(Organization.Builder organization);
  Builder relevantSpecialty(MedicalSpecialty medicalSpecialty);
  Builder relevantSpecialty(MedicalSpecialty.Builder medicalSpecialty);
  Builder study(MedicalStudy medicalStudy);
  Builder study(MedicalStudy.Builder medicalStudy);
  Builder additionalType(String additionalType);
  Builder alternateName(String alternateName);
  Builder description(String description);
  Builder mainEntityOfPage(CreativeWork creativeWork);
  Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
  Builder mainEntityOfPage(String mainEntityOfPage);
  Builder name(String name);
  Builder sameAs(String sameAs);
  Builder url(String url);
  Builder potentialAction(Action action);
  Builder potentialAction(Action.Builder action);
  Builder id(String id);
  }

  protected MedicalCondition(AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy associatedAnatomy, MedicalCause cause, DDxElement differentialDiagnosis, String epidemiology, String expectedPrognosis, String naturalProgression, String pathophysiology, String possibleComplication, MedicalTherapy possibleTreatment, MedicalTherapy primaryPrevention, MedicalRiskFactor riskFactor, MedicalTherapy secondaryPrevention, MedicalSignOrSymptom signOrSymptom, MedicalConditionStage stage, String subtype, MedicalTest typicalTest, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myAssociatedAnatomy = associatedAnatomy;
    myCause = cause;
    myDifferentialDiagnosis = differentialDiagnosis;
    myEpidemiology = epidemiology;
    myExpectedPrognosis = expectedPrognosis;
    myNaturalProgression = naturalProgression;
    myPathophysiology = pathophysiology;
    myPossibleComplication = possibleComplication;
    myPossibleTreatment = possibleTreatment;
    myPrimaryPrevention = primaryPrevention;
    myRiskFactor = riskFactor;
    mySecondaryPrevention = secondaryPrevention;
    mySignOrSymptom = signOrSymptom;
    myStage = stage;
    mySubtype = subtype;
    myTypicalTest = typicalTest;
  }
  private AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy myAssociatedAnatomy;
  private MedicalCause myCause;
  private DDxElement myDifferentialDiagnosis;
  private String myEpidemiology;
  private String myExpectedPrognosis;
  private String myNaturalProgression;
  private String myPathophysiology;
  private String myPossibleComplication;
  private MedicalTherapy myPossibleTreatment;
  private MedicalTherapy myPrimaryPrevention;
  private MedicalRiskFactor myRiskFactor;
  private MedicalTherapy mySecondaryPrevention;
  private MedicalSignOrSymptom mySignOrSymptom;
  private MedicalConditionStage myStage;
  private String mySubtype;
  private MedicalTest myTypicalTest;
}
