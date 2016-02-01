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
 * A trip on a commercial train line.
 */
public class TrainTrip extends Intangible {
  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
   */
  public OrganizationOrPerson getProvider() { return myProvider; }
  /**
   * The expected departure time.
   */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getDepartureTime() { return myDepartureTime; }
  /**
   * The expected arrival time.
   */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getArrivalTime() { return myArrivalTime; }
  /**
   * The unique identifier for the train.
   */
  public String getTrainNumber() { return myTrainNumber; }
  /**
   * The name of the train (e.g. The Orient Express).
   */
  public String getTrainName() { return myTrainName; }
  /**
   * The station from which the train departs.
   */
  public TrainStation getDepartureStation() { return myDepartureStation; }
  /**
   * The station where the train trip ends.
   */
  public TrainStation getArrivalStation() { return myArrivalStation; }
  /**
   * The platform from which the train departs.
   */
  public String getDeparturePlatform() { return myDeparturePlatform; }
  /**
   * The platform where the train arrives.
   */
  public String getArrivalPlatform() { return myArrivalPlatform; }
  protected TrainTrip(OrganizationOrPerson provider, java.util.Date departureTime, java.util.Date arrivalTime, String trainNumber, String trainName, TrainStation departureStation, TrainStation arrivalStation, String departurePlatform, String arrivalPlatform, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myProvider = provider;
    myDepartureTime = departureTime;
    myArrivalTime = arrivalTime;
    myTrainNumber = trainNumber;
    myTrainName = trainName;
    myDepartureStation = departureStation;
    myArrivalStation = arrivalStation;
    myDeparturePlatform = departurePlatform;
    myArrivalPlatform = arrivalPlatform;
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
  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myProvider != null ? myProvider.hashCode() : 0);
    result = 31 * result + (myDepartureTime != null ? myDepartureTime.hashCode() : 0);
    result = 31 * result + (myArrivalTime != null ? myArrivalTime.hashCode() : 0);
    result = 31 * result + (myTrainNumber != null ? myTrainNumber.hashCode() : 0);
    result = 31 * result + (myTrainName != null ? myTrainName.hashCode() : 0);
    result = 31 * result + (myDepartureStation != null ? myDepartureStation.hashCode() : 0);
    result = 31 * result + (myArrivalStation != null ? myArrivalStation.hashCode() : 0);
    result = 31 * result + (myDeparturePlatform != null ? myDeparturePlatform.hashCode() : 0);
    result = 31 * result + (myArrivalPlatform != null ? myArrivalPlatform.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TrainTrip trainTrip = (TrainTrip) o;
    if (!super.equals(o)) return false;
    if (myProvider != null ? !myProvider.equals(trainTrip.myProvider) : trainTrip.myProvider != null) return false;
    if (myDepartureTime != null ? !myDepartureTime.equals(trainTrip.myDepartureTime) : trainTrip.myDepartureTime != null) return false;
    if (myArrivalTime != null ? !myArrivalTime.equals(trainTrip.myArrivalTime) : trainTrip.myArrivalTime != null) return false;
    if (myTrainNumber != null ? !myTrainNumber.equals(trainTrip.myTrainNumber) : trainTrip.myTrainNumber != null) return false;
    if (myTrainName != null ? !myTrainName.equals(trainTrip.myTrainName) : trainTrip.myTrainName != null) return false;
    if (myDepartureStation != null ? !myDepartureStation.equals(trainTrip.myDepartureStation) : trainTrip.myDepartureStation != null) return false;
    if (myArrivalStation != null ? !myArrivalStation.equals(trainTrip.myArrivalStation) : trainTrip.myArrivalStation != null) return false;
    if (myDeparturePlatform != null ? !myDeparturePlatform.equals(trainTrip.myDeparturePlatform) : trainTrip.myDeparturePlatform != null) return false;
    if (myArrivalPlatform != null ? !myArrivalPlatform.equals(trainTrip.myArrivalPlatform) : trainTrip.myArrivalPlatform != null) return false;
    return true;
  }
  
