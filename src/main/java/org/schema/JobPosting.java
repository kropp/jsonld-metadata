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
 * A listing that describes a job opening in a certain organization.
 */
public class JobPosting extends Intangible {
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  public PriceSpecificationOrNumber getBaseSalary() {
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
  public static final class Builder {
    /**
     * Creates new {@link JobPosting} instance.
     */
    public JobPosting build() {
      return new JobPosting(responsibilities, jobLocation, incentiveCompensation, skills, qualifications, baseSalary, additionalType, sameAs, datePosted, specialCommitments, potentialAction, title, experienceRequirements, name, hiringOrganization, occupationalCategory, mainEntityOfPage, salaryCurrency, jobBenefits, url, alternateName, industry, educationRequirements, description, workHours, employmentType);
    }
    /**
     * Responsibilities associated with this role.
     */
    public Builder responsibilities(String responsibilities) {
      this.responsibilities = responsibilities;
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
     * Description of bonus and commission compensation aspects of the job.
     */
    public Builder incentiveCompensation(String incentiveCompensation) {
      this.incentiveCompensation = incentiveCompensation;
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
     * Specific qualifications required for this role.
     */
    public Builder qualifications(String qualifications) {
      this.qualifications = qualifications;
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    public Builder baseSalary(PriceSpecification priceSpecification) {
      this.baseSalary.setPriceSpecification(priceSpecification);
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    public Builder baseSalary(Number number) {
      this.baseSalary.setNumber(number);
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
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
     * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
     */
    public Builder specialCommitments(String specialCommitments) {
      this.specialCommitments = specialCommitments;
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
     * The title of the job.
     */
    public Builder title(String title) {
      this.title = title;
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
     * The name of the item.
     */
    public Builder name(String name) {
      this.name = name;
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
     * Category or categories describing the job. Use BLS O*NET-SOC taxonomy: http://www.onetcenter.org/taxonomy.html. Ideally includes textual label and formal code, with the property repeated for each applicable value.
     */
    public Builder occupationalCategory(String occupationalCategory) {
      this.occupationalCategory = occupationalCategory;
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
     * The currency (coded using ISO 4217, http://en.wikipedia.org/wiki/ISO_4217 ) used for the main salary information in this job posting or for this employee.
     */
    public Builder salaryCurrency(String salaryCurrency) {
      this.salaryCurrency = salaryCurrency;
      return this;
    }
    /**
     * Description of benefits associated with the job.
     */
    public Builder jobBenefits(String jobBenefits) {
      this.jobBenefits = jobBenefits;
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
     * An alias for the item.
     */
    public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
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
     * Educational background needed for the position.
     */
    public Builder educationRequirements(String educationRequirements) {
      this.educationRequirements = educationRequirements;
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
     * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
     */
    public Builder workHours(String workHours) {
      this.workHours = workHours;
      return this;
    }
    /**
     * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
     */
    public Builder employmentType(String employmentType) {
      this.employmentType = employmentType;
      return this;
    }
    private String responsibilities;
    private Place jobLocation;
    private String incentiveCompensation;
    private String skills;
    private String qualifications;
    private PriceSpecificationOrNumber baseSalary;
    private String additionalType;
    private String sameAs;
    private java.util.Date datePosted;
    private String specialCommitments;
    private Action potentialAction;
    private String title;
    private String experienceRequirements;
    private String name;
    private Organization hiringOrganization;
    private String occupationalCategory;
    private StringOrCreativeWork mainEntityOfPage;
    private String salaryCurrency;
    private String jobBenefits;
    private String url;
    private String alternateName;
    private String industry;
    private String educationRequirements;
    private String description;
    private String workHours;
    private String employmentType;
  }

  protected JobPosting(String responsibilities, Place jobLocation, String incentiveCompensation, String skills, String qualifications, PriceSpecificationOrNumber baseSalary, String additionalType, String sameAs, java.util.Date datePosted, String specialCommitments, Action potentialAction, String title, String experienceRequirements, String name, Organization hiringOrganization, String occupationalCategory, StringOrCreativeWork mainEntityOfPage, String salaryCurrency, String jobBenefits, String url, String alternateName, String industry, String educationRequirements, String description, String workHours, String employmentType) {
    super(additionalType, url, sameAs, alternateName, description, potentialAction, name, mainEntityOfPage);
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
  private PriceSpecificationOrNumber myBaseSalary;
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
