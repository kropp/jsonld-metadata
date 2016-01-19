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
 * The act of responding to a question/message asked/sent by the object. Related to <a href="AskAction">AskAction</a>.<p>Related actions:</p><ul><li><a href="http://schema.org/AskAction">AskAction</a>: Appears generally as an origin of a ReplyAction</li></ul>.
 */
public class ReplyAction extends CommunicateAction {
  /**
   * A sub property of result. The Comment created or sent as a result of this action.
   */
  public Comment getResultComment() {
    return myResultComment;
  }
  /**
   * Builder for {@link ReplyAction}
   */
  static final class ReplyActionThingBuilder implements Builder {
    /**
     * Creates new {@link ReplyAction} instance.
     */
    public ReplyAction build() {
      return new ReplyAction(resultComment, about, inLanguage, recipient, agent, endTime, startTime, actionStatus, error, target, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * A sub property of result. The Comment created or sent as a result of this action.
     */
    @NotNull public Builder resultComment(@NotNull Comment comment) {
      this.resultComment = comment;
      return this;
    }
    /**
     * A sub property of result. The Comment created or sent as a result of this action.
     */
    @NotNull public Builder resultComment(@NotNull Comment.Builder comment) {
      return this.resultComment(comment.build());
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing thing) {
      this.about = thing;
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing.Builder thing) {
      return this.about(thing.build());
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      if (this.inLanguage == null) this.inLanguage = new LanguageOrString();
      this.inLanguage.setLanguage(language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      return this.inLanguage(language.build());
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href='http://tools.ietf.org/html/bcp47'>IETF BCP 47 standard</a>.
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      if (this.inLanguage == null) this.inLanguage = new LanguageOrString();
      this.inLanguage.setString(inLanguage);
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Audience audience) {
      if (this.recipient == null) this.recipient = new AudienceOrOrganizationOrPerson();
      this.recipient.setAudience(audience);
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Audience.Builder audience) {
      return this.recipient(audience.build());
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Organization organization) {
      if (this.recipient == null) this.recipient = new AudienceOrOrganizationOrPerson();
      this.recipient.setOrganization(organization);
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Organization.Builder organization) {
      return this.recipient(organization.build());
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Person person) {
      if (this.recipient == null) this.recipient = new AudienceOrOrganizationOrPerson();
      this.recipient.setPerson(person);
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Person.Builder person) {
      return this.recipient(person.build());
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization organization) {
      if (this.agent == null) this.agent = new OrganizationOrPerson();
      this.agent.setOrganization(organization);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization.Builder organization) {
      return this.agent(organization.build());
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person person) {
      if (this.agent == null) this.agent = new OrganizationOrPerson();
      this.agent.setPerson(person);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person.Builder person) {
      return this.agent(person.build());
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*.

Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder endTime(@NotNull java.util.Date date) {
      this.endTime = date;
      return this;
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December.

Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      this.startTime = date;
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    @NotNull public Builder actionStatus(@NotNull ActionStatusType actionStatusType) {
      this.actionStatus = actionStatusType;
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    @NotNull public Builder actionStatus(@NotNull ActionStatusType.Builder actionStatusType) {
      return this.actionStatus(actionStatusType.build());
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing thing) {
      this.error = thing;
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing.Builder thing) {
      return this.error(thing.build());
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint entryPoint) {
      this.target = entryPoint;
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint.Builder entryPoint) {
      return this.target(entryPoint.build());
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
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
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
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
        if ("resultComment".equals(key) && value instanceof Comment) { resultComment((Comment)value); continue; }
        if ("about".equals(key) && value instanceof Thing) { about((Thing)value); continue; }
        if ("inLanguage".equals(key) && value instanceof Language) { inLanguage((Language)value); continue; }
        if ("inLanguage".equals(key) && value instanceof String) { inLanguage((String)value); continue; }
        if ("recipient".equals(key) && value instanceof Audience) { recipient((Audience)value); continue; }
        if ("recipient".equals(key) && value instanceof Organization) { recipient((Organization)value); continue; }
        if ("recipient".equals(key) && value instanceof Person) { recipient((Person)value); continue; }
        if ("agent".equals(key) && value instanceof Organization) { agent((Organization)value); continue; }
        if ("agent".equals(key) && value instanceof Person) { agent((Person)value); continue; }
        if ("endTime".equals(key) && value instanceof java.util.Date) { endTime((java.util.Date)value); continue; }
        if ("startTime".equals(key) && value instanceof java.util.Date) { startTime((java.util.Date)value); continue; }
        if ("actionStatus".equals(key) && value instanceof ActionStatusType) { actionStatus((ActionStatusType)value); continue; }
        if ("error".equals(key) && value instanceof Thing) { error((Thing)value); continue; }
        if ("target".equals(key) && value instanceof EntryPoint) { target((EntryPoint)value); continue; }
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
    private Comment resultComment;
    private Thing about;
    private LanguageOrString inLanguage;
    private AudienceOrOrganizationOrPerson recipient;
    private OrganizationOrPerson agent;
    private java.util.Date endTime;
    private java.util.Date startTime;
    private ActionStatusType actionStatus;
    private Thing error;
    private EntryPoint target;
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
  public interface Builder extends ThingBuilder<ReplyAction> {
    @NotNull Builder resultComment(@NotNull Comment comment);
    @NotNull Builder resultComment(@NotNull Comment.Builder comment);
    @NotNull Builder about(@NotNull Thing thing);
    @NotNull Builder about(@NotNull Thing.Builder thing);
    @NotNull Builder inLanguage(@NotNull Language language);
    @NotNull Builder inLanguage(@NotNull Language.Builder language);
    @NotNull Builder inLanguage(@NotNull String inLanguage);
    @NotNull Builder recipient(@NotNull Audience audience);
    @NotNull Builder recipient(@NotNull Audience.Builder audience);
    @NotNull Builder recipient(@NotNull Organization organization);
    @NotNull Builder recipient(@NotNull Organization.Builder organization);
    @NotNull Builder recipient(@NotNull Person person);
    @NotNull Builder recipient(@NotNull Person.Builder person);
    @NotNull Builder agent(@NotNull Organization organization);
    @NotNull Builder agent(@NotNull Organization.Builder organization);
    @NotNull Builder agent(@NotNull Person person);
    @NotNull Builder agent(@NotNull Person.Builder person);
    @NotNull Builder endTime(@NotNull java.util.Date date);
    @NotNull Builder startTime(@NotNull java.util.Date date);
    @NotNull Builder actionStatus(@NotNull ActionStatusType actionStatusType);
    @NotNull Builder actionStatus(@NotNull ActionStatusType.Builder actionStatusType);
    @NotNull Builder error(@NotNull Thing thing);
    @NotNull Builder error(@NotNull Thing.Builder thing);
    @NotNull Builder target(@NotNull EntryPoint entryPoint);
    @NotNull Builder target(@NotNull EntryPoint.Builder entryPoint);
    @NotNull Builder additionalType(@NotNull String additionalType);
    @NotNull Builder alternateName(@NotNull String alternateName);
    @NotNull Builder description(@NotNull String description);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(@NotNull String mainEntityOfPage);
    @NotNull Builder name(@NotNull String name);
    @NotNull Builder sameAs(@NotNull String sameAs);
    @NotNull Builder url(@NotNull String url);
    @NotNull Builder potentialAction(@NotNull Action action);
    @NotNull Builder potentialAction(@NotNull Action.Builder action);
    @NotNull Builder id(@NotNull String id);
  }

  protected ReplyAction(Comment resultComment, Thing about, LanguageOrString inLanguage, AudienceOrOrganizationOrPerson recipient, OrganizationOrPerson agent, java.util.Date endTime, java.util.Date startTime, ActionStatusType actionStatus, Thing error, EntryPoint target, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(about, inLanguage, recipient, agent, endTime, startTime, actionStatus, error, target, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myResultComment = resultComment;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myResultComment != null ? myResultComment.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReplyAction replyAction = (ReplyAction) o;
    if (!super.equals(o)) return false;
    if (myResultComment != null ? !myResultComment.equals(replyAction.myResultComment) : replyAction.myResultComment != null) return false;
    return true;
  }

  private Comment myResultComment;
}
