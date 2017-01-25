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
 * A food or drink item listed in a menu or menu section.
 */
public class MenuItem extends Intangible {
  /**
   * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
   */
  @JsonIgnore public RestrictedDiet getSuitableForDiet() {
    return (RestrictedDiet) getValue("suitableForDiet");
  }
  /**
   * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
   */
  @JsonIgnore public Collection<RestrictedDiet> getSuitableForDiets() {
    final Object current = myData.get("suitableForDiet");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<RestrictedDiet>) current;
    }
    return Arrays.asList((RestrictedDiet) current);
  }
  /**
   * Nutrition information about the recipe or menu item.
   */
  @JsonIgnore public NutritionInformation getNutrition() {
    return (NutritionInformation) getValue("nutrition");
  }
  /**
   * Nutrition information about the recipe or menu item.
   */
  @JsonIgnore public Collection<NutritionInformation> getNutritions() {
    final Object current = myData.get("nutrition");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<NutritionInformation>) current;
    }
    return Arrays.asList((NutritionInformation) current);
  }
  /**
   * Additional menu item(s) such as a side dish of salad or side order of fries that can be added to this menu item. Additionally it can be a menu section containing allowed add-on menu items for this menu item.
   */
  @JsonIgnore public MenuSection getMenuAddOn() {
    return (MenuSection) getValue("menuAddOn");
  }
  /**
   * Additional menu item(s) such as a side dish of salad or side order of fries that can be added to this menu item. Additionally it can be a menu section containing allowed add-on menu items for this menu item.
   */
  @JsonIgnore public Collection<MenuSection> getMenuAddOns() {
    final Object current = myData.get("menuAddOn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MenuSection>) current;
    }
    return Arrays.asList((MenuSection) current);
  }
  protected MenuItem(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link MenuItem}
   */
  public static class Builder extends Intangible.Builder {
    public MenuItem build() {
      return new MenuItem(myData);
    }
    /**
     * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
     */
    @NotNull public Builder suitableForDiet(@NotNull RestrictedDiet restrictedDiet) {
      putValue("suitableForDiet", restrictedDiet);
      return this;
    }
    /**
     * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
     */
    @NotNull public Builder suitableForDiet(@NotNull RestrictedDiet.Builder restrictedDiet) {
      putValue("suitableForDiet", restrictedDiet.build());
      return this;
    }
    /**
     * Nutrition information about the recipe or menu item.
     */
    @NotNull public Builder nutrition(@NotNull NutritionInformation nutritionInformation) {
      putValue("nutrition", nutritionInformation);
      return this;
    }
    /**
     * Nutrition information about the recipe or menu item.
     */
    @NotNull public Builder nutrition(@NotNull NutritionInformation.Builder nutritionInformation) {
      putValue("nutrition", nutritionInformation.build());
      return this;
    }
    /**
     * Additional menu item(s) such as a side dish of salad or side order of fries that can be added to this menu item. Additionally it can be a menu section containing allowed add-on menu items for this menu item.
     */
    @NotNull public Builder menuAddOn(@NotNull MenuSection menuSection) {
      putValue("menuAddOn", menuSection);
      return this;
    }
    /**
     * Additional menu item(s) such as a side dish of salad or side order of fries that can be added to this menu item. Additionally it can be a menu section containing allowed add-on menu items for this menu item.
     */
    @NotNull public Builder menuAddOn(@NotNull MenuSection.Builder menuSection) {
      putValue("menuAddOn", menuSection.build());
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
      if ("suitableForDiet".equals(key) && value instanceof RestrictedDiet) { suitableForDiet((RestrictedDiet)value); return; }
      if ("nutrition".equals(key) && value instanceof NutritionInformation) { nutrition((NutritionInformation)value); return; }
      if ("menuAddOn".equals(key) && value instanceof MenuSection) { menuAddOn((MenuSection)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
