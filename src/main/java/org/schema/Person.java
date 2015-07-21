/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * A person (alive, dead, undead, or fictional).
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews
 * Equivalent class: http://xmlns.com/foaf/0.1/Person
 */
public class Person extends Thing {
  /**
   * An additional name for a Person, can be used for a middle name.
   */
  public String getAdditionalName() {
    return myAdditionalName;
  }
  /**
   * Physical address of the item.
   */
  public PostalAddress getAddress() {
    return myAddress;
  }
  /**
   * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
   */
  public Organization getAffiliation() {
    return myAffiliation;
  }
  /**
   * An educational organizations that the person is an alumni of.
   */
  public EducationalOrganization getAlumniOf() {
    return myAlumniOf;
  }
  /**
   * An award won by or for this item.
   */
  public String getAward() {
    return myAward;
  }
  /**
   * Date of birth.
   */
  public java.util.Date getBirthDate() {
    return myBirthDate;
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public Brand getBrand() {
    return myBrand;
  }
  /**
   * A child of the person.
   */
  public Person getChildren() {
    return myChildren;
  }
  /**
   * A colleague of the person.
   */
  public Person getColleague() {
    return myColleague;
  }
  /**
   * A contact point for a person or organization.
   */
  public ContactPoint getContactPoint() {
    return myContactPoint;
  }
  /**
   * Date of death.
   */
  public java.util.Date getDeathDate() {
    return myDeathDate;
  }
  /**
   * The Dun & Bradstreet DUNS number for identifying an organization or business person.
   */
  public String getDuns() {
    return myDuns;
  }
  /**
   * Email address.
   */
  public String getEmail() {
    return myEmail;
  }
  /**
   * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
   */
  public String getFamilyName() {
    return myFamilyName;
  }
  /**
   * The fax number.
   */
  public String getFaxNumber() {
    return myFaxNumber;
  }
  /**
   * The most generic uni-directional social relation.
   */
  public Person getFollows() {
    return myFollows;
  }
  /**
   * Gender of the person.
   */
  public String getGender() {
    return myGender;
  }
  /**
   * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
   */
  public String getGivenName() {
    return myGivenName;
  }
  /**
   * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  public String getGlobalLocationNumber() {
    return myGlobalLocationNumber;
  }
  /**
   * Points-of-Sales operated by the organization or person.
   */
  public Place getHasPOS() {
    return myHasPOS;
  }
  /**
   * The height of the item.
   */
  public Distance getHeight() {
    return myHeight;
  }
  /**
   * A contact location for a person's residence.
   */
  public ContactPoint getHomeLocation() {
    return myHomeLocation;
  }
  /**
   * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
   */
  public String getHonorificPrefix() {
    return myHonorificPrefix;
  }
  /**
   * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
   */
  public String getHonorificSuffix() {
    return myHonorificSuffix;
  }
  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  public String getIsicV4() {
    return myIsicV4;
  }
  /**
   * The job title of the person (for example, Financial Manager).
   */
  public String getJobTitle() {
    return myJobTitle;
  }
  /**
   * The most generic bi-directional social/work relation.
   */
  public Person getKnows() {
    return myKnows;
  }
  /**
   * A pointer to products or services offered by the organization or person.
   */
  public Offer getMakesOffer() {
    return myMakesOffer;
  }
  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs.
   */
  public Organization getMemberOf() {
    return myMemberOf;
  }
  /**
   * The North American Industry Classification System (NAICS) code for a particular organization or business person.
   */
  public String getNaics() {
    return myNaics;
  }
  /**
   * Nationality of the person.
   */
  public Country getNationality() {
    return myNationality;
  }
  /**
   * The total financial value of the organization or person as calculated by subtracting assets from liabilities.
   */
  public PriceSpecification getNetWorth() {
    return myNetWorth;
  }
  /**
   * Products owned by the organization or person.
   */
  public OwnershipInfo getOwns() {
    return myOwns;
  }
  /**
   * A parent of this person.
   */
  public Person getParent() {
    return myParent;
  }
  /**
   * Event that this person is a performer or participant in.
   */
  public Event getPerformerIn() {
    return myPerformerIn;
  }
  /**
   * The most generic familial relation.
   */
  public Person getRelatedTo() {
    return myRelatedTo;
  }
  /**
   * A pointer to products or services sought by the organization or person (demand).
   */
  public Demand getSeeks() {
    return mySeeks;
  }
  /**
   * A sibling of the person.
   */
  public Person getSibling() {
    return mySibling;
  }
  /**
   * The person's spouse.
   */
  public Person getSpouse() {
    return mySpouse;
  }
  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
   */
  public String getTaxID() {
    return myTaxID;
  }
  /**
   * The telephone number.
   */
  public String getTelephone() {
    return myTelephone;
  }
  /**
   * The Value-added Tax ID of the organization or person.
   */
  public String getVatID() {
    return myVatID;
  }
  /**
   * The weight of the product or person.
   */
  public QuantitativeValue getWeight() {
    return myWeight;
  }
  /**
   * A contact location for a person's place of work.
   */
  public ContactPoint getWorkLocation() {
    return myWorkLocation;
  }
  /**
   * Organizations that the person works for.
   */
  public Organization getWorksFor() {
    return myWorksFor;
  }
  /**
   * The place where the person was born.
   */
  public Place getBirthPlace() {
    return myBirthPlace;
  }
  /**
   * The place where the person died.
   */
  public Place getDeathPlace() {
    return myDeathPlace;
  }
  /**
   * Builder for {@see Person}
   */
  public static final class Builder {
    public Person build() {
      return new Person(workLocation, deathDate, additionalName, birthDate, sibling, children, jobTitle, owns, additionalType, seeks, honorificSuffix, hasPOS, follows, parent, image, contactPoint, email, brand, faxNumber, globalLocationNumber, deathPlace, alternateName, alumniOf, url, worksFor, vatID, homeLocation, memberOf, nationality, taxID, familyName, gender, potentialAction, weight, givenName, spouse, makesOffer, honorificPrefix, affiliation, relatedTo, description, duns, mainEntityOfPage, telephone, birthPlace, knows, performerIn, sameAs, naics, height, colleague, netWorth, name, address, isicV4, award);
    }
    /**
     * A contact location for a person's place of work.
     */
    public Builder workLocation(ContactPoint value) {
      workLocation = value;
      return this;
    }
    /**
     * Date of death.
     */
    public Builder deathDate(java.util.Date value) {
      deathDate = value;
      return this;
    }
    /**
     * An additional name for a Person, can be used for a middle name.
     */
    public Builder additionalName(String value) {
      additionalName = value;
      return this;
    }
    /**
     * Date of birth.
     */
    public Builder birthDate(java.util.Date value) {
      birthDate = value;
      return this;
    }
    /**
     * A sibling of the person.
     */
    public Builder sibling(Person value) {
      sibling = value;
      return this;
    }
    /**
     * A child of the person.
     */
    public Builder children(Person value) {
      children = value;
      return this;
    }
    /**
     * The job title of the person (for example, Financial Manager).
     */
    public Builder jobTitle(String value) {
      jobTitle = value;
      return this;
    }
    /**
     * Products owned by the organization or person.
     */
    public Builder owns(OwnershipInfo value) {
      owns = value;
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
     * A pointer to products or services sought by the organization or person (demand).
     */
    public Builder seeks(Demand value) {
      seeks = value;
      return this;
    }
    /**
     * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
     */
    public Builder honorificSuffix(String value) {
      honorificSuffix = value;
      return this;
    }
    /**
     * Points-of-Sales operated by the organization or person.
     */
    public Builder hasPOS(Place value) {
      hasPOS = value;
      return this;
    }
    /**
     * The most generic uni-directional social relation.
     */
    public Builder follows(Person value) {
      follows = value;
      return this;
    }
    /**
     * A parent of this person.
     */
    public Builder parent(Person value) {
      parent = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * A contact point for a person or organization.
     */
    public Builder contactPoint(ContactPoint value) {
      contactPoint = value;
      return this;
    }
    /**
     * Email address.
     */
    public Builder email(String value) {
      email = value;
      return this;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    public Builder brand(Brand value) {
      brand = value;
      return this;
    }
    /**
     * The fax number.
     */
    public Builder faxNumber(String value) {
      faxNumber = value;
      return this;
    }
    /**
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    public Builder globalLocationNumber(String value) {
      globalLocationNumber = value;
      return this;
    }
    /**
     * The place where the person died.
     */
    public Builder deathPlace(Place value) {
      deathPlace = value;
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
     * An educational organizations that the person is an alumni of.
     */
    public Builder alumniOf(EducationalOrganization value) {
      alumniOf = value;
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
     * Organizations that the person works for.
     */
    public Builder worksFor(Organization value) {
      worksFor = value;
      return this;
    }
    /**
     * The Value-added Tax ID of the organization or person.
     */
    public Builder vatID(String value) {
      vatID = value;
      return this;
    }
    /**
     * A contact location for a person's residence.
     */
    public Builder homeLocation(ContactPoint value) {
      homeLocation = value;
      return this;
    }
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    public Builder memberOf(Organization value) {
      memberOf = value;
      return this;
    }
    /**
     * Nationality of the person.
     */
    public Builder nationality(Country value) {
      nationality = value;
      return this;
    }
    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     */
    public Builder taxID(String value) {
      taxID = value;
      return this;
    }
    /**
     * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
     */
    public Builder familyName(String value) {
      familyName = value;
      return this;
    }
    /**
     * Gender of the person.
     */
    public Builder gender(String value) {
      gender = value;
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
     * The weight of the product or person.
     */
    public Builder weight(QuantitativeValue value) {
      weight = value;
      return this;
    }
    /**
     * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
     */
    public Builder givenName(String value) {
      givenName = value;
      return this;
    }
    /**
     * The person's spouse.
     */
    public Builder spouse(Person value) {
      spouse = value;
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    public Builder makesOffer(Offer value) {
      makesOffer = value;
      return this;
    }
    /**
     * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
     */
    public Builder honorificPrefix(String value) {
      honorificPrefix = value;
      return this;
    }
    /**
     * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
     */
    public Builder affiliation(Organization value) {
      affiliation = value;
      return this;
    }
    /**
     * The most generic familial relation.
     */
    public Builder relatedTo(Person value) {
      relatedTo = value;
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
     * The Dun & Bradstreet DUNS number for identifying an organization or business person.
     */
    public Builder duns(String value) {
      duns = value;
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
     * The telephone number.
     */
    public Builder telephone(String value) {
      telephone = value;
      return this;
    }
    /**
     * The place where the person was born.
     */
    public Builder birthPlace(Place value) {
      birthPlace = value;
      return this;
    }
    /**
     * The most generic bi-directional social/work relation.
     */
    public Builder knows(Person value) {
      knows = value;
      return this;
    }
    /**
     * Event that this person is a performer or participant in.
     */
    public Builder performerIn(Event value) {
      performerIn = value;
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
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     */
    public Builder naics(String value) {
      naics = value;
      return this;
    }
    /**
     * The height of the item.
     */
    public Builder height(Distance value) {
      height = value;
      return this;
    }
    /**
     * A colleague of the person.
     */
    public Builder colleague(Person value) {
      colleague = value;
      return this;
    }
    /**
     * The total financial value of the organization or person as calculated by subtracting assets from liabilities.
     */
    public Builder netWorth(PriceSpecification value) {
      netWorth = value;
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
     * Physical address of the item.
     */
    public Builder address(PostalAddress value) {
      address = value;
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    public Builder isicV4(String value) {
      isicV4 = value;
      return this;
    }
    /**
     * An award won by or for this item.
     */
    public Builder award(String value) {
      award = value;
      return this;
    }
    private ContactPoint workLocation;
    private java.util.Date deathDate;
    private String additionalName;
    private java.util.Date birthDate;
    private Person sibling;
    private Person children;
    private String jobTitle;
    private OwnershipInfo owns;
    private String additionalType;
    private Demand seeks;
    private String honorificSuffix;
    private Place hasPOS;
    private Person follows;
    private Person parent;
    private Image image;
    private ContactPoint contactPoint;
    private String email;
    private Brand brand;
    private String faxNumber;
    private String globalLocationNumber;
    private Place deathPlace;
    private String alternateName;
    private EducationalOrganization alumniOf;
    private String url;
    private Organization worksFor;
    private String vatID;
    private ContactPoint homeLocation;
    private Organization memberOf;
    private Country nationality;
    private String taxID;
    private String familyName;
    private String gender;
    private Action potentialAction;
    private QuantitativeValue weight;
    private String givenName;
    private Person spouse;
    private Offer makesOffer;
    private String honorificPrefix;
    private Organization affiliation;
    private Person relatedTo;
    private String description;
    private String duns;
    private CreativeWork mainEntityOfPage;
    private String telephone;
    private Place birthPlace;
    private Person knows;
    private Event performerIn;
    private String sameAs;
    private String naics;
    private Distance height;
    private Person colleague;
    private PriceSpecification netWorth;
    private String name;
    private PostalAddress address;
    private String isicV4;
    private String award;
  }

  protected Person(ContactPoint workLocation, java.util.Date deathDate, String additionalName, java.util.Date birthDate, Person sibling, Person children, String jobTitle, OwnershipInfo owns, String additionalType, Demand seeks, String honorificSuffix, Place hasPOS, Person follows, Person parent, Image image, ContactPoint contactPoint, String email, Brand brand, String faxNumber, String globalLocationNumber, Place deathPlace, String alternateName, EducationalOrganization alumniOf, String url, Organization worksFor, String vatID, ContactPoint homeLocation, Organization memberOf, Country nationality, String taxID, String familyName, String gender, Action potentialAction, QuantitativeValue weight, String givenName, Person spouse, Offer makesOffer, String honorificPrefix, Organization affiliation, Person relatedTo, String description, String duns, CreativeWork mainEntityOfPage, String telephone, Place birthPlace, Person knows, Event performerIn, String sameAs, String naics, Distance height, Person colleague, PriceSpecification netWorth, String name, PostalAddress address, String isicV4, String award) {
    super(mainEntityOfPage, name, image, potentialAction, alternateName, url, additionalType, description, sameAs);
    myAdditionalName = additionalName;
    myAddress = address;
    myAffiliation = affiliation;
    myAlumniOf = alumniOf;
    myAward = award;
    myBirthDate = birthDate;
    myBrand = brand;
    myChildren = children;
    myColleague = colleague;
    myContactPoint = contactPoint;
    myDeathDate = deathDate;
    myDuns = duns;
    myEmail = email;
    myFamilyName = familyName;
    myFaxNumber = faxNumber;
    myFollows = follows;
    myGender = gender;
    myGivenName = givenName;
    myGlobalLocationNumber = globalLocationNumber;
    myHasPOS = hasPOS;
    myHeight = height;
    myHomeLocation = homeLocation;
    myHonorificPrefix = honorificPrefix;
    myHonorificSuffix = honorificSuffix;
    myIsicV4 = isicV4;
    myJobTitle = jobTitle;
    myKnows = knows;
    myMakesOffer = makesOffer;
    myMemberOf = memberOf;
    myNaics = naics;
    myNationality = nationality;
    myNetWorth = netWorth;
    myOwns = owns;
    myParent = parent;
    myPerformerIn = performerIn;
    myRelatedTo = relatedTo;
    mySeeks = seeks;
    mySibling = sibling;
    mySpouse = spouse;
    myTaxID = taxID;
    myTelephone = telephone;
    myVatID = vatID;
    myWeight = weight;
    myWorkLocation = workLocation;
    myWorksFor = worksFor;
    myBirthPlace = birthPlace;
    myDeathPlace = deathPlace;
  }
  private String myAdditionalName;
  private PostalAddress myAddress;
  private Organization myAffiliation;
  private EducationalOrganization myAlumniOf;
  private String myAward;
  private java.util.Date myBirthDate;
  private Brand myBrand;
  private Person myChildren;
  private Person myColleague;
  private ContactPoint myContactPoint;
  private java.util.Date myDeathDate;
  private String myDuns;
  private String myEmail;
  private String myFamilyName;
  private String myFaxNumber;
  private Person myFollows;
  private String myGender;
  private String myGivenName;
  private String myGlobalLocationNumber;
  private Place myHasPOS;
  private Distance myHeight;
  private ContactPoint myHomeLocation;
  private String myHonorificPrefix;
  private String myHonorificSuffix;
  private String myIsicV4;
  private String myJobTitle;
  private Person myKnows;
  private Offer myMakesOffer;
  private Organization myMemberOf;
  private String myNaics;
  private Country myNationality;
  private PriceSpecification myNetWorth;
  private OwnershipInfo myOwns;
  private Person myParent;
  private Event myPerformerIn;
  private Person myRelatedTo;
  private Demand mySeeks;
  private Person mySibling;
  private Person mySpouse;
  private String myTaxID;
  private String myTelephone;
  private String myVatID;
  private QuantitativeValue myWeight;
  private ContactPoint myWorkLocation;
  private Organization myWorksFor;
  private Place myBirthPlace;
  private Place myDeathPlace;
}
