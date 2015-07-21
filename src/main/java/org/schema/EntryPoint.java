/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * An entry point, within some Web-based protocol.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass
 */
public class EntryPoint extends Intangible {
  /**
   * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
   */
  public String getHttpMethod() {
    return myHttpMethod;
  }
  /**
   * The supported encoding type(s) for an EntryPoint request.
   */
  public String getEncodingType() {
    return myEncodingType;
  }
  /**
   * The supported content type(s) for an EntryPoint response.
   */
  public String getContentType() {
    return myContentType;
  }
  /**
   * An application that can complete the request.
   */
  public SoftwareApplication getActionApplication() {
    return myActionApplication;
  }
  /**
   * An url template (RFC6570) that will be used to construct the target of the execution of the action.
   */
  public String getUrlTemplate() {
    return myUrlTemplate;
  }
  /**
   * Builder for {@see EntryPoint}
   */
  public static final class Builder {
    public EntryPoint build() {
      return new EntryPoint(contentType, urlTemplate, mainEntityOfPage, encodingType, potentialAction, alternateName, additionalType, url, sameAs, actionApplication, image, name, httpMethod, description);
    }
    /**
     * The supported content type(s) for an EntryPoint response.
     */
    public Builder contentType(String value) {
      contentType = value;
      return this;
    }
    /**
     * An url template (RFC6570) that will be used to construct the target of the execution of the action.
     */
    public Builder urlTemplate(String value) {
      urlTemplate = value;
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
     * The supported encoding type(s) for an EntryPoint request.
     */
    public Builder encodingType(String value) {
      encodingType = value;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * An application that can complete the request.
     */
    public Builder actionApplication(SoftwareApplication value) {
      actionApplication = value;
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
     * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
     */
    public Builder httpMethod(String value) {
      httpMethod = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    private String contentType;
    private String urlTemplate;
    private CreativeWork mainEntityOfPage;
    private String encodingType;
    private Action potentialAction;
    private String alternateName;
    private String additionalType;
    private String url;
    private String sameAs;
    private SoftwareApplication actionApplication;
    private Image image;
    private String name;
    private String httpMethod;
    private String description;
  }

  protected EntryPoint(String contentType, String urlTemplate, CreativeWork mainEntityOfPage, String encodingType, Action potentialAction, String alternateName, String additionalType, String url, String sameAs, SoftwareApplication actionApplication, Image image, String name, String httpMethod, String description) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
    myHttpMethod = httpMethod;
    myEncodingType = encodingType;
    myContentType = contentType;
    myActionApplication = actionApplication;
    myUrlTemplate = urlTemplate;
  }
  private String myHttpMethod;
  private String myEncodingType;
  private String myContentType;
  private SoftwareApplication myActionApplication;
  private String myUrlTemplate;
}
