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
 * A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class Muscle extends AnatomicalStructure {
  /**
   * The movement the muscle generates.
   */
  public String getMuscleAction() {
    return myMuscleAction;
  }
  /**
   * The muscle whose action counteracts the specified muscle.
   */
  public Muscle getAntagonist() {
    return myAntagonist;
  }
  /**
   * The blood vessel that carries blood from the heart to the muscle.
   */
  public Vessel getBloodSupply() {
    return myBloodSupply;
  }
  /**
   * The place of attachment of a muscle, or what the muscle moves.
   */
  public AnatomicalStructure getInsertion() {
    return myInsertion;
  }
  /**
   * The underlying innervation associated with the muscle.
   */
  public Nerve getNerve() {
    return myNerve;
  }
  /**
   * The place or point where a muscle arises.
   */
  public AnatomicalStructure getOrigin() {
    return myOrigin;
  }
  /**
   * Builder for {@link Muscle}
   */
  static final class MuscleThingBuilder implements Builder {
    /**
     * Creates new {@link Muscle} instance.
     */
    public Muscle build() {
      return new Muscle(muscleAction, antagonist, bloodSupply, insertion, nerve, origin, associatedPathophysiology, bodyLocation, connectedTo, diagram, function, partOfSystem, relatedCondition, relatedTherapy, subStructure, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The movement the muscle generates.
     */
    @NotNull public Builder muscleAction(@NotNull String muscleAction) {
      this.muscleAction = muscleAction;
      return this;
    }
    /**
     * The muscle whose action counteracts the specified muscle.
     */
    @NotNull public Builder antagonist(@NotNull Muscle muscle) {
      this.antagonist = muscle;
      return this;
    }
    /**
     * The muscle whose action counteracts the specified muscle.
     */
    @NotNull public Builder antagonist(@NotNull Muscle.Builder muscle) {
      return this.antagonist(muscle.build());
    }
    /**
     * The blood vessel that carries blood from the heart to the muscle.
     */
    @NotNull public Builder bloodSupply(@NotNull Vessel vessel) {
      this.bloodSupply = vessel;
      return this;
    }
    /**
     * The blood vessel that carries blood from the heart to the muscle.
     */
    @NotNull public Builder bloodSupply(@NotNull Vessel.Builder vessel) {
      return this.bloodSupply(vessel.build());
    }
    /**
     * The place of attachment of a muscle, or what the muscle moves.
     */
    @NotNull public Builder insertion(@NotNull AnatomicalStructure anatomicalStructure) {
      this.insertion = anatomicalStructure;
      return this;
    }
    /**
     * The place of attachment of a muscle, or what the muscle moves.
     */
    @NotNull public Builder insertion(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      return this.insertion(anatomicalStructure.build());
    }
    /**
     * The underlying innervation associated with the muscle.
     */
    @NotNull public Builder nerve(@NotNull Nerve nerve) {
      this.nerve = nerve;
      return this;
    }
    /**
     * The underlying innervation associated with the muscle.
     */
    @NotNull public Builder nerve(@NotNull Nerve.Builder nerve) {
      return this.nerve(nerve.build());
    }
    /**
     * The place or point where a muscle arises.
     */
    @NotNull public Builder origin(@NotNull AnatomicalStructure anatomicalStructure) {
      this.origin = anatomicalStructure;
      return this;
    }
    /**
     * The place or point where a muscle arises.
     */
    @NotNull public Builder origin(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      return this.origin(anatomicalStructure.build());
    }
    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     */
    @NotNull public Builder associatedPathophysiology(@NotNull String associatedPathophysiology) {
      this.associatedPathophysiology = associatedPathophysiology;
      return this;
    }
    /**
     * Location in the body of the anatomical structure.
     */
    @NotNull public Builder bodyLocation(@NotNull String bodyLocation) {
      this.bodyLocation = bodyLocation;
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     */
    @NotNull public Builder connectedTo(@NotNull AnatomicalStructure anatomicalStructure) {
      this.connectedTo = anatomicalStructure;
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     */
    @NotNull public Builder connectedTo(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      return this.connectedTo(anatomicalStructure.build());
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     */
    @NotNull public Builder diagram(@NotNull ImageObject imageObject) {
      this.diagram = imageObject;
      return this;
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     */
    @NotNull public Builder diagram(@NotNull ImageObject.Builder imageObject) {
      return this.diagram(imageObject.build());
    }
    /**
     * Function of the anatomical structure.
     */
    @NotNull public Builder function(@NotNull String function) {
      this.function = function;
      return this;
    }
    /**
     * The anatomical or organ system that this structure is part of.
     */
    @NotNull public Builder partOfSystem(@NotNull IsPartOf isPartOf) {
      this.partOfSystem = isPartOf;
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     */
    @NotNull public Builder relatedCondition(@NotNull MedicalCondition medicalCondition) {
      this.relatedCondition = medicalCondition;
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     */
    @NotNull public Builder relatedCondition(@NotNull MedicalCondition.Builder medicalCondition) {
      return this.relatedCondition(medicalCondition.build());
    }
    /**
     * A medical therapy related to this anatomy.
     */
    @NotNull public Builder relatedTherapy(@NotNull MedicalTherapy medicalTherapy) {
      this.relatedTherapy = medicalTherapy;
      return this;
    }
    /**
     * A medical therapy related to this anatomy.
     */
    @NotNull public Builder relatedTherapy(@NotNull MedicalTherapy.Builder medicalTherapy) {
      return this.relatedTherapy(medicalTherapy.build());
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    @NotNull public Builder subStructure(@NotNull AnatomicalStructure anatomicalStructure) {
      this.subStructure = anatomicalStructure;
      return this;
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    @NotNull public Builder subStructure(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      return this.subStructure(anatomicalStructure.build());
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
        if ("muscleAction".equals(key) && value instanceof String) { muscleAction((String)value); continue; }
        if ("antagonist".equals(key) && value instanceof Muscle) { antagonist((Muscle)value); continue; }
        if ("bloodSupply".equals(key) && value instanceof Vessel) { bloodSupply((Vessel)value); continue; }
        if ("insertion".equals(key) && value instanceof AnatomicalStructure) { insertion((AnatomicalStructure)value); continue; }
        if ("nerve".equals(key) && value instanceof Nerve) { nerve((Nerve)value); continue; }
        if ("origin".equals(key) && value instanceof AnatomicalStructure) { origin((AnatomicalStructure)value); continue; }
        if ("associatedPathophysiology".equals(key) && value instanceof String) { associatedPathophysiology((String)value); continue; }
        if ("bodyLocation".equals(key) && value instanceof String) { bodyLocation((String)value); continue; }
        if ("connectedTo".equals(key) && value instanceof AnatomicalStructure) { connectedTo((AnatomicalStructure)value); continue; }
        if ("diagram".equals(key) && value instanceof ImageObject) { diagram((ImageObject)value); continue; }
        if ("function".equals(key) && value instanceof String) { function((String)value); continue; }
        if ("partOfSystem".equals(key) && value instanceof IsPartOf) { partOfSystem((IsPartOf)value); continue; }
        if ("relatedCondition".equals(key) && value instanceof MedicalCondition) { relatedCondition((MedicalCondition)value); continue; }
        if ("relatedTherapy".equals(key) && value instanceof MedicalTherapy) { relatedTherapy((MedicalTherapy)value); continue; }
        if ("subStructure".equals(key) && value instanceof AnatomicalStructure) { subStructure((AnatomicalStructure)value); continue; }
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
    private String muscleAction;
    private Muscle antagonist;
    private Vessel bloodSupply;
    private AnatomicalStructure insertion;
    private Nerve nerve;
    private AnatomicalStructure origin;
    private String associatedPathophysiology;
    private String bodyLocation;
    private AnatomicalStructure connectedTo;
    private ImageObject diagram;
    private String function;
    private IsPartOf partOfSystem;
    private MedicalCondition relatedCondition;
    private MedicalTherapy relatedTherapy;
    private AnatomicalStructure subStructure;
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
  public interface Builder extends ThingBuilder<Muscle> {
    @NotNull Builder muscleAction(@NotNull String muscleAction);
    @NotNull Builder antagonist(@NotNull Muscle muscle);
    @NotNull Builder antagonist(@NotNull Muscle.Builder muscle);
    @NotNull Builder bloodSupply(@NotNull Vessel vessel);
    @NotNull Builder bloodSupply(@NotNull Vessel.Builder vessel);
    @NotNull Builder insertion(@NotNull AnatomicalStructure anatomicalStructure);
    @NotNull Builder insertion(@NotNull AnatomicalStructure.Builder anatomicalStructure);
    @NotNull Builder nerve(@NotNull Nerve nerve);
    @NotNull Builder nerve(@NotNull Nerve.Builder nerve);
    @NotNull Builder origin(@NotNull AnatomicalStructure anatomicalStructure);
    @NotNull Builder origin(@NotNull AnatomicalStructure.Builder anatomicalStructure);
    @NotNull Builder associatedPathophysiology(@NotNull String associatedPathophysiology);
    @NotNull Builder bodyLocation(@NotNull String bodyLocation);
    @NotNull Builder connectedTo(@NotNull AnatomicalStructure anatomicalStructure);
    @NotNull Builder connectedTo(@NotNull AnatomicalStructure.Builder anatomicalStructure);
    @NotNull Builder diagram(@NotNull ImageObject imageObject);
    @NotNull Builder diagram(@NotNull ImageObject.Builder imageObject);
    @NotNull Builder function(@NotNull String function);
    @NotNull Builder partOfSystem(@NotNull IsPartOf isPartOf);
    @NotNull Builder relatedCondition(@NotNull MedicalCondition medicalCondition);
    @NotNull Builder relatedCondition(@NotNull MedicalCondition.Builder medicalCondition);
    @NotNull Builder relatedTherapy(@NotNull MedicalTherapy medicalTherapy);
    @NotNull Builder relatedTherapy(@NotNull MedicalTherapy.Builder medicalTherapy);
    @NotNull Builder subStructure(@NotNull AnatomicalStructure anatomicalStructure);
    @NotNull Builder subStructure(@NotNull AnatomicalStructure.Builder anatomicalStructure);
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

  protected Muscle(String muscleAction, Muscle antagonist, Vessel bloodSupply, AnatomicalStructure insertion, Nerve nerve, AnatomicalStructure origin, String associatedPathophysiology, String bodyLocation, AnatomicalStructure connectedTo, ImageObject diagram, String function, IsPartOf partOfSystem, MedicalCondition relatedCondition, MedicalTherapy relatedTherapy, AnatomicalStructure subStructure, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(associatedPathophysiology, bodyLocation, connectedTo, diagram, function, partOfSystem, relatedCondition, relatedTherapy, subStructure, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myMuscleAction = muscleAction;
    myAntagonist = antagonist;
    myBloodSupply = bloodSupply;
    myInsertion = insertion;
    myNerve = nerve;
    myOrigin = origin;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myMuscleAction != null ? myMuscleAction.hashCode() : 0);
    result = 31 * result + (myAntagonist != null ? myAntagonist.hashCode() : 0);
    result = 31 * result + (myBloodSupply != null ? myBloodSupply.hashCode() : 0);
    result = 31 * result + (myInsertion != null ? myInsertion.hashCode() : 0);
    result = 31 * result + (myNerve != null ? myNerve.hashCode() : 0);
    result = 31 * result + (myOrigin != null ? myOrigin.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Muscle muscle = (Muscle) o;
    if (!super.equals(o)) return false;
    if (myMuscleAction != null ? !myMuscleAction.equals(muscle.myMuscleAction) : muscle.myMuscleAction != null) return false;
    if (myAntagonist != null ? !myAntagonist.equals(muscle.myAntagonist) : muscle.myAntagonist != null) return false;
    if (myBloodSupply != null ? !myBloodSupply.equals(muscle.myBloodSupply) : muscle.myBloodSupply != null) return false;
    if (myInsertion != null ? !myInsertion.equals(muscle.myInsertion) : muscle.myInsertion != null) return false;
    if (myNerve != null ? !myNerve.equals(muscle.myNerve) : muscle.myNerve != null) return false;
    if (myOrigin != null ? !myOrigin.equals(muscle.myOrigin) : muscle.myOrigin != null) return false;
    return true;
  }

  private String myMuscleAction;
  private Muscle myAntagonist;
  private Vessel myBloodSupply;
  private AnatomicalStructure myInsertion;
  private Nerve myNerve;
  private AnatomicalStructure myOrigin;
}
