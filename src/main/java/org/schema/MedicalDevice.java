/*
 * Copyright 2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 * Generated on Jul 22, 2015.
 */

package org.schema;

/**
 * Any object used in a medical capacity, such as to diagnose or treat a patient.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class MedicalDevice extends MedicalEntity {
  /**
   * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
   */
  public MedicalEntity getAdverseOutcome() {
    return myAdverseOutcome;
  }
  /**
   * A contraindication for this therapy.
   */
  public MedicalContraindication getContraindication() {
    return myContraindication;
  }
  /**
   * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
   */
  public MedicalIndication getIndication() {
    return myIndication;
  }
  /**
   * A description of the postoperative procedures, care, and/or followups for this device.
   */
  public String getPostOp() {
    return myPostOp;
  }
  /**
   * A description of the workup, testing, and other preparations required before implanting this device.
   */
  public String getPreOp() {
    return myPreOp;
  }
  /**
   * A description of the procedure involved in setting up, using, and/or installing the device.
   */
  public String getProcedure() {
    return myProcedure;
  }
  /**
   * A goal towards an action is taken. Can be concrete or abstract.
   */
  public ThingOrMedicalDevicePurpose getPurpose() {
    return myPurpose;
  }
  /**
   * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
   */
  public MedicalEntity getSeriousAdverseOutcome() {
    return mySeriousAdverseOutcome;
  }
  /**
   * Builder for {@link MedicalDevice}
   */
  public static final class Builder {
    /**
     * Creates new {@link MedicalDevice} instance.
     */
    public MedicalDevice build() {
      return new MedicalDevice(purpose, recognizingAuthority, indication, code, adverseOutcome, name, mainEntityOfPage, guideline, seriousAdverseOutcome, additionalType, sameAs, url, alternateName, contraindication, postOp, study, potentialAction, description, relevantSpecialty, preOp, medicineSystem, procedure);
    }
    /**
     * A goal towards an action is taken. Can be concrete or abstract.
     */
    public Builder purpose(Thing thing) {
      this.purpose.setThing(thing);
      return this;
    }
    /**
     * A goal towards an action is taken. Can be concrete or abstract.
     */
    public Builder purpose(MedicalDevicePurpose medicalDevicePurpose) {
      this.purpose.setMedicalDevicePurpose(medicalDevicePurpose);
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    public Builder recognizingAuthority(Organization organization) {
      this.recognizingAuthority = organization;
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    public Builder indication(MedicalIndication medicalIndication) {
      this.indication = medicalIndication;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    public Builder code(MedicalCode medicalCode) {
      this.code = medicalCode;
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    public Builder adverseOutcome(MedicalEntity medicalEntity) {
      this.adverseOutcome = medicalEntity;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String name) {
      this.name = name;
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      this.mainEntityOfPage.setString(mainEntityOfPage);
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
    public Builder mainEntityOfPage(CreativeWork creativeWork) {
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    public Builder guideline(MedicalGuideline medicalGuideline) {
      this.guideline = medicalGuideline;
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    public Builder seriousAdverseOutcome(MedicalEntity medicalEntity) {
      this.seriousAdverseOutcome = medicalEntity;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A contraindication for this therapy.
     */
    public Builder contraindication(MedicalContraindication medicalContraindication) {
      this.contraindication = medicalContraindication;
      return this;
    }
    /**
     * A description of the postoperative procedures, care, and/or followups for this device.
     */
    public Builder postOp(String postOp) {
      this.postOp = postOp;
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    public Builder study(MedicalStudy medicalStudy) {
      this.study = medicalStudy;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    public Builder relevantSpecialty(MedicalSpecialty medicalSpecialty) {
      this.relevantSpecialty = medicalSpecialty;
      return this;
    }
    /**
     * A description of the workup, testing, and other preparations required before implanting this device.
     */
    public Builder preOp(String preOp) {
      this.preOp = preOp;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    public Builder medicineSystem(MedicineSystem medicineSystem) {
      this.medicineSystem = medicineSystem;
      return this;
    }
    /**
     * A description of the procedure involved in setting up, using, and/or installing the device.
     */
    public Builder procedure(String procedure) {
      this.procedure = procedure;
      return this;
    }
    private ThingOrMedicalDevicePurpose purpose;
    private Organization recognizingAuthority;
    private MedicalIndication indication;
    private MedicalCode code;
    private MedicalEntity adverseOutcome;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private MedicalGuideline guideline;
    private MedicalEntity seriousAdverseOutcome;
    private String additionalType;
    private String sameAs;
    private String url;
    private String alternateName;
    private MedicalContraindication contraindication;
    private String postOp;
    private MedicalStudy study;
    private Action potentialAction;
    private String description;
    private MedicalSpecialty relevantSpecialty;
    private String preOp;
    private MedicineSystem medicineSystem;
    private String procedure;
  }

  protected MedicalDevice(ThingOrMedicalDevicePurpose purpose, Organization recognizingAuthority, MedicalIndication indication, MedicalCode code, MedicalEntity adverseOutcome, String name, StringOrCreativeWork mainEntityOfPage, MedicalGuideline guideline, MedicalEntity seriousAdverseOutcome, String additionalType, String sameAs, String url, String alternateName, MedicalContraindication contraindication, String postOp, MedicalStudy study, Action potentialAction, String description, MedicalSpecialty relevantSpecialty, String preOp, MedicineSystem medicineSystem, String procedure) {
    super(recognizingAuthority, code, name, mainEntityOfPage, guideline, url, sameAs, additionalType, alternateName, study, description, potentialAction, relevantSpecialty, medicineSystem);
    myAdverseOutcome = adverseOutcome;
    myContraindication = contraindication;
    myIndication = indication;
    myPostOp = postOp;
    myPreOp = preOp;
    myProcedure = procedure;
    myPurpose = purpose;
    mySeriousAdverseOutcome = seriousAdverseOutcome;
  }
  private MedicalEntity myAdverseOutcome;
  private MedicalContraindication myContraindication;
  private MedicalIndication myIndication;
  private String myPostOp;
  private String myPreOp;
  private String myProcedure;
  private ThingOrMedicalDevicePurpose myPurpose;
  private MedicalEntity mySeriousAdverseOutcome;
}
