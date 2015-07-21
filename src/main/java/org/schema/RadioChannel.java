/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A unique instance of a radio BroadcastService on a CableOrSatelliteService lineup.
 */
public class RadioChannel extends BroadcastChannel {
  /**
   * Builder for {@see RadioChannel}
   */
  public static final class Builder {
    public RadioChannel build() {
      return new RadioChannel(broadcastChannelId, mainEntityOfPage, name, image, providesBroadcastService, broadcastServiceTier, potentialAction, alternateName, additionalType, url, inBroadcastLineup, description, sameAs);
    }
    /**
     * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
     */
    public Builder broadcastChannelId(String value) {
      broadcastChannelId = value;
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
     * The BroadcastService offered on this channel.
     */
    public Builder providesBroadcastService(BroadcastService value) {
      providesBroadcastService = value;
      return this;
    }
    /**
     * The type of service required to have access to the channel (e.g. Standard or Premium).
     */
    public Builder broadcastServiceTier(String value) {
      broadcastServiceTier = value;
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
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
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
     * The CableOrSatelliteService offering the channel.
     */
    public Builder inBroadcastLineup(CableOrSatelliteService value) {
      inBroadcastLineup = value;
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
    private String broadcastChannelId;
    private CreativeWork mainEntityOfPage;
    private String name;
    private Image image;
    private BroadcastService providesBroadcastService;
    private String broadcastServiceTier;
    private Action potentialAction;
    private String alternateName;
    private String additionalType;
    private String url;
    private CableOrSatelliteService inBroadcastLineup;
    private String description;
    private String sameAs;
  }

  protected RadioChannel(String broadcastChannelId, CreativeWork mainEntityOfPage, String name, Image image, BroadcastService providesBroadcastService, String broadcastServiceTier, Action potentialAction, String alternateName, String additionalType, String url, CableOrSatelliteService inBroadcastLineup, String description, String sameAs) {
    super(broadcastChannelId, mainEntityOfPage, name, image, providesBroadcastService, alternateName, potentialAction, broadcastServiceTier, url, additionalType, description, inBroadcastLineup, sameAs);
  }
}
