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
    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
  public static final class JobPostingThingBuilder implements Builder {
    /**
     * Creates new {@link JobPosting} instance.
     */
    public JobPosting build() {
      return new JobPosting(baseSalary, jobBenefits, datePosted, educationRequirements, employmentType, experienceRequirements, hiringOrganization, incentiveCompensation, industry, jobLocation, occupationalCategory, qualifications, responsibilities, salaryCurrency, skills, specialCommitments, title, workHours, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    public Builder baseSalary(Number number) {
      if (this.baseSalary == null) this.baseSalary = new NumberOrPriceSpecification();
      this.baseSalary.setNumber(number);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    public Builder baseSalary(PriceSpecification priceSpecification) {
      if (this.baseSalary == null) this.baseSalary = new NumberOrPriceSpecification();
      this.baseSalary.setPriceSpecification(priceSpecification);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    public Builder baseSalary(PriceSpecification.Builder priceSpecification) {
      return this.baseSalary(priceSpecification.build());
    }
    /**
     * Description of benefits associated with the job.
     */
    public Builder jobBenefits(String jobBenefits) {
      this.jobBenefits = jobBenefits;
      return this;
    }
    /**
     * Publication date for the job posting.
     */
    public Builder datePosted(java.util.Date date) {
      this.datePosted = date;
      return this;
    }
    /**
     * Educational background needed for the position.
     */
    public Builder educationRequirements(String educationRequirements) {
      this.educationRequirements = educationRequirements;
      return this;
    }
    /**
     * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
     */
    public Builder employmentType(String employmentType) {
      this.employmentType = employmentType;
      return this;
    }
    /**
     * Description of skills and experience needed for the position.
     */
    public Builder experienceRequirements(String experienceRequirements) {
      this.experienceRequirements = experienceRequirements;
      return this;
    }
    /**
     * Organization offering the job position.
     */
    public Builder hiringOrganization(Organization organization) {
      this.hiringOrganization = organization;
      return this;
    }
    /**
     * Organization offering the job position.
     */
    public Builder hiringOrganization(Organization.Builder organization) {
      return this.hiringOrganization(organization.build());
    }
    /**
     * Description of bonus and commission compensation aspects of the job.
     */
    public Builder incentiveCompensation(String incentiveCompensation) {
      this.incentiveCompensation = incentiveCompensation;
      return this;
    }
    /**
     * The industry associated with the job position.
     */
    public Builder industry(String industry) {
      this.industry = industry;
      return this;
    }
    /**
     * A (typically single) geographic location associated with the job position.
     */
    public Builder jobLocation(Place place) {
      this.jobLocation = place;
      return this;
    }
    /**
     * A (typically single) geographic location associated with the job position.
     */
    public Builder jobLocation(Place.Builder place) {
      return this.jobLocation(place.build());
    }
    /**
     * Category or categories describing the job. Use BLS O*NET-SOC taxonomy: http://www.onetcenter.org/taxonomy.html. Ideally includes textual label and formal code, with the property repeated for each applicable value.
     */
    public Builder occupationalCategory(String occupationalCategory) {
      this.occupationalCategory = occupationalCategory;
      return this;
    }
    /**
     * Specific qualifications required for this role.
     */
    public Builder qualifications(String qualifications) {
      this.qualifications = qualifications;
      return this;
    }
    /**
     * Responsibilities associated with this role.
     */
    public Builder responsibilities(String responsibilities) {
      this.responsibilities = responsibilities;
      return this;
    }
    /**
     * The currency (coded using ISO 4217, http://en.wikipedia.org/wiki/ISO_4217 ) used for the main salary information in this job posting or for this employee.
     */
    public Builder salaryCurrency(String salaryCurrency) {
      this.salaryCurrency = salaryCurrency;
      return this;
    }
    /**
     * Skills required to fulfill this role.
     */
    public Builder skills(String skills) {
      this.skills = skills;
      return this;
    }
    /**
     * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
     */
    public Builder specialCommitments(String specialCommitments) {
      this.specialCommitments = specialCommitments;
      return this;
    }
    /**
     * The title of the job.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
    /**
     * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
     */
    public Builder workHours(String workHours) {
      this.workHours = workHours;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
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
    public Builder mainEntityOfPage(CreativeWork creativeWork) {
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
    public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
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
    public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
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
  Builder baseSalary(Number number);
  Builder baseSalary(PriceSpecification priceSpecification);
  Builder baseSalary(PriceSpecification.Builder priceSpecification);
  Builder jobBenefits(String jobBenefits);
  Builder datePosted(java.util.Date date);
  Builder educationRequirements(String educationRequirements);
  Builder employmentType(String employmentType);
  Builder experienceRequirements(String experienceRequirements);
  Builder hiringOrganization(Organization organization);
  Builder hiringOrganization(Organization.Builder organization);
  Builder incentiveCompensation(String incentiveCompensation);
  Builder industry(String industry);
  Builder jobLocation(Place place);
  Builder jobLocation(Place.Builder place);
  Builder occupationalCategory(String occupationalCategory);
  Builder qualifications(String qualifications);
  Builder responsibilities(String responsibilities);
  Builder salaryCurrency(String salaryCurrency);
  Builder skills(String skills);
  Builder specialCommitments(String specialCommitments);
  Builder title(String title);
  Builder workHours(String workHours);
  Builder additionalType(String additionalType);
  Builder alternateName(String alternateName);
  Builder description(String description);
  Builder mainEntityOfPage(CreativeWork creativeWork);
  Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
  Builder mainEntityOfPage(String mainEntityOfPage);
  Builder name(String name);
  Builder sameAs(String sameAs);
  Builder url(String url);
  Builder potentialAction(Action action);
  Builder potentialAction(Action.Builder action);
  Builder id(String id);
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
