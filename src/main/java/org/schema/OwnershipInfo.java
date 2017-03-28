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
 * A structured value providing information about when a certain organization or person owned a certain product.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class OwnershipInfo extends StructuredValue {
  /**
   * The organization or person from which the product was acquired.
   */
  @JsonIgnore public Organization getAcquiredFromOrganization() {
    return (Organization) getValue("acquiredFrom");
  }
  /**
   * The organization or person from which the product was acquired.
   */
  @JsonIgnore public Collection<Organization> getAcquiredFromOrganizations() {
    final Object current = myData.get("acquiredFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The organization or person from which the product was acquired.
   */
  @JsonIgnore public Person getAcquiredFromPerson() {
    return (Person) getValue("acquiredFrom");
  }
  /**
   * The organization or person from which the product was acquired.
   */
  @JsonIgnore public Collection<Person> getAcquiredFromPersons() {
    final Object current = myData.get("acquiredFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The date and time of obtaining the product.
   */
  @JsonIgnore public java.util.Date getOwnedFrom() {
    return (java.util.Date) getValue("ownedFrom");
  }
  /**
   * The date and time of obtaining the product.
   */
  @JsonIgnore public Collection<java.util.Date> getOwnedFroms() {
    final Object current = myData.get("ownedFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date and time of giving up ownership on the product.
   */
  @JsonIgnore public java.util.Date getOwnedThrough() {
    return (java.util.Date) getValue("ownedThrough");
  }
  /**
   * The date and time of giving up ownership on the product.
   */
  @JsonIgnore public Collection<java.util.Date> getOwnedThroughs() {
    final Object current = myData.get("ownedThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The product that this structured value is referring to.
   */
  @JsonIgnore public Product getTypeOfGoodProduct() {
    return (Product) getValue("typeOfGood");
  }
  /**
   * The product that this structured value is referring to.
   */
  @JsonIgnore public Collection<Product> getTypeOfGoodProducts() {
    final Object current = myData.get("typeOfGood");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The product that this structured value is referring to.
   */
  @JsonIgnore public Service getTypeOfGoodService() {
    return (Service) getValue("typeOfGood");
  }
  /**
   * The product that this structured value is referring to.
   */
  @JsonIgnore public Collection<Service> getTypeOfGoodServices() {
    final Object current = myData.get("typeOfGood");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Service>) current;
    }
    return Arrays.asList((Service) current);
  }
  protected OwnershipInfo(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link OwnershipInfo}
   */
  public static class Builder extends StructuredValue.Builder {
    @NotNull public OwnershipInfo build() {
      return new OwnershipInfo(myData);
    }
    /**
     * The organization or person from which the product was acquired.
     */
    @NotNull public Builder acquiredFrom(@NotNull Organization organization) {
      putValue("acquiredFrom", organization);
      return this;
    }
    /**
     * The organization or person from which the product was acquired.
     */
    @NotNull public Builder acquiredFrom(@NotNull Organization.Builder organization) {
      putValue("acquiredFrom", organization.build());
      return this;
    }
    /**
     * The organization or person from which the product was acquired.
     */
    @NotNull public Builder acquiredFrom(@NotNull Person person) {
      putValue("acquiredFrom", person);
      return this;
    }
    /**
     * The organization or person from which the product was acquired.
     */
    @NotNull public Builder acquiredFrom(@NotNull Person.Builder person) {
      putValue("acquiredFrom", person.build());
      return this;
    }
    /**
     * The date and time of obtaining the product.
     */
    @NotNull public Builder ownedFrom(@NotNull java.util.Date date) {
      putValue("ownedFrom", date);
      return this;
    }
    /**
     * The date and time of giving up ownership on the product.
     */
    @NotNull public Builder ownedThrough(@NotNull java.util.Date date) {
      putValue("ownedThrough", date);
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Product product) {
      putValue("typeOfGood", product);
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Product.Builder product) {
      putValue("typeOfGood", product.build());
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Service service) {
      putValue("typeOfGood", service);
      return this;
    }
    /**
     * The product that this structured value is referring to.
     */
    @NotNull public Builder typeOfGood(@NotNull Service.Builder service) {
      putValue("typeOfGood", service.build());
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
      if ("acquiredFrom".equals(key) && value instanceof Organization) { acquiredFrom((Organization)value); return; }
      if ("acquiredFrom".equals(key) && value instanceof Person) { acquiredFrom((Person)value); return; }
      if ("ownedFrom".equals(key) && value instanceof java.util.Date) { ownedFrom((java.util.Date)value); return; }
      if ("ownedThrough".equals(key) && value instanceof java.util.Date) { ownedThrough((java.util.Date)value); return; }
      if ("typeOfGood".equals(key) && value instanceof Product) { typeOfGood((Product)value); return; }
      if ("typeOfGood".equals(key) && value instanceof Service) { typeOfGood((Service)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
