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
 * The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews
 */
public class GeoShape extends StructuredValue {
  /**
   * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
   */
  public String getBox() {
    return myBox;
  }
  /**
   * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
   */
  public String getCircle() {
    return myCircle;
  }
  /**
   * The elevation of a location.
   */
  public Number getElevation() {
    return myElevation;
  }
  /**
   * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
   */
  public String getLine() {
    return myLine;
  }
  /**
   * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
   */
  public String getPolygon() {
    return myPolygon;
  }
  /**
   * Builder for {@link GeoShape}
   */
  static final class GeoShapeThingBuilder implements Builder {
    /**
     * Creates new {@link GeoShape} instance.
     */
    public GeoShape build() {
      return new GeoShape(box, circle, elevation, line, polygon, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     */
    @NotNull public Builder box(@NotNull String box) {
      this.box = box;
      return this;
    }
    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     */
    @NotNull public Builder circle(@NotNull String circle) {
      this.circle = circle;
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Integer integer) {
      if (this.elevation == null) this.elevation = new Number();
      this.elevation.setInteger(integer);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Long elevation) {
      if (this.elevation == null) this.elevation = new Number();
      this.elevation.setLong(elevation);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Float elevation) {
      if (this.elevation == null) this.elevation = new Number();
      this.elevation.setFloat(elevation);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull Double elevation) {
      if (this.elevation == null) this.elevation = new Number();
      this.elevation.setDouble(elevation);
      return this;
    }
    /**
     * The elevation of a location.
     */
    @NotNull public Builder elevation(@NotNull String elevation) {
      if (this.elevation == null) this.elevation = new Number();
      this.elevation.setString(elevation);
      return this;
    }
    /**
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     */
    @NotNull public Builder line(@NotNull String line) {
      this.line = line;
      return this;
    }
    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     */
    @NotNull public Builder polygon(@NotNull String polygon) {
      this.polygon = polygon;
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
        if ("box".equals(key) && value instanceof String) { box((String)value); continue; }
        if ("circle".equals(key) && value instanceof String) { circle((String)value); continue; }
        if ("elevation".equals(key) && value instanceof Integer) { elevation((Integer)value); continue; }
        if ("elevation".equals(key) && value instanceof Long) { elevation((Long)value); continue; }
        if ("elevation".equals(key) && value instanceof Float) { elevation((Float)value); continue; }
        if ("elevation".equals(key) && value instanceof Double) { elevation((Double)value); continue; }
        if ("elevation".equals(key) && value instanceof String) { elevation((String)value); continue; }
        if ("line".equals(key) && value instanceof String) { line((String)value); continue; }
        if ("polygon".equals(key) && value instanceof String) { polygon((String)value); continue; }
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
    private String box;
    private String circle;
    private Number elevation;
    private String line;
    private String polygon;
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
  public interface Builder extends ThingBuilder<GeoShape> {
    @NotNull Builder box(@NotNull String box);
    @NotNull Builder circle(@NotNull String circle);
    @NotNull Builder elevation(@NotNull Integer integer);
    @NotNull Builder elevation(@NotNull Long elevation);
    @NotNull Builder elevation(@NotNull Float elevation);
    @NotNull Builder elevation(@NotNull Double elevation);
    @NotNull Builder elevation(@NotNull String elevation);
    @NotNull Builder line(@NotNull String line);
    @NotNull Builder polygon(@NotNull String polygon);
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

  protected GeoShape(String box, String circle, Number elevation, String line, String polygon, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myBox = box;
    myCircle = circle;
    myElevation = elevation;
    myLine = line;
    myPolygon = polygon;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myBox != null ? myBox.hashCode() : 0);
    result = 31 * result + (myCircle != null ? myCircle.hashCode() : 0);
    result = 31 * result + (myElevation != null ? myElevation.hashCode() : 0);
    result = 31 * result + (myLine != null ? myLine.hashCode() : 0);
    result = 31 * result + (myPolygon != null ? myPolygon.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GeoShape geoShape = (GeoShape) o;
    if (!super.equals(o)) return false;
    if (myBox != null ? !myBox.equals(geoShape.myBox) : geoShape.myBox != null) return false;
    if (myCircle != null ? !myCircle.equals(geoShape.myCircle) : geoShape.myCircle != null) return false;
    if (myElevation != null ? !myElevation.equals(geoShape.myElevation) : geoShape.myElevation != null) return false;
    if (myLine != null ? !myLine.equals(geoShape.myLine) : geoShape.myLine != null) return false;
    if (myPolygon != null ? !myPolygon.equals(geoShape.myPolygon) : geoShape.myPolygon != null) return false;
    return true;
  }

  private String myBox;
  private String myCircle;
  private Number myElevation;
  private String myLine;
  private String myPolygon;
}
