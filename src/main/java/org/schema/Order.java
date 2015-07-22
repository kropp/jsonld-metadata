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
 * Generated on Jul 22, 2015.
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
  public StringOrNumber getDiscount() {
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
  public java.util.Date getOrderDate() {
    return myOrderDate;
  }
  /**
   * The item ordered.
   */
  public ProductOrOrderItem getOrderedItem() {
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
  public static final class Builder {
    /**
     * Creates new {@link Order} instance.
     */
    public Order build() {
      return new Order(discountCurrency, seller, additionalType, sameAs, paymentMethodId, orderNumber, partOfInvoice, paymentMethod, potentialAction, customer, billingAddress, isGift, confirmationNumber, paymentUrl, orderDate, discountCode, discount, name, mainEntityOfPage, orderStatus, url, broker, acceptedOffer, alternateName, orderedItem, description, orderDelivery, paymentDue);
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the discount.
     */
    public Builder discountCurrency(String discountCurrency) {
      this.discountCurrency = discountCurrency;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     */
    public Builder paymentMethodId(String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
      return this;
    }
    /**
     * The identifier of the transaction.
     */
    public Builder orderNumber(String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
    }
    /**
     * The order is being paid as part of the referenced Invoice.
     */
    public Builder partOfInvoice(Invoice invoice) {
      this.partOfInvoice = invoice;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    public Builder customer(Organization organization) {
      this.customer.setOrganization(organization);
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    public Builder customer(Person person) {
      this.customer.setPerson(person);
      return this;
    }
    /**
     * The billing address for the order.
     */
    public Builder billingAddress(PostalAddress postalAddress) {
      this.billingAddress = postalAddress;
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
     * A number that confirms the given order or payment has been received.
     */
    public Builder confirmationNumber(String confirmationNumber) {
      this.confirmationNumber = confirmationNumber;
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
     * Date order was placed.
     */
    public Builder orderDate(java.util.Date date) {
      this.orderDate = date;
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
     * Any discount applied (to an Order).
     */
    public Builder discount(String discount) {
      this.discount.setString(discount);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    public Builder discount(Number number) {
      this.discount.setNumber(number);
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
      this.mainEntityOfPage.setString(mainEntityOfPage);
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
      this.mainEntityOfPage.setCreativeWork(creativeWork);
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
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Organization organization) {
      this.broker.setOrganization(organization);
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Person person) {
      this.broker.setPerson(person);
      return this;
    }
    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     */
    public Builder acceptedOffer(Offer offer) {
      this.acceptedOffer = offer;
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
     * The item ordered.
     */
    public Builder orderedItem(Product product) {
      this.orderedItem.setProduct(product);
      return this;
    }
    /**
     * The item ordered.
     */
    public Builder orderedItem(OrderItem orderItem) {
      this.orderedItem.setOrderItem(orderItem);
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
     * The delivery of the parcel related to this order or order item.
     */
    public Builder orderDelivery(ParcelDelivery parcelDelivery) {
      this.orderDelivery = parcelDelivery;
      return this;
    }
    /**
     * The date that payment is due.
     */
    public Builder paymentDue(java.util.Date date) {
      this.paymentDue = date;
      return this;
    }
    private String discountCurrency;
    private Participant seller;
    private String additionalType;
    private String sameAs;
    private String paymentMethodId;
    private String orderNumber;
    private Invoice partOfInvoice;
    private PaymentMethod paymentMethod;
    private Action potentialAction;
    private OrganizationOrPerson customer;
    private PostalAddress billingAddress;
    private Boolean isGift;
    private String confirmationNumber;
    private String paymentUrl;
    private java.util.Date orderDate;
    private String discountCode;
    private StringOrNumber discount;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private OrderStatus orderStatus;
    private String url;
    private OrganizationOrPerson broker;
    private Offer acceptedOffer;
    private String alternateName;
    private ProductOrOrderItem orderedItem;
    private String description;
    private ParcelDelivery orderDelivery;
    private java.util.Date paymentDue;
  }

  protected Order(String discountCurrency, Participant seller, String additionalType, String sameAs, String paymentMethodId, String orderNumber, Invoice partOfInvoice, PaymentMethod paymentMethod, Action potentialAction, OrganizationOrPerson customer, PostalAddress billingAddress, Boolean isGift, String confirmationNumber, String paymentUrl, java.util.Date orderDate, String discountCode, StringOrNumber discount, String name, StringOrCreativeWork mainEntityOfPage, OrderStatus orderStatus, String url, OrganizationOrPerson broker, Offer acceptedOffer, String alternateName, ProductOrOrderItem orderedItem, String description, ParcelDelivery orderDelivery, java.util.Date paymentDue) {
    super(additionalType, url, sameAs, alternateName, description, potentialAction, name, mainEntityOfPage);
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
  private StringOrNumber myDiscount;
  private String myDiscountCode;
  private String myDiscountCurrency;
  private Boolean myIsGift;
  private java.util.Date myOrderDate;
  private ProductOrOrderItem myOrderedItem;
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
