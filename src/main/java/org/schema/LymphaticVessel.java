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
 * A type of blood vessel that specifically carries lymph fluid unidirectionally toward the heart.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class LymphaticVessel extends Vessel {
  /**
   * The vasculature the lymphatic structure originates, or afferents, from.
   */
  public Vessel getOriginatesFrom() {
    return myOriginatesFrom;
  }
  /**
   * The anatomical or organ system drained by this vessel; generally refers to a specific part of an organ.
   */
  public AnatomicalSystemOrAnatomicalStructure getRegionDrained() {
    return myRegionDrained;
  }
  /**
   * The vasculature the lymphatic structure runs, or efferents, to.
   */
  public Vessel getRunsTo() {
    return myRunsTo;
  }
  /**
   * Builder for {@link LymphaticVessel}
   */
  public static final class Builder {
    /**
     * Creates new {@link LymphaticVessel} instance.
     */
    public LymphaticVessel build() {
      return new LymphaticVessel(recognizingAuthority, originatesFrom, bodyLocation, code, diagram, additionalType, sameAs, associatedPathophysiology, study, potentialAction, relevantSpecialty, regionDrained, medicineSystem, relatedTherapy, connectedTo, name, mainEntityOfPage, guideline, url, partOfSystem, relatedCondition, function, alternateName, subStructure, description, runsTo);
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization organization) {
      this.recognizingAuthority = organization;
      return this;
    }
    /**
     * The vasculature the lymphatic structure originates, or afferents, from.
     */
    public Builder originatesFrom(Vessel vessel) {
      this.originatesFrom = vessel;
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
     * The anatomical or organ system drained by this vessel; generally refers to a specific part of an organ.
     */
    public Builder regionDrained(AnatomicalSystem anatomicalSystem) {
      this.regionDrained.setAnatomicalSystem(anatomicalSystem);
      return this;
    }
    /**
     * The anatomical or organ system drained by this vessel; generally refers to a specific part of an organ.
     */
    public Builder regionDrained(AnatomicalStructure anatomicalStructure) {
      this.regionDrained.setAnatomicalStructure(anatomicalStructure);
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
     * A medical condition associated with this anatomy.
     */
    public Builder relatedCondition(MedicalCondition medicalCondition) {
      this.relatedCondition = medicalCondition;
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
    /**
     * The vasculature the lymphatic structure runs, or efferents, to.
     */
    public Builder runsTo(Vessel vessel) {
      this.runsTo = vessel;
      return this;
    }
    private Organization recognizingAuthority;
    private Vessel originatesFrom;
    private String bodyLocation;
    private MedicalCode code;
    private ImageObject diagram;
    private String additionalType;
    private String sameAs;
    private String associatedPathophysiology;
    private MedicalStudy study;
    private Action potentialAction;
    private MedicalSpecialty relevantSpecialty;
    private AnatomicalSystemOrAnatomicalStructure regionDrained;
    private MedicineSystem medicineSystem;
    private MedicalTherapy relatedTherapy;
    private AnatomicalStructure connectedTo;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private MedicalGuideline guideline;
    private String url;
    private IsPartOf partOfSystem;
    private MedicalCondition relatedCondition;
    private String function;
    private String alternateName;
    private AnatomicalStructure subStructure;
    private String description;
    private Vessel runsTo;
  }

  protected LymphaticVessel(Organization recognizingAuthority, Vessel originatesFrom, String bodyLocation, MedicalCode code, ImageObject diagram, String additionalType, String sameAs, String associatedPathophysiology, MedicalStudy study, Action potentialAction, MedicalSpecialty relevantSpecialty, AnatomicalSystemOrAnatomicalStructure regionDrained, MedicineSystem medicineSystem, MedicalTherapy relatedTherapy, AnatomicalStructure connectedTo, String name, StringOrCreativeWork mainEntityOfPage, MedicalGuideline guideline, String url, IsPartOf partOfSystem, MedicalCondition relatedCondition, String function, String alternateName, AnatomicalStructure subStructure, String description, Vessel runsTo) {
    super(recognizingAuthority, bodyLocation, code, relatedTherapy, connectedTo, name, mainEntityOfPage, diagram, guideline, additionalType, sameAs, url, partOfSystem, relatedCondition, function, alternateName, associatedPathophysiology, subStructure, study, description, potentialAction, relevantSpecialty, medicineSystem);
    myOriginatesFrom = originatesFrom;
    myRegionDrained = regionDrained;
    myRunsTo = runsTo;
  }
  private Vessel myOriginatesFrom;
  private AnatomicalSystemOrAnatomicalStructure myRegionDrained;
  private Vessel myRunsTo;
}
