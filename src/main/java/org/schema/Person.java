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
 * A person (alive, dead, undead, or fictional).Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNewsEquivalent class: http://xmlns.com/foaf/0.1/Person
 */
public class Person extends Thing implements Competitor {
  /**
   * An additional name for a Person, can be used for a middle name.
   */
  @JsonIgnore public String getAdditionalName() {
    return (String) getValue("additionalName");
  }
  /**
   * An additional name for a Person, can be used for a middle name.
   */
  @JsonIgnore public Collection<String> getAdditionalNames() {
    final Object current = myData.get("additionalName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public PostalAddress getAddressPostalAddress() {
    return (PostalAddress) getValue("address");
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public Collection<PostalAddress> getAddressPostalAddresss() {
    final Object current = myData.get("address");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public String getAddressString() {
    return (String) getValue("address");
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public Collection<String> getAddressStrings() {
    final Object current = myData.get("address");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
   */
  @JsonIgnore public MemberOf getAffiliation() {
    return (MemberOf) getValue("affiliation");
  }
  /**
   * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
   */
  @JsonIgnore public Collection<MemberOf> getAffiliations() {
    final Object current = myData.get("affiliation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MemberOf>) current;
    }
    return Arrays.asList((MemberOf) current);
  }
  /**
   * An organization that the person is an alumni of.
   */
  @JsonIgnore public EducationalOrganization getAlumniOfEducationalOrganization() {
    return (EducationalOrganization) getValue("alumniOf");
  }
  /**
   * An organization that the person is an alumni of.
   */
  @JsonIgnore public Collection<EducationalOrganization> getAlumniOfEducationalOrganizations() {
    final Object current = myData.get("alumniOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<EducationalOrganization>) current;
    }
    return Arrays.asList((EducationalOrganization) current);
  }
  /**
   * An organization that the person is an alumni of.
   */
  @JsonIgnore public Organization getAlumniOfOrganization() {
    return (Organization) getValue("alumniOf");
  }
  /**
   * An organization that the person is an alumni of.
   */
  @JsonIgnore public Collection<Organization> getAlumniOfOrganizations() {
    final Object current = myData.get("alumniOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
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
   * Date of birth.
   */
  @JsonIgnore public java.util.Date getBirthDate() {
    return (java.util.Date) getValue("birthDate");
  }
  /**
   * Date of birth.
   */
  @JsonIgnore public Collection<java.util.Date> getBirthDates() {
    final Object current = myData.get("birthDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public Brand getBrandBrand() {
    return (Brand) getValue("brand");
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public Collection<Brand> getBrandBrands() {
    final Object current = myData.get("brand");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Brand>) current;
    }
    return Arrays.asList((Brand) current);
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public Organization getBrandOrganization() {
    return (Organization) getValue("brand");
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  @JsonIgnore public Collection<Organization> getBrandOrganizations() {
    final Object current = myData.get("brand");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A child of the person.
   */
  @JsonIgnore public Person getChildren() {
    return (Person) getValue("children");
  }
  /**
   * A child of the person.
   */
  @JsonIgnore public Collection<Person> getChildrens() {
    final Object current = myData.get("children");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A colleague of the person.
   */
  @JsonIgnore public Person getColleaguePerson() {
    return (Person) getValue("colleague");
  }
  /**
   * A colleague of the person.
   */
  @JsonIgnore public Collection<Person> getColleaguePersons() {
    final Object current = myData.get("colleague");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A colleague of the person.
   */
  @JsonIgnore public String getColleagueString() {
    return (String) getValue("colleague");
  }
  /**
   * A colleague of the person.
   */
  @JsonIgnore public Collection<String> getColleagueStrings() {
    final Object current = myData.get("colleague");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * A contact point for a person or organization.
   */
  @JsonIgnore public ContactPoint getContactPoint() {
    return (ContactPoint) getValue("contactPoint");
  }
  /**
   * A contact point for a person or organization.
   */
  @JsonIgnore public Collection<ContactPoint> getContactPoints() {
    final Object current = myData.get("contactPoint");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * Date of death.
   */
  @JsonIgnore public java.util.Date getDeathDate() {
    return (java.util.Date) getValue("deathDate");
  }
  /**
   * Date of death.
   */
  @JsonIgnore public Collection<java.util.Date> getDeathDates() {
    final Object current = myData.get("deathDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The Dun & Bradstreet DUNS number for identifying an organization or business person.
   */
  @JsonIgnore public Identifier getDuns() {
    return (Identifier) getValue("duns");
  }
  /**
   * The Dun & Bradstreet DUNS number for identifying an organization or business person.
   */
  @JsonIgnore public Collection<Identifier> getDunss() {
    final Object current = myData.get("duns");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * Email address.
   */
  @JsonIgnore public String getEmail() {
    return (String) getValue("email");
  }
  /**
   * Email address.
   */
  @JsonIgnore public Collection<String> getEmails() {
    final Object current = myData.get("email");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
   */
  @JsonIgnore public String getFamilyName() {
    return (String) getValue("familyName");
  }
  /**
   * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
   */
  @JsonIgnore public Collection<String> getFamilyNames() {
    final Object current = myData.get("familyName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The fax number.
   */
  @JsonIgnore public String getFaxNumber() {
    return (String) getValue("faxNumber");
  }
  /**
   * The fax number.
   */
  @JsonIgnore public Collection<String> getFaxNumbers() {
    final Object current = myData.get("faxNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The most generic uni-directional social relation.
   */
  @JsonIgnore public Person getFollows() {
    return (Person) getValue("follows");
  }
  /**
   * The most generic uni-directional social relation.
   */
  @JsonIgnore public Collection<Person> getFollowss() {
    final Object current = myData.get("follows");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.
   */
  @JsonIgnore public GenderType getGenderGenderType() {
    return (GenderType) getValue("gender");
  }
  /**
   * Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.
   */
  @JsonIgnore public Collection<GenderType> getGenderGenderTypes() {
    final Object current = myData.get("gender");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GenderType>) current;
    }
    return Arrays.asList((GenderType) current);
  }
  /**
   * Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.
   */
  @JsonIgnore public String getGenderString() {
    return (String) getValue("gender");
  }
  /**
   * Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.
   */
  @JsonIgnore public Collection<String> getGenderStrings() {
    final Object current = myData.get("gender");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
   */
  @JsonIgnore public String getGivenName() {
    return (String) getValue("givenName");
  }
  /**
   * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
   */
  @JsonIgnore public Collection<String> getGivenNames() {
    final Object current = myData.get("givenName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  @JsonIgnore public Identifier getGlobalLocationNumber() {
    return (Identifier) getValue("globalLocationNumber");
  }
  /**
   * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  @JsonIgnore public Collection<Identifier> getGlobalLocationNumbers() {
    final Object current = myData.get("globalLocationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * Points-of-Sales operated by the organization or person.
   */
  @JsonIgnore public Place getHasPOS() {
    return (Place) getValue("hasPOS");
  }
  /**
   * Points-of-Sales operated by the organization or person.
   */
  @JsonIgnore public Collection<Place> getHasPOSs() {
    final Object current = myData.get("hasPOS");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public Distance getHeightDistance() {
    return (Distance) getValue("height");
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public Collection<Distance> getHeightDistances() {
    final Object current = myData.get("height");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Distance>) current;
    }
    return Arrays.asList((Distance) current);
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public QuantitativeValue getHeightQuantitativeValue() {
    return (QuantitativeValue) getValue("height");
  }
  /**
   * The height of the item.
   */
  @JsonIgnore public Collection<QuantitativeValue> getHeightQuantitativeValues() {
    final Object current = myData.get("height");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A contact location for a person's residence.
   */
  @JsonIgnore public ContactPoint getHomeLocationContactPoint() {
    return (ContactPoint) getValue("homeLocation");
  }
  /**
   * A contact location for a person's residence.
   */
  @JsonIgnore public Collection<ContactPoint> getHomeLocationContactPoints() {
    final Object current = myData.get("homeLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * A contact location for a person's residence.
   */
  @JsonIgnore public Place getHomeLocationPlace() {
    return (Place) getValue("homeLocation");
  }
  /**
   * A contact location for a person's residence.
   */
  @JsonIgnore public Collection<Place> getHomeLocationPlaces() {
    final Object current = myData.get("homeLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
   */
  @JsonIgnore public String getHonorificPrefix() {
    return (String) getValue("honorificPrefix");
  }
  /**
   * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
   */
  @JsonIgnore public Collection<String> getHonorificPrefixs() {
    final Object current = myData.get("honorificPrefix");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
   */
  @JsonIgnore public String getHonorificSuffix() {
    return (String) getValue("honorificSuffix");
  }
  /**
   * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
   */
  @JsonIgnore public Collection<String> getHonorificSuffixs() {
    final Object current = myData.get("honorificSuffix");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  @JsonIgnore public String getIsicV4() {
    return (String) getValue("isicV4");
  }
  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  @JsonIgnore public Collection<String> getIsicV4s() {
    final Object current = myData.get("isicV4");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The job title of the person (for example, Financial Manager).
   */
  @JsonIgnore public String getJobTitle() {
    return (String) getValue("jobTitle");
  }
  /**
   * The job title of the person (for example, Financial Manager).
   */
  @JsonIgnore public Collection<String> getJobTitles() {
    final Object current = myData.get("jobTitle");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The most generic bi-directional social/work relation.
   */
  @JsonIgnore public Person getKnows() {
    return (Person) getValue("knows");
  }
  /**
   * The most generic bi-directional social/work relation.
   */
  @JsonIgnore public Collection<Person> getKnowss() {
    final Object current = myData.get("knows");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A pointer to products or services offered by the organization or person.
   */
  @JsonIgnore public Offer getMakesOffer() {
    return (Offer) getValue("makesOffer");
  }
  /**
   * A pointer to products or services offered by the organization or person.
   */
  @JsonIgnore public Collection<Offer> getMakesOffers() {
    final Object current = myData.get("makesOffer");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Offer>) current;
    }
    return Arrays.asList((Offer) current);
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public MemberOf getMemberOf() {
    return (MemberOf) getValue("memberOf");
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public Collection<MemberOf> getMemberOfs() {
    final Object current = myData.get("memberOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MemberOf>) current;
    }
    return Arrays.asList((MemberOf) current);
  }
  /**
   * The North American Industry Classification System (NAICS) code for a particular organization or business person.
   */
  @JsonIgnore public String getNaics() {
    return (String) getValue("naics");
  }
  /**
   * The North American Industry Classification System (NAICS) code for a particular organization or business person.
   */
  @JsonIgnore public Collection<String> getNaicss() {
    final Object current = myData.get("naics");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Nationality of the person.
   */
  @JsonIgnore public Country getNationality() {
    return (Country) getValue("nationality");
  }
  /**
   * Nationality of the person.
   */
  @JsonIgnore public Collection<Country> getNationalitys() {
    final Object current = myData.get("nationality");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Country>) current;
    }
    return Arrays.asList((Country) current);
  }
  /**
   * The total financial value of the person as calculated by subtracting assets from liabilities.
   */
  @JsonIgnore public MonetaryAmount getNetWorthMonetaryAmount() {
    return (MonetaryAmount) getValue("netWorth");
  }
  /**
   * The total financial value of the person as calculated by subtracting assets from liabilities.
   */
  @JsonIgnore public Collection<MonetaryAmount> getNetWorthMonetaryAmounts() {
    final Object current = myData.get("netWorth");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<MonetaryAmount>) current;
    }
    return Arrays.asList((MonetaryAmount) current);
  }
  /**
   * The total financial value of the person as calculated by subtracting assets from liabilities.
   */
  @JsonIgnore public PriceSpecification getNetWorthPriceSpecification() {
    return (PriceSpecification) getValue("netWorth");
  }
  /**
   * The total financial value of the person as calculated by subtracting assets from liabilities.
   */
  @JsonIgnore public Collection<PriceSpecification> getNetWorthPriceSpecifications() {
    final Object current = myData.get("netWorth");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * Products owned by the organization or person.
   */
  @JsonIgnore public OwnershipInfo getOwnsOwnershipInfo() {
    return (OwnershipInfo) getValue("owns");
  }
  /**
   * Products owned by the organization or person.
   */
  @JsonIgnore public Collection<OwnershipInfo> getOwnsOwnershipInfos() {
    final Object current = myData.get("owns");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OwnershipInfo>) current;
    }
    return Arrays.asList((OwnershipInfo) current);
  }
  /**
   * Products owned by the organization or person.
   */
  @JsonIgnore public Product getOwnsProduct() {
    return (Product) getValue("owns");
  }
  /**
   * Products owned by the organization or person.
   */
  @JsonIgnore public Collection<Product> getOwnsProducts() {
    final Object current = myData.get("owns");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * A parent of this person.
   */
  @JsonIgnore public Person getParent() {
    return (Person) getValue("parent");
  }
  /**
   * A parent of this person.
   */
  @JsonIgnore public Collection<Person> getParents() {
    final Object current = myData.get("parent");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Event that this person is a performer or participant in.
   */
  @JsonIgnore public Event getPerformerIn() {
    return (Event) getValue("performerIn");
  }
  /**
   * Event that this person is a performer or participant in.
   */
  @JsonIgnore public Collection<Event> getPerformerIns() {
    final Object current = myData.get("performerIn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
  }
  /**
   * The most generic familial relation.
   */
  @JsonIgnore public Person getRelatedTo() {
    return (Person) getValue("relatedTo");
  }
  /**
   * The most generic familial relation.
   */
  @JsonIgnore public Collection<Person> getRelatedTos() {
    final Object current = myData.get("relatedTo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * A pointer to products or services sought by the organization or person (demand).
   */
  @JsonIgnore public Demand getSeeks() {
    return (Demand) getValue("seeks");
  }
  /**
   * A pointer to products or services sought by the organization or person (demand).
   */
  @JsonIgnore public Collection<Demand> getSeekss() {
    final Object current = myData.get("seeks");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Demand>) current;
    }
    return Arrays.asList((Demand) current);
  }
  /**
   * A sibling of the person.
   */
  @JsonIgnore public Person getSibling() {
    return (Person) getValue("sibling");
  }
  /**
   * A sibling of the person.
   */
  @JsonIgnore public Collection<Person> getSiblings() {
    final Object current = myData.get("sibling");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
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
   * The person's spouse.
   */
  @JsonIgnore public Person getSpouse() {
    return (Person) getValue("spouse");
  }
  /**
   * The person's spouse.
   */
  @JsonIgnore public Collection<Person> getSpouses() {
    final Object current = myData.get("spouse");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  @JsonIgnore public Identifier getTaxID() {
    return (Identifier) getValue("taxID");
  }
  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  @JsonIgnore public Collection<Identifier> getTaxIDs() {
    final Object current = myData.get("taxID");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Identifier>) current;
    }
    return Arrays.asList((Identifier) current);
  }
  /**
   * The telephone number.
   */
  @JsonIgnore public String getTelephone() {
    return (String) getValue("telephone");
  }
  /**
   * The telephone number.
   */
  @JsonIgnore public Collection<String> getTelephones() {
    final Object current = myData.get("telephone");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The Value-added Tax ID of the organization or person.
   */
  @JsonIgnore public String getVatID() {
    return (String) getValue("vatID");
  }
  /**
   * The Value-added Tax ID of the organization or person.
   */
  @JsonIgnore public Collection<String> getVatIDs() {
    final Object current = myData.get("vatID");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The weight of the product or person.
   */
  @JsonIgnore public QuantitativeValue getWeight() {
    return (QuantitativeValue) getValue("weight");
  }
  /**
   * The weight of the product or person.
   */
  @JsonIgnore public Collection<QuantitativeValue> getWeights() {
    final Object current = myData.get("weight");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A contact location for a person's place of work.
   */
  @JsonIgnore public ContactPoint getWorkLocationContactPoint() {
    return (ContactPoint) getValue("workLocation");
  }
  /**
   * A contact location for a person's place of work.
   */
  @JsonIgnore public Collection<ContactPoint> getWorkLocationContactPoints() {
    final Object current = myData.get("workLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * A contact location for a person's place of work.
   */
  @JsonIgnore public Place getWorkLocationPlace() {
    return (Place) getValue("workLocation");
  }
  /**
   * A contact location for a person's place of work.
   */
  @JsonIgnore public Collection<Place> getWorkLocationPlaces() {
    final Object current = myData.get("workLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * Organizations that the person works for.
   */
  @JsonIgnore public Organization getWorksFor() {
    return (Organization) getValue("worksFor");
  }
  /**
   * Organizations that the person works for.
   */
  @JsonIgnore public Collection<Organization> getWorksFors() {
    final Object current = myData.get("worksFor");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The place where the person was born.
   */
  @JsonIgnore public Place getBirthPlace() {
    return (Place) getValue("birthPlace");
  }
  /**
   * The place where the person was born.
   */
  @JsonIgnore public Collection<Place> getBirthPlaces() {
    final Object current = myData.get("birthPlace");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The place where the person died.
   */
  @JsonIgnore public Place getDeathPlace() {
    return (Place) getValue("deathPlace");
  }
  /**
   * The place where the person died.
   */
  @JsonIgnore public Collection<Place> getDeathPlaces() {
    final Object current = myData.get("deathPlace");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  protected Person(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Person}
   */
  public static class Builder extends Thing.Builder {
    @NotNull public Person build() {
      return new Person(myData);
    }
    /**
     * An additional name for a Person, can be used for a middle name.
     */
    @NotNull public Builder additionalName(@NotNull String additionalName) {
      putValue("additionalName", additionalName);
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress postalAddress) {
      putValue("address", postalAddress);
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress.Builder postalAddress) {
      putValue("address", postalAddress.build());
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull String address) {
      putValue("address", address);
      return this;
    }
    /**
     * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
     */
    @NotNull public Builder affiliation(@NotNull MemberOf memberOf) {
      putValue("affiliation", memberOf);
      return this;
    }
    /**
     * An organization that the person is an alumni of.
     */
    @NotNull public Builder alumniOf(@NotNull EducationalOrganization educationalOrganization) {
      putValue("alumniOf", educationalOrganization);
      return this;
    }
    /**
     * An organization that the person is an alumni of.
     */
    @NotNull public Builder alumniOf(@NotNull EducationalOrganization.Builder educationalOrganization) {
      putValue("alumniOf", educationalOrganization.build());
      return this;
    }
    /**
     * An organization that the person is an alumni of.
     */
    @NotNull public Builder alumniOf(@NotNull Organization organization) {
      putValue("alumniOf", organization);
      return this;
    }
    /**
     * An organization that the person is an alumni of.
     */
    @NotNull public Builder alumniOf(@NotNull Organization.Builder organization) {
      putValue("alumniOf", organization.build());
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
     * Date of birth.
     */
    @NotNull public Builder birthDate(@NotNull java.util.Date date) {
      putValue("birthDate", date);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      putValue("brand", brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      putValue("brand", brand.build());
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      putValue("brand", organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      putValue("brand", organization.build());
      return this;
    }
    /**
     * A child of the person.
     */
    @NotNull public Builder children(@NotNull Person person) {
      putValue("children", person);
      return this;
    }
    /**
     * A child of the person.
     */
    @NotNull public Builder children(@NotNull Person.Builder person) {
      putValue("children", person.build());
      return this;
    }
    /**
     * A colleague of the person.
     */
    @NotNull public Builder colleague(@NotNull Person person) {
      putValue("colleague", person);
      return this;
    }
    /**
     * A colleague of the person.
     */
    @NotNull public Builder colleague(@NotNull Person.Builder person) {
      putValue("colleague", person.build());
      return this;
    }
    /**
     * A colleague of the person.
     */
    @NotNull public Builder colleague(@NotNull String colleague) {
      putValue("colleague", colleague);
      return this;
    }
    /**
     * A contact point for a person or organization.
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint contactPoint) {
      putValue("contactPoint", contactPoint);
      return this;
    }
    /**
     * A contact point for a person or organization.
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint.Builder contactPoint) {
      putValue("contactPoint", contactPoint.build());
      return this;
    }
    /**
     * Date of death.
     */
    @NotNull public Builder deathDate(@NotNull java.util.Date date) {
      putValue("deathDate", date);
      return this;
    }
    /**
     * The Dun & Bradstreet DUNS number for identifying an organization or business person.
     */
    @NotNull public Builder duns(@NotNull Identifier identifier) {
      putValue("duns", identifier);
      return this;
    }
    /**
     * Email address.
     */
    @NotNull public Builder email(@NotNull String email) {
      putValue("email", email);
      return this;
    }
    /**
     * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
     */
    @NotNull public Builder familyName(@NotNull String familyName) {
      putValue("familyName", familyName);
      return this;
    }
    /**
     * The fax number.
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      putValue("faxNumber", faxNumber);
      return this;
    }
    /**
     * The most generic uni-directional social relation.
     */
    @NotNull public Builder follows(@NotNull Person person) {
      putValue("follows", person);
      return this;
    }
    /**
     * The most generic uni-directional social relation.
     */
    @NotNull public Builder follows(@NotNull Person.Builder person) {
      putValue("follows", person.build());
      return this;
    }
    /**
     * Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.
     */
    @NotNull public Builder gender(@NotNull GenderType genderType) {
      putValue("gender", genderType);
      return this;
    }
    /**
     * Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.
     */
    @NotNull public Builder gender(@NotNull String gender) {
      putValue("gender", gender);
      return this;
    }
    /**
     * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
     */
    @NotNull public Builder givenName(@NotNull String givenName) {
      putValue("givenName", givenName);
      return this;
    }
    /**
     * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(@NotNull Identifier identifier) {
      putValue("globalLocationNumber", identifier);
      return this;
    }
    /**
     * Points-of-Sales operated by the organization or person.
     */
    @NotNull public Builder hasPOS(@NotNull Place place) {
      putValue("hasPOS", place);
      return this;
    }
    /**
     * Points-of-Sales operated by the organization or person.
     */
    @NotNull public Builder hasPOS(@NotNull Place.Builder place) {
      putValue("hasPOS", place.build());
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull Distance distance) {
      putValue("height", distance);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull Distance.Builder distance) {
      putValue("height", distance.build());
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull QuantitativeValue quantitativeValue) {
      putValue("height", quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     */
    @NotNull public Builder height(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("height", quantitativeValue.build());
      return this;
    }
    /**
     * A contact location for a person's residence.
     */
    @NotNull public Builder homeLocation(@NotNull ContactPoint contactPoint) {
      putValue("homeLocation", contactPoint);
      return this;
    }
    /**
     * A contact location for a person's residence.
     */
    @NotNull public Builder homeLocation(@NotNull ContactPoint.Builder contactPoint) {
      putValue("homeLocation", contactPoint.build());
      return this;
    }
    /**
     * A contact location for a person's residence.
     */
    @NotNull public Builder homeLocation(@NotNull Place place) {
      putValue("homeLocation", place);
      return this;
    }
    /**
     * A contact location for a person's residence.
     */
    @NotNull public Builder homeLocation(@NotNull Place.Builder place) {
      putValue("homeLocation", place.build());
      return this;
    }
    /**
     * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
     */
    @NotNull public Builder honorificPrefix(@NotNull String honorificPrefix) {
      putValue("honorificPrefix", honorificPrefix);
      return this;
    }
    /**
     * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
     */
    @NotNull public Builder honorificSuffix(@NotNull String honorificSuffix) {
      putValue("honorificSuffix", honorificSuffix);
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      putValue("isicV4", isicV4);
      return this;
    }
    /**
     * The job title of the person (for example, Financial Manager).
     */
    @NotNull public Builder jobTitle(@NotNull String jobTitle) {
      putValue("jobTitle", jobTitle);
      return this;
    }
    /**
     * The most generic bi-directional social/work relation.
     */
    @NotNull public Builder knows(@NotNull Person person) {
      putValue("knows", person);
      return this;
    }
    /**
     * The most generic bi-directional social/work relation.
     */
    @NotNull public Builder knows(@NotNull Person.Builder person) {
      putValue("knows", person.build());
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    @NotNull public Builder makesOffer(@NotNull Offer offer) {
      putValue("makesOffer", offer);
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    @NotNull public Builder makesOffer(@NotNull Offer.Builder offer) {
      putValue("makesOffer", offer.build());
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull MemberOf memberOf) {
      putValue("memberOf", memberOf);
      return this;
    }
    /**
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     */
    @NotNull public Builder naics(@NotNull String naics) {
      putValue("naics", naics);
      return this;
    }
    /**
     * Nationality of the person.
     */
    @NotNull public Builder nationality(@NotNull Country country) {
      putValue("nationality", country);
      return this;
    }
    /**
     * Nationality of the person.
     */
    @NotNull public Builder nationality(@NotNull Country.Builder country) {
      putValue("nationality", country.build());
      return this;
    }
    /**
     * The total financial value of the person as calculated by subtracting assets from liabilities.
     */
    @NotNull public Builder netWorth(@NotNull MonetaryAmount monetaryAmount) {
      putValue("netWorth", monetaryAmount);
      return this;
    }
    /**
     * The total financial value of the person as calculated by subtracting assets from liabilities.
     */
    @NotNull public Builder netWorth(@NotNull MonetaryAmount.Builder monetaryAmount) {
      putValue("netWorth", monetaryAmount.build());
      return this;
    }
    /**
     * The total financial value of the person as calculated by subtracting assets from liabilities.
     */
    @NotNull public Builder netWorth(@NotNull PriceSpecification priceSpecification) {
      putValue("netWorth", priceSpecification);
      return this;
    }
    /**
     * The total financial value of the person as calculated by subtracting assets from liabilities.
     */
    @NotNull public Builder netWorth(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("netWorth", priceSpecification.build());
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull OwnershipInfo ownershipInfo) {
      putValue("owns", ownershipInfo);
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull OwnershipInfo.Builder ownershipInfo) {
      putValue("owns", ownershipInfo.build());
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull Product product) {
      putValue("owns", product);
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull Product.Builder product) {
      putValue("owns", product.build());
      return this;
    }
    /**
     * A parent of this person.
     */
    @NotNull public Builder parent(@NotNull Person person) {
      putValue("parent", person);
      return this;
    }
    /**
     * A parent of this person.
     */
    @NotNull public Builder parent(@NotNull Person.Builder person) {
      putValue("parent", person.build());
      return this;
    }
    /**
     * Event that this person is a performer or participant in.
     */
    @NotNull public Builder performerIn(@NotNull Event event) {
      putValue("performerIn", event);
      return this;
    }
    /**
     * Event that this person is a performer or participant in.
     */
    @NotNull public Builder performerIn(@NotNull Event.Builder event) {
      putValue("performerIn", event.build());
      return this;
    }
    /**
     * The most generic familial relation.
     */
    @NotNull public Builder relatedTo(@NotNull Person person) {
      putValue("relatedTo", person);
      return this;
    }
    /**
     * The most generic familial relation.
     */
    @NotNull public Builder relatedTo(@NotNull Person.Builder person) {
      putValue("relatedTo", person.build());
      return this;
    }
    /**
     * A pointer to products or services sought by the organization or person (demand).
     */
    @NotNull public Builder seeks(@NotNull Demand demand) {
      putValue("seeks", demand);
      return this;
    }
    /**
     * A pointer to products or services sought by the organization or person (demand).
     */
    @NotNull public Builder seeks(@NotNull Demand.Builder demand) {
      putValue("seeks", demand.build());
      return this;
    }
    /**
     * A sibling of the person.
     */
    @NotNull public Builder sibling(@NotNull Person person) {
      putValue("sibling", person);
      return this;
    }
    /**
     * A sibling of the person.
     */
    @NotNull public Builder sibling(@NotNull Person.Builder person) {
      putValue("sibling", person.build());
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
     * The person's spouse.
     */
    @NotNull public Builder spouse(@NotNull Person person) {
      putValue("spouse", person);
      return this;
    }
    /**
     * The person's spouse.
     */
    @NotNull public Builder spouse(@NotNull Person.Builder person) {
      putValue("spouse", person.build());
      return this;
    }
    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     */
    @NotNull public Builder taxID(@NotNull Identifier identifier) {
      putValue("taxID", identifier);
      return this;
    }
    /**
     * The telephone number.
     */
    @NotNull public Builder telephone(@NotNull String telephone) {
      putValue("telephone", telephone);
      return this;
    }
    /**
     * The Value-added Tax ID of the organization or person.
     */
    @NotNull public Builder vatID(@NotNull String vatID) {
      putValue("vatID", vatID);
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue quantitativeValue) {
      putValue("weight", quantitativeValue);
      return this;
    }
    /**
     * The weight of the product or person.
     */
    @NotNull public Builder weight(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("weight", quantitativeValue.build());
      return this;
    }
    /**
     * A contact location for a person's place of work.
     */
    @NotNull public Builder workLocation(@NotNull ContactPoint contactPoint) {
      putValue("workLocation", contactPoint);
      return this;
    }
    /**
     * A contact location for a person's place of work.
     */
    @NotNull public Builder workLocation(@NotNull ContactPoint.Builder contactPoint) {
      putValue("workLocation", contactPoint.build());
      return this;
    }
    /**
     * A contact location for a person's place of work.
     */
    @NotNull public Builder workLocation(@NotNull Place place) {
      putValue("workLocation", place);
      return this;
    }
    /**
     * A contact location for a person's place of work.
     */
    @NotNull public Builder workLocation(@NotNull Place.Builder place) {
      putValue("workLocation", place.build());
      return this;
    }
    /**
     * Organizations that the person works for.
     */
    @NotNull public Builder worksFor(@NotNull Organization organization) {
      putValue("worksFor", organization);
      return this;
    }
    /**
     * Organizations that the person works for.
     */
    @NotNull public Builder worksFor(@NotNull Organization.Builder organization) {
      putValue("worksFor", organization.build());
      return this;
    }
    /**
     * The place where the person was born.
     */
    @NotNull public Builder birthPlace(@NotNull Place place) {
      putValue("birthPlace", place);
      return this;
    }
    /**
     * The place where the person was born.
     */
    @NotNull public Builder birthPlace(@NotNull Place.Builder place) {
      putValue("birthPlace", place.build());
      return this;
    }
    /**
     * The place where the person died.
     */
    @NotNull public Builder deathPlace(@NotNull Place place) {
      putValue("deathPlace", place);
      return this;
    }
    /**
     * The place where the person died.
     */
    @NotNull public Builder deathPlace(@NotNull Place.Builder place) {
      putValue("deathPlace", place.build());
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
      if ("additionalName".equals(key) && value instanceof String) { additionalName((String)value); return; }
      if ("address".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); return; }
      if ("address".equals(key) && value instanceof String) { address((String)value); return; }
      if ("affiliation".equals(key) && value instanceof MemberOf) { affiliation((MemberOf)value); return; }
      if ("alumniOf".equals(key) && value instanceof EducationalOrganization) { alumniOf((EducationalOrganization)value); return; }
      if ("alumniOf".equals(key) && value instanceof Organization) { alumniOf((Organization)value); return; }
      if ("award".equals(key) && value instanceof String) { award((String)value); return; }
      if ("birthDate".equals(key) && value instanceof java.util.Date) { birthDate((java.util.Date)value); return; }
      if ("brand".equals(key) && value instanceof Brand) { brand((Brand)value); return; }
      if ("brand".equals(key) && value instanceof Organization) { brand((Organization)value); return; }
      if ("children".equals(key) && value instanceof Person) { children((Person)value); return; }
      if ("colleague".equals(key) && value instanceof Person) { colleague((Person)value); return; }
      if ("colleague".equals(key) && value instanceof String) { colleague((String)value); return; }
      if ("contactPoint".equals(key) && value instanceof ContactPoint) { contactPoint((ContactPoint)value); return; }
      if ("deathDate".equals(key) && value instanceof java.util.Date) { deathDate((java.util.Date)value); return; }
      if ("duns".equals(key) && value instanceof Identifier) { duns((Identifier)value); return; }
      if ("email".equals(key) && value instanceof String) { email((String)value); return; }
      if ("familyName".equals(key) && value instanceof String) { familyName((String)value); return; }
      if ("faxNumber".equals(key) && value instanceof String) { faxNumber((String)value); return; }
      if ("follows".equals(key) && value instanceof Person) { follows((Person)value); return; }
      if ("gender".equals(key) && value instanceof GenderType) { gender((GenderType)value); return; }
      if ("gender".equals(key) && value instanceof String) { gender((String)value); return; }
      if ("givenName".equals(key) && value instanceof String) { givenName((String)value); return; }
      if ("globalLocationNumber".equals(key) && value instanceof Identifier) { globalLocationNumber((Identifier)value); return; }
      if ("hasPOS".equals(key) && value instanceof Place) { hasPOS((Place)value); return; }
      if ("height".equals(key) && value instanceof Distance) { height((Distance)value); return; }
      if ("height".equals(key) && value instanceof QuantitativeValue) { height((QuantitativeValue)value); return; }
      if ("homeLocation".equals(key) && value instanceof ContactPoint) { homeLocation((ContactPoint)value); return; }
      if ("homeLocation".equals(key) && value instanceof Place) { homeLocation((Place)value); return; }
      if ("honorificPrefix".equals(key) && value instanceof String) { honorificPrefix((String)value); return; }
      if ("honorificSuffix".equals(key) && value instanceof String) { honorificSuffix((String)value); return; }
      if ("isicV4".equals(key) && value instanceof String) { isicV4((String)value); return; }
      if ("jobTitle".equals(key) && value instanceof String) { jobTitle((String)value); return; }
      if ("knows".equals(key) && value instanceof Person) { knows((Person)value); return; }
      if ("makesOffer".equals(key) && value instanceof Offer) { makesOffer((Offer)value); return; }
      if ("memberOf".equals(key) && value instanceof MemberOf) { memberOf((MemberOf)value); return; }
      if ("naics".equals(key) && value instanceof String) { naics((String)value); return; }
      if ("nationality".equals(key) && value instanceof Country) { nationality((Country)value); return; }
      if ("netWorth".equals(key) && value instanceof MonetaryAmount) { netWorth((MonetaryAmount)value); return; }
      if ("netWorth".equals(key) && value instanceof PriceSpecification) { netWorth((PriceSpecification)value); return; }
      if ("owns".equals(key) && value instanceof OwnershipInfo) { owns((OwnershipInfo)value); return; }
      if ("owns".equals(key) && value instanceof Product) { owns((Product)value); return; }
      if ("parent".equals(key) && value instanceof Person) { parent((Person)value); return; }
      if ("performerIn".equals(key) && value instanceof Event) { performerIn((Event)value); return; }
      if ("relatedTo".equals(key) && value instanceof Person) { relatedTo((Person)value); return; }
      if ("seeks".equals(key) && value instanceof Demand) { seeks((Demand)value); return; }
      if ("sibling".equals(key) && value instanceof Person) { sibling((Person)value); return; }
      if ("funder".equals(key) && value instanceof Organization) { funder((Organization)value); return; }
      if ("funder".equals(key) && value instanceof Person) { funder((Person)value); return; }
      if ("spouse".equals(key) && value instanceof Person) { spouse((Person)value); return; }
      if ("taxID".equals(key) && value instanceof Identifier) { taxID((Identifier)value); return; }
      if ("telephone".equals(key) && value instanceof String) { telephone((String)value); return; }
      if ("vatID".equals(key) && value instanceof String) { vatID((String)value); return; }
      if ("weight".equals(key) && value instanceof QuantitativeValue) { weight((QuantitativeValue)value); return; }
      if ("workLocation".equals(key) && value instanceof ContactPoint) { workLocation((ContactPoint)value); return; }
      if ("workLocation".equals(key) && value instanceof Place) { workLocation((Place)value); return; }
      if ("worksFor".equals(key) && value instanceof Organization) { worksFor((Organization)value); return; }
      if ("birthPlace".equals(key) && value instanceof Place) { birthPlace((Place)value); return; }
      if ("deathPlace".equals(key) && value instanceof Place) { deathPlace((Place)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
