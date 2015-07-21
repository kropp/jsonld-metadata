/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class AnatomicalStructure extends MedicalEntity {
  /**
   * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
   */
  public String getAssociatedPathophysiology() {
    return myAssociatedPathophysiology;
  }
  /**
   * Location in the body of the anatomical structure.
   */
  public String getBodyLocation() {
    return myBodyLocation;
  }
  /**
   * Other anatomical structures to which this structure is connected.
   */
  public AnatomicalStructure getConnectedTo() {
    return myConnectedTo;
  }
  /**
   * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
   */
  public ImageObject getDiagram() {
    return myDiagram;
  }
  /**
   * Function of the anatomical structure.
   */
  public String getFunction() {
    return myFunction;
  }
  /**
   * The anatomical or organ system that this structure is part of.
   */
  public IsPartOf getPartOfSystem() {
    return myPartOfSystem;
  }
  /**
   * A medical condition associated with this anatomy.
   */
  public MedicalCondition getRelatedCondition() {
    return myRelatedCondition;
  }
  /**
   * A medical therapy related to this anatomy.
   */
  public MedicalTherapy getRelatedTherapy() {
    return myRelatedTherapy;
  }
  /**
   * Component (sub-)structure(s) that comprise this anatomical structure.
   */
  public AnatomicalStructure getSubStructure() {
    return mySubStructure;
  }
  /**
   * Builder for {@see AnatomicalStructure}
   */
  public static final class Builder {
    public AnatomicalStructure build() {
      return new AnatomicalStructure(function, mainEntityOfPage, relatedCondition, subStructure, potentialAction, alternateName, url, additionalType, connectedTo, medicineSystem, associatedPathophysiology, recognizingAuthority, sameAs, partOfSystem, code, study, diagram, bodyLocation, image, name, relevantSpecialty, guideline, description, relatedTherapy);
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
     * Other anatomical structures to which this structure is connected.
     */
    public Builder connectedTo(AnatomicalStructure value) {
      connectedTo = value;
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
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     */
    public Builder associatedPathophysiology(String value) {
      associatedPathophysiology = value;
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
     * A medical therapy related to this anatomy.
     */
    public Builder relatedTherapy(MedicalTherapy value) {
      relatedTherapy = value;
      return this;
    }
    private String function;
    private CreativeWork mainEntityOfPage;
    private MedicalCondition relatedCondition;
    private AnatomicalStructure subStructure;
    private Action potentialAction;
    private String alternateName;
    private String url;
    private String additionalType;
    private AnatomicalStructure connectedTo;
    private MedicineSystem medicineSystem;
    private String associatedPathophysiology;
    private Organization recognizingAuthority;
    private String sameAs;
    private IsPartOf partOfSystem;
    private MedicalCode code;
    private MedicalStudy study;
    private ImageObject diagram;
    private String bodyLocation;
    private Image image;
    private String name;
    private MedicalSpecialty relevantSpecialty;
    private MedicalGuideline guideline;
    private String description;
    private MedicalTherapy relatedTherapy;
  }

  protected AnatomicalStructure(String function, CreativeWork mainEntityOfPage, MedicalCondition relatedCondition, AnatomicalStructure subStructure, Action potentialAction, String alternateName, String url, String additionalType, AnatomicalStructure connectedTo, MedicineSystem medicineSystem, String associatedPathophysiology, Organization recognizingAuthority, String sameAs, IsPartOf partOfSystem, MedicalCode code, MedicalStudy study, ImageObject diagram, String bodyLocation, Image image, String name, MedicalSpecialty relevantSpecialty, MedicalGuideline guideline, String description, MedicalTherapy relatedTherapy) {
    super(mainEntityOfPage, potentialAction, alternateName, additionalType, url, medicineSystem, sameAs, recognizingAuthority, study, code, name, image, relevantSpecialty, guideline, description);
    myAssociatedPathophysiology = associatedPathophysiology;
    myBodyLocation = bodyLocation;
    myConnectedTo = connectedTo;
    myDiagram = diagram;
    myFunction = function;
    myPartOfSystem = partOfSystem;
    myRelatedCondition = relatedCondition;
    myRelatedTherapy = relatedTherapy;
    mySubStructure = subStructure;
  }
  private String myAssociatedPathophysiology;
  private String myBodyLocation;
  private AnatomicalStructure myConnectedTo;
  private ImageObject myDiagram;
  private String myFunction;
  private IsPartOf myPartOfSystem;
  private MedicalCondition myRelatedCondition;
  private MedicalTherapy myRelatedTherapy;
  private AnatomicalStructure mySubStructure;
}
