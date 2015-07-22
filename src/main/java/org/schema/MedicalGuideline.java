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
 * Any recommendation made by a standard society (e.g. ACC/AHA) or consensus statement that denotes how to diagnose and treat a particular condition. Note: this type should be used to tag the actual guideline recommendation; if the guideline recommendation occurs in a larger scholarly article, use MedicalScholarlyArticle to tag the overall article, not this type. Note also: the organization making the recommendation should be captured in the recognizingAuthority base property of MedicalEntity.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class MedicalGuideline extends MedicalEntity {
  /**
   * Strength of evidence of the data used to formulate the guideline (enumerated).
   */
  public MedicalEvidenceLevel getEvidenceLevel() {
    return myEvidenceLevel;
  }
  /**
   * Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc.
   */
  public String getEvidenceOrigin() {
    return myEvidenceOrigin;
  }
  /**
   * Date on which this guideline's recommendation was made.
   */
  public java.util.Date getGuidelineDate() {
    return myGuidelineDate;
  }
  /**
   * The medical conditions, treatments, etc. that are the subject of the guideline.
   */
  public MedicalEntity getGuidelineSubject() {
    return myGuidelineSubject;
  }
  /**
   * Builder for {@link MedicalGuideline}
   */
  public static final class Builder {
    /**
     * Creates new {@link MedicalGuideline} instance.
     */
    public MedicalGuideline build() {
      return new MedicalGuideline(recognizingAuthority, code, evidenceLevel, name, mainEntityOfPage, guideline, url, sameAs, additionalType, alternateName, study, potentialAction, description, relevantSpecialty, medicineSystem, guidelineSubject, guidelineDate, evidenceOrigin);
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
     * Strength of evidence of the data used to formulate the guideline (enumerated).
     */
    public Builder evidenceLevel(MedicalEvidenceLevel medicalEvidenceLevel) {
      this.evidenceLevel = medicalEvidenceLevel;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
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
     * The medical conditions, treatments, etc. that are the subject of the guideline.
     */
    public Builder guidelineSubject(MedicalEntity medicalEntity) {
      this.guidelineSubject = medicalEntity;
      return this;
    }
    /**
     * Date on which this guideline's recommendation was made.
     */
    public Builder guidelineDate(java.util.Date date) {
      this.guidelineDate = date;
      return this;
    }
    /**
     * Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc.
     */
    public Builder evidenceOrigin(String evidenceOrigin) {
      this.evidenceOrigin = evidenceOrigin;
      return this;
    }
    private Organization recognizingAuthority;
    private MedicalCode code;
    private MedicalEvidenceLevel evidenceLevel;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private MedicalGuideline guideline;
    private String url;
    private String sameAs;
    private String additionalType;
    private String alternateName;
    private MedicalStudy study;
    private Action potentialAction;
    private String description;
    private MedicalSpecialty relevantSpecialty;
    private MedicineSystem medicineSystem;
    private MedicalEntity guidelineSubject;
    private java.util.Date guidelineDate;
    private String evidenceOrigin;
  }

  protected MedicalGuideline(Organization recognizingAuthority, MedicalCode code, MedicalEvidenceLevel evidenceLevel, String name, StringOrCreativeWork mainEntityOfPage, MedicalGuideline guideline, String url, String sameAs, String additionalType, String alternateName, MedicalStudy study, Action potentialAction, String description, MedicalSpecialty relevantSpecialty, MedicineSystem medicineSystem, MedicalEntity guidelineSubject, java.util.Date guidelineDate, String evidenceOrigin) {
    super(recognizingAuthority, code, name, mainEntityOfPage, guideline, url, sameAs, additionalType, alternateName, study, description, potentialAction, relevantSpecialty, medicineSystem);
    myEvidenceLevel = evidenceLevel;
    myEvidenceOrigin = evidenceOrigin;
    myGuidelineDate = guidelineDate;
    myGuidelineSubject = guidelineSubject;
  }
  private MedicalEvidenceLevel myEvidenceLevel;
  private String myEvidenceOrigin;
  private java.util.Date myGuidelineDate;
  private MedicalEntity myGuidelineSubject;
}
