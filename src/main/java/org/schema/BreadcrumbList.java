/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * 
  *       A BreadcrumbList is an ItemList consisting of a chain of linked Web pages, typically described using at least their URL and their name, and typically ending with the current page.
  *       <br />
  *       <br />
  *       The 'position' property is used to reconstruct the order of the items in a BreadcrumbList.
  *       The convention is that a breadcrumb list has an itemListOrder of ItemListOrderAscending (lower values listed first), and that the
  *       first items in this list correspond to the "top" or beginning of the breadcrumb trail, e.g. with a site or section homepage.
  *       The specific values of 'position' are not assigned meaning for a BreadcrumbList, but they should be integers, e.g. beginning
  *       with '1' for the first item in the list.
  *       
 */
public class BreadcrumbList extends ItemList {
  /**
   * Builder for {@see BreadcrumbList}
   */
  public static final class Builder {
    public BreadcrumbList build() {
      return new BreadcrumbList(mainEntityOfPage, itemListOrder, image, name, itemListElement, potentialAction, alternateName, numberOfItems, additionalType, url, description, sameAs);
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
     * Type of ordering (e.g. Ascending, Descending, Unordered).
     */
    public Builder itemListOrder(ItemListOrderType value) {
      itemListOrder = value;
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
     * For itemListElement values, you can use simple strings (e.g. "Peter", "Paul", "Mary"), existing entities, or use ListItem.
    <br/><br/>
    Text values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.
    <br/><br/>
    Note: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
     */
    public Builder itemListElement(String value) {
      itemListElement = value;
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
     * The number of items in an ItemList. Note that some descriptions might not fully describe all items in a list (e.g., multi-page pagination); in such cases, the numberOfItems would be for the entire list.
     */
    public Builder numberOfItems(Integer value) {
      numberOfItems = value;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    private CreativeWork mainEntityOfPage;
    private ItemListOrderType itemListOrder;
    private Image image;
    private String name;
    private String itemListElement;
    private Action potentialAction;
    private String alternateName;
    private Integer numberOfItems;
    private String additionalType;
    private String url;
    private String description;
    private String sameAs;
  }

  protected BreadcrumbList(CreativeWork mainEntityOfPage, ItemListOrderType itemListOrder, Image image, String name, String itemListElement, Action potentialAction, String alternateName, Integer numberOfItems, String additionalType, String url, String description, String sameAs) {
    super(mainEntityOfPage, itemListOrder, image, name, itemListElement, alternateName, potentialAction, numberOfItems, url, additionalType, description, sameAs);
  }
}
