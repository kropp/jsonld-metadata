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
 * A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class Muscle extends AnatomicalStructure {
  /**
   * The movement the muscle generates.
   */
  @JsonIgnore public String getMuscleAction() {
    return (String) getValue("muscleAction");
  }
  /**
   * The movement the muscle generates.
   */
  @JsonIgnore public Collection<String> getMuscleActions() {
    final Object current = myData.get("muscleAction");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The muscle whose action counteracts the specified muscle.
   */
  @JsonIgnore public Muscle getAntagonist() {
    return (Muscle) getValue("antagonist");
  }
  /**
   * The muscle whose action counteracts the specified muscle.
   */
  @JsonIgnore public Collection<Muscle> getAntagonists() {
    final Object current = myData.get("antagonist");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Muscle>) current;
    }
    return Arrays.asList((Muscle) current);
  }
  /**
   * The blood vessel that carries blood from the heart to the muscle.
   */
  @JsonIgnore public Vessel getBloodSupply() {
    return (Vessel) getValue("bloodSupply");
  }
  /**
   * The blood vessel that carries blood from the heart to the muscle.
   */
  @JsonIgnore public Collection<Vessel> getBloodSupplys() {
    final Object current = myData.get("bloodSupply");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Vessel>) current;
    }
    return Arrays.asList((Vessel) current);
  }
  /**
   * The place of attachment of a muscle, or what the muscle moves.
   */
  @JsonIgnore public AnatomicalStructure getInsertion() {
    return (AnatomicalStructure) getValue("insertion");
  }
  /**
   * The place of attachment of a muscle, or what the muscle moves.
   */
  @JsonIgnore public Collection<AnatomicalStructure> getInsertions() {
    final Object current = myData.get("insertion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AnatomicalStructure>) current;
    }
    return Arrays.asList((AnatomicalStructure) current);
  }
  /**
   * The underlying innervation associated with the muscle.
   */
  @JsonIgnore public Nerve getNerve() {
    return (Nerve) getValue("nerve");
  }
  /**
   * The underlying innervation associated with the muscle.
   */
  @JsonIgnore public Collection<Nerve> getNerves() {
    final Object current = myData.get("nerve");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Nerve>) current;
    }
    return Arrays.asList((Nerve) current);
  }
  /**
   * The place or point where a muscle arises.
   */
  @JsonIgnore public AnatomicalStructure getOrigin() {
    return (AnatomicalStructure) getValue("origin");
  }
  /**
   * The place or point where a muscle arises.
   */
  @JsonIgnore public Collection<AnatomicalStructure> getOrigins() {
    final Object current = myData.get("origin");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AnatomicalStructure>) current;
    }
    return Arrays.asList((AnatomicalStructure) current);
  }
  protected Muscle(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Muscle}
   */
  public static class Builder extends AnatomicalStructure.Builder {
    public Muscle build() {
      return new Muscle(myData);
    }
    /**
     * The movement the muscle generates.
     */
    @NotNull public Builder muscleAction(@NotNull String muscleAction) {
      putValue("muscleAction", muscleAction);
      return this;
    }
    /**
     * The muscle whose action counteracts the specified muscle.
     */
    @NotNull public Builder antagonist(@NotNull Muscle muscle) {
      putValue("antagonist", muscle);
      return this;
    }
    /**
     * The muscle whose action counteracts the specified muscle.
     */
    @NotNull public Builder antagonist(@NotNull Muscle.Builder muscle) {
      putValue("antagonist", muscle.build());
      return this;
    }
    /**
     * The blood vessel that carries blood from the heart to the muscle.
     */
    @NotNull public Builder bloodSupply(@NotNull Vessel vessel) {
      putValue("bloodSupply", vessel);
      return this;
    }
    /**
     * The blood vessel that carries blood from the heart to the muscle.
     */
    @NotNull public Builder bloodSupply(@NotNull Vessel.Builder vessel) {
      putValue("bloodSupply", vessel.build());
      return this;
    }
    /**
     * The place of attachment of a muscle, or what the muscle moves.
     */
    @NotNull public Builder insertion(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("insertion", anatomicalStructure);
      return this;
    }
    /**
     * The place of attachment of a muscle, or what the muscle moves.
     */
    @NotNull public Builder insertion(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("insertion", anatomicalStructure.build());
      return this;
    }
    /**
     * The underlying innervation associated with the muscle.
     */
    @NotNull public Builder nerve(@NotNull Nerve nerve) {
      putValue("nerve", nerve);
      return this;
    }
    /**
     * The underlying innervation associated with the muscle.
     */
    @NotNull public Builder nerve(@NotNull Nerve.Builder nerve) {
      putValue("nerve", nerve.build());
      return this;
    }
    /**
     * The place or point where a muscle arises.
     */
    @NotNull public Builder origin(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("origin", anatomicalStructure);
      return this;
    }
    /**
     * The place or point where a muscle arises.
     */
    @NotNull public Builder origin(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("origin", anatomicalStructure.build());
      return this;
    }
    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     */
    @NotNull public Builder associatedPathophysiology(@NotNull String associatedPathophysiology) {
      putValue("associatedPathophysiology", associatedPathophysiology);
      return this;
    }
    /**
     * Location in the body of the anatomical structure.
     */
    @NotNull public Builder bodyLocation(@NotNull String bodyLocation) {
      putValue("bodyLocation", bodyLocation);
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     */
    @NotNull public Builder connectedTo(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("connectedTo", anatomicalStructure);
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     */
    @NotNull public Builder connectedTo(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("connectedTo", anatomicalStructure.build());
      return this;
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     */
    @NotNull public Builder diagram(@NotNull ImageObject imageObject) {
      putValue("diagram", imageObject);
      return this;
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     */
    @NotNull public Builder diagram(@NotNull ImageObject.Builder imageObject) {
      putValue("diagram", imageObject.build());
      return this;
    }
    /**
     * Function of the anatomical structure.
     */
    @NotNull public Builder function(@NotNull String function) {
      putValue("function", function);
      return this;
    }
    /**
     * The anatomical or organ system that this structure is part of.
     */
    @NotNull public Builder partOfSystem(@NotNull IsPartOf isPartOf) {
      putValue("partOfSystem", isPartOf);
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     */
    @NotNull public Builder relatedCondition(@NotNull MedicalCondition medicalCondition) {
      putValue("relatedCondition", medicalCondition);
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     */
    @NotNull public Builder relatedCondition(@NotNull MedicalCondition.Builder medicalCondition) {
      putValue("relatedCondition", medicalCondition.build());
      return this;
    }
    /**
     * A medical therapy related to this anatomy.
     */
    @NotNull public Builder relatedTherapy(@NotNull MedicalTherapy medicalTherapy) {
      putValue("relatedTherapy", medicalTherapy);
      return this;
    }
    /**
     * A medical therapy related to this anatomy.
     */
    @NotNull public Builder relatedTherapy(@NotNull MedicalTherapy.Builder medicalTherapy) {
      putValue("relatedTherapy", medicalTherapy.build());
      return this;
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    @NotNull public Builder subStructure(@NotNull AnatomicalStructure anatomicalStructure) {
      putValue("subStructure", anatomicalStructure);
      return this;
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    @NotNull public Builder subStructure(@NotNull AnatomicalStructure.Builder anatomicalStructure) {
      putValue("subStructure", anatomicalStructure.build());
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
      if ("muscleAction".equals(key) && value instanceof String) { muscleAction((String)value); return; }
      if ("antagonist".equals(key) && value instanceof Muscle) { antagonist((Muscle)value); return; }
      if ("bloodSupply".equals(key) && value instanceof Vessel) { bloodSupply((Vessel)value); return; }
      if ("insertion".equals(key) && value instanceof AnatomicalStructure) { insertion((AnatomicalStructure)value); return; }
      if ("nerve".equals(key) && value instanceof Nerve) { nerve((Nerve)value); return; }
      if ("origin".equals(key) && value instanceof AnatomicalStructure) { origin((AnatomicalStructure)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
