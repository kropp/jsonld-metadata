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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;

public class SchemaOrg {
  /**
   * A type of blood vessel that specifically carries lymph fluid unidirectionally toward the heart.
   */
  public static LymphaticVessel.Builder lymphaticVessel() { return new LymphaticVessel.Builder(); }
  /**
   * The act of notifying someone that a future event/action is going to happen as expected.<p>Related actions:</p><ul><li><a href="http://schema.org/CancelAction">CancelAction</a>: The antonym of ConfirmAction</li></ul>.
   */
  public static ConfirmAction.Builder confirmAction() { return new ConfirmAction.Builder(); }
  /**
   * An list item, e.g. a step in a checklist or how-to description.
   */
  public static ListItem.Builder listItem() { return new ListItem.Builder(); }
  /**
   * CreativeWorkSeries dedicated to TV broadcast and associated online delivery.
   */
  public static TVSeries.Builder tVSeries() { return new TVSeries.Builder(); }
  /**
   * A work of art that is primarily visual in character.
   */
  public static VisualArtwork.Builder visualArtwork() { return new VisualArtwork.Builder(); }
  /**
   * A value indicating which roadwheels will receive torque.
   */
  public static DriveWheelConfigurationValue.Builder driveWheelConfigurationValue() { return new DriveWheelConfigurationValue.Builder(); }
  /**
   * A service provided by an organization, e.g. delivery service, print services, etc.
   */
  public static Service.Builder service() { return new Service.Builder(); }
  /**
   * An intangible item that describes an alignment between a learning resource and a node in an educational framework.
   */
  public static AlignmentObject.Builder alignmentObject() { return new AlignmentObject.Builder(); }
  /**
   * Animal shelter.
   */
  public static AnimalShelter.Builder animalShelter() { return new AnimalShelter.Builder(); }
  /**
   * A fast-food restaurant.
   */
  public static FastFoodRestaurant.Builder fastFoodRestaurant() { return new FastFoodRestaurant.Builder(); }
  /**
   * An amusement park.
   */
  public static AmusementPark.Builder amusementPark() { return new AmusementPark.Builder(); }
  /**
   * The act of editing by adding an object to a collection.
   */
  public static AddAction.Builder addAction() { return new AddAction.Builder(); }
  /**
   * A set of characteristics belonging to people, e.g. who compose an item's target audience.
   */
  public static PeopleAudience.Builder peopleAudience() { return new PeopleAudience.Builder(); }
  /**
   * A bar or pub.
   */
  public static BarOrPub.Builder barOrPub() { return new BarOrPub.Builder(); }
  /**
   * Season dedicated to TV broadcast and associated online delivery.
   */
  public static TVSeason.Builder tVSeason() { return new TVSeason.Builder(); }
  /**
   * A complex mathematical calculation requiring an online calculator, used to assess prognosis. Note: use the url property of Thing to record any URLs for online calculators.
   */
  public static MedicalRiskCalculator.Builder medicalRiskCalculator() { return new MedicalRiskCalculator.Builder(); }
  /**
   * The act of generating a comment about a subject.
   */
  public static CommentAction.Builder commentAction() { return new CommentAction.Builder(); }
  /**
   * The act of deliberately creating/producing/generating/building a result out of the agent.
   */
  public static CreateAction.Builder createAction() { return new CreateAction.Builder(); }
  /**
   * A permit issued by an organization, e.g. a parking pass.
   */
  public static Permit.Builder permit() { return new Permit.Builder(); }
  /**
   * The act of rejecting to/adopting an object.<p>Related actions:</p><ul><li><a href="http://schema.org/AcceptAction">AcceptAction</a>: The antonym of RejectAction</li></ul>.
   */
  public static RejectAction.Builder rejectAction() { return new RejectAction.Builder(); }
  /**
   * The act of inserting at the end if an ordered collection.
   */
  public static AppendAction.Builder appendAction() { return new AppendAction.Builder(); }
  /**
   * Quantity: Duration (use  <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 duration format</a>).
   */
  public static Duration.Builder duration() { return new Duration.Builder(); }
  /**
   * An Insurance agency.
   */
  public static InsuranceAgency.Builder insuranceAgency() { return new InsuranceAgency.Builder(); }
  /**
   * The act of reaching a draw in a competitive activity.
   */
  public static TieAction.Builder tieAction() { return new TieAction.Builder(); }
  /**
   * The geographic coordinates of a place or event.
   */
  public static GeoCoordinates.Builder geoCoordinates() { return new GeoCoordinates.Builder(); }
  /**
   * The anatomical location at which two or more bones make contact.
   */
  public static Joint.Builder joint() { return new Joint.Builder(); }
  /**
   * A garden store.
   */
  public static GardenStore.Builder gardenStore() { return new GardenStore.Builder(); }
  /**
   * Event type: Children's event.
   */
  public static ChildrensEvent.Builder childrensEvent() { return new ChildrensEvent.Builder(); }
  /**
   * Any medical test, typically performed for diagnostic purposes.
   */
  public static MedicalTest.Builder medicalTest() { return new MedicalTest.Builder(); }
  /**
   * A predefined value for a product characteristic, e.g. the power cord plug type "US" or the garment sizes "S", "M", "L", and "XL".
   */
  public static QualitativeValue.Builder qualitativeValue() { return new QualitativeValue.Builder(); }
  /**
   * A tourist attraction.
   */
  public static TouristAttraction.Builder touristAttraction() { return new TouristAttraction.Builder(); }
  /**
   * An agent bookmarks/flags/labels/tags/marks an object.
   */
  public static BookmarkAction.Builder bookmarkAction() { return new BookmarkAction.Builder(); }
  /**
   * Categories that represent an assessment of the risk of fetal injury due to a drug or pharmaceutical used as directed by the mother during pregnancy.
   */
  public static DrugPregnancyCategory.Builder drugPregnancyCategory() { return new DrugPregnancyCategory.Builder(); }
  /**
   * A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
   */
  public static BroadcastChannel.Builder broadcastChannel() { return new BroadcastChannel.Builder(); }
  /**
   * The act of un-registering from a service.<p>Related actions:</p><ul><li><a href="http://schema.org/RegisterAction">RegisterAction</a>: antonym of UnRegisterAction.</li><li><a href="http://schema.org/Leave">Leave</a>: Unlike LeaveAction, UnRegisterAction implies that you are unregistering from a service you werer previously registered, rather than leaving a team/group of people</li></ul>.
   */
  public static UnRegisterAction.Builder unRegisterAction() { return new UnRegisterAction.Builder(); }
  /**
   * One of the continents (for example, Europe or Africa).
   */
  public static Continent.Builder continent() { return new Continent.Builder(); }
  /**
   * The act of editing a recipient by removing one of its objects.
   */
  public static DeleteAction.Builder deleteAction() { return new DeleteAction.Builder(); }
  /**
   * A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.
   */
  public static WebPage.Builder webPage() { return new WebPage.Builder(); }
  /**
   * A bus station.
   */
  public static BusStation.Builder busStation() { return new BusStation.Builder(); }
  /**
   * A taxi.
   */
  public static Taxi.Builder taxi() { return new Taxi.Builder(); }
  /**
   * The publication format of the book.
   */
  public static BookFormatType.Builder bookFormatType() { return new BookFormatType.Builder(); }
  /**
   * The act of resuming a device or application which was formerly paused (e.g. resume music playback or resume a timer).
   */
  public static ResumeAction.Builder resumeAction() { return new ResumeAction.Builder(); }
  /**
   * An anatomical system is a group of anatomical structures that work together to perform a certain task. Anatomical systems, such as organ systems, are one organizing principle of anatomy, and can includes circulatory, digestive, endocrine, integumentary, immune, lymphatic, muscular, nervous, reproductive, respiratory, skeletal, urinary, vestibular, and other systems.
   */
  public static AnatomicalSystem.Builder anatomicalSystem() { return new AnatomicalSystem.Builder(); }
  /**
   * The act of swallowing solid objects.
   */
  public static EatAction.Builder eatAction() { return new EatAction.Builder(); }
  /**
   * The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.
   */
  public static CommunicateAction.Builder communicateAction() { return new CommunicateAction.Builder(); }
  /**
   * A publication in any medium issued in successive parts bearing numerical or chronological designations and intended, such as a magazine, scholarly journal, or newspaper to continue indefinitely.

      <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
   */
  public static Periodical.Builder periodical() { return new Periodical.Builder(); }
  /**
   * An airport.
   */
  public static Airport.Builder airport() { return new Airport.Builder(); }
  /**
   * A grocery store.
   */
  public static GroceryStore.Builder groceryStore() { return new GroceryStore.Builder(); }
  /**
   * An agent approves/certifies/likes/supports/sanction an object.
   */
  public static EndorseAction.Builder endorseAction() { return new EndorseAction.Builder(); }
  /**
   * The mailing address.
   */
  public static PostalAddress.Builder postalAddress() { return new PostalAddress.Builder(); }
  /**
   * A travel agency.
   */
  public static TravelAgency.Builder travelAgency() { return new TravelAgency.Builder(); }
  /**
   * Web page type: Profile page.
   */
  public static ProfilePage.Builder profilePage() { return new ProfilePage.Builder(); }
  /**
   * A roofing contractor.
   */
  public static RoofingContractor.Builder roofingContractor() { return new RoofingContractor.Builder(); }
  /**
   * A parking lot or other parking facility.
   */
  public static ParkingFacility.Builder parkingFacility() { return new ParkingFacility.Builder(); }
  /**
   * A casino.
   */
  public static Casino.Builder casino() { return new Casino.Builder(); }
  /**
   * An image file.
   */
  public static ImageObject.Builder imageObject() { return new ImageObject.Builder(); }
  /**
   * A reservation for bus travel.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
   */
  public static BusReservation.Builder busReservation() { return new BusReservation.Builder(); }
  /**
   * A pond.
   */
  public static Pond.Builder pond() { return new Pond.Builder(); }
  /**
   * A sea (for example, the Caspian sea).
   */
  public static SeaBodyOfWater.Builder seaBodyOfWater() { return new SeaBodyOfWater.Builder(); }
  /**
   * A reservation for air travel.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
   */
  public static FlightReservation.Builder flightReservation() { return new FlightReservation.Builder(); }
  /**
   * A clothing store.
   */
  public static ClothingStore.Builder clothingStore() { return new ClothingStore.Builder(); }
  /**
   * A car wash business.
   */
  public static AutoWash.Builder autoWash() { return new AutoWash.Builder(); }
  /**
   * A computer store.
   */
  public static ComputerStore.Builder computerStore() { return new ComputerStore.Builder(); }
  /**
   * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
   */
  public static Code.Builder code() { return new Code.Builder(); }
  /**
   * A mountain, like Mount Whitney or Mount Everest.
   */
  public static Mountain.Builder mountain() { return new Mountain.Builder(); }
  /**
   * A music recording (track), usually a single song.
   */
  public static MusicRecording.Builder musicRecording() { return new MusicRecording.Builder(); }
  /**
   * The act of adding at a specific location in an ordered collection.
   */
  public static InsertAction.Builder insertAction() { return new InsertAction.Builder(); }
  /**
   * The act of gaining ownership of an object from an origin. Reciprocal of GiveAction.<p>Related actions:</p><ul><li><a href="http://schema.org/GiveAction">GiveAction</a>: The reciprocal of TakeAction.</li><li><a href="http://schema.org/ReceiveAction">ReceiveAction</a>: Unlike ReceiveAction, TakeAction implies that ownership has been transfered</li></ul>.
   */
  public static TakeAction.Builder takeAction() { return new TakeAction.Builder(); }
  /**
   * A music video file.
   */
  public static MusicVideoObject.Builder musicVideoObject() { return new MusicVideoObject.Builder(); }
  /**
   * A reservation for train travel.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
   */
  public static TrainReservation.Builder trainReservation() { return new TrainReservation.Builder(); }
  /**
   * The act of consuming dynamic/moving visual content.
   */
  public static WatchAction.Builder watchAction() { return new WatchAction.Builder(); }
  /**
   * A post office.
   */
  public static PostOffice.Builder postOffice() { return new PostOffice.Builder(); }
  /**
   * A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.

      <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
   */
  public static PublicationIssue.Builder publicationIssue() { return new PublicationIssue.Builder(); }
  /**
   * Natural languages such as Spanish, Tamil, Hindi, English, etc. and programming languages such as Scheme and Lisp.
   */
  public static Language.Builder language() { return new Language.Builder(); }
  /**
   * A country.
   */
  public static Country.Builder country() { return new Country.Builder(); }
  /**
   * A specific dosing schedule for a drug or supplement.
   */
  public static DoseSchedule.Builder doseSchedule() { return new DoseSchedule.Builder(); }
  /**
   * A geographical region under the jurisdiction of a particular government.
   */
  public static AdministrativeArea.Builder administrativeArea() { return new AdministrativeArea.Builder(); }
  /**
   * The act of taking money from a buyer in exchange for goods or services rendered. An agent sells an object, product, or service to a buyer for a price. Reciprocal of BuyAction.
   */
  public static SellAction.Builder sellAction() { return new SellAction.Builder(); }
  /**
   * An indication for preventing an underlying condition, symptom, etc.
   */
  public static PreventionIndication.Builder preventionIndication() { return new PreventionIndication.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserDownloads.Builder userDownloads() { return new UserDownloads.Builder(); }
  /**
   * 
      A BreadcrumbList is an ItemList consisting of a chain of linked Web pages, typically described using at least their URL and their name, and typically ending with the current page.
      <br />
      <br />
      The 'position' property is used to reconstruct the order of the items in a BreadcrumbList.
      The convention is that a breadcrumb list has an itemListOrder of ItemListOrderAscending (lower values listed first), and that the
      first items in this list correspond to the "top" or beginning of the breadcrumb trail, e.g. with a site or section homepage.
      The specific values of 'position' are not assigned meaning for a BreadcrumbList, but they should be integers, e.g. beginning
      with '1' for the first item in the list.
      
   */
  public static BreadcrumbList.Builder breadcrumbList() { return new BreadcrumbList.Builder(); }
  /**
   * A collection of datasets.
   */
  public static DataCatalog.Builder dataCatalog() { return new DataCatalog.Builder(); }
  /**
   * An agent orders an object/product/service to be delivered/sent.
   */
  public static OrderAction.Builder orderAction() { return new OrderAction.Builder(); }
  /**
   * A reservation for an event like a concert, sporting event, or lecture.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
   */
  public static EventReservation.Builder eventReservation() { return new EventReservation.Builder(); }
  /**
   * A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.
   */
  public static MusicGroup.Builder musicGroup() { return new MusicGroup.Builder(); }
  /**
   * A reservation for lodging at a hotel, motel, inn, etc.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  public static LodgingReservation.Builder lodgingReservation() { return new LodgingReservation.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserComments.Builder userComments() { return new UserComments.Builder(); }
  /**
   * The price asked for a given offer by the respective organization or person.
   */
  public static UnitPriceSpecification.Builder unitPriceSpecification() { return new UnitPriceSpecification.Builder(); }
  /**
   * A value indicating a steering position.
   */
  public static SteeringPositionValue.Builder steeringPositionValue() { return new SteeringPositionValue.Builder(); }
  /**
   * The act of committing to/adopting an object.<p>Related actions:</p><ul><li><a href="http://schema.org/RejectAction">RejectAction</a>: The antonym of AcceptAction</li></ul>.
   */
  public static AcceptAction.Builder acceptAction() { return new AcceptAction.Builder(); }
  /**
   * A museum.
   */
  public static Museum.Builder museum() { return new Museum.Builder(); }
  /**
   * Event type: Social event.
   */
  public static SocialEvent.Builder socialEvent() { return new SocialEvent.Builder(); }
  /**
   * Event type: Literary event.
   */
  public static LiteraryEvent.Builder literaryEvent() { return new LiteraryEvent.Builder(); }
  /**
   * A home goods store.
   */
  public static HomeGoodsStore.Builder homeGoodsStore() { return new HomeGoodsStore.Builder(); }
  /**
   * The act of organizing tasks/objects/events by associating resources to it.
   */
  public static AllocateAction.Builder allocateAction() { return new AllocateAction.Builder(); }
  /**
   * A sidebar section of the page.
   */
  public static WPSideBar.Builder wPSideBar() { return new WPSideBar.Builder(); }
  /**
   * A school.
   */
  public static School.Builder school() { return new School.Builder(); }
  /**
   * 
          A CreativeWorkSeries in schema.org is a group of related items, typically but not necessarily of the same kind.
          CreativeWorkSeries are usually organized into some order, often chronological. Unlike <a href="/ItemList">ItemList</a> which
          is a general purpose data structure for lists of things, the emphasis with
          CreativeWorkSeries is on published materials (written e.g. books and periodicals,
          or media such as tv, radio and games).

          <br/><br/>

          Specific subtypes are available for describing <a href="/TVSeries">TVSeries</a>, <a href="/RadioSeries">RadioSeries</a>,
          <a href="/MovieSeries">MovieSeries</a>,
          <a href="/BookSeries">BookSeries</a>,
          <a href="/Periodical">Periodical</a>
          and <a href="/VideoGameSeries">VideoGameSeries</a>. In each case,
          the <a href="/hasPart">hasPart</a> / <a href="/isPartOf">isPartOf</a> properties
          can be used to relate the CreativeWorkSeries to its parts. The general CreativeWorkSeries type serves largely
          just to organize these more specific and practical subtypes.

          <br/><br/>

          It is common for properties applicable to an item from the series to be usefully applied to the containing group.
          Schema.org attempts to anticipate some of these cases, but publishers should be free to apply
          properties of the series parts to the series as a whole wherever they seem appropriate.
   */
  public static CreativeWorkSeries.Builder creativeWorkSeries() { return new CreativeWorkSeries.Builder(); }
  /**
   * The day of the week, e.g. used to specify to which day the opening hours of an OpeningHoursSpecification refer.
<br />
    Commonly used values:<br />
<br />
    http://purl.org/goodrelations/v1#Monday <br />
    http://purl.org/goodrelations/v1#Tuesday <br />
    http://purl.org/goodrelations/v1#Wednesday <br />
    http://purl.org/goodrelations/v1#Thursday <br />
    http://purl.org/goodrelations/v1#Friday <br />
    http://purl.org/goodrelations/v1#Saturday <br />
    http://purl.org/goodrelations/v1#Sunday <br />
    http://purl.org/goodrelations/v1#PublicHolidays <br />
        
   */
  public static DayOfWeek.Builder dayOfWeek() { return new DayOfWeek.Builder(); }
  /**
   * An indication for treating an underlying condition, symptom, etc.
   */
  public static TreatmentIndication.Builder treatmentIndication() { return new TreatmentIndication.Builder(); }
  /**
   * A trip on a commercial train line.
   */
  public static TrainTrip.Builder trainTrip() { return new TrainTrip.Builder(); }
  /**
   * A hardware store.
   */
  public static HardwareStore.Builder hardwareStore() { return new HardwareStore.Builder(); }
  /**
   * A screening of a movie or other video.
   */
  public static ScreeningEvent.Builder screeningEvent() { return new ScreeningEvent.Builder(); }
  /**
   * A MusicRelease is a specific release of a music album.
   */
  public static MusicRelease.Builder musicRelease() { return new MusicRelease.Builder(); }
  /**
   * An electrician.
   */
  public static Electrician.Builder electrician() { return new Electrician.Builder(); }
  /**
   * Beach.
   */
  public static Beach.Builder beach() { return new Beach.Builder(); }
  /**
   * Web applications.
   */
  public static WebApplication.Builder webApplication() { return new WebApplication.Builder(); }
  /**
   * A Property value specification.
   */
  public static PropertyValueSpecification.Builder propertyValueSpecification() { return new PropertyValueSpecification.Builder(); }
  /**
   * ATM/cash machine.
   */
  public static AutomatedTeller.Builder automatedTeller() { return new AutomatedTeller.Builder(); }
  /**
   * A trip on a commercial bus line.
   */
  public static BusTrip.Builder busTrip() { return new BusTrip.Builder(); }
  /**
   * A structured value representing a monetary amount. Typically, only the subclasses of this type are used for markup.
   */
  public static PriceSpecification.Builder priceSpecification() { return new PriceSpecification.Builder(); }
  /**
   * The act of expressing a negative sentiment about the object. An agent dislikes an object (a proposition, topic or theme) with participants.
   */
  public static DislikeAction.Builder dislikeAction() { return new DislikeAction.Builder(); }
  /**
   * An ocean (for example, the Pacific).
   */
  public static OceanBodyOfWater.Builder oceanBodyOfWater() { return new OceanBodyOfWater.Builder(); }
  /**
   * Residence type: Apartment complex.
   */
  public static ApartmentComplex.Builder apartmentComplex() { return new ApartmentComplex.Builder(); }
  /**
   * A medical trial is a type of medical study that uses scientific process used to compare the safety and efficacy of medical therapies or medical procedures. In general, medical trials are controlled and subjects are allocated at random to the different treatment and/or control groups.
   */
  public static MedicalTrial.Builder medicalTrial() { return new MedicalTrial.Builder(); }
  /**
   * A tattoo parlor.
   */
  public static TattooParlor.Builder tattooParlor() { return new TattooParlor.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserBlocks.Builder userBlocks() { return new UserBlocks.Builder(); }
  /**
   * A QAPage is a WebPage focussed on a specific Question and its Answer(s), e.g. in a question answering site or documenting Frequently Asked Questions (FAQs).
   */
  public static QAPage.Builder qAPage() { return new QAPage.Builder(); }
  /**
   * A store that sells materials useful or necessary for various hobbies.
   */
  public static HobbyShop.Builder hobbyShop() { return new HobbyShop.Builder(); }
  /**
   * The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
   */
  public static GeoShape.Builder geoShape() { return new GeoShape.Builder(); }
  /**
   * The act of capturing sound and moving images on film, video, or digitally.
   */
  public static FilmAction.Builder filmAction() { return new FilmAction.Builder(); }
  /**
   * A medical procedure intended primarily for therapeutic purposes, aimed at improving a health condition.
   */
  public static TherapeuticProcedure.Builder therapeuticProcedure() { return new TherapeuticProcedure.Builder(); }
  /**
   * A fire station. With firemen.
   */
  public static FireStation.Builder fireStation() { return new FireStation.Builder(); }
  /**
   * A television station.
   */
  public static TelevisionStation.Builder televisionStation() { return new TelevisionStation.Builder(); }
  /**
   * The causative agent(s) that are responsible for the pathophysiologic process that eventually results in a medical condition, symptom or sign. In this schema, unless otherwise specified this is meant to be the proximate cause of the medical condition, symptom or sign. The proximate cause is defined as the causative agent that most directly results in the medical condition, symptom or sign. For example, the HIV virus could be considered a cause of AIDS. Or in a diagnostic context, if a patient fell and sustained a hip fracture and two days later sustained a pulmonary embolism which eventuated in a cardiac arrest, the cause of the cardiac arrest (the proximate cause) would be the pulmonary embolism and not the fall. <p>Medical causes can include cardiovascular, chemical, dermatologic, endocrine, environmental, gastroenterologic, genetic, hematologic, gynecologic, iatrogenic, infectious, musculoskeletal, neurologic, nutritional, obstetric, oncologic, otolaryngologic, pharmacologic, psychiatric, pulmonary, renal, rheumatologic, toxic, traumatic, or urologic causes; medical conditions can be causes as well.
   */
  public static MedicalCause.Builder medicalCause() { return new MedicalCause.Builder(); }
  /**
   * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the 'offers' property. Repeated events may be structured as separate Event objects.
   */
  public static Event.Builder event() { return new Event.Builder(); }
  /**
   * A payment method is a standardized procedure for transferring the monetary amount for a purchase. Payment methods are characterized by the legal and technical structures used, and by the organization or group carrying out the transaction.
<br />
    Commonly used values:<br />
<br />
    http://purl.org/goodrelations/v1#ByBankTransferInAdvance <br />
    http://purl.org/goodrelations/v1#ByInvoice <br />
    http://purl.org/goodrelations/v1#Cash <br />
    http://purl.org/goodrelations/v1#CheckInAdvance <br />
    http://purl.org/goodrelations/v1#COD <br />
    http://purl.org/goodrelations/v1#DirectDebit <br />
    http://purl.org/goodrelations/v1#GoogleCheckout <br />
    http://purl.org/goodrelations/v1#PayPal <br />
    http://purl.org/goodrelations/v1#PaySwarm <br />
        
   */
  public static PaymentMethod.Builder paymentMethod() { return new PaymentMethod.Builder(); }
  /**
   * An elementary school.
   */
  public static ElementarySchool.Builder elementarySchool() { return new ElementarySchool.Builder(); }
  /**
   * EventStatusType is an enumeration type whose instances represent several states that an Event may be in.
   */
  public static EventStatusType.Builder eventStatusType() { return new EventStatusType.Builder(); }
  /**
   * Web page type: Image gallery page.
   */
  public static ImageGallery.Builder imageGallery() { return new ImageGallery.Builder(); }
  /**
   * The act of granting permission to an object.
   */
  public static AuthorizeAction.Builder authorizeAction() { return new AuthorizeAction.Builder(); }
  /**
   * The footer section of the page.
   */
  public static WPFooter.Builder wPFooter() { return new WPFooter.Builder(); }
  /**
   * An outlet store.
   */
  public static OutletStore.Builder outletStore() { return new OutletStore.Builder(); }
  /**
   * A bike store.
   */
  public static BikeStore.Builder bikeStore() { return new BikeStore.Builder(); }
  /**
   * A type of blood vessel that specifically carries blood away from the heart.
   */
  public static Artery.Builder artery() { return new Artery.Builder(); }
  /**
   * A notary.
   */
  public static Notary.Builder notary() { return new Notary.Builder(); }
  /**
   * Properties that take Mass as values are of the form '&lt;Number&gt; &lt;Mass unit of measure&gt;'. E.g., '7 kg'.
   */
  public static Mass.Builder mass() { return new Mass.Builder(); }
  /**
   * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.
   */
  public static Demand.Builder demand() { return new Demand.Builder(); }
  /**
   * A reservation to dine at a food-related business.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  public static FoodEstablishmentReservation.Builder foodEstablishmentReservation() { return new FoodEstablishmentReservation.Builder(); }
  /**
   * The business function specifies the type of activity or access (i.e., the bundle of rights) offered by the organization or business person through the offer. Typical are sell, rental or lease, maintenance or repair, manufacture / produce, recycle / dispose, engineering / construction, or installation. Proprietary specifications of access rights are also instances of this class.
<br />
    Commonly used values:<br />
<br />
    http://purl.org/goodrelations/v1#ConstructionInstallation <br />
    http://purl.org/goodrelations/v1#Dispose <br />
    http://purl.org/goodrelations/v1#LeaseOut <br />
    http://purl.org/goodrelations/v1#Maintain <br />
    http://purl.org/goodrelations/v1#ProvideService <br />
    http://purl.org/goodrelations/v1#Repair <br />
    http://purl.org/goodrelations/v1#Sell <br />
    http://purl.org/goodrelations/v1#Buy <br />
        
   */
  public static BusinessFunction.Builder businessFunction() { return new BusinessFunction.Builder(); }
  /**
   * A dance group&#x2014;for example, the Alvin Ailey Dance Theater or Riverdance.
   */
  public static DanceGroup.Builder danceGroup() { return new DanceGroup.Builder(); }
  /**
   * An alternative, closely-related condition typically considered later in the differential diagnosis process along with the signs that are used to distinguish it.
   */
  public static DDxElement.Builder dDxElement() { return new DDxElement.Builder(); }
  /**
   * Web page type: Collection page.
   */
  public static CollectionPage.Builder collectionPage() { return new CollectionPage.Builder(); }
  /**
   * A mosque.
   */
  public static Mosque.Builder mosque() { return new Mosque.Builder(); }
  /**
   * A utility class that serves as the umbrella for a number of 'intangible' things such as quantities, structured values, etc.
   */
  public static Intangible.Builder intangible() { return new Intangible.Builder(); }
  /**
   * A media episode (e.g. TV, radio, video game) which can be part of a series or season.
   */
  public static Episode.Builder episode() { return new Episode.Builder(); }
  /**
   * A statement of the money due for goods or services; a bill.
   */
  public static Invoice.Builder invoice() { return new Invoice.Builder(); }
  /**
   * Project
   */
  public static Project.Builder project() { return new Project.Builder(); }
  /**
   * A recycling center.
   */
  public static RecyclingCenter.Builder recyclingCenter() { return new RecyclingCenter.Builder(); }
  /**
   * The maximum dosing schedule considered safe for a drug or supplement as recommended by an authority or by the drug/supplement's manufacturer. Capture the recommending authority in the recognizingAuthority property of MedicalEntity.
   */
  public static MaximumDoseSchedule.Builder maximumDoseSchedule() { return new MaximumDoseSchedule.Builder(); }
  /**
   * A software application designed specifically to work well on a mobile device such as a telephone.
   */
  public static MobileApplication.Builder mobileApplication() { return new MobileApplication.Builder(); }
  /**
   * A software application.
   */
  public static SoftwareApplication.Builder softwareApplication() { return new SoftwareApplication.Builder(); }
  /**
   * An agent controls a device or application.
   */
  public static ControlAction.Builder controlAction() { return new ControlAction.Builder(); }
  /**
   * A unique instance of a radio BroadcastService on a CableOrSatelliteService lineup.
   */
  public static RadioChannel.Builder radioChannel() { return new RadioChannel.Builder(); }
  /**
   * A service which provides access to media programming like TV or radio. Access may be via cable or satellite.
   */
  public static CableOrSatelliteService.Builder cableOrSatelliteService() { return new CableOrSatelliteService.Builder(); }
  /**
   * A property, used to indicate attributes and relationships of some Thing; equivalent to rdf:Property.
   */
  public static Property.Builder property() { return new Property.Builder(); }
  /**
   * A cafe or coffee shop.
   */
  public static CafeOrCoffeeShop.Builder cafeOrCoffeeShop() { return new CafeOrCoffeeShop.Builder(); }
  /**
   * A library.
   */
  public static Library.Builder library() { return new Library.Builder(); }
  /**
   * Design models for observational medical studies. Enumerated type.
   */
  public static MedicalObservationalStudyDesign.Builder medicalObservationalStudyDesign() { return new MedicalObservationalStudyDesign.Builder(); }
  /**
   * The act of finding an object.<p>Related actions:</p><ul><li><a href="http://schema.org/SearchAction">SearchAction</a>: FindAction is generally lead by a SearchAction, but not necessarily</li></ul>.
   */
  public static FindAction.Builder findAction() { return new FindAction.Builder(); }
  /**
   * The act of inserting at the beginning if an ordered collection.
   */
  public static PrependAction.Builder prependAction() { return new PrependAction.Builder(); }
  /**
   * A medical test performed on a sample of a patient's blood.
   */
  public static BloodTest.Builder bloodTest() { return new BloodTest.Builder(); }
  /**
   * The act of expressing a positive sentiment about the object. An agent likes an object (a proposition, topic or theme) with participants.
   */
  public static LikeAction.Builder likeAction() { return new LikeAction.Builder(); }
  /**
   * Beauty salon.
   */
  public static BeautySalon.Builder beautySalon() { return new BeautySalon.Builder(); }
  /**
   * A governmental organization or agency.
   */
  public static GovernmentOrganization.Builder governmentOrganization() { return new GovernmentOrganization.Builder(); }
  /**
   * RsvpResponseType is an enumeration type whose instances represent responding to an RSVP request.
   */
  public static RsvpResponseType.Builder rsvpResponseType() { return new RsvpResponseType.Builder(); }
  /**
   * Any anatomical structure which pertains to the soft nervous tissue functioning as the coordinating center of sensation and intellectual and nervous activity.
   */
  public static BrainStructure.Builder brainStructure() { return new BrainStructure.Builder(); }
  /**
   * A subclass of OrganizationRole used to describe employee relationships.
   */
  public static EmployeeRole.Builder employeeRole() { return new EmployeeRole.Builder(); }
  /**
   * Target audiences for medical web pages. Enumerated type.
   */
  public static MedicalAudience.Builder medicalAudience() { return new MedicalAudience.Builder(); }
  /**
   * A movie rental store.
   */
  public static MovieRentalStore.Builder movieRentalStore() { return new MovieRentalStore.Builder(); }
  /**
   * Server that provides game interaction in a multiplayer game.
   */
  public static GameServer.Builder gameServer() { return new GameServer.Builder(); }
  /**
   * A car is a wheeled, self-powered motor vehicle used for transportation.
   */
  public static Car.Builder car() { return new Car.Builder(); }
  /**
   * A crematorium.
   */
  public static Crematorium.Builder crematorium() { return new Crematorium.Builder(); }
  /**
   * Bank or credit union.
   */
  public static BankOrCreditUnion.Builder bankOrCreditUnion() { return new BankOrCreditUnion.Builder(); }
  /**
   * An agent quotes/estimates/appraises an object/product/service with a price at a location/store.
   */
  public static QuoteAction.Builder quoteAction() { return new QuoteAction.Builder(); }
  /**
   * The act of physically/electronically dispatching an object for transfer from an origin to a destination.<p>Related actions:</p><ul><li><a href="http://schema.org/ReceiveAction">ReceiveAction</a>: The reciprocal of SendAction.</li><li><a href="http://schema.org/GiveAction">GiveAction</a>: Unlike GiveAction, SendAction does not imply the transfer of ownership (e.g. I can send you my laptop, but I'm not necessarily giving it to you)</li></ul>.
   */
  public static SendAction.Builder sendAction() { return new SendAction.Builder(); }
  /**
   * A doctor's office.
   */
  public static Physician.Builder physician() { return new Physician.Builder(); }
  /**
   * A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons.
   */
  public static Nerve.Builder nerve() { return new Nerve.Builder(); }
  /**
   * Professional service: Attorney.
   */
  public static Attorney.Builder attorney() { return new Attorney.Builder(); }
  /**
   * Any medical imaging modality typically used for diagnostic purposes.
   */
  public static ImagingTest.Builder imagingTest() { return new ImagingTest.Builder(); }
  /**
   * A publication event e.g. catch-up TV or radio podcast, during which a program is available on-demand.
   */
  public static OnDemandEvent.Builder onDemandEvent() { return new OnDemandEvent.Builder(); }
  /**
   * The most generic type of entity related to health and the practice of medicine.
   */
  public static MedicalEntity.Builder medicalEntity() { return new MedicalEntity.Builder(); }
  /**
   * A golf course.
   */
  public static GolfCourse.Builder golfCourse() { return new GolfCourse.Builder(); }
  /**
   * The act of giving money in return for temporary use, but not ownership, of an object such as a vehicle or property. For example, an agent rents a property from a landlord in exchange for a periodic payment.
   */
  public static RentAction.Builder rentAction() { return new RentAction.Builder(); }
  /**
   * A patient-reported or observed dosing schedule for a drug or supplement.
   */
  public static ReportedDoseSchedule.Builder reportedDoseSchedule() { return new ReportedDoseSchedule.Builder(); }
  /**
   * Lists or enumerations&#x2014;for example, a list of cuisines or music genres, etc.
   */
  public static Enumeration.Builder enumeration() { return new Enumeration.Builder(); }
  /**
   * A hospital.
   */
  public static Hospital.Builder hospital() { return new Hospital.Builder(); }
  /**
   * The most generic type of item.
   */
  public static Thing.Builder thing() { return new Thing.Builder(); }
  /**
   * A furniture store.
   */
  public static FurnitureStore.Builder furnitureStore() { return new FurnitureStore.Builder(); }
  /**
   * Event type: Visual arts event.
   */
  public static VisualArtsEvent.Builder visualArtsEvent() { return new VisualArtsEvent.Builder(); }
  /**
   * The act of expressing a preference from a set of options or a large or unbounded set of choices/options.
   */
  public static ChooseAction.Builder chooseAction() { return new ChooseAction.Builder(); }
  /**
   * A sporting goods store.
   */
  public static SportingGoodsStore.Builder sportingGoodsStore() { return new SportingGoodsStore.Builder(); }
  /**
   * Any object used in a medical capacity, such as to diagnose or treat a patient.
   */
  public static MedicalDevice.Builder medicalDevice() { return new MedicalDevice.Builder(); }
  /**
   * Organization: Non-governmental Organization.
   */
  public static NGO.Builder nGO() { return new NGO.Builder(); }
  /**
   * A blog post.
   */
  public static BlogPosting.Builder blogPosting() { return new BlogPosting.Builder(); }
  /**
   * A reservoir of water, typically an artificially created lake, like the Lake Kariba reservoir.
   */
  public static Reservoir.Builder reservoir() { return new Reservoir.Builder(); }
  /**
   * Car repair, sales, or parts.
   */
  public static AutomotiveBusiness.Builder automotiveBusiness() { return new AutomotiveBusiness.Builder(); }
  /**
   * A car rental business.
   */
  public static AutoRental.Builder autoRental() { return new AutoRental.Builder(); }
  /**
   * An advertising section of the page.
   */
  public static WPAdBlock.Builder wPAdBlock() { return new WPAdBlock.Builder(); }
  /**
   * The act of manipulating/administering/supervising/controlling one or more objects.
   */
  public static OrganizeAction.Builder organizeAction() { return new OrganizeAction.Builder(); }
  /**
   * Bed and breakfast.
   */
  public static BedAndBreakfast.Builder bedAndBreakfast() { return new BedAndBreakfast.Builder(); }
  /**
   * The act of playing/exercising/training/performing for enjoyment, leisure, recreation, Competition or exercise.<p>Related actions:</p><ul><li><a href="http://schema.org/ListenAction">ListenAction</a>: Unlike ListenAction (which is under ConsumeAction), PlayAction refers to performing for an audience or at an event, rather than consuming music.</li><li><a href="http://schema.org/WatchAction">WatchAction</a>: Unlike WatchAction (which is under ConsumeAction), PlayAction refers to showing/displaying for an audience or at an event, rather than consuming visual content</li></ul>.
   */
  public static PlayAction.Builder playAction() { return new PlayAction.Builder(); }
  /**
   * A process of care involving exercise, changes to diet, fitness routines, and other lifestyle changes aimed at improving a health condition.
   */
  public static LifestyleModification.Builder lifestyleModification() { return new LifestyleModification.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserPageVisits.Builder userPageVisits() { return new UserPageVisits.Builder(); }
  /**
   * An adult entertainment establishment.
   */
  public static AdultEntertainment.Builder adultEntertainment() { return new AdultEntertainment.Builder(); }
  /**
   * The act of producing/preparing food.
   */
  public static CookAction.Builder cookAction() { return new CookAction.Builder(); }
  /**
   * Aquarium.
   */
  public static Aquarium.Builder aquarium() { return new Aquarium.Builder(); }
  /**
   * A hotel.
   */
  public static Hotel.Builder hotel() { return new Hotel.Builder(); }
  /**
   * An emergency service, such as a fire station or ER.
   */
  public static EmergencyService.Builder emergencyService() { return new EmergencyService.Builder(); }
  /**
   * A map.
   */
  public static Map.Builder map() { return new Map.Builder(); }
  /**
   * Enumerated status values for Order.
   */
  public static OrderStatus.Builder orderStatus() { return new OrderStatus.Builder(); }
  /**
   * A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.
   */
  public static TypeAndQuantityNode.Builder typeAndQuantityNode() { return new TypeAndQuantityNode.Builder(); }
  /**
   * A value indicating a special usage of a car, e.g. commercial rental, driving school, or as a taxi.
   */
  public static CarUsageType.Builder carUsageType() { return new CarUsageType.Builder(); }
  /**
   * Web page type: Video gallery page.
   */
  public static VideoGallery.Builder videoGallery() { return new VideoGallery.Builder(); }
  /**
   * A photograph.
   */
  public static Photograph.Builder photograph() { return new Photograph.Builder(); }
  /**
   * A body of structured information describing some topic(s) of interest.
   */
  public static Dataset.Builder dataset() { return new Dataset.Builder(); }
  /**
   * Auto body shop.
   */
  public static AutoBodyShop.Builder autoBodyShop() { return new AutoBodyShop.Builder(); }
  /**
   * An auto parts store.
   */
  public static AutoPartsStore.Builder autoPartsStore() { return new AutoPartsStore.Builder(); }
  /**
   * Health and beauty.
   */
  public static HealthAndBeautyBusiness.Builder healthAndBeautyBusiness() { return new HealthAndBeautyBusiness.Builder(); }
  /**
   * The act of capturing still images of objects using a camera.
   */
  public static PhotographAction.Builder photographAction() { return new PhotographAction.Builder(); }
  /**
   * Web page type: Checkout page.
   */
  public static CheckoutPage.Builder checkoutPage() { return new CheckoutPage.Builder(); }
  /**
   * The status of a medical study. Enumerated type.
   */
  public static MedicalStudyStatus.Builder medicalStudyStatus() { return new MedicalStudyStatus.Builder(); }
  /**
   * A zoo.
   */
  public static Zoo.Builder zoo() { return new Zoo.Builder(); }
  /**
   * Place of worship, such as a church, synagogue, or mosque.
   */
  public static PlaceOfWorship.Builder placeOfWorship() { return new PlaceOfWorship.Builder(); }
  /**
   * An enumeration of several kinds of Map.
   */
  public static MapCategoryType.Builder mapCategoryType() { return new MapCategoryType.Builder(); }
  /**
   * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates polled from.<p>Related actions:</p><ul><li><a href="http://schema.org/BefriendAction">BefriendAction</a>: Unlike BefriendAction, FollowAction implies that the connection is *not* necessarily reciprocal.</li><li><a href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, FollowAction implies that the follower acts as an active agent constantly/actively polling for updates.</li><li><a href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, FollowAction implies that the agent is interested in continuing receiving updates from the object.</li><li><a href="http://schema.org/JoinAction">JoinAction</a>: Unlike JoinAction, FollowAction implies that the agent is interested in getting updates from the object.</li><li><a href="http://schema.org/TrackAction">TrackAction</a>: Unlike TrackAction, FollowAction refers to the polling of updates of all aspects of animate objects rather than the location of inanimate objects (e.g. you track a package, but you don't follow it)</li></ul>.
   */
  public static FollowAction.Builder followAction() { return new FollowAction.Builder(); }
  /**
   * The act of notifying someone of information pertinent to them, with no expectation of a response.
   */
  public static InformAction.Builder informAction() { return new InformAction.Builder(); }
  /**
   * The place where a person lives.
   */
  public static Residence.Builder residence() { return new Residence.Builder(); }
  /**
   * Event type: Music event.
   */
  public static MusicEvent.Builder musicEvent() { return new MusicEvent.Builder(); }
  /**
   * The act of ingesting information/resources/food.
   */
  public static ConsumeAction.Builder consumeAction() { return new ConsumeAction.Builder(); }
  /**
   * An audio file.
   */
  public static AudioObject.Builder audioObject() { return new AudioObject.Builder(); }
  /**
   * A service for a vehicle for hire with a driver for local travel. Fares are usually calculated based on distance traveled.
   */
  public static TaxiService.Builder taxiService() { return new TaxiService.Builder(); }
  /**
   * The act of expressing a desire about the object. An agent wants an object.
   */
  public static WantAction.Builder wantAction() { return new WantAction.Builder(); }
  /**
   * A state or province of a country.
   */
  public static State.Builder state() { return new State.Builder(); }
  /**
   * A structured value providing information about when a certain organization or person owned a certain product.
   */
  public static OwnershipInfo.Builder ownershipInfo() { return new OwnershipInfo.Builder(); }
  /**
   * Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.
   */
  public static AnatomicalStructure.Builder anatomicalStructure() { return new AnatomicalStructure.Builder(); }
  /**
   * The act of providing an object under an agreement that it will be returned at a later date. Reciprocal of BorrowAction.<p>Related actions:</p><ul><li><a href="http://schema.org/BorrowAction">BorrowAction</a>: Reciprocal of LendAction</li></ul>.
   */
  public static LendAction.Builder lendAction() { return new LendAction.Builder(); }
  /**
   * An organization that provides flights for passengers.
   */
  public static Airline.Builder airline() { return new Airline.Builder(); }
  /**
   * A news article.
   */
  public static NewsArticle.Builder newsArticle() { return new NewsArticle.Builder(); }
  /**
   * A middle school (typically for children aged around 11-14, although this varies somewhat).
   */
  public static MiddleSchool.Builder middleSchool() { return new MiddleSchool.Builder(); }
  /**
   * The kind of release which this album is: single, EP or album.
   */
  public static MusicAlbumReleaseType.Builder musicAlbumReleaseType() { return new MusicAlbumReleaseType.Builder(); }
  /**
   * A TV episode which can be part of a series or season.
   */
  public static TVEpisode.Builder tVEpisode() { return new TVEpisode.Builder(); }
  /**
   * A stadium.
   */
  public static StadiumOrArena.Builder stadiumOrArena() { return new StadiumOrArena.Builder(); }
  /**
   * A guideline contraindication that designates a process as harmful and where quality of the data supporting the contraindication is sound.
   */
  public static MedicalGuidelineContraindication.Builder medicalGuidelineContraindication() { return new MedicalGuidelineContraindication.Builder(); }
  /**
   * A utility class that serves as the umbrella for a number of 'intangible' things in the medical space.
   */
  public static MedicalIntangible.Builder medicalIntangible() { return new MedicalIntangible.Builder(); }
  /**
   * Any branch of a field in which people typically develop specific expertise, usually after significant study, time, and effort.
   */
  public static Specialty.Builder specialty() { return new Specialty.Builder(); }
  /**
   * A component of the human body circulatory system comprised of an intricate network of hollow tubes that transport blood throughout the entire body.
   */
  public static Vessel.Builder vessel() { return new Vessel.Builder(); }
  /**
   * Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations.
   */
  public static SportsOrganization.Builder sportsOrganization() { return new SportsOrganization.Builder(); }
  /**
   * The act of intentionally disregarding the object. An agent ignores an object.
   */
  public static IgnoreAction.Builder ignoreAction() { return new IgnoreAction.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserCheckins.Builder userCheckins() { return new UserCheckins.Builder(); }
  /**
   * Represents additional information about a relationship or property. For example a Role can be used to say that a 'member' role linking some SportsTeam to a player occurred during a particular time period. Or that a Person's 'actor' role in a Movie was for some particular characterName. Such properties can be attached to a Role entity, which is then associated with the main entities using ordinary properties like 'member' or 'actor'.

      <br/><br/>See also <a href="http://blog.schema.org/2014/06/introducing-role.html">blog post</a>.
   */
  public static Role.Builder role() { return new Role.Builder(); }
  /**
   * Event type: Food event.
   */
  public static FoodEvent.Builder foodEvent() { return new FoodEvent.Builder(); }
  /**
   * The act of traveling from an fromLocation to a destination by a specified mode of transport, optionally with participants.
   */
  public static TravelAction.Builder travelAction() { return new TravelAction.Builder(); }
  /**
   * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates pushed to.<p>Related actions:</p><ul><li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, SubscribeAction implies that the subscriber acts as a passive agent being constantly/actively pushed for updates.</li><li><a href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.</li><li><a href="http://schema.org/JoinAction">JoinAction</a>: Unlike JoinAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object</li></ul>.
   */
  public static SubscribeAction.Builder subscribeAction() { return new SubscribeAction.Builder(); }
  /**
   * A short radio program or a segment/part of a radio program.
   */
  public static RadioClip.Builder radioClip() { return new RadioClip.Builder(); }
  /**
   * A brand is a name used by an organization or business person for labeling a product, product group, or similar.
   */
  public static Brand.Builder brand() { return new Brand.Builder(); }
  /**
   * A list of items of any sort&#x2014;for example, Top 10 Movies About Weathermen, or Top 100 Party Songs. Not to be confused with HTML lists, which are often used only for formatting.
   */
  public static ItemList.Builder itemList() { return new ItemList.Builder(); }
  /**
   * A ski resort.
   */
  public static SkiResort.Builder skiResort() { return new SkiResort.Builder(); }
  /**
   * A contact point&#x2014;for example, a Customer Complaints department.
   */
  public static ContactPoint.Builder contactPoint() { return new ContactPoint.Builder(); }
  /**
   * The act of providing goods, services, or money without compensation, often for philanthropic reasons.
   */
  public static DonateAction.Builder donateAction() { return new DonateAction.Builder(); }
  /**
   * A single, identifiable product instance (e.g. a laptop with a particular serial number).
   */
  public static IndividualProduct.Builder individualProduct() { return new IndividualProduct.Builder(); }
  /**
   * A store that sells mobile phones and related accessories.
   */
  public static MobilePhoneStore.Builder mobilePhoneStore() { return new MobilePhoneStore.Builder(); }
  /**
   * A government building.
   */
  public static GovernmentBuilding.Builder governmentBuilding() { return new GovernmentBuilding.Builder(); }
  /**
   * The act of dressing oneself in clothing.
   */
  public static WearAction.Builder wearAction() { return new WearAction.Builder(); }
  /**
   * Any bodily activity that enhances or maintains physical fitness and overall health and wellness. Includes activity that is part of daily living and routine, structured exercise, and exercise prescribed as part of a medical treatment or recovery plan.
   */
  public static PhysicalActivity.Builder physicalActivity() { return new PhysicalActivity.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserTweets.Builder userTweets() { return new UserTweets.Builder(); }
  /**
   * An action performed by a direct agent and indirect     participants upon a direct object. Optionally happens at a location     with the help of an inanimate instrument. The execution of the action     may produce a result. Specific action sub-type documentation specifies     the exact expectation of each argument/role.
      <br/><br/>See also <a href="http://blog.schema.org/2014/04/announcing-schemaorg-actions.html">blog post</a>
      and <a href="http://schema.org/docs/actions.html">Actions overview document</a>.
   */
  public static Action.Builder action() { return new Action.Builder(); }
  /**
   * The costs of settling the payment using a particular payment method.
   */
  public static PaymentChargeSpecification.Builder paymentChargeSpecification() { return new PaymentChargeSpecification.Builder(); }
  /**
   * An observational study is a type of medical study that attempts to infer the possible effect of a treatment through observation of a cohort of subjects over a period of time. In an observational study, the assignment of subjects into treatment groups versus control groups is outside the control of the investigator. This is in contrast with controlled studies, such as the randomized controlled trials represented by MedicalTrial, where each subject is randomly assigned to a treatment group or a control group before the start of the treatment.
   */
  public static MedicalObservationalStudy.Builder medicalObservationalStudy() { return new MedicalObservationalStudy.Builder(); }
  /**
   * The act of expressing a difference of opinion with the object. An agent disagrees to/about an object (a proposition, topic or theme) with participants.
   */
  public static DisagreeAction.Builder disagreeAction() { return new DisagreeAction.Builder(); }
  /**
   * The act of an agent communicating (service provider, social media, etc) their arrival by registering/confirming for a previously reserved service (e.g. flight check in) or at a place (e.g. hotel), possibly resulting in a result (boarding pass, etc).<p>Related actions:</p><ul><li><a href="http://schema.org/CheckOutAction">CheckOutAction</a>: The antonym of CheckInAction.</li><li><a href="http://schema.org/ArriveAction">ArriveAction</a>: Unlike ArriveAction, CheckInAction implies that the agent is informing/confirming the start of a previously reserved service.</li><li><a href="http://schema.org/ConfirmAction">ConfirmAction</a>: Unlike ConfirmAction, CheckInAction implies that the agent is informing/confirming the *start* of a previously reserved service rather than its validity/existence</li></ul>.
   */
  public static CheckInAction.Builder checkInAction() { return new CheckInAction.Builder(); }
  /**
   * A navigation element of the page.
   */
  public static SiteNavigationElement.Builder siteNavigationElement() { return new SiteNavigationElement.Builder(); }
  /**
   * The act of being defeated in a competitive activity.
   */
  public static LoseAction.Builder loseAction() { return new LoseAction.Builder(); }
  /**
   * A person (alive, dead, undead, or fictional).
   */
  public static Person.Builder person() { return new Person.Builder(); }
  /**
   * An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.

      <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
   */
  public static Article.Builder article() { return new Article.Builder(); }
  /**
   * A shop that sells alcoholic drinks such as wine, beer, whisky and other spirits.
   */
  public static LiquorStore.Builder liquorStore() { return new LiquorStore.Builder(); }
  /**
   * A code for a medical entity.
   */
  public static MedicalCode.Builder medicalCode() { return new MedicalCode.Builder(); }
  /**
   * A short segment/part of a video game.
   */
  public static VideoGameClip.Builder videoGameClip() { return new VideoGameClip.Builder(); }
  /**
   * A place offering space for "Recreational Vehicles", Caravans, mobile homes and the like.
   */
  public static RVPark.Builder rVPark() { return new RVPark.Builder(); }
  /**
   * An agent joins an event/group with participants/friends at a location.<p>Related actions:</p><ul><li><a href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, JoinAction refers to joining a group/team of people.</li><li><a href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, JoinAction does not imply that you'll be receiving updates.</li><li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, JoinAction does not imply that you'll be polling for updates</li></ul>.
   */
  public static JoinAction.Builder joinAction() { return new JoinAction.Builder(); }
  /**
   * The act of asserting that a future event/action is no longer going to happen.<p>Related actions:</p><ul><li><a href="http://schema.org/ConfirmAction">ConfirmAction</a>: The antonym of CancelAction</li></ul>.
   */
  public static CancelAction.Builder cancelAction() { return new CancelAction.Builder(); }
  /**
   * Web page type: About page.
   */
  public static AboutPage.Builder aboutPage() { return new AboutPage.Builder(); }
  /**
   * A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.
        <br/><br/>
        Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.
    
   */
  public static PropertyValue.Builder propertyValue() { return new PropertyValue.Builder(); }
  /**
   * A painting.
   */
  public static Painting.Builder painting() { return new Painting.Builder(); }
  /**
   * A shopping center or mall.
   */
  public static ShoppingCenter.Builder shoppingCenter() { return new ShoppingCenter.Builder(); }
  /**
   * An ice cream shop.
   */
  public static IceCreamShop.Builder iceCreamShop() { return new IceCreamShop.Builder(); }
  /**
   * A Hindu temple.
   */
  public static HinduTemple.Builder hinduTemple() { return new HinduTemple.Builder(); }
  /**
   * The act of expressing a preference from a fixed/finite/structured set of choices/options.
   */
  public static VoteAction.Builder voteAction() { return new VoteAction.Builder(); }
  /**
   * A self-storage facility.
   */
  public static SelfStorage.Builder selfStorage() { return new SelfStorage.Builder(); }
  /**
   * A listing that describes a job opening in a certain organization.
   */
  public static JobPosting.Builder jobPosting() { return new JobPosting.Builder(); }
  /**
   * A taxi stand.
   */
  public static TaxiStand.Builder taxiStand() { return new TaxiStand.Builder(); }
  /**
   * A medical procedure intended primarily for palliative purposes, aimed at relieving the symptoms of an underlying health condition.
   */
  public static PalliativeProcedure.Builder palliativeProcedure() { return new PalliativeProcedure.Builder(); }
  /**
   * A convenience store.
   */
  public static ConvenienceStore.Builder convenienceStore() { return new ConvenienceStore.Builder(); }
  /**
   * A waterfall, like Niagara.
   */
  public static Waterfall.Builder waterfall() { return new Waterfall.Builder(); }
  /**
   * A theater group or company, for example, the Royal Shakespeare Company or Druid Theatre.
   */
  public static TheaterGroup.Builder theaterGroup() { return new TheaterGroup.Builder(); }
  /**
   * A bowling alley.
   */
  public static BowlingAlley.Builder bowlingAlley() { return new BowlingAlley.Builder(); }
  /**
   * Any physical manifestation of a person's medical condition discoverable by objective diagnostic tests or physical examination.
   */
  public static MedicalSign.Builder medicalSign() { return new MedicalSign.Builder(); }
  /**
   * A hair salon.
   */
  public static HairSalon.Builder hairSalon() { return new HairSalon.Builder(); }
  /**
   * A police station.
   */
  public static PoliceStation.Builder policeStation() { return new PoliceStation.Builder(); }
  /**
   * Residence type: Gated community.
   */
  public static GatedResidenceCommunity.Builder gatedResidenceCommunity() { return new GatedResidenceCommunity.Builder(); }
  /**
   * Status of a game server.
   */
  public static GameServerStatus.Builder gameServerStatus() { return new GameServerStatus.Builder(); }
  /**
   * An historical landmark or building.
   */
  public static LandmarksOrHistoricalBuildings.Builder landmarksOrHistoricalBuildings() { return new LandmarksOrHistoricalBuildings.Builder(); }
  /**
   * A dry-cleaning business.
   */
  public static DryCleaningOrLaundry.Builder dryCleaningOrLaundry() { return new DryCleaningOrLaundry.Builder(); }
  /**
   * The act of asking someone to attend an event. Reciprocal of RsvpAction.
   */
  public static InviteAction.Builder inviteAction() { return new InviteAction.Builder(); }
  /**
   * Event type: A social dance.
   */
  public static DanceEvent.Builder danceEvent() { return new DanceEvent.Builder(); }
  /**
   * An office equipment store.
   */
  public static OfficeEquipmentStore.Builder officeEquipmentStore() { return new OfficeEquipmentStore.Builder(); }
  /**
   * Season dedicated to radio broadcast and associated online delivery.
   */
  public static RadioSeason.Builder radioSeason() { return new RadioSeason.Builder(); }
  /**
   * A pharmacy or drugstore.
   */
  public static Pharmacy.Builder pharmacy() { return new Pharmacy.Builder(); }
  /**
   * A Catholic church.
   */
  public static CatholicChurch.Builder catholicChurch() { return new CatholicChurch.Builder(); }
  /**
   * The act of momentarily pausing a device or application (e.g. pause music playback or pause a timer).
   */
  public static SuspendAction.Builder suspendAction() { return new SuspendAction.Builder(); }
  /**
   * The act of returning to the origin that which was previously received (concrete objects) or taken (ownership).
   */
  public static ReturnAction.Builder returnAction() { return new ReturnAction.Builder(); }
  /**
   * A gym.
   */
  public static ExerciseGym.Builder exerciseGym() { return new ExerciseGym.Builder(); }
  /**
   * The average rating based on multiple ratings or reviews.
   */
  public static AggregateRating.Builder aggregateRating() { return new AggregateRating.Builder(); }
  /**
   * The act of  departing from a place. An agent departs from an fromLocation for a destination, optionally with participants.
   */
  public static DepartAction.Builder departAction() { return new DepartAction.Builder(); }
  /**
   * Event type: Education event.
   */
  public static EducationEvent.Builder educationEvent() { return new EducationEvent.Builder(); }
  /**
   * A list of possible product availability options.
   */
  public static ItemAvailability.Builder itemAvailability() { return new ItemAvailability.Builder(); }
  /**
   * An entry point, within some Web-based protocol.
   */
  public static EntryPoint.Builder entryPoint() { return new EntryPoint.Builder(); }
  /**
   * Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc.
   */
  public static ProgramMembership.Builder programMembership() { return new ProgramMembership.Builder(); }
  /**
   * A medical test performed by a laboratory that typically involves examination of a tissue sample by a pathologist.
   */
  public static PathologyTest.Builder pathologyTest() { return new PathologyTest.Builder(); }
  /**
   * Enumerated status values for Reservation.
   */
  public static ReservationStatusType.Builder reservationStatusType() { return new ReservationStatusType.Builder(); }
  /**
   * The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting. See also <a href="https://github.com/rvguha/schemaorg/issues/169">open issues list</a>.
   */
  public static Game.Builder game() { return new Game.Builder(); }
  /**
   * Provider of professional services.
   */
  public static ProfessionalService.Builder professionalService() { return new ProfessionalService.Builder(); }
  /**
   * A type of blood vessel that specifically carries blood to the heart.
   */
  public static Vein.Builder vein() { return new Vein.Builder(); }
  /**
   * Design models for medical trials. Enumerated type.
   */
  public static MedicalTrialDesign.Builder medicalTrialDesign() { return new MedicalTrialDesign.Builder(); }
  /**
   * The act of managing by changing/editing the state of the object.
   */
  public static UpdateAction.Builder updateAction() { return new UpdateAction.Builder(); }
  /**
   * A range of of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
<br />
    Commonly used values:<br />
<br />
    http://purl.org/goodrelations/v1#Labor-BringIn <br />
    http://purl.org/goodrelations/v1#PartsAndLabor-BringIn <br />
    http://purl.org/goodrelations/v1#PartsAndLabor-PickUp <br />
      
   */
  public static WarrantyScope.Builder warrantyScope() { return new WarrantyScope.Builder(); }
  /**
   * A plumbing service.
   */
  public static Plumber.Builder plumber() { return new Plumber.Builder(); }
  /**
   * A bakery.
   */
  public static Bakery.Builder bakery() { return new Bakery.Builder(); }
  /**
   * A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.

      <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
   */
  public static PublicationVolume.Builder publicationVolume() { return new PublicationVolume.Builder(); }
  /**
   * The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.
   */
  public static BuyAction.Builder buyAction() { return new BuyAction.Builder(); }
  /**
   * A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs.
   */
  public static WebSite.Builder webSite() { return new WebSite.Builder(); }
  /**
   * A men's clothing store.
   */
  public static MensClothingStore.Builder mensClothingStore() { return new MensClothingStore.Builder(); }
  /**
   * A locksmith.
   */
  public static Locksmith.Builder locksmith() { return new Locksmith.Builder(); }
  /**
   * A collection of music tracks.
   */
  public static MusicAlbum.Builder musicAlbum() { return new MusicAlbum.Builder(); }
  /**
   * Organization: A business corporation.
   */
  public static Corporation.Builder corporation() { return new Corporation.Builder(); }
  /**
   * A body of water, such as a sea, ocean, or lake.
   */
  public static BodyOfWater.Builder bodyOfWater() { return new BodyOfWater.Builder(); }
  /**
   * A real-estate agent.
   */
  public static RealEstateAgent.Builder realEstateAgent() { return new RealEstateAgent.Builder(); }
  /**
   * The legal availability status of a medical drug.
   */
  public static DrugLegalStatus.Builder drugLegalStatus() { return new DrugLegalStatus.Builder(); }
  /**
   * Any collection of tests commonly ordered together.
   */
  public static MedicalTestPanel.Builder medicalTestPanel() { return new MedicalTestPanel.Builder(); }
  /**
   * A tennis complex.
   */
  public static TennisComplex.Builder tennisComplex() { return new TennisComplex.Builder(); }
  /**
   * A music venue.
   */
  public static MusicVenue.Builder musicVenue() { return new MusicVenue.Builder(); }
  /**
   * A wholesale store.
   */
  public static WholesaleStore.Builder wholesaleStore() { return new WholesaleStore.Builder(); }
  /**
   * A medical clinic.
   */
  public static MedicalClinic.Builder medicalClinic() { return new MedicalClinic.Builder(); }
  /**
   * A specific strength in which a medical drug is available in a specific country.
   */
  public static DrugStrength.Builder drugStrength() { return new DrugStrength.Builder(); }
  /**
   * The act of distributing content to people for their amusement or edification.
   */
  public static ShareAction.Builder shareAction() { return new ShareAction.Builder(); }
  /**
   * A sports location, such as a playing field.
   */
  public static SportsActivityLocation.Builder sportsActivityLocation() { return new SportsActivityLocation.Builder(); }
  /**
   * An email message.
   */
  public static EmailMessage.Builder emailMessage() { return new EmailMessage.Builder(); }
  /**
   * A set of characteristics describing parents, who can be interested in viewing some content.
   */
  public static ParentAudience.Builder parentAudience() { return new ParentAudience.Builder(); }
  /**
   * A radio episode which can be part of a series or season.
   */
  public static RadioEpisode.Builder radioEpisode() { return new RadioEpisode.Builder(); }
  /**
   * A PublicationEvent corresponds indifferently to the event of publication for a CreativeWork of any type e.g. a broadcast event, an on-demand event, a book/journal publication via a variety of delivery media.
   */
  public static PublicationEvent.Builder publicationEvent() { return new PublicationEvent.Builder(); }
  /**
   * An organization such as a school, NGO, corporation, club, etc.
   */
  public static Organization.Builder organization() { return new Organization.Builder(); }
  /**
   * An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.
   */
  public static Order.Builder order() { return new Order.Builder(); }
  /**
   * The act of consuming static visual content.
   */
  public static ViewAction.Builder viewAction() { return new ViewAction.Builder(); }
  /**
   * A short TV or radio program or a segment/part of a program.
   */
  public static Clip.Builder clip() { return new Clip.Builder(); }
  /**
   * A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the "text" property, and its topic via "about", properties shared with all CreativeWorks.
   */
  public static Comment.Builder comment() { return new Comment.Builder(); }
  /**
   * The act of registering to an organization/service without the guarantee to receive it. <p>Related actions:</p><ul><li><a href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, ApplyAction has no guarantees that the application will be accepted</li></ul>.
   */
  public static ApplyAction.Builder applyAction() { return new ApplyAction.Builder(); }
  /**
   * A theater or other performing art center.
   */
  public static PerformingArtsTheater.Builder performingArtsTheater() { return new PerformingArtsTheater.Builder(); }
  /**
   * An event involving the delivery of an item.
   */
  public static DeliveryEvent.Builder deliveryEvent() { return new DeliveryEvent.Builder(); }
  /**
   * Specific build of a software applicaton
   */
  public static SoftwareApplicationBuild.Builder softwareApplicationBuild() { return new SoftwareApplicationBuild.Builder(); }
  /**
   * A campground.
   */
  public static Campground.Builder campground() { return new Campground.Builder(); }
  /**
   * A unique instance of a television BroadcastService on a CableOrSatelliteService lineup.
   */
  public static TelevisionChannel.Builder televisionChannel() { return new TelevisionChannel.Builder(); }
  /**
   * A house painting service.
   */
  public static HousePainter.Builder housePainter() { return new HousePainter.Builder(); }
  /**
   * Structured values are used when the value of a property has a more complex structure than simply being a textual value or a reference to another thing.
   */
  public static StructuredValue.Builder structuredValue() { return new StructuredValue.Builder(); }
  /**
   * An enumeration that describes different types of medical procedures.
   */
  public static MedicalProcedureType.Builder medicalProcedureType() { return new MedicalProcedureType.Builder(); }
  /**
   * A graveyard.
   */
  public static Cemetery.Builder cemetery() { return new Cemetery.Builder(); }
  /**
   * Used to describe a seat, such as a reserved seat in an event reservation.
   */
  public static Seat.Builder seat() { return new Seat.Builder(); }
  /**
   * A movie.
   */
  public static Movie.Builder movie() { return new Movie.Builder(); }
  /**
   * A hostel - cheap accommodation, often in shared dormitories.
   */
  public static Hostel.Builder hostel() { return new Hostel.Builder(); }
  /**
   * The act of producing a visual/graphical representation of an object, typically with a pen/pencil and paper as instruments.
   */
  public static DrawAction.Builder drawAction() { return new DrawAction.Builder(); }
  /**
   * The act of participating in an exchange of goods and services for monetary compensation. An agent trades an object, product or service with a participant in exchange for a one time or periodic payment.
   */
  public static TradeAction.Builder tradeAction() { return new TradeAction.Builder(); }
  /**
   * The act of participating in exertive activity for the purposes of improving health and fitness.
   */
  public static ExerciseAction.Builder exerciseAction() { return new ExerciseAction.Builder(); }
  /**
   * A web page that provides medical information.
   */
  public static MedicalWebPage.Builder medicalWebPage() { return new MedicalWebPage.Builder(); }
  /**
   * The act of starting or activating a device or application (e.g. starting a timer or turning on a flashlight).
   */
  public static ActivateAction.Builder activateAction() { return new ActivateAction.Builder(); }
  /**
   * A gas station.
   */
  public static GasStation.Builder gasStation() { return new GasStation.Builder(); }
  /**
   * A delivery method is a standardized procedure for transferring the product or service to the destination of fulfillment chosen by the customer. Delivery methods are characterized by the means of transportation used, and by the organization or group that is the contracting party for the sending organization or person.
<br />
    Commonly used values:<br />
<br />
    http://purl.org/goodrelations/v1#DeliveryModeDirectDownload <br />
    http://purl.org/goodrelations/v1#DeliveryModeFreight <br />
    http://purl.org/goodrelations/v1#DeliveryModeMail <br />
    http://purl.org/goodrelations/v1#DeliveryModeOwnFleet <br />
    http://purl.org/goodrelations/v1#DeliveryModePickUp <br />
    http://purl.org/goodrelations/v1#DHL <br />
    http://purl.org/goodrelations/v1#FederalExpress <br />
    http://purl.org/goodrelations/v1#UPS <br />
        
   */
  public static DeliveryMethod.Builder deliveryMethod() { return new DeliveryMethod.Builder(); }
  /**
   * An airline flight.
   */
  public static Flight.Builder flight() { return new Flight.Builder(); }
  /**
   * The act of installing an application.
   */
  public static InstallAction.Builder installAction() { return new InstallAction.Builder(); }
  /**
   * A simple system that adds up the number of risk factors to yield a score that is associated with prognosis, e.g. CHAD score, TIMI risk score.
   */
  public static MedicalRiskScore.Builder medicalRiskScore() { return new MedicalRiskScore.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserPlays.Builder userPlays() { return new UserPlays.Builder(); }
  /**
   * An art gallery.
   */
  public static ArtGallery.Builder artGallery() { return new ArtGallery.Builder(); }
  /**
   * The act of posing a question / favor to someone.<p>Related actions:</p><ul><li><a href="http://schema.org/ReplyAction">ReplyAction</a>: Appears generally as a response to AskAction</li></ul>.
   */
  public static AskAction.Builder askAction() { return new AskAction.Builder(); }
  /**
   * The act of registering to be a user of a service, product or web page.<p>Related actions:</p><ul><li><a href="http://schema.org/JoinAction">JoinAction</a>: Unlike JoinAction, RegisterAction implies you are registering to be a user of a service, *not* a group/team of people.</li><li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, RegisterAction doesn't imply that the agent is expecting to poll for updates from the object.</li><li><a href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, RegisterAction doesn't imply that the agent is expecting updates from the object</li></ul>.
   */
  public static RegisterAction.Builder registerAction() { return new RegisterAction.Builder(); }
  /**
   * The act of forming one's opinion, reaction or sentiment.
   */
  public static AssessAction.Builder assessAction() { return new AssessAction.Builder(); }
  /**
   * An indication for a medical therapy that has been formally specified or approved by a regulatory body that regulates use of the therapy; for example, the US FDA approves indications for most drugs in the US.
   */
  public static ApprovedIndication.Builder approvedIndication() { return new ApprovedIndication.Builder(); }
  /**
   * Event type: Festival.
   */
  public static Festival.Builder festival() { return new Festival.Builder(); }
  /**
   * A general contractor.
   */
  public static GeneralContractor.Builder generalContractor() { return new GeneralContractor.Builder(); }
  /**
   * A nail salon.
   */
  public static NailSalon.Builder nailSalon() { return new NailSalon.Builder(); }
  /**
   * 
          A Series in schema.org is a group of related items, typically but not necessarily of the same kind. 
   */
  public static Series.Builder series() { return new Series.Builder(); }
  /**
   * A park.
   */
  public static Park.Builder park() { return new Park.Builder(); }
  /**
   * The act of obtaining an object under an agreement to return it at a later date. Reciprocal of LendAction.<p>Related actions:</p><ul><li><a href="http://schema.org/LendAction">LendAction</a>: Reciprocal of BorrowAction</li></ul>.
   */
  public static BorrowAction.Builder borrowAction() { return new BorrowAction.Builder(); }
  /**
   * A type of boarding policy used by an airline.
   */
  public static BoardingPolicyType.Builder boardingPolicyType() { return new BoardingPolicyType.Builder(); }
  /**
   * A dentist.
   */
  public static Dentist.Builder dentist() { return new Dentist.Builder(); }
  /**
   * A process of progressive physical care and rehabilitation aimed at improving a health condition.
   */
  public static PhysicalTherapy.Builder physicalTherapy() { return new PhysicalTherapy.Builder(); }
  /**
   * A web page element, like a table or an image.
   */
  public static WebPageElement.Builder webPageElement() { return new WebPageElement.Builder(); }
  /**
   * A collection of music tracks in playlist form.
   */
  public static MusicPlaylist.Builder musicPlaylist() { return new MusicPlaylist.Builder(); }
  /**
   * The act of an agent communicating (service provider, social media, etc) their departure of a previously reserved service (e.g. flight check in) or place (e.g. hotel).<p>Related actions:</p><ul><li><a href="http://schema.org/CheckInAction">CheckInAction</a>: The antonym of CheckOutAction.</li><li><a href="http://schema.org/DepartAction">DepartAction</a>: Unlike DepartAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.</li><li><a href="http://schema.org/CancelAction">CancelAction</a>: Unlike CancelAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service</li></ul>.
   */
  public static CheckOutAction.Builder checkOutAction() { return new CheckOutAction.Builder(); }
  /**
   * Enumerated for values for itemListOrder for indicating how an ordered ItemList is organized.
   */
  public static ItemListOrderType.Builder itemListOrderType() { return new ItemListOrderType.Builder(); }
  /**
   * A retail good store.
   */
  public static Store.Builder store() { return new Store.Builder(); }
  /**
   * The act of searching for an object.<p>Related actions:</p><ul><li><a href="http://schema.org/FindAction">FindAction</a>: SearchAction generally leads to a FindAction, but not necessarily</li></ul>.
   */
  public static SearchAction.Builder searchAction() { return new SearchAction.Builder(); }
  /**
   * A short segment/part of a movie.
   */
  public static MovieClip.Builder movieClip() { return new MovieClip.Builder(); }
  /**
   * An embassy.
   */
  public static Embassy.Builder embassy() { return new Embassy.Builder(); }
  /**
   * An educational organization.
   */
  public static EducationalOrganization.Builder educationalOrganization() { return new EducationalOrganization.Builder(); }
  /**
   * A private parcel service as the delivery mode available for a certain offer.
<br />
    Commonly used values:<br />
<br />
    http://purl.org/goodrelations/v1#DHL <br />
    http://purl.org/goodrelations/v1#FederalExpress <br />
    http://purl.org/goodrelations/v1#UPS <br />
      
   */
  public static ParcelService.Builder parcelService() { return new ParcelService.Builder(); }
  /**
   * A medical organization, such as a doctor's office or clinic.
   */
  public static MedicalOrganization.Builder medicalOrganization() { return new MedicalOrganization.Builder(); }
  /**
   * A college, university, or other third-level educational institution.
   */
  public static CollegeOrUniversity.Builder collegeOrUniversity() { return new CollegeOrUniversity.Builder(); }
  /**
   * The act of forming a personal connection with someone (object) mutually/bidirectionally/symmetrically.<p>Related actions:</p><ul><li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, BefriendAction implies that the connection is reciprocal</li></ul>.
   */
  public static BefriendAction.Builder befriendAction() { return new BefriendAction.Builder(); }
  /**
   * The act of swallowing liquids.
   */
  public static DrinkAction.Builder drinkAction() { return new DrinkAction.Builder(); }
  /**
   * Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).
   */
  public static MusicReleaseFormatType.Builder musicReleaseFormatType() { return new MusicReleaseFormatType.Builder(); }
  /**
   * A process of care used in either a diagnostic, therapeutic, or palliative capacity that relies on invasive (surgical), non-invasive, or percutaneous techniques.
   */
  public static MedicalProcedure.Builder medicalProcedure() { return new MedicalProcedure.Builder(); }
  /**
   * A permit issued by a government agency.
   */
  public static GovernmentPermit.Builder governmentPermit() { return new GovernmentPermit.Builder(); }
  /**
   * A series of books. Included books can be indicated with the hasPart property.
   */
  public static BookSeries.Builder bookSeries() { return new BookSeries.Builder(); }
  /**
   * A sports club.
   */
  public static SportsClub.Builder sportsClub() { return new SportsClub.Builder(); }
  /**
   * A class of medical drugs, e.g., statins. Classes can represent general pharmacological class, common mechanisms of action, common physiological effects, etc.
   */
  public static DrugClass.Builder drugClass() { return new DrugClass.Builder(); }
  /**
   * A reservation for a rental car.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  public static RentalCarReservation.Builder rentalCarReservation() { return new RentalCarReservation.Builder(); }
  /**
   * A public swimming pool.
   */
  public static PublicSwimmingPool.Builder publicSwimmingPool() { return new PublicSwimmingPool.Builder(); }
  /**
   * Quantities such as distance, time, mass, weight, etc. Particular instances of say Mass are entities like '3 Kg' or '4 milligrams'.
   */
  public static Quantity.Builder quantity() { return new Quantity.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserLikes.Builder userLikes() { return new UserLikes.Builder(); }
  /**
   * A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.
   */
  public static Muscle.Builder muscle() { return new Muscle.Builder(); }
  /**
   * An employment agency.
   */
  public static EmploymentAgency.Builder employmentAgency() { return new EmploymentAgency.Builder(); }
  /**
   * The act of achieving victory in a competitive activity.
   */
  public static WinAction.Builder winAction() { return new WinAction.Builder(); }
  /**
   * A bookstore.
   */
  public static BookStore.Builder bookStore() { return new BookStore.Builder(); }
  /**
   * A media season e.g. tv, radio, video game etc.
   */
  public static Season.Builder season() { return new Season.Builder(); }
  /**
   * Describes a reservation for travel, dining or an event. Some reservations require tickets.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use http://schema.org/Offer.
   */
  public static Reservation.Builder reservation() { return new Reservation.Builder(); }
  /**
   * The status of an Action.
   */
  public static ActionStatusType.Builder actionStatusType() { return new ActionStatusType.Builder(); }
  /**
   * A structured value providing information about the opening hours of a place or a certain service inside a place.
   */
  public static OpeningHoursSpecification.Builder openingHoursSpecification() { return new OpeningHoursSpecification.Builder(); }
  /**
   * A condition or factor that indicates use of a medical therapy, including signs, symptoms, risk factors, anatomical states, etc.
   */
  public static MedicalIndication.Builder medicalIndication() { return new MedicalIndication.Builder(); }
  /**
   * When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.
   */
  public static AggregateOffer.Builder aggregateOffer() { return new AggregateOffer.Builder(); }
  /**
   * A department store.
   */
  public static DepartmentStore.Builder departmentStore() { return new DepartmentStore.Builder(); }
  /**
   * The act of giving money voluntarily to a beneficiary in recognition of services rendered.
   */
  public static TipAction.Builder tipAction() { return new TipAction.Builder(); }
  /**
   * Systems of medical practice.
   */
  public static MedicineSystem.Builder medicineSystem() { return new MedicineSystem.Builder(); }
  /**
   * A book.
   */
  public static Book.Builder book() { return new Book.Builder(); }
  /**
   * Brewery.
   */
  public static Brewery.Builder brewery() { return new Brewery.Builder(); }
  /**
   * Level of evidence for a medical guideline. Enumerated type.
   */
  public static MedicalEvidenceLevel.Builder medicalEvidenceLevel() { return new MedicalEvidenceLevel.Builder(); }
  /**
   * Any indication of the existence of a medical condition or disease.
   */
  public static MedicalSignOrSymptom.Builder medicalSignOrSymptom() { return new MedicalSignOrSymptom.Builder(); }
  /**
   * A recommended dosing schedule for a drug or supplement as prescribed or recommended by an authority or by the drug/supplement's manufacturer. Capture the recommending authority in the recognizingAuthority property of MedicalEntity.
   */
  public static RecommendedDoseSchedule.Builder recommendedDoseSchedule() { return new RecommendedDoseSchedule.Builder(); }
  /**
   * A scholarly article.
   */
  public static ScholarlyArticle.Builder scholarlyArticle() { return new ScholarlyArticle.Builder(); }
  /**
   * Event type: Business event.
   */
  public static BusinessEvent.Builder businessEvent() { return new BusinessEvent.Builder(); }
  /**
   * Rigid connective tissue that comprises up the skeletal structure of the human body.
   */
  public static Bone.Builder bone() { return new Bone.Builder(); }
  /**
   * An internet cafe.
   */
  public static InternetCafe.Builder internetCafe() { return new InternetCafe.Builder(); }
  /**
   * Reserving a concrete object.<p>Related actions:</p><ul><li><a href="http://schema.org/ScheduleAction">ScheduleAction</a>: Unlike ScheduleAction, ReserveAction reserves concrete objects (e.g. a table, a hotel) towards a time slot / spatial allocation</li></ul>.
   */
  public static ReserveAction.Builder reserveAction() { return new ReserveAction.Builder(); }
  /**
   * A bus stop.
   */
  public static BusStop.Builder busStop() { return new BusStop.Builder(); }
  /**
   * A placeholder for multiple similar products of the same kind.
   */
  public static SomeProducts.Builder someProducts() { return new SomeProducts.Builder(); }
  /**
   * A business providing entertainment.
   */
  public static EntertainmentBusiness.Builder entertainmentBusiness() { return new EntertainmentBusiness.Builder(); }
  /**
   * A page devoted to a single item, such as a particular product or hotel.
   */
  public static ItemPage.Builder itemPage() { return new ItemPage.Builder(); }
  /**
   * Reference documentation for application programming interfaces (APIs).
   */
  public static APIReference.Builder aPIReference() { return new APIReference.Builder(); }
  /**
   * A performance group, such as a band, an orchestra, or a circus.
   */
  public static PerformingGroup.Builder performingGroup() { return new PerformingGroup.Builder(); }
  /**
   * A strategy of regulating the intake of food to achieve or maintain a specific health-related goal.
   */
  public static Diet.Builder diet() { return new Diet.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserPlusOnes.Builder userPlusOnes() { return new UserPlusOnes.Builder(); }
  /**
   * A condition or factor that serves as a reason to withhold a certain medical therapy. Contraindications can be absolute (there are no reasonable circumstances for undertaking a course of action) or relative (the patient is at higher risk of complications, but that these risks may be outweighed by other considerations or mitigated by other measures).
   */
  public static MedicalContraindication.Builder medicalContraindication() { return new MedicalContraindication.Builder(); }
  /**
   * A synagogue.
   */
  public static Synagogue.Builder synagogue() { return new Synagogue.Builder(); }
  /**
   * A landform or physical feature.  Landform elements include mountains, plains, lakes, rivers, seascape and oceanic waterbody interface features such as bays, peninsulas, seas and so forth, including sub-aqueous terrain features such as submersed mountain ranges, volcanoes, and the great ocean basins.
   */
  public static Landform.Builder landform() { return new Landform.Builder(); }
  /**
   * A restaurant.
   */
  public static Restaurant.Builder restaurant() { return new Restaurant.Builder(); }
  /**
   * A high school.
   */
  public static HighSchool.Builder highSchool() { return new HighSchool.Builder(); }
  /**
   * A PerformanceRole is a Role that some entity places with regard to a theatrical performance, e.g. in a Movie, TVSeries etc.
   */
  public static PerformanceRole.Builder performanceRole() { return new PerformanceRole.Builder(); }
  /**
   * A Childcare center.
   */
  public static ChildCare.Builder childCare() { return new ChildCare.Builder(); }
  /**
   * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
   */
  public static SoftwareSourceCode.Builder softwareSourceCode() { return new SoftwareSourceCode.Builder(); }
  /**
   * A lake (for example, Lake Pontrachain).
   */
  public static LakeBodyOfWater.Builder lakeBodyOfWater() { return new LakeBodyOfWater.Builder(); }
  /**
   * A medical procedure intended primarily for diagnostic, as opposed to therapeutic, purposes.
   */
  public static DiagnosticProcedure.Builder diagnosticProcedure() { return new DiagnosticProcedure.Builder(); }
  /**
   * Enumerated options related to a ContactPoint.
   */
  public static ContactPointOption.Builder contactPointOption() { return new ContactPointOption.Builder(); }
  /**
   * A type of physical examination of a patient performed by a physician. Enumerated type.
   */
  public static PhysicalExam.Builder physicalExam() { return new PhysicalExam.Builder(); }
  /**
   * A vet's office.
   */
  public static VeterinaryCare.Builder veterinaryCare() { return new VeterinaryCare.Builder(); }
  /**
   * A radio station.
   */
  public static RadioStation.Builder radioStation() { return new RadioStation.Builder(); }
  /**
   * Properties that take Distances as values are of the form '&lt;Number&gt; &lt;Length unit of measure&gt;'. E.g., '7 ft'.
   */
  public static Distance.Builder distance() { return new Distance.Builder(); }
  /**
   * A group of multiple reservations with common values for all sub-reservations.
   */
  public static ReservationPackage.Builder reservationPackage() { return new ReservationPackage.Builder(); }
  /**
   * A nightclub or discotheque.
   */
  public static NightClub.Builder nightClub() { return new NightClub.Builder(); }
  /**
   * A volcano, like Fuji san.
   */
  public static Volcano.Builder volcano() { return new Volcano.Builder(); }
  /**
   * The act of expressing a consistency of opinion with the object. An agent agrees to/about an object (a proposition, topic or theme) with participants.
   */
  public static AgreeAction.Builder agreeAction() { return new AgreeAction.Builder(); }
  /**
   * An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
   */
  public static OrderItem.Builder orderItem() { return new OrderItem.Builder(); }
  /**
   * A media season e.g. tv, radio, video game etc.
   */
  public static CreativeWorkSeason.Builder creativeWorkSeason() { return new CreativeWorkSeason.Builder(); }
  /**
   * Web page type: Contact page.
   */
  public static ContactPage.Builder contactPage() { return new ContactPage.Builder(); }
  /**
   * A dataset in downloadable form.
   */
  public static DataDownload.Builder dataDownload() { return new DataDownload.Builder(); }
  /**
   * A set of characteristics belonging to businesses, e.g. who compose an item's target audience.
   */
  public static BusinessAudience.Builder businessAudience() { return new BusinessAudience.Builder(); }
  /**
   * An agent inspects/determines/investigates/inquire or examine an object's accuracy/quality/condition or state.
   */
  public static CheckAction.Builder checkAction() { return new CheckAction.Builder(); }
  /**
   * A Buddhist temple.
   */
  public static BuddhistTemple.Builder buddhistTemple() { return new BuddhistTemple.Builder(); }
  /**
   * A medical study is an umbrella type covering all kinds of research studies relating to human medicine or health, including observational studies and interventional trials and registries, randomized, controlled or not. When the specific type of study is known, use one of the extensions of this type, such as MedicalTrial or MedicalObservationalStudy. Also, note that this type should be used to mark up data that describes the study itself; to tag an article that publishes the results of a study, use MedicalScholarlyArticle. Note: use the code property of MedicalEntity to store study IDs, e.g. clinicaltrials.gov ID.
   */
  public static MedicalStudy.Builder medicalStudy() { return new MedicalStudy.Builder(); }
  /**
   * An electronics store.
   */
  public static ElectronicsStore.Builder electronicsStore() { return new ElectronicsStore.Builder(); }
  /**
   * An offer to transfer some rights to an item or to provide a service&#x2014;for example, an offer to sell tickets to an event, to rent the DVD of a movie, to stream a TV show over the internet, to repair a motorcycle, or to loan a book.
      <br/><br/>
      For <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GTIN</a>-related fields, see
      <a href="http://www.gs1.org/barcodes/support/check_digit_calculator">Check Digit calculator</a>
      and <a href="http://www.gs1us.org/resources/standards/gtin-validation-guide">validation guide</a>
      from <a href="http://www.gs1.org/">GS1</a>.
   */
  public static Offer.Builder offer() { return new Offer.Builder(); }
  /**
   * Any specific branch of medical science or practice. Medical specialities include clinical specialties that pertain to particular organ systems and their respective disease states, as well as allied health specialties. Enumerated type.
   */
  public static MedicalSpecialty.Builder medicalSpecialty() { return new MedicalSpecialty.Builder(); }
  /**
   * Scheduling future actions, events, or tasks.<p>Related actions:</p><ul><li><a href="http://schema.org/ReserveAction">ReserveAction</a>: Unlike ReserveAction, ScheduleAction allocates future actions (e.g. an event, a task, etc) towards a time slot / spatial allocation</li></ul>.
   */
  public static ScheduleAction.Builder scheduleAction() { return new ScheduleAction.Builder(); }
  /**
   * The act of producing a painting, typically with paint and canvas as instruments.
   */
  public static PaintAction.Builder paintAction() { return new PaintAction.Builder(); }
  /**
   * A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
   */
  public static Vehicle.Builder vehicle() { return new Vehicle.Builder(); }
  /**
   * Organization: Sports team.
   */
  public static SportsTeam.Builder sportsTeam() { return new SportsTeam.Builder(); }
  /**
   * Indicates whether this drug is available by prescription or over-the-counter.
   */
  public static DrugPrescriptionStatus.Builder drugPrescriptionStatus() { return new DrugPrescriptionStatus.Builder(); }
  /**
   * The act of authoring written creative content.
   */
  public static WriteAction.Builder writeAction() { return new WriteAction.Builder(); }
  /**
   * A public structure, such as a town hall or concert hall.
   */
  public static CivicStructure.Builder civicStructure() { return new CivicStructure.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserInteraction.Builder userInteraction() { return new UserInteraction.Builder(); }
  /**
   * A shoe store.
   */
  public static ShoeStore.Builder shoeStore() { return new ShoeStore.Builder(); }
  /**
   * The act of applying an object to its intended purpose.
   */
  public static UseAction.Builder useAction() { return new UseAction.Builder(); }
  /**
   * Car repair business.
   */
  public static AutoRepair.Builder autoRepair() { return new AutoRepair.Builder(); }
  /**
   * An answer offered to a question; perhaps correct, perhaps opinionated or wrong.
   */
  public static Answer.Builder answer() { return new Answer.Builder(); }
  /**
   * A day spa.
   */
  public static DaySpa.Builder daySpa() { return new DaySpa.Builder(); }
  /**
   * Specific revision of a software code
   */
  public static SourceCodeRevision.Builder sourceCodeRevision() { return new SourceCodeRevision.Builder(); }
  /**
   * A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism.
   */
  public static Drug.Builder drug() { return new Drug.Builder(); }
  /**
   * The act of editing a recipient by replacing an old object with a new object.
   */
  public static ReplaceAction.Builder replaceAction() { return new ReplaceAction.Builder(); }
  /**
   * A winery.
   */
  public static Winery.Builder winery() { return new Winery.Builder(); }
  /**
   * A process of care relying upon counseling, dialogue, communication, verbalization aimed at improving a mental health condition.
   */
  public static PsychologicalTreatment.Builder psychologicalTreatment() { return new PsychologicalTreatment.Builder(); }
  /**
   * A toy store.
   */
  public static ToyStore.Builder toyStore() { return new ToyStore.Builder(); }
  /**
   * A shop that will buy, or lend money against the security of, personal possessions.
   */
  public static PawnShop.Builder pawnShop() { return new PawnShop.Builder(); }
  /**
   * A train station.
   */
  public static TrainStation.Builder trainStation() { return new TrainStation.Builder(); }
  /**
   * Information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities.
   */
  public static EngineSpecification.Builder engineSpecification() { return new EngineSpecification.Builder(); }
  /**
   * The header section of the page.
   */
  public static WPHeader.Builder wPHeader() { return new WPHeader.Builder(); }
  /**
   * Financial services business.
   */
  public static FinancialService.Builder financialService() { return new FinancialService.Builder(); }
  /**
   * A motorcycle repair shop.
   */
  public static MotorcycleRepair.Builder motorcycleRepair() { return new MotorcycleRepair.Builder(); }
  /**
   * A video file.
   */
  public static VideoObject.Builder videoObject() { return new VideoObject.Builder(); }
  /**
   * A government office&#x2014;for example, an IRS or DMV office.
   */
  public static GovernmentOffice.Builder governmentOffice() { return new GovernmentOffice.Builder(); }
  /**
   * A defence establishment, such as an army or navy base.
   */
  public static DefenceEstablishment.Builder defenceEstablishment() { return new DefenceEstablishment.Builder(); }
  /**
   * The act of an agent relocating to a place.<p>Related actions:</p><ul><li><a href="http://schema.org/TransferAction">TransferAction</a>: Unlike TransferAction, the subject of the move is a living Person or Organization rather than an inanimate object</li></ul>.
   */
  public static MoveAction.Builder moveAction() { return new MoveAction.Builder(); }
  /**
   * Enumerated categories of medical drug costs.
   */
  public static DrugCostCategory.Builder drugCostCategory() { return new DrugCostCategory.Builder(); }
  /**
   * An agent pays a price to a participant.
   */
  public static PayAction.Builder payAction() { return new PayAction.Builder(); }
  /**
   * A jewelry store.
   */
  public static JewelryStore.Builder jewelryStore() { return new JewelryStore.Builder(); }
  /**
   * A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc.
   */
  public static TechArticle.Builder techArticle() { return new TechArticle.Builder(); }
  /**
   * The act of responding instinctively and emotionally to an object, expressing a sentiment.
   */
  public static ReactAction.Builder reactAction() { return new ReactAction.Builder(); }
  /**
   * The act of downloading an object.
   */
  public static DownloadAction.Builder downloadAction() { return new DownloadAction.Builder(); }
  /**
   * An infectious disease is a clinically evident human disease resulting from the presence of pathogenic microbial agents, like pathogenic viruses, pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To be considered an infectious disease, such pathogens are known to be able to cause this disease.
   */
  public static InfectiousDisease.Builder infectiousDisease() { return new InfectiousDisease.Builder(); }
  /**
   * The most generic kind of creative work, including books, movies, photographs, software programs, etc.
   */
  public static CreativeWork.Builder creativeWork() { return new CreativeWork.Builder(); }
  /**
   * Classes of agents or pathogens that transmit infectious diseases. Enumerated type.
   */
  public static InfectiousAgentClass.Builder infectiousAgentClass() { return new InfectiousAgentClass.Builder(); }
  /**
   * An over the air or online broadcast event.
   */
  public static BroadcastEvent.Builder broadcastEvent() { return new BroadcastEvent.Builder(); }
  /**
   * The act of producing a balanced opinion about the object for an audience. An agent reviews an object with participants resulting in a review.
   */
  public static ReviewAction.Builder reviewAction() { return new ReviewAction.Builder(); }
  /**
   * An agent leaves an event / group with participants/friends at a location.<p>Related actions:</p><ul><li><a href="http://schema.org/JoinAction">JoinAction</a>: The antonym of LeaveAction.</li><li><a href="http://schema.org/UnRegisterAction">UnRegisterAction</a>: Unlike UnRegisterAction, LeaveAction implies leaving a group/team of people rather than a service</li></ul>.
   */
  public static LeaveAction.Builder leaveAction() { return new LeaveAction.Builder(); }
  /**
   * A DeliveryMethod in which an item is made available via locker.
   */
  public static LockerDelivery.Builder lockerDelivery() { return new LockerDelivery.Builder(); }
  /**
   * An image, video, or audio object embedded in a web page. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).
   */
  public static MediaObject.Builder mediaObject() { return new MediaObject.Builder(); }
  /**
   * Intended audience for an item, i.e. the group for whom the item was created.
   */
  public static Audience.Builder audience() { return new Audience.Builder(); }
  /**
   * Web page type: Search results page.
   */
  public static SearchResultsPage.Builder searchResultsPage() { return new SearchResultsPage.Builder(); }
  /**
   * A movie theater.
   */
  public static MovieTheater.Builder movieTheater() { return new MovieTheater.Builder(); }
  /**
   * Entities that have a somewhat fixed, physical extension.
   */
  public static Place.Builder place() { return new Place.Builder(); }
  /**
   * A reservation for a taxi.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
   */
  public static TaxiReservation.Builder taxiReservation() { return new TaxiReservation.Builder(); }
  /**
   * The act of allocating an action/event/task to some destination (someone or something).
   */
  public static AssignAction.Builder assignAction() { return new AssignAction.Builder(); }
  /**
   * A tourist information center.
   */
  public static TouristInformationCenter.Builder touristInformationCenter() { return new TouristInformationCenter.Builder(); }
  /**
   * A food-related business.
   */
  public static FoodEstablishment.Builder foodEstablishment() { return new FoodEstablishment.Builder(); }
  /**
   * An agent tracks an object for updates.<p>Related actions:</p><ul><li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, TrackAction refers to the interest on the location of innanimates objects.</li><li><a href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, TrackAction refers to  the interest on the location of innanimate objects</li></ul>.
   */
  public static TrackAction.Builder trackAction() { return new TrackAction.Builder(); }
  /**
   * Nutritional information about the recipe.
   */
  public static NutritionInformation.Builder nutritionInformation() { return new NutritionInformation.Builder(); }
  /**
   * A motel.
   */
  public static Motel.Builder motel() { return new Motel.Builder(); }
  /**
   * Used to describe a ticket to an event, a flight, a bus ride, etc.
   */
  public static Ticket.Builder ticket() { return new Ticket.Builder(); }
  /**
   * A short TV program or a segment/part of a TV program.
   */
  public static TVClip.Builder tVClip() { return new TVClip.Builder(); }
  /**
   * The act of consuming written content.
   */
  public static ReadAction.Builder readAction() { return new ReadAction.Builder(); }
  /**
   * A medical laboratory that offers on-site or off-site diagnostic services.
   */
  public static DiagnosticLab.Builder diagnosticLab() { return new DiagnosticLab.Builder(); }
  /**
   * The act of consuming audio content.
   */
  public static ListenAction.Builder listenAction() { return new ListenAction.Builder(); }
  /**
   * A preschool.
   */
  public static Preschool.Builder preschool() { return new Preschool.Builder(); }
  /**
   * A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.
   */
  public static LocalBusiness.Builder localBusiness() { return new LocalBusiness.Builder(); }
  /**
   * A process of care using radiation aimed at improving a health condition.
   */
  public static RadiationTherapy.Builder radiationTherapy() { return new RadiationTherapy.Builder(); }
  /**
   * A <a href="/VideoGame">video game</a> series.
   */
  public static VideoGameSeries.Builder videoGameSeries() { return new VideoGameSeries.Builder(); }
  /**
   * Any rule set or interactive tool for estimating the risk of developing a complication or condition.
   */
  public static MedicalRiskEstimator.Builder medicalRiskEstimator() { return new MedicalRiskEstimator.Builder(); }
  /**
   * A service provided by a government organization, e.g. food stamps, veterans benefits, etc.
   */
  public static GovernmentService.Builder governmentService() { return new GovernmentService.Builder(); }
  /**
   * A subclass of Role used to describe roles within organizations.
   */
  public static OrganizationRole.Builder organizationRole() { return new OrganizationRole.Builder(); }
  /**
   * Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.
   */
  public static Product.Builder product() { return new Product.Builder(); }
  /**
   * A florist.
   */
  public static Florist.Builder florist() { return new Florist.Builder(); }
  /**
   * A datasheet or vendor specification of a product (in the sense of a prototypical description).
   */
  public static ProductModel.Builder productModel() { return new ProductModel.Builder(); }
  /**
   * A health club.
   */
  public static HealthClub.Builder healthClub() { return new HealthClub.Builder(); }
  /**
   * A delivery service through which content is provided via broadcast over the air or online.
   */
  public static BroadcastService.Builder broadcastService() { return new BroadcastService.Builder(); }
  /**
   * Any medical intervention designed to prevent, treat, and cure human diseases and medical conditions, including both curative and palliative therapies. Medical therapies are typically processes of care relying upon pharmacotherapy, behavioral therapy, supportive therapy (with fluid or nutrition for example), or detoxification (e.g. hemodialysis) aimed at improving or preventing a health condition.
   */
  public static MedicalTherapy.Builder medicalTherapy() { return new MedicalTherapy.Builder(); }
  /**
   * A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time.
   */
  public static DatedMoneySpecification.Builder datedMoneySpecification() { return new DatedMoneySpecification.Builder(); }
  /**
   * The act of stopping or deactivating a device or application (e.g. stopping a timer or turning off a flashlight).
   */
  public static DeactivateAction.Builder deactivateAction() { return new DeactivateAction.Builder(); }
  /**
   * The act of marrying a person.
   */
  public static MarryAction.Builder marryAction() { return new MarryAction.Builder(); }
  /**
   * The cost per unit of a medical drug. Note that this type is not meant to represent the price in an offer of a drug for sale; see the Offer type for that. This type will typically be used to tag wholesale or average retail cost of a drug, or maximum reimbursable cost. Costs of medical drugs vary widely depending on how and where they are paid for, so while this type captures some of the variables, costs should be used with caution by consumers of this schema's markup.
   */
  public static DrugCost.Builder drugCost() { return new DrugCost.Builder(); }
  /**
   * A short band of tough, flexible, fibrous connective tissue that functions to connect multiple bones, cartilages, and structurally support joints.
   */
  public static Ligament.Builder ligament() { return new Ligament.Builder(); }
  /**
   * A lodging business, such as a motel, hotel, or inn.
   */
  public static LodgingBusiness.Builder lodgingBusiness() { return new LodgingBusiness.Builder(); }
  /**
   * Classification of the album by it's type of content: soundtrack, live album, studio album, etc.
   */
  public static MusicAlbumProductionType.Builder musicAlbumProductionType() { return new MusicAlbumProductionType.Builder(); }
  /**
   * The act of discovering/finding an object.
   */
  public static DiscoverAction.Builder discoverAction() { return new DiscoverAction.Builder(); }
  /**
   * Event type: Sports event.
   */
  public static SportsEvent.Builder sportsEvent() { return new SportsEvent.Builder(); }
  /**
   * A courthouse.
   */
  public static Courthouse.Builder courthouse() { return new Courthouse.Builder(); }
  /**
   * A recipe.
   */
  public static Recipe.Builder recipe() { return new Recipe.Builder(); }
  /**
   * A means for accessing a service, e.g. a government office location, web site, or phone number.
   */
  public static ServiceChannel.Builder serviceChannel() { return new ServiceChannel.Builder(); }
  /**
   * A legislative building&#x2014;for example, the state capitol.
   */
  public static LegislativeBuilding.Builder legislativeBuilding() { return new LegislativeBuilding.Builder(); }
  /**
   * Anatomical features that can be observed by sight (without dissection), including the form and proportions of the human body as well as surface landmarks that correspond to deeper subcutaneous structures. Superficial anatomy plays an important role in sports medicine, phlebotomy, and other medical specialties as underlying anatomical structures can be identified through surface palpation. For example, during back surgery, superficial anatomy can be used to palpate and count vertebrae to find the site of incision. Or in phlebotomy, superficial anatomy can be used to locate an underlying vein; for example, the median cubital vein can be located by palpating the borders of the cubital fossa (such as the epicondyles of the humerus) and then looking for the superficial signs of the vein, such as size, prominence, ability to refill after depression, and feel of surrounding tissue support. As another example, in a subluxation (dislocation) of the glenohumeral joint, the bony structure becomes pronounced with the deltoid muscle failing to cover the glenohumeral joint allowing the edges of the scapula to be superficially visible. Here, the superficial anatomy is the visible edges of the scapula, implying the underlying dislocation of the joint (the related anatomical structure).
   */
  public static SuperficialAnatomy.Builder superficialAnatomy() { return new SuperficialAnatomy.Builder(); }
  /**
   * Indicates whether this game is multi-player, co-op or single-player.
   */
  public static GamePlayMode.Builder gamePlayMode() { return new GamePlayMode.Builder(); }
  /**
   * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
   */
  public static Rating.Builder rating() { return new Rating.Builder(); }
  /**
   * A moving company.
   */
  public static MovingCompany.Builder movingCompany() { return new MovingCompany.Builder(); }
  /**
   * Any recommendation made by a standard society (e.g. ACC/AHA) or consensus statement that denotes how to diagnose and treat a particular condition. Note: this type should be used to tag the actual guideline recommendation; if the guideline recommendation occurs in a larger scholarly article, use MedicalScholarlyArticle to tag the overall article, not this type. Note also: the organization making the recommendation should be captured in the recognizingAuthority base property of MedicalEntity.
   */
  public static MedicalGuideline.Builder medicalGuideline() { return new MedicalGuideline.Builder(); }
  /**
   * Any indication of the existence of a medical condition or disease that is apparent to the patient.
   */
  public static MedicalSymptom.Builder medicalSymptom() { return new MedicalSymptom.Builder(); }
  /**
   * A pet store.
   */
  public static PetStore.Builder petStore() { return new PetStore.Builder(); }
  /**
   * A construction business.
   */
  public static HomeAndConstructionBusiness.Builder homeAndConstructionBusiness() { return new HomeAndConstructionBusiness.Builder(); }
  /**
   * The act of responding to a question/message asked/sent by the object. Related to <a href="AskAction">AskAction</a>.<p>Related actions:</p><ul><li><a href="http://schema.org/AskAction">AskAction</a>: Appears generally as an origin of a ReplyAction</li></ul>.
   */
  public static ReplyAction.Builder replyAction() { return new ReplyAction.Builder(); }
  /**
   *  A point value or interval for product characteristics and other purposes.
   */
  public static QuantitativeValue.Builder quantitativeValue() { return new QuantitativeValue.Builder(); }
  /**
   * Any medical imaging modality typically used for diagnostic purposes. Enumerated type.
   */
  public static MedicalImagingTechnique.Builder medicalImagingTechnique() { return new MedicalImagingTechnique.Builder(); }
  /**
   * The act of participating in performance arts.
   */
  public static PerformAction.Builder performAction() { return new PerformAction.Builder(); }
  /**
   * Event type: Theater performance.
   */
  public static TheaterEvent.Builder theaterEvent() { return new TheaterEvent.Builder(); }
  /**
   * A canal, like the Panama Canal.
   */
  public static Canal.Builder canal() { return new Canal.Builder(); }
  /**
   * Enumerations related to health and the practice of medicine.
   */
  public static MedicalEnumeration.Builder medicalEnumeration() { return new MedicalEnumeration.Builder(); }
  /**
   * Properties that take Energy as values are of the form '&lt;Number&gt; &lt;Energy unit of measure&gt;'.
   */
  public static Energy.Builder energy() { return new Energy.Builder(); }
  /**
   * A blog.
   */
  public static Blog.Builder blog() { return new Blog.Builder(); }
  /**
   * A piece of sculpture.
   */
  public static Sculpture.Builder sculpture() { return new Sculpture.Builder(); }
  /**
   * A business entity type is a conceptual entity representing the legal form, the size, the main line of business, the position in the value chain, or any combination thereof, of an organization or business person.
<br />
    Commonly used values:<br />
<br />
    http://purl.org/goodrelations/v1#Business <br />
    http://purl.org/goodrelations/v1#Enduser <br />
    http://purl.org/goodrelations/v1#PublicInstitution <br />
    http://purl.org/goodrelations/v1#Reseller <br />

        
   */
  public static BusinessEntityType.Builder businessEntityType() { return new BusinessEntityType.Builder(); }
  /**
   * An event venue.
   */
  public static EventVenue.Builder eventVenue() { return new EventVenue.Builder(); }
  /**
   * The act of arriving at a place. An agent arrives at a destination from an fromLocation, optionally with participants.
   */
  public static ArriveAction.Builder arriveAction() { return new ArriveAction.Builder(); }
  /**
   * Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.
   */
  public static MedicalCondition.Builder medicalCondition() { return new MedicalCondition.Builder(); }
  /**
   * A subway station.
   */
  public static SubwayStation.Builder subwayStation() { return new SubwayStation.Builder(); }
  /**
   * A guideline recommendation that is regarded as efficacious and where quality of the data supporting the recommendation is sound.
   */
  public static MedicalGuidelineRecommendation.Builder medicalGuidelineRecommendation() { return new MedicalGuidelineRecommendation.Builder(); }
  /**
   * A river (for example, the broad majestic Shannon).
   */
  public static RiverBodyOfWater.Builder riverBodyOfWater() { return new RiverBodyOfWater.Builder(); }
  /**
   * A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document.
   */
  public static Question.Builder question() { return new Question.Builder(); }
  /**
   * Categories of physical activity, organized by physiologic classification.
   */
  public static PhysicalActivityCategory.Builder physicalActivityCategory() { return new PhysicalActivityCategory.Builder(); }
  /**
   * The act of notifying an event organizer as to whether you expect to attend the event.
   */
  public static RsvpAction.Builder rsvpAction() { return new RsvpAction.Builder(); }
  /**
   * An EducationalAudience.
   */
  public static EducationalAudience.Builder educationalAudience() { return new EducationalAudience.Builder(); }
  /**
   * An car dealership.
   */
  public static AutoDealer.Builder autoDealer() { return new AutoDealer.Builder(); }
  /**
   * A scholarly article in the medical domain.
   */
  public static MedicalScholarlyArticle.Builder medicalScholarlyArticle() { return new MedicalScholarlyArticle.Builder(); }
  /**
   * A table on a Web page.
   */
  public static Table.Builder table() { return new Table.Builder(); }
  /**
   * The act of interacting with another person or organization.
   */
  public static InteractAction.Builder interactAction() { return new InteractAction.Builder(); }
  /**
   * A tire shop.
   */
  public static TireShop.Builder tireShop() { return new TireShop.Builder(); }
  /**
   * A city hall.
   */
  public static CityHall.Builder cityHall() { return new CityHall.Builder(); }
  /**
   * A series of movies. Included movies can be indicated with the hasPart property.
   */
  public static MovieSeries.Builder movieSeries() { return new MovieSeries.Builder(); }
  /**
   * Accountancy business.
   */
  public static AccountingService.Builder accountingService() { return new AccountingService.Builder(); }
  /**
   * A product taken by mouth that contains a dietary ingredient intended to supplement the diet. Dietary ingredients may include vitamins, minerals, herbs or other botanicals, amino acids, and substances such as enzymes, organ tissues, glandulars and metabolites.
   */
  public static DietarySupplement.Builder dietarySupplement() { return new DietarySupplement.Builder(); }
  /**
   * The price for the delivery of an offer using a particular delivery method.
   */
  public static DeliveryChargeSpecification.Builder deliveryChargeSpecification() { return new DeliveryChargeSpecification.Builder(); }
  /**
   * Event type: Sales event.
   */
  public static SaleEvent.Builder saleEvent() { return new SaleEvent.Builder(); }
  /**
   * A risk factor is anything that increases a person's likelihood of developing or contracting a disease, medical condition, or complication.
   */
  public static MedicalRiskFactor.Builder medicalRiskFactor() { return new MedicalRiskFactor.Builder(); }
  /**
   * The act of physically/electronically taking delivery of an object thathas been transferred from an origin to a destination. Reciprocal of SendAction.<p>Related actions:</p><ul><li><a href="http://schema.org/SendAction">SendAction</a>: The reciprocal of ReceiveAction.</li><li><a href="http://schema.org/TakeAction">TakeAction</a>: Unlike TakeAction, ReceiveAction does not imply that the ownership has been transfered (e.g. I can receive a package, but it does not mean the package is now mine)</li></ul>.
   */
  public static ReceiveAction.Builder receiveAction() { return new ReceiveAction.Builder(); }
  /**
   * The act of planning the execution of an event/task/action/reservation/plan to a future date.
   */
  public static PlanAction.Builder planAction() { return new PlanAction.Builder(); }
  /**
   * A church.
   */
  public static Church.Builder church() { return new Church.Builder(); }
  /**
   * A music store.
   */
  public static MusicStore.Builder musicStore() { return new MusicStore.Builder(); }
  /**
   * The act of accomplishing something via     previous efforts. It is an instantaneous action rather than an ongoing     process.
   */
  public static AchieveAction.Builder achieveAction() { return new AchieveAction.Builder(); }
  /**
   * A comedy club.
   */
  public static ComedyClub.Builder comedyClub() { return new ComedyClub.Builder(); }
  /**
   * A store that sells reading glasses and similar devices for improving vision.
   */
  public static Optician.Builder optician() { return new Optician.Builder(); }
  /**
   * A musical composition.
   */
  public static MusicComposition.Builder musicComposition() { return new MusicComposition.Builder(); }
  /**
   * The act of transferring ownership of an object to a destination. Reciprocal of TakeAction.<p>Related actions:</p><ul><li><a href="http://schema.org/TakeAction">TakeAction</a>: Reciprocal of GiveAction.</li><li><a href="http://schema.org/SendAction">SendAction</a>: Unlike SendAction, GiveAction implies that ownership is being transferred (e.g. I may send my laptop to you, but that doesn't mean I'm giving it to you)</li></ul>.
   */
  public static GiveAction.Builder giveAction() { return new GiveAction.Builder(); }
  /**
   * A playground.
   */
  public static Playground.Builder playground() { return new Playground.Builder(); }
  /**
   * Fitness-related activity designed for a specific health-related purpose, including defined exercise routines as well as activity prescribed by a clinician.
   */
  public static ExercisePlan.Builder exercisePlan() { return new ExercisePlan.Builder(); }
  /**
   * The delivery of a parcel either via the postal service or a commercial service.
   */
  public static ParcelDelivery.Builder parcelDelivery() { return new ParcelDelivery.Builder(); }
  /**
   * A stage of a medical condition, such as 'Stage IIIa'.
   */
  public static MedicalConditionStage.Builder medicalConditionStage() { return new MedicalConditionStage.Builder(); }
  /**
   * A list of possible conditions for the item.
   */
  public static OfferItemCondition.Builder offerItemCondition() { return new OfferItemCondition.Builder(); }
  /**
   * The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another.
   */
  public static TransferAction.Builder transferAction() { return new TransferAction.Builder(); }
  /**
   * Event type: Comedy event.
   */
  public static ComedyEvent.Builder comedyEvent() { return new ComedyEvent.Builder(); }
  /**
   * A business that provide Heating, Ventilation and Air Conditioning services.
   */
  public static HVACBusiness.Builder hVACBusiness() { return new HVACBusiness.Builder(); }
  /**
   * A city or town.
   */
  public static City.Builder city() { return new City.Builder(); }
  /**
   * Residence type: Single-family home.
   */
  public static SingleFamilyResidence.Builder singleFamilyResidence() { return new SingleFamilyResidence.Builder(); }
  /**
   * Categories of medical devices, organized by the purpose or intended use of the device.
   */
  public static MedicalDevicePurpose.Builder medicalDevicePurpose() { return new MedicalDevicePurpose.Builder(); }
  /**
   * A review of an item - for example, of a restaurant, movie, or store.
   */
  public static Review.Builder review() { return new Review.Builder(); }
  /**
   * A motorcycle dealer.
   */
  public static MotorcycleDealer.Builder motorcycleDealer() { return new MotorcycleDealer.Builder(); }
  /**
   * A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device.
   */
  public static VideoGame.Builder videoGame() { return new VideoGame.Builder(); }
  /**
   * A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
   */
  public static WarrantyPromise.Builder warrantyPromise() { return new WarrantyPromise.Builder(); }
  /**
   * CreativeWorkSeries dedicated to radio broadcast and associated online delivery.
   */
  public static RadioSeries.Builder radioSeries() { return new RadioSeries.Builder(); }
  /**
   * A credit or debit card type as a standardized procedure for transferring the monetary amount for a purchase.
<br />
    Commonly used values:<br />
<br />
    http://purl.org/goodrelations/v1#AmericanExpress <br />
    http://purl.org/goodrelations/v1#DinersClub <br />
    http://purl.org/goodrelations/v1#Discover <br />
    http://purl.org/goodrelations/v1#JCB <br />
    http://purl.org/goodrelations/v1#MasterCard <br />
    http://purl.org/goodrelations/v1#VISA <br />
        
   */
  public static CreditCard.Builder creditCard() { return new CreditCard.Builder(); }

  public static ThingBuilder getBuilder(@NotNull String type) {
    if ("LymphaticVessel".equals(type)) { return new LymphaticVessel.Builder(); }
    if ("ConfirmAction".equals(type)) { return new ConfirmAction.Builder(); }
    if ("ListItem".equals(type)) { return new ListItem.Builder(); }
    if ("TVSeries".equals(type)) { return new TVSeries.Builder(); }
    if ("VisualArtwork".equals(type)) { return new VisualArtwork.Builder(); }
    if ("DriveWheelConfigurationValue".equals(type)) { return new DriveWheelConfigurationValue.Builder(); }
    if ("Service".equals(type)) { return new Service.Builder(); }
    if ("AlignmentObject".equals(type)) { return new AlignmentObject.Builder(); }
    if ("AnimalShelter".equals(type)) { return new AnimalShelter.Builder(); }
    if ("FastFoodRestaurant".equals(type)) { return new FastFoodRestaurant.Builder(); }
    if ("AmusementPark".equals(type)) { return new AmusementPark.Builder(); }
    if ("AddAction".equals(type)) { return new AddAction.Builder(); }
    if ("PeopleAudience".equals(type)) { return new PeopleAudience.Builder(); }
    if ("BarOrPub".equals(type)) { return new BarOrPub.Builder(); }
    if ("TVSeason".equals(type)) { return new TVSeason.Builder(); }
    if ("MedicalRiskCalculator".equals(type)) { return new MedicalRiskCalculator.Builder(); }
    if ("CommentAction".equals(type)) { return new CommentAction.Builder(); }
    if ("CreateAction".equals(type)) { return new CreateAction.Builder(); }
    if ("Permit".equals(type)) { return new Permit.Builder(); }
    if ("RejectAction".equals(type)) { return new RejectAction.Builder(); }
    if ("AppendAction".equals(type)) { return new AppendAction.Builder(); }
    if ("Duration".equals(type)) { return new Duration.Builder(); }
    if ("InsuranceAgency".equals(type)) { return new InsuranceAgency.Builder(); }
    if ("TieAction".equals(type)) { return new TieAction.Builder(); }
    if ("GeoCoordinates".equals(type)) { return new GeoCoordinates.Builder(); }
    if ("Joint".equals(type)) { return new Joint.Builder(); }
    if ("GardenStore".equals(type)) { return new GardenStore.Builder(); }
    if ("ChildrensEvent".equals(type)) { return new ChildrensEvent.Builder(); }
    if ("MedicalTest".equals(type)) { return new MedicalTest.Builder(); }
    if ("QualitativeValue".equals(type)) { return new QualitativeValue.Builder(); }
    if ("TouristAttraction".equals(type)) { return new TouristAttraction.Builder(); }
    if ("BookmarkAction".equals(type)) { return new BookmarkAction.Builder(); }
    if ("DrugPregnancyCategory".equals(type)) { return new DrugPregnancyCategory.Builder(); }
    if ("BroadcastChannel".equals(type)) { return new BroadcastChannel.Builder(); }
    if ("UnRegisterAction".equals(type)) { return new UnRegisterAction.Builder(); }
    if ("Continent".equals(type)) { return new Continent.Builder(); }
    if ("DeleteAction".equals(type)) { return new DeleteAction.Builder(); }
    if ("WebPage".equals(type)) { return new WebPage.Builder(); }
    if ("BusStation".equals(type)) { return new BusStation.Builder(); }
    if ("Taxi".equals(type)) { return new Taxi.Builder(); }
    if ("BookFormatType".equals(type)) { return new BookFormatType.Builder(); }
    if ("ResumeAction".equals(type)) { return new ResumeAction.Builder(); }
    if ("AnatomicalSystem".equals(type)) { return new AnatomicalSystem.Builder(); }
    if ("EatAction".equals(type)) { return new EatAction.Builder(); }
    if ("CommunicateAction".equals(type)) { return new CommunicateAction.Builder(); }
    if ("Periodical".equals(type)) { return new Periodical.Builder(); }
    if ("Airport".equals(type)) { return new Airport.Builder(); }
    if ("GroceryStore".equals(type)) { return new GroceryStore.Builder(); }
    if ("EndorseAction".equals(type)) { return new EndorseAction.Builder(); }
    if ("PostalAddress".equals(type)) { return new PostalAddress.Builder(); }
    if ("TravelAgency".equals(type)) { return new TravelAgency.Builder(); }
    if ("ProfilePage".equals(type)) { return new ProfilePage.Builder(); }
    if ("RoofingContractor".equals(type)) { return new RoofingContractor.Builder(); }
    if ("ParkingFacility".equals(type)) { return new ParkingFacility.Builder(); }
    if ("Casino".equals(type)) { return new Casino.Builder(); }
    if ("ImageObject".equals(type)) { return new ImageObject.Builder(); }
    if ("BusReservation".equals(type)) { return new BusReservation.Builder(); }
    if ("Pond".equals(type)) { return new Pond.Builder(); }
    if ("SeaBodyOfWater".equals(type)) { return new SeaBodyOfWater.Builder(); }
    if ("FlightReservation".equals(type)) { return new FlightReservation.Builder(); }
    if ("ClothingStore".equals(type)) { return new ClothingStore.Builder(); }
    if ("AutoWash".equals(type)) { return new AutoWash.Builder(); }
    if ("ComputerStore".equals(type)) { return new ComputerStore.Builder(); }
    if ("Code".equals(type)) { return new Code.Builder(); }
    if ("Mountain".equals(type)) { return new Mountain.Builder(); }
    if ("MusicRecording".equals(type)) { return new MusicRecording.Builder(); }
    if ("InsertAction".equals(type)) { return new InsertAction.Builder(); }
    if ("TakeAction".equals(type)) { return new TakeAction.Builder(); }
    if ("MusicVideoObject".equals(type)) { return new MusicVideoObject.Builder(); }
    if ("TrainReservation".equals(type)) { return new TrainReservation.Builder(); }
    if ("WatchAction".equals(type)) { return new WatchAction.Builder(); }
    if ("PostOffice".equals(type)) { return new PostOffice.Builder(); }
    if ("PublicationIssue".equals(type)) { return new PublicationIssue.Builder(); }
    if ("Language".equals(type)) { return new Language.Builder(); }
    if ("Country".equals(type)) { return new Country.Builder(); }
    if ("DoseSchedule".equals(type)) { return new DoseSchedule.Builder(); }
    if ("AdministrativeArea".equals(type)) { return new AdministrativeArea.Builder(); }
    if ("SellAction".equals(type)) { return new SellAction.Builder(); }
    if ("PreventionIndication".equals(type)) { return new PreventionIndication.Builder(); }
    if ("UserDownloads".equals(type)) { return new UserDownloads.Builder(); }
    if ("BreadcrumbList".equals(type)) { return new BreadcrumbList.Builder(); }
    if ("DataCatalog".equals(type)) { return new DataCatalog.Builder(); }
    if ("OrderAction".equals(type)) { return new OrderAction.Builder(); }
    if ("EventReservation".equals(type)) { return new EventReservation.Builder(); }
    if ("MusicGroup".equals(type)) { return new MusicGroup.Builder(); }
    if ("LodgingReservation".equals(type)) { return new LodgingReservation.Builder(); }
    if ("UserComments".equals(type)) { return new UserComments.Builder(); }
    if ("UnitPriceSpecification".equals(type)) { return new UnitPriceSpecification.Builder(); }
    if ("SteeringPositionValue".equals(type)) { return new SteeringPositionValue.Builder(); }
    if ("AcceptAction".equals(type)) { return new AcceptAction.Builder(); }
    if ("Museum".equals(type)) { return new Museum.Builder(); }
    if ("SocialEvent".equals(type)) { return new SocialEvent.Builder(); }
    if ("LiteraryEvent".equals(type)) { return new LiteraryEvent.Builder(); }
    if ("HomeGoodsStore".equals(type)) { return new HomeGoodsStore.Builder(); }
    if ("AllocateAction".equals(type)) { return new AllocateAction.Builder(); }
    if ("WPSideBar".equals(type)) { return new WPSideBar.Builder(); }
    if ("School".equals(type)) { return new School.Builder(); }
    if ("CreativeWorkSeries".equals(type)) { return new CreativeWorkSeries.Builder(); }
    if ("DayOfWeek".equals(type)) { return new DayOfWeek.Builder(); }
    if ("TreatmentIndication".equals(type)) { return new TreatmentIndication.Builder(); }
    if ("TrainTrip".equals(type)) { return new TrainTrip.Builder(); }
    if ("HardwareStore".equals(type)) { return new HardwareStore.Builder(); }
    if ("ScreeningEvent".equals(type)) { return new ScreeningEvent.Builder(); }
    if ("MusicRelease".equals(type)) { return new MusicRelease.Builder(); }
    if ("Electrician".equals(type)) { return new Electrician.Builder(); }
    if ("Beach".equals(type)) { return new Beach.Builder(); }
    if ("WebApplication".equals(type)) { return new WebApplication.Builder(); }
    if ("PropertyValueSpecification".equals(type)) { return new PropertyValueSpecification.Builder(); }
    if ("AutomatedTeller".equals(type)) { return new AutomatedTeller.Builder(); }
    if ("BusTrip".equals(type)) { return new BusTrip.Builder(); }
    if ("PriceSpecification".equals(type)) { return new PriceSpecification.Builder(); }
    if ("DislikeAction".equals(type)) { return new DislikeAction.Builder(); }
    if ("OceanBodyOfWater".equals(type)) { return new OceanBodyOfWater.Builder(); }
    if ("ApartmentComplex".equals(type)) { return new ApartmentComplex.Builder(); }
    if ("MedicalTrial".equals(type)) { return new MedicalTrial.Builder(); }
    if ("TattooParlor".equals(type)) { return new TattooParlor.Builder(); }
    if ("UserBlocks".equals(type)) { return new UserBlocks.Builder(); }
    if ("QAPage".equals(type)) { return new QAPage.Builder(); }
    if ("HobbyShop".equals(type)) { return new HobbyShop.Builder(); }
    if ("GeoShape".equals(type)) { return new GeoShape.Builder(); }
    if ("FilmAction".equals(type)) { return new FilmAction.Builder(); }
    if ("TherapeuticProcedure".equals(type)) { return new TherapeuticProcedure.Builder(); }
    if ("FireStation".equals(type)) { return new FireStation.Builder(); }
    if ("TelevisionStation".equals(type)) { return new TelevisionStation.Builder(); }
    if ("MedicalCause".equals(type)) { return new MedicalCause.Builder(); }
    if ("Event".equals(type)) { return new Event.Builder(); }
    if ("PaymentMethod".equals(type)) { return new PaymentMethod.Builder(); }
    if ("ElementarySchool".equals(type)) { return new ElementarySchool.Builder(); }
    if ("EventStatusType".equals(type)) { return new EventStatusType.Builder(); }
    if ("ImageGallery".equals(type)) { return new ImageGallery.Builder(); }
    if ("AuthorizeAction".equals(type)) { return new AuthorizeAction.Builder(); }
    if ("WPFooter".equals(type)) { return new WPFooter.Builder(); }
    if ("OutletStore".equals(type)) { return new OutletStore.Builder(); }
    if ("BikeStore".equals(type)) { return new BikeStore.Builder(); }
    if ("Artery".equals(type)) { return new Artery.Builder(); }
    if ("Notary".equals(type)) { return new Notary.Builder(); }
    if ("Mass".equals(type)) { return new Mass.Builder(); }
    if ("Demand".equals(type)) { return new Demand.Builder(); }
    if ("FoodEstablishmentReservation".equals(type)) { return new FoodEstablishmentReservation.Builder(); }
    if ("BusinessFunction".equals(type)) { return new BusinessFunction.Builder(); }
    if ("DanceGroup".equals(type)) { return new DanceGroup.Builder(); }
    if ("DDxElement".equals(type)) { return new DDxElement.Builder(); }
    if ("CollectionPage".equals(type)) { return new CollectionPage.Builder(); }
    if ("Mosque".equals(type)) { return new Mosque.Builder(); }
    if ("Intangible".equals(type)) { return new Intangible.Builder(); }
    if ("Episode".equals(type)) { return new Episode.Builder(); }
    if ("Invoice".equals(type)) { return new Invoice.Builder(); }
    if ("Project".equals(type)) { return new Project.Builder(); }
    if ("RecyclingCenter".equals(type)) { return new RecyclingCenter.Builder(); }
    if ("MaximumDoseSchedule".equals(type)) { return new MaximumDoseSchedule.Builder(); }
    if ("MobileApplication".equals(type)) { return new MobileApplication.Builder(); }
    if ("SoftwareApplication".equals(type)) { return new SoftwareApplication.Builder(); }
    if ("ControlAction".equals(type)) { return new ControlAction.Builder(); }
    if ("RadioChannel".equals(type)) { return new RadioChannel.Builder(); }
    if ("CableOrSatelliteService".equals(type)) { return new CableOrSatelliteService.Builder(); }
    if ("Property".equals(type)) { return new Property.Builder(); }
    if ("CafeOrCoffeeShop".equals(type)) { return new CafeOrCoffeeShop.Builder(); }
    if ("Library".equals(type)) { return new Library.Builder(); }
    if ("MedicalObservationalStudyDesign".equals(type)) { return new MedicalObservationalStudyDesign.Builder(); }
    if ("FindAction".equals(type)) { return new FindAction.Builder(); }
    if ("PrependAction".equals(type)) { return new PrependAction.Builder(); }
    if ("BloodTest".equals(type)) { return new BloodTest.Builder(); }
    if ("LikeAction".equals(type)) { return new LikeAction.Builder(); }
    if ("BeautySalon".equals(type)) { return new BeautySalon.Builder(); }
    if ("GovernmentOrganization".equals(type)) { return new GovernmentOrganization.Builder(); }
    if ("RsvpResponseType".equals(type)) { return new RsvpResponseType.Builder(); }
    if ("BrainStructure".equals(type)) { return new BrainStructure.Builder(); }
    if ("EmployeeRole".equals(type)) { return new EmployeeRole.Builder(); }
    if ("MedicalAudience".equals(type)) { return new MedicalAudience.Builder(); }
    if ("MovieRentalStore".equals(type)) { return new MovieRentalStore.Builder(); }
    if ("GameServer".equals(type)) { return new GameServer.Builder(); }
    if ("Car".equals(type)) { return new Car.Builder(); }
    if ("Crematorium".equals(type)) { return new Crematorium.Builder(); }
    if ("BankOrCreditUnion".equals(type)) { return new BankOrCreditUnion.Builder(); }
    if ("QuoteAction".equals(type)) { return new QuoteAction.Builder(); }
    if ("SendAction".equals(type)) { return new SendAction.Builder(); }
    if ("Physician".equals(type)) { return new Physician.Builder(); }
    if ("Nerve".equals(type)) { return new Nerve.Builder(); }
    if ("Attorney".equals(type)) { return new Attorney.Builder(); }
    if ("ImagingTest".equals(type)) { return new ImagingTest.Builder(); }
    if ("OnDemandEvent".equals(type)) { return new OnDemandEvent.Builder(); }
    if ("MedicalEntity".equals(type)) { return new MedicalEntity.Builder(); }
    if ("GolfCourse".equals(type)) { return new GolfCourse.Builder(); }
    if ("RentAction".equals(type)) { return new RentAction.Builder(); }
    if ("ReportedDoseSchedule".equals(type)) { return new ReportedDoseSchedule.Builder(); }
    if ("Enumeration".equals(type)) { return new Enumeration.Builder(); }
    if ("Hospital".equals(type)) { return new Hospital.Builder(); }
    if ("Thing".equals(type)) { return new Thing.Builder(); }
    if ("FurnitureStore".equals(type)) { return new FurnitureStore.Builder(); }
    if ("VisualArtsEvent".equals(type)) { return new VisualArtsEvent.Builder(); }
    if ("ChooseAction".equals(type)) { return new ChooseAction.Builder(); }
    if ("SportingGoodsStore".equals(type)) { return new SportingGoodsStore.Builder(); }
    if ("MedicalDevice".equals(type)) { return new MedicalDevice.Builder(); }
    if ("NGO".equals(type)) { return new NGO.Builder(); }
    if ("BlogPosting".equals(type)) { return new BlogPosting.Builder(); }
    if ("Reservoir".equals(type)) { return new Reservoir.Builder(); }
    if ("AutomotiveBusiness".equals(type)) { return new AutomotiveBusiness.Builder(); }
    if ("AutoRental".equals(type)) { return new AutoRental.Builder(); }
    if ("WPAdBlock".equals(type)) { return new WPAdBlock.Builder(); }
    if ("OrganizeAction".equals(type)) { return new OrganizeAction.Builder(); }
    if ("BedAndBreakfast".equals(type)) { return new BedAndBreakfast.Builder(); }
    if ("PlayAction".equals(type)) { return new PlayAction.Builder(); }
    if ("LifestyleModification".equals(type)) { return new LifestyleModification.Builder(); }
    if ("UserPageVisits".equals(type)) { return new UserPageVisits.Builder(); }
    if ("AdultEntertainment".equals(type)) { return new AdultEntertainment.Builder(); }
    if ("CookAction".equals(type)) { return new CookAction.Builder(); }
    if ("Aquarium".equals(type)) { return new Aquarium.Builder(); }
    if ("Hotel".equals(type)) { return new Hotel.Builder(); }
    if ("EmergencyService".equals(type)) { return new EmergencyService.Builder(); }
    if ("Map".equals(type)) { return new Map.Builder(); }
    if ("OrderStatus".equals(type)) { return new OrderStatus.Builder(); }
    if ("TypeAndQuantityNode".equals(type)) { return new TypeAndQuantityNode.Builder(); }
    if ("CarUsageType".equals(type)) { return new CarUsageType.Builder(); }
    if ("VideoGallery".equals(type)) { return new VideoGallery.Builder(); }
    if ("Photograph".equals(type)) { return new Photograph.Builder(); }
    if ("Dataset".equals(type)) { return new Dataset.Builder(); }
    if ("AutoBodyShop".equals(type)) { return new AutoBodyShop.Builder(); }
    if ("AutoPartsStore".equals(type)) { return new AutoPartsStore.Builder(); }
    if ("HealthAndBeautyBusiness".equals(type)) { return new HealthAndBeautyBusiness.Builder(); }
    if ("PhotographAction".equals(type)) { return new PhotographAction.Builder(); }
    if ("CheckoutPage".equals(type)) { return new CheckoutPage.Builder(); }
    if ("MedicalStudyStatus".equals(type)) { return new MedicalStudyStatus.Builder(); }
    if ("Zoo".equals(type)) { return new Zoo.Builder(); }
    if ("PlaceOfWorship".equals(type)) { return new PlaceOfWorship.Builder(); }
    if ("MapCategoryType".equals(type)) { return new MapCategoryType.Builder(); }
    if ("FollowAction".equals(type)) { return new FollowAction.Builder(); }
    if ("InformAction".equals(type)) { return new InformAction.Builder(); }
    if ("Residence".equals(type)) { return new Residence.Builder(); }
    if ("MusicEvent".equals(type)) { return new MusicEvent.Builder(); }
    if ("ConsumeAction".equals(type)) { return new ConsumeAction.Builder(); }
    if ("AudioObject".equals(type)) { return new AudioObject.Builder(); }
    if ("TaxiService".equals(type)) { return new TaxiService.Builder(); }
    if ("WantAction".equals(type)) { return new WantAction.Builder(); }
    if ("State".equals(type)) { return new State.Builder(); }
    if ("OwnershipInfo".equals(type)) { return new OwnershipInfo.Builder(); }
    if ("AnatomicalStructure".equals(type)) { return new AnatomicalStructure.Builder(); }
    if ("LendAction".equals(type)) { return new LendAction.Builder(); }
    if ("Airline".equals(type)) { return new Airline.Builder(); }
    if ("NewsArticle".equals(type)) { return new NewsArticle.Builder(); }
    if ("MiddleSchool".equals(type)) { return new MiddleSchool.Builder(); }
    if ("MusicAlbumReleaseType".equals(type)) { return new MusicAlbumReleaseType.Builder(); }
    if ("TVEpisode".equals(type)) { return new TVEpisode.Builder(); }
    if ("StadiumOrArena".equals(type)) { return new StadiumOrArena.Builder(); }
    if ("MedicalGuidelineContraindication".equals(type)) { return new MedicalGuidelineContraindication.Builder(); }
    if ("MedicalIntangible".equals(type)) { return new MedicalIntangible.Builder(); }
    if ("Specialty".equals(type)) { return new Specialty.Builder(); }
    if ("Vessel".equals(type)) { return new Vessel.Builder(); }
    if ("SportsOrganization".equals(type)) { return new SportsOrganization.Builder(); }
    if ("IgnoreAction".equals(type)) { return new IgnoreAction.Builder(); }
    if ("UserCheckins".equals(type)) { return new UserCheckins.Builder(); }
    if ("Role".equals(type)) { return new Role.Builder(); }
    if ("FoodEvent".equals(type)) { return new FoodEvent.Builder(); }
    if ("TravelAction".equals(type)) { return new TravelAction.Builder(); }
    if ("SubscribeAction".equals(type)) { return new SubscribeAction.Builder(); }
    if ("RadioClip".equals(type)) { return new RadioClip.Builder(); }
    if ("Brand".equals(type)) { return new Brand.Builder(); }
    if ("ItemList".equals(type)) { return new ItemList.Builder(); }
    if ("SkiResort".equals(type)) { return new SkiResort.Builder(); }
    if ("ContactPoint".equals(type)) { return new ContactPoint.Builder(); }
    if ("DonateAction".equals(type)) { return new DonateAction.Builder(); }
    if ("IndividualProduct".equals(type)) { return new IndividualProduct.Builder(); }
    if ("MobilePhoneStore".equals(type)) { return new MobilePhoneStore.Builder(); }
    if ("GovernmentBuilding".equals(type)) { return new GovernmentBuilding.Builder(); }
    if ("WearAction".equals(type)) { return new WearAction.Builder(); }
    if ("PhysicalActivity".equals(type)) { return new PhysicalActivity.Builder(); }
    if ("UserTweets".equals(type)) { return new UserTweets.Builder(); }
    if ("Action".equals(type)) { return new Action.Builder(); }
    if ("PaymentChargeSpecification".equals(type)) { return new PaymentChargeSpecification.Builder(); }
    if ("MedicalObservationalStudy".equals(type)) { return new MedicalObservationalStudy.Builder(); }
    if ("DisagreeAction".equals(type)) { return new DisagreeAction.Builder(); }
    if ("CheckInAction".equals(type)) { return new CheckInAction.Builder(); }
    if ("SiteNavigationElement".equals(type)) { return new SiteNavigationElement.Builder(); }
    if ("LoseAction".equals(type)) { return new LoseAction.Builder(); }
    if ("Person".equals(type)) { return new Person.Builder(); }
    if ("Article".equals(type)) { return new Article.Builder(); }
    if ("LiquorStore".equals(type)) { return new LiquorStore.Builder(); }
    if ("MedicalCode".equals(type)) { return new MedicalCode.Builder(); }
    if ("VideoGameClip".equals(type)) { return new VideoGameClip.Builder(); }
    if ("RVPark".equals(type)) { return new RVPark.Builder(); }
    if ("JoinAction".equals(type)) { return new JoinAction.Builder(); }
    if ("CancelAction".equals(type)) { return new CancelAction.Builder(); }
    if ("AboutPage".equals(type)) { return new AboutPage.Builder(); }
    if ("PropertyValue".equals(type)) { return new PropertyValue.Builder(); }
    if ("Painting".equals(type)) { return new Painting.Builder(); }
    if ("ShoppingCenter".equals(type)) { return new ShoppingCenter.Builder(); }
    if ("IceCreamShop".equals(type)) { return new IceCreamShop.Builder(); }
    if ("HinduTemple".equals(type)) { return new HinduTemple.Builder(); }
    if ("VoteAction".equals(type)) { return new VoteAction.Builder(); }
    if ("SelfStorage".equals(type)) { return new SelfStorage.Builder(); }
    if ("JobPosting".equals(type)) { return new JobPosting.Builder(); }
    if ("TaxiStand".equals(type)) { return new TaxiStand.Builder(); }
    if ("PalliativeProcedure".equals(type)) { return new PalliativeProcedure.Builder(); }
    if ("ConvenienceStore".equals(type)) { return new ConvenienceStore.Builder(); }
    if ("Waterfall".equals(type)) { return new Waterfall.Builder(); }
    if ("TheaterGroup".equals(type)) { return new TheaterGroup.Builder(); }
    if ("BowlingAlley".equals(type)) { return new BowlingAlley.Builder(); }
    if ("MedicalSign".equals(type)) { return new MedicalSign.Builder(); }
    if ("HairSalon".equals(type)) { return new HairSalon.Builder(); }
    if ("PoliceStation".equals(type)) { return new PoliceStation.Builder(); }
    if ("GatedResidenceCommunity".equals(type)) { return new GatedResidenceCommunity.Builder(); }
    if ("GameServerStatus".equals(type)) { return new GameServerStatus.Builder(); }
    if ("LandmarksOrHistoricalBuildings".equals(type)) { return new LandmarksOrHistoricalBuildings.Builder(); }
    if ("DryCleaningOrLaundry".equals(type)) { return new DryCleaningOrLaundry.Builder(); }
    if ("InviteAction".equals(type)) { return new InviteAction.Builder(); }
    if ("DanceEvent".equals(type)) { return new DanceEvent.Builder(); }
    if ("OfficeEquipmentStore".equals(type)) { return new OfficeEquipmentStore.Builder(); }
    if ("RadioSeason".equals(type)) { return new RadioSeason.Builder(); }
    if ("Pharmacy".equals(type)) { return new Pharmacy.Builder(); }
    if ("CatholicChurch".equals(type)) { return new CatholicChurch.Builder(); }
    if ("SuspendAction".equals(type)) { return new SuspendAction.Builder(); }
    if ("ReturnAction".equals(type)) { return new ReturnAction.Builder(); }
    if ("ExerciseGym".equals(type)) { return new ExerciseGym.Builder(); }
    if ("AggregateRating".equals(type)) { return new AggregateRating.Builder(); }
    if ("DepartAction".equals(type)) { return new DepartAction.Builder(); }
    if ("EducationEvent".equals(type)) { return new EducationEvent.Builder(); }
    if ("ItemAvailability".equals(type)) { return new ItemAvailability.Builder(); }
    if ("EntryPoint".equals(type)) { return new EntryPoint.Builder(); }
    if ("ProgramMembership".equals(type)) { return new ProgramMembership.Builder(); }
    if ("PathologyTest".equals(type)) { return new PathologyTest.Builder(); }
    if ("ReservationStatusType".equals(type)) { return new ReservationStatusType.Builder(); }
    if ("Game".equals(type)) { return new Game.Builder(); }
    if ("ProfessionalService".equals(type)) { return new ProfessionalService.Builder(); }
    if ("Vein".equals(type)) { return new Vein.Builder(); }
    if ("MedicalTrialDesign".equals(type)) { return new MedicalTrialDesign.Builder(); }
    if ("UpdateAction".equals(type)) { return new UpdateAction.Builder(); }
    if ("WarrantyScope".equals(type)) { return new WarrantyScope.Builder(); }
    if ("Plumber".equals(type)) { return new Plumber.Builder(); }
    if ("Bakery".equals(type)) { return new Bakery.Builder(); }
    if ("PublicationVolume".equals(type)) { return new PublicationVolume.Builder(); }
    if ("BuyAction".equals(type)) { return new BuyAction.Builder(); }
    if ("WebSite".equals(type)) { return new WebSite.Builder(); }
    if ("MensClothingStore".equals(type)) { return new MensClothingStore.Builder(); }
    if ("Locksmith".equals(type)) { return new Locksmith.Builder(); }
    if ("MusicAlbum".equals(type)) { return new MusicAlbum.Builder(); }
    if ("Corporation".equals(type)) { return new Corporation.Builder(); }
    if ("BodyOfWater".equals(type)) { return new BodyOfWater.Builder(); }
    if ("RealEstateAgent".equals(type)) { return new RealEstateAgent.Builder(); }
    if ("DrugLegalStatus".equals(type)) { return new DrugLegalStatus.Builder(); }
    if ("MedicalTestPanel".equals(type)) { return new MedicalTestPanel.Builder(); }
    if ("TennisComplex".equals(type)) { return new TennisComplex.Builder(); }
    if ("MusicVenue".equals(type)) { return new MusicVenue.Builder(); }
    if ("WholesaleStore".equals(type)) { return new WholesaleStore.Builder(); }
    if ("MedicalClinic".equals(type)) { return new MedicalClinic.Builder(); }
    if ("DrugStrength".equals(type)) { return new DrugStrength.Builder(); }
    if ("ShareAction".equals(type)) { return new ShareAction.Builder(); }
    if ("SportsActivityLocation".equals(type)) { return new SportsActivityLocation.Builder(); }
    if ("EmailMessage".equals(type)) { return new EmailMessage.Builder(); }
    if ("ParentAudience".equals(type)) { return new ParentAudience.Builder(); }
    if ("RadioEpisode".equals(type)) { return new RadioEpisode.Builder(); }
    if ("PublicationEvent".equals(type)) { return new PublicationEvent.Builder(); }
    if ("Organization".equals(type)) { return new Organization.Builder(); }
    if ("Order".equals(type)) { return new Order.Builder(); }
    if ("ViewAction".equals(type)) { return new ViewAction.Builder(); }
    if ("Clip".equals(type)) { return new Clip.Builder(); }
    if ("Comment".equals(type)) { return new Comment.Builder(); }
    if ("ApplyAction".equals(type)) { return new ApplyAction.Builder(); }
    if ("PerformingArtsTheater".equals(type)) { return new PerformingArtsTheater.Builder(); }
    if ("DeliveryEvent".equals(type)) { return new DeliveryEvent.Builder(); }
    if ("SoftwareApplicationBuild".equals(type)) { return new SoftwareApplicationBuild.Builder(); }
    if ("Campground".equals(type)) { return new Campground.Builder(); }
    if ("TelevisionChannel".equals(type)) { return new TelevisionChannel.Builder(); }
    if ("HousePainter".equals(type)) { return new HousePainter.Builder(); }
    if ("StructuredValue".equals(type)) { return new StructuredValue.Builder(); }
    if ("MedicalProcedureType".equals(type)) { return new MedicalProcedureType.Builder(); }
    if ("Cemetery".equals(type)) { return new Cemetery.Builder(); }
    if ("Seat".equals(type)) { return new Seat.Builder(); }
    if ("Movie".equals(type)) { return new Movie.Builder(); }
    if ("Hostel".equals(type)) { return new Hostel.Builder(); }
    if ("DrawAction".equals(type)) { return new DrawAction.Builder(); }
    if ("TradeAction".equals(type)) { return new TradeAction.Builder(); }
    if ("ExerciseAction".equals(type)) { return new ExerciseAction.Builder(); }
    if ("MedicalWebPage".equals(type)) { return new MedicalWebPage.Builder(); }
    if ("ActivateAction".equals(type)) { return new ActivateAction.Builder(); }
    if ("GasStation".equals(type)) { return new GasStation.Builder(); }
    if ("DeliveryMethod".equals(type)) { return new DeliveryMethod.Builder(); }
    if ("Flight".equals(type)) { return new Flight.Builder(); }
    if ("InstallAction".equals(type)) { return new InstallAction.Builder(); }
    if ("MedicalRiskScore".equals(type)) { return new MedicalRiskScore.Builder(); }
    if ("UserPlays".equals(type)) { return new UserPlays.Builder(); }
    if ("ArtGallery".equals(type)) { return new ArtGallery.Builder(); }
    if ("AskAction".equals(type)) { return new AskAction.Builder(); }
    if ("RegisterAction".equals(type)) { return new RegisterAction.Builder(); }
    if ("AssessAction".equals(type)) { return new AssessAction.Builder(); }
    if ("ApprovedIndication".equals(type)) { return new ApprovedIndication.Builder(); }
    if ("Festival".equals(type)) { return new Festival.Builder(); }
    if ("GeneralContractor".equals(type)) { return new GeneralContractor.Builder(); }
    if ("NailSalon".equals(type)) { return new NailSalon.Builder(); }
    if ("Series".equals(type)) { return new Series.Builder(); }
    if ("Park".equals(type)) { return new Park.Builder(); }
    if ("BorrowAction".equals(type)) { return new BorrowAction.Builder(); }
    if ("BoardingPolicyType".equals(type)) { return new BoardingPolicyType.Builder(); }
    if ("Dentist".equals(type)) { return new Dentist.Builder(); }
    if ("PhysicalTherapy".equals(type)) { return new PhysicalTherapy.Builder(); }
    if ("WebPageElement".equals(type)) { return new WebPageElement.Builder(); }
    if ("MusicPlaylist".equals(type)) { return new MusicPlaylist.Builder(); }
    if ("CheckOutAction".equals(type)) { return new CheckOutAction.Builder(); }
    if ("ItemListOrderType".equals(type)) { return new ItemListOrderType.Builder(); }
    if ("Store".equals(type)) { return new Store.Builder(); }
    if ("SearchAction".equals(type)) { return new SearchAction.Builder(); }
    if ("MovieClip".equals(type)) { return new MovieClip.Builder(); }
    if ("Embassy".equals(type)) { return new Embassy.Builder(); }
    if ("EducationalOrganization".equals(type)) { return new EducationalOrganization.Builder(); }
    if ("ParcelService".equals(type)) { return new ParcelService.Builder(); }
    if ("MedicalOrganization".equals(type)) { return new MedicalOrganization.Builder(); }
    if ("CollegeOrUniversity".equals(type)) { return new CollegeOrUniversity.Builder(); }
    if ("BefriendAction".equals(type)) { return new BefriendAction.Builder(); }
    if ("DrinkAction".equals(type)) { return new DrinkAction.Builder(); }
    if ("MusicReleaseFormatType".equals(type)) { return new MusicReleaseFormatType.Builder(); }
    if ("MedicalProcedure".equals(type)) { return new MedicalProcedure.Builder(); }
    if ("GovernmentPermit".equals(type)) { return new GovernmentPermit.Builder(); }
    if ("BookSeries".equals(type)) { return new BookSeries.Builder(); }
    if ("SportsClub".equals(type)) { return new SportsClub.Builder(); }
    if ("DrugClass".equals(type)) { return new DrugClass.Builder(); }
    if ("RentalCarReservation".equals(type)) { return new RentalCarReservation.Builder(); }
    if ("PublicSwimmingPool".equals(type)) { return new PublicSwimmingPool.Builder(); }
    if ("Quantity".equals(type)) { return new Quantity.Builder(); }
    if ("UserLikes".equals(type)) { return new UserLikes.Builder(); }
    if ("Muscle".equals(type)) { return new Muscle.Builder(); }
    if ("EmploymentAgency".equals(type)) { return new EmploymentAgency.Builder(); }
    if ("WinAction".equals(type)) { return new WinAction.Builder(); }
    if ("BookStore".equals(type)) { return new BookStore.Builder(); }
    if ("Season".equals(type)) { return new Season.Builder(); }
    if ("Reservation".equals(type)) { return new Reservation.Builder(); }
    if ("ActionStatusType".equals(type)) { return new ActionStatusType.Builder(); }
    if ("OpeningHoursSpecification".equals(type)) { return new OpeningHoursSpecification.Builder(); }
    if ("MedicalIndication".equals(type)) { return new MedicalIndication.Builder(); }
    if ("AggregateOffer".equals(type)) { return new AggregateOffer.Builder(); }
    if ("DepartmentStore".equals(type)) { return new DepartmentStore.Builder(); }
    if ("TipAction".equals(type)) { return new TipAction.Builder(); }
    if ("MedicineSystem".equals(type)) { return new MedicineSystem.Builder(); }
    if ("Book".equals(type)) { return new Book.Builder(); }
    if ("Brewery".equals(type)) { return new Brewery.Builder(); }
    if ("MedicalEvidenceLevel".equals(type)) { return new MedicalEvidenceLevel.Builder(); }
    if ("MedicalSignOrSymptom".equals(type)) { return new MedicalSignOrSymptom.Builder(); }
    if ("RecommendedDoseSchedule".equals(type)) { return new RecommendedDoseSchedule.Builder(); }
    if ("ScholarlyArticle".equals(type)) { return new ScholarlyArticle.Builder(); }
    if ("BusinessEvent".equals(type)) { return new BusinessEvent.Builder(); }
    if ("Bone".equals(type)) { return new Bone.Builder(); }
    if ("InternetCafe".equals(type)) { return new InternetCafe.Builder(); }
    if ("ReserveAction".equals(type)) { return new ReserveAction.Builder(); }
    if ("BusStop".equals(type)) { return new BusStop.Builder(); }
    if ("SomeProducts".equals(type)) { return new SomeProducts.Builder(); }
    if ("EntertainmentBusiness".equals(type)) { return new EntertainmentBusiness.Builder(); }
    if ("ItemPage".equals(type)) { return new ItemPage.Builder(); }
    if ("APIReference".equals(type)) { return new APIReference.Builder(); }
    if ("PerformingGroup".equals(type)) { return new PerformingGroup.Builder(); }
    if ("Diet".equals(type)) { return new Diet.Builder(); }
    if ("UserPlusOnes".equals(type)) { return new UserPlusOnes.Builder(); }
    if ("MedicalContraindication".equals(type)) { return new MedicalContraindication.Builder(); }
    if ("Synagogue".equals(type)) { return new Synagogue.Builder(); }
    if ("Landform".equals(type)) { return new Landform.Builder(); }
    if ("Restaurant".equals(type)) { return new Restaurant.Builder(); }
    if ("HighSchool".equals(type)) { return new HighSchool.Builder(); }
    if ("PerformanceRole".equals(type)) { return new PerformanceRole.Builder(); }
    if ("ChildCare".equals(type)) { return new ChildCare.Builder(); }
    if ("SoftwareSourceCode".equals(type)) { return new SoftwareSourceCode.Builder(); }
    if ("LakeBodyOfWater".equals(type)) { return new LakeBodyOfWater.Builder(); }
    if ("DiagnosticProcedure".equals(type)) { return new DiagnosticProcedure.Builder(); }
    if ("ContactPointOption".equals(type)) { return new ContactPointOption.Builder(); }
    if ("PhysicalExam".equals(type)) { return new PhysicalExam.Builder(); }
    if ("VeterinaryCare".equals(type)) { return new VeterinaryCare.Builder(); }
    if ("RadioStation".equals(type)) { return new RadioStation.Builder(); }
    if ("Distance".equals(type)) { return new Distance.Builder(); }
    if ("ReservationPackage".equals(type)) { return new ReservationPackage.Builder(); }
    if ("NightClub".equals(type)) { return new NightClub.Builder(); }
    if ("Volcano".equals(type)) { return new Volcano.Builder(); }
    if ("AgreeAction".equals(type)) { return new AgreeAction.Builder(); }
    if ("OrderItem".equals(type)) { return new OrderItem.Builder(); }
    if ("CreativeWorkSeason".equals(type)) { return new CreativeWorkSeason.Builder(); }
    if ("ContactPage".equals(type)) { return new ContactPage.Builder(); }
    if ("DataDownload".equals(type)) { return new DataDownload.Builder(); }
    if ("BusinessAudience".equals(type)) { return new BusinessAudience.Builder(); }
    if ("CheckAction".equals(type)) { return new CheckAction.Builder(); }
    if ("BuddhistTemple".equals(type)) { return new BuddhistTemple.Builder(); }
    if ("MedicalStudy".equals(type)) { return new MedicalStudy.Builder(); }
    if ("ElectronicsStore".equals(type)) { return new ElectronicsStore.Builder(); }
    if ("Offer".equals(type)) { return new Offer.Builder(); }
    if ("MedicalSpecialty".equals(type)) { return new MedicalSpecialty.Builder(); }
    if ("ScheduleAction".equals(type)) { return new ScheduleAction.Builder(); }
    if ("PaintAction".equals(type)) { return new PaintAction.Builder(); }
    if ("Vehicle".equals(type)) { return new Vehicle.Builder(); }
    if ("SportsTeam".equals(type)) { return new SportsTeam.Builder(); }
    if ("DrugPrescriptionStatus".equals(type)) { return new DrugPrescriptionStatus.Builder(); }
    if ("WriteAction".equals(type)) { return new WriteAction.Builder(); }
    if ("CivicStructure".equals(type)) { return new CivicStructure.Builder(); }
    if ("UserInteraction".equals(type)) { return new UserInteraction.Builder(); }
    if ("ShoeStore".equals(type)) { return new ShoeStore.Builder(); }
    if ("UseAction".equals(type)) { return new UseAction.Builder(); }
    if ("AutoRepair".equals(type)) { return new AutoRepair.Builder(); }
    if ("Answer".equals(type)) { return new Answer.Builder(); }
    if ("DaySpa".equals(type)) { return new DaySpa.Builder(); }
    if ("SourceCodeRevision".equals(type)) { return new SourceCodeRevision.Builder(); }
    if ("Drug".equals(type)) { return new Drug.Builder(); }
    if ("ReplaceAction".equals(type)) { return new ReplaceAction.Builder(); }
    if ("Winery".equals(type)) { return new Winery.Builder(); }
    if ("PsychologicalTreatment".equals(type)) { return new PsychologicalTreatment.Builder(); }
    if ("ToyStore".equals(type)) { return new ToyStore.Builder(); }
    if ("PawnShop".equals(type)) { return new PawnShop.Builder(); }
    if ("TrainStation".equals(type)) { return new TrainStation.Builder(); }
    if ("EngineSpecification".equals(type)) { return new EngineSpecification.Builder(); }
    if ("WPHeader".equals(type)) { return new WPHeader.Builder(); }
    if ("FinancialService".equals(type)) { return new FinancialService.Builder(); }
    if ("MotorcycleRepair".equals(type)) { return new MotorcycleRepair.Builder(); }
    if ("VideoObject".equals(type)) { return new VideoObject.Builder(); }
    if ("GovernmentOffice".equals(type)) { return new GovernmentOffice.Builder(); }
    if ("DefenceEstablishment".equals(type)) { return new DefenceEstablishment.Builder(); }
    if ("MoveAction".equals(type)) { return new MoveAction.Builder(); }
    if ("DrugCostCategory".equals(type)) { return new DrugCostCategory.Builder(); }
    if ("PayAction".equals(type)) { return new PayAction.Builder(); }
    if ("JewelryStore".equals(type)) { return new JewelryStore.Builder(); }
    if ("TechArticle".equals(type)) { return new TechArticle.Builder(); }
    if ("ReactAction".equals(type)) { return new ReactAction.Builder(); }
    if ("DownloadAction".equals(type)) { return new DownloadAction.Builder(); }
    if ("InfectiousDisease".equals(type)) { return new InfectiousDisease.Builder(); }
    if ("CreativeWork".equals(type)) { return new CreativeWork.Builder(); }
    if ("InfectiousAgentClass".equals(type)) { return new InfectiousAgentClass.Builder(); }
    if ("BroadcastEvent".equals(type)) { return new BroadcastEvent.Builder(); }
    if ("ReviewAction".equals(type)) { return new ReviewAction.Builder(); }
    if ("LeaveAction".equals(type)) { return new LeaveAction.Builder(); }
    if ("LockerDelivery".equals(type)) { return new LockerDelivery.Builder(); }
    if ("MediaObject".equals(type)) { return new MediaObject.Builder(); }
    if ("Audience".equals(type)) { return new Audience.Builder(); }
    if ("SearchResultsPage".equals(type)) { return new SearchResultsPage.Builder(); }
    if ("MovieTheater".equals(type)) { return new MovieTheater.Builder(); }
    if ("Place".equals(type)) { return new Place.Builder(); }
    if ("TaxiReservation".equals(type)) { return new TaxiReservation.Builder(); }
    if ("AssignAction".equals(type)) { return new AssignAction.Builder(); }
    if ("TouristInformationCenter".equals(type)) { return new TouristInformationCenter.Builder(); }
    if ("FoodEstablishment".equals(type)) { return new FoodEstablishment.Builder(); }
    if ("TrackAction".equals(type)) { return new TrackAction.Builder(); }
    if ("NutritionInformation".equals(type)) { return new NutritionInformation.Builder(); }
    if ("Motel".equals(type)) { return new Motel.Builder(); }
    if ("Ticket".equals(type)) { return new Ticket.Builder(); }
    if ("TVClip".equals(type)) { return new TVClip.Builder(); }
    if ("ReadAction".equals(type)) { return new ReadAction.Builder(); }
    if ("DiagnosticLab".equals(type)) { return new DiagnosticLab.Builder(); }
    if ("ListenAction".equals(type)) { return new ListenAction.Builder(); }
    if ("Preschool".equals(type)) { return new Preschool.Builder(); }
    if ("LocalBusiness".equals(type)) { return new LocalBusiness.Builder(); }
    if ("RadiationTherapy".equals(type)) { return new RadiationTherapy.Builder(); }
    if ("VideoGameSeries".equals(type)) { return new VideoGameSeries.Builder(); }
    if ("MedicalRiskEstimator".equals(type)) { return new MedicalRiskEstimator.Builder(); }
    if ("GovernmentService".equals(type)) { return new GovernmentService.Builder(); }
    if ("OrganizationRole".equals(type)) { return new OrganizationRole.Builder(); }
    if ("Product".equals(type)) { return new Product.Builder(); }
    if ("Florist".equals(type)) { return new Florist.Builder(); }
    if ("ProductModel".equals(type)) { return new ProductModel.Builder(); }
    if ("HealthClub".equals(type)) { return new HealthClub.Builder(); }
    if ("BroadcastService".equals(type)) { return new BroadcastService.Builder(); }
    if ("MedicalTherapy".equals(type)) { return new MedicalTherapy.Builder(); }
    if ("DatedMoneySpecification".equals(type)) { return new DatedMoneySpecification.Builder(); }
    if ("DeactivateAction".equals(type)) { return new DeactivateAction.Builder(); }
    if ("MarryAction".equals(type)) { return new MarryAction.Builder(); }
    if ("DrugCost".equals(type)) { return new DrugCost.Builder(); }
    if ("Ligament".equals(type)) { return new Ligament.Builder(); }
    if ("LodgingBusiness".equals(type)) { return new LodgingBusiness.Builder(); }
    if ("MusicAlbumProductionType".equals(type)) { return new MusicAlbumProductionType.Builder(); }
    if ("DiscoverAction".equals(type)) { return new DiscoverAction.Builder(); }
    if ("SportsEvent".equals(type)) { return new SportsEvent.Builder(); }
    if ("Courthouse".equals(type)) { return new Courthouse.Builder(); }
    if ("Recipe".equals(type)) { return new Recipe.Builder(); }
    if ("ServiceChannel".equals(type)) { return new ServiceChannel.Builder(); }
    if ("LegislativeBuilding".equals(type)) { return new LegislativeBuilding.Builder(); }
    if ("SuperficialAnatomy".equals(type)) { return new SuperficialAnatomy.Builder(); }
    if ("GamePlayMode".equals(type)) { return new GamePlayMode.Builder(); }
    if ("Rating".equals(type)) { return new Rating.Builder(); }
    if ("MovingCompany".equals(type)) { return new MovingCompany.Builder(); }
    if ("MedicalGuideline".equals(type)) { return new MedicalGuideline.Builder(); }
    if ("MedicalSymptom".equals(type)) { return new MedicalSymptom.Builder(); }
    if ("PetStore".equals(type)) { return new PetStore.Builder(); }
    if ("HomeAndConstructionBusiness".equals(type)) { return new HomeAndConstructionBusiness.Builder(); }
    if ("ReplyAction".equals(type)) { return new ReplyAction.Builder(); }
    if ("QuantitativeValue".equals(type)) { return new QuantitativeValue.Builder(); }
    if ("MedicalImagingTechnique".equals(type)) { return new MedicalImagingTechnique.Builder(); }
    if ("PerformAction".equals(type)) { return new PerformAction.Builder(); }
    if ("TheaterEvent".equals(type)) { return new TheaterEvent.Builder(); }
    if ("Canal".equals(type)) { return new Canal.Builder(); }
    if ("MedicalEnumeration".equals(type)) { return new MedicalEnumeration.Builder(); }
    if ("Energy".equals(type)) { return new Energy.Builder(); }
    if ("Blog".equals(type)) { return new Blog.Builder(); }
    if ("Sculpture".equals(type)) { return new Sculpture.Builder(); }
    if ("BusinessEntityType".equals(type)) { return new BusinessEntityType.Builder(); }
    if ("EventVenue".equals(type)) { return new EventVenue.Builder(); }
    if ("ArriveAction".equals(type)) { return new ArriveAction.Builder(); }
    if ("MedicalCondition".equals(type)) { return new MedicalCondition.Builder(); }
    if ("SubwayStation".equals(type)) { return new SubwayStation.Builder(); }
    if ("MedicalGuidelineRecommendation".equals(type)) { return new MedicalGuidelineRecommendation.Builder(); }
    if ("RiverBodyOfWater".equals(type)) { return new RiverBodyOfWater.Builder(); }
    if ("Question".equals(type)) { return new Question.Builder(); }
    if ("PhysicalActivityCategory".equals(type)) { return new PhysicalActivityCategory.Builder(); }
    if ("RsvpAction".equals(type)) { return new RsvpAction.Builder(); }
    if ("EducationalAudience".equals(type)) { return new EducationalAudience.Builder(); }
    if ("AutoDealer".equals(type)) { return new AutoDealer.Builder(); }
    if ("MedicalScholarlyArticle".equals(type)) { return new MedicalScholarlyArticle.Builder(); }
    if ("Table".equals(type)) { return new Table.Builder(); }
    if ("InteractAction".equals(type)) { return new InteractAction.Builder(); }
    if ("TireShop".equals(type)) { return new TireShop.Builder(); }
    if ("CityHall".equals(type)) { return new CityHall.Builder(); }
    if ("MovieSeries".equals(type)) { return new MovieSeries.Builder(); }
    if ("AccountingService".equals(type)) { return new AccountingService.Builder(); }
    if ("DietarySupplement".equals(type)) { return new DietarySupplement.Builder(); }
    if ("DeliveryChargeSpecification".equals(type)) { return new DeliveryChargeSpecification.Builder(); }
    if ("SaleEvent".equals(type)) { return new SaleEvent.Builder(); }
    if ("MedicalRiskFactor".equals(type)) { return new MedicalRiskFactor.Builder(); }
    if ("ReceiveAction".equals(type)) { return new ReceiveAction.Builder(); }
    if ("PlanAction".equals(type)) { return new PlanAction.Builder(); }
    if ("Church".equals(type)) { return new Church.Builder(); }
    if ("MusicStore".equals(type)) { return new MusicStore.Builder(); }
    if ("AchieveAction".equals(type)) { return new AchieveAction.Builder(); }
    if ("ComedyClub".equals(type)) { return new ComedyClub.Builder(); }
    if ("Optician".equals(type)) { return new Optician.Builder(); }
    if ("MusicComposition".equals(type)) { return new MusicComposition.Builder(); }
    if ("GiveAction".equals(type)) { return new GiveAction.Builder(); }
    if ("Playground".equals(type)) { return new Playground.Builder(); }
    if ("ExercisePlan".equals(type)) { return new ExercisePlan.Builder(); }
    if ("ParcelDelivery".equals(type)) { return new ParcelDelivery.Builder(); }
    if ("MedicalConditionStage".equals(type)) { return new MedicalConditionStage.Builder(); }
    if ("OfferItemCondition".equals(type)) { return new OfferItemCondition.Builder(); }
    if ("TransferAction".equals(type)) { return new TransferAction.Builder(); }
    if ("ComedyEvent".equals(type)) { return new ComedyEvent.Builder(); }
    if ("HVACBusiness".equals(type)) { return new HVACBusiness.Builder(); }
    if ("City".equals(type)) { return new City.Builder(); }
    if ("SingleFamilyResidence".equals(type)) { return new SingleFamilyResidence.Builder(); }
    if ("MedicalDevicePurpose".equals(type)) { return new MedicalDevicePurpose.Builder(); }
    if ("Review".equals(type)) { return new Review.Builder(); }
    if ("MotorcycleDealer".equals(type)) { return new MotorcycleDealer.Builder(); }
    if ("VideoGame".equals(type)) { return new VideoGame.Builder(); }
    if ("WarrantyPromise".equals(type)) { return new WarrantyPromise.Builder(); }
    if ("RadioSeries".equals(type)) { return new RadioSeries.Builder(); }
    if ("CreditCard".equals(type)) { return new CreditCard.Builder(); }
    return null;
  }

  private static final ObjectMapper objectMapper = new ObjectMapper();
  static {
    objectMapper.registerModule(new JsonLdModule());
  }
  @NotNull public static String writeJson(@NotNull Thing thing) throws JsonProcessingException {
    return objectMapper.writeValueAsString(thing);
  }
  public static Thing readJson(String json) throws java.io.IOException {
    return objectMapper.readValue(json, Thing.class);
  }
  public static Thing readJson(JsonNode node) {
    return ThingDeserializer.fromMap(objectMapper.convertValue(node, java.util.Map.class));
  }
}
