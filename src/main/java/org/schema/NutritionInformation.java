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
 * Nutritional information about the recipe.
 */
public class NutritionInformation extends StructuredValue {
  /**
   * The number of calories.
   */
  public Energy getCalories() {
    return myCalories;
  }
  /**
   * The number of grams of carbohydrates.
   */
  public Mass getCarbohydrateContent() {
    return myCarbohydrateContent;
  }
  /**
   * The number of milligrams of cholesterol.
   */
  public Mass getCholesterolContent() {
    return myCholesterolContent;
  }
  /**
   * The number of grams of fat.
   */
  public Mass getFatContent() {
    return myFatContent;
  }
  /**
   * The number of grams of fiber.
   */
  public Mass getFiberContent() {
    return myFiberContent;
  }
  /**
   * The number of grams of protein.
   */
  public Mass getProteinContent() {
    return myProteinContent;
  }
  /**
   * The number of grams of saturated fat.
   */
  public Mass getSaturatedFatContent() {
    return mySaturatedFatContent;
  }
  /**
   * The serving size, in terms of the number of volume or mass.
   */
  public String getServingSize() {
    return myServingSize;
  }
  /**
   * The number of milligrams of sodium.
   */
  public Mass getSodiumContent() {
    return mySodiumContent;
  }
  /**
   * The number of grams of sugar.
   */
  public Mass getSugarContent() {
    return mySugarContent;
  }
  /**
   * The number of grams of trans fat.
   */
  public Mass getTransFatContent() {
    return myTransFatContent;
  }
  /**
   * The number of grams of unsaturated fat.
   */
  public Mass getUnsaturatedFatContent() {
    return myUnsaturatedFatContent;
  }
  /**
   * Builder for {@link NutritionInformation}
   */
  static final class NutritionInformationThingBuilder implements Builder {
    /**
     * Creates new {@link NutritionInformation} instance.
     */
    public NutritionInformation build() {
      return new NutritionInformation(calories, carbohydrateContent, cholesterolContent, fatContent, fiberContent, proteinContent, saturatedFatContent, servingSize, sodiumContent, sugarContent, transFatContent, unsaturatedFatContent, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The number of calories.
     */
    @NotNull public Builder calories(Energy energy) {
      this.calories = energy;
      return this;
    }
    /**
     * The number of calories.
     */
    @NotNull public Builder calories(Energy.Builder energy) {
      return this.calories(energy.build());
    }
    /**
     * The number of grams of carbohydrates.
     */
    @NotNull public Builder carbohydrateContent(Mass mass) {
      this.carbohydrateContent = mass;
      return this;
    }
    /**
     * The number of grams of carbohydrates.
     */
    @NotNull public Builder carbohydrateContent(Mass.Builder mass) {
      return this.carbohydrateContent(mass.build());
    }
    /**
     * The number of milligrams of cholesterol.
     */
    @NotNull public Builder cholesterolContent(Mass mass) {
      this.cholesterolContent = mass;
      return this;
    }
    /**
     * The number of milligrams of cholesterol.
     */
    @NotNull public Builder cholesterolContent(Mass.Builder mass) {
      return this.cholesterolContent(mass.build());
    }
    /**
     * The number of grams of fat.
     */
    @NotNull public Builder fatContent(Mass mass) {
      this.fatContent = mass;
      return this;
    }
    /**
     * The number of grams of fat.
     */
    @NotNull public Builder fatContent(Mass.Builder mass) {
      return this.fatContent(mass.build());
    }
    /**
     * The number of grams of fiber.
     */
    @NotNull public Builder fiberContent(Mass mass) {
      this.fiberContent = mass;
      return this;
    }
    /**
     * The number of grams of fiber.
     */
    @NotNull public Builder fiberContent(Mass.Builder mass) {
      return this.fiberContent(mass.build());
    }
    /**
     * The number of grams of protein.
     */
    @NotNull public Builder proteinContent(Mass mass) {
      this.proteinContent = mass;
      return this;
    }
    /**
     * The number of grams of protein.
     */
    @NotNull public Builder proteinContent(Mass.Builder mass) {
      return this.proteinContent(mass.build());
    }
    /**
     * The number of grams of saturated fat.
     */
    @NotNull public Builder saturatedFatContent(Mass mass) {
      this.saturatedFatContent = mass;
      return this;
    }
    /**
     * The number of grams of saturated fat.
     */
    @NotNull public Builder saturatedFatContent(Mass.Builder mass) {
      return this.saturatedFatContent(mass.build());
    }
    /**
     * The serving size, in terms of the number of volume or mass.
     */
    @NotNull public Builder servingSize(String servingSize) {
      this.servingSize = servingSize;
      return this;
    }
    /**
     * The number of milligrams of sodium.
     */
    @NotNull public Builder sodiumContent(Mass mass) {
      this.sodiumContent = mass;
      return this;
    }
    /**
     * The number of milligrams of sodium.
     */
    @NotNull public Builder sodiumContent(Mass.Builder mass) {
      return this.sodiumContent(mass.build());
    }
    /**
     * The number of grams of sugar.
     */
    @NotNull public Builder sugarContent(Mass mass) {
      this.sugarContent = mass;
      return this;
    }
    /**
     * The number of grams of sugar.
     */
    @NotNull public Builder sugarContent(Mass.Builder mass) {
      return this.sugarContent(mass.build());
    }
    /**
     * The number of grams of trans fat.
     */
    @NotNull public Builder transFatContent(Mass mass) {
      this.transFatContent = mass;
      return this;
    }
    /**
     * The number of grams of trans fat.
     */
    @NotNull public Builder transFatContent(Mass.Builder mass) {
      return this.transFatContent(mass.build());
    }
    /**
     * The number of grams of unsaturated fat.
     */
    @NotNull public Builder unsaturatedFatContent(Mass mass) {
      this.unsaturatedFatContent = mass;
      return this;
    }
    /**
     * The number of grams of unsaturated fat.
     */
    @NotNull public Builder unsaturatedFatContent(Mass.Builder mass) {
      return this.unsaturatedFatContent(mass.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(String description) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private Energy calories;
    private Mass carbohydrateContent;
    private Mass cholesterolContent;
    private Mass fatContent;
    private Mass fiberContent;
    private Mass proteinContent;
    private Mass saturatedFatContent;
    private String servingSize;
    private Mass sodiumContent;
    private Mass sugarContent;
    private Mass transFatContent;
    private Mass unsaturatedFatContent;
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
  public interface Builder extends ThingBuilder<NutritionInformation> {
    @NotNull Builder calories(Energy energy);
    @NotNull Builder calories(Energy.Builder energy);
    @NotNull Builder carbohydrateContent(Mass mass);
    @NotNull Builder carbohydrateContent(Mass.Builder mass);
    @NotNull Builder cholesterolContent(Mass mass);
    @NotNull Builder cholesterolContent(Mass.Builder mass);
    @NotNull Builder fatContent(Mass mass);
    @NotNull Builder fatContent(Mass.Builder mass);
    @NotNull Builder fiberContent(Mass mass);
    @NotNull Builder fiberContent(Mass.Builder mass);
    @NotNull Builder proteinContent(Mass mass);
    @NotNull Builder proteinContent(Mass.Builder mass);
    @NotNull Builder saturatedFatContent(Mass mass);
    @NotNull Builder saturatedFatContent(Mass.Builder mass);
    @NotNull Builder servingSize(String servingSize);
    @NotNull Builder sodiumContent(Mass mass);
    @NotNull Builder sodiumContent(Mass.Builder mass);
    @NotNull Builder sugarContent(Mass mass);
    @NotNull Builder sugarContent(Mass.Builder mass);
    @NotNull Builder transFatContent(Mass mass);
    @NotNull Builder transFatContent(Mass.Builder mass);
    @NotNull Builder unsaturatedFatContent(Mass mass);
    @NotNull Builder unsaturatedFatContent(Mass.Builder mass);
    @NotNull Builder additionalType(String additionalType);
    @NotNull Builder alternateName(String alternateName);
    @NotNull Builder description(String description);
    @NotNull Builder mainEntityOfPage(CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(String mainEntityOfPage);
    @NotNull Builder name(String name);
    @NotNull Builder sameAs(String sameAs);
    @NotNull Builder url(String url);
    @NotNull Builder potentialAction(Action action);
    @NotNull Builder potentialAction(Action.Builder action);
    @NotNull Builder id(String id);
  }

  protected NutritionInformation(Energy calories, Mass carbohydrateContent, Mass cholesterolContent, Mass fatContent, Mass fiberContent, Mass proteinContent, Mass saturatedFatContent, String servingSize, Mass sodiumContent, Mass sugarContent, Mass transFatContent, Mass unsaturatedFatContent, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myCalories = calories;
    myCarbohydrateContent = carbohydrateContent;
    myCholesterolContent = cholesterolContent;
    myFatContent = fatContent;
    myFiberContent = fiberContent;
    myProteinContent = proteinContent;
    mySaturatedFatContent = saturatedFatContent;
    myServingSize = servingSize;
    mySodiumContent = sodiumContent;
    mySugarContent = sugarContent;
    myTransFatContent = transFatContent;
    myUnsaturatedFatContent = unsaturatedFatContent;
  }
  private Energy myCalories;
  private Mass myCarbohydrateContent;
  private Mass myCholesterolContent;
  private Mass myFatContent;
  private Mass myFiberContent;
  private Mass myProteinContent;
  private Mass mySaturatedFatContent;
  private String myServingSize;
  private Mass mySodiumContent;
  private Mass mySugarContent;
  private Mass myTransFatContent;
  private Mass myUnsaturatedFatContent;
}
