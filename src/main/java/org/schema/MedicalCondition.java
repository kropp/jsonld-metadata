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
 * Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class MedicalCondition extends MedicalEntity {
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  public SuperficialAnatomyOrAnatomicalSystemOrAnatomicalStructure getAssociatedAnatomy() {
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
  public static final class Builder {
    /**
     * Creates new {@link MedicalCondition} instance.
     */
    public MedicalCondition build() {
      return new MedicalCondition(recognizingAuthority, code, differentialDiagnosis, possibleComplication, possibleTreatment, riskFactor, sameAs, additionalType, signOrSymptom, pathophysiology, study, stage, potentialAction, relevantSpecialty, medicineSystem, epidemiology, expectedPrognosis, name, typicalTest, mainEntityOfPage, guideline, cause, url, associatedAnatomy, subtype, primaryPrevention, alternateName, naturalProgression, secondaryPrevention, description);
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization organization) {
      this.recognizingAuthority = organization;
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
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    public Builder differentialDiagnosis(DDxElement dDxElement) {
      this.differentialDiagnosis = dDxElement;
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
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    public Builder riskFactor(MedicalRiskFactor medicalRiskFactor) {
      this.riskFactor = medicalRiskFactor;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    public Builder signOrSymptom(MedicalSignOrSymptom medicalSignOrSymptom) {
      this.signOrSymptom = medicalSignOrSymptom;
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
     * The stage of the condition, if applicable.
     */
    public Builder stage(MedicalConditionStage medicalConditionStage) {
      this.stage = medicalConditionStage;
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
     * The name of the item.
     */
    public Builder name(String name) {
      this.name = name;
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
     * A medical guideline related to this entity.
     */
    public Builder guideline(MedicalGuideline medicalGuideline) {
      this.guideline = medicalGuideline;
      return this;
    }
    /**
     * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
     */
    public Builder cause(MedicalCause medicalCause) {
      this.cause = medicalCause;
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
     * A more specific type of the condition, where applicable, for example 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.
     */
    public Builder subtype(String subtype) {
      this.subtype = subtype;
      return this;
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    public Builder primaryPrevention(MedicalTherapy medicalTherapy) {
      this.primaryPrevention = medicalTherapy;
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
     * The expected progression of the condition if it is not treated and allowed to progress naturally.
     */
    public Builder naturalProgression(String naturalProgression) {
      this.naturalProgression = naturalProgression;
      return this;
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    public Builder secondaryPrevention(MedicalTherapy medicalTherapy) {
      this.secondaryPrevention = medicalTherapy;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
    private Organization recognizingAuthority;
    private MedicalCode code;
    private DDxElement differentialDiagnosis;
    private String possibleComplication;
    private MedicalTherapy possibleTreatment;
    private MedicalRiskFactor riskFactor;
    private String sameAs;
    private String additionalType;
    private MedicalSignOrSymptom signOrSymptom;
    private String pathophysiology;
    private MedicalStudy study;
    private MedicalConditionStage stage;
    private Action potentialAction;
    private MedicalSpecialty relevantSpecialty;
    private MedicineSystem medicineSystem;
    private String epidemiology;
    private String expectedPrognosis;
    private String name;
    private MedicalTest typicalTest;
    private StringOrCreativeWork mainEntityOfPage;
    private MedicalGuideline guideline;
    private MedicalCause cause;
    private String url;
    private SuperficialAnatomyOrAnatomicalSystemOrAnatomicalStructure associatedAnatomy;
    private String subtype;
    private MedicalTherapy primaryPrevention;
    private String alternateName;
    private String naturalProgression;
    private MedicalTherapy secondaryPrevention;
    private String description;
  }

  protected MedicalCondition(Organization recognizingAuthority, MedicalCode code, DDxElement differentialDiagnosis, String possibleComplication, MedicalTherapy possibleTreatment, MedicalRiskFactor riskFactor, String sameAs, String additionalType, MedicalSignOrSymptom signOrSymptom, String pathophysiology, MedicalStudy study, MedicalConditionStage stage, Action potentialAction, MedicalSpecialty relevantSpecialty, MedicineSystem medicineSystem, String epidemiology, String expectedPrognosis, String name, MedicalTest typicalTest, StringOrCreativeWork mainEntityOfPage, MedicalGuideline guideline, MedicalCause cause, String url, SuperficialAnatomyOrAnatomicalSystemOrAnatomicalStructure associatedAnatomy, String subtype, MedicalTherapy primaryPrevention, String alternateName, String naturalProgression, MedicalTherapy secondaryPrevention, String description) {
    super(recognizingAuthority, code, name, mainEntityOfPage, guideline, url, sameAs, additionalType, alternateName, study, description, potentialAction, relevantSpecialty, medicineSystem);
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
  private SuperficialAnatomyOrAnatomicalSystemOrAnatomicalStructure myAssociatedAnatomy;
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
