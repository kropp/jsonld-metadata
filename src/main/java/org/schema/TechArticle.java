/*
 * Copyright 2015-2017 JetBrains s.r.o.
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc.
 */
public class TechArticle extends Article {
  /**
   * Prerequisites needed to fulfill steps in article.
   */
  @JsonIgnore public String getDependencies() {
    return (String) getValue("dependencies");
  }
  /**
   * Prerequisites needed to fulfill steps in article.
   */
  @JsonIgnore public Collection<String> getDependenciess() {
    final Object current = myData.get("dependencies");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Proficiency needed for this content; expected values: 'Beginner', 'Expert'.
   */
  @JsonIgnore public String getProficiencyLevel() {
    return (String) getValue("proficiencyLevel");
  }
  /**
   * Proficiency needed for this content; expected values: 'Beginner', 'Expert'.
   */
  @JsonIgnore public Collection<String> getProficiencyLevels() {
    final Object current = myData.get("proficiencyLevel");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected TechArticle(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link TechArticle}
   */
  public static class Builder extends Article.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public TechArticle build() {
      return new TechArticle(myData);
    }
    /**
     * Prerequisites needed to fulfill steps in article.
     */
    @NotNull public Builder dependencies(@NotNull String dependencies) {
      putValue("dependencies", dependencies);
      return this;
    }
    /**
     * Proficiency needed for this content; expected values: 'Beginner', 'Expert'.
     */
    @NotNull public Builder proficiencyLevel(@NotNull String proficiencyLevel) {
      putValue("proficiencyLevel", proficiencyLevel);
      return this;
    }
    /**
     * The actual body of the article.
     */
    @NotNull public Builder articleBody(@NotNull String articleBody) {
      putValue("articleBody", articleBody);
      return this;
    }
    /**
     * Articles may belong to one or more 'sections' in a magazine or newspaper, such as Sports, Lifestyle, etc.
     */
    @NotNull public Builder articleSection(@NotNull String articleSection) {
      putValue("articleSection", articleSection);
      return this;
    }
    /**
     * The number of words in the text of the Article.
     */
    @NotNull public Builder wordCount(@NotNull Integer integer) {
      putValue("wordCount", integer);
      return this;
    }
    /**
     * The page on which the work ends; for example "138" or "xvi".
     */
    @NotNull public Builder pageEnd(@NotNull Integer integer) {
      putValue("pageEnd", integer);
      return this;
    }
    /**
     * The page on which the work ends; for example "138" or "xvi".
     */
    @NotNull public Builder pageEnd(@NotNull String pageEnd) {
      putValue("pageEnd", pageEnd);
      return this;
    }
    /**
     * The page on which the work starts; for example "135" or "xiii".
     */
    @NotNull public Builder pageStart(@NotNull Integer integer) {
      putValue("pageStart", integer);
      return this;
    }
    /**
     * The page on which the work starts; for example "135" or "xiii".
     */
    @NotNull public Builder pageStart(@NotNull String pageStart) {
      putValue("pageStart", pageStart);
      return this;
    }
    /**
     * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
     */
    @NotNull public Builder pagination(@NotNull String pagination) {
      putValue("pagination", pagination);
      return this;
    }
    /**
     * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application. 
     */
    @NotNull public Builder schemaVersion(@NotNull String schemaVersion) {
      putValue("schemaVersion", schemaVersion);
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing thing) {
      putValue("about", thing);
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing.Builder thing) {
      putValue("about", thing.build());
      return this;
    }
    /**
     * Indicates that the resource is compatible with the referenced accessibility API ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     */
    @NotNull public Builder accessibilityAPI(@NotNull String accessibilityAPI) {
      putValue("accessibilityAPI", accessibilityAPI);
      return this;
    }
    /**
     * Identifies input methods that are sufficient to fully control the described resource ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     */
    @NotNull public Builder accessibilityControl(@NotNull String accessibilityControl) {
      putValue("accessibilityControl", accessibilityControl);
      return this;
    }
    /**
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     */
    @NotNull public Builder accessibilityFeature(@NotNull String accessibilityFeature) {
      putValue("accessibilityFeature", accessibilityFeature);
      return this;
    }
    /**
     * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
     */
    @NotNull public Builder accessibilityHazard(@NotNull String accessibilityHazard) {
      putValue("accessibilityHazard", accessibilityHazard);
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    @NotNull public Builder accountablePerson(@NotNull Person person) {
      putValue("accountablePerson", person);
      return this;
    }
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    @NotNull public Builder accountablePerson(@NotNull Person.Builder person) {
      putValue("accountablePerson", person.build());
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * A secondary title of the CreativeWork.
     */
    @NotNull public Builder alternativeHeadline(@NotNull String alternativeHeadline) {
      putValue("alternativeHeadline", alternativeHeadline);
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    @NotNull public Builder associatedMedia(@NotNull MediaObject mediaObject) {
      putValue("associatedMedia", mediaObject);
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    @NotNull public Builder associatedMedia(@NotNull MediaObject.Builder mediaObject) {
      putValue("associatedMedia", mediaObject.build());
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience audience) {
      putValue("audience", audience);
      return this;
    }
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @NotNull public Builder audience(@NotNull Audience.Builder audience) {
      putValue("audience", audience.build());
      return this;
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(@NotNull AudioObject audioObject) {
      putValue("audio", audioObject);
      return this;
    }
    /**
     * An embedded audio object.
     */
    @NotNull public Builder audio(@NotNull AudioObject.Builder audioObject) {
      putValue("audio", audioObject.build());
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Organization organization) {
      putValue("author", organization);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Organization.Builder organization) {
      putValue("author", organization.build());
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Person person) {
      putValue("author", person);
      return this;
    }
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @NotNull public Builder author(@NotNull Person.Builder person) {
      putValue("author", person.build());
      return this;
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(@NotNull CreativeWork creativeWork) {
      putValue("citation", creativeWork);
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(@NotNull CreativeWork.Builder creativeWork) {
      putValue("citation", creativeWork.build());
      return this;
    }
    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @NotNull public Builder citation(@NotNull String citation) {
      putValue("citation", citation);
      return this;
    }
    /**
     * Comments, typically from users.
     */
    @NotNull public Builder comment(@NotNull Comment comment) {
      putValue("comment", comment);
      return this;
    }
    /**
     * Comments, typically from users.
     */
    @NotNull public Builder comment(@NotNull Comment.Builder comment) {
      putValue("comment", comment.build());
      return this;
    }
    /**
     * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
     */
    @NotNull public Builder locationCreated(@NotNull Place place) {
      putValue("locationCreated", place);
      return this;
    }
    /**
     * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
     */
    @NotNull public Builder locationCreated(@NotNull Place.Builder place) {
      putValue("locationCreated", place.build());
      return this;
    }
    /**
     * Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
     */
    @NotNull public Builder contentRating(@NotNull String contentRating) {
      putValue("contentRating", contentRating);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Organization organization) {
      putValue("contributor", organization);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Organization.Builder organization) {
      putValue("contributor", organization.build());
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Person person) {
      putValue("contributor", person);
      return this;
    }
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @NotNull public Builder contributor(@NotNull Person.Builder person) {
      putValue("contributor", person.build());
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Organization organization) {
      putValue("copyrightHolder", organization);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Organization.Builder organization) {
      putValue("copyrightHolder", organization.build());
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Person person) {
      putValue("copyrightHolder", person);
      return this;
    }
    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @NotNull public Builder copyrightHolder(@NotNull Person.Builder person) {
      putValue("copyrightHolder", person.build());
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Integer integer) {
      putValue("copyrightYear", integer);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Long copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Float copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull Double copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @NotNull public Builder copyrightYear(@NotNull String copyrightYear) {
      putValue("copyrightYear", copyrightYear);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Organization organization) {
      putValue("creator", organization);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Organization.Builder organization) {
      putValue("creator", organization.build());
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Person person) {
      putValue("creator", person);
      return this;
    }
    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @NotNull public Builder creator(@NotNull Person.Builder person) {
      putValue("creator", person.build());
      return this;
    }
    /**
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     */
    @NotNull public Builder dateCreated(@NotNull java.util.Date date) {
      putValue("dateCreated", date);
      return this;
    }
    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     */
    @NotNull public Builder dateModified(@NotNull java.util.Date date) {
      putValue("dateModified", date);
      return this;
    }
    /**
     * Date of first broadcast/publication.
     */
    @NotNull public Builder datePublished(@NotNull java.util.Date date) {
      putValue("datePublished", date);
      return this;
    }
    /**
     * A link to the page containing the comments of the CreativeWork.
     */
    @NotNull public Builder discussionUrl(@NotNull String discussionUrl) {
      putValue("discussionUrl", discussionUrl);
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     */
    @NotNull public Builder editor(@NotNull Person person) {
      putValue("editor", person);
      return this;
    }
    /**
     * Specifies the Person who edited the CreativeWork.
     */
    @NotNull public Builder editor(@NotNull Person.Builder person) {
      putValue("editor", person.build());
      return this;
    }
    /**
     * An alignment to an established educational framework.
     */
    @NotNull public Builder educationalAlignment(@NotNull AlignmentObject alignmentObject) {
      putValue("educationalAlignment", alignmentObject);
      return this;
    }
    /**
     * An alignment to an established educational framework.
     */
    @NotNull public Builder educationalAlignment(@NotNull AlignmentObject.Builder alignmentObject) {
      putValue("educationalAlignment", alignmentObject.build());
      return this;
    }
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    @NotNull public Builder educationalUse(@NotNull String educationalUse) {
      putValue("educationalUse", educationalUse);
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    @NotNull public Builder encoding(@NotNull MediaObject mediaObject) {
      putValue("encoding", mediaObject);
      return this;
    }
    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    @NotNull public Builder encoding(@NotNull MediaObject.Builder mediaObject) {
      putValue("encoding", mediaObject.build());
      return this;
    }
    /**
     * Media type, typically MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml)) of the content e.g. application/zip of a SoftwareApplication binary. In cases where a CreativeWork has several media type representations, 'encoding' can be used to indicate each MediaObject alongside particular fileFormat information. Unregistered or niche file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia entry.
     */
    @NotNull public Builder fileFormat(@NotNull String fileFormat) {
      putValue("fileFormat", fileFormat);
      return this;
    }
    /**
     * A flag to signal that the publication is accessible for free.
     */
    @NotNull public Builder isAccessibleForFree(@NotNull Boolean isAccessibleForFree) {
      putValue("isAccessibleForFree", isAccessibleForFree);
      return this;
    }
    /**
     * Genre of the creative work, broadcast channel or group.
     */
    @NotNull public Builder genre(@NotNull String genre) {
      putValue("genre", genre);
      return this;
    }
    /**
     * Headline of the article.
     */
    @NotNull public Builder headline(@NotNull String headline) {
      putValue("headline", headline);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
     */
    @NotNull public Builder interactivityType(@NotNull String interactivityType) {
      putValue("interactivityType", interactivityType);
      return this;
    }
    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    @NotNull public Builder isBasedOn(@NotNull CreativeWork creativeWork) {
      putValue("isBasedOn", creativeWork);
      return this;
    }
    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    @NotNull public Builder isBasedOn(@NotNull CreativeWork.Builder creativeWork) {
      putValue("isBasedOn", creativeWork.build());
      return this;
    }
    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    @NotNull public Builder isBasedOn(@NotNull Product product) {
      putValue("isBasedOn", product);
      return this;
    }
    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    @NotNull public Builder isBasedOn(@NotNull Product.Builder product) {
      putValue("isBasedOn", product.build());
      return this;
    }
    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    @NotNull public Builder isBasedOn(@NotNull String isBasedOn) {
      putValue("isBasedOn", isBasedOn);
      return this;
    }
    /**
     * Indicates whether this content is family friendly.
     */
    @NotNull public Builder isFamilyFriendly(@NotNull Boolean isFamilyFriendly) {
      putValue("isFamilyFriendly", isFamilyFriendly);
      return this;
    }
    /**
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    @NotNull public Builder keywords(@NotNull String keywords) {
      putValue("keywords", keywords);
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(@NotNull CreativeWork creativeWork) {
      putValue("license", creativeWork);
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(@NotNull CreativeWork.Builder creativeWork) {
      putValue("license", creativeWork.build());
      return this;
    }
    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @NotNull public Builder license(@NotNull String license) {
      putValue("license", license);
      return this;
    }
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    @NotNull public Builder learningResourceType(@NotNull String learningResourceType) {
      putValue("learningResourceType", learningResourceType);
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @NotNull public Builder mainEntity(@NotNull Thing thing) {
      putValue("mainEntity", thing);
      return this;
    }
    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @NotNull public Builder mainEntity(@NotNull Thing.Builder thing) {
      putValue("mainEntity", thing.build());
      return this;
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    @NotNull public Builder mentions(@NotNull Thing thing) {
      putValue("mentions", thing);
      return this;
    }
    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    @NotNull public Builder mentions(@NotNull Thing.Builder thing) {
      putValue("mentions", thing.build());
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
     */
    @NotNull public Builder offers(@NotNull Offer offer) {
      putValue("offers", offer);
      return this;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
     */
    @NotNull public Builder offers(@NotNull Offer.Builder offer) {
      putValue("offers", offer.build());
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Organization organization) {
      putValue("producer", organization);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Organization.Builder organization) {
      putValue("producer", organization.build());
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Person person) {
      putValue("producer", person);
      return this;
    }
    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @NotNull public Builder producer(@NotNull Person.Builder person) {
      putValue("producer", person.build());
      return this;
    }
    /**
     * A publication event associated with the item.
     */
    @NotNull public Builder publication(@NotNull PublicationEvent publicationEvent) {
      putValue("publication", publicationEvent);
      return this;
    }
    /**
     * A publication event associated with the item.
     */
    @NotNull public Builder publication(@NotNull PublicationEvent.Builder publicationEvent) {
      putValue("publication", publicationEvent.build());
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(@NotNull Organization organization) {
      putValue("publisher", organization);
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(@NotNull Organization.Builder organization) {
      putValue("publisher", organization.build());
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(@NotNull Person person) {
      putValue("publisher", person);
      return this;
    }
    /**
     * The publisher of the creative work.
     */
    @NotNull public Builder publisher(@NotNull Person.Builder person) {
      putValue("publisher", person.build());
      return this;
    }
    /**
     * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
     */
    @NotNull public Builder publishingPrinciples(@NotNull String publishingPrinciples) {
      putValue("publishingPrinciples", publishingPrinciples);
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    @NotNull public Builder recordedAt(@NotNull Event event) {
      putValue("recordedAt", event);
      return this;
    }
    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    @NotNull public Builder recordedAt(@NotNull Event.Builder event) {
      putValue("recordedAt", event.build());
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    @NotNull public Builder sourceOrganization(@NotNull Organization organization) {
      putValue("sourceOrganization", organization);
      return this;
    }
    /**
     * The Organization on whose behalf the creator was working.
     */
    @NotNull public Builder sourceOrganization(@NotNull Organization.Builder organization) {
      putValue("sourceOrganization", organization.build());
      return this;
    }
    /**
     * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
     *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
     *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
     */
    @NotNull public Builder spatialCoverage(@NotNull Place place) {
      putValue("spatialCoverage", place);
      return this;
    }
    /**
     * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
     *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
     *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
     */
    @NotNull public Builder spatialCoverage(@NotNull Place.Builder place) {
      putValue("spatialCoverage", place.build());
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Organization organization) {
      putValue("funder", organization);
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Organization.Builder organization) {
      putValue("funder", organization.build());
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Person person) {
      putValue("funder", person);
      return this;
    }
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @NotNull public Builder funder(@NotNull Person.Builder person) {
      putValue("funder", person.build());
      return this;
    }
    /**
     * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
     *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
     */
    @NotNull public Builder temporalCoverage(@NotNull String temporalCoverage) {
      putValue("temporalCoverage", temporalCoverage);
      return this;
    }
    /**
     * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
     *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
     */
    @NotNull public Builder temporalCoverage(@NotNull java.util.Date date) {
      putValue("temporalCoverage", date);
      return this;
    }
    /**
     * The textual content of this CreativeWork.
     */
    @NotNull public Builder text(@NotNull String text) {
      putValue("text", text);
      return this;
    }
    /**
     * A thumbnail image relevant to the Thing.
     */
    @NotNull public Builder thumbnailUrl(@NotNull String thumbnailUrl) {
      putValue("thumbnailUrl", thumbnailUrl);
      return this;
    }
    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
     */
    @NotNull public Builder timeRequired(@NotNull Duration duration) {
      putValue("timeRequired", duration);
      return this;
    }
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    @NotNull public Builder typicalAgeRange(@NotNull String typicalAgeRange) {
      putValue("typicalAgeRange", typicalAgeRange);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Integer integer) {
      putValue("version", integer);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Long version) {
      putValue("version", version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Float version) {
      putValue("version", version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull Double version) {
      putValue("version", version);
      return this;
    }
    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @NotNull public Builder version(@NotNull String version) {
      putValue("version", version);
      return this;
    }
    /**
     * An embedded video object.
     */
    @NotNull public Builder video(@NotNull VideoObject videoObject) {
      putValue("video", videoObject);
      return this;
    }
    /**
     * An embedded video object.
     */
    @NotNull public Builder video(@NotNull VideoObject.Builder videoObject) {
      putValue("video", videoObject.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    @NotNull public Builder commentCount(@NotNull Integer integer) {
      putValue("commentCount", integer);
      return this;
    }
    /**
     * Indicates a CreativeWork that is (in some sense) a part of this CreativeWork.
     */
    @NotNull public Builder hasPart(@NotNull HasPart hasPart) {
      putValue("hasPart", hasPart);
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    @NotNull public Builder workExample(@NotNull CreativeWork creativeWork) {
      putValue("workExample", creativeWork);
      return this;
    }
    /**
     * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
     */
    @NotNull public Builder workExample(@NotNull CreativeWork.Builder creativeWork) {
      putValue("workExample", creativeWork.build());
      return this;
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    @NotNull public Builder exampleOfWork(@NotNull CreativeWork creativeWork) {
      putValue("exampleOfWork", creativeWork);
      return this;
    }
    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    @NotNull public Builder exampleOfWork(@NotNull CreativeWork.Builder creativeWork) {
      putValue("exampleOfWork", creativeWork.build());
      return this;
    }
    /**
     * Fictional person connected with a creative work.
     */
    @NotNull public Builder character(@NotNull Person person) {
      putValue("character", person);
      return this;
    }
    /**
     * Fictional person connected with a creative work.
     */
    @NotNull public Builder character(@NotNull Person.Builder person) {
      putValue("character", person.build());
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Organization organization) {
      putValue("translator", organization);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Organization.Builder organization) {
      putValue("translator", organization.build());
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Person person) {
      putValue("translator", person);
      return this;
    }
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @NotNull public Builder translator(@NotNull Person.Builder person) {
      putValue("translator", person.build());
      return this;
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    @NotNull public Builder releasedEvent(@NotNull PublicationEvent publicationEvent) {
      putValue("releasedEvent", publicationEvent);
      return this;
    }
    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    @NotNull public Builder releasedEvent(@NotNull PublicationEvent.Builder publicationEvent) {
      putValue("releasedEvent", publicationEvent.build());
      return this;
    }
    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     */
    @NotNull public Builder interactionStatistic(@NotNull InteractionCounter interactionCounter) {
      putValue("interactionStatistic", interactionCounter);
      return this;
    }
    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     */
    @NotNull public Builder interactionStatistic(@NotNull InteractionCounter.Builder interactionCounter) {
      putValue("interactionStatistic", interactionCounter.build());
      return this;
    }
    /**
     * The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Expected values include: auditory, tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual, diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.
     *       
     */
    @NotNull public Builder accessMode(@NotNull String accessMode) {
      putValue("accessMode", accessMode);
      return this;
    }
    /**
     * A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Expected values include:  auditory, tactile, textual, visual.
     *       
     */
    @NotNull public Builder accessModeSufficient(@NotNull String accessModeSufficient) {
      putValue("accessModeSufficient", accessModeSufficient);
      return this;
    }
    /**
     * A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as "short descriptions are present but long descriptions will be needed for non-visual users" or "short descriptions are present and no long descriptions are needed."
     */
    @NotNull public Builder accessibilitySummary(@NotNull String accessibilitySummary) {
      putValue("accessibilitySummary", accessibilitySummary);
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("dependencies".equals(key) && value instanceof String) { dependencies((String)value); return; }
      if ("dependenciess".equals(key) && value instanceof String) { dependencies((String)value); return; }
      if ("proficiencyLevel".equals(key) && value instanceof String) { proficiencyLevel((String)value); return; }
      if ("proficiencyLevels".equals(key) && value instanceof String) { proficiencyLevel((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
