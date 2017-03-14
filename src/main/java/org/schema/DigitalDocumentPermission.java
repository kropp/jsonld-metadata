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
 * A permission for a particular person or group to access a particular file.
 */
public class DigitalDocumentPermission extends Intangible {
  /**
   * The person, organization, contact point, or audience that has been granted this permission.
   */
  @JsonIgnore public Audience getGranteeAudience() {
    return (Audience) getValue("grantee");
  }
  /**
   * The person, organization, contact point, or audience that has been granted this permission.
   */
  @JsonIgnore public Collection<Audience> getGranteeAudiences() {
    final Object current = myData.get("grantee");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Audience>) current;
    }
    return Arrays.asList((Audience) current);
  }
  /**
   * The person, organization, contact point, or audience that has been granted this permission.
   */
  @JsonIgnore public ContactPoint getGranteeContactPoint() {
    return (ContactPoint) getValue("grantee");
  }
  /**
   * The person, organization, contact point, or audience that has been granted this permission.
   */
  @JsonIgnore public Collection<ContactPoint> getGranteeContactPoints() {
    final Object current = myData.get("grantee");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ContactPoint>) current;
    }
    return Arrays.asList((ContactPoint) current);
  }
  /**
   * The person, organization, contact point, or audience that has been granted this permission.
   */
  @JsonIgnore public Organization getGranteeOrganization() {
    return (Organization) getValue("grantee");
  }
  /**
   * The person, organization, contact point, or audience that has been granted this permission.
   */
  @JsonIgnore public Collection<Organization> getGranteeOrganizations() {
    final Object current = myData.get("grantee");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Organization>) current;
    }
    return Arrays.asList((Organization) current);
  }
  /**
   * The person, organization, contact point, or audience that has been granted this permission.
   */
  @JsonIgnore public Person getGranteePerson() {
    return (Person) getValue("grantee");
  }
  /**
   * The person, organization, contact point, or audience that has been granted this permission.
   */
  @JsonIgnore public Collection<Person> getGranteePersons() {
    final Object current = myData.get("grantee");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Person>) current;
    }
    return Arrays.asList((Person) current);
  }
  /**
   * The type of permission granted the person, organization, or audience.
   */
  @JsonIgnore public DigitalDocumentPermissionType getPermissionType() {
    return (DigitalDocumentPermissionType) getValue("permissionType");
  }
  /**
   * The type of permission granted the person, organization, or audience.
   */
  @JsonIgnore public Collection<DigitalDocumentPermissionType> getPermissionTypes() {
    final Object current = myData.get("permissionType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DigitalDocumentPermissionType>) current;
    }
    return Arrays.asList((DigitalDocumentPermissionType) current);
  }
  protected DigitalDocumentPermission(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link DigitalDocumentPermission}
   */
  public static class Builder extends Intangible.Builder {
    public DigitalDocumentPermission build() {
      return new DigitalDocumentPermission(myData);
    }
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     */
    @NotNull public Builder grantee(@NotNull Audience audience) {
      putValue("grantee", audience);
      return this;
    }
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     */
    @NotNull public Builder grantee(@NotNull Audience.Builder audience) {
      putValue("grantee", audience.build());
      return this;
    }
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     */
    @NotNull public Builder grantee(@NotNull ContactPoint contactPoint) {
      putValue("grantee", contactPoint);
      return this;
    }
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     */
    @NotNull public Builder grantee(@NotNull ContactPoint.Builder contactPoint) {
      putValue("grantee", contactPoint.build());
      return this;
    }
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     */
    @NotNull public Builder grantee(@NotNull Organization organization) {
      putValue("grantee", organization);
      return this;
    }
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     */
    @NotNull public Builder grantee(@NotNull Organization.Builder organization) {
      putValue("grantee", organization.build());
      return this;
    }
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     */
    @NotNull public Builder grantee(@NotNull Person person) {
      putValue("grantee", person);
      return this;
    }
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     */
    @NotNull public Builder grantee(@NotNull Person.Builder person) {
      putValue("grantee", person.build());
      return this;
    }
    /**
     * The type of permission granted the person, organization, or audience.
     */
    @NotNull public Builder permissionType(@NotNull DigitalDocumentPermissionType digitalDocumentPermissionType) {
      putValue("permissionType", digitalDocumentPermissionType);
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
      if ("grantee".equals(key) && value instanceof Audience) { grantee((Audience)value); return; }
      if ("grantee".equals(key) && value instanceof ContactPoint) { grantee((ContactPoint)value); return; }
      if ("grantee".equals(key) && value instanceof Organization) { grantee((Organization)value); return; }
      if ("grantee".equals(key) && value instanceof Person) { grantee((Person)value); return; }
      if ("permissionType".equals(key) && value instanceof DigitalDocumentPermissionType) { permissionType((DigitalDocumentPermissionType)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
