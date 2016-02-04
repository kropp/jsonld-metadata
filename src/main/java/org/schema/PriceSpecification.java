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
 * A structured value representing a monetary amount. Typically, only the subclasses of this type are used for markup.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class PriceSpecification extends StructuredValue {
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  @JsonIgnore public QuantitativeValue getEligibleQuantity() {
    return (QuantitativeValue) getValue("eligibleQuantity");
  }
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  @JsonIgnore public Collection<QuantitativeValue> getEligibleQuantitys() {
    final Object current = myData.get("eligibleQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  @JsonIgnore public PriceSpecification getEligibleTransactionVolume() {
    return (PriceSpecification) getValue("eligibleTransactionVolume");
  }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  @JsonIgnore public Collection<PriceSpecification> getEligibleTransactionVolumes() {
    final Object current = myData.get("eligibleTransactionVolume");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * The highest price if the price is a range.
   */
  @JsonIgnore public Integer getMaxPriceInteger() {
    return (Integer) getValue("maxPrice");
  }
  /**
   * The highest price if the price is a range.
   */
  @JsonIgnore public Collection<Integer> getMaxPriceIntegers() {
    final Object current = myData.get("maxPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The highest price if the price is a range.
   */
  @JsonIgnore public Long getMaxPriceLong() {
    return (Long) getValue("maxPrice");
  }
  /**
   * The highest price if the price is a range.
   */
  @JsonIgnore public Collection<Long> getMaxPriceLongs() {
    final Object current = myData.get("maxPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The highest price if the price is a range.
   */
  @JsonIgnore public Float getMaxPriceFloat() {
    return (Float) getValue("maxPrice");
  }
  /**
   * The highest price if the price is a range.
   */
  @JsonIgnore public Collection<Float> getMaxPriceFloats() {
    final Object current = myData.get("maxPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The highest price if the price is a range.
   */
  @JsonIgnore public Double getMaxPriceDouble() {
    return (Double) getValue("maxPrice");
  }
  /**
   * The highest price if the price is a range.
   */
  @JsonIgnore public Collection<Double> getMaxPriceDoubles() {
    final Object current = myData.get("maxPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The highest price if the price is a range.
   */
  @JsonIgnore public String getMaxPriceString() {
    return (String) getValue("maxPrice");
  }
  /**
   * The highest price if the price is a range.
   */
  @JsonIgnore public Collection<String> getMaxPriceStrings() {
    final Object current = myData.get("maxPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The lowest price if the price is a range.
   */
  @JsonIgnore public Integer getMinPriceInteger() {
    return (Integer) getValue("minPrice");
  }
  /**
   * The lowest price if the price is a range.
   */
  @JsonIgnore public Collection<Integer> getMinPriceIntegers() {
    final Object current = myData.get("minPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The lowest price if the price is a range.
   */
  @JsonIgnore public Long getMinPriceLong() {
    return (Long) getValue("minPrice");
  }
  /**
   * The lowest price if the price is a range.
   */
  @JsonIgnore public Collection<Long> getMinPriceLongs() {
    final Object current = myData.get("minPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The lowest price if the price is a range.
   */
  @JsonIgnore public Float getMinPriceFloat() {
    return (Float) getValue("minPrice");
  }
  /**
   * The lowest price if the price is a range.
   */
  @JsonIgnore public Collection<Float> getMinPriceFloats() {
    final Object current = myData.get("minPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The lowest price if the price is a range.
   */
  @JsonIgnore public Double getMinPriceDouble() {
    return (Double) getValue("minPrice");
  }
  /**
   * The lowest price if the price is a range.
   */
  @JsonIgnore public Collection<Double> getMinPriceDoubles() {
    final Object current = myData.get("minPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The lowest price if the price is a range.
   */
  @JsonIgnore public String getMinPriceString() {
    return (String) getValue("minPrice");
  }
  /**
   * The lowest price if the price is a range.
   */
  @JsonIgnore public Collection<String> getMinPriceStrings() {
    final Object current = myData.get("minPrice");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * <br />
   * <br />
   *       Usage guidelines:
   * <br />
   * <ul>
   * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
   * </li>
   * <li>
   *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * </li>
   * <li>
   *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
   *       alongside more human-friendly formatting.
   * </li>
   * <li>
   *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
   * </li>
   * </ul>
   *       
   */
  @JsonIgnore public Integer getPriceInteger() {
    return (Integer) getValue("price");
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * <br />
   * <br />
   *       Usage guidelines:
   * <br />
   * <ul>
   * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
   * </li>
   * <li>
   *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * </li>
   * <li>
   *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
   *       alongside more human-friendly formatting.
   * </li>
   * <li>
   *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
   * </li>
   * </ul>
   *       
   */
  @JsonIgnore public Collection<Integer> getPriceIntegers() {
    final Object current = myData.get("price");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * <br />
   * <br />
   *       Usage guidelines:
   * <br />
   * <ul>
   * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
   * </li>
   * <li>
   *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * </li>
   * <li>
   *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
   *       alongside more human-friendly formatting.
   * </li>
   * <li>
   *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
   * </li>
   * </ul>
   *       
   */
  @JsonIgnore public Long getPriceLong() {
    return (Long) getValue("price");
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * <br />
   * <br />
   *       Usage guidelines:
   * <br />
   * <ul>
   * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
   * </li>
   * <li>
   *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * </li>
   * <li>
   *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
   *       alongside more human-friendly formatting.
   * </li>
   * <li>
   *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
   * </li>
   * </ul>
   *       
   */
  @JsonIgnore public Collection<Long> getPriceLongs() {
    final Object current = myData.get("price");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * <br />
   * <br />
   *       Usage guidelines:
   * <br />
   * <ul>
   * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
   * </li>
   * <li>
   *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * </li>
   * <li>
   *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
   *       alongside more human-friendly formatting.
   * </li>
   * <li>
   *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
   * </li>
   * </ul>
   *       
   */
  @JsonIgnore public Float getPriceFloat() {
    return (Float) getValue("price");
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * <br />
   * <br />
   *       Usage guidelines:
   * <br />
   * <ul>
   * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
   * </li>
   * <li>
   *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * </li>
   * <li>
   *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
   *       alongside more human-friendly formatting.
   * </li>
   * <li>
   *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
   * </li>
   * </ul>
   *       
   */
  @JsonIgnore public Collection<Float> getPriceFloats() {
    final Object current = myData.get("price");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * <br />
   * <br />
   *       Usage guidelines:
   * <br />
   * <ul>
   * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
   * </li>
   * <li>
   *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * </li>
   * <li>
   *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
   *       alongside more human-friendly formatting.
   * </li>
   * <li>
   *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
   * </li>
   * </ul>
   *       
   */
  @JsonIgnore public Double getPriceDouble() {
    return (Double) getValue("price");
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * <br />
   * <br />
   *       Usage guidelines:
   * <br />
   * <ul>
   * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
   * </li>
   * <li>
   *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * </li>
   * <li>
   *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
   *       alongside more human-friendly formatting.
   * </li>
   * <li>
   *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
   * </li>
   * </ul>
   *       
   */
  @JsonIgnore public Collection<Double> getPriceDoubles() {
    final Object current = myData.get("price");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * <br />
   * <br />
   *       Usage guidelines:
   * <br />
   * <ul>
   * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
   * </li>
   * <li>
   *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * </li>
   * <li>
   *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
   *       alongside more human-friendly formatting.
   * </li>
   * <li>
   *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
   * </li>
   * </ul>
   *       
   */
  @JsonIgnore public String getPriceString() {
    return (String) getValue("price");
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * <br />
   * <br />
   *       Usage guidelines:
   * <br />
   * <ul>
   * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
   * </li>
   * <li>
   *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
   * </li>
   * <li>
   *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
   *       alongside more human-friendly formatting.
   * </li>
   * <li>
   *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
   * </li>
   * </ul>
   *       
   */
  @JsonIgnore public Collection<String> getPriceStrings() {
    final Object current = myData.get("price");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date when the item becomes valid.
   */
  @JsonIgnore public java.util.Date getValidFrom() {
    return (java.util.Date) getValue("validFrom");
  }
  /**
   * The date when the item becomes valid.
   */
  @JsonIgnore public Collection<java.util.Date> getValidFroms() {
    final Object current = myData.get("validFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The end of the validity of offer, price specification, or opening hours data.
   */
  @JsonIgnore public java.util.Date getValidThrough() {
    return (java.util.Date) getValue("validThrough");
  }
  /**
   * The end of the validity of offer, price specification, or opening hours data.
   */
  @JsonIgnore public Collection<java.util.Date> getValidThroughs() {
    final Object current = myData.get("validThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
   */
  @JsonIgnore public Boolean getValueAddedTaxIncluded() {
    return (Boolean) getValue("valueAddedTaxIncluded");
  }
  /**
   * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
   */
  @JsonIgnore public Collection<Boolean> getValueAddedTaxIncludeds() {
    final Object current = myData.get("valueAddedTaxIncluded");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
   */
  @JsonIgnore public String getPriceCurrency() {
    return (String) getValue("priceCurrency");
  }
  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
   */
  @JsonIgnore public Collection<String> getPriceCurrencys() {
    final Object current = myData.get("priceCurrency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected PriceSpecification(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link PriceSpecification}
   */
  public static class Builder extends StructuredValue.Builder {
    public PriceSpecification build() {
      return new PriceSpecification(myData);
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("eligibleQuantity", quantitativeValue);
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("eligibleQuantity", quantitativeValue.build());
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification priceSpecification) {
      putValue("eligibleTransactionVolume", priceSpecification);
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("eligibleTransactionVolume", priceSpecification.build());
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Integer integer) {
      putValue("maxPrice", integer);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Long maxPrice) {
      putValue("maxPrice", maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Float maxPrice) {
      putValue("maxPrice", maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Double maxPrice) {
      putValue("maxPrice", maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull String maxPrice) {
      putValue("maxPrice", maxPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Integer integer) {
      putValue("minPrice", integer);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Long minPrice) {
      putValue("minPrice", minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Float minPrice) {
      putValue("minPrice", minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Double minPrice) {
      putValue("minPrice", minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull String minPrice) {
      putValue("minPrice", minPrice);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
     * <br />
     * <br />
     *       Usage guidelines:
     * <br />
     * <ul>
     * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
     *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
     * </li>
     * <li>
     *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * </li>
     * <li>
     *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
     *       alongside more human-friendly formatting.
     * </li>
     * <li>
     *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     * </li>
     * </ul>
     *       
     */
    @NotNull public Builder price(@NotNull Integer integer) {
      putValue("price", integer);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
     * <br />
     * <br />
     *       Usage guidelines:
     * <br />
     * <ul>
     * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
     *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
     * </li>
     * <li>
     *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * </li>
     * <li>
     *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
     *       alongside more human-friendly formatting.
     * </li>
     * <li>
     *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     * </li>
     * </ul>
     *       
     */
    @NotNull public Builder price(@NotNull Long price) {
      putValue("price", price);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
     * <br />
     * <br />
     *       Usage guidelines:
     * <br />
     * <ul>
     * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
     *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
     * </li>
     * <li>
     *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * </li>
     * <li>
     *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
     *       alongside more human-friendly formatting.
     * </li>
     * <li>
     *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     * </li>
     * </ul>
     *       
     */
    @NotNull public Builder price(@NotNull Float price) {
      putValue("price", price);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
     * <br />
     * <br />
     *       Usage guidelines:
     * <br />
     * <ul>
     * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
     *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
     * </li>
     * <li>
     *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * </li>
     * <li>
     *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
     *       alongside more human-friendly formatting.
     * </li>
     * <li>
     *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     * </li>
     * </ul>
     *       
     */
    @NotNull public Builder price(@NotNull Double price) {
      putValue("price", price);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
     * <br />
     * <br />
     *       Usage guidelines:
     * <br />
     * <ul>
     * <li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
     *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
     * </li>
     * <li>
     *       Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     * </li>
     * <li>
     *       Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
     *       alongside more human-friendly formatting.
     * </li>
     * <li>
     *       Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     * </li>
     * </ul>
     *       
     */
    @NotNull public Builder price(@NotNull String price) {
      putValue("price", price);
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      putValue("validFrom", date);
      return this;
    }
    /**
     * The end of the validity of offer, price specification, or opening hours data.
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      putValue("validThrough", date);
      return this;
    }
    /**
     * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
     */
    @NotNull public Builder valueAddedTaxIncluded(@NotNull Boolean valueAddedTaxIncluded) {
      putValue("valueAddedTaxIncluded", valueAddedTaxIncluded);
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    @NotNull public Builder priceCurrency(@NotNull String priceCurrency) {
      putValue("priceCurrency", priceCurrency);
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
      if ("eligibleQuantity".equals(key) && value instanceof QuantitativeValue) { eligibleQuantity((QuantitativeValue)value); return; }
      if ("eligibleTransactionVolume".equals(key) && value instanceof PriceSpecification) { eligibleTransactionVolume((PriceSpecification)value); return; }
      if ("maxPrice".equals(key) && value instanceof Integer) { maxPrice((Integer)value); return; }
      if ("maxPrice".equals(key) && value instanceof Long) { maxPrice((Long)value); return; }
      if ("maxPrice".equals(key) && value instanceof Float) { maxPrice((Float)value); return; }
      if ("maxPrice".equals(key) && value instanceof Double) { maxPrice((Double)value); return; }
      if ("maxPrice".equals(key) && value instanceof String) { maxPrice((String)value); return; }
      if ("minPrice".equals(key) && value instanceof Integer) { minPrice((Integer)value); return; }
      if ("minPrice".equals(key) && value instanceof Long) { minPrice((Long)value); return; }
      if ("minPrice".equals(key) && value instanceof Float) { minPrice((Float)value); return; }
      if ("minPrice".equals(key) && value instanceof Double) { minPrice((Double)value); return; }
      if ("minPrice".equals(key) && value instanceof String) { minPrice((String)value); return; }
      if ("price".equals(key) && value instanceof Integer) { price((Integer)value); return; }
      if ("price".equals(key) && value instanceof Long) { price((Long)value); return; }
      if ("price".equals(key) && value instanceof Float) { price((Float)value); return; }
      if ("price".equals(key) && value instanceof Double) { price((Double)value); return; }
      if ("price".equals(key) && value instanceof String) { price((String)value); return; }
      if ("validFrom".equals(key) && value instanceof java.util.Date) { validFrom((java.util.Date)value); return; }
      if ("validThrough".equals(key) && value instanceof java.util.Date) { validThrough((java.util.Date)value); return; }
      if ("valueAddedTaxIncluded".equals(key) && value instanceof Boolean) { valueAddedTaxIncluded((Boolean)value); return; }
      if ("priceCurrency".equals(key) && value instanceof String) { priceCurrency((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
