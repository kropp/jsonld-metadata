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
   * A college, university, or other third-level educational institution.
   */
  public static CollegeOrUniversity.Builder collegeOrUniversity() { return new CollegeOrUniversity.Builder(); }
  /**
   * The day of the week, e.g. used to specify to which day the opening hours of an OpeningHoursSpecification refer.

Originally, URLs from [GoodRelations](http://purl.org/goodrelations/v1) were used (for [[Monday]], [[Tuesday]], [[Wednesday]], [[Thursday]], [[Friday]], [[Saturday]], [[Sunday]] plus a special entry for [[PublicHolidays]]); these have now been integrated directly into schema.org.
      
   */
  public static DayOfWeek.Builder dayOfWeek() { return new DayOfWeek.Builder(); }
  /**
   * The act of authoring written creative content.
   */
  public static WriteAction.Builder writeAction() { return new WriteAction.Builder(); }
  /**
   * A dentist.
   */
  public static Dentist.Builder dentist() { return new Dentist.Builder(); }
  /**
   * A bus stop.
   */
  public static BusStop.Builder busStop() { return new BusStop.Builder(); }
  /**
   * The act of asserting that a future event/action is no longer going to happen.\n\nRelated actions:\n\n* [[ConfirmAction]]: The antonym of CancelAction.
   */
  public static CancelAction.Builder cancelAction() { return new CancelAction.Builder(); }
  /**
   * A file composed primarily of text.
   */
  public static TextDigitalDocument.Builder textDigitalDocument() { return new TextDigitalDocument.Builder(); }
  /**
   * A sub-grouping of food or drink items in a menu. E.g. courses (such as 'Dinner', 'Breakfast', etc.), specific type of dishes (such as 'Meat', 'Vegan', 'Drinks', etc.), or some other classification made by the menu provider.
   */
  public static MenuSection.Builder menuSection() { return new MenuSection.Builder(); }
  /**
   * The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another.
   */
  public static TransferAction.Builder transferAction() { return new TransferAction.Builder(); }
  /**
   * A computer store.
   */
  public static ComputerStore.Builder computerStore() { return new ComputerStore.Builder(); }
  /**
   * A camping pitch is an individual place for overnight stay in the outdoors, typically being part of a larger camping site.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static CampingPitch.Builder campingPitch() { return new CampingPitch.Builder(); }
  /**
   * A short TV program or a segment/part of a TV program.
   */
  public static TVClip.Builder tVClip() { return new TVClip.Builder(); }
  /**
   * A garden store.
   */
  public static GardenStore.Builder gardenStore() { return new GardenStore.Builder(); }
  /**
   * A resort is a place used for relaxation or recreation, attracting visitors for holidays or vacations. Resorts are places, towns or sometimes commercial establishment operated by a single company (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Resort">http://en.wikipedia.org/wiki/Resort</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.
    
   */
  public static Resort.Builder resort() { return new Resort.Builder(); }
  /**
   * The act of dressing oneself in clothing.
   */
  public static WearAction.Builder wearAction() { return new WearAction.Builder(); }
  /**
   * A fact-checking review of claims made (or reported) in some creative work (referenced via itemReviewed).
   */
  public static ClaimReview.Builder claimReview() { return new ClaimReview.Builder(); }
  /**
   * A comedy club.
   */
  public static ComedyClub.Builder comedyClub() { return new ComedyClub.Builder(); }
  /**
   * The most generic kind of creative work, including books, movies, photographs, software programs, etc.
   */
  public static CreativeWork.Builder creativeWork() { return new CreativeWork.Builder(); }
  /**
   * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.
   */
  public static Demand.Builder demand() { return new Demand.Builder(); }
  /**
   * Web page type: Image gallery page.
   */
  public static ImageGallery.Builder imageGallery() { return new ImageGallery.Builder(); }
  /**
   * The act of adding at a specific location in an ordered collection.
   */
  public static InsertAction.Builder insertAction() { return new InsertAction.Builder(); }
  /**
   * A video game series.
   */
  public static VideoGameSeries.Builder videoGameSeries() { return new VideoGameSeries.Builder(); }
  /**
   * A home goods store.
   */
  public static HomeGoodsStore.Builder homeGoodsStore() { return new HomeGoodsStore.Builder(); }
  /**
   * A mosque.
   */
  public static Mosque.Builder mosque() { return new Mosque.Builder(); }
  /**
   * A structured value providing information about the opening hours of a place or a certain service inside a place.\n\n
The place is __open__ if the [[opens]] property is specified, and __closed__ otherwise.\n\nIf the value for the [[closes]] property is less than the value for the [[opens]] property then the hour range is assumed to span over the next day.
      
   */
  public static OpeningHoursSpecification.Builder openingHoursSpecification() { return new OpeningHoursSpecification.Builder(); }
  /**
   * A church.
   */
  public static Church.Builder church() { return new Church.Builder(); }
  /**
   * A painting.
   */
  public static Painting.Builder painting() { return new Painting.Builder(); }
  /**
   * A car is a wheeled, self-powered motor vehicle used for transportation.
   */
  public static Car.Builder car() { return new Car.Builder(); }
  /**
   * A post office.
   */
  public static PostOffice.Builder postOffice() { return new PostOffice.Builder(); }
  /**
   * The act of participating in exertive activity for the purposes of improving health and fitness.
   */
  public static ExerciseAction.Builder exerciseAction() { return new ExerciseAction.Builder(); }
  /**
   * A volcano, like Fuji san.
   */
  public static Volcano.Builder volcano() { return new Volcano.Builder(); }
  /**
   * Web page type: Collection page.
   */
  public static CollectionPage.Builder collectionPage() { return new CollectionPage.Builder(); }
  /**
   * A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs.
   */
  public static WebSite.Builder webSite() { return new WebSite.Builder(); }
  /**
   * An agent inspects, determines, investigates, inquires, or examines an object's accuracy, quality, condition, or state.
   */
  public static CheckAction.Builder checkAction() { return new CheckAction.Builder(); }
  /**
   * Enumerated options related to a ContactPoint.
   */
  public static ContactPointOption.Builder contactPointOption() { return new ContactPointOption.Builder(); }
  /**
   * A reservation for an event like a concert, sporting event, or lecture.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
   */
  public static EventReservation.Builder eventReservation() { return new EventReservation.Builder(); }
  /**
   * The geographic coordinates of a place or event.
   */
  public static GeoCoordinates.Builder geoCoordinates() { return new GeoCoordinates.Builder(); }
  /**
   * An Insurance agency.
   */
  public static InsuranceAgency.Builder insuranceAgency() { return new InsuranceAgency.Builder(); }
  /**
   * A permission for a particular person or group to access a particular file.
   */
  public static DigitalDocumentPermission.Builder digitalDocumentPermission() { return new DigitalDocumentPermission.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  public static UserDownloads.Builder userDownloads() { return new UserDownloads.Builder(); }
  /**
   * One of the continents (for example, Europe or Africa).
   */
  public static Continent.Builder continent() { return new Continent.Builder(); }
  /**
   * A specific payment status. For example, PaymentDue, PaymentComplete, etc.
   */
  public static PaymentStatusType.Builder paymentStatusType() { return new PaymentStatusType.Builder(); }
  /**
   * A PublicationEvent corresponds indifferently to the event of publication for a CreativeWork of any type e.g. a broadcast event, an on-demand event, a book/journal publication via a variety of delivery media.
   */
  public static PublicationEvent.Builder publicationEvent() { return new PublicationEvent.Builder(); }
  /**
   * The footer section of the page.
   */
  public static WPFooter.Builder wPFooter() { return new WPFooter.Builder(); }
  /**
   * One or more messages between organizations or people on a particular topic. Individual messages can be linked to the conversation with isPartOf or hasPart properties.
   */
  public static Conversation.Builder conversation() { return new Conversation.Builder(); }
  /**
   * This type covers computer programming languages such as Scheme and Lisp, as well as other language-like computer representations. Natural languages are best represented with the [[Language]] type.
   */
  public static ComputerLanguage.Builder computerLanguage() { return new ComputerLanguage.Builder(); }
  /**
   * A collection of music tracks in playlist form.
   */
  public static MusicPlaylist.Builder musicPlaylist() { return new MusicPlaylist.Builder(); }
  /**
   * A car rental business.
   */
  public static AutoRental.Builder autoRental() { return new AutoRental.Builder(); }
  /**
   * A blog post.
   */
  public static BlogPosting.Builder blogPosting() { return new BlogPosting.Builder(); }
  /**
   * Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).
   */
  public static MusicReleaseFormatType.Builder musicReleaseFormatType() { return new MusicReleaseFormatType.Builder(); }
  /**
   * Financial services business.
   */
  public static FinancialService.Builder financialService() { return new FinancialService.Builder(); }
  /**
   * The act of inserting at the beginning if an ordered collection.
   */
  public static PrependAction.Builder prependAction() { return new PrependAction.Builder(); }
  /**
   * A police station.
   */
  public static PoliceStation.Builder policeStation() { return new PoliceStation.Builder(); }
  /**
   * A shopping center or mall.
   */
  public static ShoppingCenter.Builder shoppingCenter() { return new ShoppingCenter.Builder(); }
  /**
   * Represents additional information about a relationship or property. For example a Role can be used to say that a 'member' role linking some SportsTeam to a player occurred during a particular time period. Or that a Person's 'actor' role in a Movie was for some particular characterName. Such properties can be attached to a Role entity, which is then associated with the main entities using ordinary properties like 'member' or 'actor'.\n\nSee also [blog post](http://blog.schema.org/2014/06/introducing-role.html).
   */
  public static Role.Builder role() { return new Role.Builder(); }
  /**
   * A museum.
   */
  public static Museum.Builder museum() { return new Museum.Builder(); }
  /**
   * A movie.
   */
  public static Movie.Builder movie() { return new Movie.Builder(); }
  /**
   * The act of rejecting to/adopting an object.\n\nRelated actions:\n\n* [[AcceptAction]]: The antonym of RejectAction.
   */
  public static RejectAction.Builder rejectAction() { return new RejectAction.Builder(); }
  /**
   * An entity holding detailed information about the available bed types, e.g. the quantity of twin beds for a hotel room. For the single case of just one bed of a certain type, you can use bed directly with a text. See also [[BedType]] (under development).
   */
  public static BedDetails.Builder bedDetails() { return new BedDetails.Builder(); }
  /**
   * A clothing store.
   */
  public static ClothingStore.Builder clothingStore() { return new ClothingStore.Builder(); }
  /**
   * A theater group or company, for example, the Royal Shakespeare Company or Druid Theatre.
   */
  public static TheaterGroup.Builder theaterGroup() { return new TheaterGroup.Builder(); }
  /**
   * A public swimming pool.
   */
  public static PublicSwimmingPool.Builder publicSwimmingPool() { return new PublicSwimmingPool.Builder(); }
  /**
   * A reservation for a taxi.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
   */
  public static TaxiReservation.Builder taxiReservation() { return new TaxiReservation.Builder(); }
  /**
   * The act of returning to the origin that which was previously received (concrete objects) or taken (ownership).
   */
  public static ReturnAction.Builder returnAction() { return new ReturnAction.Builder(); }
  /**
   * The act of managing by changing/editing the state of the object.
   */
  public static UpdateAction.Builder updateAction() { return new UpdateAction.Builder(); }
  /**
   * A men's clothing store.
   */
  public static MensClothingStore.Builder mensClothingStore() { return new MensClothingStore.Builder(); }
  /**
   * Event type: Food event.
   */
  public static FoodEvent.Builder foodEvent() { return new FoodEvent.Builder(); }
  /**
   * A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time. __Note:__ This type has been superseded by [[MonetaryAmount]] use of that type is recommended
   */
  public static DatedMoneySpecification.Builder datedMoneySpecification() { return new DatedMoneySpecification.Builder(); }
  /**
   * The act of ingesting information/resources/food.
   */
  public static ConsumeAction.Builder consumeAction() { return new ConsumeAction.Builder(); }
  /**
   * RsvpResponseType is an enumeration type whose instances represent responding to an RSVP request.
   */
  public static RsvpResponseType.Builder rsvpResponseType() { return new RsvpResponseType.Builder(); }
  /**
   * A movie rental store.
   */
  public static MovieRentalStore.Builder movieRentalStore() { return new MovieRentalStore.Builder(); }
  /**
   * An image of a visual machine-readable code such as a barcode or QR code.
   */
  public static Barcode.Builder barcode() { return new Barcode.Builder(); }
  /**
   * A hair salon.
   */
  public static HairSalon.Builder hairSalon() { return new HairSalon.Builder(); }
  /**
   * A room is a distinguishable space within a structure, usually separated from other spaces by interior walls. (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Room">http://en.wikipedia.org/wiki/Room</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static Room.Builder room() { return new Room.Builder(); }
  /**
   * A cafe or coffee shop.
   */
  public static CafeOrCoffeeShop.Builder cafeOrCoffeeShop() { return new CafeOrCoffeeShop.Builder(); }
  /**
   * The act of consuming static visual content.
   */
  public static ViewAction.Builder viewAction() { return new ViewAction.Builder(); }
  /**
   * A summary of how users have interacted with this CreativeWork. In most cases, authors will use a subtype to specify the specific type of interaction.
   */
  public static InteractionCounter.Builder interactionCounter() { return new InteractionCounter.Builder(); }
  /**
   * A subclass of Role used to describe roles within organizations.
   */
  public static OrganizationRole.Builder organizationRole() { return new OrganizationRole.Builder(); }
  /**
   * The act of interacting with another person or organization.
   */
  public static InteractAction.Builder interactAction() { return new InteractAction.Builder(); }
  /**
   * A house painting service.
   */
  public static HousePainter.Builder housePainter() { return new HousePainter.Builder(); }
  /**
   * A reservation for train travel.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
   */
  public static TrainReservation.Builder trainReservation() { return new TrainReservation.Builder(); }
  /**
   * A subway station.
   */
  public static SubwayStation.Builder subwayStation() { return new SubwayStation.Builder(); }
  /**
   * A product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies which comprise the financial services industry.
   */
  public static FinancialProduct.Builder financialProduct() { return new FinancialProduct.Builder(); }
  /**
   * A blog.
   */
  public static Blog.Builder blog() { return new Blog.Builder(); }
  /**
   * A gym.
   */
  public static ExerciseGym.Builder exerciseGym() { return new ExerciseGym.Builder(); }
  /**
   * Enumerated status values for Reservation.
   */
  public static ReservationStatusType.Builder reservationStatusType() { return new ReservationStatusType.Builder(); }
  /**
   * A city hall.
   */
  public static CityHall.Builder cityHall() { return new CityHall.Builder(); }
  /**
   *  A point value or interval for product characteristics and other purposes.
   */
  public static QuantitativeValue.Builder quantitativeValue() { return new QuantitativeValue.Builder(); }
  /**
   * The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.
   */
  public static CommunicateAction.Builder communicateAction() { return new CommunicateAction.Builder(); }
  /**
   * An apartment (in American English) or flat (in British English) is a self-contained housing unit (a type of residential real estate) that occupies only part of a building (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Apartment">http://en.wikipedia.org/wiki/Apartment</a>).
   */
  public static Apartment.Builder apartment() { return new Apartment.Builder(); }
  /**
   * An employment agency.
   */
  public static EmploymentAgency.Builder employmentAgency() { return new EmploymentAgency.Builder(); }
  /**
   * The act of un-registering from a service.\n\nRelated actions:\n\n* [[RegisterAction]]: antonym of UnRegisterAction.\n* [[Leave]]: Unlike LeaveAction, UnRegisterAction implies that you are unregistering from a service you werer previously registered, rather than leaving a team/group of people.
   */
  public static UnRegisterAction.Builder unRegisterAction() { return new UnRegisterAction.Builder(); }
  /**
   * A statement of the money due for goods or services; a bill.
   */
  public static Invoice.Builder invoice() { return new Invoice.Builder(); }
  /**
   * A collection of music tracks.
   */
  public static MusicAlbum.Builder musicAlbum() { return new MusicAlbum.Builder(); }
  /**
   * A Buddhist temple.
   */
  public static BuddhistTemple.Builder buddhistTemple() { return new BuddhistTemple.Builder(); }
  /**
   * A furniture store.
   */
  public static FurnitureStore.Builder furnitureStore() { return new FurnitureStore.Builder(); }
  /**
   * The act of producing a balanced opinion about the object for an audience. An agent reviews an object with participants resulting in a review.
   */
  public static ReviewAction.Builder reviewAction() { return new ReviewAction.Builder(); }
  /**
   * The act of giving money in return for temporary use, but not ownership, of an object such as a vehicle or property. For example, an agent rents a property from a landlord in exchange for a periodic payment.
   */
  public static RentAction.Builder rentAction() { return new RentAction.Builder(); }
  /**
   * The publication format of the book.
   */
  public static BookFormatType.Builder bookFormatType() { return new BookFormatType.Builder(); }
  /**
   * Car repair business.
   */
  public static AutoRepair.Builder autoRepair() { return new AutoRepair.Builder(); }
  /**
   * A river (for example, the broad majestic Shannon).
   */
  public static RiverBodyOfWater.Builder riverBodyOfWater() { return new RiverBodyOfWater.Builder(); }
  /**
   * The act of momentarily pausing a device or application (e.g. pause music playback or pause a timer).
   */
  public static SuspendAction.Builder suspendAction() { return new SuspendAction.Builder(); }
  /**
   * A medical organization (physical or not), such as hospital, institution or clinic.
   */
  public static MedicalOrganization.Builder medicalOrganization() { return new MedicalOrganization.Builder(); }
  /**
   * A means for accessing a service, e.g. a government office location, web site, or phone number.
   */
  public static ServiceChannel.Builder serviceChannel() { return new ServiceChannel.Builder(); }
  /**
   * The act of taking money from a buyer in exchange for goods or services rendered. An agent sells an object, product, or service to a buyer for a price. Reciprocal of BuyAction.
   */
  public static SellAction.Builder sellAction() { return new SellAction.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  public static UserPlays.Builder userPlays() { return new UserPlays.Builder(); }
  /**
   * A wholesale store.
   */
  public static WholesaleStore.Builder wholesaleStore() { return new WholesaleStore.Builder(); }
  /**
   * A permit issued by a government agency.
   */
  public static GovernmentPermit.Builder governmentPermit() { return new GovernmentPermit.Builder(); }
  /**
   * A recycling center.
   */
  public static RecyclingCenter.Builder recyclingCenter() { return new RecyclingCenter.Builder(); }
  /**
   * A fast-food restaurant.
   */
  public static FastFoodRestaurant.Builder fastFoodRestaurant() { return new FastFoodRestaurant.Builder(); }
  /**
   * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
   */
  public static SoftwareSourceCode.Builder softwareSourceCode() { return new SoftwareSourceCode.Builder(); }
  /**
   * A hospital.
   */
  public static Hospital.Builder hospital() { return new Hospital.Builder(); }
  /**
   * A single, identifiable product instance (e.g. a laptop with a particular serial number).
   */
  public static IndividualProduct.Builder individualProduct() { return new IndividualProduct.Builder(); }
  /**
   * Season dedicated to radio broadcast and associated online delivery.
   */
  public static RadioSeason.Builder radioSeason() { return new RadioSeason.Builder(); }
  /**
   * A television station.
   */
  public static TelevisionStation.Builder televisionStation() { return new TelevisionStation.Builder(); }
  /**
   * A waterfall, like Niagara.
   */
  public static Waterfall.Builder waterfall() { return new Waterfall.Builder(); }
  /**
   * A delivery service through which content is provided via broadcast over the air or online.
   */
  public static BroadcastService.Builder broadcastService() { return new BroadcastService.Builder(); }
  /**
   * The act of an agent communicating (service provider, social media, etc) their arrival by registering/confirming for a previously reserved service (e.g. flight check in) or at a place (e.g. hotel), possibly resulting in a result (boarding pass, etc).\n\nRelated actions:\n\n* [[CheckOutAction]]: The antonym of CheckInAction.\n* [[ArriveAction]]: Unlike ArriveAction, CheckInAction implies that the agent is informing/confirming the start of a previously reserved service.\n* [[ConfirmAction]]: Unlike ConfirmAction, CheckInAction implies that the agent is informing/confirming the *start* of a previously reserved service rather than its validity/existence.
   */
  public static CheckInAction.Builder checkInAction() { return new CheckInAction.Builder(); }
  /**
   * The act of marrying a person.
   */
  public static MarryAction.Builder marryAction() { return new MarryAction.Builder(); }
  /**
   * A graveyard.
   */
  public static Cemetery.Builder cemetery() { return new Cemetery.Builder(); }
  /**
   * A performance group, such as a band, an orchestra, or a circus.
   */
  public static PerformingGroup.Builder performingGroup() { return new PerformingGroup.Builder(); }
  /**
   * A piece of sculpture.
   */
  public static Sculpture.Builder sculpture() { return new Sculpture.Builder(); }
  /**
   * The act of deliberately creating/producing/generating/building a result out of the agent.
   */
  public static CreateAction.Builder createAction() { return new CreateAction.Builder(); }
  /**
   * A file containing a note, primarily for the author.
   */
  public static NoteDigitalDocument.Builder noteDigitalDocument() { return new NoteDigitalDocument.Builder(); }
  /**
   * A geographical region, typically under the jurisdiction of a particular government.
   */
  public static AdministrativeArea.Builder administrativeArea() { return new AdministrativeArea.Builder(); }
  /**
   * A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.\n\n Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.
    
   */
  public static PropertyValue.Builder propertyValue() { return new PropertyValue.Builder(); }
  /**
   * A publication in any medium issued in successive parts bearing numerical or chronological designations and intended, such as a magazine, scholarly journal, or newspaper to continue indefinitely.\n\nSee also [blog post](http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html).
   */
  public static Periodical.Builder periodical() { return new Periodical.Builder(); }
  /**
   * A business entity type is a conceptual entity representing the legal form, the size, the main line of business, the position in the value chain, or any combination thereof, of an organization or business person.\n\nCommonly used values:\n\n* http://purl.org/goodrelations/v1#Business\n* http://purl.org/goodrelations/v1#Enduser\n* http://purl.org/goodrelations/v1#PublicInstitution\n* http://purl.org/goodrelations/v1#Reseller
	  
   */
  public static BusinessEntityType.Builder businessEntityType() { return new BusinessEntityType.Builder(); }
  /**
   * An agent approves/certifies/likes/supports/sanction an object.
   */
  public static EndorseAction.Builder endorseAction() { return new EndorseAction.Builder(); }
  /**
   * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
   */
  public static Rating.Builder rating() { return new Rating.Builder(); }
  /**
   * A lake (for example, Lake Pontrachain).
   */
  public static LakeBodyOfWater.Builder lakeBodyOfWater() { return new LakeBodyOfWater.Builder(); }
  /**
   * A gas station.
   */
  public static GasStation.Builder gasStation() { return new GasStation.Builder(); }
  /**
   * A government office&#x2014;for example, an IRS or DMV office.
   */
  public static GovernmentOffice.Builder governmentOffice() { return new GovernmentOffice.Builder(); }
  /**
   * A lodging business, such as a motel, hotel, or inn.
   */
  public static LodgingBusiness.Builder lodgingBusiness() { return new LodgingBusiness.Builder(); }
  /**
   * The status of an Action.
   */
  public static ActionStatusType.Builder actionStatusType() { return new ActionStatusType.Builder(); }
  /**
   * A general contractor.
   */
  public static GeneralContractor.Builder generalContractor() { return new GeneralContractor.Builder(); }
  /**
   * A payment method using a credit, debit, store or other card to associate the payment with an account.
   */
  public static PaymentCard.Builder paymentCard() { return new PaymentCard.Builder(); }
  /**
   * An art gallery.
   */
  public static ArtGallery.Builder artGallery() { return new ArtGallery.Builder(); }
  /**
   * The act of downloading an object.
   */
  public static DownloadAction.Builder downloadAction() { return new DownloadAction.Builder(); }
  /**
   * The delivery of a parcel either via the postal service or a commercial service.
   */
  public static ParcelDelivery.Builder parcelDelivery() { return new ParcelDelivery.Builder(); }
  /**
   * Natural languages such as Spanish, Tamil, Hindi, English, etc. Formal language code tags expressed in [BCP 47](https://en.wikipedia.org/wiki/IETF_language_tag) can be used via the [[alternateName]] property. The Language type previously also covered programming languages such as Scheme and Lisp, which are now best represented using [[ComputerLanguage]].
   */
  public static Language.Builder language() { return new Language.Builder(); }
  /**
   * Event type: Visual arts event.
   */
  public static VisualArtsEvent.Builder visualArtsEvent() { return new VisualArtsEvent.Builder(); }
  /**
   * A library.
   */
  public static Library.Builder library() { return new Library.Builder(); }
  /**
   * An agent tracks an object for updates.\n\nRelated actions:\n\n* [[FollowAction]]: Unlike FollowAction, TrackAction refers to the interest on the location of innanimates objects.\n* [[SubscribeAction]]: Unlike SubscribeAction, TrackAction refers to  the interest on the location of innanimate objects.
   */
  public static TrackAction.Builder trackAction() { return new TrackAction.Builder(); }
  /**
   * The act of an agent relocating to a place.\n\nRelated actions:\n\n* [[TransferAction]]: Unlike TransferAction, the subject of the move is a living Person or Organization rather than an inanimate object.
   */
  public static MoveAction.Builder moveAction() { return new MoveAction.Builder(); }
  /**
   * Residence type: Apartment complex.
   */
  public static ApartmentComplex.Builder apartmentComplex() { return new ApartmentComplex.Builder(); }
  /**
   * A locksmith.
   */
  public static Locksmith.Builder locksmith() { return new Locksmith.Builder(); }
  /**
   * A unique instance of a television BroadcastService on a CableOrSatelliteService lineup.
   */
  public static TelevisionChannel.Builder televisionChannel() { return new TelevisionChannel.Builder(); }
  /**
   * A QAPage is a WebPage focussed on a specific Question and its Answer(s), e.g. in a question answering site or documenting Frequently Asked Questions (FAQs).
   */
  public static QAPage.Builder qAPage() { return new QAPage.Builder(); }
  /**
   * Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc.
   */
  public static ProgramMembership.Builder programMembership() { return new ProgramMembership.Builder(); }
  /**
   * An agent controls a device or application.
   */
  public static ControlAction.Builder controlAction() { return new ControlAction.Builder(); }
  /**
   * Enumerated for values for itemListOrder for indicating how an ordered ItemList is organized.
   */
  public static ItemListOrderType.Builder itemListOrderType() { return new ItemListOrderType.Builder(); }
  /**
   * A mountain, like Mount Whitney or Mount Everest.
   */
  public static Mountain.Builder mountain() { return new Mountain.Builder(); }
  /**
   * A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.

      <br/><br/>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
   */
  public static PublicationVolume.Builder publicationVolume() { return new PublicationVolume.Builder(); }
  /**
   * A tire shop.
   */
  public static TireShop.Builder tireShop() { return new TireShop.Builder(); }
  /**
   * An over the air or online broadcast event.
   */
  public static BroadcastEvent.Builder broadcastEvent() { return new BroadcastEvent.Builder(); }
  /**
   * A bar or pub.
   */
  public static BarOrPub.Builder barOrPub() { return new BarOrPub.Builder(); }
  /**
   * A trip on a commercial bus line.
   */
  public static BusTrip.Builder busTrip() { return new BusTrip.Builder(); }
  /**
   * A ski resort.
   */
  public static SkiResort.Builder skiResort() { return new SkiResort.Builder(); }
  /**
   * The act of transferring ownership of an object to a destination. Reciprocal of TakeAction.\n\nRelated actions:\n\n* [[TakeAction]]: Reciprocal of GiveAction.\n* [[SendAction]]: Unlike SendAction, GiveAction implies that ownership is being transferred (e.g. I may send my laptop to you, but that doesn't mean I'm giving it to you).
   */
  public static GiveAction.Builder giveAction() { return new GiveAction.Builder(); }
  /**
   * Scheduling future actions, events, or tasks.\n\nRelated actions:\n\n* [[ReserveAction]]: Unlike ReserveAction, ScheduleAction allocates future actions (e.g. an event, a task, etc) towards a time slot / spatial allocation.
   */
  public static ScheduleAction.Builder scheduleAction() { return new ScheduleAction.Builder(); }
  /**
   * A food service, like breakfast, lunch, or dinner.
   */
  public static FoodService.Builder foodService() { return new FoodService.Builder(); }
  /**
   * An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.\n\nSee also [blog post](http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html).
   */
  public static Article.Builder article() { return new Article.Builder(); }
  /**
   * An agent bookmarks/flags/labels/tags/marks an object.
   */
  public static BookmarkAction.Builder bookmarkAction() { return new BookmarkAction.Builder(); }
  /**
   * Place of worship, such as a church, synagogue, or mosque.
   */
  public static PlaceOfWorship.Builder placeOfWorship() { return new PlaceOfWorship.Builder(); }
  /**
   * Status of a game server.
   */
  public static GameServerStatus.Builder gameServerStatus() { return new GameServerStatus.Builder(); }
  /**
   * A state or province of a country.
   */
  public static State.Builder state() { return new State.Builder(); }
  /**
   * Original definition: "provider of professional services."\n\nThe general [[ProfessionalService]] type for local businesses was deprecated due to confusion with [[Service]]. For reference, the types that it included were: [[Dentist]],
        [[AccountingService]], [[Attorney]], [[Notary]], as well as types for several kinds of [[HomeAndConstructionBusiness]]: [[Electrician]], [[GeneralContractor]],
        [[HousePainter]], [[Locksmith]], [[Plumber]], [[RoofingContractor]]. [[LegalService]] was introduced as a more inclusive supertype of [[Attorney]].
   */
  public static ProfessionalService.Builder professionalService() { return new ProfessionalService.Builder(); }
  /**
   * A compound price specification is one that bundles multiple prices that all apply in combination for different dimensions of consumption. Use the name property of the attached unit price specification for indicating the dimension of a price component (e.g. "electricity" or "final cleaning").
   */
  public static CompoundPriceSpecification.Builder compoundPriceSpecification() { return new CompoundPriceSpecification.Builder(); }
  /**
   * A navigation element of the page.
   */
  public static SiteNavigationElement.Builder siteNavigationElement() { return new SiteNavigationElement.Builder(); }
  /**
   * The act of producing/preparing food.
   */
  public static CookAction.Builder cookAction() { return new CookAction.Builder(); }
  /**
   * The most generic type of item.
   */
  public static Thing.Builder thing() { return new Thing.Builder(); }
  /**
   * An image file.
   */
  public static ImageObject.Builder imageObject() { return new ImageObject.Builder(); }
  /**
   * The act of starting or activating a device or application (e.g. starting a timer or turning on a flashlight).
   */
  public static ActivateAction.Builder activateAction() { return new ActivateAction.Builder(); }
  /**
   * Organization: Sports team.
   */
  public static SportsTeam.Builder sportsTeam() { return new SportsTeam.Builder(); }
  /**
   * An event venue.
   */
  public static EventVenue.Builder eventVenue() { return new EventVenue.Builder(); }
  /**
   * An instance of a [[Course]] which is distinct from other instances because it is offered at a different time or location or through different media or modes of study or to a specific section of students.
   */
  public static CourseInstance.Builder courseInstance() { return new CourseInstance.Builder(); }
  /**
   * A news article.
   */
  public static NewsArticle.Builder newsArticle() { return new NewsArticle.Builder(); }
  /**
   * Organization: A business corporation.
   */
  public static Corporation.Builder corporation() { return new Corporation.Builder(); }
  /**
   * A sports location, such as a playing field.
   */
  public static SportsActivityLocation.Builder sportsActivityLocation() { return new SportsActivityLocation.Builder(); }
  /**
   * An airport.
   */
  public static Airport.Builder airport() { return new Airport.Builder(); }
  /**
   * Used to describe a seat, such as a reserved seat in an event reservation.
   */
  public static Seat.Builder seat() { return new Seat.Builder(); }
  /**
   * An office equipment store.
   */
  public static OfficeEquipmentStore.Builder officeEquipmentStore() { return new OfficeEquipmentStore.Builder(); }
  /**
   * A Service to transfer funds from a person or organization to a beneficiary person or organization.
   */
  public static PaymentService.Builder paymentService() { return new PaymentService.Builder(); }
  /**
   * A type of Bank Account with a main purpose of depositing funds to gain interest or other benefits.
   */
  public static DepositAccount.Builder depositAccount() { return new DepositAccount.Builder(); }
  /**
   * A monetary value or range. This type can be used to describe an amount of money such as $50 USD, or a range as in describing a bank account being suitable for a balance between £1,000 and £1,000,000 GBP, or the value of a salary, etc. It is recommended to use [[PriceSpecification]] Types to describe the price of an Offer, Invoice, etc.
   */
  public static MonetaryAmount.Builder monetaryAmount() { return new MonetaryAmount.Builder(); }
  /**
   * The act of arriving at a place. An agent arrives at a destination from a fromLocation, optionally with participants.
   */
  public static ArriveAction.Builder arriveAction() { return new ArriveAction.Builder(); }
  /**
   * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
   */
  public static Code.Builder code() { return new Code.Builder(); }
  /**
   * A structured value providing information about when a certain organization or person owned a certain product.
   */
  public static OwnershipInfo.Builder ownershipInfo() { return new OwnershipInfo.Builder(); }
  /**
   * An amusement park.
   */
  public static AmusementPark.Builder amusementPark() { return new AmusementPark.Builder(); }
  /**
   * An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement.
For more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static Accommodation.Builder accommodation() { return new Accommodation.Builder(); }
  /**
   * A restaurant.
   */
  public static Restaurant.Builder restaurant() { return new Restaurant.Builder(); }
  /**
   * CreativeWorkSeries dedicated to radio broadcast and associated online delivery.
   */
  public static RadioSeries.Builder radioSeries() { return new RadioSeries.Builder(); }
  /**
   * A movie theater.
   */
  public static MovieTheater.Builder movieTheater() { return new MovieTheater.Builder(); }
  /**
   * A convenience store.
   */
  public static ConvenienceStore.Builder convenienceStore() { return new ConvenienceStore.Builder(); }
  /**
   * A reservoir of water, typically an artificially created lake, like the Lake Kariba reservoir.
   */
  public static Reservoir.Builder reservoir() { return new Reservoir.Builder(); }
  /**
   * The act of manipulating/administering/supervising/controlling one or more objects.
   */
  public static OrganizeAction.Builder organizeAction() { return new OrganizeAction.Builder(); }
  /**
   * The act of  departing from a place. An agent departs from an fromLocation for a destination, optionally with participants.
   */
  public static DepartAction.Builder departAction() { return new DepartAction.Builder(); }
  /**
   * Used to describe a ticket to an event, a flight, a bus ride, etc.
   */
  public static Ticket.Builder ticket() { return new Ticket.Builder(); }
  /**
   * A hardware store.
   */
  public static HardwareStore.Builder hardwareStore() { return new HardwareStore.Builder(); }
  /**
   * A post to a social media platform, including blog posts, tweets, Facebook posts, etc.
   */
  public static SocialMediaPosting.Builder socialMediaPosting() { return new SocialMediaPosting.Builder(); }
  /**
   * A file containing slides or used for a presentation.
   */
  public static PresentationDigitalDocument.Builder presentationDigitalDocument() { return new PresentationDigitalDocument.Builder(); }
  /**
   * The act of physically/electronically dispatching an object for transfer from an origin to a destination.Related actions:\n\n* [[ReceiveAction]]: The reciprocal of SendAction.\n* [[GiveAction]]: Unlike GiveAction, SendAction does not imply the transfer of ownership (e.g. I can send you my laptop, but I'm not necessarily giving it to you).
   */
  public static SendAction.Builder sendAction() { return new SendAction.Builder(); }
  /**
   * A publication event e.g. catch-up TV or radio podcast, during which a program is available on-demand.
   */
  public static OnDemandEvent.Builder onDemandEvent() { return new OnDemandEvent.Builder(); }
  /**
   * A posting to a discussion forum.
   */
  public static DiscussionForumPosting.Builder discussionForumPosting() { return new DiscussionForumPosting.Builder(); }
  /**
   * A pharmacy or drugstore.
   */
  public static Pharmacy.Builder pharmacy() { return new Pharmacy.Builder(); }
  /**
   * A series of movies. Included movies can be indicated with the hasPart property.
   */
  public static MovieSeries.Builder movieSeries() { return new MovieSeries.Builder(); }
  /**
   * An electronic file or document.
   */
  public static DigitalDocument.Builder digitalDocument() { return new DigitalDocument.Builder(); }
  /**
   * The act of registering to be a user of a service, product or web page.\n\nRelated actions:\n\n* [[JoinAction]]: Unlike JoinAction, RegisterAction implies you are registering to be a user of a service, *not* a group/team of people.\n* [FollowAction]]: Unlike FollowAction, RegisterAction doesn't imply that the agent is expecting to poll for updates from the object.\n* [[SubscribeAction]]: Unlike SubscribeAction, RegisterAction doesn't imply that the agent is expecting updates from the object.
   */
  public static RegisterAction.Builder registerAction() { return new RegisterAction.Builder(); }
  /**
   * An historical landmark or building.
   */
  public static LandmarksOrHistoricalBuildings.Builder landmarksOrHistoricalBuildings() { return new LandmarksOrHistoricalBuildings.Builder(); }
  /**
   * Event type: Exhibition event, e.g. at a museum, library, archive, tradeshow, ...
   */
  public static ExhibitionEvent.Builder exhibitionEvent() { return new ExhibitionEvent.Builder(); }
  /**
   * A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.
   */
  public static WebPage.Builder webPage() { return new WebPage.Builder(); }
  /**
   * An list item, e.g. a step in a checklist or how-to description.
   */
  public static ListItem.Builder listItem() { return new ListItem.Builder(); }
  /**
   * The act of notifying an event organizer as to whether you expect to attend the event.
   */
  public static RsvpAction.Builder rsvpAction() { return new RsvpAction.Builder(); }
  /**
   * Animal shelter.
   */
  public static AnimalShelter.Builder animalShelter() { return new AnimalShelter.Builder(); }
  /**
   * A crematorium.
   */
  public static Crematorium.Builder crematorium() { return new Crematorium.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  public static UserCheckins.Builder userCheckins() { return new UserCheckins.Builder(); }
  /**
   * An enumeration of genders.
   */
  public static GenderType.Builder genderType() { return new GenderType.Builder(); }
  /**
   * A web page element, like a table or an image.
   */
  public static WebPageElement.Builder webPageElement() { return new WebPageElement.Builder(); }
  /**
   * Reserving a concrete object.\n\nRelated actions:\n\n* [[ScheduleAction]]</a>: Unlike ScheduleAction, ReserveAction reserves concrete objects (e.g. a table, a hotel) towards a time slot / spatial allocation.
   */
  public static ReserveAction.Builder reserveAction() { return new ReserveAction.Builder(); }
  /**
   * A short segment/part of a movie.
   */
  public static MovieClip.Builder movieClip() { return new MovieClip.Builder(); }
  /**
   * An agent orders an object/product/service to be delivered/sent.
   */
  public static OrderAction.Builder orderAction() { return new OrderAction.Builder(); }
  /**
   * The act of discovering/finding an object.
   */
  public static DiscoverAction.Builder discoverAction() { return new DiscoverAction.Builder(); }
  /**
   * A private parcel service as the delivery mode available for a certain offer.\n\nCommonly used values:\n\n* http://purl.org/goodrelations/v1#DHL\n* http://purl.org/goodrelations/v1#FederalExpress\n* http://purl.org/goodrelations/v1#UPS
      
   */
  public static ParcelService.Builder parcelService() { return new ParcelService.Builder(); }
  /**
   * Web page type: Contact page.
   */
  public static ContactPage.Builder contactPage() { return new ContactPage.Builder(); }
  /**
   * The act of organizing tasks/objects/events by associating resources to it.
   */
  public static AllocateAction.Builder allocateAction() { return new AllocateAction.Builder(); }
  /**
   * A country.
   */
  public static Country.Builder country() { return new Country.Builder(); }
  /**
   * Auto body shop.
   */
  public static AutoBodyShop.Builder autoBodyShop() { return new AutoBodyShop.Builder(); }
  /**
   * A collection of datasets.
   */
  public static DataCatalog.Builder dataCatalog() { return new DataCatalog.Builder(); }
  /**
   * An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
   */
  public static OrderItem.Builder orderItem() { return new OrderItem.Builder(); }
  /**
   * Structured values are used when the value of a property has a more complex structure than simply being a textual value or a reference to another thing.
   */
  public static StructuredValue.Builder structuredValue() { return new StructuredValue.Builder(); }
  /**
   * A type of financial product that typically requires the client to transfer funds to a financial service in return for potential beneficial financial return.
   */
  public static InvestmentOrDeposit.Builder investmentOrDeposit() { return new InvestmentOrDeposit.Builder(); }
  /**
   * Indicates whether this game is multi-player, co-op or single-player.
   */
  public static GamePlayMode.Builder gamePlayMode() { return new GamePlayMode.Builder(); }
  /**
   * A landform or physical feature.  Landform elements include mountains, plains, lakes, rivers, seascape and oceanic waterbody interface features such as bays, peninsulas, seas and so forth, including sub-aqueous terrain features such as submersed mountain ranges, volcanoes, and the great ocean basins.
   */
  public static Landform.Builder landform() { return new Landform.Builder(); }
  /**
   * A CreativeWorkSeries in schema.org is a group of related items, typically but not necessarily of the same kind. CreativeWorkSeries are usually organized into some order, often chronological. Unlike [[ItemList]] which is a general purpose data structure for lists of things, the emphasis with CreativeWorkSeries is on published materials (written e.g. books and periodicals, or media such as tv, radio and games).\n\nSpecific subtypes are available for describing [[TVSeries]], [[RadioSeries]], [[MovieSeries]], [[BookSeries]], [[Periodical]] and [[VideoGameSeries]]. In each case, the [[hasPart]] / [[isPartOf]] properties can be used to relate the CreativeWorkSeries to its parts. The general CreativeWorkSeries type serves largely just to organize these more specific and practical subtypes.\n\nIt is common for properties applicable to an item from the series to be usefully applied to the containing group. Schema.org attempts to anticipate some of these cases, but publishers should be free to apply properties of the series parts to the series as a whole wherever they seem appropriate.
	  
   */
  public static CreativeWorkSeries.Builder creativeWorkSeries() { return new CreativeWorkSeries.Builder(); }
  /**
   * A Catholic church.
   */
  public static CatholicChurch.Builder catholicChurch() { return new CatholicChurch.Builder(); }
  /**
   * A software application.
   */
  public static SoftwareApplication.Builder softwareApplication() { return new SoftwareApplication.Builder(); }
  /**
   * The act of granting permission to an object.
   */
  public static AuthorizeAction.Builder authorizeAction() { return new AuthorizeAction.Builder(); }
  /**
   * Season dedicated to TV broadcast and associated online delivery.
   */
  public static TVSeason.Builder tVSeason() { return new TVSeason.Builder(); }
  /**
   * The act of achieving victory in a competitive activity.
   */
  public static WinAction.Builder winAction() { return new WinAction.Builder(); }
  /**
   * A business providing entertainment.
   */
  public static EntertainmentBusiness.Builder entertainmentBusiness() { return new EntertainmentBusiness.Builder(); }
  /**
   * A media episode (e.g. TV, radio, video game) which can be part of a series or season.
   */
  public static Episode.Builder episode() { return new Episode.Builder(); }
  /**
   * Residence type: Gated community.
   */
  public static GatedResidenceCommunity.Builder gatedResidenceCommunity() { return new GatedResidenceCommunity.Builder(); }
  /**
   * A store that sells materials useful or necessary for various hobbies.
   */
  public static HobbyShop.Builder hobbyShop() { return new HobbyShop.Builder(); }
  /**
   * An adult entertainment establishment.
   */
  public static AdultEntertainment.Builder adultEntertainment() { return new AdultEntertainment.Builder(); }
  /**
   * The act of an agent communicating (service provider, social media, etc) their departure of a previously reserved service (e.g. flight check in) or place (e.g. hotel).\n\nRelated actions:\n\n* [[CheckInAction]]: The antonym of CheckOutAction.\n* [[DepartAction]]: Unlike DepartAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.\n* [[CancelAction]]: Unlike CancelAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.
   */
  public static CheckOutAction.Builder checkOutAction() { return new CheckOutAction.Builder(); }
  /**
   * Web page type: Video gallery page.
   */
  public static VideoGallery.Builder videoGallery() { return new VideoGallery.Builder(); }
  /**
   * A parking lot or other parking facility.
   */
  public static ParkingFacility.Builder parkingFacility() { return new ParkingFacility.Builder(); }
  /**
   * Car repair, sales, or parts.
   */
  public static AutomotiveBusiness.Builder automotiveBusiness() { return new AutomotiveBusiness.Builder(); }
  /**
   * Organization: Non-governmental Organization.
   */
  public static NGO.Builder nGO() { return new NGO.Builder(); }
  /**
   * A radio episode which can be part of a series or season.
   */
  public static RadioEpisode.Builder radioEpisode() { return new RadioEpisode.Builder(); }
  /**
   * A tourist information center.
   */
  public static TouristInformationCenter.Builder touristInformationCenter() { return new TouristInformationCenter.Builder(); }
  /**
   * A radio station.
   */
  public static RadioStation.Builder radioStation() { return new RadioStation.Builder(); }
  /**
   * The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting.
   */
  public static Game.Builder game() { return new Game.Builder(); }
  /**
   * Beach.
   */
  public static Beach.Builder beach() { return new Beach.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  public static UserBlocks.Builder userBlocks() { return new UserBlocks.Builder(); }
  /**
   * A photograph.
   */
  public static Photograph.Builder photograph() { return new Photograph.Builder(); }
  /**
   * EventStatusType is an enumeration type whose instances represent several states that an Event may be in.
   */
  public static EventStatusType.Builder eventStatusType() { return new EventStatusType.Builder(); }
  /**
   * An EducationalAudience.
   */
  public static EducationalAudience.Builder educationalAudience() { return new EducationalAudience.Builder(); }
  /**
   * A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
   */
  public static Vehicle.Builder vehicle() { return new Vehicle.Builder(); }
  /**
   * An emergency service, such as a fire station or ER.
   */
  public static EmergencyService.Builder emergencyService() { return new EmergencyService.Builder(); }
  /**
   * A list of possible conditions for the item.
   */
  public static OfferItemCondition.Builder offerItemCondition() { return new OfferItemCondition.Builder(); }
  /**
   * The act of forming a personal connection with someone (object) mutually/bidirectionally/symmetrically.\n\nRelated actions:\n\n* [[FollowAction]]: Unlike FollowAction, BefriendAction implies that the connection is reciprocal.
   */
  public static BefriendAction.Builder befriendAction() { return new BefriendAction.Builder(); }
  /**
   * The act of editing by adding an object to a collection.
   */
  public static AddAction.Builder addAction() { return new AddAction.Builder(); }
  /**
   * A construction business.\n\nA HomeAndConstructionBusiness is a [[LocalBusiness]] that provides services around homes and buildings.\n\nAs a [[LocalBusiness]] it can be described as a [[provider]] of one or more [[Service]]\(s).
   */
  public static HomeAndConstructionBusiness.Builder homeAndConstructionBusiness() { return new HomeAndConstructionBusiness.Builder(); }
  /**
   * A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
   */
  public static WarrantyPromise.Builder warrantyPromise() { return new WarrantyPromise.Builder(); }
  /**
   * Web page type: Profile page.
   */
  public static ProfilePage.Builder profilePage() { return new ProfilePage.Builder(); }
  /**
   * A music recording (track), usually a single song.
   */
  public static MusicRecording.Builder musicRecording() { return new MusicRecording.Builder(); }
  /**
   * The price for the delivery of an offer using a particular delivery method.
   */
  public static DeliveryChargeSpecification.Builder deliveryChargeSpecification() { return new DeliveryChargeSpecification.Builder(); }
  /**
   * A health club.
   */
  public static HealthClub.Builder healthClub() { return new HealthClub.Builder(); }
  /**
   * Professional service: Attorney. \n\nThis type is deprecated - [[LegalService]] is more inclusive and less ambiguous.
   */
  public static Attorney.Builder attorney() { return new Attorney.Builder(); }
  /**
   * A stadium.
   */
  public static StadiumOrArena.Builder stadiumOrArena() { return new StadiumOrArena.Builder(); }
  /**
   * The act of swallowing solid objects.
   */
  public static EatAction.Builder eatAction() { return new EatAction.Builder(); }
  /**
   * A map.
   */
  public static Map.Builder map() { return new Map.Builder(); }
  /**
   * A media season e.g. tv, radio, video game etc.
   */
  public static Season.Builder season() { return new Season.Builder(); }
  /**
   * A reservation for air travel.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
   */
  public static FlightReservation.Builder flightReservation() { return new FlightReservation.Builder(); }
  /**
   * Specific revision of a software code
   */
  public static SourceCodeRevision.Builder sourceCodeRevision() { return new SourceCodeRevision.Builder(); }
  /**
   * A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.\n\n[blog post](http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html).
   */
  public static PublicationIssue.Builder publicationIssue() { return new PublicationIssue.Builder(); }
  /**
   * A shoe store.
   */
  public static ShoeStore.Builder shoeStore() { return new ShoeStore.Builder(); }
  /**
   * Event type: Social event.
   */
  public static SocialEvent.Builder socialEvent() { return new SocialEvent.Builder(); }
  /**
   * A shop that will buy, or lend money against the security of, personal possessions.
   */
  public static PawnShop.Builder pawnShop() { return new PawnShop.Builder(); }
  /**
   * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the [[offers]] property. Repeated events may be structured as separate Event objects.
   */
  public static Event.Builder event() { return new Event.Builder(); }
  /**
   * A body of water, such as a sea, ocean, or lake.
   */
  public static BodyOfWater.Builder bodyOfWater() { return new BodyOfWater.Builder(); }
  /**
   * A datasheet or vendor specification of a product (in the sense of a prototypical description).
   */
  public static ProductModel.Builder productModel() { return new ProductModel.Builder(); }
  /**
   * Event type: Music event.
   */
  public static MusicEvent.Builder musicEvent() { return new MusicEvent.Builder(); }
  /**
   * A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
   */
  public static BroadcastChannel.Builder broadcastChannel() { return new BroadcastChannel.Builder(); }
  /**
   * A single feed providing structured information about one or more entities or topics.
   */
  public static DataFeed.Builder dataFeed() { return new DataFeed.Builder(); }
  /**
   * The act of being defeated in a competitive activity.
   */
  public static LoseAction.Builder loseAction() { return new LoseAction.Builder(); }
  /**
   * A card payment method of a particular brand or name.  Used to mark up a particular payment method and/or the financial product/service that supplies the card account.\n\nCommonly used values:\n\n* http://purl.org/goodrelations/v1#AmericanExpress\n* http://purl.org/goodrelations/v1#DinersClub\n* http://purl.org/goodrelations/v1#Discover\n* http://purl.org/goodrelations/v1#JCB\n* http://purl.org/goodrelations/v1#MasterCard\n* http://purl.org/goodrelations/v1#VISA
       
   */
  public static CreditCard.Builder creditCard() { return new CreditCard.Builder(); }
  /**
   * A dataset in downloadable form.
   */
  public static DataDownload.Builder dataDownload() { return new DataDownload.Builder(); }
  /**
   * The act of responding instinctively and emotionally to an object, expressing a sentiment.
   */
  public static ReactAction.Builder reactAction() { return new ReactAction.Builder(); }
  /**
   * A hotel is an establishment that provides lodging paid on a short-term basis (Source: Wikipedia, the free encyclopedia, see http://en.wikipedia.org/wiki/Hotel).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static Hotel.Builder hotel() { return new Hotel.Builder(); }
  /**
   * The act of resuming a device or application which was formerly paused (e.g. resume music playback or resume a timer).
   */
  public static ResumeAction.Builder resumeAction() { return new ResumeAction.Builder(); }
  /**
   * A department store.
   */
  public static DepartmentStore.Builder departmentStore() { return new DepartmentStore.Builder(); }
  /**
   * An ocean (for example, the Pacific).
   */
  public static OceanBodyOfWater.Builder oceanBodyOfWater() { return new OceanBodyOfWater.Builder(); }
  /**
   * An enumeration of several kinds of Map.
   */
  public static MapCategoryType.Builder mapCategoryType() { return new MapCategoryType.Builder(); }
  /**
   * A bowling alley.
   */
  public static BowlingAlley.Builder bowlingAlley() { return new BowlingAlley.Builder(); }
  /**
   * Aquarium.
   */
  public static Aquarium.Builder aquarium() { return new Aquarium.Builder(); }
  /**
   * The kind of release which this album is: single, EP or album.
   */
  public static MusicAlbumReleaseType.Builder musicAlbumReleaseType() { return new MusicAlbumReleaseType.Builder(); }
  /**
   * A range of of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.\n\nCommonly used values:\n\n* http://purl.org/goodrelations/v1#Labor-BringIn\n* http://purl.org/goodrelations/v1#PartsAndLabor-BringIn\n* http://purl.org/goodrelations/v1#PartsAndLabor-PickUp
      
   */
  public static WarrantyScope.Builder warrantyScope() { return new WarrantyScope.Builder(); }
  /**
   * A pet store.
   */
  public static PetStore.Builder petStore() { return new PetStore.Builder(); }
  /**
   * The act of editing a recipient by removing one of its objects.
   */
  public static DeleteAction.Builder deleteAction() { return new DeleteAction.Builder(); }
  /**
   * Properties that take Energy as values are of the form '&lt;Number&gt; &lt;Energy unit of measure&gt;'.
   */
  public static Energy.Builder energy() { return new Energy.Builder(); }
  /**
   * A school.
   */
  public static School.Builder school() { return new School.Builder(); }
  /**
   * Classification of the album by it's type of content: soundtrack, live album, studio album, etc.
   */
  public static MusicAlbumProductionType.Builder musicAlbumProductionType() { return new MusicAlbumProductionType.Builder(); }
  /**
   * A book.
   */
  public static Book.Builder book() { return new Book.Builder(); }
  /**
   * A type of permission which can be granted for accessing a digital document.
   */
  public static DigitalDocumentPermissionType.Builder digitalDocumentPermissionType() { return new DigitalDocumentPermissionType.Builder(); }
  /**
   * The act of expressing a preference from a set of options or a large or unbounded set of choices/options.
   */
  public static ChooseAction.Builder chooseAction() { return new ChooseAction.Builder(); }
  /**
   * An car dealership.
   */
  public static AutoDealer.Builder autoDealer() { return new AutoDealer.Builder(); }
  /**
   * Event type: Literary event.
   */
  public static LiteraryEvent.Builder literaryEvent() { return new LiteraryEvent.Builder(); }
  /**
   * Web applications.
   */
  public static WebApplication.Builder webApplication() { return new WebApplication.Builder(); }
  /**
   * A grocery store.
   */
  public static GroceryStore.Builder groceryStore() { return new GroceryStore.Builder(); }
  /**
   * A nail salon.
   */
  public static NailSalon.Builder nailSalon() { return new NailSalon.Builder(); }
  /**
   * The act of capturing sound and moving images on film, video, or digitally.
   */
  public static FilmAction.Builder filmAction() { return new FilmAction.Builder(); }
  /**
   * The act of accomplishing something via previous efforts. It is an instantaneous action rather than an ongoing process.
   */
  public static AchieveAction.Builder achieveAction() { return new AchieveAction.Builder(); }
  /**
   * The act of registering to an organization/service without the guarantee to receive it.\n\nRelated actions:\n\n* [[RegisterAction]]: Unlike RegisterAction, ApplyAction has no guarantees that the application will be accepted.
   */
  public static ApplyAction.Builder applyAction() { return new ApplyAction.Builder(); }
  /**
   * A canal, like the Panama Canal.
   */
  public static Canal.Builder canal() { return new Canal.Builder(); }
  /**
   * The place where a person lives.
   */
  public static Residence.Builder residence() { return new Residence.Builder(); }
  /**
   * The business function specifies the type of activity or access (i.e., the bundle of rights) offered by the organization or business person through the offer. Typical are sell, rental or lease, maintenance or repair, manufacture / produce, recycle / dispose, engineering / construction, or installation. Proprietary specifications of access rights are also instances of this class.\n\nCommonly used values:\n\n* http://purl.org/goodrelations/v1#ConstructionInstallation\n* http://purl.org/goodrelations/v1#Dispose\n* http://purl.org/goodrelations/v1#LeaseOut\n* http://purl.org/goodrelations/v1#Maintain\n* http://purl.org/goodrelations/v1#ProvideService\n* http://purl.org/goodrelations/v1#Repair\n* http://purl.org/goodrelations/v1#Sell\n* http://purl.org/goodrelations/v1#Buy
        
   */
  public static BusinessFunction.Builder businessFunction() { return new BusinessFunction.Builder(); }
  /**
   * A city or town.
   */
  public static City.Builder city() { return new City.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  public static UserPageVisits.Builder userPageVisits() { return new UserPageVisits.Builder(); }
  /**
   * The act of distributing content to people for their amusement or edification.
   */
  public static ShareAction.Builder shareAction() { return new ShareAction.Builder(); }
  /**
   * A retail good store.
   */
  public static Store.Builder store() { return new Store.Builder(); }
  /**
   * A governmental organization or agency.
   */
  public static GovernmentOrganization.Builder governmentOrganization() { return new GovernmentOrganization.Builder(); }
  /**
   * A reservation for lodging at a hotel, motel, inn, etc.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  public static LodgingReservation.Builder lodgingReservation() { return new LodgingReservation.Builder(); }
  /**
   * An entry point, within some Web-based protocol.
   */
  public static EntryPoint.Builder entryPoint() { return new EntryPoint.Builder(); }
  /**
   * A work of art that is primarily visual in character.
   */
  public static VisualArtwork.Builder visualArtwork() { return new VisualArtwork.Builder(); }
  /**
   * An agent pays a price to a participant.
   */
  public static PayAction.Builder payAction() { return new PayAction.Builder(); }
  /**
   * Event type: Children's event.
   */
  public static ChildrensEvent.Builder childrensEvent() { return new ChildrensEvent.Builder(); }
  /**
   * An OfferCatalog is an ItemList that contains related Offers and/or further OfferCatalogs that are offeredBy the same provider.
   */
  public static OfferCatalog.Builder offerCatalog() { return new OfferCatalog.Builder(); }
  /**
   * A music venue.
   */
  public static MusicVenue.Builder musicVenue() { return new MusicVenue.Builder(); }
  /**
   * The act of expressing a consistency of opinion with the object. An agent agrees to/about an object (a proposition, topic or theme) with participants.
   */
  public static AgreeAction.Builder agreeAction() { return new AgreeAction.Builder(); }
  /**
   * A service to convert funds from one currency to another currency.
   */
  public static CurrencyConversionService.Builder currencyConversionService() { return new CurrencyConversionService.Builder(); }
  /**
   * A Childcare center.
   */
  public static ChildCare.Builder childCare() { return new ChildCare.Builder(); }
  /**
   * Web page type: Checkout page.
   */
  public static CheckoutPage.Builder checkoutPage() { return new CheckoutPage.Builder(); }
  /**
   * Brewery.
   */
  public static Brewery.Builder brewery() { return new Brewery.Builder(); }
  /**
   * A zoo.
   */
  public static Zoo.Builder zoo() { return new Zoo.Builder(); }
  /**
   * Event type: Sports event.
   */
  public static SportsEvent.Builder sportsEvent() { return new SportsEvent.Builder(); }
  /**
   * The act of editing a recipient by replacing an old object with a new object.
   */
  public static ReplaceAction.Builder replaceAction() { return new ReplaceAction.Builder(); }
  /**
   * A product or service offered by a bank whereby one may deposit, withdraw or transfer money and in some cases be paid interest.
   */
  public static BankAccount.Builder bankAccount() { return new BankAccount.Builder(); }
  /**
   * The act of consuming written content.
   */
  public static ReadAction.Builder readAction() { return new ReadAction.Builder(); }
  /**
   * A musical composition.
   */
  public static MusicComposition.Builder musicComposition() { return new MusicComposition.Builder(); }
  /**
   * A house is a building or structure that has the ability to be occupied for habitation by humans or other creatures (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/House">http://en.wikipedia.org/wiki/House</a>).
   */
  public static House.Builder house() { return new House.Builder(); }
  /**
   * The act of searching for an object.\n\nRelated actions:\n\n* [[FindAction]]: SearchAction generally leads to a FindAction, but not necessarily.
   */
  public static SearchAction.Builder searchAction() { return new SearchAction.Builder(); }
  /**
   * A roofing contractor.
   */
  public static RoofingContractor.Builder roofingContractor() { return new RoofingContractor.Builder(); }
  /**
   * An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.
   */
  public static Order.Builder order() { return new Order.Builder(); }
  /**
   * An embassy.
   */
  public static Embassy.Builder embassy() { return new Embassy.Builder(); }
  /**
   * A sporting goods store.
   */
  public static SportingGoodsStore.Builder sportingGoodsStore() { return new SportingGoodsStore.Builder(); }
  /**
   * The act of traveling from an fromLocation to a destination by a specified mode of transport, optionally with participants.
   */
  public static TravelAction.Builder travelAction() { return new TravelAction.Builder(); }
  /**
   * A hotel room is a single room in a hotel.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static HotelRoom.Builder hotelRoom() { return new HotelRoom.Builder(); }
  /**
   * The header section of the page.
   */
  public static WPHeader.Builder wPHeader() { return new WPHeader.Builder(); }
  /**
   * A set of characteristics belonging to businesses, e.g. who compose an item's target audience.
   */
  public static BusinessAudience.Builder businessAudience() { return new BusinessAudience.Builder(); }
  /**
   * A listing that describes a job opening in a certain organization.
   */
  public static JobPosting.Builder jobPosting() { return new JobPosting.Builder(); }
  /**
   * A motel.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static Motel.Builder motel() { return new Motel.Builder(); }
  /**
   * Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations.
   */
  public static SportsOrganization.Builder sportsOrganization() { return new SportsOrganization.Builder(); }
  /**
   * The act of stopping or deactivating a device or application (e.g. stopping a timer or turning off a flashlight).
   */
  public static DeactivateAction.Builder deactivateAction() { return new DeactivateAction.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  public static UserLikes.Builder userLikes() { return new UserLikes.Builder(); }
  /**
   * A set of characteristics describing parents, who can be interested in viewing some content.
   */
  public static ParentAudience.Builder parentAudience() { return new ParentAudience.Builder(); }
  /**
   * A high school.
   */
  public static HighSchool.Builder highSchool() { return new HighSchool.Builder(); }
  /**
   * Properties that take Distances as values are of the form '&lt;Number&gt; &lt;Length unit of measure&gt;'. E.g., '7 ft'.
   */
  public static Distance.Builder distance() { return new Distance.Builder(); }
  /**
   * The act of providing goods, services, or money without compensation, often for philanthropic reasons.
   */
  public static DonateAction.Builder donateAction() { return new DonateAction.Builder(); }
  /**
   * A golf course.
   */
  public static GolfCourse.Builder golfCourse() { return new GolfCourse.Builder(); }
  /**
   * A store that sells mobile phones and related accessories.
   */
  public static MobilePhoneStore.Builder mobilePhoneStore() { return new MobilePhoneStore.Builder(); }
  /**
   * A placeholder for multiple similar products of the same kind.
   */
  public static SomeProducts.Builder someProducts() { return new SomeProducts.Builder(); }
  /**
   * A contact point&#x2014;for example, a Customer Complaints department.
   */
  public static ContactPoint.Builder contactPoint() { return new ContactPoint.Builder(); }
  /**
   * A sports club.
   */
  public static SportsClub.Builder sportsClub() { return new SportsClub.Builder(); }
  /**
   * A payment method is a standardized procedure for transferring the monetary amount for a purchase. Payment methods are characterized by the legal and technical structures used, and by the organization or group carrying out the transaction.\n\nCommonly used values:\n\n* http://purl.org/goodrelations/v1#ByBankTransferInAdvance\n* http://purl.org/goodrelations/v1#ByInvoice\n* http://purl.org/goodrelations/v1#Cash\n* http://purl.org/goodrelations/v1#CheckInAdvance\n* http://purl.org/goodrelations/v1#COD\n* http://purl.org/goodrelations/v1#DirectDebit\n* http://purl.org/goodrelations/v1#GoogleCheckout\n* http://purl.org/goodrelations/v1#PayPal\n* http://purl.org/goodrelations/v1#PaySwarm
        
   */
  public static PaymentMethod.Builder paymentMethod() { return new PaymentMethod.Builder(); }
  /**
   * The act of participating in performance arts.
   */
  public static PerformAction.Builder performAction() { return new PerformAction.Builder(); }
  /**
   * A dance group&#x2014;for example, the Alvin Ailey Dance Theater or Riverdance.
   */
  public static DanceGroup.Builder danceGroup() { return new DanceGroup.Builder(); }
  /**
   * A legislative building&#x2014;for example, the state capitol.
   */
  public static LegislativeBuilding.Builder legislativeBuilding() { return new LegislativeBuilding.Builder(); }
  /**
   * A description of an educational course which may be offered as distinct instances at which take place at different times or take place at different locations, or be offered through different media or modes of study. An educational course is a sequence of one or more educational events and/or creative works which aims to build knowledge, competence or ability of learners.
   */
  public static Course.Builder course() { return new Course.Builder(); }
  /**
   * Specific build of a software applicaton
   */
  public static SoftwareApplicationBuild.Builder softwareApplicationBuild() { return new SoftwareApplicationBuild.Builder(); }
  /**
   * The act of notifying someone of information pertinent to them, with no expectation of a response.
   */
  public static InformAction.Builder informAction() { return new InformAction.Builder(); }
  /**
   * Event type: Education event.
   */
  public static EducationEvent.Builder educationEvent() { return new EducationEvent.Builder(); }
  /**
   * A fire station. With firemen.
   */
  public static FireStation.Builder fireStation() { return new FireStation.Builder(); }
  /**
   * Information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities.
   */
  public static EngineSpecification.Builder engineSpecification() { return new EngineSpecification.Builder(); }
  /**
   * An airline flight.
   */
  public static Flight.Builder flight() { return new Flight.Builder(); }
  /**
   * A utility class that serves as the umbrella for a number of 'intangible' things such as quantities, structured values, etc.
   */
  public static Intangible.Builder intangible() { return new Intangible.Builder(); }
  /**
   * The act of responding to a question/message asked/sent by the object. Related to [[AskAction]]\n\nRelated actions:\n\n* [[AskAction]]: Appears generally as an origin of a ReplyAction.
   */
  public static ReplyAction.Builder replyAction() { return new ReplyAction.Builder(); }
  /**
   * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates pushed to.\n\nRelated actions:\n\n* [[FollowAction]]: Unlike FollowAction, SubscribeAction implies that the subscriber acts as a passive agent being constantly/actively pushed for updates.\n* [[RegisterAction]]: Unlike RegisterAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.\n* [[JoinAction]]: Unlike JoinAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.
   */
  public static SubscribeAction.Builder subscribeAction() { return new SubscribeAction.Builder(); }
  /**
   * A doctor's office.
   */
  public static Physician.Builder physician() { return new Physician.Builder(); }
  /**
   * Reference documentation for application programming interfaces (APIs).
   */
  public static APIReference.Builder aPIReference() { return new APIReference.Builder(); }
  /**
   * An email message.
   */
  public static EmailMessage.Builder emailMessage() { return new EmailMessage.Builder(); }
  /**
   * A suite in a hotel or other public accommodation, denotes a class of luxury accommodations, the key feature of which is multiple rooms (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Suite_(hotel)">http://en.wikipedia.org/wiki/Suite_(hotel)</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static Suite.Builder suite() { return new Suite.Builder(); }
  /**
   * A Property value specification.
   */
  public static PropertyValueSpecification.Builder propertyValueSpecification() { return new PropertyValueSpecification.Builder(); }
  /**
   * A screening of a movie or other video.
   */
  public static ScreeningEvent.Builder screeningEvent() { return new ScreeningEvent.Builder(); }
  /**
   * An outlet store.
   */
  public static OutletStore.Builder outletStore() { return new OutletStore.Builder(); }
  /**
   * The act of consuming dynamic/moving visual content.
   */
  public static WatchAction.Builder watchAction() { return new WatchAction.Builder(); }
  /**
   * The act of intentionally disregarding the object. An agent ignores an object.
   */
  public static IgnoreAction.Builder ignoreAction() { return new IgnoreAction.Builder(); }
  /**
   * The price asked for a given offer by the respective organization or person.
   */
  public static UnitPriceSpecification.Builder unitPriceSpecification() { return new UnitPriceSpecification.Builder(); }
  /**
   * 
          A Series in schema.org is a group of related items, typically but not necessarily of the same kind. 
   */
  public static Series.Builder series() { return new Series.Builder(); }
  /**
   * A value indicating which roadwheels will receive torque.
   */
  public static DriveWheelConfigurationValue.Builder driveWheelConfigurationValue() { return new DriveWheelConfigurationValue.Builder(); }
  /**
   * A hostel - cheap accommodation, often in shared dormitories.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static Hostel.Builder hostel() { return new Hostel.Builder(); }
  /**
   * A diet restricted to certain foods or preparations for cultural, religious, health or lifestyle reasons. 
   */
  public static RestrictedDiet.Builder restrictedDiet() { return new RestrictedDiet.Builder(); }
  /**
   * A scholarly article.
   */
  public static ScholarlyArticle.Builder scholarlyArticle() { return new ScholarlyArticle.Builder(); }
  /**
   * An advertising section of the page.
   */
  public static WPAdBlock.Builder wPAdBlock() { return new WPAdBlock.Builder(); }
  /**
   * A bike store.
   */
  public static BikeStore.Builder bikeStore() { return new BikeStore.Builder(); }
  /**
   * A nightclub or discotheque.
   */
  public static NightClub.Builder nightClub() { return new NightClub.Builder(); }
  /**
   * A pond.
   */
  public static Pond.Builder pond() { return new Pond.Builder(); }
  /**
   * CreativeWorkSeries dedicated to TV broadcast and associated online delivery.
   */
  public static TVSeries.Builder tVSeries() { return new TVSeries.Builder(); }
  /**
   * A media season e.g. tv, radio, video game etc.
   */
  public static CreativeWorkSeason.Builder creativeWorkSeason() { return new CreativeWorkSeason.Builder(); }
  /**
   * Bank or credit union.
   */
  public static BankOrCreditUnion.Builder bankOrCreditUnion() { return new BankOrCreditUnion.Builder(); }
  /**
   * A real-estate agent.
   */
  public static RealEstateAgent.Builder realEstateAgent() { return new RealEstateAgent.Builder(); }
  /**
   * An electronics store.
   */
  public static ElectronicsStore.Builder electronicsStore() { return new ElectronicsStore.Builder(); }
  /**
   * Health and beauty.
   */
  public static HealthAndBeautyBusiness.Builder healthAndBeautyBusiness() { return new HealthAndBeautyBusiness.Builder(); }
  /**
   * The act of expressing a preference from a fixed/finite/structured set of choices/options.
   */
  public static VoteAction.Builder voteAction() { return new VoteAction.Builder(); }
  /**
   * Project
   */
  public static Project.Builder project() { return new Project.Builder(); }
  /**
   * A short radio program or a segment/part of a radio program.
   */
  public static RadioClip.Builder radioClip() { return new RadioClip.Builder(); }
  /**
   * A video file.
   */
  public static VideoObject.Builder videoObject() { return new VideoObject.Builder(); }
  /**
   * A permit issued by an organization, e.g. a parking pass.
   */
  public static Permit.Builder permit() { return new Permit.Builder(); }
  /**
   * A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the [[text]] property, and its topic via [[about]], properties shared with all CreativeWorks.
   */
  public static Comment.Builder comment() { return new Comment.Builder(); }
  /**
   * A GeoCircle is a GeoShape representing a circular geographic area. As it is a GeoShape
          it provides the simple textual property 'circle', but also allows the combination of postalCode alongside geoRadius.
          The center of the circle can be indicated via the 'geoMidpoint' property, or more approximately using 'address', 'postalCode'.
       
   */
  public static GeoCircle.Builder geoCircle() { return new GeoCircle.Builder(); }
  /**
   * An event involving the delivery of an item.
   */
  public static DeliveryEvent.Builder deliveryEvent() { return new DeliveryEvent.Builder(); }
  /**
   * The act of finding an object.\n\nRelated actions:\n\n* [[SearchAction]]: FindAction is generally lead by a SearchAction, but not necessarily.
   */
  public static FindAction.Builder findAction() { return new FindAction.Builder(); }
  /**
   * Beauty salon.
   */
  public static BeautySalon.Builder beautySalon() { return new BeautySalon.Builder(); }
  /**
   * Enumerated status values for Order.
   */
  public static OrderStatus.Builder orderStatus() { return new OrderStatus.Builder(); }
  /**
   * Bed and breakfast.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static BedAndBreakfast.Builder bedAndBreakfast() { return new BedAndBreakfast.Builder(); }
  /**
   * Web page type: About page.
   */
  public static AboutPage.Builder aboutPage() { return new AboutPage.Builder(); }
  /**
   * A middle school (typically for children aged around 11-14, although this varies somewhat).
   */
  public static MiddleSchool.Builder middleSchool() { return new MiddleSchool.Builder(); }
  /**
   * An organization such as a school, NGO, corporation, club, etc.
   */
  public static Organization.Builder organization() { return new Organization.Builder(); }
  /**
   * A synagogue.
   */
  public static Synagogue.Builder synagogue() { return new Synagogue.Builder(); }
  /**
   * ATM/cash machine.
   */
  public static AutomatedTeller.Builder automatedTeller() { return new AutomatedTeller.Builder(); }
  /**
   * A single item within a larger data feed.
   */
  public static DataFeedItem.Builder dataFeedItem() { return new DataFeedItem.Builder(); }
  /**
   * A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.
   */
  public static QualitativeValue.Builder qualitativeValue() { return new QualitativeValue.Builder(); }
  /**
   * The average rating based on multiple ratings or reviews.
   */
  public static AggregateRating.Builder aggregateRating() { return new AggregateRating.Builder(); }
  /**
   * An intangible item that describes an alignment between a learning resource and a node in an educational framework.
   */
  public static AlignmentObject.Builder alignmentObject() { return new AlignmentObject.Builder(); }
  /**
   * A theater or other performing art center.
   */
  public static PerformingArtsTheater.Builder performingArtsTheater() { return new PerformingArtsTheater.Builder(); }
  /**
   * A reservation for a rental car.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  public static RentalCarReservation.Builder rentalCarReservation() { return new RentalCarReservation.Builder(); }
  /**
   * A motorcycle repair shop.
   */
  public static MotorcycleRepair.Builder motorcycleRepair() { return new MotorcycleRepair.Builder(); }
  /**
   * An elementary school.
   */
  public static ElementarySchool.Builder elementarySchool() { return new ElementarySchool.Builder(); }
  /**
   * Web page type: Search results page.
   */
  public static SearchResultsPage.Builder searchResultsPage() { return new SearchResultsPage.Builder(); }
  /**
   * A winery.
   */
  public static Winery.Builder winery() { return new Winery.Builder(); }
  /**
   * When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.
   */
  public static AggregateOffer.Builder aggregateOffer() { return new AggregateOffer.Builder(); }
  /**
   * An action performed by a direct agent and indirect participants upon a direct object. Optionally happens at a location with the help of an inanimate instrument. The execution of the action may produce a result. Specific action sub-type documentation specifies the exact expectation of each argument/role.\n\nSee also [blog post](http://blog.schema.org/2014/04/announcing-schemaorg-actions.html) and [Actions overview document](http://schema.org/docs/actions.html).
   */
  public static Action.Builder action() { return new Action.Builder(); }
  /**
   * The act of producing a visual/graphical representation of an object, typically with a pen/pencil and paper as instruments.
   */
  public static DrawAction.Builder drawAction() { return new DrawAction.Builder(); }
  /**
   * The act of expressing a negative sentiment about the object. An agent dislikes an object (a proposition, topic or theme) with participants.
   */
  public static DislikeAction.Builder dislikeAction() { return new DislikeAction.Builder(); }
  /**
   * A bridge.
   */
  public static Bridge.Builder bridge() { return new Bridge.Builder(); }
  /**
   * A LegalService is a business that provides legally-oriented services, advice and representation, e.g. law firms.\n\nAs a [[LocalBusiness]] it can be described as a [[provider]] of one or more [[Service]]\(s).
   */
  public static LegalService.Builder legalService() { return new LegalService.Builder(); }
  /**
   * Properties that take Mass as values are of the form '&lt;Number&gt; &lt;Mass unit of measure&gt;'. E.g., '7 kg'.
   */
  public static Mass.Builder mass() { return new Mass.Builder(); }
  /**
   * A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.
   */
  public static MusicGroup.Builder musicGroup() { return new MusicGroup.Builder(); }
  /**
   * A meeting room, conference room, or conference hall is a room provided for singular events such as business conferences and meetings (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Conference_hall">http://en.wikipedia.org/wiki/Conference_hall</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static MeetingRoom.Builder meetingRoom() { return new MeetingRoom.Builder(); }
  /**
   * A jewelry store.
   */
  public static JewelryStore.Builder jewelryStore() { return new JewelryStore.Builder(); }
  /**
   * Nutritional information about the recipe.
   */
  public static NutritionInformation.Builder nutritionInformation() { return new NutritionInformation.Builder(); }
  /**
   * A self-storage facility.
   */
  public static SelfStorage.Builder selfStorage() { return new SelfStorage.Builder(); }
  /**
   * A service for a vehicle for hire with a driver for local travel. Fares are usually calculated based on distance traveled.
   */
  public static TaxiService.Builder taxiService() { return new TaxiService.Builder(); }
  /**
   * A service provided by an organization, e.g. delivery service, print services, etc.
   */
  public static Service.Builder service() { return new Service.Builder(); }
  /**
   * A PerformanceRole is a Role that some entity places with regard to a theatrical performance, e.g. in a Movie, TVSeries etc.
   */
  public static PerformanceRole.Builder performanceRole() { return new PerformanceRole.Builder(); }
  /**
   * A courthouse.
   */
  public static Courthouse.Builder courthouse() { return new Courthouse.Builder(); }
  /**
   * A service which provides access to media programming like TV or radio. Access may be via cable or satellite.
   */
  public static CableOrSatelliteService.Builder cableOrSatelliteService() { return new CableOrSatelliteService.Builder(); }
  /**
   * A brand is a name used by an organization or business person for labeling a product, product group, or similar.
   */
  public static Brand.Builder brand() { return new Brand.Builder(); }
  /**
   * An agent quotes/estimates/appraises an object/product/service with a price at a location/store.
   */
  public static QuoteAction.Builder quoteAction() { return new QuoteAction.Builder(); }
  /**
   * A MusicRelease is a specific release of a music album.
   */
  public static MusicRelease.Builder musicRelease() { return new MusicRelease.Builder(); }
  /**
   * A delivery method is a standardized procedure for transferring the product or service to the destination of fulfillment chosen by the customer. Delivery methods are characterized by the means of transportation used, and by the organization or group that is the contracting party for the sending organization or person.\n\nCommonly used values:\n\n* http://purl.org/goodrelations/v1#DeliveryModeDirectDownload\n* http://purl.org/goodrelations/v1#DeliveryModeFreight\n* http://purl.org/goodrelations/v1#DeliveryModeMail\n* http://purl.org/goodrelations/v1#DeliveryModeOwnFleet\n* http://purl.org/goodrelations/v1#DeliveryModePickUp\n* http://purl.org/goodrelations/v1#DHL\n* http://purl.org/goodrelations/v1#FederalExpress\n* http://purl.org/goodrelations/v1#UPS
        
   */
  public static DeliveryMethod.Builder deliveryMethod() { return new DeliveryMethod.Builder(); }
  /**
   * A tennis complex.
   */
  public static TennisComplex.Builder tennisComplex() { return new TennisComplex.Builder(); }
  /**
   * The act of generating a comment about a subject.
   */
  public static CommentAction.Builder commentAction() { return new CommentAction.Builder(); }
  /**
   * A sidebar section of the page.
   */
  public static WPSideBar.Builder wPSideBar() { return new WPSideBar.Builder(); }
  /**
   * A florist.
   */
  public static Florist.Builder florist() { return new Florist.Builder(); }
  /**
   * The act of installing an application.
   */
  public static InstallAction.Builder installAction() { return new InstallAction.Builder(); }
  /**
   * A structured representation of food or drink items available from a FoodEstablishment.
   */
  public static Menu.Builder menu() { return new Menu.Builder(); }
  /**
   * A car wash business.
   */
  public static AutoWash.Builder autoWash() { return new AutoWash.Builder(); }
  /**
   * A BreadcrumbList is an ItemList consisting of a chain of linked Web pages, typically described using at least their URL and their name, and typically ending with the current page.\n\nThe [[position]] property is used to reconstruct the order of the items in a BreadcrumbList The convention is that a breadcrumb list has an [[itemListOrder]] of [[ItemListOrderAscending]] (lower values listed first), and that the first items in this list correspond to the "top" or beginning of the breadcrumb trail, e.g. with a site or section homepage. The specific values of 'position' are not assigned meaning for a BreadcrumbList, but they should be integers, e.g. beginning with '1' for the first item in the list.
      
   */
  public static BreadcrumbList.Builder breadcrumbList() { return new BreadcrumbList.Builder(); }
  /**
   * The act of capturing still images of objects using a camera.
   */
  public static PhotographAction.Builder photographAction() { return new PhotographAction.Builder(); }
  /**
   * A playground.
   */
  public static Playground.Builder playground() { return new Playground.Builder(); }
  /**
   * A public structure, such as a town hall or concert hall.
   */
  public static CivicStructure.Builder civicStructure() { return new CivicStructure.Builder(); }
  /**
   * The act of reaching a draw in a competitive activity.
   */
  public static TieAction.Builder tieAction() { return new TieAction.Builder(); }
  /**
   * Server that provides game interaction in a multiplayer game.
   */
  public static GameServer.Builder gameServer() { return new GameServer.Builder(); }
  /**
   * The act of asking someone to attend an event. Reciprocal of RsvpAction.
   */
  public static InviteAction.Builder inviteAction() { return new InviteAction.Builder(); }
  /**
   * A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.
   */
  public static LocalBusiness.Builder localBusiness() { return new LocalBusiness.Builder(); }
  /**
   * A group of multiple reservations with common values for all sub-reservations.
   */
  public static ReservationPackage.Builder reservationPackage() { return new ReservationPackage.Builder(); }
  /**
   * A taxi.
   */
  public static Taxi.Builder taxi() { return new Taxi.Builder(); }
  /**
   * A tattoo parlor.
   */
  public static TattooParlor.Builder tattooParlor() { return new TattooParlor.Builder(); }
  /**
   * A casino.
   */
  public static Casino.Builder casino() { return new Casino.Builder(); }
  /**
   * A person (alive, dead, undead, or fictional).
   */
  public static Person.Builder person() { return new Person.Builder(); }
  /**
   * A motorcycle dealer.
   */
  public static MotorcycleDealer.Builder motorcycleDealer() { return new MotorcycleDealer.Builder(); }
  /**
   * Residence type: Single-family home.
   */
  public static SingleFamilyResidence.Builder singleFamilyResidence() { return new SingleFamilyResidence.Builder(); }
  /**
   * A trip on a commercial train line.
   */
  public static TrainTrip.Builder trainTrip() { return new TrainTrip.Builder(); }
  /**
   * A tourist attraction.
   */
  public static TouristAttraction.Builder touristAttraction() { return new TouristAttraction.Builder(); }
  /**
   * Intended audience for an item, i.e. the group for whom the item was created.
   */
  public static Audience.Builder audience() { return new Audience.Builder(); }
  /**
   * The costs of settling the payment using a particular payment method.
   */
  public static PaymentChargeSpecification.Builder paymentChargeSpecification() { return new PaymentChargeSpecification.Builder(); }
  /**
   * A moving company.
   */
  public static MovingCompany.Builder movingCompany() { return new MovingCompany.Builder(); }
  /**
   * A bus station.
   */
  public static BusStation.Builder busStation() { return new BusStation.Builder(); }
  /**
   * A bakery.
   */
  public static Bakery.Builder bakery() { return new Bakery.Builder(); }
  /**
   * A blog post intended to provide a rolling textual coverage of an ongoing event through continuous updates.
   */
  public static LiveBlogPosting.Builder liveBlogPosting() { return new LiveBlogPosting.Builder(); }
  /**
   * A list of items of any sort&#x2014;for example, Top 10 Movies About Weathermen, or Top 100 Party Songs. Not to be confused with HTML lists, which are often used only for formatting.
   */
  public static ItemList.Builder itemList() { return new ItemList.Builder(); }
  /**
   * The act of notifying someone that a future event/action is going to happen as expected.\n\nRelated actions:\n\n* [[CancelAction]]: The antonym of ConfirmAction.
   */
  public static ConfirmAction.Builder confirmAction() { return new ConfirmAction.Builder(); }
  /**
   * An agent leaves an event / group with participants/friends at a location.\n\nRelated actions:\n\n* [[JoinAction]]: The antonym of LeaveAction.\n* [[UnRegisterAction]]: Unlike UnRegisterAction, LeaveAction implies leaving a group/team of people rather than a service.
   */
  public static LeaveAction.Builder leaveAction() { return new LeaveAction.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  public static UserComments.Builder userComments() { return new UserComments.Builder(); }
  /**
   * The act of allocating an action/event/task to some destination (someone or something).
   */
  public static AssignAction.Builder assignAction() { return new AssignAction.Builder(); }
  /**
   * The act of expressing a positive sentiment about the object. An agent likes an object (a proposition, topic or theme) with participants.
   */
  public static LikeAction.Builder likeAction() { return new LikeAction.Builder(); }
  /**
   * A review of an item - for example, of a restaurant, movie, or store.
   */
  public static Review.Builder review() { return new Review.Builder(); }
  /**
   * An ice cream shop.
   */
  public static IceCreamShop.Builder iceCreamShop() { return new IceCreamShop.Builder(); }
  /**
   * A set of characteristics belonging to people, e.g. who compose an item's target audience.
   */
  public static PeopleAudience.Builder peopleAudience() { return new PeopleAudience.Builder(); }
  /**
   * An organization that provides flights for passengers.
   */
  public static Airline.Builder airline() { return new Airline.Builder(); }
  /**
   * A single message from a sender to one or more organizations or people.
   */
  public static Message.Builder message() { return new Message.Builder(); }
  /**
   * A table on a Web page.
   */
  public static Table.Builder table() { return new Table.Builder(); }
  /**
   * An electrician.
   */
  public static Electrician.Builder electrician() { return new Electrician.Builder(); }
  /**
   * Event type: Comedy event.
   */
  public static ComedyEvent.Builder comedyEvent() { return new ComedyEvent.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  public static UserPlusOnes.Builder userPlusOnes() { return new UserPlusOnes.Builder(); }
  /**
   * Lists or enumerations—for example, a list of cuisines or music genres, etc.
   */
  public static Enumeration.Builder enumeration() { return new Enumeration.Builder(); }
  /**
   * A place offering space for "Recreational Vehicles", Caravans, mobile homes and the like.
   */
  public static RVPark.Builder rVPark() { return new RVPark.Builder(); }
  /**
   * A dry-cleaning business.
   */
  public static DryCleaningOrLaundry.Builder dryCleaningOrLaundry() { return new DryCleaningOrLaundry.Builder(); }
  /**
   * A TV episode which can be part of a series or season.
   */
  public static TVEpisode.Builder tVEpisode() { return new TVEpisode.Builder(); }
  /**
   * The act of inserting at the end if an ordered collection.
   */
  public static AppendAction.Builder appendAction() { return new AppendAction.Builder(); }
  /**
   * A software application designed specifically to work well on a mobile device such as a telephone.
   */
  public static MobileApplication.Builder mobileApplication() { return new MobileApplication.Builder(); }
  /**
   * A train station.
   */
  public static TrainStation.Builder trainStation() { return new TrainStation.Builder(); }
  /**
   * Event type: Theater performance.
   */
  public static TheaterEvent.Builder theaterEvent() { return new TheaterEvent.Builder(); }
  /**
   * A food or drink item listed in a menu or menu section.
   */
  public static MenuItem.Builder menuItem() { return new MenuItem.Builder(); }
  /**
   * The act of physically/electronically taking delivery of an object thathas been transferred from an origin to a destination. Reciprocal of SendAction.\n\nRelated actions:\n\n* [[SendAction]]: The reciprocal of ReceiveAction.\n* [[TakeAction]]: Unlike TakeAction, ReceiveAction does not imply that the ownership has been transfered (e.g. I can receive a package, but it does not mean the package is now mine).
   */
  public static ReceiveAction.Builder receiveAction() { return new ReceiveAction.Builder(); }
  /**
   * A financial product for the loaning of an amount of money under agreed terms and charges.
   */
  public static LoanOrCredit.Builder loanOrCredit() { return new LoanOrCredit.Builder(); }
  /**
   * Event type: A social dance.
   */
  public static DanceEvent.Builder danceEvent() { return new DanceEvent.Builder(); }
  /**
   * A day spa.
   */
  public static DaySpa.Builder daySpa() { return new DaySpa.Builder(); }
  /**
   * The act of gaining ownership of an object from an origin. Reciprocal of GiveAction.\n\nRelated actions:\n\n* [[GiveAction]]: The reciprocal of TakeAction.\n* [[ReceiveAction]]: Unlike ReceiveAction, TakeAction implies that ownership has been transfered.
   */
  public static TakeAction.Builder takeAction() { return new TakeAction.Builder(); }
  /**
   * The act of expressing a difference of opinion with the object. An agent disagrees to/about an object (a proposition, topic or theme) with participants.
   */
  public static DisagreeAction.Builder disagreeAction() { return new DisagreeAction.Builder(); }
  /**
   * A body of structured information describing some topic(s) of interest.
   */
  public static Dataset.Builder dataset() { return new Dataset.Builder(); }
  /**
   * A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document.
   */
  public static Question.Builder question() { return new Question.Builder(); }
  /**
   * The act of playing/exercising/training/performing for enjoyment, leisure, recreation, Competition or exercise.\n\nRelated actions:\n\n* [[ListenAction]]: Unlike ListenAction (which is under ConsumeAction), PlayAction refers to performing for an audience or at an event, rather than consuming music.\n* [[WatchAction]]: Unlike WatchAction (which is under ConsumeAction), PlayAction refers to showing/displaying for an audience or at an event, rather than consuming visual content.
   */
  public static PlayAction.Builder playAction() { return new PlayAction.Builder(); }
  /**
   * An offer to transfer some rights to an item or to provide a service — for example, an offer to sell tickets to an event, to rent the DVD of a movie, to stream a TV show over the internet, to repair a motorcycle, or to loan a book.\n\nFor [GTIN](http://www.gs1.org/barcodes/technical/idkeys/gtin)-related fields, see [Check Digit calculator](http://www.gs1.org/barcodes/support/check_digit_calculator) and [validation guide](http://www.gs1us.org/resources/standards/gtin-validation-guide) from [GS1](http://www.gs1.org/).
   */
  public static Offer.Builder offer() { return new Offer.Builder(); }
  /**
   * Quantities such as distance, time, mass, weight, etc. Particular instances of say Mass are entities like '3 Kg' or '4 milligrams'.
   */
  public static Quantity.Builder quantity() { return new Quantity.Builder(); }
  /**
   * An answer offered to a question; perhaps correct, perhaps opinionated or wrong.
   */
  public static Answer.Builder answer() { return new Answer.Builder(); }
  /**
   * A short TV or radio program or a segment/part of a program.
   */
  public static Clip.Builder clip() { return new Clip.Builder(); }
  /**
   * A preschool.
   */
  public static Preschool.Builder preschool() { return new Preschool.Builder(); }
  /**
   * An audio file.
   */
  public static AudioObject.Builder audioObject() { return new AudioObject.Builder(); }
  /**
   * A subclass of OrganizationRole used to describe employee relationships.
   */
  public static EmployeeRole.Builder employeeRole() { return new EmployeeRole.Builder(); }
  /**
   * A reservation to dine at a food-related business.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
   */
  public static FoodEstablishmentReservation.Builder foodEstablishmentReservation() { return new FoodEstablishmentReservation.Builder(); }
  /**
   * A plumbing service.
   */
  public static Plumber.Builder plumber() { return new Plumber.Builder(); }
  /**
   * A media object, such as an image, video, or audio object embedded in a web page or a downloadable dataset i.e. DataDownload. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).
   */
  public static MediaObject.Builder mediaObject() { return new MediaObject.Builder(); }
  /**
   * A short segment/part of a video game.
   */
  public static VideoGameClip.Builder videoGameClip() { return new VideoGameClip.Builder(); }
  /**
   * A food-related business.
   */
  public static FoodEstablishment.Builder foodEstablishment() { return new FoodEstablishment.Builder(); }
  /**
   * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates polled from.\n\nRelated actions:\n\n* [[BefriendAction]]: Unlike BefriendAction, FollowAction implies that the connection is *not* necessarily reciprocal.\n* [[SubscribeAction]]: Unlike SubscribeAction, FollowAction implies that the follower acts as an active agent constantly/actively polling for updates.\n* [[RegisterAction]]: Unlike RegisterAction, FollowAction implies that the agent is interested in continuing receiving updates from the object.\n* [[JoinAction]]: Unlike JoinAction, FollowAction implies that the agent is interested in getting updates from the object.\n* [[TrackAction]]: Unlike TrackAction, FollowAction refers to the polling of updates of all aspects of animate objects rather than the location of inanimate objects (e.g. you track a package, but you don't follow it).
   */
  public static FollowAction.Builder followAction() { return new FollowAction.Builder(); }
  /**
   * The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.
   */
  public static BuyAction.Builder buyAction() { return new BuyAction.Builder(); }
  /**
   * A structured value representing a price or price range. Typically, only the subclasses of this type are used for markup. It is recommended to use [[MonetaryAmount]] to describe independent amounts of money such as a salary, credit card limits, etc.
   */
  public static PriceSpecification.Builder priceSpecification() { return new PriceSpecification.Builder(); }
  /**
   * A sea (for example, the Caspian sea).
   */
  public static SeaBodyOfWater.Builder seaBodyOfWater() { return new SeaBodyOfWater.Builder(); }
  /**
   * A notary.
   */
  public static Notary.Builder notary() { return new Notary.Builder(); }
  /**
   * The mailing address.
   */
  public static PostalAddress.Builder postalAddress() { return new PostalAddress.Builder(); }
  /**
   * A DeliveryMethod in which an item is made available via locker.
   */
  public static LockerDelivery.Builder lockerDelivery() { return new LockerDelivery.Builder(); }
  /**
   * A music video file.
   */
  public static MusicVideoObject.Builder musicVideoObject() { return new MusicVideoObject.Builder(); }
  /**
   * A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.
   */
  public static TypeAndQuantityNode.Builder typeAndQuantityNode() { return new TypeAndQuantityNode.Builder(); }
  /**
   * A Hindu temple.
   */
  public static HinduTemple.Builder hinduTemple() { return new HinduTemple.Builder(); }
  /**
   * A reservation for bus travel. \n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
   */
  public static BusReservation.Builder busReservation() { return new BusReservation.Builder(); }
  /**
   * The act of producing a painting, typically with paint and canvas as instruments.
   */
  public static PaintAction.Builder paintAction() { return new PaintAction.Builder(); }
  /**
   * A park.
   */
  public static Park.Builder park() { return new Park.Builder(); }
  /**
   * A type of boarding policy used by an airline.
   */
  public static BoardingPolicyType.Builder boardingPolicyType() { return new BoardingPolicyType.Builder(); }
  /**
   * The act of giving money voluntarily to a beneficiary in recognition of services rendered.
   */
  public static TipAction.Builder tipAction() { return new TipAction.Builder(); }
  /**
   * A government building.
   */
  public static GovernmentBuilding.Builder governmentBuilding() { return new GovernmentBuilding.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  public static UserTweets.Builder userTweets() { return new UserTweets.Builder(); }
  /**
   * The act of forming one's opinion, reaction or sentiment.
   */
  public static AssessAction.Builder assessAction() { return new AssessAction.Builder(); }
  /**
   * A shop that sells alcoholic drinks such as wine, beer, whisky and other spirits.
   */
  public static LiquorStore.Builder liquorStore() { return new LiquorStore.Builder(); }
  /**
   * A music store.
   */
  public static MusicStore.Builder musicStore() { return new MusicStore.Builder(); }
  /**
   * Specifies a location feature by providing a structured value representing a feature of an accommodation as a property-value pair of varying degrees of formality.
   */
  public static LocationFeatureSpecification.Builder locationFeatureSpecification() { return new LocationFeatureSpecification.Builder(); }
  /**
   * A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc.
   */
  public static TechArticle.Builder techArticle() { return new TechArticle.Builder(); }
  /**
   * The act of applying an object to its intended purpose.
   */
  public static UseAction.Builder useAction() { return new UseAction.Builder(); }
  /**
   * Quantity: Duration (use [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601)).
   */
  public static Duration.Builder duration() { return new Duration.Builder(); }
  /**
   * A recipe. For dietary restrictions covered by the recipe, a few common restrictions are enumerated via [[suitableForDiet]]. The [[keywords]] property can also be used to add more detail.
   */
  public static Recipe.Builder recipe() { return new Recipe.Builder(); }
  /**
   * A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device.
   */
  public static VideoGame.Builder videoGame() { return new VideoGame.Builder(); }
  /**
   * The act of providing an object under an agreement that it will be returned at a later date. Reciprocal of BorrowAction.\n\nRelated actions:\n\n* [[BorrowAction]]: Reciprocal of LendAction.
   */
  public static LendAction.Builder lendAction() { return new LendAction.Builder(); }
  /**
   * UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use [[Action]]-based vocabulary, alongside types such as [[Comment]].
   */
  public static UserInteraction.Builder userInteraction() { return new UserInteraction.Builder(); }
  /**
   * A series of books. Included books can be indicated with the hasPart property.
   */
  public static BookSeries.Builder bookSeries() { return new BookSeries.Builder(); }
  /**
   * The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
   */
  public static GeoShape.Builder geoShape() { return new GeoShape.Builder(); }
  /**
   * A page devoted to a single item, such as a particular product or hotel.
   */
  public static ItemPage.Builder itemPage() { return new ItemPage.Builder(); }
  /**
   * A travel agency.
   */
  public static TravelAgency.Builder travelAgency() { return new TravelAgency.Builder(); }
  /**
   * An educational organization.
   */
  public static EducationalOrganization.Builder educationalOrganization() { return new EducationalOrganization.Builder(); }
  /**
   * A list of possible product availability options.
   */
  public static ItemAvailability.Builder itemAvailability() { return new ItemAvailability.Builder(); }
  /**
   * The act of expressing a desire about the object. An agent wants an object.
   */
  public static WantAction.Builder wantAction() { return new WantAction.Builder(); }
  /**
   * The act of participating in an exchange of goods and services for monetary compensation. An agent trades an object, product or service with a participant in exchange for a one time or periodic payment.
   */
  public static TradeAction.Builder tradeAction() { return new TradeAction.Builder(); }
  /**
   * Any branch of a field in which people typically develop specific expertise, usually after significant study, time, and effort.
   */
  public static Specialty.Builder specialty() { return new Specialty.Builder(); }
  /**
   * A service provided by a government organization, e.g. food stamps, veterans benefits, etc.
   */
  public static GovernmentService.Builder governmentService() { return new GovernmentService.Builder(); }
  /**
   * Event type: Festival.
   */
  public static Festival.Builder festival() { return new Festival.Builder(); }
  /**
   * An agent joins an event/group with participants/friends at a location.\n\nRelated actions:\n\n* [[RegisterAction]]: Unlike RegisterAction, JoinAction refers to joining a group/team of people.\n* [[SubscribeAction]]: Unlike SubscribeAction, JoinAction does not imply that you'll be receiving updates.\n* [[FollowAction]]: Unlike FollowAction, JoinAction does not imply that you'll be polling for updates.
   */
  public static JoinAction.Builder joinAction() { return new JoinAction.Builder(); }
  /**
   * A business that provide Heating, Ventilation and Air Conditioning services.
   */
  public static HVACBusiness.Builder hVACBusiness() { return new HVACBusiness.Builder(); }
  /**
   * Accountancy business.\n\nAs a [[LocalBusiness]] it can be described as a [[provider]] of one or more [[Service]]\(s).
      
   */
  public static AccountingService.Builder accountingService() { return new AccountingService.Builder(); }
  /**
   * Entities that have a somewhat fixed, physical extension.
   */
  public static Place.Builder place() { return new Place.Builder(); }
  /**
   * A value indicating a steering position.
   */
  public static SteeringPositionValue.Builder steeringPositionValue() { return new SteeringPositionValue.Builder(); }
  /**
   * An internet cafe.
   */
  public static InternetCafe.Builder internetCafe() { return new InternetCafe.Builder(); }
  /**
   * The act of obtaining an object under an agreement to return it at a later date. Reciprocal of LendAction.\n\nRelated actions:\n\n* [[LendAction]]: Reciprocal of BorrowAction.
   */
  public static BorrowAction.Builder borrowAction() { return new BorrowAction.Builder(); }
  /**
   * The act of posing a question / favor to someone.\n\nRelated actions:\n\n* [[ReplyAction]]: Appears generally as a response to AskAction.
   */
  public static AskAction.Builder askAction() { return new AskAction.Builder(); }
  /**
   * Event type: Business event.
   */
  public static BusinessEvent.Builder businessEvent() { return new BusinessEvent.Builder(); }
  /**
   * A defence establishment, such as an army or navy base.
   */
  public static DefenceEstablishment.Builder defenceEstablishment() { return new DefenceEstablishment.Builder(); }
  /**
   * Event type: Sales event.
   */
  public static SaleEvent.Builder saleEvent() { return new SaleEvent.Builder(); }
  /**
   * A taxi stand.
   */
  public static TaxiStand.Builder taxiStand() { return new TaxiStand.Builder(); }
  /**
   * A Report generated by governmental or non-governmental organization.
   */
  public static Report.Builder report() { return new Report.Builder(); }
  /**
   * The act of consuming audio content.
   */
  public static ListenAction.Builder listenAction() { return new ListenAction.Builder(); }
  /**
   * A bookstore.
   */
  public static BookStore.Builder bookStore() { return new BookStore.Builder(); }
  /**
   * A toy store.
   */
  public static ToyStore.Builder toyStore() { return new ToyStore.Builder(); }
  /**
   * A camping site, campsite, or campground is a place used for overnight stay in the outdoors. In British English a campsite is an area, usually divided into a number of pitches, where people can camp overnight using tents or camper vans or caravans; this British English use of the word is synonymous with the American English expression campground. In American English the term campsite generally means an area where an individual, family, group, or military unit can pitch a tent or parks a camper; a campground may contain many campsites (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Campsite">http://en.wikipedia.org/wiki/Campsite</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.

   */
  public static Campground.Builder campground() { return new Campground.Builder(); }
  /**
   * An auto parts store.
   */
  public static AutoPartsStore.Builder autoPartsStore() { return new AutoPartsStore.Builder(); }
  /**
   * A spreadsheet file.
   */
  public static SpreadsheetDigitalDocument.Builder spreadsheetDigitalDocument() { return new SpreadsheetDigitalDocument.Builder(); }
  /**
   * Describes a reservation for travel, dining or an event. Some reservations require tickets. \n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use [[Offer]].
   */
  public static Reservation.Builder reservation() { return new Reservation.Builder(); }
  /**
   * Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.
   */
  public static Product.Builder product() { return new Product.Builder(); }
  /**
   * The act of swallowing liquids.
   */
  public static DrinkAction.Builder drinkAction() { return new DrinkAction.Builder(); }
  /**
   * A unique instance of a radio BroadcastService on a CableOrSatelliteService lineup.
   */
  public static RadioChannel.Builder radioChannel() { return new RadioChannel.Builder(); }
  /**
   * The act of committing to/adopting an object.\n\nRelated actions:\n\n* [[RejectAction]]: The antonym of AcceptAction.
   */
  public static AcceptAction.Builder acceptAction() { return new AcceptAction.Builder(); }
  /**
   * The act of planning the execution of an event/task/action/reservation/plan to a future date.
   */
  public static PlanAction.Builder planAction() { return new PlanAction.Builder(); }

  public static ThingBuilder getBuilder(@NotNull String type) {
    if ("CollegeOrUniversity".equals(type)) { return new CollegeOrUniversity.Builder(); }
    if ("DayOfWeek".equals(type)) { return new DayOfWeek.Builder(); }
    if ("WriteAction".equals(type)) { return new WriteAction.Builder(); }
    if ("Dentist".equals(type)) { return new Dentist.Builder(); }
    if ("BusStop".equals(type)) { return new BusStop.Builder(); }
    if ("CancelAction".equals(type)) { return new CancelAction.Builder(); }
    if ("TextDigitalDocument".equals(type)) { return new TextDigitalDocument.Builder(); }
    if ("MenuSection".equals(type)) { return new MenuSection.Builder(); }
    if ("TransferAction".equals(type)) { return new TransferAction.Builder(); }
    if ("ComputerStore".equals(type)) { return new ComputerStore.Builder(); }
    if ("CampingPitch".equals(type)) { return new CampingPitch.Builder(); }
    if ("TVClip".equals(type)) { return new TVClip.Builder(); }
    if ("GardenStore".equals(type)) { return new GardenStore.Builder(); }
    if ("Resort".equals(type)) { return new Resort.Builder(); }
    if ("WearAction".equals(type)) { return new WearAction.Builder(); }
    if ("ClaimReview".equals(type)) { return new ClaimReview.Builder(); }
    if ("ComedyClub".equals(type)) { return new ComedyClub.Builder(); }
    if ("CreativeWork".equals(type)) { return new CreativeWork.Builder(); }
    if ("Demand".equals(type)) { return new Demand.Builder(); }
    if ("ImageGallery".equals(type)) { return new ImageGallery.Builder(); }
    if ("InsertAction".equals(type)) { return new InsertAction.Builder(); }
    if ("VideoGameSeries".equals(type)) { return new VideoGameSeries.Builder(); }
    if ("HomeGoodsStore".equals(type)) { return new HomeGoodsStore.Builder(); }
    if ("Mosque".equals(type)) { return new Mosque.Builder(); }
    if ("OpeningHoursSpecification".equals(type)) { return new OpeningHoursSpecification.Builder(); }
    if ("Church".equals(type)) { return new Church.Builder(); }
    if ("Painting".equals(type)) { return new Painting.Builder(); }
    if ("Car".equals(type)) { return new Car.Builder(); }
    if ("PostOffice".equals(type)) { return new PostOffice.Builder(); }
    if ("ExerciseAction".equals(type)) { return new ExerciseAction.Builder(); }
    if ("Volcano".equals(type)) { return new Volcano.Builder(); }
    if ("CollectionPage".equals(type)) { return new CollectionPage.Builder(); }
    if ("WebSite".equals(type)) { return new WebSite.Builder(); }
    if ("CheckAction".equals(type)) { return new CheckAction.Builder(); }
    if ("ContactPointOption".equals(type)) { return new ContactPointOption.Builder(); }
    if ("EventReservation".equals(type)) { return new EventReservation.Builder(); }
    if ("GeoCoordinates".equals(type)) { return new GeoCoordinates.Builder(); }
    if ("InsuranceAgency".equals(type)) { return new InsuranceAgency.Builder(); }
    if ("DigitalDocumentPermission".equals(type)) { return new DigitalDocumentPermission.Builder(); }
    if ("UserDownloads".equals(type)) { return new UserDownloads.Builder(); }
    if ("Continent".equals(type)) { return new Continent.Builder(); }
    if ("PaymentStatusType".equals(type)) { return new PaymentStatusType.Builder(); }
    if ("PublicationEvent".equals(type)) { return new PublicationEvent.Builder(); }
    if ("WPFooter".equals(type)) { return new WPFooter.Builder(); }
    if ("Conversation".equals(type)) { return new Conversation.Builder(); }
    if ("ComputerLanguage".equals(type)) { return new ComputerLanguage.Builder(); }
    if ("MusicPlaylist".equals(type)) { return new MusicPlaylist.Builder(); }
    if ("AutoRental".equals(type)) { return new AutoRental.Builder(); }
    if ("BlogPosting".equals(type)) { return new BlogPosting.Builder(); }
    if ("MusicReleaseFormatType".equals(type)) { return new MusicReleaseFormatType.Builder(); }
    if ("FinancialService".equals(type)) { return new FinancialService.Builder(); }
    if ("PrependAction".equals(type)) { return new PrependAction.Builder(); }
    if ("PoliceStation".equals(type)) { return new PoliceStation.Builder(); }
    if ("ShoppingCenter".equals(type)) { return new ShoppingCenter.Builder(); }
    if ("Role".equals(type)) { return new Role.Builder(); }
    if ("Museum".equals(type)) { return new Museum.Builder(); }
    if ("Movie".equals(type)) { return new Movie.Builder(); }
    if ("RejectAction".equals(type)) { return new RejectAction.Builder(); }
    if ("BedDetails".equals(type)) { return new BedDetails.Builder(); }
    if ("ClothingStore".equals(type)) { return new ClothingStore.Builder(); }
    if ("TheaterGroup".equals(type)) { return new TheaterGroup.Builder(); }
    if ("PublicSwimmingPool".equals(type)) { return new PublicSwimmingPool.Builder(); }
    if ("TaxiReservation".equals(type)) { return new TaxiReservation.Builder(); }
    if ("ReturnAction".equals(type)) { return new ReturnAction.Builder(); }
    if ("UpdateAction".equals(type)) { return new UpdateAction.Builder(); }
    if ("MensClothingStore".equals(type)) { return new MensClothingStore.Builder(); }
    if ("FoodEvent".equals(type)) { return new FoodEvent.Builder(); }
    if ("DatedMoneySpecification".equals(type)) { return new DatedMoneySpecification.Builder(); }
    if ("ConsumeAction".equals(type)) { return new ConsumeAction.Builder(); }
    if ("RsvpResponseType".equals(type)) { return new RsvpResponseType.Builder(); }
    if ("MovieRentalStore".equals(type)) { return new MovieRentalStore.Builder(); }
    if ("Barcode".equals(type)) { return new Barcode.Builder(); }
    if ("HairSalon".equals(type)) { return new HairSalon.Builder(); }
    if ("Room".equals(type)) { return new Room.Builder(); }
    if ("CafeOrCoffeeShop".equals(type)) { return new CafeOrCoffeeShop.Builder(); }
    if ("ViewAction".equals(type)) { return new ViewAction.Builder(); }
    if ("InteractionCounter".equals(type)) { return new InteractionCounter.Builder(); }
    if ("OrganizationRole".equals(type)) { return new OrganizationRole.Builder(); }
    if ("InteractAction".equals(type)) { return new InteractAction.Builder(); }
    if ("HousePainter".equals(type)) { return new HousePainter.Builder(); }
    if ("TrainReservation".equals(type)) { return new TrainReservation.Builder(); }
    if ("SubwayStation".equals(type)) { return new SubwayStation.Builder(); }
    if ("FinancialProduct".equals(type)) { return new FinancialProduct.Builder(); }
    if ("Blog".equals(type)) { return new Blog.Builder(); }
    if ("ExerciseGym".equals(type)) { return new ExerciseGym.Builder(); }
    if ("ReservationStatusType".equals(type)) { return new ReservationStatusType.Builder(); }
    if ("CityHall".equals(type)) { return new CityHall.Builder(); }
    if ("QuantitativeValue".equals(type)) { return new QuantitativeValue.Builder(); }
    if ("CommunicateAction".equals(type)) { return new CommunicateAction.Builder(); }
    if ("Apartment".equals(type)) { return new Apartment.Builder(); }
    if ("EmploymentAgency".equals(type)) { return new EmploymentAgency.Builder(); }
    if ("UnRegisterAction".equals(type)) { return new UnRegisterAction.Builder(); }
    if ("Invoice".equals(type)) { return new Invoice.Builder(); }
    if ("MusicAlbum".equals(type)) { return new MusicAlbum.Builder(); }
    if ("BuddhistTemple".equals(type)) { return new BuddhistTemple.Builder(); }
    if ("FurnitureStore".equals(type)) { return new FurnitureStore.Builder(); }
    if ("ReviewAction".equals(type)) { return new ReviewAction.Builder(); }
    if ("RentAction".equals(type)) { return new RentAction.Builder(); }
    if ("BookFormatType".equals(type)) { return new BookFormatType.Builder(); }
    if ("AutoRepair".equals(type)) { return new AutoRepair.Builder(); }
    if ("RiverBodyOfWater".equals(type)) { return new RiverBodyOfWater.Builder(); }
    if ("SuspendAction".equals(type)) { return new SuspendAction.Builder(); }
    if ("MedicalOrganization".equals(type)) { return new MedicalOrganization.Builder(); }
    if ("ServiceChannel".equals(type)) { return new ServiceChannel.Builder(); }
    if ("SellAction".equals(type)) { return new SellAction.Builder(); }
    if ("UserPlays".equals(type)) { return new UserPlays.Builder(); }
    if ("WholesaleStore".equals(type)) { return new WholesaleStore.Builder(); }
    if ("GovernmentPermit".equals(type)) { return new GovernmentPermit.Builder(); }
    if ("RecyclingCenter".equals(type)) { return new RecyclingCenter.Builder(); }
    if ("FastFoodRestaurant".equals(type)) { return new FastFoodRestaurant.Builder(); }
    if ("SoftwareSourceCode".equals(type)) { return new SoftwareSourceCode.Builder(); }
    if ("Hospital".equals(type)) { return new Hospital.Builder(); }
    if ("IndividualProduct".equals(type)) { return new IndividualProduct.Builder(); }
    if ("RadioSeason".equals(type)) { return new RadioSeason.Builder(); }
    if ("TelevisionStation".equals(type)) { return new TelevisionStation.Builder(); }
    if ("Waterfall".equals(type)) { return new Waterfall.Builder(); }
    if ("BroadcastService".equals(type)) { return new BroadcastService.Builder(); }
    if ("CheckInAction".equals(type)) { return new CheckInAction.Builder(); }
    if ("MarryAction".equals(type)) { return new MarryAction.Builder(); }
    if ("Cemetery".equals(type)) { return new Cemetery.Builder(); }
    if ("PerformingGroup".equals(type)) { return new PerformingGroup.Builder(); }
    if ("Sculpture".equals(type)) { return new Sculpture.Builder(); }
    if ("CreateAction".equals(type)) { return new CreateAction.Builder(); }
    if ("NoteDigitalDocument".equals(type)) { return new NoteDigitalDocument.Builder(); }
    if ("AdministrativeArea".equals(type)) { return new AdministrativeArea.Builder(); }
    if ("PropertyValue".equals(type)) { return new PropertyValue.Builder(); }
    if ("Periodical".equals(type)) { return new Periodical.Builder(); }
    if ("BusinessEntityType".equals(type)) { return new BusinessEntityType.Builder(); }
    if ("EndorseAction".equals(type)) { return new EndorseAction.Builder(); }
    if ("Rating".equals(type)) { return new Rating.Builder(); }
    if ("LakeBodyOfWater".equals(type)) { return new LakeBodyOfWater.Builder(); }
    if ("GasStation".equals(type)) { return new GasStation.Builder(); }
    if ("GovernmentOffice".equals(type)) { return new GovernmentOffice.Builder(); }
    if ("LodgingBusiness".equals(type)) { return new LodgingBusiness.Builder(); }
    if ("ActionStatusType".equals(type)) { return new ActionStatusType.Builder(); }
    if ("GeneralContractor".equals(type)) { return new GeneralContractor.Builder(); }
    if ("PaymentCard".equals(type)) { return new PaymentCard.Builder(); }
    if ("ArtGallery".equals(type)) { return new ArtGallery.Builder(); }
    if ("DownloadAction".equals(type)) { return new DownloadAction.Builder(); }
    if ("ParcelDelivery".equals(type)) { return new ParcelDelivery.Builder(); }
    if ("Language".equals(type)) { return new Language.Builder(); }
    if ("VisualArtsEvent".equals(type)) { return new VisualArtsEvent.Builder(); }
    if ("Library".equals(type)) { return new Library.Builder(); }
    if ("TrackAction".equals(type)) { return new TrackAction.Builder(); }
    if ("MoveAction".equals(type)) { return new MoveAction.Builder(); }
    if ("ApartmentComplex".equals(type)) { return new ApartmentComplex.Builder(); }
    if ("Locksmith".equals(type)) { return new Locksmith.Builder(); }
    if ("TelevisionChannel".equals(type)) { return new TelevisionChannel.Builder(); }
    if ("QAPage".equals(type)) { return new QAPage.Builder(); }
    if ("ProgramMembership".equals(type)) { return new ProgramMembership.Builder(); }
    if ("ControlAction".equals(type)) { return new ControlAction.Builder(); }
    if ("ItemListOrderType".equals(type)) { return new ItemListOrderType.Builder(); }
    if ("Mountain".equals(type)) { return new Mountain.Builder(); }
    if ("PublicationVolume".equals(type)) { return new PublicationVolume.Builder(); }
    if ("TireShop".equals(type)) { return new TireShop.Builder(); }
    if ("BroadcastEvent".equals(type)) { return new BroadcastEvent.Builder(); }
    if ("BarOrPub".equals(type)) { return new BarOrPub.Builder(); }
    if ("BusTrip".equals(type)) { return new BusTrip.Builder(); }
    if ("SkiResort".equals(type)) { return new SkiResort.Builder(); }
    if ("GiveAction".equals(type)) { return new GiveAction.Builder(); }
    if ("ScheduleAction".equals(type)) { return new ScheduleAction.Builder(); }
    if ("FoodService".equals(type)) { return new FoodService.Builder(); }
    if ("Article".equals(type)) { return new Article.Builder(); }
    if ("BookmarkAction".equals(type)) { return new BookmarkAction.Builder(); }
    if ("PlaceOfWorship".equals(type)) { return new PlaceOfWorship.Builder(); }
    if ("GameServerStatus".equals(type)) { return new GameServerStatus.Builder(); }
    if ("State".equals(type)) { return new State.Builder(); }
    if ("ProfessionalService".equals(type)) { return new ProfessionalService.Builder(); }
    if ("CompoundPriceSpecification".equals(type)) { return new CompoundPriceSpecification.Builder(); }
    if ("SiteNavigationElement".equals(type)) { return new SiteNavigationElement.Builder(); }
    if ("CookAction".equals(type)) { return new CookAction.Builder(); }
    if ("Thing".equals(type)) { return new Thing.Builder(); }
    if ("ImageObject".equals(type)) { return new ImageObject.Builder(); }
    if ("ActivateAction".equals(type)) { return new ActivateAction.Builder(); }
    if ("SportsTeam".equals(type)) { return new SportsTeam.Builder(); }
    if ("EventVenue".equals(type)) { return new EventVenue.Builder(); }
    if ("CourseInstance".equals(type)) { return new CourseInstance.Builder(); }
    if ("NewsArticle".equals(type)) { return new NewsArticle.Builder(); }
    if ("Corporation".equals(type)) { return new Corporation.Builder(); }
    if ("SportsActivityLocation".equals(type)) { return new SportsActivityLocation.Builder(); }
    if ("Airport".equals(type)) { return new Airport.Builder(); }
    if ("Seat".equals(type)) { return new Seat.Builder(); }
    if ("OfficeEquipmentStore".equals(type)) { return new OfficeEquipmentStore.Builder(); }
    if ("PaymentService".equals(type)) { return new PaymentService.Builder(); }
    if ("DepositAccount".equals(type)) { return new DepositAccount.Builder(); }
    if ("MonetaryAmount".equals(type)) { return new MonetaryAmount.Builder(); }
    if ("ArriveAction".equals(type)) { return new ArriveAction.Builder(); }
    if ("Code".equals(type)) { return new Code.Builder(); }
    if ("OwnershipInfo".equals(type)) { return new OwnershipInfo.Builder(); }
    if ("AmusementPark".equals(type)) { return new AmusementPark.Builder(); }
    if ("Accommodation".equals(type)) { return new Accommodation.Builder(); }
    if ("Restaurant".equals(type)) { return new Restaurant.Builder(); }
    if ("RadioSeries".equals(type)) { return new RadioSeries.Builder(); }
    if ("MovieTheater".equals(type)) { return new MovieTheater.Builder(); }
    if ("ConvenienceStore".equals(type)) { return new ConvenienceStore.Builder(); }
    if ("Reservoir".equals(type)) { return new Reservoir.Builder(); }
    if ("OrganizeAction".equals(type)) { return new OrganizeAction.Builder(); }
    if ("DepartAction".equals(type)) { return new DepartAction.Builder(); }
    if ("Ticket".equals(type)) { return new Ticket.Builder(); }
    if ("HardwareStore".equals(type)) { return new HardwareStore.Builder(); }
    if ("SocialMediaPosting".equals(type)) { return new SocialMediaPosting.Builder(); }
    if ("PresentationDigitalDocument".equals(type)) { return new PresentationDigitalDocument.Builder(); }
    if ("SendAction".equals(type)) { return new SendAction.Builder(); }
    if ("OnDemandEvent".equals(type)) { return new OnDemandEvent.Builder(); }
    if ("DiscussionForumPosting".equals(type)) { return new DiscussionForumPosting.Builder(); }
    if ("Pharmacy".equals(type)) { return new Pharmacy.Builder(); }
    if ("MovieSeries".equals(type)) { return new MovieSeries.Builder(); }
    if ("DigitalDocument".equals(type)) { return new DigitalDocument.Builder(); }
    if ("RegisterAction".equals(type)) { return new RegisterAction.Builder(); }
    if ("LandmarksOrHistoricalBuildings".equals(type)) { return new LandmarksOrHistoricalBuildings.Builder(); }
    if ("ExhibitionEvent".equals(type)) { return new ExhibitionEvent.Builder(); }
    if ("WebPage".equals(type)) { return new WebPage.Builder(); }
    if ("ListItem".equals(type)) { return new ListItem.Builder(); }
    if ("RsvpAction".equals(type)) { return new RsvpAction.Builder(); }
    if ("AnimalShelter".equals(type)) { return new AnimalShelter.Builder(); }
    if ("Crematorium".equals(type)) { return new Crematorium.Builder(); }
    if ("UserCheckins".equals(type)) { return new UserCheckins.Builder(); }
    if ("GenderType".equals(type)) { return new GenderType.Builder(); }
    if ("WebPageElement".equals(type)) { return new WebPageElement.Builder(); }
    if ("ReserveAction".equals(type)) { return new ReserveAction.Builder(); }
    if ("MovieClip".equals(type)) { return new MovieClip.Builder(); }
    if ("OrderAction".equals(type)) { return new OrderAction.Builder(); }
    if ("DiscoverAction".equals(type)) { return new DiscoverAction.Builder(); }
    if ("ParcelService".equals(type)) { return new ParcelService.Builder(); }
    if ("ContactPage".equals(type)) { return new ContactPage.Builder(); }
    if ("AllocateAction".equals(type)) { return new AllocateAction.Builder(); }
    if ("Country".equals(type)) { return new Country.Builder(); }
    if ("AutoBodyShop".equals(type)) { return new AutoBodyShop.Builder(); }
    if ("DataCatalog".equals(type)) { return new DataCatalog.Builder(); }
    if ("OrderItem".equals(type)) { return new OrderItem.Builder(); }
    if ("StructuredValue".equals(type)) { return new StructuredValue.Builder(); }
    if ("InvestmentOrDeposit".equals(type)) { return new InvestmentOrDeposit.Builder(); }
    if ("GamePlayMode".equals(type)) { return new GamePlayMode.Builder(); }
    if ("Landform".equals(type)) { return new Landform.Builder(); }
    if ("CreativeWorkSeries".equals(type)) { return new CreativeWorkSeries.Builder(); }
    if ("CatholicChurch".equals(type)) { return new CatholicChurch.Builder(); }
    if ("SoftwareApplication".equals(type)) { return new SoftwareApplication.Builder(); }
    if ("AuthorizeAction".equals(type)) { return new AuthorizeAction.Builder(); }
    if ("TVSeason".equals(type)) { return new TVSeason.Builder(); }
    if ("WinAction".equals(type)) { return new WinAction.Builder(); }
    if ("EntertainmentBusiness".equals(type)) { return new EntertainmentBusiness.Builder(); }
    if ("Episode".equals(type)) { return new Episode.Builder(); }
    if ("GatedResidenceCommunity".equals(type)) { return new GatedResidenceCommunity.Builder(); }
    if ("HobbyShop".equals(type)) { return new HobbyShop.Builder(); }
    if ("AdultEntertainment".equals(type)) { return new AdultEntertainment.Builder(); }
    if ("CheckOutAction".equals(type)) { return new CheckOutAction.Builder(); }
    if ("VideoGallery".equals(type)) { return new VideoGallery.Builder(); }
    if ("ParkingFacility".equals(type)) { return new ParkingFacility.Builder(); }
    if ("AutomotiveBusiness".equals(type)) { return new AutomotiveBusiness.Builder(); }
    if ("NGO".equals(type)) { return new NGO.Builder(); }
    if ("RadioEpisode".equals(type)) { return new RadioEpisode.Builder(); }
    if ("TouristInformationCenter".equals(type)) { return new TouristInformationCenter.Builder(); }
    if ("RadioStation".equals(type)) { return new RadioStation.Builder(); }
    if ("Game".equals(type)) { return new Game.Builder(); }
    if ("Beach".equals(type)) { return new Beach.Builder(); }
    if ("UserBlocks".equals(type)) { return new UserBlocks.Builder(); }
    if ("Photograph".equals(type)) { return new Photograph.Builder(); }
    if ("EventStatusType".equals(type)) { return new EventStatusType.Builder(); }
    if ("EducationalAudience".equals(type)) { return new EducationalAudience.Builder(); }
    if ("Vehicle".equals(type)) { return new Vehicle.Builder(); }
    if ("EmergencyService".equals(type)) { return new EmergencyService.Builder(); }
    if ("OfferItemCondition".equals(type)) { return new OfferItemCondition.Builder(); }
    if ("BefriendAction".equals(type)) { return new BefriendAction.Builder(); }
    if ("AddAction".equals(type)) { return new AddAction.Builder(); }
    if ("HomeAndConstructionBusiness".equals(type)) { return new HomeAndConstructionBusiness.Builder(); }
    if ("WarrantyPromise".equals(type)) { return new WarrantyPromise.Builder(); }
    if ("ProfilePage".equals(type)) { return new ProfilePage.Builder(); }
    if ("MusicRecording".equals(type)) { return new MusicRecording.Builder(); }
    if ("DeliveryChargeSpecification".equals(type)) { return new DeliveryChargeSpecification.Builder(); }
    if ("HealthClub".equals(type)) { return new HealthClub.Builder(); }
    if ("Attorney".equals(type)) { return new Attorney.Builder(); }
    if ("StadiumOrArena".equals(type)) { return new StadiumOrArena.Builder(); }
    if ("EatAction".equals(type)) { return new EatAction.Builder(); }
    if ("Map".equals(type)) { return new Map.Builder(); }
    if ("Season".equals(type)) { return new Season.Builder(); }
    if ("FlightReservation".equals(type)) { return new FlightReservation.Builder(); }
    if ("SourceCodeRevision".equals(type)) { return new SourceCodeRevision.Builder(); }
    if ("PublicationIssue".equals(type)) { return new PublicationIssue.Builder(); }
    if ("ShoeStore".equals(type)) { return new ShoeStore.Builder(); }
    if ("SocialEvent".equals(type)) { return new SocialEvent.Builder(); }
    if ("PawnShop".equals(type)) { return new PawnShop.Builder(); }
    if ("Event".equals(type)) { return new Event.Builder(); }
    if ("BodyOfWater".equals(type)) { return new BodyOfWater.Builder(); }
    if ("ProductModel".equals(type)) { return new ProductModel.Builder(); }
    if ("MusicEvent".equals(type)) { return new MusicEvent.Builder(); }
    if ("BroadcastChannel".equals(type)) { return new BroadcastChannel.Builder(); }
    if ("DataFeed".equals(type)) { return new DataFeed.Builder(); }
    if ("LoseAction".equals(type)) { return new LoseAction.Builder(); }
    if ("CreditCard".equals(type)) { return new CreditCard.Builder(); }
    if ("DataDownload".equals(type)) { return new DataDownload.Builder(); }
    if ("ReactAction".equals(type)) { return new ReactAction.Builder(); }
    if ("Hotel".equals(type)) { return new Hotel.Builder(); }
    if ("ResumeAction".equals(type)) { return new ResumeAction.Builder(); }
    if ("DepartmentStore".equals(type)) { return new DepartmentStore.Builder(); }
    if ("OceanBodyOfWater".equals(type)) { return new OceanBodyOfWater.Builder(); }
    if ("MapCategoryType".equals(type)) { return new MapCategoryType.Builder(); }
    if ("BowlingAlley".equals(type)) { return new BowlingAlley.Builder(); }
    if ("Aquarium".equals(type)) { return new Aquarium.Builder(); }
    if ("MusicAlbumReleaseType".equals(type)) { return new MusicAlbumReleaseType.Builder(); }
    if ("WarrantyScope".equals(type)) { return new WarrantyScope.Builder(); }
    if ("PetStore".equals(type)) { return new PetStore.Builder(); }
    if ("DeleteAction".equals(type)) { return new DeleteAction.Builder(); }
    if ("Energy".equals(type)) { return new Energy.Builder(); }
    if ("School".equals(type)) { return new School.Builder(); }
    if ("MusicAlbumProductionType".equals(type)) { return new MusicAlbumProductionType.Builder(); }
    if ("Book".equals(type)) { return new Book.Builder(); }
    if ("DigitalDocumentPermissionType".equals(type)) { return new DigitalDocumentPermissionType.Builder(); }
    if ("ChooseAction".equals(type)) { return new ChooseAction.Builder(); }
    if ("AutoDealer".equals(type)) { return new AutoDealer.Builder(); }
    if ("LiteraryEvent".equals(type)) { return new LiteraryEvent.Builder(); }
    if ("WebApplication".equals(type)) { return new WebApplication.Builder(); }
    if ("GroceryStore".equals(type)) { return new GroceryStore.Builder(); }
    if ("NailSalon".equals(type)) { return new NailSalon.Builder(); }
    if ("FilmAction".equals(type)) { return new FilmAction.Builder(); }
    if ("AchieveAction".equals(type)) { return new AchieveAction.Builder(); }
    if ("ApplyAction".equals(type)) { return new ApplyAction.Builder(); }
    if ("Canal".equals(type)) { return new Canal.Builder(); }
    if ("Residence".equals(type)) { return new Residence.Builder(); }
    if ("BusinessFunction".equals(type)) { return new BusinessFunction.Builder(); }
    if ("City".equals(type)) { return new City.Builder(); }
    if ("UserPageVisits".equals(type)) { return new UserPageVisits.Builder(); }
    if ("ShareAction".equals(type)) { return new ShareAction.Builder(); }
    if ("Store".equals(type)) { return new Store.Builder(); }
    if ("GovernmentOrganization".equals(type)) { return new GovernmentOrganization.Builder(); }
    if ("LodgingReservation".equals(type)) { return new LodgingReservation.Builder(); }
    if ("EntryPoint".equals(type)) { return new EntryPoint.Builder(); }
    if ("VisualArtwork".equals(type)) { return new VisualArtwork.Builder(); }
    if ("PayAction".equals(type)) { return new PayAction.Builder(); }
    if ("ChildrensEvent".equals(type)) { return new ChildrensEvent.Builder(); }
    if ("OfferCatalog".equals(type)) { return new OfferCatalog.Builder(); }
    if ("MusicVenue".equals(type)) { return new MusicVenue.Builder(); }
    if ("AgreeAction".equals(type)) { return new AgreeAction.Builder(); }
    if ("CurrencyConversionService".equals(type)) { return new CurrencyConversionService.Builder(); }
    if ("ChildCare".equals(type)) { return new ChildCare.Builder(); }
    if ("CheckoutPage".equals(type)) { return new CheckoutPage.Builder(); }
    if ("Brewery".equals(type)) { return new Brewery.Builder(); }
    if ("Zoo".equals(type)) { return new Zoo.Builder(); }
    if ("SportsEvent".equals(type)) { return new SportsEvent.Builder(); }
    if ("ReplaceAction".equals(type)) { return new ReplaceAction.Builder(); }
    if ("BankAccount".equals(type)) { return new BankAccount.Builder(); }
    if ("ReadAction".equals(type)) { return new ReadAction.Builder(); }
    if ("MusicComposition".equals(type)) { return new MusicComposition.Builder(); }
    if ("House".equals(type)) { return new House.Builder(); }
    if ("SearchAction".equals(type)) { return new SearchAction.Builder(); }
    if ("RoofingContractor".equals(type)) { return new RoofingContractor.Builder(); }
    if ("Order".equals(type)) { return new Order.Builder(); }
    if ("Embassy".equals(type)) { return new Embassy.Builder(); }
    if ("SportingGoodsStore".equals(type)) { return new SportingGoodsStore.Builder(); }
    if ("TravelAction".equals(type)) { return new TravelAction.Builder(); }
    if ("HotelRoom".equals(type)) { return new HotelRoom.Builder(); }
    if ("WPHeader".equals(type)) { return new WPHeader.Builder(); }
    if ("BusinessAudience".equals(type)) { return new BusinessAudience.Builder(); }
    if ("JobPosting".equals(type)) { return new JobPosting.Builder(); }
    if ("Motel".equals(type)) { return new Motel.Builder(); }
    if ("SportsOrganization".equals(type)) { return new SportsOrganization.Builder(); }
    if ("DeactivateAction".equals(type)) { return new DeactivateAction.Builder(); }
    if ("UserLikes".equals(type)) { return new UserLikes.Builder(); }
    if ("ParentAudience".equals(type)) { return new ParentAudience.Builder(); }
    if ("HighSchool".equals(type)) { return new HighSchool.Builder(); }
    if ("Distance".equals(type)) { return new Distance.Builder(); }
    if ("DonateAction".equals(type)) { return new DonateAction.Builder(); }
    if ("GolfCourse".equals(type)) { return new GolfCourse.Builder(); }
    if ("MobilePhoneStore".equals(type)) { return new MobilePhoneStore.Builder(); }
    if ("SomeProducts".equals(type)) { return new SomeProducts.Builder(); }
    if ("ContactPoint".equals(type)) { return new ContactPoint.Builder(); }
    if ("SportsClub".equals(type)) { return new SportsClub.Builder(); }
    if ("PaymentMethod".equals(type)) { return new PaymentMethod.Builder(); }
    if ("PerformAction".equals(type)) { return new PerformAction.Builder(); }
    if ("DanceGroup".equals(type)) { return new DanceGroup.Builder(); }
    if ("LegislativeBuilding".equals(type)) { return new LegislativeBuilding.Builder(); }
    if ("Course".equals(type)) { return new Course.Builder(); }
    if ("SoftwareApplicationBuild".equals(type)) { return new SoftwareApplicationBuild.Builder(); }
    if ("InformAction".equals(type)) { return new InformAction.Builder(); }
    if ("EducationEvent".equals(type)) { return new EducationEvent.Builder(); }
    if ("FireStation".equals(type)) { return new FireStation.Builder(); }
    if ("EngineSpecification".equals(type)) { return new EngineSpecification.Builder(); }
    if ("Flight".equals(type)) { return new Flight.Builder(); }
    if ("Intangible".equals(type)) { return new Intangible.Builder(); }
    if ("ReplyAction".equals(type)) { return new ReplyAction.Builder(); }
    if ("SubscribeAction".equals(type)) { return new SubscribeAction.Builder(); }
    if ("Physician".equals(type)) { return new Physician.Builder(); }
    if ("APIReference".equals(type)) { return new APIReference.Builder(); }
    if ("EmailMessage".equals(type)) { return new EmailMessage.Builder(); }
    if ("Suite".equals(type)) { return new Suite.Builder(); }
    if ("PropertyValueSpecification".equals(type)) { return new PropertyValueSpecification.Builder(); }
    if ("ScreeningEvent".equals(type)) { return new ScreeningEvent.Builder(); }
    if ("OutletStore".equals(type)) { return new OutletStore.Builder(); }
    if ("WatchAction".equals(type)) { return new WatchAction.Builder(); }
    if ("IgnoreAction".equals(type)) { return new IgnoreAction.Builder(); }
    if ("UnitPriceSpecification".equals(type)) { return new UnitPriceSpecification.Builder(); }
    if ("Series".equals(type)) { return new Series.Builder(); }
    if ("DriveWheelConfigurationValue".equals(type)) { return new DriveWheelConfigurationValue.Builder(); }
    if ("Hostel".equals(type)) { return new Hostel.Builder(); }
    if ("RestrictedDiet".equals(type)) { return new RestrictedDiet.Builder(); }
    if ("ScholarlyArticle".equals(type)) { return new ScholarlyArticle.Builder(); }
    if ("WPAdBlock".equals(type)) { return new WPAdBlock.Builder(); }
    if ("BikeStore".equals(type)) { return new BikeStore.Builder(); }
    if ("NightClub".equals(type)) { return new NightClub.Builder(); }
    if ("Pond".equals(type)) { return new Pond.Builder(); }
    if ("TVSeries".equals(type)) { return new TVSeries.Builder(); }
    if ("CreativeWorkSeason".equals(type)) { return new CreativeWorkSeason.Builder(); }
    if ("BankOrCreditUnion".equals(type)) { return new BankOrCreditUnion.Builder(); }
    if ("RealEstateAgent".equals(type)) { return new RealEstateAgent.Builder(); }
    if ("ElectronicsStore".equals(type)) { return new ElectronicsStore.Builder(); }
    if ("HealthAndBeautyBusiness".equals(type)) { return new HealthAndBeautyBusiness.Builder(); }
    if ("VoteAction".equals(type)) { return new VoteAction.Builder(); }
    if ("Project".equals(type)) { return new Project.Builder(); }
    if ("RadioClip".equals(type)) { return new RadioClip.Builder(); }
    if ("VideoObject".equals(type)) { return new VideoObject.Builder(); }
    if ("Permit".equals(type)) { return new Permit.Builder(); }
    if ("Comment".equals(type)) { return new Comment.Builder(); }
    if ("GeoCircle".equals(type)) { return new GeoCircle.Builder(); }
    if ("DeliveryEvent".equals(type)) { return new DeliveryEvent.Builder(); }
    if ("FindAction".equals(type)) { return new FindAction.Builder(); }
    if ("BeautySalon".equals(type)) { return new BeautySalon.Builder(); }
    if ("OrderStatus".equals(type)) { return new OrderStatus.Builder(); }
    if ("BedAndBreakfast".equals(type)) { return new BedAndBreakfast.Builder(); }
    if ("AboutPage".equals(type)) { return new AboutPage.Builder(); }
    if ("MiddleSchool".equals(type)) { return new MiddleSchool.Builder(); }
    if ("Organization".equals(type)) { return new Organization.Builder(); }
    if ("Synagogue".equals(type)) { return new Synagogue.Builder(); }
    if ("AutomatedTeller".equals(type)) { return new AutomatedTeller.Builder(); }
    if ("DataFeedItem".equals(type)) { return new DataFeedItem.Builder(); }
    if ("QualitativeValue".equals(type)) { return new QualitativeValue.Builder(); }
    if ("AggregateRating".equals(type)) { return new AggregateRating.Builder(); }
    if ("AlignmentObject".equals(type)) { return new AlignmentObject.Builder(); }
    if ("PerformingArtsTheater".equals(type)) { return new PerformingArtsTheater.Builder(); }
    if ("RentalCarReservation".equals(type)) { return new RentalCarReservation.Builder(); }
    if ("MotorcycleRepair".equals(type)) { return new MotorcycleRepair.Builder(); }
    if ("ElementarySchool".equals(type)) { return new ElementarySchool.Builder(); }
    if ("SearchResultsPage".equals(type)) { return new SearchResultsPage.Builder(); }
    if ("Winery".equals(type)) { return new Winery.Builder(); }
    if ("AggregateOffer".equals(type)) { return new AggregateOffer.Builder(); }
    if ("Action".equals(type)) { return new Action.Builder(); }
    if ("DrawAction".equals(type)) { return new DrawAction.Builder(); }
    if ("DislikeAction".equals(type)) { return new DislikeAction.Builder(); }
    if ("Bridge".equals(type)) { return new Bridge.Builder(); }
    if ("LegalService".equals(type)) { return new LegalService.Builder(); }
    if ("Mass".equals(type)) { return new Mass.Builder(); }
    if ("MusicGroup".equals(type)) { return new MusicGroup.Builder(); }
    if ("MeetingRoom".equals(type)) { return new MeetingRoom.Builder(); }
    if ("JewelryStore".equals(type)) { return new JewelryStore.Builder(); }
    if ("NutritionInformation".equals(type)) { return new NutritionInformation.Builder(); }
    if ("SelfStorage".equals(type)) { return new SelfStorage.Builder(); }
    if ("TaxiService".equals(type)) { return new TaxiService.Builder(); }
    if ("Service".equals(type)) { return new Service.Builder(); }
    if ("PerformanceRole".equals(type)) { return new PerformanceRole.Builder(); }
    if ("Courthouse".equals(type)) { return new Courthouse.Builder(); }
    if ("CableOrSatelliteService".equals(type)) { return new CableOrSatelliteService.Builder(); }
    if ("Brand".equals(type)) { return new Brand.Builder(); }
    if ("QuoteAction".equals(type)) { return new QuoteAction.Builder(); }
    if ("MusicRelease".equals(type)) { return new MusicRelease.Builder(); }
    if ("DeliveryMethod".equals(type)) { return new DeliveryMethod.Builder(); }
    if ("TennisComplex".equals(type)) { return new TennisComplex.Builder(); }
    if ("CommentAction".equals(type)) { return new CommentAction.Builder(); }
    if ("WPSideBar".equals(type)) { return new WPSideBar.Builder(); }
    if ("Florist".equals(type)) { return new Florist.Builder(); }
    if ("InstallAction".equals(type)) { return new InstallAction.Builder(); }
    if ("Menu".equals(type)) { return new Menu.Builder(); }
    if ("AutoWash".equals(type)) { return new AutoWash.Builder(); }
    if ("BreadcrumbList".equals(type)) { return new BreadcrumbList.Builder(); }
    if ("PhotographAction".equals(type)) { return new PhotographAction.Builder(); }
    if ("Playground".equals(type)) { return new Playground.Builder(); }
    if ("CivicStructure".equals(type)) { return new CivicStructure.Builder(); }
    if ("TieAction".equals(type)) { return new TieAction.Builder(); }
    if ("GameServer".equals(type)) { return new GameServer.Builder(); }
    if ("InviteAction".equals(type)) { return new InviteAction.Builder(); }
    if ("LocalBusiness".equals(type)) { return new LocalBusiness.Builder(); }
    if ("ReservationPackage".equals(type)) { return new ReservationPackage.Builder(); }
    if ("Taxi".equals(type)) { return new Taxi.Builder(); }
    if ("TattooParlor".equals(type)) { return new TattooParlor.Builder(); }
    if ("Casino".equals(type)) { return new Casino.Builder(); }
    if ("Person".equals(type)) { return new Person.Builder(); }
    if ("MotorcycleDealer".equals(type)) { return new MotorcycleDealer.Builder(); }
    if ("SingleFamilyResidence".equals(type)) { return new SingleFamilyResidence.Builder(); }
    if ("TrainTrip".equals(type)) { return new TrainTrip.Builder(); }
    if ("TouristAttraction".equals(type)) { return new TouristAttraction.Builder(); }
    if ("Audience".equals(type)) { return new Audience.Builder(); }
    if ("PaymentChargeSpecification".equals(type)) { return new PaymentChargeSpecification.Builder(); }
    if ("MovingCompany".equals(type)) { return new MovingCompany.Builder(); }
    if ("BusStation".equals(type)) { return new BusStation.Builder(); }
    if ("Bakery".equals(type)) { return new Bakery.Builder(); }
    if ("LiveBlogPosting".equals(type)) { return new LiveBlogPosting.Builder(); }
    if ("ItemList".equals(type)) { return new ItemList.Builder(); }
    if ("ConfirmAction".equals(type)) { return new ConfirmAction.Builder(); }
    if ("LeaveAction".equals(type)) { return new LeaveAction.Builder(); }
    if ("UserComments".equals(type)) { return new UserComments.Builder(); }
    if ("AssignAction".equals(type)) { return new AssignAction.Builder(); }
    if ("LikeAction".equals(type)) { return new LikeAction.Builder(); }
    if ("Review".equals(type)) { return new Review.Builder(); }
    if ("IceCreamShop".equals(type)) { return new IceCreamShop.Builder(); }
    if ("PeopleAudience".equals(type)) { return new PeopleAudience.Builder(); }
    if ("Airline".equals(type)) { return new Airline.Builder(); }
    if ("Message".equals(type)) { return new Message.Builder(); }
    if ("Table".equals(type)) { return new Table.Builder(); }
    if ("Electrician".equals(type)) { return new Electrician.Builder(); }
    if ("ComedyEvent".equals(type)) { return new ComedyEvent.Builder(); }
    if ("UserPlusOnes".equals(type)) { return new UserPlusOnes.Builder(); }
    if ("Enumeration".equals(type)) { return new Enumeration.Builder(); }
    if ("RVPark".equals(type)) { return new RVPark.Builder(); }
    if ("DryCleaningOrLaundry".equals(type)) { return new DryCleaningOrLaundry.Builder(); }
    if ("TVEpisode".equals(type)) { return new TVEpisode.Builder(); }
    if ("AppendAction".equals(type)) { return new AppendAction.Builder(); }
    if ("MobileApplication".equals(type)) { return new MobileApplication.Builder(); }
    if ("TrainStation".equals(type)) { return new TrainStation.Builder(); }
    if ("TheaterEvent".equals(type)) { return new TheaterEvent.Builder(); }
    if ("MenuItem".equals(type)) { return new MenuItem.Builder(); }
    if ("ReceiveAction".equals(type)) { return new ReceiveAction.Builder(); }
    if ("LoanOrCredit".equals(type)) { return new LoanOrCredit.Builder(); }
    if ("DanceEvent".equals(type)) { return new DanceEvent.Builder(); }
    if ("DaySpa".equals(type)) { return new DaySpa.Builder(); }
    if ("TakeAction".equals(type)) { return new TakeAction.Builder(); }
    if ("DisagreeAction".equals(type)) { return new DisagreeAction.Builder(); }
    if ("Dataset".equals(type)) { return new Dataset.Builder(); }
    if ("Question".equals(type)) { return new Question.Builder(); }
    if ("PlayAction".equals(type)) { return new PlayAction.Builder(); }
    if ("Offer".equals(type)) { return new Offer.Builder(); }
    if ("Quantity".equals(type)) { return new Quantity.Builder(); }
    if ("Answer".equals(type)) { return new Answer.Builder(); }
    if ("Clip".equals(type)) { return new Clip.Builder(); }
    if ("Preschool".equals(type)) { return new Preschool.Builder(); }
    if ("AudioObject".equals(type)) { return new AudioObject.Builder(); }
    if ("EmployeeRole".equals(type)) { return new EmployeeRole.Builder(); }
    if ("FoodEstablishmentReservation".equals(type)) { return new FoodEstablishmentReservation.Builder(); }
    if ("Plumber".equals(type)) { return new Plumber.Builder(); }
    if ("MediaObject".equals(type)) { return new MediaObject.Builder(); }
    if ("VideoGameClip".equals(type)) { return new VideoGameClip.Builder(); }
    if ("FoodEstablishment".equals(type)) { return new FoodEstablishment.Builder(); }
    if ("FollowAction".equals(type)) { return new FollowAction.Builder(); }
    if ("BuyAction".equals(type)) { return new BuyAction.Builder(); }
    if ("PriceSpecification".equals(type)) { return new PriceSpecification.Builder(); }
    if ("SeaBodyOfWater".equals(type)) { return new SeaBodyOfWater.Builder(); }
    if ("Notary".equals(type)) { return new Notary.Builder(); }
    if ("PostalAddress".equals(type)) { return new PostalAddress.Builder(); }
    if ("LockerDelivery".equals(type)) { return new LockerDelivery.Builder(); }
    if ("MusicVideoObject".equals(type)) { return new MusicVideoObject.Builder(); }
    if ("TypeAndQuantityNode".equals(type)) { return new TypeAndQuantityNode.Builder(); }
    if ("HinduTemple".equals(type)) { return new HinduTemple.Builder(); }
    if ("BusReservation".equals(type)) { return new BusReservation.Builder(); }
    if ("PaintAction".equals(type)) { return new PaintAction.Builder(); }
    if ("Park".equals(type)) { return new Park.Builder(); }
    if ("BoardingPolicyType".equals(type)) { return new BoardingPolicyType.Builder(); }
    if ("TipAction".equals(type)) { return new TipAction.Builder(); }
    if ("GovernmentBuilding".equals(type)) { return new GovernmentBuilding.Builder(); }
    if ("UserTweets".equals(type)) { return new UserTweets.Builder(); }
    if ("AssessAction".equals(type)) { return new AssessAction.Builder(); }
    if ("LiquorStore".equals(type)) { return new LiquorStore.Builder(); }
    if ("MusicStore".equals(type)) { return new MusicStore.Builder(); }
    if ("LocationFeatureSpecification".equals(type)) { return new LocationFeatureSpecification.Builder(); }
    if ("TechArticle".equals(type)) { return new TechArticle.Builder(); }
    if ("UseAction".equals(type)) { return new UseAction.Builder(); }
    if ("Duration".equals(type)) { return new Duration.Builder(); }
    if ("Recipe".equals(type)) { return new Recipe.Builder(); }
    if ("VideoGame".equals(type)) { return new VideoGame.Builder(); }
    if ("LendAction".equals(type)) { return new LendAction.Builder(); }
    if ("UserInteraction".equals(type)) { return new UserInteraction.Builder(); }
    if ("BookSeries".equals(type)) { return new BookSeries.Builder(); }
    if ("GeoShape".equals(type)) { return new GeoShape.Builder(); }
    if ("ItemPage".equals(type)) { return new ItemPage.Builder(); }
    if ("TravelAgency".equals(type)) { return new TravelAgency.Builder(); }
    if ("EducationalOrganization".equals(type)) { return new EducationalOrganization.Builder(); }
    if ("ItemAvailability".equals(type)) { return new ItemAvailability.Builder(); }
    if ("WantAction".equals(type)) { return new WantAction.Builder(); }
    if ("TradeAction".equals(type)) { return new TradeAction.Builder(); }
    if ("Specialty".equals(type)) { return new Specialty.Builder(); }
    if ("GovernmentService".equals(type)) { return new GovernmentService.Builder(); }
    if ("Festival".equals(type)) { return new Festival.Builder(); }
    if ("JoinAction".equals(type)) { return new JoinAction.Builder(); }
    if ("HVACBusiness".equals(type)) { return new HVACBusiness.Builder(); }
    if ("AccountingService".equals(type)) { return new AccountingService.Builder(); }
    if ("Place".equals(type)) { return new Place.Builder(); }
    if ("SteeringPositionValue".equals(type)) { return new SteeringPositionValue.Builder(); }
    if ("InternetCafe".equals(type)) { return new InternetCafe.Builder(); }
    if ("BorrowAction".equals(type)) { return new BorrowAction.Builder(); }
    if ("AskAction".equals(type)) { return new AskAction.Builder(); }
    if ("BusinessEvent".equals(type)) { return new BusinessEvent.Builder(); }
    if ("DefenceEstablishment".equals(type)) { return new DefenceEstablishment.Builder(); }
    if ("SaleEvent".equals(type)) { return new SaleEvent.Builder(); }
    if ("TaxiStand".equals(type)) { return new TaxiStand.Builder(); }
    if ("Report".equals(type)) { return new Report.Builder(); }
    if ("ListenAction".equals(type)) { return new ListenAction.Builder(); }
    if ("BookStore".equals(type)) { return new BookStore.Builder(); }
    if ("ToyStore".equals(type)) { return new ToyStore.Builder(); }
    if ("Campground".equals(type)) { return new Campground.Builder(); }
    if ("AutoPartsStore".equals(type)) { return new AutoPartsStore.Builder(); }
    if ("SpreadsheetDigitalDocument".equals(type)) { return new SpreadsheetDigitalDocument.Builder(); }
    if ("Reservation".equals(type)) { return new Reservation.Builder(); }
    if ("Product".equals(type)) { return new Product.Builder(); }
    if ("DrinkAction".equals(type)) { return new DrinkAction.Builder(); }
    if ("RadioChannel".equals(type)) { return new RadioChannel.Builder(); }
    if ("AcceptAction".equals(type)) { return new AcceptAction.Builder(); }
    if ("PlanAction".equals(type)) { return new PlanAction.Builder(); }
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
