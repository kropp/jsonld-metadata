/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

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
  public Organization getCustomer() {
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
  public java.util.Date getOrderDate() {
    return myOrderDate;
  }
  /**
   * The item ordered.
   */
  public Product getOrderedItem() {
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
  public Person getBroker() {
    return myBroker;
  }
  /**
   * Builder for {@see Order}
   */
  public static final class Builder {
    public Order build() {
      return new Order(acceptedOffer, orderDelivery, potentialAction, discountCode, paymentUrl, additionalType, orderNumber, paymentDue, image, discount, orderStatus, description, billingAddress, seller, isGift, paymentMethodId, mainEntityOfPage, orderedItem, alternateName, partOfInvoice, customer, url, orderDate, sameAs, discountCurrency, name, paymentMethod, broker, confirmationNumber);
    }
    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     */
    public Builder acceptedOffer(Offer value) {
      acceptedOffer = value;
      return this;
    }
    /**
     * The delivery of the parcel related to this order or order item.
     */
    public Builder orderDelivery(ParcelDelivery value) {
      orderDelivery = value;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * Code used to redeem a discount.
     */
    public Builder discountCode(String value) {
      discountCode = value;
      return this;
    }
    /**
     * The URL for sending a payment.
     */
    public Builder paymentUrl(String value) {
      paymentUrl = value;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * The identifier of the transaction.
     */
    public Builder orderNumber(String value) {
      orderNumber = value;
      return this;
    }
    /**
     * The date that payment is due.
     */
    public Builder paymentDue(java.util.Date value) {
      paymentDue = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * Any discount applied (to an Order).
     */
    public Builder discount(Number value) {
      discount = value;
      return this;
    }
    /**
     * The current status of the order.
     */
    public Builder orderStatus(OrderStatus value) {
      orderStatus = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    /**
     * The billing address for the order.
     */
    public Builder billingAddress(PostalAddress value) {
      billingAddress = value;
      return this;
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    public Builder seller(Participant value) {
      seller = value;
      return this;
    }
    /**
     * Was the offer accepted as a gift for someone other than the buyer.
     */
    public Builder isGift(Boolean value) {
      isGift = value;
      return this;
    }
    /**
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     */
    public Builder paymentMethodId(String value) {
      paymentMethodId = value;
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
    public Builder mainEntityOfPage(CreativeWork value) {
      mainEntityOfPage = value;
      return this;
    }
    /**
     * The item ordered.
     */
    public Builder orderedItem(Product value) {
      orderedItem = value;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
      return this;
    }
    /**
     * The order is being paid as part of the referenced Invoice.
     */
    public Builder partOfInvoice(Invoice value) {
      partOfInvoice = value;
      return this;
    }
    /**
     * Party placing the order or paying the invoice.
     */
    public Builder customer(Organization value) {
      customer = value;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
      return this;
    }
    /**
     * Date order was placed.
     */
    public Builder orderDate(java.util.Date value) {
      orderDate = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * The currency (in 3-letter ISO 4217 format) of the discount.
     */
    public Builder discountCurrency(String value) {
      discountCurrency = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    /**
     * The name of the credit card or other method of payment for the order.
     */
    public Builder paymentMethod(PaymentMethod value) {
      paymentMethod = value;
      return this;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    public Builder broker(Person value) {
      broker = value;
      return this;
    }
    /**
     * A number that confirms the given order or payment has been received.
     */
    public Builder confirmationNumber(String value) {
      confirmationNumber = value;
      return this;
    }
    private Offer acceptedOffer;
    private ParcelDelivery orderDelivery;
    private Action potentialAction;
    private String discountCode;
    private String paymentUrl;
    private String additionalType;
    private String orderNumber;
    private java.util.Date paymentDue;
    private Image image;
    private Number discount;
    private OrderStatus orderStatus;
    private String description;
    private PostalAddress billingAddress;
    private Participant seller;
    private Boolean isGift;
    private String paymentMethodId;
    private CreativeWork mainEntityOfPage;
    private Product orderedItem;
    private String alternateName;
    private Invoice partOfInvoice;
    private Organization customer;
    private String url;
    private java.util.Date orderDate;
    private String sameAs;
    private String discountCurrency;
    private String name;
    private PaymentMethod paymentMethod;
    private Person broker;
    private String confirmationNumber;
  }

  protected Order(Offer acceptedOffer, ParcelDelivery orderDelivery, Action potentialAction, String discountCode, String paymentUrl, String additionalType, String orderNumber, java.util.Date paymentDue, Image image, Number discount, OrderStatus orderStatus, String description, PostalAddress billingAddress, Participant seller, Boolean isGift, String paymentMethodId, CreativeWork mainEntityOfPage, Product orderedItem, String alternateName, Invoice partOfInvoice, Organization customer, String url, java.util.Date orderDate, String sameAs, String discountCurrency, String name, PaymentMethod paymentMethod, Person broker, String confirmationNumber) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
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
  private Organization myCustomer;
  private Number myDiscount;
  private String myDiscountCode;
  private String myDiscountCurrency;
  private Boolean myIsGift;
  private java.util.Date myOrderDate;
  private Product myOrderedItem;
  private String myOrderNumber;
  private OrderStatus myOrderStatus;
  private Invoice myPartOfInvoice;
  private java.util.Date myPaymentDue;
  private PaymentMethod myPaymentMethod;
  private String myPaymentMethodId;
  private String myPaymentUrl;
  private Participant mySeller;
  private Person myBroker;
}
