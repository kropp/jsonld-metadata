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
 * Fitness-related activity designed for a specific health-related purpose, including defined exercise routines as well as activity prescribed by a clinician.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class ExercisePlan extends PhysicalActivity {
  /**
   * Length of time to engage in the activity.
   */
  public Duration getActivityDuration() {
    return myActivityDuration;
  }
  /**
   * How often one should engage in the activity.
   */
  public String getActivityFrequency() {
    return myActivityFrequency;
  }
  /**
   * Any additional component of the exercise prescription that may need to be articulated to the patient. This may include the order of exercises, the number of repetitions of movement, quantitative distance, progressions over time, etc.
   */
  public String getAdditionalVariable() {
    return myAdditionalVariable;
  }
  /**
   * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
   */
  public String getExerciseType() {
    return myExerciseType;
  }
  /**
   * Quantitative measure gauging the degree of force involved in the exercise, for example, heartbeats per minute. May include the velocity of the movement.
   */
  public String getIntensity() {
    return myIntensity;
  }
  /**
   * Number of times one should repeat the activity.
   */
  public Number getRepetitions() {
    return myRepetitions;
  }
  /**
   * How often one should break from the activity.
   */
  public String getRestPeriods() {
    return myRestPeriods;
  }
  /**
   * Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.
   */
  public Energy getWorkload() {
    return myWorkload;
  }
  /**
   * Builder for {@link ExercisePlan}
   */
  static final class ExercisePlanThingBuilder implements Builder {
    /**
     * Creates new {@link ExercisePlan} instance.
     */
    public ExercisePlan build() {
      return new ExercisePlan(activityDuration, activityFrequency, additionalVariable, exerciseType, intensity, repetitions, restPeriods, workload, associatedAnatomy, category, epidemiology, pathophysiology, adverseOutcome, contraindication, duplicateTherapy, indication, seriousAdverseOutcome, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Length of time to engage in the activity.
     */
    @NotNull public Builder activityDuration(@NotNull Duration duration) {
      this.activityDuration = duration;
      return this;
    }
    /**
     * Length of time to engage in the activity.
     */
    @NotNull public Builder activityDuration(@NotNull Duration.Builder duration) {
      return this.activityDuration(duration.build());
    }
    /**
     * How often one should engage in the activity.
     */
    @NotNull public Builder activityFrequency(@NotNull String activityFrequency) {
      this.activityFrequency = activityFrequency;
      return this;
    }
    /**
     * Any additional component of the exercise prescription that may need to be articulated to the patient. This may include the order of exercises, the number of repetitions of movement, quantitative distance, progressions over time, etc.
     */
    @NotNull public Builder additionalVariable(@NotNull String additionalVariable) {
      this.additionalVariable = additionalVariable;
      return this;
    }
    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     */
    @NotNull public Builder exerciseType(@NotNull String exerciseType) {
      this.exerciseType = exerciseType;
      return this;
    }
    /**
     * Quantitative measure gauging the degree of force involved in the exercise, for example, heartbeats per minute. May include the velocity of the movement.
     */
    @NotNull public Builder intensity(@NotNull String intensity) {
      this.intensity = intensity;
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    @NotNull public Builder repetitions(@NotNull Integer integer) {
      if (this.repetitions == null) this.repetitions = new Number();
      this.repetitions.setInteger(integer);
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    @NotNull public Builder repetitions(@NotNull Long repetitions) {
      if (this.repetitions == null) this.repetitions = new Number();
      this.repetitions.setLong(repetitions);
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    @NotNull public Builder repetitions(@NotNull Float repetitions) {
      if (this.repetitions == null) this.repetitions = new Number();
      this.repetitions.setFloat(repetitions);
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    @NotNull public Builder repetitions(@NotNull Double repetitions) {
      if (this.repetitions == null) this.repetitions = new Number();
      this.repetitions.setDouble(repetitions);
      return this;
    }
    /**
     * Number of times one should repeat the activity.
     */
    @NotNull public Builder repetitions(@NotNull String repetitions) {
      if (this.repetitions == null) this.repetitions = new Number();
      this.repetitions.setString(repetitions);
      return this;
    }
    /**
     * How often one should break from the activity.
     */
    @NotNull public Builder restPeriods(@NotNull String restPeriods) {
      this.restPeriods = restPeriods;
      return this;
    }
    /**
     * Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.
     */
    @NotNull public Builder workload(@NotNull Energy energy) {
      this.workload = energy;
      return this;
    }
    /**
     * Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.
     */
    @NotNull public Builder workload(@NotNull Energy.Builder energy) {
      return this.workload(energy.build());
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalStructure anatomicalStructure) {
      if (this.associatedAnatomy == null) this.associatedAnatomy = new AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy();
      this.associatedAnatomy.setAnatomicalStructure(anatomicalStructure);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      return this.associatedAnatomy(anatomicalStructure.build());
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalSystem anatomicalSystem) {
      if (this.associatedAnatomy == null) this.associatedAnatomy = new AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy();
      this.associatedAnatomy.setAnatomicalSystem(anatomicalSystem);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull AnatomicalSystem.Builder anatomicalSystem) {
      return this.associatedAnatomy(anatomicalSystem.build());
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull SuperficialAnatomy superficialAnatomy) {
      if (this.associatedAnatomy == null) this.associatedAnatomy = new AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy();
      this.associatedAnatomy.setSuperficialAnatomy(superficialAnatomy);
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @NotNull public Builder associatedAnatomy(@NotNull SuperficialAnatomy.Builder superficialAnatomy) {
      return this.associatedAnatomy(superficialAnatomy.build());
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull PhysicalActivityCategory physicalActivityCategory) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setPhysicalActivityCategory(physicalActivityCategory);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull PhysicalActivityCategory.Builder physicalActivityCategory) {
      return this.category(physicalActivityCategory.build());
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull String category) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setString(category);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Thing thing) {
      if (this.category == null) this.category = new PhysicalActivityCategoryOrStringOrThing();
      this.category.setThing(thing);
      return this;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @NotNull public Builder category(@NotNull Thing.Builder thing) {
      return this.category(thing.build());
    }
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    @NotNull public Builder epidemiology(@NotNull String epidemiology) {
      this.epidemiology = epidemiology;
      return this;
    }
    /**
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    @NotNull public Builder pathophysiology(@NotNull String pathophysiology) {
      this.pathophysiology = pathophysiology;
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    @NotNull public Builder adverseOutcome(@NotNull MedicalEntity medicalEntity) {
      this.adverseOutcome = medicalEntity;
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    @NotNull public Builder adverseOutcome(@NotNull MedicalEntity.Builder medicalEntity) {
      return this.adverseOutcome(medicalEntity.build());
    }
    /**
     * A contraindication for this therapy.
     */
    @NotNull public Builder contraindication(@NotNull MedicalContraindication medicalContraindication) {
      this.contraindication = medicalContraindication;
      return this;
    }
    /**
     * A contraindication for this therapy.
     */
    @NotNull public Builder contraindication(@NotNull MedicalContraindication.Builder medicalContraindication) {
      return this.contraindication(medicalContraindication.build());
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    @NotNull public Builder duplicateTherapy(@NotNull MedicalTherapy medicalTherapy) {
      this.duplicateTherapy = medicalTherapy;
      return this;
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    @NotNull public Builder duplicateTherapy(@NotNull MedicalTherapy.Builder medicalTherapy) {
      return this.duplicateTherapy(medicalTherapy.build());
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    @NotNull public Builder indication(@NotNull MedicalIndication medicalIndication) {
      this.indication = medicalIndication;
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    @NotNull public Builder indication(@NotNull MedicalIndication.Builder medicalIndication) {
      return this.indication(medicalIndication.build());
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @NotNull public Builder seriousAdverseOutcome(@NotNull MedicalEntity medicalEntity) {
      this.seriousAdverseOutcome = medicalEntity;
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @NotNull public Builder seriousAdverseOutcome(@NotNull MedicalEntity.Builder medicalEntity) {
      return this.seriousAdverseOutcome(medicalEntity.build());
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
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
        if ("activityDuration".equals(key) && value instanceof Duration) { activityDuration((Duration)value); continue; }
        if ("activityFrequency".equals(key) && value instanceof String) { activityFrequency((String)value); continue; }
        if ("additionalVariable".equals(key) && value instanceof String) { additionalVariable((String)value); continue; }
        if ("exerciseType".equals(key) && value instanceof String) { exerciseType((String)value); continue; }
        if ("intensity".equals(key) && value instanceof String) { intensity((String)value); continue; }
        if ("repetitions".equals(key) && value instanceof Integer) { repetitions((Integer)value); continue; }
        if ("repetitions".equals(key) && value instanceof Long) { repetitions((Long)value); continue; }
        if ("repetitions".equals(key) && value instanceof Float) { repetitions((Float)value); continue; }
        if ("repetitions".equals(key) && value instanceof Double) { repetitions((Double)value); continue; }
        if ("repetitions".equals(key) && value instanceof String) { repetitions((String)value); continue; }
        if ("restPeriods".equals(key) && value instanceof String) { restPeriods((String)value); continue; }
        if ("workload".equals(key) && value instanceof Energy) { workload((Energy)value); continue; }
        if ("associatedAnatomy".equals(key) && value instanceof AnatomicalStructure) { associatedAnatomy((AnatomicalStructure)value); continue; }
        if ("associatedAnatomy".equals(key) && value instanceof AnatomicalSystem) { associatedAnatomy((AnatomicalSystem)value); continue; }
        if ("associatedAnatomy".equals(key) && value instanceof SuperficialAnatomy) { associatedAnatomy((SuperficialAnatomy)value); continue; }
        if ("category".equals(key) && value instanceof PhysicalActivityCategory) { category((PhysicalActivityCategory)value); continue; }
        if ("category".equals(key) && value instanceof String) { category((String)value); continue; }
        if ("category".equals(key) && value instanceof Thing) { category((Thing)value); continue; }
        if ("epidemiology".equals(key) && value instanceof String) { epidemiology((String)value); continue; }
        if ("pathophysiology".equals(key) && value instanceof String) { pathophysiology((String)value); continue; }
        if ("adverseOutcome".equals(key) && value instanceof MedicalEntity) { adverseOutcome((MedicalEntity)value); continue; }
        if ("contraindication".equals(key) && value instanceof MedicalContraindication) { contraindication((MedicalContraindication)value); continue; }
        if ("duplicateTherapy".equals(key) && value instanceof MedicalTherapy) { duplicateTherapy((MedicalTherapy)value); continue; }
        if ("indication".equals(key) && value instanceof MedicalIndication) { indication((MedicalIndication)value); continue; }
        if ("seriousAdverseOutcome".equals(key) && value instanceof MedicalEntity) { seriousAdverseOutcome((MedicalEntity)value); continue; }
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
    private Duration activityDuration;
    private String activityFrequency;
    private String additionalVariable;
    private String exerciseType;
    private String intensity;
    private Number repetitions;
    private String restPeriods;
    private Energy workload;
    private AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy associatedAnatomy;
    private PhysicalActivityCategoryOrStringOrThing category;
    private String epidemiology;
    private String pathophysiology;
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
    private String id;
  }
  public interface Builder extends ThingBuilder<ExercisePlan> {
    @NotNull Builder activityDuration(@NotNull Duration duration);
    @NotNull Builder activityDuration(@NotNull Duration.Builder duration);
    @NotNull Builder activityFrequency(@NotNull String activityFrequency);
    @NotNull Builder additionalVariable(@NotNull String additionalVariable);
    @NotNull Builder exerciseType(@NotNull String exerciseType);
    @NotNull Builder intensity(@NotNull String intensity);
    @NotNull Builder repetitions(@NotNull Integer integer);
    @NotNull Builder repetitions(@NotNull Long repetitions);
    @NotNull Builder repetitions(@NotNull Float repetitions);
    @NotNull Builder repetitions(@NotNull Double repetitions);
    @NotNull Builder repetitions(@NotNull String repetitions);
    @NotNull Builder restPeriods(@NotNull String restPeriods);
    @NotNull Builder workload(@NotNull Energy energy);
    @NotNull Builder workload(@NotNull Energy.Builder energy);
    @NotNull Builder associatedAnatomy(@NotNull AnatomicalStructure anatomicalStructure);
    @NotNull Builder associatedAnatomy(@NotNull AnatomicalStructure.Builder anatomicalStructure);
    @NotNull Builder associatedAnatomy(@NotNull AnatomicalSystem anatomicalSystem);
    @NotNull Builder associatedAnatomy(@NotNull AnatomicalSystem.Builder anatomicalSystem);
    @NotNull Builder associatedAnatomy(@NotNull SuperficialAnatomy superficialAnatomy);
    @NotNull Builder associatedAnatomy(@NotNull SuperficialAnatomy.Builder superficialAnatomy);
    @NotNull Builder category(@NotNull PhysicalActivityCategory physicalActivityCategory);
    @NotNull Builder category(@NotNull PhysicalActivityCategory.Builder physicalActivityCategory);
    @NotNull Builder category(@NotNull String category);
    @NotNull Builder category(@NotNull Thing thing);
    @NotNull Builder category(@NotNull Thing.Builder thing);
    @NotNull Builder epidemiology(@NotNull String epidemiology);
    @NotNull Builder pathophysiology(@NotNull String pathophysiology);
    @NotNull Builder adverseOutcome(@NotNull MedicalEntity medicalEntity);
    @NotNull Builder adverseOutcome(@NotNull MedicalEntity.Builder medicalEntity);
    @NotNull Builder contraindication(@NotNull MedicalContraindication medicalContraindication);
    @NotNull Builder contraindication(@NotNull MedicalContraindication.Builder medicalContraindication);
    @NotNull Builder duplicateTherapy(@NotNull MedicalTherapy medicalTherapy);
    @NotNull Builder duplicateTherapy(@NotNull MedicalTherapy.Builder medicalTherapy);
    @NotNull Builder indication(@NotNull MedicalIndication medicalIndication);
    @NotNull Builder indication(@NotNull MedicalIndication.Builder medicalIndication);
    @NotNull Builder seriousAdverseOutcome(@NotNull MedicalEntity medicalEntity);
    @NotNull Builder seriousAdverseOutcome(@NotNull MedicalEntity.Builder medicalEntity);
    @NotNull Builder code(@NotNull MedicalCode medicalCode);
    @NotNull Builder code(@NotNull MedicalCode.Builder medicalCode);
    @NotNull Builder guideline(@NotNull MedicalGuideline medicalGuideline);
    @NotNull Builder guideline(@NotNull MedicalGuideline.Builder medicalGuideline);
    @NotNull Builder medicineSystem(@NotNull MedicineSystem medicineSystem);
    @NotNull Builder medicineSystem(@NotNull MedicineSystem.Builder medicineSystem);
    @NotNull Builder recognizingAuthority(@NotNull Organization organization);
    @NotNull Builder recognizingAuthority(@NotNull Organization.Builder organization);
    @NotNull Builder relevantSpecialty(@NotNull MedicalSpecialty medicalSpecialty);
    @NotNull Builder relevantSpecialty(@NotNull MedicalSpecialty.Builder medicalSpecialty);
    @NotNull Builder study(@NotNull MedicalStudy medicalStudy);
    @NotNull Builder study(@NotNull MedicalStudy.Builder medicalStudy);
    @NotNull Builder additionalType(@NotNull String additionalType);
    @NotNull Builder alternateName(@NotNull String alternateName);
    @NotNull Builder description(@NotNull String description);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull String mainEntityOfPage);
    @NotNull Builder name(@NotNull String name);
    @NotNull Builder sameAs(@NotNull String sameAs);
    @NotNull Builder url(@NotNull String url);
    @NotNull Builder potentialAction(@NotNull Action action);
    @NotNull Builder potentialAction(@NotNull Action.Builder action);
    @NotNull Builder id(@NotNull String id);
  }

  protected ExercisePlan(Duration activityDuration, String activityFrequency, String additionalVariable, String exerciseType, String intensity, Number repetitions, String restPeriods, Energy workload, AnatomicalStructureOrAnatomicalSystemOrSuperficialAnatomy associatedAnatomy, PhysicalActivityCategoryOrStringOrThing category, String epidemiology, String pathophysiology, MedicalEntity adverseOutcome, MedicalContraindication contraindication, MedicalTherapy duplicateTherapy, MedicalIndication indication, MedicalEntity seriousAdverseOutcome, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(associatedAnatomy, category, epidemiology, pathophysiology, adverseOutcome, contraindication, duplicateTherapy, indication, seriousAdverseOutcome, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myActivityDuration = activityDuration;
    myActivityFrequency = activityFrequency;
    myAdditionalVariable = additionalVariable;
    myExerciseType = exerciseType;
    myIntensity = intensity;
    myRepetitions = repetitions;
    myRestPeriods = restPeriods;
    myWorkload = workload;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myActivityDuration != null ? myActivityDuration.hashCode() : 0);
    result = 31 * result + (myActivityFrequency != null ? myActivityFrequency.hashCode() : 0);
    result = 31 * result + (myAdditionalVariable != null ? myAdditionalVariable.hashCode() : 0);
    result = 31 * result + (myExerciseType != null ? myExerciseType.hashCode() : 0);
    result = 31 * result + (myIntensity != null ? myIntensity.hashCode() : 0);
    result = 31 * result + (myRepetitions != null ? myRepetitions.hashCode() : 0);
    result = 31 * result + (myRestPeriods != null ? myRestPeriods.hashCode() : 0);
    result = 31 * result + (myWorkload != null ? myWorkload.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExercisePlan exercisePlan = (ExercisePlan) o;
    if (!super.equals(o)) return false;
    if (myActivityDuration != null ? !myActivityDuration.equals(exercisePlan.myActivityDuration) : exercisePlan.myActivityDuration != null) return false;
    if (myActivityFrequency != null ? !myActivityFrequency.equals(exercisePlan.myActivityFrequency) : exercisePlan.myActivityFrequency != null) return false;
    if (myAdditionalVariable != null ? !myAdditionalVariable.equals(exercisePlan.myAdditionalVariable) : exercisePlan.myAdditionalVariable != null) return false;
    if (myExerciseType != null ? !myExerciseType.equals(exercisePlan.myExerciseType) : exercisePlan.myExerciseType != null) return false;
    if (myIntensity != null ? !myIntensity.equals(exercisePlan.myIntensity) : exercisePlan.myIntensity != null) return false;
    if (myRepetitions != null ? !myRepetitions.equals(exercisePlan.myRepetitions) : exercisePlan.myRepetitions != null) return false;
    if (myRestPeriods != null ? !myRestPeriods.equals(exercisePlan.myRestPeriods) : exercisePlan.myRestPeriods != null) return false;
    if (myWorkload != null ? !myWorkload.equals(exercisePlan.myWorkload) : exercisePlan.myWorkload != null) return false;
    return true;
  }

  private Duration myActivityDuration;
  private String myActivityFrequency;
  private String myAdditionalVariable;
  private String myExerciseType;
  private String myIntensity;
  private Number myRepetitions;
  private String myRestPeriods;
  private Energy myWorkload;
}
