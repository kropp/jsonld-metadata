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
 * An infectious disease is a clinically evident human disease resulting from the presence of pathogenic microbial agents, like pathogenic viruses, pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To be considered an infectious disease, such pathogens are known to be able to cause this disease.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class InfectiousDisease extends MedicalCondition {
  /**
   * The actual infectious agent, such as a specific bacterium.
   */
  public String getInfectiousAgent() {
    return myInfectiousAgent;
  }
  /**
   * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
   */
  public InfectiousAgentClass getInfectiousAgentClass() {
    return myInfectiousAgentClass;
  }
  /**
   * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
   */
  public String getTransmissionMethod() {
    return myTransmissionMethod;
  }
  /**
   * Builder for {@link InfectiousDisease}
   */
  public static final class Builder {
    /**
     * Creates new {@link InfectiousDisease} instance.
     */
    public InfectiousDisease build() {
      return new InfectiousDisease(recognizingAuthority, code, differentialDiagnosis, possibleComplication, possibleTreatment, additionalType, sameAs, riskFactor, transmissionMethod, signOrSymptom, pathophysiology, study, stage, potentialAction, relevantSpecialty, medicineSystem, epidemiology, expectedPrognosis, name, typicalTest, mainEntityOfPage, guideline, infectiousAgent, url, cause, subtype, associatedAnatomy, primaryPrevention, naturalProgression, alternateName, secondaryPrevention, description, infectiousAgentClass);
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    public Builder riskFactor(MedicalRiskFactor medicalRiskFactor) {
      this.riskFactor = medicalRiskFactor;
      return this;
    }
    /**
     * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
     */
    public Builder transmissionMethod(String transmissionMethod) {
      this.transmissionMethod = transmissionMethod;
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
     * The actual infectious agent, such as a specific bacterium.
     */
    public Builder infectiousAgent(String infectiousAgent) {
      this.infectiousAgent = infectiousAgent;
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
     * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
     */
    public Builder cause(MedicalCause medicalCause) {
      this.cause = medicalCause;
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
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    public Builder primaryPrevention(MedicalTherapy medicalTherapy) {
      this.primaryPrevention = medicalTherapy;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
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
    /**
     * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
     */
    public Builder infectiousAgentClass(InfectiousAgentClass infectiousAgentClass) {
      this.infectiousAgentClass = infectiousAgentClass;
      return this;
    }
    private Organization recognizingAuthority;
    private MedicalCode code;
    private DDxElement differentialDiagnosis;
    private String possibleComplication;
    private MedicalTherapy possibleTreatment;
    private String additionalType;
    private String sameAs;
    private MedicalRiskFactor riskFactor;
    private String transmissionMethod;
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
    private String infectiousAgent;
    private String url;
    private MedicalCause cause;
    private String subtype;
    private SuperficialAnatomyOrAnatomicalSystemOrAnatomicalStructure associatedAnatomy;
    private MedicalTherapy primaryPrevention;
    private String naturalProgression;
    private String alternateName;
    private MedicalTherapy secondaryPrevention;
    private String description;
    private InfectiousAgentClass infectiousAgentClass;
  }

  protected InfectiousDisease(Organization recognizingAuthority, MedicalCode code, DDxElement differentialDiagnosis, String possibleComplication, MedicalTherapy possibleTreatment, String additionalType, String sameAs, MedicalRiskFactor riskFactor, String transmissionMethod, MedicalSignOrSymptom signOrSymptom, String pathophysiology, MedicalStudy study, MedicalConditionStage stage, Action potentialAction, MedicalSpecialty relevantSpecialty, MedicineSystem medicineSystem, String epidemiology, String expectedPrognosis, String name, MedicalTest typicalTest, StringOrCreativeWork mainEntityOfPage, MedicalGuideline guideline, String infectiousAgent, String url, MedicalCause cause, String subtype, SuperficialAnatomyOrAnatomicalSystemOrAnatomicalStructure associatedAnatomy, MedicalTherapy primaryPrevention, String naturalProgression, String alternateName, MedicalTherapy secondaryPrevention, String description, InfectiousAgentClass infectiousAgentClass) {
    super(recognizingAuthority, code, differentialDiagnosis, possibleComplication, possibleTreatment, riskFactor, sameAs, additionalType, signOrSymptom, pathophysiology, study, stage, potentialAction, relevantSpecialty, medicineSystem, epidemiology, expectedPrognosis, name, typicalTest, mainEntityOfPage, guideline, cause, url, associatedAnatomy, subtype, primaryPrevention, alternateName, naturalProgression, secondaryPrevention, description);
    myInfectiousAgent = infectiousAgent;
    myInfectiousAgentClass = infectiousAgentClass;
    myTransmissionMethod = transmissionMethod;
  }
  private String myInfectiousAgent;
  private InfectiousAgentClass myInfectiousAgentClass;
  private String myTransmissionMethod;
}
