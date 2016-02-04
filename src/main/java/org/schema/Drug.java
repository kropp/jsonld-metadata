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
import org.jetbrains.annotations.NotNull;
import java.util.*;

/**
 * A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class Drug extends MedicalTherapy {
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   */
  @JsonIgnore public String getActiveIngredient() {
    return (String) getValue("activeIngredient");
  }
  /**
   * An active ingredient, typically chemical compounds and/or biologic substances.
   */
  @JsonIgnore public Collection<String> getActiveIngredients() {
    final Object current = myData.get("activeIngredient");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A route by which this drug may be administered, e.g. 'oral'.
   */
  @JsonIgnore public String getAdministrationRoute() {
    return (String) getValue("administrationRoute");
  }
  /**
   * A route by which this drug may be administered, e.g. 'oral'.
   */
  @JsonIgnore public Collection<String> getAdministrationRoutes() {
    final Object current = myData.get("administrationRoute");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
   */
  @JsonIgnore public String getAlcoholWarning() {
    return (String) getValue("alcoholWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
   */
  @JsonIgnore public Collection<String> getAlcoholWarnings() {
    final Object current = myData.get("alcoholWarning");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An available dosage strength for the drug.
   */
  @JsonIgnore public DrugStrength getAvailableStrength() {
    return (DrugStrength) getValue("availableStrength");
  }
  /**
   * An available dosage strength for the drug.
   */
  @JsonIgnore public Collection<DrugStrength> getAvailableStrengths() {
    final Object current = myData.get("availableStrength");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DrugStrength>) current;
    }
    return Arrays.asList((DrugStrength) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
   */
  @JsonIgnore public String getBreastfeedingWarning() {
    return (String) getValue("breastfeedingWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
   */
  @JsonIgnore public Collection<String> getBreastfeedingWarnings() {
    final Object current = myData.get("breastfeedingWarning");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
   */
  @JsonIgnore public String getClinicalPharmacology() {
    return (String) getValue("clinicalPharmacology");
  }
  /**
   * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
   */
  @JsonIgnore public Collection<String> getClinicalPharmacologys() {
    final Object current = myData.get("clinicalPharmacology");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Cost per unit of the drug, as reported by the source being tagged.
   */
  @JsonIgnore public DrugCost getCost() {
    return (DrugCost) getValue("cost");
  }
  /**
   * Cost per unit of the drug, as reported by the source being tagged.
   */
  @JsonIgnore public Collection<DrugCost> getCosts() {
    final Object current = myData.get("cost");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DrugCost>) current;
    }
    return Arrays.asList((DrugCost) current);
  }
  /**
   * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
   */
  @JsonIgnore public String getDosageForm() {
    return (String) getValue("dosageForm");
  }
  /**
   * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
   */
  @JsonIgnore public Collection<String> getDosageForms() {
    final Object current = myData.get("dosageForm");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
   */
  @JsonIgnore public DoseSchedule getDoseSchedule() {
    return (DoseSchedule) getValue("doseSchedule");
  }
  /**
   * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
   */
  @JsonIgnore public Collection<DoseSchedule> getDoseSchedules() {
    final Object current = myData.get("doseSchedule");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DoseSchedule>) current;
    }
    return Arrays.asList((DoseSchedule) current);
  }
  /**
   * The class of drug this belongs to (e.g., statins).
   */
  @JsonIgnore public DrugClass getDrugClass() {
    return (DrugClass) getValue("drugClass");
  }
  /**
   * The class of drug this belongs to (e.g., statins).
   */
  @JsonIgnore public Collection<DrugClass> getDrugClasss() {
    final Object current = myData.get("drugClass");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DrugClass>) current;
    }
    return Arrays.asList((DrugClass) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
   */
  @JsonIgnore public String getFoodWarning() {
    return (String) getValue("foodWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
   */
  @JsonIgnore public Collection<String> getFoodWarnings() {
    final Object current = myData.get("foodWarning");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
   */
  @JsonIgnore public Drug getInteractingDrug() {
    return (Drug) getValue("interactingDrug");
  }
  /**
   * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
   */
  @JsonIgnore public Collection<Drug> getInteractingDrugs() {
    final Object current = myData.get("interactingDrug");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Drug>) current;
    }
    return Arrays.asList((Drug) current);
  }
  /**
   * True if the drug is available in a generic form (regardless of name).
   */
  @JsonIgnore public Boolean getIsAvailableGenerically() {
    return (Boolean) getValue("isAvailableGenerically");
  }
  /**
   * True if the drug is available in a generic form (regardless of name).
   */
  @JsonIgnore public Collection<Boolean> getIsAvailableGenericallys() {
    final Object current = myData.get("isAvailableGenerically");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * True if this item's name is a proprietary/brand name (vs. generic name).
   */
  @JsonIgnore public Boolean getIsProprietary() {
    return (Boolean) getValue("isProprietary");
  }
  /**
   * True if this item's name is a proprietary/brand name (vs. generic name).
   */
  @JsonIgnore public Collection<Boolean> getIsProprietarys() {
    final Object current = myData.get("isProprietary");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Link to the drug's label details.
   */
  @JsonIgnore public String getLabelDetails() {
    return (String) getValue("labelDetails");
  }
  /**
   * Link to the drug's label details.
   */
  @JsonIgnore public Collection<String> getLabelDetailss() {
    final Object current = myData.get("labelDetails");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  @JsonIgnore public DrugLegalStatus getLegalStatus() {
    return (DrugLegalStatus) getValue("legalStatus");
  }
  /**
   * The drug or supplement's legal status, including any controlled substance schedules that apply.
   */
  @JsonIgnore public Collection<DrugLegalStatus> getLegalStatuss() {
    final Object current = myData.get("legalStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DrugLegalStatus>) current;
    }
    return Arrays.asList((DrugLegalStatus) current);
  }
  /**
   * The manufacturer of the product.
   */
  @JsonIgnore public Organization getManufacturer() {
    return (Organization) getValue("manufacturer");
  }
  /**
   * The manufacturer of the product.
   */
  @JsonIgnore public Collection<Organization> getManufacturers() {
    final Object current = myData.get("manufacturer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
   */
  @JsonIgnore public String getMechanismOfAction() {
    return (String) getValue("mechanismOfAction");
  }
  /**
   * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
   */
  @JsonIgnore public Collection<String> getMechanismOfActions() {
    final Object current = myData.get("mechanismOfAction");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The generic name of this drug or supplement.
   */
  @JsonIgnore public String getNonProprietaryName() {
    return (String) getValue("nonProprietaryName");
  }
  /**
   * The generic name of this drug or supplement.
   */
  @JsonIgnore public Collection<String> getNonProprietaryNames() {
    final Object current = myData.get("nonProprietaryName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
   */
  @JsonIgnore public String getOverdosage() {
    return (String) getValue("overdosage");
  }
  /**
   * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
   */
  @JsonIgnore public Collection<String> getOverdosages() {
    final Object current = myData.get("overdosage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Pregnancy category of this drug.
   */
  @JsonIgnore public DrugPregnancyCategory getPregnancyCategory() {
    return (DrugPregnancyCategory) getValue("pregnancyCategory");
  }
  /**
   * Pregnancy category of this drug.
   */
  @JsonIgnore public Collection<DrugPregnancyCategory> getPregnancyCategorys() {
    final Object current = myData.get("pregnancyCategory");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DrugPregnancyCategory>) current;
    }
    return Arrays.asList((DrugPregnancyCategory) current);
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
   */
  @JsonIgnore public String getPregnancyWarning() {
    return (String) getValue("pregnancyWarning");
  }
  /**
   * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
   */
  @JsonIgnore public Collection<String> getPregnancyWarnings() {
    final Object current = myData.get("pregnancyWarning");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Link to prescribing information for the drug.
   */
  @JsonIgnore public String getPrescribingInfo() {
    return (String) getValue("prescribingInfo");
  }
  /**
   * Link to prescribing information for the drug.
   */
  @JsonIgnore public Collection<String> getPrescribingInfos() {
    final Object current = myData.get("prescribingInfo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates whether this drug is available by prescription or over-the-counter.
   */
  @JsonIgnore public DrugPrescriptionStatus getPrescriptionStatus() {
    return (DrugPrescriptionStatus) getValue("prescriptionStatus");
  }
  /**
   * Indicates whether this drug is available by prescription or over-the-counter.
   */
  @JsonIgnore public Collection<DrugPrescriptionStatus> getPrescriptionStatuss() {
    final Object current = myData.get("prescriptionStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DrugPrescriptionStatus>) current;
    }
    return Arrays.asList((DrugPrescriptionStatus) current);
  }
  /**
   * Any other drug related to this one, for example commonly-prescribed alternatives.
   */
  @JsonIgnore public Drug getRelatedDrug() {
    return (Drug) getValue("relatedDrug");
  }
  /**
   * Any other drug related to this one, for example commonly-prescribed alternatives.
   */
  @JsonIgnore public Collection<Drug> getRelatedDrugs() {
    final Object current = myData.get("relatedDrug");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Drug>) current;
    }
    return Arrays.asList((Drug) current);
  }
  /**
   * Any FDA or other warnings about the drug (text or URL).
   */
  @JsonIgnore public String getWarning() {
    return (String) getValue("warning");
  }
  /**
   * Any FDA or other warnings about the drug (text or URL).
   */
  @JsonIgnore public Collection<String> getWarnings() {
    final Object current = myData.get("warning");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Drug(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Drug}
   */
  public static class Builder extends MedicalTherapy.Builder {
    public Drug build() {
      return new Drug(myData);
    }
    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     */
    @NotNull public Builder activeIngredient(@NotNull String activeIngredient) {
      putValue("activeIngredient", activeIngredient);
      return this;
    }
    /**
     * A route by which this drug may be administered, e.g. 'oral'.
     */
    @NotNull public Builder administrationRoute(@NotNull String administrationRoute) {
      putValue("administrationRoute", administrationRoute);
      return this;
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.
     */
    @NotNull public Builder alcoholWarning(@NotNull String alcoholWarning) {
      putValue("alcoholWarning", alcoholWarning);
      return this;
    }
    /**
     * An available dosage strength for the drug.
     */
    @NotNull public Builder availableStrength(@NotNull DrugStrength drugStrength) {
      putValue("availableStrength", drugStrength);
      return this;
    }
    /**
     * An available dosage strength for the drug.
     */
    @NotNull public Builder availableStrength(@NotNull DrugStrength.Builder drugStrength) {
      putValue("availableStrength", drugStrength.build());
      return this;
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to this drug's use by breastfeeding mothers.
     */
    @NotNull public Builder breastfeedingWarning(@NotNull String breastfeedingWarning) {
      putValue("breastfeedingWarning", breastfeedingWarning);
      return this;
    }
    /**
     * Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).
     */
    @NotNull public Builder clinicalPharmacology(@NotNull String clinicalPharmacology) {
      putValue("clinicalPharmacology", clinicalPharmacology);
      return this;
    }
    /**
     * Cost per unit of the drug, as reported by the source being tagged.
     */
    @NotNull public Builder cost(@NotNull DrugCost drugCost) {
      putValue("cost", drugCost);
      return this;
    }
    /**
     * Cost per unit of the drug, as reported by the source being tagged.
     */
    @NotNull public Builder cost(@NotNull DrugCost.Builder drugCost) {
      putValue("cost", drugCost.build());
      return this;
    }
    /**
     * A dosage form in which this drug/supplement is available, e.g. 'tablet', 'suspension', 'injection'.
     */
    @NotNull public Builder dosageForm(@NotNull String dosageForm) {
      putValue("dosageForm", dosageForm);
      return this;
    }
    /**
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     */
    @NotNull public Builder doseSchedule(@NotNull DoseSchedule doseSchedule) {
      putValue("doseSchedule", doseSchedule);
      return this;
    }
    /**
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     */
    @NotNull public Builder doseSchedule(@NotNull DoseSchedule.Builder doseSchedule) {
      putValue("doseSchedule", doseSchedule.build());
      return this;
    }
    /**
     * The class of drug this belongs to (e.g., statins).
     */
    @NotNull public Builder drugClass(@NotNull DrugClass drugClass) {
      putValue("drugClass", drugClass);
      return this;
    }
    /**
     * The class of drug this belongs to (e.g., statins).
     */
    @NotNull public Builder drugClass(@NotNull DrugClass.Builder drugClass) {
      putValue("drugClass", drugClass.build());
      return this;
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.
     */
    @NotNull public Builder foodWarning(@NotNull String foodWarning) {
      putValue("foodWarning", foodWarning);
      return this;
    }
    /**
     * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
     */
    @NotNull public Builder interactingDrug(@NotNull Drug drug) {
      putValue("interactingDrug", drug);
      return this;
    }
    /**
     * Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.
     */
    @NotNull public Builder interactingDrug(@NotNull Drug.Builder drug) {
      putValue("interactingDrug", drug.build());
      return this;
    }
    /**
     * True if the drug is available in a generic form (regardless of name).
     */
    @NotNull public Builder isAvailableGenerically(@NotNull Boolean isAvailableGenerically) {
      putValue("isAvailableGenerically", isAvailableGenerically);
      return this;
    }
    /**
     * True if this item's name is a proprietary/brand name (vs. generic name).
     */
    @NotNull public Builder isProprietary(@NotNull Boolean isProprietary) {
      putValue("isProprietary", isProprietary);
      return this;
    }
    /**
     * Link to the drug's label details.
     */
    @NotNull public Builder labelDetails(@NotNull String labelDetails) {
      putValue("labelDetails", labelDetails);
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    @NotNull public Builder legalStatus(@NotNull DrugLegalStatus drugLegalStatus) {
      putValue("legalStatus", drugLegalStatus);
      return this;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    @NotNull public Builder legalStatus(@NotNull DrugLegalStatus.Builder drugLegalStatus) {
      putValue("legalStatus", drugLegalStatus.build());
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(@NotNull Organization organization) {
      putValue("manufacturer", organization);
      return this;
    }
    /**
     * The manufacturer of the product.
     */
    @NotNull public Builder manufacturer(@NotNull Organization.Builder organization) {
      putValue("manufacturer", organization.build());
      return this;
    }
    /**
     * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
     */
    @NotNull public Builder mechanismOfAction(@NotNull String mechanismOfAction) {
      putValue("mechanismOfAction", mechanismOfAction);
      return this;
    }
    /**
     * The generic name of this drug or supplement.
     */
    @NotNull public Builder nonProprietaryName(@NotNull String nonProprietaryName) {
      putValue("nonProprietaryName", nonProprietaryName);
      return this;
    }
    /**
     * Any information related to overdose on a drug, including signs or symptoms, treatments, contact information for emergency response.
     */
    @NotNull public Builder overdosage(@NotNull String overdosage) {
      putValue("overdosage", overdosage);
      return this;
    }
    /**
     * Pregnancy category of this drug.
     */
    @NotNull public Builder pregnancyCategory(@NotNull DrugPregnancyCategory drugPregnancyCategory) {
      putValue("pregnancyCategory", drugPregnancyCategory);
      return this;
    }
    /**
     * Pregnancy category of this drug.
     */
    @NotNull public Builder pregnancyCategory(@NotNull DrugPregnancyCategory.Builder drugPregnancyCategory) {
      putValue("pregnancyCategory", drugPregnancyCategory.build());
      return this;
    }
    /**
     * Any precaution, guidance, contraindication, etc. related to this drug's use during pregnancy.
     */
    @NotNull public Builder pregnancyWarning(@NotNull String pregnancyWarning) {
      putValue("pregnancyWarning", pregnancyWarning);
      return this;
    }
    /**
     * Link to prescribing information for the drug.
     */
    @NotNull public Builder prescribingInfo(@NotNull String prescribingInfo) {
      putValue("prescribingInfo", prescribingInfo);
      return this;
    }
    /**
     * Indicates whether this drug is available by prescription or over-the-counter.
     */
    @NotNull public Builder prescriptionStatus(@NotNull DrugPrescriptionStatus drugPrescriptionStatus) {
      putValue("prescriptionStatus", drugPrescriptionStatus);
      return this;
    }
    /**
     * Indicates whether this drug is available by prescription or over-the-counter.
     */
    @NotNull public Builder prescriptionStatus(@NotNull DrugPrescriptionStatus.Builder drugPrescriptionStatus) {
      putValue("prescriptionStatus", drugPrescriptionStatus.build());
      return this;
    }
    /**
     * Any other drug related to this one, for example commonly-prescribed alternatives.
     */
    @NotNull public Builder relatedDrug(@NotNull Drug drug) {
      putValue("relatedDrug", drug);
      return this;
    }
    /**
     * Any other drug related to this one, for example commonly-prescribed alternatives.
     */
    @NotNull public Builder relatedDrug(@NotNull Drug.Builder drug) {
      putValue("relatedDrug", drug.build());
      return this;
    }
    /**
     * Any FDA or other warnings about the drug (text or URL).
     */
    @NotNull public Builder warning(@NotNull String warning) {
      putValue("warning", warning);
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    @NotNull public Builder adverseOutcome(@NotNull MedicalEntity medicalEntity) {
      putValue("adverseOutcome", medicalEntity);
      return this;
    }
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or is otherwise life-threatening or requires immediate medical attention), tag it as a seriouseAdverseOutcome instead.
     */
    @NotNull public Builder adverseOutcome(@NotNull MedicalEntity.Builder medicalEntity) {
      putValue("adverseOutcome", medicalEntity.build());
      return this;
    }
    /**
     * A contraindication for this therapy.
     */
    @NotNull public Builder contraindication(@NotNull MedicalContraindication medicalContraindication) {
      putValue("contraindication", medicalContraindication);
      return this;
    }
    /**
     * A contraindication for this therapy.
     */
    @NotNull public Builder contraindication(@NotNull MedicalContraindication.Builder medicalContraindication) {
      putValue("contraindication", medicalContraindication.build());
      return this;
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    @NotNull public Builder duplicateTherapy(@NotNull MedicalTherapy medicalTherapy) {
      putValue("duplicateTherapy", medicalTherapy);
      return this;
    }
    /**
     * A therapy that duplicates or overlaps this one.
     */
    @NotNull public Builder duplicateTherapy(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("duplicateTherapy", medicalTherapy.build());
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    @NotNull public Builder indication(@NotNull MedicalIndication medicalIndication) {
      putValue("indication", medicalIndication);
      return this;
    }
    /**
     * A factor that indicates use of this therapy for treatment and/or prevention of a condition, symptom, etc. For therapies such as drugs, indications can include both officially-approved indications as well as off-label uses. These can be distinguished by using the ApprovedIndication subtype of MedicalIndication.
     */
    @NotNull public Builder indication(@NotNull MedicalIndication.Builder medicalIndication) {
      putValue("indication", medicalIndication.build());
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @NotNull public Builder seriousAdverseOutcome(@NotNull MedicalEntity medicalEntity) {
      putValue("seriousAdverseOutcome", medicalEntity);
      return this;
    }
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @NotNull public Builder seriousAdverseOutcome(@NotNull MedicalEntity.Builder medicalEntity) {
      putValue("seriousAdverseOutcome", medicalEntity.build());
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(@NotNull MedicalCode medicalCode) {
      putValue("code", medicalCode);
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(@NotNull MedicalCode.Builder medicalCode) {
      putValue("code", medicalCode.build());
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline medicalGuideline) {
      putValue("guideline", medicalGuideline);
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(@NotNull MedicalGuideline.Builder medicalGuideline) {
      putValue("guideline", medicalGuideline.build());
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem medicineSystem) {
      putValue("medicineSystem", medicineSystem);
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(@NotNull MedicineSystem.Builder medicineSystem) {
      putValue("medicineSystem", medicineSystem.build());
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization organization) {
      putValue("recognizingAuthority", organization);
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(@NotNull Organization.Builder organization) {
      putValue("recognizingAuthority", organization.build());
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty medicalSpecialty) {
      putValue("relevantSpecialty", medicalSpecialty);
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(@NotNull MedicalSpecialty.Builder medicalSpecialty) {
      putValue("relevantSpecialty", medicalSpecialty.build());
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(@NotNull MedicalStudy medicalStudy) {
      putValue("study", medicalStudy);
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(@NotNull MedicalStudy.Builder medicalStudy) {
      putValue("study", medicalStudy.build());
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      putValue("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("activeIngredient".equals(key) && value instanceof String) { activeIngredient((String)value); return; }
      if ("administrationRoute".equals(key) && value instanceof String) { administrationRoute((String)value); return; }
      if ("alcoholWarning".equals(key) && value instanceof String) { alcoholWarning((String)value); return; }
      if ("availableStrength".equals(key) && value instanceof DrugStrength) { availableStrength((DrugStrength)value); return; }
      if ("breastfeedingWarning".equals(key) && value instanceof String) { breastfeedingWarning((String)value); return; }
      if ("clinicalPharmacology".equals(key) && value instanceof String) { clinicalPharmacology((String)value); return; }
      if ("cost".equals(key) && value instanceof DrugCost) { cost((DrugCost)value); return; }
      if ("dosageForm".equals(key) && value instanceof String) { dosageForm((String)value); return; }
      if ("doseSchedule".equals(key) && value instanceof DoseSchedule) { doseSchedule((DoseSchedule)value); return; }
      if ("drugClass".equals(key) && value instanceof DrugClass) { drugClass((DrugClass)value); return; }
      if ("foodWarning".equals(key) && value instanceof String) { foodWarning((String)value); return; }
      if ("interactingDrug".equals(key) && value instanceof Drug) { interactingDrug((Drug)value); return; }
      if ("isAvailableGenerically".equals(key) && value instanceof Boolean) { isAvailableGenerically((Boolean)value); return; }
      if ("isProprietary".equals(key) && value instanceof Boolean) { isProprietary((Boolean)value); return; }
      if ("labelDetails".equals(key) && value instanceof String) { labelDetails((String)value); return; }
      if ("legalStatus".equals(key) && value instanceof DrugLegalStatus) { legalStatus((DrugLegalStatus)value); return; }
      if ("manufacturer".equals(key) && value instanceof Organization) { manufacturer((Organization)value); return; }
      if ("mechanismOfAction".equals(key) && value instanceof String) { mechanismOfAction((String)value); return; }
      if ("nonProprietaryName".equals(key) && value instanceof String) { nonProprietaryName((String)value); return; }
      if ("overdosage".equals(key) && value instanceof String) { overdosage((String)value); return; }
      if ("pregnancyCategory".equals(key) && value instanceof DrugPregnancyCategory) { pregnancyCategory((DrugPregnancyCategory)value); return; }
      if ("pregnancyWarning".equals(key) && value instanceof String) { pregnancyWarning((String)value); return; }
      if ("prescribingInfo".equals(key) && value instanceof String) { prescribingInfo((String)value); return; }
      if ("prescriptionStatus".equals(key) && value instanceof DrugPrescriptionStatus) { prescriptionStatus((DrugPrescriptionStatus)value); return; }
      if ("relatedDrug".equals(key) && value instanceof Drug) { relatedDrug((Drug)value); return; }
      if ("warning".equals(key) && value instanceof String) { warning((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
