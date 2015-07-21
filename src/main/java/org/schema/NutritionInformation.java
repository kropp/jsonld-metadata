/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

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
   * Builder for {@see NutritionInformation}
   */
  public static final class Builder {
    public NutritionInformation build() {
      return new NutritionInformation(mainEntityOfPage, transFatContent, calories, proteinContent, saturatedFatContent, alternateName, potentialAction, fatContent, additionalType, url, sameAs, fiberContent, servingSize, cholesterolContent, sodiumContent, carbohydrateContent, image, name, sugarContent, description, unsaturatedFatContent);
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
     * The number of grams of trans fat.
     */
    public Builder transFatContent(Mass value) {
      transFatContent = value;
      return this;
    }
    /**
     * The number of calories.
     */
    public Builder calories(Energy value) {
      calories = value;
      return this;
    }
    /**
     * The number of grams of protein.
     */
    public Builder proteinContent(Mass value) {
      proteinContent = value;
      return this;
    }
    /**
     * The number of grams of saturated fat.
     */
    public Builder saturatedFatContent(Mass value) {
      saturatedFatContent = value;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * The number of grams of fat.
     */
    public Builder fatContent(Mass value) {
      fatContent = value;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * The number of grams of fiber.
     */
    public Builder fiberContent(Mass value) {
      fiberContent = value;
      return this;
    }
    /**
     * The serving size, in terms of the number of volume or mass.
     */
    public Builder servingSize(String value) {
      servingSize = value;
      return this;
    }
    /**
     * The number of milligrams of cholesterol.
     */
    public Builder cholesterolContent(Mass value) {
      cholesterolContent = value;
      return this;
    }
    /**
     * The number of milligrams of sodium.
     */
    public Builder sodiumContent(Mass value) {
      sodiumContent = value;
      return this;
    }
    /**
     * The number of grams of carbohydrates.
     */
    public Builder carbohydrateContent(Mass value) {
      carbohydrateContent = value;
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
     * The number of grams of sugar.
     */
    public Builder sugarContent(Mass value) {
      sugarContent = value;
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
     * The number of grams of unsaturated fat.
     */
    public Builder unsaturatedFatContent(Mass value) {
      unsaturatedFatContent = value;
      return this;
    }
    private CreativeWork mainEntityOfPage;
    private Mass transFatContent;
    private Energy calories;
    private Mass proteinContent;
    private Mass saturatedFatContent;
    private String alternateName;
    private Action potentialAction;
    private Mass fatContent;
    private String additionalType;
    private String url;
    private String sameAs;
    private Mass fiberContent;
    private String servingSize;
    private Mass cholesterolContent;
    private Mass sodiumContent;
    private Mass carbohydrateContent;
    private Image image;
    private String name;
    private Mass sugarContent;
    private String description;
    private Mass unsaturatedFatContent;
  }

  protected NutritionInformation(CreativeWork mainEntityOfPage, Mass transFatContent, Energy calories, Mass proteinContent, Mass saturatedFatContent, String alternateName, Action potentialAction, Mass fatContent, String additionalType, String url, String sameAs, Mass fiberContent, String servingSize, Mass cholesterolContent, Mass sodiumContent, Mass carbohydrateContent, Image image, String name, Mass sugarContent, String description, Mass unsaturatedFatContent) {
    super(mainEntityOfPage, name, image, potentialAction, alternateName, url, additionalType, description, sameAs);
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
