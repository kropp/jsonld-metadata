/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:11 CEST 2015 */

package org.schema;

/**
 * A type of blood vessel that specifically carries lymph fluid unidirectionally toward the heart.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class LymphaticVessel extends Vessel {
  /**
   * The vasculature the lymphatic structure originates, or afferents, from.
   */
  public Vessel getOriginatesFrom() {
    return myOriginatesFrom;
  }
  /**
   * The anatomical or organ system drained by this vessel; generally refers to a specific part of an organ.
   */
  public AnatomicalStructure getRegionDrained() {
    return myRegionDrained;
  }
  /**
   * The vasculature the lymphatic structure runs, or efferents, to.
   */
  public Vessel getRunsTo() {
    return myRunsTo;
  }
  /**
   * Builder for {@see LymphaticVessel}
   */
  public static final class Builder {
    public LymphaticVessel build() {
      return new LymphaticVessel(potentialAction, originatesFrom, connectedTo, additionalType, medicineSystem, partOfSystem, code, bodyLocation, image, guideline, description, function, mainEntityOfPage, runsTo, relatedCondition, subStructure, alternateName, url, associatedPathophysiology, sameAs, recognizingAuthority, study, diagram, regionDrained, name, relevantSpecialty, relatedTherapy);
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * The vasculature the lymphatic structure originates, or afferents, from.
     */
    public Builder originatesFrom(Vessel value) {
      originatesFrom = value;
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     */
    public Builder connectedTo(AnatomicalStructure value) {
      connectedTo = value;
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
     * The anatomical or organ system that this structure is part of.
     */
    public Builder partOfSystem(IsPartOf value) {
      partOfSystem = value;
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
     * Location in the body of the anatomical structure.
     */
    public Builder bodyLocation(String value) {
      bodyLocation = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
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
     * Function of the anatomical structure.
     */
    public Builder function(String value) {
      function = value;
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
     * The vasculature the lymphatic structure runs, or efferents, to.
     */
    public Builder runsTo(Vessel value) {
      runsTo = value;
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     */
    public Builder relatedCondition(MedicalCondition value) {
      relatedCondition = value;
      return this;
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    public Builder subStructure(AnatomicalStructure value) {
      subStructure = value;
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
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     */
    public Builder associatedPathophysiology(String value) {
      associatedPathophysiology = value;
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
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     */
    public Builder diagram(ImageObject value) {
      diagram = value;
      return this;
    }
    /**
     * The anatomical or organ system drained by this vessel; generally refers to a specific part of an organ.
     */
    public Builder regionDrained(AnatomicalStructure value) {
      regionDrained = value;
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
     * A medical therapy related to this anatomy.
     */
    public Builder relatedTherapy(MedicalTherapy value) {
      relatedTherapy = value;
      return this;
    }
    private Action potentialAction;
    private Vessel originatesFrom;
    private AnatomicalStructure connectedTo;
    private String additionalType;
    private MedicineSystem medicineSystem;
    private IsPartOf partOfSystem;
    private MedicalCode code;
    private String bodyLocation;
    private Image image;
    private MedicalGuideline guideline;
    private String description;
    private String function;
    private CreativeWork mainEntityOfPage;
    private Vessel runsTo;
    private MedicalCondition relatedCondition;
    private AnatomicalStructure subStructure;
    private String alternateName;
    private String url;
    private String associatedPathophysiology;
    private String sameAs;
    private Organization recognizingAuthority;
    private MedicalStudy study;
    private ImageObject diagram;
    private AnatomicalStructure regionDrained;
    private String name;
    private MedicalSpecialty relevantSpecialty;
    private MedicalTherapy relatedTherapy;
  }

  protected LymphaticVessel(Action potentialAction, Vessel originatesFrom, AnatomicalStructure connectedTo, String additionalType, MedicineSystem medicineSystem, IsPartOf partOfSystem, MedicalCode code, String bodyLocation, Image image, MedicalGuideline guideline, String description, String function, CreativeWork mainEntityOfPage, Vessel runsTo, MedicalCondition relatedCondition, AnatomicalStructure subStructure, String alternateName, String url, String associatedPathophysiology, String sameAs, Organization recognizingAuthority, MedicalStudy study, ImageObject diagram, AnatomicalStructure regionDrained, String name, MedicalSpecialty relevantSpecialty, MedicalTherapy relatedTherapy) {
    super(function, mainEntityOfPage, relatedCondition, subStructure, alternateName, potentialAction, url, additionalType, connectedTo, medicineSystem, associatedPathophysiology, partOfSystem, sameAs, recognizingAuthority, study, code, diagram, bodyLocation, name, image, relevantSpecialty, guideline, relatedTherapy, description);
    myOriginatesFrom = originatesFrom;
    myRegionDrained = regionDrained;
    myRunsTo = runsTo;
  }
  private Vessel myOriginatesFrom;
  private AnatomicalStructure myRegionDrained;
  private Vessel myRunsTo;
}
