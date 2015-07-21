/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class Drug extends MedicalTherapy {
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   */
  public String getActiveIngredient() {
    return myActiveIngredient;
  }
  /**
   * A route by which this drug may be administered, e.g. 'oral'.
   */
  public String getAdministrationRoute() {
    return myAdministrationRoute;
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
   */
  public String getAlcoholWarning() {
    return myAlcoholWarning;
  }
  /**
   * An available dosage strength for the drug.
   */
  public DrugStrength getAvailableStrength() {
    return myAvailableStrength;
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
   */
  public String getBreastfeedingWarning() {
    return myBreastfeedingWarning;
  }
  /**
   * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
   */
  public String getClinicalPharmacology() {
    return myClinicalPharmacology;
  }
  /**
   * Cost per unit of the drug, as reported by the source being tagged.
   */
  public DrugCost getCost() {
    return myCost;
  }
  /**
   * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
   */
  public String getDosageForm() {
    return myDosageForm;
  }
  /**
   * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
   */
  public DoseSchedule getDoseSchedule() {
    return myDoseSchedule;
  }
  /**
   * The class of drug this belongs to (e.g., statins).
   */
  public DrugClass getDrugClass() {
    return myDrugClass;
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
   */
  public String getFoodWarning() {
    return myFoodWarning;
  }
  /**
   * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
   */
  public Drug getInteractingDrug() {
    return myInteractingDrug;
  }
  /**
   * True if the drug is available in a generic form (regardless of name).
   */
  public Boolean getIsAvailableGenerically() {
    return myIsAvailableGenerically;
  }
  /**
   * True if this item's name is a proprietary/brand name (vs. generic name).
   */
  public Boolean getIsProprietary() {
    return myIsProprietary;
  }
  /**
   * Link to the drug's label details.
   */
  public String getLabelDetails() {
    return myLabelDetails;
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
   * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
   */
  public String getOverdosage() {
    return myOverdosage;
  }
  /**
   * Pregnancy category of this drug.
   */
  public DrugPregnancyCategory getPregnancyCategory() {
    return myPregnancyCategory;
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
   */
  public String getPregnancyWarning() {
    return myPregnancyWarning;
  }
  /**
   * Link to prescribing information for the drug.
   */
  public String getPrescribingInfo() {
    return myPrescribingInfo;
  }
  /**
   * Indicates whether this drug is available by prescription or over-the-counter.
   */
  public DrugPrescriptionStatus getPrescriptionStatus() {
    return myPrescriptionStatus;
  }
  /**
   * Any other drug related to this one, for example commonly-prescribed alternatives.
   */
  public Drug getRelatedDrug() {
    return myRelatedDrug;
  }
  /**
   * Any FDA or other warnings about the drug (text or URL).
   */
  public String getWarning() {
    return myWarning;
  }
  /**
   * Builder for {@see Drug}
   */
  public static final class Builder {
    public Drug build() {
      return new Drug(isProprietary, indication, alcoholWarning, adverseOutcome, foodWarning, potentialAction, breastfeedingWarning, additionalType, medicineSystem, code, prescribingInfo, mechanismOfAction, warning, image, administrationRoute, legalStatus, relatedDrug, guideline, labelDetails, isAvailableGenerically, description, activeIngredient, mainEntityOfPage, doseSchedule, manufacturer, contraindication, availableStrength, alternateName, pregnancyWarning, pregnancyCategory, url, interactingDrug, sameAs, recognizingAuthority, study, prescriptionStatus, cost, dosageForm, clinicalPharmacology, name, nonProprietaryName, duplicateTherapy, relevantSpecialty, seriousAdverseOutcome, drugClass, overdosage);
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
     * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
     */
    public Builder alcoholWarning(String value) {
      alcoholWarning = value;
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
     * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
     */
    public Builder foodWarning(String value) {
      foodWarning = value;
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
     * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
     */
    public Builder breastfeedingWarning(String value) {
      breastfeedingWarning = value;
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
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode value) {
      code = value;
      return this;
    }
    /**
     * Link to prescribing information for the drug.
     */
    public Builder prescribingInfo(String value) {
      prescribingInfo = value;
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
     * Any FDA or other warnings about the drug (text or URL).
     */
    public Builder warning(String value) {
      warning = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * A route by which this drug may be administered, e.g. 'oral'.
     */
    public Builder administrationRoute(String value) {
      administrationRoute = value;
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
     * Any other drug related to this one, for example commonly-prescribed alternatives.
     */
    public Builder relatedDrug(Drug value) {
      relatedDrug = value;
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
     * Link to the drug's label details.
     */
    public Builder labelDetails(String value) {
      labelDetails = value;
      return this;
    }
    /**
     * True if the drug is available in a generic form (regardless of name).
     */
    public Builder isAvailableGenerically(Boolean value) {
      isAvailableGenerically = value;
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
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     */
    public Builder doseSchedule(DoseSchedule value) {
      doseSchedule = value;
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
     * A contraindication for this therapy.
     */
    public Builder contraindication(MedicalContraindication value) {
      contraindication = value;
      return this;
    }
    /**
     * An available dosage strength for the drug.
     */
    public Builder availableStrength(DrugStrength value) {
      availableStrength = value;
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
     * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
     */
    public Builder pregnancyWarning(String value) {
      pregnancyWarning = value;
      return this;
    }
    /**
     * Pregnancy category of this drug.
     */
    public Builder pregnancyCategory(DrugPregnancyCategory value) {
      pregnancyCategory = value;
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
     * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
     */
    public Builder interactingDrug(Drug value) {
      interactingDrug = value;
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
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization value) {
      recognizingAuthority = value;
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
     * Indicates whether this drug is available by prescription or over-the-counter.
     */
    public Builder prescriptionStatus(DrugPrescriptionStatus value) {
      prescriptionStatus = value;
      return this;
    }
    /**
     * Cost per unit of the drug, as reported by the source being tagged.
     */
    public Builder cost(DrugCost value) {
      cost = value;
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
     * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
     */
    public Builder clinicalPharmacology(String value) {
      clinicalPharmacology = value;
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
     * The class of drug this belongs to (e.g., statins).
     */
    public Builder drugClass(DrugClass value) {
      drugClass = value;
      return this;
    }
    /**
     * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
     */
    public Builder overdosage(String value) {
      overdosage = value;
      return this;
    }
    private Boolean isProprietary;
    private MedicalIndication indication;
    private String alcoholWarning;
    private MedicalEntity adverseOutcome;
    private String foodWarning;
    private Action potentialAction;
    private String breastfeedingWarning;
    private String additionalType;
    private MedicineSystem medicineSystem;
    private MedicalCode code;
    private String prescribingInfo;
    private String mechanismOfAction;
    private String warning;
    private Image image;
    private String administrationRoute;
    private DrugLegalStatus legalStatus;
    private Drug relatedDrug;
    private MedicalGuideline guideline;
    private String labelDetails;
    private Boolean isAvailableGenerically;
    private String description;
    private String activeIngredient;
    private CreativeWork mainEntityOfPage;
    private DoseSchedule doseSchedule;
    private Organization manufacturer;
    private MedicalContraindication contraindication;
    private DrugStrength availableStrength;
    private String alternateName;
    private String pregnancyWarning;
    private DrugPregnancyCategory pregnancyCategory;
    private String url;
    private Drug interactingDrug;
    private String sameAs;
    private Organization recognizingAuthority;
    private MedicalStudy study;
    private DrugPrescriptionStatus prescriptionStatus;
    private DrugCost cost;
    private String dosageForm;
    private String clinicalPharmacology;
    private String name;
    private String nonProprietaryName;
    private MedicalTherapy duplicateTherapy;
    private MedicalSpecialty relevantSpecialty;
    private MedicalEntity seriousAdverseOutcome;
    private DrugClass drugClass;
    private String overdosage;
  }

  protected Drug(Boolean isProprietary, MedicalIndication indication, String alcoholWarning, MedicalEntity adverseOutcome, String foodWarning, Action potentialAction, String breastfeedingWarning, String additionalType, MedicineSystem medicineSystem, MedicalCode code, String prescribingInfo, String mechanismOfAction, String warning, Image image, String administrationRoute, DrugLegalStatus legalStatus, Drug relatedDrug, MedicalGuideline guideline, String labelDetails, Boolean isAvailableGenerically, String description, String activeIngredient, CreativeWork mainEntityOfPage, DoseSchedule doseSchedule, Organization manufacturer, MedicalContraindication contraindication, DrugStrength availableStrength, String alternateName, String pregnancyWarning, DrugPregnancyCategory pregnancyCategory, String url, Drug interactingDrug, String sameAs, Organization recognizingAuthority, MedicalStudy study, DrugPrescriptionStatus prescriptionStatus, DrugCost cost, String dosageForm, String clinicalPharmacology, String name, String nonProprietaryName, MedicalTherapy duplicateTherapy, MedicalSpecialty relevantSpecialty, MedicalEntity seriousAdverseOutcome, DrugClass drugClass, String overdosage) {
    super(indication, adverseOutcome, mainEntityOfPage, contraindication, potentialAction, alternateName, additionalType, url, medicineSystem, recognizingAuthority, sameAs, code, study, image, name, relevantSpecialty, duplicateTherapy, seriousAdverseOutcome, guideline, description);
    myActiveIngredient = activeIngredient;
    myAdministrationRoute = administrationRoute;
    myAlcoholWarning = alcoholWarning;
    myAvailableStrength = availableStrength;
    myBreastfeedingWarning = breastfeedingWarning;
    myClinicalPharmacology = clinicalPharmacology;
    myCost = cost;
    myDosageForm = dosageForm;
    myDoseSchedule = doseSchedule;
    myDrugClass = drugClass;
    myFoodWarning = foodWarning;
    myInteractingDrug = interactingDrug;
    myIsAvailableGenerically = isAvailableGenerically;
    myIsProprietary = isProprietary;
    myLabelDetails = labelDetails;
    myLegalStatus = legalStatus;
    myManufacturer = manufacturer;
    myMechanismOfAction = mechanismOfAction;
    myNonProprietaryName = nonProprietaryName;
    myOverdosage = overdosage;
    myPregnancyCategory = pregnancyCategory;
    myPregnancyWarning = pregnancyWarning;
    myPrescribingInfo = prescribingInfo;
    myPrescriptionStatus = prescriptionStatus;
    myRelatedDrug = relatedDrug;
    myWarning = warning;
  }
  private String myActiveIngredient;
  private String myAdministrationRoute;
  private String myAlcoholWarning;
  private DrugStrength myAvailableStrength;
  private String myBreastfeedingWarning;
  private String myClinicalPharmacology;
  private DrugCost myCost;
  private String myDosageForm;
  private DoseSchedule myDoseSchedule;
  private DrugClass myDrugClass;
  private String myFoodWarning;
  private Drug myInteractingDrug;
  private Boolean myIsAvailableGenerically;
  private Boolean myIsProprietary;
  private String myLabelDetails;
  private DrugLegalStatus myLegalStatus;
  private Organization myManufacturer;
  private String myMechanismOfAction;
  private String myNonProprietaryName;
  private String myOverdosage;
  private DrugPregnancyCategory myPregnancyCategory;
  private String myPregnancyWarning;
  private String myPrescribingInfo;
  private DrugPrescriptionStatus myPrescriptionStatus;
  private Drug myRelatedDrug;
  private String myWarning;
}
