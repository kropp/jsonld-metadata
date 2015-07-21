/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A software application.
 */
public class SoftwareApplication extends CreativeWork {
  /**
   * Type of software application, e.g. "Game, Multimedia".
   */
  public String getApplicationCategory() {
    return myApplicationCategory;
  }
  /**
   * Subcategory of the application, e.g. "Arcade Game".
   */
  public String getApplicationSubCategory() {
    return myApplicationSubCategory;
  }
  /**
   * The name of the application suite to which the application belongs (e.g. Excel belongs to Office).
   */
  public String getApplicationSuite() {
    return myApplicationSuite;
  }
  /**
   * Countries for which the application is not supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
   */
  public String getCountriesNotSupported() {
    return myCountriesNotSupported;
  }
  /**
   * Countries for which the application is supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
   */
  public String getCountriesSupported() {
    return myCountriesSupported;
  }
  /**
   * Device required to run the application. Used in cases where a specific make/model is required to run the application.
   */
  public String getAvailableOnDevice() {
    return myAvailableOnDevice;
  }
  /**
   * If the file can be downloaded, URL to download the binary.
   */
  public String getDownloadUrl() {
    return myDownloadUrl;
  }
  /**
   * Features or modules provided by this application (and possibly required by other applications).
   */
  public String getFeatureList() {
    return myFeatureList;
  }
  /**
   * MIME format of the binary (e.g. application/zip).
   */
  public String getFileFormat() {
    return myFileFormat;
  }
  /**
   * Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB etc.), KB will be assumed.
   */
  public Integer getFileSize() {
    return myFileSize;
  }
  /**
   * URL at which the app may be installed, if different from the URL of the item.
   */
  public String getInstallUrl() {
    return myInstallUrl;
  }
  /**
   * Minimum memory requirements.
   */
  public String getMemoryRequirements() {
    return myMemoryRequirements;
  }
  /**
   * Operating systems supported (Windows 7, OSX 10.6, Android 1.6).
   */
  public String getOperatingSystem() {
    return myOperatingSystem;
  }
  /**
   * Permission(s) required to run the app (for example, a mobile app may require full internet access or may run only on wifi).
   */
  public String getPermissions() {
    return myPermissions;
  }
  /**
   * Processor architecture required to run the application (e.g. IA64).
   */
  public String getProcessorRequirements() {
    return myProcessorRequirements;
  }
  /**
   * Description of what changed in this version.
   */
  public String getReleaseNotes() {
    return myReleaseNotes;
  }
  /**
   * Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime).
   */
  public String getSoftwareRequirements() {
    return mySoftwareRequirements;
  }
  /**
   * A link to a screenshot image of the app.
   */
  public ImageObject getScreenshot() {
    return myScreenshot;
  }
  /**
   * Version of the software instance.
   */
  public String getSoftwareVersion() {
    return mySoftwareVersion;
  }
  /**
   * Storage requirements (free space required).
   */
  public String getStorageRequirements() {
    return myStorageRequirements;
  }
  /**
   * Additional content for a software application.
   */
  public SoftwareApplication getSoftwareAddOn() {
    return mySoftwareAddOn;
  }
  /**
   * Software application help.
   */
  public CreativeWork getSoftwareHelp() {
    return mySoftwareHelp;
  }
  /**
   * Builder for {@see SoftwareApplication}
   */
  public static final class Builder {
    public SoftwareApplication build() {
      return new SoftwareApplication(countriesSupported, producer, review, editor, installUrl, timeRequired, screenshot, offers, creator, educationalUse, softwareHelp, fileFormat, alternativeHeadline, mentions, additionalType, position, associatedMedia, isFamilyFriendly, image, accessibilityControl, keywords, fileSize, discussionUrl, exampleOfWork, isBasedOnUrl, comment, datePublished, alternateName, author, video, publisher, url, about, interactivityType, character, schemaVersion, accessibilityAPI, applicationCategory, storageRequirements, downloadUrl, encoding, headline, publishingPrinciples, version, mainEntity, commentCount, genre, softwareVersion, potentialAction, audience, contentRating, operatingSystem, applicationSuite, softwareAddOn, inLanguage, contentLocation, learningResourceType, accountablePerson, audio, dateModified, thumbnailUrl, releasedEvent, accessibilityFeature, accessibilityHazard, license, releaseNotes, featureList, description, publication, provider, processorRequirements, educationalAlignment, recordedAt, mainEntityOfPage, contributor, countriesNotSupported, isPartOf, workExample, applicationSubCategory, memoryRequirements, dateCreated, copyrightHolder, aggregateRating, sameAs, availableOnDevice, name, permissions, typicalAgeRange, citation, copyrightYear, translator, sourceOrganization, text, award, softwareRequirements);
    }
    /**
     * Countries for which the application is supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
     */
    public Builder countriesSupported(String value) {
      countriesSupported = value;
      return this;
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
     * URL at which the app may be installed, if different from the URL of the item.
     */
    public Builder installUrl(String value) {
      installUrl = value;
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
     * A link to a screenshot image of the app.
     */
    public Builder screenshot(ImageObject value) {
      screenshot = value;
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
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    public Builder educationalUse(String value) {
      educationalUse = value;
      return this;
    }
    /**
     * Software application help.
     */
    public Builder softwareHelp(CreativeWork value) {
      softwareHelp = value;
      return this;
    }
    /**
     * MIME format of the binary (e.g. application/zip).
     */
    public Builder fileFormat(String value) {
      fileFormat = value;
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
     * Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB etc.), KB will be assumed.
     */
    public Builder fileSize(Integer value) {
      fileSize = value;
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
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    public Builder exampleOfWork(CreativeWork value) {
      exampleOfWork = value;
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
     * The subject matter of the content.
     */
    public Builder about(Thing value) {
      about = value;
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
     * Type of software application, e.g. "Game, Multimedia".
     */
    public Builder applicationCategory(String value) {
      applicationCategory = value;
      return this;
    }
    /**
     * Storage requirements (free space required).
     */
    public Builder storageRequirements(String value) {
      storageRequirements = value;
      return this;
    }
    /**
     * If the file can be downloaded, URL to download the binary.
     */
    public Builder downloadUrl(String value) {
      downloadUrl = value;
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
     * Headline of the article.
     */
    public Builder headline(String value) {
      headline = value;
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
     * The version of the CreativeWork embodied by a specified resource.
     */
    public Builder version(Number value) {
      version = value;
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
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    public Builder commentCount(Integer value) {
      commentCount = value;
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
     * Version of the software instance.
     */
    public Builder softwareVersion(String value) {
      softwareVersion = value;
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
     * Operating systems supported (Windows 7, OSX 10.6, Android 1.6).
     */
    public Builder operatingSystem(String value) {
      operatingSystem = value;
      return this;
    }
    /**
     * The name of the application suite to which the application belongs (e.g. Excel belongs to Office).
     */
    public Builder applicationSuite(String value) {
      applicationSuite = value;
      return this;
    }
    /**
     * Additional content for a software application.
     */
    public Builder softwareAddOn(SoftwareApplication value) {
      softwareAddOn = value;
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
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    public Builder accountablePerson(Person value) {
      accountablePerson = value;
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
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityFeature(String value) {
      accessibilityFeature = value;
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
     * A license document that applies to this content, typically indicated by URL.
     */
    public Builder license(CreativeWork value) {
      license = value;
      return this;
    }
    /**
     * Description of what changed in this version.
     */
    public Builder releaseNotes(String value) {
      releaseNotes = value;
      return this;
    }
    /**
     * Features or modules provided by this application (and possibly required by other applications).
     */
    public Builder featureList(String value) {
      featureList = value;
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
     * A publication event associated with the item.
     */
    public Builder publication(PublicationEvent value) {
      publication = value;
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
     * Processor architecture required to run the application (e.g. IA64).
     */
    public Builder processorRequirements(String value) {
      processorRequirements = value;
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
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    public Builder recordedAt(Event value) {
      recordedAt = value;
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
     * Countries for which the application is not supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
     */
    public Builder countriesNotSupported(String value) {
      countriesNotSupported = value;
      return this;
    }
    public Builder isPartOf(IsPartOf value) {
      isPartOf = value;
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    public Builder workExample(CreativeWork value) {
      workExample = value;
      return this;
    }
    /**
     * Subcategory of the application, e.g. "Arcade Game".
     */
    public Builder applicationSubCategory(String value) {
      applicationSubCategory = value;
      return this;
    }
    /**
     * Minimum memory requirements.
     */
    public Builder memoryRequirements(String value) {
      memoryRequirements = value;
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
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating value) {
      aggregateRating = value;
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
     * Device required to run the application. Used in cases where a specific make/model is required to run the application.
     */
    public Builder availableOnDevice(String value) {
      availableOnDevice = value;
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
     * Permission(s) required to run the app (for example, a mobile app may require full internet access or may run only on wifi).
     */
    public Builder permissions(String value) {
      permissions = value;
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
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    public Builder citation(CreativeWork value) {
      citation = value;
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
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    public Builder translator(Person value) {
      translator = value;
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
    /**
     * Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime).
     */
    public Builder softwareRequirements(String value) {
      softwareRequirements = value;
      return this;
    }
    private String countriesSupported;
    private Person producer;
    private Review review;
    private Person editor;
    private String installUrl;
    private Duration timeRequired;
    private ImageObject screenshot;
    private Offer offers;
    private Organization creator;
    private String educationalUse;
    private CreativeWork softwareHelp;
    private String fileFormat;
    private String alternativeHeadline;
    private Thing mentions;
    private String additionalType;
    private Position position;
    private MediaObject associatedMedia;
    private Boolean isFamilyFriendly;
    private Image image;
    private String accessibilityControl;
    private String keywords;
    private Integer fileSize;
    private String discussionUrl;
    private CreativeWork exampleOfWork;
    private String isBasedOnUrl;
    private Comment comment;
    private java.util.Date datePublished;
    private String alternateName;
    private Organization author;
    private VideoObject video;
    private Organization publisher;
    private String url;
    private Thing about;
    private String interactivityType;
    private Person character;
    private String schemaVersion;
    private String accessibilityAPI;
    private String applicationCategory;
    private String storageRequirements;
    private String downloadUrl;
    private MediaObject encoding;
    private String headline;
    private String publishingPrinciples;
    private Number version;
    private Thing mainEntity;
    private Integer commentCount;
    private String genre;
    private String softwareVersion;
    private Action potentialAction;
    private Audience audience;
    private String contentRating;
    private String operatingSystem;
    private String applicationSuite;
    private SoftwareApplication softwareAddOn;
    private String inLanguage;
    private Place contentLocation;
    private String learningResourceType;
    private Person accountablePerson;
    private AudioObject audio;
    private java.util.Date dateModified;
    private String thumbnailUrl;
    private PublicationEvent releasedEvent;
    private String accessibilityFeature;
    private String accessibilityHazard;
    private CreativeWork license;
    private String releaseNotes;
    private String featureList;
    private String description;
    private PublicationEvent publication;
    private Person provider;
    private String processorRequirements;
    private AlignmentObject educationalAlignment;
    private Event recordedAt;
    private CreativeWork mainEntityOfPage;
    private Organization contributor;
    private String countriesNotSupported;
    private IsPartOf isPartOf;
    private CreativeWork workExample;
    private String applicationSubCategory;
    private String memoryRequirements;
    private java.util.Date dateCreated;
    private Organization copyrightHolder;
    private AggregateRating aggregateRating;
    private String sameAs;
    private String availableOnDevice;
    private String name;
    private String permissions;
    private String typicalAgeRange;
    private CreativeWork citation;
    private Number copyrightYear;
    private Person translator;
    private Organization sourceOrganization;
    private String text;
    private String award;
    private String softwareRequirements;
  }

  protected SoftwareApplication(String countriesSupported, Person producer, Review review, Person editor, String installUrl, Duration timeRequired, ImageObject screenshot, Offer offers, Organization creator, String educationalUse, CreativeWork softwareHelp, String fileFormat, String alternativeHeadline, Thing mentions, String additionalType, Position position, MediaObject associatedMedia, Boolean isFamilyFriendly, Image image, String accessibilityControl, String keywords, Integer fileSize, String discussionUrl, CreativeWork exampleOfWork, String isBasedOnUrl, Comment comment, java.util.Date datePublished, String alternateName, Organization author, VideoObject video, Organization publisher, String url, Thing about, String interactivityType, Person character, String schemaVersion, String accessibilityAPI, String applicationCategory, String storageRequirements, String downloadUrl, MediaObject encoding, String headline, String publishingPrinciples, Number version, Thing mainEntity, Integer commentCount, String genre, String softwareVersion, Action potentialAction, Audience audience, String contentRating, String operatingSystem, String applicationSuite, SoftwareApplication softwareAddOn, String inLanguage, Place contentLocation, String learningResourceType, Person accountablePerson, AudioObject audio, java.util.Date dateModified, String thumbnailUrl, PublicationEvent releasedEvent, String accessibilityFeature, String accessibilityHazard, CreativeWork license, String releaseNotes, String featureList, String description, PublicationEvent publication, Person provider, String processorRequirements, AlignmentObject educationalAlignment, Event recordedAt, CreativeWork mainEntityOfPage, Organization contributor, String countriesNotSupported, IsPartOf isPartOf, CreativeWork workExample, String applicationSubCategory, String memoryRequirements, java.util.Date dateCreated, Organization copyrightHolder, AggregateRating aggregateRating, String sameAs, String availableOnDevice, String name, String permissions, String typicalAgeRange, CreativeWork citation, Number copyrightYear, Person translator, Organization sourceOrganization, String text, String award, String softwareRequirements) {
    super(review, producer, editor, timeRequired, offers, creator, educationalUse, alternativeHeadline, mentions, additionalType, position, associatedMedia, isFamilyFriendly, image, accessibilityControl, keywords, discussionUrl, exampleOfWork, isBasedOnUrl, comment, datePublished, alternateName, author, video, publisher, url, interactivityType, about, character, schemaVersion, accessibilityAPI, version, publishingPrinciples, headline, encoding, commentCount, mainEntity, genre, potentialAction, contentRating, audience, inLanguage, contentLocation, learningResourceType, audio, accountablePerson, dateModified, thumbnailUrl, releasedEvent, accessibilityHazard, accessibilityFeature, license, description, provider, publication, recordedAt, educationalAlignment, mainEntityOfPage, contributor, workExample, isPartOf, dateCreated, copyrightHolder, sameAs, aggregateRating, name, typicalAgeRange, translator, copyrightYear, citation, sourceOrganization, text, award);
    myApplicationCategory = applicationCategory;
    myApplicationSubCategory = applicationSubCategory;
    myApplicationSuite = applicationSuite;
    myCountriesNotSupported = countriesNotSupported;
    myCountriesSupported = countriesSupported;
    myAvailableOnDevice = availableOnDevice;
    myDownloadUrl = downloadUrl;
    myFeatureList = featureList;
    myFileFormat = fileFormat;
    myFileSize = fileSize;
    myInstallUrl = installUrl;
    myMemoryRequirements = memoryRequirements;
    myOperatingSystem = operatingSystem;
    myPermissions = permissions;
    myProcessorRequirements = processorRequirements;
    myReleaseNotes = releaseNotes;
    mySoftwareRequirements = softwareRequirements;
    myScreenshot = screenshot;
    mySoftwareVersion = softwareVersion;
    myStorageRequirements = storageRequirements;
    mySoftwareAddOn = softwareAddOn;
    mySoftwareHelp = softwareHelp;
  }
  private String myApplicationCategory;
  private String myApplicationSubCategory;
  private String myApplicationSuite;
  private String myCountriesNotSupported;
  private String myCountriesSupported;
  private String myAvailableOnDevice;
  private String myDownloadUrl;
  private String myFeatureList;
  private String myFileFormat;
  private Integer myFileSize;
  private String myInstallUrl;
  private String myMemoryRequirements;
  private String myOperatingSystem;
  private String myPermissions;
  private String myProcessorRequirements;
  private String myReleaseNotes;
  private String mySoftwareRequirements;
  private ImageObject myScreenshot;
  private String mySoftwareVersion;
  private String myStorageRequirements;
  private SoftwareApplication mySoftwareAddOn;
  private CreativeWork mySoftwareHelp;
}
