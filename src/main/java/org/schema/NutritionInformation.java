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
  public static final class Builder {
    /**
     * Creates new {@link NutritionInformation} instance.
     */
    public NutritionInformation build() {
      return new NutritionInformation(cholesterolContent, fiberContent, saturatedFatContent, transFatContent, name, mainEntityOfPage, proteinContent, calories, url, additionalType, sameAs, unsaturatedFatContent, carbohydrateContent, alternateName, fatContent, sodiumContent, potentialAction, description, sugarContent, servingSize);
    }
    /**
     * The number of milligrams of cholesterol.
     */
    public Builder cholesterolContent(Mass mass) {
      this.cholesterolContent = mass;
      return this;
    }
    /**
     * The number of grams of fiber.
     */
    public Builder fiberContent(Mass mass) {
      this.fiberContent = mass;
      return this;
    }
    /**
     * The number of grams of saturated fat.
     */
    public Builder saturatedFatContent(Mass mass) {
      this.saturatedFatContent = mass;
      return this;
    }
    /**
     * The number of grams of trans fat.
     */
    public Builder transFatContent(Mass mass) {
      this.transFatContent = mass;
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
     * The number of grams of protein.
     */
    public Builder proteinContent(Mass mass) {
      this.proteinContent = mass;
      return this;
    }
    /**
     * The number of calories.
     */
    public Builder calories(Energy energy) {
      this.calories = energy;
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
     * The number of grams of unsaturated fat.
     */
    public Builder unsaturatedFatContent(Mass mass) {
      this.unsaturatedFatContent = mass;
      return this;
    }
    /**
     * The number of grams of carbohydrates.
     */
    public Builder carbohydrateContent(Mass mass) {
      this.carbohydrateContent = mass;
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
     * The number of grams of fat.
     */
    public Builder fatContent(Mass mass) {
      this.fatContent = mass;
      return this;
    }
    /**
     * The number of milligrams of sodium.
     */
    public Builder sodiumContent(Mass mass) {
      this.sodiumContent = mass;
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
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
    /**
     * The number of grams of sugar.
     */
    public Builder sugarContent(Mass mass) {
      this.sugarContent = mass;
      return this;
    }
    /**
     * The serving size, in terms of the number of volume or mass.
     */
    public Builder servingSize(String servingSize) {
      this.servingSize = servingSize;
      return this;
    }
    private Mass cholesterolContent;
    private Mass fiberContent;
    private Mass saturatedFatContent;
    private Mass transFatContent;
    private String name;
    private StringOrCreativeWork mainEntityOfPage;
    private Mass proteinContent;
    private Energy calories;
    private String url;
    private String additionalType;
    private String sameAs;
    private Mass unsaturatedFatContent;
    private Mass carbohydrateContent;
    private String alternateName;
    private Mass fatContent;
    private Mass sodiumContent;
    private Action potentialAction;
    private String description;
    private Mass sugarContent;
    private String servingSize;
  }

  protected NutritionInformation(Mass cholesterolContent, Mass fiberContent, Mass saturatedFatContent, Mass transFatContent, String name, StringOrCreativeWork mainEntityOfPage, Mass proteinContent, Energy calories, String url, String additionalType, String sameAs, Mass unsaturatedFatContent, Mass carbohydrateContent, String alternateName, Mass fatContent, Mass sodiumContent, Action potentialAction, String description, Mass sugarContent, String servingSize) {
    super(sameAs, additionalType, url, alternateName, name, description, potentialAction, mainEntityOfPage);
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
