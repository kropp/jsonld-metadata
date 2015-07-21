/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A specific strength in which a medical drug is available in a specific country.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class DrugStrength extends MedicalIntangible {
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   */
  public String getActiveIngredient() {
    return myActiveIngredient;
  }
  /**
   * The location in which the strength is available.
   */
  public AdministrativeArea getAvailableIn() {
    return myAvailableIn;
  }
  /**
   * The units of an active ingredient's strength, e.g. mg.
   */
  public String getStrengthUnit() {
    return myStrengthUnit;
  }
  /**
   * The value of an active ingredient's strength, e.g. 325.
   */
  public Number getStrengthValue() {
    return myStrengthValue;
  }
  /**
   * Builder for {@see DrugStrength}
   */
  public static final class Builder {
    public DrugStrength build() {
      return new DrugStrength(activeIngredient, mainEntityOfPage, potentialAction, alternateName, url, additionalType, medicineSystem, strengthValue, availableIn, sameAs, recognizingAuthority, code, study, image, name, relevantSpecialty, guideline, description, strengthUnit);
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
     * The value of an active ingredient's strength, e.g. 325.
     */
    public Builder strengthValue(Number value) {
      strengthValue = value;
      return this;
    }
    /**
     * The location in which the strength is available.
     */
    public Builder availableIn(AdministrativeArea value) {
      availableIn = value;
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
     * The units of an active ingredient's strength, e.g. mg.
     */
    public Builder strengthUnit(String value) {
      strengthUnit = value;
      return this;
    }
    private String activeIngredient;
    private CreativeWork mainEntityOfPage;
    private Action potentialAction;
    private String alternateName;
    private String url;
    private String additionalType;
    private MedicineSystem medicineSystem;
    private Number strengthValue;
    private AdministrativeArea availableIn;
    private String sameAs;
    private Organization recognizingAuthority;
    private MedicalCode code;
    private MedicalStudy study;
    private Image image;
    private String name;
    private MedicalSpecialty relevantSpecialty;
    private MedicalGuideline guideline;
    private String description;
    private String strengthUnit;
  }

  protected DrugStrength(String activeIngredient, CreativeWork mainEntityOfPage, Action potentialAction, String alternateName, String url, String additionalType, MedicineSystem medicineSystem, Number strengthValue, AdministrativeArea availableIn, String sameAs, Organization recognizingAuthority, MedicalCode code, MedicalStudy study, Image image, String name, MedicalSpecialty relevantSpecialty, MedicalGuideline guideline, String description, String strengthUnit) {
    super(mainEntityOfPage, potentialAction, alternateName, url, additionalType, medicineSystem, sameAs, recognizingAuthority, study, code, name, image, relevantSpecialty, guideline, description);
    myActiveIngredient = activeIngredient;
    myAvailableIn = availableIn;
    myStrengthUnit = strengthUnit;
    myStrengthValue = strengthValue;
  }
  private String myActiveIngredient;
  private AdministrativeArea myAvailableIn;
  private String myStrengthUnit;
  private Number myStrengthValue;
}
