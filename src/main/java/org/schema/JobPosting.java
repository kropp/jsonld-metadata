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
 * A listing that describes a job opening in a certain organization.
 */
public class JobPosting extends Intangible {
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  public NumberOrPriceSpecification getBaseSalary() {
    return myBaseSalary;
  }
  /**
   * Description of benefits associated with the job.
   */
  public String getJobBenefits() {
    return myJobBenefits;
  }
  /**
   * Publication date for the job posting.
   */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public java.util.Date getDatePosted() {
    return myDatePosted;
  }
  /**
   * Educational background needed for the position.
   */
  public String getEducationRequirements() {
    return myEducationRequirements;
  }
  /**
   * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
   */
  public String getEmploymentType() {
    return myEmploymentType;
  }
  /**
   * Description of skills and experience needed for the position.
   */
  public String getExperienceRequirements() {
    return myExperienceRequirements;
  }
  /**
   * Organization offering the job position.
   */
  public Organization getHiringOrganization() {
    return myHiringOrganization;
  }
  /**
   * Description of bonus and commission compensation aspects of the job.
   */
  public String getIncentiveCompensation() {
    return myIncentiveCompensation;
  }
  /**
   * The industry associated with the job position.
   */
  public String getIndustry() {
    return myIndustry;
  }
  /**
   * A (typically single) geographic location associated with the job position.
   */
  public Place getJobLocation() {
    return myJobLocation;
  }
  /**
   * Category or categories describing the job. Use BLS O*NET-SOC taxonomy: http://www.onetcenter.org/taxonomy.html. Ideally includes textual label and formal code, with the property repeated for each applicable value.
   */
  public String getOccupationalCategory() {
    return myOccupationalCategory;
  }
  /**
   * Specific qualifications required for this role.
   */
  public String getQualifications() {
    return myQualifications;
  }
  /**
   * Responsibilities associated with this role.
   */
  public String getResponsibilities() {
    return myResponsibilities;
  }
  /**
   * The currency (coded using ISO 4217, http://en.wikipedia.org/wiki/ISO_4217 ) used for the main salary information in this job posting or for this employee.
   */
  public String getSalaryCurrency() {
    return mySalaryCurrency;
  }
  /**
   * Skills required to fulfill this role.
   */
  public String getSkills() {
    return mySkills;
  }
  /**
   * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
   */
  public String getSpecialCommitments() {
    return mySpecialCommitments;
  }
  /**
   * The title of the job.
   */
  public String getTitle() {
    return myTitle;
  }
  /**
   * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
   */
  public String getWorkHours() {
    return myWorkHours;
  }
  /**
   * Builder for {@link JobPosting}
   */
  static final class JobPostingThingBuilder implements Builder {
    /**
     * Creates new {@link JobPosting} instance.
     */
    public JobPosting build() {
      return new JobPosting(baseSalary, jobBenefits, datePosted, educationRequirements, employmentType, experienceRequirements, hiringOrganization, incentiveCompensation, industry, jobLocation, occupationalCategory, qualifications, responsibilities, salaryCurrency, skills, specialCommitments, title, workHours, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull Number number) {
      if (this.baseSalary == null) this.baseSalary = new NumberOrPriceSpecification();
      this.baseSalary.setNumber(number);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull PriceSpecification priceSpecification) {
      if (this.baseSalary == null) this.baseSalary = new NumberOrPriceSpecification();
      this.baseSalary.setPriceSpecification(priceSpecification);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @NotNull public Builder baseSalary(@NotNull PriceSpecification.Builder priceSpecification) {
      return this.baseSalary(priceSpecification.build());
    }
    /**
     * Description of benefits associated with the job.
     */
    @NotNull public Builder jobBenefits(@NotNull String jobBenefits) {
      this.jobBenefits = jobBenefits;
      return this;
    }
    /**
     * Publication date for the job posting.
     */
    @NotNull public Builder datePosted(@NotNull java.util.Date date) {
      this.datePosted = date;
      return this;
    }
    /**
     * Educational background needed for the position.
     */
    @NotNull public Builder educationRequirements(@NotNull String educationRequirements) {
      this.educationRequirements = educationRequirements;
      return this;
    }
    /**
     * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
     */
    @NotNull public Builder employmentType(@NotNull String employmentType) {
      this.employmentType = employmentType;
      return this;
    }
    /**
     * Description of skills and experience needed for the position.
     */
    @NotNull public Builder experienceRequirements(@NotNull String experienceRequirements) {
      this.experienceRequirements = experienceRequirements;
      return this;
    }
    /**
     * Organization offering the job position.
     */
    @NotNull public Builder hiringOrganization(@NotNull Organization organization) {
      this.hiringOrganization = organization;
      return this;
    }
    /**
     * Organization offering the job position.
     */
    @NotNull public Builder hiringOrganization(@NotNull Organization.Builder organization) {
      return this.hiringOrganization(organization.build());
    }
    /**
     * Description of bonus and commission compensation aspects of the job.
     */
    @NotNull public Builder incentiveCompensation(@NotNull String incentiveCompensation) {
      this.incentiveCompensation = incentiveCompensation;
      return this;
    }
    /**
     * The industry associated with the job position.
     */
    @NotNull public Builder industry(@NotNull String industry) {
      this.industry = industry;
      return this;
    }
    /**
     * A (typically single) geographic location associated with the job position.
     */
    @NotNull public Builder jobLocation(@NotNull Place place) {
      this.jobLocation = place;
      return this;
    }
    /**
     * A (typically single) geographic location associated with the job position.
     */
    @NotNull public Builder jobLocation(@NotNull Place.Builder place) {
      return this.jobLocation(place.build());
    }
    /**
     * Category or categories describing the job. Use BLS O*NET-SOC taxonomy: http://www.onetcenter.org/taxonomy.html. Ideally includes textual label and formal code, with the property repeated for each applicable value.
     */
    @NotNull public Builder occupationalCategory(@NotNull String occupationalCategory) {
      this.occupationalCategory = occupationalCategory;
      return this;
    }
    /**
     * Specific qualifications required for this role.
     */
    @NotNull public Builder qualifications(@NotNull String qualifications) {
      this.qualifications = qualifications;
      return this;
    }
    /**
     * Responsibilities associated with this role.
     */
    @NotNull public Builder responsibilities(@NotNull String responsibilities) {
      this.responsibilities = responsibilities;
      return this;
    }
    /**
     * The currency (coded using ISO 4217, http://en.wikipedia.org/wiki/ISO_4217 ) used for the main salary information in this job posting or for this employee.
     */
    @NotNull public Builder salaryCurrency(@NotNull String salaryCurrency) {
      this.salaryCurrency = salaryCurrency;
      return this;
    }
    /**
     * Skills required to fulfill this role.
     */
    @NotNull public Builder skills(@NotNull String skills) {
      this.skills = skills;
      return this;
    }
    /**
     * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
     */
    @NotNull public Builder specialCommitments(@NotNull String specialCommitments) {
      this.specialCommitments = specialCommitments;
      return this;
    }
    /**
     * The title of the job.
     */
    @NotNull public Builder title(@NotNull String title) {
      this.title = title;
      return this;
    }
    /**
     * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
     */
    @NotNull public Builder workHours(@NotNull String workHours) {
      this.workHours = workHours;
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
        if ("baseSalary".equals(key) && value instanceof Number) { baseSalary((Number)value); continue; }
        if ("baseSalary".equals(key) && value instanceof PriceSpecification) { baseSalary((PriceSpecification)value); continue; }
        if ("jobBenefits".equals(key) && value instanceof String) { jobBenefits((String)value); continue; }
        if ("datePosted".equals(key) && value instanceof java.util.Date) { datePosted((java.util.Date)value); continue; }
        if ("educationRequirements".equals(key) && value instanceof String) { educationRequirements((String)value); continue; }
        if ("employmentType".equals(key) && value instanceof String) { employmentType((String)value); continue; }
        if ("experienceRequirements".equals(key) && value instanceof String) { experienceRequirements((String)value); continue; }
        if ("hiringOrganization".equals(key) && value instanceof Organization) { hiringOrganization((Organization)value); continue; }
        if ("incentiveCompensation".equals(key) && value instanceof String) { incentiveCompensation((String)value); continue; }
        if ("industry".equals(key) && value instanceof String) { industry((String)value); continue; }
        if ("jobLocation".equals(key) && value instanceof Place) { jobLocation((Place)value); continue; }
        if ("occupationalCategory".equals(key) && value instanceof String) { occupationalCategory((String)value); continue; }
        if ("qualifications".equals(key) && value instanceof String) { qualifications((String)value); continue; }
        if ("responsibilities".equals(key) && value instanceof String) { responsibilities((String)value); continue; }
        if ("salaryCurrency".equals(key) && value instanceof String) { salaryCurrency((String)value); continue; }
        if ("skills".equals(key) && value instanceof String) { skills((String)value); continue; }
        if ("specialCommitments".equals(key) && value instanceof String) { specialCommitments((String)value); continue; }
        if ("title".equals(key) && value instanceof String) { title((String)value); continue; }
        if ("workHours".equals(key) && value instanceof String) { workHours((String)value); continue; }
        if ("additionalType".equals(key) && value instanceof String) { additionalType((String)value); continue; }
        if ("alternateName".equals(key) && value instanceof String) { alternateName((String)value); continue; }
        if ("description".equals(key) && value instanceof String) { description((String)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof CreativeWork) { mainEntityOfPage((CreativeWork)value); continue; }
        if ("mainEntityOfPage".equals(key) && value instanceof String) { mainEntityOfPage((String)value); continue; }
        if ("name".equals(key) && value instanceof String) { name((String)value); continue; }
        if ("sameAs".equals(key) && value instanceof String) { sameAs((String)value); continue; }
        if ("url".equals(key) && value instanceof String) { url((String)value); continue; }
        if ("potentialAction".equals(key) && value instanceof Action) { potentialAction((Action)value); continue; }
        if ("id".equals(key) && value instanceof String) { id((String)value); continue; }
      }
    }
    private NumberOrPriceSpecification baseSalary;
    private String jobBenefits;
    private java.util.Date datePosted;
    private String educationRequirements;
    private String employmentType;
    private String experienceRequirements;
    private Organization hiringOrganization;
    private String incentiveCompensation;
    private String industry;
    private Place jobLocation;
    private String occupationalCategory;
    private String qualifications;
    private String responsibilities;
    private String salaryCurrency;
    private String skills;
    private String specialCommitments;
    private String title;
    private String workHours;
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
  public interface Builder extends ThingBuilder<JobPosting> {
    @NotNull Builder baseSalary(@NotNull Number number);
    @NotNull Builder baseSalary(@NotNull PriceSpecification priceSpecification);
    @NotNull Builder baseSalary(@NotNull PriceSpecification.Builder priceSpecification);
    @NotNull Builder jobBenefits(@NotNull String jobBenefits);
    @NotNull Builder datePosted(@NotNull java.util.Date date);
    @NotNull Builder educationRequirements(@NotNull String educationRequirements);
    @NotNull Builder employmentType(@NotNull String employmentType);
    @NotNull Builder experienceRequirements(@NotNull String experienceRequirements);
    @NotNull Builder hiringOrganization(@NotNull Organization organization);
    @NotNull Builder hiringOrganization(@NotNull Organization.Builder organization);
    @NotNull Builder incentiveCompensation(@NotNull String incentiveCompensation);
    @NotNull Builder industry(@NotNull String industry);
    @NotNull Builder jobLocation(@NotNull Place place);
    @NotNull Builder jobLocation(@NotNull Place.Builder place);
    @NotNull Builder occupationalCategory(@NotNull String occupationalCategory);
    @NotNull Builder qualifications(@NotNull String qualifications);
    @NotNull Builder responsibilities(@NotNull String responsibilities);
    @NotNull Builder salaryCurrency(@NotNull String salaryCurrency);
    @NotNull Builder skills(@NotNull String skills);
    @NotNull Builder specialCommitments(@NotNull String specialCommitments);
    @NotNull Builder title(@NotNull String title);
    @NotNull Builder workHours(@NotNull String workHours);
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

  protected JobPosting(NumberOrPriceSpecification baseSalary, String jobBenefits, java.util.Date datePosted, String educationRequirements, String employmentType, String experienceRequirements, Organization hiringOrganization, String incentiveCompensation, String industry, Place jobLocation, String occupationalCategory, String qualifications, String responsibilities, String salaryCurrency, String skills, String specialCommitments, String title, String workHours, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myBaseSalary = baseSalary;
    myJobBenefits = jobBenefits;
    myDatePosted = datePosted;
    myEducationRequirements = educationRequirements;
    myEmploymentType = employmentType;
    myExperienceRequirements = experienceRequirements;
    myHiringOrganization = hiringOrganization;
    myIncentiveCompensation = incentiveCompensation;
    myIndustry = industry;
    myJobLocation = jobLocation;
    myOccupationalCategory = occupationalCategory;
    myQualifications = qualifications;
    myResponsibilities = responsibilities;
    mySalaryCurrency = salaryCurrency;
    mySkills = skills;
    mySpecialCommitments = specialCommitments;
    myTitle = title;
    myWorkHours = workHours;
  }
  private NumberOrPriceSpecification myBaseSalary;
  private String myJobBenefits;
  private java.util.Date myDatePosted;
  private String myEducationRequirements;
  private String myEmploymentType;
  private String myExperienceRequirements;
  private Organization myHiringOrganization;
  private String myIncentiveCompensation;
  private String myIndustry;
  private Place myJobLocation;
  private String myOccupationalCategory;
  private String myQualifications;
  private String myResponsibilities;
  private String mySalaryCurrency;
  private String mySkills;
  private String mySpecialCommitments;
  private String myTitle;
  private String myWorkHours;
}
