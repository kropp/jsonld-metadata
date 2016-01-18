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
 * A person (alive, dead, undead, or fictional).
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews
 * Equivalent class: http://xmlns.com/foaf/0.1/Person
 */
public class Person extends Thing implements Competitor {
  /**
   * An additional name for a Person, can be used for a middle name.
   */
  public String getAdditionalName() {
    return myAdditionalName;
  }
  /**
   * Physical address of the item.
   */
  public PostalAddress getAddress() {
    return myAddress;
  }
  /**
   * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
   */
  public Organization getAffiliation() {
    return myAffiliation;
  }
  /**
   * An educational organizations that the person is an alumni of.
   */
  public EducationalOrganization getAlumniOf() {
    return myAlumniOf;
  }
  /**
   * An award won by or for this item.
   */
  public String getAward() {
    return myAward;
  }
  /**
   * Date of birth.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getBirthDate() {
    return myBirthDate;
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public BrandOrOrganization getBrand() {
    return myBrand;
  }
  /**
   * A child of the person.
   */
  public Person getChildren() {
    return myChildren;
  }
  /**
   * A colleague of the person.
   */
  public Person getColleague() {
    return myColleague;
  }
  /**
   * A contact point for a person or organization.
   */
  public ContactPoint getContactPoint() {
    return myContactPoint;
  }
  /**
   * Date of death.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getDeathDate() {
    return myDeathDate;
  }
  /**
   * The Dun & Bradstreet DUNS number for identifying an organization or business person.
   */
  public String getDuns() {
    return myDuns;
  }
  /**
   * Email address.
   */
  public String getEmail() {
    return myEmail;
  }
  /**
   * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
   */
  public String getFamilyName() {
    return myFamilyName;
  }
  /**
   * The fax number.
   */
  public String getFaxNumber() {
    return myFaxNumber;
  }
  /**
   * The most generic uni-directional social relation.
   */
  public Person getFollows() {
    return myFollows;
  }
  /**
   * Gender of the person.
   */
  public String getGender() {
    return myGender;
  }
  /**
   * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
   */
  public String getGivenName() {
    return myGivenName;
  }
  /**
   * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  public String getGlobalLocationNumber() {
    return myGlobalLocationNumber;
  }
  /**
   * Points-of-Sales operated by the organization or person.
   */
  public Place getHasPOS() {
    return myHasPOS;
  }
  /**
   * The height of the item.
   */
  public DistanceOrQuantitativeValue getHeight() {
    return myHeight;
  }
  /**
   * A contact location for a person's residence.
   */
  public ContactPointOrPlace getHomeLocation() {
    return myHomeLocation;
  }
  /**
   * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
   */
  public String getHonorificPrefix() {
    return myHonorificPrefix;
  }
  /**
   * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
   */
  public String getHonorificSuffix() {
    return myHonorificSuffix;
  }
  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  public String getIsicV4() {
    return myIsicV4;
  }
  /**
   * The job title of the person (for example, Financial Manager).
   */
  public String getJobTitle() {
    return myJobTitle;
  }
  /**
   * The most generic bi-directional social/work relation.
   */
  public Person getKnows() {
    return myKnows;
  }
  /**
   * A pointer to products or services offered by the organization or person.
   */
  public Offer getMakesOffer() {
    return myMakesOffer;
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  public OrganizationOrProgramMembership getMemberOf() {
    return myMemberOf;
  }
  /**
   * The North American Industry Classification System (NAICS) code for a particular organization or business person.
   */
  public String getNaics() {
    return myNaics;
  }
  /**
   * Nationality of the person.
   */
  public Country getNationality() {
    return myNationality;
  }
  /**
   * The total financial value of the organization or person as calculated by subtracting assets from liabilities.
   */
  public PriceSpecification getNetWorth() {
    return myNetWorth;
  }
  /**
   * Products owned by the organization or person.
   */
  public OwnershipInfoOrProduct getOwns() {
    return myOwns;
  }
  /**
   * A parent of this person.
   */
  public Person getParent() {
    return myParent;
  }
  /**
   * Event that this person is a performer or participant in.
   */
  public Event getPerformerIn() {
    return myPerformerIn;
  }
  /**
   * The most generic familial relation.
   */
  public Person getRelatedTo() {
    return myRelatedTo;
  }
  /**
   * A pointer to products or services sought by the organization or person (demand).
   */
  public Demand getSeeks() {
    return mySeeks;
  }
  /**
   * A sibling of the person.
   */
  public Person getSibling() {
    return mySibling;
  }
  /**
   * The person's spouse.
   */
  public Person getSpouse() {
    return mySpouse;
  }
  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  public String getTaxID() {
    return myTaxID;
  }
  /**
   * The telephone number.
   */
  public String getTelephone() {
    return myTelephone;
  }
  /**
   * The Value-added Tax ID of the organization or person.
   */
  public String getVatID() {
    return myVatID;
  }
  /**
   * The weight of the product or person.
   */
  public QuantitativeValue getWeight() {
    return myWeight;
  }
  /**
   * A contact location for a person's place of work.
   */
  public ContactPointOrPlace getWorkLocation() {
    return myWorkLocation;
  }
  /**
   * Organizations that the person works for.
   */
  public Organization getWorksFor() {
    return myWorksFor;
  }
  /**
   * The place where the person was born.
   */
  public Place getBirthPlace() {
    return myBirthPlace;
  }
  /**
   * The place where the person died.
   */
  public Place getDeathPlace() {
    return myDeathPlace;
  }
  /**
   * Builder for {@link Person}
   */
  static final class PersonThingBuilder implements Builder {
    /**
     * Creates new {@link Person} instance.
     */
    public Person build() {
      return new Person(additionalName, address, affiliation, alumniOf, award, birthDate, brand, children, colleague, contactPoint, deathDate, duns, email, familyName, faxNumber, follows, gender, givenName, globalLocationNumber, hasPOS, height, homeLocation, honorificPrefix, honorificSuffix, isicV4, jobTitle, knows, makesOffer, memberOf, naics, nationality, netWorth, owns, parent, performerIn, relatedTo, seeks, sibling, spouse, taxID, telephone, vatID, weight, workLocation, worksFor, birthPlace, deathPlace, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * An additional name for a Person, can be used for a middle name.
     */
    @NotNull public Builder additionalName(String additionalName) {
      this.additionalName = additionalName;
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(PostalAddress postalAddress) {
      this.address = postalAddress;
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(PostalAddress.Builder postalAddress) {
      return this.address(postalAddress.build());
    }
    /**
     * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
     */
    @NotNull public Builder affiliation(Organization organization) {
      this.affiliation = organization;
      return this;
    }
    /**
     * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
     */
    @NotNull public Builder affiliation(Organization.Builder organization) {
      return this.affiliation(organization.build());
    }
    /**
     * An educational organizations that the person is an alumni of.
     */
    @NotNull public Builder alumniOf(EducationalOrganization educationalOrganization) {
      this.alumniOf = educationalOrganization;
      return this;
    }
    /**
     * An educational organizations that the person is an alumni of.
     */
    @NotNull public Builder alumniOf(EducationalOrganization.Builder educationalOrganization) {
      return this.alumniOf(educationalOrganization.build());
    }
    /**
     * An award won by or for this item.
     */
    @NotNull public Builder award(String award) {
      this.award = award;
      return this;
    }
    /**
     * Date of birth.
     */
    @NotNull public Builder birthDate(java.util.Date date) {
      this.birthDate = date;
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(Brand brand) {
      if (this.brand == null) this.brand = new BrandOrOrganization();
      this.brand.setBrand(brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(Brand.Builder brand) {
      return this.brand(brand.build());
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(Organization organization) {
      if (this.brand == null) this.brand = new BrandOrOrganization();
      this.brand.setOrganization(organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(Organization.Builder organization) {
      return this.brand(organization.build());
    }
    /**
     * A child of the person.
     */
    @NotNull public Builder children(Person person) {
      this.children = person;
      return this;
    }
    /**
     * A child of the person.
     */
    @NotNull public Builder children(Person.Builder person) {
      return this.children(person.build());
    }
    /**
     * A colleague of the person.
     */
    @NotNull public Builder colleague(Person person) {
      this.colleague = person;
      return this;
    }
    /**
     * A colleague of the person.
     */
    @NotNull public Builder colleague(Person.Builder person) {
      return this.colleague(person.build());
    }
    /**
     * A contact point for a person or organization.
     */
    @NotNull public Builder contactPoint(ContactPoint contactPoint) {
      this.contactPoint = contactPoint;
      return this;
    }
    /**
     * A contact point for a person or organization.
     */
    @NotNull public Builder contactPoint(ContactPoint.Builder contactPoint) {
      return this.contactPoint(contactPoint.build());
    }
    /**
     * Date of death.
     */
    @NotNull public Builder deathDate(java.util.Date date) {
      this.deathDate = date;
      return this;
    }
    /**
     * The Dun & Bradstreet DUNS number for identifying an organization or business person.
     */
    @NotNull public Builder duns(String duns) {
      this.duns = duns;
      return this;
    }
    /**
     * Email address.
     */
    @NotNull public Builder email(String email) {
      this.email = email;
      return this;
    }
    /**
     * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
     */
    @NotNull public Builder familyName(String familyName) {
      this.familyName = familyName;
      return this;
    }
    /**
     * The fax number.
     */
    @NotNull public Builder faxNumber(String faxNumber) {
      this.faxNumber = faxNumber;
      return this;
    }
    /**
     * The most generic uni-directional social relation.
     */
    @NotNull public Builder follows(Person person) {
      this.follows = person;
      return this;
    }
    /**
     * The most generic uni-directional social relation.
     */
    @NotNull public Builder follows(Person.Builder person) {
      return this.follows(person.build());
    }
    /**
     * Gender of the person.
     */
    @NotNull public Builder gender(String gender) {
      this.gender = gender;
      return this;
    }
    /**
     * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
     */
    @NotNull public Builder givenName(String givenName) {
      this.givenName = givenName;
      return this;
    }
    /**
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(String globalLocationNumber) {
      this.globalLocationNumber = globalLocationNumber;
      return this;
    }
    /**
     * Points-of-Sales operated by the organization or person.
     */
    @NotNull public Builder hasPOS(Place place) {
      this.hasPOS = place;
      return this;
    }
    /**
     * Points-of-Sales operated by the organization or person.
     */
    @NotNull public Builder hasPOS(Place.Builder place) {
      return this.hasPOS(place.build());
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(Distance distance) {
      if (this.height == null) this.height = new DistanceOrQuantitativeValue();
      this.height.setDistance(distance);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(Distance.Builder distance) {
      return this.height(distance.build());
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(QuantitativeValue quantitativeValue) {
      if (this.height == null) this.height = new DistanceOrQuantitativeValue();
      this.height.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(QuantitativeValue.Builder quantitativeValue) {
      return this.height(quantitativeValue.build());
    }
    /**
     * A contact location for a person's residence.
     */
    @NotNull public Builder homeLocation(ContactPoint contactPoint) {
      if (this.homeLocation == null) this.homeLocation = new ContactPointOrPlace();
      this.homeLocation.setContactPoint(contactPoint);
      return this;
    }
    /**
     * A contact location for a person's residence.
     */
    @NotNull public Builder homeLocation(ContactPoint.Builder contactPoint) {
      return this.homeLocation(contactPoint.build());
    }
    /**
     * A contact location for a person's residence.
     */
    @NotNull public Builder homeLocation(Place place) {
      if (this.homeLocation == null) this.homeLocation = new ContactPointOrPlace();
      this.homeLocation.setPlace(place);
      return this;
    }
    /**
     * A contact location for a person's residence.
     */
    @NotNull public Builder homeLocation(Place.Builder place) {
      return this.homeLocation(place.build());
    }
    /**
     * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
     */
    @NotNull public Builder honorificPrefix(String honorificPrefix) {
      this.honorificPrefix = honorificPrefix;
      return this;
    }
    /**
     * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
     */
    @NotNull public Builder honorificSuffix(String honorificSuffix) {
      this.honorificSuffix = honorificSuffix;
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(String isicV4) {
      this.isicV4 = isicV4;
      return this;
    }
    /**
     * The job title of the person (for example, Financial Manager).
     */
    @NotNull public Builder jobTitle(String jobTitle) {
      this.jobTitle = jobTitle;
      return this;
    }
    /**
     * The most generic bi-directional social/work relation.
     */
    @NotNull public Builder knows(Person person) {
      this.knows = person;
      return this;
    }
    /**
     * The most generic bi-directional social/work relation.
     */
    @NotNull public Builder knows(Person.Builder person) {
      return this.knows(person.build());
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    @NotNull public Builder makesOffer(Offer offer) {
      this.makesOffer = offer;
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    @NotNull public Builder makesOffer(Offer.Builder offer) {
      return this.makesOffer(offer.build());
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(Organization organization) {
      if (this.memberOf == null) this.memberOf = new OrganizationOrProgramMembership();
      this.memberOf.setOrganization(organization);
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(Organization.Builder organization) {
      return this.memberOf(organization.build());
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(ProgramMembership programMembership) {
      if (this.memberOf == null) this.memberOf = new OrganizationOrProgramMembership();
      this.memberOf.setProgramMembership(programMembership);
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(ProgramMembership.Builder programMembership) {
      return this.memberOf(programMembership.build());
    }
    /**
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     */
    @NotNull public Builder naics(String naics) {
      this.naics = naics;
      return this;
    }
    /**
     * Nationality of the person.
     */
    @NotNull public Builder nationality(Country country) {
      this.nationality = country;
      return this;
    }
    /**
     * Nationality of the person.
     */
    @NotNull public Builder nationality(Country.Builder country) {
      return this.nationality(country.build());
    }
    /**
     * The total financial value of the organization or person as calculated by subtracting assets from liabilities.
     */
    @NotNull public Builder netWorth(PriceSpecification priceSpecification) {
      this.netWorth = priceSpecification;
      return this;
    }
    /**
     * The total financial value of the organization or person as calculated by subtracting assets from liabilities.
     */
    @NotNull public Builder netWorth(PriceSpecification.Builder priceSpecification) {
      return this.netWorth(priceSpecification.build());
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(OwnershipInfo ownershipInfo) {
      if (this.owns == null) this.owns = new OwnershipInfoOrProduct();
      this.owns.setOwnershipInfo(ownershipInfo);
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(OwnershipInfo.Builder ownershipInfo) {
      return this.owns(ownershipInfo.build());
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(Product product) {
      if (this.owns == null) this.owns = new OwnershipInfoOrProduct();
      this.owns.setProduct(product);
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(Product.Builder product) {
      return this.owns(product.build());
    }
    /**
     * A parent of this person.
     */
    @NotNull public Builder parent(Person person) {
      this.parent = person;
      return this;
    }
    /**
     * A parent of this person.
     */
    @NotNull public Builder parent(Person.Builder person) {
      return this.parent(person.build());
    }
    /**
     * Event that this person is a performer or participant in.
     */
    @NotNull public Builder performerIn(Event event) {
      this.performerIn = event;
      return this;
    }
    /**
     * Event that this person is a performer or participant in.
     */
    @NotNull public Builder performerIn(Event.Builder event) {
      return this.performerIn(event.build());
    }
    /**
     * The most generic familial relation.
     */
    @NotNull public Builder relatedTo(Person person) {
      this.relatedTo = person;
      return this;
    }
    /**
     * The most generic familial relation.
     */
    @NotNull public Builder relatedTo(Person.Builder person) {
      return this.relatedTo(person.build());
    }
    /**
     * A pointer to products or services sought by the organization or person (demand).
     */
    @NotNull public Builder seeks(Demand demand) {
      this.seeks = demand;
      return this;
    }
    /**
     * A pointer to products or services sought by the organization or person (demand).
     */
    @NotNull public Builder seeks(Demand.Builder demand) {
      return this.seeks(demand.build());
    }
    /**
     * A sibling of the person.
     */
    @NotNull public Builder sibling(Person person) {
      this.sibling = person;
      return this;
    }
    /**
     * A sibling of the person.
     */
    @NotNull public Builder sibling(Person.Builder person) {
      return this.sibling(person.build());
    }
    /**
     * The person's spouse.
     */
    @NotNull public Builder spouse(Person person) {
      this.spouse = person;
      return this;
    }
    /**
     * The person's spouse.
     */
    @NotNull public Builder spouse(Person.Builder person) {
      return this.spouse(person.build());
    }
    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     */
    @NotNull public Builder taxID(String taxID) {
      this.taxID = taxID;
      return this;
    }
    /**
     * The telephone number.
     */
    @NotNull public Builder telephone(String telephone) {
      this.telephone = telephone;
      return this;
    }
    /**
     * The Value-added Tax ID of the organization or person.
     */
    @NotNull public Builder vatID(String vatID) {
      this.vatID = vatID;
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(QuantitativeValue quantitativeValue) {
      this.weight = quantitativeValue;
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(QuantitativeValue.Builder quantitativeValue) {
      return this.weight(quantitativeValue.build());
    }
    /**
     * A contact location for a person's place of work.
     */
    @NotNull public Builder workLocation(ContactPoint contactPoint) {
      if (this.workLocation == null) this.workLocation = new ContactPointOrPlace();
      this.workLocation.setContactPoint(contactPoint);
      return this;
    }
    /**
     * A contact location for a person's place of work.
     */
    @NotNull public Builder workLocation(ContactPoint.Builder contactPoint) {
      return this.workLocation(contactPoint.build());
    }
    /**
     * A contact location for a person's place of work.
     */
    @NotNull public Builder workLocation(Place place) {
      if (this.workLocation == null) this.workLocation = new ContactPointOrPlace();
      this.workLocation.setPlace(place);
      return this;
    }
    /**
     * A contact location for a person's place of work.
     */
    @NotNull public Builder workLocation(Place.Builder place) {
      return this.workLocation(place.build());
    }
    /**
     * Organizations that the person works for.
     */
    @NotNull public Builder worksFor(Organization organization) {
      this.worksFor = organization;
      return this;
    }
    /**
     * Organizations that the person works for.
     */
    @NotNull public Builder worksFor(Organization.Builder organization) {
      return this.worksFor(organization.build());
    }
    /**
     * The place where the person was born.
     */
    @NotNull public Builder birthPlace(Place place) {
      this.birthPlace = place;
      return this;
    }
    /**
     * The place where the person was born.
     */
    @NotNull public Builder birthPlace(Place.Builder place) {
      return this.birthPlace(place.build());
    }
    /**
     * The place where the person died.
     */
    @NotNull public Builder deathPlace(Place place) {
      this.deathPlace = place;
      return this;
    }
    /**
     * The place where the person died.
     */
    @NotNull public Builder deathPlace(Place.Builder place) {
      return this.deathPlace(place.build());
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
    private String additionalName;
    private PostalAddress address;
    private Organization affiliation;
    private EducationalOrganization alumniOf;
    private String award;
    private java.util.Date birthDate;
    private BrandOrOrganization brand;
    private Person children;
    private Person colleague;
    private ContactPoint contactPoint;
    private java.util.Date deathDate;
    private String duns;
    private String email;
    private String familyName;
    private String faxNumber;
    private Person follows;
    private String gender;
    private String givenName;
    private String globalLocationNumber;
    private Place hasPOS;
    private DistanceOrQuantitativeValue height;
    private ContactPointOrPlace homeLocation;
    private String honorificPrefix;
    private String honorificSuffix;
    private String isicV4;
    private String jobTitle;
    private Person knows;
    private Offer makesOffer;
    private OrganizationOrProgramMembership memberOf;
    private String naics;
    private Country nationality;
    private PriceSpecification netWorth;
    private OwnershipInfoOrProduct owns;
    private Person parent;
    private Event performerIn;
    private Person relatedTo;
    private Demand seeks;
    private Person sibling;
    private Person spouse;
    private String taxID;
    private String telephone;
    private String vatID;
    private QuantitativeValue weight;
    private ContactPointOrPlace workLocation;
    private Organization worksFor;
    private Place birthPlace;
    private Place deathPlace;
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
  public interface Builder extends ThingBuilder<Person> {
    @NotNull Builder additionalName(String additionalName);
    @NotNull Builder address(PostalAddress postalAddress);
    @NotNull Builder address(PostalAddress.Builder postalAddress);
    @NotNull Builder affiliation(Organization organization);
    @NotNull Builder affiliation(Organization.Builder organization);
    @NotNull Builder alumniOf(EducationalOrganization educationalOrganization);
    @NotNull Builder alumniOf(EducationalOrganization.Builder educationalOrganization);
    @NotNull Builder award(String award);
    @NotNull Builder birthDate(java.util.Date date);
    @NotNull Builder brand(Brand brand);
    @NotNull Builder brand(Brand.Builder brand);
    @NotNull Builder brand(Organization organization);
    @NotNull Builder brand(Organization.Builder organization);
    @NotNull Builder children(Person person);
    @NotNull Builder children(Person.Builder person);
    @NotNull Builder colleague(Person person);
    @NotNull Builder colleague(Person.Builder person);
    @NotNull Builder contactPoint(ContactPoint contactPoint);
    @NotNull Builder contactPoint(ContactPoint.Builder contactPoint);
    @NotNull Builder deathDate(java.util.Date date);
    @NotNull Builder duns(String duns);
    @NotNull Builder email(String email);
    @NotNull Builder familyName(String familyName);
    @NotNull Builder faxNumber(String faxNumber);
    @NotNull Builder follows(Person person);
    @NotNull Builder follows(Person.Builder person);
    @NotNull Builder gender(String gender);
    @NotNull Builder givenName(String givenName);
    @NotNull Builder globalLocationNumber(String globalLocationNumber);
    @NotNull Builder hasPOS(Place place);
    @NotNull Builder hasPOS(Place.Builder place);
    @NotNull Builder height(Distance distance);
    @NotNull Builder height(Distance.Builder distance);
    @NotNull Builder height(QuantitativeValue quantitativeValue);
    @NotNull Builder height(QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder homeLocation(ContactPoint contactPoint);
    @NotNull Builder homeLocation(ContactPoint.Builder contactPoint);
    @NotNull Builder homeLocation(Place place);
    @NotNull Builder homeLocation(Place.Builder place);
    @NotNull Builder honorificPrefix(String honorificPrefix);
    @NotNull Builder honorificSuffix(String honorificSuffix);
    @NotNull Builder isicV4(String isicV4);
    @NotNull Builder jobTitle(String jobTitle);
    @NotNull Builder knows(Person person);
    @NotNull Builder knows(Person.Builder person);
    @NotNull Builder makesOffer(Offer offer);
    @NotNull Builder makesOffer(Offer.Builder offer);
    @NotNull Builder memberOf(Organization organization);
    @NotNull Builder memberOf(Organization.Builder organization);
    @NotNull Builder memberOf(ProgramMembership programMembership);
    @NotNull Builder memberOf(ProgramMembership.Builder programMembership);
    @NotNull Builder naics(String naics);
    @NotNull Builder nationality(Country country);
    @NotNull Builder nationality(Country.Builder country);
    @NotNull Builder netWorth(PriceSpecification priceSpecification);
    @NotNull Builder netWorth(PriceSpecification.Builder priceSpecification);
    @NotNull Builder owns(OwnershipInfo ownershipInfo);
    @NotNull Builder owns(OwnershipInfo.Builder ownershipInfo);
    @NotNull Builder owns(Product product);
    @NotNull Builder owns(Product.Builder product);
    @NotNull Builder parent(Person person);
    @NotNull Builder parent(Person.Builder person);
    @NotNull Builder performerIn(Event event);
    @NotNull Builder performerIn(Event.Builder event);
    @NotNull Builder relatedTo(Person person);
    @NotNull Builder relatedTo(Person.Builder person);
    @NotNull Builder seeks(Demand demand);
    @NotNull Builder seeks(Demand.Builder demand);
    @NotNull Builder sibling(Person person);
    @NotNull Builder sibling(Person.Builder person);
    @NotNull Builder spouse(Person person);
    @NotNull Builder spouse(Person.Builder person);
    @NotNull Builder taxID(String taxID);
    @NotNull Builder telephone(String telephone);
    @NotNull Builder vatID(String vatID);
    @NotNull Builder weight(QuantitativeValue quantitativeValue);
    @NotNull Builder weight(QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder workLocation(ContactPoint contactPoint);
    @NotNull Builder workLocation(ContactPoint.Builder contactPoint);
    @NotNull Builder workLocation(Place place);
    @NotNull Builder workLocation(Place.Builder place);
    @NotNull Builder worksFor(Organization organization);
    @NotNull Builder worksFor(Organization.Builder organization);
    @NotNull Builder birthPlace(Place place);
    @NotNull Builder birthPlace(Place.Builder place);
    @NotNull Builder deathPlace(Place place);
    @NotNull Builder deathPlace(Place.Builder place);
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

  protected Person(String additionalName, PostalAddress address, Organization affiliation, EducationalOrganization alumniOf, String award, java.util.Date birthDate, BrandOrOrganization brand, Person children, Person colleague, ContactPoint contactPoint, java.util.Date deathDate, String duns, String email, String familyName, String faxNumber, Person follows, String gender, String givenName, String globalLocationNumber, Place hasPOS, DistanceOrQuantitativeValue height, ContactPointOrPlace homeLocation, String honorificPrefix, String honorificSuffix, String isicV4, String jobTitle, Person knows, Offer makesOffer, OrganizationOrProgramMembership memberOf, String naics, Country nationality, PriceSpecification netWorth, OwnershipInfoOrProduct owns, Person parent, Event performerIn, Person relatedTo, Demand seeks, Person sibling, Person spouse, String taxID, String telephone, String vatID, QuantitativeValue weight, ContactPointOrPlace workLocation, Organization worksFor, Place birthPlace, Place deathPlace, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myAdditionalName = additionalName;
    myAddress = address;
    myAffiliation = affiliation;
    myAlumniOf = alumniOf;
    myAward = award;
    myBirthDate = birthDate;
    myBrand = brand;
    myChildren = children;
    myColleague = colleague;
    myContactPoint = contactPoint;
    myDeathDate = deathDate;
    myDuns = duns;
    myEmail = email;
    myFamilyName = familyName;
    myFaxNumber = faxNumber;
    myFollows = follows;
    myGender = gender;
    myGivenName = givenName;
    myGlobalLocationNumber = globalLocationNumber;
    myHasPOS = hasPOS;
    myHeight = height;
    myHomeLocation = homeLocation;
    myHonorificPrefix = honorificPrefix;
    myHonorificSuffix = honorificSuffix;
    myIsicV4 = isicV4;
    myJobTitle = jobTitle;
    myKnows = knows;
    myMakesOffer = makesOffer;
    myMemberOf = memberOf;
    myNaics = naics;
    myNationality = nationality;
    myNetWorth = netWorth;
    myOwns = owns;
    myParent = parent;
    myPerformerIn = performerIn;
    myRelatedTo = relatedTo;
    mySeeks = seeks;
    mySibling = sibling;
    mySpouse = spouse;
    myTaxID = taxID;
    myTelephone = telephone;
    myVatID = vatID;
    myWeight = weight;
    myWorkLocation = workLocation;
    myWorksFor = worksFor;
    myBirthPlace = birthPlace;
    myDeathPlace = deathPlace;
  }
  private String myAdditionalName;
  private PostalAddress myAddress;
  private Organization myAffiliation;
  private EducationalOrganization myAlumniOf;
  private String myAward;
  private java.util.Date myBirthDate;
  private BrandOrOrganization myBrand;
  private Person myChildren;
  private Person myColleague;
  private ContactPoint myContactPoint;
  private java.util.Date myDeathDate;
  private String myDuns;
  private String myEmail;
  private String myFamilyName;
  private String myFaxNumber;
  private Person myFollows;
  private String myGender;
  private String myGivenName;
  private String myGlobalLocationNumber;
  private Place myHasPOS;
  private DistanceOrQuantitativeValue myHeight;
  private ContactPointOrPlace myHomeLocation;
  private String myHonorificPrefix;
  private String myHonorificSuffix;
  private String myIsicV4;
  private String myJobTitle;
  private Person myKnows;
  private Offer myMakesOffer;
  private OrganizationOrProgramMembership myMemberOf;
  private String myNaics;
  private Country myNationality;
  private PriceSpecification myNetWorth;
  private OwnershipInfoOrProduct myOwns;
  private Person myParent;
  private Event myPerformerIn;
  private Person myRelatedTo;
  private Demand mySeeks;
  private Person mySibling;
  private Person mySpouse;
  private String myTaxID;
  private String myTelephone;
  private String myVatID;
  private QuantitativeValue myWeight;
  private ContactPointOrPlace myWorkLocation;
  private Organization myWorksFor;
  private Place myBirthPlace;
  private Place myDeathPlace;
}
