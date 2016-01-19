/*
 * Copyright 2015-2016 JetBrains s.r.o.
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
 */

package org.schema;

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.*;

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
  public MedicalDevicePurposeOrThing getPurpose() {
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
  static final class MedicalDeviceThingBuilder implements Builder {
    /**
     * Creates new {@link MedicalDevice} instance.
     */
    public MedicalDevice build() {
      return new MedicalDevice(adverseOutcome, contraindication, indication, postOp, preOp, procedure, purpose, seriousAdverseOutcome, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    @NotNull public Builder adverseOutcome(@NotNull MedicalEntity medicalEntity) {
      this.adverseOutcome = medicalEntity;
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    @NotNull public Builder adverseOutcome(@NotNull MedicalEntity.Builder medicalEntity) {
      return this.adverseOutcome(medicalEntity.build());
    }
    /**
     * A contraindication for this therapy.
     */
    @NotNull public Builder contraindication(@NotNull MedicalContraindication medicalContraindication) {
      this.contraindication = medicalContraindication;
      return this;
    }
    /**
     * A contraindication for this therapy.
     */
    @NotNull public Builder contraindication(@NotNull MedicalContraindication.Builder medicalContraindication) {
      return this.contraindication(medicalContraindication.build());
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    @NotNull public Builder indication(@NotNull MedicalIndication medicalIndication) {
      this.indication = medicalIndication;
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    @NotNull public Builder indication(@NotNull MedicalIndication.Builder medicalIndication) {
      return this.indication(medicalIndication.build());
    }
    /**
     * A description of the postoperative procedures, care, and/or followups for this device.
     */
    @NotNull public Builder postOp(@NotNull String postOp) {
      this.postOp = postOp;
      return this;
    }
    /**
     * A description of the workup, testing, and other preparations required before implanting this device.
     */
    @NotNull public Builder preOp(@NotNull String preOp) {
      this.preOp = preOp;
      return this;
    }
    /**
     * A description of the procedure involved in setting up, using, and/or installing the device.
     */
    @NotNull public Builder procedure(@NotNull String procedure) {
      this.procedure = procedure;
      return this;
    }
    /**
     * A goal towards an action is taken. Can be concrete or abstract.
     */
    @NotNull public Builder purpose(@NotNull MedicalDevicePurpose medicalDevicePurpose) {
      if (this.purpose == null) this.purpose = new MedicalDevicePurposeOrThing();
      this.purpose.setMedicalDevicePurpose(medicalDevicePurpose);
      return this;
    }
    /**
     * A goal towards an action is taken. Can be concrete or abstract.
     */
    @NotNull public Builder purpose(@NotNull MedicalDevicePurpose.Builder medicalDevicePurpose) {
      return this.purpose(medicalDevicePurpose.build());
    }
    /**
     * A goal towards an action is taken. Can be concrete or abstract.
     */
    @NotNull public Builder purpose(@NotNull Thing thing) {
      if (this.purpose == null) this.purpose = new MedicalDevicePurposeOrThing();
      this.purpose.setThing(thing);
      return this;
    }
    /**
     * A goal towards an action is taken. Can be concrete or abstract.
     */
    @NotNull public Builder purpose(@NotNull Thing.Builder thing) {
      return this.purpose(thing.build());
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @NotNull public Builder seriousAdverseOutcome(@NotNull MedicalEntity medicalEntity) {
      this.seriousAdverseOutcome = medicalEntity;
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @NotNull public Builder seriousAdverseOutcome(@NotNull MedicalEntity.Builder medicalEntity) {
      return this.seriousAdverseOutcome(medicalEntity.build());
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(@NotNull MedicalCode medicalCode) {
      this.code = medicalCode;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(@NotNull MedicalCode.Builder medicalCode) {
      return this.code(medicalCode.build());
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline medicalGuideline) {
      this.guideline = medicalGuideline;
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline.Builder medicalGuideline) {
      return this.guideline(medicalGuideline.build());
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem medicineSystem) {
      this.medicineSystem = medicineSystem;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem.Builder medicineSystem) {
      return this.medicineSystem(medicineSystem.build());
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization organization) {
      this.recognizingAuthority = organization;
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization.Builder organization) {
      return this.recognizingAuthority(organization.build());
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty medicalSpecialty) {
      this.relevantSpecialty = medicalSpecialty;
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty.Builder medicalSpecialty) {
      return this.relevantSpecialty(medicalSpecialty.build());
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(@NotNull MedicalStudy medicalStudy) {
      this.study = medicalStudy;
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(@NotNull MedicalStudy.Builder medicalStudy) {
      return this.study(medicalStudy.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      this.description = description;
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
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
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(@NotNull String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }

    @Override public void fromMap(java.util.Map<String, Object> map) {
      for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
        final String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }
        if ("adverseOutcome".equals(key) && value instanceof MedicalEntity) { adverseOutcome((MedicalEntity)value); continue; }
        if ("contraindication".equals(key) && value instanceof MedicalContraindication) { contraindication((MedicalContraindication)value); continue; }
        if ("indication".equals(key) && value instanceof MedicalIndication) { indication((MedicalIndication)value); continue; }
        if ("postOp".equals(key) && value instanceof String) { postOp((String)value); continue; }
        if ("preOp".equals(key) && value instanceof String) { preOp((String)value); continue; }
        if ("procedure".equals(key) && value instanceof String) { procedure((String)value); continue; }
        if ("purpose".equals(key) && value instanceof MedicalDevicePurpose) { purpose((MedicalDevicePurpose)value); continue; }
        if ("purpose".equals(key) && value instanceof Thing) { purpose((Thing)value); continue; }
        if ("seriousAdverseOutcome".equals(key) && value instanceof MedicalEntity) { seriousAdverseOutcome((MedicalEntity)value); continue; }
        if ("code".equals(key) && value instanceof MedicalCode) { code((MedicalCode)value); continue; }
        if ("guideline".equals(key) && value instanceof MedicalGuideline) { guideline((MedicalGuideline)value); continue; }
        if ("medicineSystem".equals(key) && value instanceof MedicineSystem) { medicineSystem((MedicineSystem)value); continue; }
        if ("recognizingAuthority".equals(key) && value instanceof Organization) { recognizingAuthority((Organization)value); continue; }
        if ("relevantSpecialty".equals(key) && value instanceof MedicalSpecialty) { relevantSpecialty((MedicalSpecialty)value); continue; }
        if ("study".equals(key) && value instanceof MedicalStudy) { study((MedicalStudy)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("@id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private MedicalEntity adverseOutcome;
    private MedicalContraindication contraindication;
    private MedicalIndication indication;
    private String postOp;
    private String preOp;
    private String procedure;
    private MedicalDevicePurposeOrThing purpose;
    private MedicalEntity seriousAdverseOutcome;
    private MedicalCode code;
    private MedicalGuideline guideline;
    private MedicineSystem medicineSystem;
    private Organization recognizingAuthority;
    private MedicalSpecialty relevantSpecialty;
    private MedicalStudy study;
    private String additionalType;
    private String alternateName;
    private String description;
    private CreativeWorkOrString mainEntityOfPage;
    private String name;
    private String sameAs;
    private String url;
    private Action potentialAction;
    private String id;
  }
  public interface Builder extends ThingBuilder<MedicalDevice> {
    @NotNull Builder adverseOutcome(@NotNull MedicalEntity medicalEntity);
    @NotNull Builder adverseOutcome(@NotNull MedicalEntity.Builder medicalEntity);
    @NotNull Builder contraindication(@NotNull MedicalContraindication medicalContraindication);
    @NotNull Builder contraindication(@NotNull MedicalContraindication.Builder medicalContraindication);
    @NotNull Builder indication(@NotNull MedicalIndication medicalIndication);
    @NotNull Builder indication(@NotNull MedicalIndication.Builder medicalIndication);
    @NotNull Builder postOp(@NotNull String postOp);
    @NotNull Builder preOp(@NotNull String preOp);
    @NotNull Builder procedure(@NotNull String procedure);
    @NotNull Builder purpose(@NotNull MedicalDevicePurpose medicalDevicePurpose);
    @NotNull Builder purpose(@NotNull MedicalDevicePurpose.Builder medicalDevicePurpose);
    @NotNull Builder purpose(@NotNull Thing thing);
    @NotNull Builder purpose(@NotNull Thing.Builder thing);
    @NotNull Builder seriousAdverseOutcome(@NotNull MedicalEntity medicalEntity);
    @NotNull Builder seriousAdverseOutcome(@NotNull MedicalEntity.Builder medicalEntity);
    @NotNull Builder code(@NotNull MedicalCode medicalCode);
    @NotNull Builder code(@NotNull MedicalCode.Builder medicalCode);
    @NotNull Builder guideline(@NotNull MedicalGuideline medicalGuideline);
    @NotNull Builder guideline(@NotNull MedicalGuideline.Builder medicalGuideline);
    @NotNull Builder medicineSystem(@NotNull MedicineSystem medicineSystem);
    @NotNull Builder medicineSystem(@NotNull MedicineSystem.Builder medicineSystem);
    @NotNull Builder recognizingAuthority(@NotNull Organization organization);
    @NotNull Builder recognizingAuthority(@NotNull Organization.Builder organization);
    @NotNull Builder relevantSpecialty(@NotNull MedicalSpecialty medicalSpecialty);
    @NotNull Builder relevantSpecialty(@NotNull MedicalSpecialty.Builder medicalSpecialty);
    @NotNull Builder study(@NotNull MedicalStudy medicalStudy);
    @NotNull Builder study(@NotNull MedicalStudy.Builder medicalStudy);
    @NotNull Builder additionalType(@NotNull String additionalType);
    @NotNull Builder alternateName(@NotNull String alternateName);
    @NotNull Builder description(@NotNull String description);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull String mainEntityOfPage);
    @NotNull Builder name(@NotNull String name);
    @NotNull Builder sameAs(@NotNull String sameAs);
    @NotNull Builder url(@NotNull String url);
    @NotNull Builder potentialAction(@NotNull Action action);
    @NotNull Builder potentialAction(@NotNull Action.Builder action);
    @NotNull Builder id(@NotNull String id);
  }

  protected MedicalDevice(MedicalEntity adverseOutcome, MedicalContraindication contraindication, MedicalIndication indication, String postOp, String preOp, String procedure, MedicalDevicePurposeOrThing purpose, MedicalEntity seriousAdverseOutcome, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myAdverseOutcome = adverseOutcome;
    myContraindication = contraindication;
    myIndication = indication;
    myPostOp = postOp;
    myPreOp = preOp;
    myProcedure = procedure;
    myPurpose = purpose;
    mySeriousAdverseOutcome = seriousAdverseOutcome;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myAdverseOutcome != null ? myAdverseOutcome.hashCode() : 0);
    result = 31 * result + (myContraindication != null ? myContraindication.hashCode() : 0);
    result = 31 * result + (myIndication != null ? myIndication.hashCode() : 0);
    result = 31 * result + (myPostOp != null ? myPostOp.hashCode() : 0);
    result = 31 * result + (myPreOp != null ? myPreOp.hashCode() : 0);
    result = 31 * result + (myProcedure != null ? myProcedure.hashCode() : 0);
    result = 31 * result + (myPurpose != null ? myPurpose.hashCode() : 0);
    result = 31 * result + (mySeriousAdverseOutcome != null ? mySeriousAdverseOutcome.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MedicalDevice medicalDevice = (MedicalDevice) o;
    if (!super.equals(o)) return false;
    if (myAdverseOutcome != null ? !myAdverseOutcome.equals(medicalDevice.myAdverseOutcome) : medicalDevice.myAdverseOutcome != null) return false;
    if (myContraindication != null ? !myContraindication.equals(medicalDevice.myContraindication) : medicalDevice.myContraindication != null) return false;
    if (myIndication != null ? !myIndication.equals(medicalDevice.myIndication) : medicalDevice.myIndication != null) return false;
    if (myPostOp != null ? !myPostOp.equals(medicalDevice.myPostOp) : medicalDevice.myPostOp != null) return false;
    if (myPreOp != null ? !myPreOp.equals(medicalDevice.myPreOp) : medicalDevice.myPreOp != null) return false;
    if (myProcedure != null ? !myProcedure.equals(medicalDevice.myProcedure) : medicalDevice.myProcedure != null) return false;
    if (myPurpose != null ? !myPurpose.equals(medicalDevice.myPurpose) : medicalDevice.myPurpose != null) return false;
    if (mySeriousAdverseOutcome != null ? !mySeriousAdverseOutcome.equals(medicalDevice.mySeriousAdverseOutcome) : medicalDevice.mySeriousAdverseOutcome != null) return false;
    return true;
  }

  private MedicalEntity myAdverseOutcome;
  private MedicalContraindication myContraindication;
  private MedicalIndication myIndication;
  private String myPostOp;
  private String myPreOp;
  private String myProcedure;
  private MedicalDevicePurposeOrThing myPurpose;
  private MedicalEntity mySeriousAdverseOutcome;
}
