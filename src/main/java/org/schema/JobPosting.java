/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A listing that describes a job opening in a certain organization.
 */
public class JobPosting extends Intangible {
  /**
   * The base salary of the job or of an employee in an EmployeeRole.
   */
  public Number getBaseSalary() {
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
   * Builder for {@see JobPosting}
   */
  public static final class Builder {
    public JobPosting build() {
      return new JobPosting(jobLocation, skills, educationRequirements, potentialAction, incentiveCompensation, industry, salaryCurrency, additionalType, title, hiringOrganization, employmentType, specialCommitments, image, datePosted, description, mainEntityOfPage, qualifications, alternateName, experienceRequirements, url, jobBenefits, sameAs, responsibilities, workHours, baseSalary, name, occupationalCategory);
    }
    /**
     * A (typically single) geographic location associated with the job position.
     */
    public Builder jobLocation(Place value) {
      jobLocation = value;
      return this;
    }
    /**
     * Skills required to fulfill this role.
     */
    public Builder skills(String value) {
      skills = value;
      return this;
    }
    /**
     * Educational background needed for the position.
     */
    public Builder educationRequirements(String value) {
      educationRequirements = value;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * Description of bonus and commission compensation aspects of the job.
     */
    public Builder incentiveCompensation(String value) {
      incentiveCompensation = value;
      return this;
    }
    /**
     * The industry associated with the job position.
     */
    public Builder industry(String value) {
      industry = value;
      return this;
    }
    /**
     * The currency (coded using ISO 4217, http://en.wikipedia.org/wiki/ISO_4217 ) used for the main salary information in this job posting or for this employee.
     */
    public Builder salaryCurrency(String value) {
      salaryCurrency = value;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * The title of the job.
     */
    public Builder title(String value) {
      title = value;
      return this;
    }
    /**
     * Organization offering the job position.
     */
    public Builder hiringOrganization(Organization value) {
      hiringOrganization = value;
      return this;
    }
    /**
     * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
     */
    public Builder employmentType(String value) {
      employmentType = value;
      return this;
    }
    /**
     * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
     */
    public Builder specialCommitments(String value) {
      specialCommitments = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * Publication date for the job posting.
     */
    public Builder datePosted(java.util.Date value) {
      datePosted = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
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
    public Builder mainEntityOfPage(CreativeWork value) {
      mainEntityOfPage = value;
      return this;
    }
    /**
     * Specific qualifications required for this role.
     */
    public Builder qualifications(String value) {
      qualifications = value;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
      return this;
    }
    /**
     * Description of skills and experience needed for the position.
     */
    public Builder experienceRequirements(String value) {
      experienceRequirements = value;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
      return this;
    }
    /**
     * Description of benefits associated with the job.
     */
    public Builder jobBenefits(String value) {
      jobBenefits = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * Responsibilities associated with this role.
     */
    public Builder responsibilities(String value) {
      responsibilities = value;
      return this;
    }
    /**
     * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
     */
    public Builder workHours(String value) {
      workHours = value;
      return this;
    }
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    public Builder baseSalary(Number value) {
      baseSalary = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    /**
     * Category or categories describing the job. Use BLS O*NET-SOC taxonomy: http://www.onetcenter.org/taxonomy.html. Ideally includes textual label and formal code, with the property repeated for each applicable value.
     */
    public Builder occupationalCategory(String value) {
      occupationalCategory = value;
      return this;
    }
    private Place jobLocation;
    private String skills;
    private String educationRequirements;
    private Action potentialAction;
    private String incentiveCompensation;
    private String industry;
    private String salaryCurrency;
    private String additionalType;
    private String title;
    private Organization hiringOrganization;
    private String employmentType;
    private String specialCommitments;
    private Image image;
    private java.util.Date datePosted;
    private String description;
    private CreativeWork mainEntityOfPage;
    private String qualifications;
    private String alternateName;
    private String experienceRequirements;
    private String url;
    private String jobBenefits;
    private String sameAs;
    private String responsibilities;
    private String workHours;
    private Number baseSalary;
    private String name;
    private String occupationalCategory;
  }

  protected JobPosting(Place jobLocation, String skills, String educationRequirements, Action potentialAction, String incentiveCompensation, String industry, String salaryCurrency, String additionalType, String title, Organization hiringOrganization, String employmentType, String specialCommitments, Image image, java.util.Date datePosted, String description, CreativeWork mainEntityOfPage, String qualifications, String alternateName, String experienceRequirements, String url, String jobBenefits, String sameAs, String responsibilities, String workHours, Number baseSalary, String name, String occupationalCategory) {
    super(mainEntityOfPage, image, name, potentialAction, alternateName, additionalType, url, description, sameAs);
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
  private Number myBaseSalary;
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
