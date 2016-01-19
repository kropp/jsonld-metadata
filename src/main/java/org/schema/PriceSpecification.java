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
 * A structured value representing a monetary amount. Typically, only the subclasses of this type are used for markup.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class PriceSpecification extends StructuredValue {
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  public QuantitativeValue getEligibleQuantity() {
    return myEligibleQuantity;
  }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  public PriceSpecification getEligibleTransactionVolume() {
    return myEligibleTransactionVolume;
  }
  /**
   * The highest price if the price is a range.
   */
  public Number getMaxPrice() {
    return myMaxPrice;
  }
  /**
   * The lowest price if the price is a range.
   */
  public Number getMinPrice() {
    return myMinPrice;
  }
  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
<br />
<br />
      Usage guidelines:
<br />
<ul>
<li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
      including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
</li>
<li>
      Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
</li>
<li>
      Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
      alongside more human-friendly formatting.
</li>
<li>
      Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
</li>
</ul>
      
   */
  public NumberOrString getPrice() {
    return myPrice;
  }
  /**
   * The date when the item becomes valid.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getValidFrom() {
    return myValidFrom;
  }
  /**
   * The end of the validity of offer, price specification, or opening hours data.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getValidThrough() {
    return myValidThrough;
  }
  /**
   * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
   */
  public Boolean getValueAddedTaxIncluded() {
    return myValueAddedTaxIncluded;
  }
  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
   */
  public String getPriceCurrency() {
    return myPriceCurrency;
  }
  /**
   * Builder for {@link PriceSpecification}
   */
  static final class PriceSpecificationThingBuilder implements Builder {
    /**
     * Creates new {@link PriceSpecification} instance.
     */
    public PriceSpecification build() {
      return new PriceSpecification(eligibleQuantity, eligibleTransactionVolume, maxPrice, minPrice, price, validFrom, validThrough, valueAddedTaxIncluded, priceCurrency, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue quantitativeValue) {
      this.eligibleQuantity = quantitativeValue;
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.eligibleQuantity(quantitativeValue.build());
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification priceSpecification) {
      this.eligibleTransactionVolume = priceSpecification;
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification.Builder priceSpecification) {
      return this.eligibleTransactionVolume(priceSpecification.build());
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Integer integer) {
      if (this.maxPrice == null) this.maxPrice = new Number();
      this.maxPrice.setInteger(integer);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Long maxPrice) {
      if (this.maxPrice == null) this.maxPrice = new Number();
      this.maxPrice.setLong(maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Float maxPrice) {
      if (this.maxPrice == null) this.maxPrice = new Number();
      this.maxPrice.setFloat(maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull Double maxPrice) {
      if (this.maxPrice == null) this.maxPrice = new Number();
      this.maxPrice.setDouble(maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    @NotNull public Builder maxPrice(@NotNull String maxPrice) {
      if (this.maxPrice == null) this.maxPrice = new Number();
      this.maxPrice.setString(maxPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Integer integer) {
      if (this.minPrice == null) this.minPrice = new Number();
      this.minPrice.setInteger(integer);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Long minPrice) {
      if (this.minPrice == null) this.minPrice = new Number();
      this.minPrice.setLong(minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Float minPrice) {
      if (this.minPrice == null) this.minPrice = new Number();
      this.minPrice.setFloat(minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull Double minPrice) {
      if (this.minPrice == null) this.minPrice = new Number();
      this.minPrice.setDouble(minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    @NotNull public Builder minPrice(@NotNull String minPrice) {
      if (this.minPrice == null) this.minPrice = new Number();
      this.minPrice.setString(minPrice);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
<br />
<br />
      Usage guidelines:
<br />
<ul>
<li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
      including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
</li>
<li>
      Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
</li>
<li>
      Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
      alongside more human-friendly formatting.
</li>
<li>
      Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
</li>
</ul>
      
     */
    @NotNull public Builder price(@NotNull Number number) {
      if (this.price == null) this.price = new NumberOrString();
      this.price.setNumber(number);
      return this;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
<br />
<br />
      Usage guidelines:
<br />
<ul>
<li>Use the <a href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
      including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.
</li>
<li>
      Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
</li>
<li>
      Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values
      alongside more human-friendly formatting.
</li>
<li>
      Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
</li>
</ul>
      
     */
    @NotNull public Builder price(@NotNull String price) {
      if (this.price == null) this.price = new NumberOrString();
      this.price.setString(price);
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      this.validFrom = date;
      return this;
    }
    /**
     * The end of the validity of offer, price specification, or opening hours data.
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      this.validThrough = date;
      return this;
    }
    /**
     * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
     */
    @NotNull public Builder valueAddedTaxIncluded(@NotNull Boolean valueAddedTaxIncluded) {
      this.valueAddedTaxIncluded = valueAddedTaxIncluded;
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    @NotNull public Builder priceCurrency(@NotNull String priceCurrency) {
      this.priceCurrency = priceCurrency;
      return this;
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
        if ("eligibleQuantity".equals(key) && value instanceof QuantitativeValue) { eligibleQuantity((QuantitativeValue)value); continue; }
        if ("eligibleTransactionVolume".equals(key) && value instanceof PriceSpecification) { eligibleTransactionVolume((PriceSpecification)value); continue; }
        if ("maxPrice".equals(key) && value instanceof Integer) { maxPrice((Integer)value); continue; }
        if ("maxPrice".equals(key) && value instanceof Long) { maxPrice((Long)value); continue; }
        if ("maxPrice".equals(key) && value instanceof Float) { maxPrice((Float)value); continue; }
        if ("maxPrice".equals(key) && value instanceof Double) { maxPrice((Double)value); continue; }
        if ("maxPrice".equals(key) && value instanceof String) { maxPrice((String)value); continue; }
        if ("minPrice".equals(key) && value instanceof Integer) { minPrice((Integer)value); continue; }
        if ("minPrice".equals(key) && value instanceof Long) { minPrice((Long)value); continue; }
        if ("minPrice".equals(key) && value instanceof Float) { minPrice((Float)value); continue; }
        if ("minPrice".equals(key) && value instanceof Double) { minPrice((Double)value); continue; }
        if ("minPrice".equals(key) && value instanceof String) { minPrice((String)value); continue; }
        if ("price".equals(key) && value instanceof Number) { price((Number)value); continue; }
        if ("price".equals(key) && value instanceof String) { price((String)value); continue; }
        if ("validFrom".equals(key) && value instanceof java.util.Date) { validFrom((java.util.Date)value); continue; }
        if ("validThrough".equals(key) && value instanceof java.util.Date) { validThrough((java.util.Date)value); continue; }
        if ("valueAddedTaxIncluded".equals(key) && value instanceof Boolean) { valueAddedTaxIncluded((Boolean)value); continue; }
        if ("priceCurrency".equals(key) && value instanceof String) { priceCurrency((String)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private QuantitativeValue eligibleQuantity;
    private PriceSpecification eligibleTransactionVolume;
    private Number maxPrice;
    private Number minPrice;
    private NumberOrString price;
    private java.util.Date validFrom;
    private java.util.Date validThrough;
    private Boolean valueAddedTaxIncluded;
    private String priceCurrency;
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
  public interface Builder extends ThingBuilder<PriceSpecification> {
    @NotNull Builder eligibleQuantity(@NotNull QuantitativeValue quantitativeValue);
    @NotNull Builder eligibleQuantity(@NotNull QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder eligibleTransactionVolume(@NotNull PriceSpecification priceSpecification);
    @NotNull Builder eligibleTransactionVolume(@NotNull PriceSpecification.Builder priceSpecification);
    @NotNull Builder maxPrice(@NotNull Integer integer);
    @NotNull Builder maxPrice(@NotNull Long maxPrice);
    @NotNull Builder maxPrice(@NotNull Float maxPrice);
    @NotNull Builder maxPrice(@NotNull Double maxPrice);
    @NotNull Builder maxPrice(@NotNull String maxPrice);
    @NotNull Builder minPrice(@NotNull Integer integer);
    @NotNull Builder minPrice(@NotNull Long minPrice);
    @NotNull Builder minPrice(@NotNull Float minPrice);
    @NotNull Builder minPrice(@NotNull Double minPrice);
    @NotNull Builder minPrice(@NotNull String minPrice);
    @NotNull Builder price(@NotNull Number number);
    @NotNull Builder price(@NotNull String price);
    @NotNull Builder validFrom(@NotNull java.util.Date date);
    @NotNull Builder validThrough(@NotNull java.util.Date date);
    @NotNull Builder valueAddedTaxIncluded(@NotNull Boolean valueAddedTaxIncluded);
    @NotNull Builder priceCurrency(@NotNull String priceCurrency);
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

  protected PriceSpecification(QuantitativeValue eligibleQuantity, PriceSpecification eligibleTransactionVolume, Number maxPrice, Number minPrice, NumberOrString price, java.util.Date validFrom, java.util.Date validThrough, Boolean valueAddedTaxIncluded, String priceCurrency, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myEligibleQuantity = eligibleQuantity;
    myEligibleTransactionVolume = eligibleTransactionVolume;
    myMaxPrice = maxPrice;
    myMinPrice = minPrice;
    myPrice = price;
    myValidFrom = validFrom;
    myValidThrough = validThrough;
    myValueAddedTaxIncluded = valueAddedTaxIncluded;
    myPriceCurrency = priceCurrency;
  }
  private QuantitativeValue myEligibleQuantity;
  private PriceSpecification myEligibleTransactionVolume;
  private Number myMaxPrice;
  private Number myMinPrice;
  private NumberOrString myPrice;
  private java.util.Date myValidFrom;
  private java.util.Date myValidThrough;
  private Boolean myValueAddedTaxIncluded;
  private String myPriceCurrency;
}
