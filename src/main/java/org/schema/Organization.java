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
import org.jetbrains.annotations.NotNull;

/**
 * An organization such as a school, NGO, corporation, club, etc.
 */
public class Organization extends Thing {
  /**
   * Physical address of the item.
   */
  public PostalAddress getAddress() { return myAddress; }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating getAggregateRating() { return myAggregateRating; }
  /**
   * An award won by or for this item.
   */
  public String getAward() { return myAward; }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public BrandOrOrganization getBrand() { return myBrand; }
  /**
   * A contact point for a person or organization.
   */
  public ContactPoint getContactPoint() { return myContactPoint; }
  /**
   * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
   */
  public Organization getDepartment() { return myDepartment; }
  /**
   * The Dun & Bradstreet DUNS number for identifying an organization or business person.
   */
  public String getDuns() { return myDuns; }
  /**
   * Email address.
   */
  public String getEmail() { return myEmail; }
  /**
   * Someone working for this organization.
   */
  public Person getEmployee() { return myEmployee; }
  /**
   * Upcoming or past event associated with this place, organization, or action.
   */
  public Event getEvent() { return myEvent; }
  /**
   * The fax number.
   */
  public String getFaxNumber() { return myFaxNumber; }
  /**
   * A person who founded this organization.
   */
  public Person getFounder() { return myFounder; }
  /**
   * The date that this organization was dissolved.
   */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getDissolutionDate() { return myDissolutionDate; }
  /**
   * The date that this organization was founded.
   */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getFoundingDate() { return myFoundingDate; }
  /**
   * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  public String getGlobalLocationNumber() { return myGlobalLocationNumber; }
  /**
   * Points-of-Sales operated by the organization or person.
   */
  public Place getHasPOS() { return myHasPOS; }
  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  public String getIsicV4() { return myIsicV4; }
  /**
   * The official name of the organization, e.g. the registered company name.
   */
  public String getLegalName() { return myLegalName; }
  /**
   * An associated logo.
   */
  public ImageObjectOrString getLogo() { return myLogo; }
  /**
   * A pointer to products or services offered by the organization or person.
   */
  public Offer getMakesOffer() { return myMakesOffer; }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  public OrganizationOrPerson getMember() { return myMember; }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  public OrganizationOrProgramMembership getMemberOf() { return myMemberOf; }
  /**
   * The North American Industry Classification System (NAICS) code for a particular organization or business person.
   */
  public String getNaics() { return myNaics; }
  /**
   * The number of employees in an organization e.g. business.
   */
  public QuantitativeValue getNumberOfEmployees() { return myNumberOfEmployees; }
  /**
   * Products owned by the organization or person.
   */
  public OwnershipInfoOrProduct getOwns() { return myOwns; }
  /**
   * A review of the item.
   */
  public Review getReview() { return myReview; }
  /**
   * A pointer to products or services sought by the organization or person (demand).
   */
  public Demand getSeeks() { return mySeeks; }
  /**
   * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
   */
  public Organization getSubOrganization() { return mySubOrganization; }
  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  public String getTaxID() { return myTaxID; }
  /**
   * The telephone number.
   */
  public String getTelephone() { return myTelephone; }
  /**
   * The Value-added Tax ID of the organization or person.
   */
  public String getVatID() { return myVatID; }
  /**
   * The place where the Organization was founded.
   */
  public Place getFoundingLocation() { return myFoundingLocation; }
  protected Organization(PostalAddress address, AggregateRating aggregateRating, String award, BrandOrOrganization brand, ContactPoint contactPoint, Organization department, String duns, String email, Person employee, Event event, String faxNumber, Person founder, java.util.Date dissolutionDate, java.util.Date foundingDate, String globalLocationNumber, Place hasPOS, String isicV4, String legalName, ImageObjectOrString logo, Offer makesOffer, OrganizationOrPerson member, OrganizationOrProgramMembership memberOf, String naics, QuantitativeValue numberOfEmployees, OwnershipInfoOrProduct owns, Review review, Demand seeks, Organization subOrganization, String taxID, String telephone, String vatID, Place foundingLocation, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
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
  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myAddress != null ? myAddress.hashCode() : 0);
    result = 31 * result + (myAggregateRating != null ? myAggregateRating.hashCode() : 0);
    result = 31 * result + (myAward != null ? myAward.hashCode() : 0);
    result = 31 * result + (myBrand != null ? myBrand.hashCode() : 0);
    result = 31 * result + (myContactPoint != null ? myContactPoint.hashCode() : 0);
    result = 31 * result + (myDepartment != null ? myDepartment.hashCode() : 0);
    result = 31 * result + (myDuns != null ? myDuns.hashCode() : 0);
    result = 31 * result + (myEmail != null ? myEmail.hashCode() : 0);
    result = 31 * result + (myEmployee != null ? myEmployee.hashCode() : 0);
    result = 31 * result + (myEvent != null ? myEvent.hashCode() : 0);
    result = 31 * result + (myFaxNumber != null ? myFaxNumber.hashCode() : 0);
    result = 31 * result + (myFounder != null ? myFounder.hashCode() : 0);
    result = 31 * result + (myDissolutionDate != null ? myDissolutionDate.hashCode() : 0);
    result = 31 * result + (myFoundingDate != null ? myFoundingDate.hashCode() : 0);
    result = 31 * result + (myGlobalLocationNumber != null ? myGlobalLocationNumber.hashCode() : 0);
    result = 31 * result + (myHasPOS != null ? myHasPOS.hashCode() : 0);
    result = 31 * result + (myIsicV4 != null ? myIsicV4.hashCode() : 0);
    result = 31 * result + (myLegalName != null ? myLegalName.hashCode() : 0);
    result = 31 * result + (myLogo != null ? myLogo.hashCode() : 0);
    result = 31 * result + (myMakesOffer != null ? myMakesOffer.hashCode() : 0);
    result = 31 * result + (myMember != null ? myMember.hashCode() : 0);
    result = 31 * result + (myMemberOf != null ? myMemberOf.hashCode() : 0);
    result = 31 * result + (myNaics != null ? myNaics.hashCode() : 0);
    result = 31 * result + (myNumberOfEmployees != null ? myNumberOfEmployees.hashCode() : 0);
    result = 31 * result + (myOwns != null ? myOwns.hashCode() : 0);
    result = 31 * result + (myReview != null ? myReview.hashCode() : 0);
    result = 31 * result + (mySeeks != null ? mySeeks.hashCode() : 0);
    result = 31 * result + (mySubOrganization != null ? mySubOrganization.hashCode() : 0);
    result = 31 * result + (myTaxID != null ? myTaxID.hashCode() : 0);
    result = 31 * result + (myTelephone != null ? myTelephone.hashCode() : 0);
    result = 31 * result + (myVatID != null ? myVatID.hashCode() : 0);
    result = 31 * result + (myFoundingLocation != null ? myFoundingLocation.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Organization organization = (Organization) o;
    if (!super.equals(o)) return false;
    if (myAddress != null ? !myAddress.equals(organization.myAddress) : organization.myAddress != null) return false;
    if (myAggregateRating != null ? !myAggregateRating.equals(organization.myAggregateRating) : organization.myAggregateRating != null) return false;
    if (myAward != null ? !myAward.equals(organization.myAward) : organization.myAward != null) return false;
    if (myBrand != null ? !myBrand.equals(organization.myBrand) : organization.myBrand != null) return false;
    if (myContactPoint != null ? !myContactPoint.equals(organization.myContactPoint) : organization.myContactPoint != null) return false;
    if (myDepartment != null ? !myDepartment.equals(organization.myDepartment) : organization.myDepartment != null) return false;
    if (myDuns != null ? !myDuns.equals(organization.myDuns) : organization.myDuns != null) return false;
    if (myEmail != null ? !myEmail.equals(organization.myEmail) : organization.myEmail != null) return false;
    if (myEmployee != null ? !myEmployee.equals(organization.myEmployee) : organization.myEmployee != null) return false;
    if (myEvent != null ? !myEvent.equals(organization.myEvent) : organization.myEvent != null) return false;
    if (myFaxNumber != null ? !myFaxNumber.equals(organization.myFaxNumber) : organization.myFaxNumber != null) return false;
    if (myFounder != null ? !myFounder.equals(organization.myFounder) : organization.myFounder != null) return false;
    if (myDissolutionDate != null ? !myDissolutionDate.equals(organization.myDissolutionDate) : organization.myDissolutionDate != null) return false;
    if (myFoundingDate != null ? !myFoundingDate.equals(organization.myFoundingDate) : organization.myFoundingDate != null) return false;
    if (myGlobalLocationNumber != null ? !myGlobalLocationNumber.equals(organization.myGlobalLocationNumber) : organization.myGlobalLocationNumber != null) return false;
    if (myHasPOS != null ? !myHasPOS.equals(organization.myHasPOS) : organization.myHasPOS != null) return false;
    if (myIsicV4 != null ? !myIsicV4.equals(organization.myIsicV4) : organization.myIsicV4 != null) return false;
    if (myLegalName != null ? !myLegalName.equals(organization.myLegalName) : organization.myLegalName != null) return false;
    if (myLogo != null ? !myLogo.equals(organization.myLogo) : organization.myLogo != null) return false;
    if (myMakesOffer != null ? !myMakesOffer.equals(organization.myMakesOffer) : organization.myMakesOffer != null) return false;
    if (myMember != null ? !myMember.equals(organization.myMember) : organization.myMember != null) return false;
    if (myMemberOf != null ? !myMemberOf.equals(organization.myMemberOf) : organization.myMemberOf != null) return false;
    if (myNaics != null ? !myNaics.equals(organization.myNaics) : organization.myNaics != null) return false;
    if (myNumberOfEmployees != null ? !myNumberOfEmployees.equals(organization.myNumberOfEmployees) : organization.myNumberOfEmployees != null) return false;
    if (myOwns != null ? !myOwns.equals(organization.myOwns) : organization.myOwns != null) return false;
    if (myReview != null ? !myReview.equals(organization.myReview) : organization.myReview != null) return false;
    if (mySeeks != null ? !mySeeks.equals(organization.mySeeks) : organization.mySeeks != null) return false;
    if (mySubOrganization != null ? !mySubOrganization.equals(organization.mySubOrganization) : organization.mySubOrganization != null) return false;
    if (myTaxID != null ? !myTaxID.equals(organization.myTaxID) : organization.myTaxID != null) return false;
    if (myTelephone != null ? !myTelephone.equals(organization.myTelephone) : organization.myTelephone != null) return false;
    if (myVatID != null ? !myVatID.equals(organization.myVatID) : organization.myVatID != null) return false;
    if (myFoundingLocation != null ? !myFoundingLocation.equals(organization.myFoundingLocation) : organization.myFoundingLocation != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link Organization}
   */
  public static class Builder implements ThingBuilder<Organization> {
    public Organization build() {
      return new Organization(address, aggregateRating, award, brand, contactPoint, department, duns, email, employee, event, faxNumber, founder, dissolutionDate, foundingDate, globalLocationNumber, hasPOS, isicV4, legalName, logo, makesOffer, member, memberOf, naics, numberOfEmployees, owns, review, seeks, subOrganization, taxID, telephone, vatID, foundingLocation, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress postalAddress) {
      this.address = postalAddress;
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress.Builder postalAddress) {
      return this.address(postalAddress.build());
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
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      this.award = award;
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand brand) {
      if (this.brand == null) this.brand = new BrandOrOrganization();
      this.brand.setBrand(brand);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Brand.Builder brand) {
      return this.brand(brand.build());
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization organization) {
      if (this.brand == null) this.brand = new BrandOrOrganization();
      this.brand.setOrganization(organization);
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @NotNull public Builder brand(@NotNull Organization.Builder organization) {
      return this.brand(organization.build());
    }
    /**
     * A contact point for a person or organization.
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint contactPoint) {
      this.contactPoint = contactPoint;
      return this;
    }
    /**
     * A contact point for a person or organization.
     */
    @NotNull public Builder contactPoint(@NotNull ContactPoint.Builder contactPoint) {
      return this.contactPoint(contactPoint.build());
    }
    /**
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    @NotNull public Builder department(@NotNull Organization organization) {
      this.department = organization;
      return this;
    }
    /**
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    @NotNull public Builder department(@NotNull Organization.Builder organization) {
      return this.department(organization.build());
    }
    /**
     * The Dun & Bradstreet DUNS number for identifying an organization or business person.
     */
    @NotNull public Builder duns(@NotNull String duns) {
      this.duns = duns;
      return this;
    }
    /**
     * Email address.
     */
    @NotNull public Builder email(@NotNull String email) {
      this.email = email;
      return this;
    }
    /**
     * Someone working for this organization.
     */
    @NotNull public Builder employee(@NotNull Person person) {
      this.employee = person;
      return this;
    }
    /**
     * Someone working for this organization.
     */
    @NotNull public Builder employee(@NotNull Person.Builder person) {
      return this.employee(person.build());
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event event) {
      this.event = event;
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      return this.event(event.build());
    }
    /**
     * The fax number.
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      this.faxNumber = faxNumber;
      return this;
    }
    /**
     * A person who founded this organization.
     */
    @NotNull public Builder founder(@NotNull Person person) {
      this.founder = person;
      return this;
    }
    /**
     * A person who founded this organization.
     */
    @NotNull public Builder founder(@NotNull Person.Builder person) {
      return this.founder(person.build());
    }
    /**
     * The date that this organization was dissolved.
     */
    @NotNull public Builder dissolutionDate(@NotNull java.util.Date date) {
      this.dissolutionDate = date;
      return this;
    }
    /**
     * The date that this organization was founded.
     */
    @NotNull public Builder foundingDate(@NotNull java.util.Date date) {
      this.foundingDate = date;
      return this;
    }
    /**
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(@NotNull String globalLocationNumber) {
      this.globalLocationNumber = globalLocationNumber;
      return this;
    }
    /**
     * Points-of-Sales operated by the organization or person.
     */
    @NotNull public Builder hasPOS(@NotNull Place place) {
      this.hasPOS = place;
      return this;
    }
    /**
     * Points-of-Sales operated by the organization or person.
     */
    @NotNull public Builder hasPOS(@NotNull Place.Builder place) {
      return this.hasPOS(place.build());
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      this.isicV4 = isicV4;
      return this;
    }
    /**
     * The official name of the organization, e.g. the registered company name.
     */
    @NotNull public Builder legalName(@NotNull String legalName) {
      this.legalName = legalName;
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject imageObject) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setImageObject(imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject.Builder imageObject) {
      return this.logo(imageObject.build());
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull String logo) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setString(logo);
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    @NotNull public Builder makesOffer(@NotNull Offer offer) {
      this.makesOffer = offer;
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    @NotNull public Builder makesOffer(@NotNull Offer.Builder offer) {
      return this.makesOffer(offer.build());
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Organization organization) {
      if (this.member == null) this.member = new OrganizationOrPerson();
      this.member.setOrganization(organization);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Organization.Builder organization) {
      return this.member(organization.build());
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Person person) {
      if (this.member == null) this.member = new OrganizationOrPerson();
      this.member.setPerson(person);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Person.Builder person) {
      return this.member(person.build());
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull Organization organization) {
      if (this.memberOf == null) this.memberOf = new OrganizationOrProgramMembership();
      this.memberOf.setOrganization(organization);
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull Organization.Builder organization) {
      return this.memberOf(organization.build());
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull ProgramMembership programMembership) {
      if (this.memberOf == null) this.memberOf = new OrganizationOrProgramMembership();
      this.memberOf.setProgramMembership(programMembership);
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull ProgramMembership.Builder programMembership) {
      return this.memberOf(programMembership.build());
    }
    /**
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     */
    @NotNull public Builder naics(@NotNull String naics) {
      this.naics = naics;
      return this;
    }
    /**
     * The number of employees in an organization e.g. business.
     */
    @NotNull public Builder numberOfEmployees(@NotNull QuantitativeValue quantitativeValue) {
      this.numberOfEmployees = quantitativeValue;
      return this;
    }
    /**
     * The number of employees in an organization e.g. business.
     */
    @NotNull public Builder numberOfEmployees(@NotNull QuantitativeValue.Builder quantitativeValue) {
      return this.numberOfEmployees(quantitativeValue.build());
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull OwnershipInfo ownershipInfo) {
      if (this.owns == null) this.owns = new OwnershipInfoOrProduct();
      this.owns.setOwnershipInfo(ownershipInfo);
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull OwnershipInfo.Builder ownershipInfo) {
      return this.owns(ownershipInfo.build());
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull Product product) {
      if (this.owns == null) this.owns = new OwnershipInfoOrProduct();
      this.owns.setProduct(product);
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    @NotNull public Builder owns(@NotNull Product.Builder product) {
      return this.owns(product.build());
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
     * A pointer to products or services sought by the organization or person (demand).
     */
    @NotNull public Builder seeks(@NotNull Demand demand) {
      this.seeks = demand;
      return this;
    }
    /**
     * A pointer to products or services sought by the organization or person (demand).
     */
    @NotNull public Builder seeks(@NotNull Demand.Builder demand) {
      return this.seeks(demand.build());
    }
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    @NotNull public Builder subOrganization(@NotNull Organization organization) {
      this.subOrganization = organization;
      return this;
    }
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    @NotNull public Builder subOrganization(@NotNull Organization.Builder organization) {
      return this.subOrganization(organization.build());
    }
    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     */
    @NotNull public Builder taxID(@NotNull String taxID) {
      this.taxID = taxID;
      return this;
    }
    /**
     * The telephone number.
     */
    @NotNull public Builder telephone(@NotNull String telephone) {
      this.telephone = telephone;
      return this;
    }
    /**
     * The Value-added Tax ID of the organization or person.
     */
    @NotNull public Builder vatID(@NotNull String vatID) {
      this.vatID = vatID;
      return this;
    }
    /**
     * The place where the Organization was founded.
     */
    @NotNull public Builder foundingLocation(@NotNull Place place) {
      this.foundingLocation = place;
      return this;
    }
    /**
     * The place where the Organization was founded.
     */
    @NotNull public Builder foundingLocation(@NotNull Place.Builder place) {
      return this.foundingLocation(place.build());
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
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
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
        if ("address".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); continue; }
        if ("aggregateRating".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); continue; }
        if ("award".equals(key) && value instanceof String) { award((String)value); continue; }
        if ("brand".equals(key) && value instanceof Brand) { brand((Brand)value); continue; }
        if ("brand".equals(key) && value instanceof Organization) { brand((Organization)value); continue; }
        if ("contactPoint".equals(key) && value instanceof ContactPoint) { contactPoint((ContactPoint)value); continue; }
        if ("department".equals(key) && value instanceof Organization) { department((Organization)value); continue; }
        if ("duns".equals(key) && value instanceof String) { duns((String)value); continue; }
        if ("email".equals(key) && value instanceof String) { email((String)value); continue; }
        if ("employee".equals(key) && value instanceof Person) { employee((Person)value); continue; }
        if ("event".equals(key) && value instanceof Event) { event((Event)value); continue; }
        if ("faxNumber".equals(key) && value instanceof String) { faxNumber((String)value); continue; }
        if ("founder".equals(key) && value instanceof Person) { founder((Person)value); continue; }
        if ("dissolutionDate".equals(key) && value instanceof java.util.Date) { dissolutionDate((java.util.Date)value); continue; }
        if ("foundingDate".equals(key) && value instanceof java.util.Date) { foundingDate((java.util.Date)value); continue; }
        if ("globalLocationNumber".equals(key) && value instanceof String) { globalLocationNumber((String)value); continue; }
        if ("hasPOS".equals(key) && value instanceof Place) { hasPOS((Place)value); continue; }
        if ("isicV4".equals(key) && value instanceof String) { isicV4((String)value); continue; }
        if ("legalName".equals(key) && value instanceof String) { legalName((String)value); continue; }
        if ("logo".equals(key) && value instanceof ImageObject) { logo((ImageObject)value); continue; }
        if ("logo".equals(key) && value instanceof String) { logo((String)value); continue; }
        if ("makesOffer".equals(key) && value instanceof Offer) { makesOffer((Offer)value); continue; }
        if ("member".equals(key) && value instanceof Organization) { member((Organization)value); continue; }
        if ("member".equals(key) && value instanceof Person) { member((Person)value); continue; }
        if ("memberOf".equals(key) && value instanceof Organization) { memberOf((Organization)value); continue; }
        if ("memberOf".equals(key) && value instanceof ProgramMembership) { memberOf((ProgramMembership)value); continue; }
        if ("naics".equals(key) && value instanceof String) { naics((String)value); continue; }
        if ("numberOfEmployees".equals(key) && value instanceof QuantitativeValue) { numberOfEmployees((QuantitativeValue)value); continue; }
        if ("owns".equals(key) && value instanceof OwnershipInfo) { owns((OwnershipInfo)value); continue; }
        if ("owns".equals(key) && value instanceof Product) { owns((Product)value); continue; }
        if ("review".equals(key) && value instanceof Review) { review((Review)value); continue; }
        if ("seeks".equals(key) && value instanceof Demand) { seeks((Demand)value); continue; }
        if ("subOrganization".equals(key) && value instanceof Organization) { subOrganization((Organization)value); continue; }
        if ("taxID".equals(key) && value instanceof String) { taxID((String)value); continue; }
        if ("telephone".equals(key) && value instanceof String) { telephone((String)value); continue; }
        if ("vatID".equals(key) && value instanceof String) { vatID((String)value); continue; }
        if ("foundingLocation".equals(key) && value instanceof Place) { foundingLocation((Place)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("@id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private PostalAddress address;
    private AggregateRating aggregateRating;
    private String award;
    private BrandOrOrganization brand;
    private ContactPoint contactPoint;
    private Organization department;
    private String duns;
    private String email;
    private Person employee;
    private Event event;
    private String faxNumber;
    private Person founder;
    private java.util.Date dissolutionDate;
    private java.util.Date foundingDate;
    private String globalLocationNumber;
    private Place hasPOS;
    private String isicV4;
    private String legalName;
    private ImageObjectOrString logo;
    private Offer makesOffer;
    private OrganizationOrPerson member;
    private OrganizationOrProgramMembership memberOf;
    private String naics;
    private QuantitativeValue numberOfEmployees;
    private OwnershipInfoOrProduct owns;
    private Review review;
    private Demand seeks;
    private Organization subOrganization;
    private String taxID;
    private String telephone;
    private String vatID;
    private Place foundingLocation;
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
  
  private PostalAddress myAddress;
  private AggregateRating myAggregateRating;
  private String myAward;
  private BrandOrOrganization myBrand;
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
  private OwnershipInfoOrProduct myOwns;
  private Review myReview;
  private Demand mySeeks;
  private Organization mySubOrganization;
  private String myTaxID;
  private String myTelephone;
  private String myVatID;
  private Place myFoundingLocation;
}
