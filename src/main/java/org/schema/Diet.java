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
 * A strategy of regulating the intake of food to achieve or maintain a specific health-related goal.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class Diet extends LifestyleModification {
  /**
   * Nutritional information specific to the dietary plan. May include dietary recommendations on what foods to avoid, what foods to consume, and specific alterations/deviations from the USDA or other regulatory body's approved dietary guidelines.
   */
  public String getDietFeatures() {
    return myDietFeatures;
  }
  /**
   * People or organizations that endorse the plan.
   */
  public OrganizationOrPerson getEndorsers() {
    return myEndorsers;
  }
  /**
   * Medical expert advice related to the plan.
   */
  public String getExpertConsiderations() {
    return myExpertConsiderations;
  }
  /**
   * Descriptive information establishing the overarching theory/philosophy of the plan. May include the rationale for the name, the population where the plan first came to prominence, etc.
   */
  public String getOverview() {
    return myOverview;
  }
  /**
   * Specific physiologic benefits associated to the plan.
   */
  public String getPhysiologicalBenefits() {
    return myPhysiologicalBenefits;
  }
  /**
   * Proprietary name given to the diet plan, typically by its originator or creator.
   */
  public String getProprietaryName() {
    return myProprietaryName;
  }
  /**
   * Specific physiologic risks associated to the plan.
   */
  public String getRisks() {
    return myRisks;
  }
  /**
   * Builder for {@link Diet}
   */
  public static final class Builder {
    /**
     * Creates new {@link Diet} instance.
     */
    public Diet build() {
      return new Diet(proprietaryName, recognizingAuthority, risks, indication, code, expertConsiderations, name, adverseOutcome, mainEntityOfPage, guideline, seriousAdverseOutcome, sameAs, url, additionalType, duplicateTherapy, physiologicalBenefits, alternateName, contraindication, study, endorsers, overview, potentialAction, description, relevantSpecialty, medicineSystem, dietFeatures);
    }
    /**
     * Proprietary name given to the diet plan, typically by its originator or creator.
     */
    public Builder proprietaryName(String proprietaryName) {
      this.proprietaryName = proprietaryName;
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
     * Specific physiologic risks associated to the plan.
     */
    public Builder risks(String risks) {
      this.risks = risks;
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    public Builder indication(MedicalIndication medicalIndication) {
      this.indication = medicalIndication;
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
     * Medical expert advice related to the plan.
     */
    public Builder expertConsiderations(String expertConsiderations) {
      this.expertConsiderations = expertConsiderations;
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
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    public Builder adverseOutcome(MedicalEntity medicalEntity) {
      this.adverseOutcome = medicalEntity;
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
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    public Builder seriousAdverseOutcome(MedicalEntity medicalEntity) {
      this.seriousAdverseOutcome = medicalEntity;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    public Builder duplicateTherapy(MedicalTherapy medicalTherapy) {
      this.duplicateTherapy = medicalTherapy;
      return this;
    }
    /**
     * Specific physiologic benefits associated to the plan.
     */
    public Builder physiologicalBenefits(String physiologicalBenefits) {
      this.physiologicalBenefits = physiologicalBenefits;
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
     * A contraindication for this therapy.
     */
    public Builder contraindication(MedicalContraindication medicalContraindication) {
      this.contraindication = medicalContraindication;
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
     * People or organizations that endorse the plan.
     */
    public Builder endorsers(Organization organization) {
      this.endorsers.setOrganization(organization);
      return this;
    }
    /**
     * People or organizations that endorse the plan.
     */
    public Builder endorsers(Person person) {
      this.endorsers.setPerson(person);
      return this;
    }
    /**
     * Descriptive information establishing the overarching theory/philosophy of the plan. May include the rationale for the name, the population where the plan first came to prominence, etc.
     */
    public Builder overview(String overview) {
      this.overview = overview;
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
     * Nutritional information specific to the dietary plan. May include dietary recommendations on what foods to avoid, what foods to consume, and specific alterations/deviations from the USDA or other regulatory body's approved dietary guidelines.
     */
    public Builder dietFeatures(String dietFeatures) {
      this.dietFeatures = dietFeatures;
      return this;
    }
    private String proprietaryName;
    private Organization recognizingAuthority;
    private String risks;
    private MedicalIndication indication;
    private MedicalCode code;
    private String expertConsiderations;
    private String name;
    private MedicalEntity adverseOutcome;
    private StringOrCreativeWork mainEntityOfPage;
    private MedicalGuideline guideline;
    private MedicalEntity seriousAdverseOutcome;
    private String sameAs;
    private String url;
    private String additionalType;
    private MedicalTherapy duplicateTherapy;
    private String physiologicalBenefits;
    private String alternateName;
    private MedicalContraindication contraindication;
    private MedicalStudy study;
    private OrganizationOrPerson endorsers;
    private String overview;
    private Action potentialAction;
    private String description;
    private MedicalSpecialty relevantSpecialty;
    private MedicineSystem medicineSystem;
    private String dietFeatures;
  }

  protected Diet(String proprietaryName, Organization recognizingAuthority, String risks, MedicalIndication indication, MedicalCode code, String expertConsiderations, String name, MedicalEntity adverseOutcome, StringOrCreativeWork mainEntityOfPage, MedicalGuideline guideline, MedicalEntity seriousAdverseOutcome, String sameAs, String url, String additionalType, MedicalTherapy duplicateTherapy, String physiologicalBenefits, String alternateName, MedicalContraindication contraindication, MedicalStudy study, OrganizationOrPerson endorsers, String overview, Action potentialAction, String description, MedicalSpecialty relevantSpecialty, MedicineSystem medicineSystem, String dietFeatures) {
    super(recognizingAuthority, indication, code, name, adverseOutcome, mainEntityOfPage, seriousAdverseOutcome, guideline, additionalType, url, sameAs, duplicateTherapy, contraindication, alternateName, study, description, potentialAction, relevantSpecialty, medicineSystem);
    myDietFeatures = dietFeatures;
    myEndorsers = endorsers;
    myExpertConsiderations = expertConsiderations;
    myOverview = overview;
    myPhysiologicalBenefits = physiologicalBenefits;
    myProprietaryName = proprietaryName;
    myRisks = risks;
  }
  private String myDietFeatures;
  private OrganizationOrPerson myEndorsers;
  private String myExpertConsiderations;
  private String myOverview;
  private String myPhysiologicalBenefits;
  private String myProprietaryName;
  private String myRisks;
}
