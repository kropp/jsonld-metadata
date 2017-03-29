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
 * A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class WarrantyPromise extends StructuredValue {
  /**
   * The duration of the warranty promise. Common unitCode values are ANN for year, MON for months, or DAY for days.
   */
  @JsonIgnore public QuantitativeValue getDurationOfWarranty() {
    return (QuantitativeValue) getValue("durationOfWarranty");
  }
  /**
   * The duration of the warranty promise. Common unitCode values are ANN for year, MON for months, or DAY for days.
   */
  @JsonIgnore public Collection<QuantitativeValue> getDurationOfWarrantys() {
    final Object current = myData.get("durationOfWarranty");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The scope of the warranty promise.
   */
  @JsonIgnore public WarrantyScope getWarrantyScope() {
    return (WarrantyScope) getValue("warrantyScope");
  }
  /**
   * The scope of the warranty promise.
   */
  @JsonIgnore public Collection<WarrantyScope> getWarrantyScopes() {
    final Object current = myData.get("warrantyScope");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WarrantyScope>) current;
    }
    return Arrays.asList((WarrantyScope) current);
  }
  protected WarrantyPromise(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link WarrantyPromise}
   */
  public static class Builder extends StructuredValue.Builder {
    @NotNull public WarrantyPromise build() {
      return new WarrantyPromise(myData);
    }
    /**
     * The duration of the warranty promise. Common unitCode values are ANN for year, MON for months, or DAY for days.
     */
    @NotNull public Builder durationOfWarranty(@NotNull QuantitativeValue quantitativeValue) {
      putValue("durationOfWarranty", quantitativeValue);
      return this;
    }
    /**
     * The duration of the warranty promise. Common unitCode values are ANN for year, MON for months, or DAY for days.
     */
    @NotNull public Builder durationOfWarranty(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("durationOfWarranty", quantitativeValue.build());
      return this;
    }
    /**
     * The scope of the warranty promise.
     */
    @NotNull public Builder warrantyScope(@NotNull WarrantyScope warrantyScope) {
      putValue("warrantyScope", warrantyScope);
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
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("durationOfWarranty".equals(key) && value instanceof QuantitativeValue) { durationOfWarranty((QuantitativeValue)value); return; }
      if ("durationOfWarrantys".equals(key) && value instanceof QuantitativeValue) { durationOfWarranty((QuantitativeValue)value); return; }
      if ("warrantyScope".equals(key) && value instanceof WarrantyScope) { warrantyScope((WarrantyScope)value); return; }
      if ("warrantyScopes".equals(key) && value instanceof WarrantyScope) { warrantyScope((WarrantyScope)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
