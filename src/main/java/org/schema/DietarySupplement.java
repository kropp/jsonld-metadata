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
 * A product taken by mouth that contains a dietary ingredient intended to supplement the diet. Dietary ingredients may include vitamins, minerals, herbs or other botanicals, amino acids, and substances such as enzymes, organ tissues, glandulars and metabolites.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class DietarySupplement extends MedicalTherapy {
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
   * Descriptive information establishing a historical perspective on the supplement. May include the rationale for the name, the population where the supplement first came to prominence, etc.
   */
  @JsonIgnore public String getBackground() {
    return (String) getValue("background");
  }
  /**
   * Descriptive information establishing a historical perspective on the supplement. May include the rationale for the name, the population where the supplement first came to prominence, etc.
   */
  @JsonIgnore public Collection<String> getBackgrounds() {
    final Object current = myData.get("background");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   */
  @JsonIgnore public MaximumDoseSchedule getMaximumIntake() {
    return (MaximumDoseSchedule) getValue("maximumIntake");
  }
  /**
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   */
  @JsonIgnore public Collection<MaximumDoseSchedule> getMaximumIntakes() {
    final Object current = myData.get("maximumIntake");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MaximumDoseSchedule>) current;
    }
    return Arrays.asList((MaximumDoseSchedule) current);
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
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   */
  @JsonIgnore public RecommendedDoseSchedule getRecommendedIntake() {
    return (RecommendedDoseSchedule) getValue("recommendedIntake");
  }
  /**
   * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
   */
  @JsonIgnore public Collection<RecommendedDoseSchedule> getRecommendedIntakes() {
    final Object current = myData.get("recommendedIntake");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<RecommendedDoseSchedule>) current;
    }
    return Arrays.asList((RecommendedDoseSchedule) current);
  }
  /**
   * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
   */
  @JsonIgnore public String getSafetyConsideration() {
    return (String) getValue("safetyConsideration");
  }
  /**
   * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
   */
  @JsonIgnore public Collection<String> getSafetyConsiderations() {
    final Object current = myData.get("safetyConsideration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
   */
  @JsonIgnore public String getTargetPopulation() {
    return (String) getValue("targetPopulation");
  }
  /**
   * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
   */
  @JsonIgnore public Collection<String> getTargetPopulations() {
    final Object current = myData.get("targetPopulation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected DietarySupplement(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link DietarySupplement}
   */
  public static class Builder extends MedicalTherapy.Builder {
    public DietarySupplement build() {
      return new DietarySupplement(myData);
    }
    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     */
    @NotNull public Builder activeIngredient(@NotNull String activeIngredient) {
      putValue("activeIngredient", activeIngredient);
      return this;
    }
    /**
     * Descriptive information establishing a historical perspective on the supplement. May include the rationale for the name, the population where the supplement first came to prominence, etc.
     */
    @NotNull public Builder background(@NotNull String background) {
      putValue("background", background);
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
     * True if this item's name is a proprietary/brand name (vs. generic name).
     */
    @NotNull public Builder isProprietary(@NotNull Boolean isProprietary) {
      putValue("isProprietary", isProprietary);
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
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @NotNull public Builder maximumIntake(@NotNull MaximumDoseSchedule maximumDoseSchedule) {
      putValue("maximumIntake", maximumDoseSchedule);
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @NotNull public Builder maximumIntake(@NotNull MaximumDoseSchedule.Builder maximumDoseSchedule) {
      putValue("maximumIntake", maximumDoseSchedule.build());
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
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @NotNull public Builder recommendedIntake(@NotNull RecommendedDoseSchedule recommendedDoseSchedule) {
      putValue("recommendedIntake", recommendedDoseSchedule);
      return this;
    }
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @NotNull public Builder recommendedIntake(@NotNull RecommendedDoseSchedule.Builder recommendedDoseSchedule) {
      putValue("recommendedIntake", recommendedDoseSchedule.build());
      return this;
    }
    /**
     * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
     */
    @NotNull public Builder safetyConsideration(@NotNull String safetyConsideration) {
      putValue("safetyConsideration", safetyConsideration);
      return this;
    }
    /**
     * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
     */
    @NotNull public Builder targetPopulation(@NotNull String targetPopulation) {
      putValue("targetPopulation", targetPopulation);
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
      if ("background".equals(key) && value instanceof String) { background((String)value); return; }
      if ("dosageForm".equals(key) && value instanceof String) { dosageForm((String)value); return; }
      if ("isProprietary".equals(key) && value instanceof Boolean) { isProprietary((Boolean)value); return; }
      if ("legalStatus".equals(key) && value instanceof DrugLegalStatus) { legalStatus((DrugLegalStatus)value); return; }
      if ("manufacturer".equals(key) && value instanceof Organization) { manufacturer((Organization)value); return; }
      if ("maximumIntake".equals(key) && value instanceof MaximumDoseSchedule) { maximumIntake((MaximumDoseSchedule)value); return; }
      if ("mechanismOfAction".equals(key) && value instanceof String) { mechanismOfAction((String)value); return; }
      if ("nonProprietaryName".equals(key) && value instanceof String) { nonProprietaryName((String)value); return; }
      if ("recommendedIntake".equals(key) && value instanceof RecommendedDoseSchedule) { recommendedIntake((RecommendedDoseSchedule)value); return; }
      if ("safetyConsideration".equals(key) && value instanceof String) { safetyConsideration((String)value); return; }
      if ("targetPopulation".equals(key) && value instanceof String) { targetPopulation((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
