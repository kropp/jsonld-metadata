/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:11 CEST 2015 */

package org.schema;

/**
 * The geographic coordinates of a place or event.
 */
public class GeoCoordinates extends StructuredValue {
  /**
   * The elevation of a location.
   */
  public Number getElevation() {
    return myElevation;
  }
  /**
   * The latitude of a location. For example <code>37.42242</code>.
   */
  public Number getLatitude() {
    return myLatitude;
  }
  /**
   * The longitude of a location. For example <code>-122.08585</code>.
   */
  public Number getLongitude() {
    return myLongitude;
  }
  /**
   * Builder for {@see GeoCoordinates}
   */
  public static final class Builder {
    public GeoCoordinates build() {
      return new GeoCoordinates(longitude, mainEntityOfPage, name, image, alternateName, potentialAction, latitude, additionalType, url, description, elevation, sameAs);
    }
    /**
     * The longitude of a location. For example <code>-122.08585</code>.
     */
    public Builder longitude(Number value) {
      longitude = value;
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
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
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
     * The latitude of a location. For example <code>37.42242</code>.
     */
    public Builder latitude(Number value) {
      latitude = value;
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
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    /**
     * The elevation of a location.
     */
    public Builder elevation(Number value) {
      elevation = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    private Number longitude;
    private CreativeWork mainEntityOfPage;
    private String name;
    private Image image;
    private String alternateName;
    private Action potentialAction;
    private Number latitude;
    private String additionalType;
    private String url;
    private String description;
    private Number elevation;
    private String sameAs;
  }

  protected GeoCoordinates(Number longitude, CreativeWork mainEntityOfPage, String name, Image image, String alternateName, Action potentialAction, Number latitude, String additionalType, String url, String description, Number elevation, String sameAs) {
    super(mainEntityOfPage, name, image, potentialAction, alternateName, url, additionalType, description, sameAs);
    myElevation = elevation;
    myLatitude = latitude;
    myLongitude = longitude;
  }
  private Number myElevation;
  private Number myLatitude;
  private Number myLongitude;
}
