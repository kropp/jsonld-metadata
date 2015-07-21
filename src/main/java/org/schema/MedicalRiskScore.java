/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A simple system that adds up the number of risk factors to yield a score that is associated with prognosis, e.g. CHAD score, TIMI risk score.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class MedicalRiskScore extends MedicalRiskEstimator {
  /**
   * The algorithm or rules to follow to compute the score.
   */
  public String getAlgorithm() {
    return myAlgorithm;
  }
  /**
   * Builder for {@see MedicalRiskScore}
   */
  public static final class Builder {
    public MedicalRiskScore build() {
      return new MedicalRiskScore(mainEntityOfPage, potentialAction, alternateName, includedRiskFactor, additionalType, url, medicineSystem, sameAs, recognizingAuthority, study, code, estimatesRiskOf, name, image, relevantSpecialty, guideline, algorithm, description);
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
     * A modifiable or non-modifiable risk factor included in the calculation, e.g. age, coexisting condition.
     */
    public Builder includedRiskFactor(MedicalRiskFactor value) {
      includedRiskFactor = value;
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
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
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
     * A medical study or trial related to this entity.
     */
    public Builder study(MedicalStudy value) {
      study = value;
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
     * The condition, complication, or symptom whose risk is being estimated.
     */
    public Builder estimatesRiskOf(MedicalEntity value) {
      estimatesRiskOf = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
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
     * A medical guideline related to this entity.
     */
    public Builder guideline(MedicalGuideline value) {
      guideline = value;
      return this;
    }
    /**
     * The algorithm or rules to follow to compute the score.
     */
    public Builder algorithm(String value) {
      algorithm = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    private CreativeWork mainEntityOfPage;
    private Action potentialAction;
    private String alternateName;
    private MedicalRiskFactor includedRiskFactor;
    private String additionalType;
    private String url;
    private MedicineSystem medicineSystem;
    private String sameAs;
    private Organization recognizingAuthority;
    private MedicalStudy study;
    private MedicalCode code;
    private MedicalEntity estimatesRiskOf;
    private String name;
    private Image image;
    private MedicalSpecialty relevantSpecialty;
    private MedicalGuideline guideline;
    private String algorithm;
    private String description;
  }

  protected MedicalRiskScore(CreativeWork mainEntityOfPage, Action potentialAction, String alternateName, MedicalRiskFactor includedRiskFactor, String additionalType, String url, MedicineSystem medicineSystem, String sameAs, Organization recognizingAuthority, MedicalStudy study, MedicalCode code, MedicalEntity estimatesRiskOf, String name, Image image, MedicalSpecialty relevantSpecialty, MedicalGuideline guideline, String algorithm, String description) {
    super(mainEntityOfPage, alternateName, potentialAction, additionalType, includedRiskFactor, url, medicineSystem, sameAs, recognizingAuthority, study, code, estimatesRiskOf, image, name, relevantSpecialty, guideline, description);
    myAlgorithm = algorithm;
  }
  private String myAlgorithm;
}
