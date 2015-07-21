/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
 */
public class OrderItem extends Intangible {
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  public Number getOrderQuantity() {
    return myOrderQuantity;
  }
  /**
   * The current status of the order item.
   */
  public OrderStatus getOrderItemStatus() {
    return myOrderItemStatus;
  }
  /**
   * The identifier of the order item.
   */
  public String getOrderItemNumber() {
    return myOrderItemNumber;
  }
  /**
   * The delivery of the parcel related to this order or order item.
   */
  public ParcelDelivery getOrderDelivery() {
    return myOrderDelivery;
  }
  /**
   * The item ordered.
   */
  public Product getOrderedItem() {
    return myOrderedItem;
  }
  /**
   * Builder for {@see OrderItem}
   */
  public static final class Builder {
    public OrderItem build() {
      return new OrderItem(orderQuantity, mainEntityOfPage, orderedItem, orderItemNumber, orderDelivery, potentialAction, alternateName, additionalType, url, orderItemStatus, sameAs, image, name, description);
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    public Builder orderQuantity(Number value) {
      orderQuantity = value;
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
     * The identifier of the order item.
     */
    public Builder orderItemNumber(String value) {
      orderItemNumber = value;
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
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
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
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
      return this;
    }
    /**
     * The current status of the order item.
     */
    public Builder orderItemStatus(OrderStatus value) {
      orderItemStatus = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
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
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    private Number orderQuantity;
    private CreativeWork mainEntityOfPage;
    private Product orderedItem;
    private String orderItemNumber;
    private ParcelDelivery orderDelivery;
    private Action potentialAction;
    private String alternateName;
    private String additionalType;
    private String url;
    private OrderStatus orderItemStatus;
    private String sameAs;
    private Image image;
    private String name;
    private String description;
  }

  protected OrderItem(Number orderQuantity, CreativeWork mainEntityOfPage, Product orderedItem, String orderItemNumber, ParcelDelivery orderDelivery, Action potentialAction, String alternateName, String additionalType, String url, OrderStatus orderItemStatus, String sameAs, Image image, String name, String description) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    myOrderQuantity = orderQuantity;
    myOrderItemStatus = orderItemStatus;
    myOrderItemNumber = orderItemNumber;
    myOrderDelivery = orderDelivery;
    myOrderedItem = orderedItem;
  }
  private Number myOrderQuantity;
  private OrderStatus myOrderItemStatus;
  private String myOrderItemNumber;
  private ParcelDelivery myOrderDelivery;
  private Product myOrderedItem;
}
