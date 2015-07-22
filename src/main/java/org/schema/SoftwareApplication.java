/*
 * Copyright 2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 * Generated on Jul 22, 2015.
 */

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
  public ImageObjectOrString getScreenshot() {
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
   * Builder for {@link SoftwareApplication}
   */
  public static final class Builder {
    /**
     * Creates new {@link SoftwareApplication} instance.
     */
    public SoftwareApplication build() {
      return new SoftwareApplication(accessibilityAPI, aggregateRating, availableOnDevice, hasPart, review, installUrl, datePublished, comment, schemaVersion, video, award, releaseNotes, editor, storageRequirements, workExample, applicationCategory, potentialAction, producer, screenshot, countriesNotSupported, publisher, sourceOrganization, learningResourceType, genre, translator, publishingPrinciples, recordedAt, commentCount, inLanguage, dateModified, softwareVersion, fileFormat, mentions, audience, headline, url, interactivityType, fileSize, associatedMedia, character, contentRating, description, permissions, offers, downloadUrl, copyrightHolder, accessibilityControl, citation, educationalUse, keywords, educationalAlignment, text, about, applicationSubCategory, contentLocation, accessibilityHazard, author, version, accountablePerson, sameAs, additionalType, softwareRequirements, thumbnailUrl, publication, encoding, timeRequired, operatingSystem, accessibilityFeature, softwareAddOn, audio, typicalAgeRange, dateCreated, provider, processorRequirements, alternativeHeadline, mainEntity, softwareHelp, name, license, applicationSuite, copyrightYear, discussionUrl, mainEntityOfPage, memoryRequirements, isBasedOnUrl, isFamilyFriendly, exampleOfWork, alternateName, releasedEvent, featureList, countriesSupported, contributor, creator);
    }
    /**
     * Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityAPI(String accessibilityAPI) {
      this.accessibilityAPI = accessibilityAPI;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * Device required to run the application. Used in cases where a specific make/model is required to run the application.
     */
    public Builder availableOnDevice(String availableOnDevice) {
      this.availableOnDevice = availableOnDevice;
      return this;
    }
    /**
     * Indicates a CreativeWork that is (in some sense) a part of this CreativeWork.
     */
    public Builder hasPart(HasPart hasPart) {
      this.hasPart = hasPart;
      return this;
    }
    /**
     * A review of the item.
     */
    public Builder review(Review review) {
      this.review = review;
      return this;
    }
    /**
     * URL at which the app may be installed, if different from the URL of the item.
     */
    public Builder installUrl(String installUrl) {
      this.installUrl = installUrl;
      return this;
    }
    /**
     * Date of first broadcast/publication.
     */
    public Builder datePublished(java.util.Date date) {
      this.datePublished = date;
      return this;
    }
    /**
     * Comments, typically from users.
     */
    public Builder comment(Comment comment) {
      this.comment = comment;
      return this;
    }
    /**
     * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application. 
     */
    public Builder schemaVersion(String schemaVersion) {
      this.schemaVersion = schemaVersion;
      return this;
    }
    /**
     * An embedded video object.
     */
    public Builder video(VideoObject videoObject) {
      this.video = videoObject;
      return this;
    }
    /**
     * An award won by or for this item.
     */
    public Builder award(String award) {
      this.award = award;
      return this;
    }
    /**
     * Description of what changed in this version.
     */
    public Builder releaseNotes(String releaseNotes) {
      this.releaseNotes = releaseNotes;
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     */
    public Builder editor(Person person) {
      this.editor = person;
      return this;
    }
    /**
     * Storage requirements (free space required).
     */
    public Builder storageRequirements(String storageRequirements) {
      this.storageRequirements = storageRequirements;
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    public Builder workExample(CreativeWork creativeWork) {
      this.workExample = creativeWork;
      return this;
    }
    /**
     * Type of software application, e.g. "Game, Multimedia".
     */
    public Builder applicationCategory(String applicationCategory) {
      this.applicationCategory = applicationCategory;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    public Builder producer(Organization organization) {
      this.producer.setOrganization(organization);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    public Builder producer(Person person) {
      this.producer.setPerson(person);
      return this;
    }
    /**
     * A link to a screenshot image of the app.
     */
    public Builder screenshot(ImageObject imageObject) {
      this.screenshot.setImageObject(imageObject);
      return this;
    }
    /**
     * A link to a screenshot image of the app.
     */
    public Builder screenshot(String screenshot) {
      this.screenshot.setString(screenshot);
      return this;
    }
    /**
     * Countries for which the application is not supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
     */
    public Builder countriesNotSupported(String countriesNotSupported) {
      this.countriesNotSupported = countriesNotSupported;
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    public Builder publisher(Organization organization) {
      this.publisher = organization;
      return this;
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    public Builder sourceOrganization(Organization organization) {
      this.sourceOrganization = organization;
      return this;
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    public Builder learningResourceType(String learningResourceType) {
      this.learningResourceType = learningResourceType;
      return this;
    }
    /**
     * Genre of the creative work or group.
     */
    public Builder genre(String genre) {
      this.genre = genre;
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    public Builder translator(Organization organization) {
      this.translator.setOrganization(organization);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    public Builder translator(Person person) {
      this.translator.setPerson(person);
      return this;
    }
    /**
     * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
     */
    public Builder publishingPrinciples(String publishingPrinciples) {
      this.publishingPrinciples = publishingPrinciples;
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    public Builder recordedAt(Event event) {
      this.recordedAt = event;
      return this;
    }
    /**
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    public Builder commentCount(Integer integer) {
      this.commentCount = integer;
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    public Builder inLanguage(Language language) {
      this.inLanguage.setLanguage(language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    public Builder inLanguage(String inLanguage) {
      this.inLanguage.setString(inLanguage);
      return this;
    }
    /**
     * The date on which the CreativeWork was most recently modified.
     */
    public Builder dateModified(java.util.Date date) {
      this.dateModified = date;
      return this;
    }
    /**
     * Version of the software instance.
     */
    public Builder softwareVersion(String softwareVersion) {
      this.softwareVersion = softwareVersion;
      return this;
    }
    /**
     * MIME format of the binary (e.g. application/zip).
     */
    public Builder fileFormat(String fileFormat) {
      this.fileFormat = fileFormat;
      return this;
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    public Builder mentions(Thing thing) {
      this.mentions = thing;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience audience) {
      this.audience = audience;
      return this;
    }
    /**
     * Headline of the article.
     */
    public Builder headline(String headline) {
      this.headline = headline;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
     */
    public Builder interactivityType(String interactivityType) {
      this.interactivityType = interactivityType;
      return this;
    }
    /**
     * Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB etc.), KB will be assumed.
     */
    public Builder fileSize(Integer integer) {
      this.fileSize = integer;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    public Builder associatedMedia(MediaObject mediaObject) {
      this.associatedMedia = mediaObject;
      return this;
    }
    /**
     * Fictional person connected with a creative work.
     */
    public Builder character(Person person) {
      this.character = person;
      return this;
    }
    /**
     * Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
     */
    public Builder contentRating(String contentRating) {
      this.contentRating = contentRating;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
    /**
     * Permission(s) required to run the app (for example, a mobile app may require full internet access or may run only on wifi).
     */
    public Builder permissions(String permissions) {
      this.permissions = permissions;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer offer) {
      this.offers = offer;
      return this;
    }
    /**
     * If the file can be downloaded, URL to download the binary.
     */
    public Builder downloadUrl(String downloadUrl) {
      this.downloadUrl = downloadUrl;
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    public Builder copyrightHolder(Organization organization) {
      this.copyrightHolder.setOrganization(organization);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    public Builder copyrightHolder(Person person) {
      this.copyrightHolder.setPerson(person);
      return this;
    }
    /**
     * Identifies input methods that are sufficient to fully control the described resource (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityControl(String accessibilityControl) {
      this.accessibilityControl = accessibilityControl;
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    public Builder citation(String citation) {
      this.citation.setString(citation);
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    public Builder citation(CreativeWork creativeWork) {
      this.citation.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    public Builder educationalUse(String educationalUse) {
      this.educationalUse = educationalUse;
      return this;
    }
    /**
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    public Builder keywords(String keywords) {
      this.keywords = keywords;
      return this;
    }
    /**
     * An alignment to an established educational framework.
     */
    public Builder educationalAlignment(AlignmentObject alignmentObject) {
      this.educationalAlignment = alignmentObject;
      return this;
    }
    /**
     * The textual content of this CreativeWork.
     */
    public Builder text(String text) {
      this.text = text;
      return this;
    }
    /**
     * The subject matter of the content.
     */
    public Builder about(Thing thing) {
      this.about = thing;
      return this;
    }
    /**
     * Subcategory of the application, e.g. "Arcade Game".
     */
    public Builder applicationSubCategory(String applicationSubCategory) {
      this.applicationSubCategory = applicationSubCategory;
      return this;
    }
    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    public Builder contentLocation(Place place) {
      this.contentLocation = place;
      return this;
    }
    /**
     * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityHazard(String accessibilityHazard) {
      this.accessibilityHazard = accessibilityHazard;
      return this;
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    public Builder author(Organization organization) {
      this.author.setOrganization(organization);
      return this;
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    public Builder author(Person person) {
      this.author.setPerson(person);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    public Builder version(Number number) {
      this.version = number;
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    public Builder accountablePerson(Person person) {
      this.accountablePerson = person;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime).
     */
    public Builder softwareRequirements(String softwareRequirements) {
      this.softwareRequirements = softwareRequirements;
      return this;
    }
    /**
     * A thumbnail image relevant to the Thing.
     */
    public Builder thumbnailUrl(String thumbnailUrl) {
      this.thumbnailUrl = thumbnailUrl;
      return this;
    }
    /**
     * A publication event associated with the item.
     */
    public Builder publication(PublicationEvent publicationEvent) {
      this.publication = publicationEvent;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    public Builder encoding(MediaObject mediaObject) {
      this.encoding = mediaObject;
      return this;
    }
    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
     */
    public Builder timeRequired(Duration duration) {
      this.timeRequired = duration;
      return this;
    }
    /**
     * Operating systems supported (Windows 7, OSX 10.6, Android 1.6).
     */
    public Builder operatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
      return this;
    }
    /**
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityFeature(String accessibilityFeature) {
      this.accessibilityFeature = accessibilityFeature;
      return this;
    }
    /**
     * Additional content for a software application.
     */
    public Builder softwareAddOn(SoftwareApplication softwareApplication) {
      this.softwareAddOn = softwareApplication;
      return this;
    }
    /**
     * An embedded audio object.
     */
    public Builder audio(AudioObject audioObject) {
      this.audio = audioObject;
      return this;
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    public Builder typicalAgeRange(String typicalAgeRange) {
      this.typicalAgeRange = typicalAgeRange;
      return this;
    }
    /**
     * The date on which the CreativeWork was created.
     */
    public Builder dateCreated(java.util.Date date) {
      this.dateCreated = date;
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization organization) {
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person person) {
      this.provider.setPerson(person);
      return this;
    }
    /**
     * Processor architecture required to run the application (e.g. IA64).
     */
    public Builder processorRequirements(String processorRequirements) {
      this.processorRequirements = processorRequirements;
      return this;
    }
    /**
     * A secondary title of the CreativeWork.
     */
    public Builder alternativeHeadline(String alternativeHeadline) {
      this.alternativeHeadline = alternativeHeadline;
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    public Builder mainEntity(Thing thing) {
      this.mainEntity = thing;
      return this;
    }
    /**
     * Software application help.
     */
    public Builder softwareHelp(CreativeWork creativeWork) {
      this.softwareHelp = creativeWork;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    public Builder license(String license) {
      this.license.setString(license);
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    public Builder license(CreativeWork creativeWork) {
      this.license.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * The name of the application suite to which the application belongs (e.g. Excel belongs to Office).
     */
    public Builder applicationSuite(String applicationSuite) {
      this.applicationSuite = applicationSuite;
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    public Builder copyrightYear(Number number) {
      this.copyrightYear = number;
      return this;
    }
    /**
     * A link to the page containing the comments of the CreativeWork.
     */
    public Builder discussionUrl(String discussionUrl) {
      this.discussionUrl = discussionUrl;
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      this.mainEntityOfPage.setString(mainEntityOfPage);
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
    public Builder mainEntityOfPage(CreativeWork creativeWork) {
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * Minimum memory requirements.
     */
    public Builder memoryRequirements(String memoryRequirements) {
      this.memoryRequirements = memoryRequirements;
      return this;
    }
    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    public Builder isBasedOnUrl(String isBasedOnUrl) {
      this.isBasedOnUrl = isBasedOnUrl;
      return this;
    }
    /**
     * Indicates whether this content is family friendly.
     */
    public Builder isFamilyFriendly(Boolean isFamilyFriendly) {
      this.isFamilyFriendly = isFamilyFriendly;
      return this;
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    public Builder exampleOfWork(CreativeWork creativeWork) {
      this.exampleOfWork = creativeWork;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    public Builder releasedEvent(PublicationEvent publicationEvent) {
      this.releasedEvent = publicationEvent;
      return this;
    }
    /**
     * Features or modules provided by this application (and possibly required by other applications).
     */
    public Builder featureList(String featureList) {
      this.featureList = featureList;
      return this;
    }
    /**
     * Countries for which the application is supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
     */
    public Builder countriesSupported(String countriesSupported) {
      this.countriesSupported = countriesSupported;
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    public Builder contributor(Organization organization) {
      this.contributor.setOrganization(organization);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    public Builder contributor(Person person) {
      this.contributor.setPerson(person);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    public Builder creator(Organization organization) {
      this.creator.setOrganization(organization);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    public Builder creator(Person person) {
      this.creator.setPerson(person);
      return this;
    }
    private String accessibilityAPI;
    private AggregateRating aggregateRating;
    private String availableOnDevice;
    private HasPart hasPart;
    private Review review;
    private String installUrl;
    private java.util.Date datePublished;
    private Comment comment;
    private String schemaVersion;
    private VideoObject video;
    private String award;
    private String releaseNotes;
    private Person editor;
    private String storageRequirements;
    private CreativeWork workExample;
    private String applicationCategory;
    private Action potentialAction;
    private OrganizationOrPerson producer;
    private ImageObjectOrString screenshot;
    private String countriesNotSupported;
    private Organization publisher;
    private Organization sourceOrganization;
    private String learningResourceType;
    private String genre;
    private OrganizationOrPerson translator;
    private String publishingPrinciples;
    private Event recordedAt;
    private Integer commentCount;
    private LanguageOrString inLanguage;
    private java.util.Date dateModified;
    private String softwareVersion;
    private String fileFormat;
    private Thing mentions;
    private Audience audience;
    private String headline;
    private String url;
    private String interactivityType;
    private Integer fileSize;
    private MediaObject associatedMedia;
    private Person character;
    private String contentRating;
    private String description;
    private String permissions;
    private Offer offers;
    private String downloadUrl;
    private OrganizationOrPerson copyrightHolder;
    private String accessibilityControl;
    private StringOrCreativeWork citation;
    private String educationalUse;
    private String keywords;
    private AlignmentObject educationalAlignment;
    private String text;
    private Thing about;
    private String applicationSubCategory;
    private Place contentLocation;
    private String accessibilityHazard;
    private OrganizationOrPerson author;
    private Number version;
    private Person accountablePerson;
    private String sameAs;
    private String additionalType;
    private String softwareRequirements;
    private String thumbnailUrl;
    private PublicationEvent publication;
    private MediaObject encoding;
    private Duration timeRequired;
    private String operatingSystem;
    private String accessibilityFeature;
    private SoftwareApplication softwareAddOn;
    private AudioObject audio;
    private String typicalAgeRange;
    private java.util.Date dateCreated;
    private OrganizationOrPerson provider;
    private String processorRequirements;
    private String alternativeHeadline;
    private Thing mainEntity;
    private CreativeWork softwareHelp;
    private String name;
    private StringOrCreativeWork license;
    private String applicationSuite;
    private Number copyrightYear;
    private String discussionUrl;
    private StringOrCreativeWork mainEntityOfPage;
    private String memoryRequirements;
    private String isBasedOnUrl;
    private Boolean isFamilyFriendly;
    private CreativeWork exampleOfWork;
    private String alternateName;
    private PublicationEvent releasedEvent;
    private String featureList;
    private String countriesSupported;
    private OrganizationOrPerson contributor;
    private OrganizationOrPerson creator;
  }

  protected SoftwareApplication(String accessibilityAPI, AggregateRating aggregateRating, String availableOnDevice, HasPart hasPart, Review review, String installUrl, java.util.Date datePublished, Comment comment, String schemaVersion, VideoObject video, String award, String releaseNotes, Person editor, String storageRequirements, CreativeWork workExample, String applicationCategory, Action potentialAction, OrganizationOrPerson producer, ImageObjectOrString screenshot, String countriesNotSupported, Organization publisher, Organization sourceOrganization, String learningResourceType, String genre, OrganizationOrPerson translator, String publishingPrinciples, Event recordedAt, Integer commentCount, LanguageOrString inLanguage, java.util.Date dateModified, String softwareVersion, String fileFormat, Thing mentions, Audience audience, String headline, String url, String interactivityType, Integer fileSize, MediaObject associatedMedia, Person character, String contentRating, String description, String permissions, Offer offers, String downloadUrl, OrganizationOrPerson copyrightHolder, String accessibilityControl, StringOrCreativeWork citation, String educationalUse, String keywords, AlignmentObject educationalAlignment, String text, Thing about, String applicationSubCategory, Place contentLocation, String accessibilityHazard, OrganizationOrPerson author, Number version, Person accountablePerson, String sameAs, String additionalType, String softwareRequirements, String thumbnailUrl, PublicationEvent publication, MediaObject encoding, Duration timeRequired, String operatingSystem, String accessibilityFeature, SoftwareApplication softwareAddOn, AudioObject audio, String typicalAgeRange, java.util.Date dateCreated, OrganizationOrPerson provider, String processorRequirements, String alternativeHeadline, Thing mainEntity, CreativeWork softwareHelp, String name, StringOrCreativeWork license, String applicationSuite, Number copyrightYear, String discussionUrl, StringOrCreativeWork mainEntityOfPage, String memoryRequirements, String isBasedOnUrl, Boolean isFamilyFriendly, CreativeWork exampleOfWork, String alternateName, PublicationEvent releasedEvent, String featureList, String countriesSupported, OrganizationOrPerson contributor, OrganizationOrPerson creator) {
    super(accessibilityAPI, aggregateRating, hasPart, review, datePublished, comment, schemaVersion, video, award, editor, workExample, potentialAction, producer, publisher, sourceOrganization, learningResourceType, genre, translator, publishingPrinciples, recordedAt, commentCount, inLanguage, dateModified, mentions, audience, url, headline, interactivityType, character, associatedMedia, contentRating, description, offers, copyrightHolder, accessibilityControl, citation, educationalUse, keywords, educationalAlignment, text, about, contentLocation, author, accessibilityHazard, version, accountablePerson, additionalType, sameAs, thumbnailUrl, publication, encoding, timeRequired, accessibilityFeature, audio, typicalAgeRange, dateCreated, provider, mainEntity, alternativeHeadline, name, license, mainEntityOfPage, discussionUrl, copyrightYear, isBasedOnUrl, isFamilyFriendly, exampleOfWork, alternateName, releasedEvent, creator, contributor);
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
  private ImageObjectOrString myScreenshot;
  private String mySoftwareVersion;
  private String myStorageRequirements;
  private SoftwareApplication mySoftwareAddOn;
  private CreativeWork mySoftwareHelp;
}
