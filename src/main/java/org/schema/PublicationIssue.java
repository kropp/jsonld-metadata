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
 * A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.
  * 
  *       <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex
 * Equivalent class: http://purl.org/ontology/bibo/Issue
 */
public class PublicationIssue extends CreativeWork {
  /**
   * Identifies the issue of publication; for example, "iii" or "2".
   */
  public IntegerOrString getIssueNumber() {
    return myIssueNumber;
  }
  /**
   * The page on which the work ends; for example "138" or "xvi".
   */
  public IntegerOrString getPageEnd() {
    return myPageEnd;
  }
  /**
   * The page on which the work starts; for example "135" or "xiii".
   */
  public IntegerOrString getPageStart() {
    return myPageStart;
  }
  /**
   * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
   */
  public String getPagination() {
    return myPagination;
  }
  /**
   * Builder for {@link PublicationIssue}
   */
  static final class PublicationIssueThingBuilder implements Builder {
    /**
     * Creates new {@link PublicationIssue} instance.
     */
    public PublicationIssue build() {
      return new PublicationIssue(issueNumber, pageEnd, pageStart, pagination, schemaVersion, about, accessibilityAPI, accessibilityControl, accessibilityFeature, accessibilityHazard, accountablePerson, aggregateRating, alternativeHeadline, associatedMedia, audience, audio, author, award, citation, comment, contentLocation, contentRating, contributor, copyrightHolder, copyrightYear, creator, dateCreated, dateModified, datePublished, discussionUrl, editor, educationalAlignment, educationalUse, encoding, genre, headline, inLanguage, interactivityType, isBasedOnUrl, isFamilyFriendly, keywords, license, learningResourceType, mainEntity, mentions, offers, producer, publication, publisher, publishingPrinciples, recordedAt, review, sourceOrganization, text, thumbnailUrl, timeRequired, typicalAgeRange, version, video, provider, commentCount, hasPart, workExample, exampleOfWork, character, translator, releasedEvent, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Identifies the issue of publication; for example, "iii" or "2".
     */
    @NotNull public Builder issueNumber(@NotNull Integer integer) {
      if (this.issueNumber == null) this.issueNumber = new IntegerOrString();
      this.issueNumber.setInteger(integer);
      return this;
    }
    /**
     * Identifies the issue of publication; for example, "iii" or "2".
     */
    @NotNull public Builder issueNumber(@NotNull String issueNumber) {
      if (this.issueNumber == null) this.issueNumber = new IntegerOrString();
      this.issueNumber.setString(issueNumber);
      return this;
    }
    /**
     * The page on which the work ends; for example "138" or "xvi".
     */
    @NotNull public Builder pageEnd(@NotNull Integer integer) {
      if (this.pageEnd == null) this.pageEnd = new IntegerOrString();
      this.pageEnd.setInteger(integer);
      return this;
    }
    /**
     * The page on which the work ends; for example "138" or "xvi".
     */
    @NotNull public Builder pageEnd(@NotNull String pageEnd) {
      if (this.pageEnd == null) this.pageEnd = new IntegerOrString();
      this.pageEnd.setString(pageEnd);
      return this;
    }
    /**
     * The page on which the work starts; for example "135" or "xiii".
     */
    @NotNull public Builder pageStart(@NotNull Integer integer) {
      if (this.pageStart == null) this.pageStart = new IntegerOrString();
      this.pageStart.setInteger(integer);
      return this;
    }
    /**
     * The page on which the work starts; for example "135" or "xiii".
     */
    @NotNull public Builder pageStart(@NotNull String pageStart) {
      if (this.pageStart == null) this.pageStart = new IntegerOrString();
      this.pageStart.setString(pageStart);
      return this;
    }
    /**
     * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
     */
    @NotNull public Builder pagination(@NotNull String pagination) {
      this.pagination = pagination;
      return this;
    }
    /**
     * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application. 
     */
    @NotNull public Builder schemaVersion(@NotNull String schemaVersion) {
      this.schemaVersion = schemaVersion;
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing thing) {
      this.about = thing;
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing.Builder thing) {
      return this.about(thing.build());
    }
    /**
     * Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @NotNull public Builder accessibilityAPI(@NotNull String accessibilityAPI) {
      this.accessibilityAPI = accessibilityAPI;
      return this;
    }
    /**
     * Identifies input methods that are sufficient to fully control the described resource (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @NotNull public Builder accessibilityControl(@NotNull String accessibilityControl) {
      this.accessibilityControl = accessibilityControl;
      return this;
    }
    /**
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @NotNull public Builder accessibilityFeature(@NotNull String accessibilityFeature) {
      this.accessibilityFeature = accessibilityFeature;
      return this;
    }
    /**
     * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @NotNull public Builder accessibilityHazard(@NotNull String accessibilityHazard) {
      this.accessibilityHazard = accessibilityHazard;
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    @NotNull public Builder accountablePerson(@NotNull Person person) {
      this.accountablePerson = person;
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    @NotNull public Builder accountablePerson(@NotNull Person.Builder person) {
      return this.accountablePerson(person.build());
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      return this.aggregateRating(aggregateRating.build());
    }
    /**
     * A secondary title of the CreativeWork.
     */
    @NotNull public Builder alternativeHeadline(@NotNull String alternativeHeadline) {
      this.alternativeHeadline = alternativeHeadline;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    @NotNull public Builder associatedMedia(@NotNull MediaObject mediaObject) {
      this.associatedMedia = mediaObject;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    @NotNull public Builder associatedMedia(@NotNull MediaObject.Builder mediaObject) {
      return this.associatedMedia(mediaObject.build());
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      this.audience = audience;
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      return this.audience(audience.build());
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(@NotNull AudioObject audioObject) {
      this.audio = audioObject;
      return this;
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(@NotNull AudioObject.Builder audioObject) {
      return this.audio(audioObject.build());
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Organization organization) {
      if (this.author == null) this.author = new OrganizationOrPerson();
      this.author.setOrganization(organization);
      return this;
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Organization.Builder organization) {
      return this.author(organization.build());
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Person person) {
      if (this.author == null) this.author = new OrganizationOrPerson();
      this.author.setPerson(person);
      return this;
    }
    /**
     * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Person.Builder person) {
      return this.author(person.build());
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      this.award = award;
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(@NotNull CreativeWork creativeWork) {
      if (this.citation == null) this.citation = new CreativeWorkOrString();
      this.citation.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(@NotNull CreativeWork.Builder creativeWork) {
      return this.citation(creativeWork.build());
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(@NotNull String citation) {
      if (this.citation == null) this.citation = new CreativeWorkOrString();
      this.citation.setString(citation);
      return this;
    }
    /**
     * Comments, typically from users.
     */
    @NotNull public Builder comment(@NotNull Comment comment) {
      this.comment = comment;
      return this;
    }
    /**
     * Comments, typically from users.
     */
    @NotNull public Builder comment(@NotNull Comment.Builder comment) {
      return this.comment(comment.build());
    }
    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    @NotNull public Builder contentLocation(@NotNull Place place) {
      this.contentLocation = place;
      return this;
    }
    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    @NotNull public Builder contentLocation(@NotNull Place.Builder place) {
      return this.contentLocation(place.build());
    }
    /**
     * Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
     */
    @NotNull public Builder contentRating(@NotNull String contentRating) {
      this.contentRating = contentRating;
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    @NotNull public Builder contributor(@NotNull Organization organization) {
      if (this.contributor == null) this.contributor = new OrganizationOrPerson();
      this.contributor.setOrganization(organization);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    @NotNull public Builder contributor(@NotNull Organization.Builder organization) {
      return this.contributor(organization.build());
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    @NotNull public Builder contributor(@NotNull Person person) {
      if (this.contributor == null) this.contributor = new OrganizationOrPerson();
      this.contributor.setPerson(person);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork.
     */
    @NotNull public Builder contributor(@NotNull Person.Builder person) {
      return this.contributor(person.build());
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Organization organization) {
      if (this.copyrightHolder == null) this.copyrightHolder = new OrganizationOrPerson();
      this.copyrightHolder.setOrganization(organization);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Organization.Builder organization) {
      return this.copyrightHolder(organization.build());
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Person person) {
      if (this.copyrightHolder == null) this.copyrightHolder = new OrganizationOrPerson();
      this.copyrightHolder.setPerson(person);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Person.Builder person) {
      return this.copyrightHolder(person.build());
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Integer integer) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setInteger(integer);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Long copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setLong(copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Float copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setFloat(copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Double copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setDouble(copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull String copyrightYear) {
      if (this.copyrightYear == null) this.copyrightYear = new Number();
      this.copyrightYear.setString(copyrightYear);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Organization organization) {
      if (this.creator == null) this.creator = new OrganizationOrPerson();
      this.creator.setOrganization(organization);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Organization.Builder organization) {
      return this.creator(organization.build());
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Person person) {
      if (this.creator == null) this.creator = new OrganizationOrPerson();
      this.creator.setPerson(person);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Person.Builder person) {
      return this.creator(person.build());
    }
    /**
     * The date on which the CreativeWork was created.
     */
    @NotNull public Builder dateCreated(@NotNull java.util.Date date) {
      this.dateCreated = date;
      return this;
    }
    /**
     * The date on which the CreativeWork was most recently modified.
     */
    @NotNull public Builder dateModified(@NotNull java.util.Date date) {
      this.dateModified = date;
      return this;
    }
    /**
     * Date of first broadcast/publication.
     */
    @NotNull public Builder datePublished(@NotNull java.util.Date date) {
      this.datePublished = date;
      return this;
    }
    /**
     * A link to the page containing the comments of the CreativeWork.
     */
    @NotNull public Builder discussionUrl(@NotNull String discussionUrl) {
      this.discussionUrl = discussionUrl;
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     */
    @NotNull public Builder editor(@NotNull Person person) {
      this.editor = person;
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     */
    @NotNull public Builder editor(@NotNull Person.Builder person) {
      return this.editor(person.build());
    }
    /**
     * An alignment to an established educational framework.
     */
    @NotNull public Builder educationalAlignment(@NotNull AlignmentObject alignmentObject) {
      this.educationalAlignment = alignmentObject;
      return this;
    }
    /**
     * An alignment to an established educational framework.
     */
    @NotNull public Builder educationalAlignment(@NotNull AlignmentObject.Builder alignmentObject) {
      return this.educationalAlignment(alignmentObject.build());
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    @NotNull public Builder educationalUse(@NotNull String educationalUse) {
      this.educationalUse = educationalUse;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    @NotNull public Builder encoding(@NotNull MediaObject mediaObject) {
      this.encoding = mediaObject;
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    @NotNull public Builder encoding(@NotNull MediaObject.Builder mediaObject) {
      return this.encoding(mediaObject.build());
    }
    /**
     * Genre of the creative work or group.
     */
    @NotNull public Builder genre(@NotNull String genre) {
      this.genre = genre;
      return this;
    }
    /**
     * Headline of the article.
     */
    @NotNull public Builder headline(@NotNull String headline) {
      this.headline = headline;
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      if (this.inLanguage == null) this.inLanguage = new LanguageOrString();
      this.inLanguage.setLanguage(language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      return this.inLanguage(language.build());
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      if (this.inLanguage == null) this.inLanguage = new LanguageOrString();
      this.inLanguage.setString(inLanguage);
      return this;
    }
    /**
     * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
     */
    @NotNull public Builder interactivityType(@NotNull String interactivityType) {
      this.interactivityType = interactivityType;
      return this;
    }
    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    @NotNull public Builder isBasedOnUrl(@NotNull String isBasedOnUrl) {
      this.isBasedOnUrl = isBasedOnUrl;
      return this;
    }
    /**
     * Indicates whether this content is family friendly.
     */
    @NotNull public Builder isFamilyFriendly(@NotNull Boolean isFamilyFriendly) {
      this.isFamilyFriendly = isFamilyFriendly;
      return this;
    }
    /**
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    @NotNull public Builder keywords(@NotNull String keywords) {
      this.keywords = keywords;
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(@NotNull CreativeWork creativeWork) {
      if (this.license == null) this.license = new CreativeWorkOrString();
      this.license.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(@NotNull CreativeWork.Builder creativeWork) {
      return this.license(creativeWork.build());
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(@NotNull String license) {
      if (this.license == null) this.license = new CreativeWorkOrString();
      this.license.setString(license);
      return this;
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    @NotNull public Builder learningResourceType(@NotNull String learningResourceType) {
      this.learningResourceType = learningResourceType;
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @NotNull public Builder mainEntity(@NotNull Thing thing) {
      this.mainEntity = thing;
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @NotNull public Builder mainEntity(@NotNull Thing.Builder thing) {
      return this.mainEntity(thing.build());
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    @NotNull public Builder mentions(@NotNull Thing thing) {
      this.mentions = thing;
      return this;
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    @NotNull public Builder mentions(@NotNull Thing.Builder thing) {
      return this.mentions(thing.build());
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      this.offers = offer;
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, or give away tickets to an event.
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      return this.offers(offer.build());
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Organization organization) {
      if (this.producer == null) this.producer = new OrganizationOrPerson();
      this.producer.setOrganization(organization);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Organization.Builder organization) {
      return this.producer(organization.build());
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Person person) {
      if (this.producer == null) this.producer = new OrganizationOrPerson();
      this.producer.setPerson(person);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Person.Builder person) {
      return this.producer(person.build());
    }
    /**
     * A publication event associated with the item.
     */
    @NotNull public Builder publication(@NotNull PublicationEvent publicationEvent) {
      this.publication = publicationEvent;
      return this;
    }
    /**
     * A publication event associated with the item.
     */
    @NotNull public Builder publication(@NotNull PublicationEvent.Builder publicationEvent) {
      return this.publication(publicationEvent.build());
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(@NotNull Organization organization) {
      this.publisher = organization;
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(@NotNull Organization.Builder organization) {
      return this.publisher(organization.build());
    }
    /**
     * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
     */
    @NotNull public Builder publishingPrinciples(@NotNull String publishingPrinciples) {
      this.publishingPrinciples = publishingPrinciples;
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    @NotNull public Builder recordedAt(@NotNull Event event) {
      this.recordedAt = event;
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    @NotNull public Builder recordedAt(@NotNull Event.Builder event) {
      return this.recordedAt(event.build());
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      this.review = review;
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      return this.review(review.build());
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    @NotNull public Builder sourceOrganization(@NotNull Organization organization) {
      this.sourceOrganization = organization;
      return this;
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    @NotNull public Builder sourceOrganization(@NotNull Organization.Builder organization) {
      return this.sourceOrganization(organization.build());
    }
    /**
     * The textual content of this CreativeWork.
     */
    @NotNull public Builder text(@NotNull String text) {
      this.text = text;
      return this;
    }
    /**
     * A thumbnail image relevant to the Thing.
     */
    @NotNull public Builder thumbnailUrl(@NotNull String thumbnailUrl) {
      this.thumbnailUrl = thumbnailUrl;
      return this;
    }
    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
     */
    @NotNull public Builder timeRequired(@NotNull Duration duration) {
      this.timeRequired = duration;
      return this;
    }
    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
     */
    @NotNull public Builder timeRequired(@NotNull Duration.Builder duration) {
      return this.timeRequired(duration.build());
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    @NotNull public Builder typicalAgeRange(@NotNull String typicalAgeRange) {
      this.typicalAgeRange = typicalAgeRange;
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Integer integer) {
      if (this.version == null) this.version = new Number();
      this.version.setInteger(integer);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Long version) {
      if (this.version == null) this.version = new Number();
      this.version.setLong(version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Float version) {
      if (this.version == null) this.version = new Number();
      this.version.setFloat(version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Double version) {
      if (this.version == null) this.version = new Number();
      this.version.setDouble(version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull String version) {
      if (this.version == null) this.version = new Number();
      this.version.setString(version);
      return this;
    }
    /**
     * An embedded video object.
     */
    @NotNull public Builder video(@NotNull VideoObject videoObject) {
      this.video = videoObject;
      return this;
    }
    /**
     * An embedded video object.
     */
    @NotNull public Builder video(@NotNull VideoObject.Builder videoObject) {
      return this.video(videoObject.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      return this.provider(organization.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setPerson(person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      return this.provider(person.build());
    }
    /**
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    @NotNull public Builder commentCount(@NotNull Integer integer) {
      this.commentCount = integer;
      return this;
    }
    /**
     * Indicates a CreativeWork that is (in some sense) a part of this CreativeWork.
     */
    @NotNull public Builder hasPart(@NotNull HasPart hasPart) {
      this.hasPart = hasPart;
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    @NotNull public Builder workExample(@NotNull CreativeWork creativeWork) {
      this.workExample = creativeWork;
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    @NotNull public Builder workExample(@NotNull CreativeWork.Builder creativeWork) {
      return this.workExample(creativeWork.build());
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    @NotNull public Builder exampleOfWork(@NotNull CreativeWork creativeWork) {
      this.exampleOfWork = creativeWork;
      return this;
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    @NotNull public Builder exampleOfWork(@NotNull CreativeWork.Builder creativeWork) {
      return this.exampleOfWork(creativeWork.build());
    }
    /**
     * Fictional person connected with a creative work.
     */
    @NotNull public Builder character(@NotNull Person person) {
      this.character = person;
      return this;
    }
    /**
     * Fictional person connected with a creative work.
     */
    @NotNull public Builder character(@NotNull Person.Builder person) {
      return this.character(person.build());
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    @NotNull public Builder translator(@NotNull Organization organization) {
      if (this.translator == null) this.translator = new OrganizationOrPerson();
      this.translator.setOrganization(organization);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    @NotNull public Builder translator(@NotNull Organization.Builder organization) {
      return this.translator(organization.build());
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    @NotNull public Builder translator(@NotNull Person person) {
      if (this.translator == null) this.translator = new OrganizationOrPerson();
      this.translator.setPerson(person);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market.
     */
    @NotNull public Builder translator(@NotNull Person.Builder person) {
      return this.translator(person.build());
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    @NotNull public Builder releasedEvent(@NotNull PublicationEvent publicationEvent) {
      this.releasedEvent = publicationEvent;
      return this;
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    @NotNull public Builder releasedEvent(@NotNull PublicationEvent.Builder publicationEvent) {
      return this.releasedEvent(publicationEvent.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(@NotNull String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }

    @Override public void fromMap(java.util.Map<String, Object> map) {
      for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
        final String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof java.util.Map) { value = ThingDeserializer.fromMap((java.util.Map<String,Object>)value); }
        if ("issueNumber".equals(key) && value instanceof Integer) { issueNumber((Integer)value); continue; }
        if ("issueNumber".equals(key) && value instanceof String) { issueNumber((String)value); continue; }
        if ("pageEnd".equals(key) && value instanceof Integer) { pageEnd((Integer)value); continue; }
        if ("pageEnd".equals(key) && value instanceof String) { pageEnd((String)value); continue; }
        if ("pageStart".equals(key) && value instanceof Integer) { pageStart((Integer)value); continue; }
        if ("pageStart".equals(key) && value instanceof String) { pageStart((String)value); continue; }
        if ("pagination".equals(key) && value instanceof String) { pagination((String)value); continue; }
        if ("schemaVersion".equals(key) && value instanceof String) { schemaVersion((String)value); continue; }
        if ("about".equals(key) && value instanceof Thing) { about((Thing)value); continue; }
        if ("accessibilityAPI".equals(key) && value instanceof String) { accessibilityAPI((String)value); continue; }
        if ("accessibilityControl".equals(key) && value instanceof String) { accessibilityControl((String)value); continue; }
        if ("accessibilityFeature".equals(key) && value instanceof String) { accessibilityFeature((String)value); continue; }
        if ("accessibilityHazard".equals(key) && value instanceof String) { accessibilityHazard((String)value); continue; }
        if ("accountablePerson".equals(key) && value instanceof Person) { accountablePerson((Person)value); continue; }
        if ("aggregateRating".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); continue; }
        if ("alternativeHeadline".equals(key) && value instanceof String) { alternativeHeadline((String)value); continue; }
        if ("associatedMedia".equals(key) && value instanceof MediaObject) { associatedMedia((MediaObject)value); continue; }
        if ("audience".equals(key) && value instanceof Audience) { audience((Audience)value); continue; }
        if ("audio".equals(key) && value instanceof AudioObject) { audio((AudioObject)value); continue; }
        if ("author".equals(key) && value instanceof Organization) { author((Organization)value); continue; }
        if ("author".equals(key) && value instanceof Person) { author((Person)value); continue; }
        if ("award".equals(key) && value instanceof String) { award((String)value); continue; }
        if ("citation".equals(key) && value instanceof CreativeWork) { citation((CreativeWork)value); continue; }
        if ("citation".equals(key) && value instanceof String) { citation((String)value); continue; }
        if ("comment".equals(key) && value instanceof Comment) { comment((Comment)value); continue; }
        if ("contentLocation".equals(key) && value instanceof Place) { contentLocation((Place)value); continue; }
        if ("contentRating".equals(key) && value instanceof String) { contentRating((String)value); continue; }
        if ("contributor".equals(key) && value instanceof Organization) { contributor((Organization)value); continue; }
        if ("contributor".equals(key) && value instanceof Person) { contributor((Person)value); continue; }
        if ("copyrightHolder".equals(key) && value instanceof Organization) { copyrightHolder((Organization)value); continue; }
        if ("copyrightHolder".equals(key) && value instanceof Person) { copyrightHolder((Person)value); continue; }
        if ("copyrightYear".equals(key) && value instanceof Integer) { copyrightYear((Integer)value); continue; }
        if ("copyrightYear".equals(key) && value instanceof Long) { copyrightYear((Long)value); continue; }
        if ("copyrightYear".equals(key) && value instanceof Float) { copyrightYear((Float)value); continue; }
        if ("copyrightYear".equals(key) && value instanceof Double) { copyrightYear((Double)value); continue; }
        if ("copyrightYear".equals(key) && value instanceof String) { copyrightYear((String)value); continue; }
        if ("creator".equals(key) && value instanceof Organization) { creator((Organization)value); continue; }
        if ("creator".equals(key) && value instanceof Person) { creator((Person)value); continue; }
        if ("dateCreated".equals(key) && value instanceof java.util.Date) { dateCreated((java.util.Date)value); continue; }
        if ("dateModified".equals(key) && value instanceof java.util.Date) { dateModified((java.util.Date)value); continue; }
        if ("datePublished".equals(key) && value instanceof java.util.Date) { datePublished((java.util.Date)value); continue; }
        if ("discussionUrl".equals(key) && value instanceof String) { discussionUrl((String)value); continue; }
        if ("editor".equals(key) && value instanceof Person) { editor((Person)value); continue; }
        if ("educationalAlignment".equals(key) && value instanceof AlignmentObject) { educationalAlignment((AlignmentObject)value); continue; }
        if ("educationalUse".equals(key) && value instanceof String) { educationalUse((String)value); continue; }
        if ("encoding".equals(key) && value instanceof MediaObject) { encoding((MediaObject)value); continue; }
        if ("genre".equals(key) && value instanceof String) { genre((String)value); continue; }
        if ("headline".equals(key) && value instanceof String) { headline((String)value); continue; }
        if ("inLanguage".equals(key) && value instanceof Language) { inLanguage((Language)value); continue; }
        if ("inLanguage".equals(key) && value instanceof String) { inLanguage((String)value); continue; }
        if ("interactivityType".equals(key) && value instanceof String) { interactivityType((String)value); continue; }
        if ("isBasedOnUrl".equals(key) && value instanceof String) { isBasedOnUrl((String)value); continue; }
        if ("isFamilyFriendly".equals(key) && value instanceof Boolean) { isFamilyFriendly((Boolean)value); continue; }
        if ("keywords".equals(key) && value instanceof String) { keywords((String)value); continue; }
        if ("license".equals(key) && value instanceof CreativeWork) { license((CreativeWork)value); continue; }
        if ("license".equals(key) && value instanceof String) { license((String)value); continue; }
        if ("learningResourceType".equals(key) && value instanceof String) { learningResourceType((String)value); continue; }
        if ("mainEntity".equals(key) && value instanceof Thing) { mainEntity((Thing)value); continue; }
        if ("mentions".equals(key) && value instanceof Thing) { mentions((Thing)value); continue; }
        if ("offers".equals(key) && value instanceof Offer) { offers((Offer)value); continue; }
        if ("producer".equals(key) && value instanceof Organization) { producer((Organization)value); continue; }
        if ("producer".equals(key) && value instanceof Person) { producer((Person)value); continue; }
        if ("publication".equals(key) && value instanceof PublicationEvent) { publication((PublicationEvent)value); continue; }
        if ("publisher".equals(key) && value instanceof Organization) { publisher((Organization)value); continue; }
        if ("publishingPrinciples".equals(key) && value instanceof String) { publishingPrinciples((String)value); continue; }
        if ("recordedAt".equals(key) && value instanceof Event) { recordedAt((Event)value); continue; }
        if ("review".equals(key) && value instanceof Review) { review((Review)value); continue; }
        if ("sourceOrganization".equals(key) && value instanceof Organization) { sourceOrganization((Organization)value); continue; }
        if ("text".equals(key) && value instanceof String) { text((String)value); continue; }
        if ("thumbnailUrl".equals(key) && value instanceof String) { thumbnailUrl((String)value); continue; }
        if ("timeRequired".equals(key) && value instanceof Duration) { timeRequired((Duration)value); continue; }
        if ("typicalAgeRange".equals(key) && value instanceof String) { typicalAgeRange((String)value); continue; }
        if ("version".equals(key) && value instanceof Integer) { version((Integer)value); continue; }
        if ("version".equals(key) && value instanceof Long) { version((Long)value); continue; }
        if ("version".equals(key) && value instanceof Float) { version((Float)value); continue; }
        if ("version".equals(key) && value instanceof Double) { version((Double)value); continue; }
        if ("version".equals(key) && value instanceof String) { version((String)value); continue; }
        if ("video".equals(key) && value instanceof VideoObject) { video((VideoObject)value); continue; }
        if ("provider".equals(key) && value instanceof Organization) { provider((Organization)value); continue; }
        if ("provider".equals(key) && value instanceof Person) { provider((Person)value); continue; }
        if ("commentCount".equals(key) && value instanceof Integer) { commentCount((Integer)value); continue; }
        if ("hasPart".equals(key) && value instanceof HasPart) { hasPart((HasPart)value); continue; }
        if ("workExample".equals(key) && value instanceof CreativeWork) { workExample((CreativeWork)value); continue; }
        if ("exampleOfWork".equals(key) && value instanceof CreativeWork) { exampleOfWork((CreativeWork)value); continue; }
        if ("character".equals(key) && value instanceof Person) { character((Person)value); continue; }
        if ("translator".equals(key) && value instanceof Organization) { translator((Organization)value); continue; }
        if ("translator".equals(key) && value instanceof Person) { translator((Person)value); continue; }
        if ("releasedEvent".equals(key) && value instanceof PublicationEvent) { releasedEvent((PublicationEvent)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private IntegerOrString issueNumber;
    private IntegerOrString pageEnd;
    private IntegerOrString pageStart;
    private String pagination;
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
  public interface Builder extends ThingBuilder<PublicationIssue> {
    @NotNull Builder issueNumber(@NotNull Integer integer);
    @NotNull Builder issueNumber(@NotNull String issueNumber);
    @NotNull Builder pageEnd(@NotNull Integer integer);
    @NotNull Builder pageEnd(@NotNull String pageEnd);
    @NotNull Builder pageStart(@NotNull Integer integer);
    @NotNull Builder pageStart(@NotNull String pageStart);
    @NotNull Builder pagination(@NotNull String pagination);
    @NotNull Builder schemaVersion(@NotNull String schemaVersion);
    @NotNull Builder about(@NotNull Thing thing);
    @NotNull Builder about(@NotNull Thing.Builder thing);
    @NotNull Builder accessibilityAPI(@NotNull String accessibilityAPI);
    @NotNull Builder accessibilityControl(@NotNull String accessibilityControl);
    @NotNull Builder accessibilityFeature(@NotNull String accessibilityFeature);
    @NotNull Builder accessibilityHazard(@NotNull String accessibilityHazard);
    @NotNull Builder accountablePerson(@NotNull Person person);
    @NotNull Builder accountablePerson(@NotNull Person.Builder person);
    @NotNull Builder aggregateRating(@NotNull AggregateRating aggregateRating);
    @NotNull Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating);
    @NotNull Builder alternativeHeadline(@NotNull String alternativeHeadline);
    @NotNull Builder associatedMedia(@NotNull MediaObject mediaObject);
    @NotNull Builder associatedMedia(@NotNull MediaObject.Builder mediaObject);
    @NotNull Builder audience(@NotNull Audience audience);
    @NotNull Builder audience(@NotNull Audience.Builder audience);
    @NotNull Builder audio(@NotNull AudioObject audioObject);
    @NotNull Builder audio(@NotNull AudioObject.Builder audioObject);
    @NotNull Builder author(@NotNull Organization organization);
    @NotNull Builder author(@NotNull Organization.Builder organization);
    @NotNull Builder author(@NotNull Person person);
    @NotNull Builder author(@NotNull Person.Builder person);
    @NotNull Builder award(@NotNull String award);
    @NotNull Builder citation(@NotNull CreativeWork creativeWork);
    @NotNull Builder citation(@NotNull CreativeWork.Builder creativeWork);
    @NotNull Builder citation(@NotNull String citation);
    @NotNull Builder comment(@NotNull Comment comment);
    @NotNull Builder comment(@NotNull Comment.Builder comment);
    @NotNull Builder contentLocation(@NotNull Place place);
    @NotNull Builder contentLocation(@NotNull Place.Builder place);
    @NotNull Builder contentRating(@NotNull String contentRating);
    @NotNull Builder contributor(@NotNull Organization organization);
    @NotNull Builder contributor(@NotNull Organization.Builder organization);
    @NotNull Builder contributor(@NotNull Person person);
    @NotNull Builder contributor(@NotNull Person.Builder person);
    @NotNull Builder copyrightHolder(@NotNull Organization organization);
    @NotNull Builder copyrightHolder(@NotNull Organization.Builder organization);
    @NotNull Builder copyrightHolder(@NotNull Person person);
    @NotNull Builder copyrightHolder(@NotNull Person.Builder person);
    @NotNull Builder copyrightYear(@NotNull Integer integer);
    @NotNull Builder copyrightYear(@NotNull Long copyrightYear);
    @NotNull Builder copyrightYear(@NotNull Float copyrightYear);
    @NotNull Builder copyrightYear(@NotNull Double copyrightYear);
    @NotNull Builder copyrightYear(@NotNull String copyrightYear);
    @NotNull Builder creator(@NotNull Organization organization);
    @NotNull Builder creator(@NotNull Organization.Builder organization);
    @NotNull Builder creator(@NotNull Person person);
    @NotNull Builder creator(@NotNull Person.Builder person);
    @NotNull Builder dateCreated(@NotNull java.util.Date date);
    @NotNull Builder dateModified(@NotNull java.util.Date date);
    @NotNull Builder datePublished(@NotNull java.util.Date date);
    @NotNull Builder discussionUrl(@NotNull String discussionUrl);
    @NotNull Builder editor(@NotNull Person person);
    @NotNull Builder editor(@NotNull Person.Builder person);
    @NotNull Builder educationalAlignment(@NotNull AlignmentObject alignmentObject);
    @NotNull Builder educationalAlignment(@NotNull AlignmentObject.Builder alignmentObject);
    @NotNull Builder educationalUse(@NotNull String educationalUse);
    @NotNull Builder encoding(@NotNull MediaObject mediaObject);
    @NotNull Builder encoding(@NotNull MediaObject.Builder mediaObject);
    @NotNull Builder genre(@NotNull String genre);
    @NotNull Builder headline(@NotNull String headline);
    @NotNull Builder inLanguage(@NotNull Language language);
    @NotNull Builder inLanguage(@NotNull Language.Builder language);
    @NotNull Builder inLanguage(@NotNull String inLanguage);
    @NotNull Builder interactivityType(@NotNull String interactivityType);
    @NotNull Builder isBasedOnUrl(@NotNull String isBasedOnUrl);
    @NotNull Builder isFamilyFriendly(@NotNull Boolean isFamilyFriendly);
    @NotNull Builder keywords(@NotNull String keywords);
    @NotNull Builder license(@NotNull CreativeWork creativeWork);
    @NotNull Builder license(@NotNull CreativeWork.Builder creativeWork);
    @NotNull Builder license(@NotNull String license);
    @NotNull Builder learningResourceType(@NotNull String learningResourceType);
    @NotNull Builder mainEntity(@NotNull Thing thing);
    @NotNull Builder mainEntity(@NotNull Thing.Builder thing);
    @NotNull Builder mentions(@NotNull Thing thing);
    @NotNull Builder mentions(@NotNull Thing.Builder thing);
    @NotNull Builder offers(@NotNull Offer offer);
    @NotNull Builder offers(@NotNull Offer.Builder offer);
    @NotNull Builder producer(@NotNull Organization organization);
    @NotNull Builder producer(@NotNull Organization.Builder organization);
    @NotNull Builder producer(@NotNull Person person);
    @NotNull Builder producer(@NotNull Person.Builder person);
    @NotNull Builder publication(@NotNull PublicationEvent publicationEvent);
    @NotNull Builder publication(@NotNull PublicationEvent.Builder publicationEvent);
    @NotNull Builder publisher(@NotNull Organization organization);
    @NotNull Builder publisher(@NotNull Organization.Builder organization);
    @NotNull Builder publishingPrinciples(@NotNull String publishingPrinciples);
    @NotNull Builder recordedAt(@NotNull Event event);
    @NotNull Builder recordedAt(@NotNull Event.Builder event);
    @NotNull Builder review(@NotNull Review review);
    @NotNull Builder review(@NotNull Review.Builder review);
    @NotNull Builder sourceOrganization(@NotNull Organization organization);
    @NotNull Builder sourceOrganization(@NotNull Organization.Builder organization);
    @NotNull Builder text(@NotNull String text);
    @NotNull Builder thumbnailUrl(@NotNull String thumbnailUrl);
    @NotNull Builder timeRequired(@NotNull Duration duration);
    @NotNull Builder timeRequired(@NotNull Duration.Builder duration);
    @NotNull Builder typicalAgeRange(@NotNull String typicalAgeRange);
    @NotNull Builder version(@NotNull Integer integer);
    @NotNull Builder version(@NotNull Long version);
    @NotNull Builder version(@NotNull Float version);
    @NotNull Builder version(@NotNull Double version);
    @NotNull Builder version(@NotNull String version);
    @NotNull Builder video(@NotNull VideoObject videoObject);
    @NotNull Builder video(@NotNull VideoObject.Builder videoObject);
    @NotNull Builder provider(@NotNull Organization organization);
    @NotNull Builder provider(@NotNull Organization.Builder organization);
    @NotNull Builder provider(@NotNull Person person);
    @NotNull Builder provider(@NotNull Person.Builder person);
    @NotNull Builder commentCount(@NotNull Integer integer);
    @NotNull Builder hasPart(@NotNull HasPart hasPart);
    @NotNull Builder workExample(@NotNull CreativeWork creativeWork);
    @NotNull Builder workExample(@NotNull CreativeWork.Builder creativeWork);
    @NotNull Builder exampleOfWork(@NotNull CreativeWork creativeWork);
    @NotNull Builder exampleOfWork(@NotNull CreativeWork.Builder creativeWork);
    @NotNull Builder character(@NotNull Person person);
    @NotNull Builder character(@NotNull Person.Builder person);
    @NotNull Builder translator(@NotNull Organization organization);
    @NotNull Builder translator(@NotNull Organization.Builder organization);
    @NotNull Builder translator(@NotNull Person person);
    @NotNull Builder translator(@NotNull Person.Builder person);
    @NotNull Builder releasedEvent(@NotNull PublicationEvent publicationEvent);
    @NotNull Builder releasedEvent(@NotNull PublicationEvent.Builder publicationEvent);
    @NotNull Builder additionalType(@NotNull String additionalType);
    @NotNull Builder alternateName(@NotNull String alternateName);
    @NotNull Builder description(@NotNull String description);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull String mainEntityOfPage);
    @NotNull Builder name(@NotNull String name);
    @NotNull Builder sameAs(@NotNull String sameAs);
    @NotNull Builder url(@NotNull String url);
    @NotNull Builder potentialAction(@NotNull Action action);
    @NotNull Builder potentialAction(@NotNull Action.Builder action);
    @NotNull Builder id(@NotNull String id);
  }

  protected PublicationIssue(IntegerOrString issueNumber, IntegerOrString pageEnd, IntegerOrString pageStart, String pagination, String schemaVersion, Thing about, String accessibilityAPI, String accessibilityControl, String accessibilityFeature, String accessibilityHazard, Person accountablePerson, AggregateRating aggregateRating, String alternativeHeadline, MediaObject associatedMedia, Audience audience, AudioObject audio, OrganizationOrPerson author, String award, CreativeWorkOrString citation, Comment comment, Place contentLocation, String contentRating, OrganizationOrPerson contributor, OrganizationOrPerson copyrightHolder, Number copyrightYear, OrganizationOrPerson creator, java.util.Date dateCreated, java.util.Date dateModified, java.util.Date datePublished, String discussionUrl, Person editor, AlignmentObject educationalAlignment, String educationalUse, MediaObject encoding, String genre, String headline, LanguageOrString inLanguage, String interactivityType, String isBasedOnUrl, Boolean isFamilyFriendly, String keywords, CreativeWorkOrString license, String learningResourceType, Thing mainEntity, Thing mentions, Offer offers, OrganizationOrPerson producer, PublicationEvent publication, Organization publisher, String publishingPrinciples, Event recordedAt, Review review, Organization sourceOrganization, String text, String thumbnailUrl, Duration timeRequired, String typicalAgeRange, Number version, VideoObject video, OrganizationOrPerson provider, Integer commentCount, HasPart hasPart, CreativeWork workExample, CreativeWork exampleOfWork, Person character, OrganizationOrPerson translator, PublicationEvent releasedEvent, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(schemaVersion, about, accessibilityAPI, accessibilityControl, accessibilityFeature, accessibilityHazard, accountablePerson, aggregateRating, alternativeHeadline, associatedMedia, audience, audio, author, award, citation, comment, contentLocation, contentRating, contributor, copyrightHolder, copyrightYear, creator, dateCreated, dateModified, datePublished, discussionUrl, editor, educationalAlignment, educationalUse, encoding, genre, headline, inLanguage, interactivityType, isBasedOnUrl, isFamilyFriendly, keywords, license, learningResourceType, mainEntity, mentions, offers, producer, publication, publisher, publishingPrinciples, recordedAt, review, sourceOrganization, text, thumbnailUrl, timeRequired, typicalAgeRange, version, video, provider, commentCount, hasPart, workExample, exampleOfWork, character, translator, releasedEvent, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myIssueNumber = issueNumber;
    myPageEnd = pageEnd;
    myPageStart = pageStart;
    myPagination = pagination;
  }
  private IntegerOrString myIssueNumber;
  private IntegerOrString myPageEnd;
  private IntegerOrString myPageStart;
  private String myPagination;
}
