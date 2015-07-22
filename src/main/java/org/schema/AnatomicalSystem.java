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
 * An anatomical system is a group of anatomical structures that work together to perform a certain task. Anatomical systems, such as organ systems, are one organizing principle of anatomy, and can includes circulatory, digestive, endocrine, integumentary, immune, lymphatic, muscular, nervous, reproductive, respiratory, skeletal, urinary, vestibular, and other systems.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class AnatomicalSystem extends MedicalEntity {
  /**
   * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
   */
  public String getAssociatedPathophysiology() {
    return myAssociatedPathophysiology;
  }
  /**
   * The underlying anatomical structures, such as organs, that comprise the anatomical system.
   */
  public AnatomicalSystemOrAnatomicalStructure getComprisedOf() {
    return myComprisedOf;
  }
  /**
   * A medical condition associated with this anatomy.
   */
  public MedicalCondition getRelatedCondition() {
    return myRelatedCondition;
  }
  /**
   * Related anatomical structure(s) that are not part of the system but relate or connect to it, such as vascular bundles associated with an organ system.
   */
  public AnatomicalStructure getRelatedStructure() {
    return myRelatedStructure;
  }
  /**
   * A medical therapy related to this anatomy.
   */
  public MedicalTherapy getRelatedTherapy() {
    return myRelatedTherapy;
  }
  /**
   * Builder for {@link AnatomicalSystem}
   */
  public static final class Builder {
    /**
     * Creates new {@link AnatomicalSystem} instance.
     */
    public AnatomicalSystem build() {
      return new AnatomicalSystem(recognizingAuthority, code, relatedTherapy, name, mainEntityOfPage, relatedStructure, guideline, additionalType, url, sameAs, relatedCondition, alternateName, associatedPathophysiology, study, potentialAction, description, relevantSpecialty, medicineSystem, comprisedOf);
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
     * A medical therapy related to this anatomy.
     */
    public Builder relatedTherapy(MedicalTherapy medicalTherapy) {
      this.relatedTherapy = medicalTherapy;
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
     * Related anatomical structure(s) that are not part of the system but relate or connect to it, such as vascular bundles associated with an organ system.
     */
    public Builder relatedStructure(AnatomicalStructure anatomicalStructure) {
      this.relatedStructure = anatomicalStructure;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
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
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
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
     * The underlying anatomical structures, such as organs, that comprise the anatomical system.
     */
    public Builder comprisedOf(AnatomicalSystem anatomicalSystem) {
      this.comprisedOf.setAnatomicalSystem(anatomicalSystem);
      return this;
    }
    /**
     * The underlying anatomical structures, such as organs, that comprise the anatomical system.
     */
    public Builder comprisedOf(AnatomicalStructure anatomicalStructure) {
      this.comprisedOf.setAnatomicalStructure(anatomicalStructure);
      return this;
    }
    private Organization recognizingAuthority;
    private MedicalCode code;
    private MedicalTherapy relatedTherapy;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private AnatomicalStructure relatedStructure;
    private MedicalGuideline guideline;
    private String additionalType;
    private String url;
    private String sameAs;
    private MedicalCondition relatedCondition;
    private String alternateName;
    private String associatedPathophysiology;
    private MedicalStudy study;
    private Action potentialAction;
    private String description;
    private MedicalSpecialty relevantSpecialty;
    private MedicineSystem medicineSystem;
    private AnatomicalSystemOrAnatomicalStructure comprisedOf;
  }

  protected AnatomicalSystem(Organization recognizingAuthority, MedicalCode code, MedicalTherapy relatedTherapy, String name, StringOrCreativeWork mainEntityOfPage, AnatomicalStructure relatedStructure, MedicalGuideline guideline, String additionalType, String url, String sameAs, MedicalCondition relatedCondition, String alternateName, String associatedPathophysiology, MedicalStudy study, Action potentialAction, String description, MedicalSpecialty relevantSpecialty, MedicineSystem medicineSystem, AnatomicalSystemOrAnatomicalStructure comprisedOf) {
    super(recognizingAuthority, code, name, mainEntityOfPage, guideline, url, sameAs, additionalType, alternateName, study, description, potentialAction, relevantSpecialty, medicineSystem);
    myAssociatedPathophysiology = associatedPathophysiology;
    myComprisedOf = comprisedOf;
    myRelatedCondition = relatedCondition;
    myRelatedStructure = relatedStructure;
    myRelatedTherapy = relatedTherapy;
  }
  private String myAssociatedPathophysiology;
  private AnatomicalSystemOrAnatomicalStructure myComprisedOf;
  private MedicalCondition myRelatedCondition;
  private AnatomicalStructure myRelatedStructure;
  private MedicalTherapy myRelatedTherapy;
}
