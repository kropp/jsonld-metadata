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
  public java.util.Date getBirthDate() {
    return myBirthDate;
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public OrganizationOrBrand getBrand() {
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
  public QuantitativeValueOrDistance getHeight() {
    return myHeight;
  }
  /**
   * A contact location for a person's residence.
   */
  public PlaceOrContactPoint getHomeLocation() {
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
  public ProductOrOwnershipInfo getOwns() {
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
  public PlaceOrContactPoint getWorkLocation() {
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
  public static final class Builder {
    /**
     * Creates new {@link Person} instance.
     */
    public Person build() {
      return new Person(deathDate, worksFor, duns, affiliation, award, parent, seeks, gender, naics, potentialAction, address, birthDate, additionalName, globalLocationNumber, isicV4, memberOf, url, hasPOS, faxNumber, description, weight, alumniOf, birthPlace, children, follows, deathPlace, jobTitle, additionalType, sameAs, brand, honorificSuffix, familyName, owns, email, makesOffer, relatedTo, performerIn, netWorth, colleague, taxID, name, vatID, honorificPrefix, mainEntityOfPage, spouse, nationality, workLocation, sibling, contactPoint, height, alternateName, telephone, knows, givenName, homeLocation);
    }
    /**
     * Date of death.
     */
    public Builder deathDate(java.util.Date date) {
      this.deathDate = date;
      return this;
    }
    /**
     * Organizations that the person works for.
     */
    public Builder worksFor(Organization organization) {
      this.worksFor = organization;
      return this;
    }
    /**
     * The Dun & Bradstreet DUNS number for identifying an organization or business person.
     */
    public Builder duns(String duns) {
      this.duns = duns;
      return this;
    }
    /**
     * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
     */
    public Builder affiliation(Organization organization) {
      this.affiliation = organization;
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
     * A parent of this person.
     */
    public Builder parent(Person person) {
      this.parent = person;
      return this;
    }
    /**
     * A pointer to products or services sought by the organization or person (demand).
     */
    public Builder seeks(Demand demand) {
      this.seeks = demand;
      return this;
    }
    /**
     * Gender of the person.
     */
    public Builder gender(String gender) {
      this.gender = gender;
      return this;
    }
    /**
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     */
    public Builder naics(String naics) {
      this.naics = naics;
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
     * Physical address of the item.
     */
    public Builder address(PostalAddress postalAddress) {
      this.address = postalAddress;
      return this;
    }
    /**
     * Date of birth.
     */
    public Builder birthDate(java.util.Date date) {
      this.birthDate = date;
      return this;
    }
    /**
     * An additional name for a Person, can be used for a middle name.
     */
    public Builder additionalName(String additionalName) {
      this.additionalName = additionalName;
      return this;
    }
    /**
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    public Builder globalLocationNumber(String globalLocationNumber) {
      this.globalLocationNumber = globalLocationNumber;
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    public Builder isicV4(String isicV4) {
      this.isicV4 = isicV4;
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    public Builder memberOf(Organization organization) {
      this.memberOf.setOrganization(organization);
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    public Builder memberOf(ProgramMembership programMembership) {
      this.memberOf.setProgramMembership(programMembership);
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
     * Points-of-Sales operated by the organization or person.
     */
    public Builder hasPOS(Place place) {
      this.hasPOS = place;
      return this;
    }
    /**
     * The fax number.
     */
    public Builder faxNumber(String faxNumber) {
      this.faxNumber = faxNumber;
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
     * The weight of the product or person.
     */
    public Builder weight(QuantitativeValue quantitativeValue) {
      this.weight = quantitativeValue;
      return this;
    }
    /**
     * An educational organizations that the person is an alumni of.
     */
    public Builder alumniOf(EducationalOrganization educationalOrganization) {
      this.alumniOf = educationalOrganization;
      return this;
    }
    /**
     * The place where the person was born.
     */
    public Builder birthPlace(Place place) {
      this.birthPlace = place;
      return this;
    }
    /**
     * A child of the person.
     */
    public Builder children(Person person) {
      this.children = person;
      return this;
    }
    /**
     * The most generic uni-directional social relation.
     */
    public Builder follows(Person person) {
      this.follows = person;
      return this;
    }
    /**
     * The place where the person died.
     */
    public Builder deathPlace(Place place) {
      this.deathPlace = place;
      return this;
    }
    /**
     * The job title of the person (for example, Financial Manager).
     */
    public Builder jobTitle(String jobTitle) {
      this.jobTitle = jobTitle;
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
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    public Builder brand(Organization organization) {
      this.brand.setOrganization(organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    public Builder brand(Brand brand) {
      this.brand.setBrand(brand);
      return this;
    }
    /**
     * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
     */
    public Builder honorificSuffix(String honorificSuffix) {
      this.honorificSuffix = honorificSuffix;
      return this;
    }
    /**
     * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
     */
    public Builder familyName(String familyName) {
      this.familyName = familyName;
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    public Builder owns(Product product) {
      this.owns.setProduct(product);
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    public Builder owns(OwnershipInfo ownershipInfo) {
      this.owns.setOwnershipInfo(ownershipInfo);
      return this;
    }
    /**
     * Email address.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    public Builder makesOffer(Offer offer) {
      this.makesOffer = offer;
      return this;
    }
    /**
     * The most generic familial relation.
     */
    public Builder relatedTo(Person person) {
      this.relatedTo = person;
      return this;
    }
    /**
     * Event that this person is a performer or participant in.
     */
    public Builder performerIn(Event event) {
      this.performerIn = event;
      return this;
    }
    /**
     * The total financial value of the organization or person as calculated by subtracting assets from liabilities.
     */
    public Builder netWorth(PriceSpecification priceSpecification) {
      this.netWorth = priceSpecification;
      return this;
    }
    /**
     * A colleague of the person.
     */
    public Builder colleague(Person person) {
      this.colleague = person;
      return this;
    }
    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     */
    public Builder taxID(String taxID) {
      this.taxID = taxID;
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
     * The Value-added Tax ID of the organization or person.
     */
    public Builder vatID(String vatID) {
      this.vatID = vatID;
      return this;
    }
    /**
     * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
     */
    public Builder honorificPrefix(String honorificPrefix) {
      this.honorificPrefix = honorificPrefix;
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
     * The person's spouse.
     */
    public Builder spouse(Person person) {
      this.spouse = person;
      return this;
    }
    /**
     * Nationality of the person.
     */
    public Builder nationality(Country country) {
      this.nationality = country;
      return this;
    }
    /**
     * A contact location for a person's place of work.
     */
    public Builder workLocation(Place place) {
      this.workLocation.setPlace(place);
      return this;
    }
    /**
     * A contact location for a person's place of work.
     */
    public Builder workLocation(ContactPoint contactPoint) {
      this.workLocation.setContactPoint(contactPoint);
      return this;
    }
    /**
     * A sibling of the person.
     */
    public Builder sibling(Person person) {
      this.sibling = person;
      return this;
    }
    /**
     * A contact point for a person or organization.
     */
    public Builder contactPoint(ContactPoint contactPoint) {
      this.contactPoint = contactPoint;
      return this;
    }
    /**
     * The height of the item.
     */
    public Builder height(QuantitativeValue quantitativeValue) {
      this.height.setQuantitativeValue(quantitativeValue);
      return this;
    }
    /**
     * The height of the item.
     */
    public Builder height(Distance distance) {
      this.height.setDistance(distance);
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
     * The telephone number.
     */
    public Builder telephone(String telephone) {
      this.telephone = telephone;
      return this;
    }
    /**
     * The most generic bi-directional social/work relation.
     */
    public Builder knows(Person person) {
      this.knows = person;
      return this;
    }
    /**
     * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
     */
    public Builder givenName(String givenName) {
      this.givenName = givenName;
      return this;
    }
    /**
     * A contact location for a person's residence.
     */
    public Builder homeLocation(Place place) {
      this.homeLocation.setPlace(place);
      return this;
    }
    /**
     * A contact location for a person's residence.
     */
    public Builder homeLocation(ContactPoint contactPoint) {
      this.homeLocation.setContactPoint(contactPoint);
      return this;
    }
    private java.util.Date deathDate;
    private Organization worksFor;
    private String duns;
    private Organization affiliation;
    private String award;
    private Person parent;
    private Demand seeks;
    private String gender;
    private String naics;
    private Action potentialAction;
    private PostalAddress address;
    private java.util.Date birthDate;
    private String additionalName;
    private String globalLocationNumber;
    private String isicV4;
    private OrganizationOrProgramMembership memberOf;
    private String url;
    private Place hasPOS;
    private String faxNumber;
    private String description;
    private QuantitativeValue weight;
    private EducationalOrganization alumniOf;
    private Place birthPlace;
    private Person children;
    private Person follows;
    private Place deathPlace;
    private String jobTitle;
    private String additionalType;
    private String sameAs;
    private OrganizationOrBrand brand;
    private String honorificSuffix;
    private String familyName;
    private ProductOrOwnershipInfo owns;
    private String email;
    private Offer makesOffer;
    private Person relatedTo;
    private Event performerIn;
    private PriceSpecification netWorth;
    private Person colleague;
    private String taxID;
    private String name;
    private String vatID;
    private String honorificPrefix;
    private StringOrCreativeWork mainEntityOfPage;
    private Person spouse;
    private Country nationality;
    private PlaceOrContactPoint workLocation;
    private Person sibling;
    private ContactPoint contactPoint;
    private QuantitativeValueOrDistance height;
    private String alternateName;
    private String telephone;
    private Person knows;
    private String givenName;
    private PlaceOrContactPoint homeLocation;
  }

  protected Person(java.util.Date deathDate, Organization worksFor, String duns, Organization affiliation, String award, Person parent, Demand seeks, String gender, String naics, Action potentialAction, PostalAddress address, java.util.Date birthDate, String additionalName, String globalLocationNumber, String isicV4, OrganizationOrProgramMembership memberOf, String url, Place hasPOS, String faxNumber, String description, QuantitativeValue weight, EducationalOrganization alumniOf, Place birthPlace, Person children, Person follows, Place deathPlace, String jobTitle, String additionalType, String sameAs, OrganizationOrBrand brand, String honorificSuffix, String familyName, ProductOrOwnershipInfo owns, String email, Offer makesOffer, Person relatedTo, Event performerIn, PriceSpecification netWorth, Person colleague, String taxID, String name, String vatID, String honorificPrefix, StringOrCreativeWork mainEntityOfPage, Person spouse, Country nationality, PlaceOrContactPoint workLocation, Person sibling, ContactPoint contactPoint, QuantitativeValueOrDistance height, String alternateName, String telephone, Person knows, String givenName, PlaceOrContactPoint homeLocation) {
    super(url, sameAs, additionalType, alternateName, potentialAction, name, description, mainEntityOfPage);
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
  private OrganizationOrBrand myBrand;
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
  private QuantitativeValueOrDistance myHeight;
  private PlaceOrContactPoint myHomeLocation;
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
  private ProductOrOwnershipInfo myOwns;
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
  private PlaceOrContactPoint myWorkLocation;
  private Organization myWorksFor;
  private Place myBirthPlace;
  private Place myDeathPlace;
}
