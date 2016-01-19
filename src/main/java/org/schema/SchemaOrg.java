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
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;

public class SchemaOrg {
  /**
   * A type of blood vessel that specifically carries lymph fluid unidirectionally toward the heart.
   */
  public static LymphaticVessel.Builder lymphaticVessel() { return new LymphaticVessel.LymphaticVesselThingBuilder(); }
  /**
   * The act of notifying someone that a future event/action is going to happen as expected.<p>Related actions:</p><ul><li><a href="http://schema.org/CancelAction">CancelAction</a>: The antonym of ConfirmAction</li></ul>.
   */
  public static ConfirmAction.Builder confirmAction() { return new ConfirmAction.ConfirmActionThingBuilder(); }
  /**
   * An list item, e.g. a step in a checklist or how-to description.
   */
  public static ListItem.Builder listItem() { return new ListItem.ListItemThingBuilder(); }
  /**
   * CreativeWorkSeries dedicated to TV broadcast and associated online delivery.
   */
  public static TVSeries.Builder tVSeries() { return new TVSeries.TVSeriesThingBuilder(); }
  /**
   * A work of art that is primarily visual in character.
   */
  public static VisualArtwork.Builder visualArtwork() { return new VisualArtwork.VisualArtworkThingBuilder(); }
  /**
   * A value indicating which roadwheels will receive torque.
   */
  public static DriveWheelConfigurationValue.Builder driveWheelConfigurationValue() { return new DriveWheelConfigurationValue.DriveWheelConfigurationValueThingBuilder(); }
  /**
   * A service provided by an organization, e.g. delivery service, print services, etc.
   */
  public static Service.Builder service() { return new Service.ServiceThingBuilder(); }
  /**
   * An intangible item that describes an alignment between a learning resource and a node in an educational framework.
   */
  public static AlignmentObject.Builder alignmentObject() { return new AlignmentObject.AlignmentObjectThingBuilder(); }
  /**
   * Animal shelter.
   */
  public static AnimalShelter.Builder animalShelter() { return new AnimalShelter.AnimalShelterThingBuilder(); }
  /**
   * A fast-food restaurant.
   */
  public static FastFoodRestaurant.Builder fastFoodRestaurant() { return new FastFoodRestaurant.FastFoodRestaurantThingBuilder(); }
  /**
   * An amusement park.
   */
  public static AmusementPark.Builder amusementPark() { return new AmusementPark.AmusementParkThingBuilder(); }
  /**
   * DigitalAudioTapeFormat.
   */
  public static DigitalAudioTapeFormat.Builder digitalAudioTapeFormat() { return new DigitalAudioTapeFormat.DigitalAudioTapeFormatThingBuilder(); }
  /**
   * The act of editing by adding an object to a collection.
   */
  public static AddAction.Builder addAction() { return new AddAction.AddActionThingBuilder(); }
  /**
   * A set of characteristics belonging to people, e.g. who compose an item's target audience.
   */
  public static PeopleAudience.Builder peopleAudience() { return new PeopleAudience.PeopleAudienceThingBuilder(); }
  /**
   * A bar or pub.
   */
  public static BarOrPub.Builder barOrPub() { return new BarOrPub.BarOrPubThingBuilder(); }
  /**
   * Season dedicated to TV broadcast and associated online delivery.
   */
  public static TVSeason.Builder tVSeason() { return new TVSeason.TVSeasonThingBuilder(); }
  /**
   * A complex mathematical calculation requiring an online calculator, used to assess prognosis. Note: use the url property of Thing to record any URLs for online calculators.
   */
  public static MedicalRiskCalculator.Builder medicalRiskCalculator() { return new MedicalRiskCalculator.MedicalRiskCalculatorThingBuilder(); }
  /**
   * Abdomen.
   */
  public static Abdomen.Builder abdomen() { return new Abdomen.AbdomenThingBuilder(); }
  /**
   * The act of generating a comment about a subject.
   */
  public static CommentAction.Builder commentAction() { return new CommentAction.CommentActionThingBuilder(); }
  /**
   * The act of deliberately creating/producing/generating/building a result out of the agent.
   */
  public static CreateAction.Builder createAction() { return new CreateAction.CreateActionThingBuilder(); }
  /**
   * A permit issued by an organization, e.g. a parking pass.
   */
  public static Permit.Builder permit() { return new Permit.PermitThingBuilder(); }
  /**
   * The act of rejecting to/adopting an object.<p>Related actions:</p><ul><li><a href="http://schema.org/AcceptAction">AcceptAction</a>: The antonym of RejectAction</li></ul>.
   */
  public static RejectAction.Builder rejectAction() { return new RejectAction.RejectActionThingBuilder(); }
  /**
   * The act of inserting at the end if an ordered collection.
   */
  public static AppendAction.Builder appendAction() { return new AppendAction.AppendActionThingBuilder(); }
  /**
   * Quantity: Duration (use  <a href='http://en.wikipedia.org/wiki/ISO_8601'>ISO 8601 duration format</a>).
   */
  public static Duration.Builder duration() { return new Duration.DurationThingBuilder(); }
  /**
   * An Insurance agency.
   */
  public static InsuranceAgency.Builder insuranceAgency() { return new InsuranceAgency.InsuranceAgencyThingBuilder(); }
  /**
   * The act of reaching a draw in a competitive activity.
   */
  public static TieAction.Builder tieAction() { return new TieAction.TieActionThingBuilder(); }
  /**
   * The geographic coordinates of a place or event.
   */
  public static GeoCoordinates.Builder geoCoordinates() { return new GeoCoordinates.GeoCoordinatesThingBuilder(); }
  /**
   * This class contains information contributed by <a href=http://wikidoc.org>WikiDoc</a>.
   */
  public static WikiDoc.Builder wikiDoc() { return new WikiDoc.WikiDocThingBuilder(); }
  /**
   * The anatomical location at which two or more bones make contact.
   */
  public static Joint.Builder joint() { return new Joint.JointThingBuilder(); }
  /**
   * OrderStatus representing availability of an order for pickup.
   */
  public static OrderPickupAvailable.Builder orderPickupAvailable() { return new OrderPickupAvailable.OrderPickupAvailableThingBuilder(); }
  /**
   * A garden store.
   */
  public static GardenStore.Builder gardenStore() { return new GardenStore.GardenStoreThingBuilder(); }
  /**
   * Skin.
   */
  public static Skin.Builder skin() { return new Skin.SkinThingBuilder(); }
  /**
   * Event type: Children's event.
   */
  public static ChildrensEvent.Builder childrensEvent() { return new ChildrensEvent.ChildrensEventThingBuilder(); }
  /**
   * Indicates that the item is in stock.
   */
  public static InStock.Builder inStock() { return new InStock.InStockThingBuilder(); }
  /**
   * Any medical test, typically performed for diagnostic purposes.
   */
  public static MedicalTest.Builder medicalTest() { return new MedicalTest.MedicalTestThingBuilder(); }
  /**
   * A predefined value for a product characteristic, e.g. the power cord plug type "US" or the garment sizes "S", "M", "L", and "XL".
   */
  public static QualitativeValue.Builder qualitativeValue() { return new QualitativeValue.QualitativeValueThingBuilder(); }
  /**
   * A tourist attraction.
   */
  public static TouristAttraction.Builder touristAttraction() { return new TouristAttraction.TouristAttractionThingBuilder(); }
  /**
   * SingleRelease.
   */
  public static SingleRelease.Builder singleRelease() { return new SingleRelease.SingleReleaseThingBuilder(); }
  /**
   * Game server status: OfflinePermanently. Server is offline and not available.
   */
  public static OfflinePermanently.Builder offlinePermanently() { return new OfflinePermanently.OfflinePermanentlyThingBuilder(); }
  /**
   * An agent bookmarks/flags/labels/tags/marks an object.
   */
  public static BookmarkAction.Builder bookmarkAction() { return new BookmarkAction.BookmarkActionThingBuilder(); }
  /**
   * Categories that represent an assessment of the risk of fetal injury due to a drug or pharmaceutical used as directed by the mother during pregnancy.
   */
  public static DrugPregnancyCategory.Builder drugPregnancyCategory() { return new DrugPregnancyCategory.DrugPregnancyCategoryThingBuilder(); }
  /**
   * The associated telephone number is toll free.
   */
  public static TollFree.Builder tollFree() { return new TollFree.TollFreeThingBuilder(); }
  /**
   * A specific branch of medical science that studies the nerves and nervous system and its respective disease states.
   */
  public static Neurologic.Builder neurologic() { return new Neurologic.NeurologicThingBuilder(); }
  /**
   * A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
   */
  public static BroadcastChannel.Builder broadcastChannel() { return new BroadcastChannel.BroadcastChannelThingBuilder(); }
  /**
   * The act of un-registering from a service.<p>Related actions:</p><ul><li><a href="http://schema.org/RegisterAction">RegisterAction</a>: antonym of UnRegisterAction.</li><li><a href="http://schema.org/Leave">Leave</a>: Unlike LeaveAction, UnRegisterAction implies that you are unregistering from a service you werer previously registered, rather than leaving a team/group of people</li></ul>.
   */
  public static UnRegisterAction.Builder unRegisterAction() { return new UnRegisterAction.UnRegisterActionThingBuilder(); }
  /**
   * Indicates the usage of the vehicle for driving school.
   */
  public static DrivingSchoolVehicleUsage.Builder drivingSchoolVehicleUsage() { return new DrivingSchoolVehicleUsage.DrivingSchoolVehicleUsageThingBuilder(); }
  /**
   * One of the continents (for example, Europe or Africa).
   */
  public static Continent.Builder continent() { return new Continent.ContinentThingBuilder(); }
  /**
   * The act of editing a recipient by removing one of its objects.
   */
  public static DeleteAction.Builder deleteAction() { return new DeleteAction.DeleteActionThingBuilder(); }
  /**
   * An observational study design.
   */
  public static Observational.Builder observational() { return new Observational.ObservationalThingBuilder(); }
  /**
   * Results are available.
   */
  public static ResultsAvailable.Builder resultsAvailable() { return new ResultsAvailable.ResultsAvailableThingBuilder(); }
  /**
   * DJMixAlbum.
   */
  public static DJMixAlbum.Builder dJMixAlbum() { return new DJMixAlbum.DJMixAlbumThingBuilder(); }
  /**
   * A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.
   */
  public static WebPage.Builder webPage() { return new WebPage.WebPageThingBuilder(); }
  /**
   * Indicates that the item is damaged.
   */
  public static DamagedCondition.Builder damagedCondition() { return new DamagedCondition.DamagedConditionThingBuilder(); }
  /**
   * A trial design in which the researcher knows which treatment the patient was randomly assigned to but the patient does not.
   */
  public static SingleBlindedTrial.Builder singleBlindedTrial() { return new SingleBlindedTrial.SingleBlindedTrialThingBuilder(); }
  /**
   * A bus station.
   */
  public static BusStation.Builder busStation() { return new BusStation.BusStationThingBuilder(); }
  /**
   * Terminated.
   */
  public static Terminated.Builder terminated() { return new Terminated.TerminatedThingBuilder(); }
  /**
   * A taxi.
   */
  public static Taxi.Builder taxi() { return new Taxi.TaxiThingBuilder(); }
  /**
   * The publication format of the book.
   */
  public static BookFormatType.Builder bookFormatType() { return new BookFormatType.BookFormatTypeThingBuilder(); }
  /**
   * The act of resuming a device or application which was formerly paused (e.g. resume music playback or resume a timer).
   */
  public static ResumeAction.Builder resumeAction() { return new ResumeAction.ResumeActionThingBuilder(); }
  /**
   * A system of medicine based on common theoretical concepts that originated in China and evolved over thousands of years, that uses herbs, acupuncture, exercise, massage, dietary therapy, and other methods to treat a wide range of conditions.
   */
  public static TraditionalChinese.Builder traditionalChinese() { return new TraditionalChinese.TraditionalChineseThingBuilder(); }
  /**
   * An anatomical system is a group of anatomical structures that work together to perform a certain task. Anatomical systems, such as organ systems, are one organizing principle of anatomy, and can includes circulatory, digestive, endocrine, integumentary, immune, lymphatic, muscular, nervous, reproductive, respiratory, skeletal, urinary, vestibular, and other systems.
   */
  public static AnatomicalSystem.Builder anatomicalSystem() { return new AnatomicalSystem.AnatomicalSystemThingBuilder(); }
  /**
   * The act of swallowing solid objects.
   */
  public static EatAction.Builder eatAction() { return new EatAction.EatActionThingBuilder(); }
  /**
   * The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.
   */
  public static CommunicateAction.Builder communicateAction() { return new CommunicateAction.CommunicateActionThingBuilder(); }
  /**
   * A publication in any medium issued in successive parts bearing numerical or chronological designations and intended, such as a magazine, scholarly journal, or newspaper to continue indefinitely.

      <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
   */
  public static Periodical.Builder periodical() { return new Periodical.PeriodicalThingBuilder(); }
  /**
   * An airport.
   */
  public static Airport.Builder airport() { return new Airport.AirportThingBuilder(); }
  /**
   * A grocery store.
   */
  public static GroceryStore.Builder groceryStore() { return new GroceryStore.GroceryStoreThingBuilder(); }
  /**
   * An agent approves/certifies/likes/supports/sanction an object.
   */
  public static EndorseAction.Builder endorseAction() { return new EndorseAction.EndorseActionThingBuilder(); }
  /**
   * The mailing address.
   */
  public static PostalAddress.Builder postalAddress() { return new PostalAddress.PostalAddressThingBuilder(); }
  /**
   * Nursing.
   */
  public static Nursing.Builder nursing() { return new Nursing.NursingThingBuilder(); }
  /**
   * The event has been rescheduled. The event's previousStartDate should be set to the old date and the startDate should be set to the event's new date. (If the event has been rescheduled multiple times, the previousStartDate property may be repeated).
   */
  public static EventRescheduled.Builder eventRescheduled() { return new EventRescheduled.EventRescheduledThingBuilder(); }
  /**
   * A travel agency.
   */
  public static TravelAgency.Builder travelAgency() { return new TravelAgency.TravelAgencyThingBuilder(); }
  /**
   * Web page type: Profile page.
   */
  public static ProfilePage.Builder profilePage() { return new ProfilePage.ProfilePageThingBuilder(); }
  /**
   * The conventional Western system of medicine, that aims to apply the best available evidence gained from the scientific method to clinical decision making. Also known as conventional or Western medicine.
   */
  public static WesternConventional.Builder westernConventional() { return new WesternConventional.WesternConventionalThingBuilder(); }
  /**
   * A roofing contractor.
   */
  public static RoofingContractor.Builder roofingContractor() { return new RoofingContractor.RoofingContractorThingBuilder(); }
  /**
   * A parking lot or other parking facility.
   */
  public static ParkingFacility.Builder parkingFacility() { return new ParkingFacility.ParkingFacilityThingBuilder(); }
  /**
   * A casino.
   */
  public static Casino.Builder casino() { return new Casino.CasinoThingBuilder(); }
  /**
   * An image file.
   */
  public static ImageObject.Builder imageObject() { return new ImageObject.ImageObjectThingBuilder(); }
  /**
   * Indicates that the item has sold out.
   */
  public static SoldOut.Builder soldOut() { return new SoldOut.SoldOutThingBuilder(); }
  /**
   * A system of medicine based on the principle that a disease can be cured by a substance that produces similar symptoms in healthy people.
   */
  public static Homeopathic.Builder homeopathic() { return new Homeopathic.HomeopathicThingBuilder(); }
  /**
   * A reservation for bus travel.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
   */
  public static BusReservation.Builder busReservation() { return new BusReservation.BusReservationThingBuilder(); }
  /**
   * A pond.
   */
  public static Pond.Builder pond() { return new Pond.PondThingBuilder(); }
  /**
   * Speech pathology.
   */
  public static SpeechPathology.Builder speechPathology() { return new SpeechPathology.SpeechPathologyThingBuilder(); }
  /**
   * A sea (for example, the Caspian sea).
   */
  public static SeaBodyOfWater.Builder seaBodyOfWater() { return new SeaBodyOfWater.SeaBodyOfWaterThingBuilder(); }
  /**
   * A reservation for air travel.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
   */
  public static FlightReservation.Builder flightReservation() { return new FlightReservation.FlightReservationThingBuilder(); }
  /**
   * Researchers.
   */
  public static Researcher.Builder researcher() { return new Researcher.ResearcherThingBuilder(); }
  /**
   * A clothing store.
   */
  public static ClothingStore.Builder clothingStore() { return new ClothingStore.ClothingStoreThingBuilder(); }
  /**
   * A car wash business.
   */
  public static AutoWash.Builder autoWash() { return new AutoWash.AutoWashThingBuilder(); }
  /**
   * A computer store.
   */
  public static ComputerStore.Builder computerStore() { return new ComputerStore.ComputerStoreThingBuilder(); }
  /**
   * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
   */
  public static Code.Builder code() { return new Code.CodeThingBuilder(); }
  /**
   * A mountain, like Mount Whitney or Mount Everest.
   */
  public static Mountain.Builder mountain() { return new Mountain.MountainThingBuilder(); }
  /**
   * Game server status: Online. Server is available.
   */
  public static Online.Builder online() { return new Online.OnlineThingBuilder(); }
  /**
   * A music recording (track), usually a single song.
   */
  public static MusicRecording.Builder musicRecording() { return new MusicRecording.MusicRecordingThingBuilder(); }
  /**
   * The act of adding at a specific location in an ordered collection.
   */
  public static InsertAction.Builder insertAction() { return new InsertAction.InsertActionThingBuilder(); }
  /**
   * A system of medicine that originated in India over thousands of years and that focuses on integrating and balancing the body, mind, and spirit.
   */
  public static Ayurvedic.Builder ayurvedic() { return new Ayurvedic.AyurvedicThingBuilder(); }
  /**
   * The act of gaining ownership of an object from an origin. Reciprocal of GiveAction.<p>Related actions:</p><ul><li><a href="http://schema.org/GiveAction">GiveAction</a>: The reciprocal of TakeAction.</li><li><a href="http://schema.org/ReceiveAction">ReceiveAction</a>: Unlike ReceiveAction, TakeAction implies that ownership has been transfered</li></ul>.
   */
  public static TakeAction.Builder takeAction() { return new TakeAction.TakeActionThingBuilder(); }
  /**
   * Withdrawn.
   */
  public static Withdrawn.Builder withdrawn() { return new Withdrawn.WithdrawnThingBuilder(); }
  /**
   * A music video file.
   */
  public static MusicVideoObject.Builder musicVideoObject() { return new MusicVideoObject.MusicVideoObjectThingBuilder(); }
  /**
   * A reservation for train travel.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
   */
  public static TrainReservation.Builder trainReservation() { return new TrainReservation.TrainReservationThingBuilder(); }
  /**
   * A prion is an infectious agent composed of protein in a misfolded form.
   */
  public static Prion.Builder prion() { return new Prion.PrionThingBuilder(); }
  /**
   * The act of consuming dynamic/moving visual content.
   */
  public static WatchAction.Builder watchAction() { return new WatchAction.WatchActionThingBuilder(); }
  /**
   * A post office.
   */
  public static PostOffice.Builder postOffice() { return new PostOffice.PostOfficeThingBuilder(); }
  /**
   * A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.

      <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
   */
  public static PublicationIssue.Builder publicationIssue() { return new PublicationIssue.PublicationIssueThingBuilder(); }
  /**
   * Natural languages such as Spanish, Tamil, Hindi, English, etc. and programming languages such as Scheme and Lisp.
   */
  public static Language.Builder language() { return new Language.LanguageThingBuilder(); }
  /**
   * A description of an action that is supported.
   */
  public static PotentialActionStatus.Builder potentialActionStatus() { return new PotentialActionStatus.PotentialActionStatusThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to the study of the kidneys and its respective disease states.
   */
  public static Renal.Builder renal() { return new Renal.RenalThingBuilder(); }
  /**
   * A country.
   */
  public static Country.Builder country() { return new Country.CountryThingBuilder(); }
  /**
   * A medical device used for therapeutic purposes.
   */
  public static Therapeutic.Builder therapeutic() { return new Therapeutic.TherapeuticThingBuilder(); }
  /**
   * A specific dosing schedule for a drug or supplement.
   */
  public static DoseSchedule.Builder doseSchedule() { return new DoseSchedule.DoseScheduleThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to diagnosis and treatment of bacterial, viral, fungal and parasitic infections.
   */
  public static Infectious.Builder infectious() { return new Infectious.InfectiousThingBuilder(); }
  /**
   * A geographical region under the jurisdiction of a particular government.
   */
  public static AdministrativeArea.Builder administrativeArea() { return new AdministrativeArea.AdministrativeAreaThingBuilder(); }
  /**
   * The act of taking money from a buyer in exchange for goods or services rendered. An agent sells an object, product, or service to a buyer for a price. Reciprocal of BuyAction.
   */
  public static SellAction.Builder sellAction() { return new SellAction.SellActionThingBuilder(); }
  /**
   * An indication for preventing an underlying condition, symptom, etc.
   */
  public static PreventionIndication.Builder preventionIndication() { return new PreventionIndication.PreventionIndicationThingBuilder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserDownloads.Builder userDownloads() { return new UserDownloads.UserDownloadsThingBuilder(); }
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
  public static BreadcrumbList.Builder breadcrumbList() { return new BreadcrumbList.BreadcrumbListThingBuilder(); }
  /**
   * A collection of datasets.
   */
  public static DataCatalog.Builder dataCatalog() { return new DataCatalog.DataCatalogThingBuilder(); }
  /**
   * An agent orders an object/product/service to be delivered/sent.
   */
  public static OrderAction.Builder orderAction() { return new OrderAction.OrderActionThingBuilder(); }
  /**
   * A reservation for an event like a concert, sporting event, or lecture.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
   */
  public static EventReservation.Builder eventReservation() { return new EventReservation.EventReservationThingBuilder(); }
  /**
   * A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.
   */
  public static MusicGroup.Builder musicGroup() { return new MusicGroup.MusicGroupThingBuilder(); }
  /**
   * The event has been postponed and no new date has been set. The event's previousStartDate should be set.
   */
  public static EventPostponed.Builder eventPostponed() { return new EventPostponed.EventPostponedThingBuilder(); }
  /**
   * A seating map.
   */
  public static SeatingMap.Builder seatingMap() { return new SeatingMap.SeatingMapThingBuilder(); }
  /**
   * A reservation for lodging at a hotel, motel, inn, etc.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  public static LodgingReservation.Builder lodgingReservation() { return new LodgingReservation.LodgingReservationThingBuilder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserComments.Builder userComments() { return new UserComments.UserCommentsThingBuilder(); }
  /**
   * The price asked for a given offer by the respective organization or person.
   */
  public static UnitPriceSpecification.Builder unitPriceSpecification() { return new UnitPriceSpecification.UnitPriceSpecificationThingBuilder(); }
  /**
   * A value indicating a steering position.
   */
  public static SteeringPositionValue.Builder steeringPositionValue() { return new SteeringPositionValue.SteeringPositionValueThingBuilder(); }
  /**
   * The act of committing to/adopting an object.<p>Related actions:</p><ul><li><a href="http://schema.org/RejectAction">RejectAction</a>: The antonym of AcceptAction</li></ul>.
   */
  public static AcceptAction.Builder acceptAction() { return new AcceptAction.AcceptActionThingBuilder(); }
  /**
   * A museum.
   */
  public static Museum.Builder museum() { return new Museum.MuseumThingBuilder(); }
  /**
   * Event type: Social event.
   */
  public static SocialEvent.Builder socialEvent() { return new SocialEvent.SocialEventThingBuilder(); }
  /**
   * Event type: Literary event.
   */
  public static LiteraryEvent.Builder literaryEvent() { return new LiteraryEvent.LiteraryEventThingBuilder(); }
  /**
   * A designation by the US FDA signifying that studies in animals or humans have demonstrated fetal abnormalities and/or there is positive evidence of human fetal risk based on adverse reaction data from investigational or marketing experience, and the risks involved in use of the drug in pregnant women clearly outweigh potential benefits.
   */
  public static FDAcategoryX.Builder fDAcategoryX() { return new FDAcategoryX.FDAcategoryXThingBuilder(); }
  /**
   * A home goods store.
   */
  public static HomeGoodsStore.Builder homeGoodsStore() { return new HomeGoodsStore.HomeGoodsStoreThingBuilder(); }
  /**
   * This vocabulary was improved through collaboration with the MusicBrainz project
    (<a href="http://www.musicbrainz.org">www.musicbrainz.org</a>), and is partially inspired by the MusicBrainz and
    <a href="http://musicontology.com/docs/getting-started.html">Music Ontology</a> schemas.
   */
  public static MBZ.Builder mBZ() { return new MBZ.MBZThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to the study of the respiratory system and its respective disease states.
   */
  public static Pulmonary.Builder pulmonary() { return new Pulmonary.PulmonaryThingBuilder(); }
  /**
   * The act of organizing tasks/objects/events by associating resources to it.
   */
  public static AllocateAction.Builder allocateAction() { return new AllocateAction.AllocateActionThingBuilder(); }
  /**
   * A sidebar section of the page.
   */
  public static WPSideBar.Builder wPSideBar() { return new WPSideBar.WPSideBarThingBuilder(); }
  /**
   * A designation by the US FDA signifying that animal reproduction studies have shown an adverse effect on the fetus and there are no adequate and well-controlled studies in humans, but potential benefits may warrant use of the drug in pregnant women despite potential risks.
   */
  public static FDAcategoryC.Builder fDAcategoryC() { return new FDAcategoryC.FDAcategoryCThingBuilder(); }
  /**
   * A designation by the US FDA signifying that there is positive evidence of human fetal risk based on adverse reaction data from investigational or marketing experience or studies in humans, but potential benefits may warrant use of the drug in pregnant women despite potential risks.
   */
  public static FDAcategoryD.Builder fDAcategoryD() { return new FDAcategoryD.FDAcategoryDThingBuilder(); }
  /**
   * A school.
   */
  public static School.Builder school() { return new School.SchoolThingBuilder(); }
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
  public static CreativeWorkSeries.Builder creativeWorkSeries() { return new CreativeWorkSeries.CreativeWorkSeriesThingBuilder(); }
  /**
   * A designation by the US FDA signifying that adequate and well-controlled studies have failed to demonstrate a risk to the fetus in the first trimester of pregnancy (and there is no evidence of risk in later trimesters).
   */
  public static FDAcategoryA.Builder fDAcategoryA() { return new FDAcategoryA.FDAcategoryAThingBuilder(); }
  /**
   * A designation by the US FDA signifying that animal reproduction studies have failed to demonstrate a risk to the fetus and there are no adequate and well-controlled studies in pregnant women.
   */
  public static FDAcategoryB.Builder fDAcategoryB() { return new FDAcategoryB.FDAcategoryBThingBuilder(); }
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
  public static DayOfWeek.Builder dayOfWeek() { return new DayOfWeek.DayOfWeekThingBuilder(); }
  /**
   * An indication for treating an underlying condition, symptom, etc.
   */
  public static TreatmentIndication.Builder treatmentIndication() { return new TreatmentIndication.TreatmentIndicationThingBuilder(); }
  /**
   * A trip on a commercial train line.
   */
  public static TrainTrip.Builder trainTrip() { return new TrainTrip.TrainTripThingBuilder(); }
  /**
   * A hardware store.
   */
  public static HardwareStore.Builder hardwareStore() { return new HardwareStore.HardwareStoreThingBuilder(); }
  /**
   * A screening of a movie or other video.
   */
  public static ScreeningEvent.Builder screeningEvent() { return new ScreeningEvent.ScreeningEventThingBuilder(); }
  /**
   * Available by prescription only.
   */
  public static PrescriptionOnly.Builder prescriptionOnly() { return new PrescriptionOnly.PrescriptionOnlyThingBuilder(); }
  /**
   * Indicates the usage of the vehicle as a rental car.
   */
  public static RentalVehicleUsage.Builder rentalVehicleUsage() { return new RentalVehicleUsage.RentalVehicleUsageThingBuilder(); }
  /**
   * The invitee will attend.
   */
  public static RsvpResponseYes.Builder rsvpResponseYes() { return new RsvpResponseYes.RsvpResponseYesThingBuilder(); }
  /**
   * A MusicRelease is a specific release of a music album.
   */
  public static MusicRelease.Builder musicRelease() { return new MusicRelease.MusicReleaseThingBuilder(); }
  /**
   * An electrician.
   */
  public static Electrician.Builder electrician() { return new Electrician.ElectricianThingBuilder(); }
  /**
   * Not yet recruiting.
   */
  public static NotYetRecruiting.Builder notYetRecruiting() { return new NotYetRecruiting.NotYetRecruitingThingBuilder(); }
  /**
   * Beach.
   */
  public static Beach.Builder beach() { return new Beach.BeachThingBuilder(); }
  /**
   * Web applications.
   */
  public static WebApplication.Builder webApplication() { return new WebApplication.WebApplicationThingBuilder(); }
  /**
   * A Property value specification.
   */
  public static PropertyValueSpecification.Builder propertyValueSpecification() { return new PropertyValueSpecification.PropertyValueSpecificationThingBuilder(); }
  /**
   * A placebo-controlled trial design.
   */
  public static PlaceboControlledTrial.Builder placeboControlledTrial() { return new PlaceboControlledTrial.PlaceboControlledTrialThingBuilder(); }
  /**
   * A specific branch of medical science that deals with benign and malignant tumors, including the study of their development, diagnosis, treatment and prevention.
   */
  public static Oncologic.Builder oncologic() { return new Oncologic.OncologicThingBuilder(); }
  /**
   * ATM/cash machine.
   */
  public static AutomatedTeller.Builder automatedTeller() { return new AutomatedTeller.AutomatedTellerThingBuilder(); }
  /**
   * A trip on a commercial bus line.
   */
  public static BusTrip.Builder busTrip() { return new BusTrip.BusTripThingBuilder(); }
  /**
   * A structured value representing a monetary amount. Typically, only the subclasses of this type are used for markup.
   */
  public static PriceSpecification.Builder priceSpecification() { return new PriceSpecification.PriceSpecificationThingBuilder(); }
  /**
   * The act of expressing a negative sentiment about the object. An agent dislikes an object (a proposition, topic or theme) with participants.
   */
  public static DislikeAction.Builder dislikeAction() { return new DislikeAction.DislikeActionThingBuilder(); }
  /**
   * The W3C <a href="http://www.w3.org/community/schemabibex/">Schema Bib Extend</a> (BibEx) group led the work to improve schema.org for bibliographic information, including terms for periodicals, articles and multi-volume works. The design was inspired in places (e.g. pageStart, pageEnd, pagination) by the <a href="http://bibliontology.com/">Bibliographic Ontology</a>, 'bibo'.
   */
  public static BibExTerm.Builder bibExTerm() { return new BibExTerm.BibExTermThingBuilder(); }
  /**
   * Podiatry.
   */
  public static Podiatric.Builder podiatric() { return new Podiatric.PodiatricThingBuilder(); }
  /**
   * An ocean (for example, the Pacific).
   */
  public static OceanBodyOfWater.Builder oceanBodyOfWater() { return new OceanBodyOfWater.OceanBodyOfWaterThingBuilder(); }
  /**
   * Residence type: Apartment complex.
   */
  public static ApartmentComplex.Builder apartmentComplex() { return new ApartmentComplex.ApartmentComplexThingBuilder(); }
  /**
   * A medical trial is a type of medical study that uses scientific process used to compare the safety and efficacy of medical therapies or medical procedures. In general, medical trials are controlled and subjects are allocated at random to the different treatment and/or control groups.
   */
  public static MedicalTrial.Builder medicalTrial() { return new MedicalTrial.MedicalTrialThingBuilder(); }
  /**
   * The event has been cancelled. If the event has multiple startDate values, all are assumed to be cancelled. Either startDate or previousStartDate may be used to specify the event's cancelled date(s).
   */
  public static EventCancelled.Builder eventCancelled() { return new EventCancelled.EventCancelledThingBuilder(); }
  /**
   * A system of medicine focused on promoting the body's innate ability to heal itself.
   */
  public static Osteopathic.Builder osteopathic() { return new Osteopathic.OsteopathicThingBuilder(); }
  /**
   * A tattoo parlor.
   */
  public static TattooParlor.Builder tattooParlor() { return new TattooParlor.TattooParlorThingBuilder(); }
  /**
   * Play mode: CoOp. Co-operative games, where you play on the same team with friends.
   */
  public static CoOp.Builder coOp() { return new CoOp.CoOpThingBuilder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserBlocks.Builder userBlocks() { return new UserBlocks.UserBlocksThingBuilder(); }
  /**
   * A QAPage is a WebPage focussed on a specific Question and its Answer(s), e.g. in a question answering site or documenting Frequently Asked Questions (FAQs).
   */
  public static QAPage.Builder qAPage() { return new QAPage.QAPageThingBuilder(); }
  /**
   * A store that sells materials useful or necessary for various hobbies.
   */
  public static HobbyShop.Builder hobbyShop() { return new HobbyShop.HobbyShopThingBuilder(); }
  /**
   * The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
   */
  public static GeoShape.Builder geoShape() { return new GeoShape.GeoShapeThingBuilder(); }
  /**
   * The act of capturing sound and moving images on film, video, or digitally.
   */
  public static FilmAction.Builder filmAction() { return new FilmAction.FilmActionThingBuilder(); }
  /**
   * A medical procedure intended primarily for therapeutic purposes, aimed at improving a health condition.
   */
  public static TherapeuticProcedure.Builder therapeuticProcedure() { return new TherapeuticProcedure.TherapeuticProcedureThingBuilder(); }
  /**
   * A fire station. With firemen.
   */
  public static FireStation.Builder fireStation() { return new FireStation.FireStationThingBuilder(); }
  /**
   * A television station.
   */
  public static TelevisionStation.Builder televisionStation() { return new TelevisionStation.TelevisionStationThingBuilder(); }
  /**
   * Indicates that the item is available only at physical locations.
   */
  public static InStoreOnly.Builder inStoreOnly() { return new InStoreOnly.InStoreOnlyThingBuilder(); }
  /**
   * The causative agent(s) that are responsible for the pathophysiologic process that eventually results in a medical condition, symptom or sign. In this schema, unless otherwise specified this is meant to be the proximate cause of the medical condition, symptom or sign. The proximate cause is defined as the causative agent that most directly results in the medical condition, symptom or sign. For example, the HIV virus could be considered a cause of AIDS. Or in a diagnostic context, if a patient fell and sustained a hip fracture and two days later sustained a pulmonary embolism which eventuated in a cardiac arrest, the cause of the cardiac arrest (the proximate cause) would be the pulmonary embolism and not the fall. <p>Medical causes can include cardiovascular, chemical, dermatologic, endocrine, environmental, gastroenterologic, genetic, hematologic, gynecologic, iatrogenic, infectious, musculoskeletal, neurologic, nutritional, obstetric, oncologic, otolaryngologic, pharmacologic, psychiatric, pulmonary, renal, rheumatologic, toxic, traumatic, or urologic causes; medical conditions can be causes as well.
   */
  public static MedicalCause.Builder medicalCause() { return new MedicalCause.MedicalCauseThingBuilder(); }
  /**
   * EPRelease.
   */
  public static EPRelease.Builder ePRelease() { return new EPRelease.EPReleaseThingBuilder(); }
  /**
   * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the 'offers' property. Repeated events may be structured as separate Event objects.
   */
  public static Event.Builder event() { return new Event.EventThingBuilder(); }
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
  public static PaymentMethod.Builder paymentMethod() { return new PaymentMethod.PaymentMethodThingBuilder(); }
  /**
   * An elementary school.
   */
  public static ElementarySchool.Builder elementarySchool() { return new ElementarySchool.ElementarySchoolThingBuilder(); }
  /**
   * Data derived from a single randomized trial, or nonrandomized studies.
   */
  public static EvidenceLevelB.Builder evidenceLevelB() { return new EvidenceLevelB.EvidenceLevelBThingBuilder(); }
  /**
   * Data derived from multiple randomized clinical trials or meta-analyses.
   */
  public static EvidenceLevelA.Builder evidenceLevelA() { return new EvidenceLevelA.EvidenceLevelAThingBuilder(); }
  /**
   * OrderStatus representing that an order has been returned.
   */
  public static OrderReturned.Builder orderReturned() { return new OrderReturned.OrderReturnedThingBuilder(); }
  /**
   * Medical researchers.
   */
  public static MedicalResearcher.Builder medicalResearcher() { return new MedicalResearcher.MedicalResearcherThingBuilder(); }
  /**
   * EventStatusType is an enumeration type whose instances represent several states that an Event may be in.
   */
  public static EventStatusType.Builder eventStatusType() { return new EventStatusType.EventStatusTypeThingBuilder(); }
  /**
   * Only consensus opinion of experts, case studies, or standard-of-care.
   */
  public static EvidenceLevelC.Builder evidenceLevelC() { return new EvidenceLevelC.EvidenceLevelCThingBuilder(); }
  /**
   * Web page type: Image gallery page.
   */
  public static ImageGallery.Builder imageGallery() { return new ImageGallery.ImageGalleryThingBuilder(); }
  /**
   * The act of granting permission to an object.
   */
  public static AuthorizeAction.Builder authorizeAction() { return new AuthorizeAction.AuthorizeActionThingBuilder(); }
  /**
   * The footer section of the page.
   */
  public static WPFooter.Builder wPFooter() { return new WPFooter.WPFooterThingBuilder(); }
  /**
   * An action that has already taken place.
   */
  public static CompletedActionStatus.Builder completedActionStatus() { return new CompletedActionStatus.CompletedActionStatusThingBuilder(); }
  /**
   * SpokenWordAlbum.
   */
  public static SpokenWordAlbum.Builder spokenWordAlbum() { return new SpokenWordAlbum.SpokenWordAlbumThingBuilder(); }
  /**
   * Head.
   */
  public static Head.Builder head() { return new Head.HeadThingBuilder(); }
  /**
   * An outlet store.
   */
  public static OutletStore.Builder outletStore() { return new OutletStore.OutletStoreThingBuilder(); }
  /**
   * A bike store.
   */
  public static BikeStore.Builder bikeStore() { return new BikeStore.BikeStoreThingBuilder(); }
  /**
   * A type of blood vessel that specifically carries blood away from the heart.
   */
  public static Artery.Builder artery() { return new Artery.ArteryThingBuilder(); }
  /**
   * OrderStatus representing successful delivery of an order.
   */
  public static OrderDelivered.Builder orderDelivered() { return new OrderDelivered.OrderDeliveredThingBuilder(); }
  /**
   * A notary.
   */
  public static Notary.Builder notary() { return new Notary.NotaryThingBuilder(); }
  /**
   * The basic data types such as Integers, Strings, etc.
   */
  public static DataType.Builder dataType() { return new DataType.DataTypeThingBuilder(); }
  /**
   * Properties that take Mass as values are of the form '&lt;Number&gt; &lt;Mass unit of measure&gt;'. E.g., '7 kg'.
   */
  public static Mass.Builder mass() { return new Mass.MassThingBuilder(); }
  /**
   * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.
   */
  public static Demand.Builder demand() { return new Demand.DemandThingBuilder(); }
  /**
   * A reservation to dine at a food-related business.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  public static FoodEstablishmentReservation.Builder foodEstablishmentReservation() { return new FoodEstablishmentReservation.FoodEstablishmentReservationThingBuilder(); }
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
  public static BusinessFunction.Builder businessFunction() { return new BusinessFunction.BusinessFunctionThingBuilder(); }
  /**
   * A dance group&#x2014;for example, the Alvin Ailey Dance Theater or Riverdance.
   */
  public static DanceGroup.Builder danceGroup() { return new DanceGroup.DanceGroupThingBuilder(); }
  /**
   * An alternative, closely-related condition typically considered later in the differential diagnosis process along with the signs that are used to distinguish it.
   */
  public static DDxElement.Builder dDxElement() { return new DDxElement.DDxElementThingBuilder(); }
  /**
   * Web page type: Collection page.
   */
  public static CollectionPage.Builder collectionPage() { return new CollectionPage.CollectionPageThingBuilder(); }
  /**
   * The invitee may or may not attend.
   */
  public static RsvpResponseMaybe.Builder rsvpResponseMaybe() { return new RsvpResponseMaybe.RsvpResponseMaybeThingBuilder(); }
  /**
   * A mosque.
   */
  public static Mosque.Builder mosque() { return new Mosque.MosqueThingBuilder(); }
  /**
   * A utility class that serves as the umbrella for a number of 'intangible' things such as quantities, structured values, etc.
   */
  public static Intangible.Builder intangible() { return new Intangible.IntangibleThingBuilder(); }
  /**
   * A media episode (e.g. TV, radio, video game) which can be part of a series or season.
   */
  public static Episode.Builder episode() { return new Episode.EpisodeThingBuilder(); }
  /**
   * A statement of the money due for goods or services; a bill.
   */
  public static Invoice.Builder invoice() { return new Invoice.InvoiceThingBuilder(); }
  /**
   * Project
   */
  public static Project.Builder project() { return new Project.ProjectThingBuilder(); }
  /**
   * A recycling center.
   */
  public static RecyclingCenter.Builder recyclingCenter() { return new RecyclingCenter.RecyclingCenterThingBuilder(); }
  /**
   * The maximum dosing schedule considered safe for a drug or supplement as recommended by an authority or by the drug/supplement's manufacturer. Capture the recommending authority in the recognizingAuthority property of MedicalEntity.
   */
  public static MaximumDoseSchedule.Builder maximumDoseSchedule() { return new MaximumDoseSchedule.MaximumDoseScheduleThingBuilder(); }
  /**
   * A software application designed specifically to work well on a mobile device such as a telephone.
   */
  public static MobileApplication.Builder mobileApplication() { return new MobileApplication.MobileApplicationThingBuilder(); }
  /**
   * Results are not available.
   */
  public static ResultsNotAvailable.Builder resultsNotAvailable() { return new ResultsNotAvailable.ResultsNotAvailableThingBuilder(); }
  /**
   * Active, but not recruiting new participants.
   */
  public static ActiveNotRecruiting.Builder activeNotRecruiting() { return new ActiveNotRecruiting.ActiveNotRecruitingThingBuilder(); }
  /**
   * A software application.
   */
  public static SoftwareApplication.Builder softwareApplication() { return new SoftwareApplication.SoftwareApplicationThingBuilder(); }
  /**
   * An agent controls a device or application.
   */
  public static ControlAction.Builder controlAction() { return new ControlAction.ControlActionThingBuilder(); }
  /**
   * A unique instance of a radio BroadcastService on a CableOrSatelliteService lineup.
   */
  public static RadioChannel.Builder radioChannel() { return new RadioChannel.RadioChannelThingBuilder(); }
  /**
   * A service which provides access to media programming like TV or radio. Access may be via cable or satellite.
   */
  public static CableOrSatelliteService.Builder cableOrSatelliteService() { return new CableOrSatelliteService.CableOrSatelliteServiceThingBuilder(); }
  /**
   * A property, used to indicate attributes and relationships of some Thing; equivalent to rdf:Property.
   */
  public static Property.Builder property() { return new Property.PropertyThingBuilder(); }
  /**
   * VinylFormat.
   */
  public static VinylFormat.Builder vinylFormat() { return new VinylFormat.VinylFormatThingBuilder(); }
  /**
   * A cafe or coffee shop.
   */
  public static CafeOrCoffeeShop.Builder cafeOrCoffeeShop() { return new CafeOrCoffeeShop.CafeOrCoffeeShopThingBuilder(); }
  /**
   * A library.
   */
  public static Library.Builder library() { return new Library.LibraryThingBuilder(); }
  /**
   * An ItemList ordered with no explicit order.
   */
  public static ItemListUnordered.Builder itemListUnordered() { return new ItemListUnordered.ItemListUnorderedThingBuilder(); }
  /**
   * Design models for observational medical studies. Enumerated type.
   */
  public static MedicalObservationalStudyDesign.Builder medicalObservationalStudyDesign() { return new MedicalObservationalStudyDesign.MedicalObservationalStudyDesignThingBuilder(); }
  /**
   * The act of finding an object.<p>Related actions:</p><ul><li><a href="http://schema.org/SearchAction">SearchAction</a>: FindAction is generally lead by a SearchAction, but not necessarily</li></ul>.
   */
  public static FindAction.Builder findAction() { return new FindAction.FindActionThingBuilder(); }
  /**
   * CompilationAlbum.
   */
  public static CompilationAlbum.Builder compilationAlbum() { return new CompilationAlbum.CompilationAlbumThingBuilder(); }
  /**
   * The act of inserting at the beginning if an ordered collection.
   */
  public static PrependAction.Builder prependAction() { return new PrependAction.PrependActionThingBuilder(); }
  /**
   * A medical test performed on a sample of a patient's blood.
   */
  public static BloodTest.Builder bloodTest() { return new BloodTest.BloodTestThingBuilder(); }
  /**
   * X-ray imaging.
   */
  public static XRay.Builder xRay() { return new XRay.XRayThingBuilder(); }
  /**
   * The act of expressing a positive sentiment about the object. An agent likes an object (a proposition, topic or theme) with participants.
   */
  public static LikeAction.Builder likeAction() { return new LikeAction.LikeActionThingBuilder(); }
  /**
   * Beauty salon.
   */
  public static BeautySalon.Builder beautySalon() { return new BeautySalon.BeautySalonThingBuilder(); }
  /**
   * A governmental organization or agency.
   */
  public static GovernmentOrganization.Builder governmentOrganization() { return new GovernmentOrganization.GovernmentOrganizationThingBuilder(); }
  /**
   * A specific branch of medical science that is concerned with the diagnosis and treatment of diseases pertaining to the urinary tract and the urogenital system.
   */
  public static Urologic.Builder urologic() { return new Urologic.UrologicThingBuilder(); }
  /**
   * RsvpResponseType is an enumeration type whose instances represent responding to an RSVP request.
   */
  public static RsvpResponseType.Builder rsvpResponseType() { return new RsvpResponseType.RsvpResponseTypeThingBuilder(); }
  /**
   * Any anatomical structure which pertains to the soft nervous tissue functioning as the coordinating center of sensation and intellectual and nervous activity.
   */
  public static BrainStructure.Builder brainStructure() { return new BrainStructure.BrainStructureThingBuilder(); }
  /**
   * A subclass of OrganizationRole used to describe employee relationships.
   */
  public static EmployeeRole.Builder employeeRole() { return new EmployeeRole.EmployeeRoleThingBuilder(); }
  /**
   * RemixAlbum.
   */
  public static RemixAlbum.Builder remixAlbum() { return new RemixAlbum.RemixAlbumThingBuilder(); }
  /**
   * Target audiences for medical web pages. Enumerated type.
   */
  public static MedicalAudience.Builder medicalAudience() { return new MedicalAudience.MedicalAudienceThingBuilder(); }
  /**
   * A movie rental store.
   */
  public static MovieRentalStore.Builder movieRentalStore() { return new MovieRentalStore.MovieRentalStoreThingBuilder(); }
  /**
   * Server that provides game interaction in a multiplayer game.
   */
  public static GameServer.Builder gameServer() { return new GameServer.GameServerThingBuilder(); }
  /**
   * This class is based on the work of the LRMI project, see lrmi.net for details.
   */
  public static LRMIClass.Builder lRMIClass() { return new LRMIClass.LRMIClassThingBuilder(); }
  /**
   * A car is a wheeled, self-powered motor vehicle used for transportation.
   */
  public static Car.Builder car() { return new Car.CarThingBuilder(); }
  /**
   * A crematorium.
   */
  public static Crematorium.Builder crematorium() { return new Crematorium.CrematoriumThingBuilder(); }
  /**
   * Bank or credit union.
   */
  public static BankOrCreditUnion.Builder bankOrCreditUnion() { return new BankOrCreditUnion.BankOrCreditUnionThingBuilder(); }
  /**
   * An agent quotes/estimates/appraises an object/product/service with a price at a location/store.
   */
  public static QuoteAction.Builder quoteAction() { return new QuoteAction.QuoteActionThingBuilder(); }
  /**
   * The act of physically/electronically dispatching an object for transfer from an origin to a destination.<p>Related actions:</p><ul><li><a href="http://schema.org/ReceiveAction">ReceiveAction</a>: The reciprocal of SendAction.</li><li><a href="http://schema.org/GiveAction">GiveAction</a>: Unlike GiveAction, SendAction does not imply the transfer of ownership (e.g. I can send you my laptop, but I'm not necessarily giving it to you)</li></ul>.
   */
  public static SendAction.Builder sendAction() { return new SendAction.SendActionThingBuilder(); }
  /**
   * A doctor's office.
   */
  public static Physician.Builder physician() { return new Physician.PhysicianThingBuilder(); }
  /**
   * A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons.
   */
  public static Nerve.Builder nerve() { return new Nerve.NerveThingBuilder(); }
  /**
   * Professional service: Attorney.
   */
  public static Attorney.Builder attorney() { return new Attorney.AttorneyThingBuilder(); }
  /**
   * Any medical imaging modality typically used for diagnostic purposes.
   */
  public static ImagingTest.Builder imagingTest() { return new ImagingTest.ImagingTestThingBuilder(); }
  /**
   * A publication event e.g. catch-up TV or radio podcast, during which a program is available on-demand.
   */
  public static OnDemandEvent.Builder onDemandEvent() { return new OnDemandEvent.OnDemandEventThingBuilder(); }
  /**
   * The most generic type of entity related to health and the practice of medicine.
   */
  public static MedicalEntity.Builder medicalEntity() { return new MedicalEntity.MedicalEntityThingBuilder(); }
  /**
   * A golf course.
   */
  public static GolfCourse.Builder golfCourse() { return new GolfCourse.GolfCourseThingBuilder(); }
  /**
   * The act of giving money in return for temporary use, but not ownership, of an object such as a vehicle or property. For example, an agent rents a property from a landlord in exchange for a periodic payment.
   */
  public static RentAction.Builder rentAction() { return new RentAction.RentActionThingBuilder(); }
  /**
   * A patient-reported or observed dosing schedule for a drug or supplement.
   */
  public static ReportedDoseSchedule.Builder reportedDoseSchedule() { return new ReportedDoseSchedule.ReportedDoseScheduleThingBuilder(); }
  /**
   * Lists or enumerations&#x2014;for example, a list of cuisines or music genres, etc.
   */
  public static Enumeration.Builder enumeration() { return new Enumeration.EnumerationThingBuilder(); }
  /**
   * A hospital.
   */
  public static Hospital.Builder hospital() { return new Hospital.HospitalThingBuilder(); }
  /**
   * The most generic type of item.
   */
  public static Thing.Builder thing() { return new Thing.ThingThingBuilder(); }
  /**
   * A furniture store.
   */
  public static FurnitureStore.Builder furnitureStore() { return new FurnitureStore.FurnitureStoreThingBuilder(); }
  /**
   * Event type: Visual arts event.
   */
  public static VisualArtsEvent.Builder visualArtsEvent() { return new VisualArtsEvent.VisualArtsEventThingBuilder(); }
  /**
   * CassetteFormat.
   */
  public static CassetteFormat.Builder cassetteFormat() { return new CassetteFormat.CassetteFormatThingBuilder(); }
  /**
   * The act of expressing a preference from a set of options or a large or unbounded set of choices/options.
   */
  public static ChooseAction.Builder chooseAction() { return new ChooseAction.ChooseActionThingBuilder(); }
  /**
   * A sporting goods store.
   */
  public static SportingGoodsStore.Builder sportingGoodsStore() { return new SportingGoodsStore.SportingGoodsStoreThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to diagnosis and treatment of disorders of heart and vasculature.
   */
  public static Cardiovascular.Builder cardiovascular() { return new Cardiovascular.CardiovascularThingBuilder(); }
  /**
   * Pathogenic bacteria that cause bacterial infection.
   */
  public static Bacteria.Builder bacteria() { return new Bacteria.BacteriaThingBuilder(); }
  /**
   * Any object used in a medical capacity, such as to diagnose or treat a patient.
   */
  public static MedicalDevice.Builder medicalDevice() { return new MedicalDevice.MedicalDeviceThingBuilder(); }
  /**
   * Organization: Non-governmental Organization.
   */
  public static NGO.Builder nGO() { return new NGO.NGOThingBuilder(); }
  /**
   * A blog post.
   */
  public static BlogPosting.Builder blogPosting() { return new BlogPosting.BlogPostingThingBuilder(); }
  /**
   * A reservoir of water, typically an artificially created lake, like the Lake Kariba reservoir.
   */
  public static Reservoir.Builder reservoir() { return new Reservoir.ReservoirThingBuilder(); }
  /**
   * A DeliveryMethod in which an item is collected on site, e.g. in a store or at a box office.
   */
  public static OnSitePickup.Builder onSitePickup() { return new OnSitePickup.OnSitePickupThingBuilder(); }
  /**
   * Car repair, sales, or parts.
   */
  public static AutomotiveBusiness.Builder automotiveBusiness() { return new AutomotiveBusiness.AutomotiveBusinessThingBuilder(); }
  /**
   * A car rental business.
   */
  public static AutoRental.Builder autoRental() { return new AutoRental.AutoRentalThingBuilder(); }
  /**
   * An advertising section of the page.
   */
  public static WPAdBlock.Builder wPAdBlock() { return new WPAdBlock.WPAdBlockThingBuilder(); }
  /**
   * This element is based on the work of the Automotive Ontology Working Group, see <a href="http://www.automotive-ontology.org">http://www.automotive-ontology.org</a> for details. Many class and property definitions are inspired by or based on abstracts from Wikipedia, the free encyclopedia.
   */
  public static AutomotiveOntologyWGClass.Builder automotiveOntologyWGClass() { return new AutomotiveOntologyWGClass.AutomotiveOntologyWGClassThingBuilder(); }
  /**
   * The act of manipulating/administering/supervising/controlling one or more objects.
   */
  public static OrganizeAction.Builder organizeAction() { return new OrganizeAction.OrganizeActionThingBuilder(); }
  /**
   * Bed and breakfast.
   */
  public static BedAndBreakfast.Builder bedAndBreakfast() { return new BedAndBreakfast.BedAndBreakfastThingBuilder(); }
  /**
   * Respiratory therapy.
   */
  public static RespiratoryTherapy.Builder respiratoryTherapy() { return new RespiratoryTherapy.RespiratoryTherapyThingBuilder(); }
  /**
   * OrderStatus representing cancellation of an order.
   */
  public static OrderCancelled.Builder orderCancelled() { return new OrderCancelled.OrderCancelledThingBuilder(); }
  /**
   * The act of playing/exercising/training/performing for enjoyment, leisure, recreation, Competition or exercise.<p>Related actions:</p><ul><li><a href="http://schema.org/ListenAction">ListenAction</a>: Unlike ListenAction (which is under ConsumeAction), PlayAction refers to performing for an audience or at an event, rather than consuming music.</li><li><a href="http://schema.org/WatchAction">WatchAction</a>: Unlike WatchAction (which is under ConsumeAction), PlayAction refers to showing/displaying for an audience or at an event, rather than consuming visual content</li></ul>.
   */
  public static PlayAction.Builder playAction() { return new PlayAction.PlayActionThingBuilder(); }
  /**
   * A process of care involving exercise, changes to diet, fitness routines, and other lifestyle changes aimed at improving a health condition.
   */
  public static LifestyleModification.Builder lifestyleModification() { return new LifestyleModification.LifestyleModificationThingBuilder(); }
  /**
   * A specific branch of medical science that is concerned with poisons, their nature, effects and detection and involved in the treatment of poisoning.
   */
  public static Toxicologic.Builder toxicologic() { return new Toxicologic.ToxicologicThingBuilder(); }
  /**
   * The event is taking place or has taken place on the startDate as scheduled. Use of this value is optional, as it is assumed by default.
   */
  public static EventScheduled.Builder eventScheduled() { return new EventScheduled.EventScheduledThingBuilder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserPageVisits.Builder userPageVisits() { return new UserPageVisits.UserPageVisitsThingBuilder(); }
  /**
   * An adult entertainment establishment.
   */
  public static AdultEntertainment.Builder adultEntertainment() { return new AdultEntertainment.AdultEntertainmentThingBuilder(); }
  /**
   * Patients.
   */
  public static Patient.Builder patient() { return new Patient.PatientThingBuilder(); }
  /**
   * A medical device used for diagnostic purposes.
   */
  public static Diagnostic.Builder diagnostic() { return new Diagnostic.DiagnosticThingBuilder(); }
  /**
   * The act of producing/preparing food.
   */
  public static CookAction.Builder cookAction() { return new CookAction.CookActionThingBuilder(); }
  /**
   * Aquarium.
   */
  public static Aquarium.Builder aquarium() { return new Aquarium.AquariumThingBuilder(); }
  /**
   * A hotel.
   */
  public static Hotel.Builder hotel() { return new Hotel.HotelThingBuilder(); }
  /**
   * An emergency service, such as a fire station or ER.
   */
  public static EmergencyService.Builder emergencyService() { return new EmergencyService.EmergencyServiceThingBuilder(); }
  /**
   * A map.
   */
  public static Map.Builder map() { return new Map.MapThingBuilder(); }
  /**
   * Enumerated status values for Order.
   */
  public static OrderStatus.Builder orderStatus() { return new OrderStatus.OrderStatusThingBuilder(); }
  /**
   * Data type: Integer.
   */
  public static Integer.Builder integer() { return new Integer.IntegerThingBuilder(); }
  /**
   * A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.
   */
  public static TypeAndQuantityNode.Builder typeAndQuantityNode() { return new TypeAndQuantityNode.TypeAndQuantityNodeThingBuilder(); }
  /**
   * A value indicating a special usage of a car, e.g. commercial rental, driving school, or as a taxi.
   */
  public static CarUsageType.Builder carUsageType() { return new CarUsageType.CarUsageTypeThingBuilder(); }
  /**
   * Web page type: Video gallery page.
   */
  public static VideoGallery.Builder videoGallery() { return new VideoGallery.VideoGalleryThingBuilder(); }
  /**
   * The status of a reservation on hold pending an update like credit card number or flight changes.
   */
  public static ReservationHold.Builder reservationHold() { return new ReservationHold.ReservationHoldThingBuilder(); }
  /**
   * A photograph.
   */
  public static Photograph.Builder photograph() { return new Photograph.PhotographThingBuilder(); }
  /**
   * A body of structured information describing some topic(s) of interest.
   */
  public static Dataset.Builder dataset() { return new Dataset.DatasetThingBuilder(); }
  /**
   * A specific branch of medical science that is concerned with the study of the cause, origin and nature of a disease state, including its consequences as a result of manifestation of the disease. In clinical care, the term is used to designate a branch of medicine using laboratory tests to diagnose and determine the prognostic significance of illness.
   */
  public static Pathology.Builder pathology() { return new Pathology.PathologyThingBuilder(); }
  /**
   * Auto body shop.
   */
  public static AutoBodyShop.Builder autoBodyShop() { return new AutoBodyShop.AutoBodyShopThingBuilder(); }
  /**
   * An auto parts store.
   */
  public static AutoPartsStore.Builder autoPartsStore() { return new AutoPartsStore.AutoPartsStoreThingBuilder(); }
  /**
   * Health and beauty.
   */
  public static HealthAndBeautyBusiness.Builder healthAndBeautyBusiness() { return new HealthAndBeautyBusiness.HealthAndBeautyBusinessThingBuilder(); }
  /**
   * The act of capturing still images of objects using a camera.
   */
  public static PhotographAction.Builder photographAction() { return new PhotographAction.PhotographActionThingBuilder(); }
  /**
   * Web page type: Checkout page.
   */
  public static CheckoutPage.Builder checkoutPage() { return new CheckoutPage.CheckoutPageThingBuilder(); }
  /**
   * The status of a medical study. Enumerated type.
   */
  public static MedicalStudyStatus.Builder medicalStudyStatus() { return new MedicalStudyStatus.MedicalStudyStatusThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to treating diseases, injuries and deformities by manual and instrumental means.
   */
  public static Surgical.Builder surgical() { return new Surgical.SurgicalThingBuilder(); }
  /**
   * Optometry.
   */
  public static Optometic.Builder optometic() { return new Optometic.OptometicThingBuilder(); }
  /**
   * Enrolling participants by invitation only.
   */
  public static EnrollingByInvitation.Builder enrollingByInvitation() { return new EnrollingByInvitation.EnrollingByInvitationThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to therapeutic or cosmetic repair or re-formation of missing, injured or malformed tissues or body parts by manual and instrumental means.
   */
  public static PlasticSurgery.Builder plasticSurgery() { return new PlasticSurgery.PlasticSurgeryThingBuilder(); }
  /**
   * A zoo.
   */
  public static Zoo.Builder zoo() { return new Zoo.ZooThingBuilder(); }
  /**
   * Indicates that the item is available only online.
   */
  public static OnlineOnly.Builder onlineOnly() { return new OnlineOnly.OnlineOnlyThingBuilder(); }
  /**
   * Place of worship, such as a church, synagogue, or mosque.
   */
  public static PlaceOfWorship.Builder placeOfWorship() { return new PlaceOfWorship.PlaceOfWorshipThingBuilder(); }
  /**
   * An enumeration of several kinds of Map.
   */
  public static MapCategoryType.Builder mapCategoryType() { return new MapCategoryType.MapCategoryTypeThingBuilder(); }
  /**
   * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates polled from.<p>Related actions:</p><ul><li><a href="http://schema.org/BefriendAction">BefriendAction</a>: Unlike BefriendAction, FollowAction implies that the connection is *not* necessarily reciprocal.</li><li><a href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, FollowAction implies that the follower acts as an active agent constantly/actively polling for updates.</li><li><a href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, FollowAction implies that the agent is interested in continuing receiving updates from the object.</li><li><a href="http://schema.org/JoinAction">JoinAction</a>: Unlike JoinAction, FollowAction implies that the agent is interested in getting updates from the object.</li><li><a href="http://schema.org/TrackAction">TrackAction</a>: Unlike TrackAction, FollowAction refers to the polling of updates of all aspects of animate objects rather than the location of inanimate objects (e.g. you track a package, but you don't follow it)</li></ul>.
   */
  public static FollowAction.Builder followAction() { return new FollowAction.FollowActionThingBuilder(); }
  /**
   * A specific branch of medical science that is concerned with the study, treatment, and prevention of mental illness, using both medical and psychological therapies.
   */
  public static Psychiatric.Builder psychiatric() { return new Psychiatric.PsychiatricThingBuilder(); }
  /**
   * The act of notifying someone of information pertinent to them, with no expectation of a response.
   */
  public static InformAction.Builder informAction() { return new InformAction.InformActionThingBuilder(); }
  /**
   * The place where a person lives.
   */
  public static Residence.Builder residence() { return new Residence.ResidenceThingBuilder(); }
  /**
   * OrderStatus representing that an order is in transit.
   */
  public static OrderInTransit.Builder orderInTransit() { return new OrderInTransit.OrderInTransitThingBuilder(); }
  /**
   * Event type: Music event.
   */
  public static MusicEvent.Builder musicEvent() { return new MusicEvent.MusicEventThingBuilder(); }
  /**
   * The act of ingesting information/resources/food.
   */
  public static ConsumeAction.Builder consumeAction() { return new ConsumeAction.ConsumeActionThingBuilder(); }
  /**
   * An audio file.
   */
  public static AudioObject.Builder audioObject() { return new AudioObject.AudioObjectThingBuilder(); }
  /**
   * A service for a vehicle for hire with a driver for local travel. Fares are usually calculated based on distance traveled.
   */
  public static TaxiService.Builder taxiService() { return new TaxiService.TaxiServiceThingBuilder(); }
  /**
   * The act of expressing a desire about the object. An agent wants an object.
   */
  public static WantAction.Builder wantAction() { return new WantAction.WantActionThingBuilder(); }
  /**
   * A state or province of a country.
   */
  public static State.Builder state() { return new State.StateThingBuilder(); }
  /**
   * A structured value providing information about when a certain organization or person owned a certain product.
   */
  public static OwnershipInfo.Builder ownershipInfo() { return new OwnershipInfo.OwnershipInfoThingBuilder(); }
  /**
   * Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.
   */
  public static AnatomicalStructure.Builder anatomicalStructure() { return new AnatomicalStructure.AnatomicalStructureThingBuilder(); }
  /**
   * A specific branch of medical science that specializes in the care of infants, children and adolescents.
   */
  public static Pediatric.Builder pediatric() { return new Pediatric.PediatricThingBuilder(); }
  /**
   * The act of providing an object under an agreement that it will be returned at a later date. Reciprocal of BorrowAction.<p>Related actions:</p><ul><li><a href="http://schema.org/BorrowAction">BorrowAction</a>: Reciprocal of LendAction</li></ul>.
   */
  public static LendAction.Builder lendAction() { return new LendAction.LendActionThingBuilder(); }
  /**
   * An organization that provides flights for passengers.
   */
  public static Airline.Builder airline() { return new Airline.AirlineThingBuilder(); }
  /**
   * A news article.
   */
  public static NewsArticle.Builder newsArticle() { return new NewsArticle.NewsArticleThingBuilder(); }
  /**
   * A middle school (typically for children aged around 11-14, although this varies somewhat).
   */
  public static MiddleSchool.Builder middleSchool() { return new MiddleSchool.MiddleSchoolThingBuilder(); }
  /**
   * The kind of release which this album is: single, EP or album.
   */
  public static MusicAlbumReleaseType.Builder musicAlbumReleaseType() { return new MusicAlbumReleaseType.MusicAlbumReleaseTypeThingBuilder(); }
  /**
   * A TV episode which can be part of a series or season.
   */
  public static TVEpisode.Builder tVEpisode() { return new TVEpisode.TVEpisodeThingBuilder(); }
  /**
   * Indicates that the item is available for pre-order.
   */
  public static PreOrder.Builder preOrder() { return new PreOrder.PreOrderThingBuilder(); }
  /**
   * A stadium.
   */
  public static StadiumOrArena.Builder stadiumOrArena() { return new StadiumOrArena.StadiumOrArenaThingBuilder(); }
  /**
   * A guideline contraindication that designates a process as harmful and where quality of the data supporting the contraindication is sound.
   */
  public static MedicalGuidelineContraindication.Builder medicalGuidelineContraindication() { return new MedicalGuidelineContraindication.MedicalGuidelineContraindicationThingBuilder(); }
  /**
   * A utility class that serves as the umbrella for a number of 'intangible' things in the medical space.
   */
  public static MedicalIntangible.Builder medicalIntangible() { return new MedicalIntangible.MedicalIntangibleThingBuilder(); }
  /**
   * Any branch of a field in which people typically develop specific expertise, usually after significant study, time, and effort.
   */
  public static Specialty.Builder specialty() { return new Specialty.SpecialtyThingBuilder(); }
  /**
   * Also known as a panel study. A cohort study is a form of longitudinal study used in medicine and social science. It is one type of study design and should be compared with a cross-sectional study.  A cohort is a group of people who share a common characteristic or experience within a defined period (e.g., are born, leave school, lose their job, are exposed to a drug or a vaccine, etc.). The comparison group may be the general population from which the cohort is drawn, or it may be another cohort of persons thought to have had little or no exposure to the substance under investigation, but otherwise similar. Alternatively, subgroups within the cohort may be compared with each other.
   */
  public static CohortStudy.Builder cohortStudy() { return new CohortStudy.CohortStudyThingBuilder(); }
  /**
   * Physical activity of relatively low intensity that depends primarily on the aerobic energy-generating process; during activity, the aerobic metabolism uses oxygen to adequately meet energy demands during exercise.
   */
  public static AerobicActivity.Builder aerobicActivity() { return new AerobicActivity.AerobicActivityThingBuilder(); }
  /**
   * A component of the human body circulatory system comprised of an intricate network of hollow tubes that transport blood throughout the entire body.
   */
  public static Vessel.Builder vessel() { return new Vessel.VesselThingBuilder(); }
  /**
   * Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations.
   */
  public static SportsOrganization.Builder sportsOrganization() { return new SportsOrganization.SportsOrganizationThingBuilder(); }
  /**
   * The act of intentionally disregarding the object. An agent ignores an object.
   */
  public static IgnoreAction.Builder ignoreAction() { return new IgnoreAction.IgnoreActionThingBuilder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserCheckins.Builder userCheckins() { return new UserCheckins.UserCheckinsThingBuilder(); }
  /**
   * Uses devices to support users with hearing impairments.
   */
  public static HearingImpairedSupported.Builder hearingImpairedSupported() { return new HearingImpairedSupported.HearingImpairedSupportedThingBuilder(); }
  /**
   * Represents additional information about a relationship or property. For example a Role can be used to say that a 'member' role linking some SportsTeam to a player occurred during a particular time period. Or that a Person's 'actor' role in a Movie was for some particular characterName. Such properties can be attached to a Role entity, which is then associated with the main entities using ordinary properties like 'member' or 'actor'.

      <br/><br/>See also <a href="http://blog.schema.org/2014/06/introducing-role.html">blog post</a>.
   */
  public static Role.Builder role() { return new Role.RoleThingBuilder(); }
  /**
   * Event type: Food event.
   */
  public static FoodEvent.Builder foodEvent() { return new FoodEvent.FoodEventThingBuilder(); }
  /**
   * The act of traveling from an fromLocation to a destination by a specified mode of transport, optionally with participants.
   */
  public static TravelAction.Builder travelAction() { return new TravelAction.TravelActionThingBuilder(); }
  /**
   * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates pushed to.<p>Related actions:</p><ul><li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, SubscribeAction implies that the subscriber acts as a passive agent being constantly/actively pushed for updates.</li><li><a href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.</li><li><a href="http://schema.org/JoinAction">JoinAction</a>: Unlike JoinAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object</li></ul>.
   */
  public static SubscribeAction.Builder subscribeAction() { return new SubscribeAction.SubscribeActionThingBuilder(); }
  /**
   * A short radio program or a segment/part of a radio program.
   */
  public static RadioClip.Builder radioClip() { return new RadioClip.RadioClipThingBuilder(); }
  /**
   * A brand is a name used by an organization or business person for labeling a product, product group, or similar.
   */
  public static Brand.Builder brand() { return new Brand.BrandThingBuilder(); }
  /**
   * A list of items of any sort&#x2014;for example, Top 10 Movies About Weathermen, or Top 100 Party Songs. Not to be confused with HTML lists, which are often used only for formatting.
   */
  public static ItemList.Builder itemList() { return new ItemList.ItemListThingBuilder(); }
  /**
   * A ski resort.
   */
  public static SkiResort.Builder skiResort() { return new SkiResort.SkiResortThingBuilder(); }
  /**
   * A contact point&#x2014;for example, a Customer Complaints department.
   */
  public static ContactPoint.Builder contactPoint() { return new ContactPoint.ContactPointThingBuilder(); }
  /**
   * The act of providing goods, services, or money without compensation, often for philanthropic reasons.
   */
  public static DonateAction.Builder donateAction() { return new DonateAction.DonateActionThingBuilder(); }
  /**
   * The steering position is on the left side of the vehicle (viewed from the main direction of driving).
   */
  public static LeftHandDriving.Builder leftHandDriving() { return new LeftHandDriving.LeftHandDrivingThingBuilder(); }
  /**
   * A single, identifiable product instance (e.g. a laptop with a particular serial number).
   */
  public static IndividualProduct.Builder individualProduct() { return new IndividualProduct.IndividualProductThingBuilder(); }
  /**
   * A store that sells mobile phones and related accessories.
   */
  public static MobilePhoneStore.Builder mobilePhoneStore() { return new MobilePhoneStore.MobilePhoneStoreThingBuilder(); }
  /**
   * A government building.
   */
  public static GovernmentBuilding.Builder governmentBuilding() { return new GovernmentBuilding.GovernmentBuildingThingBuilder(); }
  /**
   * The act of dressing oneself in clothing.
   */
  public static WearAction.Builder wearAction() { return new WearAction.WearActionThingBuilder(); }
  /**
   * Any bodily activity that enhances or maintains physical fitness and overall health and wellness. Includes activity that is part of daily living and routine, structured exercise, and exercise prescribed as part of a medical treatment or recovery plan.
   */
  public static PhysicalActivity.Builder physicalActivity() { return new PhysicalActivity.PhysicalActivityThingBuilder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserTweets.Builder userTweets() { return new UserTweets.UserTweetsThingBuilder(); }
  /**
   * An action performed by a direct agent and indirect     participants upon a direct object. Optionally happens at a location     with the help of an inanimate instrument. The execution of the action     may produce a result. Specific action sub-type documentation specifies     the exact expectation of each argument/role.
      <br/><br/>See also <a href="http://blog.schema.org/2014/04/announcing-schemaorg-actions.html">blog post</a>
      and <a href="http://schema.org/docs/actions.html">Actions overview document</a>.
   */
  public static Action.Builder action() { return new Action.ActionThingBuilder(); }
  /**
   * The costs of settling the payment using a particular payment method.
   */
  public static PaymentChargeSpecification.Builder paymentChargeSpecification() { return new PaymentChargeSpecification.PaymentChargeSpecificationThingBuilder(); }
  /**
   * An observational study is a type of medical study that attempts to infer the possible effect of a treatment through observation of a cohort of subjects over a period of time. In an observational study, the assignment of subjects into treatment groups versus control groups is outside the control of the investigator. This is in contrast with controlled studies, such as the randomized controlled trials represented by MedicalTrial, where each subject is randomly assigned to a treatment group or a control group before the start of the treatment.
   */
  public static MedicalObservationalStudy.Builder medicalObservationalStudy() { return new MedicalObservationalStudy.MedicalObservationalStudyThingBuilder(); }
  /**
   * The act of expressing a difference of opinion with the object. An agent disagrees to/about an object (a proposition, topic or theme) with participants.
   */
  public static DisagreeAction.Builder disagreeAction() { return new DisagreeAction.DisagreeActionThingBuilder(); }
  /**
   * The act of an agent communicating (service provider, social media, etc) their arrival by registering/confirming for a previously reserved service (e.g. flight check in) or at a place (e.g. hotel), possibly resulting in a result (boarding pass, etc).<p>Related actions:</p><ul><li><a href="http://schema.org/CheckOutAction">CheckOutAction</a>: The antonym of CheckInAction.</li><li><a href="http://schema.org/ArriveAction">ArriveAction</a>: Unlike ArriveAction, CheckInAction implies that the agent is informing/confirming the start of a previously reserved service.</li><li><a href="http://schema.org/ConfirmAction">ConfirmAction</a>: Unlike ConfirmAction, CheckInAction implies that the agent is informing/confirming the *start* of a previously reserved service rather than its validity/existence</li></ul>.
   */
  public static CheckInAction.Builder checkInAction() { return new CheckInAction.CheckInActionThingBuilder(); }
  /**
   * A navigation element of the page.
   */
  public static SiteNavigationElement.Builder siteNavigationElement() { return new SiteNavigationElement.SiteNavigationElementThingBuilder(); }
  /**
   * The act of being defeated in a competitive activity.
   */
  public static LoseAction.Builder loseAction() { return new LoseAction.LoseActionThingBuilder(); }
  /**
   * A person (alive, dead, undead, or fictional).
   */
  public static Person.Builder person() { return new Person.PersonThingBuilder(); }
  /**
   * An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.

      <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
   */
  public static Article.Builder article() { return new Article.ArticleThingBuilder(); }
  /**
   * A shop that sells alcoholic drinks such as wine, beer, whisky and other spirits.
   */
  public static LiquorStore.Builder liquorStore() { return new LiquorStore.LiquorStoreThingBuilder(); }
  /**
   * The drug's cost represents the retail cost of the drug.
   */
  public static Retail.Builder retail() { return new Retail.RetailThingBuilder(); }
  /**
   * A code for a medical entity.
   */
  public static MedicalCode.Builder medicalCode() { return new MedicalCode.MedicalCodeThingBuilder(); }
  /**
   * A short segment/part of a video game.
   */
  public static VideoGameClip.Builder videoGameClip() { return new VideoGameClip.VideoGameClipThingBuilder(); }
  /**
   * Physical activity that is engaged in to improve joint and muscle flexibility.
   */
  public static Flexibility.Builder flexibility() { return new Flexibility.FlexibilityThingBuilder(); }
  /**
   * Indicates that the item is refurbished.
   */
  public static RefurbishedCondition.Builder refurbishedCondition() { return new RefurbishedCondition.RefurbishedConditionThingBuilder(); }
  /**
   * Studies carried out on pre-existing data (usually from 'snapshot' surveys), such as that collected by the Census Bureau. Sometimes called Prevalence Studies.
   */
  public static CrossSectional.Builder crossSectional() { return new CrossSectional.CrossSectionalThingBuilder(); }
  /**
   * A place offering space for "Recreational Vehicles", Caravans, mobile homes and the like.
   */
  public static RVPark.Builder rVPark() { return new RVPark.RVParkThingBuilder(); }
  /**
   * An agent joins an event/group with participants/friends at a location.<p>Related actions:</p><ul><li><a href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, JoinAction refers to joining a group/team of people.</li><li><a href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, JoinAction does not imply that you'll be receiving updates.</li><li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, JoinAction does not imply that you'll be polling for updates</li></ul>.
   */
  public static JoinAction.Builder joinAction() { return new JoinAction.JoinActionThingBuilder(); }
  /**
   * Medical clinicians, including practicing physicians and other medical professionals involved in clinical practice.
   */
  public static Clinician.Builder clinician() { return new Clinician.ClinicianThingBuilder(); }
  /**
   * The act of asserting that a future event/action is no longer going to happen.<p>Related actions:</p><ul><li><a href="http://schema.org/ConfirmAction">ConfirmAction</a>: The antonym of CancelAction</li></ul>.
   */
  public static CancelAction.Builder cancelAction() { return new CancelAction.CancelActionThingBuilder(); }
  /**
   * Physiotherapy.
   */
  public static Physiotherapy.Builder physiotherapy() { return new Physiotherapy.PhysiotherapyThingBuilder(); }
  /**
   * Web page type: About page.
   */
  public static AboutPage.Builder aboutPage() { return new AboutPage.AboutPageThingBuilder(); }
  /**
   * Pathogenic virus that causes viral infection.
   */
  public static Virus.Builder virus() { return new Virus.VirusThingBuilder(); }
  /**
   * A trial that takes place at multiple centers.
   */
  public static MultiCenterTrial.Builder multiCenterTrial() { return new MultiCenterTrial.MultiCenterTrialThingBuilder(); }
  /**
   * Real-wheel drive is a transmission layout where the engine drives the rear wheels.
   */
  public static RearWheelDriveConfiguration.Builder rearWheelDriveConfiguration() { return new RearWheelDriveConfiguration.RearWheelDriveConfigurationThingBuilder(); }
  /**
   * A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.
        <br/><br/>
        Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.
    
   */
  public static PropertyValue.Builder propertyValue() { return new PropertyValue.PropertyValueThingBuilder(); }
  /**
   * A painting.
   */
  public static Painting.Builder painting() { return new Painting.PaintingThingBuilder(); }
  /**
   * A registry-based study design.
   */
  public static Registry.Builder registry() { return new Registry.RegistryThingBuilder(); }
  /**
   * A shopping center or mall.
   */
  public static ShoppingCenter.Builder shoppingCenter() { return new ShoppingCenter.ShoppingCenterThingBuilder(); }
  /**
   * An ice cream shop.
   */
  public static IceCreamShop.Builder iceCreamShop() { return new IceCreamShop.IceCreamShopThingBuilder(); }
  /**
   * A Hindu temple.
   */
  public static HinduTemple.Builder hinduTemple() { return new HinduTemple.HinduTempleThingBuilder(); }
  /**
   * A venue map (e.g. for malls, auditoriums, museums, etc.).
   */
  public static VenueMap.Builder venueMap() { return new VenueMap.VenueMapThingBuilder(); }
  /**
   * The act of expressing a preference from a fixed/finite/structured set of choices/options.
   */
  public static VoteAction.Builder voteAction() { return new VoteAction.VoteActionThingBuilder(); }
  /**
   * Magnetic resonance imaging.
   */
  public static MRI.Builder mRI() { return new MRI.MRIThingBuilder(); }
  /**
   * Multicellular parasite that causes an infection.
   */
  public static MulticellularParasite.Builder multicellularParasite() { return new MulticellularParasite.MulticellularParasiteThingBuilder(); }
  /**
   * A self-storage facility.
   */
  public static SelfStorage.Builder selfStorage() { return new SelfStorage.SelfStorageThingBuilder(); }
  /**
   * A listing that describes a job opening in a certain organization.
   */
  public static JobPosting.Builder jobPosting() { return new JobPosting.JobPostingThingBuilder(); }
  /**
   * A taxi stand.
   */
  public static TaxiStand.Builder taxiStand() { return new TaxiStand.TaxiStandThingBuilder(); }
  /**
   * A medical procedure intended primarily for palliative purposes, aimed at relieving the symptoms of an underlying health condition.
   */
  public static PalliativeProcedure.Builder palliativeProcedure() { return new PalliativeProcedure.PalliativeProcedureThingBuilder(); }
  /**
   * DigitalFormat.
   */
  public static DigitalFormat.Builder digitalFormat() { return new DigitalFormat.DigitalFormatThingBuilder(); }
  /**
   * A convenience store.
   */
  public static ConvenienceStore.Builder convenienceStore() { return new ConvenienceStore.ConvenienceStoreThingBuilder(); }
  /**
   * AlbumRelease.
   */
  public static AlbumRelease.Builder albumRelease() { return new AlbumRelease.AlbumReleaseThingBuilder(); }
  /**
   * StudioAlbum.
   */
  public static StudioAlbum.Builder studioAlbum() { return new StudioAlbum.StudioAlbumThingBuilder(); }
  /**
   * A waterfall, like Niagara.
   */
  public static Waterfall.Builder waterfall() { return new Waterfall.WaterfallThingBuilder(); }
  /**
   * A theater group or company, for example, the Royal Shakespeare Company or Druid Theatre.
   */
  public static TheaterGroup.Builder theaterGroup() { return new TheaterGroup.TheaterGroupThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to diagnosis and treatment of disorders of blood and blood producing organs.
   */
  public static Hematologic.Builder hematologic() { return new Hematologic.HematologicThingBuilder(); }
  /**
   * A bowling alley.
   */
  public static BowlingAlley.Builder bowlingAlley() { return new BowlingAlley.BowlingAlleyThingBuilder(); }
  /**
   * A type of medical procedure that involves percutaneous techniques, where access to organs or tissue is achieved via needle-puncture of the skin. For example, catheter-based procedures like stent delivery.
   */
  public static PercutaneousProcedure.Builder percutaneousProcedure() { return new PercutaneousProcedure.PercutaneousProcedureThingBuilder(); }
  /**
   * Occupational therapy.
   */
  public static OccupationalTherapy.Builder occupationalTherapy() { return new OccupationalTherapy.OccupationalTherapyThingBuilder(); }
  /**
   * Any physical manifestation of a person's medical condition discoverable by objective diagnostic tests or physical examination.
   */
  public static MedicalSign.Builder medicalSign() { return new MedicalSign.MedicalSignThingBuilder(); }
  /**
   * A hair salon.
   */
  public static HairSalon.Builder hairSalon() { return new HairSalon.HairSalonThingBuilder(); }
  /**
   * A police station.
   */
  public static PoliceStation.Builder policeStation() { return new PoliceStation.PoliceStationThingBuilder(); }
  /**
   * Residence type: Gated community.
   */
  public static GatedResidenceCommunity.Builder gatedResidenceCommunity() { return new GatedResidenceCommunity.GatedResidenceCommunityThingBuilder(); }
  /**
   * The steering position is on the right side of the vehicle (viewed from the main direction of driving).
   */
  public static RightHandDriving.Builder rightHandDriving() { return new RightHandDriving.RightHandDrivingThingBuilder(); }
  /**
   * Status of a game server.
   */
  public static GameServerStatus.Builder gameServerStatus() { return new GameServerStatus.GameServerStatusThingBuilder(); }
  /**
   * An historical landmark or building.
   */
  public static LandmarksOrHistoricalBuildings.Builder landmarksOrHistoricalBuildings() { return new LandmarksOrHistoricalBuildings.LandmarksOrHistoricalBuildingsThingBuilder(); }
  /**
   * This class is based upon W3C DCAT work, and benefits from collaboration around the DCAT, ADMS and VoID vocabularies. See http://www.w3.org/wiki/WebSchemas/Datasets for full details and mappings.
   */
  public static DatasetClass.Builder datasetClass() { return new DatasetClass.DatasetClassThingBuilder(); }
  /**
   * A dry-cleaning business.
   */
  public static DryCleaningOrLaundry.Builder dryCleaningOrLaundry() { return new DryCleaningOrLaundry.DryCleaningOrLaundryThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to study of anesthetics and their application.
   */
  public static Anesthesia.Builder anesthesia() { return new Anesthesia.AnesthesiaThingBuilder(); }
  /**
   * The act of asking someone to attend an event. Reciprocal of RsvpAction.
   */
  public static InviteAction.Builder inviteAction() { return new InviteAction.InviteActionThingBuilder(); }
  /**
   * Event type: A social dance.
   */
  public static DanceEvent.Builder danceEvent() { return new DanceEvent.DanceEventThingBuilder(); }
  /**
   * An office equipment store.
   */
  public static OfficeEquipmentStore.Builder officeEquipmentStore() { return new OfficeEquipmentStore.OfficeEquipmentStoreThingBuilder(); }
  /**
   * Unlike cross-sectional studies, longitudinal studies track the same people, and therefore the differences observed in those people are less likely to be the result of cultural differences across generations. Longitudinal studies are also used in medicine to uncover predictors of certain diseases.
   */
  public static Longitudinal.Builder longitudinal() { return new Longitudinal.LongitudinalThingBuilder(); }
  /**
   * Season dedicated to radio broadcast and associated online delivery.
   */
  public static RadioSeason.Builder radioSeason() { return new RadioSeason.RadioSeasonThingBuilder(); }
  /**
   * A pharmacy or drugstore.
   */
  public static Pharmacy.Builder pharmacy() { return new Pharmacy.PharmacyThingBuilder(); }
  /**
   * A Catholic church.
   */
  public static CatholicChurch.Builder catholicChurch() { return new CatholicChurch.CatholicChurchThingBuilder(); }
  /**
   * The act of momentarily pausing a device or application (e.g. pause music playback or pause a timer).
   */
  public static SuspendAction.Builder suspendAction() { return new SuspendAction.SuspendActionThingBuilder(); }
  /**
   * The act of returning to the origin that which was previously received (concrete objects) or taken (ownership).
   */
  public static ReturnAction.Builder returnAction() { return new ReturnAction.ReturnActionThingBuilder(); }
  /**
   * A gym.
   */
  public static ExerciseGym.Builder exerciseGym() { return new ExerciseGym.ExerciseGymThingBuilder(); }
  /**
   * The average rating based on multiple ratings or reviews.
   */
  public static AggregateRating.Builder aggregateRating() { return new AggregateRating.AggregateRatingThingBuilder(); }
  /**
   * Diet and nutrition.
   */
  public static DietNutrition.Builder dietNutrition() { return new DietNutrition.DietNutritionThingBuilder(); }
  /**
   * The act of  departing from a place. An agent departs from an fromLocation for a destination, optionally with participants.
   */
  public static DepartAction.Builder departAction() { return new DepartAction.DepartActionThingBuilder(); }
  /**
   * X-ray computed tomography imaging.
   */
  public static CT.Builder cT() { return new CT.CTThingBuilder(); }
  /**
   * A transit map.
   */
  public static TransitMap.Builder transitMap() { return new TransitMap.TransitMapThingBuilder(); }
  /**
   * The schema.org Actions mechanism benefited from extensive discussions across the Web standards community around W3C, in particular from the <a href="http://purl.org/hydra/"> Hydra project</a>'s community group.
   */
  public static ActionCollabClass.Builder actionCollabClass() { return new ActionCollabClass.ActionCollabClassThingBuilder(); }
  /**
   * Event type: Education event.
   */
  public static EducationEvent.Builder educationEvent() { return new EducationEvent.EducationEventThingBuilder(); }
  /**
   * A list of possible product availability options.
   */
  public static ItemAvailability.Builder itemAvailability() { return new ItemAvailability.ItemAvailabilityThingBuilder(); }
  /**
   * An entry point, within some Web-based protocol.
   */
  public static EntryPoint.Builder entryPoint() { return new EntryPoint.EntryPointThingBuilder(); }
  /**
   * Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc.
   */
  public static ProgramMembership.Builder programMembership() { return new ProgramMembership.ProgramMembershipThingBuilder(); }
  /**
   * Indicates the usage of the car as a taxi.
   */
  public static TaxiVehicleUsage.Builder taxiVehicleUsage() { return new TaxiVehicleUsage.TaxiVehicleUsageThingBuilder(); }
  /**
   * A medical test performed by a laboratory that typically involves examination of a tissue sample by a pathologist.
   */
  public static PathologyTest.Builder pathologyTest() { return new PathologyTest.PathologyTestThingBuilder(); }
  /**
   * Enumerated status values for Reservation.
   */
  public static ReservationStatusType.Builder reservationStatusType() { return new ReservationStatusType.ReservationStatusTypeThingBuilder(); }
  /**
   * The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting. See also <a href="https://github.com/rvguha/schemaorg/issues/169">open issues list</a>.
   */
  public static Game.Builder game() { return new Game.GameThingBuilder(); }
  /**
   * Provider of professional services.
   */
  public static ProfessionalService.Builder professionalService() { return new ProfessionalService.ProfessionalServiceThingBuilder(); }
  /**
   * A type of blood vessel that specifically carries blood to the heart.
   */
  public static Vein.Builder vein() { return new Vein.VeinThingBuilder(); }
  /**
   * Design models for medical trials. Enumerated type.
   */
  public static MedicalTrialDesign.Builder medicalTrialDesign() { return new MedicalTrialDesign.MedicalTrialDesignThingBuilder(); }
  /**
   * The act of managing by changing/editing the state of the object.
   */
  public static UpdateAction.Builder updateAction() { return new UpdateAction.UpdateActionThingBuilder(); }
  /**
   * A range of of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
<br />
    Commonly used values:<br />
<br />
    http://purl.org/goodrelations/v1#Labor-BringIn <br />
    http://purl.org/goodrelations/v1#PartsAndLabor-BringIn <br />
    http://purl.org/goodrelations/v1#PartsAndLabor-PickUp <br />
      
   */
  public static WarrantyScope.Builder warrantyScope() { return new WarrantyScope.WarrantyScopeThingBuilder(); }
  /**
   * The drug's cost represents the maximum reimbursement paid by an insurer for the drug.
   */
  public static ReimbursementCap.Builder reimbursementCap() { return new ReimbursementCap.ReimbursementCapThingBuilder(); }
  /**
   * A plumbing service.
   */
  public static Plumber.Builder plumber() { return new Plumber.PlumberThingBuilder(); }
  /**
   * A bakery.
   */
  public static Bakery.Builder bakery() { return new Bakery.BakeryThingBuilder(); }
  /**
   * A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.

      <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
   */
  public static PublicationVolume.Builder publicationVolume() { return new PublicationVolume.PublicationVolumeThingBuilder(); }
  /**
   * The status for a previously confirmed reservation that is now cancelled.
   */
  public static ReservationCancelled.Builder reservationCancelled() { return new ReservationCancelled.ReservationCancelledThingBuilder(); }
  /**
   * The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.
   */
  public static BuyAction.Builder buyAction() { return new BuyAction.BuyActionThingBuilder(); }
  /**
   * A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs.
   */
  public static WebSite.Builder webSite() { return new WebSite.WebSiteThingBuilder(); }
  /**
   * Game server status: OnlineFull. Server is online but unavailable. The maximum number of players has reached.
   */
  public static OnlineFull.Builder onlineFull() { return new OnlineFull.OnlineFullThingBuilder(); }
  /**
   * A men's clothing store.
   */
  public static MensClothingStore.Builder mensClothingStore() { return new MensClothingStore.MensClothingStoreThingBuilder(); }
  /**
   * A locksmith.
   */
  public static Locksmith.Builder locksmith() { return new Locksmith.LocksmithThingBuilder(); }
  /**
   * A collection of music tracks.
   */
  public static MusicAlbum.Builder musicAlbum() { return new MusicAlbum.MusicAlbumThingBuilder(); }
  /**
   * Organization: A business corporation.
   */
  public static Corporation.Builder corporation() { return new Corporation.CorporationThingBuilder(); }
  /**
   * Physical activity that is of high-intensity which utilizes the anaerobic metabolism of the body.
   */
  public static AnaerobicActivity.Builder anaerobicActivity() { return new AnaerobicActivity.AnaerobicActivityThingBuilder(); }
  /**
   * A body of water, such as a sea, ocean, or lake.
   */
  public static BodyOfWater.Builder bodyOfWater() { return new BodyOfWater.BodyOfWaterThingBuilder(); }
  /**
   * A real-estate agent.
   */
  public static RealEstateAgent.Builder realEstateAgent() { return new RealEstateAgent.RealEstateAgentThingBuilder(); }
  /**
   * The legal availability status of a medical drug.
   */
  public static DrugLegalStatus.Builder drugLegalStatus() { return new DrugLegalStatus.DrugLegalStatusThingBuilder(); }
  /**
   * Any collection of tests commonly ordered together.
   */
  public static MedicalTestPanel.Builder medicalTestPanel() { return new MedicalTestPanel.MedicalTestPanelThingBuilder(); }
  /**
   * A tennis complex.
   */
  public static TennisComplex.Builder tennisComplex() { return new TennisComplex.TennisComplexThingBuilder(); }
  /**
   * A music venue.
   */
  public static MusicVenue.Builder musicVenue() { return new MusicVenue.MusicVenueThingBuilder(); }
  /**
   * A wholesale store.
   */
  public static WholesaleStore.Builder wholesaleStore() { return new WholesaleStore.WholesaleStoreThingBuilder(); }
  /**
   * A medical clinic.
   */
  public static MedicalClinic.Builder medicalClinic() { return new MedicalClinic.MedicalClinicThingBuilder(); }
  /**
   * A specific strength in which a medical drug is available in a specific country.
   */
  public static DrugStrength.Builder drugStrength() { return new DrugStrength.DrugStrengthThingBuilder(); }
  /**
   * The act of distributing content to people for their amusement or edification.
   */
  public static ShareAction.Builder shareAction() { return new ShareAction.ShareActionThingBuilder(); }
  /**
   * A sports location, such as a playing field.
   */
  public static SportsActivityLocation.Builder sportsActivityLocation() { return new SportsActivityLocation.SportsActivityLocationThingBuilder(); }
  /**
   * An email message.
   */
  public static EmailMessage.Builder emailMessage() { return new EmailMessage.EmailMessageThingBuilder(); }
  /**
   * A set of characteristics describing parents, who can be interested in viewing some content.
   */
  public static ParentAudience.Builder parentAudience() { return new ParentAudience.ParentAudienceThingBuilder(); }
  /**
   * A radio episode which can be part of a series or season.
   */
  public static RadioEpisode.Builder radioEpisode() { return new RadioEpisode.RadioEpisodeThingBuilder(); }
  /**
   * A PublicationEvent corresponds indifferently to the event of publication for a CreativeWork of any type e.g. a broadcast event, an on-demand event, a book/journal publication via a variety of delivery media.
   */
  public static PublicationEvent.Builder publicationEvent() { return new PublicationEvent.PublicationEventThingBuilder(); }
  /**
   * A trial design in which neither the researcher nor the patient knows the details of the treatment the patient was randomly assigned to.
   */
  public static DoubleBlindedTrial.Builder doubleBlindedTrial() { return new DoubleBlindedTrial.DoubleBlindedTrialThingBuilder(); }
  /**
   * An organization such as a school, NGO, corporation, club, etc.
   */
  public static Organization.Builder organization() { return new Organization.OrganizationThingBuilder(); }
  /**
   * An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.
   */
  public static Order.Builder order() { return new Order.OrderThingBuilder(); }
  /**
   * The act of consuming static visual content.
   */
  public static ViewAction.Builder viewAction() { return new ViewAction.ViewActionThingBuilder(); }
  /**
   * A short TV or radio program or a segment/part of a program.
   */
  public static Clip.Builder clip() { return new Clip.ClipThingBuilder(); }
  /**
   * Game server status: OfflineTemporarily. Server is offline now but it can be online soon.
   */
  public static OfflineTemporarily.Builder offlineTemporarily() { return new OfflineTemporarily.OfflineTemporarilyThingBuilder(); }
  /**
   * This property is deprecated, alongside the UserInteraction types on which it depended.
   */
  public static InteractionCount.Builder interactionCount() { return new InteractionCount.InteractionCountThingBuilder(); }
  /**
   * A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the "text" property, and its topic via "about", properties shared with all CreativeWorks.
   */
  public static Comment.Builder comment() { return new Comment.CommentThingBuilder(); }
  /**
   * The act of registering to an organization/service without the guarantee to receive it. <p>Related actions:</p><ul><li><a href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, ApplyAction has no guarantees that the application will be accepted</li></ul>.
   */
  public static ApplyAction.Builder applyAction() { return new ApplyAction.ApplyActionThingBuilder(); }
  /**
   * A theater or other performing art center.
   */
  public static PerformingArtsTheater.Builder performingArtsTheater() { return new PerformingArtsTheater.PerformingArtsTheaterThingBuilder(); }
  /**
   * An event involving the delivery of an item.
   */
  public static DeliveryEvent.Builder deliveryEvent() { return new DeliveryEvent.DeliveryEventThingBuilder(); }
  /**
   * Specific build of a software applicaton
   */
  public static SoftwareApplicationBuild.Builder softwareApplicationBuild() { return new SoftwareApplicationBuild.SoftwareApplicationBuildThingBuilder(); }
  /**
   * A campground.
   */
  public static Campground.Builder campground() { return new Campground.CampgroundThingBuilder(); }
  /**
   * This class contains derivatives of IPTC rNews properties. rNews is a data model of publishing metadata with serializations currently available for RDFa as well as HTML5 Microdata. More information about the IPTC and rNews can be found at <a href=http://rnews.org>rnews.org</a>.
   */
  public static RNews.Builder rNews() { return new RNews.RNewsThingBuilder(); }
  /**
   * A unique instance of a television BroadcastService on a CableOrSatelliteService lineup.
   */
  public static TelevisionChannel.Builder televisionChannel() { return new TelevisionChannel.TelevisionChannelThingBuilder(); }
  /**
   * The airline boards by zones of the plane.
   */
  public static ZoneBoardingPolicy.Builder zoneBoardingPolicy() { return new ZoneBoardingPolicy.ZoneBoardingPolicyThingBuilder(); }
  /**
   * A house painting service.
   */
  public static HousePainter.Builder housePainter() { return new HousePainter.HousePainterThingBuilder(); }
  /**
   * Structured values are used when the value of a property has a more complex structure than simply being a textual value or a reference to another thing.
   */
  public static StructuredValue.Builder structuredValue() { return new StructuredValue.StructuredValueThingBuilder(); }
  /**
   * An enumeration that describes different types of medical procedures.
   */
  public static MedicalProcedureType.Builder medicalProcedureType() { return new MedicalProcedureType.MedicalProcedureTypeThingBuilder(); }
  /**
   * A graveyard.
   */
  public static Cemetery.Builder cemetery() { return new Cemetery.CemeteryThingBuilder(); }
  /**
   * Used to describe a seat, such as a reserved seat in an event reservation.
   */
  public static Seat.Builder seat() { return new Seat.SeatThingBuilder(); }
  /**
   * A movie.
   */
  public static Movie.Builder movie() { return new Movie.MovieThingBuilder(); }
  /**
   * Pharmacy.
   */
  public static PharmacySpecialty.Builder pharmacySpecialty() { return new PharmacySpecialty.PharmacySpecialtyThingBuilder(); }
  /**
   * DemoAlbum.
   */
  public static DemoAlbum.Builder demoAlbum() { return new DemoAlbum.DemoAlbumThingBuilder(); }
  /**
   * A hostel - cheap accommodation, often in shared dormitories.
   */
  public static Hostel.Builder hostel() { return new Hostel.HostelThingBuilder(); }
  /**
   * The act of producing a visual/graphical representation of an object, typically with a pen/pencil and paper as instruments.
   */
  public static DrawAction.Builder drawAction() { return new DrawAction.DrawActionThingBuilder(); }
  /**
   * The airline boards by groups based on check-in time, priority, etc.
   */
  public static GroupBoardingPolicy.Builder groupBoardingPolicy() { return new GroupBoardingPolicy.GroupBoardingPolicyThingBuilder(); }
  /**
   * The act of participating in an exchange of goods and services for monetary compensation. An agent trades an object, product or service with a participant in exchange for a one time or periodic payment.
   */
  public static TradeAction.Builder tradeAction() { return new TradeAction.TradeActionThingBuilder(); }
  /**
   * The act of participating in exertive activity for the purposes of improving health and fitness.
   */
  public static ExerciseAction.Builder exerciseAction() { return new ExerciseAction.ExerciseActionThingBuilder(); }
  /**
   * A web page that provides medical information.
   */
  public static MedicalWebPage.Builder medicalWebPage() { return new MedicalWebPage.MedicalWebPageThingBuilder(); }
  /**
   * The act of starting or activating a device or application (e.g. starting a timer or turning on a flashlight).
   */
  public static ActivateAction.Builder activateAction() { return new ActivateAction.ActivateActionThingBuilder(); }
  /**
   * A gas station.
   */
  public static GasStation.Builder gasStation() { return new GasStation.GasStationThingBuilder(); }
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
  public static DeliveryMethod.Builder deliveryMethod() { return new DeliveryMethod.DeliveryMethodThingBuilder(); }
  /**
   * An airline flight.
   */
  public static Flight.Builder flight() { return new Flight.FlightThingBuilder(); }
  /**
   * The act of installing an application.
   */
  public static InstallAction.Builder installAction() { return new InstallAction.InstallActionThingBuilder(); }
  /**
   * A simple system that adds up the number of risk factors to yield a score that is associated with prognosis, e.g. CHAD score, TIMI risk score.
   */
  public static MedicalRiskScore.Builder medicalRiskScore() { return new MedicalRiskScore.MedicalRiskScoreThingBuilder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserPlays.Builder userPlays() { return new UserPlays.UserPlaysThingBuilder(); }
  /**
   * An art gallery.
   */
  public static ArtGallery.Builder artGallery() { return new ArtGallery.ArtGalleryThingBuilder(); }
  /**
   * The act of posing a question / favor to someone.<p>Related actions:</p><ul><li><a href="http://schema.org/ReplyAction">ReplyAction</a>: Appears generally as a response to AskAction</li></ul>.
   */
  public static AskAction.Builder askAction() { return new AskAction.AskActionThingBuilder(); }
  /**
   * The act of registering to be a user of a service, product or web page.<p>Related actions:</p><ul><li><a href="http://schema.org/JoinAction">JoinAction</a>: Unlike JoinAction, RegisterAction implies you are registering to be a user of a service, *not* a group/team of people.</li><li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, RegisterAction doesn't imply that the agent is expecting to poll for updates from the object.</li><li><a href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, RegisterAction doesn't imply that the agent is expecting updates from the object</li></ul>.
   */
  public static RegisterAction.Builder registerAction() { return new RegisterAction.RegisterActionThingBuilder(); }
  /**
   * The act of forming one's opinion, reaction or sentiment.
   */
  public static AssessAction.Builder assessAction() { return new AssessAction.AssessActionThingBuilder(); }
  /**
   * An indication for a medical therapy that has been formally specified or approved by a regulatory body that regulates use of the therapy; for example, the US FDA approves indications for most drugs in the US.
   */
  public static ApprovedIndication.Builder approvedIndication() { return new ApprovedIndication.ApprovedIndicationThingBuilder(); }
  /**
   * Event type: Festival.
   */
  public static Festival.Builder festival() { return new Festival.FestivalThingBuilder(); }
  /**
   * A general contractor.
   */
  public static GeneralContractor.Builder generalContractor() { return new GeneralContractor.GeneralContractorThingBuilder(); }
  /**
   * A nail salon.
   */
  public static NailSalon.Builder nailSalon() { return new NailSalon.NailSalonThingBuilder(); }
  /**
   * 
          A Series in schema.org is a group of related items, typically but not necessarily of the same kind. 
   */
  public static Series.Builder series() { return new Series.SeriesThingBuilder(); }
  /**
   * A park.
   */
  public static Park.Builder park() { return new Park.ParkThingBuilder(); }
  /**
   * The act of obtaining an object under an agreement to return it at a later date. Reciprocal of LendAction.<p>Related actions:</p><ul><li><a href="http://schema.org/LendAction">LendAction</a>: Reciprocal of BorrowAction</li></ul>.
   */
  public static BorrowAction.Builder borrowAction() { return new BorrowAction.BorrowActionThingBuilder(); }
  /**
   * A type of boarding policy used by an airline.
   */
  public static BoardingPolicyType.Builder boardingPolicyType() { return new BoardingPolicyType.BoardingPolicyTypeThingBuilder(); }
  /**
   * Midwifery.
   */
  public static Midwifery.Builder midwifery() { return new Midwifery.MidwiferyThingBuilder(); }
  /**
   * A dentist.
   */
  public static Dentist.Builder dentist() { return new Dentist.DentistThingBuilder(); }
  /**
   * A process of progressive physical care and rehabilitation aimed at improving a health condition.
   */
  public static PhysicalTherapy.Builder physicalTherapy() { return new PhysicalTherapy.PhysicalTherapyThingBuilder(); }
  /**
   * CDFormat.
   */
  public static CDFormat.Builder cDFormat() { return new CDFormat.CDFormatThingBuilder(); }
  /**
   * A web page element, like a table or an image.
   */
  public static WebPageElement.Builder webPageElement() { return new WebPageElement.WebPageElementThingBuilder(); }
  /**
   * OrderStatus representing that there is a problem with the order.
   */
  public static OrderProblem.Builder orderProblem() { return new OrderProblem.OrderProblemThingBuilder(); }
  /**
   * OrderStatus representing that payment is due on an order.
   */
  public static OrderPaymentDue.Builder orderPaymentDue() { return new OrderPaymentDue.OrderPaymentDueThingBuilder(); }
  /**
   * A collection of music tracks in playlist form.
   */
  public static MusicPlaylist.Builder musicPlaylist() { return new MusicPlaylist.MusicPlaylistThingBuilder(); }
  /**
   * A trial design in which neither the researcher, the person administering the therapy nor the patient knows the details of the treatment the patient was randomly assigned to.
   */
  public static TripleBlindedTrial.Builder tripleBlindedTrial() { return new TripleBlindedTrial.TripleBlindedTrialThingBuilder(); }
  /**
   * The act of an agent communicating (service provider, social media, etc) their departure of a previously reserved service (e.g. flight check in) or place (e.g. hotel).<p>Related actions:</p><ul><li><a href="http://schema.org/CheckInAction">CheckInAction</a>: The antonym of CheckOutAction.</li><li><a href="http://schema.org/DepartAction">DepartAction</a>: Unlike DepartAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.</li><li><a href="http://schema.org/CancelAction">CancelAction</a>: Unlike CancelAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service</li></ul>.
   */
  public static CheckOutAction.Builder checkOutAction() { return new CheckOutAction.CheckOutActionThingBuilder(); }
  /**
   * Enumerated for values for itemListOrder for indicating how an ordered ItemList is organized.
   */
  public static ItemListOrderType.Builder itemListOrderType() { return new ItemListOrderType.ItemListOrderTypeThingBuilder(); }
  /**
   * A retail good store.
   */
  public static Store.Builder store() { return new Store.StoreThingBuilder(); }
  /**
   * Eye.
   */
  public static Eye.Builder eye() { return new Eye.EyeThingBuilder(); }
  /**
   * A specific branch of medical science that specializes in the care of women during the prenatal and postnatal care and with the delivery of the child.
   */
  public static Obstetric.Builder obstetric() { return new Obstetric.ObstetricThingBuilder(); }
  /**
   * The act of searching for an object.<p>Related actions:</p><ul><li><a href="http://schema.org/FindAction">FindAction</a>: SearchAction generally leads to a FindAction, but not necessarily</li></ul>.
   */
  public static SearchAction.Builder searchAction() { return new SearchAction.SearchActionThingBuilder(); }
  /**
   * A short segment/part of a movie.
   */
  public static MovieClip.Builder movieClip() { return new MovieClip.MovieClipThingBuilder(); }
  /**
   * An embassy.
   */
  public static Embassy.Builder embassy() { return new Embassy.EmbassyThingBuilder(); }
  /**
   * OrderStatus representing that an order is being processed.
   */
  public static OrderProcessing.Builder orderProcessing() { return new OrderProcessing.OrderProcessingThingBuilder(); }
  /**
   * An educational organization.
   */
  public static EducationalOrganization.Builder educationalOrganization() { return new EducationalOrganization.EducationalOrganizationThingBuilder(); }
  /**
   * A private parcel service as the delivery mode available for a certain offer.
<br />
    Commonly used values:<br />
<br />
    http://purl.org/goodrelations/v1#DHL <br />
    http://purl.org/goodrelations/v1#FederalExpress <br />
    http://purl.org/goodrelations/v1#UPS <br />
      
   */
  public static ParcelService.Builder parcelService() { return new ParcelService.ParcelServiceThingBuilder(); }
  /**
   * A medical organization, such as a doctor's office or clinic.
   */
  public static MedicalOrganization.Builder medicalOrganization() { return new MedicalOrganization.MedicalOrganizationThingBuilder(); }
  /**
   * A college, university, or other third-level educational institution.
   */
  public static CollegeOrUniversity.Builder collegeOrUniversity() { return new CollegeOrUniversity.CollegeOrUniversityThingBuilder(); }
  /**
   * The act of forming a personal connection with someone (object) mutually/bidirectionally/symmetrically.<p>Related actions:</p><ul><li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, BefriendAction implies that the connection is reciprocal</li></ul>.
   */
  public static BefriendAction.Builder befriendAction() { return new BefriendAction.BefriendActionThingBuilder(); }
  /**
   * The act of swallowing liquids.
   */
  public static DrinkAction.Builder drinkAction() { return new DrinkAction.DrinkActionThingBuilder(); }
  /**
   * Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).
   */
  public static MusicReleaseFormatType.Builder musicReleaseFormatType() { return new MusicReleaseFormatType.MusicReleaseFormatTypeThingBuilder(); }
  /**
   * MixtapeAlbum.
   */
  public static MixtapeAlbum.Builder mixtapeAlbum() { return new MixtapeAlbum.MixtapeAlbumThingBuilder(); }
  /**
   * A process of care used in either a diagnostic, therapeutic, or palliative capacity that relies on invasive (surgical), non-invasive, or percutaneous techniques.
   */
  public static MedicalProcedure.Builder medicalProcedure() { return new MedicalProcedure.MedicalProcedureThingBuilder(); }
  /**
   * A permit issued by a government agency.
   */
  public static GovernmentPermit.Builder governmentPermit() { return new GovernmentPermit.GovernmentPermitThingBuilder(); }
  /**
   * A series of books. Included books can be indicated with the hasPart property.
   */
  public static BookSeries.Builder bookSeries() { return new BookSeries.BookSeriesThingBuilder(); }
  /**
   * Neck.
   */
  public static Neck.Builder neck() { return new Neck.NeckThingBuilder(); }
  /**
   * The status of a confirmed reservation.
   */
  public static ReservationConfirmed.Builder reservationConfirmed() { return new ReservationConfirmed.ReservationConfirmedThingBuilder(); }
  /**
   * A sports club.
   */
  public static SportsClub.Builder sportsClub() { return new SportsClub.SportsClubThingBuilder(); }
  /**
   * LiveAlbum.
   */
  public static LiveAlbum.Builder liveAlbum() { return new LiveAlbum.LiveAlbumThingBuilder(); }
  /**
   * A class of medical drugs, e.g., statins. Classes can represent general pharmacological class, common mechanisms of action, common physiological effects, etc.
   */
  public static DrugClass.Builder drugClass() { return new DrugClass.DrugClassThingBuilder(); }
  /**
   * A reservation for a rental car.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  public static RentalCarReservation.Builder rentalCarReservation() { return new RentalCarReservation.RentalCarReservationThingBuilder(); }
  /**
   * A public swimming pool.
   */
  public static PublicSwimmingPool.Builder publicSwimmingPool() { return new PublicSwimmingPool.PublicSwimmingPoolThingBuilder(); }
  /**
   * Quantities such as distance, time, mass, weight, etc. Particular instances of say Mass are entities like '3 Kg' or '4 milligrams'.
   */
  public static Quantity.Builder quantity() { return new Quantity.QuantityThingBuilder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserLikes.Builder userLikes() { return new UserLikes.UserLikesThingBuilder(); }
  /**
   * A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.
   */
  public static Muscle.Builder muscle() { return new Muscle.MuscleThingBuilder(); }
  /**
   * An employment agency.
   */
  public static EmploymentAgency.Builder employmentAgency() { return new EmploymentAgency.EmploymentAgencyThingBuilder(); }
  /**
   * Genitourinary.
   */
  public static Genitourinary.Builder genitourinary() { return new Genitourinary.GenitourinaryThingBuilder(); }
  /**
   * Completed.
   */
  public static Completed.Builder completed() { return new Completed.CompletedThingBuilder(); }
  /**
   * The act of achieving victory in a competitive activity.
   */
  public static WinAction.Builder winAction() { return new WinAction.WinActionThingBuilder(); }
  /**
   * A bookstore.
   */
  public static BookStore.Builder bookStore() { return new BookStore.BookStoreThingBuilder(); }
  /**
   * A media season e.g. tv, radio, video game etc.
   */
  public static Season.Builder season() { return new Season.SeasonThingBuilder(); }
  /**
   * Describes a reservation for travel, dining or an event. Some reservations require tickets.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use http://schema.org/Offer.
   */
  public static Reservation.Builder reservation() { return new Reservation.ReservationThingBuilder(); }
  /**
   * The status of an Action.
   */
  public static ActionStatusType.Builder actionStatusType() { return new ActionStatusType.ActionStatusTypeThingBuilder(); }
  /**
   * A structured value providing information about the opening hours of a place or a certain service inside a place.
   */
  public static OpeningHoursSpecification.Builder openingHoursSpecification() { return new OpeningHoursSpecification.OpeningHoursSpecificationThingBuilder(); }
  /**
   * A condition or factor that indicates use of a medical therapy, including signs, symptoms, risk factors, anatomical states, etc.
   */
  public static MedicalIndication.Builder medicalIndication() { return new MedicalIndication.MedicalIndicationThingBuilder(); }
  /**
   * When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.
   */
  public static AggregateOffer.Builder aggregateOffer() { return new AggregateOffer.AggregateOfferThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to diagnosis and treatment of disorders of endocrine glands and their secretions.
   */
  public static Endocrine.Builder endocrine() { return new Endocrine.EndocrineThingBuilder(); }
  /**
   * A department store.
   */
  public static DepartmentStore.Builder departmentStore() { return new DepartmentStore.DepartmentStoreThingBuilder(); }
  /**
   * The act of giving money voluntarily to a beneficiary in recognition of services rendered.
   */
  public static TipAction.Builder tipAction() { return new TipAction.TipActionThingBuilder(); }
  /**
   * Systems of medical practice.
   */
  public static MedicineSystem.Builder medicineSystem() { return new MedicineSystem.MedicineSystemThingBuilder(); }
  /**
   * A book.
   */
  public static Book.Builder book() { return new Book.BookThingBuilder(); }
  /**
   * Brewery.
   */
  public static Brewery.Builder brewery() { return new Brewery.BreweryThingBuilder(); }
  /**
   * Level of evidence for a medical guideline. Enumerated type.
   */
  public static MedicalEvidenceLevel.Builder medicalEvidenceLevel() { return new MedicalEvidenceLevel.MedicalEvidenceLevelThingBuilder(); }
  /**
   * Ear.
   */
  public static Ear.Builder ear() { return new Ear.EarThingBuilder(); }
  /**
   * Any indication of the existence of a medical condition or disease.
   */
  public static MedicalSignOrSymptom.Builder medicalSignOrSymptom() { return new MedicalSignOrSymptom.MedicalSignOrSymptomThingBuilder(); }
  /**
   * Book format: Ebook.
   */
  public static EBook.Builder eBook() { return new EBook.EBookThingBuilder(); }
  /**
   * A recommended dosing schedule for a drug or supplement as prescribed or recommended by an authority or by the drug/supplement's manufacturer. Capture the recommending authority in the recognizingAuthority property of MedicalEntity.
   */
  public static RecommendedDoseSchedule.Builder recommendedDoseSchedule() { return new RecommendedDoseSchedule.RecommendedDoseScheduleThingBuilder(); }
  /**
   * A scholarly article.
   */
  public static ScholarlyArticle.Builder scholarlyArticle() { return new ScholarlyArticle.ScholarlyArticleThingBuilder(); }
  /**
   * Event type: Business event.
   */
  public static BusinessEvent.Builder businessEvent() { return new BusinessEvent.BusinessEventThingBuilder(); }
  /**
   * Rigid connective tissue that comprises up the skeletal structure of the human body.
   */
  public static Bone.Builder bone() { return new Bone.BoneThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to diagnosis and treatment of disorders of skin.
   */
  public static Dermatologic.Builder dermatologic() { return new Dermatologic.DermatologicThingBuilder(); }
  /**
   * An internet cafe.
   */
  public static InternetCafe.Builder internetCafe() { return new InternetCafe.InternetCafeThingBuilder(); }
  /**
   * Reserving a concrete object.<p>Related actions:</p><ul><li><a href="http://schema.org/ScheduleAction">ScheduleAction</a>: Unlike ScheduleAction, ReserveAction reserves concrete objects (e.g. a table, a hotel) towards a time slot / spatial allocation</li></ul>.
   */
  public static ReserveAction.Builder reserveAction() { return new ReserveAction.ReserveActionThingBuilder(); }
  /**
   * A bus stop.
   */
  public static BusStop.Builder busStop() { return new BusStop.BusStopThingBuilder(); }
  /**
   * A placeholder for multiple similar products of the same kind.
   */
  public static SomeProducts.Builder someProducts() { return new SomeProducts.SomeProductsThingBuilder(); }
  /**
   * Book format: Paperback.
   */
  public static Paperback.Builder paperback() { return new Paperback.PaperbackThingBuilder(); }
  /**
   * A business providing entertainment.
   */
  public static EntertainmentBusiness.Builder entertainmentBusiness() { return new EntertainmentBusiness.EntertainmentBusinessThingBuilder(); }
  /**
   * A page devoted to a single item, such as a particular product or hotel.
   */
  public static ItemPage.Builder itemPage() { return new ItemPage.ItemPageThingBuilder(); }
  /**
   * Reference documentation for application programming interfaces (APIs).
   */
  public static APIReference.Builder aPIReference() { return new APIReference.APIReferenceThingBuilder(); }
  /**
   * A performance group, such as a band, an orchestra, or a circus.
   */
  public static PerformingGroup.Builder performingGroup() { return new PerformingGroup.PerformingGroupThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to diagnosis and treatment of disorders of digestive system.
   */
  public static Gastroenterologic.Builder gastroenterologic() { return new Gastroenterologic.GastroenterologicThingBuilder(); }
  /**
   * A specific branch of medical science that deals with the study and treatment of rheumatic, autoimmune or joint diseases.
   */
  public static Rheumatologic.Builder rheumatologic() { return new Rheumatologic.RheumatologicThingBuilder(); }
  /**
   * A strategy of regulating the intake of food to achieve or maintain a specific health-related goal.
   */
  public static Diet.Builder diet() { return new Diet.DietThingBuilder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserPlusOnes.Builder userPlusOnes() { return new UserPlusOnes.UserPlusOnesThingBuilder(); }
  /**
   * Indicates that the item is out of stock.
   */
  public static OutOfStock.Builder outOfStock() { return new OutOfStock.OutOfStockThingBuilder(); }
  /**
   * Recruiting participants.
   */
  public static Recruiting.Builder recruiting() { return new Recruiting.RecruitingThingBuilder(); }
  /**
   * A condition or factor that serves as a reason to withhold a certain medical therapy. Contraindications can be absolute (there are no reasonable circumstances for undertaking a course of action) or relative (the patient is at higher risk of complications, but that these risks may be outweighed by other considerations or mitigated by other measures).
   */
  public static MedicalContraindication.Builder medicalContraindication() { return new MedicalContraindication.MedicalContraindicationThingBuilder(); }
  /**
   * A synagogue.
   */
  public static Synagogue.Builder synagogue() { return new Synagogue.SynagogueThingBuilder(); }
  /**
   * A landform or physical feature.  Landform elements include mountains, plains, lakes, rivers, seascape and oceanic waterbody interface features such as bays, peninsulas, seas and so forth, including sub-aqueous terrain features such as submersed mountain ranges, volcanoes, and the great ocean basins.
   */
  public static Landform.Builder landform() { return new Landform.LandformThingBuilder(); }
  /**
   * A restaurant.
   */
  public static Restaurant.Builder restaurant() { return new Restaurant.RestaurantThingBuilder(); }
  /**
   * Ultrasound imaging.
   */
  public static Ultrasound.Builder ultrasound() { return new Ultrasound.UltrasoundThingBuilder(); }
  /**
   * A high school.
   */
  public static HighSchool.Builder highSchool() { return new HighSchool.HighSchoolThingBuilder(); }
  /**
   * An in-progress action (e.g, while watching the movie, or driving to a location).
   */
  public static ActiveActionStatus.Builder activeActionStatus() { return new ActiveActionStatus.ActiveActionStatusThingBuilder(); }
  /**
   * LaserDiscFormat.
   */
  public static LaserDiscFormat.Builder laserDiscFormat() { return new LaserDiscFormat.LaserDiscFormatThingBuilder(); }
  /**
   * A PerformanceRole is a Role that some entity places with regard to a theatrical performance, e.g. in a Movie, TVSeries etc.
   */
  public static PerformanceRole.Builder performanceRole() { return new PerformanceRole.PerformanceRoleThingBuilder(); }
  /**
   * An action that failed to complete. The action's error property and the HTTP return code contain more information about the failure.
   */
  public static FailedActionStatus.Builder failedActionStatus() { return new FailedActionStatus.FailedActionStatusThingBuilder(); }
  /**
   * A Childcare center.
   */
  public static ChildCare.Builder childCare() { return new ChildCare.ChildCareThingBuilder(); }
  /**
   * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
   */
  public static SoftwareSourceCode.Builder softwareSourceCode() { return new SoftwareSourceCode.SoftwareSourceCodeThingBuilder(); }
  /**
   * A lake (for example, Lake Pontrachain).
   */
  public static LakeBodyOfWater.Builder lakeBodyOfWater() { return new LakeBodyOfWater.LakeBodyOfWaterThingBuilder(); }
  /**
   * A medical procedure intended primarily for diagnostic, as opposed to therapeutic, purposes.
   */
  public static DiagnosticProcedure.Builder diagnosticProcedure() { return new DiagnosticProcedure.DiagnosticProcedureThingBuilder(); }
  /**
   * Throat.
   */
  public static Throat.Builder throat() { return new Throat.ThroatThingBuilder(); }
  /**
   * A trial that takes place at a single center.
   */
  public static SingleCenterTrial.Builder singleCenterTrial() { return new SingleCenterTrial.SingleCenterTrialThingBuilder(); }
  /**
   * Enumerated options related to a ContactPoint.
   */
  public static ContactPointOption.Builder contactPointOption() { return new ContactPointOption.ContactPointOptionThingBuilder(); }
  /**
   * A system of medicine focused on the relationship between the body's structure, mainly the spine, and its functioning.
   */
  public static Chiropractic.Builder chiropractic() { return new Chiropractic.ChiropracticThingBuilder(); }
  /**
   * A type of physical examination of a patient performed by a physician. Enumerated type.
   */
  public static PhysicalExam.Builder physicalExam() { return new PhysicalExam.PhysicalExamThingBuilder(); }
  /**
   * A vet's office.
   */
  public static VeterinaryCare.Builder veterinaryCare() { return new VeterinaryCare.VeterinaryCareThingBuilder(); }
  /**
   * A radio station.
   */
  public static RadioStation.Builder radioStation() { return new RadioStation.RadioStationThingBuilder(); }
  /**
   * Properties that take Distances as values are of the form '&lt;Number&gt; &lt;Length unit of measure&gt;'. E.g., '7 ft'.
   */
  public static Distance.Builder distance() { return new Distance.DistanceThingBuilder(); }
  /**
   * A group of multiple reservations with common values for all sub-reservations.
   */
  public static ReservationPackage.Builder reservationPackage() { return new ReservationPackage.ReservationPackageThingBuilder(); }
  /**
   * A nightclub or discotheque.
   */
  public static NightClub.Builder nightClub() { return new NightClub.NightClubThingBuilder(); }
  /**
   * A volcano, like Fuji san.
   */
  public static Volcano.Builder volcano() { return new Volcano.VolcanoThingBuilder(); }
  /**
   * The act of expressing a consistency of opinion with the object. An agent agrees to/about an object (a proposition, topic or theme) with participants.
   */
  public static AgreeAction.Builder agreeAction() { return new AgreeAction.AgreeActionThingBuilder(); }
  /**
   * Indicates that the item has been discontinued.
   */
  public static Discontinued.Builder discontinued() { return new Discontinued.DiscontinuedThingBuilder(); }
  /**
   * An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
   */
  public static OrderItem.Builder orderItem() { return new OrderItem.OrderItemThingBuilder(); }
  /**
   * A media season e.g. tv, radio, video game etc.
   */
  public static CreativeWorkSeason.Builder creativeWorkSeason() { return new CreativeWorkSeason.CreativeWorkSeasonThingBuilder(); }
  /**
   * Web page type: Contact page.
   */
  public static ContactPage.Builder contactPage() { return new ContactPage.ContactPageThingBuilder(); }
  /**
   * A dataset in downloadable form.
   */
  public static DataDownload.Builder dataDownload() { return new DataDownload.DataDownloadThingBuilder(); }
  /**
   * BroadcastRelease.
   */
  public static BroadcastRelease.Builder broadcastRelease() { return new BroadcastRelease.BroadcastReleaseThingBuilder(); }
  /**
   * A set of characteristics belonging to businesses, e.g. who compose an item's target audience.
   */
  public static BusinessAudience.Builder businessAudience() { return new BusinessAudience.BusinessAudienceThingBuilder(); }
  /**
   * Book format: Hardcover.
   */
  public static Hardcover.Builder hardcover() { return new Hardcover.HardcoverThingBuilder(); }
  /**
   * An ItemList ordered with higher values listed first.
   */
  public static ItemListOrderDescending.Builder itemListOrderDescending() { return new ItemListOrderDescending.ItemListOrderDescendingThingBuilder(); }
  /**
   * An agent inspects/determines/investigates/inquire or examine an object's accuracy/quality/condition or state.
   */
  public static CheckAction.Builder checkAction() { return new CheckAction.CheckActionThingBuilder(); }
  /**
   * A Buddhist temple.
   */
  public static BuddhistTemple.Builder buddhistTemple() { return new BuddhistTemple.BuddhistTempleThingBuilder(); }
  /**
   * A medical study is an umbrella type covering all kinds of research studies relating to human medicine or health, including observational studies and interventional trials and registries, randomized, controlled or not. When the specific type of study is known, use one of the extensions of this type, such as MedicalTrial or MedicalObservationalStudy. Also, note that this type should be used to mark up data that describes the study itself; to tag an article that publishes the results of a study, use MedicalScholarlyArticle. Note: use the code property of MedicalEntity to store study IDs, e.g. clinicaltrials.gov ID.
   */
  public static MedicalStudy.Builder medicalStudy() { return new MedicalStudy.MedicalStudyThingBuilder(); }
  /**
   * An electronics store.
   */
  public static ElectronicsStore.Builder electronicsStore() { return new ElectronicsStore.ElectronicsStoreThingBuilder(); }
  /**
   * An offer to transfer some rights to an item or to provide a service&#x2014;for example, an offer to sell tickets to an event, to rent the DVD of a movie, to stream a TV show over the internet, to repair a motorcycle, or to loan a book.
      <br/><br/>
      For <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GTIN</a>-related fields, see
      <a href="http://www.gs1.org/barcodes/support/check_digit_calculator">Check Digit calculator</a>
      and <a href="http://www.gs1us.org/resources/standards/gtin-validation-guide">validation guide</a>
      from <a href="http://www.gs1.org/">GS1</a>.
   */
  public static Offer.Builder offer() { return new Offer.OfferThingBuilder(); }
  /**
   * Any specific branch of medical science or practice. Medical specialities include clinical specialties that pertain to particular organ systems and their respective disease states, as well as allied health specialties. Enumerated type.
   */
  public static MedicalSpecialty.Builder medicalSpecialty() { return new MedicalSpecialty.MedicalSpecialtyThingBuilder(); }
  /**
   * Scheduling future actions, events, or tasks.<p>Related actions:</p><ul><li><a href="http://schema.org/ReserveAction">ReserveAction</a>: Unlike ReserveAction, ScheduleAction allocates future actions (e.g. an event, a task, etc) towards a time slot / spatial allocation</li></ul>.
   */
  public static ScheduleAction.Builder scheduleAction() { return new ScheduleAction.ScheduleActionThingBuilder(); }
  /**
   * The act of producing a painting, typically with paint and canvas as instruments.
   */
  public static PaintAction.Builder paintAction() { return new PaintAction.PaintActionThingBuilder(); }
  /**
   * Physical activity that is engaged in to improve muscle and bone strength. Also referred to as resistance training.
   */
  public static StrengthTraining.Builder strengthTraining() { return new StrengthTraining.StrengthTrainingThingBuilder(); }
  /**
   * A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
   */
  public static Vehicle.Builder vehicle() { return new Vehicle.VehicleThingBuilder(); }
  /**
   * Organization: Sports team.
   */
  public static SportsTeam.Builder sportsTeam() { return new SportsTeam.SportsTeamThingBuilder(); }
  /**
   * Indicates whether this drug is available by prescription or over-the-counter.
   */
  public static DrugPrescriptionStatus.Builder drugPrescriptionStatus() { return new DrugPrescriptionStatus.DrugPrescriptionStatusThingBuilder(); }
  /**
   * The act of authoring written creative content.
   */
  public static WriteAction.Builder writeAction() { return new WriteAction.WriteActionThingBuilder(); }
  /**
   * A public structure, such as a town hall or concert hall.
   */
  public static CivicStructure.Builder civicStructure() { return new CivicStructure.CivicStructureThingBuilder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use
          <a href="/Action">Action</a>-based vocabulary, alongside types such as <a href="/Comment">Comment</a>.
      
   */
  public static UserInteraction.Builder userInteraction() { return new UserInteraction.UserInteractionThingBuilder(); }
  /**
   * A shoe store.
   */
  public static ShoeStore.Builder shoeStore() { return new ShoeStore.ShoeStoreThingBuilder(); }
  /**
   * The act of applying an object to its intended purpose.
   */
  public static UseAction.Builder useAction() { return new UseAction.UseActionThingBuilder(); }
  /**
   * Car repair business.
   */
  public static AutoRepair.Builder autoRepair() { return new AutoRepair.AutoRepairThingBuilder(); }
  /**
   * An answer offered to a question; perhaps correct, perhaps opinionated or wrong.
   */
  public static Answer.Builder answer() { return new Answer.AnswerThingBuilder(); }
  /**
   * A day spa.
   */
  public static DaySpa.Builder daySpa() { return new DaySpa.DaySpaThingBuilder(); }
  /**
   * A type of medical procedure that involves invasive surgical techniques.
   */
  public static SurgicalProcedure.Builder surgicalProcedure() { return new SurgicalProcedure.SurgicalProcedureThingBuilder(); }
  /**
   * A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism.
   */
  public static Drug.Builder drug() { return new Drug.DrugThingBuilder(); }
  /**
   * The act of editing a recipient by replacing an old object with a new object.
   */
  public static ReplaceAction.Builder replaceAction() { return new ReplaceAction.ReplaceActionThingBuilder(); }
  /**
   * Physical activity that is engaged to help maintain posture and balance.
   */
  public static Balance.Builder balance() { return new Balance.BalanceThingBuilder(); }
  /**
   * A winery.
   */
  public static Winery.Builder winery() { return new Winery.WineryThingBuilder(); }
  /**
   * Indicates that the item is new.
   */
  public static NewCondition.Builder newCondition() { return new NewCondition.NewConditionThingBuilder(); }
  /**
   * A trial design in which the researcher knows the full details of the treatment, and so does the patient.
   */
  public static OpenTrial.Builder openTrial() { return new OpenTrial.OpenTrialThingBuilder(); }
  /**
   * A process of care relying upon counseling, dialogue, communication, verbalization aimed at improving a mental health condition.
   */
  public static PsychologicalTreatment.Builder psychologicalTreatment() { return new PsychologicalTreatment.PsychologicalTreatmentThingBuilder(); }
  /**
   * A toy store.
   */
  public static ToyStore.Builder toyStore() { return new ToyStore.ToyStoreThingBuilder(); }
  /**
   * A shop that will buy, or lend money against the security of, personal possessions.
   */
  public static PawnShop.Builder pawnShop() { return new PawnShop.PawnShopThingBuilder(); }
  /**
   * A case series (also known as a clinical series) is a medical research study that tracks patients with a known exposure given similar treatment or examines their medical records for exposure and outcome. A case series can be retrospective or prospective and usually involves a smaller number of patients than the more powerful case-control studies or randomized controlled trials. Case series may be consecutive or non-consecutive, depending on whether all cases presenting to the reporting authors over a period of time were included, or only a selection.
   */
  public static CaseSeries.Builder caseSeries() { return new CaseSeries.CaseSeriesThingBuilder(); }
  /**
   * A train station.
   */
  public static TrainStation.Builder trainStation() { return new TrainStation.TrainStationThingBuilder(); }
  /**
   * Information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities.
   */
  public static EngineSpecification.Builder engineSpecification() { return new EngineSpecification.EngineSpecificationThingBuilder(); }
  /**
   * The header section of the page.
   */
  public static WPHeader.Builder wPHeader() { return new WPHeader.WPHeaderThingBuilder(); }
  /**
   * Financial services business.
   */
  public static FinancialService.Builder financialService() { return new FinancialService.FinancialServiceThingBuilder(); }
  /**
   * Indicates that the item is used.
   */
  public static UsedCondition.Builder usedCondition() { return new UsedCondition.UsedConditionThingBuilder(); }
  /**
   * VitalSign.
   */
  public static VitalSign.Builder vitalSign() { return new VitalSign.VitalSignThingBuilder(); }
  /**
   * A motorcycle repair shop.
   */
  public static MotorcycleRepair.Builder motorcycleRepair() { return new MotorcycleRepair.MotorcycleRepairThingBuilder(); }
  /**
   * Pathogenic fungus.
   */
  public static Fungus.Builder fungus() { return new Fungus.FungusThingBuilder(); }
  /**
   * A video file.
   */
  public static VideoObject.Builder videoObject() { return new VideoObject.VideoObjectThingBuilder(); }
  /**
   * A designation that the drug in question has not been assigned a pregnancy category designation by the US FDA.
   */
  public static FDAnotEvaluated.Builder fDAnotEvaluated() { return new FDAnotEvaluated.FDAnotEvaluatedThingBuilder(); }
  /**
   * A parking map.
   */
  public static ParkingMap.Builder parkingMap() { return new ParkingMap.ParkingMapThingBuilder(); }
  /**
   * A government office&#x2014;for example, an IRS or DMV office.
   */
  public static GovernmentOffice.Builder governmentOffice() { return new GovernmentOffice.GovernmentOfficeThingBuilder(); }
  /**
   * A defence establishment, such as an army or navy base.
   */
  public static DefenceEstablishment.Builder defenceEstablishment() { return new DefenceEstablishment.DefenceEstablishmentThingBuilder(); }
  /**
   * The invitee will not attend.
   */
  public static RsvpResponseNo.Builder rsvpResponseNo() { return new RsvpResponseNo.RsvpResponseNoThingBuilder(); }
  /**
   * The act of an agent relocating to a place.<p>Related actions:</p><ul><li><a href="http://schema.org/TransferAction">TransferAction</a>: Unlike TransferAction, the subject of the move is a living Person or Organization rather than an inanimate object</li></ul>.
   */
  public static MoveAction.Builder moveAction() { return new MoveAction.MoveActionThingBuilder(); }
  /**
   * Enumerated categories of medical drug costs.
   */
  public static DrugCostCategory.Builder drugCostCategory() { return new DrugCostCategory.DrugCostCategoryThingBuilder(); }
  /**
   * An agent pays a price to a participant.
   */
  public static PayAction.Builder payAction() { return new PayAction.PayActionThingBuilder(); }
  /**
   * A jewelry store.
   */
  public static JewelryStore.Builder jewelryStore() { return new JewelryStore.JewelryStoreThingBuilder(); }
  /**
   * A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc.
   */
  public static TechArticle.Builder techArticle() { return new TechArticle.TechArticleThingBuilder(); }
  /**
   * Play mode: MultiPlayer. Requiring or allowing multiple human players to play simultaneously.
   */
  public static MultiPlayer.Builder multiPlayer() { return new MultiPlayer.MultiPlayerThingBuilder(); }
  /**
   * The act of responding instinctively and emotionally to an object, expressing a sentiment.
   */
  public static ReactAction.Builder reactAction() { return new ReactAction.ReactActionThingBuilder(); }
  /**
   * The act of downloading an object.
   */
  public static DownloadAction.Builder downloadAction() { return new DownloadAction.DownloadActionThingBuilder(); }
  /**
   * Available over the counter.
   */
  public static OTC.Builder oTC() { return new OTC.OTCThingBuilder(); }
  /**
   * An infectious disease is a clinically evident human disease resulting from the presence of pathogenic microbial agents, like pathogenic viruses, pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To be considered an infectious disease, such pathogens are known to be able to cause this disease.
   */
  public static InfectiousDisease.Builder infectiousDisease() { return new InfectiousDisease.InfectiousDiseaseThingBuilder(); }
  /**
   * The most generic kind of creative work, including books, movies, photographs, software programs, etc.
   */
  public static CreativeWork.Builder creativeWork() { return new CreativeWork.CreativeWorkThingBuilder(); }
  /**
   * Classes of agents or pathogens that transmit infectious diseases. Enumerated type.
   */
  public static InfectiousAgentClass.Builder infectiousAgentClass() { return new InfectiousAgentClass.InfectiousAgentClassThingBuilder(); }
  /**
   * An over the air or online broadcast event.
   */
  public static BroadcastEvent.Builder broadcastEvent() { return new BroadcastEvent.BroadcastEventThingBuilder(); }
  /**
   * The act of producing a balanced opinion about the object for an audience. An agent reviews an object with participants resulting in a review.
   */
  public static ReviewAction.Builder reviewAction() { return new ReviewAction.ReviewActionThingBuilder(); }
  /**
   * An agent leaves an event / group with participants/friends at a location.<p>Related actions:</p><ul><li><a href="http://schema.org/JoinAction">JoinAction</a>: The antonym of LeaveAction.</li><li><a href="http://schema.org/UnRegisterAction">UnRegisterAction</a>: Unlike UnRegisterAction, LeaveAction implies leaving a group/team of people rather than a service</li></ul>.
   */
  public static LeaveAction.Builder leaveAction() { return new LeaveAction.LeaveActionThingBuilder(); }
  /**
   * A DeliveryMethod in which an item is made available via locker.
   */
  public static LockerDelivery.Builder lockerDelivery() { return new LockerDelivery.LockerDeliveryThingBuilder(); }
  /**
   * An image, video, or audio object embedded in a web page. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).
   */
  public static MediaObject.Builder mediaObject() { return new MediaObject.MediaObjectThingBuilder(); }
  /**
   * Intended audience for an item, i.e. the group for whom the item was created.
   */
  public static Audience.Builder audience() { return new Audience.AudienceThingBuilder(); }
  /**
   * Web page type: Search results page.
   */
  public static SearchResultsPage.Builder searchResultsPage() { return new SearchResultsPage.SearchResultsPageThingBuilder(); }
  /**
   * A movie theater.
   */
  public static MovieTheater.Builder movieTheater() { return new MovieTheater.MovieTheaterThingBuilder(); }
  /**
   * Entities that have a somewhat fixed, physical extension.
   */
  public static Place.Builder place() { return new Place.PlaceThingBuilder(); }
  /**
   * An international trial.
   */
  public static InternationalTrial.Builder internationalTrial() { return new InternationalTrial.InternationalTrialThingBuilder(); }
  /**
   * A reservation for a taxi.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use http://schema.org/Offer.
   */
  public static TaxiReservation.Builder taxiReservation() { return new TaxiReservation.TaxiReservationThingBuilder(); }
  /**
   * The act of allocating an action/event/task to some destination (someone or something).
   */
  public static AssignAction.Builder assignAction() { return new AssignAction.AssignActionThingBuilder(); }
  /**
   * A tourist information center.
   */
  public static TouristInformationCenter.Builder touristInformationCenter() { return new TouristInformationCenter.TouristInformationCenterThingBuilder(); }
  /**
   * A food-related business.
   */
  public static FoodEstablishment.Builder foodEstablishment() { return new FoodEstablishment.FoodEstablishmentThingBuilder(); }
  /**
   * An agent tracks an object for updates.<p>Related actions:</p><ul><li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike FollowAction, TrackAction refers to the interest on the location of innanimates objects.</li><li><a href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, TrackAction refers to  the interest on the location of innanimate objects</li></ul>.
   */
  public static TrackAction.Builder trackAction() { return new TrackAction.TrackActionThingBuilder(); }
  /**
   * Nutritional information about the recipe.
   */
  public static NutritionInformation.Builder nutritionInformation() { return new NutritionInformation.NutritionInformationThingBuilder(); }
  /**
   * Four-wheel drive is a transmission layout where the engine primarily drives two wheels with a part-time four-wheel drive capability.
   */
  public static FourWheelDriveConfiguration.Builder fourWheelDriveConfiguration() { return new FourWheelDriveConfiguration.FourWheelDriveConfigurationThingBuilder(); }
  /**
   * A motel.
   */
  public static Motel.Builder motel() { return new Motel.MotelThingBuilder(); }
  /**
   * Used to describe a ticket to an event, a flight, a bus ride, etc.
   */
  public static Ticket.Builder ticket() { return new Ticket.TicketThingBuilder(); }
  /**
   * A short TV program or a segment/part of a TV program.
   */
  public static TVClip.Builder tVClip() { return new TVClip.TVClipThingBuilder(); }
  /**
   * A randomized trial design.
   */
  public static RandomizedTrial.Builder randomizedTrial() { return new RandomizedTrial.RandomizedTrialThingBuilder(); }
  /**
   * An ItemList ordered with lower values listed first.
   */
  public static ItemListOrderAscending.Builder itemListOrderAscending() { return new ItemListOrderAscending.ItemListOrderAscendingThingBuilder(); }
  /**
   * The act of consuming written content.
   */
  public static ReadAction.Builder readAction() { return new ReadAction.ReadActionThingBuilder(); }
  /**
   * A medical laboratory that offers on-site or off-site diagnostic services.
   */
  public static DiagnosticLab.Builder diagnosticLab() { return new DiagnosticLab.DiagnosticLabThingBuilder(); }
  /**
   * The act of consuming audio content.
   */
  public static ListenAction.Builder listenAction() { return new ListenAction.ListenActionThingBuilder(); }
  /**
   * A preschool.
   */
  public static Preschool.Builder preschool() { return new Preschool.PreschoolThingBuilder(); }
  /**
   * A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.
   */
  public static LocalBusiness.Builder localBusiness() { return new LocalBusiness.LocalBusinessThingBuilder(); }
  /**
   * A process of care using radiation aimed at improving a health condition.
   */
  public static RadiationTherapy.Builder radiationTherapy() { return new RadiationTherapy.RadiationTherapyThingBuilder(); }
  /**
   * A <a href="/VideoGame">video game</a> series.
   */
  public static VideoGameSeries.Builder videoGameSeries() { return new VideoGameSeries.VideoGameSeriesThingBuilder(); }
  /**
   * Dentistry.
   */
  public static Dentistry.Builder dentistry() { return new Dentistry.DentistryThingBuilder(); }
  /**
   * Any rule set or interactive tool for estimating the risk of developing a complication or condition.
   */
  public static MedicalRiskEstimator.Builder medicalRiskEstimator() { return new MedicalRiskEstimator.MedicalRiskEstimatorThingBuilder(); }
  /**
   * A service provided by a government organization, e.g. food stamps, veterans benefits, etc.
   */
  public static GovernmentService.Builder governmentService() { return new GovernmentService.GovernmentServiceThingBuilder(); }
  /**
   * A subclass of Role used to describe roles within organizations.
   */
  public static OrganizationRole.Builder organizationRole() { return new OrganizationRole.OrganizationRoleThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to hereditary transmission and the variation of inherited characteristics and disorders.
   */
  public static Genetic.Builder genetic() { return new Genetic.GeneticThingBuilder(); }
  /**
   * Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.
   */
  public static Product.Builder product() { return new Product.ProductThingBuilder(); }
  /**
   * A florist.
   */
  public static Florist.Builder florist() { return new Florist.FloristThingBuilder(); }
  /**
   * Play mode: SinglePlayer. Which is played by a lone player.
   */
  public static SinglePlayer.Builder singlePlayer() { return new SinglePlayer.SinglePlayerThingBuilder(); }
  /**
   * A datasheet or vendor specification of a product (in the sense of a prototypical description).
   */
  public static ProductModel.Builder productModel() { return new ProductModel.ProductModelThingBuilder(); }
  /**
   * A health club.
   */
  public static HealthClub.Builder healthClub() { return new HealthClub.HealthClubThingBuilder(); }
  /**
   * A delivery service through which content is provided via broadcast over the air or online.
   */
  public static BroadcastService.Builder broadcastService() { return new BroadcastService.BroadcastServiceThingBuilder(); }
  /**
   * Any physical activity engaged in for recreational purposes. Examples may include ballroom dancing, roller skating, canoeing, fishing, etc.
   */
  public static LeisureTimeActivity.Builder leisureTimeActivity() { return new LeisureTimeActivity.LeisureTimeActivityThingBuilder(); }
  /**
   * Any medical intervention designed to prevent, treat, and cure human diseases and medical conditions, including both curative and palliative therapies. Medical therapies are typically processes of care relying upon pharmacotherapy, behavioral therapy, supportive therapy (with fluid or nutrition for example), or detoxification (e.g. hemodialysis) aimed at improving or preventing a health condition.
   */
  public static MedicalTherapy.Builder medicalTherapy() { return new MedicalTherapy.MedicalTherapyThingBuilder(); }
  /**
   * A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time.
   */
  public static DatedMoneySpecification.Builder datedMoneySpecification() { return new DatedMoneySpecification.DatedMoneySpecificationThingBuilder(); }
  /**
   * The act of stopping or deactivating a device or application (e.g. stopping a timer or turning off a flashlight).
   */
  public static DeactivateAction.Builder deactivateAction() { return new DeactivateAction.DeactivateActionThingBuilder(); }
  /**
   * Nose.
   */
  public static Nose.Builder nose() { return new Nose.NoseThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to diagnosis and treatment of disorders of muscles, ligaments and skeletal system.
   */
  public static Musculoskeletal.Builder musculoskeletal() { return new Musculoskeletal.MusculoskeletalThingBuilder(); }
  /**
   * The act of marrying a person.
   */
  public static MarryAction.Builder marryAction() { return new MarryAction.MarryActionThingBuilder(); }
  /**
   * SoundtrackAlbum.
   */
  public static SoundtrackAlbum.Builder soundtrackAlbum() { return new SoundtrackAlbum.SoundtrackAlbumThingBuilder(); }
  /**
   * The cost per unit of a medical drug. Note that this type is not meant to represent the price in an offer of a drug for sale; see the Offer type for that. This type will typically be used to tag wholesale or average retail cost of a drug, or maximum reimbursable cost. Costs of medical drugs vary widely depending on how and where they are paid for, so while this type captures some of the variables, costs should be used with caution by consumers of this schema's markup.
   */
  public static DrugCost.Builder drugCost() { return new DrugCost.DrugCostThingBuilder(); }
  /**
   * Appearance.
   */
  public static Appearance.Builder appearance() { return new Appearance.AppearanceThingBuilder(); }
  /**
   * A short band of tough, flexible, fibrous connective tissue that functions to connect multiple bones, cartilages, and structurally support joints.
   */
  public static Ligament.Builder ligament() { return new Ligament.LigamentThingBuilder(); }
  /**
   * A lodging business, such as a motel, hotel, or inn.
   */
  public static LodgingBusiness.Builder lodgingBusiness() { return new LodgingBusiness.LodgingBusinessThingBuilder(); }
  /**
   * Classification of the album by it's type of content: soundtrack, live album, studio album, etc.
   */
  public static MusicAlbumProductionType.Builder musicAlbumProductionType() { return new MusicAlbumProductionType.MusicAlbumProductionTypeThingBuilder(); }
  /**
   * A type of medical procedure that involves noninvasive techniques.
   */
  public static NoninvasiveProcedure.Builder noninvasiveProcedure() { return new NoninvasiveProcedure.NoninvasiveProcedureThingBuilder(); }
  /**
   * A specific branch of medical science that is concerned with the diagnosis and treatment of diseases, debilities and provision of care to the aged.
   */
  public static Geriatric.Builder geriatric() { return new Geriatric.GeriatricThingBuilder(); }
  /**
   * A specific branch of medical science that is deals with the evaluation and initial treatment of medical conditions caused by trauma or sudden illness.
   */
  public static Emergency.Builder emergency() { return new Emergency.EmergencyThingBuilder(); }
  /**
   * The act of discovering/finding an object.
   */
  public static DiscoverAction.Builder discoverAction() { return new DiscoverAction.DiscoverActionThingBuilder(); }
  /**
   * A specific branch of medical science that pertains to the health care of women, particularly in the diagnosis and treatment of disorders affecting the female reproductive system.
   */
  public static Gynecologic.Builder gynecologic() { return new Gynecologic.GynecologicThingBuilder(); }
  /**
   * Event type: Sports event.
   */
  public static SportsEvent.Builder sportsEvent() { return new SportsEvent.SportsEventThingBuilder(); }
  /**
   * Radiography.
   */
  public static Radiograpy.Builder radiograpy() { return new Radiograpy.RadiograpyThingBuilder(); }
  /**
   * A courthouse.
   */
  public static Courthouse.Builder courthouse() { return new Courthouse.CourthouseThingBuilder(); }
  /**
   * A recipe.
   */
  public static Recipe.Builder recipe() { return new Recipe.RecipeThingBuilder(); }
  /**
   * A means for accessing a service, e.g. a government office location, web site, or phone number.
   */
  public static ServiceChannel.Builder serviceChannel() { return new ServiceChannel.ServiceChannelThingBuilder(); }
  /**
   * A legislative building&#x2014;for example, the state capitol.
   */
  public static LegislativeBuilding.Builder legislativeBuilding() { return new LegislativeBuilding.LegislativeBuildingThingBuilder(); }
  /**
   * Anatomical features that can be observed by sight (without dissection), including the form and proportions of the human body as well as surface landmarks that correspond to deeper subcutaneous structures. Superficial anatomy plays an important role in sports medicine, phlebotomy, and other medical specialties as underlying anatomical structures can be identified through surface palpation. For example, during back surgery, superficial anatomy can be used to palpate and count vertebrae to find the site of incision. Or in phlebotomy, superficial anatomy can be used to locate an underlying vein; for example, the median cubital vein can be located by palpating the borders of the cubital fossa (such as the epicondyles of the humerus) and then looking for the superficial signs of the vein, such as size, prominence, ability to refill after depression, and feel of surrounding tissue support. As another example, in a subluxation (dislocation) of the glenohumeral joint, the bony structure becomes pronounced with the deltoid muscle failing to cover the glenohumeral joint allowing the edges of the scapula to be superficially visible. Here, the superficial anatomy is the visible edges of the scapula, implying the underlying dislocation of the joint (the related anatomical structure).
   */
  public static SuperficialAnatomy.Builder superficialAnatomy() { return new SuperficialAnatomy.SuperficialAnatomyThingBuilder(); }
  /**
   * Indicates whether this game is multi-player, co-op or single-player.
   */
  public static GamePlayMode.Builder gamePlayMode() { return new GamePlayMode.GamePlayModeThingBuilder(); }
  /**
   * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
   */
  public static Rating.Builder rating() { return new Rating.RatingThingBuilder(); }
  /**
   * A moving company.
   */
  public static MovingCompany.Builder movingCompany() { return new MovingCompany.MovingCompanyThingBuilder(); }
  /**
   * The Question/Answer types were <a href="https://www.w3.org/wiki/WebSchemas/QASchemaResearch">based on</a> the Stack Overflow API.
   */
  public static StackExchange.Builder stackExchange() { return new StackExchange.StackExchangeThingBuilder(); }
  /**
   * Any recommendation made by a standard society (e.g. ACC/AHA) or consensus statement that denotes how to diagnose and treat a particular condition. Note: this type should be used to tag the actual guideline recommendation; if the guideline recommendation occurs in a larger scholarly article, use MedicalScholarlyArticle to tag the overall article, not this type. Note also: the organization making the recommendation should be captured in the recognizingAuthority base property of MedicalEntity.
   */
  public static MedicalGuideline.Builder medicalGuideline() { return new MedicalGuideline.MedicalGuidelineThingBuilder(); }
  /**
   * Any indication of the existence of a medical condition or disease that is apparent to the patient.
   */
  public static MedicalSymptom.Builder medicalSymptom() { return new MedicalSymptom.MedicalSymptomThingBuilder(); }
  /**
   * A pet store.
   */
  public static PetStore.Builder petStore() { return new PetStore.PetStoreThingBuilder(); }
  /**
   * A construction business.
   */
  public static HomeAndConstructionBusiness.Builder homeAndConstructionBusiness() { return new HomeAndConstructionBusiness.HomeAndConstructionBusinessThingBuilder(); }
  /**
   * The act of responding to a question/message asked/sent by the object. Related to <a href="AskAction">AskAction</a>.<p>Related actions:</p><ul><li><a href="http://schema.org/AskAction">AskAction</a>: Appears generally as an origin of a ReplyAction</li></ul>.
   */
  public static ReplyAction.Builder replyAction() { return new ReplyAction.ReplyActionThingBuilder(); }
  /**
   *  A point value or interval for product characteristics and other purposes.
   */
  public static QuantitativeValue.Builder quantitativeValue() { return new QuantitativeValue.QuantitativeValueThingBuilder(); }
  /**
   * Any medical imaging modality typically used for diagnostic purposes. Enumerated type.
   */
  public static MedicalImagingTechnique.Builder medicalImagingTechnique() { return new MedicalImagingTechnique.MedicalImagingTechniqueThingBuilder(); }
  /**
   * The act of participating in performance arts.
   */
  public static PerformAction.Builder performAction() { return new PerformAction.PerformActionThingBuilder(); }
  /**
   * Event type: Theater performance.
   */
  public static TheaterEvent.Builder theaterEvent() { return new TheaterEvent.TheaterEventThingBuilder(); }
  /**
   * A canal, like the Panama Canal.
   */
  public static Canal.Builder canal() { return new Canal.CanalThingBuilder(); }
  /**
   * Enumerations related to health and the practice of medicine.
   */
  public static MedicalEnumeration.Builder medicalEnumeration() { return new MedicalEnumeration.MedicalEnumerationThingBuilder(); }
  /**
   * Properties that take Energy as values are of the form '&lt;Number&gt; &lt;Energy unit of measure&gt;'.
   */
  public static Energy.Builder energy() { return new Energy.EnergyThingBuilder(); }
  /**
   * A blog.
   */
  public static Blog.Builder blog() { return new Blog.BlogThingBuilder(); }
  /**
   * A piece of sculpture.
   */
  public static Sculpture.Builder sculpture() { return new Sculpture.SculptureThingBuilder(); }
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
  public static BusinessEntityType.Builder businessEntityType() { return new BusinessEntityType.BusinessEntityTypeThingBuilder(); }
  /**
   * An event venue.
   */
  public static EventVenue.Builder eventVenue() { return new EventVenue.EventVenueThingBuilder(); }
  /**
   * The act of arriving at a place. An agent arrives at a destination from an fromLocation, optionally with participants.
   */
  public static ArriveAction.Builder arriveAction() { return new ArriveAction.ArriveActionThingBuilder(); }
  /**
   * Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.
   */
  public static MedicalCondition.Builder medicalCondition() { return new MedicalCondition.MedicalConditionThingBuilder(); }
  /**
   * A subway station.
   */
  public static SubwayStation.Builder subwayStation() { return new SubwayStation.SubwayStationThingBuilder(); }
  /**
   * A guideline recommendation that is regarded as efficacious and where quality of the data supporting the recommendation is sound.
   */
  public static MedicalGuidelineRecommendation.Builder medicalGuidelineRecommendation() { return new MedicalGuidelineRecommendation.MedicalGuidelineRecommendationThingBuilder(); }
  /**
   * A river (for example, the broad majestic Shannon).
   */
  public static RiverBodyOfWater.Builder riverBodyOfWater() { return new RiverBodyOfWater.RiverBodyOfWaterThingBuilder(); }
  /**
   * A specific branch of medical science that is concerned with the ear, nose and throat and their respective disease states.
   */
  public static Otolaryngologic.Builder otolaryngologic() { return new Otolaryngologic.OtolaryngologicThingBuilder(); }
  /**
   * A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document.
   */
  public static Question.Builder question() { return new Question.QuestionThingBuilder(); }
  /**
   * Categories of physical activity, organized by physiologic classification.
   */
  public static PhysicalActivityCategory.Builder physicalActivityCategory() { return new PhysicalActivityCategory.PhysicalActivityCategoryThingBuilder(); }
  /**
   * The act of notifying an event organizer as to whether you expect to attend the event.
   */
  public static RsvpAction.Builder rsvpAction() { return new RsvpAction.RsvpActionThingBuilder(); }
  /**
   * Community health.
   */
  public static CommunityHealth.Builder communityHealth() { return new CommunityHealth.CommunityHealthThingBuilder(); }
  /**
   * An EducationalAudience.
   */
  public static EducationalAudience.Builder educationalAudience() { return new EducationalAudience.EducationalAudienceThingBuilder(); }
  /**
   * An car dealership.
   */
  public static AutoDealer.Builder autoDealer() { return new AutoDealer.AutoDealerThingBuilder(); }
  /**
   * DVDFormat.
   */
  public static DVDFormat.Builder dVDFormat() { return new DVDFormat.DVDFormatThingBuilder(); }
  /**
   * A scholarly article in the medical domain.
   */
  public static MedicalScholarlyArticle.Builder medicalScholarlyArticle() { return new MedicalScholarlyArticle.MedicalScholarlyArticleThingBuilder(); }
  /**
   * Cardiovascular.
   */
  public static CardiovascularExam.Builder cardiovascularExam() { return new CardiovascularExam.CardiovascularExamThingBuilder(); }
  /**
   * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
   */
  public static VehicleSpecialUsage.Builder vehicleSpecialUsage() { return new VehicleSpecialUsage.VehicleSpecialUsageThingBuilder(); }
  /**
   * A table on a Web page.
   */
  public static Table.Builder table() { return new Table.TableThingBuilder(); }
  /**
   * The act of interacting with another person or organization.
   */
  public static InteractAction.Builder interactAction() { return new InteractAction.InteractActionThingBuilder(); }
  /**
   * A tire shop.
   */
  public static TireShop.Builder tireShop() { return new TireShop.TireShopThingBuilder(); }
  /**
   * A city hall.
   */
  public static CityHall.Builder cityHall() { return new CityHall.CityHallThingBuilder(); }
  /**
   * A series of movies. Included movies can be indicated with the hasPart property.
   */
  public static MovieSeries.Builder movieSeries() { return new MovieSeries.MovieSeriesThingBuilder(); }
  /**
   * Accountancy business.
   */
  public static AccountingService.Builder accountingService() { return new AccountingService.AccountingServiceThingBuilder(); }
  /**
   * Indicates that the item has limited availability.
   */
  public static LimitedAvailability.Builder limitedAvailability() { return new LimitedAvailability.LimitedAvailabilityThingBuilder(); }
  /**
   * A product taken by mouth that contains a dietary ingredient intended to supplement the diet. Dietary ingredients may include vitamins, minerals, herbs or other botanicals, amino acids, and substances such as enzymes, organ tissues, glandulars and metabolites.
   */
  public static DietarySupplement.Builder dietarySupplement() { return new DietarySupplement.DietarySupplementThingBuilder(); }
  /**
   * Any physical activity engaged in for job-related purposes. Examples may include waiting tables, maid service, carrying a mailbag, picking fruits or vegetables, construction work, etc.
   */
  public static OccupationalActivity.Builder occupationalActivity() { return new OccupationalActivity.OccupationalActivityThingBuilder(); }
  /**
   * The price for the delivery of an offer using a particular delivery method.
   */
  public static DeliveryChargeSpecification.Builder deliveryChargeSpecification() { return new DeliveryChargeSpecification.DeliveryChargeSpecificationThingBuilder(); }
  /**
   * Event type: Sales event.
   */
  public static SaleEvent.Builder saleEvent() { return new SaleEvent.SaleEventThingBuilder(); }
  /**
   * A risk factor is anything that increases a person's likelihood of developing or contracting a disease, medical condition, or complication.
   */
  public static MedicalRiskFactor.Builder medicalRiskFactor() { return new MedicalRiskFactor.MedicalRiskFactorThingBuilder(); }
  /**
   * The act of physically/electronically taking delivery of an object thathas been transferred from an origin to a destination. Reciprocal of SendAction.<p>Related actions:</p><ul><li><a href="http://schema.org/SendAction">SendAction</a>: The reciprocal of ReceiveAction.</li><li><a href="http://schema.org/TakeAction">TakeAction</a>: Unlike TakeAction, ReceiveAction does not imply that the ownership has been transfered (e.g. I can receive a package, but it does not mean the package is now mine)</li></ul>.
   */
  public static ReceiveAction.Builder receiveAction() { return new ReceiveAction.ReceiveActionThingBuilder(); }
  /**
   * The act of planning the execution of an event/task/action/reservation/plan to a future date.
   */
  public static PlanAction.Builder planAction() { return new PlanAction.PlanActionThingBuilder(); }
  /**
   * Positron emission tomography imaging.
   */
  public static PET.Builder pET() { return new PET.PETThingBuilder(); }
  /**
   * Neuro.
   */
  public static Neuro.Builder neuro() { return new Neuro.NeuroThingBuilder(); }
  /**
   * A church.
   */
  public static Church.Builder church() { return new Church.ChurchThingBuilder(); }
  /**
   * A music store.
   */
  public static MusicStore.Builder musicStore() { return new MusicStore.MusicStoreThingBuilder(); }
  /**
   * The act of accomplishing something via     previous efforts. It is an instantaneous action rather than an ongoing     process.
   */
  public static AchieveAction.Builder achieveAction() { return new AchieveAction.AchieveActionThingBuilder(); }
  /**
   * The drug's cost represents the wholesale acquisition cost of the drug.
   */
  public static Wholesale.Builder wholesale() { return new Wholesale.WholesaleThingBuilder(); }
  /**
   * Front-wheel drive is a transmission layout where the engine drives the front wheels.
   */
  public static FrontWheelDriveConfiguration.Builder frontWheelDriveConfiguration() { return new FrontWheelDriveConfiguration.FrontWheelDriveConfigurationThingBuilder(); }
  /**
   * A comedy club.
   */
  public static ComedyClub.Builder comedyClub() { return new ComedyClub.ComedyClubThingBuilder(); }
  /**
   * A store that sells reading glasses and similar devices for improving vision.
   */
  public static Optician.Builder optician() { return new Optician.OpticianThingBuilder(); }
  /**
   * This class contains derivatives of properties from the GoodRelations Vocabulary for E-Commerce, created by Martin Hepp. GoodRelations is a data model for sharing e-commerce data on the Web that can be expressed in a variety of syntaxes, including RDFa and HTML5 Microdata. More information about GoodRelations can be found at <a href="http://purl.org/goodrelations/">http://purl.org/goodrelations/</a>.
   */
  public static GoodRelationsProperties.Builder goodRelationsProperties() { return new GoodRelationsProperties.GoodRelationsPropertiesThingBuilder(); }
  /**
   * A musical composition.
   */
  public static MusicComposition.Builder musicComposition() { return new MusicComposition.MusicCompositionThingBuilder(); }
  /**
   * The act of transferring ownership of an object to a destination. Reciprocal of TakeAction.<p>Related actions:</p><ul><li><a href="http://schema.org/TakeAction">TakeAction</a>: Reciprocal of GiveAction.</li><li><a href="http://schema.org/SendAction">SendAction</a>: Unlike SendAction, GiveAction implies that ownership is being transferred (e.g. I may send my laptop to you, but that doesn't mean I'm giving it to you)</li></ul>.
   */
  public static GiveAction.Builder giveAction() { return new GiveAction.GiveActionThingBuilder(); }
  /**
   * Lung.
   */
  public static Lung.Builder lung() { return new Lung.LungThingBuilder(); }
  /**
   * This class is derived from the GoodRelations Vocabulary for E-Commerce, created by Martin Hepp. GoodRelations is a data model for sharing e-commerce data on the Web that can be expressed in a variety of syntaxes, including RDFa and HTML5 Microdata. More information about GoodRelations can be found at <a href="http://purl.org/goodrelations/">http://purl.org/goodrelations/</a>.
   */
  public static GoodRelationsClass.Builder goodRelationsClass() { return new GoodRelationsClass.GoodRelationsClassThingBuilder(); }
  /**
   * A playground.
   */
  public static Playground.Builder playground() { return new Playground.PlaygroundThingBuilder(); }
  /**
   * Fitness-related activity designed for a specific health-related purpose, including defined exercise routines as well as activity prescribed by a clinician.
   */
  public static ExercisePlan.Builder exercisePlan() { return new ExercisePlan.ExercisePlanThingBuilder(); }
  /**
   * The delivery of a parcel either via the postal service or a commercial service.
   */
  public static ParcelDelivery.Builder parcelDelivery() { return new ParcelDelivery.ParcelDeliveryThingBuilder(); }
  /**
   * Primary care.
   */
  public static PrimaryCare.Builder primaryCare() { return new PrimaryCare.PrimaryCareThingBuilder(); }
  /**
   * The status of a reservation when a request has been sent, but not confirmed.
   */
  public static ReservationPending.Builder reservationPending() { return new ReservationPending.ReservationPendingThingBuilder(); }
  /**
   * Single-celled organism that causes an infection.
   */
  public static Protozoa.Builder protozoa() { return new Protozoa.ProtozoaThingBuilder(); }
  /**
   * All-wheel Drive is a transmission layout where the engine drives all four wheels.
   */
  public static AllWheelDriveConfiguration.Builder allWheelDriveConfiguration() { return new AllWheelDriveConfiguration.AllWheelDriveConfigurationThingBuilder(); }
  /**
   * A stage of a medical condition, such as 'Stage IIIa'.
   */
  public static MedicalConditionStage.Builder medicalConditionStage() { return new MedicalConditionStage.MedicalConditionStageThingBuilder(); }
  /**
   * Environment and public health.
   */
  public static PublicHealth.Builder publicHealth() { return new PublicHealth.PublicHealthThingBuilder(); }
  /**
   * A list of possible conditions for the item.
   */
  public static OfferItemCondition.Builder offerItemCondition() { return new OfferItemCondition.OfferItemConditionThingBuilder(); }
  /**
   * The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another.
   */
  public static TransferAction.Builder transferAction() { return new TransferAction.TransferActionThingBuilder(); }
  /**
   * Event type: Comedy event.
   */
  public static ComedyEvent.Builder comedyEvent() { return new ComedyEvent.ComedyEventThingBuilder(); }
  /**
   * A business that provide Heating, Ventilation and Air Conditioning services.
   */
  public static HVACBusiness.Builder hVACBusiness() { return new HVACBusiness.HVACBusinessThingBuilder(); }
  /**
   * A city or town.
   */
  public static City.Builder city() { return new City.CityThingBuilder(); }
  /**
   * Suspended.
   */
  public static Suspended.Builder suspended() { return new Suspended.SuspendedThingBuilder(); }
  /**
   * Residence type: Single-family home.
   */
  public static SingleFamilyResidence.Builder singleFamilyResidence() { return new SingleFamilyResidence.SingleFamilyResidenceThingBuilder(); }
  /**
   * Categories of medical devices, organized by the purpose or intended use of the device.
   */
  public static MedicalDevicePurpose.Builder medicalDevicePurpose() { return new MedicalDevicePurpose.MedicalDevicePurposeThingBuilder(); }
  /**
   * A review of an item - for example, of a restaurant, movie, or store.
   */
  public static Review.Builder review() { return new Review.ReviewThingBuilder(); }
  /**
   * Musculoskeletal.
   */
  public static MusculoskeletalExam.Builder musculoskeletalExam() { return new MusculoskeletalExam.MusculoskeletalExamThingBuilder(); }
  /**
   * A motorcycle dealer.
   */
  public static MotorcycleDealer.Builder motorcycleDealer() { return new MotorcycleDealer.MotorcycleDealerThingBuilder(); }
  /**
   * A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device.
   */
  public static VideoGame.Builder videoGame() { return new VideoGame.VideoGameThingBuilder(); }
  /**
   * A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
   */
  public static WarrantyPromise.Builder warrantyPromise() { return new WarrantyPromise.WarrantyPromiseThingBuilder(); }
  /**
   * Laboratory science.
   */
  public static LaboratoryScience.Builder laboratoryScience() { return new LaboratoryScience.LaboratoryScienceThingBuilder(); }
  /**
   * CreativeWorkSeries dedicated to radio broadcast and associated online delivery.
   */
  public static RadioSeries.Builder radioSeries() { return new RadioSeries.RadioSeriesThingBuilder(); }
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
  public static CreditCard.Builder creditCard() { return new CreditCard.CreditCardThingBuilder(); }

  public static ThingBuilder getBuilder(@NotNull String type) {
    if ("LymphaticVessel".equals(type)) { return new LymphaticVessel.LymphaticVesselThingBuilder(); }
    if ("ConfirmAction".equals(type)) { return new ConfirmAction.ConfirmActionThingBuilder(); }
    if ("ListItem".equals(type)) { return new ListItem.ListItemThingBuilder(); }
    if ("TVSeries".equals(type)) { return new TVSeries.TVSeriesThingBuilder(); }
    if ("VisualArtwork".equals(type)) { return new VisualArtwork.VisualArtworkThingBuilder(); }
    if ("DriveWheelConfigurationValue".equals(type)) { return new DriveWheelConfigurationValue.DriveWheelConfigurationValueThingBuilder(); }
    if ("Service".equals(type)) { return new Service.ServiceThingBuilder(); }
    if ("AlignmentObject".equals(type)) { return new AlignmentObject.AlignmentObjectThingBuilder(); }
    if ("AnimalShelter".equals(type)) { return new AnimalShelter.AnimalShelterThingBuilder(); }
    if ("FastFoodRestaurant".equals(type)) { return new FastFoodRestaurant.FastFoodRestaurantThingBuilder(); }
    if ("AmusementPark".equals(type)) { return new AmusementPark.AmusementParkThingBuilder(); }
    if ("DigitalAudioTapeFormat".equals(type)) { return new DigitalAudioTapeFormat.DigitalAudioTapeFormatThingBuilder(); }
    if ("AddAction".equals(type)) { return new AddAction.AddActionThingBuilder(); }
    if ("PeopleAudience".equals(type)) { return new PeopleAudience.PeopleAudienceThingBuilder(); }
    if ("BarOrPub".equals(type)) { return new BarOrPub.BarOrPubThingBuilder(); }
    if ("TVSeason".equals(type)) { return new TVSeason.TVSeasonThingBuilder(); }
    if ("MedicalRiskCalculator".equals(type)) { return new MedicalRiskCalculator.MedicalRiskCalculatorThingBuilder(); }
    if ("Abdomen".equals(type)) { return new Abdomen.AbdomenThingBuilder(); }
    if ("CommentAction".equals(type)) { return new CommentAction.CommentActionThingBuilder(); }
    if ("CreateAction".equals(type)) { return new CreateAction.CreateActionThingBuilder(); }
    if ("Permit".equals(type)) { return new Permit.PermitThingBuilder(); }
    if ("RejectAction".equals(type)) { return new RejectAction.RejectActionThingBuilder(); }
    if ("AppendAction".equals(type)) { return new AppendAction.AppendActionThingBuilder(); }
    if ("Duration".equals(type)) { return new Duration.DurationThingBuilder(); }
    if ("InsuranceAgency".equals(type)) { return new InsuranceAgency.InsuranceAgencyThingBuilder(); }
    if ("TieAction".equals(type)) { return new TieAction.TieActionThingBuilder(); }
    if ("GeoCoordinates".equals(type)) { return new GeoCoordinates.GeoCoordinatesThingBuilder(); }
    if ("WikiDoc".equals(type)) { return new WikiDoc.WikiDocThingBuilder(); }
    if ("Joint".equals(type)) { return new Joint.JointThingBuilder(); }
    if ("OrderPickupAvailable".equals(type)) { return new OrderPickupAvailable.OrderPickupAvailableThingBuilder(); }
    if ("GardenStore".equals(type)) { return new GardenStore.GardenStoreThingBuilder(); }
    if ("Skin".equals(type)) { return new Skin.SkinThingBuilder(); }
    if ("ChildrensEvent".equals(type)) { return new ChildrensEvent.ChildrensEventThingBuilder(); }
    if ("InStock".equals(type)) { return new InStock.InStockThingBuilder(); }
    if ("MedicalTest".equals(type)) { return new MedicalTest.MedicalTestThingBuilder(); }
    if ("QualitativeValue".equals(type)) { return new QualitativeValue.QualitativeValueThingBuilder(); }
    if ("TouristAttraction".equals(type)) { return new TouristAttraction.TouristAttractionThingBuilder(); }
    if ("SingleRelease".equals(type)) { return new SingleRelease.SingleReleaseThingBuilder(); }
    if ("OfflinePermanently".equals(type)) { return new OfflinePermanently.OfflinePermanentlyThingBuilder(); }
    if ("BookmarkAction".equals(type)) { return new BookmarkAction.BookmarkActionThingBuilder(); }
    if ("DrugPregnancyCategory".equals(type)) { return new DrugPregnancyCategory.DrugPregnancyCategoryThingBuilder(); }
    if ("TollFree".equals(type)) { return new TollFree.TollFreeThingBuilder(); }
    if ("Neurologic".equals(type)) { return new Neurologic.NeurologicThingBuilder(); }
    if ("BroadcastChannel".equals(type)) { return new BroadcastChannel.BroadcastChannelThingBuilder(); }
    if ("UnRegisterAction".equals(type)) { return new UnRegisterAction.UnRegisterActionThingBuilder(); }
    if ("DrivingSchoolVehicleUsage".equals(type)) { return new DrivingSchoolVehicleUsage.DrivingSchoolVehicleUsageThingBuilder(); }
    if ("Continent".equals(type)) { return new Continent.ContinentThingBuilder(); }
    if ("DeleteAction".equals(type)) { return new DeleteAction.DeleteActionThingBuilder(); }
    if ("Observational".equals(type)) { return new Observational.ObservationalThingBuilder(); }
    if ("ResultsAvailable".equals(type)) { return new ResultsAvailable.ResultsAvailableThingBuilder(); }
    if ("DJMixAlbum".equals(type)) { return new DJMixAlbum.DJMixAlbumThingBuilder(); }
    if ("WebPage".equals(type)) { return new WebPage.WebPageThingBuilder(); }
    if ("DamagedCondition".equals(type)) { return new DamagedCondition.DamagedConditionThingBuilder(); }
    if ("SingleBlindedTrial".equals(type)) { return new SingleBlindedTrial.SingleBlindedTrialThingBuilder(); }
    if ("BusStation".equals(type)) { return new BusStation.BusStationThingBuilder(); }
    if ("Terminated".equals(type)) { return new Terminated.TerminatedThingBuilder(); }
    if ("Taxi".equals(type)) { return new Taxi.TaxiThingBuilder(); }
    if ("BookFormatType".equals(type)) { return new BookFormatType.BookFormatTypeThingBuilder(); }
    if ("ResumeAction".equals(type)) { return new ResumeAction.ResumeActionThingBuilder(); }
    if ("TraditionalChinese".equals(type)) { return new TraditionalChinese.TraditionalChineseThingBuilder(); }
    if ("AnatomicalSystem".equals(type)) { return new AnatomicalSystem.AnatomicalSystemThingBuilder(); }
    if ("EatAction".equals(type)) { return new EatAction.EatActionThingBuilder(); }
    if ("CommunicateAction".equals(type)) { return new CommunicateAction.CommunicateActionThingBuilder(); }
    if ("Periodical".equals(type)) { return new Periodical.PeriodicalThingBuilder(); }
    if ("Airport".equals(type)) { return new Airport.AirportThingBuilder(); }
    if ("GroceryStore".equals(type)) { return new GroceryStore.GroceryStoreThingBuilder(); }
    if ("EndorseAction".equals(type)) { return new EndorseAction.EndorseActionThingBuilder(); }
    if ("PostalAddress".equals(type)) { return new PostalAddress.PostalAddressThingBuilder(); }
    if ("Nursing".equals(type)) { return new Nursing.NursingThingBuilder(); }
    if ("EventRescheduled".equals(type)) { return new EventRescheduled.EventRescheduledThingBuilder(); }
    if ("TravelAgency".equals(type)) { return new TravelAgency.TravelAgencyThingBuilder(); }
    if ("ProfilePage".equals(type)) { return new ProfilePage.ProfilePageThingBuilder(); }
    if ("WesternConventional".equals(type)) { return new WesternConventional.WesternConventionalThingBuilder(); }
    if ("RoofingContractor".equals(type)) { return new RoofingContractor.RoofingContractorThingBuilder(); }
    if ("ParkingFacility".equals(type)) { return new ParkingFacility.ParkingFacilityThingBuilder(); }
    if ("Casino".equals(type)) { return new Casino.CasinoThingBuilder(); }
    if ("ImageObject".equals(type)) { return new ImageObject.ImageObjectThingBuilder(); }
    if ("SoldOut".equals(type)) { return new SoldOut.SoldOutThingBuilder(); }
    if ("Homeopathic".equals(type)) { return new Homeopathic.HomeopathicThingBuilder(); }
    if ("BusReservation".equals(type)) { return new BusReservation.BusReservationThingBuilder(); }
    if ("Pond".equals(type)) { return new Pond.PondThingBuilder(); }
    if ("SpeechPathology".equals(type)) { return new SpeechPathology.SpeechPathologyThingBuilder(); }
    if ("SeaBodyOfWater".equals(type)) { return new SeaBodyOfWater.SeaBodyOfWaterThingBuilder(); }
    if ("FlightReservation".equals(type)) { return new FlightReservation.FlightReservationThingBuilder(); }
    if ("Researcher".equals(type)) { return new Researcher.ResearcherThingBuilder(); }
    if ("ClothingStore".equals(type)) { return new ClothingStore.ClothingStoreThingBuilder(); }
    if ("AutoWash".equals(type)) { return new AutoWash.AutoWashThingBuilder(); }
    if ("ComputerStore".equals(type)) { return new ComputerStore.ComputerStoreThingBuilder(); }
    if ("Code".equals(type)) { return new Code.CodeThingBuilder(); }
    if ("Mountain".equals(type)) { return new Mountain.MountainThingBuilder(); }
    if ("Online".equals(type)) { return new Online.OnlineThingBuilder(); }
    if ("MusicRecording".equals(type)) { return new MusicRecording.MusicRecordingThingBuilder(); }
    if ("InsertAction".equals(type)) { return new InsertAction.InsertActionThingBuilder(); }
    if ("Ayurvedic".equals(type)) { return new Ayurvedic.AyurvedicThingBuilder(); }
    if ("TakeAction".equals(type)) { return new TakeAction.TakeActionThingBuilder(); }
    if ("Withdrawn".equals(type)) { return new Withdrawn.WithdrawnThingBuilder(); }
    if ("MusicVideoObject".equals(type)) { return new MusicVideoObject.MusicVideoObjectThingBuilder(); }
    if ("TrainReservation".equals(type)) { return new TrainReservation.TrainReservationThingBuilder(); }
    if ("Prion".equals(type)) { return new Prion.PrionThingBuilder(); }
    if ("WatchAction".equals(type)) { return new WatchAction.WatchActionThingBuilder(); }
    if ("PostOffice".equals(type)) { return new PostOffice.PostOfficeThingBuilder(); }
    if ("PublicationIssue".equals(type)) { return new PublicationIssue.PublicationIssueThingBuilder(); }
    if ("Language".equals(type)) { return new Language.LanguageThingBuilder(); }
    if ("PotentialActionStatus".equals(type)) { return new PotentialActionStatus.PotentialActionStatusThingBuilder(); }
    if ("Renal".equals(type)) { return new Renal.RenalThingBuilder(); }
    if ("Country".equals(type)) { return new Country.CountryThingBuilder(); }
    if ("Therapeutic".equals(type)) { return new Therapeutic.TherapeuticThingBuilder(); }
    if ("DoseSchedule".equals(type)) { return new DoseSchedule.DoseScheduleThingBuilder(); }
    if ("Infectious".equals(type)) { return new Infectious.InfectiousThingBuilder(); }
    if ("AdministrativeArea".equals(type)) { return new AdministrativeArea.AdministrativeAreaThingBuilder(); }
    if ("SellAction".equals(type)) { return new SellAction.SellActionThingBuilder(); }
    if ("PreventionIndication".equals(type)) { return new PreventionIndication.PreventionIndicationThingBuilder(); }
    if ("UserDownloads".equals(type)) { return new UserDownloads.UserDownloadsThingBuilder(); }
    if ("BreadcrumbList".equals(type)) { return new BreadcrumbList.BreadcrumbListThingBuilder(); }
    if ("DataCatalog".equals(type)) { return new DataCatalog.DataCatalogThingBuilder(); }
    if ("OrderAction".equals(type)) { return new OrderAction.OrderActionThingBuilder(); }
    if ("EventReservation".equals(type)) { return new EventReservation.EventReservationThingBuilder(); }
    if ("MusicGroup".equals(type)) { return new MusicGroup.MusicGroupThingBuilder(); }
    if ("EventPostponed".equals(type)) { return new EventPostponed.EventPostponedThingBuilder(); }
    if ("SeatingMap".equals(type)) { return new SeatingMap.SeatingMapThingBuilder(); }
    if ("LodgingReservation".equals(type)) { return new LodgingReservation.LodgingReservationThingBuilder(); }
    if ("UserComments".equals(type)) { return new UserComments.UserCommentsThingBuilder(); }
    if ("UnitPriceSpecification".equals(type)) { return new UnitPriceSpecification.UnitPriceSpecificationThingBuilder(); }
    if ("SteeringPositionValue".equals(type)) { return new SteeringPositionValue.SteeringPositionValueThingBuilder(); }
    if ("AcceptAction".equals(type)) { return new AcceptAction.AcceptActionThingBuilder(); }
    if ("Museum".equals(type)) { return new Museum.MuseumThingBuilder(); }
    if ("SocialEvent".equals(type)) { return new SocialEvent.SocialEventThingBuilder(); }
    if ("LiteraryEvent".equals(type)) { return new LiteraryEvent.LiteraryEventThingBuilder(); }
    if ("FDAcategoryX".equals(type)) { return new FDAcategoryX.FDAcategoryXThingBuilder(); }
    if ("HomeGoodsStore".equals(type)) { return new HomeGoodsStore.HomeGoodsStoreThingBuilder(); }
    if ("MBZ".equals(type)) { return new MBZ.MBZThingBuilder(); }
    if ("Pulmonary".equals(type)) { return new Pulmonary.PulmonaryThingBuilder(); }
    if ("AllocateAction".equals(type)) { return new AllocateAction.AllocateActionThingBuilder(); }
    if ("WPSideBar".equals(type)) { return new WPSideBar.WPSideBarThingBuilder(); }
    if ("FDAcategoryC".equals(type)) { return new FDAcategoryC.FDAcategoryCThingBuilder(); }
    if ("FDAcategoryD".equals(type)) { return new FDAcategoryD.FDAcategoryDThingBuilder(); }
    if ("School".equals(type)) { return new School.SchoolThingBuilder(); }
    if ("CreativeWorkSeries".equals(type)) { return new CreativeWorkSeries.CreativeWorkSeriesThingBuilder(); }
    if ("FDAcategoryA".equals(type)) { return new FDAcategoryA.FDAcategoryAThingBuilder(); }
    if ("FDAcategoryB".equals(type)) { return new FDAcategoryB.FDAcategoryBThingBuilder(); }
    if ("DayOfWeek".equals(type)) { return new DayOfWeek.DayOfWeekThingBuilder(); }
    if ("TreatmentIndication".equals(type)) { return new TreatmentIndication.TreatmentIndicationThingBuilder(); }
    if ("TrainTrip".equals(type)) { return new TrainTrip.TrainTripThingBuilder(); }
    if ("HardwareStore".equals(type)) { return new HardwareStore.HardwareStoreThingBuilder(); }
    if ("ScreeningEvent".equals(type)) { return new ScreeningEvent.ScreeningEventThingBuilder(); }
    if ("PrescriptionOnly".equals(type)) { return new PrescriptionOnly.PrescriptionOnlyThingBuilder(); }
    if ("RentalVehicleUsage".equals(type)) { return new RentalVehicleUsage.RentalVehicleUsageThingBuilder(); }
    if ("RsvpResponseYes".equals(type)) { return new RsvpResponseYes.RsvpResponseYesThingBuilder(); }
    if ("MusicRelease".equals(type)) { return new MusicRelease.MusicReleaseThingBuilder(); }
    if ("Electrician".equals(type)) { return new Electrician.ElectricianThingBuilder(); }
    if ("NotYetRecruiting".equals(type)) { return new NotYetRecruiting.NotYetRecruitingThingBuilder(); }
    if ("Beach".equals(type)) { return new Beach.BeachThingBuilder(); }
    if ("WebApplication".equals(type)) { return new WebApplication.WebApplicationThingBuilder(); }
    if ("PropertyValueSpecification".equals(type)) { return new PropertyValueSpecification.PropertyValueSpecificationThingBuilder(); }
    if ("PlaceboControlledTrial".equals(type)) { return new PlaceboControlledTrial.PlaceboControlledTrialThingBuilder(); }
    if ("Oncologic".equals(type)) { return new Oncologic.OncologicThingBuilder(); }
    if ("AutomatedTeller".equals(type)) { return new AutomatedTeller.AutomatedTellerThingBuilder(); }
    if ("BusTrip".equals(type)) { return new BusTrip.BusTripThingBuilder(); }
    if ("PriceSpecification".equals(type)) { return new PriceSpecification.PriceSpecificationThingBuilder(); }
    if ("DislikeAction".equals(type)) { return new DislikeAction.DislikeActionThingBuilder(); }
    if ("BibExTerm".equals(type)) { return new BibExTerm.BibExTermThingBuilder(); }
    if ("Podiatric".equals(type)) { return new Podiatric.PodiatricThingBuilder(); }
    if ("OceanBodyOfWater".equals(type)) { return new OceanBodyOfWater.OceanBodyOfWaterThingBuilder(); }
    if ("ApartmentComplex".equals(type)) { return new ApartmentComplex.ApartmentComplexThingBuilder(); }
    if ("MedicalTrial".equals(type)) { return new MedicalTrial.MedicalTrialThingBuilder(); }
    if ("EventCancelled".equals(type)) { return new EventCancelled.EventCancelledThingBuilder(); }
    if ("Osteopathic".equals(type)) { return new Osteopathic.OsteopathicThingBuilder(); }
    if ("TattooParlor".equals(type)) { return new TattooParlor.TattooParlorThingBuilder(); }
    if ("CoOp".equals(type)) { return new CoOp.CoOpThingBuilder(); }
    if ("UserBlocks".equals(type)) { return new UserBlocks.UserBlocksThingBuilder(); }
    if ("QAPage".equals(type)) { return new QAPage.QAPageThingBuilder(); }
    if ("HobbyShop".equals(type)) { return new HobbyShop.HobbyShopThingBuilder(); }
    if ("GeoShape".equals(type)) { return new GeoShape.GeoShapeThingBuilder(); }
    if ("FilmAction".equals(type)) { return new FilmAction.FilmActionThingBuilder(); }
    if ("TherapeuticProcedure".equals(type)) { return new TherapeuticProcedure.TherapeuticProcedureThingBuilder(); }
    if ("FireStation".equals(type)) { return new FireStation.FireStationThingBuilder(); }
    if ("TelevisionStation".equals(type)) { return new TelevisionStation.TelevisionStationThingBuilder(); }
    if ("InStoreOnly".equals(type)) { return new InStoreOnly.InStoreOnlyThingBuilder(); }
    if ("MedicalCause".equals(type)) { return new MedicalCause.MedicalCauseThingBuilder(); }
    if ("EPRelease".equals(type)) { return new EPRelease.EPReleaseThingBuilder(); }
    if ("Event".equals(type)) { return new Event.EventThingBuilder(); }
    if ("PaymentMethod".equals(type)) { return new PaymentMethod.PaymentMethodThingBuilder(); }
    if ("ElementarySchool".equals(type)) { return new ElementarySchool.ElementarySchoolThingBuilder(); }
    if ("EvidenceLevelB".equals(type)) { return new EvidenceLevelB.EvidenceLevelBThingBuilder(); }
    if ("EvidenceLevelA".equals(type)) { return new EvidenceLevelA.EvidenceLevelAThingBuilder(); }
    if ("OrderReturned".equals(type)) { return new OrderReturned.OrderReturnedThingBuilder(); }
    if ("MedicalResearcher".equals(type)) { return new MedicalResearcher.MedicalResearcherThingBuilder(); }
    if ("EventStatusType".equals(type)) { return new EventStatusType.EventStatusTypeThingBuilder(); }
    if ("EvidenceLevelC".equals(type)) { return new EvidenceLevelC.EvidenceLevelCThingBuilder(); }
    if ("ImageGallery".equals(type)) { return new ImageGallery.ImageGalleryThingBuilder(); }
    if ("AuthorizeAction".equals(type)) { return new AuthorizeAction.AuthorizeActionThingBuilder(); }
    if ("WPFooter".equals(type)) { return new WPFooter.WPFooterThingBuilder(); }
    if ("CompletedActionStatus".equals(type)) { return new CompletedActionStatus.CompletedActionStatusThingBuilder(); }
    if ("SpokenWordAlbum".equals(type)) { return new SpokenWordAlbum.SpokenWordAlbumThingBuilder(); }
    if ("Head".equals(type)) { return new Head.HeadThingBuilder(); }
    if ("OutletStore".equals(type)) { return new OutletStore.OutletStoreThingBuilder(); }
    if ("BikeStore".equals(type)) { return new BikeStore.BikeStoreThingBuilder(); }
    if ("Artery".equals(type)) { return new Artery.ArteryThingBuilder(); }
    if ("OrderDelivered".equals(type)) { return new OrderDelivered.OrderDeliveredThingBuilder(); }
    if ("Notary".equals(type)) { return new Notary.NotaryThingBuilder(); }
    if ("DataType".equals(type)) { return new DataType.DataTypeThingBuilder(); }
    if ("Mass".equals(type)) { return new Mass.MassThingBuilder(); }
    if ("Demand".equals(type)) { return new Demand.DemandThingBuilder(); }
    if ("FoodEstablishmentReservation".equals(type)) { return new FoodEstablishmentReservation.FoodEstablishmentReservationThingBuilder(); }
    if ("BusinessFunction".equals(type)) { return new BusinessFunction.BusinessFunctionThingBuilder(); }
    if ("DanceGroup".equals(type)) { return new DanceGroup.DanceGroupThingBuilder(); }
    if ("DDxElement".equals(type)) { return new DDxElement.DDxElementThingBuilder(); }
    if ("CollectionPage".equals(type)) { return new CollectionPage.CollectionPageThingBuilder(); }
    if ("RsvpResponseMaybe".equals(type)) { return new RsvpResponseMaybe.RsvpResponseMaybeThingBuilder(); }
    if ("Mosque".equals(type)) { return new Mosque.MosqueThingBuilder(); }
    if ("Intangible".equals(type)) { return new Intangible.IntangibleThingBuilder(); }
    if ("Episode".equals(type)) { return new Episode.EpisodeThingBuilder(); }
    if ("Invoice".equals(type)) { return new Invoice.InvoiceThingBuilder(); }
    if ("Project".equals(type)) { return new Project.ProjectThingBuilder(); }
    if ("RecyclingCenter".equals(type)) { return new RecyclingCenter.RecyclingCenterThingBuilder(); }
    if ("MaximumDoseSchedule".equals(type)) { return new MaximumDoseSchedule.MaximumDoseScheduleThingBuilder(); }
    if ("MobileApplication".equals(type)) { return new MobileApplication.MobileApplicationThingBuilder(); }
    if ("ResultsNotAvailable".equals(type)) { return new ResultsNotAvailable.ResultsNotAvailableThingBuilder(); }
    if ("ActiveNotRecruiting".equals(type)) { return new ActiveNotRecruiting.ActiveNotRecruitingThingBuilder(); }
    if ("SoftwareApplication".equals(type)) { return new SoftwareApplication.SoftwareApplicationThingBuilder(); }
    if ("ControlAction".equals(type)) { return new ControlAction.ControlActionThingBuilder(); }
    if ("RadioChannel".equals(type)) { return new RadioChannel.RadioChannelThingBuilder(); }
    if ("CableOrSatelliteService".equals(type)) { return new CableOrSatelliteService.CableOrSatelliteServiceThingBuilder(); }
    if ("Property".equals(type)) { return new Property.PropertyThingBuilder(); }
    if ("VinylFormat".equals(type)) { return new VinylFormat.VinylFormatThingBuilder(); }
    if ("CafeOrCoffeeShop".equals(type)) { return new CafeOrCoffeeShop.CafeOrCoffeeShopThingBuilder(); }
    if ("Library".equals(type)) { return new Library.LibraryThingBuilder(); }
    if ("ItemListUnordered".equals(type)) { return new ItemListUnordered.ItemListUnorderedThingBuilder(); }
    if ("MedicalObservationalStudyDesign".equals(type)) { return new MedicalObservationalStudyDesign.MedicalObservationalStudyDesignThingBuilder(); }
    if ("FindAction".equals(type)) { return new FindAction.FindActionThingBuilder(); }
    if ("CompilationAlbum".equals(type)) { return new CompilationAlbum.CompilationAlbumThingBuilder(); }
    if ("PrependAction".equals(type)) { return new PrependAction.PrependActionThingBuilder(); }
    if ("BloodTest".equals(type)) { return new BloodTest.BloodTestThingBuilder(); }
    if ("XRay".equals(type)) { return new XRay.XRayThingBuilder(); }
    if ("LikeAction".equals(type)) { return new LikeAction.LikeActionThingBuilder(); }
    if ("BeautySalon".equals(type)) { return new BeautySalon.BeautySalonThingBuilder(); }
    if ("GovernmentOrganization".equals(type)) { return new GovernmentOrganization.GovernmentOrganizationThingBuilder(); }
    if ("Urologic".equals(type)) { return new Urologic.UrologicThingBuilder(); }
    if ("RsvpResponseType".equals(type)) { return new RsvpResponseType.RsvpResponseTypeThingBuilder(); }
    if ("BrainStructure".equals(type)) { return new BrainStructure.BrainStructureThingBuilder(); }
    if ("EmployeeRole".equals(type)) { return new EmployeeRole.EmployeeRoleThingBuilder(); }
    if ("RemixAlbum".equals(type)) { return new RemixAlbum.RemixAlbumThingBuilder(); }
    if ("MedicalAudience".equals(type)) { return new MedicalAudience.MedicalAudienceThingBuilder(); }
    if ("MovieRentalStore".equals(type)) { return new MovieRentalStore.MovieRentalStoreThingBuilder(); }
    if ("GameServer".equals(type)) { return new GameServer.GameServerThingBuilder(); }
    if ("LRMIClass".equals(type)) { return new LRMIClass.LRMIClassThingBuilder(); }
    if ("Car".equals(type)) { return new Car.CarThingBuilder(); }
    if ("Crematorium".equals(type)) { return new Crematorium.CrematoriumThingBuilder(); }
    if ("BankOrCreditUnion".equals(type)) { return new BankOrCreditUnion.BankOrCreditUnionThingBuilder(); }
    if ("QuoteAction".equals(type)) { return new QuoteAction.QuoteActionThingBuilder(); }
    if ("SendAction".equals(type)) { return new SendAction.SendActionThingBuilder(); }
    if ("Physician".equals(type)) { return new Physician.PhysicianThingBuilder(); }
    if ("Nerve".equals(type)) { return new Nerve.NerveThingBuilder(); }
    if ("Attorney".equals(type)) { return new Attorney.AttorneyThingBuilder(); }
    if ("ImagingTest".equals(type)) { return new ImagingTest.ImagingTestThingBuilder(); }
    if ("OnDemandEvent".equals(type)) { return new OnDemandEvent.OnDemandEventThingBuilder(); }
    if ("MedicalEntity".equals(type)) { return new MedicalEntity.MedicalEntityThingBuilder(); }
    if ("GolfCourse".equals(type)) { return new GolfCourse.GolfCourseThingBuilder(); }
    if ("RentAction".equals(type)) { return new RentAction.RentActionThingBuilder(); }
    if ("ReportedDoseSchedule".equals(type)) { return new ReportedDoseSchedule.ReportedDoseScheduleThingBuilder(); }
    if ("Enumeration".equals(type)) { return new Enumeration.EnumerationThingBuilder(); }
    if ("Hospital".equals(type)) { return new Hospital.HospitalThingBuilder(); }
    if ("Thing".equals(type)) { return new Thing.ThingThingBuilder(); }
    if ("FurnitureStore".equals(type)) { return new FurnitureStore.FurnitureStoreThingBuilder(); }
    if ("VisualArtsEvent".equals(type)) { return new VisualArtsEvent.VisualArtsEventThingBuilder(); }
    if ("CassetteFormat".equals(type)) { return new CassetteFormat.CassetteFormatThingBuilder(); }
    if ("ChooseAction".equals(type)) { return new ChooseAction.ChooseActionThingBuilder(); }
    if ("SportingGoodsStore".equals(type)) { return new SportingGoodsStore.SportingGoodsStoreThingBuilder(); }
    if ("Cardiovascular".equals(type)) { return new Cardiovascular.CardiovascularThingBuilder(); }
    if ("Bacteria".equals(type)) { return new Bacteria.BacteriaThingBuilder(); }
    if ("MedicalDevice".equals(type)) { return new MedicalDevice.MedicalDeviceThingBuilder(); }
    if ("NGO".equals(type)) { return new NGO.NGOThingBuilder(); }
    if ("BlogPosting".equals(type)) { return new BlogPosting.BlogPostingThingBuilder(); }
    if ("Reservoir".equals(type)) { return new Reservoir.ReservoirThingBuilder(); }
    if ("OnSitePickup".equals(type)) { return new OnSitePickup.OnSitePickupThingBuilder(); }
    if ("AutomotiveBusiness".equals(type)) { return new AutomotiveBusiness.AutomotiveBusinessThingBuilder(); }
    if ("AutoRental".equals(type)) { return new AutoRental.AutoRentalThingBuilder(); }
    if ("WPAdBlock".equals(type)) { return new WPAdBlock.WPAdBlockThingBuilder(); }
    if ("AutomotiveOntologyWGClass".equals(type)) { return new AutomotiveOntologyWGClass.AutomotiveOntologyWGClassThingBuilder(); }
    if ("OrganizeAction".equals(type)) { return new OrganizeAction.OrganizeActionThingBuilder(); }
    if ("BedAndBreakfast".equals(type)) { return new BedAndBreakfast.BedAndBreakfastThingBuilder(); }
    if ("RespiratoryTherapy".equals(type)) { return new RespiratoryTherapy.RespiratoryTherapyThingBuilder(); }
    if ("OrderCancelled".equals(type)) { return new OrderCancelled.OrderCancelledThingBuilder(); }
    if ("PlayAction".equals(type)) { return new PlayAction.PlayActionThingBuilder(); }
    if ("LifestyleModification".equals(type)) { return new LifestyleModification.LifestyleModificationThingBuilder(); }
    if ("Toxicologic".equals(type)) { return new Toxicologic.ToxicologicThingBuilder(); }
    if ("EventScheduled".equals(type)) { return new EventScheduled.EventScheduledThingBuilder(); }
    if ("UserPageVisits".equals(type)) { return new UserPageVisits.UserPageVisitsThingBuilder(); }
    if ("AdultEntertainment".equals(type)) { return new AdultEntertainment.AdultEntertainmentThingBuilder(); }
    if ("Patient".equals(type)) { return new Patient.PatientThingBuilder(); }
    if ("Diagnostic".equals(type)) { return new Diagnostic.DiagnosticThingBuilder(); }
    if ("CookAction".equals(type)) { return new CookAction.CookActionThingBuilder(); }
    if ("Aquarium".equals(type)) { return new Aquarium.AquariumThingBuilder(); }
    if ("Hotel".equals(type)) { return new Hotel.HotelThingBuilder(); }
    if ("EmergencyService".equals(type)) { return new EmergencyService.EmergencyServiceThingBuilder(); }
    if ("Map".equals(type)) { return new Map.MapThingBuilder(); }
    if ("OrderStatus".equals(type)) { return new OrderStatus.OrderStatusThingBuilder(); }
    if ("Integer".equals(type)) { return new Integer.IntegerThingBuilder(); }
    if ("TypeAndQuantityNode".equals(type)) { return new TypeAndQuantityNode.TypeAndQuantityNodeThingBuilder(); }
    if ("CarUsageType".equals(type)) { return new CarUsageType.CarUsageTypeThingBuilder(); }
    if ("VideoGallery".equals(type)) { return new VideoGallery.VideoGalleryThingBuilder(); }
    if ("ReservationHold".equals(type)) { return new ReservationHold.ReservationHoldThingBuilder(); }
    if ("Photograph".equals(type)) { return new Photograph.PhotographThingBuilder(); }
    if ("Dataset".equals(type)) { return new Dataset.DatasetThingBuilder(); }
    if ("Pathology".equals(type)) { return new Pathology.PathologyThingBuilder(); }
    if ("AutoBodyShop".equals(type)) { return new AutoBodyShop.AutoBodyShopThingBuilder(); }
    if ("AutoPartsStore".equals(type)) { return new AutoPartsStore.AutoPartsStoreThingBuilder(); }
    if ("HealthAndBeautyBusiness".equals(type)) { return new HealthAndBeautyBusiness.HealthAndBeautyBusinessThingBuilder(); }
    if ("PhotographAction".equals(type)) { return new PhotographAction.PhotographActionThingBuilder(); }
    if ("CheckoutPage".equals(type)) { return new CheckoutPage.CheckoutPageThingBuilder(); }
    if ("MedicalStudyStatus".equals(type)) { return new MedicalStudyStatus.MedicalStudyStatusThingBuilder(); }
    if ("Surgical".equals(type)) { return new Surgical.SurgicalThingBuilder(); }
    if ("Optometic".equals(type)) { return new Optometic.OptometicThingBuilder(); }
    if ("EnrollingByInvitation".equals(type)) { return new EnrollingByInvitation.EnrollingByInvitationThingBuilder(); }
    if ("PlasticSurgery".equals(type)) { return new PlasticSurgery.PlasticSurgeryThingBuilder(); }
    if ("Zoo".equals(type)) { return new Zoo.ZooThingBuilder(); }
    if ("OnlineOnly".equals(type)) { return new OnlineOnly.OnlineOnlyThingBuilder(); }
    if ("PlaceOfWorship".equals(type)) { return new PlaceOfWorship.PlaceOfWorshipThingBuilder(); }
    if ("MapCategoryType".equals(type)) { return new MapCategoryType.MapCategoryTypeThingBuilder(); }
    if ("FollowAction".equals(type)) { return new FollowAction.FollowActionThingBuilder(); }
    if ("Psychiatric".equals(type)) { return new Psychiatric.PsychiatricThingBuilder(); }
    if ("InformAction".equals(type)) { return new InformAction.InformActionThingBuilder(); }
    if ("Residence".equals(type)) { return new Residence.ResidenceThingBuilder(); }
    if ("OrderInTransit".equals(type)) { return new OrderInTransit.OrderInTransitThingBuilder(); }
    if ("MusicEvent".equals(type)) { return new MusicEvent.MusicEventThingBuilder(); }
    if ("ConsumeAction".equals(type)) { return new ConsumeAction.ConsumeActionThingBuilder(); }
    if ("AudioObject".equals(type)) { return new AudioObject.AudioObjectThingBuilder(); }
    if ("TaxiService".equals(type)) { return new TaxiService.TaxiServiceThingBuilder(); }
    if ("WantAction".equals(type)) { return new WantAction.WantActionThingBuilder(); }
    if ("State".equals(type)) { return new State.StateThingBuilder(); }
    if ("OwnershipInfo".equals(type)) { return new OwnershipInfo.OwnershipInfoThingBuilder(); }
    if ("AnatomicalStructure".equals(type)) { return new AnatomicalStructure.AnatomicalStructureThingBuilder(); }
    if ("Pediatric".equals(type)) { return new Pediatric.PediatricThingBuilder(); }
    if ("LendAction".equals(type)) { return new LendAction.LendActionThingBuilder(); }
    if ("Airline".equals(type)) { return new Airline.AirlineThingBuilder(); }
    if ("NewsArticle".equals(type)) { return new NewsArticle.NewsArticleThingBuilder(); }
    if ("MiddleSchool".equals(type)) { return new MiddleSchool.MiddleSchoolThingBuilder(); }
    if ("MusicAlbumReleaseType".equals(type)) { return new MusicAlbumReleaseType.MusicAlbumReleaseTypeThingBuilder(); }
    if ("TVEpisode".equals(type)) { return new TVEpisode.TVEpisodeThingBuilder(); }
    if ("PreOrder".equals(type)) { return new PreOrder.PreOrderThingBuilder(); }
    if ("StadiumOrArena".equals(type)) { return new StadiumOrArena.StadiumOrArenaThingBuilder(); }
    if ("MedicalGuidelineContraindication".equals(type)) { return new MedicalGuidelineContraindication.MedicalGuidelineContraindicationThingBuilder(); }
    if ("MedicalIntangible".equals(type)) { return new MedicalIntangible.MedicalIntangibleThingBuilder(); }
    if ("Specialty".equals(type)) { return new Specialty.SpecialtyThingBuilder(); }
    if ("CohortStudy".equals(type)) { return new CohortStudy.CohortStudyThingBuilder(); }
    if ("AerobicActivity".equals(type)) { return new AerobicActivity.AerobicActivityThingBuilder(); }
    if ("Vessel".equals(type)) { return new Vessel.VesselThingBuilder(); }
    if ("SportsOrganization".equals(type)) { return new SportsOrganization.SportsOrganizationThingBuilder(); }
    if ("IgnoreAction".equals(type)) { return new IgnoreAction.IgnoreActionThingBuilder(); }
    if ("UserCheckins".equals(type)) { return new UserCheckins.UserCheckinsThingBuilder(); }
    if ("HearingImpairedSupported".equals(type)) { return new HearingImpairedSupported.HearingImpairedSupportedThingBuilder(); }
    if ("Role".equals(type)) { return new Role.RoleThingBuilder(); }
    if ("FoodEvent".equals(type)) { return new FoodEvent.FoodEventThingBuilder(); }
    if ("TravelAction".equals(type)) { return new TravelAction.TravelActionThingBuilder(); }
    if ("SubscribeAction".equals(type)) { return new SubscribeAction.SubscribeActionThingBuilder(); }
    if ("RadioClip".equals(type)) { return new RadioClip.RadioClipThingBuilder(); }
    if ("Brand".equals(type)) { return new Brand.BrandThingBuilder(); }
    if ("ItemList".equals(type)) { return new ItemList.ItemListThingBuilder(); }
    if ("SkiResort".equals(type)) { return new SkiResort.SkiResortThingBuilder(); }
    if ("ContactPoint".equals(type)) { return new ContactPoint.ContactPointThingBuilder(); }
    if ("DonateAction".equals(type)) { return new DonateAction.DonateActionThingBuilder(); }
    if ("LeftHandDriving".equals(type)) { return new LeftHandDriving.LeftHandDrivingThingBuilder(); }
    if ("IndividualProduct".equals(type)) { return new IndividualProduct.IndividualProductThingBuilder(); }
    if ("MobilePhoneStore".equals(type)) { return new MobilePhoneStore.MobilePhoneStoreThingBuilder(); }
    if ("GovernmentBuilding".equals(type)) { return new GovernmentBuilding.GovernmentBuildingThingBuilder(); }
    if ("WearAction".equals(type)) { return new WearAction.WearActionThingBuilder(); }
    if ("PhysicalActivity".equals(type)) { return new PhysicalActivity.PhysicalActivityThingBuilder(); }
    if ("UserTweets".equals(type)) { return new UserTweets.UserTweetsThingBuilder(); }
    if ("Action".equals(type)) { return new Action.ActionThingBuilder(); }
    if ("PaymentChargeSpecification".equals(type)) { return new PaymentChargeSpecification.PaymentChargeSpecificationThingBuilder(); }
    if ("MedicalObservationalStudy".equals(type)) { return new MedicalObservationalStudy.MedicalObservationalStudyThingBuilder(); }
    if ("DisagreeAction".equals(type)) { return new DisagreeAction.DisagreeActionThingBuilder(); }
    if ("CheckInAction".equals(type)) { return new CheckInAction.CheckInActionThingBuilder(); }
    if ("SiteNavigationElement".equals(type)) { return new SiteNavigationElement.SiteNavigationElementThingBuilder(); }
    if ("LoseAction".equals(type)) { return new LoseAction.LoseActionThingBuilder(); }
    if ("Person".equals(type)) { return new Person.PersonThingBuilder(); }
    if ("Article".equals(type)) { return new Article.ArticleThingBuilder(); }
    if ("LiquorStore".equals(type)) { return new LiquorStore.LiquorStoreThingBuilder(); }
    if ("Retail".equals(type)) { return new Retail.RetailThingBuilder(); }
    if ("MedicalCode".equals(type)) { return new MedicalCode.MedicalCodeThingBuilder(); }
    if ("VideoGameClip".equals(type)) { return new VideoGameClip.VideoGameClipThingBuilder(); }
    if ("Flexibility".equals(type)) { return new Flexibility.FlexibilityThingBuilder(); }
    if ("RefurbishedCondition".equals(type)) { return new RefurbishedCondition.RefurbishedConditionThingBuilder(); }
    if ("CrossSectional".equals(type)) { return new CrossSectional.CrossSectionalThingBuilder(); }
    if ("RVPark".equals(type)) { return new RVPark.RVParkThingBuilder(); }
    if ("JoinAction".equals(type)) { return new JoinAction.JoinActionThingBuilder(); }
    if ("Clinician".equals(type)) { return new Clinician.ClinicianThingBuilder(); }
    if ("CancelAction".equals(type)) { return new CancelAction.CancelActionThingBuilder(); }
    if ("Physiotherapy".equals(type)) { return new Physiotherapy.PhysiotherapyThingBuilder(); }
    if ("AboutPage".equals(type)) { return new AboutPage.AboutPageThingBuilder(); }
    if ("Virus".equals(type)) { return new Virus.VirusThingBuilder(); }
    if ("MultiCenterTrial".equals(type)) { return new MultiCenterTrial.MultiCenterTrialThingBuilder(); }
    if ("RearWheelDriveConfiguration".equals(type)) { return new RearWheelDriveConfiguration.RearWheelDriveConfigurationThingBuilder(); }
    if ("PropertyValue".equals(type)) { return new PropertyValue.PropertyValueThingBuilder(); }
    if ("Painting".equals(type)) { return new Painting.PaintingThingBuilder(); }
    if ("Registry".equals(type)) { return new Registry.RegistryThingBuilder(); }
    if ("ShoppingCenter".equals(type)) { return new ShoppingCenter.ShoppingCenterThingBuilder(); }
    if ("IceCreamShop".equals(type)) { return new IceCreamShop.IceCreamShopThingBuilder(); }
    if ("HinduTemple".equals(type)) { return new HinduTemple.HinduTempleThingBuilder(); }
    if ("VenueMap".equals(type)) { return new VenueMap.VenueMapThingBuilder(); }
    if ("VoteAction".equals(type)) { return new VoteAction.VoteActionThingBuilder(); }
    if ("MRI".equals(type)) { return new MRI.MRIThingBuilder(); }
    if ("MulticellularParasite".equals(type)) { return new MulticellularParasite.MulticellularParasiteThingBuilder(); }
    if ("SelfStorage".equals(type)) { return new SelfStorage.SelfStorageThingBuilder(); }
    if ("JobPosting".equals(type)) { return new JobPosting.JobPostingThingBuilder(); }
    if ("TaxiStand".equals(type)) { return new TaxiStand.TaxiStandThingBuilder(); }
    if ("PalliativeProcedure".equals(type)) { return new PalliativeProcedure.PalliativeProcedureThingBuilder(); }
    if ("DigitalFormat".equals(type)) { return new DigitalFormat.DigitalFormatThingBuilder(); }
    if ("ConvenienceStore".equals(type)) { return new ConvenienceStore.ConvenienceStoreThingBuilder(); }
    if ("AlbumRelease".equals(type)) { return new AlbumRelease.AlbumReleaseThingBuilder(); }
    if ("StudioAlbum".equals(type)) { return new StudioAlbum.StudioAlbumThingBuilder(); }
    if ("Waterfall".equals(type)) { return new Waterfall.WaterfallThingBuilder(); }
    if ("TheaterGroup".equals(type)) { return new TheaterGroup.TheaterGroupThingBuilder(); }
    if ("Hematologic".equals(type)) { return new Hematologic.HematologicThingBuilder(); }
    if ("BowlingAlley".equals(type)) { return new BowlingAlley.BowlingAlleyThingBuilder(); }
    if ("PercutaneousProcedure".equals(type)) { return new PercutaneousProcedure.PercutaneousProcedureThingBuilder(); }
    if ("OccupationalTherapy".equals(type)) { return new OccupationalTherapy.OccupationalTherapyThingBuilder(); }
    if ("MedicalSign".equals(type)) { return new MedicalSign.MedicalSignThingBuilder(); }
    if ("HairSalon".equals(type)) { return new HairSalon.HairSalonThingBuilder(); }
    if ("PoliceStation".equals(type)) { return new PoliceStation.PoliceStationThingBuilder(); }
    if ("GatedResidenceCommunity".equals(type)) { return new GatedResidenceCommunity.GatedResidenceCommunityThingBuilder(); }
    if ("RightHandDriving".equals(type)) { return new RightHandDriving.RightHandDrivingThingBuilder(); }
    if ("GameServerStatus".equals(type)) { return new GameServerStatus.GameServerStatusThingBuilder(); }
    if ("LandmarksOrHistoricalBuildings".equals(type)) { return new LandmarksOrHistoricalBuildings.LandmarksOrHistoricalBuildingsThingBuilder(); }
    if ("DatasetClass".equals(type)) { return new DatasetClass.DatasetClassThingBuilder(); }
    if ("DryCleaningOrLaundry".equals(type)) { return new DryCleaningOrLaundry.DryCleaningOrLaundryThingBuilder(); }
    if ("Anesthesia".equals(type)) { return new Anesthesia.AnesthesiaThingBuilder(); }
    if ("InviteAction".equals(type)) { return new InviteAction.InviteActionThingBuilder(); }
    if ("DanceEvent".equals(type)) { return new DanceEvent.DanceEventThingBuilder(); }
    if ("OfficeEquipmentStore".equals(type)) { return new OfficeEquipmentStore.OfficeEquipmentStoreThingBuilder(); }
    if ("Longitudinal".equals(type)) { return new Longitudinal.LongitudinalThingBuilder(); }
    if ("RadioSeason".equals(type)) { return new RadioSeason.RadioSeasonThingBuilder(); }
    if ("Pharmacy".equals(type)) { return new Pharmacy.PharmacyThingBuilder(); }
    if ("CatholicChurch".equals(type)) { return new CatholicChurch.CatholicChurchThingBuilder(); }
    if ("SuspendAction".equals(type)) { return new SuspendAction.SuspendActionThingBuilder(); }
    if ("ReturnAction".equals(type)) { return new ReturnAction.ReturnActionThingBuilder(); }
    if ("ExerciseGym".equals(type)) { return new ExerciseGym.ExerciseGymThingBuilder(); }
    if ("AggregateRating".equals(type)) { return new AggregateRating.AggregateRatingThingBuilder(); }
    if ("DietNutrition".equals(type)) { return new DietNutrition.DietNutritionThingBuilder(); }
    if ("DepartAction".equals(type)) { return new DepartAction.DepartActionThingBuilder(); }
    if ("CT".equals(type)) { return new CT.CTThingBuilder(); }
    if ("TransitMap".equals(type)) { return new TransitMap.TransitMapThingBuilder(); }
    if ("ActionCollabClass".equals(type)) { return new ActionCollabClass.ActionCollabClassThingBuilder(); }
    if ("EducationEvent".equals(type)) { return new EducationEvent.EducationEventThingBuilder(); }
    if ("ItemAvailability".equals(type)) { return new ItemAvailability.ItemAvailabilityThingBuilder(); }
    if ("EntryPoint".equals(type)) { return new EntryPoint.EntryPointThingBuilder(); }
    if ("ProgramMembership".equals(type)) { return new ProgramMembership.ProgramMembershipThingBuilder(); }
    if ("TaxiVehicleUsage".equals(type)) { return new TaxiVehicleUsage.TaxiVehicleUsageThingBuilder(); }
    if ("PathologyTest".equals(type)) { return new PathologyTest.PathologyTestThingBuilder(); }
    if ("ReservationStatusType".equals(type)) { return new ReservationStatusType.ReservationStatusTypeThingBuilder(); }
    if ("Game".equals(type)) { return new Game.GameThingBuilder(); }
    if ("ProfessionalService".equals(type)) { return new ProfessionalService.ProfessionalServiceThingBuilder(); }
    if ("Vein".equals(type)) { return new Vein.VeinThingBuilder(); }
    if ("MedicalTrialDesign".equals(type)) { return new MedicalTrialDesign.MedicalTrialDesignThingBuilder(); }
    if ("UpdateAction".equals(type)) { return new UpdateAction.UpdateActionThingBuilder(); }
    if ("WarrantyScope".equals(type)) { return new WarrantyScope.WarrantyScopeThingBuilder(); }
    if ("ReimbursementCap".equals(type)) { return new ReimbursementCap.ReimbursementCapThingBuilder(); }
    if ("Plumber".equals(type)) { return new Plumber.PlumberThingBuilder(); }
    if ("Bakery".equals(type)) { return new Bakery.BakeryThingBuilder(); }
    if ("PublicationVolume".equals(type)) { return new PublicationVolume.PublicationVolumeThingBuilder(); }
    if ("ReservationCancelled".equals(type)) { return new ReservationCancelled.ReservationCancelledThingBuilder(); }
    if ("BuyAction".equals(type)) { return new BuyAction.BuyActionThingBuilder(); }
    if ("WebSite".equals(type)) { return new WebSite.WebSiteThingBuilder(); }
    if ("OnlineFull".equals(type)) { return new OnlineFull.OnlineFullThingBuilder(); }
    if ("MensClothingStore".equals(type)) { return new MensClothingStore.MensClothingStoreThingBuilder(); }
    if ("Locksmith".equals(type)) { return new Locksmith.LocksmithThingBuilder(); }
    if ("MusicAlbum".equals(type)) { return new MusicAlbum.MusicAlbumThingBuilder(); }
    if ("Corporation".equals(type)) { return new Corporation.CorporationThingBuilder(); }
    if ("AnaerobicActivity".equals(type)) { return new AnaerobicActivity.AnaerobicActivityThingBuilder(); }
    if ("BodyOfWater".equals(type)) { return new BodyOfWater.BodyOfWaterThingBuilder(); }
    if ("RealEstateAgent".equals(type)) { return new RealEstateAgent.RealEstateAgentThingBuilder(); }
    if ("DrugLegalStatus".equals(type)) { return new DrugLegalStatus.DrugLegalStatusThingBuilder(); }
    if ("MedicalTestPanel".equals(type)) { return new MedicalTestPanel.MedicalTestPanelThingBuilder(); }
    if ("TennisComplex".equals(type)) { return new TennisComplex.TennisComplexThingBuilder(); }
    if ("MusicVenue".equals(type)) { return new MusicVenue.MusicVenueThingBuilder(); }
    if ("WholesaleStore".equals(type)) { return new WholesaleStore.WholesaleStoreThingBuilder(); }
    if ("MedicalClinic".equals(type)) { return new MedicalClinic.MedicalClinicThingBuilder(); }
    if ("DrugStrength".equals(type)) { return new DrugStrength.DrugStrengthThingBuilder(); }
    if ("ShareAction".equals(type)) { return new ShareAction.ShareActionThingBuilder(); }
    if ("SportsActivityLocation".equals(type)) { return new SportsActivityLocation.SportsActivityLocationThingBuilder(); }
    if ("EmailMessage".equals(type)) { return new EmailMessage.EmailMessageThingBuilder(); }
    if ("ParentAudience".equals(type)) { return new ParentAudience.ParentAudienceThingBuilder(); }
    if ("RadioEpisode".equals(type)) { return new RadioEpisode.RadioEpisodeThingBuilder(); }
    if ("PublicationEvent".equals(type)) { return new PublicationEvent.PublicationEventThingBuilder(); }
    if ("DoubleBlindedTrial".equals(type)) { return new DoubleBlindedTrial.DoubleBlindedTrialThingBuilder(); }
    if ("Organization".equals(type)) { return new Organization.OrganizationThingBuilder(); }
    if ("Order".equals(type)) { return new Order.OrderThingBuilder(); }
    if ("ViewAction".equals(type)) { return new ViewAction.ViewActionThingBuilder(); }
    if ("Clip".equals(type)) { return new Clip.ClipThingBuilder(); }
    if ("OfflineTemporarily".equals(type)) { return new OfflineTemporarily.OfflineTemporarilyThingBuilder(); }
    if ("InteractionCount".equals(type)) { return new InteractionCount.InteractionCountThingBuilder(); }
    if ("Comment".equals(type)) { return new Comment.CommentThingBuilder(); }
    if ("ApplyAction".equals(type)) { return new ApplyAction.ApplyActionThingBuilder(); }
    if ("PerformingArtsTheater".equals(type)) { return new PerformingArtsTheater.PerformingArtsTheaterThingBuilder(); }
    if ("DeliveryEvent".equals(type)) { return new DeliveryEvent.DeliveryEventThingBuilder(); }
    if ("SoftwareApplicationBuild".equals(type)) { return new SoftwareApplicationBuild.SoftwareApplicationBuildThingBuilder(); }
    if ("Campground".equals(type)) { return new Campground.CampgroundThingBuilder(); }
    if ("RNews".equals(type)) { return new RNews.RNewsThingBuilder(); }
    if ("TelevisionChannel".equals(type)) { return new TelevisionChannel.TelevisionChannelThingBuilder(); }
    if ("ZoneBoardingPolicy".equals(type)) { return new ZoneBoardingPolicy.ZoneBoardingPolicyThingBuilder(); }
    if ("HousePainter".equals(type)) { return new HousePainter.HousePainterThingBuilder(); }
    if ("StructuredValue".equals(type)) { return new StructuredValue.StructuredValueThingBuilder(); }
    if ("MedicalProcedureType".equals(type)) { return new MedicalProcedureType.MedicalProcedureTypeThingBuilder(); }
    if ("Cemetery".equals(type)) { return new Cemetery.CemeteryThingBuilder(); }
    if ("Seat".equals(type)) { return new Seat.SeatThingBuilder(); }
    if ("Movie".equals(type)) { return new Movie.MovieThingBuilder(); }
    if ("PharmacySpecialty".equals(type)) { return new PharmacySpecialty.PharmacySpecialtyThingBuilder(); }
    if ("DemoAlbum".equals(type)) { return new DemoAlbum.DemoAlbumThingBuilder(); }
    if ("Hostel".equals(type)) { return new Hostel.HostelThingBuilder(); }
    if ("DrawAction".equals(type)) { return new DrawAction.DrawActionThingBuilder(); }
    if ("GroupBoardingPolicy".equals(type)) { return new GroupBoardingPolicy.GroupBoardingPolicyThingBuilder(); }
    if ("TradeAction".equals(type)) { return new TradeAction.TradeActionThingBuilder(); }
    if ("ExerciseAction".equals(type)) { return new ExerciseAction.ExerciseActionThingBuilder(); }
    if ("MedicalWebPage".equals(type)) { return new MedicalWebPage.MedicalWebPageThingBuilder(); }
    if ("ActivateAction".equals(type)) { return new ActivateAction.ActivateActionThingBuilder(); }
    if ("GasStation".equals(type)) { return new GasStation.GasStationThingBuilder(); }
    if ("DeliveryMethod".equals(type)) { return new DeliveryMethod.DeliveryMethodThingBuilder(); }
    if ("Flight".equals(type)) { return new Flight.FlightThingBuilder(); }
    if ("InstallAction".equals(type)) { return new InstallAction.InstallActionThingBuilder(); }
    if ("MedicalRiskScore".equals(type)) { return new MedicalRiskScore.MedicalRiskScoreThingBuilder(); }
    if ("UserPlays".equals(type)) { return new UserPlays.UserPlaysThingBuilder(); }
    if ("ArtGallery".equals(type)) { return new ArtGallery.ArtGalleryThingBuilder(); }
    if ("AskAction".equals(type)) { return new AskAction.AskActionThingBuilder(); }
    if ("RegisterAction".equals(type)) { return new RegisterAction.RegisterActionThingBuilder(); }
    if ("AssessAction".equals(type)) { return new AssessAction.AssessActionThingBuilder(); }
    if ("ApprovedIndication".equals(type)) { return new ApprovedIndication.ApprovedIndicationThingBuilder(); }
    if ("Festival".equals(type)) { return new Festival.FestivalThingBuilder(); }
    if ("GeneralContractor".equals(type)) { return new GeneralContractor.GeneralContractorThingBuilder(); }
    if ("NailSalon".equals(type)) { return new NailSalon.NailSalonThingBuilder(); }
    if ("Series".equals(type)) { return new Series.SeriesThingBuilder(); }
    if ("Park".equals(type)) { return new Park.ParkThingBuilder(); }
    if ("BorrowAction".equals(type)) { return new BorrowAction.BorrowActionThingBuilder(); }
    if ("BoardingPolicyType".equals(type)) { return new BoardingPolicyType.BoardingPolicyTypeThingBuilder(); }
    if ("Midwifery".equals(type)) { return new Midwifery.MidwiferyThingBuilder(); }
    if ("Dentist".equals(type)) { return new Dentist.DentistThingBuilder(); }
    if ("PhysicalTherapy".equals(type)) { return new PhysicalTherapy.PhysicalTherapyThingBuilder(); }
    if ("CDFormat".equals(type)) { return new CDFormat.CDFormatThingBuilder(); }
    if ("WebPageElement".equals(type)) { return new WebPageElement.WebPageElementThingBuilder(); }
    if ("OrderProblem".equals(type)) { return new OrderProblem.OrderProblemThingBuilder(); }
    if ("OrderPaymentDue".equals(type)) { return new OrderPaymentDue.OrderPaymentDueThingBuilder(); }
    if ("MusicPlaylist".equals(type)) { return new MusicPlaylist.MusicPlaylistThingBuilder(); }
    if ("TripleBlindedTrial".equals(type)) { return new TripleBlindedTrial.TripleBlindedTrialThingBuilder(); }
    if ("CheckOutAction".equals(type)) { return new CheckOutAction.CheckOutActionThingBuilder(); }
    if ("ItemListOrderType".equals(type)) { return new ItemListOrderType.ItemListOrderTypeThingBuilder(); }
    if ("Store".equals(type)) { return new Store.StoreThingBuilder(); }
    if ("Eye".equals(type)) { return new Eye.EyeThingBuilder(); }
    if ("Obstetric".equals(type)) { return new Obstetric.ObstetricThingBuilder(); }
    if ("SearchAction".equals(type)) { return new SearchAction.SearchActionThingBuilder(); }
    if ("MovieClip".equals(type)) { return new MovieClip.MovieClipThingBuilder(); }
    if ("Embassy".equals(type)) { return new Embassy.EmbassyThingBuilder(); }
    if ("OrderProcessing".equals(type)) { return new OrderProcessing.OrderProcessingThingBuilder(); }
    if ("EducationalOrganization".equals(type)) { return new EducationalOrganization.EducationalOrganizationThingBuilder(); }
    if ("ParcelService".equals(type)) { return new ParcelService.ParcelServiceThingBuilder(); }
    if ("MedicalOrganization".equals(type)) { return new MedicalOrganization.MedicalOrganizationThingBuilder(); }
    if ("CollegeOrUniversity".equals(type)) { return new CollegeOrUniversity.CollegeOrUniversityThingBuilder(); }
    if ("BefriendAction".equals(type)) { return new BefriendAction.BefriendActionThingBuilder(); }
    if ("DrinkAction".equals(type)) { return new DrinkAction.DrinkActionThingBuilder(); }
    if ("MusicReleaseFormatType".equals(type)) { return new MusicReleaseFormatType.MusicReleaseFormatTypeThingBuilder(); }
    if ("MixtapeAlbum".equals(type)) { return new MixtapeAlbum.MixtapeAlbumThingBuilder(); }
    if ("MedicalProcedure".equals(type)) { return new MedicalProcedure.MedicalProcedureThingBuilder(); }
    if ("GovernmentPermit".equals(type)) { return new GovernmentPermit.GovernmentPermitThingBuilder(); }
    if ("BookSeries".equals(type)) { return new BookSeries.BookSeriesThingBuilder(); }
    if ("Neck".equals(type)) { return new Neck.NeckThingBuilder(); }
    if ("ReservationConfirmed".equals(type)) { return new ReservationConfirmed.ReservationConfirmedThingBuilder(); }
    if ("SportsClub".equals(type)) { return new SportsClub.SportsClubThingBuilder(); }
    if ("LiveAlbum".equals(type)) { return new LiveAlbum.LiveAlbumThingBuilder(); }
    if ("DrugClass".equals(type)) { return new DrugClass.DrugClassThingBuilder(); }
    if ("RentalCarReservation".equals(type)) { return new RentalCarReservation.RentalCarReservationThingBuilder(); }
    if ("PublicSwimmingPool".equals(type)) { return new PublicSwimmingPool.PublicSwimmingPoolThingBuilder(); }
    if ("Quantity".equals(type)) { return new Quantity.QuantityThingBuilder(); }
    if ("UserLikes".equals(type)) { return new UserLikes.UserLikesThingBuilder(); }
    if ("Muscle".equals(type)) { return new Muscle.MuscleThingBuilder(); }
    if ("EmploymentAgency".equals(type)) { return new EmploymentAgency.EmploymentAgencyThingBuilder(); }
    if ("Genitourinary".equals(type)) { return new Genitourinary.GenitourinaryThingBuilder(); }
    if ("Completed".equals(type)) { return new Completed.CompletedThingBuilder(); }
    if ("WinAction".equals(type)) { return new WinAction.WinActionThingBuilder(); }
    if ("BookStore".equals(type)) { return new BookStore.BookStoreThingBuilder(); }
    if ("Season".equals(type)) { return new Season.SeasonThingBuilder(); }
    if ("Reservation".equals(type)) { return new Reservation.ReservationThingBuilder(); }
    if ("ActionStatusType".equals(type)) { return new ActionStatusType.ActionStatusTypeThingBuilder(); }
    if ("OpeningHoursSpecification".equals(type)) { return new OpeningHoursSpecification.OpeningHoursSpecificationThingBuilder(); }
    if ("MedicalIndication".equals(type)) { return new MedicalIndication.MedicalIndicationThingBuilder(); }
    if ("AggregateOffer".equals(type)) { return new AggregateOffer.AggregateOfferThingBuilder(); }
    if ("Endocrine".equals(type)) { return new Endocrine.EndocrineThingBuilder(); }
    if ("DepartmentStore".equals(type)) { return new DepartmentStore.DepartmentStoreThingBuilder(); }
    if ("TipAction".equals(type)) { return new TipAction.TipActionThingBuilder(); }
    if ("MedicineSystem".equals(type)) { return new MedicineSystem.MedicineSystemThingBuilder(); }
    if ("Book".equals(type)) { return new Book.BookThingBuilder(); }
    if ("Brewery".equals(type)) { return new Brewery.BreweryThingBuilder(); }
    if ("MedicalEvidenceLevel".equals(type)) { return new MedicalEvidenceLevel.MedicalEvidenceLevelThingBuilder(); }
    if ("Ear".equals(type)) { return new Ear.EarThingBuilder(); }
    if ("MedicalSignOrSymptom".equals(type)) { return new MedicalSignOrSymptom.MedicalSignOrSymptomThingBuilder(); }
    if ("EBook".equals(type)) { return new EBook.EBookThingBuilder(); }
    if ("RecommendedDoseSchedule".equals(type)) { return new RecommendedDoseSchedule.RecommendedDoseScheduleThingBuilder(); }
    if ("ScholarlyArticle".equals(type)) { return new ScholarlyArticle.ScholarlyArticleThingBuilder(); }
    if ("BusinessEvent".equals(type)) { return new BusinessEvent.BusinessEventThingBuilder(); }
    if ("Bone".equals(type)) { return new Bone.BoneThingBuilder(); }
    if ("Dermatologic".equals(type)) { return new Dermatologic.DermatologicThingBuilder(); }
    if ("InternetCafe".equals(type)) { return new InternetCafe.InternetCafeThingBuilder(); }
    if ("ReserveAction".equals(type)) { return new ReserveAction.ReserveActionThingBuilder(); }
    if ("BusStop".equals(type)) { return new BusStop.BusStopThingBuilder(); }
    if ("SomeProducts".equals(type)) { return new SomeProducts.SomeProductsThingBuilder(); }
    if ("Paperback".equals(type)) { return new Paperback.PaperbackThingBuilder(); }
    if ("EntertainmentBusiness".equals(type)) { return new EntertainmentBusiness.EntertainmentBusinessThingBuilder(); }
    if ("ItemPage".equals(type)) { return new ItemPage.ItemPageThingBuilder(); }
    if ("APIReference".equals(type)) { return new APIReference.APIReferenceThingBuilder(); }
    if ("PerformingGroup".equals(type)) { return new PerformingGroup.PerformingGroupThingBuilder(); }
    if ("Gastroenterologic".equals(type)) { return new Gastroenterologic.GastroenterologicThingBuilder(); }
    if ("Rheumatologic".equals(type)) { return new Rheumatologic.RheumatologicThingBuilder(); }
    if ("Diet".equals(type)) { return new Diet.DietThingBuilder(); }
    if ("UserPlusOnes".equals(type)) { return new UserPlusOnes.UserPlusOnesThingBuilder(); }
    if ("OutOfStock".equals(type)) { return new OutOfStock.OutOfStockThingBuilder(); }
    if ("Recruiting".equals(type)) { return new Recruiting.RecruitingThingBuilder(); }
    if ("MedicalContraindication".equals(type)) { return new MedicalContraindication.MedicalContraindicationThingBuilder(); }
    if ("Synagogue".equals(type)) { return new Synagogue.SynagogueThingBuilder(); }
    if ("Landform".equals(type)) { return new Landform.LandformThingBuilder(); }
    if ("Restaurant".equals(type)) { return new Restaurant.RestaurantThingBuilder(); }
    if ("Ultrasound".equals(type)) { return new Ultrasound.UltrasoundThingBuilder(); }
    if ("HighSchool".equals(type)) { return new HighSchool.HighSchoolThingBuilder(); }
    if ("ActiveActionStatus".equals(type)) { return new ActiveActionStatus.ActiveActionStatusThingBuilder(); }
    if ("LaserDiscFormat".equals(type)) { return new LaserDiscFormat.LaserDiscFormatThingBuilder(); }
    if ("PerformanceRole".equals(type)) { return new PerformanceRole.PerformanceRoleThingBuilder(); }
    if ("FailedActionStatus".equals(type)) { return new FailedActionStatus.FailedActionStatusThingBuilder(); }
    if ("ChildCare".equals(type)) { return new ChildCare.ChildCareThingBuilder(); }
    if ("SoftwareSourceCode".equals(type)) { return new SoftwareSourceCode.SoftwareSourceCodeThingBuilder(); }
    if ("LakeBodyOfWater".equals(type)) { return new LakeBodyOfWater.LakeBodyOfWaterThingBuilder(); }
    if ("DiagnosticProcedure".equals(type)) { return new DiagnosticProcedure.DiagnosticProcedureThingBuilder(); }
    if ("Throat".equals(type)) { return new Throat.ThroatThingBuilder(); }
    if ("SingleCenterTrial".equals(type)) { return new SingleCenterTrial.SingleCenterTrialThingBuilder(); }
    if ("ContactPointOption".equals(type)) { return new ContactPointOption.ContactPointOptionThingBuilder(); }
    if ("Chiropractic".equals(type)) { return new Chiropractic.ChiropracticThingBuilder(); }
    if ("PhysicalExam".equals(type)) { return new PhysicalExam.PhysicalExamThingBuilder(); }
    if ("VeterinaryCare".equals(type)) { return new VeterinaryCare.VeterinaryCareThingBuilder(); }
    if ("RadioStation".equals(type)) { return new RadioStation.RadioStationThingBuilder(); }
    if ("Distance".equals(type)) { return new Distance.DistanceThingBuilder(); }
    if ("ReservationPackage".equals(type)) { return new ReservationPackage.ReservationPackageThingBuilder(); }
    if ("NightClub".equals(type)) { return new NightClub.NightClubThingBuilder(); }
    if ("Volcano".equals(type)) { return new Volcano.VolcanoThingBuilder(); }
    if ("AgreeAction".equals(type)) { return new AgreeAction.AgreeActionThingBuilder(); }
    if ("Discontinued".equals(type)) { return new Discontinued.DiscontinuedThingBuilder(); }
    if ("OrderItem".equals(type)) { return new OrderItem.OrderItemThingBuilder(); }
    if ("CreativeWorkSeason".equals(type)) { return new CreativeWorkSeason.CreativeWorkSeasonThingBuilder(); }
    if ("ContactPage".equals(type)) { return new ContactPage.ContactPageThingBuilder(); }
    if ("DataDownload".equals(type)) { return new DataDownload.DataDownloadThingBuilder(); }
    if ("BroadcastRelease".equals(type)) { return new BroadcastRelease.BroadcastReleaseThingBuilder(); }
    if ("BusinessAudience".equals(type)) { return new BusinessAudience.BusinessAudienceThingBuilder(); }
    if ("Hardcover".equals(type)) { return new Hardcover.HardcoverThingBuilder(); }
    if ("ItemListOrderDescending".equals(type)) { return new ItemListOrderDescending.ItemListOrderDescendingThingBuilder(); }
    if ("CheckAction".equals(type)) { return new CheckAction.CheckActionThingBuilder(); }
    if ("BuddhistTemple".equals(type)) { return new BuddhistTemple.BuddhistTempleThingBuilder(); }
    if ("MedicalStudy".equals(type)) { return new MedicalStudy.MedicalStudyThingBuilder(); }
    if ("ElectronicsStore".equals(type)) { return new ElectronicsStore.ElectronicsStoreThingBuilder(); }
    if ("Offer".equals(type)) { return new Offer.OfferThingBuilder(); }
    if ("MedicalSpecialty".equals(type)) { return new MedicalSpecialty.MedicalSpecialtyThingBuilder(); }
    if ("ScheduleAction".equals(type)) { return new ScheduleAction.ScheduleActionThingBuilder(); }
    if ("PaintAction".equals(type)) { return new PaintAction.PaintActionThingBuilder(); }
    if ("StrengthTraining".equals(type)) { return new StrengthTraining.StrengthTrainingThingBuilder(); }
    if ("Vehicle".equals(type)) { return new Vehicle.VehicleThingBuilder(); }
    if ("SportsTeam".equals(type)) { return new SportsTeam.SportsTeamThingBuilder(); }
    if ("DrugPrescriptionStatus".equals(type)) { return new DrugPrescriptionStatus.DrugPrescriptionStatusThingBuilder(); }
    if ("WriteAction".equals(type)) { return new WriteAction.WriteActionThingBuilder(); }
    if ("CivicStructure".equals(type)) { return new CivicStructure.CivicStructureThingBuilder(); }
    if ("UserInteraction".equals(type)) { return new UserInteraction.UserInteractionThingBuilder(); }
    if ("ShoeStore".equals(type)) { return new ShoeStore.ShoeStoreThingBuilder(); }
    if ("UseAction".equals(type)) { return new UseAction.UseActionThingBuilder(); }
    if ("AutoRepair".equals(type)) { return new AutoRepair.AutoRepairThingBuilder(); }
    if ("Answer".equals(type)) { return new Answer.AnswerThingBuilder(); }
    if ("DaySpa".equals(type)) { return new DaySpa.DaySpaThingBuilder(); }
    if ("SurgicalProcedure".equals(type)) { return new SurgicalProcedure.SurgicalProcedureThingBuilder(); }
    if ("Drug".equals(type)) { return new Drug.DrugThingBuilder(); }
    if ("ReplaceAction".equals(type)) { return new ReplaceAction.ReplaceActionThingBuilder(); }
    if ("Balance".equals(type)) { return new Balance.BalanceThingBuilder(); }
    if ("Winery".equals(type)) { return new Winery.WineryThingBuilder(); }
    if ("NewCondition".equals(type)) { return new NewCondition.NewConditionThingBuilder(); }
    if ("OpenTrial".equals(type)) { return new OpenTrial.OpenTrialThingBuilder(); }
    if ("PsychologicalTreatment".equals(type)) { return new PsychologicalTreatment.PsychologicalTreatmentThingBuilder(); }
    if ("ToyStore".equals(type)) { return new ToyStore.ToyStoreThingBuilder(); }
    if ("PawnShop".equals(type)) { return new PawnShop.PawnShopThingBuilder(); }
    if ("CaseSeries".equals(type)) { return new CaseSeries.CaseSeriesThingBuilder(); }
    if ("TrainStation".equals(type)) { return new TrainStation.TrainStationThingBuilder(); }
    if ("EngineSpecification".equals(type)) { return new EngineSpecification.EngineSpecificationThingBuilder(); }
    if ("WPHeader".equals(type)) { return new WPHeader.WPHeaderThingBuilder(); }
    if ("FinancialService".equals(type)) { return new FinancialService.FinancialServiceThingBuilder(); }
    if ("UsedCondition".equals(type)) { return new UsedCondition.UsedConditionThingBuilder(); }
    if ("VitalSign".equals(type)) { return new VitalSign.VitalSignThingBuilder(); }
    if ("MotorcycleRepair".equals(type)) { return new MotorcycleRepair.MotorcycleRepairThingBuilder(); }
    if ("Fungus".equals(type)) { return new Fungus.FungusThingBuilder(); }
    if ("VideoObject".equals(type)) { return new VideoObject.VideoObjectThingBuilder(); }
    if ("FDAnotEvaluated".equals(type)) { return new FDAnotEvaluated.FDAnotEvaluatedThingBuilder(); }
    if ("ParkingMap".equals(type)) { return new ParkingMap.ParkingMapThingBuilder(); }
    if ("GovernmentOffice".equals(type)) { return new GovernmentOffice.GovernmentOfficeThingBuilder(); }
    if ("DefenceEstablishment".equals(type)) { return new DefenceEstablishment.DefenceEstablishmentThingBuilder(); }
    if ("RsvpResponseNo".equals(type)) { return new RsvpResponseNo.RsvpResponseNoThingBuilder(); }
    if ("MoveAction".equals(type)) { return new MoveAction.MoveActionThingBuilder(); }
    if ("DrugCostCategory".equals(type)) { return new DrugCostCategory.DrugCostCategoryThingBuilder(); }
    if ("PayAction".equals(type)) { return new PayAction.PayActionThingBuilder(); }
    if ("JewelryStore".equals(type)) { return new JewelryStore.JewelryStoreThingBuilder(); }
    if ("TechArticle".equals(type)) { return new TechArticle.TechArticleThingBuilder(); }
    if ("MultiPlayer".equals(type)) { return new MultiPlayer.MultiPlayerThingBuilder(); }
    if ("ReactAction".equals(type)) { return new ReactAction.ReactActionThingBuilder(); }
    if ("DownloadAction".equals(type)) { return new DownloadAction.DownloadActionThingBuilder(); }
    if ("OTC".equals(type)) { return new OTC.OTCThingBuilder(); }
    if ("InfectiousDisease".equals(type)) { return new InfectiousDisease.InfectiousDiseaseThingBuilder(); }
    if ("CreativeWork".equals(type)) { return new CreativeWork.CreativeWorkThingBuilder(); }
    if ("InfectiousAgentClass".equals(type)) { return new InfectiousAgentClass.InfectiousAgentClassThingBuilder(); }
    if ("BroadcastEvent".equals(type)) { return new BroadcastEvent.BroadcastEventThingBuilder(); }
    if ("ReviewAction".equals(type)) { return new ReviewAction.ReviewActionThingBuilder(); }
    if ("LeaveAction".equals(type)) { return new LeaveAction.LeaveActionThingBuilder(); }
    if ("LockerDelivery".equals(type)) { return new LockerDelivery.LockerDeliveryThingBuilder(); }
    if ("MediaObject".equals(type)) { return new MediaObject.MediaObjectThingBuilder(); }
    if ("Audience".equals(type)) { return new Audience.AudienceThingBuilder(); }
    if ("SearchResultsPage".equals(type)) { return new SearchResultsPage.SearchResultsPageThingBuilder(); }
    if ("MovieTheater".equals(type)) { return new MovieTheater.MovieTheaterThingBuilder(); }
    if ("Place".equals(type)) { return new Place.PlaceThingBuilder(); }
    if ("InternationalTrial".equals(type)) { return new InternationalTrial.InternationalTrialThingBuilder(); }
    if ("TaxiReservation".equals(type)) { return new TaxiReservation.TaxiReservationThingBuilder(); }
    if ("AssignAction".equals(type)) { return new AssignAction.AssignActionThingBuilder(); }
    if ("TouristInformationCenter".equals(type)) { return new TouristInformationCenter.TouristInformationCenterThingBuilder(); }
    if ("FoodEstablishment".equals(type)) { return new FoodEstablishment.FoodEstablishmentThingBuilder(); }
    if ("TrackAction".equals(type)) { return new TrackAction.TrackActionThingBuilder(); }
    if ("NutritionInformation".equals(type)) { return new NutritionInformation.NutritionInformationThingBuilder(); }
    if ("FourWheelDriveConfiguration".equals(type)) { return new FourWheelDriveConfiguration.FourWheelDriveConfigurationThingBuilder(); }
    if ("Motel".equals(type)) { return new Motel.MotelThingBuilder(); }
    if ("Ticket".equals(type)) { return new Ticket.TicketThingBuilder(); }
    if ("TVClip".equals(type)) { return new TVClip.TVClipThingBuilder(); }
    if ("RandomizedTrial".equals(type)) { return new RandomizedTrial.RandomizedTrialThingBuilder(); }
    if ("ItemListOrderAscending".equals(type)) { return new ItemListOrderAscending.ItemListOrderAscendingThingBuilder(); }
    if ("ReadAction".equals(type)) { return new ReadAction.ReadActionThingBuilder(); }
    if ("DiagnosticLab".equals(type)) { return new DiagnosticLab.DiagnosticLabThingBuilder(); }
    if ("ListenAction".equals(type)) { return new ListenAction.ListenActionThingBuilder(); }
    if ("Preschool".equals(type)) { return new Preschool.PreschoolThingBuilder(); }
    if ("LocalBusiness".equals(type)) { return new LocalBusiness.LocalBusinessThingBuilder(); }
    if ("RadiationTherapy".equals(type)) { return new RadiationTherapy.RadiationTherapyThingBuilder(); }
    if ("VideoGameSeries".equals(type)) { return new VideoGameSeries.VideoGameSeriesThingBuilder(); }
    if ("Dentistry".equals(type)) { return new Dentistry.DentistryThingBuilder(); }
    if ("MedicalRiskEstimator".equals(type)) { return new MedicalRiskEstimator.MedicalRiskEstimatorThingBuilder(); }
    if ("GovernmentService".equals(type)) { return new GovernmentService.GovernmentServiceThingBuilder(); }
    if ("OrganizationRole".equals(type)) { return new OrganizationRole.OrganizationRoleThingBuilder(); }
    if ("Genetic".equals(type)) { return new Genetic.GeneticThingBuilder(); }
    if ("Product".equals(type)) { return new Product.ProductThingBuilder(); }
    if ("Florist".equals(type)) { return new Florist.FloristThingBuilder(); }
    if ("SinglePlayer".equals(type)) { return new SinglePlayer.SinglePlayerThingBuilder(); }
    if ("ProductModel".equals(type)) { return new ProductModel.ProductModelThingBuilder(); }
    if ("HealthClub".equals(type)) { return new HealthClub.HealthClubThingBuilder(); }
    if ("BroadcastService".equals(type)) { return new BroadcastService.BroadcastServiceThingBuilder(); }
    if ("LeisureTimeActivity".equals(type)) { return new LeisureTimeActivity.LeisureTimeActivityThingBuilder(); }
    if ("MedicalTherapy".equals(type)) { return new MedicalTherapy.MedicalTherapyThingBuilder(); }
    if ("DatedMoneySpecification".equals(type)) { return new DatedMoneySpecification.DatedMoneySpecificationThingBuilder(); }
    if ("DeactivateAction".equals(type)) { return new DeactivateAction.DeactivateActionThingBuilder(); }
    if ("Nose".equals(type)) { return new Nose.NoseThingBuilder(); }
    if ("Musculoskeletal".equals(type)) { return new Musculoskeletal.MusculoskeletalThingBuilder(); }
    if ("MarryAction".equals(type)) { return new MarryAction.MarryActionThingBuilder(); }
    if ("SoundtrackAlbum".equals(type)) { return new SoundtrackAlbum.SoundtrackAlbumThingBuilder(); }
    if ("DrugCost".equals(type)) { return new DrugCost.DrugCostThingBuilder(); }
    if ("Appearance".equals(type)) { return new Appearance.AppearanceThingBuilder(); }
    if ("Ligament".equals(type)) { return new Ligament.LigamentThingBuilder(); }
    if ("LodgingBusiness".equals(type)) { return new LodgingBusiness.LodgingBusinessThingBuilder(); }
    if ("MusicAlbumProductionType".equals(type)) { return new MusicAlbumProductionType.MusicAlbumProductionTypeThingBuilder(); }
    if ("NoninvasiveProcedure".equals(type)) { return new NoninvasiveProcedure.NoninvasiveProcedureThingBuilder(); }
    if ("Geriatric".equals(type)) { return new Geriatric.GeriatricThingBuilder(); }
    if ("Emergency".equals(type)) { return new Emergency.EmergencyThingBuilder(); }
    if ("DiscoverAction".equals(type)) { return new DiscoverAction.DiscoverActionThingBuilder(); }
    if ("Gynecologic".equals(type)) { return new Gynecologic.GynecologicThingBuilder(); }
    if ("SportsEvent".equals(type)) { return new SportsEvent.SportsEventThingBuilder(); }
    if ("Radiograpy".equals(type)) { return new Radiograpy.RadiograpyThingBuilder(); }
    if ("Courthouse".equals(type)) { return new Courthouse.CourthouseThingBuilder(); }
    if ("Recipe".equals(type)) { return new Recipe.RecipeThingBuilder(); }
    if ("ServiceChannel".equals(type)) { return new ServiceChannel.ServiceChannelThingBuilder(); }
    if ("LegislativeBuilding".equals(type)) { return new LegislativeBuilding.LegislativeBuildingThingBuilder(); }
    if ("SuperficialAnatomy".equals(type)) { return new SuperficialAnatomy.SuperficialAnatomyThingBuilder(); }
    if ("GamePlayMode".equals(type)) { return new GamePlayMode.GamePlayModeThingBuilder(); }
    if ("Rating".equals(type)) { return new Rating.RatingThingBuilder(); }
    if ("MovingCompany".equals(type)) { return new MovingCompany.MovingCompanyThingBuilder(); }
    if ("StackExchange".equals(type)) { return new StackExchange.StackExchangeThingBuilder(); }
    if ("MedicalGuideline".equals(type)) { return new MedicalGuideline.MedicalGuidelineThingBuilder(); }
    if ("MedicalSymptom".equals(type)) { return new MedicalSymptom.MedicalSymptomThingBuilder(); }
    if ("PetStore".equals(type)) { return new PetStore.PetStoreThingBuilder(); }
    if ("HomeAndConstructionBusiness".equals(type)) { return new HomeAndConstructionBusiness.HomeAndConstructionBusinessThingBuilder(); }
    if ("ReplyAction".equals(type)) { return new ReplyAction.ReplyActionThingBuilder(); }
    if ("QuantitativeValue".equals(type)) { return new QuantitativeValue.QuantitativeValueThingBuilder(); }
    if ("MedicalImagingTechnique".equals(type)) { return new MedicalImagingTechnique.MedicalImagingTechniqueThingBuilder(); }
    if ("PerformAction".equals(type)) { return new PerformAction.PerformActionThingBuilder(); }
    if ("TheaterEvent".equals(type)) { return new TheaterEvent.TheaterEventThingBuilder(); }
    if ("Canal".equals(type)) { return new Canal.CanalThingBuilder(); }
    if ("MedicalEnumeration".equals(type)) { return new MedicalEnumeration.MedicalEnumerationThingBuilder(); }
    if ("Energy".equals(type)) { return new Energy.EnergyThingBuilder(); }
    if ("Blog".equals(type)) { return new Blog.BlogThingBuilder(); }
    if ("Sculpture".equals(type)) { return new Sculpture.SculptureThingBuilder(); }
    if ("BusinessEntityType".equals(type)) { return new BusinessEntityType.BusinessEntityTypeThingBuilder(); }
    if ("EventVenue".equals(type)) { return new EventVenue.EventVenueThingBuilder(); }
    if ("ArriveAction".equals(type)) { return new ArriveAction.ArriveActionThingBuilder(); }
    if ("MedicalCondition".equals(type)) { return new MedicalCondition.MedicalConditionThingBuilder(); }
    if ("SubwayStation".equals(type)) { return new SubwayStation.SubwayStationThingBuilder(); }
    if ("MedicalGuidelineRecommendation".equals(type)) { return new MedicalGuidelineRecommendation.MedicalGuidelineRecommendationThingBuilder(); }
    if ("RiverBodyOfWater".equals(type)) { return new RiverBodyOfWater.RiverBodyOfWaterThingBuilder(); }
    if ("Otolaryngologic".equals(type)) { return new Otolaryngologic.OtolaryngologicThingBuilder(); }
    if ("Question".equals(type)) { return new Question.QuestionThingBuilder(); }
    if ("PhysicalActivityCategory".equals(type)) { return new PhysicalActivityCategory.PhysicalActivityCategoryThingBuilder(); }
    if ("RsvpAction".equals(type)) { return new RsvpAction.RsvpActionThingBuilder(); }
    if ("CommunityHealth".equals(type)) { return new CommunityHealth.CommunityHealthThingBuilder(); }
    if ("EducationalAudience".equals(type)) { return new EducationalAudience.EducationalAudienceThingBuilder(); }
    if ("AutoDealer".equals(type)) { return new AutoDealer.AutoDealerThingBuilder(); }
    if ("DVDFormat".equals(type)) { return new DVDFormat.DVDFormatThingBuilder(); }
    if ("MedicalScholarlyArticle".equals(type)) { return new MedicalScholarlyArticle.MedicalScholarlyArticleThingBuilder(); }
    if ("CardiovascularExam".equals(type)) { return new CardiovascularExam.CardiovascularExamThingBuilder(); }
    if ("VehicleSpecialUsage".equals(type)) { return new VehicleSpecialUsage.VehicleSpecialUsageThingBuilder(); }
    if ("Table".equals(type)) { return new Table.TableThingBuilder(); }
    if ("InteractAction".equals(type)) { return new InteractAction.InteractActionThingBuilder(); }
    if ("TireShop".equals(type)) { return new TireShop.TireShopThingBuilder(); }
    if ("CityHall".equals(type)) { return new CityHall.CityHallThingBuilder(); }
    if ("MovieSeries".equals(type)) { return new MovieSeries.MovieSeriesThingBuilder(); }
    if ("AccountingService".equals(type)) { return new AccountingService.AccountingServiceThingBuilder(); }
    if ("LimitedAvailability".equals(type)) { return new LimitedAvailability.LimitedAvailabilityThingBuilder(); }
    if ("DietarySupplement".equals(type)) { return new DietarySupplement.DietarySupplementThingBuilder(); }
    if ("OccupationalActivity".equals(type)) { return new OccupationalActivity.OccupationalActivityThingBuilder(); }
    if ("DeliveryChargeSpecification".equals(type)) { return new DeliveryChargeSpecification.DeliveryChargeSpecificationThingBuilder(); }
    if ("SaleEvent".equals(type)) { return new SaleEvent.SaleEventThingBuilder(); }
    if ("MedicalRiskFactor".equals(type)) { return new MedicalRiskFactor.MedicalRiskFactorThingBuilder(); }
    if ("ReceiveAction".equals(type)) { return new ReceiveAction.ReceiveActionThingBuilder(); }
    if ("PlanAction".equals(type)) { return new PlanAction.PlanActionThingBuilder(); }
    if ("PET".equals(type)) { return new PET.PETThingBuilder(); }
    if ("Neuro".equals(type)) { return new Neuro.NeuroThingBuilder(); }
    if ("Church".equals(type)) { return new Church.ChurchThingBuilder(); }
    if ("MusicStore".equals(type)) { return new MusicStore.MusicStoreThingBuilder(); }
    if ("AchieveAction".equals(type)) { return new AchieveAction.AchieveActionThingBuilder(); }
    if ("Wholesale".equals(type)) { return new Wholesale.WholesaleThingBuilder(); }
    if ("FrontWheelDriveConfiguration".equals(type)) { return new FrontWheelDriveConfiguration.FrontWheelDriveConfigurationThingBuilder(); }
    if ("ComedyClub".equals(type)) { return new ComedyClub.ComedyClubThingBuilder(); }
    if ("Optician".equals(type)) { return new Optician.OpticianThingBuilder(); }
    if ("GoodRelationsProperties".equals(type)) { return new GoodRelationsProperties.GoodRelationsPropertiesThingBuilder(); }
    if ("MusicComposition".equals(type)) { return new MusicComposition.MusicCompositionThingBuilder(); }
    if ("GiveAction".equals(type)) { return new GiveAction.GiveActionThingBuilder(); }
    if ("Lung".equals(type)) { return new Lung.LungThingBuilder(); }
    if ("GoodRelationsClass".equals(type)) { return new GoodRelationsClass.GoodRelationsClassThingBuilder(); }
    if ("Playground".equals(type)) { return new Playground.PlaygroundThingBuilder(); }
    if ("ExercisePlan".equals(type)) { return new ExercisePlan.ExercisePlanThingBuilder(); }
    if ("ParcelDelivery".equals(type)) { return new ParcelDelivery.ParcelDeliveryThingBuilder(); }
    if ("PrimaryCare".equals(type)) { return new PrimaryCare.PrimaryCareThingBuilder(); }
    if ("ReservationPending".equals(type)) { return new ReservationPending.ReservationPendingThingBuilder(); }
    if ("Protozoa".equals(type)) { return new Protozoa.ProtozoaThingBuilder(); }
    if ("AllWheelDriveConfiguration".equals(type)) { return new AllWheelDriveConfiguration.AllWheelDriveConfigurationThingBuilder(); }
    if ("MedicalConditionStage".equals(type)) { return new MedicalConditionStage.MedicalConditionStageThingBuilder(); }
    if ("PublicHealth".equals(type)) { return new PublicHealth.PublicHealthThingBuilder(); }
    if ("OfferItemCondition".equals(type)) { return new OfferItemCondition.OfferItemConditionThingBuilder(); }
    if ("TransferAction".equals(type)) { return new TransferAction.TransferActionThingBuilder(); }
    if ("ComedyEvent".equals(type)) { return new ComedyEvent.ComedyEventThingBuilder(); }
    if ("HVACBusiness".equals(type)) { return new HVACBusiness.HVACBusinessThingBuilder(); }
    if ("City".equals(type)) { return new City.CityThingBuilder(); }
    if ("Suspended".equals(type)) { return new Suspended.SuspendedThingBuilder(); }
    if ("SingleFamilyResidence".equals(type)) { return new SingleFamilyResidence.SingleFamilyResidenceThingBuilder(); }
    if ("MedicalDevicePurpose".equals(type)) { return new MedicalDevicePurpose.MedicalDevicePurposeThingBuilder(); }
    if ("Review".equals(type)) { return new Review.ReviewThingBuilder(); }
    if ("MusculoskeletalExam".equals(type)) { return new MusculoskeletalExam.MusculoskeletalExamThingBuilder(); }
    if ("MotorcycleDealer".equals(type)) { return new MotorcycleDealer.MotorcycleDealerThingBuilder(); }
    if ("VideoGame".equals(type)) { return new VideoGame.VideoGameThingBuilder(); }
    if ("WarrantyPromise".equals(type)) { return new WarrantyPromise.WarrantyPromiseThingBuilder(); }
    if ("LaboratoryScience".equals(type)) { return new LaboratoryScience.LaboratoryScienceThingBuilder(); }
    if ("RadioSeries".equals(type)) { return new RadioSeries.RadioSeriesThingBuilder(); }
    if ("CreditCard".equals(type)) { return new CreditCard.CreditCardThingBuilder(); }
    return null;
  }

  @NotNull public static String writeJson(@NotNull Thing thing) throws JsonProcessingException {
    return new ObjectMapper().writeValueAsString(thing);
  }
  public static Thing readJson(String json) throws java.io.IOException {
    final ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JsonLdModule());
    return objectMapper.readValue(json, Thing.class);
  }
}
