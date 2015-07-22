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
 * A product taken by mouth that contains a dietary ingredient intended to supplement the diet. Dietary ingredients may include vitamins, minerals, herbs or other botanicals, amino acids, and substances such as enzymes, organ tissues, glandulars and metabolites.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class DietarySupplement extends MedicalTherapy {
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   */
  public String getActiveIngredient() {
    return myActiveIngredient;
  }
  /**
   * Descriptive information establishing a historical perspective on the supplement. May include the rationale for the name, the population where the supplement first came to prominence, etc.
   */
  public String getBackground() {
    return myBackground;
  }
  /**
   * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
   */
  public String getDosageForm() {
    return myDosageForm;
  }
  /**
   * True if this item's name is a proprietary/brand name (vs. generic name).
   */
  public Boolean getIsProprietary() {
    return myIsProprietary;
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  public DrugLegalStatus getLegalStatus() {
    return myLegalStatus;
  }
  /**
   * The manufacturer of the product.
   */
  public Organization getManufacturer() {
    return myManufacturer;
  }
  /**
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   */
  public MaximumDoseSchedule getMaximumIntake() {
    return myMaximumIntake;
  }
  /**
   * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
   */
  public String getMechanismOfAction() {
    return myMechanismOfAction;
  }
  /**
   * The generic name of this drug or supplement.
   */
  public String getNonProprietaryName() {
    return myNonProprietaryName;
  }
  /**
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   */
  public RecommendedDoseSchedule getRecommendedIntake() {
    return myRecommendedIntake;
  }
  /**
   * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
   */
  public String getSafetyConsideration() {
    return mySafetyConsideration;
  }
  /**
   * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
   */
  public String getTargetPopulation() {
    return myTargetPopulation;
  }
  /**
   * Builder for {@link DietarySupplement}
   */
  public static final class Builder {
    /**
     * Creates new {@link DietarySupplement} instance.
     */
    public DietarySupplement build() {
      return new DietarySupplement(safetyConsideration, recommendedIntake, recognizingAuthority, indication, code, activeIngredient, background, seriousAdverseOutcome, legalStatus, additionalType, sameAs, duplicateTherapy, nonProprietaryName, mechanismOfAction, manufacturer, study, potentialAction, relevantSpecialty, medicineSystem, maximumIntake, adverseOutcome, name, mainEntityOfPage, guideline, url, dosageForm, isProprietary, contraindication, alternateName, targetPopulation, description);
    }
    /**
     * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
     */
    public Builder safetyConsideration(String safetyConsideration) {
      this.safetyConsideration = safetyConsideration;
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    public Builder recommendedIntake(RecommendedDoseSchedule recommendedDoseSchedule) {
      this.recommendedIntake = recommendedDoseSchedule;
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
     * An active ingredient, typically chemical compounds and/or biologic substances.
     */
    public Builder activeIngredient(String activeIngredient) {
      this.activeIngredient = activeIngredient;
      return this;
    }
    /**
     * Descriptive information establishing a historical perspective on the supplement. May include the rationale for the name, the population where the supplement first came to prominence, etc.
     */
    public Builder background(String background) {
      this.background = background;
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
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    public Builder legalStatus(DrugLegalStatus drugLegalStatus) {
      this.legalStatus = drugLegalStatus;
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
     * A therapy that duplicates or overlaps this one.
     */
    public Builder duplicateTherapy(MedicalTherapy medicalTherapy) {
      this.duplicateTherapy = medicalTherapy;
      return this;
    }
    /**
     * The generic name of this drug or supplement.
     */
    public Builder nonProprietaryName(String nonProprietaryName) {
      this.nonProprietaryName = nonProprietaryName;
      return this;
    }
    /**
     * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
     */
    public Builder mechanismOfAction(String mechanismOfAction) {
      this.mechanismOfAction = mechanismOfAction;
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    public Builder manufacturer(Organization organization) {
      this.manufacturer = organization;
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
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    public Builder maximumIntake(MaximumDoseSchedule maximumDoseSchedule) {
      this.maximumIntake = maximumDoseSchedule;
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
     * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
     */
    public Builder dosageForm(String dosageForm) {
      this.dosageForm = dosageForm;
      return this;
    }
    /**
     * True if this item's name is a proprietary/brand name (vs. generic name).
     */
    public Builder isProprietary(Boolean isProprietary) {
      this.isProprietary = isProprietary;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
     */
    public Builder targetPopulation(String targetPopulation) {
      this.targetPopulation = targetPopulation;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
    private String safetyConsideration;
    private RecommendedDoseSchedule recommendedIntake;
    private Organization recognizingAuthority;
    private MedicalIndication indication;
    private MedicalCode code;
    private String activeIngredient;
    private String background;
    private MedicalEntity seriousAdverseOutcome;
    private DrugLegalStatus legalStatus;
    private String additionalType;
    private String sameAs;
    private MedicalTherapy duplicateTherapy;
    private String nonProprietaryName;
    private String mechanismOfAction;
    private Organization manufacturer;
    private MedicalStudy study;
    private Action potentialAction;
    private MedicalSpecialty relevantSpecialty;
    private MedicineSystem medicineSystem;
    private MaximumDoseSchedule maximumIntake;
    private MedicalEntity adverseOutcome;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private MedicalGuideline guideline;
    private String url;
    private String dosageForm;
    private Boolean isProprietary;
    private MedicalContraindication contraindication;
    private String alternateName;
    private String targetPopulation;
    private String description;
  }

  protected DietarySupplement(String safetyConsideration, RecommendedDoseSchedule recommendedIntake, Organization recognizingAuthority, MedicalIndication indication, MedicalCode code, String activeIngredient, String background, MedicalEntity seriousAdverseOutcome, DrugLegalStatus legalStatus, String additionalType, String sameAs, MedicalTherapy duplicateTherapy, String nonProprietaryName, String mechanismOfAction, Organization manufacturer, MedicalStudy study, Action potentialAction, MedicalSpecialty relevantSpecialty, MedicineSystem medicineSystem, MaximumDoseSchedule maximumIntake, MedicalEntity adverseOutcome, String name, StringOrCreativeWork mainEntityOfPage, MedicalGuideline guideline, String url, String dosageForm, Boolean isProprietary, MedicalContraindication contraindication, String alternateName, String targetPopulation, String description) {
    super(recognizingAuthority, indication, code, adverseOutcome, name, mainEntityOfPage, seriousAdverseOutcome, guideline, additionalType, url, sameAs, duplicateTherapy, alternateName, contraindication, study, potentialAction, description, relevantSpecialty, medicineSystem);
    myActiveIngredient = activeIngredient;
    myBackground = background;
    myDosageForm = dosageForm;
    myIsProprietary = isProprietary;
    myLegalStatus = legalStatus;
    myManufacturer = manufacturer;
    myMaximumIntake = maximumIntake;
    myMechanismOfAction = mechanismOfAction;
    myNonProprietaryName = nonProprietaryName;
    myRecommendedIntake = recommendedIntake;
    mySafetyConsideration = safetyConsideration;
    myTargetPopulation = targetPopulation;
  }
  private String myActiveIngredient;
  private String myBackground;
  private String myDosageForm;
  private Boolean myIsProprietary;
  private DrugLegalStatus myLegalStatus;
  private Organization myManufacturer;
  private MaximumDoseSchedule myMaximumIntake;
  private String myMechanismOfAction;
  private String myNonProprietaryName;
  private RecommendedDoseSchedule myRecommendedIntake;
  private String mySafetyConsideration;
  private String myTargetPopulation;
}
