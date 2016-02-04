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
 * Fitness-related activity designed for a specific health-related purpose, including defined exercise routines as well as activity prescribed by a clinician.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class ExercisePlan extends PhysicalActivity {
  /**
   * Length of time to engage in the activity.
   */
  @JsonIgnore public Duration getActivityDuration() {
    return (Duration) getValue("activityDuration");
  }
  /**
   * Length of time to engage in the activity.
   */
  @JsonIgnore public Collection<Duration> getActivityDurations() {
    final Object current = myData.get("activityDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * How often one should engage in the activity.
   */
  @JsonIgnore public String getActivityFrequency() {
    return (String) getValue("activityFrequency");
  }
  /**
   * How often one should engage in the activity.
   */
  @JsonIgnore public Collection<String> getActivityFrequencys() {
    final Object current = myData.get("activityFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any additional component of the exercise prescription that may need to be articulated to the patient. This may include the order of exercises, the number of repetitions of movement, quantitative distance, progressions over time, etc.
   */
  @JsonIgnore public String getAdditionalVariable() {
    return (String) getValue("additionalVariable");
  }
  /**
   * Any additional component of the exercise prescription that may need to be articulated to the patient. This may include the order of exercises, the number of repetitions of movement, quantitative distance, progressions over time, etc.
   */
  @JsonIgnore public Collection<String> getAdditionalVariables() {
    final Object current = myData.get("additionalVariable");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
   */
  @JsonIgnore public String getExerciseType() {
    return (String) getValue("exerciseType");
  }
  /**
   * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
   */
  @JsonIgnore public Collection<String> getExerciseTypes() {
    final Object current = myData.get("exerciseType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Quantitative measure gauging the degree of force involved in the exercise, for example, heartbeats per minute. May include the velocity of the movement.
   */
  @JsonIgnore public String getIntensity() {
    return (String) getValue("intensity");
  }
  /**
   * Quantitative measure gauging the degree of force involved in the exercise, for example, heartbeats per minute. May include the velocity of the movement.
   */
  @JsonIgnore public Collection<String> getIntensitys() {
    final Object current = myData.get("intensity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Number of times one should repeat the activity.
   */
  @JsonIgnore public Integer getRepetitionsInteger() {
    return (Integer) getValue("repetitions");
  }
  /**
   * Number of times one should repeat the activity.
   */
  @JsonIgnore public Collection<Integer> getRepetitionsIntegers() {
    final Object current = myData.get("repetitions");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Number of times one should repeat the activity.
   */
  @JsonIgnore public Long getRepetitionsLong() {
    return (Long) getValue("repetitions");
  }
  /**
   * Number of times one should repeat the activity.
   */
  @JsonIgnore public Collection<Long> getRepetitionsLongs() {
    final Object current = myData.get("repetitions");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * Number of times one should repeat the activity.
   */
  @JsonIgnore public Float getRepetitionsFloat() {
    return (Float) getValue("repetitions");
  }
  /**
   * Number of times one should repeat the activity.
   */
  @JsonIgnore public Collection<Float> getRepetitionsFloats() {
    final Object current = myData.get("repetitions");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * Number of times one should repeat the activity.
   */
  @JsonIgnore public Double getRepetitionsDouble() {
    return (Double) getValue("repetitions");
  }
  /**
   * Number of times one should repeat the activity.
   */
  @JsonIgnore public Collection<Double> getRepetitionsDoubles() {
    final Object current = myData.get("repetitions");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * Number of times one should repeat the activity.
   */
  @JsonIgnore public String getRepetitionsString() {
    return (String) getValue("repetitions");
  }
  /**
   * Number of times one should repeat the activity.
   */
  @JsonIgnore public Collection<String> getRepetitionsStrings() {
    final Object current = myData.get("repetitions");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * How often one should break from the activity.
   */
  @JsonIgnore public String getRestPeriods() {
    return (String) getValue("restPeriods");
  }
  /**
   * How often one should break from the activity.
   */
  @JsonIgnore public Collection<String> getRestPeriodss() {
    final Object current = myData.get("restPeriods");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.
   */
  @JsonIgnore public Energy getWorkload() {
    return (Energy) getValue("workload");
  }
  /**
   * Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.
   */
  @JsonIgnore public Collection<Energy> getWorkloads() {
    final Object current = myData.get("workload");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Energy>) current;
    }
    return Arrays.asList((Energy) current);
  }
  protected ExercisePlan(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link ExercisePlan}
   */
  public static class Builder extends PhysicalActivity.Builder {
    public ExercisePlan build() {
      return new ExercisePlan(myData);
    }
    /**
     * Length of time to engage in the activity.
     */
    @NotNull public Builder activityDuration(@NotNull Duration duration) {
      putValue("activityDuration", duration);
      return this;
    }
    /**
     * Length of time to engage in the activity.
     */
    @NotNull public Builder activityDuration(@NotNull Duration.Builder duration) {
      putValue("activityDuration", duration.build());
      return this;
    }
    /**
     * How often one should engage in the activity.
     */
    @NotNull public Builder activityFrequency(@NotNull String activityFrequency) {
      putValue("activityFrequency", activityFrequency);
      return this;
    }
    /**
     * Any additional component of the exercise prescription that may need to be articulated to the patient. This may include the order of exercises, the number of repetitions of movement, quantitative distance, progressions over time, etc.
     */
    @NotNull public Builder additionalVariable(@NotNull String additionalVariable) {
      putValue("additionalVariable", additionalVariable);
      return this;
    }
    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     */
    @NotNull public Builder exerciseType(@NotNull String exerciseType) {
      putValue("exerciseType", exerciseType);
      return this;
    }
    /**
     * Quantitative measure gauging the degree of force involved in the exercise, for example, heartbeats per minute. May include the velocity of the movement.
     */
    @NotNull public Builder intensity(@NotNull String intensity) {
      putValue("intensity", intensity);
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    @NotNull public Builder repetitions(@NotNull Integer integer) {
      putValue("repetitions", integer);
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    @NotNull public Builder repetitions(@NotNull Long repetitions) {
      putValue("repetitions", repetitions);
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    @NotNull public Builder repetitions(@NotNull Float repetitions) {
      putValue("repetitions", repetitions);
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    @NotNull public Builder repetitions(@NotNull Double repetitions) {
      putValue("repetitions", repetitions);
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    @NotNull public Builder repetitions(@NotNull String repetitions) {
      putValue("repetitions", repetitions);
      return this;
    }
    /**
     * How often one should break from the activity.
     */
    @NotNull public Builder restPeriods(@NotNull String restPeriods) {
      putValue("restPeriods", restPeriods);
      return this;
    }
    /**
     * Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.
     */
    @NotNull public Builder workload(@NotNull Energy energy) {
      putValue("workload", energy);
      return this;
    }
    /**
     * Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.
     */
    @NotNull public Builder workload(@NotNull Energy.Builder energy) {
      putValue("workload", energy.build());
      return this;
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
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull PhysicalActivityCategory physicalActivityCategory) {
      putValue("category", physicalActivityCategory);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull PhysicalActivityCategory.Builder physicalActivityCategory) {
      putValue("category", physicalActivityCategory.build());
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull String category) {
      putValue("category", category);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Thing thing) {
      putValue("category", thing);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Thing.Builder thing) {
      putValue("category", thing.build());
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
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    @NotNull public Builder pathophysiology(@NotNull String pathophysiology) {
      putValue("pathophysiology", pathophysiology);
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    @NotNull public Builder adverseOutcome(@NotNull MedicalEntity medicalEntity) {
      putValue("adverseOutcome", medicalEntity);
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    @NotNull public Builder adverseOutcome(@NotNull MedicalEntity.Builder medicalEntity) {
      putValue("adverseOutcome", medicalEntity.build());
      return this;
    }
    /**
     * A contraindication for this therapy.
     */
    @NotNull public Builder contraindication(@NotNull MedicalContraindication medicalContraindication) {
      putValue("contraindication", medicalContraindication);
      return this;
    }
    /**
     * A contraindication for this therapy.
     */
    @NotNull public Builder contraindication(@NotNull MedicalContraindication.Builder medicalContraindication) {
      putValue("contraindication", medicalContraindication.build());
      return this;
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    @NotNull public Builder duplicateTherapy(@NotNull MedicalTherapy medicalTherapy) {
      putValue("duplicateTherapy", medicalTherapy);
      return this;
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    @NotNull public Builder duplicateTherapy(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("duplicateTherapy", medicalTherapy.build());
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    @NotNull public Builder indication(@NotNull MedicalIndication medicalIndication) {
      putValue("indication", medicalIndication);
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    @NotNull public Builder indication(@NotNull MedicalIndication.Builder medicalIndication) {
      putValue("indication", medicalIndication.build());
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @NotNull public Builder seriousAdverseOutcome(@NotNull MedicalEntity medicalEntity) {
      putValue("seriousAdverseOutcome", medicalEntity);
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @NotNull public Builder seriousAdverseOutcome(@NotNull MedicalEntity.Builder medicalEntity) {
      putValue("seriousAdverseOutcome", medicalEntity.build());
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
      if ("activityDuration".equals(key) && value instanceof Duration) { activityDuration((Duration)value); return; }
      if ("activityFrequency".equals(key) && value instanceof String) { activityFrequency((String)value); return; }
      if ("additionalVariable".equals(key) && value instanceof String) { additionalVariable((String)value); return; }
      if ("exerciseType".equals(key) && value instanceof String) { exerciseType((String)value); return; }
      if ("intensity".equals(key) && value instanceof String) { intensity((String)value); return; }
      if ("repetitions".equals(key) && value instanceof Integer) { repetitions((Integer)value); return; }
      if ("repetitions".equals(key) && value instanceof Long) { repetitions((Long)value); return; }
      if ("repetitions".equals(key) && value instanceof Float) { repetitions((Float)value); return; }
      if ("repetitions".equals(key) && value instanceof Double) { repetitions((Double)value); return; }
      if ("repetitions".equals(key) && value instanceof String) { repetitions((String)value); return; }
      if ("restPeriods".equals(key) && value instanceof String) { restPeriods((String)value); return; }
      if ("workload".equals(key) && value instanceof Energy) { workload((Energy)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
