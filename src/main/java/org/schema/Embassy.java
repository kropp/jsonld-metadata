/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * An embassy.
 */
public class Embassy extends GovernmentBuilding {
  /**
   * Builder for {@see Embassy}
   */
  public static final class Builder {
    public Embassy build() {
      return new Embassy(event, openingHoursSpecification, review, faxNumber, mainEntityOfPage, globalLocationNumber, openingHours, telephone, alternateName, potentialAction, photo, geo, url, additionalType, aggregateRating, logo, sameAs, name, image, address, additionalProperty, containedIn, isicV4, description, hasMap);
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    public Builder event(Event value) {
      event = value;
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    public Builder openingHoursSpecification(OpeningHoursSpecification value) {
      openingHoursSpecification = value;
      return this;
    }
    /**
     * A review of the item.
     */
    public Builder review(Review value) {
      review = value;
      return this;
    }
    /**
     * The fax number.
     */
    public Builder faxNumber(String value) {
      faxNumber = value;
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
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    public Builder globalLocationNumber(String value) {
      globalLocationNumber = value;
      return this;
    }
    /**
     * The opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.<br />- Days are specified using the following two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>, <code>Fr</code>, <code>Sa</code>, <code>Su</code>.<br />- Times are specified using 24:00 time. For example, 3pm is specified as <code>15:00</code>. <br />- Here is an example: <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>. <br />- If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.
     */
    public Builder openingHours(String value) {
      openingHours = value;
      return this;
    }
    /**
     * The telephone number.
     */
    public Builder telephone(String value) {
      telephone = value;
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
     * A photograph of this place.
     */
    public Builder photo(ImageObject value) {
      photo = value;
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    public Builder geo(GeoCoordinates value) {
      geo = value;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating value) {
      aggregateRating = value;
      return this;
    }
    /**
     * An associated logo.
     */
    public Builder logo(ImageObject value) {
      logo = value;
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
     * Physical address of the item.
     */
    public Builder address(PostalAddress value) {
      address = value;
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org. <br /><br />

Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

     */
    public Builder additionalProperty(PropertyValue value) {
      additionalProperty = value;
      return this;
    }
    /**
     * The basic containment relation between places.
     */
    public Builder containedIn(Place value) {
      containedIn = value;
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    public Builder isicV4(String value) {
      isicV4 = value;
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
     * A URL to a map of the place.
     */
    public Builder hasMap(String value) {
      hasMap = value;
      return this;
    }
    private Event event;
    private OpeningHoursSpecification openingHoursSpecification;
    private Review review;
    private String faxNumber;
    private CreativeWork mainEntityOfPage;
    private String globalLocationNumber;
    private String openingHours;
    private String telephone;
    private String alternateName;
    private Action potentialAction;
    private ImageObject photo;
    private GeoCoordinates geo;
    private String url;
    private String additionalType;
    private AggregateRating aggregateRating;
    private ImageObject logo;
    private String sameAs;
    private String name;
    private Image image;
    private PostalAddress address;
    private PropertyValue additionalProperty;
    private Place containedIn;
    private String isicV4;
    private String description;
    private String hasMap;
  }

  protected Embassy(Event event, OpeningHoursSpecification openingHoursSpecification, Review review, String faxNumber, CreativeWork mainEntityOfPage, String globalLocationNumber, String openingHours, String telephone, String alternateName, Action potentialAction, ImageObject photo, GeoCoordinates geo, String url, String additionalType, AggregateRating aggregateRating, ImageObject logo, String sameAs, String name, Image image, PostalAddress address, PropertyValue additionalProperty, Place containedIn, String isicV4, String description, String hasMap) {
    super(event, openingHoursSpecification, review, faxNumber, mainEntityOfPage, globalLocationNumber, openingHours, telephone, alternateName, potentialAction, photo, additionalType, url, geo, sameAs, logo, aggregateRating, image, name, address, additionalProperty, isicV4, containedIn, description, hasMap);
  }
}
