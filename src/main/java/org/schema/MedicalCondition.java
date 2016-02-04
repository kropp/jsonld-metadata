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
 * Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class MedicalCondition extends MedicalEntity {
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public AnatomicalStructure getAssociatedAnatomyAnatomicalStructure() {
    return (AnatomicalStructure) getValue("associatedAnatomy");
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public Collection<AnatomicalStructure> getAssociatedAnatomyAnatomicalStructures() {
    final Object current = myData.get("associatedAnatomy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AnatomicalStructure>) current;
    }
    return Arrays.asList((AnatomicalStructure) current);
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public AnatomicalSystem getAssociatedAnatomyAnatomicalSystem() {
    return (AnatomicalSystem) getValue("associatedAnatomy");
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public Collection<AnatomicalSystem> getAssociatedAnatomyAnatomicalSystems() {
    final Object current = myData.get("associatedAnatomy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AnatomicalSystem>) current;
    }
    return Arrays.asList((AnatomicalSystem) current);
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public SuperficialAnatomy getAssociatedAnatomySuperficialAnatomy() {
    return (SuperficialAnatomy) getValue("associatedAnatomy");
  }
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  @JsonIgnore public Collection<SuperficialAnatomy> getAssociatedAnatomySuperficialAnatomys() {
    final Object current = myData.get("associatedAnatomy");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SuperficialAnatomy>) current;
    }
    return Arrays.asList((SuperficialAnatomy) current);
  }
  /**
   * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
   */
  @JsonIgnore public MedicalCause getCause() {
    return (MedicalCause) getValue("cause");
  }
  /**
   * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
   */
  @JsonIgnore public Collection<MedicalCause> getCauses() {
    final Object current = myData.get("cause");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalCause>) current;
    }
    return Arrays.asList((MedicalCause) current);
  }
  /**
   * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
   */
  @JsonIgnore public DDxElement getDifferentialDiagnosis() {
    return (DDxElement) getValue("differentialDiagnosis");
  }
  /**
   * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
   */
  @JsonIgnore public Collection<DDxElement> getDifferentialDiagnosiss() {
    final Object current = myData.get("differentialDiagnosis");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DDxElement>) current;
    }
    return Arrays.asList((DDxElement) current);
  }
  /**
   * The characteristics of associated patients, such as age, gender, race etc.
   */
  @JsonIgnore public String getEpidemiology() {
    return (String) getValue("epidemiology");
  }
  /**
   * The characteristics of associated patients, such as age, gender, race etc.
   */
  @JsonIgnore public Collection<String> getEpidemiologys() {
    final Object current = myData.get("epidemiology");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The likely outcome in either the short term or long term of the medical condition.
   */
  @JsonIgnore public String getExpectedPrognosis() {
    return (String) getValue("expectedPrognosis");
  }
  /**
   * The likely outcome in either the short term or long term of the medical condition.
   */
  @JsonIgnore public Collection<String> getExpectedPrognosiss() {
    final Object current = myData.get("expectedPrognosis");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The expected progression of the condition if it is not treated and allowed to progress naturally.
   */
  @JsonIgnore public String getNaturalProgression() {
    return (String) getValue("naturalProgression");
  }
  /**
   * The expected progression of the condition if it is not treated and allowed to progress naturally.
   */
  @JsonIgnore public Collection<String> getNaturalProgressions() {
    final Object current = myData.get("naturalProgression");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
   */
  @JsonIgnore public String getPathophysiology() {
    return (String) getValue("pathophysiology");
  }
  /**
   * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
   */
  @JsonIgnore public Collection<String> getPathophysiologys() {
    final Object current = myData.get("pathophysiology");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
   */
  @JsonIgnore public String getPossibleComplication() {
    return (String) getValue("possibleComplication");
  }
  /**
   * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
   */
  @JsonIgnore public Collection<String> getPossibleComplications() {
    final Object current = myData.get("possibleComplication");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A possible treatment to address this condition, sign or symptom.
   */
  @JsonIgnore public MedicalTherapy getPossibleTreatment() {
    return (MedicalTherapy) getValue("possibleTreatment");
  }
  /**
   * A possible treatment to address this condition, sign or symptom.
   */
  @JsonIgnore public Collection<MedicalTherapy> getPossibleTreatments() {
    final Object current = myData.get("possibleTreatment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalTherapy>) current;
    }
    return Arrays.asList((MedicalTherapy) current);
  }
  /**
   * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
   */
  @JsonIgnore public MedicalTherapy getPrimaryPrevention() {
    return (MedicalTherapy) getValue("primaryPrevention");
  }
  /**
   * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
   */
  @JsonIgnore public Collection<MedicalTherapy> getPrimaryPreventions() {
    final Object current = myData.get("primaryPrevention");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalTherapy>) current;
    }
    return Arrays.asList((MedicalTherapy) current);
  }
  /**
   * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
   */
  @JsonIgnore public MedicalRiskFactor getRiskFactor() {
    return (MedicalRiskFactor) getValue("riskFactor");
  }
  /**
   * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
   */
  @JsonIgnore public Collection<MedicalRiskFactor> getRiskFactors() {
    final Object current = myData.get("riskFactor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalRiskFactor>) current;
    }
    return Arrays.asList((MedicalRiskFactor) current);
  }
  /**
   * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
   */
  @JsonIgnore public MedicalTherapy getSecondaryPrevention() {
    return (MedicalTherapy) getValue("secondaryPrevention");
  }
  /**
   * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
   */
  @JsonIgnore public Collection<MedicalTherapy> getSecondaryPreventions() {
    final Object current = myData.get("secondaryPrevention");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalTherapy>) current;
    }
    return Arrays.asList((MedicalTherapy) current);
  }
  /**
   * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
   */
  @JsonIgnore public MedicalSignOrSymptom getSignOrSymptom() {
    return (MedicalSignOrSymptom) getValue("signOrSymptom");
  }
  /**
   * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
   */
  @JsonIgnore public Collection<MedicalSignOrSymptom> getSignOrSymptoms() {
    final Object current = myData.get("signOrSymptom");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalSignOrSymptom>) current;
    }
    return Arrays.asList((MedicalSignOrSymptom) current);
  }
  /**
   * The stage of the condition, if applicable.
   */
  @JsonIgnore public MedicalConditionStage getStage() {
    return (MedicalConditionStage) getValue("stage");
  }
  /**
   * The stage of the condition, if applicable.
   */
  @JsonIgnore public Collection<MedicalConditionStage> getStages() {
    final Object current = myData.get("stage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalConditionStage>) current;
    }
    return Arrays.asList((MedicalConditionStage) current);
  }
  /**
   * A more specific type of the condition, where applicable, for example 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.
   */
  @JsonIgnore public String getSubtype() {
    return (String) getValue("subtype");
  }
  /**
   * A more specific type of the condition, where applicable, for example 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.
   */
  @JsonIgnore public Collection<String> getSubtypes() {
    final Object current = myData.get("subtype");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A medical test typically performed given this condition.
   */
  @JsonIgnore public MedicalTest getTypicalTest() {
    return (MedicalTest) getValue("typicalTest");
  }
  /**
   * A medical test typically performed given this condition.
   */
  @JsonIgnore public Collection<MedicalTest> getTypicalTests() {
    final Object current = myData.get("typicalTest");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MedicalTest>) current;
    }
    return Arrays.asList((MedicalTest) current);
  }
  protected MedicalCondition(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MedicalCondition}
   */
  public static class Builder extends MedicalEntity.Builder {
    public MedicalCondition build() {
      return new MedicalCondition(myData);
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("associatedAnatomy", anatomicalStructure);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("associatedAnatomy", anatomicalStructure.build());
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalSystem anatomicalSystem) {
      putValue("associatedAnatomy", anatomicalSystem);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalSystem.Builder anatomicalSystem) {
      putValue("associatedAnatomy", anatomicalSystem.build());
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull SuperficialAnatomy superficialAnatomy) {
      putValue("associatedAnatomy", superficialAnatomy);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull SuperficialAnatomy.Builder superficialAnatomy) {
      putValue("associatedAnatomy", superficialAnatomy.build());
      return this;
    }
    /**
     * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
     */
    @NotNull public Builder cause(@NotNull MedicalCause medicalCause) {
      putValue("cause", medicalCause);
      return this;
    }
    /**
     * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
     */
    @NotNull public Builder cause(@NotNull MedicalCause.Builder medicalCause) {
      putValue("cause", medicalCause.build());
      return this;
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    @NotNull public Builder differentialDiagnosis(@NotNull DDxElement dDxElement) {
      putValue("differentialDiagnosis", dDxElement);
      return this;
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    @NotNull public Builder differentialDiagnosis(@NotNull DDxElement.Builder dDxElement) {
      putValue("differentialDiagnosis", dDxElement.build());
      return this;
    }
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    @NotNull public Builder epidemiology(@NotNull String epidemiology) {
      putValue("epidemiology", epidemiology);
      return this;
    }
    /**
     * The likely outcome in either the short term or long term of the medical condition.
     */
    @NotNull public Builder expectedPrognosis(@NotNull String expectedPrognosis) {
      putValue("expectedPrognosis", expectedPrognosis);
      return this;
    }
    /**
     * The expected progression of the condition if it is not treated and allowed to progress naturally.
     */
    @NotNull public Builder naturalProgression(@NotNull String naturalProgression) {
      putValue("naturalProgression", naturalProgression);
      return this;
    }
    /**
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    @NotNull public Builder pathophysiology(@NotNull String pathophysiology) {
      putValue("pathophysiology", pathophysiology);
      return this;
    }
    /**
     * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
     */
    @NotNull public Builder possibleComplication(@NotNull String possibleComplication) {
      putValue("possibleComplication", possibleComplication);
      return this;
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    @NotNull public Builder possibleTreatment(@NotNull MedicalTherapy medicalTherapy) {
      putValue("possibleTreatment", medicalTherapy);
      return this;
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    @NotNull public Builder possibleTreatment(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("possibleTreatment", medicalTherapy.build());
      return this;
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    @NotNull public Builder primaryPrevention(@NotNull MedicalTherapy medicalTherapy) {
      putValue("primaryPrevention", medicalTherapy);
      return this;
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    @NotNull public Builder primaryPrevention(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("primaryPrevention", medicalTherapy.build());
      return this;
    }
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    @NotNull public Builder riskFactor(@NotNull MedicalRiskFactor medicalRiskFactor) {
      putValue("riskFactor", medicalRiskFactor);
      return this;
    }
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    @NotNull public Builder riskFactor(@NotNull MedicalRiskFactor.Builder medicalRiskFactor) {
      putValue("riskFactor", medicalRiskFactor.build());
      return this;
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    @NotNull public Builder secondaryPrevention(@NotNull MedicalTherapy medicalTherapy) {
      putValue("secondaryPrevention", medicalTherapy);
      return this;
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    @NotNull public Builder secondaryPrevention(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("secondaryPrevention", medicalTherapy.build());
      return this;
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    @NotNull public Builder signOrSymptom(@NotNull MedicalSignOrSymptom medicalSignOrSymptom) {
      putValue("signOrSymptom", medicalSignOrSymptom);
      return this;
    }
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    @NotNull public Builder signOrSymptom(@NotNull MedicalSignOrSymptom.Builder medicalSignOrSymptom) {
      putValue("signOrSymptom", medicalSignOrSymptom.build());
      return this;
    }
    /**
     * The stage of the condition, if applicable.
     */
    @NotNull public Builder stage(@NotNull MedicalConditionStage medicalConditionStage) {
      putValue("stage", medicalConditionStage);
      return this;
    }
    /**
     * The stage of the condition, if applicable.
     */
    @NotNull public Builder stage(@NotNull MedicalConditionStage.Builder medicalConditionStage) {
      putValue("stage", medicalConditionStage.build());
      return this;
    }
    /**
     * A more specific type of the condition, where applicable, for example 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.
     */
    @NotNull public Builder subtype(@NotNull String subtype) {
      putValue("subtype", subtype);
      return this;
    }
    /**
     * A medical test typically performed given this condition.
     */
    @NotNull public Builder typicalTest(@NotNull MedicalTest medicalTest) {
      putValue("typicalTest", medicalTest);
      return this;
    }
    /**
     * A medical test typically performed given this condition.
     */
    @NotNull public Builder typicalTest(@NotNull MedicalTest.Builder medicalTest) {
      putValue("typicalTest", medicalTest.build());
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
      if ("associatedAnatomy".equals(key) && value instanceof AnatomicalStructure) { associatedAnatomy((AnatomicalStructure)value); return; }
      if ("associatedAnatomy".equals(key) && value instanceof AnatomicalSystem) { associatedAnatomy((AnatomicalSystem)value); return; }
      if ("associatedAnatomy".equals(key) && value instanceof SuperficialAnatomy) { associatedAnatomy((SuperficialAnatomy)value); return; }
      if ("cause".equals(key) && value instanceof MedicalCause) { cause((MedicalCause)value); return; }
      if ("differentialDiagnosis".equals(key) && value instanceof DDxElement) { differentialDiagnosis((DDxElement)value); return; }
      if ("epidemiology".equals(key) && value instanceof String) { epidemiology((String)value); return; }
      if ("expectedPrognosis".equals(key) && value instanceof String) { expectedPrognosis((String)value); return; }
      if ("naturalProgression".equals(key) && value instanceof String) { naturalProgression((String)value); return; }
      if ("pathophysiology".equals(key) && value instanceof String) { pathophysiology((String)value); return; }
      if ("possibleComplication".equals(key) && value instanceof String) { possibleComplication((String)value); return; }
      if ("possibleTreatment".equals(key) && value instanceof MedicalTherapy) { possibleTreatment((MedicalTherapy)value); return; }
      if ("primaryPrevention".equals(key) && value instanceof MedicalTherapy) { primaryPrevention((MedicalTherapy)value); return; }
      if ("riskFactor".equals(key) && value instanceof MedicalRiskFactor) { riskFactor((MedicalRiskFactor)value); return; }
      if ("secondaryPrevention".equals(key) && value instanceof MedicalTherapy) { secondaryPrevention((MedicalTherapy)value); return; }
      if ("signOrSymptom".equals(key) && value instanceof MedicalSignOrSymptom) { signOrSymptom((MedicalSignOrSymptom)value); return; }
      if ("stage".equals(key) && value instanceof MedicalConditionStage) { stage((MedicalConditionStage)value); return; }
      if ("subtype".equals(key) && value instanceof String) { subtype((String)value); return; }
      if ("typicalTest".equals(key) && value instanceof MedicalTest) { typicalTest((MedicalTest)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
