/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class MedicalCondition extends MedicalEntity {
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  public AnatomicalStructure getAssociatedAnatomy() {
    return myAssociatedAnatomy;
  }
  /**
   * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
   */
  public MedicalCause getCause() {
    return myCause;
  }
  /**
   * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
   */
  public DDxElement getDifferentialDiagnosis() {
    return myDifferentialDiagnosis;
  }
  /**
   * The characteristics of associated patients, such as age, gender, race etc.
   */
  public String getEpidemiology() {
    return myEpidemiology;
  }
  /**
   * The likely outcome in either the short term or long term of the medical condition.
   */
  public String getExpectedPrognosis() {
    return myExpectedPrognosis;
  }
  /**
   * The expected progression of the condition if it is not treated and allowed to progress naturally.
   */
  public String getNaturalProgression() {
    return myNaturalProgression;
  }
  /**
   * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
   */
  public String getPathophysiology() {
    return myPathophysiology;
  }
  /**
   * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
   */
  public String getPossibleComplication() {
    return myPossibleComplication;
  }
  /**
   * A possible treatment to address this condition, sign or symptom.
   */
  public MedicalTherapy getPossibleTreatment() {
    return myPossibleTreatment;
  }
  /**
   * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
   */
  public MedicalTherapy getPrimaryPrevention() {
    return myPrimaryPrevention;
  }
  /**
   * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
   */
  public MedicalRiskFactor getRiskFactor() {
    return myRiskFactor;
  }
  /**
   * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
   */
  public MedicalTherapy getSecondaryPrevention() {
    return mySecondaryPrevention;
  }
  /**
   * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
   */
  public MedicalSignOrSymptom getSignOrSymptom() {
    return mySignOrSymptom;
  }
  /**
   * The stage of the condition, if applicable.
   */
  public MedicalConditionStage getStage() {
    return myStage;
  }
  /**
   * A more specific type of the condition, where applicable, for example 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.
   */
  public String getSubtype() {
    return mySubtype;
  }
  /**
   * A medical test typically performed given this condition.
   */
  public MedicalTest getTypicalTest() {
    return myTypicalTest;
  }
  /**
   * Builder for {@see MedicalCondition}
   */
  public static final class Builder {
    public MedicalCondition build() {
      return new MedicalCondition(secondaryPrevention, potentialAction, additionalType, medicineSystem, code, epidemiology, stage, image, differentialDiagnosis, primaryPrevention, guideline, signOrSymptom, description, associatedAnatomy, pathophysiology, mainEntityOfPage, typicalTest, possibleTreatment, alternateName, url, sameAs, recognizingAuthority, study, naturalProgression, possibleComplication, cause, name, relevantSpecialty, riskFactor, expectedPrognosis, subtype);
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    public Builder secondaryPrevention(MedicalTherapy value) {
      secondaryPrevention = value;
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
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode value) {
      code = value;
      return this;
    }
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    public Builder epidemiology(String value) {
      epidemiology = value;
      return this;
    }
    /**
     * The stage of the condition, if applicable.
     */
    public Builder stage(MedicalConditionStage value) {
      stage = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    public Builder differentialDiagnosis(DDxElement value) {
      differentialDiagnosis = value;
      return this;
    }
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    public Builder primaryPrevention(MedicalTherapy value) {
      primaryPrevention = value;
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
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    public Builder signOrSymptom(MedicalSignOrSymptom value) {
      signOrSymptom = value;
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
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(AnatomicalStructure value) {
      associatedAnatomy = value;
      return this;
    }
    /**
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    public Builder pathophysiology(String value) {
      pathophysiology = value;
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
     * A medical test typically performed given this condition.
     */
    public Builder typicalTest(MedicalTest value) {
      typicalTest = value;
      return this;
    }
    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    public Builder possibleTreatment(MedicalTherapy value) {
      possibleTreatment = value;
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
     * The expected progression of the condition if it is not treated and allowed to progress naturally.
     */
    public Builder naturalProgression(String value) {
      naturalProgression = value;
      return this;
    }
    /**
     * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
     */
    public Builder possibleComplication(String value) {
      possibleComplication = value;
      return this;
    }
    /**
     * An underlying cause. More specifically, one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.
     */
    public Builder cause(MedicalCause value) {
      cause = value;
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
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    public Builder riskFactor(MedicalRiskFactor value) {
      riskFactor = value;
      return this;
    }
    /**
     * The likely outcome in either the short term or long term of the medical condition.
     */
    public Builder expectedPrognosis(String value) {
      expectedPrognosis = value;
      return this;
    }
    /**
     * A more specific type of the condition, where applicable, for example 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.
     */
    public Builder subtype(String value) {
      subtype = value;
      return this;
    }
    private MedicalTherapy secondaryPrevention;
    private Action potentialAction;
    private String additionalType;
    private MedicineSystem medicineSystem;
    private MedicalCode code;
    private String epidemiology;
    private MedicalConditionStage stage;
    private Image image;
    private DDxElement differentialDiagnosis;
    private MedicalTherapy primaryPrevention;
    private MedicalGuideline guideline;
    private MedicalSignOrSymptom signOrSymptom;
    private String description;
    private AnatomicalStructure associatedAnatomy;
    private String pathophysiology;
    private CreativeWork mainEntityOfPage;
    private MedicalTest typicalTest;
    private MedicalTherapy possibleTreatment;
    private String alternateName;
    private String url;
    private String sameAs;
    private Organization recognizingAuthority;
    private MedicalStudy study;
    private String naturalProgression;
    private String possibleComplication;
    private MedicalCause cause;
    private String name;
    private MedicalSpecialty relevantSpecialty;
    private MedicalRiskFactor riskFactor;
    private String expectedPrognosis;
    private String subtype;
  }

  protected MedicalCondition(MedicalTherapy secondaryPrevention, Action potentialAction, String additionalType, MedicineSystem medicineSystem, MedicalCode code, String epidemiology, MedicalConditionStage stage, Image image, DDxElement differentialDiagnosis, MedicalTherapy primaryPrevention, MedicalGuideline guideline, MedicalSignOrSymptom signOrSymptom, String description, AnatomicalStructure associatedAnatomy, String pathophysiology, CreativeWork mainEntityOfPage, MedicalTest typicalTest, MedicalTherapy possibleTreatment, String alternateName, String url, String sameAs, Organization recognizingAuthority, MedicalStudy study, String naturalProgression, String possibleComplication, MedicalCause cause, String name, MedicalSpecialty relevantSpecialty, MedicalRiskFactor riskFactor, String expectedPrognosis, String subtype) {
    super(mainEntityOfPage, potentialAction, alternateName, additionalType, url, medicineSystem, sameAs, recognizingAuthority, study, code, name, image, relevantSpecialty, guideline, description);
    myAssociatedAnatomy = associatedAnatomy;
    myCause = cause;
    myDifferentialDiagnosis = differentialDiagnosis;
    myEpidemiology = epidemiology;
    myExpectedPrognosis = expectedPrognosis;
    myNaturalProgression = naturalProgression;
    myPathophysiology = pathophysiology;
    myPossibleComplication = possibleComplication;
    myPossibleTreatment = possibleTreatment;
    myPrimaryPrevention = primaryPrevention;
    myRiskFactor = riskFactor;
    mySecondaryPrevention = secondaryPrevention;
    mySignOrSymptom = signOrSymptom;
    myStage = stage;
    mySubtype = subtype;
    myTypicalTest = typicalTest;
  }
  private AnatomicalStructure myAssociatedAnatomy;
  private MedicalCause myCause;
  private DDxElement myDifferentialDiagnosis;
  private String myEpidemiology;
  private String myExpectedPrognosis;
  private String myNaturalProgression;
  private String myPathophysiology;
  private String myPossibleComplication;
  private MedicalTherapy myPossibleTreatment;
  private MedicalTherapy myPrimaryPrevention;
  private MedicalRiskFactor myRiskFactor;
  private MedicalTherapy mySecondaryPrevention;
  private MedicalSignOrSymptom mySignOrSymptom;
  private MedicalConditionStage myStage;
  private String mySubtype;
  private MedicalTest myTypicalTest;
}
