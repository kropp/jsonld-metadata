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

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.*;

/**
 * A painting.
 */
public class Painting extends CreativeWork {
  /**
   * Builder for {@link Painting}
   */
  static final class PaintingThingBuilder implements Builder {
    /**
     * Creates new {@link Painting} instance.
     */
    public Painting build() {
      return new Painting(schemaVersion, about, accessibilityAPI, accessibilityControl, accessibilityFeature, accessibilityHazard, accountablePerson, aggregateRating, alternativeHeadline, associatedMedia, audience, audio, author, award, citation, comment, contentLocation, contentRating, contributor, copyrightHolder, copyrightYear, creator, dateCreated, dateModified, datePublished, discussionUrl, editor, educationalAlignment, educationalUse, encoding, genre, headline, inLanguage, interactivityType, isBasedOnUrl, isFamilyFriendly, keywords, license, learningResourceType, mainEntity, mentions, offers, producer, publication, publisher, publishingPrinciples, recordedAt, review, sourceOrganization, text, thumbnailUrl, timeRequired, typicalAgeRange, version, video, provider, commentCount, hasPart, workExample, exampleOfWork, character, translator, releasedEvent, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application. 
     */
    @NotNull public Builder schemaVersion(String schemaVersion) {
      this.schemaVersion = schemaVersion;
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(Thing thing) {
      this.about = thing;
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(Thing.Builder thing) {
      return this.about(thing.build());
    }
    /**
     * Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @NotNull public Builder accessibilityAPI(String accessibilityAPI) {
      this.accessibilityAPI = accessibilityAPI;
      return this;
    }
    /**
     * Identifies input methods that are sufficient to fully control the described resource (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @NotNull public Builder accessibilityControl(String accessibilityControl) {
      this.accessibilityControl = accessibilityControl;
      return this;
    }
    /**
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @NotNull public Builder accessibilityFeature(String accessibilityFeature) {
      this.accessibilityFeature = accessibilityFeature;
      return this;
    }
    /**
     * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @NotNull public Builder accessibilityHazard(String accessibilityHazard) {
      this.accessibilityHazard = accessibilityHazard;
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    @NotNull public Builder accountablePerson(Person person) {
      this.accountablePerson = person;
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    @NotNull public Builder accountablePerson(Person.Builder person) {
      return this.accountablePerson(person.build());
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(AggregateRating.Builder aggregateRating) {
      return this.aggregateRating(aggregateRating.build());
    }
    /**
     * A secondary title of the CreativeWork.
     */
    @NotNull public Builder alternativeHeadline(String alternativeHeadline) {
      this.alternativeHeadline = alternativeHeadline;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    @NotNull public Builder associatedMedia(MediaObject mediaObject) {
      this.associatedMedia = mediaObject;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    @NotNull public Builder associatedMedia(MediaObject.Builder mediaObject) {
      return this.associatedMedia(mediaObject.build());
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(Audience audience) {
      this.audience = audience;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(Audience.Builder audience) {
      return this.audience(audience.build());
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(AudioObject audioObject) {
      this.audio = audioObject;
      return this;
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(AudioObject.Builder audioObject) {
      return this.audio(audioObject.build());
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(Organization organization) {
      if (this.author == null) this.author = new OrganizationOrPerson();
      this.author.setOrganization(organization);
      return this;
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(Organization.Builder organization) {
      return this.author(organization.build());
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(Person person) {
      if (this.author == null) this.author = new OrganizationOrPerson();
      this.author.setPerson(person);
      return this;
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(Person.Builder person) {
      return this.author(person.build());
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(String award) {
      this.award = award;
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(CreativeWork creativeWork) {
      if (this.citation == null) this.citation = new CreativeWorkOrString();
      this.citation.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(CreativeWork.Builder creativeWork) {
      return this.citation(creativeWork.build());
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(String citation) {
      if (this.citation == null) this.citation = new CreativeWorkOrString();
      this.citation.setString(citation);
      return this;
    }
    /**
     * Comments, typically from users.
     */
    @NotNull public Builder comment(Comment comment) {
      this.comment = comment;
      return this;
    }
    /**
     * Comments, typically from users.
     */
    @NotNull public Builder comment(Comment.Builder comment) {
      return this.comment(comment.build());
    }
    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    @NotNull public Builder contentLocation(Place place) {
      this.contentLocation = place;
      return this;
    }
    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    @NotNull public Builder contentLocation(Place.Builder place) {
      return this.contentLocation(place.build());
    }
    /**
     * Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
     */
    @NotNull public Builder contentRating(String contentRating) {
      this.contentRating = contentRating;
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    @NotNull public Builder contributor(Organization organization) {
      if (this.contributor == null) this.contributor = new OrganizationOrPerson();
      this.contributor.setOrganization(organization);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    @NotNull public Builder contributor(Organization.Builder organization) {
      return this.contributor(organization.build());
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    @NotNull public Builder contributor(Person person) {
      if (this.contributor == null) this.contributor = new OrganizationOrPerson();
      this.contributor.setPerson(person);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    @NotNull public Builder contributor(Person.Builder person) {
      return this.contributor(person.build());
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(Organization organization) {
      if (this.copyrightHolder == null) this.copyrightHolder = new OrganizationOrPerson();
      this.copyrightHolder.setOrganization(organization);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(Organization.Builder organization) {
      return this.copyrightHolder(organization.build());
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(Person person) {
      if (this.copyrightHolder == null) this.copyrightHolder = new OrganizationOrPerson();
      this.copyrightHolder.setPerson(person);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(Person.Builder person) {
      return this.copyrightHolder(person.build());
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(int copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setInt(copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(long copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setLong(copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(float copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setFloat(copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(double copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setDouble(copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(String copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setString(copyrightYear);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(Organization organization) {
      if (this.creator == null) this.creator = new OrganizationOrPerson();
      this.creator.setOrganization(organization);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(Organization.Builder organization) {
      return this.creator(organization.build());
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(Person person) {
      if (this.creator == null) this.creator = new OrganizationOrPerson();
      this.creator.setPerson(person);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(Person.Builder person) {
      return this.creator(person.build());
    }
    /**
     * The date on which the CreativeWork was created.
     */
    @NotNull public Builder dateCreated(java.util.Date date) {
      this.dateCreated = date;
      return this;
    }
    /**
     * The date on which the CreativeWork was most recently modified.
     */
    @NotNull public Builder dateModified(java.util.Date date) {
      this.dateModified = date;
      return this;
    }
    /**
     * Date of first broadcast/publication.
     */
    @NotNull public Builder datePublished(java.util.Date date) {
      this.datePublished = date;
      return this;
    }
    /**
     * A link to the page containing the comments of the CreativeWork.
     */
    @NotNull public Builder discussionUrl(String discussionUrl) {
      this.discussionUrl = discussionUrl;
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     */
    @NotNull public Builder editor(Person person) {
      this.editor = person;
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     */
    @NotNull public Builder editor(Person.Builder person) {
      return this.editor(person.build());
    }
    /**
     * An alignment to an established educational framework.
     */
    @NotNull public Builder educationalAlignment(AlignmentObject alignmentObject) {
      this.educationalAlignment = alignmentObject;
      return this;
    }
    /**
     * An alignment to an established educational framework.
     */
    @NotNull public Builder educationalAlignment(AlignmentObject.Builder alignmentObject) {
      return this.educationalAlignment(alignmentObject.build());
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    @NotNull public Builder educationalUse(String educationalUse) {
      this.educationalUse = educationalUse;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    @NotNull public Builder encoding(MediaObject mediaObject) {
      this.encoding = mediaObject;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    @NotNull public Builder encoding(MediaObject.Builder mediaObject) {
      return this.encoding(mediaObject.build());
    }
    /**
     * Genre of the creative work or group.
     */
    @NotNull public Builder genre(String genre) {
      this.genre = genre;
      return this;
    }
    /**
     * Headline of the article.
     */
    @NotNull public Builder headline(String headline) {
      this.headline = headline;
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(Language language) {
      if (this.inLanguage == null) this.inLanguage = new LanguageOrString();
      this.inLanguage.setLanguage(language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(Language.Builder language) {
      return this.inLanguage(language.build());
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(String inLanguage) {
      if (this.inLanguage == null) this.inLanguage = new LanguageOrString();
      this.inLanguage.setString(inLanguage);
      return this;
    }
    /**
     * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
     */
    @NotNull public Builder interactivityType(String interactivityType) {
      this.interactivityType = interactivityType;
      return this;
    }
    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    @NotNull public Builder isBasedOnUrl(String isBasedOnUrl) {
      this.isBasedOnUrl = isBasedOnUrl;
      return this;
    }
    /**
     * Indicates whether this content is family friendly.
     */
    @NotNull public Builder isFamilyFriendly(Boolean isFamilyFriendly) {
      this.isFamilyFriendly = isFamilyFriendly;
      return this;
    }
    /**
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    @NotNull public Builder keywords(String keywords) {
      this.keywords = keywords;
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(CreativeWork creativeWork) {
      if (this.license == null) this.license = new CreativeWorkOrString();
      this.license.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(CreativeWork.Builder creativeWork) {
      return this.license(creativeWork.build());
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(String license) {
      if (this.license == null) this.license = new CreativeWorkOrString();
      this.license.setString(license);
      return this;
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    @NotNull public Builder learningResourceType(String learningResourceType) {
      this.learningResourceType = learningResourceType;
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @NotNull public Builder mainEntity(Thing thing) {
      this.mainEntity = thing;
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @NotNull public Builder mainEntity(Thing.Builder thing) {
      return this.mainEntity(thing.build());
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    @NotNull public Builder mentions(Thing thing) {
      this.mentions = thing;
      return this;
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    @NotNull public Builder mentions(Thing.Builder thing) {
      return this.mentions(thing.build());
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(Offer offer) {
      this.offers = offer;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(Offer.Builder offer) {
      return this.offers(offer.build());
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(Organization organization) {
      if (this.producer == null) this.producer = new OrganizationOrPerson();
      this.producer.setOrganization(organization);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(Organization.Builder organization) {
      return this.producer(organization.build());
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(Person person) {
      if (this.producer == null) this.producer = new OrganizationOrPerson();
      this.producer.setPerson(person);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(Person.Builder person) {
      return this.producer(person.build());
    }
    /**
     * A publication event associated with the item.
     */
    @NotNull public Builder publication(PublicationEvent publicationEvent) {
      this.publication = publicationEvent;
      return this;
    }
    /**
     * A publication event associated with the item.
     */
    @NotNull public Builder publication(PublicationEvent.Builder publicationEvent) {
      return this.publication(publicationEvent.build());
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(Organization organization) {
      this.publisher = organization;
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(Organization.Builder organization) {
      return this.publisher(organization.build());
    }
    /**
     * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
     */
    @NotNull public Builder publishingPrinciples(String publishingPrinciples) {
      this.publishingPrinciples = publishingPrinciples;
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    @NotNull public Builder recordedAt(Event event) {
      this.recordedAt = event;
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    @NotNull public Builder recordedAt(Event.Builder event) {
      return this.recordedAt(event.build());
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(Review review) {
      this.review = review;
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(Review.Builder review) {
      return this.review(review.build());
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    @NotNull public Builder sourceOrganization(Organization organization) {
      this.sourceOrganization = organization;
      return this;
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    @NotNull public Builder sourceOrganization(Organization.Builder organization) {
      return this.sourceOrganization(organization.build());
    }
    /**
     * The textual content of this CreativeWork.
     */
    @NotNull public Builder text(String text) {
      this.text = text;
      return this;
    }
    /**
     * A thumbnail image relevant to the Thing.
     */
    @NotNull public Builder thumbnailUrl(String thumbnailUrl) {
      this.thumbnailUrl = thumbnailUrl;
      return this;
    }
    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
     */
    @NotNull public Builder timeRequired(Duration duration) {
      this.timeRequired = duration;
      return this;
    }
    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
     */
    @NotNull public Builder timeRequired(Duration.Builder duration) {
      return this.timeRequired(duration.build());
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    @NotNull public Builder typicalAgeRange(String typicalAgeRange) {
      this.typicalAgeRange = typicalAgeRange;
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(int version) {
      if (this.version == null) this.version = new Number();
      this.version.setInt(version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(long version) {
      if (this.version == null) this.version = new Number();
      this.version.setLong(version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(float version) {
      if (this.version == null) this.version = new Number();
      this.version.setFloat(version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(double version) {
      if (this.version == null) this.version = new Number();
      this.version.setDouble(version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(String version) {
      if (this.version == null) this.version = new Number();
      this.version.setString(version);
      return this;
    }
    /**
     * An embedded video object.
     */
    @NotNull public Builder video(VideoObject videoObject) {
      this.video = videoObject;
      return this;
    }
    /**
     * An embedded video object.
     */
    @NotNull public Builder video(VideoObject.Builder videoObject) {
      return this.video(videoObject.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(Organization organization) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(Organization.Builder organization) {
      return this.provider(organization.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(Person person) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setPerson(person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(Person.Builder person) {
      return this.provider(person.build());
    }
    /**
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    @NotNull public Builder commentCount(int commentCount) {
      this.commentCount = commentCount;
      return this;
    }
    /**
     * Indicates a CreativeWork that is (in some sense) a part of this CreativeWork.
     */
    @NotNull public Builder hasPart(HasPart hasPart) {
      this.hasPart = hasPart;
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    @NotNull public Builder workExample(CreativeWork creativeWork) {
      this.workExample = creativeWork;
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    @NotNull public Builder workExample(CreativeWork.Builder creativeWork) {
      return this.workExample(creativeWork.build());
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    @NotNull public Builder exampleOfWork(CreativeWork creativeWork) {
      this.exampleOfWork = creativeWork;
      return this;
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    @NotNull public Builder exampleOfWork(CreativeWork.Builder creativeWork) {
      return this.exampleOfWork(creativeWork.build());
    }
    /**
     * Fictional person connected with a creative work.
     */
    @NotNull public Builder character(Person person) {
      this.character = person;
      return this;
    }
    /**
     * Fictional person connected with a creative work.
     */
    @NotNull public Builder character(Person.Builder person) {
      return this.character(person.build());
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    @NotNull public Builder translator(Organization organization) {
      if (this.translator == null) this.translator = new OrganizationOrPerson();
      this.translator.setOrganization(organization);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    @NotNull public Builder translator(Organization.Builder organization) {
      return this.translator(organization.build());
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    @NotNull public Builder translator(Person person) {
      if (this.translator == null) this.translator = new OrganizationOrPerson();
      this.translator.setPerson(person);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    @NotNull public Builder translator(Person.Builder person) {
      return this.translator(person.build());
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    @NotNull public Builder releasedEvent(PublicationEvent publicationEvent) {
      this.releasedEvent = publicationEvent;
      return this;
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    @NotNull public Builder releasedEvent(PublicationEvent.Builder publicationEvent) {
      return this.releasedEvent(publicationEvent.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(String description) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
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
    private int commentCount;
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
  public interface Builder extends ThingBuilder<Painting> {
    @NotNull Builder schemaVersion(String schemaVersion);
    @NotNull Builder about(Thing thing);
    @NotNull Builder about(Thing.Builder thing);
    @NotNull Builder accessibilityAPI(String accessibilityAPI);
    @NotNull Builder accessibilityControl(String accessibilityControl);
    @NotNull Builder accessibilityFeature(String accessibilityFeature);
    @NotNull Builder accessibilityHazard(String accessibilityHazard);
    @NotNull Builder accountablePerson(Person person);
    @NotNull Builder accountablePerson(Person.Builder person);
    @NotNull Builder aggregateRating(AggregateRating aggregateRating);
    @NotNull Builder aggregateRating(AggregateRating.Builder aggregateRating);
    @NotNull Builder alternativeHeadline(String alternativeHeadline);
    @NotNull Builder associatedMedia(MediaObject mediaObject);
    @NotNull Builder associatedMedia(MediaObject.Builder mediaObject);
    @NotNull Builder audience(Audience audience);
    @NotNull Builder audience(Audience.Builder audience);
    @NotNull Builder audio(AudioObject audioObject);
    @NotNull Builder audio(AudioObject.Builder audioObject);
    @NotNull Builder author(Organization organization);
    @NotNull Builder author(Organization.Builder organization);
    @NotNull Builder author(Person person);
    @NotNull Builder author(Person.Builder person);
    @NotNull Builder award(String award);
    @NotNull Builder citation(CreativeWork creativeWork);
    @NotNull Builder citation(CreativeWork.Builder creativeWork);
    @NotNull Builder citation(String citation);
    @NotNull Builder comment(Comment comment);
    @NotNull Builder comment(Comment.Builder comment);
    @NotNull Builder contentLocation(Place place);
    @NotNull Builder contentLocation(Place.Builder place);
    @NotNull Builder contentRating(String contentRating);
    @NotNull Builder contributor(Organization organization);
    @NotNull Builder contributor(Organization.Builder organization);
    @NotNull Builder contributor(Person person);
    @NotNull Builder contributor(Person.Builder person);
    @NotNull Builder copyrightHolder(Organization organization);
    @NotNull Builder copyrightHolder(Organization.Builder organization);
    @NotNull Builder copyrightHolder(Person person);
    @NotNull Builder copyrightHolder(Person.Builder person);
    @NotNull Builder copyrightYear(int copyrightYear);
    @NotNull Builder copyrightYear(long copyrightYear);
    @NotNull Builder copyrightYear(float copyrightYear);
    @NotNull Builder copyrightYear(double copyrightYear);
    @NotNull Builder copyrightYear(String copyrightYear);
    @NotNull Builder creator(Organization organization);
    @NotNull Builder creator(Organization.Builder organization);
    @NotNull Builder creator(Person person);
    @NotNull Builder creator(Person.Builder person);
    @NotNull Builder dateCreated(java.util.Date date);
    @NotNull Builder dateModified(java.util.Date date);
    @NotNull Builder datePublished(java.util.Date date);
    @NotNull Builder discussionUrl(String discussionUrl);
    @NotNull Builder editor(Person person);
    @NotNull Builder editor(Person.Builder person);
    @NotNull Builder educationalAlignment(AlignmentObject alignmentObject);
    @NotNull Builder educationalAlignment(AlignmentObject.Builder alignmentObject);
    @NotNull Builder educationalUse(String educationalUse);
    @NotNull Builder encoding(MediaObject mediaObject);
    @NotNull Builder encoding(MediaObject.Builder mediaObject);
    @NotNull Builder genre(String genre);
    @NotNull Builder headline(String headline);
    @NotNull Builder inLanguage(Language language);
    @NotNull Builder inLanguage(Language.Builder language);
    @NotNull Builder inLanguage(String inLanguage);
    @NotNull Builder interactivityType(String interactivityType);
    @NotNull Builder isBasedOnUrl(String isBasedOnUrl);
    @NotNull Builder isFamilyFriendly(Boolean isFamilyFriendly);
    @NotNull Builder keywords(String keywords);
    @NotNull Builder license(CreativeWork creativeWork);
    @NotNull Builder license(CreativeWork.Builder creativeWork);
    @NotNull Builder license(String license);
    @NotNull Builder learningResourceType(String learningResourceType);
    @NotNull Builder mainEntity(Thing thing);
    @NotNull Builder mainEntity(Thing.Builder thing);
    @NotNull Builder mentions(Thing thing);
    @NotNull Builder mentions(Thing.Builder thing);
    @NotNull Builder offers(Offer offer);
    @NotNull Builder offers(Offer.Builder offer);
    @NotNull Builder producer(Organization organization);
    @NotNull Builder producer(Organization.Builder organization);
    @NotNull Builder producer(Person person);
    @NotNull Builder producer(Person.Builder person);
    @NotNull Builder publication(PublicationEvent publicationEvent);
    @NotNull Builder publication(PublicationEvent.Builder publicationEvent);
    @NotNull Builder publisher(Organization organization);
    @NotNull Builder publisher(Organization.Builder organization);
    @NotNull Builder publishingPrinciples(String publishingPrinciples);
    @NotNull Builder recordedAt(Event event);
    @NotNull Builder recordedAt(Event.Builder event);
    @NotNull Builder review(Review review);
    @NotNull Builder review(Review.Builder review);
    @NotNull Builder sourceOrganization(Organization organization);
    @NotNull Builder sourceOrganization(Organization.Builder organization);
    @NotNull Builder text(String text);
    @NotNull Builder thumbnailUrl(String thumbnailUrl);
    @NotNull Builder timeRequired(Duration duration);
    @NotNull Builder timeRequired(Duration.Builder duration);
    @NotNull Builder typicalAgeRange(String typicalAgeRange);
    @NotNull Builder version(int version);
    @NotNull Builder version(long version);
    @NotNull Builder version(float version);
    @NotNull Builder version(double version);
    @NotNull Builder version(String version);
    @NotNull Builder video(VideoObject videoObject);
    @NotNull Builder video(VideoObject.Builder videoObject);
    @NotNull Builder provider(Organization organization);
    @NotNull Builder provider(Organization.Builder organization);
    @NotNull Builder provider(Person person);
    @NotNull Builder provider(Person.Builder person);
    @NotNull Builder commentCount(int commentCount);
    @NotNull Builder hasPart(HasPart hasPart);
    @NotNull Builder workExample(CreativeWork creativeWork);
    @NotNull Builder workExample(CreativeWork.Builder creativeWork);
    @NotNull Builder exampleOfWork(CreativeWork creativeWork);
    @NotNull Builder exampleOfWork(CreativeWork.Builder creativeWork);
    @NotNull Builder character(Person person);
    @NotNull Builder character(Person.Builder person);
    @NotNull Builder translator(Organization organization);
    @NotNull Builder translator(Organization.Builder organization);
    @NotNull Builder translator(Person person);
    @NotNull Builder translator(Person.Builder person);
    @NotNull Builder releasedEvent(PublicationEvent publicationEvent);
    @NotNull Builder releasedEvent(PublicationEvent.Builder publicationEvent);
    @NotNull Builder additionalType(String additionalType);
    @NotNull Builder alternateName(String alternateName);
    @NotNull Builder description(String description);
    @NotNull Builder mainEntityOfPage(CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(String mainEntityOfPage);
    @NotNull Builder name(String name);
    @NotNull Builder sameAs(String sameAs);
    @NotNull Builder url(String url);
    @NotNull Builder potentialAction(Action action);
    @NotNull Builder potentialAction(Action.Builder action);
    @NotNull Builder id(String id);
  }

  protected Painting(String schemaVersion, Thing about, String accessibilityAPI, String accessibilityControl, String accessibilityFeature, String accessibilityHazard, Person accountablePerson, AggregateRating aggregateRating, String alternativeHeadline, MediaObject associatedMedia, Audience audience, AudioObject audio, OrganizationOrPerson author, String award, CreativeWorkOrString citation, Comment comment, Place contentLocation, String contentRating, OrganizationOrPerson contributor, OrganizationOrPerson copyrightHolder, Number copyrightYear, OrganizationOrPerson creator, java.util.Date dateCreated, java.util.Date dateModified, java.util.Date datePublished, String discussionUrl, Person editor, AlignmentObject educationalAlignment, String educationalUse, MediaObject encoding, String genre, String headline, LanguageOrString inLanguage, String interactivityType, String isBasedOnUrl, Boolean isFamilyFriendly, String keywords, CreativeWorkOrString license, String learningResourceType, Thing mainEntity, Thing mentions, Offer offers, OrganizationOrPerson producer, PublicationEvent publication, Organization publisher, String publishingPrinciples, Event recordedAt, Review review, Organization sourceOrganization, String text, String thumbnailUrl, Duration timeRequired, String typicalAgeRange, Number version, VideoObject video, OrganizationOrPerson provider, int commentCount, HasPart hasPart, CreativeWork workExample, CreativeWork exampleOfWork, Person character, OrganizationOrPerson translator, PublicationEvent releasedEvent, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(schemaVersion, about, accessibilityAPI, accessibilityControl, accessibilityFeature, accessibilityHazard, accountablePerson, aggregateRating, alternativeHeadline, associatedMedia, audience, audio, author, award, citation, comment, contentLocation, contentRating, contributor, copyrightHolder, copyrightYear, creator, dateCreated, dateModified, datePublished, discussionUrl, editor, educationalAlignment, educationalUse, encoding, genre, headline, inLanguage, interactivityType, isBasedOnUrl, isFamilyFriendly, keywords, license, learningResourceType, mainEntity, mentions, offers, producer, publication, publisher, publishingPrinciples, recordedAt, review, sourceOrganization, text, thumbnailUrl, timeRequired, typicalAgeRange, version, video, provider, commentCount, hasPart, workExample, exampleOfWork, character, translator, releasedEvent, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
  }
}
