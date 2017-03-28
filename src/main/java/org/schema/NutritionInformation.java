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

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Nutritional information about the recipe.
 */
public class NutritionInformation extends StructuredValue {
  /**
   * The number of grams of carbohydrates.
   */
  @JsonIgnore public Mass getCarbohydrateContent() {
    return (Mass) getValue("carbohydrateContent");
  }
  /**
   * The number of grams of carbohydrates.
   */
  @JsonIgnore public Collection<Mass> getCarbohydrateContents() {
    final Object current = myData.get("carbohydrateContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of milligrams of cholesterol.
   */
  @JsonIgnore public Mass getCholesterolContent() {
    return (Mass) getValue("cholesterolContent");
  }
  /**
   * The number of milligrams of cholesterol.
   */
  @JsonIgnore public Collection<Mass> getCholesterolContents() {
    final Object current = myData.get("cholesterolContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of fiber.
   */
  @JsonIgnore public Mass getFiberContent() {
    return (Mass) getValue("fiberContent");
  }
  /**
   * The number of grams of fiber.
   */
  @JsonIgnore public Collection<Mass> getFiberContents() {
    final Object current = myData.get("fiberContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of protein.
   */
  @JsonIgnore public Mass getProteinContent() {
    return (Mass) getValue("proteinContent");
  }
  /**
   * The number of grams of protein.
   */
  @JsonIgnore public Collection<Mass> getProteinContents() {
    final Object current = myData.get("proteinContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of saturated fat.
   */
  @JsonIgnore public Mass getSaturatedFatContent() {
    return (Mass) getValue("saturatedFatContent");
  }
  /**
   * The number of grams of saturated fat.
   */
  @JsonIgnore public Collection<Mass> getSaturatedFatContents() {
    final Object current = myData.get("saturatedFatContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The serving size, in terms of the number of volume or mass.
   */
  @JsonIgnore public String getServingSize() {
    return (String) getValue("servingSize");
  }
  /**
   * The serving size, in terms of the number of volume or mass.
   */
  @JsonIgnore public Collection<String> getServingSizes() {
    final Object current = myData.get("servingSize");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The number of milligrams of sodium.
   */
  @JsonIgnore public Mass getSodiumContent() {
    return (Mass) getValue("sodiumContent");
  }
  /**
   * The number of milligrams of sodium.
   */
  @JsonIgnore public Collection<Mass> getSodiumContents() {
    final Object current = myData.get("sodiumContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of sugar.
   */
  @JsonIgnore public Mass getSugarContent() {
    return (Mass) getValue("sugarContent");
  }
  /**
   * The number of grams of sugar.
   */
  @JsonIgnore public Collection<Mass> getSugarContents() {
    final Object current = myData.get("sugarContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of fat.
   */
  @JsonIgnore public Mass getFatContent() {
    return (Mass) getValue("fatContent");
  }
  /**
   * The number of grams of fat.
   */
  @JsonIgnore public Collection<Mass> getFatContents() {
    final Object current = myData.get("fatContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of trans fat.
   */
  @JsonIgnore public Mass getTransFatContent() {
    return (Mass) getValue("transFatContent");
  }
  /**
   * The number of grams of trans fat.
   */
  @JsonIgnore public Collection<Mass> getTransFatContents() {
    final Object current = myData.get("transFatContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  /**
   * The number of grams of unsaturated fat.
   */
  @JsonIgnore public Mass getUnsaturatedFatContent() {
    return (Mass) getValue("unsaturatedFatContent");
  }
  /**
   * The number of grams of unsaturated fat.
   */
  @JsonIgnore public Collection<Mass> getUnsaturatedFatContents() {
    final Object current = myData.get("unsaturatedFatContent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Mass>) current;
    }
    return Arrays.asList((Mass) current);
  }
  protected NutritionInformation(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link NutritionInformation}
   */
  public static class Builder extends StructuredValue.Builder {
    @NotNull public NutritionInformation build() {
      return new NutritionInformation(myData);
    }
    /**
     * The number of grams of carbohydrates.
     */
    @NotNull public Builder carbohydrateContent(@NotNull Mass mass) {
      putValue("carbohydrateContent", mass);
      return this;
    }
    /**
     * The number of grams of carbohydrates.
     */
    @NotNull public Builder carbohydrateContent(@NotNull Mass.Builder mass) {
      putValue("carbohydrateContent", mass.build());
      return this;
    }
    /**
     * The number of milligrams of cholesterol.
     */
    @NotNull public Builder cholesterolContent(@NotNull Mass mass) {
      putValue("cholesterolContent", mass);
      return this;
    }
    /**
     * The number of milligrams of cholesterol.
     */
    @NotNull public Builder cholesterolContent(@NotNull Mass.Builder mass) {
      putValue("cholesterolContent", mass.build());
      return this;
    }
    /**
     * The number of grams of fiber.
     */
    @NotNull public Builder fiberContent(@NotNull Mass mass) {
      putValue("fiberContent", mass);
      return this;
    }
    /**
     * The number of grams of fiber.
     */
    @NotNull public Builder fiberContent(@NotNull Mass.Builder mass) {
      putValue("fiberContent", mass.build());
      return this;
    }
    /**
     * The number of grams of protein.
     */
    @NotNull public Builder proteinContent(@NotNull Mass mass) {
      putValue("proteinContent", mass);
      return this;
    }
    /**
     * The number of grams of protein.
     */
    @NotNull public Builder proteinContent(@NotNull Mass.Builder mass) {
      putValue("proteinContent", mass.build());
      return this;
    }
    /**
     * The number of grams of saturated fat.
     */
    @NotNull public Builder saturatedFatContent(@NotNull Mass mass) {
      putValue("saturatedFatContent", mass);
      return this;
    }
    /**
     * The number of grams of saturated fat.
     */
    @NotNull public Builder saturatedFatContent(@NotNull Mass.Builder mass) {
      putValue("saturatedFatContent", mass.build());
      return this;
    }
    /**
     * The serving size, in terms of the number of volume or mass.
     */
    @NotNull public Builder servingSize(@NotNull String servingSize) {
      putValue("servingSize", servingSize);
      return this;
    }
    /**
     * The number of milligrams of sodium.
     */
    @NotNull public Builder sodiumContent(@NotNull Mass mass) {
      putValue("sodiumContent", mass);
      return this;
    }
    /**
     * The number of milligrams of sodium.
     */
    @NotNull public Builder sodiumContent(@NotNull Mass.Builder mass) {
      putValue("sodiumContent", mass.build());
      return this;
    }
    /**
     * The number of grams of sugar.
     */
    @NotNull public Builder sugarContent(@NotNull Mass mass) {
      putValue("sugarContent", mass);
      return this;
    }
    /**
     * The number of grams of sugar.
     */
    @NotNull public Builder sugarContent(@NotNull Mass.Builder mass) {
      putValue("sugarContent", mass.build());
      return this;
    }
    /**
     * The number of grams of fat.
     */
    @NotNull public Builder fatContent(@NotNull Mass mass) {
      putValue("fatContent", mass);
      return this;
    }
    /**
     * The number of grams of fat.
     */
    @NotNull public Builder fatContent(@NotNull Mass.Builder mass) {
      putValue("fatContent", mass.build());
      return this;
    }
    /**
     * The number of grams of trans fat.
     */
    @NotNull public Builder transFatContent(@NotNull Mass mass) {
      putValue("transFatContent", mass);
      return this;
    }
    /**
     * The number of grams of trans fat.
     */
    @NotNull public Builder transFatContent(@NotNull Mass.Builder mass) {
      putValue("transFatContent", mass.build());
      return this;
    }
    /**
     * The number of grams of unsaturated fat.
     */
    @NotNull public Builder unsaturatedFatContent(@NotNull Mass mass) {
      putValue("unsaturatedFatContent", mass);
      return this;
    }
    /**
     * The number of grams of unsaturated fat.
     */
    @NotNull public Builder unsaturatedFatContent(@NotNull Mass.Builder mass) {
      putValue("unsaturatedFatContent", mass.build());
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
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
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
      if ("carbohydrateContent".equals(key) && value instanceof Mass) { carbohydrateContent((Mass)value); return; }
      if ("cholesterolContent".equals(key) && value instanceof Mass) { cholesterolContent((Mass)value); return; }
      if ("fiberContent".equals(key) && value instanceof Mass) { fiberContent((Mass)value); return; }
      if ("proteinContent".equals(key) && value instanceof Mass) { proteinContent((Mass)value); return; }
      if ("saturatedFatContent".equals(key) && value instanceof Mass) { saturatedFatContent((Mass)value); return; }
      if ("servingSize".equals(key) && value instanceof String) { servingSize((String)value); return; }
      if ("sodiumContent".equals(key) && value instanceof Mass) { sodiumContent((Mass)value); return; }
      if ("sugarContent".equals(key) && value instanceof Mass) { sugarContent((Mass)value); return; }
      if ("fatContent".equals(key) && value instanceof Mass) { fatContent((Mass)value); return; }
      if ("transFatContent".equals(key) && value instanceof Mass) { transFatContent((Mass)value); return; }
      if ("unsaturatedFatContent".equals(key) && value instanceof Mass) { unsaturatedFatContent((Mass)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
