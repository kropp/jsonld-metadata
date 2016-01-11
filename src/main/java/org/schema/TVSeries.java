/*
 * Copyright 2015-2016 JetBrains s.r.o.
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
 */

package org.schema;

/**
 * CreativeWorkSeries dedicated to TV broadcast and associated online delivery.
 */
public class TVSeries extends CreativeWorkSeries {
  /**
   * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
   */
  public Person getActor() {
    return myActor;
  }
  /**
   * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
   */
  public Person getDirector() {
    return myDirector;
  }
  /**
   * An episode of a tv, radio or game media within a series or season.
   */
  public HasPart getEpisode() {
    return myEpisode;
  }
  /**
   * The composer of the soundtrack.
   */
  public MusicGroupOrPerson getMusicBy() {
    return myMusicBy;
  }
  /**
   * The number of episodes in this season or series.
   */
  public Integer getNumberOfEpisodes() {
    return myNumberOfEpisodes;
  }
  /**
   * The number of seasons in this series.
   */
  public Integer getNumberOfSeasons() {
    return myNumberOfSeasons;
  }
  /**
   * The production company or studio responsible for the item e.g. series, video game, episode etc.
   */
  public Organization getProductionCompany() {
    return myProductionCompany;
  }
  /**
   * A season that is part of the media series.
   */
  public HasPart getContainsSeason() {
    return myContainsSeason;
  }
  /**
   * The trailer of a movie or tv/radio series, season, episode, etc.
   */
  public VideoObject getTrailer() {
    return myTrailer;
  }
  /**
   * Builder for {@link TVSeries}
   */
  public static final class TVSeriesThingBuilder implements Builder {
    /**
     * Creates new {@link TVSeries} instance.
     */
    public TVSeries build() {
      return new TVSeries(actor, director, episode, musicBy, numberOfEpisodes, numberOfSeasons, productionCompany, containsSeason, trailer, endDate, startDate, schemaVersion, about, accessibilityAPI, accessibilityControl, accessibilityFeature, accessibilityHazard, accountablePerson, aggregateRating, alternativeHeadline, associatedMedia, audience, audio, author, award, citation, comment, contentLocation, contentRating, contributor, copyrightHolder, copyrightYear, creator, dateCreated, dateModified, datePublished, discussionUrl, editor, educationalAlignment, educationalUse, encoding, genre, headline, inLanguage, interactivityType, isBasedOnUrl, isFamilyFriendly, keywords, license, learningResourceType, mainEntity, mentions, offers, producer, publication, publisher, publishingPrinciples, recordedAt, review, sourceOrganization, text, thumbnailUrl, timeRequired, typicalAgeRange, version, video, provider, commentCount, hasPart, workExample, exampleOfWork, character, translator, releasedEvent, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     */
    public Builder actor(Person person) {
      this.actor = person;
      return this;
    }
    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     */
    public Builder actor(Person.Builder person) {
      return this.actor(person.build());
    }
    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     */
    public Builder director(Person person) {
      this.director = person;
      return this;
    }
    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     */
    public Builder director(Person.Builder person) {
      return this.director(person.build());
    }
    /**
     * An episode of a tv, radio or game media within a series or season.
     */
    public Builder episode(HasPart hasPart) {
      this.episode = hasPart;
      return this;
    }
    /**
     * The composer of the soundtrack.
     */
    public Builder musicBy(MusicGroup musicGroup) {
      if (this.musicBy == null) this.musicBy = new MusicGroupOrPerson();
      this.musicBy.setMusicGroup(musicGroup);
      return this;
    }
    /**
     * The composer of the soundtrack.
     */
    public Builder musicBy(MusicGroup.Builder musicGroup) {
      return this.musicBy(musicGroup.build());
    }
    /**
     * The composer of the soundtrack.
     */
    public Builder musicBy(Person person) {
      if (this.musicBy == null) this.musicBy = new MusicGroupOrPerson();
      this.musicBy.setPerson(person);
      return this;
    }
    /**
     * The composer of the soundtrack.
     */
    public Builder musicBy(Person.Builder person) {
      return this.musicBy(person.build());
    }
    /**
     * The number of episodes in this season or series.
     */
    public Builder numberOfEpisodes(Integer integer) {
      this.numberOfEpisodes = integer;
      return this;
    }
    /**
     * The number of seasons in this series.
     */
    public Builder numberOfSeasons(Integer integer) {
      this.numberOfSeasons = integer;
      return this;
    }
    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     */
    public Builder productionCompany(Organization organization) {
      this.productionCompany = organization;
      return this;
    }
    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     */
    public Builder productionCompany(Organization.Builder organization) {
      return this.productionCompany(organization.build());
    }
    /**
     * A season that is part of the media series.
     */
    public Builder containsSeason(HasPart hasPart) {
      this.containsSeason = hasPart;
      return this;
    }
    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     */
    public Builder trailer(VideoObject videoObject) {
      this.trailer = videoObject;
      return this;
    }
    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     */
    public Builder trailer(VideoObject.Builder videoObject) {
      return this.trailer(videoObject.build());
    }
    /**
     * The end date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    public Builder endDate(java.util.Date date) {
      this.endDate = date;
      return this;
    }
    /**
     * The start date and time of the item (in <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 date format</a>).
     */
    public Builder startDate(java.util.Date date) {
      this.startDate = date;
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
     * The subject matter of the content.
     */
    public Builder about(Thing thing) {
      this.about = thing;
      return this;
    }
    /**
     * The subject matter of the content.
     */
    public Builder about(Thing.Builder thing) {
      return this.about(thing.build());
    }
    /**
     * Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityAPI(String accessibilityAPI) {
      this.accessibilityAPI = accessibilityAPI;
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
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    public Builder accessibilityFeature(String accessibilityFeature) {
      this.accessibilityFeature = accessibilityFeature;
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
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    public Builder accountablePerson(Person person) {
      this.accountablePerson = person;
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    public Builder accountablePerson(Person.Builder person) {
      return this.accountablePerson(person.build());
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating.Builder aggregateRating) {
      return this.aggregateRating(aggregateRating.build());
    }
    /**
     * A secondary title of the CreativeWork.
     */
    public Builder alternativeHeadline(String alternativeHeadline) {
      this.alternativeHeadline = alternativeHeadline;
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
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    public Builder associatedMedia(MediaObject.Builder mediaObject) {
      return this.associatedMedia(mediaObject.build());
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience audience) {
      this.audience = audience;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    public Builder audience(Audience.Builder audience) {
      return this.audience(audience.build());
    }
    /**
     * An embedded audio object.
     */
    public Builder audio(AudioObject audioObject) {
      this.audio = audioObject;
      return this;
    }
    /**
     * An embedded audio object.
     */
    public Builder audio(AudioObject.Builder audioObject) {
      return this.audio(audioObject.build());
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    public Builder author(Organization organization) {
      if (this.author == null) this.author = new OrganizationOrPerson();
      this.author.setOrganization(organization);
      return this;
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    public Builder author(Organization.Builder organization) {
      return this.author(organization.build());
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    public Builder author(Person person) {
      if (this.author == null) this.author = new OrganizationOrPerson();
      this.author.setPerson(person);
      return this;
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    public Builder author(Person.Builder person) {
      return this.author(person.build());
    }
    /**
     * An award won by or for this item.
     */
    public Builder award(String award) {
      this.award = award;
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    public Builder citation(CreativeWork creativeWork) {
      if (this.citation == null) this.citation = new CreativeWorkOrString();
      this.citation.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    public Builder citation(CreativeWork.Builder creativeWork) {
      return this.citation(creativeWork.build());
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    public Builder citation(String citation) {
      if (this.citation == null) this.citation = new CreativeWorkOrString();
      this.citation.setString(citation);
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
     * Comments, typically from users.
     */
    public Builder comment(Comment.Builder comment) {
      return this.comment(comment.build());
    }
    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    public Builder contentLocation(Place place) {
      this.contentLocation = place;
      return this;
    }
    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    public Builder contentLocation(Place.Builder place) {
      return this.contentLocation(place.build());
    }
    /**
     * Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
     */
    public Builder contentRating(String contentRating) {
      this.contentRating = contentRating;
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    public Builder contributor(Organization organization) {
      if (this.contributor == null) this.contributor = new OrganizationOrPerson();
      this.contributor.setOrganization(organization);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    public Builder contributor(Organization.Builder organization) {
      return this.contributor(organization.build());
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    public Builder contributor(Person person) {
      if (this.contributor == null) this.contributor = new OrganizationOrPerson();
      this.contributor.setPerson(person);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    public Builder contributor(Person.Builder person) {
      return this.contributor(person.build());
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    public Builder copyrightHolder(Organization organization) {
      if (this.copyrightHolder == null) this.copyrightHolder = new OrganizationOrPerson();
      this.copyrightHolder.setOrganization(organization);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    public Builder copyrightHolder(Organization.Builder organization) {
      return this.copyrightHolder(organization.build());
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    public Builder copyrightHolder(Person person) {
      if (this.copyrightHolder == null) this.copyrightHolder = new OrganizationOrPerson();
      this.copyrightHolder.setPerson(person);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    public Builder copyrightHolder(Person.Builder person) {
      return this.copyrightHolder(person.build());
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    public Builder copyrightYear(Integer integer) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setInteger(integer);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    public Builder copyrightYear(Long copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setLong(copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    public Builder copyrightYear(Float copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setFloat(copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    public Builder copyrightYear(Double copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setDouble(copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    public Builder copyrightYear(String copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setString(copyrightYear);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    public Builder creator(Organization organization) {
      if (this.creator == null) this.creator = new OrganizationOrPerson();
      this.creator.setOrganization(organization);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    public Builder creator(Organization.Builder organization) {
      return this.creator(organization.build());
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    public Builder creator(Person person) {
      if (this.creator == null) this.creator = new OrganizationOrPerson();
      this.creator.setPerson(person);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    public Builder creator(Person.Builder person) {
      return this.creator(person.build());
    }
    /**
     * The date on which the CreativeWork was created.
     */
    public Builder dateCreated(java.util.Date date) {
      this.dateCreated = date;
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
     * Date of first broadcast/publication.
     */
    public Builder datePublished(java.util.Date date) {
      this.datePublished = date;
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
     * Specifies the Person who edited the CreativeWork.
     */
    public Builder editor(Person person) {
      this.editor = person;
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     */
    public Builder editor(Person.Builder person) {
      return this.editor(person.build());
    }
    /**
     * An alignment to an established educational framework.
     */
    public Builder educationalAlignment(AlignmentObject alignmentObject) {
      this.educationalAlignment = alignmentObject;
      return this;
    }
    /**
     * An alignment to an established educational framework.
     */
    public Builder educationalAlignment(AlignmentObject.Builder alignmentObject) {
      return this.educationalAlignment(alignmentObject.build());
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    public Builder educationalUse(String educationalUse) {
      this.educationalUse = educationalUse;
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
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    public Builder encoding(MediaObject.Builder mediaObject) {
      return this.encoding(mediaObject.build());
    }
    /**
     * Genre of the creative work or group.
     */
    public Builder genre(String genre) {
      this.genre = genre;
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
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    public Builder inLanguage(Language language) {
      if (this.inLanguage == null) this.inLanguage = new LanguageOrString();
      this.inLanguage.setLanguage(language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    public Builder inLanguage(Language.Builder language) {
      return this.inLanguage(language.build());
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    public Builder inLanguage(String inLanguage) {
      if (this.inLanguage == null) this.inLanguage = new LanguageOrString();
      this.inLanguage.setString(inLanguage);
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
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    public Builder keywords(String keywords) {
      this.keywords = keywords;
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    public Builder license(CreativeWork creativeWork) {
      if (this.license == null) this.license = new CreativeWorkOrString();
      this.license.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    public Builder license(CreativeWork.Builder creativeWork) {
      return this.license(creativeWork.build());
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    public Builder license(String license) {
      if (this.license == null) this.license = new CreativeWorkOrString();
      this.license.setString(license);
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
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    public Builder mainEntity(Thing thing) {
      this.mainEntity = thing;
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    public Builder mainEntity(Thing.Builder thing) {
      return this.mainEntity(thing.build());
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    public Builder mentions(Thing thing) {
      this.mentions = thing;
      return this;
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    public Builder mentions(Thing.Builder thing) {
      return this.mentions(thing.build());
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer offer) {
      this.offers = offer;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    public Builder offers(Offer.Builder offer) {
      return this.offers(offer.build());
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    public Builder producer(Organization organization) {
      if (this.producer == null) this.producer = new OrganizationOrPerson();
      this.producer.setOrganization(organization);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    public Builder producer(Organization.Builder organization) {
      return this.producer(organization.build());
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    public Builder producer(Person person) {
      if (this.producer == null) this.producer = new OrganizationOrPerson();
      this.producer.setPerson(person);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    public Builder producer(Person.Builder person) {
      return this.producer(person.build());
    }
    /**
     * A publication event associated with the item.
     */
    public Builder publication(PublicationEvent publicationEvent) {
      this.publication = publicationEvent;
      return this;
    }
    /**
     * A publication event associated with the item.
     */
    public Builder publication(PublicationEvent.Builder publicationEvent) {
      return this.publication(publicationEvent.build());
    }
    /**
     * The publisher of the creative work.
     */
    public Builder publisher(Organization organization) {
      this.publisher = organization;
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    public Builder publisher(Organization.Builder organization) {
      return this.publisher(organization.build());
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
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    public Builder recordedAt(Event.Builder event) {
      return this.recordedAt(event.build());
    }
    /**
     * A review of the item.
     */
    public Builder review(Review review) {
      this.review = review;
      return this;
    }
    /**
     * A review of the item.
     */
    public Builder review(Review.Builder review) {
      return this.review(review.build());
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    public Builder sourceOrganization(Organization organization) {
      this.sourceOrganization = organization;
      return this;
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    public Builder sourceOrganization(Organization.Builder organization) {
      return this.sourceOrganization(organization.build());
    }
    /**
     * The textual content of this CreativeWork.
     */
    public Builder text(String text) {
      this.text = text;
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
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
     */
    public Builder timeRequired(Duration duration) {
      this.timeRequired = duration;
      return this;
    }
    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
     */
    public Builder timeRequired(Duration.Builder duration) {
      return this.timeRequired(duration.build());
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    public Builder typicalAgeRange(String typicalAgeRange) {
      this.typicalAgeRange = typicalAgeRange;
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    public Builder version(Integer integer) {
      if (this.version == null) this.version = new Number();
      this.version.setInteger(integer);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    public Builder version(Long version) {
      if (this.version == null) this.version = new Number();
      this.version.setLong(version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    public Builder version(Float version) {
      if (this.version == null) this.version = new Number();
      this.version.setFloat(version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    public Builder version(Double version) {
      if (this.version == null) this.version = new Number();
      this.version.setDouble(version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    public Builder version(String version) {
      if (this.version == null) this.version = new Number();
      this.version.setString(version);
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
     * An embedded video object.
     */
    public Builder video(VideoObject.Builder videoObject) {
      return this.video(videoObject.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization organization) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization.Builder organization) {
      return this.provider(organization.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person person) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setPerson(person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person.Builder person) {
      return this.provider(person.build());
    }
    /**
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    public Builder commentCount(Integer integer) {
      this.commentCount = integer;
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
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    public Builder workExample(CreativeWork creativeWork) {
      this.workExample = creativeWork;
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    public Builder workExample(CreativeWork.Builder creativeWork) {
      return this.workExample(creativeWork.build());
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    public Builder exampleOfWork(CreativeWork creativeWork) {
      this.exampleOfWork = creativeWork;
      return this;
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    public Builder exampleOfWork(CreativeWork.Builder creativeWork) {
      return this.exampleOfWork(creativeWork.build());
    }
    /**
     * Fictional person connected with a creative work.
     */
    public Builder character(Person person) {
      this.character = person;
      return this;
    }
    /**
     * Fictional person connected with a creative work.
     */
    public Builder character(Person.Builder person) {
      return this.character(person.build());
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    public Builder translator(Organization organization) {
      if (this.translator == null) this.translator = new OrganizationOrPerson();
      this.translator.setOrganization(organization);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    public Builder translator(Organization.Builder organization) {
      return this.translator(organization.build());
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    public Builder translator(Person person) {
      if (this.translator == null) this.translator = new OrganizationOrPerson();
      this.translator.setPerson(person);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    public Builder translator(Person.Builder person) {
      return this.translator(person.build());
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    public Builder releasedEvent(PublicationEvent publicationEvent) {
      this.releasedEvent = publicationEvent;
      return this;
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    public Builder releasedEvent(PublicationEvent.Builder publicationEvent) {
      return this.releasedEvent(publicationEvent.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
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
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
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
    public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
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
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private Person actor;
    private Person director;
    private HasPart episode;
    private MusicGroupOrPerson musicBy;
    private Integer numberOfEpisodes;
    private Integer numberOfSeasons;
    private Organization productionCompany;
    private HasPart containsSeason;
    private VideoObject trailer;
    private java.util.Date endDate;
    private java.util.Date startDate;
    private String schemaVersion;
    private Thing about;
    private String accessibilityAPI;
    private String accessibilityControl;
    private String accessibilityFeature;
    private String accessibilityHazard;
    private Person accountablePerson;
    private AggregateRating aggregateRating;
    private String alternativeHeadline;
    private MediaObject associatedMedia;
    private Audience audience;
    private AudioObject audio;
    private OrganizationOrPerson author;
    private String award;
    private CreativeWorkOrString citation;
    private Comment comment;
    private Place contentLocation;
    private String contentRating;
    private OrganizationOrPerson contributor;
    private OrganizationOrPerson copyrightHolder;
    private Number copyrightYear;
    private OrganizationOrPerson creator;
    private java.util.Date dateCreated;
    private java.util.Date dateModified;
    private java.util.Date datePublished;
    private String discussionUrl;
    private Person editor;
    private AlignmentObject educationalAlignment;
    private String educationalUse;
    private MediaObject encoding;
    private String genre;
    private String headline;
    private LanguageOrString inLanguage;
    private String interactivityType;
    private String isBasedOnUrl;
    private Boolean isFamilyFriendly;
    private String keywords;
    private CreativeWorkOrString license;
    private String learningResourceType;
    private Thing mainEntity;
    private Thing mentions;
    private Offer offers;
    private OrganizationOrPerson producer;
    private PublicationEvent publication;
    private Organization publisher;
    private String publishingPrinciples;
    private Event recordedAt;
    private Review review;
    private Organization sourceOrganization;
    private String text;
    private String thumbnailUrl;
    private Duration timeRequired;
    private String typicalAgeRange;
    private Number version;
    private VideoObject video;
    private OrganizationOrPerson provider;
    private Integer commentCount;
    private HasPart hasPart;
    private CreativeWork workExample;
    private CreativeWork exampleOfWork;
    private Person character;
    private OrganizationOrPerson translator;
    private PublicationEvent releasedEvent;
    private String additionalType;
    private String alternateName;
    private String description;
    private CreativeWorkOrString mainEntityOfPage;
    private String name;
    private String sameAs;
    private String url;
    private Action potentialAction;
    private String id;
  }
  public interface Builder extends ThingBuilder<TVSeries> {
  Builder actor(Person person);
  Builder actor(Person.Builder person);
  Builder director(Person person);
  Builder director(Person.Builder person);
  Builder episode(HasPart hasPart);
  Builder musicBy(MusicGroup musicGroup);
  Builder musicBy(MusicGroup.Builder musicGroup);
  Builder musicBy(Person person);
  Builder musicBy(Person.Builder person);
  Builder numberOfEpisodes(Integer integer);
  Builder numberOfSeasons(Integer integer);
  Builder productionCompany(Organization organization);
  Builder productionCompany(Organization.Builder organization);
  Builder containsSeason(HasPart hasPart);
  Builder trailer(VideoObject videoObject);
  Builder trailer(VideoObject.Builder videoObject);
  Builder endDate(java.util.Date date);
  Builder startDate(java.util.Date date);
  Builder schemaVersion(String schemaVersion);
  Builder about(Thing thing);
  Builder about(Thing.Builder thing);
  Builder accessibilityAPI(String accessibilityAPI);
  Builder accessibilityControl(String accessibilityControl);
  Builder accessibilityFeature(String accessibilityFeature);
  Builder accessibilityHazard(String accessibilityHazard);
  Builder accountablePerson(Person person);
  Builder accountablePerson(Person.Builder person);
  Builder aggregateRating(AggregateRating aggregateRating);
  Builder aggregateRating(AggregateRating.Builder aggregateRating);
  Builder alternativeHeadline(String alternativeHeadline);
  Builder associatedMedia(MediaObject mediaObject);
  Builder associatedMedia(MediaObject.Builder mediaObject);
  Builder audience(Audience audience);
  Builder audience(Audience.Builder audience);
  Builder audio(AudioObject audioObject);
  Builder audio(AudioObject.Builder audioObject);
  Builder author(Organization organization);
  Builder author(Organization.Builder organization);
  Builder author(Person person);
  Builder author(Person.Builder person);
  Builder award(String award);
  Builder citation(CreativeWork creativeWork);
  Builder citation(CreativeWork.Builder creativeWork);
  Builder citation(String citation);
  Builder comment(Comment comment);
  Builder comment(Comment.Builder comment);
  Builder contentLocation(Place place);
  Builder contentLocation(Place.Builder place);
  Builder contentRating(String contentRating);
  Builder contributor(Organization organization);
  Builder contributor(Organization.Builder organization);
  Builder contributor(Person person);
  Builder contributor(Person.Builder person);
  Builder copyrightHolder(Organization organization);
  Builder copyrightHolder(Organization.Builder organization);
  Builder copyrightHolder(Person person);
  Builder copyrightHolder(Person.Builder person);
  Builder copyrightYear(Integer integer);
  Builder copyrightYear(Long copyrightYear);
  Builder copyrightYear(Float copyrightYear);
  Builder copyrightYear(Double copyrightYear);
  Builder copyrightYear(String copyrightYear);
  Builder creator(Organization organization);
  Builder creator(Organization.Builder organization);
  Builder creator(Person person);
  Builder creator(Person.Builder person);
  Builder dateCreated(java.util.Date date);
  Builder dateModified(java.util.Date date);
  Builder datePublished(java.util.Date date);
  Builder discussionUrl(String discussionUrl);
  Builder editor(Person person);
  Builder editor(Person.Builder person);
  Builder educationalAlignment(AlignmentObject alignmentObject);
  Builder educationalAlignment(AlignmentObject.Builder alignmentObject);
  Builder educationalUse(String educationalUse);
  Builder encoding(MediaObject mediaObject);
  Builder encoding(MediaObject.Builder mediaObject);
  Builder genre(String genre);
  Builder headline(String headline);
  Builder inLanguage(Language language);
  Builder inLanguage(Language.Builder language);
  Builder inLanguage(String inLanguage);
  Builder interactivityType(String interactivityType);
  Builder isBasedOnUrl(String isBasedOnUrl);
  Builder isFamilyFriendly(Boolean isFamilyFriendly);
  Builder keywords(String keywords);
  Builder license(CreativeWork creativeWork);
  Builder license(CreativeWork.Builder creativeWork);
  Builder license(String license);
  Builder learningResourceType(String learningResourceType);
  Builder mainEntity(Thing thing);
  Builder mainEntity(Thing.Builder thing);
  Builder mentions(Thing thing);
  Builder mentions(Thing.Builder thing);
  Builder offers(Offer offer);
  Builder offers(Offer.Builder offer);
  Builder producer(Organization organization);
  Builder producer(Organization.Builder organization);
  Builder producer(Person person);
  Builder producer(Person.Builder person);
  Builder publication(PublicationEvent publicationEvent);
  Builder publication(PublicationEvent.Builder publicationEvent);
  Builder publisher(Organization organization);
  Builder publisher(Organization.Builder organization);
  Builder publishingPrinciples(String publishingPrinciples);
  Builder recordedAt(Event event);
  Builder recordedAt(Event.Builder event);
  Builder review(Review review);
  Builder review(Review.Builder review);
  Builder sourceOrganization(Organization organization);
  Builder sourceOrganization(Organization.Builder organization);
  Builder text(String text);
  Builder thumbnailUrl(String thumbnailUrl);
  Builder timeRequired(Duration duration);
  Builder timeRequired(Duration.Builder duration);
  Builder typicalAgeRange(String typicalAgeRange);
  Builder version(Integer integer);
  Builder version(Long version);
  Builder version(Float version);
  Builder version(Double version);
  Builder version(String version);
  Builder video(VideoObject videoObject);
  Builder video(VideoObject.Builder videoObject);
  Builder provider(Organization organization);
  Builder provider(Organization.Builder organization);
  Builder provider(Person person);
  Builder provider(Person.Builder person);
  Builder commentCount(Integer integer);
  Builder hasPart(HasPart hasPart);
  Builder workExample(CreativeWork creativeWork);
  Builder workExample(CreativeWork.Builder creativeWork);
  Builder exampleOfWork(CreativeWork creativeWork);
  Builder exampleOfWork(CreativeWork.Builder creativeWork);
  Builder character(Person person);
  Builder character(Person.Builder person);
  Builder translator(Organization organization);
  Builder translator(Organization.Builder organization);
  Builder translator(Person person);
  Builder translator(Person.Builder person);
  Builder releasedEvent(PublicationEvent publicationEvent);
  Builder releasedEvent(PublicationEvent.Builder publicationEvent);
  Builder additionalType(String additionalType);
  Builder alternateName(String alternateName);
  Builder description(String description);
  Builder mainEntityOfPage(CreativeWork creativeWork);
  Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
  Builder mainEntityOfPage(String mainEntityOfPage);
  Builder name(String name);
  Builder sameAs(String sameAs);
  Builder url(String url);
  Builder potentialAction(Action action);
  Builder potentialAction(Action.Builder action);
  Builder id(String id);
  }

  protected TVSeries(Person actor, Person director, HasPart episode, MusicGroupOrPerson musicBy, Integer numberOfEpisodes, Integer numberOfSeasons, Organization productionCompany, HasPart containsSeason, VideoObject trailer, java.util.Date endDate, java.util.Date startDate, String schemaVersion, Thing about, String accessibilityAPI, String accessibilityControl, String accessibilityFeature, String accessibilityHazard, Person accountablePerson, AggregateRating aggregateRating, String alternativeHeadline, MediaObject associatedMedia, Audience audience, AudioObject audio, OrganizationOrPerson author, String award, CreativeWorkOrString citation, Comment comment, Place contentLocation, String contentRating, OrganizationOrPerson contributor, OrganizationOrPerson copyrightHolder, Number copyrightYear, OrganizationOrPerson creator, java.util.Date dateCreated, java.util.Date dateModified, java.util.Date datePublished, String discussionUrl, Person editor, AlignmentObject educationalAlignment, String educationalUse, MediaObject encoding, String genre, String headline, LanguageOrString inLanguage, String interactivityType, String isBasedOnUrl, Boolean isFamilyFriendly, String keywords, CreativeWorkOrString license, String learningResourceType, Thing mainEntity, Thing mentions, Offer offers, OrganizationOrPerson producer, PublicationEvent publication, Organization publisher, String publishingPrinciples, Event recordedAt, Review review, Organization sourceOrganization, String text, String thumbnailUrl, Duration timeRequired, String typicalAgeRange, Number version, VideoObject video, OrganizationOrPerson provider, Integer commentCount, HasPart hasPart, CreativeWork workExample, CreativeWork exampleOfWork, Person character, OrganizationOrPerson translator, PublicationEvent releasedEvent, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(endDate, startDate, schemaVersion, about, accessibilityAPI, accessibilityControl, accessibilityFeature, accessibilityHazard, accountablePerson, aggregateRating, alternativeHeadline, associatedMedia, audience, audio, author, award, citation, comment, contentLocation, contentRating, contributor, copyrightHolder, copyrightYear, creator, dateCreated, dateModified, datePublished, discussionUrl, editor, educationalAlignment, educationalUse, encoding, genre, headline, inLanguage, interactivityType, isBasedOnUrl, isFamilyFriendly, keywords, license, learningResourceType, mainEntity, mentions, offers, producer, publication, publisher, publishingPrinciples, recordedAt, review, sourceOrganization, text, thumbnailUrl, timeRequired, typicalAgeRange, version, video, provider, commentCount, hasPart, workExample, exampleOfWork, character, translator, releasedEvent, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myActor = actor;
    myDirector = director;
    myEpisode = episode;
    myMusicBy = musicBy;
    myNumberOfEpisodes = numberOfEpisodes;
    myNumberOfSeasons = numberOfSeasons;
    myProductionCompany = productionCompany;
    myContainsSeason = containsSeason;
    myTrailer = trailer;
  }
  private Person myActor;
  private Person myDirector;
  private HasPart myEpisode;
  private MusicGroupOrPerson myMusicBy;
  private Integer myNumberOfEpisodes;
  private Integer myNumberOfSeasons;
  private Organization myProductionCompany;
  private HasPart myContainsSeason;
  private VideoObject myTrailer;
}
