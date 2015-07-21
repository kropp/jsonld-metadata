/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

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
  public Organization getEndorsers() {
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
   * Builder for {@see Diet}
   */
  public static final class Builder {
    public Diet build() {
      return new Diet(indication, overview, adverseOutcome, mainEntityOfPage, risks, contraindication, potentialAction, alternateName, url, additionalType, medicineSystem, sameAs, recognizingAuthority, code, study, expertConsiderations, proprietaryName, dietFeatures, endorsers, image, name, relevantSpecialty, duplicateTherapy, seriousAdverseOutcome, guideline, physiologicalBenefits, description);
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    public Builder indication(MedicalIndication value) {
      indication = value;
      return this;
    }
    /**
     * Descriptive information establishing the overarching theory/philosophy of the plan. May include the rationale for the name, the population where the plan first came to prominence, etc.
     */
    public Builder overview(String value) {
      overview = value;
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
     * Specific physiologic risks associated to the plan.
     */
    public Builder risks(String value) {
      risks = value;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
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
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode value) {
      code = value;
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
     * Medical expert advice related to the plan.
     */
    public Builder expertConsiderations(String value) {
      expertConsiderations = value;
      return this;
    }
    /**
     * Proprietary name given to the diet plan, typically by its originator or creator.
     */
    public Builder proprietaryName(String value) {
      proprietaryName = value;
      return this;
    }
    /**
     * Nutritional information specific to the dietary plan. May include dietary recommendations on what foods to avoid, what foods to consume, and specific alterations/deviations from the USDA or other regulatory body's approved dietary guidelines.
     */
    public Builder dietFeatures(String value) {
      dietFeatures = value;
      return this;
    }
    /**
     * People or organizations that endorse the plan.
     */
    public Builder endorsers(Organization value) {
      endorsers = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
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
     * If applicable, a medical specialty in which this entity is relevant.
     */
    public Builder relevantSpecialty(MedicalSpecialty value) {
      relevantSpecialty = value;
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
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    public Builder seriousAdverseOutcome(MedicalEntity value) {
      seriousAdverseOutcome = value;
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
     * Specific physiologic benefits associated to the plan.
     */
    public Builder physiologicalBenefits(String value) {
      physiologicalBenefits = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    private MedicalIndication indication;
    private String overview;
    private MedicalEntity adverseOutcome;
    private CreativeWork mainEntityOfPage;
    private String risks;
    private MedicalContraindication contraindication;
    private Action potentialAction;
    private String alternateName;
    private String url;
    private String additionalType;
    private MedicineSystem medicineSystem;
    private String sameAs;
    private Organization recognizingAuthority;
    private MedicalCode code;
    private MedicalStudy study;
    private String expertConsiderations;
    private String proprietaryName;
    private String dietFeatures;
    private Organization endorsers;
    private Image image;
    private String name;
    private MedicalSpecialty relevantSpecialty;
    private MedicalTherapy duplicateTherapy;
    private MedicalEntity seriousAdverseOutcome;
    private MedicalGuideline guideline;
    private String physiologicalBenefits;
    private String description;
  }

  protected Diet(MedicalIndication indication, String overview, MedicalEntity adverseOutcome, CreativeWork mainEntityOfPage, String risks, MedicalContraindication contraindication, Action potentialAction, String alternateName, String url, String additionalType, MedicineSystem medicineSystem, String sameAs, Organization recognizingAuthority, MedicalCode code, MedicalStudy study, String expertConsiderations, String proprietaryName, String dietFeatures, Organization endorsers, Image image, String name, MedicalSpecialty relevantSpecialty, MedicalTherapy duplicateTherapy, MedicalEntity seriousAdverseOutcome, MedicalGuideline guideline, String physiologicalBenefits, String description) {
    super(indication, adverseOutcome, mainEntityOfPage, contraindication, alternateName, potentialAction, additionalType, url, medicineSystem, recognizingAuthority, sameAs, study, code, name, image, duplicateTherapy, relevantSpecialty, seriousAdverseOutcome, guideline, description);
    myDietFeatures = dietFeatures;
    myEndorsers = endorsers;
    myExpertConsiderations = expertConsiderations;
    myOverview = overview;
    myPhysiologicalBenefits = physiologicalBenefits;
    myProprietaryName = proprietaryName;
    myRisks = risks;
  }
  private String myDietFeatures;
  private Organization myEndorsers;
  private String myExpertConsiderations;
  private String myOverview;
  private String myPhysiologicalBenefits;
  private String myProprietaryName;
  private String myRisks;
}
