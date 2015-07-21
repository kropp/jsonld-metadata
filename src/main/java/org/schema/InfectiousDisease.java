/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * An infectious disease is a clinically evident human disease resulting from the presence of pathogenic microbial agents, like pathogenic viruses, pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To be considered an infectious disease, such pathogens are known to be able to cause this disease.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class InfectiousDisease extends MedicalCondition {
  /**
   * The actual infectious agent, such as a specific bacterium.
   */
  public String getInfectiousAgent() {
    return myInfectiousAgent;
  }
  /**
   * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
   */
  public InfectiousAgentClass getInfectiousAgentClass() {
    return myInfectiousAgentClass;
  }
  /**
   * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
   */
  public String getTransmissionMethod() {
    return myTransmissionMethod;
  }
  /**
   * Builder for {@see InfectiousDisease}
   */
  public static final class Builder {
    public InfectiousDisease build() {
      return new InfectiousDisease(secondaryPrevention, infectiousAgent, potentialAction, additionalType, medicineSystem, code, epidemiology, stage, image, differentialDiagnosis, primaryPrevention, guideline, signOrSymptom, description, transmissionMethod, associatedAnatomy, pathophysiology, mainEntityOfPage, typicalTest, possibleTreatment, alternateName, url, recognizingAuthority, sameAs, naturalProgression, study, possibleComplication, cause, name, infectiousAgentClass, relevantSpecialty, riskFactor, expectedPrognosis, subtype);
    }
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    public Builder secondaryPrevention(MedicalTherapy value) {
      secondaryPrevention = value;
      return this;
    }
    /**
     * The actual infectious agent, such as a specific bacterium.
     */
    public Builder infectiousAgent(String value) {
      infectiousAgent = value;
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
     * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
     */
    public Builder transmissionMethod(String value) {
      transmissionMethod = value;
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
     * The expected progression of the condition if it is not treated and allowed to progress naturally.
     */
    public Builder naturalProgression(String value) {
      naturalProgression = value;
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
     * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
     */
    public Builder infectiousAgentClass(InfectiousAgentClass value) {
      infectiousAgentClass = value;
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
    private String infectiousAgent;
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
    private String transmissionMethod;
    private AnatomicalStructure associatedAnatomy;
    private String pathophysiology;
    private CreativeWork mainEntityOfPage;
    private MedicalTest typicalTest;
    private MedicalTherapy possibleTreatment;
    private String alternateName;
    private String url;
    private Organization recognizingAuthority;
    private String sameAs;
    private String naturalProgression;
    private MedicalStudy study;
    private String possibleComplication;
    private MedicalCause cause;
    private String name;
    private InfectiousAgentClass infectiousAgentClass;
    private MedicalSpecialty relevantSpecialty;
    private MedicalRiskFactor riskFactor;
    private String expectedPrognosis;
    private String subtype;
  }

  protected InfectiousDisease(MedicalTherapy secondaryPrevention, String infectiousAgent, Action potentialAction, String additionalType, MedicineSystem medicineSystem, MedicalCode code, String epidemiology, MedicalConditionStage stage, Image image, DDxElement differentialDiagnosis, MedicalTherapy primaryPrevention, MedicalGuideline guideline, MedicalSignOrSymptom signOrSymptom, String description, String transmissionMethod, AnatomicalStructure associatedAnatomy, String pathophysiology, CreativeWork mainEntityOfPage, MedicalTest typicalTest, MedicalTherapy possibleTreatment, String alternateName, String url, Organization recognizingAuthority, String sameAs, String naturalProgression, MedicalStudy study, String possibleComplication, MedicalCause cause, String name, InfectiousAgentClass infectiousAgentClass, MedicalSpecialty relevantSpecialty, MedicalRiskFactor riskFactor, String expectedPrognosis, String subtype) {
    super(secondaryPrevention, potentialAction, additionalType, medicineSystem, code, epidemiology, stage, image, differentialDiagnosis, primaryPrevention, guideline, signOrSymptom, description, associatedAnatomy, pathophysiology, mainEntityOfPage, typicalTest, possibleTreatment, alternateName, url, sameAs, recognizingAuthority, study, naturalProgression, possibleComplication, cause, name, relevantSpecialty, riskFactor, expectedPrognosis, subtype);
    myInfectiousAgent = infectiousAgent;
    myInfectiousAgentClass = infectiousAgentClass;
    myTransmissionMethod = transmissionMethod;
  }
  private String myInfectiousAgent;
  private InfectiousAgentClass myInfectiousAgentClass;
  private String myTransmissionMethod;
}
