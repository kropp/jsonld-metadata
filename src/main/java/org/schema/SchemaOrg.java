/*
 * Copyright 2015-2017 JetBrains s.r.o.
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

import java.util.HashMap;

public class SchemaOrg {
  /**
   * A college, university, or other third-level educational institution.
   */
  @NotNull public static CollegeOrUniversity.Builder collegeOrUniversity() { return new CollegeOrUniversity.Builder(new HashMap<String,Object>()); }
  /**
   * The act of authoring written creative content.
   */
  @NotNull public static WriteAction.Builder writeAction() { return new WriteAction.Builder(new HashMap<String,Object>()); }
  /**
   * A property of an issue
   */
  @NotNull public static IssueField.Builder issueField() { return new IssueField.Builder(new HashMap<String,Object>()); }
  /**
   * All-wheel Drive is a transmission layout where the engine drives all four wheels.
   */
  @NotNull public static AllWheelDriveConfiguration.Builder allWheelDriveConfiguration() { return new AllWheelDriveConfiguration.Builder(new HashMap<String,Object>()); }
  /**
   * A dentist.
   */
  @NotNull public static Dentist.Builder dentist() { return new Dentist.Builder(new HashMap<String,Object>()); }
  /**
   * A bus stop.
   */
  @NotNull public static BusStop.Builder busStop() { return new BusStop.Builder(new HashMap<String,Object>()); }
  /**
   * The act of asserting that a future event/action is no longer going to happen.\n\nRelated actions:\n\n* [[ConfirmAction]]: The antonym of CancelAction.
   */
  @NotNull public static CancelAction.Builder cancelAction() { return new CancelAction.Builder(new HashMap<String,Object>()); }
  /**
   * A file composed primarily of text.
   */
  @NotNull public static TextDigitalDocument.Builder textDigitalDocument() { return new TextDigitalDocument.Builder(new HashMap<String,Object>()); }
  /**
   * A sub-grouping of food or drink items in a menu. E.g. courses (such as 'Dinner', 'Breakfast', etc.), specific type of dishes (such as 'Meat', 'Vegan', 'Drinks', etc.), or some other classification made by the menu provider.
   */
  @NotNull public static MenuSection.Builder menuSection() { return new MenuSection.Builder(new HashMap<String,Object>()); }
  /**
   * The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another.
   */
  @NotNull public static TransferAction.Builder transferAction() { return new TransferAction.Builder(new HashMap<String,Object>()); }
  /**
   * A computer store.
   */
  @NotNull public static ComputerStore.Builder computerStore() { return new ComputerStore.Builder(new HashMap<String,Object>()); }
  /**
   * A camping pitch is an individual place for overnight stay in the outdoors, typically being part of a larger camping site.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static CampingPitch.Builder campingPitch() { return new CampingPitch.Builder(new HashMap<String,Object>()); }
  /**
   * A short TV program or a segment/part of a TV program.
   */
  @NotNull public static TVClip.Builder tVClip() { return new TVClip.Builder(new HashMap<String,Object>()); }
  /**
   * A garden store.
   */
  @NotNull public static GardenStore.Builder gardenStore() { return new GardenStore.Builder(new HashMap<String,Object>()); }
  /**
   * A resort is a place used for relaxation or recreation, attracting visitors for holidays or vacations. Resorts are places, towns or sometimes commercial establishment operated by a single company (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Resort">http://en.wikipedia.org/wiki/Resort</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.
    
   */
  @NotNull public static Resort.Builder resort() { return new Resort.Builder(new HashMap<String,Object>()); }
  /**
   * The act of dressing oneself in clothing.
   */
  @NotNull public static WearAction.Builder wearAction() { return new WearAction.Builder(new HashMap<String,Object>()); }
  /**
   * A fact-checking review of claims made (or reported) in some creative work (referenced via itemReviewed).
   */
  @NotNull public static ClaimReview.Builder claimReview() { return new ClaimReview.Builder(new HashMap<String,Object>()); }
  /**
   * A comedy club.
   */
  @NotNull public static ComedyClub.Builder comedyClub() { return new ComedyClub.Builder(new HashMap<String,Object>()); }
  /**
   * The most generic kind of creative work, including books, movies, photographs, software programs, etc.
   */
  @NotNull public static CreativeWork.Builder creativeWork() { return new CreativeWork.Builder(new HashMap<String,Object>()); }
  /**
   * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.
   */
  @NotNull public static Demand.Builder demand() { return new Demand.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Image gallery page.
   */
  @NotNull public static ImageGallery.Builder imageGallery() { return new ImageGallery.Builder(new HashMap<String,Object>()); }
  /**
   * The act of adding at a specific location in an ordered collection.
   */
  @NotNull public static InsertAction.Builder insertAction() { return new InsertAction.Builder(new HashMap<String,Object>()); }
  /**
   * A video game series.
   */
  @NotNull public static VideoGameSeries.Builder videoGameSeries() { return new VideoGameSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A home goods store.
   */
  @NotNull public static HomeGoodsStore.Builder homeGoodsStore() { return new HomeGoodsStore.Builder(new HashMap<String,Object>()); }
  /**
   * A mosque.
   */
  @NotNull public static Mosque.Builder mosque() { return new Mosque.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value providing information about the opening hours of a place or a certain service inside a place.\n\n
The place is __open__ if the [[opens]] property is specified, and __closed__ otherwise.\n\nIf the value for the [[closes]] property is less than the value for the [[opens]] property then the hour range is assumed to span over the next day.
      
   */
  @NotNull public static OpeningHoursSpecification.Builder openingHoursSpecification() { return new OpeningHoursSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A church.
   */
  @NotNull public static Church.Builder church() { return new Church.Builder(new HashMap<String,Object>()); }
  /**
   * A painting.
   */
  @NotNull public static Painting.Builder painting() { return new Painting.Builder(new HashMap<String,Object>()); }
  /**
   * A car is a wheeled, self-powered motor vehicle used for transportation.
   */
  @NotNull public static Car.Builder car() { return new Car.Builder(new HashMap<String,Object>()); }
  /**
   * A post office.
   */
  @NotNull public static PostOffice.Builder postOffice() { return new PostOffice.Builder(new HashMap<String,Object>()); }
  /**
   * The act of participating in exertive activity for the purposes of improving health and fitness.
   */
  @NotNull public static ExerciseAction.Builder exerciseAction() { return new ExerciseAction.Builder(new HashMap<String,Object>()); }
  /**
   * A volcano, like Fuji san.
   */
  @NotNull public static Volcano.Builder volcano() { return new Volcano.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Collection page.
   */
  @NotNull public static CollectionPage.Builder collectionPage() { return new CollectionPage.Builder(new HashMap<String,Object>()); }
  /**
   * A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs.
   */
  @NotNull public static WebSite.Builder webSite() { return new WebSite.Builder(new HashMap<String,Object>()); }
  /**
   * An agent inspects, determines, investigates, inquires, or examines an object's accuracy, quality, condition, or state.
   */
  @NotNull public static CheckAction.Builder checkAction() { return new CheckAction.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for an event like a concert, sporting event, or lecture.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
   */
  @NotNull public static EventReservation.Builder eventReservation() { return new EventReservation.Builder(new HashMap<String,Object>()); }
  /**
   * The geographic coordinates of a place or event.
   */
  @NotNull public static GeoCoordinates.Builder geoCoordinates() { return new GeoCoordinates.Builder(new HashMap<String,Object>()); }
  /**
   * An Insurance agency.
   */
  @NotNull public static InsuranceAgency.Builder insuranceAgency() { return new InsuranceAgency.Builder(new HashMap<String,Object>()); }
  /**
   * A permission for a particular person or group to access a particular file.
   */
  @NotNull public static DigitalDocumentPermission.Builder digitalDocumentPermission() { return new DigitalDocumentPermission.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  @NotNull public static UserDownloads.Builder userDownloads() { return new UserDownloads.Builder(new HashMap<String,Object>()); }
  /**
   * One of the continents (for example, Europe or Africa).
   */
  @NotNull public static Continent.Builder continent() { return new Continent.Builder(new HashMap<String,Object>()); }
  /**
   * A PublicationEvent corresponds indifferently to the event of publication for a CreativeWork of any type e.g. a broadcast event, an on-demand event, a book/journal publication via a variety of delivery media.
   */
  @NotNull public static PublicationEvent.Builder publicationEvent() { return new PublicationEvent.Builder(new HashMap<String,Object>()); }
  /**
   * The footer section of the page.
   */
  @NotNull public static WPFooter.Builder wPFooter() { return new WPFooter.Builder(new HashMap<String,Object>()); }
  /**
   * One or more messages between organizations or people on a particular topic. Individual messages can be linked to the conversation with isPartOf or hasPart properties.
   */
  @NotNull public static Conversation.Builder conversation() { return new Conversation.Builder(new HashMap<String,Object>()); }
  /**
   * This type covers computer programming languages such as Scheme and Lisp, as well as other language-like computer representations. Natural languages are best represented with the [[Language]] type.
   */
  @NotNull public static ComputerLanguage.Builder computerLanguage() { return new ComputerLanguage.Builder(new HashMap<String,Object>()); }
  /**
   * A collection of music tracks in playlist form.
   */
  @NotNull public static MusicPlaylist.Builder musicPlaylist() { return new MusicPlaylist.Builder(new HashMap<String,Object>()); }
  /**
   * A car rental business.
   */
  @NotNull public static AutoRental.Builder autoRental() { return new AutoRental.Builder(new HashMap<String,Object>()); }
  /**
   * A blog post.
   */
  @NotNull public static BlogPosting.Builder blogPosting() { return new BlogPosting.Builder(new HashMap<String,Object>()); }
  /**
   * Financial services business.
   */
  @NotNull public static FinancialService.Builder financialService() { return new FinancialService.Builder(new HashMap<String,Object>()); }
  /**
   * The act of inserting at the beginning if an ordered collection.
   */
  @NotNull public static PrependAction.Builder prependAction() { return new PrependAction.Builder(new HashMap<String,Object>()); }
  /**
   * A police station.
   */
  @NotNull public static PoliceStation.Builder policeStation() { return new PoliceStation.Builder(new HashMap<String,Object>()); }
  /**
   * A shopping center or mall.
   */
  @NotNull public static ShoppingCenter.Builder shoppingCenter() { return new ShoppingCenter.Builder(new HashMap<String,Object>()); }
  /**
   * Represents additional information about a relationship or property. For example a Role can be used to say that a 'member' role linking some SportsTeam to a player occurred during a particular time period. Or that a Person's 'actor' role in a Movie was for some particular characterName. Such properties can be attached to a Role entity, which is then associated with the main entities using ordinary properties like 'member' or 'actor'.\n\nSee also [blog post](http://blog.schema.org/2014/06/introducing-role.html).
   */
  @NotNull public static Role.Builder role() { return new Role.Builder(new HashMap<String,Object>()); }
  /**
   * A museum.
   */
  @NotNull public static Museum.Builder museum() { return new Museum.Builder(new HashMap<String,Object>()); }
  /**
   * A movie.
   */
  @NotNull public static Movie.Builder movie() { return new Movie.Builder(new HashMap<String,Object>()); }
  /**
   * The act of rejecting to/adopting an object.\n\nRelated actions:\n\n* [[AcceptAction]]: The antonym of RejectAction.
   */
  @NotNull public static RejectAction.Builder rejectAction() { return new RejectAction.Builder(new HashMap<String,Object>()); }
  /**
   * An entity holding detailed information about the available bed types, e.g. the quantity of twin beds for a hotel room. For the single case of just one bed of a certain type, you can use bed directly with a text. See also [[BedType]] (under development).
   */
  @NotNull public static BedDetails.Builder bedDetails() { return new BedDetails.Builder(new HashMap<String,Object>()); }
  /**
   * A clothing store.
   */
  @NotNull public static ClothingStore.Builder clothingStore() { return new ClothingStore.Builder(new HashMap<String,Object>()); }
  /**
   * A theater group or company, for example, the Royal Shakespeare Company or Druid Theatre.
   */
  @NotNull public static TheaterGroup.Builder theaterGroup() { return new TheaterGroup.Builder(new HashMap<String,Object>()); }
  /**
   * The steering position is on the left side of the vehicle (viewed from the main direction of driving).
   */
  @NotNull public static LeftHandDriving.Builder leftHandDriving() { return new LeftHandDriving.Builder(new HashMap<String,Object>()); }
  /**
   * A public swimming pool.
   */
  @NotNull public static PublicSwimmingPool.Builder publicSwimmingPool() { return new PublicSwimmingPool.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for a taxi.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
   */
  @NotNull public static TaxiReservation.Builder taxiReservation() { return new TaxiReservation.Builder(new HashMap<String,Object>()); }
  /**
   * The act of returning to the origin that which was previously received (concrete objects) or taken (ownership).
   */
  @NotNull public static ReturnAction.Builder returnAction() { return new ReturnAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of managing by changing/editing the state of the object.
   */
  @NotNull public static UpdateAction.Builder updateAction() { return new UpdateAction.Builder(new HashMap<String,Object>()); }
  /**
   * A men's clothing store.
   */
  @NotNull public static MensClothingStore.Builder mensClothingStore() { return new MensClothingStore.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Food event.
   */
  @NotNull public static FoodEvent.Builder foodEvent() { return new FoodEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time. __Note:__ This type has been superseded by [[MonetaryAmount]] use of that type is recommended
   */
  @NotNull public static DatedMoneySpecification.Builder datedMoneySpecification() { return new DatedMoneySpecification.Builder(new HashMap<String,Object>()); }
  /**
   * The act of ingesting information/resources/food.
   */
  @NotNull public static ConsumeAction.Builder consumeAction() { return new ConsumeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A movie rental store.
   */
  @NotNull public static MovieRentalStore.Builder movieRentalStore() { return new MovieRentalStore.Builder(new HashMap<String,Object>()); }
  /**
   * An image of a visual machine-readable code such as a barcode or QR code.
   */
  @NotNull public static Barcode.Builder barcode() { return new Barcode.Builder(new HashMap<String,Object>()); }
  /**
   * A hair salon.
   */
  @NotNull public static HairSalon.Builder hairSalon() { return new HairSalon.Builder(new HashMap<String,Object>()); }
  /**
   * A room is a distinguishable space within a structure, usually separated from other spaces by interior walls. (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Room">http://en.wikipedia.org/wiki/Room</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static Room.Builder room() { return new Room.Builder(new HashMap<String,Object>()); }
  /**
   * A cafe or coffee shop.
   */
  @NotNull public static CafeOrCoffeeShop.Builder cafeOrCoffeeShop() { return new CafeOrCoffeeShop.Builder(new HashMap<String,Object>()); }
  /**
   * This term [uses](http://blog.schema.org/2012/11/good-relations-and-schemaorg.html) terminology from the GoodRelations Vocabulary for E-Commerce, created by Martin Hepp. GoodRelations is a data model for sharing e-commerce data on the Web. More information about GoodRelations can be found at [http://purl.org/goodrelations/](http://purl.org/goodrelations/).
   */
  @NotNull public static GoodRelationsTerms.Builder goodRelationsTerms() { return new GoodRelationsTerms.Builder(new HashMap<String,Object>()); }
  /**
   * This element is based on the work of the Automotive Ontology Working Group, see [www.automotive-ontology.org](http://www.automotive-ontology.org) for details. Many class and property definitions are inspired by or based on abstracts from Wikipedia, the free encyclopedia.
   */
  @NotNull public static AutomotiveOntologyWGClass.Builder automotiveOntologyWGClass() { return new AutomotiveOntologyWGClass.Builder(new HashMap<String,Object>()); }
  /**
   * This vocabulary was improved through collaboration with the MusicBrainz project
    ([www.musicbrainz.org](http://www.musicbrainz.org)), and is partially inspired by the MusicBrainz and
    [Music Ontology](http://musicontology.com/docs/getting-started.html) schemas.
   */
  @NotNull public static MBZ.Builder mBZ() { return new MBZ.Builder(new HashMap<String,Object>()); }
  /**
   * The act of consuming static visual content.
   */
  @NotNull public static ViewAction.Builder viewAction() { return new ViewAction.Builder(new HashMap<String,Object>()); }
  /**
   * A summary of how users have interacted with this CreativeWork. In most cases, authors will use a subtype to specify the specific type of interaction.
   */
  @NotNull public static InteractionCounter.Builder interactionCounter() { return new InteractionCounter.Builder(new HashMap<String,Object>()); }
  /**
   * A subclass of Role used to describe roles within organizations.
   */
  @NotNull public static OrganizationRole.Builder organizationRole() { return new OrganizationRole.Builder(new HashMap<String,Object>()); }
  /**
   * The act of interacting with another person or organization.
   */
  @NotNull public static InteractAction.Builder interactAction() { return new InteractAction.Builder(new HashMap<String,Object>()); }
  /**
   * Single entity in issue tracker (e.g. bug or feature)
   */
  @NotNull public static Issue.Builder issue() { return new Issue.Builder(new HashMap<String,Object>()); }
  /**
   * A house painting service.
   */
  @NotNull public static HousePainter.Builder housePainter() { return new HousePainter.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for train travel.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
   */
  @NotNull public static TrainReservation.Builder trainReservation() { return new TrainReservation.Builder(new HashMap<String,Object>()); }
  /**
   * A subway station.
   */
  @NotNull public static SubwayStation.Builder subwayStation() { return new SubwayStation.Builder(new HashMap<String,Object>()); }
  /**
   * A product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies which comprise the financial services industry.
   */
  @NotNull public static FinancialProduct.Builder financialProduct() { return new FinancialProduct.Builder(new HashMap<String,Object>()); }
  /**
   * A blog.
   */
  @NotNull public static Blog.Builder blog() { return new Blog.Builder(new HashMap<String,Object>()); }
  /**
   * A gym.
   */
  @NotNull public static ExerciseGym.Builder exerciseGym() { return new ExerciseGym.Builder(new HashMap<String,Object>()); }
  /**
   * A city hall.
   */
  @NotNull public static CityHall.Builder cityHall() { return new CityHall.Builder(new HashMap<String,Object>()); }
  /**
   *  A point value or interval for product characteristics and other purposes.
   */
  @NotNull public static QuantitativeValue.Builder quantitativeValue() { return new QuantitativeValue.Builder(new HashMap<String,Object>()); }
  /**
   * The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.
   */
  @NotNull public static CommunicateAction.Builder communicateAction() { return new CommunicateAction.Builder(new HashMap<String,Object>()); }
  /**
   * An apartment (in American English) or flat (in British English) is a self-contained housing unit (a type of residential real estate) that occupies only part of a building (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Apartment">http://en.wikipedia.org/wiki/Apartment</a>).
   */
  @NotNull public static Apartment.Builder apartment() { return new Apartment.Builder(new HashMap<String,Object>()); }
  /**
   * An employment agency.
   */
  @NotNull public static EmploymentAgency.Builder employmentAgency() { return new EmploymentAgency.Builder(new HashMap<String,Object>()); }
  /**
   * The act of un-registering from a service.\n\nRelated actions:\n\n* [[RegisterAction]]: antonym of UnRegisterAction.\n* [[Leave]]: Unlike LeaveAction, UnRegisterAction implies that you are unregistering from a service you werer previously registered, rather than leaving a team/group of people.
   */
  @NotNull public static UnRegisterAction.Builder unRegisterAction() { return new UnRegisterAction.Builder(new HashMap<String,Object>()); }
  /**
   * A statement of the money due for goods or services; a bill.
   */
  @NotNull public static Invoice.Builder invoice() { return new Invoice.Builder(new HashMap<String,Object>()); }
  /**
   * A collection of music tracks.
   */
  @NotNull public static MusicAlbum.Builder musicAlbum() { return new MusicAlbum.Builder(new HashMap<String,Object>()); }
  /**
   * A Buddhist temple.
   */
  @NotNull public static BuddhistTemple.Builder buddhistTemple() { return new BuddhistTemple.Builder(new HashMap<String,Object>()); }
  /**
   * A furniture store.
   */
  @NotNull public static FurnitureStore.Builder furnitureStore() { return new FurnitureStore.Builder(new HashMap<String,Object>()); }
  /**
   * The act of producing a balanced opinion about the object for an audience. An agent reviews an object with participants resulting in a review.
   */
  @NotNull public static ReviewAction.Builder reviewAction() { return new ReviewAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of giving money in return for temporary use, but not ownership, of an object such as a vehicle or property. For example, an agent rents a property from a landlord in exchange for a periodic payment.
   */
  @NotNull public static RentAction.Builder rentAction() { return new RentAction.Builder(new HashMap<String,Object>()); }
  /**
   * Car repair business.
   */
  @NotNull public static AutoRepair.Builder autoRepair() { return new AutoRepair.Builder(new HashMap<String,Object>()); }
  /**
   * A river (for example, the broad majestic Shannon).
   */
  @NotNull public static RiverBodyOfWater.Builder riverBodyOfWater() { return new RiverBodyOfWater.Builder(new HashMap<String,Object>()); }
  /**
   * The act of momentarily pausing a device or application (e.g. pause music playback or pause a timer).
   */
  @NotNull public static SuspendAction.Builder suspendAction() { return new SuspendAction.Builder(new HashMap<String,Object>()); }
  /**
   * A medical organization (physical or not), such as hospital, institution or clinic.
   */
  @NotNull public static MedicalOrganization.Builder medicalOrganization() { return new MedicalOrganization.Builder(new HashMap<String,Object>()); }
  /**
   * A means for accessing a service, e.g. a government office location, web site, or phone number.
   */
  @NotNull public static ServiceChannel.Builder serviceChannel() { return new ServiceChannel.Builder(new HashMap<String,Object>()); }
  /**
   * The act of taking money from a buyer in exchange for goods or services rendered. An agent sells an object, product, or service to a buyer for a price. Reciprocal of BuyAction.
   */
  @NotNull public static SellAction.Builder sellAction() { return new SellAction.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  @NotNull public static UserPlays.Builder userPlays() { return new UserPlays.Builder(new HashMap<String,Object>()); }
  /**
   * A wholesale store.
   */
  @NotNull public static WholesaleStore.Builder wholesaleStore() { return new WholesaleStore.Builder(new HashMap<String,Object>()); }
  /**
   * A permit issued by a government agency.
   */
  @NotNull public static GovernmentPermit.Builder governmentPermit() { return new GovernmentPermit.Builder(new HashMap<String,Object>()); }
  /**
   * A recycling center.
   */
  @NotNull public static RecyclingCenter.Builder recyclingCenter() { return new RecyclingCenter.Builder(new HashMap<String,Object>()); }
  /**
   * A fast-food restaurant.
   */
  @NotNull public static FastFoodRestaurant.Builder fastFoodRestaurant() { return new FastFoodRestaurant.Builder(new HashMap<String,Object>()); }
  /**
   * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
   */
  @NotNull public static SoftwareSourceCode.Builder softwareSourceCode() { return new SoftwareSourceCode.Builder(new HashMap<String,Object>()); }
  /**
   * A hospital.
   */
  @NotNull public static Hospital.Builder hospital() { return new Hospital.Builder(new HashMap<String,Object>()); }
  /**
   * A single, identifiable product instance (e.g. a laptop with a particular serial number).
   */
  @NotNull public static IndividualProduct.Builder individualProduct() { return new IndividualProduct.Builder(new HashMap<String,Object>()); }
  /**
   * Season dedicated to radio broadcast and associated online delivery.
   */
  @NotNull public static RadioSeason.Builder radioSeason() { return new RadioSeason.Builder(new HashMap<String,Object>()); }
  /**
   * A television station.
   */
  @NotNull public static TelevisionStation.Builder televisionStation() { return new TelevisionStation.Builder(new HashMap<String,Object>()); }
  /**
   * A waterfall, like Niagara.
   */
  @NotNull public static Waterfall.Builder waterfall() { return new Waterfall.Builder(new HashMap<String,Object>()); }
  /**
   * A delivery service through which content is provided via broadcast over the air or online.
   */
  @NotNull public static BroadcastService.Builder broadcastService() { return new BroadcastService.Builder(new HashMap<String,Object>()); }
  /**
   * The act of an agent communicating (service provider, social media, etc) their arrival by registering/confirming for a previously reserved service (e.g. flight check in) or at a place (e.g. hotel), possibly resulting in a result (boarding pass, etc).\n\nRelated actions:\n\n* [[CheckOutAction]]: The antonym of CheckInAction.\n* [[ArriveAction]]: Unlike ArriveAction, CheckInAction implies that the agent is informing/confirming the start of a previously reserved service.\n* [[ConfirmAction]]: Unlike ConfirmAction, CheckInAction implies that the agent is informing/confirming the *start* of a previously reserved service rather than its validity/existence.
   */
  @NotNull public static CheckInAction.Builder checkInAction() { return new CheckInAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of marrying a person.
   */
  @NotNull public static MarryAction.Builder marryAction() { return new MarryAction.Builder(new HashMap<String,Object>()); }
  /**
   * A graveyard.
   */
  @NotNull public static Cemetery.Builder cemetery() { return new Cemetery.Builder(new HashMap<String,Object>()); }
  /**
   * A performance group, such as a band, an orchestra, or a circus.
   */
  @NotNull public static PerformingGroup.Builder performingGroup() { return new PerformingGroup.Builder(new HashMap<String,Object>()); }
  /**
   * A piece of sculpture.
   */
  @NotNull public static Sculpture.Builder sculpture() { return new Sculpture.Builder(new HashMap<String,Object>()); }
  /**
   * The act of deliberately creating/producing/generating/building a result out of the agent.
   */
  @NotNull public static CreateAction.Builder createAction() { return new CreateAction.Builder(new HashMap<String,Object>()); }
  /**
   * A file containing a note, primarily for the author.
   */
  @NotNull public static NoteDigitalDocument.Builder noteDigitalDocument() { return new NoteDigitalDocument.Builder(new HashMap<String,Object>()); }
  /**
   * A geographical region, typically under the jurisdiction of a particular government.
   */
  @NotNull public static AdministrativeArea.Builder administrativeArea() { return new AdministrativeArea.Builder(new HashMap<String,Object>()); }
  /**
   * A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.\n\n Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.
    
   */
  @NotNull public static PropertyValue.Builder propertyValue() { return new PropertyValue.Builder(new HashMap<String,Object>()); }
  /**
   * A publication in any medium issued in successive parts bearing numerical or chronological designations and intended, such as a magazine, scholarly journal, or newspaper to continue indefinitely.\n\nSee also [blog post](http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html).
   */
  @NotNull public static Periodical.Builder periodical() { return new Periodical.Builder(new HashMap<String,Object>()); }
  /**
   * Four-wheel drive is a transmission layout where the engine primarily drives two wheels with a part-time four-wheel drive capability.
   */
  @NotNull public static FourWheelDriveConfiguration.Builder fourWheelDriveConfiguration() { return new FourWheelDriveConfiguration.Builder(new HashMap<String,Object>()); }
  /**
   * An agent approves/certifies/likes/supports/sanction an object.
   */
  @NotNull public static EndorseAction.Builder endorseAction() { return new EndorseAction.Builder(new HashMap<String,Object>()); }
  /**
   * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
   */
  @NotNull public static Rating.Builder rating() { return new Rating.Builder(new HashMap<String,Object>()); }
  /**
   * A lake (for example, Lake Pontrachain).
   */
  @NotNull public static LakeBodyOfWater.Builder lakeBodyOfWater() { return new LakeBodyOfWater.Builder(new HashMap<String,Object>()); }
  /**
   * A gas station.
   */
  @NotNull public static GasStation.Builder gasStation() { return new GasStation.Builder(new HashMap<String,Object>()); }
  /**
   * A government office&#x2014;for example, an IRS or DMV office.
   */
  @NotNull public static GovernmentOffice.Builder governmentOffice() { return new GovernmentOffice.Builder(new HashMap<String,Object>()); }
  /**
   * A lodging business, such as a motel, hotel, or inn.
   */
  @NotNull public static LodgingBusiness.Builder lodgingBusiness() { return new LodgingBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * A general contractor.
   */
  @NotNull public static GeneralContractor.Builder generalContractor() { return new GeneralContractor.Builder(new HashMap<String,Object>()); }
  /**
   * An art gallery.
   */
  @NotNull public static ArtGallery.Builder artGallery() { return new ArtGallery.Builder(new HashMap<String,Object>()); }
  /**
   * The act of downloading an object.
   */
  @NotNull public static DownloadAction.Builder downloadAction() { return new DownloadAction.Builder(new HashMap<String,Object>()); }
  /**
   * The delivery of a parcel either via the postal service or a commercial service.
   */
  @NotNull public static ParcelDelivery.Builder parcelDelivery() { return new ParcelDelivery.Builder(new HashMap<String,Object>()); }
  /**
   * Natural languages such as Spanish, Tamil, Hindi, English, etc. Formal language code tags expressed in [BCP 47](https://en.wikipedia.org/wiki/IETF_language_tag) can be used via the [[alternateName]] property. The Language type previously also covered programming languages such as Scheme and Lisp, which are now best represented using [[ComputerLanguage]].
   */
  @NotNull public static Language.Builder language() { return new Language.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Visual arts event.
   */
  @NotNull public static VisualArtsEvent.Builder visualArtsEvent() { return new VisualArtsEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A library.
   */
  @NotNull public static Library.Builder library() { return new Library.Builder(new HashMap<String,Object>()); }
  /**
   * An agent tracks an object for updates.\n\nRelated actions:\n\n* [[FollowAction]]: Unlike FollowAction, TrackAction refers to the interest on the location of innanimates objects.\n* [[SubscribeAction]]: Unlike SubscribeAction, TrackAction refers to  the interest on the location of innanimate objects.
   */
  @NotNull public static TrackAction.Builder trackAction() { return new TrackAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of an agent relocating to a place.\n\nRelated actions:\n\n* [[TransferAction]]: Unlike TransferAction, the subject of the move is a living Person or Organization rather than an inanimate object.
   */
  @NotNull public static MoveAction.Builder moveAction() { return new MoveAction.Builder(new HashMap<String,Object>()); }
  /**
   * Residence type: Apartment complex.
   */
  @NotNull public static ApartmentComplex.Builder apartmentComplex() { return new ApartmentComplex.Builder(new HashMap<String,Object>()); }
  /**
   * A locksmith.
   */
  @NotNull public static Locksmith.Builder locksmith() { return new Locksmith.Builder(new HashMap<String,Object>()); }
  /**
   * A unique instance of a television BroadcastService on a CableOrSatelliteService lineup.
   */
  @NotNull public static TelevisionChannel.Builder televisionChannel() { return new TelevisionChannel.Builder(new HashMap<String,Object>()); }
  /**
   * A QAPage is a WebPage focussed on a specific Question and its Answer(s), e.g. in a question answering site or documenting Frequently Asked Questions (FAQs).
   */
  @NotNull public static QAPage.Builder qAPage() { return new QAPage.Builder(new HashMap<String,Object>()); }
  /**
   * Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc.
   */
  @NotNull public static ProgramMembership.Builder programMembership() { return new ProgramMembership.Builder(new HashMap<String,Object>()); }
  /**
   * An agent controls a device or application.
   */
  @NotNull public static ControlAction.Builder controlAction() { return new ControlAction.Builder(new HashMap<String,Object>()); }
  /**
   * A mountain, like Mount Whitney or Mount Everest.
   */
  @NotNull public static Mountain.Builder mountain() { return new Mountain.Builder(new HashMap<String,Object>()); }
  /**
   * A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.

      <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
   */
  @NotNull public static PublicationVolume.Builder publicationVolume() { return new PublicationVolume.Builder(new HashMap<String,Object>()); }
  /**
   * A tire shop.
   */
  @NotNull public static TireShop.Builder tireShop() { return new TireShop.Builder(new HashMap<String,Object>()); }
  /**
   * An over the air or online broadcast event.
   */
  @NotNull public static BroadcastEvent.Builder broadcastEvent() { return new BroadcastEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A bar or pub.
   */
  @NotNull public static BarOrPub.Builder barOrPub() { return new BarOrPub.Builder(new HashMap<String,Object>()); }
  /**
   * A trip on a commercial bus line.
   */
  @NotNull public static BusTrip.Builder busTrip() { return new BusTrip.Builder(new HashMap<String,Object>()); }
  /**
   * A ski resort.
   */
  @NotNull public static SkiResort.Builder skiResort() { return new SkiResort.Builder(new HashMap<String,Object>()); }
  /**
   * The act of transferring ownership of an object to a destination. Reciprocal of TakeAction.\n\nRelated actions:\n\n* [[TakeAction]]: Reciprocal of GiveAction.\n* [[SendAction]]: Unlike SendAction, GiveAction implies that ownership is being transferred (e.g. I may send my laptop to you, but that doesn't mean I'm giving it to you).
   */
  @NotNull public static GiveAction.Builder giveAction() { return new GiveAction.Builder(new HashMap<String,Object>()); }
  /**
   * Scheduling future actions, events, or tasks.\n\nRelated actions:\n\n* [[ReserveAction]]: Unlike ReserveAction, ScheduleAction allocates future actions (e.g. an event, a task, etc) towards a time slot / spatial allocation.
   */
  @NotNull public static ScheduleAction.Builder scheduleAction() { return new ScheduleAction.Builder(new HashMap<String,Object>()); }
  /**
   * A food service, like breakfast, lunch, or dinner.
   */
  @NotNull public static FoodService.Builder foodService() { return new FoodService.Builder(new HashMap<String,Object>()); }
  /**
   * An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.\n\nSee also [blog post](http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html).
   */
  @NotNull public static Article.Builder article() { return new Article.Builder(new HashMap<String,Object>()); }
  /**
   * An agent bookmarks/flags/labels/tags/marks an object.
   */
  @NotNull public static BookmarkAction.Builder bookmarkAction() { return new BookmarkAction.Builder(new HashMap<String,Object>()); }
  /**
   * Place of worship, such as a church, synagogue, or mosque.
   */
  @NotNull public static PlaceOfWorship.Builder placeOfWorship() { return new PlaceOfWorship.Builder(new HashMap<String,Object>()); }
  /**
   * A state or province of a country.
   */
  @NotNull public static State.Builder state() { return new State.Builder(new HashMap<String,Object>()); }
  /**
   * Original definition: "provider of professional services."\n\nThe general [[ProfessionalService]] type for local businesses was deprecated due to confusion with [[Service]]. For reference, the types that it included were: [[Dentist]],
        [[AccountingService]], [[Attorney]], [[Notary]], as well as types for several kinds of [[HomeAndConstructionBusiness]]: [[Electrician]], [[GeneralContractor]],
        [[HousePainter]], [[Locksmith]], [[Plumber]], [[RoofingContractor]]. [[LegalService]] was introduced as a more inclusive supertype of [[Attorney]].
   */
  @NotNull public static ProfessionalService.Builder professionalService() { return new ProfessionalService.Builder(new HashMap<String,Object>()); }
  /**
   * A compound price specification is one that bundles multiple prices that all apply in combination for different dimensions of consumption. Use the name property of the attached unit price specification for indicating the dimension of a price component (e.g. "electricity" or "final cleaning").
   */
  @NotNull public static CompoundPriceSpecification.Builder compoundPriceSpecification() { return new CompoundPriceSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A navigation element of the page.
   */
  @NotNull public static SiteNavigationElement.Builder siteNavigationElement() { return new SiteNavigationElement.Builder(new HashMap<String,Object>()); }
  /**
   * The act of producing/preparing food.
   */
  @NotNull public static CookAction.Builder cookAction() { return new CookAction.Builder(new HashMap<String,Object>()); }
  /**
   * The most generic type of item.
   */
  @NotNull public static Thing.Builder thing() { return new Thing.Builder(new HashMap<String,Object>()); }
  /**
   * An image file.
   */
  @NotNull public static ImageObject.Builder imageObject() { return new ImageObject.Builder(new HashMap<String,Object>()); }
  /**
   * The act of starting or activating a device or application (e.g. starting a timer or turning on a flashlight).
   */
  @NotNull public static ActivateAction.Builder activateAction() { return new ActivateAction.Builder(new HashMap<String,Object>()); }
  /**
   * Organization: Sports team.
   */
  @NotNull public static SportsTeam.Builder sportsTeam() { return new SportsTeam.Builder(new HashMap<String,Object>()); }
  /**
   * An event venue.
   */
  @NotNull public static EventVenue.Builder eventVenue() { return new EventVenue.Builder(new HashMap<String,Object>()); }
  /**
   * An instance of a [[Course]] which is distinct from other instances because it is offered at a different time or location or through different media or modes of study or to a specific section of students.
   */
  @NotNull public static CourseInstance.Builder courseInstance() { return new CourseInstance.Builder(new HashMap<String,Object>()); }
  /**
   * A news article.
   */
  @NotNull public static NewsArticle.Builder newsArticle() { return new NewsArticle.Builder(new HashMap<String,Object>()); }
  /**
   * Organization: A business corporation.
   */
  @NotNull public static Corporation.Builder corporation() { return new Corporation.Builder(new HashMap<String,Object>()); }
  /**
   * A sports location, such as a playing field.
   */
  @NotNull public static SportsActivityLocation.Builder sportsActivityLocation() { return new SportsActivityLocation.Builder(new HashMap<String,Object>()); }
  /**
   * An airport.
   */
  @NotNull public static Airport.Builder airport() { return new Airport.Builder(new HashMap<String,Object>()); }
  /**
   * Used to describe a seat, such as a reserved seat in an event reservation.
   */
  @NotNull public static Seat.Builder seat() { return new Seat.Builder(new HashMap<String,Object>()); }
  /**
   * An office equipment store.
   */
  @NotNull public static OfficeEquipmentStore.Builder officeEquipmentStore() { return new OfficeEquipmentStore.Builder(new HashMap<String,Object>()); }
  /**
   * A Service to transfer funds from a person or organization to a beneficiary person or organization.
   */
  @NotNull public static PaymentService.Builder paymentService() { return new PaymentService.Builder(new HashMap<String,Object>()); }
  /**
   * A type of Bank Account with a main purpose of depositing funds to gain interest or other benefits.
   */
  @NotNull public static DepositAccount.Builder depositAccount() { return new DepositAccount.Builder(new HashMap<String,Object>()); }
  /**
   * A monetary value or range. This type can be used to describe an amount of money such as $50 USD, or a range as in describing a bank account being suitable for a balance between £1,000 and £1,000,000 GBP, or the value of a salary, etc. It is recommended to use [[PriceSpecification]] Types to describe the price of an Offer, Invoice, etc.
   */
  @NotNull public static MonetaryAmount.Builder monetaryAmount() { return new MonetaryAmount.Builder(new HashMap<String,Object>()); }
  /**
   * The act of arriving at a place. An agent arrives at a destination from a fromLocation, optionally with participants.
   */
  @NotNull public static ArriveAction.Builder arriveAction() { return new ArriveAction.Builder(new HashMap<String,Object>()); }
  /**
   * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
   */
  @NotNull public static Code.Builder code() { return new Code.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value providing information about when a certain organization or person owned a certain product.
   */
  @NotNull public static OwnershipInfo.Builder ownershipInfo() { return new OwnershipInfo.Builder(new HashMap<String,Object>()); }
  /**
   * An amusement park.
   */
  @NotNull public static AmusementPark.Builder amusementPark() { return new AmusementPark.Builder(new HashMap<String,Object>()); }
  /**
   * An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement.
For more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static Accommodation.Builder accommodation() { return new Accommodation.Builder(new HashMap<String,Object>()); }
  /**
   * A restaurant.
   */
  @NotNull public static Restaurant.Builder restaurant() { return new Restaurant.Builder(new HashMap<String,Object>()); }
  /**
   * CreativeWorkSeries dedicated to radio broadcast and associated online delivery.
   */
  @NotNull public static RadioSeries.Builder radioSeries() { return new RadioSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A movie theater.
   */
  @NotNull public static MovieTheater.Builder movieTheater() { return new MovieTheater.Builder(new HashMap<String,Object>()); }
  /**
   * A convenience store.
   */
  @NotNull public static ConvenienceStore.Builder convenienceStore() { return new ConvenienceStore.Builder(new HashMap<String,Object>()); }
  /**
   * A reservoir of water, typically an artificially created lake, like the Lake Kariba reservoir.
   */
  @NotNull public static Reservoir.Builder reservoir() { return new Reservoir.Builder(new HashMap<String,Object>()); }
  /**
   * The act of manipulating/administering/supervising/controlling one or more objects.
   */
  @NotNull public static OrganizeAction.Builder organizeAction() { return new OrganizeAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of  departing from a place. An agent departs from an fromLocation for a destination, optionally with participants.
   */
  @NotNull public static DepartAction.Builder departAction() { return new DepartAction.Builder(new HashMap<String,Object>()); }
  /**
   * Used to describe a ticket to an event, a flight, a bus ride, etc.
   */
  @NotNull public static Ticket.Builder ticket() { return new Ticket.Builder(new HashMap<String,Object>()); }
  /**
   * A hardware store.
   */
  @NotNull public static HardwareStore.Builder hardwareStore() { return new HardwareStore.Builder(new HashMap<String,Object>()); }
  /**
   * A post to a social media platform, including blog posts, tweets, Facebook posts, etc.
   */
  @NotNull public static SocialMediaPosting.Builder socialMediaPosting() { return new SocialMediaPosting.Builder(new HashMap<String,Object>()); }
  /**
   * A file containing slides or used for a presentation.
   */
  @NotNull public static PresentationDigitalDocument.Builder presentationDigitalDocument() { return new PresentationDigitalDocument.Builder(new HashMap<String,Object>()); }
  /**
   * The act of physically/electronically dispatching an object for transfer from an origin to a destination.Related actions:\n\n* [[ReceiveAction]]: The reciprocal of SendAction.\n* [[GiveAction]]: Unlike GiveAction, SendAction does not imply the transfer of ownership (e.g. I can send you my laptop, but I'm not necessarily giving it to you).
   */
  @NotNull public static SendAction.Builder sendAction() { return new SendAction.Builder(new HashMap<String,Object>()); }
  /**
   * A publication event e.g. catch-up TV or radio podcast, during which a program is available on-demand.
   */
  @NotNull public static OnDemandEvent.Builder onDemandEvent() { return new OnDemandEvent.Builder(new HashMap<String,Object>()); }
  /**
   * The W3C [Schema Bib Extend](http://www.w3.org/community/schemabibex/) (BibEx) group led the work to improve schema.org for bibliographic information, including terms for periodicals, articles and multi-volume works. The design was inspired in places (e.g. [[pageStart]], [[pageEnd]], [[pagination]]) by the [Bibliographic Ontology](http://bibliontology.com/), 'bibo'.
   */
  @NotNull public static BibExTerm.Builder bibExTerm() { return new BibExTerm.Builder(new HashMap<String,Object>()); }
  /**
   * A posting to a discussion forum.
   */
  @NotNull public static DiscussionForumPosting.Builder discussionForumPosting() { return new DiscussionForumPosting.Builder(new HashMap<String,Object>()); }
  /**
   * A pharmacy or drugstore.
   */
  @NotNull public static Pharmacy.Builder pharmacy() { return new Pharmacy.Builder(new HashMap<String,Object>()); }
  /**
   * A series of movies. Included movies can be indicated with the hasPart property.
   */
  @NotNull public static MovieSeries.Builder movieSeries() { return new MovieSeries.Builder(new HashMap<String,Object>()); }
  /**
   * An electronic file or document.
   */
  @NotNull public static DigitalDocument.Builder digitalDocument() { return new DigitalDocument.Builder(new HashMap<String,Object>()); }
  /**
   * The act of registering to be a user of a service, product or web page.\n\nRelated actions:\n\n* [[JoinAction]]: Unlike JoinAction, RegisterAction implies you are registering to be a user of a service, *not* a group/team of people.\n* [FollowAction]]: Unlike FollowAction, RegisterAction doesn't imply that the agent is expecting to poll for updates from the object.\n* [[SubscribeAction]]: Unlike SubscribeAction, RegisterAction doesn't imply that the agent is expecting updates from the object.
   */
  @NotNull public static RegisterAction.Builder registerAction() { return new RegisterAction.Builder(new HashMap<String,Object>()); }
  /**
   * This element is based on the work of the Financial Industry Business Ontology project (see [http://www.fibo.org/schema](http://www.fibo.org/schema) for details), in support of the W3C Financial Industry Business Ontology Community Group ([http://www.fibo.org/community](http://www.fibo.org/community)). Many class and property definitions are inspired by or based on [http://www.fibo.org](http://www.fibo.org).
   */
  @NotNull public static FIBO.Builder fIBO() { return new FIBO.Builder(new HashMap<String,Object>()); }
  /**
   * An historical landmark or building.
   */
  @NotNull public static LandmarksOrHistoricalBuildings.Builder landmarksOrHistoricalBuildings() { return new LandmarksOrHistoricalBuildings.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Exhibition event, e.g. at a museum, library, archive, tradeshow, ...
   */
  @NotNull public static ExhibitionEvent.Builder exhibitionEvent() { return new ExhibitionEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.
   */
  @NotNull public static WebPage.Builder webPage() { return new WebPage.Builder(new HashMap<String,Object>()); }
  /**
   * An list item, e.g. a step in a checklist or how-to description.
   */
  @NotNull public static ListItem.Builder listItem() { return new ListItem.Builder(new HashMap<String,Object>()); }
  /**
   * The act of notifying an event organizer as to whether you expect to attend the event.
   */
  @NotNull public static RsvpAction.Builder rsvpAction() { return new RsvpAction.Builder(new HashMap<String,Object>()); }
  /**
   * Animal shelter.
   */
  @NotNull public static AnimalShelter.Builder animalShelter() { return new AnimalShelter.Builder(new HashMap<String,Object>()); }
  /**
   * A crematorium.
   */
  @NotNull public static Crematorium.Builder crematorium() { return new Crematorium.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  @NotNull public static UserCheckins.Builder userCheckins() { return new UserCheckins.Builder(new HashMap<String,Object>()); }
  /**
   * A web page element, like a table or an image.
   */
  @NotNull public static WebPageElement.Builder webPageElement() { return new WebPageElement.Builder(new HashMap<String,Object>()); }
  /**
   * Reserving a concrete object.\n\nRelated actions:\n\n* [[ScheduleAction]]</a>: Unlike ScheduleAction, ReserveAction reserves concrete objects (e.g. a table, a hotel) towards a time slot / spatial allocation.
   */
  @NotNull public static ReserveAction.Builder reserveAction() { return new ReserveAction.Builder(new HashMap<String,Object>()); }
  /**
   * A short segment/part of a movie.
   */
  @NotNull public static MovieClip.Builder movieClip() { return new MovieClip.Builder(new HashMap<String,Object>()); }
  /**
   * An agent orders an object/product/service to be delivered/sent.
   */
  @NotNull public static OrderAction.Builder orderAction() { return new OrderAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of discovering/finding an object.
   */
  @NotNull public static DiscoverAction.Builder discoverAction() { return new DiscoverAction.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Contact page.
   */
  @NotNull public static ContactPage.Builder contactPage() { return new ContactPage.Builder(new HashMap<String,Object>()); }
  /**
   * The act of organizing tasks/objects/events by associating resources to it.
   */
  @NotNull public static AllocateAction.Builder allocateAction() { return new AllocateAction.Builder(new HashMap<String,Object>()); }
  /**
   * A country.
   */
  @NotNull public static Country.Builder country() { return new Country.Builder(new HashMap<String,Object>()); }
  /**
   * Auto body shop.
   */
  @NotNull public static AutoBodyShop.Builder autoBodyShop() { return new AutoBodyShop.Builder(new HashMap<String,Object>()); }
  /**
   * A collection of datasets.
   */
  @NotNull public static DataCatalog.Builder dataCatalog() { return new DataCatalog.Builder(new HashMap<String,Object>()); }
  /**
   * An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
   */
  @NotNull public static OrderItem.Builder orderItem() { return new OrderItem.Builder(new HashMap<String,Object>()); }
  /**
   * Structured values are used when the value of a property has a more complex structure than simply being a textual value or a reference to another thing.
   */
  @NotNull public static StructuredValue.Builder structuredValue() { return new StructuredValue.Builder(new HashMap<String,Object>()); }
  /**
   * A type of financial product that typically requires the client to transfer funds to a financial service in return for potential beneficial financial return.
   */
  @NotNull public static InvestmentOrDeposit.Builder investmentOrDeposit() { return new InvestmentOrDeposit.Builder(new HashMap<String,Object>()); }
  /**
   * A landform or physical feature.  Landform elements include mountains, plains, lakes, rivers, seascape and oceanic waterbody interface features such as bays, peninsulas, seas and so forth, including sub-aqueous terrain features such as submersed mountain ranges, volcanoes, and the great ocean basins.
   */
  @NotNull public static Landform.Builder landform() { return new Landform.Builder(new HashMap<String,Object>()); }
  /**
   * A CreativeWorkSeries in schema.org is a group of related items, typically but not necessarily of the same kind. CreativeWorkSeries are usually organized into some order, often chronological. Unlike [[ItemList]] which is a general purpose data structure for lists of things, the emphasis with CreativeWorkSeries is on published materials (written e.g. books and periodicals, or media such as tv, radio and games).\n\nSpecific subtypes are available for describing [[TVSeries]], [[RadioSeries]], [[MovieSeries]], [[BookSeries]], [[Periodical]] and [[VideoGameSeries]]. In each case, the [[hasPart]] / [[isPartOf]] properties can be used to relate the CreativeWorkSeries to its parts. The general CreativeWorkSeries type serves largely just to organize these more specific and practical subtypes.\n\nIt is common for properties applicable to an item from the series to be usefully applied to the containing group. Schema.org attempts to anticipate some of these cases, but publishers should be free to apply properties of the series parts to the series as a whole wherever they seem appropriate.
	  
   */
  @NotNull public static CreativeWorkSeries.Builder creativeWorkSeries() { return new CreativeWorkSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A Catholic church.
   */
  @NotNull public static CatholicChurch.Builder catholicChurch() { return new CatholicChurch.Builder(new HashMap<String,Object>()); }
  /**
   * A software application.
   */
  @NotNull public static SoftwareApplication.Builder softwareApplication() { return new SoftwareApplication.Builder(new HashMap<String,Object>()); }
  /**
   * The act of granting permission to an object.
   */
  @NotNull public static AuthorizeAction.Builder authorizeAction() { return new AuthorizeAction.Builder(new HashMap<String,Object>()); }
  /**
   * Season dedicated to TV broadcast and associated online delivery.
   */
  @NotNull public static TVSeason.Builder tVSeason() { return new TVSeason.Builder(new HashMap<String,Object>()); }
  /**
   * The act of achieving victory in a competitive activity.
   */
  @NotNull public static WinAction.Builder winAction() { return new WinAction.Builder(new HashMap<String,Object>()); }
  /**
   * A business providing entertainment.
   */
  @NotNull public static EntertainmentBusiness.Builder entertainmentBusiness() { return new EntertainmentBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * A media episode (e.g. TV, radio, video game) which can be part of a series or season.
   */
  @NotNull public static Episode.Builder episode() { return new Episode.Builder(new HashMap<String,Object>()); }
  /**
   * Residence type: Gated community.
   */
  @NotNull public static GatedResidenceCommunity.Builder gatedResidenceCommunity() { return new GatedResidenceCommunity.Builder(new HashMap<String,Object>()); }
  /**
   * A store that sells materials useful or necessary for various hobbies.
   */
  @NotNull public static HobbyShop.Builder hobbyShop() { return new HobbyShop.Builder(new HashMap<String,Object>()); }
  /**
   * An adult entertainment establishment.
   */
  @NotNull public static AdultEntertainment.Builder adultEntertainment() { return new AdultEntertainment.Builder(new HashMap<String,Object>()); }
  /**
   * This element is based on the STI Accommodation Ontology, see <a href="http://ontologies.sti-innsbruck.at/acco/ns.html">http://ontologies.sti-innsbruck.at/acco/ns.html</a> for details.
    Many class and property definitions are inspired by or based on abstracts from Wikipedia, the free encyclopedia.
   */
  @NotNull public static STIAccommodationOntology.Builder sTIAccommodationOntology() { return new STIAccommodationOntology.Builder(new HashMap<String,Object>()); }
  /**
   * The act of an agent communicating (service provider, social media, etc) their departure of a previously reserved service (e.g. flight check in) or place (e.g. hotel).\n\nRelated actions:\n\n* [[CheckInAction]]: The antonym of CheckOutAction.\n* [[DepartAction]]: Unlike DepartAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.\n* [[CancelAction]]: Unlike CancelAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.
   */
  @NotNull public static CheckOutAction.Builder checkOutAction() { return new CheckOutAction.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Video gallery page.
   */
  @NotNull public static VideoGallery.Builder videoGallery() { return new VideoGallery.Builder(new HashMap<String,Object>()); }
  /**
   * A parking lot or other parking facility.
   */
  @NotNull public static ParkingFacility.Builder parkingFacility() { return new ParkingFacility.Builder(new HashMap<String,Object>()); }
  /**
   * Car repair, sales, or parts.
   */
  @NotNull public static AutomotiveBusiness.Builder automotiveBusiness() { return new AutomotiveBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * Organization: Non-governmental Organization.
   */
  @NotNull public static NGO.Builder nGO() { return new NGO.Builder(new HashMap<String,Object>()); }
  /**
   * A radio episode which can be part of a series or season.
   */
  @NotNull public static RadioEpisode.Builder radioEpisode() { return new RadioEpisode.Builder(new HashMap<String,Object>()); }
  /**
   * A tourist information center.
   */
  @NotNull public static TouristInformationCenter.Builder touristInformationCenter() { return new TouristInformationCenter.Builder(new HashMap<String,Object>()); }
  /**
   * A radio station.
   */
  @NotNull public static RadioStation.Builder radioStation() { return new RadioStation.Builder(new HashMap<String,Object>()); }
  /**
   * The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting.
   */
  @NotNull public static Game.Builder game() { return new Game.Builder(new HashMap<String,Object>()); }
  /**
   * Beach.
   */
  @NotNull public static Beach.Builder beach() { return new Beach.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  @NotNull public static UserBlocks.Builder userBlocks() { return new UserBlocks.Builder(new HashMap<String,Object>()); }
  /**
   * A photograph.
   */
  @NotNull public static Photograph.Builder photograph() { return new Photograph.Builder(new HashMap<String,Object>()); }
  /**
   * An EducationalAudience.
   */
  @NotNull public static EducationalAudience.Builder educationalAudience() { return new EducationalAudience.Builder(new HashMap<String,Object>()); }
  /**
   * A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
   */
  @NotNull public static Vehicle.Builder vehicle() { return new Vehicle.Builder(new HashMap<String,Object>()); }
  /**
   * An emergency service, such as a fire station or ER.
   */
  @NotNull public static EmergencyService.Builder emergencyService() { return new EmergencyService.Builder(new HashMap<String,Object>()); }
  /**
   * The act of forming a personal connection with someone (object) mutually/bidirectionally/symmetrically.\n\nRelated actions:\n\n* [[FollowAction]]: Unlike FollowAction, BefriendAction implies that the connection is reciprocal.
   */
  @NotNull public static BefriendAction.Builder befriendAction() { return new BefriendAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of editing by adding an object to a collection.
   */
  @NotNull public static AddAction.Builder addAction() { return new AddAction.Builder(new HashMap<String,Object>()); }
  /**
   * A construction business.\n\nA HomeAndConstructionBusiness is a [[LocalBusiness]] that provides services around homes and buildings.\n\nAs a [[LocalBusiness]] it can be described as a [[provider]] of one or more [[Service]]\(s).
   */
  @NotNull public static HomeAndConstructionBusiness.Builder homeAndConstructionBusiness() { return new HomeAndConstructionBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
   */
  @NotNull public static WarrantyPromise.Builder warrantyPromise() { return new WarrantyPromise.Builder(new HashMap<String,Object>()); }
  /**
   * Software code review
   */
  @NotNull public static SourceCodeReview.Builder sourceCodeReview() { return new SourceCodeReview.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Profile page.
   */
  @NotNull public static ProfilePage.Builder profilePage() { return new ProfilePage.Builder(new HashMap<String,Object>()); }
  /**
   * A music recording (track), usually a single song.
   */
  @NotNull public static MusicRecording.Builder musicRecording() { return new MusicRecording.Builder(new HashMap<String,Object>()); }
  /**
   * The price for the delivery of an offer using a particular delivery method.
   */
  @NotNull public static DeliveryChargeSpecification.Builder deliveryChargeSpecification() { return new DeliveryChargeSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A health club.
   */
  @NotNull public static HealthClub.Builder healthClub() { return new HealthClub.Builder(new HashMap<String,Object>()); }
  /**
   * Professional service: Attorney. \n\nThis type is deprecated - [[LegalService]] is more inclusive and less ambiguous.
   */
  @NotNull public static Attorney.Builder attorney() { return new Attorney.Builder(new HashMap<String,Object>()); }
  /**
   * A stadium.
   */
  @NotNull public static StadiumOrArena.Builder stadiumOrArena() { return new StadiumOrArena.Builder(new HashMap<String,Object>()); }
  /**
   * The act of swallowing solid objects.
   */
  @NotNull public static EatAction.Builder eatAction() { return new EatAction.Builder(new HashMap<String,Object>()); }
  /**
   * A map.
   */
  @NotNull public static Map.Builder map() { return new Map.Builder(new HashMap<String,Object>()); }
  /**
   * A media season e.g. tv, radio, video game etc.
   */
  @NotNull public static Season.Builder season() { return new Season.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for air travel.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
   */
  @NotNull public static FlightReservation.Builder flightReservation() { return new FlightReservation.Builder(new HashMap<String,Object>()); }
  /**
   * Specific revision of a software code
   */
  @NotNull public static SourceCodeRevision.Builder sourceCodeRevision() { return new SourceCodeRevision.Builder(new HashMap<String,Object>()); }
  /**
   * A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.\n\n[blog post](http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html).
   */
  @NotNull public static PublicationIssue.Builder publicationIssue() { return new PublicationIssue.Builder(new HashMap<String,Object>()); }
  /**
   * A shoe store.
   */
  @NotNull public static ShoeStore.Builder shoeStore() { return new ShoeStore.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Social event.
   */
  @NotNull public static SocialEvent.Builder socialEvent() { return new SocialEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A shop that will buy, or lend money against the security of, personal possessions.
   */
  @NotNull public static PawnShop.Builder pawnShop() { return new PawnShop.Builder(new HashMap<String,Object>()); }
  /**
   * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the [[offers]] property. Repeated events may be structured as separate Event objects.
   */
  @NotNull public static Event.Builder event() { return new Event.Builder(new HashMap<String,Object>()); }
  /**
   * A body of water, such as a sea, ocean, or lake.
   */
  @NotNull public static BodyOfWater.Builder bodyOfWater() { return new BodyOfWater.Builder(new HashMap<String,Object>()); }
  /**
   * A datasheet or vendor specification of a product (in the sense of a prototypical description).
   */
  @NotNull public static ProductModel.Builder productModel() { return new ProductModel.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Music event.
   */
  @NotNull public static MusicEvent.Builder musicEvent() { return new MusicEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
   */
  @NotNull public static BroadcastChannel.Builder broadcastChannel() { return new BroadcastChannel.Builder(new HashMap<String,Object>()); }
  /**
   * A single feed providing structured information about one or more entities or topics.
   */
  @NotNull public static DataFeed.Builder dataFeed() { return new DataFeed.Builder(new HashMap<String,Object>()); }
  /**
   * The act of being defeated in a competitive activity.
   */
  @NotNull public static LoseAction.Builder loseAction() { return new LoseAction.Builder(new HashMap<String,Object>()); }
  /**
   * A card payment method of a particular brand or name.  Used to mark up a particular payment method and/or the financial product/service that supplies the card account.\n\nCommonly used values:\n\n* http://purl.org/goodrelations/v1#AmericanExpress\n* http://purl.org/goodrelations/v1#DinersClub\n* http://purl.org/goodrelations/v1#Discover\n* http://purl.org/goodrelations/v1#JCB\n* http://purl.org/goodrelations/v1#MasterCard\n* http://purl.org/goodrelations/v1#VISA
       
   */
  @NotNull public static CreditCard.Builder creditCard() { return new CreditCard.Builder(new HashMap<String,Object>()); }
  /**
   * A dataset in downloadable form.
   */
  @NotNull public static DataDownload.Builder dataDownload() { return new DataDownload.Builder(new HashMap<String,Object>()); }
  /**
   * The act of responding instinctively and emotionally to an object, expressing a sentiment.
   */
  @NotNull public static ReactAction.Builder reactAction() { return new ReactAction.Builder(new HashMap<String,Object>()); }
  /**
   * A hotel is an establishment that provides lodging paid on a short-term basis (Source: Wikipedia, the free encyclopedia, see http://en.wikipedia.org/wiki/Hotel).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static Hotel.Builder hotel() { return new Hotel.Builder(new HashMap<String,Object>()); }
  /**
   * The act of resuming a device or application which was formerly paused (e.g. resume music playback or resume a timer).
   */
  @NotNull public static ResumeAction.Builder resumeAction() { return new ResumeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A department store.
   */
  @NotNull public static DepartmentStore.Builder departmentStore() { return new DepartmentStore.Builder(new HashMap<String,Object>()); }
  /**
   * An ocean (for example, the Pacific).
   */
  @NotNull public static OceanBodyOfWater.Builder oceanBodyOfWater() { return new OceanBodyOfWater.Builder(new HashMap<String,Object>()); }
  /**
   * A bowling alley.
   */
  @NotNull public static BowlingAlley.Builder bowlingAlley() { return new BowlingAlley.Builder(new HashMap<String,Object>()); }
  /**
   * Aquarium.
   */
  @NotNull public static Aquarium.Builder aquarium() { return new Aquarium.Builder(new HashMap<String,Object>()); }
  /**
   * A pet store.
   */
  @NotNull public static PetStore.Builder petStore() { return new PetStore.Builder(new HashMap<String,Object>()); }
  /**
   * The act of editing a recipient by removing one of its objects.
   */
  @NotNull public static DeleteAction.Builder deleteAction() { return new DeleteAction.Builder(new HashMap<String,Object>()); }
  /**
   * Properties that take Energy as values are of the form '&lt;Number&gt; &lt;Energy unit of measure&gt;'.
   */
  @NotNull public static Energy.Builder energy() { return new Energy.Builder(new HashMap<String,Object>()); }
  /**
   * A school.
   */
  @NotNull public static School.Builder school() { return new School.Builder(new HashMap<String,Object>()); }
  /**
   * A book.
   */
  @NotNull public static Book.Builder book() { return new Book.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a preference from a set of options or a large or unbounded set of choices/options.
   */
  @NotNull public static ChooseAction.Builder chooseAction() { return new ChooseAction.Builder(new HashMap<String,Object>()); }
  /**
   * An car dealership.
   */
  @NotNull public static AutoDealer.Builder autoDealer() { return new AutoDealer.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Literary event.
   */
  @NotNull public static LiteraryEvent.Builder literaryEvent() { return new LiteraryEvent.Builder(new HashMap<String,Object>()); }
  /**
   * Web applications.
   */
  @NotNull public static WebApplication.Builder webApplication() { return new WebApplication.Builder(new HashMap<String,Object>()); }
  /**
   * A grocery store.
   */
  @NotNull public static GroceryStore.Builder groceryStore() { return new GroceryStore.Builder(new HashMap<String,Object>()); }
  /**
   * A nail salon.
   */
  @NotNull public static NailSalon.Builder nailSalon() { return new NailSalon.Builder(new HashMap<String,Object>()); }
  /**
   * The act of capturing sound and moving images on film, video, or digitally.
   */
  @NotNull public static FilmAction.Builder filmAction() { return new FilmAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of accomplishing something via previous efforts. It is an instantaneous action rather than an ongoing process.
   */
  @NotNull public static AchieveAction.Builder achieveAction() { return new AchieveAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of registering to an organization/service without the guarantee to receive it.\n\nRelated actions:\n\n* [[RegisterAction]]: Unlike RegisterAction, ApplyAction has no guarantees that the application will be accepted.
   */
  @NotNull public static ApplyAction.Builder applyAction() { return new ApplyAction.Builder(new HashMap<String,Object>()); }
  /**
   * A canal, like the Panama Canal.
   */
  @NotNull public static Canal.Builder canal() { return new Canal.Builder(new HashMap<String,Object>()); }
  /**
   * The place where a person lives.
   */
  @NotNull public static Residence.Builder residence() { return new Residence.Builder(new HashMap<String,Object>()); }
  /**
   * A city or town.
   */
  @NotNull public static City.Builder city() { return new City.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  @NotNull public static UserPageVisits.Builder userPageVisits() { return new UserPageVisits.Builder(new HashMap<String,Object>()); }
  /**
   * The act of distributing content to people for their amusement or edification.
   */
  @NotNull public static ShareAction.Builder shareAction() { return new ShareAction.Builder(new HashMap<String,Object>()); }
  /**
   * A retail good store.
   */
  @NotNull public static Store.Builder store() { return new Store.Builder(new HashMap<String,Object>()); }
  /**
   * A governmental organization or agency.
   */
  @NotNull public static GovernmentOrganization.Builder governmentOrganization() { return new GovernmentOrganization.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for lodging at a hotel, motel, inn, etc.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  @NotNull public static LodgingReservation.Builder lodgingReservation() { return new LodgingReservation.Builder(new HashMap<String,Object>()); }
  /**
   * An entry point, within some Web-based protocol.
   */
  @NotNull public static EntryPoint.Builder entryPoint() { return new EntryPoint.Builder(new HashMap<String,Object>()); }
  /**
   * A work of art that is primarily visual in character.
   */
  @NotNull public static VisualArtwork.Builder visualArtwork() { return new VisualArtwork.Builder(new HashMap<String,Object>()); }
  /**
   * An agent pays a price to a participant.
   */
  @NotNull public static PayAction.Builder payAction() { return new PayAction.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Children's event.
   */
  @NotNull public static ChildrensEvent.Builder childrensEvent() { return new ChildrensEvent.Builder(new HashMap<String,Object>()); }
  /**
   * An OfferCatalog is an ItemList that contains related Offers and/or further OfferCatalogs that are offeredBy the same provider.
   */
  @NotNull public static OfferCatalog.Builder offerCatalog() { return new OfferCatalog.Builder(new HashMap<String,Object>()); }
  /**
   * A music venue.
   */
  @NotNull public static MusicVenue.Builder musicVenue() { return new MusicVenue.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a consistency of opinion with the object. An agent agrees to/about an object (a proposition, topic or theme) with participants.
   */
  @NotNull public static AgreeAction.Builder agreeAction() { return new AgreeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A service to convert funds from one currency to another currency.
   */
  @NotNull public static CurrencyConversionService.Builder currencyConversionService() { return new CurrencyConversionService.Builder(new HashMap<String,Object>()); }
  /**
   * A Childcare center.
   */
  @NotNull public static ChildCare.Builder childCare() { return new ChildCare.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Checkout page.
   */
  @NotNull public static CheckoutPage.Builder checkoutPage() { return new CheckoutPage.Builder(new HashMap<String,Object>()); }
  /**
   * This class contains information contributed by [http://wikidoc.org>WikiDoc](http://wikidoc.org>WikiDoc).
   */
  @NotNull public static WikiDoc.Builder wikiDoc() { return new WikiDoc.Builder(new HashMap<String,Object>()); }
  /**
   * Brewery.
   */
  @NotNull public static Brewery.Builder brewery() { return new Brewery.Builder(new HashMap<String,Object>()); }
  /**
   * A zoo.
   */
  @NotNull public static Zoo.Builder zoo() { return new Zoo.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Sports event.
   */
  @NotNull public static SportsEvent.Builder sportsEvent() { return new SportsEvent.Builder(new HashMap<String,Object>()); }
  /**
   * The act of editing a recipient by replacing an old object with a new object.
   */
  @NotNull public static ReplaceAction.Builder replaceAction() { return new ReplaceAction.Builder(new HashMap<String,Object>()); }
  /**
   * A product or service offered by a bank whereby one may deposit, withdraw or transfer money and in some cases be paid interest.
   */
  @NotNull public static BankAccount.Builder bankAccount() { return new BankAccount.Builder(new HashMap<String,Object>()); }
  /**
   * The act of consuming written content.
   */
  @NotNull public static ReadAction.Builder readAction() { return new ReadAction.Builder(new HashMap<String,Object>()); }
  /**
   * A musical composition.
   */
  @NotNull public static MusicComposition.Builder musicComposition() { return new MusicComposition.Builder(new HashMap<String,Object>()); }
  /**
   * A house is a building or structure that has the ability to be occupied for habitation by humans or other creatures (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/House">http://en.wikipedia.org/wiki/House</a>).
   */
  @NotNull public static House.Builder house() { return new House.Builder(new HashMap<String,Object>()); }
  /**
   * The act of searching for an object.\n\nRelated actions:\n\n* [[FindAction]]: SearchAction generally leads to a FindAction, but not necessarily.
   */
  @NotNull public static SearchAction.Builder searchAction() { return new SearchAction.Builder(new HashMap<String,Object>()); }
  /**
   * A roofing contractor.
   */
  @NotNull public static RoofingContractor.Builder roofingContractor() { return new RoofingContractor.Builder(new HashMap<String,Object>()); }
  /**
   * An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.
   */
  @NotNull public static Order.Builder order() { return new Order.Builder(new HashMap<String,Object>()); }
  /**
   * An embassy.
   */
  @NotNull public static Embassy.Builder embassy() { return new Embassy.Builder(new HashMap<String,Object>()); }
  /**
   * A sporting goods store.
   */
  @NotNull public static SportingGoodsStore.Builder sportingGoodsStore() { return new SportingGoodsStore.Builder(new HashMap<String,Object>()); }
  /**
   * The act of traveling from an fromLocation to a destination by a specified mode of transport, optionally with participants.
   */
  @NotNull public static TravelAction.Builder travelAction() { return new TravelAction.Builder(new HashMap<String,Object>()); }
  /**
   * A hotel room is a single room in a hotel.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static HotelRoom.Builder hotelRoom() { return new HotelRoom.Builder(new HashMap<String,Object>()); }
  /**
   * The header section of the page.
   */
  @NotNull public static WPHeader.Builder wPHeader() { return new WPHeader.Builder(new HashMap<String,Object>()); }
  /**
   * A set of characteristics belonging to businesses, e.g. who compose an item's target audience.
   */
  @NotNull public static BusinessAudience.Builder businessAudience() { return new BusinessAudience.Builder(new HashMap<String,Object>()); }
  /**
   * This class is based upon W3C DCAT work, and benefits from collaboration around the DCAT, ADMS and VoID vocabularies. See http://www.w3.org/wiki/WebSchemas/Datasets for full details and mappings.
   */
  @NotNull public static DatasetClass.Builder datasetClass() { return new DatasetClass.Builder(new HashMap<String,Object>()); }
  /**
   * A listing that describes a job opening in a certain organization.
   */
  @NotNull public static JobPosting.Builder jobPosting() { return new JobPosting.Builder(new HashMap<String,Object>()); }
  /**
   * A motel.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static Motel.Builder motel() { return new Motel.Builder(new HashMap<String,Object>()); }
  /**
   * Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations.
   */
  @NotNull public static SportsOrganization.Builder sportsOrganization() { return new SportsOrganization.Builder(new HashMap<String,Object>()); }
  /**
   * The act of stopping or deactivating a device or application (e.g. stopping a timer or turning off a flashlight).
   */
  @NotNull public static DeactivateAction.Builder deactivateAction() { return new DeactivateAction.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  @NotNull public static UserLikes.Builder userLikes() { return new UserLikes.Builder(new HashMap<String,Object>()); }
  /**
   * A set of characteristics describing parents, who can be interested in viewing some content.
   */
  @NotNull public static ParentAudience.Builder parentAudience() { return new ParentAudience.Builder(new HashMap<String,Object>()); }
  /**
   * A high school.
   */
  @NotNull public static HighSchool.Builder highSchool() { return new HighSchool.Builder(new HashMap<String,Object>()); }
  /**
   * Properties that take Distances as values are of the form '&lt;Number&gt; &lt;Length unit of measure&gt;'. E.g., '7 ft'.
   */
  @NotNull public static Distance.Builder distance() { return new Distance.Builder(new HashMap<String,Object>()); }
  /**
   * The act of providing goods, services, or money without compensation, often for philanthropic reasons.
   */
  @NotNull public static DonateAction.Builder donateAction() { return new DonateAction.Builder(new HashMap<String,Object>()); }
  /**
   * The Question/Answer types were [based on](https://www.w3.org/wiki/WebSchemas/QASchemaResearch) the Stack Overflow API.
   */
  @NotNull public static StackExchange.Builder stackExchange() { return new StackExchange.Builder(new HashMap<String,Object>()); }
  /**
   * A golf course.
   */
  @NotNull public static GolfCourse.Builder golfCourse() { return new GolfCourse.Builder(new HashMap<String,Object>()); }
  /**
   * A store that sells mobile phones and related accessories.
   */
  @NotNull public static MobilePhoneStore.Builder mobilePhoneStore() { return new MobilePhoneStore.Builder(new HashMap<String,Object>()); }
  /**
   * A placeholder for multiple similar products of the same kind.
   */
  @NotNull public static SomeProducts.Builder someProducts() { return new SomeProducts.Builder(new HashMap<String,Object>()); }
  /**
   * A contact point&#x2014;for example, a Customer Complaints department.
   */
  @NotNull public static ContactPoint.Builder contactPoint() { return new ContactPoint.Builder(new HashMap<String,Object>()); }
  /**
   * A sports club.
   */
  @NotNull public static SportsClub.Builder sportsClub() { return new SportsClub.Builder(new HashMap<String,Object>()); }
  /**
   * The act of participating in performance arts.
   */
  @NotNull public static PerformAction.Builder performAction() { return new PerformAction.Builder(new HashMap<String,Object>()); }
  /**
   * A dance group&#x2014;for example, the Alvin Ailey Dance Theater or Riverdance.
   */
  @NotNull public static DanceGroup.Builder danceGroup() { return new DanceGroup.Builder(new HashMap<String,Object>()); }
  /**
   * A legislative building&#x2014;for example, the state capitol.
   */
  @NotNull public static LegislativeBuilding.Builder legislativeBuilding() { return new LegislativeBuilding.Builder(new HashMap<String,Object>()); }
  /**
   * A description of an educational course which may be offered as distinct instances at which take place at different times or take place at different locations, or be offered through different media or modes of study. An educational course is a sequence of one or more educational events and/or creative works which aims to build knowledge, competence or ability of learners.
   */
  @NotNull public static Course.Builder course() { return new Course.Builder(new HashMap<String,Object>()); }
  /**
   * Specific build of a software applicaton
   */
  @NotNull public static SoftwareApplicationBuild.Builder softwareApplicationBuild() { return new SoftwareApplicationBuild.Builder(new HashMap<String,Object>()); }
  /**
   * The act of notifying someone of information pertinent to them, with no expectation of a response.
   */
  @NotNull public static InformAction.Builder informAction() { return new InformAction.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Education event.
   */
  @NotNull public static EducationEvent.Builder educationEvent() { return new EducationEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A fire station. With firemen.
   */
  @NotNull public static FireStation.Builder fireStation() { return new FireStation.Builder(new HashMap<String,Object>()); }
  /**
   * This class contains derivatives of IPTC rNews properties. rNews is a data model of publishing metadata with serializations currently available for RDFa as well as HTML5 Microdata. More information about the IPTC and rNews can be found at [rnews.org](http://rnews.org).
   */
  @NotNull public static RNews.Builder rNews() { return new RNews.Builder(new HashMap<String,Object>()); }
  /**
   * Information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities.
   */
  @NotNull public static EngineSpecification.Builder engineSpecification() { return new EngineSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * An airline flight.
   */
  @NotNull public static Flight.Builder flight() { return new Flight.Builder(new HashMap<String,Object>()); }
  /**
   * A utility class that serves as the umbrella for a number of 'intangible' things such as quantities, structured values, etc.
   */
  @NotNull public static Intangible.Builder intangible() { return new Intangible.Builder(new HashMap<String,Object>()); }
  /**
   * The steering position is on the right side of the vehicle (viewed from the main direction of driving).
   */
  @NotNull public static RightHandDriving.Builder rightHandDriving() { return new RightHandDriving.Builder(new HashMap<String,Object>()); }
  /**
   * The act of responding to a question/message asked/sent by the object. Related to [[AskAction]]\n\nRelated actions:\n\n* [[AskAction]]: Appears generally as an origin of a ReplyAction.
   */
  @NotNull public static ReplyAction.Builder replyAction() { return new ReplyAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates pushed to.\n\nRelated actions:\n\n* [[FollowAction]]: Unlike FollowAction, SubscribeAction implies that the subscriber acts as a passive agent being constantly/actively pushed for updates.\n* [[RegisterAction]]: Unlike RegisterAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.\n* [[JoinAction]]: Unlike JoinAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.
   */
  @NotNull public static SubscribeAction.Builder subscribeAction() { return new SubscribeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A doctor's office.
   */
  @NotNull public static Physician.Builder physician() { return new Physician.Builder(new HashMap<String,Object>()); }
  /**
   * Reference documentation for application programming interfaces (APIs).
   */
  @NotNull public static APIReference.Builder aPIReference() { return new APIReference.Builder(new HashMap<String,Object>()); }
  /**
   * An email message.
   */
  @NotNull public static EmailMessage.Builder emailMessage() { return new EmailMessage.Builder(new HashMap<String,Object>()); }
  /**
   * A suite in a hotel or other public accommodation, denotes a class of luxury accommodations, the key feature of which is multiple rooms (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Suite_(hotel)">http://en.wikipedia.org/wiki/Suite_(hotel)</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static Suite.Builder suite() { return new Suite.Builder(new HashMap<String,Object>()); }
  /**
   * A Property value specification.
   */
  @NotNull public static PropertyValueSpecification.Builder propertyValueSpecification() { return new PropertyValueSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A screening of a movie or other video.
   */
  @NotNull public static ScreeningEvent.Builder screeningEvent() { return new ScreeningEvent.Builder(new HashMap<String,Object>()); }
  /**
   * An outlet store.
   */
  @NotNull public static OutletStore.Builder outletStore() { return new OutletStore.Builder(new HashMap<String,Object>()); }
  /**
   * The act of consuming dynamic/moving visual content.
   */
  @NotNull public static WatchAction.Builder watchAction() { return new WatchAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of intentionally disregarding the object. An agent ignores an object.
   */
  @NotNull public static IgnoreAction.Builder ignoreAction() { return new IgnoreAction.Builder(new HashMap<String,Object>()); }
  /**
   * The price asked for a given offer by the respective organization or person.
   */
  @NotNull public static UnitPriceSpecification.Builder unitPriceSpecification() { return new UnitPriceSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * 
          A Series in schema.org is a group of related items, typically but not necessarily of the same kind. 
   */
  @NotNull public static Series.Builder series() { return new Series.Builder(new HashMap<String,Object>()); }
  /**
   * A value indicating which roadwheels will receive torque.
   */
  @NotNull public static DriveWheelConfigurationValue.Builder driveWheelConfigurationValue() { return new DriveWheelConfigurationValue.Builder(new HashMap<String,Object>()); }
  /**
   * A hostel - cheap accommodation, often in shared dormitories.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static Hostel.Builder hostel() { return new Hostel.Builder(new HashMap<String,Object>()); }
  /**
   * A scholarly article.
   */
  @NotNull public static ScholarlyArticle.Builder scholarlyArticle() { return new ScholarlyArticle.Builder(new HashMap<String,Object>()); }
  /**
   * An advertising section of the page.
   */
  @NotNull public static WPAdBlock.Builder wPAdBlock() { return new WPAdBlock.Builder(new HashMap<String,Object>()); }
  /**
   * A bike store.
   */
  @NotNull public static BikeStore.Builder bikeStore() { return new BikeStore.Builder(new HashMap<String,Object>()); }
  /**
   * A nightclub or discotheque.
   */
  @NotNull public static NightClub.Builder nightClub() { return new NightClub.Builder(new HashMap<String,Object>()); }
  /**
   * A pond.
   */
  @NotNull public static Pond.Builder pond() { return new Pond.Builder(new HashMap<String,Object>()); }
  /**
   * CreativeWorkSeries dedicated to TV broadcast and associated online delivery.
   */
  @NotNull public static TVSeries.Builder tVSeries() { return new TVSeries.Builder(new HashMap<String,Object>()); }
  /**
   * A media season e.g. tv, radio, video game etc.
   */
  @NotNull public static CreativeWorkSeason.Builder creativeWorkSeason() { return new CreativeWorkSeason.Builder(new HashMap<String,Object>()); }
  /**
   * Bank or credit union.
   */
  @NotNull public static BankOrCreditUnion.Builder bankOrCreditUnion() { return new BankOrCreditUnion.Builder(new HashMap<String,Object>()); }
  /**
   * A real-estate agent.
   */
  @NotNull public static RealEstateAgent.Builder realEstateAgent() { return new RealEstateAgent.Builder(new HashMap<String,Object>()); }
  /**
   * An electronics store.
   */
  @NotNull public static ElectronicsStore.Builder electronicsStore() { return new ElectronicsStore.Builder(new HashMap<String,Object>()); }
  /**
   * Real-wheel drive is a transmission layout where the engine drives the rear wheels.
   */
  @NotNull public static RearWheelDriveConfiguration.Builder rearWheelDriveConfiguration() { return new RearWheelDriveConfiguration.Builder(new HashMap<String,Object>()); }
  /**
   * Health and beauty.
   */
  @NotNull public static HealthAndBeautyBusiness.Builder healthAndBeautyBusiness() { return new HealthAndBeautyBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * Researchers.
   */
  @NotNull public static Researcher.Builder researcher() { return new Researcher.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a preference from a fixed/finite/structured set of choices/options.
   */
  @NotNull public static VoteAction.Builder voteAction() { return new VoteAction.Builder(new HashMap<String,Object>()); }
  /**
   * Project
   */
  @NotNull public static Project.Builder project() { return new Project.Builder(new HashMap<String,Object>()); }
  /**
   * A short radio program or a segment/part of a radio program.
   */
  @NotNull public static RadioClip.Builder radioClip() { return new RadioClip.Builder(new HashMap<String,Object>()); }
  /**
   * A video file.
   */
  @NotNull public static VideoObject.Builder videoObject() { return new VideoObject.Builder(new HashMap<String,Object>()); }
  /**
   * A permit issued by an organization, e.g. a parking pass.
   */
  @NotNull public static Permit.Builder permit() { return new Permit.Builder(new HashMap<String,Object>()); }
  /**
   * A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the [[text]] property, and its topic via [[about]], properties shared with all CreativeWorks.
   */
  @NotNull public static Comment.Builder comment() { return new Comment.Builder(new HashMap<String,Object>()); }
  /**
   * A GeoCircle is a GeoShape representing a circular geographic area. As it is a GeoShape
          it provides the simple textual property 'circle', but also allows the combination of postalCode alongside geoRadius.
          The center of the circle can be indicated via the 'geoMidpoint' property, or more approximately using 'address', 'postalCode'.
       
   */
  @NotNull public static GeoCircle.Builder geoCircle() { return new GeoCircle.Builder(new HashMap<String,Object>()); }
  /**
   * An event involving the delivery of an item.
   */
  @NotNull public static DeliveryEvent.Builder deliveryEvent() { return new DeliveryEvent.Builder(new HashMap<String,Object>()); }
  /**
   * The act of finding an object.\n\nRelated actions:\n\n* [[SearchAction]]: FindAction is generally lead by a SearchAction, but not necessarily.
   */
  @NotNull public static FindAction.Builder findAction() { return new FindAction.Builder(new HashMap<String,Object>()); }
  /**
   * Beauty salon.
   */
  @NotNull public static BeautySalon.Builder beautySalon() { return new BeautySalon.Builder(new HashMap<String,Object>()); }
  /**
   * Bed and breakfast.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static BedAndBreakfast.Builder bedAndBreakfast() { return new BedAndBreakfast.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: About page.
   */
  @NotNull public static AboutPage.Builder aboutPage() { return new AboutPage.Builder(new HashMap<String,Object>()); }
  /**
   * A middle school (typically for children aged around 11-14, although this varies somewhat).
   */
  @NotNull public static MiddleSchool.Builder middleSchool() { return new MiddleSchool.Builder(new HashMap<String,Object>()); }
  /**
   * An organization such as a school, NGO, corporation, club, etc.
   */
  @NotNull public static Organization.Builder organization() { return new Organization.Builder(new HashMap<String,Object>()); }
  /**
   * A synagogue.
   */
  @NotNull public static Synagogue.Builder synagogue() { return new Synagogue.Builder(new HashMap<String,Object>()); }
  /**
   * ATM/cash machine.
   */
  @NotNull public static AutomatedTeller.Builder automatedTeller() { return new AutomatedTeller.Builder(new HashMap<String,Object>()); }
  /**
   * A single item within a larger data feed.
   */
  @NotNull public static DataFeedItem.Builder dataFeedItem() { return new DataFeedItem.Builder(new HashMap<String,Object>()); }
  /**
   * A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.
   */
  @NotNull public static QualitativeValue.Builder qualitativeValue() { return new QualitativeValue.Builder(new HashMap<String,Object>()); }
  /**
   * The implementation and use of Legal Entity Identifier (LEI) is supported by Global Legal Entity Identifier Foundation [https://www.gleif.org](https://www.gleif.org).
   */
  @NotNull public static GLEIF.Builder gLEIF() { return new GLEIF.Builder(new HashMap<String,Object>()); }
  /**
   * The average rating based on multiple ratings or reviews.
   */
  @NotNull public static AggregateRating.Builder aggregateRating() { return new AggregateRating.Builder(new HashMap<String,Object>()); }
  /**
   * An intangible item that describes an alignment between a learning resource and a node in an educational framework.
   */
  @NotNull public static AlignmentObject.Builder alignmentObject() { return new AlignmentObject.Builder(new HashMap<String,Object>()); }
  /**
   * A theater or other performing art center.
   */
  @NotNull public static PerformingArtsTheater.Builder performingArtsTheater() { return new PerformingArtsTheater.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for a rental car.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  @NotNull public static RentalCarReservation.Builder rentalCarReservation() { return new RentalCarReservation.Builder(new HashMap<String,Object>()); }
  /**
   * A motorcycle repair shop.
   */
  @NotNull public static MotorcycleRepair.Builder motorcycleRepair() { return new MotorcycleRepair.Builder(new HashMap<String,Object>()); }
  /**
   * An elementary school.
   */
  @NotNull public static ElementarySchool.Builder elementarySchool() { return new ElementarySchool.Builder(new HashMap<String,Object>()); }
  /**
   * Web page type: Search results page.
   */
  @NotNull public static SearchResultsPage.Builder searchResultsPage() { return new SearchResultsPage.Builder(new HashMap<String,Object>()); }
  /**
   * A winery.
   */
  @NotNull public static Winery.Builder winery() { return new Winery.Builder(new HashMap<String,Object>()); }
  /**
   * When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.
   */
  @NotNull public static AggregateOffer.Builder aggregateOffer() { return new AggregateOffer.Builder(new HashMap<String,Object>()); }
  /**
   * An action performed by a direct agent and indirect participants upon a direct object. Optionally happens at a location with the help of an inanimate instrument. The execution of the action may produce a result. Specific action sub-type documentation specifies the exact expectation of each argument/role.\n\nSee also [blog post](http://blog.schema.org/2014/04/announcing-schemaorg-actions.html) and [Actions overview document](http://schema.org/docs/actions.html).
   */
  @NotNull public static Action.Builder action() { return new Action.Builder(new HashMap<String,Object>()); }
  /**
   * The act of producing a visual/graphical representation of an object, typically with a pen/pencil and paper as instruments.
   */
  @NotNull public static DrawAction.Builder drawAction() { return new DrawAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a negative sentiment about the object. An agent dislikes an object (a proposition, topic or theme) with participants.
   */
  @NotNull public static DislikeAction.Builder dislikeAction() { return new DislikeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A bridge.
   */
  @NotNull public static Bridge.Builder bridge() { return new Bridge.Builder(new HashMap<String,Object>()); }
  /**
   * A LegalService is a business that provides legally-oriented services, advice and representation, e.g. law firms.\n\nAs a [[LocalBusiness]] it can be described as a [[provider]] of one or more [[Service]]\(s).
   */
  @NotNull public static LegalService.Builder legalService() { return new LegalService.Builder(new HashMap<String,Object>()); }
  /**
   * Properties that take Mass as values are of the form '&lt;Number&gt; &lt;Mass unit of measure&gt;'. E.g., '7 kg'.
   */
  @NotNull public static Mass.Builder mass() { return new Mass.Builder(new HashMap<String,Object>()); }
  /**
   * This class is based on the work of the LRMI project, see lrmi.net for details.
   */
  @NotNull public static LRMIClass.Builder lRMIClass() { return new LRMIClass.Builder(new HashMap<String,Object>()); }
  /**
   * A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.
   */
  @NotNull public static MusicGroup.Builder musicGroup() { return new MusicGroup.Builder(new HashMap<String,Object>()); }
  /**
   * A meeting room, conference room, or conference hall is a room provided for singular events such as business conferences and meetings (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Conference_hall">http://en.wikipedia.org/wiki/Conference_hall</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static MeetingRoom.Builder meetingRoom() { return new MeetingRoom.Builder(new HashMap<String,Object>()); }
  /**
   * A jewelry store.
   */
  @NotNull public static JewelryStore.Builder jewelryStore() { return new JewelryStore.Builder(new HashMap<String,Object>()); }
  /**
   * Nutritional information about the recipe.
   */
  @NotNull public static NutritionInformation.Builder nutritionInformation() { return new NutritionInformation.Builder(new HashMap<String,Object>()); }
  /**
   * A self-storage facility.
   */
  @NotNull public static SelfStorage.Builder selfStorage() { return new SelfStorage.Builder(new HashMap<String,Object>()); }
  /**
   * A service for a vehicle for hire with a driver for local travel. Fares are usually calculated based on distance traveled.
   */
  @NotNull public static TaxiService.Builder taxiService() { return new TaxiService.Builder(new HashMap<String,Object>()); }
  /**
   * A service provided by an organization, e.g. delivery service, print services, etc.
   */
  @NotNull public static Service.Builder service() { return new Service.Builder(new HashMap<String,Object>()); }
  /**
   * A PerformanceRole is a Role that some entity places with regard to a theatrical performance, e.g. in a Movie, TVSeries etc.
   */
  @NotNull public static PerformanceRole.Builder performanceRole() { return new PerformanceRole.Builder(new HashMap<String,Object>()); }
  /**
   * A courthouse.
   */
  @NotNull public static Courthouse.Builder courthouse() { return new Courthouse.Builder(new HashMap<String,Object>()); }
  /**
   * A service which provides access to media programming like TV or radio. Access may be via cable or satellite.
   */
  @NotNull public static CableOrSatelliteService.Builder cableOrSatelliteService() { return new CableOrSatelliteService.Builder(new HashMap<String,Object>()); }
  /**
   * A brand is a name used by an organization or business person for labeling a product, product group, or similar.
   */
  @NotNull public static Brand.Builder brand() { return new Brand.Builder(new HashMap<String,Object>()); }
  /**
   * An agent quotes/estimates/appraises an object/product/service with a price at a location/store.
   */
  @NotNull public static QuoteAction.Builder quoteAction() { return new QuoteAction.Builder(new HashMap<String,Object>()); }
  /**
   * A MusicRelease is a specific release of a music album.
   */
  @NotNull public static MusicRelease.Builder musicRelease() { return new MusicRelease.Builder(new HashMap<String,Object>()); }
  /**
   * A tennis complex.
   */
  @NotNull public static TennisComplex.Builder tennisComplex() { return new TennisComplex.Builder(new HashMap<String,Object>()); }
  /**
   * The act of generating a comment about a subject.
   */
  @NotNull public static CommentAction.Builder commentAction() { return new CommentAction.Builder(new HashMap<String,Object>()); }
  /**
   * A sidebar section of the page.
   */
  @NotNull public static WPSideBar.Builder wPSideBar() { return new WPSideBar.Builder(new HashMap<String,Object>()); }
  /**
   * A florist.
   */
  @NotNull public static Florist.Builder florist() { return new Florist.Builder(new HashMap<String,Object>()); }
  /**
   * The act of installing an application.
   */
  @NotNull public static InstallAction.Builder installAction() { return new InstallAction.Builder(new HashMap<String,Object>()); }
  /**
   * A structured representation of food or drink items available from a FoodEstablishment.
   */
  @NotNull public static Menu.Builder menu() { return new Menu.Builder(new HashMap<String,Object>()); }
  /**
   * A car wash business.
   */
  @NotNull public static AutoWash.Builder autoWash() { return new AutoWash.Builder(new HashMap<String,Object>()); }
  /**
   * A BreadcrumbList is an ItemList consisting of a chain of linked Web pages, typically described using at least their URL and their name, and typically ending with the current page.\n\nThe [[position]] property is used to reconstruct the order of the items in a BreadcrumbList The convention is that a breadcrumb list has an [[itemListOrder]] of [[ItemListOrderAscending]] (lower values listed first), and that the first items in this list correspond to the "top" or beginning of the breadcrumb trail, e.g. with a site or section homepage. The specific values of 'position' are not assigned meaning for a BreadcrumbList, but they should be integers, e.g. beginning with '1' for the first item in the list.
      
   */
  @NotNull public static BreadcrumbList.Builder breadcrumbList() { return new BreadcrumbList.Builder(new HashMap<String,Object>()); }
  /**
   * The act of capturing still images of objects using a camera.
   */
  @NotNull public static PhotographAction.Builder photographAction() { return new PhotographAction.Builder(new HashMap<String,Object>()); }
  /**
   * A playground.
   */
  @NotNull public static Playground.Builder playground() { return new Playground.Builder(new HashMap<String,Object>()); }
  /**
   * A public structure, such as a town hall or concert hall.
   */
  @NotNull public static CivicStructure.Builder civicStructure() { return new CivicStructure.Builder(new HashMap<String,Object>()); }
  /**
   * The act of reaching a draw in a competitive activity.
   */
  @NotNull public static TieAction.Builder tieAction() { return new TieAction.Builder(new HashMap<String,Object>()); }
  /**
   * Front-wheel drive is a transmission layout where the engine drives the front wheels.
   */
  @NotNull public static FrontWheelDriveConfiguration.Builder frontWheelDriveConfiguration() { return new FrontWheelDriveConfiguration.Builder(new HashMap<String,Object>()); }
  /**
   * Server that provides game interaction in a multiplayer game.
   */
  @NotNull public static GameServer.Builder gameServer() { return new GameServer.Builder(new HashMap<String,Object>()); }
  /**
   * The act of asking someone to attend an event. Reciprocal of RsvpAction.
   */
  @NotNull public static InviteAction.Builder inviteAction() { return new InviteAction.Builder(new HashMap<String,Object>()); }
  /**
   * A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.
   */
  @NotNull public static LocalBusiness.Builder localBusiness() { return new LocalBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * A group of multiple reservations with common values for all sub-reservations.
   */
  @NotNull public static ReservationPackage.Builder reservationPackage() { return new ReservationPackage.Builder(new HashMap<String,Object>()); }
  /**
   * A taxi.
   */
  @NotNull public static Taxi.Builder taxi() { return new Taxi.Builder(new HashMap<String,Object>()); }
  /**
   * A tattoo parlor.
   */
  @NotNull public static TattooParlor.Builder tattooParlor() { return new TattooParlor.Builder(new HashMap<String,Object>()); }
  /**
   * A casino.
   */
  @NotNull public static Casino.Builder casino() { return new Casino.Builder(new HashMap<String,Object>()); }
  /**
   * A person (alive, dead, undead, or fictional).
   */
  @NotNull public static Person.Builder person() { return new Person.Builder(new HashMap<String,Object>()); }
  /**
   * A motorcycle dealer.
   */
  @NotNull public static MotorcycleDealer.Builder motorcycleDealer() { return new MotorcycleDealer.Builder(new HashMap<String,Object>()); }
  /**
   * Residence type: Single-family home.
   */
  @NotNull public static SingleFamilyResidence.Builder singleFamilyResidence() { return new SingleFamilyResidence.Builder(new HashMap<String,Object>()); }
  /**
   * A trip on a commercial train line.
   */
  @NotNull public static TrainTrip.Builder trainTrip() { return new TrainTrip.Builder(new HashMap<String,Object>()); }
  /**
   * A tourist attraction.
   */
  @NotNull public static TouristAttraction.Builder touristAttraction() { return new TouristAttraction.Builder(new HashMap<String,Object>()); }
  /**
   * Intended audience for an item, i.e. the group for whom the item was created.
   */
  @NotNull public static Audience.Builder audience() { return new Audience.Builder(new HashMap<String,Object>()); }
  /**
   * The costs of settling the payment using a particular payment method.
   */
  @NotNull public static PaymentChargeSpecification.Builder paymentChargeSpecification() { return new PaymentChargeSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * The schema.org Actions mechanism benefited from extensive discussions across the Web standards community around W3C, in particular from the [Hydra project](http://purl.org/hydra/)'s community group.
   */
  @NotNull public static ActionCollabClass.Builder actionCollabClass() { return new ActionCollabClass.Builder(new HashMap<String,Object>()); }
  /**
   * A moving company.
   */
  @NotNull public static MovingCompany.Builder movingCompany() { return new MovingCompany.Builder(new HashMap<String,Object>()); }
  /**
   * A bus station.
   */
  @NotNull public static BusStation.Builder busStation() { return new BusStation.Builder(new HashMap<String,Object>()); }
  /**
   * A bakery.
   */
  @NotNull public static Bakery.Builder bakery() { return new Bakery.Builder(new HashMap<String,Object>()); }
  /**
   * A blog post intended to provide a rolling textual coverage of an ongoing event through continuous updates.
   */
  @NotNull public static LiveBlogPosting.Builder liveBlogPosting() { return new LiveBlogPosting.Builder(new HashMap<String,Object>()); }
  /**
   * A list of items of any sort&#x2014;for example, Top 10 Movies About Weathermen, or Top 100 Party Songs. Not to be confused with HTML lists, which are often used only for formatting.
   */
  @NotNull public static ItemList.Builder itemList() { return new ItemList.Builder(new HashMap<String,Object>()); }
  /**
   * This class is derived from the GoodRelations Vocabulary for E-Commerce, created by Martin Hepp. GoodRelations is a data model for sharing e-commerce data on the Web that can be expressed in a variety of syntaxes, including RDFa and HTML5 Microdata. More information about GoodRelations can be found at [http://purl.org/goodrelations/](http://purl.org/goodrelations/).
   */
  @NotNull public static GoodRelationsClass.Builder goodRelationsClass() { return new GoodRelationsClass.Builder(new HashMap<String,Object>()); }
  /**
   * The act of notifying someone that a future event/action is going to happen as expected.\n\nRelated actions:\n\n* [[CancelAction]]: The antonym of ConfirmAction.
   */
  @NotNull public static ConfirmAction.Builder confirmAction() { return new ConfirmAction.Builder(new HashMap<String,Object>()); }
  /**
   * An agent leaves an event / group with participants/friends at a location.\n\nRelated actions:\n\n* [[JoinAction]]: The antonym of LeaveAction.\n* [[UnRegisterAction]]: Unlike UnRegisterAction, LeaveAction implies leaving a group/team of people rather than a service.
   */
  @NotNull public static LeaveAction.Builder leaveAction() { return new LeaveAction.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  @NotNull public static UserComments.Builder userComments() { return new UserComments.Builder(new HashMap<String,Object>()); }
  /**
   * The act of allocating an action/event/task to some destination (someone or something).
   */
  @NotNull public static AssignAction.Builder assignAction() { return new AssignAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a positive sentiment about the object. An agent likes an object (a proposition, topic or theme) with participants.
   */
  @NotNull public static LikeAction.Builder likeAction() { return new LikeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A review of an item - for example, of a restaurant, movie, or store.
   */
  @NotNull public static Review.Builder review() { return new Review.Builder(new HashMap<String,Object>()); }
  /**
   * An ice cream shop.
   */
  @NotNull public static IceCreamShop.Builder iceCreamShop() { return new IceCreamShop.Builder(new HashMap<String,Object>()); }
  /**
   * A set of characteristics belonging to people, e.g. who compose an item's target audience.
   */
  @NotNull public static PeopleAudience.Builder peopleAudience() { return new PeopleAudience.Builder(new HashMap<String,Object>()); }
  /**
   * An organization that provides flights for passengers.
   */
  @NotNull public static Airline.Builder airline() { return new Airline.Builder(new HashMap<String,Object>()); }
  /**
   * A single message from a sender to one or more organizations or people.
   */
  @NotNull public static Message.Builder message() { return new Message.Builder(new HashMap<String,Object>()); }
  /**
   * A table on a Web page.
   */
  @NotNull public static Table.Builder table() { return new Table.Builder(new HashMap<String,Object>()); }
  /**
   * An electrician.
   */
  @NotNull public static Electrician.Builder electrician() { return new Electrician.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Comedy event.
   */
  @NotNull public static ComedyEvent.Builder comedyEvent() { return new ComedyEvent.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  @NotNull public static UserPlusOnes.Builder userPlusOnes() { return new UserPlusOnes.Builder(new HashMap<String,Object>()); }
  /**
   * Lists or enumerations—for example, a list of cuisines or music genres, etc.
   */
  @NotNull public static Enumeration.Builder enumeration() { return new Enumeration.Builder(new HashMap<String,Object>()); }
  /**
   * A place offering space for "Recreational Vehicles", Caravans, mobile homes and the like.
   */
  @NotNull public static RVPark.Builder rVPark() { return new RVPark.Builder(new HashMap<String,Object>()); }
  /**
   * A dry-cleaning business.
   */
  @NotNull public static DryCleaningOrLaundry.Builder dryCleaningOrLaundry() { return new DryCleaningOrLaundry.Builder(new HashMap<String,Object>()); }
  /**
   * A TV episode which can be part of a series or season.
   */
  @NotNull public static TVEpisode.Builder tVEpisode() { return new TVEpisode.Builder(new HashMap<String,Object>()); }
  /**
   * The act of inserting at the end if an ordered collection.
   */
  @NotNull public static AppendAction.Builder appendAction() { return new AppendAction.Builder(new HashMap<String,Object>()); }
  /**
   * A software application designed specifically to work well on a mobile device such as a telephone.
   */
  @NotNull public static MobileApplication.Builder mobileApplication() { return new MobileApplication.Builder(new HashMap<String,Object>()); }
  /**
   * A train station.
   */
  @NotNull public static TrainStation.Builder trainStation() { return new TrainStation.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Theater performance.
   */
  @NotNull public static TheaterEvent.Builder theaterEvent() { return new TheaterEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A food or drink item listed in a menu or menu section.
   */
  @NotNull public static MenuItem.Builder menuItem() { return new MenuItem.Builder(new HashMap<String,Object>()); }
  /**
   * The act of physically/electronically taking delivery of an object thathas been transferred from an origin to a destination. Reciprocal of SendAction.\n\nRelated actions:\n\n* [[SendAction]]: The reciprocal of ReceiveAction.\n* [[TakeAction]]: Unlike TakeAction, ReceiveAction does not imply that the ownership has been transfered (e.g. I can receive a package, but it does not mean the package is now mine).
   */
  @NotNull public static ReceiveAction.Builder receiveAction() { return new ReceiveAction.Builder(new HashMap<String,Object>()); }
  /**
   * A financial product for the loaning of an amount of money under agreed terms and charges.
   */
  @NotNull public static LoanOrCredit.Builder loanOrCredit() { return new LoanOrCredit.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: A social dance.
   */
  @NotNull public static DanceEvent.Builder danceEvent() { return new DanceEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A day spa.
   */
  @NotNull public static DaySpa.Builder daySpa() { return new DaySpa.Builder(new HashMap<String,Object>()); }
  /**
   * The act of gaining ownership of an object from an origin. Reciprocal of GiveAction.\n\nRelated actions:\n\n* [[GiveAction]]: The reciprocal of TakeAction.\n* [[ReceiveAction]]: Unlike ReceiveAction, TakeAction implies that ownership has been transfered.
   */
  @NotNull public static TakeAction.Builder takeAction() { return new TakeAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a difference of opinion with the object. An agent disagrees to/about an object (a proposition, topic or theme) with participants.
   */
  @NotNull public static DisagreeAction.Builder disagreeAction() { return new DisagreeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A body of structured information describing some topic(s) of interest.
   */
  @NotNull public static Dataset.Builder dataset() { return new Dataset.Builder(new HashMap<String,Object>()); }
  /**
   * A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document.
   */
  @NotNull public static Question.Builder question() { return new Question.Builder(new HashMap<String,Object>()); }
  /**
   * The act of playing/exercising/training/performing for enjoyment, leisure, recreation, Competition or exercise.\n\nRelated actions:\n\n* [[ListenAction]]: Unlike ListenAction (which is under ConsumeAction), PlayAction refers to performing for an audience or at an event, rather than consuming music.\n* [[WatchAction]]: Unlike WatchAction (which is under ConsumeAction), PlayAction refers to showing/displaying for an audience or at an event, rather than consuming visual content.
   */
  @NotNull public static PlayAction.Builder playAction() { return new PlayAction.Builder(new HashMap<String,Object>()); }
  /**
   * An offer to transfer some rights to an item or to provide a service — for example, an offer to sell tickets to an event, to rent the DVD of a movie, to stream a TV show over the internet, to repair a motorcycle, or to loan a book.\n\nFor [GTIN](http://www.gs1.org/barcodes/technical/idkeys/gtin)-related fields, see [Check Digit calculator](http://www.gs1.org/barcodes/support/check_digit_calculator) and [validation guide](http://www.gs1us.org/resources/standards/gtin-validation-guide) from [GS1](http://www.gs1.org/).
   */
  @NotNull public static Offer.Builder offer() { return new Offer.Builder(new HashMap<String,Object>()); }
  /**
   * Quantities such as distance, time, mass, weight, etc. Particular instances of say Mass are entities like '3 Kg' or '4 milligrams'.
   */
  @NotNull public static Quantity.Builder quantity() { return new Quantity.Builder(new HashMap<String,Object>()); }
  /**
   * An answer offered to a question; perhaps correct, perhaps opinionated or wrong.
   */
  @NotNull public static Answer.Builder answer() { return new Answer.Builder(new HashMap<String,Object>()); }
  /**
   * A short TV or radio program or a segment/part of a program.
   */
  @NotNull public static Clip.Builder clip() { return new Clip.Builder(new HashMap<String,Object>()); }
  /**
   * A preschool.
   */
  @NotNull public static Preschool.Builder preschool() { return new Preschool.Builder(new HashMap<String,Object>()); }
  /**
   * An audio file.
   */
  @NotNull public static AudioObject.Builder audioObject() { return new AudioObject.Builder(new HashMap<String,Object>()); }
  /**
   * A subclass of OrganizationRole used to describe employee relationships.
   */
  @NotNull public static EmployeeRole.Builder employeeRole() { return new EmployeeRole.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation to dine at a food-related business.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  @NotNull public static FoodEstablishmentReservation.Builder foodEstablishmentReservation() { return new FoodEstablishmentReservation.Builder(new HashMap<String,Object>()); }
  /**
   * A plumbing service.
   */
  @NotNull public static Plumber.Builder plumber() { return new Plumber.Builder(new HashMap<String,Object>()); }
  /**
   * A media object, such as an image, video, or audio object embedded in a web page or a downloadable dataset i.e. DataDownload. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).
   */
  @NotNull public static MediaObject.Builder mediaObject() { return new MediaObject.Builder(new HashMap<String,Object>()); }
  /**
   * A short segment/part of a video game.
   */
  @NotNull public static VideoGameClip.Builder videoGameClip() { return new VideoGameClip.Builder(new HashMap<String,Object>()); }
  /**
   * A food-related business.
   */
  @NotNull public static FoodEstablishment.Builder foodEstablishment() { return new FoodEstablishment.Builder(new HashMap<String,Object>()); }
  /**
   * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates polled from.\n\nRelated actions:\n\n* [[BefriendAction]]: Unlike BefriendAction, FollowAction implies that the connection is *not* necessarily reciprocal.\n* [[SubscribeAction]]: Unlike SubscribeAction, FollowAction implies that the follower acts as an active agent constantly/actively polling for updates.\n* [[RegisterAction]]: Unlike RegisterAction, FollowAction implies that the agent is interested in continuing receiving updates from the object.\n* [[JoinAction]]: Unlike JoinAction, FollowAction implies that the agent is interested in getting updates from the object.\n* [[TrackAction]]: Unlike TrackAction, FollowAction refers to the polling of updates of all aspects of animate objects rather than the location of inanimate objects (e.g. you track a package, but you don't follow it).
   */
  @NotNull public static FollowAction.Builder followAction() { return new FollowAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.
   */
  @NotNull public static BuyAction.Builder buyAction() { return new BuyAction.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value representing a price or price range. Typically, only the subclasses of this type are used for markup. It is recommended to use [[MonetaryAmount]] to describe independent amounts of money such as a salary, credit card limits, etc.
   */
  @NotNull public static PriceSpecification.Builder priceSpecification() { return new PriceSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A sea (for example, the Caspian sea).
   */
  @NotNull public static SeaBodyOfWater.Builder seaBodyOfWater() { return new SeaBodyOfWater.Builder(new HashMap<String,Object>()); }
  /**
   * A notary.
   */
  @NotNull public static Notary.Builder notary() { return new Notary.Builder(new HashMap<String,Object>()); }
  /**
   * The mailing address.
   */
  @NotNull public static PostalAddress.Builder postalAddress() { return new PostalAddress.Builder(new HashMap<String,Object>()); }
  /**
   * A music video file.
   */
  @NotNull public static MusicVideoObject.Builder musicVideoObject() { return new MusicVideoObject.Builder(new HashMap<String,Object>()); }
  /**
   * A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.
   */
  @NotNull public static TypeAndQuantityNode.Builder typeAndQuantityNode() { return new TypeAndQuantityNode.Builder(new HashMap<String,Object>()); }
  /**
   * A Hindu temple.
   */
  @NotNull public static HinduTemple.Builder hinduTemple() { return new HinduTemple.Builder(new HashMap<String,Object>()); }
  /**
   * A reservation for bus travel. \n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
   */
  @NotNull public static BusReservation.Builder busReservation() { return new BusReservation.Builder(new HashMap<String,Object>()); }
  /**
   * The act of producing a painting, typically with paint and canvas as instruments.
   */
  @NotNull public static PaintAction.Builder paintAction() { return new PaintAction.Builder(new HashMap<String,Object>()); }
  /**
   * A park.
   */
  @NotNull public static Park.Builder park() { return new Park.Builder(new HashMap<String,Object>()); }
  /**
   * The act of giving money voluntarily to a beneficiary in recognition of services rendered.
   */
  @NotNull public static TipAction.Builder tipAction() { return new TipAction.Builder(new HashMap<String,Object>()); }
  /**
   * A government building.
   */
  @NotNull public static GovernmentBuilding.Builder governmentBuilding() { return new GovernmentBuilding.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  @NotNull public static UserTweets.Builder userTweets() { return new UserTweets.Builder(new HashMap<String,Object>()); }
  /**
   * The act of forming one's opinion, reaction or sentiment.
   */
  @NotNull public static AssessAction.Builder assessAction() { return new AssessAction.Builder(new HashMap<String,Object>()); }
  /**
   * A shop that sells alcoholic drinks such as wine, beer, whisky and other spirits.
   */
  @NotNull public static LiquorStore.Builder liquorStore() { return new LiquorStore.Builder(new HashMap<String,Object>()); }
  /**
   * A music store.
   */
  @NotNull public static MusicStore.Builder musicStore() { return new MusicStore.Builder(new HashMap<String,Object>()); }
  /**
   * Specifies a location feature by providing a structured value representing a feature of an accommodation as a property-value pair of varying degrees of formality.
   */
  @NotNull public static LocationFeatureSpecification.Builder locationFeatureSpecification() { return new LocationFeatureSpecification.Builder(new HashMap<String,Object>()); }
  /**
   * A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc.
   */
  @NotNull public static TechArticle.Builder techArticle() { return new TechArticle.Builder(new HashMap<String,Object>()); }
  /**
   * The act of applying an object to its intended purpose.
   */
  @NotNull public static UseAction.Builder useAction() { return new UseAction.Builder(new HashMap<String,Object>()); }
  /**
   * Quantity: Duration (use [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601)).
   */
  @NotNull public static Duration.Builder duration() { return new Duration.Builder(new HashMap<String,Object>()); }
  /**
   * A recipe. For dietary restrictions covered by the recipe, a few common restrictions are enumerated via [[suitableForDiet]]. The [[keywords]] property can also be used to add more detail.
   */
  @NotNull public static Recipe.Builder recipe() { return new Recipe.Builder(new HashMap<String,Object>()); }
  /**
   * A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device.
   */
  @NotNull public static VideoGame.Builder videoGame() { return new VideoGame.Builder(new HashMap<String,Object>()); }
  /**
   * The act of providing an object under an agreement that it will be returned at a later date. Reciprocal of BorrowAction.\n\nRelated actions:\n\n* [[BorrowAction]]: Reciprocal of LendAction.
   */
  @NotNull public static LendAction.Builder lendAction() { return new LendAction.Builder(new HashMap<String,Object>()); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  @NotNull public static UserInteraction.Builder userInteraction() { return new UserInteraction.Builder(new HashMap<String,Object>()); }
  /**
   * A series of books. Included books can be indicated with the hasPart property.
   */
  @NotNull public static BookSeries.Builder bookSeries() { return new BookSeries.Builder(new HashMap<String,Object>()); }
  /**
   * The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
   */
  @NotNull public static GeoShape.Builder geoShape() { return new GeoShape.Builder(new HashMap<String,Object>()); }
  /**
   * A page devoted to a single item, such as a particular product or hotel.
   */
  @NotNull public static ItemPage.Builder itemPage() { return new ItemPage.Builder(new HashMap<String,Object>()); }
  /**
   * A travel agency.
   */
  @NotNull public static TravelAgency.Builder travelAgency() { return new TravelAgency.Builder(new HashMap<String,Object>()); }
  /**
   * An educational organization.
   */
  @NotNull public static EducationalOrganization.Builder educationalOrganization() { return new EducationalOrganization.Builder(new HashMap<String,Object>()); }
  /**
   * The act of expressing a desire about the object. An agent wants an object.
   */
  @NotNull public static WantAction.Builder wantAction() { return new WantAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of participating in an exchange of goods and services for monetary compensation. An agent trades an object, product or service with a participant in exchange for a one time or periodic payment.
   */
  @NotNull public static TradeAction.Builder tradeAction() { return new TradeAction.Builder(new HashMap<String,Object>()); }
  /**
   * A service provided by a government organization, e.g. food stamps, veterans benefits, etc.
   */
  @NotNull public static GovernmentService.Builder governmentService() { return new GovernmentService.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Festival.
   */
  @NotNull public static Festival.Builder festival() { return new Festival.Builder(new HashMap<String,Object>()); }
  /**
   * An agent joins an event/group with participants/friends at a location.\n\nRelated actions:\n\n* [[RegisterAction]]: Unlike RegisterAction, JoinAction refers to joining a group/team of people.\n* [[SubscribeAction]]: Unlike SubscribeAction, JoinAction does not imply that you'll be receiving updates.\n* [[FollowAction]]: Unlike FollowAction, JoinAction does not imply that you'll be polling for updates.
   */
  @NotNull public static JoinAction.Builder joinAction() { return new JoinAction.Builder(new HashMap<String,Object>()); }
  /**
   * A business that provide Heating, Ventilation and Air Conditioning services.
   */
  @NotNull public static HVACBusiness.Builder hVACBusiness() { return new HVACBusiness.Builder(new HashMap<String,Object>()); }
  /**
   * Accountancy business.\n\nAs a [[LocalBusiness]] it can be described as a [[provider]] of one or more [[Service]]\(s).
      
   */
  @NotNull public static AccountingService.Builder accountingService() { return new AccountingService.Builder(new HashMap<String,Object>()); }
  /**
   * Entities that have a somewhat fixed, physical extension.
   */
  @NotNull public static Place.Builder place() { return new Place.Builder(new HashMap<String,Object>()); }
  /**
   * A value indicating a steering position.
   */
  @NotNull public static SteeringPositionValue.Builder steeringPositionValue() { return new SteeringPositionValue.Builder(new HashMap<String,Object>()); }
  /**
   * An internet cafe.
   */
  @NotNull public static InternetCafe.Builder internetCafe() { return new InternetCafe.Builder(new HashMap<String,Object>()); }
  /**
   * The act of obtaining an object under an agreement to return it at a later date. Reciprocal of LendAction.\n\nRelated actions:\n\n* [[LendAction]]: Reciprocal of BorrowAction.
   */
  @NotNull public static BorrowAction.Builder borrowAction() { return new BorrowAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of posing a question / favor to someone.\n\nRelated actions:\n\n* [[ReplyAction]]: Appears generally as a response to AskAction.
   */
  @NotNull public static AskAction.Builder askAction() { return new AskAction.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Business event.
   */
  @NotNull public static BusinessEvent.Builder businessEvent() { return new BusinessEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A defence establishment, such as an army or navy base.
   */
  @NotNull public static DefenceEstablishment.Builder defenceEstablishment() { return new DefenceEstablishment.Builder(new HashMap<String,Object>()); }
  /**
   * Event type: Sales event.
   */
  @NotNull public static SaleEvent.Builder saleEvent() { return new SaleEvent.Builder(new HashMap<String,Object>()); }
  /**
   * A taxi stand.
   */
  @NotNull public static TaxiStand.Builder taxiStand() { return new TaxiStand.Builder(new HashMap<String,Object>()); }
  /**
   * A Report generated by governmental or non-governmental organization.
   */
  @NotNull public static Report.Builder report() { return new Report.Builder(new HashMap<String,Object>()); }
  /**
   * The act of consuming audio content.
   */
  @NotNull public static ListenAction.Builder listenAction() { return new ListenAction.Builder(new HashMap<String,Object>()); }
  /**
   * A bookstore.
   */
  @NotNull public static BookStore.Builder bookStore() { return new BookStore.Builder(new HashMap<String,Object>()); }
  /**
   * A toy store.
   */
  @NotNull public static ToyStore.Builder toyStore() { return new ToyStore.Builder(new HashMap<String,Object>()); }
  /**
   * A camping site, campsite, or campground is a place used for overnight stay in the outdoors. In British English a campsite is an area, usually divided into a number of pitches, where people can camp overnight using tents or camper vans or caravans; this British English use of the word is synonymous with the American English expression campground. In American English the term campsite generally means an area where an individual, family, group, or military unit can pitch a tent or parks a camper; a campground may contain many campsites (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Campsite">http://en.wikipedia.org/wiki/Campsite</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  @NotNull public static Campground.Builder campground() { return new Campground.Builder(new HashMap<String,Object>()); }
  /**
   * An auto parts store.
   */
  @NotNull public static AutoPartsStore.Builder autoPartsStore() { return new AutoPartsStore.Builder(new HashMap<String,Object>()); }
  /**
   * A spreadsheet file.
   */
  @NotNull public static SpreadsheetDigitalDocument.Builder spreadsheetDigitalDocument() { return new SpreadsheetDigitalDocument.Builder(new HashMap<String,Object>()); }
  /**
   * Describes a reservation for travel, dining or an event. Some reservations require tickets. \n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use [[Offer]].
   */
  @NotNull public static Reservation.Builder reservation() { return new Reservation.Builder(new HashMap<String,Object>()); }
  /**
   * Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.
   */
  @NotNull public static Product.Builder product() { return new Product.Builder(new HashMap<String,Object>()); }
  /**
   * The act of swallowing liquids.
   */
  @NotNull public static DrinkAction.Builder drinkAction() { return new DrinkAction.Builder(new HashMap<String,Object>()); }
  /**
   * A unique instance of a radio BroadcastService on a CableOrSatelliteService lineup.
   */
  @NotNull public static RadioChannel.Builder radioChannel() { return new RadioChannel.Builder(new HashMap<String,Object>()); }
  /**
   * The act of committing to/adopting an object.\n\nRelated actions:\n\n* [[RejectAction]]: The antonym of AcceptAction.
   */
  @NotNull public static AcceptAction.Builder acceptAction() { return new AcceptAction.Builder(new HashMap<String,Object>()); }
  /**
   * The act of planning the execution of an event/task/action/reservation/plan to a future date.
   */
  @NotNull public static PlanAction.Builder planAction() { return new PlanAction.Builder(new HashMap<String,Object>()); }

  public static ThingBuilder getBuilder(@NotNull String type) {
    if ("CollegeOrUniversity".equals(type)) { return new CollegeOrUniversity.Builder(new HashMap<String,Object>()); }
    if ("WriteAction".equals(type)) { return new WriteAction.Builder(new HashMap<String,Object>()); }
    if ("IssueField".equals(type)) { return new IssueField.Builder(new HashMap<String,Object>()); }
    if ("AllWheelDriveConfiguration".equals(type)) { return new AllWheelDriveConfiguration.Builder(new HashMap<String,Object>()); }
    if ("Dentist".equals(type)) { return new Dentist.Builder(new HashMap<String,Object>()); }
    if ("BusStop".equals(type)) { return new BusStop.Builder(new HashMap<String,Object>()); }
    if ("CancelAction".equals(type)) { return new CancelAction.Builder(new HashMap<String,Object>()); }
    if ("TextDigitalDocument".equals(type)) { return new TextDigitalDocument.Builder(new HashMap<String,Object>()); }
    if ("MenuSection".equals(type)) { return new MenuSection.Builder(new HashMap<String,Object>()); }
    if ("TransferAction".equals(type)) { return new TransferAction.Builder(new HashMap<String,Object>()); }
    if ("ComputerStore".equals(type)) { return new ComputerStore.Builder(new HashMap<String,Object>()); }
    if ("CampingPitch".equals(type)) { return new CampingPitch.Builder(new HashMap<String,Object>()); }
    if ("TVClip".equals(type)) { return new TVClip.Builder(new HashMap<String,Object>()); }
    if ("GardenStore".equals(type)) { return new GardenStore.Builder(new HashMap<String,Object>()); }
    if ("Resort".equals(type)) { return new Resort.Builder(new HashMap<String,Object>()); }
    if ("WearAction".equals(type)) { return new WearAction.Builder(new HashMap<String,Object>()); }
    if ("ClaimReview".equals(type)) { return new ClaimReview.Builder(new HashMap<String,Object>()); }
    if ("ComedyClub".equals(type)) { return new ComedyClub.Builder(new HashMap<String,Object>()); }
    if ("CreativeWork".equals(type)) { return new CreativeWork.Builder(new HashMap<String,Object>()); }
    if ("Demand".equals(type)) { return new Demand.Builder(new HashMap<String,Object>()); }
    if ("ImageGallery".equals(type)) { return new ImageGallery.Builder(new HashMap<String,Object>()); }
    if ("InsertAction".equals(type)) { return new InsertAction.Builder(new HashMap<String,Object>()); }
    if ("VideoGameSeries".equals(type)) { return new VideoGameSeries.Builder(new HashMap<String,Object>()); }
    if ("HomeGoodsStore".equals(type)) { return new HomeGoodsStore.Builder(new HashMap<String,Object>()); }
    if ("Mosque".equals(type)) { return new Mosque.Builder(new HashMap<String,Object>()); }
    if ("OpeningHoursSpecification".equals(type)) { return new OpeningHoursSpecification.Builder(new HashMap<String,Object>()); }
    if ("Church".equals(type)) { return new Church.Builder(new HashMap<String,Object>()); }
    if ("Painting".equals(type)) { return new Painting.Builder(new HashMap<String,Object>()); }
    if ("Car".equals(type)) { return new Car.Builder(new HashMap<String,Object>()); }
    if ("PostOffice".equals(type)) { return new PostOffice.Builder(new HashMap<String,Object>()); }
    if ("ExerciseAction".equals(type)) { return new ExerciseAction.Builder(new HashMap<String,Object>()); }
    if ("Volcano".equals(type)) { return new Volcano.Builder(new HashMap<String,Object>()); }
    if ("CollectionPage".equals(type)) { return new CollectionPage.Builder(new HashMap<String,Object>()); }
    if ("WebSite".equals(type)) { return new WebSite.Builder(new HashMap<String,Object>()); }
    if ("CheckAction".equals(type)) { return new CheckAction.Builder(new HashMap<String,Object>()); }
    if ("EventReservation".equals(type)) { return new EventReservation.Builder(new HashMap<String,Object>()); }
    if ("GeoCoordinates".equals(type)) { return new GeoCoordinates.Builder(new HashMap<String,Object>()); }
    if ("InsuranceAgency".equals(type)) { return new InsuranceAgency.Builder(new HashMap<String,Object>()); }
    if ("DigitalDocumentPermission".equals(type)) { return new DigitalDocumentPermission.Builder(new HashMap<String,Object>()); }
    if ("UserDownloads".equals(type)) { return new UserDownloads.Builder(new HashMap<String,Object>()); }
    if ("Continent".equals(type)) { return new Continent.Builder(new HashMap<String,Object>()); }
    if ("PublicationEvent".equals(type)) { return new PublicationEvent.Builder(new HashMap<String,Object>()); }
    if ("WPFooter".equals(type)) { return new WPFooter.Builder(new HashMap<String,Object>()); }
    if ("Conversation".equals(type)) { return new Conversation.Builder(new HashMap<String,Object>()); }
    if ("ComputerLanguage".equals(type)) { return new ComputerLanguage.Builder(new HashMap<String,Object>()); }
    if ("MusicPlaylist".equals(type)) { return new MusicPlaylist.Builder(new HashMap<String,Object>()); }
    if ("AutoRental".equals(type)) { return new AutoRental.Builder(new HashMap<String,Object>()); }
    if ("BlogPosting".equals(type)) { return new BlogPosting.Builder(new HashMap<String,Object>()); }
    if ("FinancialService".equals(type)) { return new FinancialService.Builder(new HashMap<String,Object>()); }
    if ("PrependAction".equals(type)) { return new PrependAction.Builder(new HashMap<String,Object>()); }
    if ("PoliceStation".equals(type)) { return new PoliceStation.Builder(new HashMap<String,Object>()); }
    if ("ShoppingCenter".equals(type)) { return new ShoppingCenter.Builder(new HashMap<String,Object>()); }
    if ("Role".equals(type)) { return new Role.Builder(new HashMap<String,Object>()); }
    if ("Museum".equals(type)) { return new Museum.Builder(new HashMap<String,Object>()); }
    if ("Movie".equals(type)) { return new Movie.Builder(new HashMap<String,Object>()); }
    if ("RejectAction".equals(type)) { return new RejectAction.Builder(new HashMap<String,Object>()); }
    if ("BedDetails".equals(type)) { return new BedDetails.Builder(new HashMap<String,Object>()); }
    if ("ClothingStore".equals(type)) { return new ClothingStore.Builder(new HashMap<String,Object>()); }
    if ("TheaterGroup".equals(type)) { return new TheaterGroup.Builder(new HashMap<String,Object>()); }
    if ("LeftHandDriving".equals(type)) { return new LeftHandDriving.Builder(new HashMap<String,Object>()); }
    if ("PublicSwimmingPool".equals(type)) { return new PublicSwimmingPool.Builder(new HashMap<String,Object>()); }
    if ("TaxiReservation".equals(type)) { return new TaxiReservation.Builder(new HashMap<String,Object>()); }
    if ("ReturnAction".equals(type)) { return new ReturnAction.Builder(new HashMap<String,Object>()); }
    if ("UpdateAction".equals(type)) { return new UpdateAction.Builder(new HashMap<String,Object>()); }
    if ("MensClothingStore".equals(type)) { return new MensClothingStore.Builder(new HashMap<String,Object>()); }
    if ("FoodEvent".equals(type)) { return new FoodEvent.Builder(new HashMap<String,Object>()); }
    if ("DatedMoneySpecification".equals(type)) { return new DatedMoneySpecification.Builder(new HashMap<String,Object>()); }
    if ("ConsumeAction".equals(type)) { return new ConsumeAction.Builder(new HashMap<String,Object>()); }
    if ("MovieRentalStore".equals(type)) { return new MovieRentalStore.Builder(new HashMap<String,Object>()); }
    if ("Barcode".equals(type)) { return new Barcode.Builder(new HashMap<String,Object>()); }
    if ("HairSalon".equals(type)) { return new HairSalon.Builder(new HashMap<String,Object>()); }
    if ("Room".equals(type)) { return new Room.Builder(new HashMap<String,Object>()); }
    if ("CafeOrCoffeeShop".equals(type)) { return new CafeOrCoffeeShop.Builder(new HashMap<String,Object>()); }
    if ("GoodRelationsTerms".equals(type)) { return new GoodRelationsTerms.Builder(new HashMap<String,Object>()); }
    if ("AutomotiveOntologyWGClass".equals(type)) { return new AutomotiveOntologyWGClass.Builder(new HashMap<String,Object>()); }
    if ("MBZ".equals(type)) { return new MBZ.Builder(new HashMap<String,Object>()); }
    if ("ViewAction".equals(type)) { return new ViewAction.Builder(new HashMap<String,Object>()); }
    if ("InteractionCounter".equals(type)) { return new InteractionCounter.Builder(new HashMap<String,Object>()); }
    if ("OrganizationRole".equals(type)) { return new OrganizationRole.Builder(new HashMap<String,Object>()); }
    if ("InteractAction".equals(type)) { return new InteractAction.Builder(new HashMap<String,Object>()); }
    if ("Issue".equals(type)) { return new Issue.Builder(new HashMap<String,Object>()); }
    if ("HousePainter".equals(type)) { return new HousePainter.Builder(new HashMap<String,Object>()); }
    if ("TrainReservation".equals(type)) { return new TrainReservation.Builder(new HashMap<String,Object>()); }
    if ("SubwayStation".equals(type)) { return new SubwayStation.Builder(new HashMap<String,Object>()); }
    if ("FinancialProduct".equals(type)) { return new FinancialProduct.Builder(new HashMap<String,Object>()); }
    if ("Blog".equals(type)) { return new Blog.Builder(new HashMap<String,Object>()); }
    if ("ExerciseGym".equals(type)) { return new ExerciseGym.Builder(new HashMap<String,Object>()); }
    if ("CityHall".equals(type)) { return new CityHall.Builder(new HashMap<String,Object>()); }
    if ("QuantitativeValue".equals(type)) { return new QuantitativeValue.Builder(new HashMap<String,Object>()); }
    if ("CommunicateAction".equals(type)) { return new CommunicateAction.Builder(new HashMap<String,Object>()); }
    if ("Apartment".equals(type)) { return new Apartment.Builder(new HashMap<String,Object>()); }
    if ("EmploymentAgency".equals(type)) { return new EmploymentAgency.Builder(new HashMap<String,Object>()); }
    if ("UnRegisterAction".equals(type)) { return new UnRegisterAction.Builder(new HashMap<String,Object>()); }
    if ("Invoice".equals(type)) { return new Invoice.Builder(new HashMap<String,Object>()); }
    if ("MusicAlbum".equals(type)) { return new MusicAlbum.Builder(new HashMap<String,Object>()); }
    if ("BuddhistTemple".equals(type)) { return new BuddhistTemple.Builder(new HashMap<String,Object>()); }
    if ("FurnitureStore".equals(type)) { return new FurnitureStore.Builder(new HashMap<String,Object>()); }
    if ("ReviewAction".equals(type)) { return new ReviewAction.Builder(new HashMap<String,Object>()); }
    if ("RentAction".equals(type)) { return new RentAction.Builder(new HashMap<String,Object>()); }
    if ("AutoRepair".equals(type)) { return new AutoRepair.Builder(new HashMap<String,Object>()); }
    if ("RiverBodyOfWater".equals(type)) { return new RiverBodyOfWater.Builder(new HashMap<String,Object>()); }
    if ("SuspendAction".equals(type)) { return new SuspendAction.Builder(new HashMap<String,Object>()); }
    if ("MedicalOrganization".equals(type)) { return new MedicalOrganization.Builder(new HashMap<String,Object>()); }
    if ("ServiceChannel".equals(type)) { return new ServiceChannel.Builder(new HashMap<String,Object>()); }
    if ("SellAction".equals(type)) { return new SellAction.Builder(new HashMap<String,Object>()); }
    if ("UserPlays".equals(type)) { return new UserPlays.Builder(new HashMap<String,Object>()); }
    if ("WholesaleStore".equals(type)) { return new WholesaleStore.Builder(new HashMap<String,Object>()); }
    if ("GovernmentPermit".equals(type)) { return new GovernmentPermit.Builder(new HashMap<String,Object>()); }
    if ("RecyclingCenter".equals(type)) { return new RecyclingCenter.Builder(new HashMap<String,Object>()); }
    if ("FastFoodRestaurant".equals(type)) { return new FastFoodRestaurant.Builder(new HashMap<String,Object>()); }
    if ("SoftwareSourceCode".equals(type)) { return new SoftwareSourceCode.Builder(new HashMap<String,Object>()); }
    if ("Hospital".equals(type)) { return new Hospital.Builder(new HashMap<String,Object>()); }
    if ("IndividualProduct".equals(type)) { return new IndividualProduct.Builder(new HashMap<String,Object>()); }
    if ("RadioSeason".equals(type)) { return new RadioSeason.Builder(new HashMap<String,Object>()); }
    if ("TelevisionStation".equals(type)) { return new TelevisionStation.Builder(new HashMap<String,Object>()); }
    if ("Waterfall".equals(type)) { return new Waterfall.Builder(new HashMap<String,Object>()); }
    if ("BroadcastService".equals(type)) { return new BroadcastService.Builder(new HashMap<String,Object>()); }
    if ("CheckInAction".equals(type)) { return new CheckInAction.Builder(new HashMap<String,Object>()); }
    if ("MarryAction".equals(type)) { return new MarryAction.Builder(new HashMap<String,Object>()); }
    if ("Cemetery".equals(type)) { return new Cemetery.Builder(new HashMap<String,Object>()); }
    if ("PerformingGroup".equals(type)) { return new PerformingGroup.Builder(new HashMap<String,Object>()); }
    if ("Sculpture".equals(type)) { return new Sculpture.Builder(new HashMap<String,Object>()); }
    if ("CreateAction".equals(type)) { return new CreateAction.Builder(new HashMap<String,Object>()); }
    if ("NoteDigitalDocument".equals(type)) { return new NoteDigitalDocument.Builder(new HashMap<String,Object>()); }
    if ("AdministrativeArea".equals(type)) { return new AdministrativeArea.Builder(new HashMap<String,Object>()); }
    if ("PropertyValue".equals(type)) { return new PropertyValue.Builder(new HashMap<String,Object>()); }
    if ("Periodical".equals(type)) { return new Periodical.Builder(new HashMap<String,Object>()); }
    if ("FourWheelDriveConfiguration".equals(type)) { return new FourWheelDriveConfiguration.Builder(new HashMap<String,Object>()); }
    if ("EndorseAction".equals(type)) { return new EndorseAction.Builder(new HashMap<String,Object>()); }
    if ("Rating".equals(type)) { return new Rating.Builder(new HashMap<String,Object>()); }
    if ("LakeBodyOfWater".equals(type)) { return new LakeBodyOfWater.Builder(new HashMap<String,Object>()); }
    if ("GasStation".equals(type)) { return new GasStation.Builder(new HashMap<String,Object>()); }
    if ("GovernmentOffice".equals(type)) { return new GovernmentOffice.Builder(new HashMap<String,Object>()); }
    if ("LodgingBusiness".equals(type)) { return new LodgingBusiness.Builder(new HashMap<String,Object>()); }
    if ("GeneralContractor".equals(type)) { return new GeneralContractor.Builder(new HashMap<String,Object>()); }
    if ("ArtGallery".equals(type)) { return new ArtGallery.Builder(new HashMap<String,Object>()); }
    if ("DownloadAction".equals(type)) { return new DownloadAction.Builder(new HashMap<String,Object>()); }
    if ("ParcelDelivery".equals(type)) { return new ParcelDelivery.Builder(new HashMap<String,Object>()); }
    if ("Language".equals(type)) { return new Language.Builder(new HashMap<String,Object>()); }
    if ("VisualArtsEvent".equals(type)) { return new VisualArtsEvent.Builder(new HashMap<String,Object>()); }
    if ("Library".equals(type)) { return new Library.Builder(new HashMap<String,Object>()); }
    if ("TrackAction".equals(type)) { return new TrackAction.Builder(new HashMap<String,Object>()); }
    if ("MoveAction".equals(type)) { return new MoveAction.Builder(new HashMap<String,Object>()); }
    if ("ApartmentComplex".equals(type)) { return new ApartmentComplex.Builder(new HashMap<String,Object>()); }
    if ("Locksmith".equals(type)) { return new Locksmith.Builder(new HashMap<String,Object>()); }
    if ("TelevisionChannel".equals(type)) { return new TelevisionChannel.Builder(new HashMap<String,Object>()); }
    if ("QAPage".equals(type)) { return new QAPage.Builder(new HashMap<String,Object>()); }
    if ("ProgramMembership".equals(type)) { return new ProgramMembership.Builder(new HashMap<String,Object>()); }
    if ("ControlAction".equals(type)) { return new ControlAction.Builder(new HashMap<String,Object>()); }
    if ("Mountain".equals(type)) { return new Mountain.Builder(new HashMap<String,Object>()); }
    if ("PublicationVolume".equals(type)) { return new PublicationVolume.Builder(new HashMap<String,Object>()); }
    if ("TireShop".equals(type)) { return new TireShop.Builder(new HashMap<String,Object>()); }
    if ("BroadcastEvent".equals(type)) { return new BroadcastEvent.Builder(new HashMap<String,Object>()); }
    if ("BarOrPub".equals(type)) { return new BarOrPub.Builder(new HashMap<String,Object>()); }
    if ("BusTrip".equals(type)) { return new BusTrip.Builder(new HashMap<String,Object>()); }
    if ("SkiResort".equals(type)) { return new SkiResort.Builder(new HashMap<String,Object>()); }
    if ("GiveAction".equals(type)) { return new GiveAction.Builder(new HashMap<String,Object>()); }
    if ("ScheduleAction".equals(type)) { return new ScheduleAction.Builder(new HashMap<String,Object>()); }
    if ("FoodService".equals(type)) { return new FoodService.Builder(new HashMap<String,Object>()); }
    if ("Article".equals(type)) { return new Article.Builder(new HashMap<String,Object>()); }
    if ("BookmarkAction".equals(type)) { return new BookmarkAction.Builder(new HashMap<String,Object>()); }
    if ("PlaceOfWorship".equals(type)) { return new PlaceOfWorship.Builder(new HashMap<String,Object>()); }
    if ("State".equals(type)) { return new State.Builder(new HashMap<String,Object>()); }
    if ("ProfessionalService".equals(type)) { return new ProfessionalService.Builder(new HashMap<String,Object>()); }
    if ("CompoundPriceSpecification".equals(type)) { return new CompoundPriceSpecification.Builder(new HashMap<String,Object>()); }
    if ("SiteNavigationElement".equals(type)) { return new SiteNavigationElement.Builder(new HashMap<String,Object>()); }
    if ("CookAction".equals(type)) { return new CookAction.Builder(new HashMap<String,Object>()); }
    if ("Thing".equals(type)) { return new Thing.Builder(new HashMap<String,Object>()); }
    if ("ImageObject".equals(type)) { return new ImageObject.Builder(new HashMap<String,Object>()); }
    if ("ActivateAction".equals(type)) { return new ActivateAction.Builder(new HashMap<String,Object>()); }
    if ("SportsTeam".equals(type)) { return new SportsTeam.Builder(new HashMap<String,Object>()); }
    if ("EventVenue".equals(type)) { return new EventVenue.Builder(new HashMap<String,Object>()); }
    if ("CourseInstance".equals(type)) { return new CourseInstance.Builder(new HashMap<String,Object>()); }
    if ("NewsArticle".equals(type)) { return new NewsArticle.Builder(new HashMap<String,Object>()); }
    if ("Corporation".equals(type)) { return new Corporation.Builder(new HashMap<String,Object>()); }
    if ("SportsActivityLocation".equals(type)) { return new SportsActivityLocation.Builder(new HashMap<String,Object>()); }
    if ("Airport".equals(type)) { return new Airport.Builder(new HashMap<String,Object>()); }
    if ("Seat".equals(type)) { return new Seat.Builder(new HashMap<String,Object>()); }
    if ("OfficeEquipmentStore".equals(type)) { return new OfficeEquipmentStore.Builder(new HashMap<String,Object>()); }
    if ("PaymentService".equals(type)) { return new PaymentService.Builder(new HashMap<String,Object>()); }
    if ("DepositAccount".equals(type)) { return new DepositAccount.Builder(new HashMap<String,Object>()); }
    if ("MonetaryAmount".equals(type)) { return new MonetaryAmount.Builder(new HashMap<String,Object>()); }
    if ("ArriveAction".equals(type)) { return new ArriveAction.Builder(new HashMap<String,Object>()); }
    if ("Code".equals(type)) { return new Code.Builder(new HashMap<String,Object>()); }
    if ("OwnershipInfo".equals(type)) { return new OwnershipInfo.Builder(new HashMap<String,Object>()); }
    if ("AmusementPark".equals(type)) { return new AmusementPark.Builder(new HashMap<String,Object>()); }
    if ("Accommodation".equals(type)) { return new Accommodation.Builder(new HashMap<String,Object>()); }
    if ("Restaurant".equals(type)) { return new Restaurant.Builder(new HashMap<String,Object>()); }
    if ("RadioSeries".equals(type)) { return new RadioSeries.Builder(new HashMap<String,Object>()); }
    if ("MovieTheater".equals(type)) { return new MovieTheater.Builder(new HashMap<String,Object>()); }
    if ("ConvenienceStore".equals(type)) { return new ConvenienceStore.Builder(new HashMap<String,Object>()); }
    if ("Reservoir".equals(type)) { return new Reservoir.Builder(new HashMap<String,Object>()); }
    if ("OrganizeAction".equals(type)) { return new OrganizeAction.Builder(new HashMap<String,Object>()); }
    if ("DepartAction".equals(type)) { return new DepartAction.Builder(new HashMap<String,Object>()); }
    if ("Ticket".equals(type)) { return new Ticket.Builder(new HashMap<String,Object>()); }
    if ("HardwareStore".equals(type)) { return new HardwareStore.Builder(new HashMap<String,Object>()); }
    if ("SocialMediaPosting".equals(type)) { return new SocialMediaPosting.Builder(new HashMap<String,Object>()); }
    if ("PresentationDigitalDocument".equals(type)) { return new PresentationDigitalDocument.Builder(new HashMap<String,Object>()); }
    if ("SendAction".equals(type)) { return new SendAction.Builder(new HashMap<String,Object>()); }
    if ("OnDemandEvent".equals(type)) { return new OnDemandEvent.Builder(new HashMap<String,Object>()); }
    if ("BibExTerm".equals(type)) { return new BibExTerm.Builder(new HashMap<String,Object>()); }
    if ("DiscussionForumPosting".equals(type)) { return new DiscussionForumPosting.Builder(new HashMap<String,Object>()); }
    if ("Pharmacy".equals(type)) { return new Pharmacy.Builder(new HashMap<String,Object>()); }
    if ("MovieSeries".equals(type)) { return new MovieSeries.Builder(new HashMap<String,Object>()); }
    if ("DigitalDocument".equals(type)) { return new DigitalDocument.Builder(new HashMap<String,Object>()); }
    if ("RegisterAction".equals(type)) { return new RegisterAction.Builder(new HashMap<String,Object>()); }
    if ("FIBO".equals(type)) { return new FIBO.Builder(new HashMap<String,Object>()); }
    if ("LandmarksOrHistoricalBuildings".equals(type)) { return new LandmarksOrHistoricalBuildings.Builder(new HashMap<String,Object>()); }
    if ("ExhibitionEvent".equals(type)) { return new ExhibitionEvent.Builder(new HashMap<String,Object>()); }
    if ("WebPage".equals(type)) { return new WebPage.Builder(new HashMap<String,Object>()); }
    if ("ListItem".equals(type)) { return new ListItem.Builder(new HashMap<String,Object>()); }
    if ("RsvpAction".equals(type)) { return new RsvpAction.Builder(new HashMap<String,Object>()); }
    if ("AnimalShelter".equals(type)) { return new AnimalShelter.Builder(new HashMap<String,Object>()); }
    if ("Crematorium".equals(type)) { return new Crematorium.Builder(new HashMap<String,Object>()); }
    if ("UserCheckins".equals(type)) { return new UserCheckins.Builder(new HashMap<String,Object>()); }
    if ("WebPageElement".equals(type)) { return new WebPageElement.Builder(new HashMap<String,Object>()); }
    if ("ReserveAction".equals(type)) { return new ReserveAction.Builder(new HashMap<String,Object>()); }
    if ("MovieClip".equals(type)) { return new MovieClip.Builder(new HashMap<String,Object>()); }
    if ("OrderAction".equals(type)) { return new OrderAction.Builder(new HashMap<String,Object>()); }
    if ("DiscoverAction".equals(type)) { return new DiscoverAction.Builder(new HashMap<String,Object>()); }
    if ("ContactPage".equals(type)) { return new ContactPage.Builder(new HashMap<String,Object>()); }
    if ("AllocateAction".equals(type)) { return new AllocateAction.Builder(new HashMap<String,Object>()); }
    if ("Country".equals(type)) { return new Country.Builder(new HashMap<String,Object>()); }
    if ("AutoBodyShop".equals(type)) { return new AutoBodyShop.Builder(new HashMap<String,Object>()); }
    if ("DataCatalog".equals(type)) { return new DataCatalog.Builder(new HashMap<String,Object>()); }
    if ("OrderItem".equals(type)) { return new OrderItem.Builder(new HashMap<String,Object>()); }
    if ("StructuredValue".equals(type)) { return new StructuredValue.Builder(new HashMap<String,Object>()); }
    if ("InvestmentOrDeposit".equals(type)) { return new InvestmentOrDeposit.Builder(new HashMap<String,Object>()); }
    if ("Landform".equals(type)) { return new Landform.Builder(new HashMap<String,Object>()); }
    if ("CreativeWorkSeries".equals(type)) { return new CreativeWorkSeries.Builder(new HashMap<String,Object>()); }
    if ("CatholicChurch".equals(type)) { return new CatholicChurch.Builder(new HashMap<String,Object>()); }
    if ("SoftwareApplication".equals(type)) { return new SoftwareApplication.Builder(new HashMap<String,Object>()); }
    if ("AuthorizeAction".equals(type)) { return new AuthorizeAction.Builder(new HashMap<String,Object>()); }
    if ("TVSeason".equals(type)) { return new TVSeason.Builder(new HashMap<String,Object>()); }
    if ("WinAction".equals(type)) { return new WinAction.Builder(new HashMap<String,Object>()); }
    if ("EntertainmentBusiness".equals(type)) { return new EntertainmentBusiness.Builder(new HashMap<String,Object>()); }
    if ("Episode".equals(type)) { return new Episode.Builder(new HashMap<String,Object>()); }
    if ("GatedResidenceCommunity".equals(type)) { return new GatedResidenceCommunity.Builder(new HashMap<String,Object>()); }
    if ("HobbyShop".equals(type)) { return new HobbyShop.Builder(new HashMap<String,Object>()); }
    if ("AdultEntertainment".equals(type)) { return new AdultEntertainment.Builder(new HashMap<String,Object>()); }
    if ("STIAccommodationOntology".equals(type)) { return new STIAccommodationOntology.Builder(new HashMap<String,Object>()); }
    if ("CheckOutAction".equals(type)) { return new CheckOutAction.Builder(new HashMap<String,Object>()); }
    if ("VideoGallery".equals(type)) { return new VideoGallery.Builder(new HashMap<String,Object>()); }
    if ("ParkingFacility".equals(type)) { return new ParkingFacility.Builder(new HashMap<String,Object>()); }
    if ("AutomotiveBusiness".equals(type)) { return new AutomotiveBusiness.Builder(new HashMap<String,Object>()); }
    if ("NGO".equals(type)) { return new NGO.Builder(new HashMap<String,Object>()); }
    if ("RadioEpisode".equals(type)) { return new RadioEpisode.Builder(new HashMap<String,Object>()); }
    if ("TouristInformationCenter".equals(type)) { return new TouristInformationCenter.Builder(new HashMap<String,Object>()); }
    if ("RadioStation".equals(type)) { return new RadioStation.Builder(new HashMap<String,Object>()); }
    if ("Game".equals(type)) { return new Game.Builder(new HashMap<String,Object>()); }
    if ("Beach".equals(type)) { return new Beach.Builder(new HashMap<String,Object>()); }
    if ("UserBlocks".equals(type)) { return new UserBlocks.Builder(new HashMap<String,Object>()); }
    if ("Photograph".equals(type)) { return new Photograph.Builder(new HashMap<String,Object>()); }
    if ("EducationalAudience".equals(type)) { return new EducationalAudience.Builder(new HashMap<String,Object>()); }
    if ("Vehicle".equals(type)) { return new Vehicle.Builder(new HashMap<String,Object>()); }
    if ("EmergencyService".equals(type)) { return new EmergencyService.Builder(new HashMap<String,Object>()); }
    if ("BefriendAction".equals(type)) { return new BefriendAction.Builder(new HashMap<String,Object>()); }
    if ("AddAction".equals(type)) { return new AddAction.Builder(new HashMap<String,Object>()); }
    if ("HomeAndConstructionBusiness".equals(type)) { return new HomeAndConstructionBusiness.Builder(new HashMap<String,Object>()); }
    if ("WarrantyPromise".equals(type)) { return new WarrantyPromise.Builder(new HashMap<String,Object>()); }
    if ("SourceCodeReview".equals(type)) { return new SourceCodeReview.Builder(new HashMap<String,Object>()); }
    if ("ProfilePage".equals(type)) { return new ProfilePage.Builder(new HashMap<String,Object>()); }
    if ("MusicRecording".equals(type)) { return new MusicRecording.Builder(new HashMap<String,Object>()); }
    if ("DeliveryChargeSpecification".equals(type)) { return new DeliveryChargeSpecification.Builder(new HashMap<String,Object>()); }
    if ("HealthClub".equals(type)) { return new HealthClub.Builder(new HashMap<String,Object>()); }
    if ("Attorney".equals(type)) { return new Attorney.Builder(new HashMap<String,Object>()); }
    if ("StadiumOrArena".equals(type)) { return new StadiumOrArena.Builder(new HashMap<String,Object>()); }
    if ("EatAction".equals(type)) { return new EatAction.Builder(new HashMap<String,Object>()); }
    if ("Map".equals(type)) { return new Map.Builder(new HashMap<String,Object>()); }
    if ("Season".equals(type)) { return new Season.Builder(new HashMap<String,Object>()); }
    if ("FlightReservation".equals(type)) { return new FlightReservation.Builder(new HashMap<String,Object>()); }
    if ("SourceCodeRevision".equals(type)) { return new SourceCodeRevision.Builder(new HashMap<String,Object>()); }
    if ("PublicationIssue".equals(type)) { return new PublicationIssue.Builder(new HashMap<String,Object>()); }
    if ("ShoeStore".equals(type)) { return new ShoeStore.Builder(new HashMap<String,Object>()); }
    if ("SocialEvent".equals(type)) { return new SocialEvent.Builder(new HashMap<String,Object>()); }
    if ("PawnShop".equals(type)) { return new PawnShop.Builder(new HashMap<String,Object>()); }
    if ("Event".equals(type)) { return new Event.Builder(new HashMap<String,Object>()); }
    if ("BodyOfWater".equals(type)) { return new BodyOfWater.Builder(new HashMap<String,Object>()); }
    if ("ProductModel".equals(type)) { return new ProductModel.Builder(new HashMap<String,Object>()); }
    if ("MusicEvent".equals(type)) { return new MusicEvent.Builder(new HashMap<String,Object>()); }
    if ("BroadcastChannel".equals(type)) { return new BroadcastChannel.Builder(new HashMap<String,Object>()); }
    if ("DataFeed".equals(type)) { return new DataFeed.Builder(new HashMap<String,Object>()); }
    if ("LoseAction".equals(type)) { return new LoseAction.Builder(new HashMap<String,Object>()); }
    if ("CreditCard".equals(type)) { return new CreditCard.Builder(new HashMap<String,Object>()); }
    if ("DataDownload".equals(type)) { return new DataDownload.Builder(new HashMap<String,Object>()); }
    if ("ReactAction".equals(type)) { return new ReactAction.Builder(new HashMap<String,Object>()); }
    if ("Hotel".equals(type)) { return new Hotel.Builder(new HashMap<String,Object>()); }
    if ("ResumeAction".equals(type)) { return new ResumeAction.Builder(new HashMap<String,Object>()); }
    if ("DepartmentStore".equals(type)) { return new DepartmentStore.Builder(new HashMap<String,Object>()); }
    if ("OceanBodyOfWater".equals(type)) { return new OceanBodyOfWater.Builder(new HashMap<String,Object>()); }
    if ("BowlingAlley".equals(type)) { return new BowlingAlley.Builder(new HashMap<String,Object>()); }
    if ("Aquarium".equals(type)) { return new Aquarium.Builder(new HashMap<String,Object>()); }
    if ("PetStore".equals(type)) { return new PetStore.Builder(new HashMap<String,Object>()); }
    if ("DeleteAction".equals(type)) { return new DeleteAction.Builder(new HashMap<String,Object>()); }
    if ("Energy".equals(type)) { return new Energy.Builder(new HashMap<String,Object>()); }
    if ("School".equals(type)) { return new School.Builder(new HashMap<String,Object>()); }
    if ("Book".equals(type)) { return new Book.Builder(new HashMap<String,Object>()); }
    if ("ChooseAction".equals(type)) { return new ChooseAction.Builder(new HashMap<String,Object>()); }
    if ("AutoDealer".equals(type)) { return new AutoDealer.Builder(new HashMap<String,Object>()); }
    if ("LiteraryEvent".equals(type)) { return new LiteraryEvent.Builder(new HashMap<String,Object>()); }
    if ("WebApplication".equals(type)) { return new WebApplication.Builder(new HashMap<String,Object>()); }
    if ("GroceryStore".equals(type)) { return new GroceryStore.Builder(new HashMap<String,Object>()); }
    if ("NailSalon".equals(type)) { return new NailSalon.Builder(new HashMap<String,Object>()); }
    if ("FilmAction".equals(type)) { return new FilmAction.Builder(new HashMap<String,Object>()); }
    if ("AchieveAction".equals(type)) { return new AchieveAction.Builder(new HashMap<String,Object>()); }
    if ("ApplyAction".equals(type)) { return new ApplyAction.Builder(new HashMap<String,Object>()); }
    if ("Canal".equals(type)) { return new Canal.Builder(new HashMap<String,Object>()); }
    if ("Residence".equals(type)) { return new Residence.Builder(new HashMap<String,Object>()); }
    if ("City".equals(type)) { return new City.Builder(new HashMap<String,Object>()); }
    if ("UserPageVisits".equals(type)) { return new UserPageVisits.Builder(new HashMap<String,Object>()); }
    if ("ShareAction".equals(type)) { return new ShareAction.Builder(new HashMap<String,Object>()); }
    if ("Store".equals(type)) { return new Store.Builder(new HashMap<String,Object>()); }
    if ("GovernmentOrganization".equals(type)) { return new GovernmentOrganization.Builder(new HashMap<String,Object>()); }
    if ("LodgingReservation".equals(type)) { return new LodgingReservation.Builder(new HashMap<String,Object>()); }
    if ("EntryPoint".equals(type)) { return new EntryPoint.Builder(new HashMap<String,Object>()); }
    if ("VisualArtwork".equals(type)) { return new VisualArtwork.Builder(new HashMap<String,Object>()); }
    if ("PayAction".equals(type)) { return new PayAction.Builder(new HashMap<String,Object>()); }
    if ("ChildrensEvent".equals(type)) { return new ChildrensEvent.Builder(new HashMap<String,Object>()); }
    if ("OfferCatalog".equals(type)) { return new OfferCatalog.Builder(new HashMap<String,Object>()); }
    if ("MusicVenue".equals(type)) { return new MusicVenue.Builder(new HashMap<String,Object>()); }
    if ("AgreeAction".equals(type)) { return new AgreeAction.Builder(new HashMap<String,Object>()); }
    if ("CurrencyConversionService".equals(type)) { return new CurrencyConversionService.Builder(new HashMap<String,Object>()); }
    if ("ChildCare".equals(type)) { return new ChildCare.Builder(new HashMap<String,Object>()); }
    if ("CheckoutPage".equals(type)) { return new CheckoutPage.Builder(new HashMap<String,Object>()); }
    if ("WikiDoc".equals(type)) { return new WikiDoc.Builder(new HashMap<String,Object>()); }
    if ("Brewery".equals(type)) { return new Brewery.Builder(new HashMap<String,Object>()); }
    if ("Zoo".equals(type)) { return new Zoo.Builder(new HashMap<String,Object>()); }
    if ("SportsEvent".equals(type)) { return new SportsEvent.Builder(new HashMap<String,Object>()); }
    if ("ReplaceAction".equals(type)) { return new ReplaceAction.Builder(new HashMap<String,Object>()); }
    if ("BankAccount".equals(type)) { return new BankAccount.Builder(new HashMap<String,Object>()); }
    if ("ReadAction".equals(type)) { return new ReadAction.Builder(new HashMap<String,Object>()); }
    if ("MusicComposition".equals(type)) { return new MusicComposition.Builder(new HashMap<String,Object>()); }
    if ("House".equals(type)) { return new House.Builder(new HashMap<String,Object>()); }
    if ("SearchAction".equals(type)) { return new SearchAction.Builder(new HashMap<String,Object>()); }
    if ("RoofingContractor".equals(type)) { return new RoofingContractor.Builder(new HashMap<String,Object>()); }
    if ("Order".equals(type)) { return new Order.Builder(new HashMap<String,Object>()); }
    if ("Embassy".equals(type)) { return new Embassy.Builder(new HashMap<String,Object>()); }
    if ("SportingGoodsStore".equals(type)) { return new SportingGoodsStore.Builder(new HashMap<String,Object>()); }
    if ("TravelAction".equals(type)) { return new TravelAction.Builder(new HashMap<String,Object>()); }
    if ("HotelRoom".equals(type)) { return new HotelRoom.Builder(new HashMap<String,Object>()); }
    if ("WPHeader".equals(type)) { return new WPHeader.Builder(new HashMap<String,Object>()); }
    if ("BusinessAudience".equals(type)) { return new BusinessAudience.Builder(new HashMap<String,Object>()); }
    if ("DatasetClass".equals(type)) { return new DatasetClass.Builder(new HashMap<String,Object>()); }
    if ("JobPosting".equals(type)) { return new JobPosting.Builder(new HashMap<String,Object>()); }
    if ("Motel".equals(type)) { return new Motel.Builder(new HashMap<String,Object>()); }
    if ("SportsOrganization".equals(type)) { return new SportsOrganization.Builder(new HashMap<String,Object>()); }
    if ("DeactivateAction".equals(type)) { return new DeactivateAction.Builder(new HashMap<String,Object>()); }
    if ("UserLikes".equals(type)) { return new UserLikes.Builder(new HashMap<String,Object>()); }
    if ("ParentAudience".equals(type)) { return new ParentAudience.Builder(new HashMap<String,Object>()); }
    if ("HighSchool".equals(type)) { return new HighSchool.Builder(new HashMap<String,Object>()); }
    if ("Distance".equals(type)) { return new Distance.Builder(new HashMap<String,Object>()); }
    if ("DonateAction".equals(type)) { return new DonateAction.Builder(new HashMap<String,Object>()); }
    if ("StackExchange".equals(type)) { return new StackExchange.Builder(new HashMap<String,Object>()); }
    if ("GolfCourse".equals(type)) { return new GolfCourse.Builder(new HashMap<String,Object>()); }
    if ("MobilePhoneStore".equals(type)) { return new MobilePhoneStore.Builder(new HashMap<String,Object>()); }
    if ("SomeProducts".equals(type)) { return new SomeProducts.Builder(new HashMap<String,Object>()); }
    if ("ContactPoint".equals(type)) { return new ContactPoint.Builder(new HashMap<String,Object>()); }
    if ("SportsClub".equals(type)) { return new SportsClub.Builder(new HashMap<String,Object>()); }
    if ("PerformAction".equals(type)) { return new PerformAction.Builder(new HashMap<String,Object>()); }
    if ("DanceGroup".equals(type)) { return new DanceGroup.Builder(new HashMap<String,Object>()); }
    if ("LegislativeBuilding".equals(type)) { return new LegislativeBuilding.Builder(new HashMap<String,Object>()); }
    if ("Course".equals(type)) { return new Course.Builder(new HashMap<String,Object>()); }
    if ("SoftwareApplicationBuild".equals(type)) { return new SoftwareApplicationBuild.Builder(new HashMap<String,Object>()); }
    if ("InformAction".equals(type)) { return new InformAction.Builder(new HashMap<String,Object>()); }
    if ("EducationEvent".equals(type)) { return new EducationEvent.Builder(new HashMap<String,Object>()); }
    if ("FireStation".equals(type)) { return new FireStation.Builder(new HashMap<String,Object>()); }
    if ("RNews".equals(type)) { return new RNews.Builder(new HashMap<String,Object>()); }
    if ("EngineSpecification".equals(type)) { return new EngineSpecification.Builder(new HashMap<String,Object>()); }
    if ("Flight".equals(type)) { return new Flight.Builder(new HashMap<String,Object>()); }
    if ("Intangible".equals(type)) { return new Intangible.Builder(new HashMap<String,Object>()); }
    if ("RightHandDriving".equals(type)) { return new RightHandDriving.Builder(new HashMap<String,Object>()); }
    if ("ReplyAction".equals(type)) { return new ReplyAction.Builder(new HashMap<String,Object>()); }
    if ("SubscribeAction".equals(type)) { return new SubscribeAction.Builder(new HashMap<String,Object>()); }
    if ("Physician".equals(type)) { return new Physician.Builder(new HashMap<String,Object>()); }
    if ("APIReference".equals(type)) { return new APIReference.Builder(new HashMap<String,Object>()); }
    if ("EmailMessage".equals(type)) { return new EmailMessage.Builder(new HashMap<String,Object>()); }
    if ("Suite".equals(type)) { return new Suite.Builder(new HashMap<String,Object>()); }
    if ("PropertyValueSpecification".equals(type)) { return new PropertyValueSpecification.Builder(new HashMap<String,Object>()); }
    if ("ScreeningEvent".equals(type)) { return new ScreeningEvent.Builder(new HashMap<String,Object>()); }
    if ("OutletStore".equals(type)) { return new OutletStore.Builder(new HashMap<String,Object>()); }
    if ("WatchAction".equals(type)) { return new WatchAction.Builder(new HashMap<String,Object>()); }
    if ("IgnoreAction".equals(type)) { return new IgnoreAction.Builder(new HashMap<String,Object>()); }
    if ("UnitPriceSpecification".equals(type)) { return new UnitPriceSpecification.Builder(new HashMap<String,Object>()); }
    if ("Series".equals(type)) { return new Series.Builder(new HashMap<String,Object>()); }
    if ("DriveWheelConfigurationValue".equals(type)) { return new DriveWheelConfigurationValue.Builder(new HashMap<String,Object>()); }
    if ("Hostel".equals(type)) { return new Hostel.Builder(new HashMap<String,Object>()); }
    if ("ScholarlyArticle".equals(type)) { return new ScholarlyArticle.Builder(new HashMap<String,Object>()); }
    if ("WPAdBlock".equals(type)) { return new WPAdBlock.Builder(new HashMap<String,Object>()); }
    if ("BikeStore".equals(type)) { return new BikeStore.Builder(new HashMap<String,Object>()); }
    if ("NightClub".equals(type)) { return new NightClub.Builder(new HashMap<String,Object>()); }
    if ("Pond".equals(type)) { return new Pond.Builder(new HashMap<String,Object>()); }
    if ("TVSeries".equals(type)) { return new TVSeries.Builder(new HashMap<String,Object>()); }
    if ("CreativeWorkSeason".equals(type)) { return new CreativeWorkSeason.Builder(new HashMap<String,Object>()); }
    if ("BankOrCreditUnion".equals(type)) { return new BankOrCreditUnion.Builder(new HashMap<String,Object>()); }
    if ("RealEstateAgent".equals(type)) { return new RealEstateAgent.Builder(new HashMap<String,Object>()); }
    if ("ElectronicsStore".equals(type)) { return new ElectronicsStore.Builder(new HashMap<String,Object>()); }
    if ("RearWheelDriveConfiguration".equals(type)) { return new RearWheelDriveConfiguration.Builder(new HashMap<String,Object>()); }
    if ("HealthAndBeautyBusiness".equals(type)) { return new HealthAndBeautyBusiness.Builder(new HashMap<String,Object>()); }
    if ("Researcher".equals(type)) { return new Researcher.Builder(new HashMap<String,Object>()); }
    if ("VoteAction".equals(type)) { return new VoteAction.Builder(new HashMap<String,Object>()); }
    if ("Project".equals(type)) { return new Project.Builder(new HashMap<String,Object>()); }
    if ("RadioClip".equals(type)) { return new RadioClip.Builder(new HashMap<String,Object>()); }
    if ("VideoObject".equals(type)) { return new VideoObject.Builder(new HashMap<String,Object>()); }
    if ("Permit".equals(type)) { return new Permit.Builder(new HashMap<String,Object>()); }
    if ("Comment".equals(type)) { return new Comment.Builder(new HashMap<String,Object>()); }
    if ("GeoCircle".equals(type)) { return new GeoCircle.Builder(new HashMap<String,Object>()); }
    if ("DeliveryEvent".equals(type)) { return new DeliveryEvent.Builder(new HashMap<String,Object>()); }
    if ("FindAction".equals(type)) { return new FindAction.Builder(new HashMap<String,Object>()); }
    if ("BeautySalon".equals(type)) { return new BeautySalon.Builder(new HashMap<String,Object>()); }
    if ("BedAndBreakfast".equals(type)) { return new BedAndBreakfast.Builder(new HashMap<String,Object>()); }
    if ("AboutPage".equals(type)) { return new AboutPage.Builder(new HashMap<String,Object>()); }
    if ("MiddleSchool".equals(type)) { return new MiddleSchool.Builder(new HashMap<String,Object>()); }
    if ("Organization".equals(type)) { return new Organization.Builder(new HashMap<String,Object>()); }
    if ("Synagogue".equals(type)) { return new Synagogue.Builder(new HashMap<String,Object>()); }
    if ("AutomatedTeller".equals(type)) { return new AutomatedTeller.Builder(new HashMap<String,Object>()); }
    if ("DataFeedItem".equals(type)) { return new DataFeedItem.Builder(new HashMap<String,Object>()); }
    if ("QualitativeValue".equals(type)) { return new QualitativeValue.Builder(new HashMap<String,Object>()); }
    if ("GLEIF".equals(type)) { return new GLEIF.Builder(new HashMap<String,Object>()); }
    if ("AggregateRating".equals(type)) { return new AggregateRating.Builder(new HashMap<String,Object>()); }
    if ("AlignmentObject".equals(type)) { return new AlignmentObject.Builder(new HashMap<String,Object>()); }
    if ("PerformingArtsTheater".equals(type)) { return new PerformingArtsTheater.Builder(new HashMap<String,Object>()); }
    if ("RentalCarReservation".equals(type)) { return new RentalCarReservation.Builder(new HashMap<String,Object>()); }
    if ("MotorcycleRepair".equals(type)) { return new MotorcycleRepair.Builder(new HashMap<String,Object>()); }
    if ("ElementarySchool".equals(type)) { return new ElementarySchool.Builder(new HashMap<String,Object>()); }
    if ("SearchResultsPage".equals(type)) { return new SearchResultsPage.Builder(new HashMap<String,Object>()); }
    if ("Winery".equals(type)) { return new Winery.Builder(new HashMap<String,Object>()); }
    if ("AggregateOffer".equals(type)) { return new AggregateOffer.Builder(new HashMap<String,Object>()); }
    if ("Action".equals(type)) { return new Action.Builder(new HashMap<String,Object>()); }
    if ("DrawAction".equals(type)) { return new DrawAction.Builder(new HashMap<String,Object>()); }
    if ("DislikeAction".equals(type)) { return new DislikeAction.Builder(new HashMap<String,Object>()); }
    if ("Bridge".equals(type)) { return new Bridge.Builder(new HashMap<String,Object>()); }
    if ("LegalService".equals(type)) { return new LegalService.Builder(new HashMap<String,Object>()); }
    if ("Mass".equals(type)) { return new Mass.Builder(new HashMap<String,Object>()); }
    if ("LRMIClass".equals(type)) { return new LRMIClass.Builder(new HashMap<String,Object>()); }
    if ("MusicGroup".equals(type)) { return new MusicGroup.Builder(new HashMap<String,Object>()); }
    if ("MeetingRoom".equals(type)) { return new MeetingRoom.Builder(new HashMap<String,Object>()); }
    if ("JewelryStore".equals(type)) { return new JewelryStore.Builder(new HashMap<String,Object>()); }
    if ("NutritionInformation".equals(type)) { return new NutritionInformation.Builder(new HashMap<String,Object>()); }
    if ("SelfStorage".equals(type)) { return new SelfStorage.Builder(new HashMap<String,Object>()); }
    if ("TaxiService".equals(type)) { return new TaxiService.Builder(new HashMap<String,Object>()); }
    if ("Service".equals(type)) { return new Service.Builder(new HashMap<String,Object>()); }
    if ("PerformanceRole".equals(type)) { return new PerformanceRole.Builder(new HashMap<String,Object>()); }
    if ("Courthouse".equals(type)) { return new Courthouse.Builder(new HashMap<String,Object>()); }
    if ("CableOrSatelliteService".equals(type)) { return new CableOrSatelliteService.Builder(new HashMap<String,Object>()); }
    if ("Brand".equals(type)) { return new Brand.Builder(new HashMap<String,Object>()); }
    if ("QuoteAction".equals(type)) { return new QuoteAction.Builder(new HashMap<String,Object>()); }
    if ("MusicRelease".equals(type)) { return new MusicRelease.Builder(new HashMap<String,Object>()); }
    if ("TennisComplex".equals(type)) { return new TennisComplex.Builder(new HashMap<String,Object>()); }
    if ("CommentAction".equals(type)) { return new CommentAction.Builder(new HashMap<String,Object>()); }
    if ("WPSideBar".equals(type)) { return new WPSideBar.Builder(new HashMap<String,Object>()); }
    if ("Florist".equals(type)) { return new Florist.Builder(new HashMap<String,Object>()); }
    if ("InstallAction".equals(type)) { return new InstallAction.Builder(new HashMap<String,Object>()); }
    if ("Menu".equals(type)) { return new Menu.Builder(new HashMap<String,Object>()); }
    if ("AutoWash".equals(type)) { return new AutoWash.Builder(new HashMap<String,Object>()); }
    if ("BreadcrumbList".equals(type)) { return new BreadcrumbList.Builder(new HashMap<String,Object>()); }
    if ("PhotographAction".equals(type)) { return new PhotographAction.Builder(new HashMap<String,Object>()); }
    if ("Playground".equals(type)) { return new Playground.Builder(new HashMap<String,Object>()); }
    if ("CivicStructure".equals(type)) { return new CivicStructure.Builder(new HashMap<String,Object>()); }
    if ("TieAction".equals(type)) { return new TieAction.Builder(new HashMap<String,Object>()); }
    if ("FrontWheelDriveConfiguration".equals(type)) { return new FrontWheelDriveConfiguration.Builder(new HashMap<String,Object>()); }
    if ("GameServer".equals(type)) { return new GameServer.Builder(new HashMap<String,Object>()); }
    if ("InviteAction".equals(type)) { return new InviteAction.Builder(new HashMap<String,Object>()); }
    if ("LocalBusiness".equals(type)) { return new LocalBusiness.Builder(new HashMap<String,Object>()); }
    if ("ReservationPackage".equals(type)) { return new ReservationPackage.Builder(new HashMap<String,Object>()); }
    if ("Taxi".equals(type)) { return new Taxi.Builder(new HashMap<String,Object>()); }
    if ("TattooParlor".equals(type)) { return new TattooParlor.Builder(new HashMap<String,Object>()); }
    if ("Casino".equals(type)) { return new Casino.Builder(new HashMap<String,Object>()); }
    if ("Person".equals(type)) { return new Person.Builder(new HashMap<String,Object>()); }
    if ("MotorcycleDealer".equals(type)) { return new MotorcycleDealer.Builder(new HashMap<String,Object>()); }
    if ("SingleFamilyResidence".equals(type)) { return new SingleFamilyResidence.Builder(new HashMap<String,Object>()); }
    if ("TrainTrip".equals(type)) { return new TrainTrip.Builder(new HashMap<String,Object>()); }
    if ("TouristAttraction".equals(type)) { return new TouristAttraction.Builder(new HashMap<String,Object>()); }
    if ("Audience".equals(type)) { return new Audience.Builder(new HashMap<String,Object>()); }
    if ("PaymentChargeSpecification".equals(type)) { return new PaymentChargeSpecification.Builder(new HashMap<String,Object>()); }
    if ("ActionCollabClass".equals(type)) { return new ActionCollabClass.Builder(new HashMap<String,Object>()); }
    if ("MovingCompany".equals(type)) { return new MovingCompany.Builder(new HashMap<String,Object>()); }
    if ("BusStation".equals(type)) { return new BusStation.Builder(new HashMap<String,Object>()); }
    if ("Bakery".equals(type)) { return new Bakery.Builder(new HashMap<String,Object>()); }
    if ("LiveBlogPosting".equals(type)) { return new LiveBlogPosting.Builder(new HashMap<String,Object>()); }
    if ("ItemList".equals(type)) { return new ItemList.Builder(new HashMap<String,Object>()); }
    if ("GoodRelationsClass".equals(type)) { return new GoodRelationsClass.Builder(new HashMap<String,Object>()); }
    if ("ConfirmAction".equals(type)) { return new ConfirmAction.Builder(new HashMap<String,Object>()); }
    if ("LeaveAction".equals(type)) { return new LeaveAction.Builder(new HashMap<String,Object>()); }
    if ("UserComments".equals(type)) { return new UserComments.Builder(new HashMap<String,Object>()); }
    if ("AssignAction".equals(type)) { return new AssignAction.Builder(new HashMap<String,Object>()); }
    if ("LikeAction".equals(type)) { return new LikeAction.Builder(new HashMap<String,Object>()); }
    if ("Review".equals(type)) { return new Review.Builder(new HashMap<String,Object>()); }
    if ("IceCreamShop".equals(type)) { return new IceCreamShop.Builder(new HashMap<String,Object>()); }
    if ("PeopleAudience".equals(type)) { return new PeopleAudience.Builder(new HashMap<String,Object>()); }
    if ("Airline".equals(type)) { return new Airline.Builder(new HashMap<String,Object>()); }
    if ("Message".equals(type)) { return new Message.Builder(new HashMap<String,Object>()); }
    if ("Table".equals(type)) { return new Table.Builder(new HashMap<String,Object>()); }
    if ("Electrician".equals(type)) { return new Electrician.Builder(new HashMap<String,Object>()); }
    if ("ComedyEvent".equals(type)) { return new ComedyEvent.Builder(new HashMap<String,Object>()); }
    if ("UserPlusOnes".equals(type)) { return new UserPlusOnes.Builder(new HashMap<String,Object>()); }
    if ("Enumeration".equals(type)) { return new Enumeration.Builder(new HashMap<String,Object>()); }
    if ("RVPark".equals(type)) { return new RVPark.Builder(new HashMap<String,Object>()); }
    if ("DryCleaningOrLaundry".equals(type)) { return new DryCleaningOrLaundry.Builder(new HashMap<String,Object>()); }
    if ("TVEpisode".equals(type)) { return new TVEpisode.Builder(new HashMap<String,Object>()); }
    if ("AppendAction".equals(type)) { return new AppendAction.Builder(new HashMap<String,Object>()); }
    if ("MobileApplication".equals(type)) { return new MobileApplication.Builder(new HashMap<String,Object>()); }
    if ("TrainStation".equals(type)) { return new TrainStation.Builder(new HashMap<String,Object>()); }
    if ("TheaterEvent".equals(type)) { return new TheaterEvent.Builder(new HashMap<String,Object>()); }
    if ("MenuItem".equals(type)) { return new MenuItem.Builder(new HashMap<String,Object>()); }
    if ("ReceiveAction".equals(type)) { return new ReceiveAction.Builder(new HashMap<String,Object>()); }
    if ("LoanOrCredit".equals(type)) { return new LoanOrCredit.Builder(new HashMap<String,Object>()); }
    if ("DanceEvent".equals(type)) { return new DanceEvent.Builder(new HashMap<String,Object>()); }
    if ("DaySpa".equals(type)) { return new DaySpa.Builder(new HashMap<String,Object>()); }
    if ("TakeAction".equals(type)) { return new TakeAction.Builder(new HashMap<String,Object>()); }
    if ("DisagreeAction".equals(type)) { return new DisagreeAction.Builder(new HashMap<String,Object>()); }
    if ("Dataset".equals(type)) { return new Dataset.Builder(new HashMap<String,Object>()); }
    if ("Question".equals(type)) { return new Question.Builder(new HashMap<String,Object>()); }
    if ("PlayAction".equals(type)) { return new PlayAction.Builder(new HashMap<String,Object>()); }
    if ("Offer".equals(type)) { return new Offer.Builder(new HashMap<String,Object>()); }
    if ("Quantity".equals(type)) { return new Quantity.Builder(new HashMap<String,Object>()); }
    if ("Answer".equals(type)) { return new Answer.Builder(new HashMap<String,Object>()); }
    if ("Clip".equals(type)) { return new Clip.Builder(new HashMap<String,Object>()); }
    if ("Preschool".equals(type)) { return new Preschool.Builder(new HashMap<String,Object>()); }
    if ("AudioObject".equals(type)) { return new AudioObject.Builder(new HashMap<String,Object>()); }
    if ("EmployeeRole".equals(type)) { return new EmployeeRole.Builder(new HashMap<String,Object>()); }
    if ("FoodEstablishmentReservation".equals(type)) { return new FoodEstablishmentReservation.Builder(new HashMap<String,Object>()); }
    if ("Plumber".equals(type)) { return new Plumber.Builder(new HashMap<String,Object>()); }
    if ("MediaObject".equals(type)) { return new MediaObject.Builder(new HashMap<String,Object>()); }
    if ("VideoGameClip".equals(type)) { return new VideoGameClip.Builder(new HashMap<String,Object>()); }
    if ("FoodEstablishment".equals(type)) { return new FoodEstablishment.Builder(new HashMap<String,Object>()); }
    if ("FollowAction".equals(type)) { return new FollowAction.Builder(new HashMap<String,Object>()); }
    if ("BuyAction".equals(type)) { return new BuyAction.Builder(new HashMap<String,Object>()); }
    if ("PriceSpecification".equals(type)) { return new PriceSpecification.Builder(new HashMap<String,Object>()); }
    if ("SeaBodyOfWater".equals(type)) { return new SeaBodyOfWater.Builder(new HashMap<String,Object>()); }
    if ("Notary".equals(type)) { return new Notary.Builder(new HashMap<String,Object>()); }
    if ("PostalAddress".equals(type)) { return new PostalAddress.Builder(new HashMap<String,Object>()); }
    if ("MusicVideoObject".equals(type)) { return new MusicVideoObject.Builder(new HashMap<String,Object>()); }
    if ("TypeAndQuantityNode".equals(type)) { return new TypeAndQuantityNode.Builder(new HashMap<String,Object>()); }
    if ("HinduTemple".equals(type)) { return new HinduTemple.Builder(new HashMap<String,Object>()); }
    if ("BusReservation".equals(type)) { return new BusReservation.Builder(new HashMap<String,Object>()); }
    if ("PaintAction".equals(type)) { return new PaintAction.Builder(new HashMap<String,Object>()); }
    if ("Park".equals(type)) { return new Park.Builder(new HashMap<String,Object>()); }
    if ("TipAction".equals(type)) { return new TipAction.Builder(new HashMap<String,Object>()); }
    if ("GovernmentBuilding".equals(type)) { return new GovernmentBuilding.Builder(new HashMap<String,Object>()); }
    if ("UserTweets".equals(type)) { return new UserTweets.Builder(new HashMap<String,Object>()); }
    if ("AssessAction".equals(type)) { return new AssessAction.Builder(new HashMap<String,Object>()); }
    if ("LiquorStore".equals(type)) { return new LiquorStore.Builder(new HashMap<String,Object>()); }
    if ("MusicStore".equals(type)) { return new MusicStore.Builder(new HashMap<String,Object>()); }
    if ("LocationFeatureSpecification".equals(type)) { return new LocationFeatureSpecification.Builder(new HashMap<String,Object>()); }
    if ("TechArticle".equals(type)) { return new TechArticle.Builder(new HashMap<String,Object>()); }
    if ("UseAction".equals(type)) { return new UseAction.Builder(new HashMap<String,Object>()); }
    if ("Duration".equals(type)) { return new Duration.Builder(new HashMap<String,Object>()); }
    if ("Recipe".equals(type)) { return new Recipe.Builder(new HashMap<String,Object>()); }
    if ("VideoGame".equals(type)) { return new VideoGame.Builder(new HashMap<String,Object>()); }
    if ("LendAction".equals(type)) { return new LendAction.Builder(new HashMap<String,Object>()); }
    if ("UserInteraction".equals(type)) { return new UserInteraction.Builder(new HashMap<String,Object>()); }
    if ("BookSeries".equals(type)) { return new BookSeries.Builder(new HashMap<String,Object>()); }
    if ("GeoShape".equals(type)) { return new GeoShape.Builder(new HashMap<String,Object>()); }
    if ("ItemPage".equals(type)) { return new ItemPage.Builder(new HashMap<String,Object>()); }
    if ("TravelAgency".equals(type)) { return new TravelAgency.Builder(new HashMap<String,Object>()); }
    if ("EducationalOrganization".equals(type)) { return new EducationalOrganization.Builder(new HashMap<String,Object>()); }
    if ("WantAction".equals(type)) { return new WantAction.Builder(new HashMap<String,Object>()); }
    if ("TradeAction".equals(type)) { return new TradeAction.Builder(new HashMap<String,Object>()); }
    if ("GovernmentService".equals(type)) { return new GovernmentService.Builder(new HashMap<String,Object>()); }
    if ("Festival".equals(type)) { return new Festival.Builder(new HashMap<String,Object>()); }
    if ("JoinAction".equals(type)) { return new JoinAction.Builder(new HashMap<String,Object>()); }
    if ("HVACBusiness".equals(type)) { return new HVACBusiness.Builder(new HashMap<String,Object>()); }
    if ("AccountingService".equals(type)) { return new AccountingService.Builder(new HashMap<String,Object>()); }
    if ("Place".equals(type)) { return new Place.Builder(new HashMap<String,Object>()); }
    if ("SteeringPositionValue".equals(type)) { return new SteeringPositionValue.Builder(new HashMap<String,Object>()); }
    if ("InternetCafe".equals(type)) { return new InternetCafe.Builder(new HashMap<String,Object>()); }
    if ("BorrowAction".equals(type)) { return new BorrowAction.Builder(new HashMap<String,Object>()); }
    if ("AskAction".equals(type)) { return new AskAction.Builder(new HashMap<String,Object>()); }
    if ("BusinessEvent".equals(type)) { return new BusinessEvent.Builder(new HashMap<String,Object>()); }
    if ("DefenceEstablishment".equals(type)) { return new DefenceEstablishment.Builder(new HashMap<String,Object>()); }
    if ("SaleEvent".equals(type)) { return new SaleEvent.Builder(new HashMap<String,Object>()); }
    if ("TaxiStand".equals(type)) { return new TaxiStand.Builder(new HashMap<String,Object>()); }
    if ("Report".equals(type)) { return new Report.Builder(new HashMap<String,Object>()); }
    if ("ListenAction".equals(type)) { return new ListenAction.Builder(new HashMap<String,Object>()); }
    if ("BookStore".equals(type)) { return new BookStore.Builder(new HashMap<String,Object>()); }
    if ("ToyStore".equals(type)) { return new ToyStore.Builder(new HashMap<String,Object>()); }
    if ("Campground".equals(type)) { return new Campground.Builder(new HashMap<String,Object>()); }
    if ("AutoPartsStore".equals(type)) { return new AutoPartsStore.Builder(new HashMap<String,Object>()); }
    if ("SpreadsheetDigitalDocument".equals(type)) { return new SpreadsheetDigitalDocument.Builder(new HashMap<String,Object>()); }
    if ("Reservation".equals(type)) { return new Reservation.Builder(new HashMap<String,Object>()); }
    if ("Product".equals(type)) { return new Product.Builder(new HashMap<String,Object>()); }
    if ("DrinkAction".equals(type)) { return new DrinkAction.Builder(new HashMap<String,Object>()); }
    if ("RadioChannel".equals(type)) { return new RadioChannel.Builder(new HashMap<String,Object>()); }
    if ("AcceptAction".equals(type)) { return new AcceptAction.Builder(new HashMap<String,Object>()); }
    if ("PlanAction".equals(type)) { return new PlanAction.Builder(new HashMap<String,Object>()); }
    return null;
  }

  private static final ObjectMapper objectMapper = new ObjectMapper();
  static {
    objectMapper.registerModule(new JsonLdModule());
  }
  @NotNull public static String writeJson(@NotNull Thing thing) throws JsonProcessingException {
    return objectMapper.writeValueAsString(thing);
  }
  public static Thing readJson(@NotNull String json) throws java.io.IOException {
    return objectMapper.readValue(json, Thing.class);
  }
  public static Thing readJson(@NotNull JsonNode node) {
    return ThingDeserializer.fromMap(objectMapper.convertValue(node, java.util.Map.class));
  }
  public static Thing fromMap(@NotNull java.util.Map<String, Object> map) {
    return ThingDeserializer.fromMap(map);
  }
  public static java.util.Map<String, Object> toMap(@NotNull Thing thing) {
    final HashMap<String, Object> result = new HashMap<String, Object>();
    if (thing.getId() != null) {
      result.put("@id", thing.getId());
    }
    result.put("@type", thing.getJsonLdType());
    result.put("@context", thing.getJsonLdContext());
    for (java.util.Map.Entry<String, Object> entry : thing.myData.entrySet()) {
    if (entry.getValue() instanceof Thing) {
        result.put(entry.getKey(), toMap((Thing) entry.getValue()));
      } else if (entry.getValue() instanceof java.util.List) {
        final java.util.ArrayList<Object> list = new java.util.ArrayList<Object>();
        for (Object o : ((java.util.List) entry.getValue())) {
          if (o instanceof Thing) {
            list.add(toMap((Thing) o));
          } else {
            list.add(o);
          }
        }
        result.put(entry.getKey(), list);
      } else if (entry.getValue() instanceof java.util.Date) {
        result.put(entry.getKey(), ThingDeserializer.dateFormat.format(entry.getValue()));
      } else {
        result.put(entry.getKey(), entry.getValue());
      }
    }
    return result;
  }
}
