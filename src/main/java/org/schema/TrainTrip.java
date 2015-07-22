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
 * A trip on a commercial train line.
 */
public class TrainTrip extends Intangible {
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public OrganizationOrPerson getProvider() {
    return myProvider;
  }
  /**
   * The expected departure time.
   */
  public java.util.Date getDepartureTime() {
    return myDepartureTime;
  }
  /**
   * The expected arrival time.
   */
  public java.util.Date getArrivalTime() {
    return myArrivalTime;
  }
  /**
   * The unique identifier for the train.
   */
  public String getTrainNumber() {
    return myTrainNumber;
  }
  /**
   * The name of the train (e.g. The Orient Express).
   */
  public String getTrainName() {
    return myTrainName;
  }
  /**
   * The station from which the train departs.
   */
  public TrainStation getDepartureStation() {
    return myDepartureStation;
  }
  /**
   * The station where the train trip ends.
   */
  public TrainStation getArrivalStation() {
    return myArrivalStation;
  }
  /**
   * The platform from which the train departs.
   */
  public String getDeparturePlatform() {
    return myDeparturePlatform;
  }
  /**
   * The platform where the train arrives.
   */
  public String getArrivalPlatform() {
    return myArrivalPlatform;
  }
  /**
   * Builder for {@link TrainTrip}
   */
  public static final class Builder {
    /**
     * Creates new {@link TrainTrip} instance.
     */
    public TrainTrip build() {
      return new TrainTrip(provider, departurePlatform, name, arrivalStation, mainEntityOfPage, additionalType, url, sameAs, trainNumber, alternateName, departureStation, arrivalTime, arrivalPlatform, potentialAction, description, trainName, departureTime);
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Organization organization) {
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    public Builder provider(Person person) {
      this.provider.setPerson(person);
      return this;
    }
    /**
     * The platform from which the train departs.
     */
    public Builder departurePlatform(String departurePlatform) {
      this.departurePlatform = departurePlatform;
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
     * The station where the train trip ends.
     */
    public Builder arrivalStation(TrainStation trainStation) {
      this.arrivalStation = trainStation;
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
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * The unique identifier for the train.
     */
    public Builder trainNumber(String trainNumber) {
      this.trainNumber = trainNumber;
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
     * The station from which the train departs.
     */
    public Builder departureStation(TrainStation trainStation) {
      this.departureStation = trainStation;
      return this;
    }
    /**
     * The expected arrival time.
     */
    public Builder arrivalTime(java.util.Date date) {
      this.arrivalTime = date;
      return this;
    }
    /**
     * The platform where the train arrives.
     */
    public Builder arrivalPlatform(String arrivalPlatform) {
      this.arrivalPlatform = arrivalPlatform;
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
     * The name of the train (e.g. The Orient Express).
     */
    public Builder trainName(String trainName) {
      this.trainName = trainName;
      return this;
    }
    /**
     * The expected departure time.
     */
    public Builder departureTime(java.util.Date date) {
      this.departureTime = date;
      return this;
    }
    private OrganizationOrPerson provider;
    private String departurePlatform;
    private String name;
    private TrainStation arrivalStation;
    private StringOrCreativeWork mainEntityOfPage;
    private String additionalType;
    private String url;
    private String sameAs;
    private String trainNumber;
    private String alternateName;
    private TrainStation departureStation;
    private java.util.Date arrivalTime;
    private String arrivalPlatform;
    private Action potentialAction;
    private String description;
    private String trainName;
    private java.util.Date departureTime;
  }

  protected TrainTrip(OrganizationOrPerson provider, String departurePlatform, String name, TrainStation arrivalStation, StringOrCreativeWork mainEntityOfPage, String additionalType, String url, String sameAs, String trainNumber, String alternateName, TrainStation departureStation, java.util.Date arrivalTime, String arrivalPlatform, Action potentialAction, String description, String trainName, java.util.Date departureTime) {
    super(additionalType, url, sameAs, alternateName, description, potentialAction, name, mainEntityOfPage);
    myProvider = provider;
    myDepartureTime = departureTime;
    myArrivalTime = arrivalTime;
    myTrainNumber = trainNumber;
    myTrainName = trainName;
    myDepartureStation = departureStation;
    myArrivalStation = arrivalStation;
    myDeparturePlatform = departurePlatform;
    myArrivalPlatform = arrivalPlatform;
  }
  private OrganizationOrPerson myProvider;
  private java.util.Date myDepartureTime;
  private java.util.Date myArrivalTime;
  private String myTrainNumber;
  private String myTrainName;
  private TrainStation myDepartureStation;
  private TrainStation myArrivalStation;
  private String myDeparturePlatform;
  private String myArrivalPlatform;
}
