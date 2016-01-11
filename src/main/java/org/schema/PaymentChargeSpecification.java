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

/**
 * The costs of settling the payment using a particular payment method.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class PaymentChargeSpecification extends PriceSpecification {
  /**
   * The delivery method(s) to which the delivery charge or payment charge specification applies.
   */
  public DeliveryMethod getAppliesToDeliveryMethod() {
    return myAppliesToDeliveryMethod;
  }
  /**
   * The payment method(s) to which the payment charge specification applies.
   */
  public PaymentMethod getAppliesToPaymentMethod() {
    return myAppliesToPaymentMethod;
  }
  /**
   * Builder for {@link PaymentChargeSpecification}
   */
  public static final class PaymentChargeSpecificationThingBuilder implements Builder {
    /**
     * Creates new {@link PaymentChargeSpecification} instance.
     */
    public PaymentChargeSpecification build() {
      return new PaymentChargeSpecification(appliesToDeliveryMethod, appliesToPaymentMethod, eligibleQuantity, eligibleTransactionVolume, maxPrice, minPrice, price, validFrom, validThrough, valueAddedTaxIncluded, priceCurrency, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     */
    public Builder appliesToDeliveryMethod(DeliveryMethod deliveryMethod) {
      this.appliesToDeliveryMethod = deliveryMethod;
      return this;
    }
    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     */
    public Builder appliesToDeliveryMethod(DeliveryMethod.Builder deliveryMethod) {
      return this.appliesToDeliveryMethod(deliveryMethod.build());
    }
    /**
     * The payment method(s) to which the payment charge specification applies.
     */
    public Builder appliesToPaymentMethod(PaymentMethod paymentMethod) {
      this.appliesToPaymentMethod = paymentMethod;
      return this;
    }
    /**
     * The payment method(s) to which the payment charge specification applies.
     */
    public Builder appliesToPaymentMethod(PaymentMethod.Builder paymentMethod) {
      return this.appliesToPaymentMethod(paymentMethod.build());
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    public Builder eligibleQuantity(QuantitativeValue quantitativeValue) {
      this.eligibleQuantity = quantitativeValue;
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    public Builder eligibleQuantity(QuantitativeValue.Builder quantitativeValue) {
      return this.eligibleQuantity(quantitativeValue.build());
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    public Builder eligibleTransactionVolume(PriceSpecification priceSpecification) {
      this.eligibleTransactionVolume = priceSpecification;
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    public Builder eligibleTransactionVolume(PriceSpecification.Builder priceSpecification) {
      return this.eligibleTransactionVolume(priceSpecification.build());
    }
    /**
     * The highest price if the price is a range.
     */
    public Builder maxPrice(Integer integer) {
      if (this.maxPrice == null) this.maxPrice = new Number();
      this.maxPrice.setInteger(integer);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    public Builder maxPrice(Long maxPrice) {
      if (this.maxPrice == null) this.maxPrice = new Number();
      this.maxPrice.setLong(maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    public Builder maxPrice(Float maxPrice) {
      if (this.maxPrice == null) this.maxPrice = new Number();
      this.maxPrice.setFloat(maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    public Builder maxPrice(Double maxPrice) {
      if (this.maxPrice == null) this.maxPrice = new Number();
      this.maxPrice.setDouble(maxPrice);
      return this;
    }
    /**
     * The highest price if the price is a range.
     */
    public Builder maxPrice(String maxPrice) {
      if (this.maxPrice == null) this.maxPrice = new Number();
      this.maxPrice.setString(maxPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    public Builder minPrice(Integer integer) {
      if (this.minPrice == null) this.minPrice = new Number();
      this.minPrice.setInteger(integer);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    public Builder minPrice(Long minPrice) {
      if (this.minPrice == null) this.minPrice = new Number();
      this.minPrice.setLong(minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    public Builder minPrice(Float minPrice) {
      if (this.minPrice == null) this.minPrice = new Number();
      this.minPrice.setFloat(minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    public Builder minPrice(Double minPrice) {
      if (this.minPrice == null) this.minPrice = new Number();
      this.minPrice.setDouble(minPrice);
      return this;
    }
    /**
     * The lowest price if the price is a range.
     */
    public Builder minPrice(String minPrice) {
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
    public Builder price(Number number) {
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
    public Builder price(String price) {
      if (this.price == null) this.price = new NumberOrString();
      this.price.setString(price);
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    public Builder validFrom(java.util.Date date) {
      this.validFrom = date;
      return this;
    }
    /**
     * The end of the validity of offer, price specification, or opening hours data.
     */
    public Builder validThrough(java.util.Date date) {
      this.validThrough = date;
      return this;
    }
    /**
     * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
     */
    public Builder valueAddedTaxIncluded(Boolean valueAddedTaxIncluded) {
      this.valueAddedTaxIncluded = valueAddedTaxIncluded;
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to PriceSpecification and its subtypes.
     */
    public Builder priceCurrency(String priceCurrency) {
      this.priceCurrency = priceCurrency;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String description) {
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
    public Builder mainEntityOfPage(CreativeWork creativeWork) {
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
    public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private DeliveryMethod appliesToDeliveryMethod;
    private PaymentMethod appliesToPaymentMethod;
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
  public interface Builder extends ThingBuilder<PaymentChargeSpecification> {
  Builder appliesToDeliveryMethod(DeliveryMethod deliveryMethod);
  Builder appliesToDeliveryMethod(DeliveryMethod.Builder deliveryMethod);
  Builder appliesToPaymentMethod(PaymentMethod paymentMethod);
  Builder appliesToPaymentMethod(PaymentMethod.Builder paymentMethod);
  Builder eligibleQuantity(QuantitativeValue quantitativeValue);
  Builder eligibleQuantity(QuantitativeValue.Builder quantitativeValue);
  Builder eligibleTransactionVolume(PriceSpecification priceSpecification);
  Builder eligibleTransactionVolume(PriceSpecification.Builder priceSpecification);
  Builder maxPrice(Integer integer);
  Builder maxPrice(Long maxPrice);
  Builder maxPrice(Float maxPrice);
  Builder maxPrice(Double maxPrice);
  Builder maxPrice(String maxPrice);
  Builder minPrice(Integer integer);
  Builder minPrice(Long minPrice);
  Builder minPrice(Float minPrice);
  Builder minPrice(Double minPrice);
  Builder minPrice(String minPrice);
  Builder price(Number number);
  Builder price(String price);
  Builder validFrom(java.util.Date date);
  Builder validThrough(java.util.Date date);
  Builder valueAddedTaxIncluded(Boolean valueAddedTaxIncluded);
  Builder priceCurrency(String priceCurrency);
  Builder additionalType(String additionalType);
  Builder alternateName(String alternateName);
  Builder description(String description);
  Builder mainEntityOfPage(CreativeWork creativeWork);
  Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
  Builder mainEntityOfPage(String mainEntityOfPage);
  Builder name(String name);
  Builder sameAs(String sameAs);
  Builder url(String url);
  Builder potentialAction(Action action);
  Builder potentialAction(Action.Builder action);
  Builder id(String id);
  }

  protected PaymentChargeSpecification(DeliveryMethod appliesToDeliveryMethod, PaymentMethod appliesToPaymentMethod, QuantitativeValue eligibleQuantity, PriceSpecification eligibleTransactionVolume, Number maxPrice, Number minPrice, NumberOrString price, java.util.Date validFrom, java.util.Date validThrough, Boolean valueAddedTaxIncluded, String priceCurrency, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(eligibleQuantity, eligibleTransactionVolume, maxPrice, minPrice, price, validFrom, validThrough, valueAddedTaxIncluded, priceCurrency, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myAppliesToDeliveryMethod = appliesToDeliveryMethod;
    myAppliesToPaymentMethod = appliesToPaymentMethod;
  }
  private DeliveryMethod myAppliesToDeliveryMethod;
  private PaymentMethod myAppliesToPaymentMethod;
}
