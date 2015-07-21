/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * Any bodily activity that enhances or maintains physical fitness and overall health and wellness. Includes activity that is part of daily living and routine, structured exercise, and exercise prescribed as part of a medical treatment or recovery plan.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class PhysicalActivity extends LifestyleModification {
  /**
   * The anatomy of the underlying organ system or structures associated with this entity.
   */
  public AnatomicalStructure getAssociatedAnatomy() {
    return myAssociatedAnatomy;
  }
  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
   */
  public PhysicalActivityCategory getCategory() {
    return myCategory;
  }
  /**
   * The characteristics of associated patients, such as age, gender, race etc.
   */
  public String getEpidemiology() {
    return myEpidemiology;
  }
  /**
   * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
   */
  public String getPathophysiology() {
    return myPathophysiology;
  }
  /**
   * Builder for {@see PhysicalActivity}
   */
  public static final class Builder {
    public PhysicalActivity build() {
      return new PhysicalActivity(indication, adverseOutcome, mainEntityOfPage, contraindication, alternateName, potentialAction, additionalType, url, medicineSystem, sameAs, recognizingAuthority, code, study, epidemiology, image, name, relevantSpecialty, duplicateTherapy, seriousAdverseOutcome, category, guideline, description, pathophysiology, associatedAnatomy);
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
     * A contraindication for this therapy.
     */
    public Builder contraindication(MedicalContraindication value) {
      contraindication = value;
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
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    public Builder epidemiology(String value) {
      epidemiology = value;
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
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    public Builder category(PhysicalActivityCategory value) {
      category = value;
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
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    public Builder pathophysiology(String value) {
      pathophysiology = value;
      return this;
    }
    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    public Builder associatedAnatomy(AnatomicalStructure value) {
      associatedAnatomy = value;
      return this;
    }
    private MedicalIndication indication;
    private MedicalEntity adverseOutcome;
    private CreativeWork mainEntityOfPage;
    private MedicalContraindication contraindication;
    private String alternateName;
    private Action potentialAction;
    private String additionalType;
    private String url;
    private MedicineSystem medicineSystem;
    private String sameAs;
    private Organization recognizingAuthority;
    private MedicalCode code;
    private MedicalStudy study;
    private String epidemiology;
    private Image image;
    private String name;
    private MedicalSpecialty relevantSpecialty;
    private MedicalTherapy duplicateTherapy;
    private MedicalEntity seriousAdverseOutcome;
    private PhysicalActivityCategory category;
    private MedicalGuideline guideline;
    private String description;
    private String pathophysiology;
    private AnatomicalStructure associatedAnatomy;
  }

  protected PhysicalActivity(MedicalIndication indication, MedicalEntity adverseOutcome, CreativeWork mainEntityOfPage, MedicalContraindication contraindication, String alternateName, Action potentialAction, String additionalType, String url, MedicineSystem medicineSystem, String sameAs, Organization recognizingAuthority, MedicalCode code, MedicalStudy study, String epidemiology, Image image, String name, MedicalSpecialty relevantSpecialty, MedicalTherapy duplicateTherapy, MedicalEntity seriousAdverseOutcome, PhysicalActivityCategory category, MedicalGuideline guideline, String description, String pathophysiology, AnatomicalStructure associatedAnatomy) {
    super(indication, adverseOutcome, mainEntityOfPage, contraindication, alternateName, potentialAction, additionalType, url, medicineSystem, recognizingAuthority, sameAs, study, code, name, image, duplicateTherapy, relevantSpecialty, seriousAdverseOutcome, guideline, description);
    myAssociatedAnatomy = associatedAnatomy;
    myCategory = category;
    myEpidemiology = epidemiology;
    myPathophysiology = pathophysiology;
  }
  private AnatomicalStructure myAssociatedAnatomy;
  private PhysicalActivityCategory myCategory;
  private String myEpidemiology;
  private String myPathophysiology;
}
