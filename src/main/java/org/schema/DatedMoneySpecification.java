/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time.
 */
public class DatedMoneySpecification extends StructuredValue {
  /**
   * The amount of money.
   */
  public Number getAmount() {
    return myAmount;
  }
  /**
   * The currency in which the monetary amount is expressed (in 3-letter <a href='http://en.wikipedia.org/wiki/ISO_4217'">ISO 4217</a> format).
   */
  public String getCurrency() {
    return myCurrency;
  }
  /**
   * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
   */
  public java.util.Date getStartDate() {
    return myStartDate;
  }
  /**
   * The end date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
   */
  public java.util.Date getEndDate() {
    return myEndDate;
  }
  /**
   * Builder for {@see DatedMoneySpecification}
   */
  public static final class Builder {
    public DatedMoneySpecification build() {
      return new DatedMoneySpecification(amount, mainEntityOfPage, startDate, image, endDate, name, alternateName, potentialAction, additionalType, url, currency, description, sameAs);
    }
    /**
     * The amount of money.
     */
    public Builder amount(Number value) {
      amount = value;
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
     * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    public Builder startDate(java.util.Date value) {
      startDate = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * The end date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    public Builder endDate(java.util.Date value) {
      endDate = value;
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
     * The currency in which the monetary amount is expressed (in 3-letter <a href='http://en.wikipedia.org/wiki/ISO_4217'">ISO 4217</a> format).
     */
    public Builder currency(String value) {
      currency = value;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    private Number amount;
    private CreativeWork mainEntityOfPage;
    private java.util.Date startDate;
    private Image image;
    private java.util.Date endDate;
    private String name;
    private String alternateName;
    private Action potentialAction;
    private String additionalType;
    private String url;
    private String currency;
    private String description;
    private String sameAs;
  }

  protected DatedMoneySpecification(Number amount, CreativeWork mainEntityOfPage, java.util.Date startDate, Image image, java.util.Date endDate, String name, String alternateName, Action potentialAction, String additionalType, String url, String currency, String description, String sameAs) {
    super(mainEntityOfPage, name, image, potentialAction, alternateName, url, additionalType, description, sameAs);
    myAmount = amount;
    myCurrency = currency;
    myStartDate = startDate;
    myEndDate = endDate;
  }
  private Number myAmount;
  private String myCurrency;
  private java.util.Date myStartDate;
  private java.util.Date myEndDate;
}
