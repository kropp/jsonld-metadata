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

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

/**
 * A school.
 */
public class School extends EducationalOrganization {
  protected School(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link School}
   */
  public static class Builder extends EducationalOrganization.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public School build() {
      return new School(myData);
    }
    /**
     * Alumni of an organization.
     */
    @NotNull public Builder alumni(@NotNull Person person) {
      putValue("alumni", person);
      return this;
    }
    /**
     * Alumni of an organization.
     */
    @NotNull public Builder alumni(@NotNull Person.Builder person) {
      putValue("alumni", person.build());
      return this;
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog);
      return this;
    }
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @NotNull public Builder hasOfferCatalog(@NotNull OfferCatalog.Builder offerCatalog) {
      putValue("hasOfferCatalog", offerCatalog.build());
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
     * An award won by or for this item.
     */
    @NotNull public Builder award(@NotNull String award) {
      putValue("award", award);
      return this;
    }
    /**
     * The larger organization that this organization is a [[subOrganization]] of, if any.
     */
    @NotNull public Builder parentOrganization(@NotNull Organization organization) {
      putValue("parentOrganization", organization);
      return this;
    }
    /**
     * The larger organization that this organization is a [[subOrganization]] of, if any.
     */
    @NotNull public Builder parentOrganization(@NotNull Organization.Builder organization) {
      putValue("parentOrganization", organization.build());
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
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    @NotNull public Builder department(@NotNull Organization organization) {
      putValue("department", organization);
      return this;
    }
    /**
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    @NotNull public Builder department(@NotNull Organization.Builder organization) {
      putValue("department", organization.build());
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
     * Someone working for this organization.
     */
    @NotNull public Builder employee(@NotNull Person person) {
      putValue("employee", person);
      return this;
    }
    /**
     * Someone working for this organization.
     */
    @NotNull public Builder employee(@NotNull Person.Builder person) {
      putValue("employee", person.build());
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event event) {
      putValue("event", event);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      putValue("event", event.build());
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
     * A person who founded this organization.
     */
    @NotNull public Builder founder(@NotNull Person person) {
      putValue("founder", person);
      return this;
    }
    /**
     * A person who founded this organization.
     */
    @NotNull public Builder founder(@NotNull Person.Builder person) {
      putValue("founder", person.build());
      return this;
    }
    /**
     * The date that this organization was dissolved.
     */
    @NotNull public Builder dissolutionDate(@NotNull java.util.Date date) {
      putValue("dissolutionDate", date);
      return this;
    }
    /**
     * The date that this organization was founded.
     */
    @NotNull public Builder foundingDate(@NotNull java.util.Date date) {
      putValue("foundingDate", date);
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
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      putValue("isicV4", isicV4);
      return this;
    }
    /**
     * The official name of the organization, e.g. the registered company name.
     */
    @NotNull public Builder legalName(@NotNull String legalName) {
      putValue("legalName", legalName);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject imageObject) {
      putValue("logo", imageObject);
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull ImageObject.Builder imageObject) {
      putValue("logo", imageObject.build());
      return this;
    }
    /**
     * An associated logo.
     */
    @NotNull public Builder logo(@NotNull String logo) {
      putValue("logo", logo);
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
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Organization organization) {
      putValue("member", organization);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Organization.Builder organization) {
      putValue("member", organization.build());
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Person person) {
      putValue("member", person);
      return this;
    }
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @NotNull public Builder member(@NotNull Person.Builder person) {
      putValue("member", person.build());
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
     * The number of employees in an organization e.g. business.
     */
    @NotNull public Builder numberOfEmployees(@NotNull QuantitativeValue quantitativeValue) {
      putValue("numberOfEmployees", quantitativeValue);
      return this;
    }
    /**
     * The number of employees in an organization e.g. business.
     */
    @NotNull public Builder numberOfEmployees(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("numberOfEmployees", quantitativeValue.build());
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
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    @NotNull public Builder subOrganization(@NotNull Organization organization) {
      putValue("subOrganization", organization);
      return this;
    }
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    @NotNull public Builder subOrganization(@NotNull Organization.Builder organization) {
      putValue("subOrganization", organization.build());
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
     * The place where the Organization was founded.
     */
    @NotNull public Builder foundingLocation(@NotNull Place place) {
      putValue("foundingLocation", place);
      return this;
    }
    /**
     * The place where the Organization was founded.
     */
    @NotNull public Builder foundingLocation(@NotNull Place.Builder place) {
      putValue("foundingLocation", place.build());
      return this;
    }
    /**
     * An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.
     */
    @NotNull public Builder leiCode(@NotNull Identifier identifier) {
      putValue("leiCode", identifier);
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
      super.fromMap(key, value);
    }
  }
  
}
