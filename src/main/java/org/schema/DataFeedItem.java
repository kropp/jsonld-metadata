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
 * A single item within a larger data feed.
 */
public class DataFeedItem extends Intangible {
  /**
   * The datetime the item was removed from the DataFeed.
   */
  @JsonIgnore public java.util.Date getDateDeleted() {
    return (java.util.Date) getValue("dateDeleted");
  }
  /**
   * The datetime the item was removed from the DataFeed.
   */
  @JsonIgnore public Collection<java.util.Date> getDateDeleteds() {
    final Object current = myData.get("dateDeleted");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
   */
  @JsonIgnore public java.util.Date getDateModified() {
    return (java.util.Date) getValue("dateModified");
  }
  /**
   * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
   */
  @JsonIgnore public Collection<java.util.Date> getDateModifieds() {
    final Object current = myData.get("dateModified");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
   */
  @JsonIgnore public Thing getItem() {
    return (Thing) getValue("item");
  }
  /**
   * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
   */
  @JsonIgnore public Collection<Thing> getItems() {
    final Object current = myData.get("item");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Thing>) current;
    }
    return Arrays.asList((Thing) current);
  }
  protected DataFeedItem(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link DataFeedItem}
   */
  public static class Builder extends Intangible.Builder {
    public DataFeedItem build() {
      return new DataFeedItem(myData);
    }
    /**
     * The datetime the item was removed from the DataFeed.
     */
    @NotNull public Builder dateDeleted(@NotNull java.util.Date date) {
      putValue("dateDeleted", date);
      return this;
    }
    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     */
    @NotNull public Builder dateModified(@NotNull java.util.Date date) {
      putValue("dateModified", date);
      return this;
    }
    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
     */
    @NotNull public Builder item(@NotNull Thing thing) {
      putValue("item", thing);
      return this;
    }
    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
     */
    @NotNull public Builder item(@NotNull Thing.Builder thing) {
      putValue("item", thing.build());
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
      if ("dateDeleted".equals(key) && value instanceof java.util.Date) { dateDeleted((java.util.Date)value); return; }
      if ("dateModified".equals(key) && value instanceof java.util.Date) { dateModified((java.util.Date)value); return; }
      if ("item".equals(key) && value instanceof Thing) { item((Thing)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
