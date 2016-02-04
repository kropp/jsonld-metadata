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
 * An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
 */
public class OrderItem extends Intangible {
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  @JsonIgnore public Integer getOrderQuantityInteger() {
    return (Integer) getValue("orderQuantity");
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  @JsonIgnore public Collection<Integer> getOrderQuantityIntegers() {
    final Object current = myData.get("orderQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  @JsonIgnore public Long getOrderQuantityLong() {
    return (Long) getValue("orderQuantity");
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  @JsonIgnore public Collection<Long> getOrderQuantityLongs() {
    final Object current = myData.get("orderQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  @JsonIgnore public Float getOrderQuantityFloat() {
    return (Float) getValue("orderQuantity");
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  @JsonIgnore public Collection<Float> getOrderQuantityFloats() {
    final Object current = myData.get("orderQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  @JsonIgnore public Double getOrderQuantityDouble() {
    return (Double) getValue("orderQuantity");
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  @JsonIgnore public Collection<Double> getOrderQuantityDoubles() {
    final Object current = myData.get("orderQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  @JsonIgnore public String getOrderQuantityString() {
    return (String) getValue("orderQuantity");
  }
  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one.
   */
  @JsonIgnore public Collection<String> getOrderQuantityStrings() {
    final Object current = myData.get("orderQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The current status of the order item.
   */
  @JsonIgnore public OrderStatus getOrderItemStatus() {
    return (OrderStatus) getValue("orderItemStatus");
  }
  /**
   * The current status of the order item.
   */
  @JsonIgnore public Collection<OrderStatus> getOrderItemStatuss() {
    final Object current = myData.get("orderItemStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OrderStatus>) current;
    }
    return Arrays.asList((OrderStatus) current);
  }
  /**
   * The identifier of the order item.
   */
  @JsonIgnore public String getOrderItemNumber() {
    return (String) getValue("orderItemNumber");
  }
  /**
   * The identifier of the order item.
   */
  @JsonIgnore public Collection<String> getOrderItemNumbers() {
    final Object current = myData.get("orderItemNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The delivery of the parcel related to this order or order item.
   */
  @JsonIgnore public ParcelDelivery getOrderDelivery() {
    return (ParcelDelivery) getValue("orderDelivery");
  }
  /**
   * The delivery of the parcel related to this order or order item.
   */
  @JsonIgnore public Collection<ParcelDelivery> getOrderDeliverys() {
    final Object current = myData.get("orderDelivery");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ParcelDelivery>) current;
    }
    return Arrays.asList((ParcelDelivery) current);
  }
  /**
   * The item ordered.
   */
  @JsonIgnore public OrderItem getOrderedItemOrderItem() {
    return (OrderItem) getValue("orderedItem");
  }
  /**
   * The item ordered.
   */
  @JsonIgnore public Collection<OrderItem> getOrderedItemOrderItems() {
    final Object current = myData.get("orderedItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OrderItem>) current;
    }
    return Arrays.asList((OrderItem) current);
  }
  /**
   * The item ordered.
   */
  @JsonIgnore public Product getOrderedItemProduct() {
    return (Product) getValue("orderedItem");
  }
  /**
   * The item ordered.
   */
  @JsonIgnore public Collection<Product> getOrderedItemProducts() {
    final Object current = myData.get("orderedItem");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  protected OrderItem(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link OrderItem}
   */
  public static class Builder extends Intangible.Builder {
    public OrderItem build() {
      return new OrderItem(myData);
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @NotNull public Builder orderQuantity(@NotNull Integer integer) {
      putValue("orderQuantity", integer);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @NotNull public Builder orderQuantity(@NotNull Long orderQuantity) {
      putValue("orderQuantity", orderQuantity);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @NotNull public Builder orderQuantity(@NotNull Float orderQuantity) {
      putValue("orderQuantity", orderQuantity);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @NotNull public Builder orderQuantity(@NotNull Double orderQuantity) {
      putValue("orderQuantity", orderQuantity);
      return this;
    }
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @NotNull public Builder orderQuantity(@NotNull String orderQuantity) {
      putValue("orderQuantity", orderQuantity);
      return this;
    }
    /**
     * The current status of the order item.
     */
    @NotNull public Builder orderItemStatus(@NotNull OrderStatus orderStatus) {
      putValue("orderItemStatus", orderStatus);
      return this;
    }
    /**
     * The current status of the order item.
     */
    @NotNull public Builder orderItemStatus(@NotNull OrderStatus.Builder orderStatus) {
      putValue("orderItemStatus", orderStatus.build());
      return this;
    }
    /**
     * The identifier of the order item.
     */
    @NotNull public Builder orderItemNumber(@NotNull String orderItemNumber) {
      putValue("orderItemNumber", orderItemNumber);
      return this;
    }
    /**
     * The delivery of the parcel related to this order or order item.
     */
    @NotNull public Builder orderDelivery(@NotNull ParcelDelivery parcelDelivery) {
      putValue("orderDelivery", parcelDelivery);
      return this;
    }
    /**
     * The delivery of the parcel related to this order or order item.
     */
    @NotNull public Builder orderDelivery(@NotNull ParcelDelivery.Builder parcelDelivery) {
      putValue("orderDelivery", parcelDelivery.build());
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull OrderItem orderItem) {
      putValue("orderedItem", orderItem);
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull OrderItem.Builder orderItem) {
      putValue("orderedItem", orderItem.build());
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull Product product) {
      putValue("orderedItem", product);
      return this;
    }
    /**
     * The item ordered.
     */
    @NotNull public Builder orderedItem(@NotNull Product.Builder product) {
      putValue("orderedItem", product.build());
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
      if ("orderQuantity".equals(key) && value instanceof Integer) { orderQuantity((Integer)value); return; }
      if ("orderQuantity".equals(key) && value instanceof Long) { orderQuantity((Long)value); return; }
      if ("orderQuantity".equals(key) && value instanceof Float) { orderQuantity((Float)value); return; }
      if ("orderQuantity".equals(key) && value instanceof Double) { orderQuantity((Double)value); return; }
      if ("orderQuantity".equals(key) && value instanceof String) { orderQuantity((String)value); return; }
      if ("orderItemStatus".equals(key) && value instanceof OrderStatus) { orderItemStatus((OrderStatus)value); return; }
      if ("orderItemNumber".equals(key) && value instanceof String) { orderItemNumber((String)value); return; }
      if ("orderDelivery".equals(key) && value instanceof ParcelDelivery) { orderDelivery((ParcelDelivery)value); return; }
      if ("orderedItem".equals(key) && value instanceof OrderItem) { orderedItem((OrderItem)value); return; }
      if ("orderedItem".equals(key) && value instanceof Product) { orderedItem((Product)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
