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
 * A short segment/part of a video game.
 */
public class VideoGameClip extends Clip {
  /**
   * Builder for {@link VideoGameClip}
   */
  public static final class Builder {
    /**
     * Creates new {@link VideoGameClip} instance.
     */
    public VideoGameClip build() {
      return new VideoGameClip(accessibilityAPI, aggregateRating, hasPart, review, datePublished, schemaVersion, comment, video, award, editor, workExample, director, potentialAction, producer, publisher, partOfSeries, sourceOrganization, learningResourceType, genre, publishingPrinciples, translator, recordedAt, inLanguage, commentCount, dateModified, mentions, audience, url, headline, interactivityType, character, associatedMedia, contentRating, description, offers, copyrightHolder, accessibilityControl, citation, educationalUse, keywords, educationalAlignment, text, about, contentLocation, musicBy, accessibilityHazard, author, version, accountablePerson, additionalType, sameAs, thumbnailUrl, publication, actor, encoding, timeRequired, accessibilityFeature, audio, typicalAgeRange, dateCreated, provider, mainEntity, alternativeHeadline, name, license, mainEntityOfPage, discussionUrl, copyrightYear, isBasedOnUrl, isFamilyFriendly, exampleOfWork, clipNumber, alternateName, releasedEvent, partOfSeason, partOfEpisode, creator, contributor);
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
     * Date of first broadcast/publication.
     */
    public Builder datePublished(java.util.Date date) {
      this.datePublished = date;
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
     * Comments, typically from users.
     */
    public Builder comment(Comment comment) {
      this.comment = comment;
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
     * Specifies the Person who edited the CreativeWork.
     */
    public Builder editor(Person person) {
      this.editor = person;
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
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     */
    public Builder director(Person person) {
      this.director = person;
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
     * The publisher of the creative work.
     */
    public Builder publisher(Organization organization) {
      this.publisher = organization;
      return this;
    }
    /**
     * The series to which this episode or season belongs.
     */
    public Builder partOfSeries(IsPartOf isPartOf) {
      this.partOfSeries = isPartOf;
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
     * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
     */
    public Builder publishingPrinciples(String publishingPrinciples) {
      this.publishingPrinciples = publishingPrinciples;
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
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    public Builder recordedAt(Event event) {
      this.recordedAt = event;
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
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    public Builder commentCount(Integer integer) {
      this.commentCount = integer;
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
     * URL of the item.
     */
    public Builder url(String url) {
      this.url = url;
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
     * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
     */
    public Builder interactivityType(String interactivityType) {
      this.interactivityType = interactivityType;
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
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    public Builder associatedMedia(MediaObject mediaObject) {
      this.associatedMedia = mediaObject;
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
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer offer) {
      this.offers = offer;
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
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    public Builder contentLocation(Place place) {
      this.contentLocation = place;
      return this;
    }
    /**
     * The composer of the soundtrack.
     */
    public Builder musicBy(MusicGroup musicGroup) {
      this.musicBy.setMusicGroup(musicGroup);
      return this;
    }
    /**
     * The composer of the soundtrack.
     */
    public Builder musicBy(Person person) {
      this.musicBy.setPerson(person);
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     */
    public Builder actor(Person person) {
      this.actor = person;
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
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityFeature(String accessibilityFeature) {
      this.accessibilityFeature = accessibilityFeature;
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
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    public Builder mainEntity(Thing thing) {
      this.mainEntity = thing;
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
     * A link to the page containing the comments of the CreativeWork.
     */
    public Builder discussionUrl(String discussionUrl) {
      this.discussionUrl = discussionUrl;
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
     * Position of the clip within an ordered group of clips.
     */
    public Builder clipNumber(Position position) {
      this.clipNumber = position;
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
     * The season to which this episode belongs.
     */
    public Builder partOfSeason(IsPartOf isPartOf) {
      this.partOfSeason = isPartOf;
      return this;
    }
    /**
     * The episode to which this clip belongs.
     */
    public Builder partOfEpisode(IsPartOf isPartOf) {
      this.partOfEpisode = isPartOf;
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
    private String accessibilityAPI;
    private AggregateRating aggregateRating;
    private HasPart hasPart;
    private Review review;
    private java.util.Date datePublished;
    private String schemaVersion;
    private Comment comment;
    private VideoObject video;
    private String award;
    private Person editor;
    private CreativeWork workExample;
    private Person director;
    private Action potentialAction;
    private OrganizationOrPerson producer;
    private Organization publisher;
    private IsPartOf partOfSeries;
    private Organization sourceOrganization;
    private String learningResourceType;
    private String genre;
    private String publishingPrinciples;
    private OrganizationOrPerson translator;
    private Event recordedAt;
    private LanguageOrString inLanguage;
    private Integer commentCount;
    private java.util.Date dateModified;
    private Thing mentions;
    private Audience audience;
    private String url;
    private String headline;
    private String interactivityType;
    private Person character;
    private MediaObject associatedMedia;
    private String contentRating;
    private String description;
    private Offer offers;
    private OrganizationOrPerson copyrightHolder;
    private String accessibilityControl;
    private StringOrCreativeWork citation;
    private String educationalUse;
    private String keywords;
    private AlignmentObject educationalAlignment;
    private String text;
    private Thing about;
    private Place contentLocation;
    private MusicGroupOrPerson musicBy;
    private String accessibilityHazard;
    private OrganizationOrPerson author;
    private Number version;
    private Person accountablePerson;
    private String additionalType;
    private String sameAs;
    private String thumbnailUrl;
    private PublicationEvent publication;
    private Person actor;
    private MediaObject encoding;
    private Duration timeRequired;
    private String accessibilityFeature;
    private AudioObject audio;
    private String typicalAgeRange;
    private java.util.Date dateCreated;
    private OrganizationOrPerson provider;
    private Thing mainEntity;
    private String alternativeHeadline;
    private String name;
    private StringOrCreativeWork license;
    private StringOrCreativeWork mainEntityOfPage;
    private String discussionUrl;
    private Number copyrightYear;
    private String isBasedOnUrl;
    private Boolean isFamilyFriendly;
    private CreativeWork exampleOfWork;
    private Position clipNumber;
    private String alternateName;
    private PublicationEvent releasedEvent;
    private IsPartOf partOfSeason;
    private IsPartOf partOfEpisode;
    private OrganizationOrPerson creator;
    private OrganizationOrPerson contributor;
  }

  protected VideoGameClip(String accessibilityAPI, AggregateRating aggregateRating, HasPart hasPart, Review review, java.util.Date datePublished, String schemaVersion, Comment comment, VideoObject video, String award, Person editor, CreativeWork workExample, Person director, Action potentialAction, OrganizationOrPerson producer, Organization publisher, IsPartOf partOfSeries, Organization sourceOrganization, String learningResourceType, String genre, String publishingPrinciples, OrganizationOrPerson translator, Event recordedAt, LanguageOrString inLanguage, Integer commentCount, java.util.Date dateModified, Thing mentions, Audience audience, String url, String headline, String interactivityType, Person character, MediaObject associatedMedia, String contentRating, String description, Offer offers, OrganizationOrPerson copyrightHolder, String accessibilityControl, StringOrCreativeWork citation, String educationalUse, String keywords, AlignmentObject educationalAlignment, String text, Thing about, Place contentLocation, MusicGroupOrPerson musicBy, String accessibilityHazard, OrganizationOrPerson author, Number version, Person accountablePerson, String additionalType, String sameAs, String thumbnailUrl, PublicationEvent publication, Person actor, MediaObject encoding, Duration timeRequired, String accessibilityFeature, AudioObject audio, String typicalAgeRange, java.util.Date dateCreated, OrganizationOrPerson provider, Thing mainEntity, String alternativeHeadline, String name, StringOrCreativeWork license, StringOrCreativeWork mainEntityOfPage, String discussionUrl, Number copyrightYear, String isBasedOnUrl, Boolean isFamilyFriendly, CreativeWork exampleOfWork, Position clipNumber, String alternateName, PublicationEvent releasedEvent, IsPartOf partOfSeason, IsPartOf partOfEpisode, OrganizationOrPerson creator, OrganizationOrPerson contributor) {
    super(accessibilityAPI, aggregateRating, hasPart, review, datePublished, schemaVersion, comment, video, award, editor, workExample, director, potentialAction, producer, publisher, sourceOrganization, partOfSeries, genre, learningResourceType, translator, publishingPrinciples, recordedAt, commentCount, inLanguage, dateModified, mentions, audience, url, headline, interactivityType, character, associatedMedia, contentRating, description, offers, copyrightHolder, accessibilityControl, citation, educationalUse, keywords, educationalAlignment, text, about, contentLocation, musicBy, accessibilityHazard, author, version, accountablePerson, sameAs, additionalType, thumbnailUrl, publication, actor, encoding, timeRequired, accessibilityFeature, audio, typicalAgeRange, dateCreated, provider, alternativeHeadline, mainEntity, name, license, copyrightYear, discussionUrl, mainEntityOfPage, isBasedOnUrl, isFamilyFriendly, exampleOfWork, alternateName, clipNumber, releasedEvent, partOfEpisode, partOfSeason, contributor, creator);
  }
}
