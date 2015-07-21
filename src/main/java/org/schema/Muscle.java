/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class Muscle extends AnatomicalStructure {
  /**
   * The movement the muscle generates.
   */
  public String getMuscleAction() {
    return myMuscleAction;
  }
  /**
   * The muscle whose action counteracts the specified muscle.
   */
  public Muscle getAntagonist() {
    return myAntagonist;
  }
  /**
   * The blood vessel that carries blood from the heart to the muscle.
   */
  public Vessel getBloodSupply() {
    return myBloodSupply;
  }
  /**
   * The place of attachment of a muscle, or what the muscle moves.
   */
  public AnatomicalStructure getInsertion() {
    return myInsertion;
  }
  /**
   * The underlying innervation associated with the muscle.
   */
  public Nerve getNerve() {
    return myNerve;
  }
  /**
   * The place or point where a muscle arises.
   */
  public AnatomicalStructure getOrigin() {
    return myOrigin;
  }
  /**
   * Builder for {@see Muscle}
   */
  public static final class Builder {
    public Muscle build() {
      return new Muscle(antagonist, nerve, potentialAction, additionalType, connectedTo, medicineSystem, partOfSystem, code, origin, bodyLocation, muscleAction, image, guideline, description, function, mainEntityOfPage, relatedCondition, subStructure, alternateName, url, associatedPathophysiology, recognizingAuthority, sameAs, study, diagram, insertion, name, relevantSpecialty, bloodSupply, relatedTherapy);
    }
    /**
     * The muscle whose action counteracts the specified muscle.
     */
    public Builder antagonist(Muscle value) {
      antagonist = value;
      return this;
    }
    /**
     * The underlying innervation associated with the muscle.
     */
    public Builder nerve(Nerve value) {
      nerve = value;
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
     * The place or point where a muscle arises.
     */
    public Builder origin(AnatomicalStructure value) {
      origin = value;
      return this;
    }
    /**
     * Location in the body of the anatomical structure.
     */
    public Builder bodyLocation(String value) {
      bodyLocation = value;
      return this;
    }
    /**
     * The movement the muscle generates.
     */
    public Builder muscleAction(String value) {
      muscleAction = value;
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
     * The place of attachment of a muscle, or what the muscle moves.
     */
    public Builder insertion(AnatomicalStructure value) {
      insertion = value;
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
     * The blood vessel that carries blood from the heart to the muscle.
     */
    public Builder bloodSupply(Vessel value) {
      bloodSupply = value;
      return this;
    }
    /**
     * A medical therapy related to this anatomy.
     */
    public Builder relatedTherapy(MedicalTherapy value) {
      relatedTherapy = value;
      return this;
    }
    private Muscle antagonist;
    private Nerve nerve;
    private Action potentialAction;
    private String additionalType;
    private AnatomicalStructure connectedTo;
    private MedicineSystem medicineSystem;
    private IsPartOf partOfSystem;
    private MedicalCode code;
    private AnatomicalStructure origin;
    private String bodyLocation;
    private String muscleAction;
    private Image image;
    private MedicalGuideline guideline;
    private String description;
    private String function;
    private CreativeWork mainEntityOfPage;
    private MedicalCondition relatedCondition;
    private AnatomicalStructure subStructure;
    private String alternateName;
    private String url;
    private String associatedPathophysiology;
    private Organization recognizingAuthority;
    private String sameAs;
    private MedicalStudy study;
    private ImageObject diagram;
    private AnatomicalStructure insertion;
    private String name;
    private MedicalSpecialty relevantSpecialty;
    private Vessel bloodSupply;
    private MedicalTherapy relatedTherapy;
  }

  protected Muscle(Muscle antagonist, Nerve nerve, Action potentialAction, String additionalType, AnatomicalStructure connectedTo, MedicineSystem medicineSystem, IsPartOf partOfSystem, MedicalCode code, AnatomicalStructure origin, String bodyLocation, String muscleAction, Image image, MedicalGuideline guideline, String description, String function, CreativeWork mainEntityOfPage, MedicalCondition relatedCondition, AnatomicalStructure subStructure, String alternateName, String url, String associatedPathophysiology, Organization recognizingAuthority, String sameAs, MedicalStudy study, ImageObject diagram, AnatomicalStructure insertion, String name, MedicalSpecialty relevantSpecialty, Vessel bloodSupply, MedicalTherapy relatedTherapy) {
    super(function, mainEntityOfPage, relatedCondition, subStructure, potentialAction, alternateName, url, additionalType, connectedTo, medicineSystem, associatedPathophysiology, recognizingAuthority, sameAs, partOfSystem, code, study, diagram, bodyLocation, image, name, relevantSpecialty, guideline, description, relatedTherapy);
    myMuscleAction = muscleAction;
    myAntagonist = antagonist;
    myBloodSupply = bloodSupply;
    myInsertion = insertion;
    myNerve = nerve;
    myOrigin = origin;
  }
  private String myMuscleAction;
  private Muscle myAntagonist;
  private Vessel myBloodSupply;
  private AnatomicalStructure myInsertion;
  private Nerve myNerve;
  private AnatomicalStructure myOrigin;
}
