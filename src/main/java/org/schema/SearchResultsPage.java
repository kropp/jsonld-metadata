/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * Web page type: Search results page.
 */
public class SearchResultsPage extends WebPage {
  /**
   * Builder for {@see SearchResultsPage}
   */
  public static final class Builder {
    public SearchResultsPage build() {
      return new SearchResultsPage(producer, review, editor, timeRequired, offers, creator, lastReviewed, educationalUse, alternativeHeadline, mainContentOfPage, mentions, additionalType, position, associatedMedia, isFamilyFriendly, image, accessibilityControl, keywords, specialty, discussionUrl, isBasedOnUrl, exampleOfWork, comment, datePublished, primaryImageOfPage, alternateName, author, video, publisher, url, interactivityType, about, breadcrumb, character, schemaVersion, accessibilityAPI, version, publishingPrinciples, headline, encoding, commentCount, mainEntity, genre, potentialAction, audience, contentRating, reviewedBy, relatedLink, inLanguage, contentLocation, learningResourceType, audio, accountablePerson, dateModified, thumbnailUrl, releasedEvent, accessibilityHazard, accessibilityFeature, license, description, provider, publication, recordedAt, educationalAlignment, mainEntityOfPage, contributor, workExample, isPartOf, significantLink, dateCreated, copyrightHolder, sameAs, aggregateRating, name, typicalAgeRange, translator, copyrightYear, citation, sourceOrganization, text, award);
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    public Builder producer(Person value) {
      producer = value;
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
     * Specifies the Person who edited the CreativeWork.
     */
    public Builder editor(Person value) {
      editor = value;
      return this;
    }
    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
     */
    public Builder timeRequired(Duration value) {
      timeRequired = value;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer value) {
      offers = value;
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    public Builder creator(Organization value) {
      creator = value;
      return this;
    }
    /**
     * Date on which the content on this web page was last reviewed for accuracy and/or completeness.
     */
    public Builder lastReviewed(java.util.Date value) {
      lastReviewed = value;
      return this;
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    public Builder educationalUse(String value) {
      educationalUse = value;
      return this;
    }
    /**
     * A secondary title of the CreativeWork.
     */
    public Builder alternativeHeadline(String value) {
      alternativeHeadline = value;
      return this;
    }
    /**
     * Indicates if this web page element is the main subject of the page.
     */
    public Builder mainContentOfPage(WebPageElement value) {
      mainContentOfPage = value;
      return this;
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    public Builder mentions(Thing value) {
      mentions = value;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    public Builder position(Position value) {
      position = value;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    public Builder associatedMedia(MediaObject value) {
      associatedMedia = value;
      return this;
    }
    /**
     * Indicates whether this content is family friendly.
     */
    public Builder isFamilyFriendly(Boolean value) {
      isFamilyFriendly = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * Identifies input methods that are sufficient to fully control the described resource (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityControl(String value) {
      accessibilityControl = value;
      return this;
    }
    /**
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    public Builder keywords(String value) {
      keywords = value;
      return this;
    }
    /**
     * One of the domain specialities to which this web page's content applies.
     */
    public Builder specialty(Specialty value) {
      specialty = value;
      return this;
    }
    /**
     * A link to the page containing the comments of the CreativeWork.
     */
    public Builder discussionUrl(String value) {
      discussionUrl = value;
      return this;
    }
    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    public Builder isBasedOnUrl(String value) {
      isBasedOnUrl = value;
      return this;
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    public Builder exampleOfWork(CreativeWork value) {
      exampleOfWork = value;
      return this;
    }
    /**
     * Comments, typically from users.
     */
    public Builder comment(Comment value) {
      comment = value;
      return this;
    }
    /**
     * Date of first broadcast/publication.
     */
    public Builder datePublished(java.util.Date value) {
      datePublished = value;
      return this;
    }
    /**
     * Indicates the main image on the page.
     */
    public Builder primaryImageOfPage(ImageObject value) {
      primaryImageOfPage = value;
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
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    public Builder author(Organization value) {
      author = value;
      return this;
    }
    /**
     * An embedded video object.
     */
    public Builder video(VideoObject value) {
      video = value;
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    public Builder publisher(Organization value) {
      publisher = value;
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
     * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
     */
    public Builder interactivityType(String value) {
      interactivityType = value;
      return this;
    }
    /**
     * The subject matter of the content.
     */
    public Builder about(Thing value) {
      about = value;
      return this;
    }
    /**
     * A set of links that can help a user understand and navigate a website hierarchy.
     */
    public Builder breadcrumb(String value) {
      breadcrumb = value;
      return this;
    }
    /**
     * Fictional person connected with a creative work.
     */
    public Builder character(Person value) {
      character = value;
      return this;
    }
    /**
     * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application. 
     */
    public Builder schemaVersion(String value) {
      schemaVersion = value;
      return this;
    }
    /**
     * Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityAPI(String value) {
      accessibilityAPI = value;
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    public Builder version(Number value) {
      version = value;
      return this;
    }
    /**
     * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
     */
    public Builder publishingPrinciples(String value) {
      publishingPrinciples = value;
      return this;
    }
    /**
     * Headline of the article.
     */
    public Builder headline(String value) {
      headline = value;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    public Builder encoding(MediaObject value) {
      encoding = value;
      return this;
    }
    /**
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    public Builder commentCount(Integer value) {
      commentCount = value;
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    public Builder mainEntity(Thing value) {
      mainEntity = value;
      return this;
    }
    /**
     * Genre of the creative work or group.
     */
    public Builder genre(String value) {
      genre = value;
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
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience value) {
      audience = value;
      return this;
    }
    /**
     * Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
     */
    public Builder contentRating(String value) {
      contentRating = value;
      return this;
    }
    /**
     * People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
     */
    public Builder reviewedBy(Organization value) {
      reviewedBy = value;
      return this;
    }
    /**
     * A link related to this web page, for example to other related web pages.
     */
    public Builder relatedLink(String value) {
      relatedLink = value;
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    public Builder inLanguage(String value) {
      inLanguage = value;
      return this;
    }
    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    public Builder contentLocation(Place value) {
      contentLocation = value;
      return this;
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    public Builder learningResourceType(String value) {
      learningResourceType = value;
      return this;
    }
    /**
     * An embedded audio object.
     */
    public Builder audio(AudioObject value) {
      audio = value;
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    public Builder accountablePerson(Person value) {
      accountablePerson = value;
      return this;
    }
    /**
     * The date on which the CreativeWork was most recently modified.
     */
    public Builder dateModified(java.util.Date value) {
      dateModified = value;
      return this;
    }
    /**
     * A thumbnail image relevant to the Thing.
     */
    public Builder thumbnailUrl(String value) {
      thumbnailUrl = value;
      return this;
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    public Builder releasedEvent(PublicationEvent value) {
      releasedEvent = value;
      return this;
    }
    /**
     * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityHazard(String value) {
      accessibilityHazard = value;
      return this;
    }
    /**
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityFeature(String value) {
      accessibilityFeature = value;
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    public Builder license(CreativeWork value) {
      license = value;
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
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person value) {
      provider = value;
      return this;
    }
    /**
     * A publication event associated with the item.
     */
    public Builder publication(PublicationEvent value) {
      publication = value;
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    public Builder recordedAt(Event value) {
      recordedAt = value;
      return this;
    }
    /**
     * An alignment to an established educational framework.
     */
    public Builder educationalAlignment(AlignmentObject value) {
      educationalAlignment = value;
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
     * A secondary contributor to the CreativeWork.
     */
    public Builder contributor(Organization value) {
      contributor = value;
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    public Builder workExample(CreativeWork value) {
      workExample = value;
      return this;
    }
    public Builder isPartOf(IsPartOf value) {
      isPartOf = value;
      return this;
    }
    /**
     * One of the more significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
     */
    public Builder significantLink(String value) {
      significantLink = value;
      return this;
    }
    /**
     * The date on which the CreativeWork was created.
     */
    public Builder dateCreated(java.util.Date value) {
      dateCreated = value;
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    public Builder copyrightHolder(Organization value) {
      copyrightHolder = value;
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
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating value) {
      aggregateRating = value;
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
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    public Builder typicalAgeRange(String value) {
      typicalAgeRange = value;
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    public Builder translator(Person value) {
      translator = value;
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    public Builder copyrightYear(Number value) {
      copyrightYear = value;
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    public Builder citation(CreativeWork value) {
      citation = value;
      return this;
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    public Builder sourceOrganization(Organization value) {
      sourceOrganization = value;
      return this;
    }
    /**
     * The textual content of this CreativeWork.
     */
    public Builder text(String value) {
      text = value;
      return this;
    }
    /**
     * An award won by or for this item.
     */
    public Builder award(String value) {
      award = value;
      return this;
    }
    private Person producer;
    private Review review;
    private Person editor;
    private Duration timeRequired;
    private Offer offers;
    private Organization creator;
    private java.util.Date lastReviewed;
    private String educationalUse;
    private String alternativeHeadline;
    private WebPageElement mainContentOfPage;
    private Thing mentions;
    private String additionalType;
    private Position position;
    private MediaObject associatedMedia;
    private Boolean isFamilyFriendly;
    private Image image;
    private String accessibilityControl;
    private String keywords;
    private Specialty specialty;
    private String discussionUrl;
    private String isBasedOnUrl;
    private CreativeWork exampleOfWork;
    private Comment comment;
    private java.util.Date datePublished;
    private ImageObject primaryImageOfPage;
    private String alternateName;
    private Organization author;
    private VideoObject video;
    private Organization publisher;
    private String url;
    private String interactivityType;
    private Thing about;
    private String breadcrumb;
    private Person character;
    private String schemaVersion;
    private String accessibilityAPI;
    private Number version;
    private String publishingPrinciples;
    private String headline;
    private MediaObject encoding;
    private Integer commentCount;
    private Thing mainEntity;
    private String genre;
    private Action potentialAction;
    private Audience audience;
    private String contentRating;
    private Organization reviewedBy;
    private String relatedLink;
    private String inLanguage;
    private Place contentLocation;
    private String learningResourceType;
    private AudioObject audio;
    private Person accountablePerson;
    private java.util.Date dateModified;
    private String thumbnailUrl;
    private PublicationEvent releasedEvent;
    private String accessibilityHazard;
    private String accessibilityFeature;
    private CreativeWork license;
    private String description;
    private Person provider;
    private PublicationEvent publication;
    private Event recordedAt;
    private AlignmentObject educationalAlignment;
    private CreativeWork mainEntityOfPage;
    private Organization contributor;
    private CreativeWork workExample;
    private IsPartOf isPartOf;
    private String significantLink;
    private java.util.Date dateCreated;
    private Organization copyrightHolder;
    private String sameAs;
    private AggregateRating aggregateRating;
    private String name;
    private String typicalAgeRange;
    private Person translator;
    private Number copyrightYear;
    private CreativeWork citation;
    private Organization sourceOrganization;
    private String text;
    private String award;
  }

  protected SearchResultsPage(Person producer, Review review, Person editor, Duration timeRequired, Offer offers, Organization creator, java.util.Date lastReviewed, String educationalUse, String alternativeHeadline, WebPageElement mainContentOfPage, Thing mentions, String additionalType, Position position, MediaObject associatedMedia, Boolean isFamilyFriendly, Image image, String accessibilityControl, String keywords, Specialty specialty, String discussionUrl, String isBasedOnUrl, CreativeWork exampleOfWork, Comment comment, java.util.Date datePublished, ImageObject primaryImageOfPage, String alternateName, Organization author, VideoObject video, Organization publisher, String url, String interactivityType, Thing about, String breadcrumb, Person character, String schemaVersion, String accessibilityAPI, Number version, String publishingPrinciples, String headline, MediaObject encoding, Integer commentCount, Thing mainEntity, String genre, Action potentialAction, Audience audience, String contentRating, Organization reviewedBy, String relatedLink, String inLanguage, Place contentLocation, String learningResourceType, AudioObject audio, Person accountablePerson, java.util.Date dateModified, String thumbnailUrl, PublicationEvent releasedEvent, String accessibilityHazard, String accessibilityFeature, CreativeWork license, String description, Person provider, PublicationEvent publication, Event recordedAt, AlignmentObject educationalAlignment, CreativeWork mainEntityOfPage, Organization contributor, CreativeWork workExample, IsPartOf isPartOf, String significantLink, java.util.Date dateCreated, Organization copyrightHolder, String sameAs, AggregateRating aggregateRating, String name, String typicalAgeRange, Person translator, Number copyrightYear, CreativeWork citation, Organization sourceOrganization, String text, String award) {
    super(review, producer, editor, timeRequired, creator, offers, lastReviewed, educationalUse, alternativeHeadline, mainContentOfPage, mentions, additionalType, position, associatedMedia, isFamilyFriendly, accessibilityControl, image, keywords, specialty, discussionUrl, exampleOfWork, isBasedOnUrl, comment, datePublished, primaryImageOfPage, alternateName, author, video, publisher, url, interactivityType, about, breadcrumb, character, schemaVersion, accessibilityAPI, version, publishingPrinciples, headline, encoding, commentCount, mainEntity, genre, potentialAction, audience, contentRating, reviewedBy, inLanguage, relatedLink, contentLocation, learningResourceType, accountablePerson, audio, dateModified, thumbnailUrl, releasedEvent, accessibilityFeature, accessibilityHazard, license, description, publication, provider, educationalAlignment, recordedAt, mainEntityOfPage, contributor, isPartOf, workExample, significantLink, dateCreated, copyrightHolder, aggregateRating, sameAs, name, typicalAgeRange, citation, copyrightYear, translator, sourceOrganization, text, award);
  }
}
