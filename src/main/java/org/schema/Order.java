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
 * An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.
 */
public class Order extends Intangible {
  /**
   * The delivery of the parcel related to this order or order item.
   */
  public ParcelDelivery getOrderDelivery() {
    return myOrderDelivery;
  }
  /**
   * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
   */
  public Offer getAcceptedOffer() {
    return myAcceptedOffer;
  }
  /**
   * The billing address for the order.
   */
  public PostalAddress getBillingAddress() {
    return myBillingAddress;
  }
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
   * Any discount applied (to an Order).
   */
  public NumberOrString getDiscount() {
    return myDiscount;
  }
  /**
   * Code used to redeem a discount.
   */
  public String getDiscountCode() {
    return myDiscountCode;
  }
  /**
   * The currency (in 3-letter ISO 4217 format) of the discount.
   */
  public String getDiscountCurrency() {
    return myDiscountCurrency;
  }
  /**
   * Was the offer accepted as a gift for someone other than the buyer.
   */
  public Boolean getIsGift() {
    return myIsGift;
  }
  /**
   * Date order was placed.
   */
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getOrderDate() {
    return myOrderDate;
  }
  /**
   * The item ordered.
   */
  public OrderItemOrProduct getOrderedItem() {
    return myOrderedItem;
  }
  /**
   * The identifier of the transaction.
   */
  public String getOrderNumber() {
    return myOrderNumber;
  }
  /**
   * The current status of the order.
   */
  public OrderStatus getOrderStatus() {
    return myOrderStatus;
  }
  /**
   * The order is being paid as part of the referenced Invoice.
   */
  public Invoice getPartOfInvoice() {
    return myPartOfInvoice;
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
   * The URL for sending a payment.
   */
  public String getPaymentUrl() {
    return myPaymentUrl;
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  public Participant getSeller() {
    return mySeller;
  }
  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
   */
  public OrganizationOrPerson getBroker() {
    return myBroker;
  }
  /**
   * Builder for {@link Order}
   */
  public static final class OrderThingBuilder implements Builder {
    /**
     * Creates new {@link Order} instance.
     */
    public Order build() {
      return new Order(orderDelivery, acceptedOffer, billingAddress, confirmationNumber, customer, discount, discountCode, discountCurrency, isGift, orderDate, orderedItem, orderNumber, orderStatus, partOfInvoice, paymentDue, paymentMethod, paymentMethodId, paymentUrl, seller, broker, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The delivery of the parcel related to this order or order item.
     */
    public Builder orderDelivery(ParcelDelivery parcelDelivery) {
      this.orderDelivery = parcelDelivery;
      return this;
    }
    /**
     * The delivery of the parcel related to this order or order item.
     */
    public Builder orderDelivery(ParcelDelivery.Builder parcelDelivery) {
      return this.orderDelivery(parcelDelivery.build());
    }
    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     */
    public Builder acceptedOffer(Offer offer) {
      this.acceptedOffer = offer;
      return this;
    }
    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     */
    public Builder acceptedOffer(Offer.Builder offer) {
      return this.acceptedOffer(offer.build());
    }
    /**
     * The billing address for the order.
     */
    public Builder billingAddress(PostalAddress postalAddress) {
      this.billingAddress = postalAddress;
      return this;
    }
    /**
     * The billing address for the order.
     */
    public Builder billingAddress(PostalAddress.Builder postalAddress) {
      return this.billingAddress(postalAddress.build());
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
      if (this.customer == null) this.customer = new OrganizationOrPerson();
      this.customer.setOrganization(organization);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    public Builder customer(Organization.Builder organization) {
      return this.customer(organization.build());
    }
    /**
     * Party placing the order or paying the invoice.
     */
    public Builder customer(Person person) {
      if (this.customer == null) this.customer = new OrganizationOrPerson();
      this.customer.setPerson(person);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    public Builder customer(Person.Builder person) {
      return this.customer(person.build());
    }
    /**
     * Any discount applied (to an Order).
     */
    public Builder discount(Number number) {
      if (this.discount == null) this.discount = new NumberOrString();
      this.discount.setNumber(number);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    public Builder discount(String discount) {
      if (this.discount == null) this.discount = new NumberOrString();
      this.discount.setString(discount);
      return this;
    }
    /**
     * Code used to redeem a discount.
     */
    public Builder discountCode(String discountCode) {
      this.discountCode = discountCode;
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the discount.
     */
    public Builder discountCurrency(String discountCurrency) {
      this.discountCurrency = discountCurrency;
      return this;
    }
    /**
     * Was the offer accepted as a gift for someone other than the buyer.
     */
    public Builder isGift(Boolean isGift) {
      this.isGift = isGift;
      return this;
    }
    /**
     * Date order was placed.
     */
    public Builder orderDate(java.util.Date date) {
      this.orderDate = date;
      return this;
    }
    /**
     * The item ordered.
     */
    public Builder orderedItem(OrderItem orderItem) {
      if (this.orderedItem == null) this.orderedItem = new OrderItemOrProduct();
      this.orderedItem.setOrderItem(orderItem);
      return this;
    }
    /**
     * The item ordered.
     */
    public Builder orderedItem(OrderItem.Builder orderItem) {
      return this.orderedItem(orderItem.build());
    }
    /**
     * The item ordered.
     */
    public Builder orderedItem(Product product) {
      if (this.orderedItem == null) this.orderedItem = new OrderItemOrProduct();
      this.orderedItem.setProduct(product);
      return this;
    }
    /**
     * The item ordered.
     */
    public Builder orderedItem(Product.Builder product) {
      return this.orderedItem(product.build());
    }
    /**
     * The identifier of the transaction.
     */
    public Builder orderNumber(String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
    }
    /**
     * The current status of the order.
     */
    public Builder orderStatus(OrderStatus orderStatus) {
      this.orderStatus = orderStatus;
      return this;
    }
    /**
     * The current status of the order.
     */
    public Builder orderStatus(OrderStatus.Builder orderStatus) {
      return this.orderStatus(orderStatus.build());
    }
    /**
     * The order is being paid as part of the referenced Invoice.
     */
    public Builder partOfInvoice(Invoice invoice) {
      this.partOfInvoice = invoice;
      return this;
    }
    /**
     * The order is being paid as part of the referenced Invoice.
     */
    public Builder partOfInvoice(Invoice.Builder invoice) {
      return this.partOfInvoice(invoice.build());
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
     * The name of the credit card or other method of payment for the order.
     */
    public Builder paymentMethod(PaymentMethod.Builder paymentMethod) {
      return this.paymentMethod(paymentMethod.build());
    }
    /**
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     */
    public Builder paymentMethodId(String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
      return this;
    }
    /**
     * The URL for sending a payment.
     */
    public Builder paymentUrl(String paymentUrl) {
      this.paymentUrl = paymentUrl;
      return this;
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    public Builder seller(Participant participant) {
      this.seller = participant;
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Organization organization) {
      if (this.broker == null) this.broker = new OrganizationOrPerson();
      this.broker.setOrganization(organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Organization.Builder organization) {
      return this.broker(organization.build());
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Person person) {
      if (this.broker == null) this.broker = new OrganizationOrPerson();
      this.broker.setPerson(person);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Person.Builder person) {
      return this.broker(person.build());
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
    private ParcelDelivery orderDelivery;
    private Offer acceptedOffer;
    private PostalAddress billingAddress;
    private String confirmationNumber;
    private OrganizationOrPerson customer;
    private NumberOrString discount;
    private String discountCode;
    private String discountCurrency;
    private Boolean isGift;
    private java.util.Date orderDate;
    private OrderItemOrProduct orderedItem;
    private String orderNumber;
    private OrderStatus orderStatus;
    private Invoice partOfInvoice;
    private java.util.Date paymentDue;
    private PaymentMethod paymentMethod;
    private String paymentMethodId;
    private String paymentUrl;
    private Participant seller;
    private OrganizationOrPerson broker;
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
  public interface Builder extends ThingBuilder<Order> {
  Builder orderDelivery(ParcelDelivery parcelDelivery);
  Builder orderDelivery(ParcelDelivery.Builder parcelDelivery);
  Builder acceptedOffer(Offer offer);
  Builder acceptedOffer(Offer.Builder offer);
  Builder billingAddress(PostalAddress postalAddress);
  Builder billingAddress(PostalAddress.Builder postalAddress);
  Builder confirmationNumber(String confirmationNumber);
  Builder customer(Organization organization);
  Builder customer(Organization.Builder organization);
  Builder customer(Person person);
  Builder customer(Person.Builder person);
  Builder discount(Number number);
  Builder discount(String discount);
  Builder discountCode(String discountCode);
  Builder discountCurrency(String discountCurrency);
  Builder isGift(Boolean isGift);
  Builder orderDate(java.util.Date date);
  Builder orderedItem(OrderItem orderItem);
  Builder orderedItem(OrderItem.Builder orderItem);
  Builder orderedItem(Product product);
  Builder orderedItem(Product.Builder product);
  Builder orderNumber(String orderNumber);
  Builder orderStatus(OrderStatus orderStatus);
  Builder orderStatus(OrderStatus.Builder orderStatus);
  Builder partOfInvoice(Invoice invoice);
  Builder partOfInvoice(Invoice.Builder invoice);
  Builder paymentDue(java.util.Date date);
  Builder paymentMethod(PaymentMethod paymentMethod);
  Builder paymentMethod(PaymentMethod.Builder paymentMethod);
  Builder paymentMethodId(String paymentMethodId);
  Builder paymentUrl(String paymentUrl);
  Builder seller(Participant participant);
  Builder broker(Organization organization);
  Builder broker(Organization.Builder organization);
  Builder broker(Person person);
  Builder broker(Person.Builder person);
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

  protected Order(ParcelDelivery orderDelivery, Offer acceptedOffer, PostalAddress billingAddress, String confirmationNumber, OrganizationOrPerson customer, NumberOrString discount, String discountCode, String discountCurrency, Boolean isGift, java.util.Date orderDate, OrderItemOrProduct orderedItem, String orderNumber, OrderStatus orderStatus, Invoice partOfInvoice, java.util.Date paymentDue, PaymentMethod paymentMethod, String paymentMethodId, String paymentUrl, Participant seller, OrganizationOrPerson broker, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myOrderDelivery = orderDelivery;
    myAcceptedOffer = acceptedOffer;
    myBillingAddress = billingAddress;
    myConfirmationNumber = confirmationNumber;
    myCustomer = customer;
    myDiscount = discount;
    myDiscountCode = discountCode;
    myDiscountCurrency = discountCurrency;
    myIsGift = isGift;
    myOrderDate = orderDate;
    myOrderedItem = orderedItem;
    myOrderNumber = orderNumber;
    myOrderStatus = orderStatus;
    myPartOfInvoice = partOfInvoice;
    myPaymentDue = paymentDue;
    myPaymentMethod = paymentMethod;
    myPaymentMethodId = paymentMethodId;
    myPaymentUrl = paymentUrl;
    mySeller = seller;
    myBroker = broker;
  }
  private ParcelDelivery myOrderDelivery;
  private Offer myAcceptedOffer;
  private PostalAddress myBillingAddress;
  private String myConfirmationNumber;
  private OrganizationOrPerson myCustomer;
  private NumberOrString myDiscount;
  private String myDiscountCode;
  private String myDiscountCurrency;
  private Boolean myIsGift;
  private java.util.Date myOrderDate;
  private OrderItemOrProduct myOrderedItem;
  private String myOrderNumber;
  private OrderStatus myOrderStatus;
  private Invoice myPartOfInvoice;
  private java.util.Date myPaymentDue;
  private PaymentMethod myPaymentMethod;
  private String myPaymentMethodId;
  private String myPaymentUrl;
  private Participant mySeller;
  private OrganizationOrPerson myBroker;
}
