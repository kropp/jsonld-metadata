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
 * A statement of the money due for goods or services; a bill.
 */
public class Invoice extends Intangible {
  /**
   * A number that confirms the given order or payment has been received.
   */
  @JsonIgnore public String getConfirmationNumber() {
    return (String) getValue("confirmationNumber");
  }
  /**
   * A number that confirms the given order or payment has been received.
   */
  @JsonIgnore public Collection<String> getConfirmationNumbers() {
    final Object current = myData.get("confirmationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Party placing the order or paying the invoice.
   */
  @JsonIgnore public Organization getCustomerOrganization() {
    return (Organization) getValue("customer");
  }
  /**
   * Party placing the order or paying the invoice.
   */
  @JsonIgnore public Collection<Organization> getCustomerOrganizations() {
    final Object current = myData.get("customer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Party placing the order or paying the invoice.
   */
  @JsonIgnore public Person getCustomerPerson() {
    return (Person) getValue("customer");
  }
  /**
   * Party placing the order or paying the invoice.
   */
  @JsonIgnore public Collection<Person> getCustomerPersons() {
    final Object current = myData.get("customer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The date that payment is due.
   */
  @JsonIgnore public java.util.Date getPaymentDue() {
    return (java.util.Date) getValue("paymentDue");
  }
  /**
   * The date that payment is due.
   */
  @JsonIgnore public Collection<java.util.Date> getPaymentDues() {
    final Object current = myData.get("paymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The name of the credit card or other method of payment for the order.
   */
  @JsonIgnore public PaymentMethod getPaymentMethod() {
    return (PaymentMethod) getValue("paymentMethod");
  }
  /**
   * The name of the credit card or other method of payment for the order.
   */
  @JsonIgnore public Collection<PaymentMethod> getPaymentMethods() {
    final Object current = myData.get("paymentMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PaymentMethod>) current;
    }
    return Arrays.asList((PaymentMethod) current);
  }
  /**
   * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
   */
  @JsonIgnore public String getPaymentMethodId() {
    return (String) getValue("paymentMethodId");
  }
  /**
   * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
   */
  @JsonIgnore public Collection<String> getPaymentMethodIds() {
    final Object current = myData.get("paymentMethodId");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Organization getProviderOrganization() {
    return (Organization) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Collection<Organization> getProviderOrganizations() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Person getProviderPerson() {
    return (Person) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Collection<Person> getProviderPersons() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public Organization getBrokerOrganization() {
    return (Organization) getValue("broker");
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public Collection<Organization> getBrokerOrganizations() {
    final Object current = myData.get("broker");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public Person getBrokerPerson() {
    return (Person) getValue("broker");
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  @JsonIgnore public Collection<Person> getBrokerPersons() {
    final Object current = myData.get("broker");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The total amount due.
   */
  @JsonIgnore public PriceSpecification getTotalPaymentDue() {
    return (PriceSpecification) getValue("totalPaymentDue");
  }
  /**
   * The total amount due.
   */
  @JsonIgnore public Collection<PriceSpecification> getTotalPaymentDues() {
    final Object current = myData.get("totalPaymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * The minimum payment required at this time.
   */
  @JsonIgnore public PriceSpecification getMinimumPaymentDue() {
    return (PriceSpecification) getValue("minimumPaymentDue");
  }
  /**
   * The minimum payment required at this time.
   */
  @JsonIgnore public Collection<PriceSpecification> getMinimumPaymentDues() {
    final Object current = myData.get("minimumPaymentDue");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * The identifier for the account the payment will be applied to.
   */
  @JsonIgnore public String getAccountId() {
    return (String) getValue("accountId");
  }
  /**
   * The identifier for the account the payment will be applied to.
   */
  @JsonIgnore public Collection<String> getAccountIds() {
    final Object current = myData.get("accountId");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date the invoice is scheduled to be paid.
   */
  @JsonIgnore public java.util.Date getScheduledPaymentDate() {
    return (java.util.Date) getValue("scheduledPaymentDate");
  }
  /**
   * The date the invoice is scheduled to be paid.
   */
  @JsonIgnore public Collection<java.util.Date> getScheduledPaymentDates() {
    final Object current = myData.get("scheduledPaymentDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The time interval used to compute the invoice.
   */
  @JsonIgnore public Duration getBillingPeriod() {
    return (Duration) getValue("billingPeriod");
  }
  /**
   * The time interval used to compute the invoice.
   */
  @JsonIgnore public Collection<Duration> getBillingPeriods() {
    final Object current = myData.get("billingPeriod");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   */
  @JsonIgnore public String getPaymentStatus() {
    return (String) getValue("paymentStatus");
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   */
  @JsonIgnore public Collection<String> getPaymentStatuss() {
    final Object current = myData.get("paymentStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
   */
  @JsonIgnore public Order getReferencesOrder() {
    return (Order) getValue("referencesOrder");
  }
  /**
   * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
   */
  @JsonIgnore public Collection<Order> getReferencesOrders() {
    final Object current = myData.get("referencesOrder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Order>) current;
    }
    return Arrays.asList((Order) current);
  }
  protected Invoice(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Invoice}
   */
  public static class Builder extends Intangible.Builder {
    public Invoice build() {
      return new Invoice(myData);
    }
    /**
     * A number that confirms the given order or payment has been received.
     */
    @NotNull public Builder confirmationNumber(@NotNull String confirmationNumber) {
      putValue("confirmationNumber", confirmationNumber);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Organization organization) {
      putValue("customer", organization);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Organization.Builder organization) {
      putValue("customer", organization.build());
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Person person) {
      putValue("customer", person);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Person.Builder person) {
      putValue("customer", person.build());
      return this;
    }
    /**
     * The date that payment is due.
     */
    @NotNull public Builder paymentDue(@NotNull java.util.Date date) {
      putValue("paymentDue", date);
      return this;
    }
    /**
     * The name of the credit card or other method of payment for the order.
     */
    @NotNull public Builder paymentMethod(@NotNull PaymentMethod paymentMethod) {
      putValue("paymentMethod", paymentMethod);
      return this;
    }
    /**
     * The name of the credit card or other method of payment for the order.
     */
    @NotNull public Builder paymentMethod(@NotNull PaymentMethod.Builder paymentMethod) {
      putValue("paymentMethod", paymentMethod.build());
      return this;
    }
    /**
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     */
    @NotNull public Builder paymentMethodId(@NotNull String paymentMethodId) {
      putValue("paymentMethodId", paymentMethodId);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Organization organization) {
      putValue("broker", organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Organization.Builder organization) {
      putValue("broker", organization.build());
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Person person) {
      putValue("broker", person);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Person.Builder person) {
      putValue("broker", person.build());
      return this;
    }
    /**
     * The total amount due.
     */
    @NotNull public Builder totalPaymentDue(@NotNull PriceSpecification priceSpecification) {
      putValue("totalPaymentDue", priceSpecification);
      return this;
    }
    /**
     * The total amount due.
     */
    @NotNull public Builder totalPaymentDue(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("totalPaymentDue", priceSpecification.build());
      return this;
    }
    /**
     * The minimum payment required at this time.
     */
    @NotNull public Builder minimumPaymentDue(@NotNull PriceSpecification priceSpecification) {
      putValue("minimumPaymentDue", priceSpecification);
      return this;
    }
    /**
     * The minimum payment required at this time.
     */
    @NotNull public Builder minimumPaymentDue(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("minimumPaymentDue", priceSpecification.build());
      return this;
    }
    /**
     * The identifier for the account the payment will be applied to.
     */
    @NotNull public Builder accountId(@NotNull String accountId) {
      putValue("accountId", accountId);
      return this;
    }
    /**
     * The date the invoice is scheduled to be paid.
     */
    @NotNull public Builder scheduledPaymentDate(@NotNull java.util.Date date) {
      putValue("scheduledPaymentDate", date);
      return this;
    }
    /**
     * The time interval used to compute the invoice.
     */
    @NotNull public Builder billingPeriod(@NotNull Duration duration) {
      putValue("billingPeriod", duration);
      return this;
    }
    /**
     * The time interval used to compute the invoice.
     */
    @NotNull public Builder billingPeriod(@NotNull Duration.Builder duration) {
      putValue("billingPeriod", duration.build());
      return this;
    }
    /**
     * The status of payment; whether the invoice has been paid or not.
     */
    @NotNull public Builder paymentStatus(@NotNull String paymentStatus) {
      putValue("paymentStatus", paymentStatus);
      return this;
    }
    /**
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     */
    @NotNull public Builder referencesOrder(@NotNull Order order) {
      putValue("referencesOrder", order);
      return this;
    }
    /**
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     */
    @NotNull public Builder referencesOrder(@NotNull Order.Builder order) {
      putValue("referencesOrder", order.build());
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
      if ("confirmationNumber".equals(key) && value instanceof String) { confirmationNumber((String)value); return; }
      if ("customer".equals(key) && value instanceof Organization) { customer((Organization)value); return; }
      if ("customer".equals(key) && value instanceof Person) { customer((Person)value); return; }
      if ("paymentDue".equals(key) && value instanceof java.util.Date) { paymentDue((java.util.Date)value); return; }
      if ("paymentMethod".equals(key) && value instanceof PaymentMethod) { paymentMethod((PaymentMethod)value); return; }
      if ("paymentMethodId".equals(key) && value instanceof String) { paymentMethodId((String)value); return; }
      if ("provider".equals(key) && value instanceof Organization) { provider((Organization)value); return; }
      if ("provider".equals(key) && value instanceof Person) { provider((Person)value); return; }
      if ("broker".equals(key) && value instanceof Organization) { broker((Organization)value); return; }
      if ("broker".equals(key) && value instanceof Person) { broker((Person)value); return; }
      if ("totalPaymentDue".equals(key) && value instanceof PriceSpecification) { totalPaymentDue((PriceSpecification)value); return; }
      if ("minimumPaymentDue".equals(key) && value instanceof PriceSpecification) { minimumPaymentDue((PriceSpecification)value); return; }
      if ("accountId".equals(key) && value instanceof String) { accountId((String)value); return; }
      if ("scheduledPaymentDate".equals(key) && value instanceof java.util.Date) { scheduledPaymentDate((java.util.Date)value); return; }
      if ("billingPeriod".equals(key) && value instanceof Duration) { billingPeriod((Duration)value); return; }
      if ("paymentStatus".equals(key) && value instanceof String) { paymentStatus((String)value); return; }
      if ("referencesOrder".equals(key) && value instanceof Order) { referencesOrder((Order)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
