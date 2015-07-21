/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * An organization such as a school, NGO, corporation, club, etc.
 */
public class Organization extends Thing {
  /**
   * Physical address of the item.
   */
  public PostalAddress getAddress() {
    return myAddress;
  }
  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating getAggregateRating() {
    return myAggregateRating;
  }
  /**
   * An award won by or for this item.
   */
  public String getAward() {
    return myAward;
  }
  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
   */
  public Brand getBrand() {
    return myBrand;
  }
  /**
   * A contact point for a person or organization.
   */
  public ContactPoint getContactPoint() {
    return myContactPoint;
  }
  /**
   * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
   */
  public Organization getDepartment() {
    return myDepartment;
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
   * Someone working for this organization.
   */
  public Person getEmployee() {
    return myEmployee;
  }
  /**
   * Upcoming or past event associated with this place, organization, or action.
   */
  public Event getEvent() {
    return myEvent;
  }
  /**
   * The fax number.
   */
  public String getFaxNumber() {
    return myFaxNumber;
  }
  /**
   * A person who founded this organization.
   */
  public Person getFounder() {
    return myFounder;
  }
  /**
   * The date that this organization was dissolved.
   */
  public java.util.Date getDissolutionDate() {
    return myDissolutionDate;
  }
  /**
   * The date that this organization was founded.
   */
  public java.util.Date getFoundingDate() {
    return myFoundingDate;
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
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  public String getIsicV4() {
    return myIsicV4;
  }
  /**
   * The official name of the organization, e.g. the registered company name.
   */
  public String getLegalName() {
    return myLegalName;
  }
  public Location getLocation() {
    return myLocation;
  }
  /**
   * An associated logo.
   */
  public ImageObject getLogo() {
    return myLogo;
  }
  /**
   * A pointer to products or services offered by the organization or person.
   */
  public Offer getMakesOffer() {
    return myMakesOffer;
  }
  /**
   * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
   */
  public Organization getMember() {
    return myMember;
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
   * The number of employees in an organization e.g. business.
   */
  public QuantitativeValue getNumberOfEmployees() {
    return myNumberOfEmployees;
  }
  /**
   * Products owned by the organization or person.
   */
  public OwnershipInfo getOwns() {
    return myOwns;
  }
  /**
   * A review of the item.
   */
  public Review getReview() {
    return myReview;
  }
  /**
   * A pointer to products or services sought by the organization or person (demand).
   */
  public Demand getSeeks() {
    return mySeeks;
  }
  /**
   * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
   */
  public Organization getSubOrganization() {
    return mySubOrganization;
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
   * The place where the Organization was founded.
   */
  public Place getFoundingLocation() {
    return myFoundingLocation;
  }
  /**
   * Builder for {@see Organization}
   */
  public static final class Builder {
    public Organization build() {
      return new Organization(review, owns, potentialAction, additionalType, seeks, logo, hasPOS, founder, legalName, makesOffer, image, employee, contactPoint, department, description, foundingLocation, email, event, duns, faxNumber, brand, mainEntityOfPage, globalLocationNumber, numberOfEmployees, telephone, alternateName, foundingDate, url, sameAs, aggregateRating, subOrganization, vatID, naics, dissolutionDate, name, memberOf, address, isicV4, member, taxID, location, award);
    }
    /**
     * A review of the item.
     */
    public Builder review(Review value) {
      review = value;
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
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
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
     * An associated logo.
     */
    public Builder logo(ImageObject value) {
      logo = value;
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
     * A person who founded this organization.
     */
    public Builder founder(Person value) {
      founder = value;
      return this;
    }
    /**
     * The official name of the organization, e.g. the registered company name.
     */
    public Builder legalName(String value) {
      legalName = value;
      return this;
    }
    /**
     * A pointer to products or services offered by the organization or person.
     */
    public Builder makesOffer(Offer value) {
      makesOffer = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * Someone working for this organization.
     */
    public Builder employee(Person value) {
      employee = value;
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
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    public Builder department(Organization value) {
      department = value;
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
     * The place where the Organization was founded.
     */
    public Builder foundingLocation(Place value) {
      foundingLocation = value;
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
     * Upcoming or past event associated with this place, organization, or action.
     */
    public Builder event(Event value) {
      event = value;
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
     * The fax number.
     */
    public Builder faxNumber(String value) {
      faxNumber = value;
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
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    public Builder globalLocationNumber(String value) {
      globalLocationNumber = value;
      return this;
    }
    /**
     * The number of employees in an organization e.g. business.
     */
    public Builder numberOfEmployees(QuantitativeValue value) {
      numberOfEmployees = value;
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
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
      return this;
    }
    /**
     * The date that this organization was founded.
     */
    public Builder foundingDate(java.util.Date value) {
      foundingDate = value;
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
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    public Builder aggregateRating(AggregateRating value) {
      aggregateRating = value;
      return this;
    }
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    public Builder subOrganization(Organization value) {
      subOrganization = value;
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
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     */
    public Builder naics(String value) {
      naics = value;
      return this;
    }
    /**
     * The date that this organization was dissolved.
     */
    public Builder dissolutionDate(java.util.Date value) {
      dissolutionDate = value;
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
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    public Builder memberOf(Organization value) {
      memberOf = value;
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
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    public Builder member(Organization value) {
      member = value;
      return this;
    }
    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     */
    public Builder taxID(String value) {
      taxID = value;
      return this;
    }
    public Builder location(Location value) {
      location = value;
      return this;
    }
    /**
     * An award won by or for this item.
     */
    public Builder award(String value) {
      award = value;
      return this;
    }
    private Review review;
    private OwnershipInfo owns;
    private Action potentialAction;
    private String additionalType;
    private Demand seeks;
    private ImageObject logo;
    private Place hasPOS;
    private Person founder;
    private String legalName;
    private Offer makesOffer;
    private Image image;
    private Person employee;
    private ContactPoint contactPoint;
    private Organization department;
    private String description;
    private Place foundingLocation;
    private String email;
    private Event event;
    private String duns;
    private String faxNumber;
    private Brand brand;
    private CreativeWork mainEntityOfPage;
    private String globalLocationNumber;
    private QuantitativeValue numberOfEmployees;
    private String telephone;
    private String alternateName;
    private java.util.Date foundingDate;
    private String url;
    private String sameAs;
    private AggregateRating aggregateRating;
    private Organization subOrganization;
    private String vatID;
    private String naics;
    private java.util.Date dissolutionDate;
    private String name;
    private Organization memberOf;
    private PostalAddress address;
    private String isicV4;
    private Organization member;
    private String taxID;
    private Location location;
    private String award;
  }

  protected Organization(Review review, OwnershipInfo owns, Action potentialAction, String additionalType, Demand seeks, ImageObject logo, Place hasPOS, Person founder, String legalName, Offer makesOffer, Image image, Person employee, ContactPoint contactPoint, Organization department, String description, Place foundingLocation, String email, Event event, String duns, String faxNumber, Brand brand, CreativeWork mainEntityOfPage, String globalLocationNumber, QuantitativeValue numberOfEmployees, String telephone, String alternateName, java.util.Date foundingDate, String url, String sameAs, AggregateRating aggregateRating, Organization subOrganization, String vatID, String naics, java.util.Date dissolutionDate, String name, Organization memberOf, PostalAddress address, String isicV4, Organization member, String taxID, Location location, String award) {
    super(mainEntityOfPage, name, image, potentialAction, alternateName, url, additionalType, description, sameAs);
    myAddress = address;
    myAggregateRating = aggregateRating;
    myAward = award;
    myBrand = brand;
    myContactPoint = contactPoint;
    myDepartment = department;
    myDuns = duns;
    myEmail = email;
    myEmployee = employee;
    myEvent = event;
    myFaxNumber = faxNumber;
    myFounder = founder;
    myDissolutionDate = dissolutionDate;
    myFoundingDate = foundingDate;
    myGlobalLocationNumber = globalLocationNumber;
    myHasPOS = hasPOS;
    myIsicV4 = isicV4;
    myLegalName = legalName;
    myLocation = location;
    myLogo = logo;
    myMakesOffer = makesOffer;
    myMember = member;
    myMemberOf = memberOf;
    myNaics = naics;
    myNumberOfEmployees = numberOfEmployees;
    myOwns = owns;
    myReview = review;
    mySeeks = seeks;
    mySubOrganization = subOrganization;
    myTaxID = taxID;
    myTelephone = telephone;
    myVatID = vatID;
    myFoundingLocation = foundingLocation;
  }
  private PostalAddress myAddress;
  private AggregateRating myAggregateRating;
  private String myAward;
  private Brand myBrand;
  private ContactPoint myContactPoint;
  private Organization myDepartment;
  private String myDuns;
  private String myEmail;
  private Person myEmployee;
  private Event myEvent;
  private String myFaxNumber;
  private Person myFounder;
  private java.util.Date myDissolutionDate;
  private java.util.Date myFoundingDate;
  private String myGlobalLocationNumber;
  private Place myHasPOS;
  private String myIsicV4;
  private String myLegalName;
  private Location myLocation;
  private ImageObject myLogo;
  private Offer myMakesOffer;
  private Organization myMember;
  private Organization myMemberOf;
  private String myNaics;
  private QuantitativeValue myNumberOfEmployees;
  private OwnershipInfo myOwns;
  private Review myReview;
  private Demand mySeeks;
  private Organization mySubOrganization;
  private String myTaxID;
  private String myTelephone;
  private String myVatID;
  private Place myFoundingLocation;
}
