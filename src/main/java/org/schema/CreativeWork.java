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

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * The most generic kind of creative work, including books, movies, photographs, software programs, etc.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews
 */
public class CreativeWork extends Thing implements WorkFeatured {
  /**
   * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application. 
   */
  @JsonIgnore public String getSchemaVersion() {
    return (String) getValue("schemaVersion");
  }
  /**
   * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application. 
   */
  @JsonIgnore public Collection<String> getSchemaVersions() {
    final Object current = myData.get("schemaVersion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The subject matter of the content.
   */
  @JsonIgnore public Thing getAbout() {
    return (Thing) getValue("about");
  }
  /**
   * The subject matter of the content.
   */
  @JsonIgnore public Collection<Thing> getAbouts() {
    final Object current = myData.get("about");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * Indicates that the resource is compatible with the referenced accessibility API ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public String getAccessibilityAPI() {
    return (String) getValue("accessibilityAPI");
  }
  /**
   * Indicates that the resource is compatible with the referenced accessibility API ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public Collection<String> getAccessibilityAPIs() {
    final Object current = myData.get("accessibilityAPI");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Identifies input methods that are sufficient to fully control the described resource ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public String getAccessibilityControl() {
    return (String) getValue("accessibilityControl");
  }
  /**
   * Identifies input methods that are sufficient to fully control the described resource ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public Collection<String> getAccessibilityControls() {
    final Object current = myData.get("accessibilityControl");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public String getAccessibilityFeature() {
    return (String) getValue("accessibilityFeature");
  }
  /**
   * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public Collection<String> getAccessibilityFeatures() {
    final Object current = myData.get("accessibilityFeature");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public String getAccessibilityHazard() {
    return (String) getValue("accessibilityHazard");
  }
  /**
   * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 ([WebSchemas wiki lists possible values](http://www.w3.org/wiki/WebSchemas/Accessibility)).
   */
  @JsonIgnore public Collection<String> getAccessibilityHazards() {
    final Object current = myData.get("accessibilityHazard");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Specifies the Person that is legally accountable for the CreativeWork.
   */
  @JsonIgnore public Person getAccountablePerson() {
    return (Person) getValue("accountablePerson");
  }
  /**
   * Specifies the Person that is legally accountable for the CreativeWork.
   */
  @JsonIgnore public Collection<Person> getAccountablePersons() {
    final Object current = myData.get("accountablePerson");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  @JsonIgnore public AggregateRating getAggregateRating() {
    return (AggregateRating) getValue("aggregateRating");
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  @JsonIgnore public Collection<AggregateRating> getAggregateRatings() {
    final Object current = myData.get("aggregateRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AggregateRating>) current;
    }
    return Arrays.asList((AggregateRating) current);
  }
  /**
   * A secondary title of the CreativeWork.
   */
  @JsonIgnore public String getAlternativeHeadline() {
    return (String) getValue("alternativeHeadline");
  }
  /**
   * A secondary title of the CreativeWork.
   */
  @JsonIgnore public Collection<String> getAlternativeHeadlines() {
    final Object current = myData.get("alternativeHeadline");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A media object that encodes this CreativeWork. This property is a synonym for encoding.
   */
  @JsonIgnore public MediaObject getAssociatedMedia() {
    return (MediaObject) getValue("associatedMedia");
  }
  /**
   * A media object that encodes this CreativeWork. This property is a synonym for encoding.
   */
  @JsonIgnore public Collection<MediaObject> getAssociatedMedias() {
    final Object current = myData.get("associatedMedia");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MediaObject>) current;
    }
    return Arrays.asList((MediaObject) current);
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   */
  @JsonIgnore public Audience getAudience() {
    return (Audience) getValue("audience");
  }
  /**
   * An intended audience, i.e. a group for whom something was created.
   */
  @JsonIgnore public Collection<Audience> getAudiences() {
    final Object current = myData.get("audience");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Audience>) current;
    }
    return Arrays.asList((Audience) current);
  }
  /**
   * An embedded audio object.
   */
  @JsonIgnore public AudioObject getAudio() {
    return (AudioObject) getValue("audio");
  }
  /**
   * An embedded audio object.
   */
  @JsonIgnore public Collection<AudioObject> getAudios() {
    final Object current = myData.get("audio");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AudioObject>) current;
    }
    return Arrays.asList((AudioObject) current);
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Organization getAuthorOrganization() {
    return (Organization) getValue("author");
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Collection<Organization> getAuthorOrganizations() {
    final Object current = myData.get("author");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Person getAuthorPerson() {
    return (Person) getValue("author");
  }
  /**
   * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
   */
  @JsonIgnore public Collection<Person> getAuthorPersons() {
    final Object current = myData.get("author");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An award won by or for this item.
   */
  @JsonIgnore public String getAward() {
    return (String) getValue("award");
  }
  /**
   * An award won by or for this item.
   */
  @JsonIgnore public Collection<String> getAwards() {
    final Object current = myData.get("award");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   */
  @JsonIgnore public CreativeWork getCitationCreativeWork() {
    return (CreativeWork) getValue("citation");
  }
  /**
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   */
  @JsonIgnore public Collection<CreativeWork> getCitationCreativeWorks() {
    final Object current = myData.get("citation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   */
  @JsonIgnore public String getCitationString() {
    return (String) getValue("citation");
  }
  /**
   * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
   */
  @JsonIgnore public Collection<String> getCitationStrings() {
    final Object current = myData.get("citation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Comments, typically from users.
   */
  @JsonIgnore public Comment getComment() {
    return (Comment) getValue("comment");
  }
  /**
   * Comments, typically from users.
   */
  @JsonIgnore public Collection<Comment> getComments() {
    final Object current = myData.get("comment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Comment>) current;
    }
    return Arrays.asList((Comment) current);
  }
  /**
   * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
   */
  @JsonIgnore public Place getLocationCreated() {
    return (Place) getValue("locationCreated");
  }
  /**
   * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
   */
  @JsonIgnore public Collection<Place> getLocationCreateds() {
    final Object current = myData.get("locationCreated");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
   */
  @JsonIgnore public String getContentRating() {
    return (String) getValue("contentRating");
  }
  /**
   * Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
   */
  @JsonIgnore public Collection<String> getContentRatings() {
    final Object current = myData.get("contentRating");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public Organization getContributorOrganization() {
    return (Organization) getValue("contributor");
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public Collection<Organization> getContributorOrganizations() {
    final Object current = myData.get("contributor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public Person getContributorPerson() {
    return (Person) getValue("contributor");
  }
  /**
   * A secondary contributor to the CreativeWork or Event.
   */
  @JsonIgnore public Collection<Person> getContributorPersons() {
    final Object current = myData.get("contributor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The party holding the legal copyright to the CreativeWork.
   */
  @JsonIgnore public Organization getCopyrightHolderOrganization() {
    return (Organization) getValue("copyrightHolder");
  }
  /**
   * The party holding the legal copyright to the CreativeWork.
   */
  @JsonIgnore public Collection<Organization> getCopyrightHolderOrganizations() {
    final Object current = myData.get("copyrightHolder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The party holding the legal copyright to the CreativeWork.
   */
  @JsonIgnore public Person getCopyrightHolderPerson() {
    return (Person) getValue("copyrightHolder");
  }
  /**
   * The party holding the legal copyright to the CreativeWork.
   */
  @JsonIgnore public Collection<Person> getCopyrightHolderPersons() {
    final Object current = myData.get("copyrightHolder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Integer getCopyrightYearInteger() {
    return (Integer) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Collection<Integer> getCopyrightYearIntegers() {
    final Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Long getCopyrightYearLong() {
    return (Long) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Collection<Long> getCopyrightYearLongs() {
    final Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Float getCopyrightYearFloat() {
    return (Float) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Collection<Float> getCopyrightYearFloats() {
    final Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Double getCopyrightYearDouble() {
    return (Double) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Collection<Double> getCopyrightYearDoubles() {
    final Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public String getCopyrightYearString() {
    return (String) getValue("copyrightYear");
  }
  /**
   * The year during which the claimed copyright for the CreativeWork was first asserted.
   */
  @JsonIgnore public Collection<String> getCopyrightYearStrings() {
    final Object current = myData.get("copyrightYear");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  @JsonIgnore public Organization getCreatorOrganization() {
    return (Organization) getValue("creator");
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  @JsonIgnore public Collection<Organization> getCreatorOrganizations() {
    final Object current = myData.get("creator");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  @JsonIgnore public Person getCreatorPerson() {
    return (Person) getValue("creator");
  }
  /**
   * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
   */
  @JsonIgnore public Collection<Person> getCreatorPersons() {
    final Object current = myData.get("creator");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The date on which the CreativeWork was created or the item was added to a DataFeed.
   */
  @JsonIgnore public java.util.Date getDateCreated() {
    return (java.util.Date) getValue("dateCreated");
  }
  /**
   * The date on which the CreativeWork was created or the item was added to a DataFeed.
   */
  @JsonIgnore public Collection<java.util.Date> getDateCreateds() {
    final Object current = myData.get("dateCreated");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
   */
  @JsonIgnore public java.util.Date getDateModified() {
    return (java.util.Date) getValue("dateModified");
  }
  /**
   * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
   */
  @JsonIgnore public Collection<java.util.Date> getDateModifieds() {
    final Object current = myData.get("dateModified");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * Date of first broadcast/publication.
   */
  @JsonIgnore public java.util.Date getDatePublished() {
    return (java.util.Date) getValue("datePublished");
  }
  /**
   * Date of first broadcast/publication.
   */
  @JsonIgnore public Collection<java.util.Date> getDatePublisheds() {
    final Object current = myData.get("datePublished");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * A link to the page containing the comments of the CreativeWork.
   */
  @JsonIgnore public String getDiscussionUrl() {
    return (String) getValue("discussionUrl");
  }
  /**
   * A link to the page containing the comments of the CreativeWork.
   */
  @JsonIgnore public Collection<String> getDiscussionUrls() {
    final Object current = myData.get("discussionUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Specifies the Person who edited the CreativeWork.
   */
  @JsonIgnore public Person getEditor() {
    return (Person) getValue("editor");
  }
  /**
   * Specifies the Person who edited the CreativeWork.
   */
  @JsonIgnore public Collection<Person> getEditors() {
    final Object current = myData.get("editor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An alignment to an established educational framework.
   */
  @JsonIgnore public AlignmentObject getEducationalAlignment() {
    return (AlignmentObject) getValue("educationalAlignment");
  }
  /**
   * An alignment to an established educational framework.
   */
  @JsonIgnore public Collection<AlignmentObject> getEducationalAlignments() {
    final Object current = myData.get("educationalAlignment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<AlignmentObject>) current;
    }
    return Arrays.asList((AlignmentObject) current);
  }
  /**
   * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
   */
  @JsonIgnore public String getEducationalUse() {
    return (String) getValue("educationalUse");
  }
  /**
   * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
   */
  @JsonIgnore public Collection<String> getEducationalUses() {
    final Object current = myData.get("educationalUse");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
   */
  @JsonIgnore public MediaObject getEncoding() {
    return (MediaObject) getValue("encoding");
  }
  /**
   * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
   */
  @JsonIgnore public Collection<MediaObject> getEncodings() {
    final Object current = myData.get("encoding");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MediaObject>) current;
    }
    return Arrays.asList((MediaObject) current);
  }
  /**
   * Media type, typically MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml)) of the content e.g. application/zip of a SoftwareApplication binary. In cases where a CreativeWork has several media type representations, 'encoding' can be used to indicate each MediaObject alongside particular fileFormat information. Unregistered or niche file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia entry.
   */
  @JsonIgnore public String getFileFormat() {
    return (String) getValue("fileFormat");
  }
  /**
   * Media type, typically MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml)) of the content e.g. application/zip of a SoftwareApplication binary. In cases where a CreativeWork has several media type representations, 'encoding' can be used to indicate each MediaObject alongside particular fileFormat information. Unregistered or niche file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia entry.
   */
  @JsonIgnore public Collection<String> getFileFormats() {
    final Object current = myData.get("fileFormat");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A flag to signal that the publication is accessible for free.
   */
  @JsonIgnore public Boolean getIsAccessibleForFree() {
    return (Boolean) getValue("isAccessibleForFree");
  }
  /**
   * A flag to signal that the publication is accessible for free.
   */
  @JsonIgnore public Collection<Boolean> getIsAccessibleForFrees() {
    final Object current = myData.get("isAccessibleForFree");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Genre of the creative work, broadcast channel or group.
   */
  @JsonIgnore public String getGenre() {
    return (String) getValue("genre");
  }
  /**
   * Genre of the creative work, broadcast channel or group.
   */
  @JsonIgnore public Collection<String> getGenres() {
    final Object current = myData.get("genre");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Headline of the article.
   */
  @JsonIgnore public String getHeadline() {
    return (String) getValue("headline");
  }
  /**
   * Headline of the article.
   */
  @JsonIgnore public Collection<String> getHeadlines() {
    final Object current = myData.get("headline");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public Language getInLanguageLanguage() {
    return (Language) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public Collection<Language> getInLanguageLanguages() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Language>) current;
    }
    return Arrays.asList((Language) current);
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public String getInLanguageString() {
    return (String) getValue("inLanguage");
  }
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
   */
  @JsonIgnore public Collection<String> getInLanguageStrings() {
    final Object current = myData.get("inLanguage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
   */
  @JsonIgnore public String getInteractivityType() {
    return (String) getValue("interactivityType");
  }
  /**
   * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
   */
  @JsonIgnore public Collection<String> getInteractivityTypes() {
    final Object current = myData.get("interactivityType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
   */
  @JsonIgnore public CreativeWork getIsBasedOnCreativeWork() {
    return (CreativeWork) getValue("isBasedOn");
  }
  /**
   * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
   */
  @JsonIgnore public Collection<CreativeWork> getIsBasedOnCreativeWorks() {
    final Object current = myData.get("isBasedOn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
   */
  @JsonIgnore public Product getIsBasedOnProduct() {
    return (Product) getValue("isBasedOn");
  }
  /**
   * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
   */
  @JsonIgnore public Collection<Product> getIsBasedOnProducts() {
    final Object current = myData.get("isBasedOn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
   */
  @JsonIgnore public String getIsBasedOnString() {
    return (String) getValue("isBasedOn");
  }
  /**
   * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
   */
  @JsonIgnore public Collection<String> getIsBasedOnStrings() {
    final Object current = myData.get("isBasedOn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates whether this content is family friendly.
   */
  @JsonIgnore public Boolean getIsFamilyFriendly() {
    return (Boolean) getValue("isFamilyFriendly");
  }
  /**
   * Indicates whether this content is family friendly.
   */
  @JsonIgnore public Collection<Boolean> getIsFamilyFriendlys() {
    final Object current = myData.get("isFamilyFriendly");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   */
  @JsonIgnore public String getKeywords() {
    return (String) getValue("keywords");
  }
  /**
   * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
   */
  @JsonIgnore public Collection<String> getKeywordss() {
    final Object current = myData.get("keywords");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A license document that applies to this content, typically indicated by URL.
   */
  @JsonIgnore public CreativeWork getLicenseCreativeWork() {
    return (CreativeWork) getValue("license");
  }
  /**
   * A license document that applies to this content, typically indicated by URL.
   */
  @JsonIgnore public Collection<CreativeWork> getLicenseCreativeWorks() {
    final Object current = myData.get("license");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A license document that applies to this content, typically indicated by URL.
   */
  @JsonIgnore public String getLicenseString() {
    return (String) getValue("license");
  }
  /**
   * A license document that applies to this content, typically indicated by URL.
   */
  @JsonIgnore public Collection<String> getLicenseStrings() {
    final Object current = myData.get("license");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
   */
  @JsonIgnore public String getLearningResourceType() {
    return (String) getValue("learningResourceType");
  }
  /**
   * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
   */
  @JsonIgnore public Collection<String> getLearningResourceTypes() {
    final Object current = myData.get("learningResourceType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates the primary entity described in some page or other CreativeWork.
   */
  @JsonIgnore public Thing getMainEntity() {
    return (Thing) getValue("mainEntity");
  }
  /**
   * Indicates the primary entity described in some page or other CreativeWork.
   */
  @JsonIgnore public Collection<Thing> getMainEntitys() {
    final Object current = myData.get("mainEntity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
   */
  @JsonIgnore public Thing getMentions() {
    return (Thing) getValue("mentions");
  }
  /**
   * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
   */
  @JsonIgnore public Collection<Thing> getMentionss() {
    final Object current = myData.get("mentions");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
   */
  @JsonIgnore public Offer getOffers() {
    return (Offer) getValue("offers");
  }
  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
   */
  @JsonIgnore public Collection<Offer> getOfferss() {
    final Object current = myData.get("offers");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
   */
  @JsonIgnore public Organization getProducerOrganization() {
    return (Organization) getValue("producer");
  }
  /**
   * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
   */
  @JsonIgnore public Collection<Organization> getProducerOrganizations() {
    final Object current = myData.get("producer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
   */
  @JsonIgnore public Person getProducerPerson() {
    return (Person) getValue("producer");
  }
  /**
   * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
   */
  @JsonIgnore public Collection<Person> getProducerPersons() {
    final Object current = myData.get("producer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A publication event associated with the item.
   */
  @JsonIgnore public PublicationEvent getPublication() {
    return (PublicationEvent) getValue("publication");
  }
  /**
   * A publication event associated with the item.
   */
  @JsonIgnore public Collection<PublicationEvent> getPublications() {
    final Object current = myData.get("publication");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PublicationEvent>) current;
    }
    return Arrays.asList((PublicationEvent) current);
  }
  /**
   * The publisher of the creative work.
   */
  @JsonIgnore public Organization getPublisherOrganization() {
    return (Organization) getValue("publisher");
  }
  /**
   * The publisher of the creative work.
   */
  @JsonIgnore public Collection<Organization> getPublisherOrganizations() {
    final Object current = myData.get("publisher");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The publisher of the creative work.
   */
  @JsonIgnore public Person getPublisherPerson() {
    return (Person) getValue("publisher");
  }
  /**
   * The publisher of the creative work.
   */
  @JsonIgnore public Collection<Person> getPublisherPersons() {
    final Object current = myData.get("publisher");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
   */
  @JsonIgnore public String getPublishingPrinciples() {
    return (String) getValue("publishingPrinciples");
  }
  /**
   * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
   */
  @JsonIgnore public Collection<String> getPublishingPrincipless() {
    final Object current = myData.get("publishingPrinciples");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
   */
  @JsonIgnore public Event getRecordedAt() {
    return (Event) getValue("recordedAt");
  }
  /**
   * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
   */
  @JsonIgnore public Collection<Event> getRecordedAts() {
    final Object current = myData.get("recordedAt");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * A review of the item.
   */
  @JsonIgnore public Review getReview() {
    return (Review) getValue("review");
  }
  /**
   * A review of the item.
   */
  @JsonIgnore public Collection<Review> getReviews() {
    final Object current = myData.get("review");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Review>) current;
    }
    return Arrays.asList((Review) current);
  }
  /**
   * The Organization on whose behalf the creator was working.
   */
  @JsonIgnore public Organization getSourceOrganization() {
    return (Organization) getValue("sourceOrganization");
  }
  /**
   * The Organization on whose behalf the creator was working.
   */
  @JsonIgnore public Collection<Organization> getSourceOrganizations() {
    final Object current = myData.get("sourceOrganization");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
   *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
   *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
   */
  @JsonIgnore public Place getSpatialCoverage() {
    return (Place) getValue("spatialCoverage");
  }
  /**
   * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
   *       contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
   *       areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
   */
  @JsonIgnore public Collection<Place> getSpatialCoverages() {
    final Object current = myData.get("spatialCoverage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Organization getFunderOrganization() {
    return (Organization) getValue("funder");
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Collection<Organization> getFunderOrganizations() {
    final Object current = myData.get("funder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Person getFunderPerson() {
    return (Person) getValue("funder");
  }
  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution.
   */
  @JsonIgnore public Collection<Person> getFunderPersons() {
    final Object current = myData.get("funder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
   */
  @JsonIgnore public String getTemporalCoverageString() {
    return (String) getValue("temporalCoverage");
  }
  /**
   * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
   */
  @JsonIgnore public Collection<String> getTemporalCoverageStrings() {
    final Object current = myData.get("temporalCoverage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
   */
  @JsonIgnore public java.util.Date getTemporalCoverageDate() {
    return (java.util.Date) getValue("temporalCoverage");
  }
  /**
   * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
   *       the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
   *       Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
   */
  @JsonIgnore public Collection<java.util.Date> getTemporalCoverageDates() {
    final Object current = myData.get("temporalCoverage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The textual content of this CreativeWork.
   */
  @JsonIgnore public String getText() {
    return (String) getValue("text");
  }
  /**
   * The textual content of this CreativeWork.
   */
  @JsonIgnore public Collection<String> getTexts() {
    final Object current = myData.get("text");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A thumbnail image relevant to the Thing.
   */
  @JsonIgnore public String getThumbnailUrl() {
    return (String) getValue("thumbnailUrl");
  }
  /**
   * A thumbnail image relevant to the Thing.
   */
  @JsonIgnore public Collection<String> getThumbnailUrls() {
    final Object current = myData.get("thumbnailUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
   */
  @JsonIgnore public Duration getTimeRequired() {
    return (Duration) getValue("timeRequired");
  }
  /**
   * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
   */
  @JsonIgnore public Collection<Duration> getTimeRequireds() {
    final Object current = myData.get("timeRequired");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Duration>) current;
    }
    return Arrays.asList((Duration) current);
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   */
  @JsonIgnore public String getTypicalAgeRange() {
    return (String) getValue("typicalAgeRange");
  }
  /**
   * The typical expected age range, e.g. '7-9', '11-'.
   */
  @JsonIgnore public Collection<String> getTypicalAgeRanges() {
    final Object current = myData.get("typicalAgeRange");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Integer getVersionInteger() {
    return (Integer) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Collection<Integer> getVersionIntegers() {
    final Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Long getVersionLong() {
    return (Long) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Collection<Long> getVersionLongs() {
    final Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Float getVersionFloat() {
    return (Float) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Collection<Float> getVersionFloats() {
    final Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Double getVersionDouble() {
    return (Double) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Collection<Double> getVersionDoubles() {
    final Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public String getVersionString() {
    return (String) getValue("version");
  }
  /**
   * The version of the CreativeWork embodied by a specified resource.
   */
  @JsonIgnore public Collection<String> getVersionStrings() {
    final Object current = myData.get("version");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An embedded video object.
   */
  @JsonIgnore public VideoObject getVideo() {
    return (VideoObject) getValue("video");
  }
  /**
   * An embedded video object.
   */
  @JsonIgnore public Collection<VideoObject> getVideos() {
    final Object current = myData.get("video");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<VideoObject>) current;
    }
    return Arrays.asList((VideoObject) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Organization getProviderOrganization() {
    return (Organization) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Collection<Organization> getProviderOrganizations() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Person getProviderPerson() {
    return (Person) getValue("provider");
  }
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  @JsonIgnore public Collection<Person> getProviderPersons() {
    final Object current = myData.get("provider");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
   */
  @JsonIgnore public Integer getCommentCount() {
    return (Integer) getValue("commentCount");
  }
  /**
   * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
   */
  @JsonIgnore public Collection<Integer> getCommentCounts() {
    final Object current = myData.get("commentCount");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Indicates a CreativeWork that is (in some sense) a part of this CreativeWork.
   */
  @JsonIgnore public HasPart getHasPart() {
    return (HasPart) getValue("hasPart");
  }
  /**
   * Indicates a CreativeWork that is (in some sense) a part of this CreativeWork.
   */
  @JsonIgnore public Collection<HasPart> getHasParts() {
    final Object current = myData.get("hasPart");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<HasPart>) current;
    }
    return Arrays.asList((HasPart) current);
  }
  /**
   * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
   */
  @JsonIgnore public CreativeWork getWorkExample() {
    return (CreativeWork) getValue("workExample");
  }
  /**
   * Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.
   */
  @JsonIgnore public Collection<CreativeWork> getWorkExamples() {
    final Object current = myData.get("workExample");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * A creative work that this work is an example/instance/realization/derivation of.
   */
  @JsonIgnore public CreativeWork getExampleOfWork() {
    return (CreativeWork) getValue("exampleOfWork");
  }
  /**
   * A creative work that this work is an example/instance/realization/derivation of.
   */
  @JsonIgnore public Collection<CreativeWork> getExampleOfWorks() {
    final Object current = myData.get("exampleOfWork");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CreativeWork>) current;
    }
    return Arrays.asList((CreativeWork) current);
  }
  /**
   * Fictional person connected with a creative work.
   */
  @JsonIgnore public Person getCharacter() {
    return (Person) getValue("character");
  }
  /**
   * Fictional person connected with a creative work.
   */
  @JsonIgnore public Collection<Person> getCharacters() {
    final Object current = myData.get("character");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public Organization getTranslatorOrganization() {
    return (Organization) getValue("translator");
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public Collection<Organization> getTranslatorOrganizations() {
    final Object current = myData.get("translator");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public Person getTranslatorPerson() {
    return (Person) getValue("translator");
  }
  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
   */
  @JsonIgnore public Collection<Person> getTranslatorPersons() {
    final Object current = myData.get("translator");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The place and time the release was issued, expressed as a PublicationEvent.
   */
  @JsonIgnore public PublicationEvent getReleasedEvent() {
    return (PublicationEvent) getValue("releasedEvent");
  }
  /**
   * The place and time the release was issued, expressed as a PublicationEvent.
   */
  @JsonIgnore public Collection<PublicationEvent> getReleasedEvents() {
    final Object current = myData.get("releasedEvent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PublicationEvent>) current;
    }
    return Arrays.asList((PublicationEvent) current);
  }
  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   */
  @JsonIgnore public InteractionCounter getInteractionStatistic() {
    return (InteractionCounter) getValue("interactionStatistic");
  }
  /**
   * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
   */
  @JsonIgnore public Collection<InteractionCounter> getInteractionStatistics() {
    final Object current = myData.get("interactionStatistic");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<InteractionCounter>) current;
    }
    return Arrays.asList((InteractionCounter) current);
  }
  protected CreativeWork(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link CreativeWork}
   */
  public static class Builder extends Thing.Builder {
    @NotNull public CreativeWork build() {
      return new CreativeWork(myData);
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
      putValue("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("schemaVersion".equals(key) && value instanceof String) { schemaVersion((String)value); return; }
      if ("about".equals(key) && value instanceof Thing) { about((Thing)value); return; }
      if ("accessibilityAPI".equals(key) && value instanceof String) { accessibilityAPI((String)value); return; }
      if ("accessibilityControl".equals(key) && value instanceof String) { accessibilityControl((String)value); return; }
      if ("accessibilityFeature".equals(key) && value instanceof String) { accessibilityFeature((String)value); return; }
      if ("accessibilityHazard".equals(key) && value instanceof String) { accessibilityHazard((String)value); return; }
      if ("accountablePerson".equals(key) && value instanceof Person) { accountablePerson((Person)value); return; }
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); return; }
      if ("alternativeHeadline".equals(key) && value instanceof String) { alternativeHeadline((String)value); return; }
      if ("associatedMedia".equals(key) && value instanceof MediaObject) { associatedMedia((MediaObject)value); return; }
      if ("audience".equals(key) && value instanceof Audience) { audience((Audience)value); return; }
      if ("audio".equals(key) && value instanceof AudioObject) { audio((AudioObject)value); return; }
      if ("author".equals(key) && value instanceof Organization) { author((Organization)value); return; }
      if ("author".equals(key) && value instanceof Person) { author((Person)value); return; }
      if ("award".equals(key) && value instanceof String) { award((String)value); return; }
      if ("citation".equals(key) && value instanceof CreativeWork) { citation((CreativeWork)value); return; }
      if ("citation".equals(key) && value instanceof String) { citation((String)value); return; }
      if ("comment".equals(key) && value instanceof Comment) { comment((Comment)value); return; }
      if ("locationCreated".equals(key) && value instanceof Place) { locationCreated((Place)value); return; }
      if ("contentRating".equals(key) && value instanceof String) { contentRating((String)value); return; }
      if ("contributor".equals(key) && value instanceof Organization) { contributor((Organization)value); return; }
      if ("contributor".equals(key) && value instanceof Person) { contributor((Person)value); return; }
      if ("copyrightHolder".equals(key) && value instanceof Organization) { copyrightHolder((Organization)value); return; }
      if ("copyrightHolder".equals(key) && value instanceof Person) { copyrightHolder((Person)value); return; }
      if ("copyrightYear".equals(key) && value instanceof Integer) { copyrightYear((Integer)value); return; }
      if ("copyrightYear".equals(key) && value instanceof Long) { copyrightYear((Long)value); return; }
      if ("copyrightYear".equals(key) && value instanceof Float) { copyrightYear((Float)value); return; }
      if ("copyrightYear".equals(key) && value instanceof Double) { copyrightYear((Double)value); return; }
      if ("copyrightYear".equals(key) && value instanceof String) { copyrightYear((String)value); return; }
      if ("creator".equals(key) && value instanceof Organization) { creator((Organization)value); return; }
      if ("creator".equals(key) && value instanceof Person) { creator((Person)value); return; }
      if ("dateCreated".equals(key) && value instanceof java.util.Date) { dateCreated((java.util.Date)value); return; }
      if ("dateModified".equals(key) && value instanceof java.util.Date) { dateModified((java.util.Date)value); return; }
      if ("datePublished".equals(key) && value instanceof java.util.Date) { datePublished((java.util.Date)value); return; }
      if ("discussionUrl".equals(key) && value instanceof String) { discussionUrl((String)value); return; }
      if ("editor".equals(key) && value instanceof Person) { editor((Person)value); return; }
      if ("educationalAlignment".equals(key) && value instanceof AlignmentObject) { educationalAlignment((AlignmentObject)value); return; }
      if ("educationalUse".equals(key) && value instanceof String) { educationalUse((String)value); return; }
      if ("encoding".equals(key) && value instanceof MediaObject) { encoding((MediaObject)value); return; }
      if ("fileFormat".equals(key) && value instanceof String) { fileFormat((String)value); return; }
      if ("isAccessibleForFree".equals(key) && value instanceof Boolean) { isAccessibleForFree((Boolean)value); return; }
      if ("genre".equals(key) && value instanceof String) { genre((String)value); return; }
      if ("headline".equals(key) && value instanceof String) { headline((String)value); return; }
      if ("inLanguage".equals(key) && value instanceof Language) { inLanguage((Language)value); return; }
      if ("inLanguage".equals(key) && value instanceof String) { inLanguage((String)value); return; }
      if ("interactivityType".equals(key) && value instanceof String) { interactivityType((String)value); return; }
      if ("isBasedOn".equals(key) && value instanceof CreativeWork) { isBasedOn((CreativeWork)value); return; }
      if ("isBasedOn".equals(key) && value instanceof Product) { isBasedOn((Product)value); return; }
      if ("isBasedOn".equals(key) && value instanceof String) { isBasedOn((String)value); return; }
      if ("isFamilyFriendly".equals(key) && value instanceof Boolean) { isFamilyFriendly((Boolean)value); return; }
      if ("keywords".equals(key) && value instanceof String) { keywords((String)value); return; }
      if ("license".equals(key) && value instanceof CreativeWork) { license((CreativeWork)value); return; }
      if ("license".equals(key) && value instanceof String) { license((String)value); return; }
      if ("learningResourceType".equals(key) && value instanceof String) { learningResourceType((String)value); return; }
      if ("mainEntity".equals(key) && value instanceof Thing) { mainEntity((Thing)value); return; }
      if ("mentions".equals(key) && value instanceof Thing) { mentions((Thing)value); return; }
      if ("offers".equals(key) && value instanceof Offer) { offers((Offer)value); return; }
      if ("producer".equals(key) && value instanceof Organization) { producer((Organization)value); return; }
      if ("producer".equals(key) && value instanceof Person) { producer((Person)value); return; }
      if ("publication".equals(key) && value instanceof PublicationEvent) { publication((PublicationEvent)value); return; }
      if ("publisher".equals(key) && value instanceof Organization) { publisher((Organization)value); return; }
      if ("publisher".equals(key) && value instanceof Person) { publisher((Person)value); return; }
      if ("publishingPrinciples".equals(key) && value instanceof String) { publishingPrinciples((String)value); return; }
      if ("recordedAt".equals(key) && value instanceof Event) { recordedAt((Event)value); return; }
      if ("review".equals(key) && value instanceof Review) { review((Review)value); return; }
      if ("sourceOrganization".equals(key) && value instanceof Organization) { sourceOrganization((Organization)value); return; }
      if ("spatialCoverage".equals(key) && value instanceof Place) { spatialCoverage((Place)value); return; }
      if ("funder".equals(key) && value instanceof Organization) { funder((Organization)value); return; }
      if ("funder".equals(key) && value instanceof Person) { funder((Person)value); return; }
      if ("temporalCoverage".equals(key) && value instanceof String) { temporalCoverage((String)value); return; }
      if ("temporalCoverage".equals(key) && value instanceof java.util.Date) { temporalCoverage((java.util.Date)value); return; }
      if ("text".equals(key) && value instanceof String) { text((String)value); return; }
      if ("thumbnailUrl".equals(key) && value instanceof String) { thumbnailUrl((String)value); return; }
      if ("timeRequired".equals(key) && value instanceof Duration) { timeRequired((Duration)value); return; }
      if ("typicalAgeRange".equals(key) && value instanceof String) { typicalAgeRange((String)value); return; }
      if ("version".equals(key) && value instanceof Integer) { version((Integer)value); return; }
      if ("version".equals(key) && value instanceof Long) { version((Long)value); return; }
      if ("version".equals(key) && value instanceof Float) { version((Float)value); return; }
      if ("version".equals(key) && value instanceof Double) { version((Double)value); return; }
      if ("version".equals(key) && value instanceof String) { version((String)value); return; }
      if ("video".equals(key) && value instanceof VideoObject) { video((VideoObject)value); return; }
      if ("provider".equals(key) && value instanceof Organization) { provider((Organization)value); return; }
      if ("provider".equals(key) && value instanceof Person) { provider((Person)value); return; }
      if ("commentCount".equals(key) && value instanceof Integer) { commentCount((Integer)value); return; }
      if ("hasPart".equals(key) && value instanceof HasPart) { hasPart((HasPart)value); return; }
      if ("workExample".equals(key) && value instanceof CreativeWork) { workExample((CreativeWork)value); return; }
      if ("exampleOfWork".equals(key) && value instanceof CreativeWork) { exampleOfWork((CreativeWork)value); return; }
      if ("character".equals(key) && value instanceof Person) { character((Person)value); return; }
      if ("translator".equals(key) && value instanceof Organization) { translator((Organization)value); return; }
      if ("translator".equals(key) && value instanceof Person) { translator((Person)value); return; }
      if ("releasedEvent".equals(key) && value instanceof PublicationEvent) { releasedEvent((PublicationEvent)value); return; }
      if ("interactionStatistic".equals(key) && value instanceof InteractionCounter) { interactionStatistic((InteractionCounter)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
