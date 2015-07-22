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
 * A medical study is an umbrella type covering all kinds of research studies relating to human medicine or health, including observational studies and interventional trials and registries, randomized, controlled or not. When the specific type of study is known, use one of the extensions of this type, such as MedicalTrial or MedicalObservationalStudy. Also, note that this type should be used to mark up data that describes the study itself; to tag an article that publishes the results of a study, use MedicalScholarlyArticle. Note: use the code property of MedicalEntity to store study IDs, e.g. clinicaltrials.gov ID.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class MedicalStudy extends MedicalEntity {
  /**
   * Expected or actual outcomes of the study.
   */
  public String getOutcome() {
    return myOutcome;
  }
  /**
   * Any characteristics of the population used in the study, e.g. 'males under 65'.
   */
  public String getPopulation() {
    return myPopulation;
  }
  /**
   * Sponsor of the study.
   */
  public Organization getSponsor() {
    return mySponsor;
  }
  /**
   * The status of the study (enumerated).
   */
  public MedicalStudyStatus getStatus() {
    return myStatus;
  }
  /**
   * The location in which the study is taking/took place.
   */
  public AdministrativeArea getStudyLocation() {
    return myStudyLocation;
  }
  /**
   * A subject of the study, i.e. one of the medical conditions, therapies, devices, drugs, etc. investigated by the study.
   */
  public MedicalEntity getStudySubject() {
    return myStudySubject;
  }
  /**
   * Builder for {@link MedicalStudy}
   */
  public static final class Builder {
    /**
     * Creates new {@link MedicalStudy} instance.
     */
    public MedicalStudy build() {
      return new MedicalStudy(status, recognizingAuthority, studyLocation, code, population, name, mainEntityOfPage, guideline, additionalType, sameAs, sponsor, url, alternateName, studySubject, study, potentialAction, description, relevantSpecialty, medicineSystem, outcome);
    }
    /**
     * The status of the study (enumerated).
     */
    public Builder status(MedicalStudyStatus medicalStudyStatus) {
      this.status = medicalStudyStatus;
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
     * The location in which the study is taking/took place.
     */
    public Builder studyLocation(AdministrativeArea administrativeArea) {
      this.studyLocation = administrativeArea;
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
     * Any characteristics of the population used in the study, e.g. 'males under 65'.
     */
    public Builder population(String population) {
      this.population = population;
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
     * Sponsor of the study.
     */
    public Builder sponsor(Organization organization) {
      this.sponsor = organization;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A subject of the study, i.e. one of the medical conditions, therapies, devices, drugs, etc. investigated by the study.
     */
    public Builder studySubject(MedicalEntity medicalEntity) {
      this.studySubject = medicalEntity;
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
     * Expected or actual outcomes of the study.
     */
    public Builder outcome(String outcome) {
      this.outcome = outcome;
      return this;
    }
    private MedicalStudyStatus status;
    private Organization recognizingAuthority;
    private AdministrativeArea studyLocation;
    private MedicalCode code;
    private String population;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private MedicalGuideline guideline;
    private String additionalType;
    private String sameAs;
    private Organization sponsor;
    private String url;
    private String alternateName;
    private MedicalEntity studySubject;
    private MedicalStudy study;
    private Action potentialAction;
    private String description;
    private MedicalSpecialty relevantSpecialty;
    private MedicineSystem medicineSystem;
    private String outcome;
  }

  protected MedicalStudy(MedicalStudyStatus status, Organization recognizingAuthority, AdministrativeArea studyLocation, MedicalCode code, String population, String name, StringOrCreativeWork mainEntityOfPage, MedicalGuideline guideline, String additionalType, String sameAs, Organization sponsor, String url, String alternateName, MedicalEntity studySubject, MedicalStudy study, Action potentialAction, String description, MedicalSpecialty relevantSpecialty, MedicineSystem medicineSystem, String outcome) {
    super(recognizingAuthority, code, name, mainEntityOfPage, guideline, url, sameAs, additionalType, alternateName, study, description, potentialAction, relevantSpecialty, medicineSystem);
    myOutcome = outcome;
    myPopulation = population;
    mySponsor = sponsor;
    myStatus = status;
    myStudyLocation = studyLocation;
    myStudySubject = studySubject;
  }
  private String myOutcome;
  private String myPopulation;
  private Organization mySponsor;
  private MedicalStudyStatus myStatus;
  private AdministrativeArea myStudyLocation;
  private MedicalEntity myStudySubject;
}
