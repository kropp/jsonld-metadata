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

/**
 * An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
 */
public class OrderItem extends Intangible {
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  public Number getOrderQuantity() { return myOrderQuantity; }
  /**
   * The current status of the order item.
   */
  public OrderStatus getOrderItemStatus() { return myOrderItemStatus; }
  /**
   * The identifier of the order item.
   */
  public String getOrderItemNumber() { return myOrderItemNumber; }
  /**
   * The delivery of the parcel related to this order or order item.
   */
  public ParcelDelivery getOrderDelivery() { return myOrderDelivery; }
  /**
   * The item ordered.
   */
  public OrderItemOrProduct getOrderedItem() { return myOrderedItem; }
  protected OrderItem(Number orderQuantity, OrderStatus orderItemStatus, String orderItemNumber, ParcelDelivery orderDelivery, OrderItemOrProduct orderedItem, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myOrderQuantity = orderQuantity;
    myOrderItemStatus = orderItemStatus;
    myOrderItemNumber = orderItemNumber;
    myOrderDelivery = orderDelivery;
    myOrderedItem = orderedItem;
    myOrderQuantity = orderQuantity;
    myOrderItemStatus = orderItemStatus;
    myOrderItemNumber = orderItemNumber;
    myOrderDelivery = orderDelivery;
    myOrderedItem = orderedItem;
  }
  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myOrderQuantity != null ? myOrderQuantity.hashCode() : 0);
    result = 31 * result + (myOrderItemStatus != null ? myOrderItemStatus.hashCode() : 0);
    result = 31 * result + (myOrderItemNumber != null ? myOrderItemNumber.hashCode() : 0);
    result = 31 * result + (myOrderDelivery != null ? myOrderDelivery.hashCode() : 0);
    result = 31 * result + (myOrderedItem != null ? myOrderedItem.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderItem orderItem = (OrderItem) o;
    if (!super.equals(o)) return false;
    if (myOrderQuantity != null ? !myOrderQuantity.equals(orderItem.myOrderQuantity) : orderItem.myOrderQuantity != null) return false;
    if (myOrderItemStatus != null ? !myOrderItemStatus.equals(orderItem.myOrderItemStatus) : orderItem.myOrderItemStatus != null) return false;
    if (myOrderItemNumber != null ? !myOrderItemNumber.equals(orderItem.myOrderItemNumber) : orderItem.myOrderItemNumber != null) return false;
    if (myOrderDelivery != null ? !myOrderDelivery.equals(orderItem.myOrderDelivery) : orderItem.myOrderDelivery != null) return false;
    if (myOrderedItem != null ? !myOrderedItem.equals(orderItem.myOrderedItem) : orderItem.myOrderedItem != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link OrderItem}
   */
  public static class Builder implements ThingBuilder<OrderItem> {
    public OrderItem build() {
      return new OrderItem(orderQuantity, orderItemStatus, orderItemNumber, orderDelivery, orderedItem, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @NotNull public Builder orderQuantity(@NotNull Integer integer) {
      if (this.orderQuantity == null) this.orderQuantity = new Number();
      this.orderQuantity.setInteger(integer);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @NotNull public Builder orderQuantity(@NotNull Long orderQuantity) {
      if (this.orderQuantity == null) this.orderQuantity = new Number();
      this.orderQuantity.setLong(orderQuantity);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @NotNull public Builder orderQuantity(@NotNull Float orderQuantity) {
      if (this.orderQuantity == null) this.orderQuantity = new Number();
      this.orderQuantity.setFloat(orderQuantity);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @NotNull public Builder orderQuantity(@NotNull Double orderQuantity) {
      if (this.orderQuantity == null) this.orderQuantity = new Number();
      this.orderQuantity.setDouble(orderQuantity);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @NotNull public Builder orderQuantity(@NotNull String orderQuantity) {
      if (this.orderQuantity == null) this.orderQuantity = new Number();
      this.orderQuantity.setString(orderQuantity);
      return this;
    }
    /**
     * The current status of the order item.
     */
    @NotNull public Builder orderItemStatus(@NotNull OrderStatus orderStatus) {
      this.orderItemStatus = orderStatus;
      return this;
    }
    /**
     * The current status of the order item.
     */
    @NotNull public Builder orderItemStatus(@NotNull OrderStatus.Builder orderStatus) {
      return this.orderItemStatus(orderStatus.build());
    }
    /**
     * The identifier of the order item.
     */
    @NotNull public Builder orderItemNumber(@NotNull String orderItemNumber) {
      this.orderItemNumber = orderItemNumber;
      return this;
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
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
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
      return this.mainEntityOfPage(creativeWork.build());
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
        if ("orderQuantity".equals(key) && value instanceof Integer) { orderQuantity((Integer)value); continue; }
        if ("orderQuantity".equals(key) && value instanceof Long) { orderQuantity((Long)value); continue; }
        if ("orderQuantity".equals(key) && value instanceof Float) { orderQuantity((Float)value); continue; }
        if ("orderQuantity".equals(key) && value instanceof Double) { orderQuantity((Double)value); continue; }
        if ("orderQuantity".equals(key) && value instanceof String) { orderQuantity((String)value); continue; }
        if ("orderItemStatus".equals(key) && value instanceof OrderStatus) { orderItemStatus((OrderStatus)value); continue; }
        if ("orderItemNumber".equals(key) && value instanceof String) { orderItemNumber((String)value); continue; }
        if ("orderDelivery".equals(key) && value instanceof ParcelDelivery) { orderDelivery((ParcelDelivery)value); continue; }
        if ("orderedItem".equals(key) && value instanceof OrderItem) { orderedItem((OrderItem)value); continue; }
        if ("orderedItem".equals(key) && value instanceof Product) { orderedItem((Product)value); continue; }
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
    private Number orderQuantity;
    private OrderStatus orderItemStatus;
    private String orderItemNumber;
    private ParcelDelivery orderDelivery;
    private OrderItemOrProduct orderedItem;
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
  
  private Number myOrderQuantity;
  private OrderStatus myOrderItemStatus;
  private String myOrderItemNumber;
  private ParcelDelivery myOrderDelivery;
  private OrderItemOrProduct myOrderedItem;
}
