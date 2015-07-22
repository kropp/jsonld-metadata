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
 * A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class Nerve extends AnatomicalStructure {
  /**
   * The branches that delineate from the nerve bundle.
   */
  public AnatomicalStructure getBranch() {
    return myBranch;
  }
  /**
   * The neurological pathway extension that involves muscle control.
   */
  public Muscle getNerveMotor() {
    return myNerveMotor;
  }
  /**
   * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
   */
  public SuperficialAnatomyOrAnatomicalStructure getSensoryUnit() {
    return mySensoryUnit;
  }
  /**
   * The neurological pathway that originates the neurons.
   */
  public BrainStructure getSourcedFrom() {
    return mySourcedFrom;
  }
  /**
   * Builder for {@link Nerve}
   */
  public static final class Builder {
    /**
     * Creates new {@link Nerve} instance.
     */
    public Nerve build() {
      return new Nerve(recognizingAuthority, bodyLocation, code, diagram, additionalType, sameAs, associatedPathophysiology, nerveMotor, sensoryUnit, study, potentialAction, relevantSpecialty, medicineSystem, sourcedFrom, relatedTherapy, connectedTo, name, mainEntityOfPage, guideline, url, partOfSystem, function, relatedCondition, branch, alternateName, subStructure, description);
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization organization) {
      this.recognizingAuthority = organization;
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
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode medicalCode) {
      this.code = medicalCode;
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
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     */
    public Builder associatedPathophysiology(String associatedPathophysiology) {
      this.associatedPathophysiology = associatedPathophysiology;
      return this;
    }
    /**
     * The neurological pathway extension that involves muscle control.
     */
    public Builder nerveMotor(Muscle muscle) {
      this.nerveMotor = muscle;
      return this;
    }
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    public Builder sensoryUnit(SuperficialAnatomy superficialAnatomy) {
      this.sensoryUnit.setSuperficialAnatomy(superficialAnatomy);
      return this;
    }
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    public Builder sensoryUnit(AnatomicalStructure anatomicalStructure) {
      this.sensoryUnit.setAnatomicalStructure(anatomicalStructure);
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
     * The neurological pathway that originates the neurons.
     */
    public Builder sourcedFrom(BrainStructure brainStructure) {
      this.sourcedFrom = brainStructure;
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
     * Other anatomical structures to which this structure is connected.
     */
    public Builder connectedTo(AnatomicalStructure anatomicalStructure) {
      this.connectedTo = anatomicalStructure;
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
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
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
     * Function of the anatomical structure.
     */
    public Builder function(String function) {
      this.function = function;
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
     * The branches that delineate from the nerve bundle.
     */
    public Builder branch(AnatomicalStructure anatomicalStructure) {
      this.branch = anatomicalStructure;
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
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    public Builder subStructure(AnatomicalStructure anatomicalStructure) {
      this.subStructure = anatomicalStructure;
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
    private String bodyLocation;
    private MedicalCode code;
    private ImageObject diagram;
    private String additionalType;
    private String sameAs;
    private String associatedPathophysiology;
    private Muscle nerveMotor;
    private SuperficialAnatomyOrAnatomicalStructure sensoryUnit;
    private MedicalStudy study;
    private Action potentialAction;
    private MedicalSpecialty relevantSpecialty;
    private MedicineSystem medicineSystem;
    private BrainStructure sourcedFrom;
    private MedicalTherapy relatedTherapy;
    private AnatomicalStructure connectedTo;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private MedicalGuideline guideline;
    private String url;
    private IsPartOf partOfSystem;
    private String function;
    private MedicalCondition relatedCondition;
    private AnatomicalStructure branch;
    private String alternateName;
    private AnatomicalStructure subStructure;
    private String description;
  }

  protected Nerve(Organization recognizingAuthority, String bodyLocation, MedicalCode code, ImageObject diagram, String additionalType, String sameAs, String associatedPathophysiology, Muscle nerveMotor, SuperficialAnatomyOrAnatomicalStructure sensoryUnit, MedicalStudy study, Action potentialAction, MedicalSpecialty relevantSpecialty, MedicineSystem medicineSystem, BrainStructure sourcedFrom, MedicalTherapy relatedTherapy, AnatomicalStructure connectedTo, String name, StringOrCreativeWork mainEntityOfPage, MedicalGuideline guideline, String url, IsPartOf partOfSystem, String function, MedicalCondition relatedCondition, AnatomicalStructure branch, String alternateName, AnatomicalStructure subStructure, String description) {
    super(recognizingAuthority, bodyLocation, code, relatedTherapy, connectedTo, name, mainEntityOfPage, diagram, guideline, additionalType, sameAs, url, partOfSystem, function, relatedCondition, alternateName, associatedPathophysiology, study, subStructure, potentialAction, description, relevantSpecialty, medicineSystem);
    myBranch = branch;
    myNerveMotor = nerveMotor;
    mySensoryUnit = sensoryUnit;
    mySourcedFrom = sourcedFrom;
  }
  private AnatomicalStructure myBranch;
  private Muscle myNerveMotor;
  private SuperficialAnatomyOrAnatomicalStructure mySensoryUnit;
  private BrainStructure mySourcedFrom;
}
