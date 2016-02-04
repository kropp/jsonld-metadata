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
import java.util.*;

/**
 * An organization such as a school, NGO, corporation, club, etc.
 */
public class Organization extends Thing {
  /**
   * Physical address of the item.
   */
  @JsonIgnore public PostalAddress getAddress() {
    return (PostalAddress) getValue("address");
  }
  /**
   * Physical address of the item.
   */
  @JsonIgnore public Collection<PostalAddress> getAddresss() {
    final Object current = myData.get("address");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PostalAddress>) current;
    }
    return Arrays.asList((PostalAddress) current);
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
   * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
   */
  @JsonIgnore public Organization getDepartment() {
    return (Organization) getValue("department");
  }
  /**
   * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
   */
  @JsonIgnore public Collection<Organization> getDepartments() {
    final Object current = myData.get("department");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The Dun & Bradstreet DUNS number for identifying an organization or business person.
   */
  @JsonIgnore public String getDuns() {
    return (String) getValue("duns");
  }
  /**
   * The Dun & Bradstreet DUNS number for identifying an organization or business person.
   */
  @JsonIgnore public Collection<String> getDunss() {
    final Object current = myData.get("duns");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * Someone working for this organization.
   */
  @JsonIgnore public Person getEmployee() {
    return (Person) getValue("employee");
  }
  /**
   * Someone working for this organization.
   */
  @JsonIgnore public Collection<Person> getEmployees() {
    final Object current = myData.get("employee");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * Upcoming or past event associated with this place, organization, or action.
   */
  @JsonIgnore public Event getEvent() {
    return (Event) getValue("event");
  }
  /**
   * Upcoming or past event associated with this place, organization, or action.
   */
  @JsonIgnore public Collection<Event> getEvents() {
    final Object current = myData.get("event");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Event>) current;
    }
    return Arrays.asList((Event) current);
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
   * A person who founded this organization.
   */
  @JsonIgnore public Person getFounder() {
    return (Person) getValue("founder");
  }
  /**
   * A person who founded this organization.
   */
  @JsonIgnore public Collection<Person> getFounders() {
    final Object current = myData.get("founder");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The date that this organization was dissolved.
   */
  @JsonIgnore public java.util.Date getDissolutionDate() {
    return (java.util.Date) getValue("dissolutionDate");
  }
  /**
   * The date that this organization was dissolved.
   */
  @JsonIgnore public Collection<java.util.Date> getDissolutionDates() {
    final Object current = myData.get("dissolutionDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date that this organization was founded.
   */
  @JsonIgnore public java.util.Date getFoundingDate() {
    return (java.util.Date) getValue("foundingDate");
  }
  /**
   * The date that this organization was founded.
   */
  @JsonIgnore public Collection<java.util.Date> getFoundingDates() {
    final Object current = myData.get("foundingDate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  @JsonIgnore public String getGlobalLocationNumber() {
    return (String) getValue("globalLocationNumber");
  }
  /**
   * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  @JsonIgnore public Collection<String> getGlobalLocationNumbers() {
    final Object current = myData.get("globalLocationNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * The official name of the organization, e.g. the registered company name.
   */
  @JsonIgnore public String getLegalName() {
    return (String) getValue("legalName");
  }
  /**
   * The official name of the organization, e.g. the registered company name.
   */
  @JsonIgnore public Collection<String> getLegalNames() {
    final Object current = myData.get("legalName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An associated logo.
   */
  @JsonIgnore public ImageObject getLogoImageObject() {
    return (ImageObject) getValue("logo");
  }
  /**
   * An associated logo.
   */
  @JsonIgnore public Collection<ImageObject> getLogoImageObjects() {
    final Object current = myData.get("logo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ImageObject>) current;
    }
    return Arrays.asList((ImageObject) current);
  }
  /**
   * An associated logo.
   */
  @JsonIgnore public String getLogoString() {
    return (String) getValue("logo");
  }
  /**
   * An associated logo.
   */
  @JsonIgnore public Collection<String> getLogoStrings() {
    final Object current = myData.get("logo");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  @JsonIgnore public Organization getMemberOrganization() {
    return (Organization) getValue("member");
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  @JsonIgnore public Collection<Organization> getMemberOrganizations() {
    final Object current = myData.get("member");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  @JsonIgnore public Person getMemberPerson() {
    return (Person) getValue("member");
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  @JsonIgnore public Collection<Person> getMemberPersons() {
    final Object current = myData.get("member");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public Organization getMemberOfOrganization() {
    return (Organization) getValue("memberOf");
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public Collection<Organization> getMemberOfOrganizations() {
    final Object current = myData.get("memberOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public ProgramMembership getMemberOfProgramMembership() {
    return (ProgramMembership) getValue("memberOf");
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  @JsonIgnore public Collection<ProgramMembership> getMemberOfProgramMemberships() {
    final Object current = myData.get("memberOf");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ProgramMembership>) current;
    }
    return Arrays.asList((ProgramMembership) current);
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
   * The number of employees in an organization e.g. business.
   */
  @JsonIgnore public QuantitativeValue getNumberOfEmployees() {
    return (QuantitativeValue) getValue("numberOfEmployees");
  }
  /**
   * The number of employees in an organization e.g. business.
   */
  @JsonIgnore public Collection<QuantitativeValue> getNumberOfEmployeess() {
    final Object current = myData.get("numberOfEmployees");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
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
   * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
   */
  @JsonIgnore public Organization getSubOrganization() {
    return (Organization) getValue("subOrganization");
  }
  /**
   * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
   */
  @JsonIgnore public Collection<Organization> getSubOrganizations() {
    final Object current = myData.get("subOrganization");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  @JsonIgnore public String getTaxID() {
    return (String) getValue("taxID");
  }
  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  @JsonIgnore public Collection<String> getTaxIDs() {
    final Object current = myData.get("taxID");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
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
   * The place where the Organization was founded.
   */
  @JsonIgnore public Place getFoundingLocation() {
    return (Place) getValue("foundingLocation");
  }
  /**
   * The place where the Organization was founded.
   */
  @JsonIgnore public Collection<Place> getFoundingLocations() {
    final Object current = myData.get("foundingLocation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  protected Organization(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Organization}
   */
  public static class Builder extends Thing.Builder {
    public Organization build() {
      return new Organization(myData);
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
    @NotNull public Builder duns(@NotNull String duns) {
      putValue("duns", duns);
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
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @NotNull public Builder globalLocationNumber(@NotNull String globalLocationNumber) {
      putValue("globalLocationNumber", globalLocationNumber);
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
    @NotNull public Builder memberOf(@NotNull Organization organization) {
      putValue("memberOf", organization);
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull Organization.Builder organization) {
      putValue("memberOf", organization.build());
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull ProgramMembership programMembership) {
      putValue("memberOf", programMembership);
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @NotNull public Builder memberOf(@NotNull ProgramMembership.Builder programMembership) {
      putValue("memberOf", programMembership.build());
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
    @NotNull public Builder taxID(@NotNull String taxID) {
      putValue("taxID", taxID);
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
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
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
      putValue("mainEntityOfPage", creativeWork);
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
      putValue("mainEntityOfPage", creativeWork.build());
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
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
      if ("address".equals(key) && value instanceof PostalAddress) { address((PostalAddress)value); return; }
      if ("aggregateRating".equals(key) && value instanceof AggregateRating) { aggregateRating((AggregateRating)value); return; }
      if ("award".equals(key) && value instanceof String) { award((String)value); return; }
      if ("brand".equals(key) && value instanceof Brand) { brand((Brand)value); return; }
      if ("brand".equals(key) && value instanceof Organization) { brand((Organization)value); return; }
      if ("contactPoint".equals(key) && value instanceof ContactPoint) { contactPoint((ContactPoint)value); return; }
      if ("department".equals(key) && value instanceof Organization) { department((Organization)value); return; }
      if ("duns".equals(key) && value instanceof String) { duns((String)value); return; }
      if ("email".equals(key) && value instanceof String) { email((String)value); return; }
      if ("employee".equals(key) && value instanceof Person) { employee((Person)value); return; }
      if ("event".equals(key) && value instanceof Event) { event((Event)value); return; }
      if ("faxNumber".equals(key) && value instanceof String) { faxNumber((String)value); return; }
      if ("founder".equals(key) && value instanceof Person) { founder((Person)value); return; }
      if ("dissolutionDate".equals(key) && value instanceof java.util.Date) { dissolutionDate((java.util.Date)value); return; }
      if ("foundingDate".equals(key) && value instanceof java.util.Date) { foundingDate((java.util.Date)value); return; }
      if ("globalLocationNumber".equals(key) && value instanceof String) { globalLocationNumber((String)value); return; }
      if ("hasPOS".equals(key) && value instanceof Place) { hasPOS((Place)value); return; }
      if ("isicV4".equals(key) && value instanceof String) { isicV4((String)value); return; }
      if ("legalName".equals(key) && value instanceof String) { legalName((String)value); return; }
      if ("logo".equals(key) && value instanceof ImageObject) { logo((ImageObject)value); return; }
      if ("logo".equals(key) && value instanceof String) { logo((String)value); return; }
      if ("makesOffer".equals(key) && value instanceof Offer) { makesOffer((Offer)value); return; }
      if ("member".equals(key) && value instanceof Organization) { member((Organization)value); return; }
      if ("member".equals(key) && value instanceof Person) { member((Person)value); return; }
      if ("memberOf".equals(key) && value instanceof Organization) { memberOf((Organization)value); return; }
      if ("memberOf".equals(key) && value instanceof ProgramMembership) { memberOf((ProgramMembership)value); return; }
      if ("naics".equals(key) && value instanceof String) { naics((String)value); return; }
      if ("numberOfEmployees".equals(key) && value instanceof QuantitativeValue) { numberOfEmployees((QuantitativeValue)value); return; }
      if ("owns".equals(key) && value instanceof OwnershipInfo) { owns((OwnershipInfo)value); return; }
      if ("owns".equals(key) && value instanceof Product) { owns((Product)value); return; }
      if ("review".equals(key) && value instanceof Review) { review((Review)value); return; }
      if ("seeks".equals(key) && value instanceof Demand) { seeks((Demand)value); return; }
      if ("subOrganization".equals(key) && value instanceof Organization) { subOrganization((Organization)value); return; }
      if ("taxID".equals(key) && value instanceof String) { taxID((String)value); return; }
      if ("telephone".equals(key) && value instanceof String) { telephone((String)value); return; }
      if ("vatID".equals(key) && value instanceof String) { vatID((String)value); return; }
      if ("foundingLocation".equals(key) && value instanceof Place) { foundingLocation((Place)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
