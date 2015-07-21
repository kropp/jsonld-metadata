/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A delivery service through which content is provided via broadcast over the air or online.
 */
public class BroadcastService extends Thing {
  /**
   * The organization owning or operating the broadcast service.
   */
  public Organization getBroadcaster() {
    return myBroadcaster;
  }
  /**
   * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
   */
  public BroadcastService getParentService() {
    return myParentService;
  }
  /**
   * The media network(s) whose content is broadcast on this station.
   */
  public Organization getBroadcastAffiliateOf() {
    return myBroadcastAffiliateOf;
  }
  /**
   * The name displayed in the channel guide. For many US affiliates, it is the network name.
   */
  public String getBroadcastDisplayName() {
    return myBroadcastDisplayName;
  }
  /**
   * The timezone in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 format</a> for which the service bases its broadcasts.
   */
  public String getTimezone() {
    return myTimezone;
  }
  /**
   * Builder for {@see BroadcastService}
   */
  public static final class Builder {
    public BroadcastService build() {
      return new BroadcastService(mainEntityOfPage, image, name, broadcastAffiliateOf, broadcaster, parentService, alternateName, potentialAction, additionalType, url, broadcastDisplayName, timezone, description, sameAs);
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
     * The media network(s) whose content is broadcast on this station.
     */
    public Builder broadcastAffiliateOf(Organization value) {
      broadcastAffiliateOf = value;
      return this;
    }
    /**
     * The organization owning or operating the broadcast service.
     */
    public Builder broadcaster(Organization value) {
      broadcaster = value;
      return this;
    }
    /**
     * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
     */
    public Builder parentService(BroadcastService value) {
      parentService = value;
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
     * The name displayed in the channel guide. For many US affiliates, it is the network name.
     */
    public Builder broadcastDisplayName(String value) {
      broadcastDisplayName = value;
      return this;
    }
    /**
     * The timezone in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 format</a> for which the service bases its broadcasts.
     */
    public Builder timezone(String value) {
      timezone = value;
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
    private CreativeWork mainEntityOfPage;
    private Image image;
    private String name;
    private Organization broadcastAffiliateOf;
    private Organization broadcaster;
    private BroadcastService parentService;
    private String alternateName;
    private Action potentialAction;
    private String additionalType;
    private String url;
    private String broadcastDisplayName;
    private String timezone;
    private String description;
    private String sameAs;
  }

  protected BroadcastService(CreativeWork mainEntityOfPage, Image image, String name, Organization broadcastAffiliateOf, Organization broadcaster, BroadcastService parentService, String alternateName, Action potentialAction, String additionalType, String url, String broadcastDisplayName, String timezone, String description, String sameAs) {
    super(mainEntityOfPage, name, image, potentialAction, alternateName, url, additionalType, description, sameAs);
    myBroadcaster = broadcaster;
    myParentService = parentService;
    myBroadcastAffiliateOf = broadcastAffiliateOf;
    myBroadcastDisplayName = broadcastDisplayName;
    myTimezone = timezone;
  }
  private Organization myBroadcaster;
  private BroadcastService myParentService;
  private Organization myBroadcastAffiliateOf;
  private String myBroadcastDisplayName;
  private String myTimezone;
}
