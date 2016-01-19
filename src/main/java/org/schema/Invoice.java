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
 * A statement of the money due for goods or services; a bill.
 */
public class Invoice extends Intangible {
  /**
   * A number that confirms the given order or payment has been received.
   */
  public String getConfirmationNumber() {
    return myConfirmationNumber;
  }
  /**
   * Party placing the order or paying the invoice.
   */
  public OrganizationOrPerson getCustomer() {
    return myCustomer;
  }
  /**
   * The date that payment is due.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getPaymentDue() {
    return myPaymentDue;
  }
  /**
   * The name of the credit card or other method of payment for the order.
   */
  public PaymentMethod getPaymentMethod() {
    return myPaymentMethod;
  }
  /**
   * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
   */
  public String getPaymentMethodId() {
    return myPaymentMethodId;
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public OrganizationOrPerson getProvider() {
    return myProvider;
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  public OrganizationOrPerson getBroker() {
    return myBroker;
  }
  /**
   * The total amount due.
   */
  public PriceSpecification getTotalPaymentDue() {
    return myTotalPaymentDue;
  }
  /**
   * The minimum payment required at this time.
   */
  public PriceSpecification getMinimumPaymentDue() {
    return myMinimumPaymentDue;
  }
  /**
   * The identifier for the account the payment will be applied to.
   */
  public String getAccountId() {
    return myAccountId;
  }
  /**
   * The date the invoice is scheduled to be paid.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getScheduledPaymentDate() {
    return myScheduledPaymentDate;
  }
  /**
   * The time interval used to compute the invoice.
   */
  public Duration getBillingPeriod() {
    return myBillingPeriod;
  }
  /**
   * The status of payment; whether the invoice has been paid or not.
   */
  public String getPaymentStatus() {
    return myPaymentStatus;
  }
  /**
   * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
   */
  public Order getReferencesOrder() {
    return myReferencesOrder;
  }
  /**
   * Builder for {@link Invoice}
   */
  static final class InvoiceThingBuilder implements Builder {
    /**
     * Creates new {@link Invoice} instance.
     */
    public Invoice build() {
      return new Invoice(confirmationNumber, customer, paymentDue, paymentMethod, paymentMethodId, provider, broker, totalPaymentDue, minimumPaymentDue, accountId, scheduledPaymentDate, billingPeriod, paymentStatus, referencesOrder, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A number that confirms the given order or payment has been received.
     */
    @NotNull public Builder confirmationNumber(@NotNull String confirmationNumber) {
      this.confirmationNumber = confirmationNumber;
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Organization organization) {
      if (this.customer == null) this.customer = new OrganizationOrPerson();
      this.customer.setOrganization(organization);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Organization.Builder organization) {
      return this.customer(organization.build());
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Person person) {
      if (this.customer == null) this.customer = new OrganizationOrPerson();
      this.customer.setPerson(person);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    @NotNull public Builder customer(@NotNull Person.Builder person) {
      return this.customer(person.build());
    }
    /**
     * The date that payment is due.
     */
    @NotNull public Builder paymentDue(@NotNull java.util.Date date) {
      this.paymentDue = date;
      return this;
    }
    /**
     * The name of the credit card or other method of payment for the order.
     */
    @NotNull public Builder paymentMethod(@NotNull PaymentMethod paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }
    /**
     * The name of the credit card or other method of payment for the order.
     */
    @NotNull public Builder paymentMethod(@NotNull PaymentMethod.Builder paymentMethod) {
      return this.paymentMethod(paymentMethod.build());
    }
    /**
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     */
    @NotNull public Builder paymentMethodId(@NotNull String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      return this.provider(organization.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setPerson(person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      return this.provider(person.build());
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Organization organization) {
      if (this.broker == null) this.broker = new OrganizationOrPerson();
      this.broker.setOrganization(organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Organization.Builder organization) {
      return this.broker(organization.build());
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Person person) {
      if (this.broker == null) this.broker = new OrganizationOrPerson();
      this.broker.setPerson(person);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @NotNull public Builder broker(@NotNull Person.Builder person) {
      return this.broker(person.build());
    }
    /**
     * The total amount due.
     */
    @NotNull public Builder totalPaymentDue(@NotNull PriceSpecification priceSpecification) {
      this.totalPaymentDue = priceSpecification;
      return this;
    }
    /**
     * The total amount due.
     */
    @NotNull public Builder totalPaymentDue(@NotNull PriceSpecification.Builder priceSpecification) {
      return this.totalPaymentDue(priceSpecification.build());
    }
    /**
     * The minimum payment required at this time.
     */
    @NotNull public Builder minimumPaymentDue(@NotNull PriceSpecification priceSpecification) {
      this.minimumPaymentDue = priceSpecification;
      return this;
    }
    /**
     * The minimum payment required at this time.
     */
    @NotNull public Builder minimumPaymentDue(@NotNull PriceSpecification.Builder priceSpecification) {
      return this.minimumPaymentDue(priceSpecification.build());
    }
    /**
     * The identifier for the account the payment will be applied to.
     */
    @NotNull public Builder accountId(@NotNull String accountId) {
      this.accountId = accountId;
      return this;
    }
    /**
     * The date the invoice is scheduled to be paid.
     */
    @NotNull public Builder scheduledPaymentDate(@NotNull java.util.Date date) {
      this.scheduledPaymentDate = date;
      return this;
    }
    /**
     * The time interval used to compute the invoice.
     */
    @NotNull public Builder billingPeriod(@NotNull Duration duration) {
      this.billingPeriod = duration;
      return this;
    }
    /**
     * The time interval used to compute the invoice.
     */
    @NotNull public Builder billingPeriod(@NotNull Duration.Builder duration) {
      return this.billingPeriod(duration.build());
    }
    /**
     * The status of payment; whether the invoice has been paid or not.
     */
    @NotNull public Builder paymentStatus(@NotNull String paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
    }
    /**
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     */
    @NotNull public Builder referencesOrder(@NotNull Order order) {
      this.referencesOrder = order;
      return this;
    }
    /**
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     */
    @NotNull public Builder referencesOrder(@NotNull Order.Builder order) {
      return this.referencesOrder(order.build());
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
        if ("confirmationNumber".equals(key) && value instanceof String) { confirmationNumber((String)value); continue; }
        if ("customer".equals(key) && value instanceof Organization) { customer((Organization)value); continue; }
        if ("customer".equals(key) && value instanceof Person) { customer((Person)value); continue; }
        if ("paymentDue".equals(key) && value instanceof java.util.Date) { paymentDue((java.util.Date)value); continue; }
        if ("paymentMethod".equals(key) && value instanceof PaymentMethod) { paymentMethod((PaymentMethod)value); continue; }
        if ("paymentMethodId".equals(key) && value instanceof String) { paymentMethodId((String)value); continue; }
        if ("provider".equals(key) && value instanceof Organization) { provider((Organization)value); continue; }
        if ("provider".equals(key) && value instanceof Person) { provider((Person)value); continue; }
        if ("broker".equals(key) && value instanceof Organization) { broker((Organization)value); continue; }
        if ("broker".equals(key) && value instanceof Person) { broker((Person)value); continue; }
        if ("totalPaymentDue".equals(key) && value instanceof PriceSpecification) { totalPaymentDue((PriceSpecification)value); continue; }
        if ("minimumPaymentDue".equals(key) && value instanceof PriceSpecification) { minimumPaymentDue((PriceSpecification)value); continue; }
        if ("accountId".equals(key) && value instanceof String) { accountId((String)value); continue; }
        if ("scheduledPaymentDate".equals(key) && value instanceof java.util.Date) { scheduledPaymentDate((java.util.Date)value); continue; }
        if ("billingPeriod".equals(key) && value instanceof Duration) { billingPeriod((Duration)value); continue; }
        if ("paymentStatus".equals(key) && value instanceof String) { paymentStatus((String)value); continue; }
        if ("referencesOrder".equals(key) && value instanceof Order) { referencesOrder((Order)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("@id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private String confirmationNumber;
    private OrganizationOrPerson customer;
    private java.util.Date paymentDue;
    private PaymentMethod paymentMethod;
    private String paymentMethodId;
    private OrganizationOrPerson provider;
    private OrganizationOrPerson broker;
    private PriceSpecification totalPaymentDue;
    private PriceSpecification minimumPaymentDue;
    private String accountId;
    private java.util.Date scheduledPaymentDate;
    private Duration billingPeriod;
    private String paymentStatus;
    private Order referencesOrder;
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
  public interface Builder extends ThingBuilder<Invoice> {
    @NotNull Builder confirmationNumber(@NotNull String confirmationNumber);
    @NotNull Builder customer(@NotNull Organization organization);
    @NotNull Builder customer(@NotNull Organization.Builder organization);
    @NotNull Builder customer(@NotNull Person person);
    @NotNull Builder customer(@NotNull Person.Builder person);
    @NotNull Builder paymentDue(@NotNull java.util.Date date);
    @NotNull Builder paymentMethod(@NotNull PaymentMethod paymentMethod);
    @NotNull Builder paymentMethod(@NotNull PaymentMethod.Builder paymentMethod);
    @NotNull Builder paymentMethodId(@NotNull String paymentMethodId);
    @NotNull Builder provider(@NotNull Organization organization);
    @NotNull Builder provider(@NotNull Organization.Builder organization);
    @NotNull Builder provider(@NotNull Person person);
    @NotNull Builder provider(@NotNull Person.Builder person);
    @NotNull Builder broker(@NotNull Organization organization);
    @NotNull Builder broker(@NotNull Organization.Builder organization);
    @NotNull Builder broker(@NotNull Person person);
    @NotNull Builder broker(@NotNull Person.Builder person);
    @NotNull Builder totalPaymentDue(@NotNull PriceSpecification priceSpecification);
    @NotNull Builder totalPaymentDue(@NotNull PriceSpecification.Builder priceSpecification);
    @NotNull Builder minimumPaymentDue(@NotNull PriceSpecification priceSpecification);
    @NotNull Builder minimumPaymentDue(@NotNull PriceSpecification.Builder priceSpecification);
    @NotNull Builder accountId(@NotNull String accountId);
    @NotNull Builder scheduledPaymentDate(@NotNull java.util.Date date);
    @NotNull Builder billingPeriod(@NotNull Duration duration);
    @NotNull Builder billingPeriod(@NotNull Duration.Builder duration);
    @NotNull Builder paymentStatus(@NotNull String paymentStatus);
    @NotNull Builder referencesOrder(@NotNull Order order);
    @NotNull Builder referencesOrder(@NotNull Order.Builder order);
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

  protected Invoice(String confirmationNumber, OrganizationOrPerson customer, java.util.Date paymentDue, PaymentMethod paymentMethod, String paymentMethodId, OrganizationOrPerson provider, OrganizationOrPerson broker, PriceSpecification totalPaymentDue, PriceSpecification minimumPaymentDue, String accountId, java.util.Date scheduledPaymentDate, Duration billingPeriod, String paymentStatus, Order referencesOrder, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myConfirmationNumber = confirmationNumber;
    myCustomer = customer;
    myPaymentDue = paymentDue;
    myPaymentMethod = paymentMethod;
    myPaymentMethodId = paymentMethodId;
    myProvider = provider;
    myBroker = broker;
    myTotalPaymentDue = totalPaymentDue;
    myMinimumPaymentDue = minimumPaymentDue;
    myAccountId = accountId;
    myScheduledPaymentDate = scheduledPaymentDate;
    myBillingPeriod = billingPeriod;
    myPaymentStatus = paymentStatus;
    myReferencesOrder = referencesOrder;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myConfirmationNumber != null ? myConfirmationNumber.hashCode() : 0);
    result = 31 * result + (myCustomer != null ? myCustomer.hashCode() : 0);
    result = 31 * result + (myPaymentDue != null ? myPaymentDue.hashCode() : 0);
    result = 31 * result + (myPaymentMethod != null ? myPaymentMethod.hashCode() : 0);
    result = 31 * result + (myPaymentMethodId != null ? myPaymentMethodId.hashCode() : 0);
    result = 31 * result + (myProvider != null ? myProvider.hashCode() : 0);
    result = 31 * result + (myBroker != null ? myBroker.hashCode() : 0);
    result = 31 * result + (myTotalPaymentDue != null ? myTotalPaymentDue.hashCode() : 0);
    result = 31 * result + (myMinimumPaymentDue != null ? myMinimumPaymentDue.hashCode() : 0);
    result = 31 * result + (myAccountId != null ? myAccountId.hashCode() : 0);
    result = 31 * result + (myScheduledPaymentDate != null ? myScheduledPaymentDate.hashCode() : 0);
    result = 31 * result + (myBillingPeriod != null ? myBillingPeriod.hashCode() : 0);
    result = 31 * result + (myPaymentStatus != null ? myPaymentStatus.hashCode() : 0);
    result = 31 * result + (myReferencesOrder != null ? myReferencesOrder.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Invoice invoice = (Invoice) o;
    if (!super.equals(o)) return false;
    if (myConfirmationNumber != null ? !myConfirmationNumber.equals(invoice.myConfirmationNumber) : invoice.myConfirmationNumber != null) return false;
    if (myCustomer != null ? !myCustomer.equals(invoice.myCustomer) : invoice.myCustomer != null) return false;
    if (myPaymentDue != null ? !myPaymentDue.equals(invoice.myPaymentDue) : invoice.myPaymentDue != null) return false;
    if (myPaymentMethod != null ? !myPaymentMethod.equals(invoice.myPaymentMethod) : invoice.myPaymentMethod != null) return false;
    if (myPaymentMethodId != null ? !myPaymentMethodId.equals(invoice.myPaymentMethodId) : invoice.myPaymentMethodId != null) return false;
    if (myProvider != null ? !myProvider.equals(invoice.myProvider) : invoice.myProvider != null) return false;
    if (myBroker != null ? !myBroker.equals(invoice.myBroker) : invoice.myBroker != null) return false;
    if (myTotalPaymentDue != null ? !myTotalPaymentDue.equals(invoice.myTotalPaymentDue) : invoice.myTotalPaymentDue != null) return false;
    if (myMinimumPaymentDue != null ? !myMinimumPaymentDue.equals(invoice.myMinimumPaymentDue) : invoice.myMinimumPaymentDue != null) return false;
    if (myAccountId != null ? !myAccountId.equals(invoice.myAccountId) : invoice.myAccountId != null) return false;
    if (myScheduledPaymentDate != null ? !myScheduledPaymentDate.equals(invoice.myScheduledPaymentDate) : invoice.myScheduledPaymentDate != null) return false;
    if (myBillingPeriod != null ? !myBillingPeriod.equals(invoice.myBillingPeriod) : invoice.myBillingPeriod != null) return false;
    if (myPaymentStatus != null ? !myPaymentStatus.equals(invoice.myPaymentStatus) : invoice.myPaymentStatus != null) return false;
    if (myReferencesOrder != null ? !myReferencesOrder.equals(invoice.myReferencesOrder) : invoice.myReferencesOrder != null) return false;
    return true;
  }

  private String myConfirmationNumber;
  private OrganizationOrPerson myCustomer;
  private java.util.Date myPaymentDue;
  private PaymentMethod myPaymentMethod;
  private String myPaymentMethodId;
  private OrganizationOrPerson myProvider;
  private OrganizationOrPerson myBroker;
  private PriceSpecification myTotalPaymentDue;
  private PriceSpecification myMinimumPaymentDue;
  private String myAccountId;
  private java.util.Date myScheduledPaymentDate;
  private Duration myBillingPeriod;
  private String myPaymentStatus;
  private Order myReferencesOrder;
}
