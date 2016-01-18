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
 * A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class Drug extends MedicalTherapy {
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   */
  public String getActiveIngredient() {
    return myActiveIngredient;
  }
  /**
   * A route by which this drug may be administered, e.g. 'oral'.
   */
  public String getAdministrationRoute() {
    return myAdministrationRoute;
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
   */
  public String getAlcoholWarning() {
    return myAlcoholWarning;
  }
  /**
   * An available dosage strength for the drug.
   */
  public DrugStrength getAvailableStrength() {
    return myAvailableStrength;
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
   */
  public String getBreastfeedingWarning() {
    return myBreastfeedingWarning;
  }
  /**
   * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
   */
  public String getClinicalPharmacology() {
    return myClinicalPharmacology;
  }
  /**
   * Cost per unit of the drug, as reported by the source being tagged.
   */
  public DrugCost getCost() {
    return myCost;
  }
  /**
   * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
   */
  public String getDosageForm() {
    return myDosageForm;
  }
  /**
   * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
   */
  public DoseSchedule getDoseSchedule() {
    return myDoseSchedule;
  }
  /**
   * The class of drug this belongs to (e.g., statins).
   */
  public DrugClass getDrugClass() {
    return myDrugClass;
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
   */
  public String getFoodWarning() {
    return myFoodWarning;
  }
  /**
   * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
   */
  public Drug getInteractingDrug() {
    return myInteractingDrug;
  }
  /**
   * True if the drug is available in a generic form (regardless of name).
   */
  public Boolean getIsAvailableGenerically() {
    return myIsAvailableGenerically;
  }
  /**
   * True if this item's name is a proprietary/brand name (vs. generic name).
   */
  public Boolean getIsProprietary() {
    return myIsProprietary;
  }
  /**
   * Link to the drug's label details.
   */
  public String getLabelDetails() {
    return myLabelDetails;
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  public DrugLegalStatus getLegalStatus() {
    return myLegalStatus;
  }
  /**
   * The manufacturer of the product.
   */
  public Organization getManufacturer() {
    return myManufacturer;
  }
  /**
   * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
   */
  public String getMechanismOfAction() {
    return myMechanismOfAction;
  }
  /**
   * The generic name of this drug or supplement.
   */
  public String getNonProprietaryName() {
    return myNonProprietaryName;
  }
  /**
   * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
   */
  public String getOverdosage() {
    return myOverdosage;
  }
  /**
   * Pregnancy category of this drug.
   */
  public DrugPregnancyCategory getPregnancyCategory() {
    return myPregnancyCategory;
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
   */
  public String getPregnancyWarning() {
    return myPregnancyWarning;
  }
  /**
   * Link to prescribing information for the drug.
   */
  public String getPrescribingInfo() {
    return myPrescribingInfo;
  }
  /**
   * Indicates whether this drug is available by prescription or over-the-counter.
   */
  public DrugPrescriptionStatus getPrescriptionStatus() {
    return myPrescriptionStatus;
  }
  /**
   * Any other drug related to this one, for example commonly-prescribed alternatives.
   */
  public Drug getRelatedDrug() {
    return myRelatedDrug;
  }
  /**
   * Any FDA or other warnings about the drug (text or URL).
   */
  public String getWarning() {
    return myWarning;
  }
  /**
   * Builder for {@link Drug}
   */
  static final class DrugThingBuilder implements Builder {
    /**
     * Creates new {@link Drug} instance.
     */
    public Drug build() {
      return new Drug(activeIngredient, administrationRoute, alcoholWarning, availableStrength, breastfeedingWarning, clinicalPharmacology, cost, dosageForm, doseSchedule, drugClass, foodWarning, interactingDrug, isAvailableGenerically, isProprietary, labelDetails, legalStatus, manufacturer, mechanismOfAction, nonProprietaryName, overdosage, pregnancyCategory, pregnancyWarning, prescribingInfo, prescriptionStatus, relatedDrug, warning, adverseOutcome, contraindication, duplicateTherapy, indication, seriousAdverseOutcome, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     */
    @NotNull public Builder activeIngredient(String activeIngredient) {
      this.activeIngredient = activeIngredient;
      return this;
    }
    /**
     * A route by which this drug may be administered, e.g. 'oral'.
     */
    @NotNull public Builder administrationRoute(String administrationRoute) {
      this.administrationRoute = administrationRoute;
      return this;
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
     */
    @NotNull public Builder alcoholWarning(String alcoholWarning) {
      this.alcoholWarning = alcoholWarning;
      return this;
    }
    /**
     * An available dosage strength for the drug.
     */
    @NotNull public Builder availableStrength(DrugStrength drugStrength) {
      this.availableStrength = drugStrength;
      return this;
    }
    /**
     * An available dosage strength for the drug.
     */
    @NotNull public Builder availableStrength(DrugStrength.Builder drugStrength) {
      return this.availableStrength(drugStrength.build());
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
     */
    @NotNull public Builder breastfeedingWarning(String breastfeedingWarning) {
      this.breastfeedingWarning = breastfeedingWarning;
      return this;
    }
    /**
     * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
     */
    @NotNull public Builder clinicalPharmacology(String clinicalPharmacology) {
      this.clinicalPharmacology = clinicalPharmacology;
      return this;
    }
    /**
     * Cost per unit of the drug, as reported by the source being tagged.
     */
    @NotNull public Builder cost(DrugCost drugCost) {
      this.cost = drugCost;
      return this;
    }
    /**
     * Cost per unit of the drug, as reported by the source being tagged.
     */
    @NotNull public Builder cost(DrugCost.Builder drugCost) {
      return this.cost(drugCost.build());
    }
    /**
     * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
     */
    @NotNull public Builder dosageForm(String dosageForm) {
      this.dosageForm = dosageForm;
      return this;
    }
    /**
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     */
    @NotNull public Builder doseSchedule(DoseSchedule doseSchedule) {
      this.doseSchedule = doseSchedule;
      return this;
    }
    /**
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     */
    @NotNull public Builder doseSchedule(DoseSchedule.Builder doseSchedule) {
      return this.doseSchedule(doseSchedule.build());
    }
    /**
     * The class of drug this belongs to (e.g., statins).
     */
    @NotNull public Builder drugClass(DrugClass drugClass) {
      this.drugClass = drugClass;
      return this;
    }
    /**
     * The class of drug this belongs to (e.g., statins).
     */
    @NotNull public Builder drugClass(DrugClass.Builder drugClass) {
      return this.drugClass(drugClass.build());
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
     */
    @NotNull public Builder foodWarning(String foodWarning) {
      this.foodWarning = foodWarning;
      return this;
    }
    /**
     * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
     */
    @NotNull public Builder interactingDrug(Drug drug) {
      this.interactingDrug = drug;
      return this;
    }
    /**
     * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
     */
    @NotNull public Builder interactingDrug(Drug.Builder drug) {
      return this.interactingDrug(drug.build());
    }
    /**
     * True if the drug is available in a generic form (regardless of name).
     */
    @NotNull public Builder isAvailableGenerically(Boolean isAvailableGenerically) {
      this.isAvailableGenerically = isAvailableGenerically;
      return this;
    }
    /**
     * True if this item's name is a proprietary/brand name (vs. generic name).
     */
    @NotNull public Builder isProprietary(Boolean isProprietary) {
      this.isProprietary = isProprietary;
      return this;
    }
    /**
     * Link to the drug's label details.
     */
    @NotNull public Builder labelDetails(String labelDetails) {
      this.labelDetails = labelDetails;
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    @NotNull public Builder legalStatus(DrugLegalStatus drugLegalStatus) {
      this.legalStatus = drugLegalStatus;
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    @NotNull public Builder legalStatus(DrugLegalStatus.Builder drugLegalStatus) {
      return this.legalStatus(drugLegalStatus.build());
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(Organization organization) {
      this.manufacturer = organization;
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(Organization.Builder organization) {
      return this.manufacturer(organization.build());
    }
    /**
     * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
     */
    @NotNull public Builder mechanismOfAction(String mechanismOfAction) {
      this.mechanismOfAction = mechanismOfAction;
      return this;
    }
    /**
     * The generic name of this drug or supplement.
     */
    @NotNull public Builder nonProprietaryName(String nonProprietaryName) {
      this.nonProprietaryName = nonProprietaryName;
      return this;
    }
    /**
     * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
     */
    @NotNull public Builder overdosage(String overdosage) {
      this.overdosage = overdosage;
      return this;
    }
    /**
     * Pregnancy category of this drug.
     */
    @NotNull public Builder pregnancyCategory(DrugPregnancyCategory drugPregnancyCategory) {
      this.pregnancyCategory = drugPregnancyCategory;
      return this;
    }
    /**
     * Pregnancy category of this drug.
     */
    @NotNull public Builder pregnancyCategory(DrugPregnancyCategory.Builder drugPregnancyCategory) {
      return this.pregnancyCategory(drugPregnancyCategory.build());
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
     */
    @NotNull public Builder pregnancyWarning(String pregnancyWarning) {
      this.pregnancyWarning = pregnancyWarning;
      return this;
    }
    /**
     * Link to prescribing information for the drug.
     */
    @NotNull public Builder prescribingInfo(String prescribingInfo) {
      this.prescribingInfo = prescribingInfo;
      return this;
    }
    /**
     * Indicates whether this drug is available by prescription or over-the-counter.
     */
    @NotNull public Builder prescriptionStatus(DrugPrescriptionStatus drugPrescriptionStatus) {
      this.prescriptionStatus = drugPrescriptionStatus;
      return this;
    }
    /**
     * Indicates whether this drug is available by prescription or over-the-counter.
     */
    @NotNull public Builder prescriptionStatus(DrugPrescriptionStatus.Builder drugPrescriptionStatus) {
      return this.prescriptionStatus(drugPrescriptionStatus.build());
    }
    /**
     * Any other drug related to this one, for example commonly-prescribed alternatives.
     */
    @NotNull public Builder relatedDrug(Drug drug) {
      this.relatedDrug = drug;
      return this;
    }
    /**
     * Any other drug related to this one, for example commonly-prescribed alternatives.
     */
    @NotNull public Builder relatedDrug(Drug.Builder drug) {
      return this.relatedDrug(drug.build());
    }
    /**
     * Any FDA or other warnings about the drug (text or URL).
     */
    @NotNull public Builder warning(String warning) {
      this.warning = warning;
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
    private String activeIngredient;
    private String administrationRoute;
    private String alcoholWarning;
    private DrugStrength availableStrength;
    private String breastfeedingWarning;
    private String clinicalPharmacology;
    private DrugCost cost;
    private String dosageForm;
    private DoseSchedule doseSchedule;
    private DrugClass drugClass;
    private String foodWarning;
    private Drug interactingDrug;
    private Boolean isAvailableGenerically;
    private Boolean isProprietary;
    private String labelDetails;
    private DrugLegalStatus legalStatus;
    private Organization manufacturer;
    private String mechanismOfAction;
    private String nonProprietaryName;
    private String overdosage;
    private DrugPregnancyCategory pregnancyCategory;
    private String pregnancyWarning;
    private String prescribingInfo;
    private DrugPrescriptionStatus prescriptionStatus;
    private Drug relatedDrug;
    private String warning;
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
  public interface Builder extends ThingBuilder<Drug> {
    @NotNull Builder activeIngredient(String activeIngredient);
    @NotNull Builder administrationRoute(String administrationRoute);
    @NotNull Builder alcoholWarning(String alcoholWarning);
    @NotNull Builder availableStrength(DrugStrength drugStrength);
    @NotNull Builder availableStrength(DrugStrength.Builder drugStrength);
    @NotNull Builder breastfeedingWarning(String breastfeedingWarning);
    @NotNull Builder clinicalPharmacology(String clinicalPharmacology);
    @NotNull Builder cost(DrugCost drugCost);
    @NotNull Builder cost(DrugCost.Builder drugCost);
    @NotNull Builder dosageForm(String dosageForm);
    @NotNull Builder doseSchedule(DoseSchedule doseSchedule);
    @NotNull Builder doseSchedule(DoseSchedule.Builder doseSchedule);
    @NotNull Builder drugClass(DrugClass drugClass);
    @NotNull Builder drugClass(DrugClass.Builder drugClass);
    @NotNull Builder foodWarning(String foodWarning);
    @NotNull Builder interactingDrug(Drug drug);
    @NotNull Builder interactingDrug(Drug.Builder drug);
    @NotNull Builder isAvailableGenerically(Boolean isAvailableGenerically);
    @NotNull Builder isProprietary(Boolean isProprietary);
    @NotNull Builder labelDetails(String labelDetails);
    @NotNull Builder legalStatus(DrugLegalStatus drugLegalStatus);
    @NotNull Builder legalStatus(DrugLegalStatus.Builder drugLegalStatus);
    @NotNull Builder manufacturer(Organization organization);
    @NotNull Builder manufacturer(Organization.Builder organization);
    @NotNull Builder mechanismOfAction(String mechanismOfAction);
    @NotNull Builder nonProprietaryName(String nonProprietaryName);
    @NotNull Builder overdosage(String overdosage);
    @NotNull Builder pregnancyCategory(DrugPregnancyCategory drugPregnancyCategory);
    @NotNull Builder pregnancyCategory(DrugPregnancyCategory.Builder drugPregnancyCategory);
    @NotNull Builder pregnancyWarning(String pregnancyWarning);
    @NotNull Builder prescribingInfo(String prescribingInfo);
    @NotNull Builder prescriptionStatus(DrugPrescriptionStatus drugPrescriptionStatus);
    @NotNull Builder prescriptionStatus(DrugPrescriptionStatus.Builder drugPrescriptionStatus);
    @NotNull Builder relatedDrug(Drug drug);
    @NotNull Builder relatedDrug(Drug.Builder drug);
    @NotNull Builder warning(String warning);
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

  protected Drug(String activeIngredient, String administrationRoute, String alcoholWarning, DrugStrength availableStrength, String breastfeedingWarning, String clinicalPharmacology, DrugCost cost, String dosageForm, DoseSchedule doseSchedule, DrugClass drugClass, String foodWarning, Drug interactingDrug, Boolean isAvailableGenerically, Boolean isProprietary, String labelDetails, DrugLegalStatus legalStatus, Organization manufacturer, String mechanismOfAction, String nonProprietaryName, String overdosage, DrugPregnancyCategory pregnancyCategory, String pregnancyWarning, String prescribingInfo, DrugPrescriptionStatus prescriptionStatus, Drug relatedDrug, String warning, MedicalEntity adverseOutcome, MedicalContraindication contraindication, MedicalTherapy duplicateTherapy, MedicalIndication indication, MedicalEntity seriousAdverseOutcome, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(adverseOutcome, contraindication, duplicateTherapy, indication, seriousAdverseOutcome, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myActiveIngredient = activeIngredient;
    myAdministrationRoute = administrationRoute;
    myAlcoholWarning = alcoholWarning;
    myAvailableStrength = availableStrength;
    myBreastfeedingWarning = breastfeedingWarning;
    myClinicalPharmacology = clinicalPharmacology;
    myCost = cost;
    myDosageForm = dosageForm;
    myDoseSchedule = doseSchedule;
    myDrugClass = drugClass;
    myFoodWarning = foodWarning;
    myInteractingDrug = interactingDrug;
    myIsAvailableGenerically = isAvailableGenerically;
    myIsProprietary = isProprietary;
    myLabelDetails = labelDetails;
    myLegalStatus = legalStatus;
    myManufacturer = manufacturer;
    myMechanismOfAction = mechanismOfAction;
    myNonProprietaryName = nonProprietaryName;
    myOverdosage = overdosage;
    myPregnancyCategory = pregnancyCategory;
    myPregnancyWarning = pregnancyWarning;
    myPrescribingInfo = prescribingInfo;
    myPrescriptionStatus = prescriptionStatus;
    myRelatedDrug = relatedDrug;
    myWarning = warning;
  }
  private String myActiveIngredient;
  private String myAdministrationRoute;
  private String myAlcoholWarning;
  private DrugStrength myAvailableStrength;
  private String myBreastfeedingWarning;
  private String myClinicalPharmacology;
  private DrugCost myCost;
  private String myDosageForm;
  private DoseSchedule myDoseSchedule;
  private DrugClass myDrugClass;
  private String myFoodWarning;
  private Drug myInteractingDrug;
  private Boolean myIsAvailableGenerically;
  private Boolean myIsProprietary;
  private String myLabelDetails;
  private DrugLegalStatus myLegalStatus;
  private Organization myManufacturer;
  private String myMechanismOfAction;
  private String myNonProprietaryName;
  private String myOverdosage;
  private DrugPregnancyCategory myPregnancyCategory;
  private String myPregnancyWarning;
  private String myPrescribingInfo;
  private DrugPrescriptionStatus myPrescriptionStatus;
  private Drug myRelatedDrug;
  private String myWarning;
}
