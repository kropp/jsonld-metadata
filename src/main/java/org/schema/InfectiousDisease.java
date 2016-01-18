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
  static final class InfectiousDiseaseThingBuilder implements Builder {
    /**
     * Creates new {@link InfectiousDisease} instance.
     */
    public InfectiousDisease build() {
      return new InfectiousDisease(infectiousAgent, infectiousAgentClass, transmissionMethod, associatedAnatomy, cause, differentialDiagnosis, epidemiology, expectedPrognosis, naturalProgression, pathophysiology, possibleComplication, possibleTreatment, primaryPrevention, riskFactor, secondaryPrevention, signOrSymptom, stage, subtype, typicalTest, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The actual infectious agent, such as a specific bacterium.
     */
    @NotNull public Builder infectiousAgent(String infectiousAgent) {
      this.infectiousAgent = infectiousAgent;
      return this;
    }
    /**
     * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
     */
    @NotNull public Builder infectiousAgentClass(InfectiousAgentClass infectiousAgentClass) {
      this.infectiousAgentClass = infectiousAgentClass;
      return this;
    }
    /**
     * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
     */
    @NotNull public Builder infectiousAgentClass(InfectiousAgentClass.Builder infectiousAgentClass) {
      return this.infectiousAgentClass(infectiousAgentClass.build());
    }
    /**
     * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
     */
    @NotNull public Builder transmissionMethod(String transmissionMethod) {
      this.transmissionMethod = transmissionMethod;
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(AnatomicalStructure anatomicalStructure) {
      if (this.associatedAnatomy == null) this.associatedAnatomy = new AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy();
      this.associatedAnatomy.setAnatomicalStructure(anatomicalStructure);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(AnatomicalStructure.Builder anatomicalStructure) {
      return this.associatedAnatomy(anatomicalStructure.build());
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(AnatomicalSystem anatomicalSystem) {
      if (this.associatedAnatomy == null) this.associatedAnatomy = new AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy();
      this.associatedAnatomy.setAnatomicalSystem(anatomicalSystem);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(AnatomicalSystem.Builder anatomicalSystem) {
      return this.associatedAnatomy(anatomicalSystem.build());
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(SuperficialAnatomy superficialAnatomy) {
      if (this.associatedAnatomy == null) this.associatedAnatomy = new AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy();
      this.associatedAnatomy.setSuperficialAnatomy(superficialAnatomy);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(SuperficialAnatomy.Builder superficialAnatomy) {
      return this.associatedAnatomy(superficialAnatomy.build());
    }
    /**
     * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
     */
    @NotNull public Builder cause(MedicalCause medicalCause) {
      this.cause = medicalCause;
      return this;
    }
    /**
     * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
     */
    @NotNull public Builder cause(MedicalCause.Builder medicalCause) {
      return this.cause(medicalCause.build());
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    @NotNull public Builder differentialDiagnosis(DDxElement dDxElement) {
      this.differentialDiagnosis = dDxElement;
      return this;
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    @NotNull public Builder differentialDiagnosis(DDxElement.Builder dDxElement) {
      return this.differentialDiagnosis(dDxElement.build());
    }
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    @NotNull public Builder epidemiology(String epidemiology) {
      this.epidemiology = epidemiology;
      return this;
    }
    /**
     * The likely outcome in either the short term or long term of the medical condition.
     */
    @NotNull public Builder expectedPrognosis(String expectedPrognosis) {
      this.expectedPrognosis = expectedPrognosis;
      return this;
    }
    /**
     * The expected progression of the condition if it is not treated and allowed to progress naturally.
     */
    @NotNull public Builder naturalProgression(String naturalProgression) {
      this.naturalProgression = naturalProgression;
      return this;
    }
    /**
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    @NotNull public Builder pathophysiology(String pathophysiology) {
      this.pathophysiology = pathophysiology;
      return this;
    }
    /**
     * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
     */
    @NotNull public Builder possibleComplication(String possibleComplication) {
      this.possibleComplication = possibleComplication;
      return this;
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    @NotNull public Builder possibleTreatment(MedicalTherapy medicalTherapy) {
      this.possibleTreatment = medicalTherapy;
      return this;
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    @NotNull public Builder possibleTreatment(MedicalTherapy.Builder medicalTherapy) {
      return this.possibleTreatment(medicalTherapy.build());
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    @NotNull public Builder primaryPrevention(MedicalTherapy medicalTherapy) {
      this.primaryPrevention = medicalTherapy;
      return this;
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    @NotNull public Builder primaryPrevention(MedicalTherapy.Builder medicalTherapy) {
      return this.primaryPrevention(medicalTherapy.build());
    }
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    @NotNull public Builder riskFactor(MedicalRiskFactor medicalRiskFactor) {
      this.riskFactor = medicalRiskFactor;
      return this;
    }
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    @NotNull public Builder riskFactor(MedicalRiskFactor.Builder medicalRiskFactor) {
      return this.riskFactor(medicalRiskFactor.build());
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    @NotNull public Builder secondaryPrevention(MedicalTherapy medicalTherapy) {
      this.secondaryPrevention = medicalTherapy;
      return this;
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    @NotNull public Builder secondaryPrevention(MedicalTherapy.Builder medicalTherapy) {
      return this.secondaryPrevention(medicalTherapy.build());
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    @NotNull public Builder signOrSymptom(MedicalSignOrSymptom medicalSignOrSymptom) {
      this.signOrSymptom = medicalSignOrSymptom;
      return this;
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    @NotNull public Builder signOrSymptom(MedicalSignOrSymptom.Builder medicalSignOrSymptom) {
      return this.signOrSymptom(medicalSignOrSymptom.build());
    }
    /**
     * The stage of the condition, if applicable.
     */
    @NotNull public Builder stage(MedicalConditionStage medicalConditionStage) {
      this.stage = medicalConditionStage;
      return this;
    }
    /**
     * The stage of the condition, if applicable.
     */
    @NotNull public Builder stage(MedicalConditionStage.Builder medicalConditionStage) {
      return this.stage(medicalConditionStage.build());
    }
    /**
     * A more specific type of the condition, where applicable, for example 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.
     */
    @NotNull public Builder subtype(String subtype) {
      this.subtype = subtype;
      return this;
    }
    /**
     * A medical test typically performed given this condition.
     */
    @NotNull public Builder typicalTest(MedicalTest medicalTest) {
      this.typicalTest = medicalTest;
      return this;
    }
    /**
     * A medical test typically performed given this condition.
     */
    @NotNull public Builder typicalTest(MedicalTest.Builder medicalTest) {
      return this.typicalTest(medicalTest.build());
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
    private String infectiousAgent;
    private InfectiousAgentClass infectiousAgentClass;
    private String transmissionMethod;
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
  public interface Builder extends ThingBuilder<InfectiousDisease> {
    @NotNull Builder infectiousAgent(String infectiousAgent);
    @NotNull Builder infectiousAgentClass(InfectiousAgentClass infectiousAgentClass);
    @NotNull Builder infectiousAgentClass(InfectiousAgentClass.Builder infectiousAgentClass);
    @NotNull Builder transmissionMethod(String transmissionMethod);
    @NotNull Builder associatedAnatomy(AnatomicalStructure anatomicalStructure);
    @NotNull Builder associatedAnatomy(AnatomicalStructure.Builder anatomicalStructure);
    @NotNull Builder associatedAnatomy(AnatomicalSystem anatomicalSystem);
    @NotNull Builder associatedAnatomy(AnatomicalSystem.Builder anatomicalSystem);
    @NotNull Builder associatedAnatomy(SuperficialAnatomy superficialAnatomy);
    @NotNull Builder associatedAnatomy(SuperficialAnatomy.Builder superficialAnatomy);
    @NotNull Builder cause(MedicalCause medicalCause);
    @NotNull Builder cause(MedicalCause.Builder medicalCause);
    @NotNull Builder differentialDiagnosis(DDxElement dDxElement);
    @NotNull Builder differentialDiagnosis(DDxElement.Builder dDxElement);
    @NotNull Builder epidemiology(String epidemiology);
    @NotNull Builder expectedPrognosis(String expectedPrognosis);
    @NotNull Builder naturalProgression(String naturalProgression);
    @NotNull Builder pathophysiology(String pathophysiology);
    @NotNull Builder possibleComplication(String possibleComplication);
    @NotNull Builder possibleTreatment(MedicalTherapy medicalTherapy);
    @NotNull Builder possibleTreatment(MedicalTherapy.Builder medicalTherapy);
    @NotNull Builder primaryPrevention(MedicalTherapy medicalTherapy);
    @NotNull Builder primaryPrevention(MedicalTherapy.Builder medicalTherapy);
    @NotNull Builder riskFactor(MedicalRiskFactor medicalRiskFactor);
    @NotNull Builder riskFactor(MedicalRiskFactor.Builder medicalRiskFactor);
    @NotNull Builder secondaryPrevention(MedicalTherapy medicalTherapy);
    @NotNull Builder secondaryPrevention(MedicalTherapy.Builder medicalTherapy);
    @NotNull Builder signOrSymptom(MedicalSignOrSymptom medicalSignOrSymptom);
    @NotNull Builder signOrSymptom(MedicalSignOrSymptom.Builder medicalSignOrSymptom);
    @NotNull Builder stage(MedicalConditionStage medicalConditionStage);
    @NotNull Builder stage(MedicalConditionStage.Builder medicalConditionStage);
    @NotNull Builder subtype(String subtype);
    @NotNull Builder typicalTest(MedicalTest medicalTest);
    @NotNull Builder typicalTest(MedicalTest.Builder medicalTest);
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

  protected InfectiousDisease(String infectiousAgent, InfectiousAgentClass infectiousAgentClass, String transmissionMethod, AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy associatedAnatomy, MedicalCause cause, DDxElement differentialDiagnosis, String epidemiology, String expectedPrognosis, String naturalProgression, String pathophysiology, String possibleComplication, MedicalTherapy possibleTreatment, MedicalTherapy primaryPrevention, MedicalRiskFactor riskFactor, MedicalTherapy secondaryPrevention, MedicalSignOrSymptom signOrSymptom, MedicalConditionStage stage, String subtype, MedicalTest typicalTest, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(associatedAnatomy, cause, differentialDiagnosis, epidemiology, expectedPrognosis, naturalProgression, pathophysiology, possibleComplication, possibleTreatment, primaryPrevention, riskFactor, secondaryPrevention, signOrSymptom, stage, subtype, typicalTest, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myInfectiousAgent = infectiousAgent;
    myInfectiousAgentClass = infectiousAgentClass;
    myTransmissionMethod = transmissionMethod;
  }
  private String myInfectiousAgent;
  private InfectiousAgentClass myInfectiousAgentClass;
  private String myTransmissionMethod;
}
