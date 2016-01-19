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
 * Used to describe a seat, such as a reserved seat in an event reservation.
 */
public class Seat extends Intangible {
  /**
   * The location of the reserved seat (e.g., 27).
   */
  public String getSeatNumber() {
    return mySeatNumber;
  }
  /**
   * The row location of the reserved seat (e.g., B).
   */
  public String getSeatRow() {
    return mySeatRow;
  }
  /**
   * The section location of the reserved seat (e.g. Orchestra).
   */
  public String getSeatSection() {
    return mySeatSection;
  }
  /**
   * The type/class of the seat.
   */
  public QualitativeValueOrString getSeatingType() {
    return mySeatingType;
  }
  /**
   * Builder for {@link Seat}
   */
  static final class SeatThingBuilder implements Builder {
    /**
     * Creates new {@link Seat} instance.
     */
    public Seat build() {
      return new Seat(seatNumber, seatRow, seatSection, seatingType, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The location of the reserved seat (e.g., 27).
     */
    @NotNull public Builder seatNumber(@NotNull String seatNumber) {
      this.seatNumber = seatNumber;
      return this;
    }
    /**
     * The row location of the reserved seat (e.g., B).
     */
    @NotNull public Builder seatRow(@NotNull String seatRow) {
      this.seatRow = seatRow;
      return this;
    }
    /**
     * The section location of the reserved seat (e.g. Orchestra).
     */
    @NotNull public Builder seatSection(@NotNull String seatSection) {
      this.seatSection = seatSection;
      return this;
    }
    /**
     * The type/class of the seat.
     */
    @NotNull public Builder seatingType(@NotNull QualitativeValue qualitativeValue) {
      if (this.seatingType == null) this.seatingType = new QualitativeValueOrString();
      this.seatingType.setQualitativeValue(qualitativeValue);
      return this;
    }
    /**
     * The type/class of the seat.
     */
    @NotNull public Builder seatingType(@NotNull QualitativeValue.Builder qualitativeValue) {
      return this.seatingType(qualitativeValue.build());
    }
    /**
     * The type/class of the seat.
     */
    @NotNull public Builder seatingType(@NotNull String seatingType) {
      if (this.seatingType == null) this.seatingType = new QualitativeValueOrString();
      this.seatingType.setString(seatingType);
      return this;
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
        if ("seatNumber".equals(key) && value instanceof String) { seatNumber((String)value); continue; }
        if ("seatRow".equals(key) && value instanceof String) { seatRow((String)value); continue; }
        if ("seatSection".equals(key) && value instanceof String) { seatSection((String)value); continue; }
        if ("seatingType".equals(key) && value instanceof QualitativeValue) { seatingType((QualitativeValue)value); continue; }
        if ("seatingType".equals(key) && value instanceof String) { seatingType((String)value); continue; }
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
    private String seatNumber;
    private String seatRow;
    private String seatSection;
    private QualitativeValueOrString seatingType;
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
  public interface Builder extends ThingBuilder<Seat> {
    @NotNull Builder seatNumber(@NotNull String seatNumber);
    @NotNull Builder seatRow(@NotNull String seatRow);
    @NotNull Builder seatSection(@NotNull String seatSection);
    @NotNull Builder seatingType(@NotNull QualitativeValue qualitativeValue);
    @NotNull Builder seatingType(@NotNull QualitativeValue.Builder qualitativeValue);
    @NotNull Builder seatingType(@NotNull String seatingType);
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

  protected Seat(String seatNumber, String seatRow, String seatSection, QualitativeValueOrString seatingType, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    mySeatNumber = seatNumber;
    mySeatRow = seatRow;
    mySeatSection = seatSection;
    mySeatingType = seatingType;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (mySeatNumber != null ? mySeatNumber.hashCode() : 0);
    result = 31 * result + (mySeatRow != null ? mySeatRow.hashCode() : 0);
    result = 31 * result + (mySeatSection != null ? mySeatSection.hashCode() : 0);
    result = 31 * result + (mySeatingType != null ? mySeatingType.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Seat seat = (Seat) o;
    if (!super.equals(o)) return false;
    if (mySeatNumber != null ? !mySeatNumber.equals(seat.mySeatNumber) : seat.mySeatNumber != null) return false;
    if (mySeatRow != null ? !mySeatRow.equals(seat.mySeatRow) : seat.mySeatRow != null) return false;
    if (mySeatSection != null ? !mySeatSection.equals(seat.mySeatSection) : seat.mySeatSection != null) return false;
    if (mySeatingType != null ? !mySeatingType.equals(seat.mySeatingType) : seat.mySeatingType != null) return false;
    return true;
  }

  private String mySeatNumber;
  private String mySeatRow;
  private String mySeatSection;
  private QualitativeValueOrString mySeatingType;
}
