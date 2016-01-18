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
 * A strategy of regulating the intake of food to achieve or maintain a specific health-related goal.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class Diet extends LifestyleModification {
  /**
   * Nutritional information specific to the dietary plan. May include dietary recommendations on what foods to avoid, what foods to consume, and specific alterations/deviations from the USDA or other regulatory body's approved dietary guidelines.
   */
  public String getDietFeatures() {
    return myDietFeatures;
  }
  /**
   * People or organizations that endorse the plan.
   */
  public OrganizationOrPerson getEndorsers() {
    return myEndorsers;
  }
  /**
   * Medical expert advice related to the plan.
   */
  public String getExpertConsiderations() {
    return myExpertConsiderations;
  }
  /**
   * Descriptive information establishing the overarching theory/philosophy of the plan. May include the rationale for the name, the population where the plan first came to prominence, etc.
   */
  public String getOverview() {
    return myOverview;
  }
  /**
   * Specific physiologic benefits associated to the plan.
   */
  public String getPhysiologicalBenefits() {
    return myPhysiologicalBenefits;
  }
  /**
   * Proprietary name given to the diet plan, typically by its originator or creator.
   */
  public String getProprietaryName() {
    return myProprietaryName;
  }
  /**
   * Specific physiologic risks associated to the plan.
   */
  public String getRisks() {
    return myRisks;
  }
  /**
   * Builder for {@link Diet}
   */
  static final class DietThingBuilder implements Builder {
    /**
     * Creates new {@link Diet} instance.
     */
    public Diet build() {
      return new Diet(dietFeatures, endorsers, expertConsiderations, overview, physiologicalBenefits, proprietaryName, risks, adverseOutcome, contraindication, duplicateTherapy, indication, seriousAdverseOutcome, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Nutritional information specific to the dietary plan. May include dietary recommendations on what foods to avoid, what foods to consume, and specific alterations/deviations from the USDA or other regulatory body's approved dietary guidelines.
     */
    @NotNull public Builder dietFeatures(String dietFeatures) {
      this.dietFeatures = dietFeatures;
      return this;
    }
    /**
     * People or organizations that endorse the plan.
     */
    @NotNull public Builder endorsers(Organization organization) {
      if (this.endorsers == null) this.endorsers = new OrganizationOrPerson();
      this.endorsers.setOrganization(organization);
      return this;
    }
    /**
     * People or organizations that endorse the plan.
     */
    @NotNull public Builder endorsers(Organization.Builder organization) {
      return this.endorsers(organization.build());
    }
    /**
     * People or organizations that endorse the plan.
     */
    @NotNull public Builder endorsers(Person person) {
      if (this.endorsers == null) this.endorsers = new OrganizationOrPerson();
      this.endorsers.setPerson(person);
      return this;
    }
    /**
     * People or organizations that endorse the plan.
     */
    @NotNull public Builder endorsers(Person.Builder person) {
      return this.endorsers(person.build());
    }
    /**
     * Medical expert advice related to the plan.
     */
    @NotNull public Builder expertConsiderations(String expertConsiderations) {
      this.expertConsiderations = expertConsiderations;
      return this;
    }
    /**
     * Descriptive information establishing the overarching theory/philosophy of the plan. May include the rationale for the name, the population where the plan first came to prominence, etc.
     */
    @NotNull public Builder overview(String overview) {
      this.overview = overview;
      return this;
    }
    /**
     * Specific physiologic benefits associated to the plan.
     */
    @NotNull public Builder physiologicalBenefits(String physiologicalBenefits) {
      this.physiologicalBenefits = physiologicalBenefits;
      return this;
    }
    /**
     * Proprietary name given to the diet plan, typically by its originator or creator.
     */
    @NotNull public Builder proprietaryName(String proprietaryName) {
      this.proprietaryName = proprietaryName;
      return this;
    }
    /**
     * Specific physiologic risks associated to the plan.
     */
    @NotNull public Builder risks(String risks) {
      this.risks = risks;
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    @NotNull public Builder adverseOutcome(MedicalEntity medicalEntity) {
      this.adverseOutcome = medicalEntity;
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    @NotNull public Builder adverseOutcome(MedicalEntity.Builder medicalEntity) {
      return this.adverseOutcome(medicalEntity.build());
    }
    /**
     * A contraindication for this therapy.
     */
    @NotNull public Builder contraindication(MedicalContraindication medicalContraindication) {
      this.contraindication = medicalContraindication;
      return this;
    }
    /**
     * A contraindication for this therapy.
     */
    @NotNull public Builder contraindication(MedicalContraindication.Builder medicalContraindication) {
      return this.contraindication(medicalContraindication.build());
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    @NotNull public Builder duplicateTherapy(MedicalTherapy medicalTherapy) {
      this.duplicateTherapy = medicalTherapy;
      return this;
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    @NotNull public Builder duplicateTherapy(MedicalTherapy.Builder medicalTherapy) {
      return this.duplicateTherapy(medicalTherapy.build());
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    @NotNull public Builder indication(MedicalIndication medicalIndication) {
      this.indication = medicalIndication;
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    @NotNull public Builder indication(MedicalIndication.Builder medicalIndication) {
      return this.indication(medicalIndication.build());
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @NotNull public Builder seriousAdverseOutcome(MedicalEntity medicalEntity) {
      this.seriousAdverseOutcome = medicalEntity;
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @NotNull public Builder seriousAdverseOutcome(MedicalEntity.Builder medicalEntity) {
      return this.seriousAdverseOutcome(medicalEntity.build());
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(MedicalCode medicalCode) {
      this.code = medicalCode;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(MedicalCode.Builder medicalCode) {
      return this.code(medicalCode.build());
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(MedicalGuideline medicalGuideline) {
      this.guideline = medicalGuideline;
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(MedicalGuideline.Builder medicalGuideline) {
      return this.guideline(medicalGuideline.build());
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(MedicineSystem medicineSystem) {
      this.medicineSystem = medicineSystem;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(MedicineSystem.Builder medicineSystem) {
      return this.medicineSystem(medicineSystem.build());
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(Organization organization) {
      this.recognizingAuthority = organization;
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(Organization.Builder organization) {
      return this.recognizingAuthority(organization.build());
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(MedicalSpecialty medicalSpecialty) {
      this.relevantSpecialty = medicalSpecialty;
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(MedicalSpecialty.Builder medicalSpecialty) {
      return this.relevantSpecialty(medicalSpecialty.build());
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(MedicalStudy medicalStudy) {
      this.study = medicalStudy;
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(MedicalStudy.Builder medicalStudy) {
      return this.study(medicalStudy.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(String description) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private String dietFeatures;
    private OrganizationOrPerson endorsers;
    private String expertConsiderations;
    private String overview;
    private String physiologicalBenefits;
    private String proprietaryName;
    private String risks;
    private MedicalEntity adverseOutcome;
    private MedicalContraindication contraindication;
    private MedicalTherapy duplicateTherapy;
    private MedicalIndication indication;
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
  public interface Builder extends ThingBuilder<Diet> {
    @NotNull Builder dietFeatures(String dietFeatures);
    @NotNull Builder endorsers(Organization organization);
    @NotNull Builder endorsers(Organization.Builder organization);
    @NotNull Builder endorsers(Person person);
    @NotNull Builder endorsers(Person.Builder person);
    @NotNull Builder expertConsiderations(String expertConsiderations);
    @NotNull Builder overview(String overview);
    @NotNull Builder physiologicalBenefits(String physiologicalBenefits);
    @NotNull Builder proprietaryName(String proprietaryName);
    @NotNull Builder risks(String risks);
    @NotNull Builder adverseOutcome(MedicalEntity medicalEntity);
    @NotNull Builder adverseOutcome(MedicalEntity.Builder medicalEntity);
    @NotNull Builder contraindication(MedicalContraindication medicalContraindication);
    @NotNull Builder contraindication(MedicalContraindication.Builder medicalContraindication);
    @NotNull Builder duplicateTherapy(MedicalTherapy medicalTherapy);
    @NotNull Builder duplicateTherapy(MedicalTherapy.Builder medicalTherapy);
    @NotNull Builder indication(MedicalIndication medicalIndication);
    @NotNull Builder indication(MedicalIndication.Builder medicalIndication);
    @NotNull Builder seriousAdverseOutcome(MedicalEntity medicalEntity);
    @NotNull Builder seriousAdverseOutcome(MedicalEntity.Builder medicalEntity);
    @NotNull Builder code(MedicalCode medicalCode);
    @NotNull Builder code(MedicalCode.Builder medicalCode);
    @NotNull Builder guideline(MedicalGuideline medicalGuideline);
    @NotNull Builder guideline(MedicalGuideline.Builder medicalGuideline);
    @NotNull Builder medicineSystem(MedicineSystem medicineSystem);
    @NotNull Builder medicineSystem(MedicineSystem.Builder medicineSystem);
    @NotNull Builder recognizingAuthority(Organization organization);
    @NotNull Builder recognizingAuthority(Organization.Builder organization);
    @NotNull Builder relevantSpecialty(MedicalSpecialty medicalSpecialty);
    @NotNull Builder relevantSpecialty(MedicalSpecialty.Builder medicalSpecialty);
    @NotNull Builder study(MedicalStudy medicalStudy);
    @NotNull Builder study(MedicalStudy.Builder medicalStudy);
    @NotNull Builder additionalType(String additionalType);
    @NotNull Builder alternateName(String alternateName);
    @NotNull Builder description(String description);
    @NotNull Builder mainEntityOfPage(CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(String mainEntityOfPage);
    @NotNull Builder name(String name);
    @NotNull Builder sameAs(String sameAs);
    @NotNull Builder url(String url);
    @NotNull Builder potentialAction(Action action);
    @NotNull Builder potentialAction(Action.Builder action);
    @NotNull Builder id(String id);
  }

  protected Diet(String dietFeatures, OrganizationOrPerson endorsers, String expertConsiderations, String overview, String physiologicalBenefits, String proprietaryName, String risks, MedicalEntity adverseOutcome, MedicalContraindication contraindication, MedicalTherapy duplicateTherapy, MedicalIndication indication, MedicalEntity seriousAdverseOutcome, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(adverseOutcome, contraindication, duplicateTherapy, indication, seriousAdverseOutcome, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myDietFeatures = dietFeatures;
    myEndorsers = endorsers;
    myExpertConsiderations = expertConsiderations;
    myOverview = overview;
    myPhysiologicalBenefits = physiologicalBenefits;
    myProprietaryName = proprietaryName;
    myRisks = risks;
  }
  private String myDietFeatures;
  private OrganizationOrPerson myEndorsers;
  private String myExpertConsiderations;
  private String myOverview;
  private String myPhysiologicalBenefits;
  private String myProprietaryName;
  private String myRisks;
}
