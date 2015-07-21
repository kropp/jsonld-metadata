/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:11 CEST 2015 */

package org.schema;

/**
 * Any medical test, typically performed for diagnostic purposes.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class MedicalTest extends MedicalEntity {
  /**
   * Drugs that affect the test's results.
   */
  public Drug getAffectedBy() {
    return myAffectedBy;
  }
  /**
   * Range of acceptable values for a typical patient, when applicable.
   */
  public String getNormalRange() {
    return myNormalRange;
  }
  /**
   * A sign detected by the test.
   */
  public MedicalSign getSignDetected() {
    return mySignDetected;
  }
  /**
   * A condition the test is used to diagnose.
   */
  public MedicalCondition getUsedToDiagnose() {
    return myUsedToDiagnose;
  }
  /**
   * Device used to perform the test.
   */
  public MedicalDevice getUsesDevice() {
    return myUsesDevice;
  }
  /**
   * Builder for {@see MedicalTest}
   */
  public static final class Builder {
    public MedicalTest build() {
      return new MedicalTest(usedToDiagnose, mainEntityOfPage, usesDevice, affectedBy, potentialAction, alternateName, additionalType, url, medicineSystem, recognizingAuthority, sameAs, code, study, image, name, normalRange, relevantSpecialty, guideline, signDetected, description);
    }
    /**
     * A condition the test is used to diagnose.
     */
    public Builder usedToDiagnose(MedicalCondition value) {
      usedToDiagnose = value;
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
     * Device used to perform the test.
     */
    public Builder usesDevice(MedicalDevice value) {
      usesDevice = value;
      return this;
    }
    /**
     * Drugs that affect the test's results.
     */
    public Builder affectedBy(Drug value) {
      affectedBy = value;
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
     * Range of acceptable values for a typical patient, when applicable.
     */
    public Builder normalRange(String value) {
      normalRange = value;
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
     * A sign detected by the test.
     */
    public Builder signDetected(MedicalSign value) {
      signDetected = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    private MedicalCondition usedToDiagnose;
    private CreativeWork mainEntityOfPage;
    private MedicalDevice usesDevice;
    private Drug affectedBy;
    private Action potentialAction;
    private String alternateName;
    private String additionalType;
    private String url;
    private MedicineSystem medicineSystem;
    private Organization recognizingAuthority;
    private String sameAs;
    private MedicalCode code;
    private MedicalStudy study;
    private Image image;
    private String name;
    private String normalRange;
    private MedicalSpecialty relevantSpecialty;
    private MedicalGuideline guideline;
    private MedicalSign signDetected;
    private String description;
  }

  protected MedicalTest(MedicalCondition usedToDiagnose, CreativeWork mainEntityOfPage, MedicalDevice usesDevice, Drug affectedBy, Action potentialAction, String alternateName, String additionalType, String url, MedicineSystem medicineSystem, Organization recognizingAuthority, String sameAs, MedicalCode code, MedicalStudy study, Image image, String name, String normalRange, MedicalSpecialty relevantSpecialty, MedicalGuideline guideline, MedicalSign signDetected, String description) {
    super(mainEntityOfPage, potentialAction, alternateName, additionalType, url, medicineSystem, sameAs, recognizingAuthority, study, code, name, image, relevantSpecialty, guideline, description);
    myAffectedBy = affectedBy;
    myNormalRange = normalRange;
    mySignDetected = signDetected;
    myUsedToDiagnose = usedToDiagnose;
    myUsesDevice = usesDevice;
  }
  private Drug myAffectedBy;
  private String myNormalRange;
  private MedicalSign mySignDetected;
  private MedicalCondition myUsedToDiagnose;
  private MedicalDevice myUsesDevice;
}
