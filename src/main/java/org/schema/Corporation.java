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
 * Organization: A business corporation.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews
 */
public class Corporation extends Organization {
  /**
   * The exchange traded instrument associated with a Corporation object. The tickerSymbol is expressed as an exchange and an instrument name separated by a space character. For the exchange component of the tickerSymbol attribute, we reccommend using the controlled vocaulary of Market Identifier Codes (MIC) specified in ISO15022.
   */
  public String getTickerSymbol() {
    return myTickerSymbol;
  }
  /**
   * Builder for {@link Corporation}
   */
  static final class CorporationThingBuilder implements Builder {
    /**
     * Creates new {@link Corporation} instance.
     */
    public Corporation build() {
      return new Corporation(tickerSymbol, address, aggregateRating, award, brand, contactPoint, department, duns, email, employee, event, faxNumber, founder, dissolutionDate, foundingDate, globalLocationNumber, hasPOS, isicV4, legalName, logo, makesOffer, member, memberOf, naics, numberOfEmployees, owns, review, seeks, subOrganization, taxID, telephone, vatID, foundingLocation, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The exchange traded instrument associated with a Corporation object. The tickerSymbol is expressed as an exchange and an instrument name separated by a space character. For the exchange component of the tickerSymbol attribute, we reccommend using the controlled vocaulary of Market Identifier Codes (MIC) specified in ISO15022.
     */
    @NotNull public Builder tickerSymbol(String tickerSymbol) {
      this.tickerSymbol = tickerSymbol;
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
     * An award won by or for this item.
     */
    @NotNull public Builder award(String award) {
      this.award = award;
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
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    @NotNull public Builder department(Organization organization) {
      this.department = organization;
      return this;
    }
    /**
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    @NotNull public Builder department(Organization.Builder organization) {
      return this.department(organization.build());
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
     * Someone working for this organization.
     */
    @NotNull public Builder employee(Person person) {
      this.employee = person;
      return this;
    }
    /**
     * Someone working for this organization.
     */
    @NotNull public Builder employee(Person.Builder person) {
      return this.employee(person.build());
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(Event event) {
      this.event = event;
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(Event.Builder event) {
      return this.event(event.build());
    }
    /**
     * The fax number.
     */
    @NotNull public Builder faxNumber(String faxNumber) {
      this.faxNumber = faxNumber;
      return this;
    }
    /**
     * A person who founded this organization.
     */
    @NotNull public Builder founder(Person person) {
      this.founder = person;
      return this;
    }
    /**
     * A person who founded this organization.
     */
    @NotNull public Builder founder(Person.Builder person) {
      return this.founder(person.build());
    }
    /**
     * The date that this organization was dissolved.
     */
    @NotNull public Builder dissolutionDate(java.util.Date date) {
      this.dissolutionDate = date;
      return this;
    }
    /**
     * The date that this organization was founded.
     */
    @NotNull public Builder foundingDate(java.util.Date date) {
      this.foundingDate = date;
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
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(String isicV4) {
      this.isicV4 = isicV4;
      return this;
    }
    /**
     * The official name of the organization, e.g. the registered company name.
     */
    @NotNull public Builder legalName(String legalName) {
      this.legalName = legalName;
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(ImageObject imageObject) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setImageObject(imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(ImageObject.Builder imageObject) {
      return this.logo(imageObject.build());
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(String logo) {
      if (this.logo == null) this.logo = new ImageObjectOrString();
      this.logo.setString(logo);
      return this;
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
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(Organization organization) {
      if (this.member == null) this.member = new OrganizationOrPerson();
      this.member.setOrganization(organization);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(Organization.Builder organization) {
      return this.member(organization.build());
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(Person person) {
      if (this.member == null) this.member = new OrganizationOrPerson();
      this.member.setPerson(person);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(Person.Builder person) {
      return this.member(person.build());
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
     * The number of employees in an organization e.g. business.
     */
    @NotNull public Builder numberOfEmployees(QuantitativeValue quantitativeValue) {
      this.numberOfEmployees = quantitativeValue;
      return this;
    }
    /**
     * The number of employees in an organization e.g. business.
     */
    @NotNull public Builder numberOfEmployees(QuantitativeValue.Builder quantitativeValue) {
      return this.numberOfEmployees(quantitativeValue.build());
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
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    @NotNull public Builder subOrganization(Organization organization) {
      this.subOrganization = organization;
      return this;
    }
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    @NotNull public Builder subOrganization(Organization.Builder organization) {
      return this.subOrganization(organization.build());
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
     * The place where the Organization was founded.
     */
    @NotNull public Builder foundingLocation(Place place) {
      this.foundingLocation = place;
      return this;
    }
    /**
     * The place where the Organization was founded.
     */
    @NotNull public Builder foundingLocation(Place.Builder place) {
      return this.foundingLocation(place.build());
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
    private String tickerSymbol;
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
  public interface Builder extends ThingBuilder<Corporation> {
    @NotNull Builder tickerSymbol(String tickerSymbol);
    @NotNull Builder address(PostalAddress postalAddress);
    @NotNull Builder address(PostalAddress.Builder postalAddress);
    @NotNull Builder aggregateRating(AggregateRating aggregateRating);
    @NotNull Builder aggregateRating(AggregateRating.Builder aggregateRating);
    @NotNull Builder award(String award);
    @NotNull Builder brand(Brand brand);
    @NotNull Builder brand(Brand.Builder brand);
    @NotNull Builder brand(Organization organization);
    @NotNull Builder brand(Organization.Builder organization);
    @NotNull Builder contactPoint(ContactPoint contactPoint);
    @NotNull Builder contactPoint(ContactPoint.Builder contactPoint);
    @NotNull Builder department(Organization organization);
    @NotNull Builder department(Organization.Builder organization);
    @NotNull Builder duns(String duns);
    @NotNull Builder email(String email);
    @NotNull Builder employee(Person person);
    @NotNull Builder employee(Person.Builder person);
    @NotNull Builder event(Event event);
    @NotNull Builder event(Event.Builder event);
    @NotNull Builder faxNumber(String faxNumber);
    @NotNull Builder founder(Person person);
    @NotNull Builder founder(Person.Builder person);
    @NotNull Builder dissolutionDate(java.util.Date date);
    @NotNull Builder foundingDate(java.util.Date date);
    @NotNull Builder globalLocationNumber(String globalLocationNumber);
    @NotNull Builder hasPOS(Place place);
    @NotNull Builder hasPOS(Place.Builder place);
    @NotNull Builder isicV4(String isicV4);
    @NotNull Builder legalName(String legalName);
    @NotNull Builder logo(ImageObject imageObject);
    @NotNull Builder logo(ImageObject.Builder imageObject);
    @NotNull Builder logo(String logo);
    @NotNull Builder makesOffer(Offer offer);
    @NotNull Builder makesOffer(Offer.Builder offer);
    @NotNull Builder member(Organization organization);
    @NotNull Builder member(Organization.Builder organization);
    @NotNull Builder member(Person person);
    @NotNull Builder member(Person.Builder person);
    @NotNull Builder memberOf(Organization organization);
    @NotNull Builder memberOf(Organization.Builder organization);
    @NotNull Builder memberOf(ProgramMembership programMembership);
    @NotNull Builder memberOf(ProgramMembership.Builder programMembership);
    @NotNull Builder naics(String naics);
    @NotNull Builder numberOfEmployees(QuantitativeValue quantitativeValue);
    @NotNull Builder numberOfEmployees(QuantitativeValue.Builder quantitativeValue);
    @NotNull Builder owns(OwnershipInfo ownershipInfo);
    @NotNull Builder owns(OwnershipInfo.Builder ownershipInfo);
    @NotNull Builder owns(Product product);
    @NotNull Builder owns(Product.Builder product);
    @NotNull Builder review(Review review);
    @NotNull Builder review(Review.Builder review);
    @NotNull Builder seeks(Demand demand);
    @NotNull Builder seeks(Demand.Builder demand);
    @NotNull Builder subOrganization(Organization organization);
    @NotNull Builder subOrganization(Organization.Builder organization);
    @NotNull Builder taxID(String taxID);
    @NotNull Builder telephone(String telephone);
    @NotNull Builder vatID(String vatID);
    @NotNull Builder foundingLocation(Place place);
    @NotNull Builder foundingLocation(Place.Builder place);
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

  protected Corporation(String tickerSymbol, PostalAddress address, AggregateRating aggregateRating, String award, BrandOrOrganization brand, ContactPoint contactPoint, Organization department, String duns, String email, Person employee, Event event, String faxNumber, Person founder, java.util.Date dissolutionDate, java.util.Date foundingDate, String globalLocationNumber, Place hasPOS, String isicV4, String legalName, ImageObjectOrString logo, Offer makesOffer, OrganizationOrPerson member, OrganizationOrProgramMembership memberOf, String naics, QuantitativeValue numberOfEmployees, OwnershipInfoOrProduct owns, Review review, Demand seeks, Organization subOrganization, String taxID, String telephone, String vatID, Place foundingLocation, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(address, aggregateRating, award, brand, contactPoint, department, duns, email, employee, event, faxNumber, founder, dissolutionDate, foundingDate, globalLocationNumber, hasPOS, isicV4, legalName, logo, makesOffer, member, memberOf, naics, numberOfEmployees, owns, review, seeks, subOrganization, taxID, telephone, vatID, foundingLocation, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myTickerSymbol = tickerSymbol;
  }
  private String myTickerSymbol;
}
