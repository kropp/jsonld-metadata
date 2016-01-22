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

import java.io.IOException;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;

public class SmokeTest {
  private static final Date NOW = new Date(1234567890000L);
  public void testLymphaticVessel() throws IOException {
    final LymphaticVessel lymphaticVessel = SchemaOrg.lymphaticVessel()
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lymphaticVessel));
    assertEquals(lymphaticVessel, thing);
  }
  public void testConfirmAction() throws IOException {
    final ConfirmAction confirmAction = SchemaOrg.confirmAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(confirmAction));
    assertEquals(confirmAction, thing);
  }
  public void testListItem() throws IOException {
    final ListItem listItem = SchemaOrg.listItem()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(listItem));
    assertEquals(listItem, thing);
  }
  public void testTVSeries() throws IOException {
    final TVSeries tVSeries = SchemaOrg.tVSeries()
      .numberOfEpisodes(42)
      .numberOfSeasons(42)
      .endDate(NOW)
      .startDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tVSeries));
    assertEquals(tVSeries, thing);
  }
  public void testVisualArtwork() throws IOException {
    final VisualArtwork visualArtwork = SchemaOrg.visualArtwork()
      .artform("Test String")
      .artMedium("Test String")
      .artworkSurface("Test String")
      .artEdition(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(visualArtwork));
    assertEquals(visualArtwork, thing);
  }
  public void testDriveWheelConfigurationValue() throws IOException {
    final DriveWheelConfigurationValue driveWheelConfigurationValue = SchemaOrg.driveWheelConfigurationValue()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(driveWheelConfigurationValue));
    assertEquals(driveWheelConfigurationValue, thing);
  }
  public void testService() throws IOException {
    final Service service = SchemaOrg.service()
      .serviceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(service));
    assertEquals(service, thing);
  }
  public void testAlignmentObject() throws IOException {
    final AlignmentObject alignmentObject = SchemaOrg.alignmentObject()
      .alignmentType("Test String")
      .educationalFramework("Test String")
      .targetDescription("Test String")
      .targetName("Test String")
      .targetUrl("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(alignmentObject));
    assertEquals(alignmentObject, thing);
  }
  public void testAnimalShelter() throws IOException {
    final AnimalShelter animalShelter = SchemaOrg.animalShelter()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(animalShelter));
    assertEquals(animalShelter, thing);
  }
  public void testFastFoodRestaurant() throws IOException {
    final FastFoodRestaurant fastFoodRestaurant = SchemaOrg.fastFoodRestaurant()
      .acceptsReservations(true)
      .menu("Test String")
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(fastFoodRestaurant));
    assertEquals(fastFoodRestaurant, thing);
  }
  public void testAmusementPark() throws IOException {
    final AmusementPark amusementPark = SchemaOrg.amusementPark()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(amusementPark));
    assertEquals(amusementPark, thing);
  }
  public void testAddAction() throws IOException {
    final AddAction addAction = SchemaOrg.addAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(addAction));
    assertEquals(addAction, thing);
  }
  public void testPeopleAudience() throws IOException {
    final PeopleAudience peopleAudience = SchemaOrg.peopleAudience()
      .requiredGender("Test String")
      .requiredMaxAge(42)
      .requiredMinAge(42)
      .suggestedGender("Test String")
      .suggestedMaxAge(42)
      .suggestedMinAge(42)
      .audienceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(peopleAudience));
    assertEquals(peopleAudience, thing);
  }
  public void testBarOrPub() throws IOException {
    final BarOrPub barOrPub = SchemaOrg.barOrPub()
      .acceptsReservations(true)
      .menu("Test String")
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(barOrPub));
    assertEquals(barOrPub, thing);
  }
  public void testTVSeason() throws IOException {
    final TVSeason tVSeason = SchemaOrg.tVSeason()
      .endDate(NOW)
      .numberOfEpisodes(42)
      .seasonNumber(42)
      .startDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tVSeason));
    assertEquals(tVSeason, thing);
  }
  public void testMedicalRiskCalculator() throws IOException {
    final MedicalRiskCalculator medicalRiskCalculator = SchemaOrg.medicalRiskCalculator()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalRiskCalculator));
    assertEquals(medicalRiskCalculator, thing);
  }
  public void testCommentAction() throws IOException {
    final CommentAction commentAction = SchemaOrg.commentAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(commentAction));
    assertEquals(commentAction, thing);
  }
  public void testCreateAction() throws IOException {
    final CreateAction createAction = SchemaOrg.createAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(createAction));
    assertEquals(createAction, thing);
  }
  public void testPermit() throws IOException {
    final Permit permit = SchemaOrg.permit()
      .validFrom(NOW)
      .validUntil(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(permit));
    assertEquals(permit, thing);
  }
  public void testRejectAction() throws IOException {
    final RejectAction rejectAction = SchemaOrg.rejectAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rejectAction));
    assertEquals(rejectAction, thing);
  }
  public void testAppendAction() throws IOException {
    final AppendAction appendAction = SchemaOrg.appendAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(appendAction));
    assertEquals(appendAction, thing);
  }
  public void testDuration() throws IOException {
    final Duration duration = SchemaOrg.duration()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(duration));
    assertEquals(duration, thing);
  }
  public void testInsuranceAgency() throws IOException {
    final InsuranceAgency insuranceAgency = SchemaOrg.insuranceAgency()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(insuranceAgency));
    assertEquals(insuranceAgency, thing);
  }
  public void testTieAction() throws IOException {
    final TieAction tieAction = SchemaOrg.tieAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tieAction));
    assertEquals(tieAction, thing);
  }
  public void testGeoCoordinates() throws IOException {
    final GeoCoordinates geoCoordinates = SchemaOrg.geoCoordinates()
      .elevation(42)
      .latitude(42)
      .longitude(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(geoCoordinates));
    assertEquals(geoCoordinates, thing);
  }
  public void testJoint() throws IOException {
    final Joint joint = SchemaOrg.joint()
      .biomechnicalClass("Test String")
      .functionalClass("Test String")
      .structuralClass("Test String")
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(joint));
    assertEquals(joint, thing);
  }
  public void testGardenStore() throws IOException {
    final GardenStore gardenStore = SchemaOrg.gardenStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(gardenStore));
    assertEquals(gardenStore, thing);
  }
  public void testChildrensEvent() throws IOException {
    final ChildrensEvent childrensEvent = SchemaOrg.childrensEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(childrensEvent));
    assertEquals(childrensEvent, thing);
  }
  public void testMedicalTest() throws IOException {
    final MedicalTest medicalTest = SchemaOrg.medicalTest()
      .normalRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalTest));
    assertEquals(medicalTest, thing);
  }
  public void testQualitativeValue() throws IOException {
    final QualitativeValue qualitativeValue = SchemaOrg.qualitativeValue()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(qualitativeValue));
    assertEquals(qualitativeValue, thing);
  }
  public void testTouristAttraction() throws IOException {
    final TouristAttraction touristAttraction = SchemaOrg.touristAttraction()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(touristAttraction));
    assertEquals(touristAttraction, thing);
  }
  public void testBookmarkAction() throws IOException {
    final BookmarkAction bookmarkAction = SchemaOrg.bookmarkAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bookmarkAction));
    assertEquals(bookmarkAction, thing);
  }
  public void testDrugPregnancyCategory() throws IOException {
    final DrugPregnancyCategory drugPregnancyCategory = SchemaOrg.drugPregnancyCategory()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drugPregnancyCategory));
    assertEquals(drugPregnancyCategory, thing);
  }
  public void testBroadcastChannel() throws IOException {
    final BroadcastChannel broadcastChannel = SchemaOrg.broadcastChannel()
      .broadcastChannelId("Test String")
      .broadcastServiceTier("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(broadcastChannel));
    assertEquals(broadcastChannel, thing);
  }
  public void testUnRegisterAction() throws IOException {
    final UnRegisterAction unRegisterAction = SchemaOrg.unRegisterAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(unRegisterAction));
    assertEquals(unRegisterAction, thing);
  }
  public void testContinent() throws IOException {
    final Continent continent = SchemaOrg.continent()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(continent));
    assertEquals(continent, thing);
  }
  public void testDeleteAction() throws IOException {
    final DeleteAction deleteAction = SchemaOrg.deleteAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(deleteAction));
    assertEquals(deleteAction, thing);
  }
  public void testWebPage() throws IOException {
    final WebPage webPage = SchemaOrg.webPage()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(webPage));
    assertEquals(webPage, thing);
  }
  public void testBusStation() throws IOException {
    final BusStation busStation = SchemaOrg.busStation()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(busStation));
    assertEquals(busStation, thing);
  }
  public void testTaxi() throws IOException {
    final Taxi taxi = SchemaOrg.taxi()
      .serviceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(taxi));
    assertEquals(taxi, thing);
  }
  public void testBookFormatType() throws IOException {
    final BookFormatType bookFormatType = SchemaOrg.bookFormatType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bookFormatType));
    assertEquals(bookFormatType, thing);
  }
  public void testResumeAction() throws IOException {
    final ResumeAction resumeAction = SchemaOrg.resumeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(resumeAction));
    assertEquals(resumeAction, thing);
  }
  public void testAnatomicalSystem() throws IOException {
    final AnatomicalSystem anatomicalSystem = SchemaOrg.anatomicalSystem()
      .associatedPathophysiology("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(anatomicalSystem));
    assertEquals(anatomicalSystem, thing);
  }
  public void testEatAction() throws IOException {
    final EatAction eatAction = SchemaOrg.eatAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(eatAction));
    assertEquals(eatAction, thing);
  }
  public void testCommunicateAction() throws IOException {
    final CommunicateAction communicateAction = SchemaOrg.communicateAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(communicateAction));
    assertEquals(communicateAction, thing);
  }
  public void testPeriodical() throws IOException {
    final Periodical periodical = SchemaOrg.periodical()
      .issn("Test String")
      .endDate(NOW)
      .startDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(periodical));
    assertEquals(periodical, thing);
  }
  public void testAirport() throws IOException {
    final Airport airport = SchemaOrg.airport()
      .iataCode("Test String")
      .iacoCode("Test String")
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(airport));
    assertEquals(airport, thing);
  }
  public void testGroceryStore() throws IOException {
    final GroceryStore groceryStore = SchemaOrg.groceryStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(groceryStore));
    assertEquals(groceryStore, thing);
  }
  public void testEndorseAction() throws IOException {
    final EndorseAction endorseAction = SchemaOrg.endorseAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(endorseAction));
    assertEquals(endorseAction, thing);
  }
  public void testPostalAddress() throws IOException {
    final PostalAddress postalAddress = SchemaOrg.postalAddress()
      .addressLocality("Test String")
      .addressRegion("Test String")
      .postalCode("Test String")
      .postOfficeBoxNumber("Test String")
      .streetAddress("Test String")
      .contactType("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(postalAddress));
    assertEquals(postalAddress, thing);
  }
  public void testTravelAgency() throws IOException {
    final TravelAgency travelAgency = SchemaOrg.travelAgency()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(travelAgency));
    assertEquals(travelAgency, thing);
  }
  public void testProfilePage() throws IOException {
    final ProfilePage profilePage = SchemaOrg.profilePage()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(profilePage));
    assertEquals(profilePage, thing);
  }
  public void testRoofingContractor() throws IOException {
    final RoofingContractor roofingContractor = SchemaOrg.roofingContractor()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(roofingContractor));
    assertEquals(roofingContractor, thing);
  }
  public void testParkingFacility() throws IOException {
    final ParkingFacility parkingFacility = SchemaOrg.parkingFacility()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(parkingFacility));
    assertEquals(parkingFacility, thing);
  }
  public void testCasino() throws IOException {
    final Casino casino = SchemaOrg.casino()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(casino));
    assertEquals(casino, thing);
  }
  public void testImageObject() throws IOException {
    final ImageObject imageObject = SchemaOrg.imageObject()
      .caption("Test String")
      .representativeOfPage(true)
      .bitrate("Test String")
      .contentSize("Test String")
      .contentUrl("Test String")
      .embedUrl("Test String")
      .encodingFormat("Test String")
      .expires(NOW)
      .playerType("Test String")
      .requiresSubscription(true)
      .uploadDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(imageObject));
    assertEquals(imageObject, thing);
  }
  public void testBusReservation() throws IOException {
    final BusReservation busReservation = SchemaOrg.busReservation()
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(busReservation));
    assertEquals(busReservation, thing);
  }
  public void testPond() throws IOException {
    final Pond pond = SchemaOrg.pond()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(pond));
    assertEquals(pond, thing);
  }
  public void testSeaBodyOfWater() throws IOException {
    final SeaBodyOfWater seaBodyOfWater = SchemaOrg.seaBodyOfWater()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(seaBodyOfWater));
    assertEquals(seaBodyOfWater, thing);
  }
  public void testFlightReservation() throws IOException {
    final FlightReservation flightReservation = SchemaOrg.flightReservation()
      .boardingGroup("Test String")
      .passengerSequenceNumber("Test String")
      .securityScreening("Test String")
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(flightReservation));
    assertEquals(flightReservation, thing);
  }
  public void testClothingStore() throws IOException {
    final ClothingStore clothingStore = SchemaOrg.clothingStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(clothingStore));
    assertEquals(clothingStore, thing);
  }
  public void testAutoWash() throws IOException {
    final AutoWash autoWash = SchemaOrg.autoWash()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoWash));
    assertEquals(autoWash, thing);
  }
  public void testComputerStore() throws IOException {
    final ComputerStore computerStore = SchemaOrg.computerStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(computerStore));
    assertEquals(computerStore, thing);
  }
  public void testCode() throws IOException {
    final Code code = SchemaOrg.code()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(code));
    assertEquals(code, thing);
  }
  public void testMountain() throws IOException {
    final Mountain mountain = SchemaOrg.mountain()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mountain));
    assertEquals(mountain, thing);
  }
  public void testMusicRecording() throws IOException {
    final MusicRecording musicRecording = SchemaOrg.musicRecording()
      .isrcCode("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicRecording));
    assertEquals(musicRecording, thing);
  }
  public void testInsertAction() throws IOException {
    final InsertAction insertAction = SchemaOrg.insertAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(insertAction));
    assertEquals(insertAction, thing);
  }
  public void testTakeAction() throws IOException {
    final TakeAction takeAction = SchemaOrg.takeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(takeAction));
    assertEquals(takeAction, thing);
  }
  public void testMusicVideoObject() throws IOException {
    final MusicVideoObject musicVideoObject = SchemaOrg.musicVideoObject()
      .bitrate("Test String")
      .contentSize("Test String")
      .contentUrl("Test String")
      .embedUrl("Test String")
      .encodingFormat("Test String")
      .expires(NOW)
      .playerType("Test String")
      .requiresSubscription(true)
      .uploadDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicVideoObject));
    assertEquals(musicVideoObject, thing);
  }
  public void testTrainReservation() throws IOException {
    final TrainReservation trainReservation = SchemaOrg.trainReservation()
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(trainReservation));
    assertEquals(trainReservation, thing);
  }
  public void testWatchAction() throws IOException {
    final WatchAction watchAction = SchemaOrg.watchAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(watchAction));
    assertEquals(watchAction, thing);
  }
  public void testPostOffice() throws IOException {
    final PostOffice postOffice = SchemaOrg.postOffice()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(postOffice));
    assertEquals(postOffice, thing);
  }
  public void testPublicationIssue() throws IOException {
    final PublicationIssue publicationIssue = SchemaOrg.publicationIssue()
      .issueNumber(42)
      .pageEnd(42)
      .pageStart(42)
      .pagination("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(publicationIssue));
    assertEquals(publicationIssue, thing);
  }
  public void testLanguage() throws IOException {
    final Language language = SchemaOrg.language()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(language));
    assertEquals(language, thing);
  }
  public void testCountry() throws IOException {
    final Country country = SchemaOrg.country()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(country));
    assertEquals(country, thing);
  }
  public void testDoseSchedule() throws IOException {
    final DoseSchedule doseSchedule = SchemaOrg.doseSchedule()
      .doseUnit("Test String")
      .doseValue(42)
      .frequency("Test String")
      .targetPopulation("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(doseSchedule));
    assertEquals(doseSchedule, thing);
  }
  public void testAdministrativeArea() throws IOException {
    final AdministrativeArea administrativeArea = SchemaOrg.administrativeArea()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(administrativeArea));
    assertEquals(administrativeArea, thing);
  }
  public void testSellAction() throws IOException {
    final SellAction sellAction = SchemaOrg.sellAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sellAction));
    assertEquals(sellAction, thing);
  }
  public void testPreventionIndication() throws IOException {
    final PreventionIndication preventionIndication = SchemaOrg.preventionIndication()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(preventionIndication));
    assertEquals(preventionIndication, thing);
  }
  public void testUserDownloads() throws IOException {
    final UserDownloads userDownloads = SchemaOrg.userDownloads()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userDownloads));
    assertEquals(userDownloads, thing);
  }
  public void testBreadcrumbList() throws IOException {
    final BreadcrumbList breadcrumbList = SchemaOrg.breadcrumbList()
      .numberOfItems(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(breadcrumbList));
    assertEquals(breadcrumbList, thing);
  }
  public void testDataCatalog() throws IOException {
    final DataCatalog dataCatalog = SchemaOrg.dataCatalog()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dataCatalog));
    assertEquals(dataCatalog, thing);
  }
  public void testOrderAction() throws IOException {
    final OrderAction orderAction = SchemaOrg.orderAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(orderAction));
    assertEquals(orderAction, thing);
  }
  public void testEventReservation() throws IOException {
    final EventReservation eventReservation = SchemaOrg.eventReservation()
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(eventReservation));
    assertEquals(eventReservation, thing);
  }
  public void testMusicGroup() throws IOException {
    final MusicGroup musicGroup = SchemaOrg.musicGroup()
      .genre("Test String")
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicGroup));
    assertEquals(musicGroup, thing);
  }
  public void testLodgingReservation() throws IOException {
    final LodgingReservation lodgingReservation = SchemaOrg.lodgingReservation()
      .checkinTime(NOW)
      .checkoutTime(NOW)
      .lodgingUnitDescription("Test String")
      .numAdults(42)
      .numChildren(42)
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lodgingReservation));
    assertEquals(lodgingReservation, thing);
  }
  public void testUserComments() throws IOException {
    final UserComments userComments = SchemaOrg.userComments()
      .commentText("Test String")
      .commentTime(NOW)
      .replyToUrl("Test String")
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userComments));
    assertEquals(userComments, thing);
  }
  public void testUnitPriceSpecification() throws IOException {
    final UnitPriceSpecification unitPriceSpecification = SchemaOrg.unitPriceSpecification()
      .billingIncrement(42)
      .priceType("Test String")
      .unitCode("Test String")
      .unitText("Test String")
      .maxPrice(42)
      .minPrice(42)
      .price(42)
      .validFrom(NOW)
      .validThrough(NOW)
      .valueAddedTaxIncluded(true)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(unitPriceSpecification));
    assertEquals(unitPriceSpecification, thing);
  }
  public void testSteeringPositionValue() throws IOException {
    final SteeringPositionValue steeringPositionValue = SchemaOrg.steeringPositionValue()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(steeringPositionValue));
    assertEquals(steeringPositionValue, thing);
  }
  public void testAcceptAction() throws IOException {
    final AcceptAction acceptAction = SchemaOrg.acceptAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(acceptAction));
    assertEquals(acceptAction, thing);
  }
  public void testMuseum() throws IOException {
    final Museum museum = SchemaOrg.museum()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(museum));
    assertEquals(museum, thing);
  }
  public void testSocialEvent() throws IOException {
    final SocialEvent socialEvent = SchemaOrg.socialEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(socialEvent));
    assertEquals(socialEvent, thing);
  }
  public void testLiteraryEvent() throws IOException {
    final LiteraryEvent literaryEvent = SchemaOrg.literaryEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(literaryEvent));
    assertEquals(literaryEvent, thing);
  }
  public void testHomeGoodsStore() throws IOException {
    final HomeGoodsStore homeGoodsStore = SchemaOrg.homeGoodsStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(homeGoodsStore));
    assertEquals(homeGoodsStore, thing);
  }
  public void testAllocateAction() throws IOException {
    final AllocateAction allocateAction = SchemaOrg.allocateAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(allocateAction));
    assertEquals(allocateAction, thing);
  }
  public void testWPSideBar() throws IOException {
    final WPSideBar wPSideBar = SchemaOrg.wPSideBar()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wPSideBar));
    assertEquals(wPSideBar, thing);
  }
  public void testSchool() throws IOException {
    final School school = SchemaOrg.school()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(school));
    assertEquals(school, thing);
  }
  public void testCreativeWorkSeries() throws IOException {
    final CreativeWorkSeries creativeWorkSeries = SchemaOrg.creativeWorkSeries()
      .endDate(NOW)
      .startDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(creativeWorkSeries));
    assertEquals(creativeWorkSeries, thing);
  }
  public void testDayOfWeek() throws IOException {
    final DayOfWeek dayOfWeek = SchemaOrg.dayOfWeek()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dayOfWeek));
    assertEquals(dayOfWeek, thing);
  }
  public void testTreatmentIndication() throws IOException {
    final TreatmentIndication treatmentIndication = SchemaOrg.treatmentIndication()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(treatmentIndication));
    assertEquals(treatmentIndication, thing);
  }
  public void testTrainTrip() throws IOException {
    final TrainTrip trainTrip = SchemaOrg.trainTrip()
      .departureTime(NOW)
      .arrivalTime(NOW)
      .trainNumber("Test String")
      .trainName("Test String")
      .departurePlatform("Test String")
      .arrivalPlatform("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(trainTrip));
    assertEquals(trainTrip, thing);
  }
  public void testHardwareStore() throws IOException {
    final HardwareStore hardwareStore = SchemaOrg.hardwareStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hardwareStore));
    assertEquals(hardwareStore, thing);
  }
  public void testScreeningEvent() throws IOException {
    final ScreeningEvent screeningEvent = SchemaOrg.screeningEvent()
      .videoFormat("Test String")
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(screeningEvent));
    assertEquals(screeningEvent, thing);
  }
  public void testMusicRelease() throws IOException {
    final MusicRelease musicRelease = SchemaOrg.musicRelease()
      .catalogNumber("Test String")
      .numTracks(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicRelease));
    assertEquals(musicRelease, thing);
  }
  public void testElectrician() throws IOException {
    final Electrician electrician = SchemaOrg.electrician()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(electrician));
    assertEquals(electrician, thing);
  }
  public void testBeach() throws IOException {
    final Beach beach = SchemaOrg.beach()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(beach));
    assertEquals(beach, thing);
  }
  public void testWebApplication() throws IOException {
    final WebApplication webApplication = SchemaOrg.webApplication()
      .browserRequirements("Test String")
      .applicationCategory("Test String")
      .applicationSubCategory("Test String")
      .applicationSuite("Test String")
      .countriesNotSupported("Test String")
      .countriesSupported("Test String")
      .availableOnDevice("Test String")
      .downloadUrl("Test String")
      .featureList("Test String")
      .fileFormat("Test String")
      .fileSize(42)
      .installUrl("Test String")
      .memoryRequirements("Test String")
      .operatingSystem("Test String")
      .permissions("Test String")
      .processorRequirements("Test String")
      .releaseNotes("Test String")
      .softwareRequirements("Test String")
      .softwareVersion("Test String")
      .storageRequirements("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(webApplication));
    assertEquals(webApplication, thing);
  }
  public void testPropertyValueSpecification() throws IOException {
    final PropertyValueSpecification propertyValueSpecification = SchemaOrg.propertyValueSpecification()
      .minValue(42)
      .valueName("Test String")
      .valueRequired(true)
      .defaultValue("Test String")
      .readonlyValue(true)
      .multipleValues(true)
      .valueMinLength(42)
      .valueMaxLength(42)
      .valuePattern("Test String")
      .stepValue(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(propertyValueSpecification));
    assertEquals(propertyValueSpecification, thing);
  }
  public void testAutomatedTeller() throws IOException {
    final AutomatedTeller automatedTeller = SchemaOrg.automatedTeller()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(automatedTeller));
    assertEquals(automatedTeller, thing);
  }
  public void testBusTrip() throws IOException {
    final BusTrip busTrip = SchemaOrg.busTrip()
      .departureTime(NOW)
      .arrivalTime(NOW)
      .busNumber("Test String")
      .busName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(busTrip));
    assertEquals(busTrip, thing);
  }
  public void testPriceSpecification() throws IOException {
    final PriceSpecification priceSpecification = SchemaOrg.priceSpecification()
      .maxPrice(42)
      .minPrice(42)
      .price(42)
      .validFrom(NOW)
      .validThrough(NOW)
      .valueAddedTaxIncluded(true)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(priceSpecification));
    assertEquals(priceSpecification, thing);
  }
  public void testDislikeAction() throws IOException {
    final DislikeAction dislikeAction = SchemaOrg.dislikeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dislikeAction));
    assertEquals(dislikeAction, thing);
  }
  public void testOceanBodyOfWater() throws IOException {
    final OceanBodyOfWater oceanBodyOfWater = SchemaOrg.oceanBodyOfWater()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(oceanBodyOfWater));
    assertEquals(oceanBodyOfWater, thing);
  }
  public void testApartmentComplex() throws IOException {
    final ApartmentComplex apartmentComplex = SchemaOrg.apartmentComplex()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(apartmentComplex));
    assertEquals(apartmentComplex, thing);
  }
  public void testMedicalTrial() throws IOException {
    final MedicalTrial medicalTrial = SchemaOrg.medicalTrial()
      .phase("Test String")
      .outcome("Test String")
      .population("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalTrial));
    assertEquals(medicalTrial, thing);
  }
  public void testTattooParlor() throws IOException {
    final TattooParlor tattooParlor = SchemaOrg.tattooParlor()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tattooParlor));
    assertEquals(tattooParlor, thing);
  }
  public void testUserBlocks() throws IOException {
    final UserBlocks userBlocks = SchemaOrg.userBlocks()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userBlocks));
    assertEquals(userBlocks, thing);
  }
  public void testQAPage() throws IOException {
    final QAPage qAPage = SchemaOrg.qAPage()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(qAPage));
    assertEquals(qAPage, thing);
  }
  public void testHobbyShop() throws IOException {
    final HobbyShop hobbyShop = SchemaOrg.hobbyShop()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hobbyShop));
    assertEquals(hobbyShop, thing);
  }
  public void testGeoShape() throws IOException {
    final GeoShape geoShape = SchemaOrg.geoShape()
      .box("Test String")
      .circle("Test String")
      .elevation(42)
      .line("Test String")
      .polygon("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(geoShape));
    assertEquals(geoShape, thing);
  }
  public void testFilmAction() throws IOException {
    final FilmAction filmAction = SchemaOrg.filmAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(filmAction));
    assertEquals(filmAction, thing);
  }
  public void testTherapeuticProcedure() throws IOException {
    final TherapeuticProcedure therapeuticProcedure = SchemaOrg.therapeuticProcedure()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(therapeuticProcedure));
    assertEquals(therapeuticProcedure, thing);
  }
  public void testFireStation() throws IOException {
    final FireStation fireStation = SchemaOrg.fireStation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(fireStation));
    assertEquals(fireStation, thing);
  }
  public void testTelevisionStation() throws IOException {
    final TelevisionStation televisionStation = SchemaOrg.televisionStation()
      .videoFormat("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(televisionStation));
    assertEquals(televisionStation, thing);
  }
  public void testMedicalCause() throws IOException {
    final MedicalCause medicalCause = SchemaOrg.medicalCause()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalCause));
    assertEquals(medicalCause, thing);
  }
  public void testEvent() throws IOException {
    final Event event = SchemaOrg.event()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(event));
    assertEquals(event, thing);
  }
  public void testPaymentMethod() throws IOException {
    final PaymentMethod paymentMethod = SchemaOrg.paymentMethod()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(paymentMethod));
    assertEquals(paymentMethod, thing);
  }
  public void testElementarySchool() throws IOException {
    final ElementarySchool elementarySchool = SchemaOrg.elementarySchool()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(elementarySchool));
    assertEquals(elementarySchool, thing);
  }
  public void testEventStatusType() throws IOException {
    final EventStatusType eventStatusType = SchemaOrg.eventStatusType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(eventStatusType));
    assertEquals(eventStatusType, thing);
  }
  public void testImageGallery() throws IOException {
    final ImageGallery imageGallery = SchemaOrg.imageGallery()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(imageGallery));
    assertEquals(imageGallery, thing);
  }
  public void testAuthorizeAction() throws IOException {
    final AuthorizeAction authorizeAction = SchemaOrg.authorizeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(authorizeAction));
    assertEquals(authorizeAction, thing);
  }
  public void testWPFooter() throws IOException {
    final WPFooter wPFooter = SchemaOrg.wPFooter()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wPFooter));
    assertEquals(wPFooter, thing);
  }
  public void testOutletStore() throws IOException {
    final OutletStore outletStore = SchemaOrg.outletStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(outletStore));
    assertEquals(outletStore, thing);
  }
  public void testBikeStore() throws IOException {
    final BikeStore bikeStore = SchemaOrg.bikeStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bikeStore));
    assertEquals(bikeStore, thing);
  }
  public void testArtery() throws IOException {
    final Artery artery = SchemaOrg.artery()
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(artery));
    assertEquals(artery, thing);
  }
  public void testNotary() throws IOException {
    final Notary notary = SchemaOrg.notary()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(notary));
    assertEquals(notary, thing);
  }
  public void testMass() throws IOException {
    final Mass mass = SchemaOrg.mass()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mass));
    assertEquals(mass, thing);
  }
  public void testDemand() throws IOException {
    final Demand demand = SchemaOrg.demand()
      .availabilityEnds(NOW)
      .availabilityStarts(NOW)
      .gtin12("Test String")
      .gtin13("Test String")
      .gtin14("Test String")
      .gtin8("Test String")
      .mpn("Test String")
      .sku("Test String")
      .validFrom(NOW)
      .validThrough(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(demand));
    assertEquals(demand, thing);
  }
  public void testFoodEstablishmentReservation() throws IOException {
    final FoodEstablishmentReservation foodEstablishmentReservation = SchemaOrg.foodEstablishmentReservation()
      .startTime(NOW)
      .partySize(42)
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(foodEstablishmentReservation));
    assertEquals(foodEstablishmentReservation, thing);
  }
  public void testBusinessFunction() throws IOException {
    final BusinessFunction businessFunction = SchemaOrg.businessFunction()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(businessFunction));
    assertEquals(businessFunction, thing);
  }
  public void testDanceGroup() throws IOException {
    final DanceGroup danceGroup = SchemaOrg.danceGroup()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(danceGroup));
    assertEquals(danceGroup, thing);
  }
  public void testDDxElement() throws IOException {
    final DDxElement dDxElement = SchemaOrg.dDxElement()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dDxElement));
    assertEquals(dDxElement, thing);
  }
  public void testCollectionPage() throws IOException {
    final CollectionPage collectionPage = SchemaOrg.collectionPage()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(collectionPage));
    assertEquals(collectionPage, thing);
  }
  public void testMosque() throws IOException {
    final Mosque mosque = SchemaOrg.mosque()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mosque));
    assertEquals(mosque, thing);
  }
  public void testIntangible() throws IOException {
    final Intangible intangible = SchemaOrg.intangible()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(intangible));
    assertEquals(intangible, thing);
  }
  public void testEpisode() throws IOException {
    final Episode episode = SchemaOrg.episode()
      .episodeNumber(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(episode));
    assertEquals(episode, thing);
  }
  public void testInvoice() throws IOException {
    final Invoice invoice = SchemaOrg.invoice()
      .confirmationNumber("Test String")
      .paymentDue(NOW)
      .paymentMethodId("Test String")
      .accountId("Test String")
      .scheduledPaymentDate(NOW)
      .paymentStatus("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(invoice));
    assertEquals(invoice, thing);
  }
  public void testProject() throws IOException {
    final Project project = SchemaOrg.project()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(project));
    assertEquals(project, thing);
  }
  public void testRecyclingCenter() throws IOException {
    final RecyclingCenter recyclingCenter = SchemaOrg.recyclingCenter()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(recyclingCenter));
    assertEquals(recyclingCenter, thing);
  }
  public void testMaximumDoseSchedule() throws IOException {
    final MaximumDoseSchedule maximumDoseSchedule = SchemaOrg.maximumDoseSchedule()
      .doseUnit("Test String")
      .doseValue(42)
      .frequency("Test String")
      .targetPopulation("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(maximumDoseSchedule));
    assertEquals(maximumDoseSchedule, thing);
  }
  public void testMobileApplication() throws IOException {
    final MobileApplication mobileApplication = SchemaOrg.mobileApplication()
      .carrierRequirements("Test String")
      .applicationCategory("Test String")
      .applicationSubCategory("Test String")
      .applicationSuite("Test String")
      .countriesNotSupported("Test String")
      .countriesSupported("Test String")
      .availableOnDevice("Test String")
      .downloadUrl("Test String")
      .featureList("Test String")
      .fileFormat("Test String")
      .fileSize(42)
      .installUrl("Test String")
      .memoryRequirements("Test String")
      .operatingSystem("Test String")
      .permissions("Test String")
      .processorRequirements("Test String")
      .releaseNotes("Test String")
      .softwareRequirements("Test String")
      .softwareVersion("Test String")
      .storageRequirements("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mobileApplication));
    assertEquals(mobileApplication, thing);
  }
  public void testSoftwareApplication() throws IOException {
    final SoftwareApplication softwareApplication = SchemaOrg.softwareApplication()
      .applicationCategory("Test String")
      .applicationSubCategory("Test String")
      .applicationSuite("Test String")
      .countriesNotSupported("Test String")
      .countriesSupported("Test String")
      .availableOnDevice("Test String")
      .downloadUrl("Test String")
      .featureList("Test String")
      .fileFormat("Test String")
      .fileSize(42)
      .installUrl("Test String")
      .memoryRequirements("Test String")
      .operatingSystem("Test String")
      .permissions("Test String")
      .processorRequirements("Test String")
      .releaseNotes("Test String")
      .softwareRequirements("Test String")
      .softwareVersion("Test String")
      .storageRequirements("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(softwareApplication));
    assertEquals(softwareApplication, thing);
  }
  public void testControlAction() throws IOException {
    final ControlAction controlAction = SchemaOrg.controlAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(controlAction));
    assertEquals(controlAction, thing);
  }
  public void testRadioChannel() throws IOException {
    final RadioChannel radioChannel = SchemaOrg.radioChannel()
      .broadcastChannelId("Test String")
      .broadcastServiceTier("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioChannel));
    assertEquals(radioChannel, thing);
  }
  public void testCableOrSatelliteService() throws IOException {
    final CableOrSatelliteService cableOrSatelliteService = SchemaOrg.cableOrSatelliteService()
      .serviceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cableOrSatelliteService));
    assertEquals(cableOrSatelliteService, thing);
  }
  public void testProperty() throws IOException {
    final Property property = SchemaOrg.property()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(property));
    assertEquals(property, thing);
  }
  public void testCafeOrCoffeeShop() throws IOException {
    final CafeOrCoffeeShop cafeOrCoffeeShop = SchemaOrg.cafeOrCoffeeShop()
      .acceptsReservations(true)
      .menu("Test String")
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cafeOrCoffeeShop));
    assertEquals(cafeOrCoffeeShop, thing);
  }
  public void testLibrary() throws IOException {
    final Library library = SchemaOrg.library()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(library));
    assertEquals(library, thing);
  }
  public void testMedicalObservationalStudyDesign() throws IOException {
    final MedicalObservationalStudyDesign medicalObservationalStudyDesign = SchemaOrg.medicalObservationalStudyDesign()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalObservationalStudyDesign));
    assertEquals(medicalObservationalStudyDesign, thing);
  }
  public void testFindAction() throws IOException {
    final FindAction findAction = SchemaOrg.findAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(findAction));
    assertEquals(findAction, thing);
  }
  public void testPrependAction() throws IOException {
    final PrependAction prependAction = SchemaOrg.prependAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(prependAction));
    assertEquals(prependAction, thing);
  }
  public void testBloodTest() throws IOException {
    final BloodTest bloodTest = SchemaOrg.bloodTest()
      .normalRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bloodTest));
    assertEquals(bloodTest, thing);
  }
  public void testLikeAction() throws IOException {
    final LikeAction likeAction = SchemaOrg.likeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(likeAction));
    assertEquals(likeAction, thing);
  }
  public void testBeautySalon() throws IOException {
    final BeautySalon beautySalon = SchemaOrg.beautySalon()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(beautySalon));
    assertEquals(beautySalon, thing);
  }
  public void testGovernmentOrganization() throws IOException {
    final GovernmentOrganization governmentOrganization = SchemaOrg.governmentOrganization()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(governmentOrganization));
    assertEquals(governmentOrganization, thing);
  }
  public void testRsvpResponseType() throws IOException {
    final RsvpResponseType rsvpResponseType = SchemaOrg.rsvpResponseType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rsvpResponseType));
    assertEquals(rsvpResponseType, thing);
  }
  public void testBrainStructure() throws IOException {
    final BrainStructure brainStructure = SchemaOrg.brainStructure()
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(brainStructure));
    assertEquals(brainStructure, thing);
  }
  public void testEmployeeRole() throws IOException {
    final EmployeeRole employeeRole = SchemaOrg.employeeRole()
      .salaryCurrency("Test String")
      .numberedPosition(42)
      .startDate(NOW)
      .roleName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(employeeRole));
    assertEquals(employeeRole, thing);
  }
  public void testMedicalAudience() throws IOException {
    final MedicalAudience medicalAudience = SchemaOrg.medicalAudience()
      .requiredGender("Test String")
      .requiredMaxAge(42)
      .requiredMinAge(42)
      .suggestedGender("Test String")
      .suggestedMaxAge(42)
      .suggestedMinAge(42)
      .audienceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalAudience));
    assertEquals(medicalAudience, thing);
  }
  public void testMovieRentalStore() throws IOException {
    final MovieRentalStore movieRentalStore = SchemaOrg.movieRentalStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movieRentalStore));
    assertEquals(movieRentalStore, thing);
  }
  public void testGameServer() throws IOException {
    final GameServer gameServer = SchemaOrg.gameServer()
      .playersOnline(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(gameServer));
    assertEquals(gameServer, thing);
  }
  public void testCar() throws IOException {
    final Car car = SchemaOrg.car()
      .numberOfAirbags(42)
      .vin("Test String")
      .vehicleConfiguration("Test String")
      .knownVehicleDamages("Test String")
      .dateVehicleFirstRegistered(NOW)
      .vehicleInteriorColor("Test String")
      .vehicleInteriorType("Test String")
      .vehicleModelDate(NOW)
      .productionDate(NOW)
      .purchaseDate(NOW)
      .award("Test String")
      .color("Test String")
      .gtin12("Test String")
      .gtin13("Test String")
      .gtin14("Test String")
      .gtin8("Test String")
      .mpn("Test String")
      .productID("Test String")
      .releaseDate(NOW)
      .sku("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(car));
    assertEquals(car, thing);
  }
  public void testCrematorium() throws IOException {
    final Crematorium crematorium = SchemaOrg.crematorium()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(crematorium));
    assertEquals(crematorium, thing);
  }
  public void testBankOrCreditUnion() throws IOException {
    final BankOrCreditUnion bankOrCreditUnion = SchemaOrg.bankOrCreditUnion()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bankOrCreditUnion));
    assertEquals(bankOrCreditUnion, thing);
  }
  public void testQuoteAction() throws IOException {
    final QuoteAction quoteAction = SchemaOrg.quoteAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(quoteAction));
    assertEquals(quoteAction, thing);
  }
  public void testSendAction() throws IOException {
    final SendAction sendAction = SchemaOrg.sendAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sendAction));
    assertEquals(sendAction, thing);
  }
  public void testPhysician() throws IOException {
    final Physician physician = SchemaOrg.physician()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(physician));
    assertEquals(physician, thing);
  }
  public void testNerve() throws IOException {
    final Nerve nerve = SchemaOrg.nerve()
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(nerve));
    assertEquals(nerve, thing);
  }
  public void testAttorney() throws IOException {
    final Attorney attorney = SchemaOrg.attorney()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(attorney));
    assertEquals(attorney, thing);
  }
  public void testImagingTest() throws IOException {
    final ImagingTest imagingTest = SchemaOrg.imagingTest()
      .normalRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(imagingTest));
    assertEquals(imagingTest, thing);
  }
  public void testOnDemandEvent() throws IOException {
    final OnDemandEvent onDemandEvent = SchemaOrg.onDemandEvent()
      .isAccessibleForFree(true)
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(onDemandEvent));
    assertEquals(onDemandEvent, thing);
  }
  public void testMedicalEntity() throws IOException {
    final MedicalEntity medicalEntity = SchemaOrg.medicalEntity()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalEntity));
    assertEquals(medicalEntity, thing);
  }
  public void testGolfCourse() throws IOException {
    final GolfCourse golfCourse = SchemaOrg.golfCourse()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(golfCourse));
    assertEquals(golfCourse, thing);
  }
  public void testRentAction() throws IOException {
    final RentAction rentAction = SchemaOrg.rentAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rentAction));
    assertEquals(rentAction, thing);
  }
  public void testReportedDoseSchedule() throws IOException {
    final ReportedDoseSchedule reportedDoseSchedule = SchemaOrg.reportedDoseSchedule()
      .doseUnit("Test String")
      .doseValue(42)
      .frequency("Test String")
      .targetPopulation("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reportedDoseSchedule));
    assertEquals(reportedDoseSchedule, thing);
  }
  public void testEnumeration() throws IOException {
    final Enumeration enumeration = SchemaOrg.enumeration()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(enumeration));
    assertEquals(enumeration, thing);
  }
  public void testHospital() throws IOException {
    final Hospital hospital = SchemaOrg.hospital()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hospital));
    assertEquals(hospital, thing);
  }
  public void testFurnitureStore() throws IOException {
    final FurnitureStore furnitureStore = SchemaOrg.furnitureStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(furnitureStore));
    assertEquals(furnitureStore, thing);
  }
  public void testVisualArtsEvent() throws IOException {
    final VisualArtsEvent visualArtsEvent = SchemaOrg.visualArtsEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(visualArtsEvent));
    assertEquals(visualArtsEvent, thing);
  }
  public void testChooseAction() throws IOException {
    final ChooseAction chooseAction = SchemaOrg.chooseAction()
      .actionOption("Test String")
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(chooseAction));
    assertEquals(chooseAction, thing);
  }
  public void testSportingGoodsStore() throws IOException {
    final SportingGoodsStore sportingGoodsStore = SchemaOrg.sportingGoodsStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportingGoodsStore));
    assertEquals(sportingGoodsStore, thing);
  }
  public void testMedicalDevice() throws IOException {
    final MedicalDevice medicalDevice = SchemaOrg.medicalDevice()
      .postOp("Test String")
      .preOp("Test String")
      .procedure("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalDevice));
    assertEquals(medicalDevice, thing);
  }
  public void testNGO() throws IOException {
    final NGO nGO = SchemaOrg.nGO()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(nGO));
    assertEquals(nGO, thing);
  }
  public void testBlogPosting() throws IOException {
    final BlogPosting blogPosting = SchemaOrg.blogPosting()
      .articleBody("Test String")
      .articleSection("Test String")
      .wordCount(42)
      .pageEnd(42)
      .pageStart(42)
      .pagination("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(blogPosting));
    assertEquals(blogPosting, thing);
  }
  public void testReservoir() throws IOException {
    final Reservoir reservoir = SchemaOrg.reservoir()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reservoir));
    assertEquals(reservoir, thing);
  }
  public void testAutomotiveBusiness() throws IOException {
    final AutomotiveBusiness automotiveBusiness = SchemaOrg.automotiveBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(automotiveBusiness));
    assertEquals(automotiveBusiness, thing);
  }
  public void testAutoRental() throws IOException {
    final AutoRental autoRental = SchemaOrg.autoRental()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoRental));
    assertEquals(autoRental, thing);
  }
  public void testWPAdBlock() throws IOException {
    final WPAdBlock wPAdBlock = SchemaOrg.wPAdBlock()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wPAdBlock));
    assertEquals(wPAdBlock, thing);
  }
  public void testOrganizeAction() throws IOException {
    final OrganizeAction organizeAction = SchemaOrg.organizeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(organizeAction));
    assertEquals(organizeAction, thing);
  }
  public void testBedAndBreakfast() throws IOException {
    final BedAndBreakfast bedAndBreakfast = SchemaOrg.bedAndBreakfast()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bedAndBreakfast));
    assertEquals(bedAndBreakfast, thing);
  }
  public void testPlayAction() throws IOException {
    final PlayAction playAction = SchemaOrg.playAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(playAction));
    assertEquals(playAction, thing);
  }
  public void testLifestyleModification() throws IOException {
    final LifestyleModification lifestyleModification = SchemaOrg.lifestyleModification()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lifestyleModification));
    assertEquals(lifestyleModification, thing);
  }
  public void testUserPageVisits() throws IOException {
    final UserPageVisits userPageVisits = SchemaOrg.userPageVisits()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userPageVisits));
    assertEquals(userPageVisits, thing);
  }
  public void testAdultEntertainment() throws IOException {
    final AdultEntertainment adultEntertainment = SchemaOrg.adultEntertainment()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(adultEntertainment));
    assertEquals(adultEntertainment, thing);
  }
  public void testCookAction() throws IOException {
    final CookAction cookAction = SchemaOrg.cookAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cookAction));
    assertEquals(cookAction, thing);
  }
  public void testAquarium() throws IOException {
    final Aquarium aquarium = SchemaOrg.aquarium()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(aquarium));
    assertEquals(aquarium, thing);
  }
  public void testHotel() throws IOException {
    final Hotel hotel = SchemaOrg.hotel()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hotel));
    assertEquals(hotel, thing);
  }
  public void testEmergencyService() throws IOException {
    final EmergencyService emergencyService = SchemaOrg.emergencyService()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(emergencyService));
    assertEquals(emergencyService, thing);
  }
  public void testMap() throws IOException {
    final Map map = SchemaOrg.map()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(map));
    assertEquals(map, thing);
  }
  public void testOrderStatus() throws IOException {
    final OrderStatus orderStatus = SchemaOrg.orderStatus()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(orderStatus));
    assertEquals(orderStatus, thing);
  }
  public void testTypeAndQuantityNode() throws IOException {
    final TypeAndQuantityNode typeAndQuantityNode = SchemaOrg.typeAndQuantityNode()
      .amountOfThisGood(42)
      .unitCode("Test String")
      .unitText("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(typeAndQuantityNode));
    assertEquals(typeAndQuantityNode, thing);
  }
  public void testCarUsageType() throws IOException {
    final CarUsageType carUsageType = SchemaOrg.carUsageType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(carUsageType));
    assertEquals(carUsageType, thing);
  }
  public void testVideoGallery() throws IOException {
    final VideoGallery videoGallery = SchemaOrg.videoGallery()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(videoGallery));
    assertEquals(videoGallery, thing);
  }
  public void testPhotograph() throws IOException {
    final Photograph photograph = SchemaOrg.photograph()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(photograph));
    assertEquals(photograph, thing);
  }
  public void testDataset() throws IOException {
    final Dataset dataset = SchemaOrg.dataset()
      .datasetTimeInterval(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dataset));
    assertEquals(dataset, thing);
  }
  public void testAutoBodyShop() throws IOException {
    final AutoBodyShop autoBodyShop = SchemaOrg.autoBodyShop()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoBodyShop));
    assertEquals(autoBodyShop, thing);
  }
  public void testAutoPartsStore() throws IOException {
    final AutoPartsStore autoPartsStore = SchemaOrg.autoPartsStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoPartsStore));
    assertEquals(autoPartsStore, thing);
  }
  public void testHealthAndBeautyBusiness() throws IOException {
    final HealthAndBeautyBusiness healthAndBeautyBusiness = SchemaOrg.healthAndBeautyBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(healthAndBeautyBusiness));
    assertEquals(healthAndBeautyBusiness, thing);
  }
  public void testPhotographAction() throws IOException {
    final PhotographAction photographAction = SchemaOrg.photographAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(photographAction));
    assertEquals(photographAction, thing);
  }
  public void testCheckoutPage() throws IOException {
    final CheckoutPage checkoutPage = SchemaOrg.checkoutPage()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(checkoutPage));
    assertEquals(checkoutPage, thing);
  }
  public void testMedicalStudyStatus() throws IOException {
    final MedicalStudyStatus medicalStudyStatus = SchemaOrg.medicalStudyStatus()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalStudyStatus));
    assertEquals(medicalStudyStatus, thing);
  }
  public void testZoo() throws IOException {
    final Zoo zoo = SchemaOrg.zoo()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(zoo));
    assertEquals(zoo, thing);
  }
  public void testPlaceOfWorship() throws IOException {
    final PlaceOfWorship placeOfWorship = SchemaOrg.placeOfWorship()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(placeOfWorship));
    assertEquals(placeOfWorship, thing);
  }
  public void testMapCategoryType() throws IOException {
    final MapCategoryType mapCategoryType = SchemaOrg.mapCategoryType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mapCategoryType));
    assertEquals(mapCategoryType, thing);
  }
  public void testFollowAction() throws IOException {
    final FollowAction followAction = SchemaOrg.followAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(followAction));
    assertEquals(followAction, thing);
  }
  public void testInformAction() throws IOException {
    final InformAction informAction = SchemaOrg.informAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(informAction));
    assertEquals(informAction, thing);
  }
  public void testResidence() throws IOException {
    final Residence residence = SchemaOrg.residence()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(residence));
    assertEquals(residence, thing);
  }
  public void testMusicEvent() throws IOException {
    final MusicEvent musicEvent = SchemaOrg.musicEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicEvent));
    assertEquals(musicEvent, thing);
  }
  public void testConsumeAction() throws IOException {
    final ConsumeAction consumeAction = SchemaOrg.consumeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(consumeAction));
    assertEquals(consumeAction, thing);
  }
  public void testAudioObject() throws IOException {
    final AudioObject audioObject = SchemaOrg.audioObject()
      .transcript("Test String")
      .bitrate("Test String")
      .contentSize("Test String")
      .contentUrl("Test String")
      .embedUrl("Test String")
      .encodingFormat("Test String")
      .expires(NOW)
      .playerType("Test String")
      .requiresSubscription(true)
      .uploadDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(audioObject));
    assertEquals(audioObject, thing);
  }
  public void testTaxiService() throws IOException {
    final TaxiService taxiService = SchemaOrg.taxiService()
      .serviceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(taxiService));
    assertEquals(taxiService, thing);
  }
  public void testWantAction() throws IOException {
    final WantAction wantAction = SchemaOrg.wantAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wantAction));
    assertEquals(wantAction, thing);
  }
  public void testState() throws IOException {
    final State state = SchemaOrg.state()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(state));
    assertEquals(state, thing);
  }
  public void testOwnershipInfo() throws IOException {
    final OwnershipInfo ownershipInfo = SchemaOrg.ownershipInfo()
      .ownedFrom(NOW)
      .ownedThrough(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(ownershipInfo));
    assertEquals(ownershipInfo, thing);
  }
  public void testAnatomicalStructure() throws IOException {
    final AnatomicalStructure anatomicalStructure = SchemaOrg.anatomicalStructure()
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(anatomicalStructure));
    assertEquals(anatomicalStructure, thing);
  }
  public void testLendAction() throws IOException {
    final LendAction lendAction = SchemaOrg.lendAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lendAction));
    assertEquals(lendAction, thing);
  }
  public void testAirline() throws IOException {
    final Airline airline = SchemaOrg.airline()
      .iataCode("Test String")
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(airline));
    assertEquals(airline, thing);
  }
  public void testNewsArticle() throws IOException {
    final NewsArticle newsArticle = SchemaOrg.newsArticle()
      .dateline("Test String")
      .printColumn("Test String")
      .printEdition("Test String")
      .printPage("Test String")
      .printSection("Test String")
      .articleBody("Test String")
      .articleSection("Test String")
      .wordCount(42)
      .pageEnd(42)
      .pageStart(42)
      .pagination("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(newsArticle));
    assertEquals(newsArticle, thing);
  }
  public void testMiddleSchool() throws IOException {
    final MiddleSchool middleSchool = SchemaOrg.middleSchool()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(middleSchool));
    assertEquals(middleSchool, thing);
  }
  public void testMusicAlbumReleaseType() throws IOException {
    final MusicAlbumReleaseType musicAlbumReleaseType = SchemaOrg.musicAlbumReleaseType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicAlbumReleaseType));
    assertEquals(musicAlbumReleaseType, thing);
  }
  public void testTVEpisode() throws IOException {
    final TVEpisode tVEpisode = SchemaOrg.tVEpisode()
      .episodeNumber(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tVEpisode));
    assertEquals(tVEpisode, thing);
  }
  public void testStadiumOrArena() throws IOException {
    final StadiumOrArena stadiumOrArena = SchemaOrg.stadiumOrArena()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(stadiumOrArena));
    assertEquals(stadiumOrArena, thing);
  }
  public void testMedicalGuidelineContraindication() throws IOException {
    final MedicalGuidelineContraindication medicalGuidelineContraindication = SchemaOrg.medicalGuidelineContraindication()
      .evidenceOrigin("Test String")
      .guidelineDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalGuidelineContraindication));
    assertEquals(medicalGuidelineContraindication, thing);
  }
  public void testMedicalIntangible() throws IOException {
    final MedicalIntangible medicalIntangible = SchemaOrg.medicalIntangible()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalIntangible));
    assertEquals(medicalIntangible, thing);
  }
  public void testSpecialty() throws IOException {
    final Specialty specialty = SchemaOrg.specialty()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(specialty));
    assertEquals(specialty, thing);
  }
  public void testVessel() throws IOException {
    final Vessel vessel = SchemaOrg.vessel()
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(vessel));
    assertEquals(vessel, thing);
  }
  public void testSportsOrganization() throws IOException {
    final SportsOrganization sportsOrganization = SchemaOrg.sportsOrganization()
      .sport("Test String")
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportsOrganization));
    assertEquals(sportsOrganization, thing);
  }
  public void testIgnoreAction() throws IOException {
    final IgnoreAction ignoreAction = SchemaOrg.ignoreAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(ignoreAction));
    assertEquals(ignoreAction, thing);
  }
  public void testUserCheckins() throws IOException {
    final UserCheckins userCheckins = SchemaOrg.userCheckins()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userCheckins));
    assertEquals(userCheckins, thing);
  }
  public void testRole() throws IOException {
    final Role role = SchemaOrg.role()
      .startDate(NOW)
      .roleName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(role));
    assertEquals(role, thing);
  }
  public void testFoodEvent() throws IOException {
    final FoodEvent foodEvent = SchemaOrg.foodEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(foodEvent));
    assertEquals(foodEvent, thing);
  }
  public void testTravelAction() throws IOException {
    final TravelAction travelAction = SchemaOrg.travelAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(travelAction));
    assertEquals(travelAction, thing);
  }
  public void testSubscribeAction() throws IOException {
    final SubscribeAction subscribeAction = SchemaOrg.subscribeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(subscribeAction));
    assertEquals(subscribeAction, thing);
  }
  public void testRadioClip() throws IOException {
    final RadioClip radioClip = SchemaOrg.radioClip()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioClip));
    assertEquals(radioClip, thing);
  }
  public void testBrand() throws IOException {
    final Brand brand = SchemaOrg.brand()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(brand));
    assertEquals(brand, thing);
  }
  public void testItemList() throws IOException {
    final ItemList itemList = SchemaOrg.itemList()
      .numberOfItems(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(itemList));
    assertEquals(itemList, thing);
  }
  public void testSkiResort() throws IOException {
    final SkiResort skiResort = SchemaOrg.skiResort()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(skiResort));
    assertEquals(skiResort, thing);
  }
  public void testContactPoint() throws IOException {
    final ContactPoint contactPoint = SchemaOrg.contactPoint()
      .contactType("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(contactPoint));
    assertEquals(contactPoint, thing);
  }
  public void testDonateAction() throws IOException {
    final DonateAction donateAction = SchemaOrg.donateAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(donateAction));
    assertEquals(donateAction, thing);
  }
  public void testIndividualProduct() throws IOException {
    final IndividualProduct individualProduct = SchemaOrg.individualProduct()
      .award("Test String")
      .color("Test String")
      .gtin12("Test String")
      .gtin13("Test String")
      .gtin14("Test String")
      .gtin8("Test String")
      .mpn("Test String")
      .productID("Test String")
      .releaseDate(NOW)
      .sku("Test String")
      .productionDate(NOW)
      .purchaseDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(individualProduct));
    assertEquals(individualProduct, thing);
  }
  public void testMobilePhoneStore() throws IOException {
    final MobilePhoneStore mobilePhoneStore = SchemaOrg.mobilePhoneStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mobilePhoneStore));
    assertEquals(mobilePhoneStore, thing);
  }
  public void testGovernmentBuilding() throws IOException {
    final GovernmentBuilding governmentBuilding = SchemaOrg.governmentBuilding()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(governmentBuilding));
    assertEquals(governmentBuilding, thing);
  }
  public void testWearAction() throws IOException {
    final WearAction wearAction = SchemaOrg.wearAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wearAction));
    assertEquals(wearAction, thing);
  }
  public void testPhysicalActivity() throws IOException {
    final PhysicalActivity physicalActivity = SchemaOrg.physicalActivity()
      .epidemiology("Test String")
      .pathophysiology("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(physicalActivity));
    assertEquals(physicalActivity, thing);
  }
  public void testUserTweets() throws IOException {
    final UserTweets userTweets = SchemaOrg.userTweets()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userTweets));
    assertEquals(userTweets, thing);
  }
  public void testAction() throws IOException {
    final Action action = SchemaOrg.action()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(action));
    assertEquals(action, thing);
  }
  public void testPaymentChargeSpecification() throws IOException {
    final PaymentChargeSpecification paymentChargeSpecification = SchemaOrg.paymentChargeSpecification()
      .maxPrice(42)
      .minPrice(42)
      .price(42)
      .validFrom(NOW)
      .validThrough(NOW)
      .valueAddedTaxIncluded(true)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(paymentChargeSpecification));
    assertEquals(paymentChargeSpecification, thing);
  }
  public void testMedicalObservationalStudy() throws IOException {
    final MedicalObservationalStudy medicalObservationalStudy = SchemaOrg.medicalObservationalStudy()
      .outcome("Test String")
      .population("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalObservationalStudy));
    assertEquals(medicalObservationalStudy, thing);
  }
  public void testDisagreeAction() throws IOException {
    final DisagreeAction disagreeAction = SchemaOrg.disagreeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(disagreeAction));
    assertEquals(disagreeAction, thing);
  }
  public void testCheckInAction() throws IOException {
    final CheckInAction checkInAction = SchemaOrg.checkInAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(checkInAction));
    assertEquals(checkInAction, thing);
  }
  public void testSiteNavigationElement() throws IOException {
    final SiteNavigationElement siteNavigationElement = SchemaOrg.siteNavigationElement()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(siteNavigationElement));
    assertEquals(siteNavigationElement, thing);
  }
  public void testLoseAction() throws IOException {
    final LoseAction loseAction = SchemaOrg.loseAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(loseAction));
    assertEquals(loseAction, thing);
  }
  public void testPerson() throws IOException {
    final Person person = SchemaOrg.person()
      .additionalName("Test String")
      .award("Test String")
      .birthDate(NOW)
      .deathDate(NOW)
      .duns("Test String")
      .email("Test String")
      .familyName("Test String")
      .faxNumber("Test String")
      .gender("Test String")
      .givenName("Test String")
      .globalLocationNumber("Test String")
      .honorificPrefix("Test String")
      .honorificSuffix("Test String")
      .isicV4("Test String")
      .jobTitle("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(person));
    assertEquals(person, thing);
  }
  public void testArticle() throws IOException {
    final Article article = SchemaOrg.article()
      .articleBody("Test String")
      .articleSection("Test String")
      .wordCount(42)
      .pageEnd(42)
      .pageStart(42)
      .pagination("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(article));
    assertEquals(article, thing);
  }
  public void testLiquorStore() throws IOException {
    final LiquorStore liquorStore = SchemaOrg.liquorStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(liquorStore));
    assertEquals(liquorStore, thing);
  }
  public void testMedicalCode() throws IOException {
    final MedicalCode medicalCode = SchemaOrg.medicalCode()
      .codeValue("Test String")
      .codingSystem("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalCode));
    assertEquals(medicalCode, thing);
  }
  public void testVideoGameClip() throws IOException {
    final VideoGameClip videoGameClip = SchemaOrg.videoGameClip()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(videoGameClip));
    assertEquals(videoGameClip, thing);
  }
  public void testRVPark() throws IOException {
    final RVPark rVPark = SchemaOrg.rVPark()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rVPark));
    assertEquals(rVPark, thing);
  }
  public void testJoinAction() throws IOException {
    final JoinAction joinAction = SchemaOrg.joinAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(joinAction));
    assertEquals(joinAction, thing);
  }
  public void testCancelAction() throws IOException {
    final CancelAction cancelAction = SchemaOrg.cancelAction()
      .scheduledTime(NOW)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cancelAction));
    assertEquals(cancelAction, thing);
  }
  public void testAboutPage() throws IOException {
    final AboutPage aboutPage = SchemaOrg.aboutPage()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(aboutPage));
    assertEquals(aboutPage, thing);
  }
  public void testPropertyValue() throws IOException {
    final PropertyValue propertyValue = SchemaOrg.propertyValue()
      .minValue(42)
      .unitCode("Test String")
      .value(42)
      .unitText("Test String")
      .propertyID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(propertyValue));
    assertEquals(propertyValue, thing);
  }
  public void testPainting() throws IOException {
    final Painting painting = SchemaOrg.painting()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(painting));
    assertEquals(painting, thing);
  }
  public void testShoppingCenter() throws IOException {
    final ShoppingCenter shoppingCenter = SchemaOrg.shoppingCenter()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(shoppingCenter));
    assertEquals(shoppingCenter, thing);
  }
  public void testIceCreamShop() throws IOException {
    final IceCreamShop iceCreamShop = SchemaOrg.iceCreamShop()
      .acceptsReservations(true)
      .menu("Test String")
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(iceCreamShop));
    assertEquals(iceCreamShop, thing);
  }
  public void testHinduTemple() throws IOException {
    final HinduTemple hinduTemple = SchemaOrg.hinduTemple()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hinduTemple));
    assertEquals(hinduTemple, thing);
  }
  public void testVoteAction() throws IOException {
    final VoteAction voteAction = SchemaOrg.voteAction()
      .actionOption("Test String")
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(voteAction));
    assertEquals(voteAction, thing);
  }
  public void testSelfStorage() throws IOException {
    final SelfStorage selfStorage = SchemaOrg.selfStorage()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(selfStorage));
    assertEquals(selfStorage, thing);
  }
  public void testJobPosting() throws IOException {
    final JobPosting jobPosting = SchemaOrg.jobPosting()
      .baseSalary(42)
      .jobBenefits("Test String")
      .datePosted(NOW)
      .educationRequirements("Test String")
      .employmentType("Test String")
      .experienceRequirements("Test String")
      .incentiveCompensation("Test String")
      .industry("Test String")
      .occupationalCategory("Test String")
      .qualifications("Test String")
      .responsibilities("Test String")
      .salaryCurrency("Test String")
      .skills("Test String")
      .specialCommitments("Test String")
      .title("Test String")
      .workHours("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(jobPosting));
    assertEquals(jobPosting, thing);
  }
  public void testTaxiStand() throws IOException {
    final TaxiStand taxiStand = SchemaOrg.taxiStand()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(taxiStand));
    assertEquals(taxiStand, thing);
  }
  public void testPalliativeProcedure() throws IOException {
    final PalliativeProcedure palliativeProcedure = SchemaOrg.palliativeProcedure()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(palliativeProcedure));
    assertEquals(palliativeProcedure, thing);
  }
  public void testConvenienceStore() throws IOException {
    final ConvenienceStore convenienceStore = SchemaOrg.convenienceStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(convenienceStore));
    assertEquals(convenienceStore, thing);
  }
  public void testWaterfall() throws IOException {
    final Waterfall waterfall = SchemaOrg.waterfall()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(waterfall));
    assertEquals(waterfall, thing);
  }
  public void testTheaterGroup() throws IOException {
    final TheaterGroup theaterGroup = SchemaOrg.theaterGroup()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(theaterGroup));
    assertEquals(theaterGroup, thing);
  }
  public void testBowlingAlley() throws IOException {
    final BowlingAlley bowlingAlley = SchemaOrg.bowlingAlley()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bowlingAlley));
    assertEquals(bowlingAlley, thing);
  }
  public void testMedicalSign() throws IOException {
    final MedicalSign medicalSign = SchemaOrg.medicalSign()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalSign));
    assertEquals(medicalSign, thing);
  }
  public void testHairSalon() throws IOException {
    final HairSalon hairSalon = SchemaOrg.hairSalon()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hairSalon));
    assertEquals(hairSalon, thing);
  }
  public void testPoliceStation() throws IOException {
    final PoliceStation policeStation = SchemaOrg.policeStation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(policeStation));
    assertEquals(policeStation, thing);
  }
  public void testGatedResidenceCommunity() throws IOException {
    final GatedResidenceCommunity gatedResidenceCommunity = SchemaOrg.gatedResidenceCommunity()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(gatedResidenceCommunity));
    assertEquals(gatedResidenceCommunity, thing);
  }
  public void testGameServerStatus() throws IOException {
    final GameServerStatus gameServerStatus = SchemaOrg.gameServerStatus()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(gameServerStatus));
    assertEquals(gameServerStatus, thing);
  }
  public void testLandmarksOrHistoricalBuildings() throws IOException {
    final LandmarksOrHistoricalBuildings landmarksOrHistoricalBuildings = SchemaOrg.landmarksOrHistoricalBuildings()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(landmarksOrHistoricalBuildings));
    assertEquals(landmarksOrHistoricalBuildings, thing);
  }
  public void testDryCleaningOrLaundry() throws IOException {
    final DryCleaningOrLaundry dryCleaningOrLaundry = SchemaOrg.dryCleaningOrLaundry()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dryCleaningOrLaundry));
    assertEquals(dryCleaningOrLaundry, thing);
  }
  public void testInviteAction() throws IOException {
    final InviteAction inviteAction = SchemaOrg.inviteAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(inviteAction));
    assertEquals(inviteAction, thing);
  }
  public void testDanceEvent() throws IOException {
    final DanceEvent danceEvent = SchemaOrg.danceEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(danceEvent));
    assertEquals(danceEvent, thing);
  }
  public void testOfficeEquipmentStore() throws IOException {
    final OfficeEquipmentStore officeEquipmentStore = SchemaOrg.officeEquipmentStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(officeEquipmentStore));
    assertEquals(officeEquipmentStore, thing);
  }
  public void testRadioSeason() throws IOException {
    final RadioSeason radioSeason = SchemaOrg.radioSeason()
      .endDate(NOW)
      .numberOfEpisodes(42)
      .seasonNumber(42)
      .startDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioSeason));
    assertEquals(radioSeason, thing);
  }
  public void testPharmacy() throws IOException {
    final Pharmacy pharmacy = SchemaOrg.pharmacy()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(pharmacy));
    assertEquals(pharmacy, thing);
  }
  public void testCatholicChurch() throws IOException {
    final CatholicChurch catholicChurch = SchemaOrg.catholicChurch()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(catholicChurch));
    assertEquals(catholicChurch, thing);
  }
  public void testSuspendAction() throws IOException {
    final SuspendAction suspendAction = SchemaOrg.suspendAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(suspendAction));
    assertEquals(suspendAction, thing);
  }
  public void testReturnAction() throws IOException {
    final ReturnAction returnAction = SchemaOrg.returnAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(returnAction));
    assertEquals(returnAction, thing);
  }
  public void testExerciseGym() throws IOException {
    final ExerciseGym exerciseGym = SchemaOrg.exerciseGym()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(exerciseGym));
    assertEquals(exerciseGym, thing);
  }
  public void testAggregateRating() throws IOException {
    final AggregateRating aggregateRating = SchemaOrg.aggregateRating()
      .ratingCount(42)
      .reviewCount(42)
      .bestRating(42)
      .ratingValue("Test String")
      .worstRating(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(aggregateRating));
    assertEquals(aggregateRating, thing);
  }
  public void testDepartAction() throws IOException {
    final DepartAction departAction = SchemaOrg.departAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(departAction));
    assertEquals(departAction, thing);
  }
  public void testEducationEvent() throws IOException {
    final EducationEvent educationEvent = SchemaOrg.educationEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(educationEvent));
    assertEquals(educationEvent, thing);
  }
  public void testItemAvailability() throws IOException {
    final ItemAvailability itemAvailability = SchemaOrg.itemAvailability()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(itemAvailability));
    assertEquals(itemAvailability, thing);
  }
  public void testEntryPoint() throws IOException {
    final EntryPoint entryPoint = SchemaOrg.entryPoint()
      .httpMethod("Test String")
      .encodingType("Test String")
      .contentType("Test String")
      .urlTemplate("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(entryPoint));
    assertEquals(entryPoint, thing);
  }
  public void testProgramMembership() throws IOException {
    final ProgramMembership programMembership = SchemaOrg.programMembership()
      .membershipNumber("Test String")
      .programName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(programMembership));
    assertEquals(programMembership, thing);
  }
  public void testPathologyTest() throws IOException {
    final PathologyTest pathologyTest = SchemaOrg.pathologyTest()
      .tissueSample("Test String")
      .normalRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(pathologyTest));
    assertEquals(pathologyTest, thing);
  }
  public void testReservationStatusType() throws IOException {
    final ReservationStatusType reservationStatusType = SchemaOrg.reservationStatusType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reservationStatusType));
    assertEquals(reservationStatusType, thing);
  }
  public void testGame() throws IOException {
    final Game game = SchemaOrg.game()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(game));
    assertEquals(game, thing);
  }
  public void testProfessionalService() throws IOException {
    final ProfessionalService professionalService = SchemaOrg.professionalService()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(professionalService));
    assertEquals(professionalService, thing);
  }
  public void testVein() throws IOException {
    final Vein vein = SchemaOrg.vein()
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(vein));
    assertEquals(vein, thing);
  }
  public void testMedicalTrialDesign() throws IOException {
    final MedicalTrialDesign medicalTrialDesign = SchemaOrg.medicalTrialDesign()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalTrialDesign));
    assertEquals(medicalTrialDesign, thing);
  }
  public void testUpdateAction() throws IOException {
    final UpdateAction updateAction = SchemaOrg.updateAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(updateAction));
    assertEquals(updateAction, thing);
  }
  public void testWarrantyScope() throws IOException {
    final WarrantyScope warrantyScope = SchemaOrg.warrantyScope()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(warrantyScope));
    assertEquals(warrantyScope, thing);
  }
  public void testPlumber() throws IOException {
    final Plumber plumber = SchemaOrg.plumber()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(plumber));
    assertEquals(plumber, thing);
  }
  public void testBakery() throws IOException {
    final Bakery bakery = SchemaOrg.bakery()
      .acceptsReservations(true)
      .menu("Test String")
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bakery));
    assertEquals(bakery, thing);
  }
  public void testPublicationVolume() throws IOException {
    final PublicationVolume publicationVolume = SchemaOrg.publicationVolume()
      .pageEnd(42)
      .pageStart(42)
      .pagination("Test String")
      .volumeNumber(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(publicationVolume));
    assertEquals(publicationVolume, thing);
  }
  public void testBuyAction() throws IOException {
    final BuyAction buyAction = SchemaOrg.buyAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(buyAction));
    assertEquals(buyAction, thing);
  }
  public void testWebSite() throws IOException {
    final WebSite webSite = SchemaOrg.webSite()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(webSite));
    assertEquals(webSite, thing);
  }
  public void testMensClothingStore() throws IOException {
    final MensClothingStore mensClothingStore = SchemaOrg.mensClothingStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mensClothingStore));
    assertEquals(mensClothingStore, thing);
  }
  public void testLocksmith() throws IOException {
    final Locksmith locksmith = SchemaOrg.locksmith()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(locksmith));
    assertEquals(locksmith, thing);
  }
  public void testMusicAlbum() throws IOException {
    final MusicAlbum musicAlbum = SchemaOrg.musicAlbum()
      .numTracks(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicAlbum));
    assertEquals(musicAlbum, thing);
  }
  public void testCorporation() throws IOException {
    final Corporation corporation = SchemaOrg.corporation()
      .tickerSymbol("Test String")
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(corporation));
    assertEquals(corporation, thing);
  }
  public void testBodyOfWater() throws IOException {
    final BodyOfWater bodyOfWater = SchemaOrg.bodyOfWater()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bodyOfWater));
    assertEquals(bodyOfWater, thing);
  }
  public void testRealEstateAgent() throws IOException {
    final RealEstateAgent realEstateAgent = SchemaOrg.realEstateAgent()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(realEstateAgent));
    assertEquals(realEstateAgent, thing);
  }
  public void testDrugLegalStatus() throws IOException {
    final DrugLegalStatus drugLegalStatus = SchemaOrg.drugLegalStatus()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drugLegalStatus));
    assertEquals(drugLegalStatus, thing);
  }
  public void testMedicalTestPanel() throws IOException {
    final MedicalTestPanel medicalTestPanel = SchemaOrg.medicalTestPanel()
      .normalRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalTestPanel));
    assertEquals(medicalTestPanel, thing);
  }
  public void testTennisComplex() throws IOException {
    final TennisComplex tennisComplex = SchemaOrg.tennisComplex()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tennisComplex));
    assertEquals(tennisComplex, thing);
  }
  public void testMusicVenue() throws IOException {
    final MusicVenue musicVenue = SchemaOrg.musicVenue()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicVenue));
    assertEquals(musicVenue, thing);
  }
  public void testWholesaleStore() throws IOException {
    final WholesaleStore wholesaleStore = SchemaOrg.wholesaleStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wholesaleStore));
    assertEquals(wholesaleStore, thing);
  }
  public void testMedicalClinic() throws IOException {
    final MedicalClinic medicalClinic = SchemaOrg.medicalClinic()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalClinic));
    assertEquals(medicalClinic, thing);
  }
  public void testDrugStrength() throws IOException {
    final DrugStrength drugStrength = SchemaOrg.drugStrength()
      .activeIngredient("Test String")
      .strengthUnit("Test String")
      .strengthValue(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drugStrength));
    assertEquals(drugStrength, thing);
  }
  public void testShareAction() throws IOException {
    final ShareAction shareAction = SchemaOrg.shareAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(shareAction));
    assertEquals(shareAction, thing);
  }
  public void testSportsActivityLocation() throws IOException {
    final SportsActivityLocation sportsActivityLocation = SchemaOrg.sportsActivityLocation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportsActivityLocation));
    assertEquals(sportsActivityLocation, thing);
  }
  public void testEmailMessage() throws IOException {
    final EmailMessage emailMessage = SchemaOrg.emailMessage()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(emailMessage));
    assertEquals(emailMessage, thing);
  }
  public void testParentAudience() throws IOException {
    final ParentAudience parentAudience = SchemaOrg.parentAudience()
      .childMaxAge(42)
      .childMinAge(42)
      .requiredGender("Test String")
      .requiredMaxAge(42)
      .requiredMinAge(42)
      .suggestedGender("Test String")
      .suggestedMaxAge(42)
      .suggestedMinAge(42)
      .audienceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(parentAudience));
    assertEquals(parentAudience, thing);
  }
  public void testRadioEpisode() throws IOException {
    final RadioEpisode radioEpisode = SchemaOrg.radioEpisode()
      .episodeNumber(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioEpisode));
    assertEquals(radioEpisode, thing);
  }
  public void testPublicationEvent() throws IOException {
    final PublicationEvent publicationEvent = SchemaOrg.publicationEvent()
      .isAccessibleForFree(true)
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(publicationEvent));
    assertEquals(publicationEvent, thing);
  }
  public void testOrganization() throws IOException {
    final Organization organization = SchemaOrg.organization()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(organization));
    assertEquals(organization, thing);
  }
  public void testOrder() throws IOException {
    final Order order = SchemaOrg.order()
      .confirmationNumber("Test String")
      .discount(42)
      .discountCode("Test String")
      .discountCurrency("Test String")
      .isGift(true)
      .orderDate(NOW)
      .orderNumber("Test String")
      .paymentDue(NOW)
      .paymentMethodId("Test String")
      .paymentUrl("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(order));
    assertEquals(order, thing);
  }
  public void testViewAction() throws IOException {
    final ViewAction viewAction = SchemaOrg.viewAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(viewAction));
    assertEquals(viewAction, thing);
  }
  public void testClip() throws IOException {
    final Clip clip = SchemaOrg.clip()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(clip));
    assertEquals(clip, thing);
  }
  public void testComment() throws IOException {
    final Comment comment = SchemaOrg.comment()
      .upvoteCount(42)
      .downvoteCount(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(comment));
    assertEquals(comment, thing);
  }
  public void testApplyAction() throws IOException {
    final ApplyAction applyAction = SchemaOrg.applyAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(applyAction));
    assertEquals(applyAction, thing);
  }
  public void testPerformingArtsTheater() throws IOException {
    final PerformingArtsTheater performingArtsTheater = SchemaOrg.performingArtsTheater()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(performingArtsTheater));
    assertEquals(performingArtsTheater, thing);
  }
  public void testDeliveryEvent() throws IOException {
    final DeliveryEvent deliveryEvent = SchemaOrg.deliveryEvent()
      .accessCode("Test String")
      .availableFrom(NOW)
      .availableThrough(NOW)
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(deliveryEvent));
    assertEquals(deliveryEvent, thing);
  }
  public void testSoftwareApplicationBuild() throws IOException {
    final SoftwareApplicationBuild softwareApplicationBuild = SchemaOrg.softwareApplicationBuild()
      .applicationCategory("Test String")
      .applicationSubCategory("Test String")
      .applicationSuite("Test String")
      .countriesNotSupported("Test String")
      .countriesSupported("Test String")
      .availableOnDevice("Test String")
      .downloadUrl("Test String")
      .featureList("Test String")
      .fileFormat("Test String")
      .fileSize(42)
      .installUrl("Test String")
      .memoryRequirements("Test String")
      .operatingSystem("Test String")
      .permissions("Test String")
      .processorRequirements("Test String")
      .releaseNotes("Test String")
      .softwareRequirements("Test String")
      .softwareVersion("Test String")
      .storageRequirements("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(softwareApplicationBuild));
    assertEquals(softwareApplicationBuild, thing);
  }
  public void testCampground() throws IOException {
    final Campground campground = SchemaOrg.campground()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(campground));
    assertEquals(campground, thing);
  }
  public void testTelevisionChannel() throws IOException {
    final TelevisionChannel televisionChannel = SchemaOrg.televisionChannel()
      .broadcastChannelId("Test String")
      .broadcastServiceTier("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(televisionChannel));
    assertEquals(televisionChannel, thing);
  }
  public void testHousePainter() throws IOException {
    final HousePainter housePainter = SchemaOrg.housePainter()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(housePainter));
    assertEquals(housePainter, thing);
  }
  public void testStructuredValue() throws IOException {
    final StructuredValue structuredValue = SchemaOrg.structuredValue()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(structuredValue));
    assertEquals(structuredValue, thing);
  }
  public void testMedicalProcedureType() throws IOException {
    final MedicalProcedureType medicalProcedureType = SchemaOrg.medicalProcedureType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalProcedureType));
    assertEquals(medicalProcedureType, thing);
  }
  public void testCemetery() throws IOException {
    final Cemetery cemetery = SchemaOrg.cemetery()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cemetery));
    assertEquals(cemetery, thing);
  }
  public void testSeat() throws IOException {
    final Seat seat = SchemaOrg.seat()
      .seatNumber("Test String")
      .seatRow("Test String")
      .seatSection("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(seat));
    assertEquals(seat, thing);
  }
  public void testMovie() throws IOException {
    final Movie movie = SchemaOrg.movie()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movie));
    assertEquals(movie, thing);
  }
  public void testHostel() throws IOException {
    final Hostel hostel = SchemaOrg.hostel()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hostel));
    assertEquals(hostel, thing);
  }
  public void testDrawAction() throws IOException {
    final DrawAction drawAction = SchemaOrg.drawAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drawAction));
    assertEquals(drawAction, thing);
  }
  public void testTradeAction() throws IOException {
    final TradeAction tradeAction = SchemaOrg.tradeAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tradeAction));
    assertEquals(tradeAction, thing);
  }
  public void testExerciseAction() throws IOException {
    final ExerciseAction exerciseAction = SchemaOrg.exerciseAction()
      .exerciseType("Test String")
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(exerciseAction));
    assertEquals(exerciseAction, thing);
  }
  public void testMedicalWebPage() throws IOException {
    final MedicalWebPage medicalWebPage = SchemaOrg.medicalWebPage()
      .aspect("Test String")
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalWebPage));
    assertEquals(medicalWebPage, thing);
  }
  public void testActivateAction() throws IOException {
    final ActivateAction activateAction = SchemaOrg.activateAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(activateAction));
    assertEquals(activateAction, thing);
  }
  public void testGasStation() throws IOException {
    final GasStation gasStation = SchemaOrg.gasStation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(gasStation));
    assertEquals(gasStation, thing);
  }
  public void testDeliveryMethod() throws IOException {
    final DeliveryMethod deliveryMethod = SchemaOrg.deliveryMethod()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(deliveryMethod));
    assertEquals(deliveryMethod, thing);
  }
  public void testFlight() throws IOException {
    final Flight flight = SchemaOrg.flight()
      .flightNumber("Test String")
      .departureTime(NOW)
      .arrivalTime(NOW)
      .departureGate("Test String")
      .arrivalGate("Test String")
      .departureTerminal("Test String")
      .arrivalTerminal("Test String")
      .aircraft("Test String")
      .mealService("Test String")
      .webCheckinTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(flight));
    assertEquals(flight, thing);
  }
  public void testInstallAction() throws IOException {
    final InstallAction installAction = SchemaOrg.installAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(installAction));
    assertEquals(installAction, thing);
  }
  public void testMedicalRiskScore() throws IOException {
    final MedicalRiskScore medicalRiskScore = SchemaOrg.medicalRiskScore()
      .algorithm("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalRiskScore));
    assertEquals(medicalRiskScore, thing);
  }
  public void testUserPlays() throws IOException {
    final UserPlays userPlays = SchemaOrg.userPlays()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userPlays));
    assertEquals(userPlays, thing);
  }
  public void testArtGallery() throws IOException {
    final ArtGallery artGallery = SchemaOrg.artGallery()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(artGallery));
    assertEquals(artGallery, thing);
  }
  public void testAskAction() throws IOException {
    final AskAction askAction = SchemaOrg.askAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(askAction));
    assertEquals(askAction, thing);
  }
  public void testRegisterAction() throws IOException {
    final RegisterAction registerAction = SchemaOrg.registerAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(registerAction));
    assertEquals(registerAction, thing);
  }
  public void testAssessAction() throws IOException {
    final AssessAction assessAction = SchemaOrg.assessAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(assessAction));
    assertEquals(assessAction, thing);
  }
  public void testApprovedIndication() throws IOException {
    final ApprovedIndication approvedIndication = SchemaOrg.approvedIndication()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(approvedIndication));
    assertEquals(approvedIndication, thing);
  }
  public void testFestival() throws IOException {
    final Festival festival = SchemaOrg.festival()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(festival));
    assertEquals(festival, thing);
  }
  public void testGeneralContractor() throws IOException {
    final GeneralContractor generalContractor = SchemaOrg.generalContractor()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(generalContractor));
    assertEquals(generalContractor, thing);
  }
  public void testNailSalon() throws IOException {
    final NailSalon nailSalon = SchemaOrg.nailSalon()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(nailSalon));
    assertEquals(nailSalon, thing);
  }
  public void testSeries() throws IOException {
    final Series series = SchemaOrg.series()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(series));
    assertEquals(series, thing);
  }
  public void testPark() throws IOException {
    final Park park = SchemaOrg.park()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(park));
    assertEquals(park, thing);
  }
  public void testBorrowAction() throws IOException {
    final BorrowAction borrowAction = SchemaOrg.borrowAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(borrowAction));
    assertEquals(borrowAction, thing);
  }
  public void testBoardingPolicyType() throws IOException {
    final BoardingPolicyType boardingPolicyType = SchemaOrg.boardingPolicyType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(boardingPolicyType));
    assertEquals(boardingPolicyType, thing);
  }
  public void testDentist() throws IOException {
    final Dentist dentist = SchemaOrg.dentist()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dentist));
    assertEquals(dentist, thing);
  }
  public void testPhysicalTherapy() throws IOException {
    final PhysicalTherapy physicalTherapy = SchemaOrg.physicalTherapy()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(physicalTherapy));
    assertEquals(physicalTherapy, thing);
  }
  public void testWebPageElement() throws IOException {
    final WebPageElement webPageElement = SchemaOrg.webPageElement()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(webPageElement));
    assertEquals(webPageElement, thing);
  }
  public void testMusicPlaylist() throws IOException {
    final MusicPlaylist musicPlaylist = SchemaOrg.musicPlaylist()
      .numTracks(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicPlaylist));
    assertEquals(musicPlaylist, thing);
  }
  public void testCheckOutAction() throws IOException {
    final CheckOutAction checkOutAction = SchemaOrg.checkOutAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(checkOutAction));
    assertEquals(checkOutAction, thing);
  }
  public void testItemListOrderType() throws IOException {
    final ItemListOrderType itemListOrderType = SchemaOrg.itemListOrderType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(itemListOrderType));
    assertEquals(itemListOrderType, thing);
  }
  public void testStore() throws IOException {
    final Store store = SchemaOrg.store()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(store));
    assertEquals(store, thing);
  }
  public void testSearchAction() throws IOException {
    final SearchAction searchAction = SchemaOrg.searchAction()
      .query("Test String")
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(searchAction));
    assertEquals(searchAction, thing);
  }
  public void testMovieClip() throws IOException {
    final MovieClip movieClip = SchemaOrg.movieClip()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movieClip));
    assertEquals(movieClip, thing);
  }
  public void testEmbassy() throws IOException {
    final Embassy embassy = SchemaOrg.embassy()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(embassy));
    assertEquals(embassy, thing);
  }
  public void testEducationalOrganization() throws IOException {
    final EducationalOrganization educationalOrganization = SchemaOrg.educationalOrganization()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(educationalOrganization));
    assertEquals(educationalOrganization, thing);
  }
  public void testParcelService() throws IOException {
    final ParcelService parcelService = SchemaOrg.parcelService()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(parcelService));
    assertEquals(parcelService, thing);
  }
  public void testMedicalOrganization() throws IOException {
    final MedicalOrganization medicalOrganization = SchemaOrg.medicalOrganization()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalOrganization));
    assertEquals(medicalOrganization, thing);
  }
  public void testCollegeOrUniversity() throws IOException {
    final CollegeOrUniversity collegeOrUniversity = SchemaOrg.collegeOrUniversity()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(collegeOrUniversity));
    assertEquals(collegeOrUniversity, thing);
  }
  public void testBefriendAction() throws IOException {
    final BefriendAction befriendAction = SchemaOrg.befriendAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(befriendAction));
    assertEquals(befriendAction, thing);
  }
  public void testDrinkAction() throws IOException {
    final DrinkAction drinkAction = SchemaOrg.drinkAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drinkAction));
    assertEquals(drinkAction, thing);
  }
  public void testMusicReleaseFormatType() throws IOException {
    final MusicReleaseFormatType musicReleaseFormatType = SchemaOrg.musicReleaseFormatType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicReleaseFormatType));
    assertEquals(musicReleaseFormatType, thing);
  }
  public void testMedicalProcedure() throws IOException {
    final MedicalProcedure medicalProcedure = SchemaOrg.medicalProcedure()
      .followup("Test String")
      .howPerformed("Test String")
      .preparation("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalProcedure));
    assertEquals(medicalProcedure, thing);
  }
  public void testGovernmentPermit() throws IOException {
    final GovernmentPermit governmentPermit = SchemaOrg.governmentPermit()
      .validFrom(NOW)
      .validUntil(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(governmentPermit));
    assertEquals(governmentPermit, thing);
  }
  public void testBookSeries() throws IOException {
    final BookSeries bookSeries = SchemaOrg.bookSeries()
      .endDate(NOW)
      .startDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bookSeries));
    assertEquals(bookSeries, thing);
  }
  public void testSportsClub() throws IOException {
    final SportsClub sportsClub = SchemaOrg.sportsClub()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportsClub));
    assertEquals(sportsClub, thing);
  }
  public void testDrugClass() throws IOException {
    final DrugClass drugClass = SchemaOrg.drugClass()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drugClass));
    assertEquals(drugClass, thing);
  }
  public void testRentalCarReservation() throws IOException {
    final RentalCarReservation rentalCarReservation = SchemaOrg.rentalCarReservation()
      .pickupTime(NOW)
      .dropoffTime(NOW)
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rentalCarReservation));
    assertEquals(rentalCarReservation, thing);
  }
  public void testPublicSwimmingPool() throws IOException {
    final PublicSwimmingPool publicSwimmingPool = SchemaOrg.publicSwimmingPool()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(publicSwimmingPool));
    assertEquals(publicSwimmingPool, thing);
  }
  public void testQuantity() throws IOException {
    final Quantity quantity = SchemaOrg.quantity()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(quantity));
    assertEquals(quantity, thing);
  }
  public void testUserLikes() throws IOException {
    final UserLikes userLikes = SchemaOrg.userLikes()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userLikes));
    assertEquals(userLikes, thing);
  }
  public void testMuscle() throws IOException {
    final Muscle muscle = SchemaOrg.muscle()
      .muscleAction("Test String")
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(muscle));
    assertEquals(muscle, thing);
  }
  public void testEmploymentAgency() throws IOException {
    final EmploymentAgency employmentAgency = SchemaOrg.employmentAgency()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(employmentAgency));
    assertEquals(employmentAgency, thing);
  }
  public void testWinAction() throws IOException {
    final WinAction winAction = SchemaOrg.winAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(winAction));
    assertEquals(winAction, thing);
  }
  public void testBookStore() throws IOException {
    final BookStore bookStore = SchemaOrg.bookStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bookStore));
    assertEquals(bookStore, thing);
  }
  public void testSeason() throws IOException {
    final Season season = SchemaOrg.season()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(season));
    assertEquals(season, thing);
  }
  public void testReservation() throws IOException {
    final Reservation reservation = SchemaOrg.reservation()
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reservation));
    assertEquals(reservation, thing);
  }
  public void testActionStatusType() throws IOException {
    final ActionStatusType actionStatusType = SchemaOrg.actionStatusType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(actionStatusType));
    assertEquals(actionStatusType, thing);
  }
  public void testOpeningHoursSpecification() throws IOException {
    final OpeningHoursSpecification openingHoursSpecification = SchemaOrg.openingHoursSpecification()
      .closes(NOW)
      .opens(NOW)
      .validFrom(NOW)
      .validThrough(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(openingHoursSpecification));
    assertEquals(openingHoursSpecification, thing);
  }
  public void testMedicalIndication() throws IOException {
    final MedicalIndication medicalIndication = SchemaOrg.medicalIndication()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalIndication));
    assertEquals(medicalIndication, thing);
  }
  public void testAggregateOffer() throws IOException {
    final AggregateOffer aggregateOffer = SchemaOrg.aggregateOffer()
      .highPrice(42)
      .lowPrice(42)
      .offerCount(42)
      .availabilityEnds(NOW)
      .availabilityStarts(NOW)
      .gtin12("Test String")
      .gtin13("Test String")
      .gtin14("Test String")
      .gtin8("Test String")
      .mpn("Test String")
      .price(42)
      .priceValidUntil(NOW)
      .sku("Test String")
      .validFrom(NOW)
      .validThrough(NOW)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(aggregateOffer));
    assertEquals(aggregateOffer, thing);
  }
  public void testDepartmentStore() throws IOException {
    final DepartmentStore departmentStore = SchemaOrg.departmentStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(departmentStore));
    assertEquals(departmentStore, thing);
  }
  public void testTipAction() throws IOException {
    final TipAction tipAction = SchemaOrg.tipAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tipAction));
    assertEquals(tipAction, thing);
  }
  public void testMedicineSystem() throws IOException {
    final MedicineSystem medicineSystem = SchemaOrg.medicineSystem()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicineSystem));
    assertEquals(medicineSystem, thing);
  }
  public void testBook() throws IOException {
    final Book book = SchemaOrg.book()
      .bookEdition("Test String")
      .isbn("Test String")
      .numberOfPages(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(book));
    assertEquals(book, thing);
  }
  public void testBrewery() throws IOException {
    final Brewery brewery = SchemaOrg.brewery()
      .acceptsReservations(true)
      .menu("Test String")
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(brewery));
    assertEquals(brewery, thing);
  }
  public void testMedicalEvidenceLevel() throws IOException {
    final MedicalEvidenceLevel medicalEvidenceLevel = SchemaOrg.medicalEvidenceLevel()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalEvidenceLevel));
    assertEquals(medicalEvidenceLevel, thing);
  }
  public void testMedicalSignOrSymptom() throws IOException {
    final MedicalSignOrSymptom medicalSignOrSymptom = SchemaOrg.medicalSignOrSymptom()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalSignOrSymptom));
    assertEquals(medicalSignOrSymptom, thing);
  }
  public void testRecommendedDoseSchedule() throws IOException {
    final RecommendedDoseSchedule recommendedDoseSchedule = SchemaOrg.recommendedDoseSchedule()
      .doseUnit("Test String")
      .doseValue(42)
      .frequency("Test String")
      .targetPopulation("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(recommendedDoseSchedule));
    assertEquals(recommendedDoseSchedule, thing);
  }
  public void testScholarlyArticle() throws IOException {
    final ScholarlyArticle scholarlyArticle = SchemaOrg.scholarlyArticle()
      .articleBody("Test String")
      .articleSection("Test String")
      .wordCount(42)
      .pageEnd(42)
      .pageStart(42)
      .pagination("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(scholarlyArticle));
    assertEquals(scholarlyArticle, thing);
  }
  public void testBusinessEvent() throws IOException {
    final BusinessEvent businessEvent = SchemaOrg.businessEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(businessEvent));
    assertEquals(businessEvent, thing);
  }
  public void testBone() throws IOException {
    final Bone bone = SchemaOrg.bone()
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bone));
    assertEquals(bone, thing);
  }
  public void testInternetCafe() throws IOException {
    final InternetCafe internetCafe = SchemaOrg.internetCafe()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(internetCafe));
    assertEquals(internetCafe, thing);
  }
  public void testReserveAction() throws IOException {
    final ReserveAction reserveAction = SchemaOrg.reserveAction()
      .scheduledTime(NOW)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reserveAction));
    assertEquals(reserveAction, thing);
  }
  public void testBusStop() throws IOException {
    final BusStop busStop = SchemaOrg.busStop()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(busStop));
    assertEquals(busStop, thing);
  }
  public void testSomeProducts() throws IOException {
    final SomeProducts someProducts = SchemaOrg.someProducts()
      .award("Test String")
      .color("Test String")
      .gtin12("Test String")
      .gtin13("Test String")
      .gtin14("Test String")
      .gtin8("Test String")
      .mpn("Test String")
      .productID("Test String")
      .releaseDate(NOW)
      .sku("Test String")
      .productionDate(NOW)
      .purchaseDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(someProducts));
    assertEquals(someProducts, thing);
  }
  public void testEntertainmentBusiness() throws IOException {
    final EntertainmentBusiness entertainmentBusiness = SchemaOrg.entertainmentBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(entertainmentBusiness));
    assertEquals(entertainmentBusiness, thing);
  }
  public void testItemPage() throws IOException {
    final ItemPage itemPage = SchemaOrg.itemPage()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(itemPage));
    assertEquals(itemPage, thing);
  }
  public void testAPIReference() throws IOException {
    final APIReference aPIReference = SchemaOrg.aPIReference()
      .executableLibraryName("Test String")
      .assemblyVersion("Test String")
      .programmingModel("Test String")
      .targetPlatform("Test String")
      .dependencies("Test String")
      .proficiencyLevel("Test String")
      .articleBody("Test String")
      .articleSection("Test String")
      .wordCount(42)
      .pageEnd(42)
      .pageStart(42)
      .pagination("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(aPIReference));
    assertEquals(aPIReference, thing);
  }
  public void testPerformingGroup() throws IOException {
    final PerformingGroup performingGroup = SchemaOrg.performingGroup()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(performingGroup));
    assertEquals(performingGroup, thing);
  }
  public void testDiet() throws IOException {
    final Diet diet = SchemaOrg.diet()
      .dietFeatures("Test String")
      .expertConsiderations("Test String")
      .overview("Test String")
      .physiologicalBenefits("Test String")
      .proprietaryName("Test String")
      .risks("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(diet));
    assertEquals(diet, thing);
  }
  public void testUserPlusOnes() throws IOException {
    final UserPlusOnes userPlusOnes = SchemaOrg.userPlusOnes()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userPlusOnes));
    assertEquals(userPlusOnes, thing);
  }
  public void testMedicalContraindication() throws IOException {
    final MedicalContraindication medicalContraindication = SchemaOrg.medicalContraindication()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalContraindication));
    assertEquals(medicalContraindication, thing);
  }
  public void testSynagogue() throws IOException {
    final Synagogue synagogue = SchemaOrg.synagogue()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(synagogue));
    assertEquals(synagogue, thing);
  }
  public void testLandform() throws IOException {
    final Landform landform = SchemaOrg.landform()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(landform));
    assertEquals(landform, thing);
  }
  public void testRestaurant() throws IOException {
    final Restaurant restaurant = SchemaOrg.restaurant()
      .acceptsReservations(true)
      .menu("Test String")
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(restaurant));
    assertEquals(restaurant, thing);
  }
  public void testHighSchool() throws IOException {
    final HighSchool highSchool = SchemaOrg.highSchool()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(highSchool));
    assertEquals(highSchool, thing);
  }
  public void testPerformanceRole() throws IOException {
    final PerformanceRole performanceRole = SchemaOrg.performanceRole()
      .characterName("Test String")
      .startDate(NOW)
      .roleName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(performanceRole));
    assertEquals(performanceRole, thing);
  }
  public void testChildCare() throws IOException {
    final ChildCare childCare = SchemaOrg.childCare()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(childCare));
    assertEquals(childCare, thing);
  }
  public void testSoftwareSourceCode() throws IOException {
    final SoftwareSourceCode softwareSourceCode = SchemaOrg.softwareSourceCode()
      .codeRepository("Test String")
      .runtimePlatform("Test String")
      .codeSampleType("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(softwareSourceCode));
    assertEquals(softwareSourceCode, thing);
  }
  public void testLakeBodyOfWater() throws IOException {
    final LakeBodyOfWater lakeBodyOfWater = SchemaOrg.lakeBodyOfWater()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lakeBodyOfWater));
    assertEquals(lakeBodyOfWater, thing);
  }
  public void testDiagnosticProcedure() throws IOException {
    final DiagnosticProcedure diagnosticProcedure = SchemaOrg.diagnosticProcedure()
      .normalRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(diagnosticProcedure));
    assertEquals(diagnosticProcedure, thing);
  }
  public void testContactPointOption() throws IOException {
    final ContactPointOption contactPointOption = SchemaOrg.contactPointOption()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(contactPointOption));
    assertEquals(contactPointOption, thing);
  }
  public void testPhysicalExam() throws IOException {
    final PhysicalExam physicalExam = SchemaOrg.physicalExam()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(physicalExam));
    assertEquals(physicalExam, thing);
  }
  public void testVeterinaryCare() throws IOException {
    final VeterinaryCare veterinaryCare = SchemaOrg.veterinaryCare()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(veterinaryCare));
    assertEquals(veterinaryCare, thing);
  }
  public void testRadioStation() throws IOException {
    final RadioStation radioStation = SchemaOrg.radioStation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioStation));
    assertEquals(radioStation, thing);
  }
  public void testDistance() throws IOException {
    final Distance distance = SchemaOrg.distance()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(distance));
    assertEquals(distance, thing);
  }
  public void testReservationPackage() throws IOException {
    final ReservationPackage reservationPackage = SchemaOrg.reservationPackage()
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reservationPackage));
    assertEquals(reservationPackage, thing);
  }
  public void testNightClub() throws IOException {
    final NightClub nightClub = SchemaOrg.nightClub()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(nightClub));
    assertEquals(nightClub, thing);
  }
  public void testVolcano() throws IOException {
    final Volcano volcano = SchemaOrg.volcano()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(volcano));
    assertEquals(volcano, thing);
  }
  public void testAgreeAction() throws IOException {
    final AgreeAction agreeAction = SchemaOrg.agreeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(agreeAction));
    assertEquals(agreeAction, thing);
  }
  public void testOrderItem() throws IOException {
    final OrderItem orderItem = SchemaOrg.orderItem()
      .orderQuantity(42)
      .orderItemNumber("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(orderItem));
    assertEquals(orderItem, thing);
  }
  public void testCreativeWorkSeason() throws IOException {
    final CreativeWorkSeason creativeWorkSeason = SchemaOrg.creativeWorkSeason()
      .endDate(NOW)
      .numberOfEpisodes(42)
      .seasonNumber(42)
      .startDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(creativeWorkSeason));
    assertEquals(creativeWorkSeason, thing);
  }
  public void testContactPage() throws IOException {
    final ContactPage contactPage = SchemaOrg.contactPage()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(contactPage));
    assertEquals(contactPage, thing);
  }
  public void testDataDownload() throws IOException {
    final DataDownload dataDownload = SchemaOrg.dataDownload()
      .bitrate("Test String")
      .contentSize("Test String")
      .contentUrl("Test String")
      .embedUrl("Test String")
      .encodingFormat("Test String")
      .expires(NOW)
      .playerType("Test String")
      .requiresSubscription(true)
      .uploadDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dataDownload));
    assertEquals(dataDownload, thing);
  }
  public void testBusinessAudience() throws IOException {
    final BusinessAudience businessAudience = SchemaOrg.businessAudience()
      .audienceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(businessAudience));
    assertEquals(businessAudience, thing);
  }
  public void testCheckAction() throws IOException {
    final CheckAction checkAction = SchemaOrg.checkAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(checkAction));
    assertEquals(checkAction, thing);
  }
  public void testBuddhistTemple() throws IOException {
    final BuddhistTemple buddhistTemple = SchemaOrg.buddhistTemple()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(buddhistTemple));
    assertEquals(buddhistTemple, thing);
  }
  public void testMedicalStudy() throws IOException {
    final MedicalStudy medicalStudy = SchemaOrg.medicalStudy()
      .outcome("Test String")
      .population("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalStudy));
    assertEquals(medicalStudy, thing);
  }
  public void testElectronicsStore() throws IOException {
    final ElectronicsStore electronicsStore = SchemaOrg.electronicsStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(electronicsStore));
    assertEquals(electronicsStore, thing);
  }
  public void testOffer() throws IOException {
    final Offer offer = SchemaOrg.offer()
      .availabilityEnds(NOW)
      .availabilityStarts(NOW)
      .gtin12("Test String")
      .gtin13("Test String")
      .gtin14("Test String")
      .gtin8("Test String")
      .mpn("Test String")
      .price(42)
      .priceValidUntil(NOW)
      .sku("Test String")
      .validFrom(NOW)
      .validThrough(NOW)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(offer));
    assertEquals(offer, thing);
  }
  public void testMedicalSpecialty() throws IOException {
    final MedicalSpecialty medicalSpecialty = SchemaOrg.medicalSpecialty()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalSpecialty));
    assertEquals(medicalSpecialty, thing);
  }
  public void testScheduleAction() throws IOException {
    final ScheduleAction scheduleAction = SchemaOrg.scheduleAction()
      .scheduledTime(NOW)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(scheduleAction));
    assertEquals(scheduleAction, thing);
  }
  public void testPaintAction() throws IOException {
    final PaintAction paintAction = SchemaOrg.paintAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(paintAction));
    assertEquals(paintAction, thing);
  }
  public void testVehicle() throws IOException {
    final Vehicle vehicle = SchemaOrg.vehicle()
      .numberOfAirbags(42)
      .vin("Test String")
      .vehicleConfiguration("Test String")
      .knownVehicleDamages("Test String")
      .dateVehicleFirstRegistered(NOW)
      .vehicleInteriorColor("Test String")
      .vehicleInteriorType("Test String")
      .vehicleModelDate(NOW)
      .productionDate(NOW)
      .purchaseDate(NOW)
      .award("Test String")
      .color("Test String")
      .gtin12("Test String")
      .gtin13("Test String")
      .gtin14("Test String")
      .gtin8("Test String")
      .mpn("Test String")
      .productID("Test String")
      .releaseDate(NOW)
      .sku("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(vehicle));
    assertEquals(vehicle, thing);
  }
  public void testSportsTeam() throws IOException {
    final SportsTeam sportsTeam = SchemaOrg.sportsTeam()
      .sport("Test String")
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportsTeam));
    assertEquals(sportsTeam, thing);
  }
  public void testDrugPrescriptionStatus() throws IOException {
    final DrugPrescriptionStatus drugPrescriptionStatus = SchemaOrg.drugPrescriptionStatus()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drugPrescriptionStatus));
    assertEquals(drugPrescriptionStatus, thing);
  }
  public void testWriteAction() throws IOException {
    final WriteAction writeAction = SchemaOrg.writeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(writeAction));
    assertEquals(writeAction, thing);
  }
  public void testCivicStructure() throws IOException {
    final CivicStructure civicStructure = SchemaOrg.civicStructure()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(civicStructure));
    assertEquals(civicStructure, thing);
  }
  public void testUserInteraction() throws IOException {
    final UserInteraction userInteraction = SchemaOrg.userInteraction()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userInteraction));
    assertEquals(userInteraction, thing);
  }
  public void testShoeStore() throws IOException {
    final ShoeStore shoeStore = SchemaOrg.shoeStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(shoeStore));
    assertEquals(shoeStore, thing);
  }
  public void testUseAction() throws IOException {
    final UseAction useAction = SchemaOrg.useAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(useAction));
    assertEquals(useAction, thing);
  }
  public void testAutoRepair() throws IOException {
    final AutoRepair autoRepair = SchemaOrg.autoRepair()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoRepair));
    assertEquals(autoRepair, thing);
  }
  public void testAnswer() throws IOException {
    final Answer answer = SchemaOrg.answer()
      .upvoteCount(42)
      .downvoteCount(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(answer));
    assertEquals(answer, thing);
  }
  public void testDaySpa() throws IOException {
    final DaySpa daySpa = SchemaOrg.daySpa()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(daySpa));
    assertEquals(daySpa, thing);
  }
  public void testDrug() throws IOException {
    final Drug drug = SchemaOrg.drug()
      .activeIngredient("Test String")
      .administrationRoute("Test String")
      .alcoholWarning("Test String")
      .breastfeedingWarning("Test String")
      .clinicalPharmacology("Test String")
      .dosageForm("Test String")
      .foodWarning("Test String")
      .isAvailableGenerically(true)
      .isProprietary(true)
      .labelDetails("Test String")
      .mechanismOfAction("Test String")
      .nonProprietaryName("Test String")
      .overdosage("Test String")
      .pregnancyWarning("Test String")
      .prescribingInfo("Test String")
      .warning("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drug));
    assertEquals(drug, thing);
  }
  public void testReplaceAction() throws IOException {
    final ReplaceAction replaceAction = SchemaOrg.replaceAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(replaceAction));
    assertEquals(replaceAction, thing);
  }
  public void testWinery() throws IOException {
    final Winery winery = SchemaOrg.winery()
      .acceptsReservations(true)
      .menu("Test String")
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(winery));
    assertEquals(winery, thing);
  }
  public void testPsychologicalTreatment() throws IOException {
    final PsychologicalTreatment psychologicalTreatment = SchemaOrg.psychologicalTreatment()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(psychologicalTreatment));
    assertEquals(psychologicalTreatment, thing);
  }
  public void testToyStore() throws IOException {
    final ToyStore toyStore = SchemaOrg.toyStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(toyStore));
    assertEquals(toyStore, thing);
  }
  public void testPawnShop() throws IOException {
    final PawnShop pawnShop = SchemaOrg.pawnShop()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(pawnShop));
    assertEquals(pawnShop, thing);
  }
  public void testTrainStation() throws IOException {
    final TrainStation trainStation = SchemaOrg.trainStation()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(trainStation));
    assertEquals(trainStation, thing);
  }
  public void testEngineSpecification() throws IOException {
    final EngineSpecification engineSpecification = SchemaOrg.engineSpecification()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(engineSpecification));
    assertEquals(engineSpecification, thing);
  }
  public void testWPHeader() throws IOException {
    final WPHeader wPHeader = SchemaOrg.wPHeader()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wPHeader));
    assertEquals(wPHeader, thing);
  }
  public void testFinancialService() throws IOException {
    final FinancialService financialService = SchemaOrg.financialService()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(financialService));
    assertEquals(financialService, thing);
  }
  public void testMotorcycleRepair() throws IOException {
    final MotorcycleRepair motorcycleRepair = SchemaOrg.motorcycleRepair()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(motorcycleRepair));
    assertEquals(motorcycleRepair, thing);
  }
  public void testVideoObject() throws IOException {
    final VideoObject videoObject = SchemaOrg.videoObject()
      .caption("Test String")
      .transcript("Test String")
      .videoFrameSize("Test String")
      .videoQuality("Test String")
      .bitrate("Test String")
      .contentSize("Test String")
      .contentUrl("Test String")
      .embedUrl("Test String")
      .encodingFormat("Test String")
      .expires(NOW)
      .playerType("Test String")
      .requiresSubscription(true)
      .uploadDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(videoObject));
    assertEquals(videoObject, thing);
  }
  public void testGovernmentOffice() throws IOException {
    final GovernmentOffice governmentOffice = SchemaOrg.governmentOffice()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(governmentOffice));
    assertEquals(governmentOffice, thing);
  }
  public void testDefenceEstablishment() throws IOException {
    final DefenceEstablishment defenceEstablishment = SchemaOrg.defenceEstablishment()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(defenceEstablishment));
    assertEquals(defenceEstablishment, thing);
  }
  public void testMoveAction() throws IOException {
    final MoveAction moveAction = SchemaOrg.moveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(moveAction));
    assertEquals(moveAction, thing);
  }
  public void testDrugCostCategory() throws IOException {
    final DrugCostCategory drugCostCategory = SchemaOrg.drugCostCategory()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drugCostCategory));
    assertEquals(drugCostCategory, thing);
  }
  public void testPayAction() throws IOException {
    final PayAction payAction = SchemaOrg.payAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(payAction));
    assertEquals(payAction, thing);
  }
  public void testJewelryStore() throws IOException {
    final JewelryStore jewelryStore = SchemaOrg.jewelryStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(jewelryStore));
    assertEquals(jewelryStore, thing);
  }
  public void testTechArticle() throws IOException {
    final TechArticle techArticle = SchemaOrg.techArticle()
      .dependencies("Test String")
      .proficiencyLevel("Test String")
      .articleBody("Test String")
      .articleSection("Test String")
      .wordCount(42)
      .pageEnd(42)
      .pageStart(42)
      .pagination("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(techArticle));
    assertEquals(techArticle, thing);
  }
  public void testReactAction() throws IOException {
    final ReactAction reactAction = SchemaOrg.reactAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reactAction));
    assertEquals(reactAction, thing);
  }
  public void testDownloadAction() throws IOException {
    final DownloadAction downloadAction = SchemaOrg.downloadAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(downloadAction));
    assertEquals(downloadAction, thing);
  }
  public void testInfectiousDisease() throws IOException {
    final InfectiousDisease infectiousDisease = SchemaOrg.infectiousDisease()
      .infectiousAgent("Test String")
      .transmissionMethod("Test String")
      .epidemiology("Test String")
      .expectedPrognosis("Test String")
      .naturalProgression("Test String")
      .pathophysiology("Test String")
      .possibleComplication("Test String")
      .subtype("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(infectiousDisease));
    assertEquals(infectiousDisease, thing);
  }
  public void testCreativeWork() throws IOException {
    final CreativeWork creativeWork = SchemaOrg.creativeWork()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(creativeWork));
    assertEquals(creativeWork, thing);
  }
  public void testInfectiousAgentClass() throws IOException {
    final InfectiousAgentClass infectiousAgentClass = SchemaOrg.infectiousAgentClass()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(infectiousAgentClass));
    assertEquals(infectiousAgentClass, thing);
  }
  public void testBroadcastEvent() throws IOException {
    final BroadcastEvent broadcastEvent = SchemaOrg.broadcastEvent()
      .isLiveBroadcast(true)
      .isAccessibleForFree(true)
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(broadcastEvent));
    assertEquals(broadcastEvent, thing);
  }
  public void testReviewAction() throws IOException {
    final ReviewAction reviewAction = SchemaOrg.reviewAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reviewAction));
    assertEquals(reviewAction, thing);
  }
  public void testLeaveAction() throws IOException {
    final LeaveAction leaveAction = SchemaOrg.leaveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(leaveAction));
    assertEquals(leaveAction, thing);
  }
  public void testLockerDelivery() throws IOException {
    final LockerDelivery lockerDelivery = SchemaOrg.lockerDelivery()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lockerDelivery));
    assertEquals(lockerDelivery, thing);
  }
  public void testMediaObject() throws IOException {
    final MediaObject mediaObject = SchemaOrg.mediaObject()
      .bitrate("Test String")
      .contentSize("Test String")
      .contentUrl("Test String")
      .embedUrl("Test String")
      .encodingFormat("Test String")
      .expires(NOW)
      .playerType("Test String")
      .requiresSubscription(true)
      .uploadDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mediaObject));
    assertEquals(mediaObject, thing);
  }
  public void testAudience() throws IOException {
    final Audience audience = SchemaOrg.audience()
      .audienceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(audience));
    assertEquals(audience, thing);
  }
  public void testSearchResultsPage() throws IOException {
    final SearchResultsPage searchResultsPage = SchemaOrg.searchResultsPage()
      .lastReviewed(NOW)
      .relatedLink("Test String")
      .significantLink("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(searchResultsPage));
    assertEquals(searchResultsPage, thing);
  }
  public void testMovieTheater() throws IOException {
    final MovieTheater movieTheater = SchemaOrg.movieTheater()
      .screenCount(42)
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movieTheater));
    assertEquals(movieTheater, thing);
  }
  public void testPlace() throws IOException {
    final Place place = SchemaOrg.place()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(place));
    assertEquals(place, thing);
  }
  public void testTaxiReservation() throws IOException {
    final TaxiReservation taxiReservation = SchemaOrg.taxiReservation()
      .partySize(42)
      .pickupTime(NOW)
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(taxiReservation));
    assertEquals(taxiReservation, thing);
  }
  public void testAssignAction() throws IOException {
    final AssignAction assignAction = SchemaOrg.assignAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(assignAction));
    assertEquals(assignAction, thing);
  }
  public void testTouristInformationCenter() throws IOException {
    final TouristInformationCenter touristInformationCenter = SchemaOrg.touristInformationCenter()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(touristInformationCenter));
    assertEquals(touristInformationCenter, thing);
  }
  public void testFoodEstablishment() throws IOException {
    final FoodEstablishment foodEstablishment = SchemaOrg.foodEstablishment()
      .acceptsReservations(true)
      .menu("Test String")
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(foodEstablishment));
    assertEquals(foodEstablishment, thing);
  }
  public void testTrackAction() throws IOException {
    final TrackAction trackAction = SchemaOrg.trackAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(trackAction));
    assertEquals(trackAction, thing);
  }
  public void testNutritionInformation() throws IOException {
    final NutritionInformation nutritionInformation = SchemaOrg.nutritionInformation()
      .servingSize("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(nutritionInformation));
    assertEquals(nutritionInformation, thing);
  }
  public void testMotel() throws IOException {
    final Motel motel = SchemaOrg.motel()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(motel));
    assertEquals(motel, thing);
  }
  public void testTicket() throws IOException {
    final Ticket ticket = SchemaOrg.ticket()
      .totalPrice(42)
      .priceCurrency("Test String")
      .dateIssued(NOW)
      .ticketNumber("Test String")
      .ticketToken("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(ticket));
    assertEquals(ticket, thing);
  }
  public void testTVClip() throws IOException {
    final TVClip tVClip = SchemaOrg.tVClip()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tVClip));
    assertEquals(tVClip, thing);
  }
  public void testReadAction() throws IOException {
    final ReadAction readAction = SchemaOrg.readAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(readAction));
    assertEquals(readAction, thing);
  }
  public void testDiagnosticLab() throws IOException {
    final DiagnosticLab diagnosticLab = SchemaOrg.diagnosticLab()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(diagnosticLab));
    assertEquals(diagnosticLab, thing);
  }
  public void testListenAction() throws IOException {
    final ListenAction listenAction = SchemaOrg.listenAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(listenAction));
    assertEquals(listenAction, thing);
  }
  public void testPreschool() throws IOException {
    final Preschool preschool = SchemaOrg.preschool()
      .award("Test String")
      .duns("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .taxID("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(preschool));
    assertEquals(preschool, thing);
  }
  public void testLocalBusiness() throws IOException {
    final LocalBusiness localBusiness = SchemaOrg.localBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(localBusiness));
    assertEquals(localBusiness, thing);
  }
  public void testRadiationTherapy() throws IOException {
    final RadiationTherapy radiationTherapy = SchemaOrg.radiationTherapy()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radiationTherapy));
    assertEquals(radiationTherapy, thing);
  }
  public void testVideoGameSeries() throws IOException {
    final VideoGameSeries videoGameSeries = SchemaOrg.videoGameSeries()
      .numberOfEpisodes(42)
      .numberOfSeasons(42)
      .gamePlatform("Test String")
      .endDate(NOW)
      .startDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(videoGameSeries));
    assertEquals(videoGameSeries, thing);
  }
  public void testMedicalRiskEstimator() throws IOException {
    final MedicalRiskEstimator medicalRiskEstimator = SchemaOrg.medicalRiskEstimator()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalRiskEstimator));
    assertEquals(medicalRiskEstimator, thing);
  }
  public void testGovernmentService() throws IOException {
    final GovernmentService governmentService = SchemaOrg.governmentService()
      .serviceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(governmentService));
    assertEquals(governmentService, thing);
  }
  public void testOrganizationRole() throws IOException {
    final OrganizationRole organizationRole = SchemaOrg.organizationRole()
      .numberedPosition(42)
      .startDate(NOW)
      .roleName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(organizationRole));
    assertEquals(organizationRole, thing);
  }
  public void testProduct() throws IOException {
    final Product product = SchemaOrg.product()
      .award("Test String")
      .color("Test String")
      .gtin12("Test String")
      .gtin13("Test String")
      .gtin14("Test String")
      .gtin8("Test String")
      .mpn("Test String")
      .productID("Test String")
      .releaseDate(NOW)
      .sku("Test String")
      .productionDate(NOW)
      .purchaseDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(product));
    assertEquals(product, thing);
  }
  public void testFlorist() throws IOException {
    final Florist florist = SchemaOrg.florist()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(florist));
    assertEquals(florist, thing);
  }
  public void testProductModel() throws IOException {
    final ProductModel productModel = SchemaOrg.productModel()
      .award("Test String")
      .color("Test String")
      .gtin12("Test String")
      .gtin13("Test String")
      .gtin14("Test String")
      .gtin8("Test String")
      .mpn("Test String")
      .productID("Test String")
      .releaseDate(NOW)
      .sku("Test String")
      .productionDate(NOW)
      .purchaseDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(productModel));
    assertEquals(productModel, thing);
  }
  public void testHealthClub() throws IOException {
    final HealthClub healthClub = SchemaOrg.healthClub()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(healthClub));
    assertEquals(healthClub, thing);
  }
  public void testBroadcastService() throws IOException {
    final BroadcastService broadcastService = SchemaOrg.broadcastService()
      .broadcastDisplayName("Test String")
      .timezone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(broadcastService));
    assertEquals(broadcastService, thing);
  }
  public void testMedicalTherapy() throws IOException {
    final MedicalTherapy medicalTherapy = SchemaOrg.medicalTherapy()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalTherapy));
    assertEquals(medicalTherapy, thing);
  }
  public void testDatedMoneySpecification() throws IOException {
    final DatedMoneySpecification datedMoneySpecification = SchemaOrg.datedMoneySpecification()
      .amount(42)
      .currency("Test String")
      .startDate(NOW)
      .endDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(datedMoneySpecification));
    assertEquals(datedMoneySpecification, thing);
  }
  public void testDeactivateAction() throws IOException {
    final DeactivateAction deactivateAction = SchemaOrg.deactivateAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(deactivateAction));
    assertEquals(deactivateAction, thing);
  }
  public void testMarryAction() throws IOException {
    final MarryAction marryAction = SchemaOrg.marryAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(marryAction));
    assertEquals(marryAction, thing);
  }
  public void testDrugCost() throws IOException {
    final DrugCost drugCost = SchemaOrg.drugCost()
      .costCurrency("Test String")
      .costOrigin("Test String")
      .costPerUnit(42)
      .drugUnit("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drugCost));
    assertEquals(drugCost, thing);
  }
  public void testLigament() throws IOException {
    final Ligament ligament = SchemaOrg.ligament()
      .associatedPathophysiology("Test String")
      .bodyLocation("Test String")
      .function("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(ligament));
    assertEquals(ligament, thing);
  }
  public void testLodgingBusiness() throws IOException {
    final LodgingBusiness lodgingBusiness = SchemaOrg.lodgingBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lodgingBusiness));
    assertEquals(lodgingBusiness, thing);
  }
  public void testMusicAlbumProductionType() throws IOException {
    final MusicAlbumProductionType musicAlbumProductionType = SchemaOrg.musicAlbumProductionType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicAlbumProductionType));
    assertEquals(musicAlbumProductionType, thing);
  }
  public void testDiscoverAction() throws IOException {
    final DiscoverAction discoverAction = SchemaOrg.discoverAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(discoverAction));
    assertEquals(discoverAction, thing);
  }
  public void testSportsEvent() throws IOException {
    final SportsEvent sportsEvent = SchemaOrg.sportsEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportsEvent));
    assertEquals(sportsEvent, thing);
  }
  public void testCourthouse() throws IOException {
    final Courthouse courthouse = SchemaOrg.courthouse()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(courthouse));
    assertEquals(courthouse, thing);
  }
  public void testRecipe() throws IOException {
    final Recipe recipe = SchemaOrg.recipe()
      .cookingMethod("Test String")
      .recipeIngredient("Test String")
      .recipeCategory("Test String")
      .recipeCuisine("Test String")
      .recipeYield("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(recipe));
    assertEquals(recipe, thing);
  }
  public void testServiceChannel() throws IOException {
    final ServiceChannel serviceChannel = SchemaOrg.serviceChannel()
      .serviceUrl("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(serviceChannel));
    assertEquals(serviceChannel, thing);
  }
  public void testLegislativeBuilding() throws IOException {
    final LegislativeBuilding legislativeBuilding = SchemaOrg.legislativeBuilding()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(legislativeBuilding));
    assertEquals(legislativeBuilding, thing);
  }
  public void testSuperficialAnatomy() throws IOException {
    final SuperficialAnatomy superficialAnatomy = SchemaOrg.superficialAnatomy()
      .associatedPathophysiology("Test String")
      .significance("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(superficialAnatomy));
    assertEquals(superficialAnatomy, thing);
  }
  public void testGamePlayMode() throws IOException {
    final GamePlayMode gamePlayMode = SchemaOrg.gamePlayMode()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(gamePlayMode));
    assertEquals(gamePlayMode, thing);
  }
  public void testRating() throws IOException {
    final Rating rating = SchemaOrg.rating()
      .bestRating(42)
      .ratingValue("Test String")
      .worstRating(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rating));
    assertEquals(rating, thing);
  }
  public void testMovingCompany() throws IOException {
    final MovingCompany movingCompany = SchemaOrg.movingCompany()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movingCompany));
    assertEquals(movingCompany, thing);
  }
  public void testMedicalGuideline() throws IOException {
    final MedicalGuideline medicalGuideline = SchemaOrg.medicalGuideline()
      .evidenceOrigin("Test String")
      .guidelineDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalGuideline));
    assertEquals(medicalGuideline, thing);
  }
  public void testMedicalSymptom() throws IOException {
    final MedicalSymptom medicalSymptom = SchemaOrg.medicalSymptom()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalSymptom));
    assertEquals(medicalSymptom, thing);
  }
  public void testPetStore() throws IOException {
    final PetStore petStore = SchemaOrg.petStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(petStore));
    assertEquals(petStore, thing);
  }
  public void testHomeAndConstructionBusiness() throws IOException {
    final HomeAndConstructionBusiness homeAndConstructionBusiness = SchemaOrg.homeAndConstructionBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(homeAndConstructionBusiness));
    assertEquals(homeAndConstructionBusiness, thing);
  }
  public void testReplyAction() throws IOException {
    final ReplyAction replyAction = SchemaOrg.replyAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(replyAction));
    assertEquals(replyAction, thing);
  }
  public void testQuantitativeValue() throws IOException {
    final QuantitativeValue quantitativeValue = SchemaOrg.quantitativeValue()
      .maxValue(42)
      .minValue(42)
      .unitCode("Test String")
      .value(42)
      .unitText("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(quantitativeValue));
    assertEquals(quantitativeValue, thing);
  }
  public void testMedicalImagingTechnique() throws IOException {
    final MedicalImagingTechnique medicalImagingTechnique = SchemaOrg.medicalImagingTechnique()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalImagingTechnique));
    assertEquals(medicalImagingTechnique, thing);
  }
  public void testPerformAction() throws IOException {
    final PerformAction performAction = SchemaOrg.performAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(performAction));
    assertEquals(performAction, thing);
  }
  public void testTheaterEvent() throws IOException {
    final TheaterEvent theaterEvent = SchemaOrg.theaterEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(theaterEvent));
    assertEquals(theaterEvent, thing);
  }
  public void testCanal() throws IOException {
    final Canal canal = SchemaOrg.canal()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(canal));
    assertEquals(canal, thing);
  }
  public void testMedicalEnumeration() throws IOException {
    final MedicalEnumeration medicalEnumeration = SchemaOrg.medicalEnumeration()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalEnumeration));
    assertEquals(medicalEnumeration, thing);
  }
  public void testEnergy() throws IOException {
    final Energy energy = SchemaOrg.energy()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(energy));
    assertEquals(energy, thing);
  }
  public void testBlog() throws IOException {
    final Blog blog = SchemaOrg.blog()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(blog));
    assertEquals(blog, thing);
  }
  public void testSculpture() throws IOException {
    final Sculpture sculpture = SchemaOrg.sculpture()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sculpture));
    assertEquals(sculpture, thing);
  }
  public void testBusinessEntityType() throws IOException {
    final BusinessEntityType businessEntityType = SchemaOrg.businessEntityType()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(businessEntityType));
    assertEquals(businessEntityType, thing);
  }
  public void testEventVenue() throws IOException {
    final EventVenue eventVenue = SchemaOrg.eventVenue()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(eventVenue));
    assertEquals(eventVenue, thing);
  }
  public void testArriveAction() throws IOException {
    final ArriveAction arriveAction = SchemaOrg.arriveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(arriveAction));
    assertEquals(arriveAction, thing);
  }
  public void testMedicalCondition() throws IOException {
    final MedicalCondition medicalCondition = SchemaOrg.medicalCondition()
      .epidemiology("Test String")
      .expectedPrognosis("Test String")
      .naturalProgression("Test String")
      .pathophysiology("Test String")
      .possibleComplication("Test String")
      .subtype("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalCondition));
    assertEquals(medicalCondition, thing);
  }
  public void testSubwayStation() throws IOException {
    final SubwayStation subwayStation = SchemaOrg.subwayStation()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(subwayStation));
    assertEquals(subwayStation, thing);
  }
  public void testMedicalGuidelineRecommendation() throws IOException {
    final MedicalGuidelineRecommendation medicalGuidelineRecommendation = SchemaOrg.medicalGuidelineRecommendation()
      .recommendationStrength("Test String")
      .evidenceOrigin("Test String")
      .guidelineDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalGuidelineRecommendation));
    assertEquals(medicalGuidelineRecommendation, thing);
  }
  public void testRiverBodyOfWater() throws IOException {
    final RiverBodyOfWater riverBodyOfWater = SchemaOrg.riverBodyOfWater()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(riverBodyOfWater));
    assertEquals(riverBodyOfWater, thing);
  }
  public void testQuestion() throws IOException {
    final Question question = SchemaOrg.question()
      .upvoteCount(42)
      .downvoteCount(42)
      .answerCount(42)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(question));
    assertEquals(question, thing);
  }
  public void testPhysicalActivityCategory() throws IOException {
    final PhysicalActivityCategory physicalActivityCategory = SchemaOrg.physicalActivityCategory()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(physicalActivityCategory));
    assertEquals(physicalActivityCategory, thing);
  }
  public void testRsvpAction() throws IOException {
    final RsvpAction rsvpAction = SchemaOrg.rsvpAction()
      .additionalNumberOfGuests(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rsvpAction));
    assertEquals(rsvpAction, thing);
  }
  public void testEducationalAudience() throws IOException {
    final EducationalAudience educationalAudience = SchemaOrg.educationalAudience()
      .educationalRole("Test String")
      .audienceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(educationalAudience));
    assertEquals(educationalAudience, thing);
  }
  public void testAutoDealer() throws IOException {
    final AutoDealer autoDealer = SchemaOrg.autoDealer()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoDealer));
    assertEquals(autoDealer, thing);
  }
  public void testMedicalScholarlyArticle() throws IOException {
    final MedicalScholarlyArticle medicalScholarlyArticle = SchemaOrg.medicalScholarlyArticle()
      .publicationType("Test String")
      .articleBody("Test String")
      .articleSection("Test String")
      .wordCount(42)
      .pageEnd(42)
      .pageStart(42)
      .pagination("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalScholarlyArticle));
    assertEquals(medicalScholarlyArticle, thing);
  }
  public void testTable() throws IOException {
    final Table table = SchemaOrg.table()
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(table));
    assertEquals(table, thing);
  }
  public void testInteractAction() throws IOException {
    final InteractAction interactAction = SchemaOrg.interactAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(interactAction));
    assertEquals(interactAction, thing);
  }
  public void testTireShop() throws IOException {
    final TireShop tireShop = SchemaOrg.tireShop()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tireShop));
    assertEquals(tireShop, thing);
  }
  public void testCityHall() throws IOException {
    final CityHall cityHall = SchemaOrg.cityHall()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cityHall));
    assertEquals(cityHall, thing);
  }
  public void testMovieSeries() throws IOException {
    final MovieSeries movieSeries = SchemaOrg.movieSeries()
      .endDate(NOW)
      .startDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movieSeries));
    assertEquals(movieSeries, thing);
  }
  public void testAccountingService() throws IOException {
    final AccountingService accountingService = SchemaOrg.accountingService()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(accountingService));
    assertEquals(accountingService, thing);
  }
  public void testDietarySupplement() throws IOException {
    final DietarySupplement dietarySupplement = SchemaOrg.dietarySupplement()
      .activeIngredient("Test String")
      .background("Test String")
      .dosageForm("Test String")
      .isProprietary(true)
      .mechanismOfAction("Test String")
      .nonProprietaryName("Test String")
      .safetyConsideration("Test String")
      .targetPopulation("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dietarySupplement));
    assertEquals(dietarySupplement, thing);
  }
  public void testDeliveryChargeSpecification() throws IOException {
    final DeliveryChargeSpecification deliveryChargeSpecification = SchemaOrg.deliveryChargeSpecification()
      .maxPrice(42)
      .minPrice(42)
      .price(42)
      .validFrom(NOW)
      .validThrough(NOW)
      .valueAddedTaxIncluded(true)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(deliveryChargeSpecification));
    assertEquals(deliveryChargeSpecification, thing);
  }
  public void testSaleEvent() throws IOException {
    final SaleEvent saleEvent = SchemaOrg.saleEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(saleEvent));
    assertEquals(saleEvent, thing);
  }
  public void testMedicalRiskFactor() throws IOException {
    final MedicalRiskFactor medicalRiskFactor = SchemaOrg.medicalRiskFactor()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalRiskFactor));
    assertEquals(medicalRiskFactor, thing);
  }
  public void testReceiveAction() throws IOException {
    final ReceiveAction receiveAction = SchemaOrg.receiveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(receiveAction));
    assertEquals(receiveAction, thing);
  }
  public void testPlanAction() throws IOException {
    final PlanAction planAction = SchemaOrg.planAction()
      .scheduledTime(NOW)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(planAction));
    assertEquals(planAction, thing);
  }
  public void testChurch() throws IOException {
    final Church church = SchemaOrg.church()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(church));
    assertEquals(church, thing);
  }
  public void testMusicStore() throws IOException {
    final MusicStore musicStore = SchemaOrg.musicStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicStore));
    assertEquals(musicStore, thing);
  }
  public void testAchieveAction() throws IOException {
    final AchieveAction achieveAction = SchemaOrg.achieveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(achieveAction));
    assertEquals(achieveAction, thing);
  }
  public void testComedyClub() throws IOException {
    final ComedyClub comedyClub = SchemaOrg.comedyClub()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(comedyClub));
    assertEquals(comedyClub, thing);
  }
  public void testOptician() throws IOException {
    final Optician optician = SchemaOrg.optician()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(optician));
    assertEquals(optician, thing);
  }
  public void testMusicComposition() throws IOException {
    final MusicComposition musicComposition = SchemaOrg.musicComposition()
      .iswcCode("Test String")
      .musicCompositionForm("Test String")
      .musicalKey("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicComposition));
    assertEquals(musicComposition, thing);
  }
  public void testGiveAction() throws IOException {
    final GiveAction giveAction = SchemaOrg.giveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(giveAction));
    assertEquals(giveAction, thing);
  }
  public void testPlayground() throws IOException {
    final Playground playground = SchemaOrg.playground()
      .openingHours("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(playground));
    assertEquals(playground, thing);
  }
  public void testExercisePlan() throws IOException {
    final ExercisePlan exercisePlan = SchemaOrg.exercisePlan()
      .activityFrequency("Test String")
      .additionalVariable("Test String")
      .exerciseType("Test String")
      .intensity("Test String")
      .repetitions(42)
      .restPeriods("Test String")
      .epidemiology("Test String")
      .pathophysiology("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(exercisePlan));
    assertEquals(exercisePlan, thing);
  }
  public void testParcelDelivery() throws IOException {
    final ParcelDelivery parcelDelivery = SchemaOrg.parcelDelivery()
      .expectedArrivalFrom(NOW)
      .expectedArrivalUntil(NOW)
      .trackingNumber("Test String")
      .trackingUrl("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(parcelDelivery));
    assertEquals(parcelDelivery, thing);
  }
  public void testMedicalConditionStage() throws IOException {
    final MedicalConditionStage medicalConditionStage = SchemaOrg.medicalConditionStage()
      .stageAsNumber(42)
      .subStageSuffix("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalConditionStage));
    assertEquals(medicalConditionStage, thing);
  }
  public void testOfferItemCondition() throws IOException {
    final OfferItemCondition offerItemCondition = SchemaOrg.offerItemCondition()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(offerItemCondition));
    assertEquals(offerItemCondition, thing);
  }
  public void testTransferAction() throws IOException {
    final TransferAction transferAction = SchemaOrg.transferAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(transferAction));
    assertEquals(transferAction, thing);
  }
  public void testComedyEvent() throws IOException {
    final ComedyEvent comedyEvent = SchemaOrg.comedyEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(comedyEvent));
    assertEquals(comedyEvent, thing);
  }
  public void testHVACBusiness() throws IOException {
    final HVACBusiness hVACBusiness = SchemaOrg.hVACBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hVACBusiness));
    assertEquals(hVACBusiness, thing);
  }
  public void testCity() throws IOException {
    final City city = SchemaOrg.city()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(city));
    assertEquals(city, thing);
  }
  public void testSingleFamilyResidence() throws IOException {
    final SingleFamilyResidence singleFamilyResidence = SchemaOrg.singleFamilyResidence()
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(singleFamilyResidence));
    assertEquals(singleFamilyResidence, thing);
  }
  public void testMedicalDevicePurpose() throws IOException {
    final MedicalDevicePurpose medicalDevicePurpose = SchemaOrg.medicalDevicePurpose()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalDevicePurpose));
    assertEquals(medicalDevicePurpose, thing);
  }
  public void testReview() throws IOException {
    final Review review = SchemaOrg.review()
      .reviewBody("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(review));
    assertEquals(review, thing);
  }
  public void testMotorcycleDealer() throws IOException {
    final MotorcycleDealer motorcycleDealer = SchemaOrg.motorcycleDealer()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .faxNumber("Test String")
      .globalLocationNumber("Test String")
      .isicV4("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(motorcycleDealer));
    assertEquals(motorcycleDealer, thing);
  }
  public void testVideoGame() throws IOException {
    final VideoGame videoGame = SchemaOrg.videoGame()
      .gamePlatform("Test String")
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(videoGame));
    assertEquals(videoGame, thing);
  }
  public void testWarrantyPromise() throws IOException {
    final WarrantyPromise warrantyPromise = SchemaOrg.warrantyPromise()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(warrantyPromise));
    assertEquals(warrantyPromise, thing);
  }
  public void testRadioSeries() throws IOException {
    final RadioSeries radioSeries = SchemaOrg.radioSeries()
      .numberOfEpisodes(42)
      .numberOfSeasons(42)
      .endDate(NOW)
      .startDate(NOW)
      .schemaVersion("Test String")
      .accessibilityAPI("Test String")
      .accessibilityControl("Test String")
      .accessibilityFeature("Test String")
      .accessibilityHazard("Test String")
      .alternativeHeadline("Test String")
      .award("Test String")
      .contentRating("Test String")
      .copyrightYear(42)
      .dateCreated(NOW)
      .dateModified(NOW)
      .datePublished(NOW)
      .discussionUrl("Test String")
      .educationalUse("Test String")
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isBasedOnUrl("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioSeries));
    assertEquals(radioSeries, thing);
  }
  public void testCreditCard() throws IOException {
    final CreditCard creditCard = SchemaOrg.creditCard()
      .additionalType("Test String")
      .alternateName("Test String")
      .description("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(creditCard));
    assertEquals(creditCard, thing);
  }
}
