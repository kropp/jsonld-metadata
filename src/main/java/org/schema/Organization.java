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
 * An organization such as a school, NGO, corporation, club, etc.
 */
public class Organization extends Thing {
  /**
   * Physical address of the item.
   */
  public PostalAddress getAddress() {
    return myAddress;
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating getAggregateRating() {
    return myAggregateRating;
  }
  /**
   * An award won by or for this item.
   */
  public String getAward() {
    return myAward;
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public OrganizationOrBrand getBrand() {
    return myBrand;
  }
  /**
   * A contact point for a person or organization.
   */
  public ContactPoint getContactPoint() {
    return myContactPoint;
  }
  /**
   * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
   */
  public Organization getDepartment() {
    return myDepartment;
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
   * Someone working for this organization.
   */
  public Person getEmployee() {
    return myEmployee;
  }
  /**
   * Upcoming or past event associated with this place, organization, or action.
   */
  public Event getEvent() {
    return myEvent;
  }
  /**
   * The fax number.
   */
  public String getFaxNumber() {
    return myFaxNumber;
  }
  /**
   * A person who founded this organization.
   */
  public Person getFounder() {
    return myFounder;
  }
  /**
   * The date that this organization was dissolved.
   */
  public java.util.Date getDissolutionDate() {
    return myDissolutionDate;
  }
  /**
   * The date that this organization was founded.
   */
  public java.util.Date getFoundingDate() {
    return myFoundingDate;
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
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  public String getIsicV4() {
    return myIsicV4;
  }
  /**
   * The official name of the organization, e.g. the registered company name.
   */
  public String getLegalName() {
    return myLegalName;
  }
  /**
   * An associated logo.
   */
  public ImageObjectOrString getLogo() {
    return myLogo;
  }
  /**
   * A pointer to products or services offered by the organization or person.
   */
  public Offer getMakesOffer() {
    return myMakesOffer;
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  public OrganizationOrPerson getMember() {
    return myMember;
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
   * The number of employees in an organization e.g. business.
   */
  public QuantitativeValue getNumberOfEmployees() {
    return myNumberOfEmployees;
  }
  /**
   * Products owned by the organization or person.
   */
  public ProductOrOwnershipInfo getOwns() {
    return myOwns;
  }
  /**
   * A review of the item.
   */
  public Review getReview() {
    return myReview;
  }
  /**
   * A pointer to products or services sought by the organization or person (demand).
   */
  public Demand getSeeks() {
    return mySeeks;
  }
  /**
   * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
   */
  public Organization getSubOrganization() {
    return mySubOrganization;
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
   * The place where the Organization was founded.
   */
  public Place getFoundingLocation() {
    return myFoundingLocation;
  }
  /**
   * Builder for {@link Organization}
   */
  public static final class Builder {
    /**
     * Creates new {@link Organization} instance.
     */
    public Organization build() {
      return new Organization(aggregateRating, review, logo, duns, department, subOrganization, additionalType, sameAs, event, award, foundingDate, numberOfEmployees, seeks, brand, naics, potentialAction, dissolutionDate, foundingLocation, address, founder, owns, email, member, makesOffer, employee, isicV4, globalLocationNumber, taxID, name, vatID, mainEntityOfPage, legalName, memberOf, url, contactPoint, hasPOS, alternateName, faxNumber, telephone, description);
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating aggregateRating) {
      this.aggregateRating = aggregateRating;
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
     * An associated logo.
     */
    public Builder logo(ImageObject imageObject) {
      this.logo.setImageObject(imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    public Builder logo(String logo) {
      this.logo.setString(logo);
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
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    public Builder department(Organization organization) {
      this.department = organization;
      return this;
    }
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    public Builder subOrganization(Organization organization) {
      this.subOrganization = organization;
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
     * Upcoming or past event associated with this place, organization, or action.
     */
    public Builder event(Event event) {
      this.event = event;
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
     * The date that this organization was founded.
     */
    public Builder foundingDate(java.util.Date date) {
      this.foundingDate = date;
      return this;
    }
    /**
     * The number of employees in an organization e.g. business.
     */
    public Builder numberOfEmployees(QuantitativeValue quantitativeValue) {
      this.numberOfEmployees = quantitativeValue;
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
     * The date that this organization was dissolved.
     */
    public Builder dissolutionDate(java.util.Date date) {
      this.dissolutionDate = date;
      return this;
    }
    /**
     * The place where the Organization was founded.
     */
    public Builder foundingLocation(Place place) {
      this.foundingLocation = place;
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
     * A person who founded this organization.
     */
    public Builder founder(Person person) {
      this.founder = person;
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
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    public Builder member(Organization organization) {
      this.member.setOrganization(organization);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    public Builder member(Person person) {
      this.member.setPerson(person);
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
     * Someone working for this organization.
     */
    public Builder employee(Person person) {
      this.employee = person;
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
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    public Builder globalLocationNumber(String globalLocationNumber) {
      this.globalLocationNumber = globalLocationNumber;
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
     * The official name of the organization, e.g. the registered company name.
     */
    public Builder legalName(String legalName) {
      this.legalName = legalName;
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
     * A contact point for a person or organization.
     */
    public Builder contactPoint(ContactPoint contactPoint) {
      this.contactPoint = contactPoint;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
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
     * The telephone number.
     */
    public Builder telephone(String telephone) {
      this.telephone = telephone;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
    private AggregateRating aggregateRating;
    private Review review;
    private ImageObjectOrString logo;
    private String duns;
    private Organization department;
    private Organization subOrganization;
    private String additionalType;
    private String sameAs;
    private Event event;
    private String award;
    private java.util.Date foundingDate;
    private QuantitativeValue numberOfEmployees;
    private Demand seeks;
    private OrganizationOrBrand brand;
    private String naics;
    private Action potentialAction;
    private java.util.Date dissolutionDate;
    private Place foundingLocation;
    private PostalAddress address;
    private Person founder;
    private ProductOrOwnershipInfo owns;
    private String email;
    private OrganizationOrPerson member;
    private Offer makesOffer;
    private Person employee;
    private String isicV4;
    private String globalLocationNumber;
    private String taxID;
    private String name;
    private String vatID;
    private StringOrCreativeWork mainEntityOfPage;
    private String legalName;
    private OrganizationOrProgramMembership memberOf;
    private String url;
    private ContactPoint contactPoint;
    private Place hasPOS;
    private String alternateName;
    private String faxNumber;
    private String telephone;
    private String description;
  }

  protected Organization(AggregateRating aggregateRating, Review review, ImageObjectOrString logo, String duns, Organization department, Organization subOrganization, String additionalType, String sameAs, Event event, String award, java.util.Date foundingDate, QuantitativeValue numberOfEmployees, Demand seeks, OrganizationOrBrand brand, String naics, Action potentialAction, java.util.Date dissolutionDate, Place foundingLocation, PostalAddress address, Person founder, ProductOrOwnershipInfo owns, String email, OrganizationOrPerson member, Offer makesOffer, Person employee, String isicV4, String globalLocationNumber, String taxID, String name, String vatID, StringOrCreativeWork mainEntityOfPage, String legalName, OrganizationOrProgramMembership memberOf, String url, ContactPoint contactPoint, Place hasPOS, String alternateName, String faxNumber, String telephone, String description) {
    super(url, sameAs, additionalType, alternateName, potentialAction, name, description, mainEntityOfPage);
    myAddress = address;
    myAggregateRating = aggregateRating;
    myAward = award;
    myBrand = brand;
    myContactPoint = contactPoint;
    myDepartment = department;
    myDuns = duns;
    myEmail = email;
    myEmployee = employee;
    myEvent = event;
    myFaxNumber = faxNumber;
    myFounder = founder;
    myDissolutionDate = dissolutionDate;
    myFoundingDate = foundingDate;
    myGlobalLocationNumber = globalLocationNumber;
    myHasPOS = hasPOS;
    myIsicV4 = isicV4;
    myLegalName = legalName;
    myLogo = logo;
    myMakesOffer = makesOffer;
    myMember = member;
    myMemberOf = memberOf;
    myNaics = naics;
    myNumberOfEmployees = numberOfEmployees;
    myOwns = owns;
    myReview = review;
    mySeeks = seeks;
    mySubOrganization = subOrganization;
    myTaxID = taxID;
    myTelephone = telephone;
    myVatID = vatID;
    myFoundingLocation = foundingLocation;
  }
  private PostalAddress myAddress;
  private AggregateRating myAggregateRating;
  private String myAward;
  private OrganizationOrBrand myBrand;
  private ContactPoint myContactPoint;
  private Organization myDepartment;
  private String myDuns;
  private String myEmail;
  private Person myEmployee;
  private Event myEvent;
  private String myFaxNumber;
  private Person myFounder;
  private java.util.Date myDissolutionDate;
  private java.util.Date myFoundingDate;
  private String myGlobalLocationNumber;
  private Place myHasPOS;
  private String myIsicV4;
  private String myLegalName;
  private ImageObjectOrString myLogo;
  private Offer myMakesOffer;
  private OrganizationOrPerson myMember;
  private OrganizationOrProgramMembership myMemberOf;
  private String myNaics;
  private QuantitativeValue myNumberOfEmployees;
  private ProductOrOwnershipInfo myOwns;
  private Review myReview;
  private Demand mySeeks;
  private Organization mySubOrganization;
  private String myTaxID;
  private String myTelephone;
  private String myVatID;
  private Place myFoundingLocation;
}
