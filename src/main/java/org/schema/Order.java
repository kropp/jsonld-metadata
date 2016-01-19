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
  public Number getDiscount() {
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
  static final class OrderThingBuilder implements Builder {
    /**
     * Creates new {@link Order} instance.
     */
    public Order build() {
      return new Order(orderDelivery, acceptedOffer, billingAddress, confirmationNumber, customer, discount, discountCode, discountCurrency, isGift, orderDate, orderedItem, orderNumber, orderStatus, partOfInvoice, paymentDue, paymentMethod, paymentMethodId, paymentUrl, seller, broker, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The delivery of the parcel related to this order or order item.
     */
    @NotNull public Builder orderDelivery(@NotNull ParcelDelivery parcelDelivery) {
      this.orderDelivery = parcelDelivery;
      return this;
    }
    /**
     * The delivery of the parcel related to this order or order item.
     */
    @NotNull public Builder orderDelivery(@NotNull ParcelDelivery.Builder parcelDelivery) {
      return this.orderDelivery(parcelDelivery.build());
    }
    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     */
    @NotNull public Builder acceptedOffer(@NotNull Offer offer) {
      this.acceptedOffer = offer;
      return this;
    }
    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     */
    @NotNull public Builder acceptedOffer(@NotNull Offer.Builder offer) {
      return this.acceptedOffer(offer.build());
    }
    /**
     * The billing address for the order.
     */
    @NotNull public Builder billingAddress(@NotNull PostalAddress postalAddress) {
      this.billingAddress = postalAddress;
      return this;
    }
    /**
     * The billing address for the order.
     */
    @NotNull public Builder billingAddress(@NotNull PostalAddress.Builder postalAddress) {
      return this.billingAddress(postalAddress.build());
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
     * Any discount applied (to an Order).
     */
    @NotNull public Builder discount(@NotNull Integer integer) {
      if (this.discount == null) this.discount = new Number();
      this.discount.setInteger(integer);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    @NotNull public Builder discount(@NotNull Long discount) {
      if (this.discount == null) this.discount = new Number();
      this.discount.setLong(discount);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    @NotNull public Builder discount(@NotNull Float discount) {
      if (this.discount == null) this.discount = new Number();
      this.discount.setFloat(discount);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    @NotNull public Builder discount(@NotNull Double discount) {
      if (this.discount == null) this.discount = new Number();
      this.discount.setDouble(discount);
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    @NotNull public Builder discount(@NotNull String discount) {
      if (this.discount == null) this.discount = new Number();
      this.discount.setString(discount);
      return this;
    }
    /**
     * Code used to redeem a discount.
     */
    @NotNull public Builder discountCode(@NotNull String discountCode) {
      this.discountCode = discountCode;
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the discount.
     */
    @NotNull public Builder discountCurrency(@NotNull String discountCurrency) {
      this.discountCurrency = discountCurrency;
      return this;
    }
    /**
     * Was the offer accepted as a gift for someone other than the buyer.
     */
    @NotNull public Builder isGift(@NotNull Boolean isGift) {
      this.isGift = isGift;
      return this;
    }
    /**
     * Date order was placed.
     */
    @NotNull public Builder orderDate(@NotNull java.util.Date date) {
      this.orderDate = date;
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull OrderItem orderItem) {
      if (this.orderedItem == null) this.orderedItem = new OrderItemOrProduct();
      this.orderedItem.setOrderItem(orderItem);
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull OrderItem.Builder orderItem) {
      return this.orderedItem(orderItem.build());
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull Product product) {
      if (this.orderedItem == null) this.orderedItem = new OrderItemOrProduct();
      this.orderedItem.setProduct(product);
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull Product.Builder product) {
      return this.orderedItem(product.build());
    }
    /**
     * The identifier of the transaction.
     */
    @NotNull public Builder orderNumber(@NotNull String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
    }
    /**
     * The current status of the order.
     */
    @NotNull public Builder orderStatus(@NotNull OrderStatus orderStatus) {
      this.orderStatus = orderStatus;
      return this;
    }
    /**
     * The current status of the order.
     */
    @NotNull public Builder orderStatus(@NotNull OrderStatus.Builder orderStatus) {
      return this.orderStatus(orderStatus.build());
    }
    /**
     * The order is being paid as part of the referenced Invoice.
     */
    @NotNull public Builder partOfInvoice(@NotNull Invoice invoice) {
      this.partOfInvoice = invoice;
      return this;
    }
    /**
     * The order is being paid as part of the referenced Invoice.
     */
    @NotNull public Builder partOfInvoice(@NotNull Invoice.Builder invoice) {
      return this.partOfInvoice(invoice.build());
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
     * The URL for sending a payment.
     */
    @NotNull public Builder paymentUrl(@NotNull String paymentUrl) {
      this.paymentUrl = paymentUrl;
      return this;
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @NotNull public Builder seller(@NotNull Participant participant) {
      this.seller = participant;
      return this;
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
        if ("orderDelivery".equals(key) && value instanceof ParcelDelivery) { orderDelivery((ParcelDelivery)value); continue; }
        if ("acceptedOffer".equals(key) && value instanceof Offer) { acceptedOffer((Offer)value); continue; }
        if ("billingAddress".equals(key) && value instanceof PostalAddress) { billingAddress((PostalAddress)value); continue; }
        if ("confirmationNumber".equals(key) && value instanceof String) { confirmationNumber((String)value); continue; }
        if ("customer".equals(key) && value instanceof Organization) { customer((Organization)value); continue; }
        if ("customer".equals(key) && value instanceof Person) { customer((Person)value); continue; }
        if ("discount".equals(key) && value instanceof Integer) { discount((Integer)value); continue; }
        if ("discount".equals(key) && value instanceof Long) { discount((Long)value); continue; }
        if ("discount".equals(key) && value instanceof Float) { discount((Float)value); continue; }
        if ("discount".equals(key) && value instanceof Double) { discount((Double)value); continue; }
        if ("discount".equals(key) && value instanceof String) { discount((String)value); continue; }
        if ("discountCode".equals(key) && value instanceof String) { discountCode((String)value); continue; }
        if ("discountCurrency".equals(key) && value instanceof String) { discountCurrency((String)value); continue; }
        if ("isGift".equals(key) && value instanceof Boolean) { isGift((Boolean)value); continue; }
        if ("orderDate".equals(key) && value instanceof java.util.Date) { orderDate((java.util.Date)value); continue; }
        if ("orderedItem".equals(key) && value instanceof OrderItem) { orderedItem((OrderItem)value); continue; }
        if ("orderedItem".equals(key) && value instanceof Product) { orderedItem((Product)value); continue; }
        if ("orderNumber".equals(key) && value instanceof String) { orderNumber((String)value); continue; }
        if ("orderStatus".equals(key) && value instanceof OrderStatus) { orderStatus((OrderStatus)value); continue; }
        if ("partOfInvoice".equals(key) && value instanceof Invoice) { partOfInvoice((Invoice)value); continue; }
        if ("paymentDue".equals(key) && value instanceof java.util.Date) { paymentDue((java.util.Date)value); continue; }
        if ("paymentMethod".equals(key) && value instanceof PaymentMethod) { paymentMethod((PaymentMethod)value); continue; }
        if ("paymentMethodId".equals(key) && value instanceof String) { paymentMethodId((String)value); continue; }
        if ("paymentUrl".equals(key) && value instanceof String) { paymentUrl((String)value); continue; }
        if ("seller".equals(key) && value instanceof Participant) { seller((Participant)value); continue; }
        if ("broker".equals(key) && value instanceof Organization) { broker((Organization)value); continue; }
        if ("broker".equals(key) && value instanceof Person) { broker((Person)value); continue; }
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
    private ParcelDelivery orderDelivery;
    private Offer acceptedOffer;
    private PostalAddress billingAddress;
    private String confirmationNumber;
    private OrganizationOrPerson customer;
    private Number discount;
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
    @NotNull Builder orderDelivery(@NotNull ParcelDelivery parcelDelivery);
    @NotNull Builder orderDelivery(@NotNull ParcelDelivery.Builder parcelDelivery);
    @NotNull Builder acceptedOffer(@NotNull Offer offer);
    @NotNull Builder acceptedOffer(@NotNull Offer.Builder offer);
    @NotNull Builder billingAddress(@NotNull PostalAddress postalAddress);
    @NotNull Builder billingAddress(@NotNull PostalAddress.Builder postalAddress);
    @NotNull Builder confirmationNumber(@NotNull String confirmationNumber);
    @NotNull Builder customer(@NotNull Organization organization);
    @NotNull Builder customer(@NotNull Organization.Builder organization);
    @NotNull Builder customer(@NotNull Person person);
    @NotNull Builder customer(@NotNull Person.Builder person);
    @NotNull Builder discount(@NotNull Integer integer);
    @NotNull Builder discount(@NotNull Long discount);
    @NotNull Builder discount(@NotNull Float discount);
    @NotNull Builder discount(@NotNull Double discount);
    @NotNull Builder discount(@NotNull String discount);
    @NotNull Builder discountCode(@NotNull String discountCode);
    @NotNull Builder discountCurrency(@NotNull String discountCurrency);
    @NotNull Builder isGift(@NotNull Boolean isGift);
    @NotNull Builder orderDate(@NotNull java.util.Date date);
    @NotNull Builder orderedItem(@NotNull OrderItem orderItem);
    @NotNull Builder orderedItem(@NotNull OrderItem.Builder orderItem);
    @NotNull Builder orderedItem(@NotNull Product product);
    @NotNull Builder orderedItem(@NotNull Product.Builder product);
    @NotNull Builder orderNumber(@NotNull String orderNumber);
    @NotNull Builder orderStatus(@NotNull OrderStatus orderStatus);
    @NotNull Builder orderStatus(@NotNull OrderStatus.Builder orderStatus);
    @NotNull Builder partOfInvoice(@NotNull Invoice invoice);
    @NotNull Builder partOfInvoice(@NotNull Invoice.Builder invoice);
    @NotNull Builder paymentDue(@NotNull java.util.Date date);
    @NotNull Builder paymentMethod(@NotNull PaymentMethod paymentMethod);
    @NotNull Builder paymentMethod(@NotNull PaymentMethod.Builder paymentMethod);
    @NotNull Builder paymentMethodId(@NotNull String paymentMethodId);
    @NotNull Builder paymentUrl(@NotNull String paymentUrl);
    @NotNull Builder seller(@NotNull Participant participant);
    @NotNull Builder broker(@NotNull Organization organization);
    @NotNull Builder broker(@NotNull Organization.Builder organization);
    @NotNull Builder broker(@NotNull Person person);
    @NotNull Builder broker(@NotNull Person.Builder person);
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

  protected Order(ParcelDelivery orderDelivery, Offer acceptedOffer, PostalAddress billingAddress, String confirmationNumber, OrganizationOrPerson customer, Number discount, String discountCode, String discountCurrency, Boolean isGift, java.util.Date orderDate, OrderItemOrProduct orderedItem, String orderNumber, OrderStatus orderStatus, Invoice partOfInvoice, java.util.Date paymentDue, PaymentMethod paymentMethod, String paymentMethodId, String paymentUrl, Participant seller, OrganizationOrPerson broker, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
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

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myOrderDelivery != null ? myOrderDelivery.hashCode() : 0);
    result = 31 * result + (myAcceptedOffer != null ? myAcceptedOffer.hashCode() : 0);
    result = 31 * result + (myBillingAddress != null ? myBillingAddress.hashCode() : 0);
    result = 31 * result + (myConfirmationNumber != null ? myConfirmationNumber.hashCode() : 0);
    result = 31 * result + (myCustomer != null ? myCustomer.hashCode() : 0);
    result = 31 * result + (myDiscount != null ? myDiscount.hashCode() : 0);
    result = 31 * result + (myDiscountCode != null ? myDiscountCode.hashCode() : 0);
    result = 31 * result + (myDiscountCurrency != null ? myDiscountCurrency.hashCode() : 0);
    result = 31 * result + (myIsGift != null ? myIsGift.hashCode() : 0);
    result = 31 * result + (myOrderDate != null ? myOrderDate.hashCode() : 0);
    result = 31 * result + (myOrderedItem != null ? myOrderedItem.hashCode() : 0);
    result = 31 * result + (myOrderNumber != null ? myOrderNumber.hashCode() : 0);
    result = 31 * result + (myOrderStatus != null ? myOrderStatus.hashCode() : 0);
    result = 31 * result + (myPartOfInvoice != null ? myPartOfInvoice.hashCode() : 0);
    result = 31 * result + (myPaymentDue != null ? myPaymentDue.hashCode() : 0);
    result = 31 * result + (myPaymentMethod != null ? myPaymentMethod.hashCode() : 0);
    result = 31 * result + (myPaymentMethodId != null ? myPaymentMethodId.hashCode() : 0);
    result = 31 * result + (myPaymentUrl != null ? myPaymentUrl.hashCode() : 0);
    result = 31 * result + (mySeller != null ? mySeller.hashCode() : 0);
    result = 31 * result + (myBroker != null ? myBroker.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Order order = (Order) o;
    if (!super.equals(o)) return false;
    if (myOrderDelivery != null ? !myOrderDelivery.equals(order.myOrderDelivery) : order.myOrderDelivery != null) return false;
    if (myAcceptedOffer != null ? !myAcceptedOffer.equals(order.myAcceptedOffer) : order.myAcceptedOffer != null) return false;
    if (myBillingAddress != null ? !myBillingAddress.equals(order.myBillingAddress) : order.myBillingAddress != null) return false;
    if (myConfirmationNumber != null ? !myConfirmationNumber.equals(order.myConfirmationNumber) : order.myConfirmationNumber != null) return false;
    if (myCustomer != null ? !myCustomer.equals(order.myCustomer) : order.myCustomer != null) return false;
    if (myDiscount != null ? !myDiscount.equals(order.myDiscount) : order.myDiscount != null) return false;
    if (myDiscountCode != null ? !myDiscountCode.equals(order.myDiscountCode) : order.myDiscountCode != null) return false;
    if (myDiscountCurrency != null ? !myDiscountCurrency.equals(order.myDiscountCurrency) : order.myDiscountCurrency != null) return false;
    if (myIsGift != null ? !myIsGift.equals(order.myIsGift) : order.myIsGift != null) return false;
    if (myOrderDate != null ? !myOrderDate.equals(order.myOrderDate) : order.myOrderDate != null) return false;
    if (myOrderedItem != null ? !myOrderedItem.equals(order.myOrderedItem) : order.myOrderedItem != null) return false;
    if (myOrderNumber != null ? !myOrderNumber.equals(order.myOrderNumber) : order.myOrderNumber != null) return false;
    if (myOrderStatus != null ? !myOrderStatus.equals(order.myOrderStatus) : order.myOrderStatus != null) return false;
    if (myPartOfInvoice != null ? !myPartOfInvoice.equals(order.myPartOfInvoice) : order.myPartOfInvoice != null) return false;
    if (myPaymentDue != null ? !myPaymentDue.equals(order.myPaymentDue) : order.myPaymentDue != null) return false;
    if (myPaymentMethod != null ? !myPaymentMethod.equals(order.myPaymentMethod) : order.myPaymentMethod != null) return false;
    if (myPaymentMethodId != null ? !myPaymentMethodId.equals(order.myPaymentMethodId) : order.myPaymentMethodId != null) return false;
    if (myPaymentUrl != null ? !myPaymentUrl.equals(order.myPaymentUrl) : order.myPaymentUrl != null) return false;
    if (mySeller != null ? !mySeller.equals(order.mySeller) : order.mySeller != null) return false;
    if (myBroker != null ? !myBroker.equals(order.myBroker) : order.myBroker != null) return false;
    return true;
  }

  private ParcelDelivery myOrderDelivery;
  private Offer myAcceptedOffer;
  private PostalAddress myBillingAddress;
  private String myConfirmationNumber;
  private OrganizationOrPerson myCustomer;
  private Number myDiscount;
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
