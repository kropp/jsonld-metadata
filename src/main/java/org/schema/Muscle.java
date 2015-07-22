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
  public static final class Builder {
    /**
     * Creates new {@link Muscle} instance.
     */
    public Muscle build() {
      return new Muscle(muscleAction, antagonist, bloodSupply, insertion, nerve, origin, associatedPathophysiology, bodyLocation, connectedTo, diagram, function, partOfSystem, relatedCondition, relatedTherapy, subStructure, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
    }
    /**
     * The movement the muscle generates.
     */
    public Builder muscleAction(String muscleAction) {
      this.muscleAction = muscleAction;
      return this;
    }
    /**
     * The muscle whose action counteracts the specified muscle.
     */
    public Builder antagonist(Muscle muscle) {
      this.antagonist = muscle;
      return this;
    }
    /**
     * The blood vessel that carries blood from the heart to the muscle.
     */
    public Builder bloodSupply(Vessel vessel) {
      this.bloodSupply = vessel;
      return this;
    }
    /**
     * The place of attachment of a muscle, or what the muscle moves.
     */
    public Builder insertion(AnatomicalStructure anatomicalStructure) {
      this.insertion = anatomicalStructure;
      return this;
    }
    /**
     * The underlying innervation associated with the muscle.
     */
    public Builder nerve(Nerve nerve) {
      this.nerve = nerve;
      return this;
    }
    /**
     * The place or point where a muscle arises.
     */
    public Builder origin(AnatomicalStructure anatomicalStructure) {
      this.origin = anatomicalStructure;
      return this;
    }
    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     */
    public Builder associatedPathophysiology(String associatedPathophysiology) {
      this.associatedPathophysiology = associatedPathophysiology;
      return this;
    }
    /**
     * Location in the body of the anatomical structure.
     */
    public Builder bodyLocation(String bodyLocation) {
      this.bodyLocation = bodyLocation;
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     */
    public Builder connectedTo(AnatomicalStructure anatomicalStructure) {
      this.connectedTo = anatomicalStructure;
      return this;
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     */
    public Builder diagram(ImageObject imageObject) {
      this.diagram = imageObject;
      return this;
    }
    /**
     * Function of the anatomical structure.
     */
    public Builder function(String function) {
      this.function = function;
      return this;
    }
    /**
     * The anatomical or organ system that this structure is part of.
     */
    public Builder partOfSystem(IsPartOf isPartOf) {
      this.partOfSystem = isPartOf;
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     */
    public Builder relatedCondition(MedicalCondition medicalCondition) {
      this.relatedCondition = medicalCondition;
      return this;
    }
    /**
     * A medical therapy related to this anatomy.
     */
    public Builder relatedTherapy(MedicalTherapy medicalTherapy) {
      this.relatedTherapy = medicalTherapy;
      return this;
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    public Builder subStructure(AnatomicalStructure anatomicalStructure) {
      this.subStructure = anatomicalStructure;
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
  }

  protected Muscle(String muscleAction, Muscle antagonist, Vessel bloodSupply, AnatomicalStructure insertion, Nerve nerve, AnatomicalStructure origin, String associatedPathophysiology, String bodyLocation, AnatomicalStructure connectedTo, ImageObject diagram, String function, IsPartOf partOfSystem, MedicalCondition relatedCondition, MedicalTherapy relatedTherapy, AnatomicalStructure subStructure, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction) {
    super(associatedPathophysiology, bodyLocation, connectedTo, diagram, function, partOfSystem, relatedCondition, relatedTherapy, subStructure, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction);
    myMuscleAction = muscleAction;
    myAntagonist = antagonist;
    myBloodSupply = bloodSupply;
    myInsertion = insertion;
    myNerve = nerve;
    myOrigin = origin;
  }
  private String myMuscleAction;
  private Muscle myAntagonist;
  private Vessel myBloodSupply;
  private AnatomicalStructure myInsertion;
  private Nerve myNerve;
  private AnatomicalStructure myOrigin;
}
