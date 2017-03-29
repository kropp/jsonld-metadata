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
 * An entry point, within some Web-based protocol.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass
 */
public class EntryPoint extends Intangible {
  /**
   * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
   */
  @JsonIgnore public String getActionPlatform() {
    return (String) getValue("actionPlatform");
  }
  /**
   * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
   */
  @JsonIgnore public Collection<String> getActionPlatforms() {
    final Object current = myData.get("actionPlatform");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
   */
  @JsonIgnore public String getHttpMethod() {
    return (String) getValue("httpMethod");
  }
  /**
   * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
   */
  @JsonIgnore public Collection<String> getHttpMethods() {
    final Object current = myData.get("httpMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The supported encoding type(s) for an EntryPoint request.
   */
  @JsonIgnore public String getEncodingType() {
    return (String) getValue("encodingType");
  }
  /**
   * The supported encoding type(s) for an EntryPoint request.
   */
  @JsonIgnore public Collection<String> getEncodingTypes() {
    final Object current = myData.get("encodingType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The supported content type(s) for an EntryPoint response.
   */
  @JsonIgnore public String getContentType() {
    return (String) getValue("contentType");
  }
  /**
   * The supported content type(s) for an EntryPoint response.
   */
  @JsonIgnore public Collection<String> getContentTypes() {
    final Object current = myData.get("contentType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * An application that can complete the request.
   */
  @JsonIgnore public SoftwareApplication getActionApplication() {
    return (SoftwareApplication) getValue("actionApplication");
  }
  /**
   * An application that can complete the request.
   */
  @JsonIgnore public Collection<SoftwareApplication> getActionApplications() {
    final Object current = myData.get("actionApplication");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<SoftwareApplication>) current;
    }
    return Arrays.asList((SoftwareApplication) current);
  }
  /**
   * An url template (RFC6570) that will be used to construct the target of the execution of the action.
   */
  @JsonIgnore public String getUrlTemplate() {
    return (String) getValue("urlTemplate");
  }
  /**
   * An url template (RFC6570) that will be used to construct the target of the execution of the action.
   */
  @JsonIgnore public Collection<String> getUrlTemplates() {
    final Object current = myData.get("urlTemplate");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected EntryPoint(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link EntryPoint}
   */
  public static class Builder extends Intangible.Builder {
    @NotNull public EntryPoint build() {
      return new EntryPoint(myData);
    }
    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     */
    @NotNull public Builder actionPlatform(@NotNull String actionPlatform) {
      putValue("actionPlatform", actionPlatform);
      return this;
    }
    /**
     * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
     */
    @NotNull public Builder httpMethod(@NotNull String httpMethod) {
      putValue("httpMethod", httpMethod);
      return this;
    }
    /**
     * The supported encoding type(s) for an EntryPoint request.
     */
    @NotNull public Builder encodingType(@NotNull String encodingType) {
      putValue("encodingType", encodingType);
      return this;
    }
    /**
     * The supported content type(s) for an EntryPoint response.
     */
    @NotNull public Builder contentType(@NotNull String contentType) {
      putValue("contentType", contentType);
      return this;
    }
    /**
     * An application that can complete the request.
     */
    @NotNull public Builder actionApplication(@NotNull SoftwareApplication softwareApplication) {
      putValue("actionApplication", softwareApplication);
      return this;
    }
    /**
     * An application that can complete the request.
     */
    @NotNull public Builder actionApplication(@NotNull SoftwareApplication.Builder softwareApplication) {
      putValue("actionApplication", softwareApplication.build());
      return this;
    }
    /**
     * An url template (RFC6570) that will be used to construct the target of the execution of the action.
     */
    @NotNull public Builder urlTemplate(@NotNull String urlTemplate) {
      putValue("urlTemplate", urlTemplate);
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
      if ("actionPlatform".equals(key) && value instanceof String) { actionPlatform((String)value); return; }
      if ("actionPlatforms".equals(key) && value instanceof String) { actionPlatform((String)value); return; }
      if ("httpMethod".equals(key) && value instanceof String) { httpMethod((String)value); return; }
      if ("httpMethods".equals(key) && value instanceof String) { httpMethod((String)value); return; }
      if ("encodingType".equals(key) && value instanceof String) { encodingType((String)value); return; }
      if ("encodingTypes".equals(key) && value instanceof String) { encodingType((String)value); return; }
      if ("contentType".equals(key) && value instanceof String) { contentType((String)value); return; }
      if ("contentTypes".equals(key) && value instanceof String) { contentType((String)value); return; }
      if ("actionApplication".equals(key) && value instanceof SoftwareApplication) { actionApplication((SoftwareApplication)value); return; }
      if ("actionApplications".equals(key) && value instanceof SoftwareApplication) { actionApplication((SoftwareApplication)value); return; }
      if ("urlTemplate".equals(key) && value instanceof String) { urlTemplate((String)value); return; }
      if ("urlTemplates".equals(key) && value instanceof String) { urlTemplate((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
