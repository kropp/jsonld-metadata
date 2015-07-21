/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

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
   * Builder for {@see DietarySupplement}
   */
  public static final class Builder {
    public DietarySupplement build() {
      return new DietarySupplement(isProprietary, indication, adverseOutcome, potentialAction, additionalType, medicineSystem, mechanismOfAction, code, background, image, legalStatus, guideline, description, activeIngredient, maximumIntake, mainEntityOfPage, manufacturer, recommendedIntake, contraindication, safetyConsideration, alternateName, url, recognizingAuthority, sameAs, study, dosageForm, name, nonProprietaryName, duplicateTherapy, relevantSpecialty, seriousAdverseOutcome, targetPopulation);
    }
    /**
     * True if this item's name is a proprietary/brand name (vs. generic name).
     */
    public Builder isProprietary(Boolean value) {
      isProprietary = value;
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    public Builder indication(MedicalIndication value) {
      indication = value;
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    public Builder adverseOutcome(MedicalEntity value) {
      adverseOutcome = value;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    public Builder medicineSystem(MedicineSystem value) {
      medicineSystem = value;
      return this;
    }
    /**
     * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
     */
    public Builder mechanismOfAction(String value) {
      mechanismOfAction = value;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode value) {
      code = value;
      return this;
    }
    /**
     * Descriptive information establishing a historical perspective on the supplement. May include the rationale for the name, the population where the supplement first came to prominence, etc.
     */
    public Builder background(String value) {
      background = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    public Builder legalStatus(DrugLegalStatus value) {
      legalStatus = value;
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    public Builder guideline(MedicalGuideline value) {
      guideline = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     */
    public Builder activeIngredient(String value) {
      activeIngredient = value;
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    public Builder maximumIntake(MaximumDoseSchedule value) {
      maximumIntake = value;
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
    public Builder mainEntityOfPage(CreativeWork value) {
      mainEntityOfPage = value;
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    public Builder manufacturer(Organization value) {
      manufacturer = value;
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    public Builder recommendedIntake(RecommendedDoseSchedule value) {
      recommendedIntake = value;
      return this;
    }
    /**
     * A contraindication for this therapy.
     */
    public Builder contraindication(MedicalContraindication value) {
      contraindication = value;
      return this;
    }
    /**
     * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
     */
    public Builder safetyConsideration(String value) {
      safetyConsideration = value;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization value) {
      recognizingAuthority = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    public Builder study(MedicalStudy value) {
      study = value;
      return this;
    }
    /**
     * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
     */
    public Builder dosageForm(String value) {
      dosageForm = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    /**
     * The generic name of this drug or supplement.
     */
    public Builder nonProprietaryName(String value) {
      nonProprietaryName = value;
      return this;
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    public Builder duplicateTherapy(MedicalTherapy value) {
      duplicateTherapy = value;
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    public Builder relevantSpecialty(MedicalSpecialty value) {
      relevantSpecialty = value;
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    public Builder seriousAdverseOutcome(MedicalEntity value) {
      seriousAdverseOutcome = value;
      return this;
    }
    /**
     * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
     */
    public Builder targetPopulation(String value) {
      targetPopulation = value;
      return this;
    }
    private Boolean isProprietary;
    private MedicalIndication indication;
    private MedicalEntity adverseOutcome;
    private Action potentialAction;
    private String additionalType;
    private MedicineSystem medicineSystem;
    private String mechanismOfAction;
    private MedicalCode code;
    private String background;
    private Image image;
    private DrugLegalStatus legalStatus;
    private MedicalGuideline guideline;
    private String description;
    private String activeIngredient;
    private MaximumDoseSchedule maximumIntake;
    private CreativeWork mainEntityOfPage;
    private Organization manufacturer;
    private RecommendedDoseSchedule recommendedIntake;
    private MedicalContraindication contraindication;
    private String safetyConsideration;
    private String alternateName;
    private String url;
    private Organization recognizingAuthority;
    private String sameAs;
    private MedicalStudy study;
    private String dosageForm;
    private String name;
    private String nonProprietaryName;
    private MedicalTherapy duplicateTherapy;
    private MedicalSpecialty relevantSpecialty;
    private MedicalEntity seriousAdverseOutcome;
    private String targetPopulation;
  }

  protected DietarySupplement(Boolean isProprietary, MedicalIndication indication, MedicalEntity adverseOutcome, Action potentialAction, String additionalType, MedicineSystem medicineSystem, String mechanismOfAction, MedicalCode code, String background, Image image, DrugLegalStatus legalStatus, MedicalGuideline guideline, String description, String activeIngredient, MaximumDoseSchedule maximumIntake, CreativeWork mainEntityOfPage, Organization manufacturer, RecommendedDoseSchedule recommendedIntake, MedicalContraindication contraindication, String safetyConsideration, String alternateName, String url, Organization recognizingAuthority, String sameAs, MedicalStudy study, String dosageForm, String name, String nonProprietaryName, MedicalTherapy duplicateTherapy, MedicalSpecialty relevantSpecialty, MedicalEntity seriousAdverseOutcome, String targetPopulation) {
    super(indication, adverseOutcome, mainEntityOfPage, contraindication, potentialAction, alternateName, additionalType, url, medicineSystem, recognizingAuthority, sameAs, code, study, image, name, relevantSpecialty, duplicateTherapy, seriousAdverseOutcome, guideline, description);
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