  /**
   * Builder for {@link TrainTrip}
   */
  public static class Builder implements ThingBuilder<TrainTrip> {
    public TrainTrip build() {
      return new TrainTrip(provider, departureTime, arrivalTime, trainNumber, trainName, departureStation, arrivalStation, departurePlatform, arrivalPlatform, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setOrganization(organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      return this.provider(organization.build());
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      if (this.provider == null) this.provider = new OrganizationOrPerson();
      this.provider.setPerson(person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      return this.provider(person.build());
    }
    /**
     * The expected departure time.
     */
    @NotNull public Builder departureTime(@NotNull java.util.Date date) {
      this.departureTime = date;
      return this;
    }
    /**
     * The expected arrival time.
     */
    @NotNull public Builder arrivalTime(@NotNull java.util.Date date) {
      this.arrivalTime = date;
      return this;
    }
    /**
     * The unique identifier for the train.
     */
    @NotNull public Builder trainNumber(@NotNull String trainNumber) {
      this.trainNumber = trainNumber;
      return this;
    }
    /**
     * The name of the train (e.g. The Orient Express).
     */
    @NotNull public Builder trainName(@NotNull String trainName) {
      this.trainName = trainName;
      return this;
    }
    /**
     * The station from which the train departs.
     */
    @NotNull public Builder departureStation(@NotNull TrainStation trainStation) {
      this.departureStation = trainStation;
      return this;
    }
    /**
     * The station from which the train departs.
     */
    @NotNull public Builder departureStation(@NotNull TrainStation.Builder trainStation) {
      return this.departureStation(trainStation.build());
    }
    /**
     * The station where the train trip ends.
     */
    @NotNull public Builder arrivalStation(@NotNull TrainStation trainStation) {
      this.arrivalStation = trainStation;
      return this;
    }
    /**
     * The station where the train trip ends.
     */
    @NotNull public Builder arrivalStation(@NotNull TrainStation.Builder trainStation) {
      return this.arrivalStation(trainStation.build());
    }
    /**
     * The platform from which the train departs.
     */
    @NotNull public Builder departurePlatform(@NotNull String departurePlatform) {
      this.departurePlatform = departurePlatform;
      return this;
    }
    /**
     * The platform where the train arrives.
     */
    @NotNull public Builder arrivalPlatform(@NotNull String arrivalPlatform) {
      this.arrivalPlatform = arrivalPlatform;
      return this;
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
        if ("provider".equals(key) && value instanceof Organization) { provider((Organization)value); continue; }
        if ("provider".equals(key) && value instanceof Person) { provider((Person)value); continue; }
        if ("departureTime".equals(key) && value instanceof java.util.Date) { departureTime((java.util.Date)value); continue; }
        if ("arrivalTime".equals(key) && value instanceof java.util.Date) { arrivalTime((java.util.Date)value); continue; }
        if ("trainNumber".equals(key) && value instanceof String) { trainNumber((String)value); continue; }
        if ("trainName".equals(key) && value instanceof String) { trainName((String)value); continue; }
        if ("departureStation".equals(key) && value instanceof TrainStation) { departureStation((TrainStation)value); continue; }
        if ("arrivalStation".equals(key) && value instanceof TrainStation) { arrivalStation((TrainStation)value); continue; }
        if ("departurePlatform".equals(key) && value instanceof String) { departurePlatform((String)value); continue; }
        if ("arrivalPlatform".equals(key) && value instanceof String) { arrivalPlatform((String)value); continue; }
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
    private OrganizationOrPerson provider;
    private java.util.Date departureTime;
    private java.util.Date arrivalTime;
    private String trainNumber;
    private String trainName;
    private TrainStation departureStation;
    private TrainStation arrivalStation;
    private String departurePlatform;
    private String arrivalPlatform;
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
