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
 * An intangible item that describes an alignment between a learning resource and a node in an educational framework.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_LRMIClass
 */
public class AlignmentObject extends Intangible {
  /**
   * A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationLevel'.
   */
  public String getAlignmentType() {
    return myAlignmentType;
  }
  /**
   * The framework to which the resource being described is aligned.
   */
  public String getEducationalFramework() {
    return myEducationalFramework;
  }
  /**
   * The description of a node in an established educational framework.
   */
  public String getTargetDescription() {
    return myTargetDescription;
  }
  /**
   * The name of a node in an established educational framework.
   */
  public String getTargetName() {
    return myTargetName;
  }
  /**
   * The URL of a node in an established educational framework.
   */
  public String getTargetUrl() {
    return myTargetUrl;
  }
  /**
   * Builder for {@link AlignmentObject}
   */
  public static final class Builder {
    /**
     * Creates new {@link AlignmentObject} instance.
     */
    public AlignmentObject build() {
      return new AlignmentObject(sameAs, url, educationalFramework, additionalType, targetUrl, alternateName, alignmentType, targetName, name, potentialAction, description, mainEntityOfPage, targetDescription);
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
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
     * The framework to which the resource being described is aligned.
     */
    public Builder educationalFramework(String educationalFramework) {
      this.educationalFramework = educationalFramework;
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
     * The URL of a node in an established educational framework.
     */
    public Builder targetUrl(String targetUrl) {
      this.targetUrl = targetUrl;
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
     * A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationLevel'.
     */
    public Builder alignmentType(String alignmentType) {
      this.alignmentType = alignmentType;
      return this;
    }
    /**
     * The name of a node in an established educational framework.
     */
    public Builder targetName(String targetName) {
      this.targetName = targetName;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
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
     * The description of a node in an established educational framework.
     */
    public Builder targetDescription(String targetDescription) {
      this.targetDescription = targetDescription;
      return this;
    }
    private String sameAs;
    private String url;
    private String educationalFramework;
    private String additionalType;
    private String targetUrl;
    private String alternateName;
    private String alignmentType;
    private String targetName;
    private String name;
    private Action potentialAction;
    private String description;
    private StringOrCreativeWork mainEntityOfPage;
    private String targetDescription;
  }

  protected AlignmentObject(String sameAs, String url, String educationalFramework, String additionalType, String targetUrl, String alternateName, String alignmentType, String targetName, String name, Action potentialAction, String description, StringOrCreativeWork mainEntityOfPage, String targetDescription) {
    super(additionalType, url, sameAs, alternateName, description, potentialAction, name, mainEntityOfPage);
    myAlignmentType = alignmentType;
    myEducationalFramework = educationalFramework;
    myTargetDescription = targetDescription;
    myTargetName = targetName;
    myTargetUrl = targetUrl;
  }
  private String myAlignmentType;
  private String myEducationalFramework;
  private String myTargetDescription;
  private String myTargetName;
  private String myTargetUrl;
}
