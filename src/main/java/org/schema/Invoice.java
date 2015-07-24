/*
 * Copyright 2015 JetBrains s.r.o.
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
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
  public static final class Builder {
    /**
     * Creates new {@link Invoice} instance.
     */
    public Invoice build() {
      return new Invoice(confirmationNumber, customer, paymentDue, paymentMethod, paymentMethodId, provider, broker, totalPaymentDue, minimumPaymentDue, accountId, scheduledPaymentDate, billingPeriod, paymentStatus, referencesOrder, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A number that confirms the given order or payment has been received.
     */
    public Builder confirmationNumber(String confirmationNumber) {
      this.confirmationNumber = confirmationNumber;
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    public Builder customer(Organization organization) {
      if(this.customer == null) this.customer = new OrganizationOrPerson();
      this.customer.setOrganization(organization);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    public Builder customer(Person person) {
      if(this.customer == null) this.customer = new OrganizationOrPerson();
      this.customer.setPerson(person);
      return this;
    }
    /**
     * The date that payment is due.
     */
    public Builder paymentDue(java.util.Date date) {
      this.paymentDue = date;
      return this;
    }
    /**
     * The name of the credit card or other method of payment for the order.
     */
    public Builder paymentMethod(PaymentMethod paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }
    /**
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     */
    public Builder paymentMethodId(String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization organization) {
      if(this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person person) {
      if(this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setPerson(person);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Organization organization) {
      if(this.broker == null) this.broker = new OrganizationOrPerson();
      this.broker.setOrganization(organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Person person) {
      if(this.broker == null) this.broker = new OrganizationOrPerson();
      this.broker.setPerson(person);
      return this;
    }
    /**
     * The total amount due.
     */
    public Builder totalPaymentDue(PriceSpecification priceSpecification) {
      this.totalPaymentDue = priceSpecification;
      return this;
    }
    /**
     * The minimum payment required at this time.
     */
    public Builder minimumPaymentDue(PriceSpecification priceSpecification) {
      this.minimumPaymentDue = priceSpecification;
      return this;
    }
    /**
     * The identifier for the account the payment will be applied to.
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
    /**
     * The date the invoice is scheduled to be paid.
     */
    public Builder scheduledPaymentDate(java.util.Date date) {
      this.scheduledPaymentDate = date;
      return this;
    }
    /**
     * The time interval used to compute the invoice.
     */
    public Builder billingPeriod(Duration duration) {
      this.billingPeriod = duration;
      return this;
    }
    /**
     * The status of payment; whether the invoice has been paid or not.
     */
    public Builder paymentStatus(String paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
    }
    /**
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     */
    public Builder referencesOrder(Order order) {
      this.referencesOrder = order;
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
      if(this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      if(this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
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
    public Builder id(String id) {
      this.id = id;
      return this;
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
