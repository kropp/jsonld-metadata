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

import org.junit.Test;

import java.io.IOException;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class SmokeTest {
  private static final Date NOW = new Date(1234567890000L);
  @Test public void testCollegeOrUniversity() throws IOException {
    final CollegeOrUniversity collegeOrUniversity = SchemaOrg.collegeOrUniversity()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(collegeOrUniversity));
    assertEquals(collegeOrUniversity, thing);
  }
  @Test public void testWriteAction() throws IOException {
    final WriteAction writeAction = SchemaOrg.writeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(writeAction));
    assertEquals(writeAction, thing);
  }
  @Test public void testAllWheelDriveConfiguration() throws IOException {
    final AllWheelDriveConfiguration allWheelDriveConfiguration = SchemaOrg.allWheelDriveConfiguration()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(allWheelDriveConfiguration));
    assertEquals(allWheelDriveConfiguration, thing);
  }
  @Test public void testDentist() throws IOException {
    final Dentist dentist = SchemaOrg.dentist()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dentist));
    assertEquals(dentist, thing);
  }
  @Test public void testBusStop() throws IOException {
    final BusStop busStop = SchemaOrg.busStop()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(busStop));
    assertEquals(busStop, thing);
  }
  @Test public void testCancelAction() throws IOException {
    final CancelAction cancelAction = SchemaOrg.cancelAction()
      .scheduledTime(NOW)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cancelAction));
    assertEquals(cancelAction, thing);
  }
  @Test public void testTextDigitalDocument() throws IOException {
    final TextDigitalDocument textDigitalDocument = SchemaOrg.textDigitalDocument()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(textDigitalDocument));
    assertEquals(textDigitalDocument, thing);
  }
  @Test public void testMenuSection() throws IOException {
    final MenuSection menuSection = SchemaOrg.menuSection()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(menuSection));
    assertEquals(menuSection, thing);
  }
  @Test public void testTransferAction() throws IOException {
    final TransferAction transferAction = SchemaOrg.transferAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(transferAction));
    assertEquals(transferAction, thing);
  }
  @Test public void testComputerStore() throws IOException {
    final ComputerStore computerStore = SchemaOrg.computerStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(computerStore));
    assertEquals(computerStore, thing);
  }
  @Test public void testCampingPitch() throws IOException {
    final CampingPitch campingPitch = SchemaOrg.campingPitch()
      .numberOfRooms(42)
      .permittedUsage("Test String")
      .petsAllowed(true)
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(campingPitch));
    assertEquals(campingPitch, thing);
  }
  @Test public void testTVClip() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tVClip));
    assertEquals(tVClip, thing);
  }
  @Test public void testGardenStore() throws IOException {
    final GardenStore gardenStore = SchemaOrg.gardenStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(gardenStore));
    assertEquals(gardenStore, thing);
  }
  @Test public void testResort() throws IOException {
    final Resort resort = SchemaOrg.resort()
      .checkinTime(NOW)
      .checkoutTime(NOW)
      .petsAllowed(true)
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(resort));
    assertEquals(resort, thing);
  }
  @Test public void testWearAction() throws IOException {
    final WearAction wearAction = SchemaOrg.wearAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wearAction));
    assertEquals(wearAction, thing);
  }
  @Test public void testClaimReview() throws IOException {
    final ClaimReview claimReview = SchemaOrg.claimReview()
      .claimReviewed("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(claimReview));
    assertEquals(claimReview, thing);
  }
  @Test public void testComedyClub() throws IOException {
    final ComedyClub comedyClub = SchemaOrg.comedyClub()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(comedyClub));
    assertEquals(comedyClub, thing);
  }
  @Test public void testCreativeWork() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(creativeWork));
    assertEquals(creativeWork, thing);
  }
  @Test public void testDemand() throws IOException {
    final Demand demand = SchemaOrg.demand()
      .availabilityEnds(NOW)
      .availabilityStarts(NOW)
      .mpn("Test String")
      .validFrom(NOW)
      .validThrough(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(demand));
    assertEquals(demand, thing);
  }
  @Test public void testImageGallery() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(imageGallery));
    assertEquals(imageGallery, thing);
  }
  @Test public void testInsertAction() throws IOException {
    final InsertAction insertAction = SchemaOrg.insertAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(insertAction));
    assertEquals(insertAction, thing);
  }
  @Test public void testVideoGameSeries() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(videoGameSeries));
    assertEquals(videoGameSeries, thing);
  }
  @Test public void testHomeGoodsStore() throws IOException {
    final HomeGoodsStore homeGoodsStore = SchemaOrg.homeGoodsStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(homeGoodsStore));
    assertEquals(homeGoodsStore, thing);
  }
  @Test public void testMosque() throws IOException {
    final Mosque mosque = SchemaOrg.mosque()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mosque));
    assertEquals(mosque, thing);
  }
  @Test public void testOpeningHoursSpecification() throws IOException {
    final OpeningHoursSpecification openingHoursSpecification = SchemaOrg.openingHoursSpecification()
      .closes(NOW)
      .opens(NOW)
      .validFrom(NOW)
      .validThrough(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(openingHoursSpecification));
    assertEquals(openingHoursSpecification, thing);
  }
  @Test public void testChurch() throws IOException {
    final Church church = SchemaOrg.church()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(church));
    assertEquals(church, thing);
  }
  @Test public void testPainting() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(painting));
    assertEquals(painting, thing);
  }
  @Test public void testCar() throws IOException {
    final Car car = SchemaOrg.car()
      .numberOfAirbags(42)
      .vehicleIdentificationNumber("Test String")
      .vehicleConfiguration("Test String")
      .knownVehicleDamages("Test String")
      .dateVehicleFirstRegistered(NOW)
      .vehicleInteriorColor("Test String")
      .vehicleInteriorType("Test String")
      .vehicleModelDate(NOW)
      .productionDate(NOW)
      .purchaseDate(NOW)
      .vehicleSpecialUsage("Test String")
      .award("Test String")
      .category("Test String")
      .color("Test String")
      .mpn("Test String")
      .releaseDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(car));
    assertEquals(car, thing);
  }
  @Test public void testPostOffice() throws IOException {
    final PostOffice postOffice = SchemaOrg.postOffice()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(postOffice));
    assertEquals(postOffice, thing);
  }
  @Test public void testExerciseAction() throws IOException {
    final ExerciseAction exerciseAction = SchemaOrg.exerciseAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(exerciseAction));
    assertEquals(exerciseAction, thing);
  }
  @Test public void testVolcano() throws IOException {
    final Volcano volcano = SchemaOrg.volcano()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(volcano));
    assertEquals(volcano, thing);
  }
  @Test public void testCollectionPage() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(collectionPage));
    assertEquals(collectionPage, thing);
  }
  @Test public void testWebSite() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(webSite));
    assertEquals(webSite, thing);
  }
  @Test public void testCheckAction() throws IOException {
    final CheckAction checkAction = SchemaOrg.checkAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(checkAction));
    assertEquals(checkAction, thing);
  }
  @Test public void testEventReservation() throws IOException {
    final EventReservation eventReservation = SchemaOrg.eventReservation()
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(eventReservation));
    assertEquals(eventReservation, thing);
  }
  @Test public void testGeoCoordinates() throws IOException {
    final GeoCoordinates geoCoordinates = SchemaOrg.geoCoordinates()
      .elevation(42)
      .latitude(42)
      .longitude(42)
      .postalCode("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(geoCoordinates));
    assertEquals(geoCoordinates, thing);
  }
  @Test public void testInsuranceAgency() throws IOException {
    final InsuranceAgency insuranceAgency = SchemaOrg.insuranceAgency()
      .feesAndCommissionsSpecification("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(insuranceAgency));
    assertEquals(insuranceAgency, thing);
  }
  @Test public void testDigitalDocumentPermission() throws IOException {
    final DigitalDocumentPermission digitalDocumentPermission = SchemaOrg.digitalDocumentPermission()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(digitalDocumentPermission));
    assertEquals(digitalDocumentPermission, thing);
  }
  @Test public void testUserDownloads() throws IOException {
    final UserDownloads userDownloads = SchemaOrg.userDownloads()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userDownloads));
    assertEquals(userDownloads, thing);
  }
  @Test public void testContinent() throws IOException {
    final Continent continent = SchemaOrg.continent()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(continent));
    assertEquals(continent, thing);
  }
  @Test public void testPublicationEvent() throws IOException {
    final PublicationEvent publicationEvent = SchemaOrg.publicationEvent()
      .isAccessibleForFree(true)
      .doorTime(NOW)
      .endDate(NOW)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(publicationEvent));
    assertEquals(publicationEvent, thing);
  }
  @Test public void testWPFooter() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wPFooter));
    assertEquals(wPFooter, thing);
  }
  @Test public void testConversation() throws IOException {
    final Conversation conversation = SchemaOrg.conversation()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(conversation));
    assertEquals(conversation, thing);
  }
  @Test public void testComputerLanguage() throws IOException {
    final ComputerLanguage computerLanguage = SchemaOrg.computerLanguage()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(computerLanguage));
    assertEquals(computerLanguage, thing);
  }
  @Test public void testMusicPlaylist() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicPlaylist));
    assertEquals(musicPlaylist, thing);
  }
  @Test public void testAutoRental() throws IOException {
    final AutoRental autoRental = SchemaOrg.autoRental()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoRental));
    assertEquals(autoRental, thing);
  }
  @Test public void testBlogPosting() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(blogPosting));
    assertEquals(blogPosting, thing);
  }
  @Test public void testFinancialService() throws IOException {
    final FinancialService financialService = SchemaOrg.financialService()
      .feesAndCommissionsSpecification("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(financialService));
    assertEquals(financialService, thing);
  }
  @Test public void testPrependAction() throws IOException {
    final PrependAction prependAction = SchemaOrg.prependAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(prependAction));
    assertEquals(prependAction, thing);
  }
  @Test public void testPoliceStation() throws IOException {
    final PoliceStation policeStation = SchemaOrg.policeStation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(policeStation));
    assertEquals(policeStation, thing);
  }
  @Test public void testShoppingCenter() throws IOException {
    final ShoppingCenter shoppingCenter = SchemaOrg.shoppingCenter()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(shoppingCenter));
    assertEquals(shoppingCenter, thing);
  }
  @Test public void testRole() throws IOException {
    final Role role = SchemaOrg.role()
      .startDate(NOW)
      .roleName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(role));
    assertEquals(role, thing);
  }
  @Test public void testMuseum() throws IOException {
    final Museum museum = SchemaOrg.museum()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(museum));
    assertEquals(museum, thing);
  }
  @Test public void testMovie() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movie));
    assertEquals(movie, thing);
  }
  @Test public void testRejectAction() throws IOException {
    final RejectAction rejectAction = SchemaOrg.rejectAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rejectAction));
    assertEquals(rejectAction, thing);
  }
  @Test public void testBedDetails() throws IOException {
    final BedDetails bedDetails = SchemaOrg.bedDetails()
      .typeOfBed("Test String")
      .numberOfBeds(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bedDetails));
    assertEquals(bedDetails, thing);
  }
  @Test public void testClothingStore() throws IOException {
    final ClothingStore clothingStore = SchemaOrg.clothingStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(clothingStore));
    assertEquals(clothingStore, thing);
  }
  @Test public void testTheaterGroup() throws IOException {
    final TheaterGroup theaterGroup = SchemaOrg.theaterGroup()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(theaterGroup));
    assertEquals(theaterGroup, thing);
  }
  @Test public void testLeftHandDriving() throws IOException {
    final LeftHandDriving leftHandDriving = SchemaOrg.leftHandDriving()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(leftHandDriving));
    assertEquals(leftHandDriving, thing);
  }
  @Test public void testPublicSwimmingPool() throws IOException {
    final PublicSwimmingPool publicSwimmingPool = SchemaOrg.publicSwimmingPool()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(publicSwimmingPool));
    assertEquals(publicSwimmingPool, thing);
  }
  @Test public void testTaxiReservation() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(taxiReservation));
    assertEquals(taxiReservation, thing);
  }
  @Test public void testReturnAction() throws IOException {
    final ReturnAction returnAction = SchemaOrg.returnAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(returnAction));
    assertEquals(returnAction, thing);
  }
  @Test public void testUpdateAction() throws IOException {
    final UpdateAction updateAction = SchemaOrg.updateAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(updateAction));
    assertEquals(updateAction, thing);
  }
  @Test public void testMensClothingStore() throws IOException {
    final MensClothingStore mensClothingStore = SchemaOrg.mensClothingStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mensClothingStore));
    assertEquals(mensClothingStore, thing);
  }
  @Test public void testFoodEvent() throws IOException {
    final FoodEvent foodEvent = SchemaOrg.foodEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(foodEvent));
    assertEquals(foodEvent, thing);
  }
  @Test public void testDatedMoneySpecification() throws IOException {
    final DatedMoneySpecification datedMoneySpecification = SchemaOrg.datedMoneySpecification()
      .currency("Test String")
      .startDate(NOW)
      .endDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(datedMoneySpecification));
    assertEquals(datedMoneySpecification, thing);
  }
  @Test public void testConsumeAction() throws IOException {
    final ConsumeAction consumeAction = SchemaOrg.consumeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(consumeAction));
    assertEquals(consumeAction, thing);
  }
  @Test public void testMovieRentalStore() throws IOException {
    final MovieRentalStore movieRentalStore = SchemaOrg.movieRentalStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movieRentalStore));
    assertEquals(movieRentalStore, thing);
  }
  @Test public void testBarcode() throws IOException {
    final Barcode barcode = SchemaOrg.barcode()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(barcode));
    assertEquals(barcode, thing);
  }
  @Test public void testHairSalon() throws IOException {
    final HairSalon hairSalon = SchemaOrg.hairSalon()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hairSalon));
    assertEquals(hairSalon, thing);
  }
  @Test public void testRoom() throws IOException {
    final Room room = SchemaOrg.room()
      .numberOfRooms(42)
      .permittedUsage("Test String")
      .petsAllowed(true)
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(room));
    assertEquals(room, thing);
  }
  @Test public void testCafeOrCoffeeShop() throws IOException {
    final CafeOrCoffeeShop cafeOrCoffeeShop = SchemaOrg.cafeOrCoffeeShop()
      .acceptsReservations(true)
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cafeOrCoffeeShop));
    assertEquals(cafeOrCoffeeShop, thing);
  }
  @Test public void testGoodRelationsTerms() throws IOException {
    final GoodRelationsTerms goodRelationsTerms = SchemaOrg.goodRelationsTerms()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(goodRelationsTerms));
    assertEquals(goodRelationsTerms, thing);
  }
  @Test public void testAutomotiveOntologyWGClass() throws IOException {
    final AutomotiveOntologyWGClass automotiveOntologyWGClass = SchemaOrg.automotiveOntologyWGClass()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(automotiveOntologyWGClass));
    assertEquals(automotiveOntologyWGClass, thing);
  }
  @Test public void testMBZ() throws IOException {
    final MBZ mBZ = SchemaOrg.mBZ()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mBZ));
    assertEquals(mBZ, thing);
  }
  @Test public void testViewAction() throws IOException {
    final ViewAction viewAction = SchemaOrg.viewAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(viewAction));
    assertEquals(viewAction, thing);
  }
  @Test public void testInteractionCounter() throws IOException {
    final InteractionCounter interactionCounter = SchemaOrg.interactionCounter()
      .userInteractionCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(interactionCounter));
    assertEquals(interactionCounter, thing);
  }
  @Test public void testOrganizationRole() throws IOException {
    final OrganizationRole organizationRole = SchemaOrg.organizationRole()
      .numberedPosition(42)
      .startDate(NOW)
      .roleName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(organizationRole));
    assertEquals(organizationRole, thing);
  }
  @Test public void testInteractAction() throws IOException {
    final InteractAction interactAction = SchemaOrg.interactAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(interactAction));
    assertEquals(interactAction, thing);
  }
  @Test public void testIssue() throws IOException {
    final Issue issue = SchemaOrg.issue()
      .state("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(issue));
    assertEquals(issue, thing);
  }
  @Test public void testHousePainter() throws IOException {
    final HousePainter housePainter = SchemaOrg.housePainter()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(housePainter));
    assertEquals(housePainter, thing);
  }
  @Test public void testTrainReservation() throws IOException {
    final TrainReservation trainReservation = SchemaOrg.trainReservation()
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(trainReservation));
    assertEquals(trainReservation, thing);
  }
  @Test public void testSubwayStation() throws IOException {
    final SubwayStation subwayStation = SchemaOrg.subwayStation()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(subwayStation));
    assertEquals(subwayStation, thing);
  }
  @Test public void testFinancialProduct() throws IOException {
    final FinancialProduct financialProduct = SchemaOrg.financialProduct()
      .feesAndCommissionsSpecification("Test String")
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(financialProduct));
    assertEquals(financialProduct, thing);
  }
  @Test public void testBlog() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(blog));
    assertEquals(blog, thing);
  }
  @Test public void testExerciseGym() throws IOException {
    final ExerciseGym exerciseGym = SchemaOrg.exerciseGym()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(exerciseGym));
    assertEquals(exerciseGym, thing);
  }
  @Test public void testCityHall() throws IOException {
    final CityHall cityHall = SchemaOrg.cityHall()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cityHall));
    assertEquals(cityHall, thing);
  }
  @Test public void testQuantitativeValue() throws IOException {
    final QuantitativeValue quantitativeValue = SchemaOrg.quantitativeValue()
      .maxValue(42)
      .minValue(42)
      .unitCode("Test String")
      .value(42)
      .unitText("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(quantitativeValue));
    assertEquals(quantitativeValue, thing);
  }
  @Test public void testCommunicateAction() throws IOException {
    final CommunicateAction communicateAction = SchemaOrg.communicateAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(communicateAction));
    assertEquals(communicateAction, thing);
  }
  @Test public void testApartment() throws IOException {
    final Apartment apartment = SchemaOrg.apartment()
      .numberOfRooms(42)
      .permittedUsage("Test String")
      .petsAllowed(true)
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(apartment));
    assertEquals(apartment, thing);
  }
  @Test public void testEmploymentAgency() throws IOException {
    final EmploymentAgency employmentAgency = SchemaOrg.employmentAgency()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(employmentAgency));
    assertEquals(employmentAgency, thing);
  }
  @Test public void testUnRegisterAction() throws IOException {
    final UnRegisterAction unRegisterAction = SchemaOrg.unRegisterAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(unRegisterAction));
    assertEquals(unRegisterAction, thing);
  }
  @Test public void testInvoice() throws IOException {
    final Invoice invoice = SchemaOrg.invoice()
      .paymentMethodId("Test String")
      .paymentDueDate(NOW)
      .scheduledPaymentDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(invoice));
    assertEquals(invoice, thing);
  }
  @Test public void testMusicAlbum() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicAlbum));
    assertEquals(musicAlbum, thing);
  }
  @Test public void testBuddhistTemple() throws IOException {
    final BuddhistTemple buddhistTemple = SchemaOrg.buddhistTemple()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(buddhistTemple));
    assertEquals(buddhistTemple, thing);
  }
  @Test public void testFurnitureStore() throws IOException {
    final FurnitureStore furnitureStore = SchemaOrg.furnitureStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(furnitureStore));
    assertEquals(furnitureStore, thing);
  }
  @Test public void testReviewAction() throws IOException {
    final ReviewAction reviewAction = SchemaOrg.reviewAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reviewAction));
    assertEquals(reviewAction, thing);
  }
  @Test public void testRentAction() throws IOException {
    final RentAction rentAction = SchemaOrg.rentAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rentAction));
    assertEquals(rentAction, thing);
  }
  @Test public void testAutoRepair() throws IOException {
    final AutoRepair autoRepair = SchemaOrg.autoRepair()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoRepair));
    assertEquals(autoRepair, thing);
  }
  @Test public void testRiverBodyOfWater() throws IOException {
    final RiverBodyOfWater riverBodyOfWater = SchemaOrg.riverBodyOfWater()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(riverBodyOfWater));
    assertEquals(riverBodyOfWater, thing);
  }
  @Test public void testSuspendAction() throws IOException {
    final SuspendAction suspendAction = SchemaOrg.suspendAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(suspendAction));
    assertEquals(suspendAction, thing);
  }
  @Test public void testMedicalOrganization() throws IOException {
    final MedicalOrganization medicalOrganization = SchemaOrg.medicalOrganization()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(medicalOrganization));
    assertEquals(medicalOrganization, thing);
  }
  @Test public void testServiceChannel() throws IOException {
    final ServiceChannel serviceChannel = SchemaOrg.serviceChannel()
      .serviceUrl("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(serviceChannel));
    assertEquals(serviceChannel, thing);
  }
  @Test public void testSellAction() throws IOException {
    final SellAction sellAction = SchemaOrg.sellAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sellAction));
    assertEquals(sellAction, thing);
  }
  @Test public void testUserPlays() throws IOException {
    final UserPlays userPlays = SchemaOrg.userPlays()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userPlays));
    assertEquals(userPlays, thing);
  }
  @Test public void testWholesaleStore() throws IOException {
    final WholesaleStore wholesaleStore = SchemaOrg.wholesaleStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wholesaleStore));
    assertEquals(wholesaleStore, thing);
  }
  @Test public void testGovernmentPermit() throws IOException {
    final GovernmentPermit governmentPermit = SchemaOrg.governmentPermit()
      .validFrom(NOW)
      .validUntil(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(governmentPermit));
    assertEquals(governmentPermit, thing);
  }
  @Test public void testRecyclingCenter() throws IOException {
    final RecyclingCenter recyclingCenter = SchemaOrg.recyclingCenter()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(recyclingCenter));
    assertEquals(recyclingCenter, thing);
  }
  @Test public void testFastFoodRestaurant() throws IOException {
    final FastFoodRestaurant fastFoodRestaurant = SchemaOrg.fastFoodRestaurant()
      .acceptsReservations(true)
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(fastFoodRestaurant));
    assertEquals(fastFoodRestaurant, thing);
  }
  @Test public void testSoftwareSourceCode() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(softwareSourceCode));
    assertEquals(softwareSourceCode, thing);
  }
  @Test public void testHospital() throws IOException {
    final Hospital hospital = SchemaOrg.hospital()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hospital));
    assertEquals(hospital, thing);
  }
  @Test public void testIndividualProduct() throws IOException {
    final IndividualProduct individualProduct = SchemaOrg.individualProduct()
      .award("Test String")
      .category("Test String")
      .color("Test String")
      .mpn("Test String")
      .releaseDate(NOW)
      .productionDate(NOW)
      .purchaseDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(individualProduct));
    assertEquals(individualProduct, thing);
  }
  @Test public void testRadioSeason() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioSeason));
    assertEquals(radioSeason, thing);
  }
  @Test public void testTelevisionStation() throws IOException {
    final TelevisionStation televisionStation = SchemaOrg.televisionStation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(televisionStation));
    assertEquals(televisionStation, thing);
  }
  @Test public void testWaterfall() throws IOException {
    final Waterfall waterfall = SchemaOrg.waterfall()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(waterfall));
    assertEquals(waterfall, thing);
  }
  @Test public void testBroadcastService() throws IOException {
    final BroadcastService broadcastService = SchemaOrg.broadcastService()
      .videoFormat("Test String")
      .broadcastDisplayName("Test String")
      .broadcastTimezone("Test String")
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(broadcastService));
    assertEquals(broadcastService, thing);
  }
  @Test public void testCheckInAction() throws IOException {
    final CheckInAction checkInAction = SchemaOrg.checkInAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(checkInAction));
    assertEquals(checkInAction, thing);
  }
  @Test public void testMarryAction() throws IOException {
    final MarryAction marryAction = SchemaOrg.marryAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(marryAction));
    assertEquals(marryAction, thing);
  }
  @Test public void testCemetery() throws IOException {
    final Cemetery cemetery = SchemaOrg.cemetery()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cemetery));
    assertEquals(cemetery, thing);
  }
  @Test public void testPerformingGroup() throws IOException {
    final PerformingGroup performingGroup = SchemaOrg.performingGroup()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(performingGroup));
    assertEquals(performingGroup, thing);
  }
  @Test public void testSculpture() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sculpture));
    assertEquals(sculpture, thing);
  }
  @Test public void testCreateAction() throws IOException {
    final CreateAction createAction = SchemaOrg.createAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(createAction));
    assertEquals(createAction, thing);
  }
  @Test public void testNoteDigitalDocument() throws IOException {
    final NoteDigitalDocument noteDigitalDocument = SchemaOrg.noteDigitalDocument()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(noteDigitalDocument));
    assertEquals(noteDigitalDocument, thing);
  }
  @Test public void testAdministrativeArea() throws IOException {
    final AdministrativeArea administrativeArea = SchemaOrg.administrativeArea()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(administrativeArea));
    assertEquals(administrativeArea, thing);
  }
  @Test public void testPropertyValue() throws IOException {
    final PropertyValue propertyValue = SchemaOrg.propertyValue()
      .minValue(42)
      .unitCode("Test String")
      .value(42)
      .unitText("Test String")
      .propertyID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(propertyValue));
    assertEquals(propertyValue, thing);
  }
  @Test public void testPeriodical() throws IOException {
    final Periodical periodical = SchemaOrg.periodical()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(periodical));
    assertEquals(periodical, thing);
  }
  @Test public void testFourWheelDriveConfiguration() throws IOException {
    final FourWheelDriveConfiguration fourWheelDriveConfiguration = SchemaOrg.fourWheelDriveConfiguration()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(fourWheelDriveConfiguration));
    assertEquals(fourWheelDriveConfiguration, thing);
  }
  @Test public void testEndorseAction() throws IOException {
    final EndorseAction endorseAction = SchemaOrg.endorseAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(endorseAction));
    assertEquals(endorseAction, thing);
  }
  @Test public void testRating() throws IOException {
    final Rating rating = SchemaOrg.rating()
      .bestRating(42)
      .worstRating(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rating));
    assertEquals(rating, thing);
  }
  @Test public void testLakeBodyOfWater() throws IOException {
    final LakeBodyOfWater lakeBodyOfWater = SchemaOrg.lakeBodyOfWater()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lakeBodyOfWater));
    assertEquals(lakeBodyOfWater, thing);
  }
  @Test public void testGasStation() throws IOException {
    final GasStation gasStation = SchemaOrg.gasStation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(gasStation));
    assertEquals(gasStation, thing);
  }
  @Test public void testGovernmentOffice() throws IOException {
    final GovernmentOffice governmentOffice = SchemaOrg.governmentOffice()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(governmentOffice));
    assertEquals(governmentOffice, thing);
  }
  @Test public void testLodgingBusiness() throws IOException {
    final LodgingBusiness lodgingBusiness = SchemaOrg.lodgingBusiness()
      .checkinTime(NOW)
      .checkoutTime(NOW)
      .petsAllowed(true)
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lodgingBusiness));
    assertEquals(lodgingBusiness, thing);
  }
  @Test public void testGeneralContractor() throws IOException {
    final GeneralContractor generalContractor = SchemaOrg.generalContractor()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(generalContractor));
    assertEquals(generalContractor, thing);
  }
  @Test public void testArtGallery() throws IOException {
    final ArtGallery artGallery = SchemaOrg.artGallery()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(artGallery));
    assertEquals(artGallery, thing);
  }
  @Test public void testDownloadAction() throws IOException {
    final DownloadAction downloadAction = SchemaOrg.downloadAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(downloadAction));
    assertEquals(downloadAction, thing);
  }
  @Test public void testParcelDelivery() throws IOException {
    final ParcelDelivery parcelDelivery = SchemaOrg.parcelDelivery()
      .expectedArrivalFrom(NOW)
      .expectedArrivalUntil(NOW)
      .trackingNumber("Test String")
      .trackingUrl("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(parcelDelivery));
    assertEquals(parcelDelivery, thing);
  }
  @Test public void testLanguage() throws IOException {
    final Language language = SchemaOrg.language()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(language));
    assertEquals(language, thing);
  }
  @Test public void testVisualArtsEvent() throws IOException {
    final VisualArtsEvent visualArtsEvent = SchemaOrg.visualArtsEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(visualArtsEvent));
    assertEquals(visualArtsEvent, thing);
  }
  @Test public void testLibrary() throws IOException {
    final Library library = SchemaOrg.library()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(library));
    assertEquals(library, thing);
  }
  @Test public void testTrackAction() throws IOException {
    final TrackAction trackAction = SchemaOrg.trackAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(trackAction));
    assertEquals(trackAction, thing);
  }
  @Test public void testMoveAction() throws IOException {
    final MoveAction moveAction = SchemaOrg.moveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(moveAction));
    assertEquals(moveAction, thing);
  }
  @Test public void testApartmentComplex() throws IOException {
    final ApartmentComplex apartmentComplex = SchemaOrg.apartmentComplex()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(apartmentComplex));
    assertEquals(apartmentComplex, thing);
  }
  @Test public void testLocksmith() throws IOException {
    final Locksmith locksmith = SchemaOrg.locksmith()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(locksmith));
    assertEquals(locksmith, thing);
  }
  @Test public void testTelevisionChannel() throws IOException {
    final TelevisionChannel televisionChannel = SchemaOrg.televisionChannel()
      .broadcastChannelId("Test String")
      .broadcastServiceTier("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(televisionChannel));
    assertEquals(televisionChannel, thing);
  }
  @Test public void testQAPage() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(qAPage));
    assertEquals(qAPage, thing);
  }
  @Test public void testProgramMembership() throws IOException {
    final ProgramMembership programMembership = SchemaOrg.programMembership()
      .membershipNumber("Test String")
      .programName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(programMembership));
    assertEquals(programMembership, thing);
  }
  @Test public void testControlAction() throws IOException {
    final ControlAction controlAction = SchemaOrg.controlAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(controlAction));
    assertEquals(controlAction, thing);
  }
  @Test public void testMountain() throws IOException {
    final Mountain mountain = SchemaOrg.mountain()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mountain));
    assertEquals(mountain, thing);
  }
  @Test public void testPublicationVolume() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(publicationVolume));
    assertEquals(publicationVolume, thing);
  }
  @Test public void testTireShop() throws IOException {
    final TireShop tireShop = SchemaOrg.tireShop()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tireShop));
    assertEquals(tireShop, thing);
  }
  @Test public void testBroadcastEvent() throws IOException {
    final BroadcastEvent broadcastEvent = SchemaOrg.broadcastEvent()
      .videoFormat("Test String")
      .isLiveBroadcast(true)
      .isAccessibleForFree(true)
      .doorTime(NOW)
      .endDate(NOW)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(broadcastEvent));
    assertEquals(broadcastEvent, thing);
  }
  @Test public void testBarOrPub() throws IOException {
    final BarOrPub barOrPub = SchemaOrg.barOrPub()
      .acceptsReservations(true)
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(barOrPub));
    assertEquals(barOrPub, thing);
  }
  @Test public void testBusTrip() throws IOException {
    final BusTrip busTrip = SchemaOrg.busTrip()
      .departureTime(NOW)
      .arrivalTime(NOW)
      .busNumber("Test String")
      .busName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(busTrip));
    assertEquals(busTrip, thing);
  }
  @Test public void testSkiResort() throws IOException {
    final SkiResort skiResort = SchemaOrg.skiResort()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(skiResort));
    assertEquals(skiResort, thing);
  }
  @Test public void testGiveAction() throws IOException {
    final GiveAction giveAction = SchemaOrg.giveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(giveAction));
    assertEquals(giveAction, thing);
  }
  @Test public void testScheduleAction() throws IOException {
    final ScheduleAction scheduleAction = SchemaOrg.scheduleAction()
      .scheduledTime(NOW)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(scheduleAction));
    assertEquals(scheduleAction, thing);
  }
  @Test public void testFoodService() throws IOException {
    final FoodService foodService = SchemaOrg.foodService()
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(foodService));
    assertEquals(foodService, thing);
  }
  @Test public void testArticle() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(article));
    assertEquals(article, thing);
  }
  @Test public void testBookmarkAction() throws IOException {
    final BookmarkAction bookmarkAction = SchemaOrg.bookmarkAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bookmarkAction));
    assertEquals(bookmarkAction, thing);
  }
  @Test public void testPlaceOfWorship() throws IOException {
    final PlaceOfWorship placeOfWorship = SchemaOrg.placeOfWorship()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(placeOfWorship));
    assertEquals(placeOfWorship, thing);
  }
  @Test public void testState() throws IOException {
    final State state = SchemaOrg.state()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(state));
    assertEquals(state, thing);
  }
  @Test public void testProfessionalService() throws IOException {
    final ProfessionalService professionalService = SchemaOrg.professionalService()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(professionalService));
    assertEquals(professionalService, thing);
  }
  @Test public void testCompoundPriceSpecification() throws IOException {
    final CompoundPriceSpecification compoundPriceSpecification = SchemaOrg.compoundPriceSpecification()
      .maxPrice(42)
      .minPrice(42)
      .price(42)
      .validFrom(NOW)
      .validThrough(NOW)
      .valueAddedTaxIncluded(true)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(compoundPriceSpecification));
    assertEquals(compoundPriceSpecification, thing);
  }
  @Test public void testSiteNavigationElement() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(siteNavigationElement));
    assertEquals(siteNavigationElement, thing);
  }
  @Test public void testCookAction() throws IOException {
    final CookAction cookAction = SchemaOrg.cookAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cookAction));
    assertEquals(cookAction, thing);
  }
  @Test public void testImageObject() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(imageObject));
    assertEquals(imageObject, thing);
  }
  @Test public void testActivateAction() throws IOException {
    final ActivateAction activateAction = SchemaOrg.activateAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(activateAction));
    assertEquals(activateAction, thing);
  }
  @Test public void testSportsTeam() throws IOException {
    final SportsTeam sportsTeam = SchemaOrg.sportsTeam()
      .sport("Test String")
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportsTeam));
    assertEquals(sportsTeam, thing);
  }
  @Test public void testEventVenue() throws IOException {
    final EventVenue eventVenue = SchemaOrg.eventVenue()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(eventVenue));
    assertEquals(eventVenue, thing);
  }
  @Test public void testCourseInstance() throws IOException {
    final CourseInstance courseInstance = SchemaOrg.courseInstance()
      .courseMode("Test String")
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(courseInstance));
    assertEquals(courseInstance, thing);
  }
  @Test public void testNewsArticle() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(newsArticle));
    assertEquals(newsArticle, thing);
  }
  @Test public void testCorporation() throws IOException {
    final Corporation corporation = SchemaOrg.corporation()
      .tickerSymbol("Test String")
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(corporation));
    assertEquals(corporation, thing);
  }
  @Test public void testSportsActivityLocation() throws IOException {
    final SportsActivityLocation sportsActivityLocation = SchemaOrg.sportsActivityLocation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportsActivityLocation));
    assertEquals(sportsActivityLocation, thing);
  }
  @Test public void testAirport() throws IOException {
    final Airport airport = SchemaOrg.airport()
      .iataCode("Test String")
      .icaoCode("Test String")
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(airport));
    assertEquals(airport, thing);
  }
  @Test public void testSeat() throws IOException {
    final Seat seat = SchemaOrg.seat()
      .seatNumber("Test String")
      .seatRow("Test String")
      .seatSection("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(seat));
    assertEquals(seat, thing);
  }
  @Test public void testOfficeEquipmentStore() throws IOException {
    final OfficeEquipmentStore officeEquipmentStore = SchemaOrg.officeEquipmentStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(officeEquipmentStore));
    assertEquals(officeEquipmentStore, thing);
  }
  @Test public void testPaymentService() throws IOException {
    final PaymentService paymentService = SchemaOrg.paymentService()
      .feesAndCommissionsSpecification("Test String")
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(paymentService));
    assertEquals(paymentService, thing);
  }
  @Test public void testDepositAccount() throws IOException {
    final DepositAccount depositAccount = SchemaOrg.depositAccount()
      .feesAndCommissionsSpecification("Test String")
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(depositAccount));
    assertEquals(depositAccount, thing);
  }
  @Test public void testMonetaryAmount() throws IOException {
    final MonetaryAmount monetaryAmount = SchemaOrg.monetaryAmount()
      .minValue(42)
      .validFrom(NOW)
      .validThrough(NOW)
      .value(42)
      .currency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(monetaryAmount));
    assertEquals(monetaryAmount, thing);
  }
  @Test public void testArriveAction() throws IOException {
    final ArriveAction arriveAction = SchemaOrg.arriveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(arriveAction));
    assertEquals(arriveAction, thing);
  }
  @Test public void testCode() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(code));
    assertEquals(code, thing);
  }
  @Test public void testOwnershipInfo() throws IOException {
    final OwnershipInfo ownershipInfo = SchemaOrg.ownershipInfo()
      .ownedFrom(NOW)
      .ownedThrough(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(ownershipInfo));
    assertEquals(ownershipInfo, thing);
  }
  @Test public void testAmusementPark() throws IOException {
    final AmusementPark amusementPark = SchemaOrg.amusementPark()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(amusementPark));
    assertEquals(amusementPark, thing);
  }
  @Test public void testAccommodation() throws IOException {
    final Accommodation accommodation = SchemaOrg.accommodation()
      .numberOfRooms(42)
      .permittedUsage("Test String")
      .petsAllowed(true)
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(accommodation));
    assertEquals(accommodation, thing);
  }
  @Test public void testRestaurant() throws IOException {
    final Restaurant restaurant = SchemaOrg.restaurant()
      .acceptsReservations(true)
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(restaurant));
    assertEquals(restaurant, thing);
  }
  @Test public void testRadioSeries() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioSeries));
    assertEquals(radioSeries, thing);
  }
  @Test public void testMovieTheater() throws IOException {
    final MovieTheater movieTheater = SchemaOrg.movieTheater()
      .screenCount(42)
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movieTheater));
    assertEquals(movieTheater, thing);
  }
  @Test public void testConvenienceStore() throws IOException {
    final ConvenienceStore convenienceStore = SchemaOrg.convenienceStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(convenienceStore));
    assertEquals(convenienceStore, thing);
  }
  @Test public void testReservoir() throws IOException {
    final Reservoir reservoir = SchemaOrg.reservoir()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reservoir));
    assertEquals(reservoir, thing);
  }
  @Test public void testOrganizeAction() throws IOException {
    final OrganizeAction organizeAction = SchemaOrg.organizeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(organizeAction));
    assertEquals(organizeAction, thing);
  }
  @Test public void testDepartAction() throws IOException {
    final DepartAction departAction = SchemaOrg.departAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(departAction));
    assertEquals(departAction, thing);
  }
  @Test public void testTicket() throws IOException {
    final Ticket ticket = SchemaOrg.ticket()
      .totalPrice(42)
      .priceCurrency("Test String")
      .dateIssued(NOW)
      .ticketNumber("Test String")
      .ticketToken("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(ticket));
    assertEquals(ticket, thing);
  }
  @Test public void testHardwareStore() throws IOException {
    final HardwareStore hardwareStore = SchemaOrg.hardwareStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hardwareStore));
    assertEquals(hardwareStore, thing);
  }
  @Test public void testSocialMediaPosting() throws IOException {
    final SocialMediaPosting socialMediaPosting = SchemaOrg.socialMediaPosting()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(socialMediaPosting));
    assertEquals(socialMediaPosting, thing);
  }
  @Test public void testPresentationDigitalDocument() throws IOException {
    final PresentationDigitalDocument presentationDigitalDocument = SchemaOrg.presentationDigitalDocument()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(presentationDigitalDocument));
    assertEquals(presentationDigitalDocument, thing);
  }
  @Test public void testSendAction() throws IOException {
    final SendAction sendAction = SchemaOrg.sendAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sendAction));
    assertEquals(sendAction, thing);
  }
  @Test public void testOnDemandEvent() throws IOException {
    final OnDemandEvent onDemandEvent = SchemaOrg.onDemandEvent()
      .isAccessibleForFree(true)
      .doorTime(NOW)
      .endDate(NOW)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(onDemandEvent));
    assertEquals(onDemandEvent, thing);
  }
  @Test public void testBibExTerm() throws IOException {
    final BibExTerm bibExTerm = SchemaOrg.bibExTerm()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bibExTerm));
    assertEquals(bibExTerm, thing);
  }
  @Test public void testDiscussionForumPosting() throws IOException {
    final DiscussionForumPosting discussionForumPosting = SchemaOrg.discussionForumPosting()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(discussionForumPosting));
    assertEquals(discussionForumPosting, thing);
  }
  @Test public void testPharmacy() throws IOException {
    final Pharmacy pharmacy = SchemaOrg.pharmacy()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(pharmacy));
    assertEquals(pharmacy, thing);
  }
  @Test public void testMovieSeries() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movieSeries));
    assertEquals(movieSeries, thing);
  }
  @Test public void testDigitalDocument() throws IOException {
    final DigitalDocument digitalDocument = SchemaOrg.digitalDocument()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(digitalDocument));
    assertEquals(digitalDocument, thing);
  }
  @Test public void testRegisterAction() throws IOException {
    final RegisterAction registerAction = SchemaOrg.registerAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(registerAction));
    assertEquals(registerAction, thing);
  }
  @Test public void testFIBO() throws IOException {
    final FIBO fIBO = SchemaOrg.fIBO()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(fIBO));
    assertEquals(fIBO, thing);
  }
  @Test public void testLandmarksOrHistoricalBuildings() throws IOException {
    final LandmarksOrHistoricalBuildings landmarksOrHistoricalBuildings = SchemaOrg.landmarksOrHistoricalBuildings()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(landmarksOrHistoricalBuildings));
    assertEquals(landmarksOrHistoricalBuildings, thing);
  }
  @Test public void testExhibitionEvent() throws IOException {
    final ExhibitionEvent exhibitionEvent = SchemaOrg.exhibitionEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(exhibitionEvent));
    assertEquals(exhibitionEvent, thing);
  }
  @Test public void testWebPage() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(webPage));
    assertEquals(webPage, thing);
  }
  @Test public void testListItem() throws IOException {
    final ListItem listItem = SchemaOrg.listItem()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(listItem));
    assertEquals(listItem, thing);
  }
  @Test public void testRsvpAction() throws IOException {
    final RsvpAction rsvpAction = SchemaOrg.rsvpAction()
      .additionalNumberOfGuests(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rsvpAction));
    assertEquals(rsvpAction, thing);
  }
  @Test public void testAnimalShelter() throws IOException {
    final AnimalShelter animalShelter = SchemaOrg.animalShelter()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(animalShelter));
    assertEquals(animalShelter, thing);
  }
  @Test public void testCrematorium() throws IOException {
    final Crematorium crematorium = SchemaOrg.crematorium()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(crematorium));
    assertEquals(crematorium, thing);
  }
  @Test public void testUserCheckins() throws IOException {
    final UserCheckins userCheckins = SchemaOrg.userCheckins()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userCheckins));
    assertEquals(userCheckins, thing);
  }
  @Test public void testWebPageElement() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(webPageElement));
    assertEquals(webPageElement, thing);
  }
  @Test public void testReserveAction() throws IOException {
    final ReserveAction reserveAction = SchemaOrg.reserveAction()
      .scheduledTime(NOW)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reserveAction));
    assertEquals(reserveAction, thing);
  }
  @Test public void testMovieClip() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movieClip));
    assertEquals(movieClip, thing);
  }
  @Test public void testOrderAction() throws IOException {
    final OrderAction orderAction = SchemaOrg.orderAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(orderAction));
    assertEquals(orderAction, thing);
  }
  @Test public void testDiscoverAction() throws IOException {
    final DiscoverAction discoverAction = SchemaOrg.discoverAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(discoverAction));
    assertEquals(discoverAction, thing);
  }
  @Test public void testContactPage() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(contactPage));
    assertEquals(contactPage, thing);
  }
  @Test public void testAllocateAction() throws IOException {
    final AllocateAction allocateAction = SchemaOrg.allocateAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(allocateAction));
    assertEquals(allocateAction, thing);
  }
  @Test public void testCountry() throws IOException {
    final Country country = SchemaOrg.country()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(country));
    assertEquals(country, thing);
  }
  @Test public void testAutoBodyShop() throws IOException {
    final AutoBodyShop autoBodyShop = SchemaOrg.autoBodyShop()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoBodyShop));
    assertEquals(autoBodyShop, thing);
  }
  @Test public void testDataCatalog() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dataCatalog));
    assertEquals(dataCatalog, thing);
  }
  @Test public void testOrderItem() throws IOException {
    final OrderItem orderItem = SchemaOrg.orderItem()
      .orderQuantity(42)
      .orderItemNumber("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(orderItem));
    assertEquals(orderItem, thing);
  }
  @Test public void testStructuredValue() throws IOException {
    final StructuredValue structuredValue = SchemaOrg.structuredValue()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(structuredValue));
    assertEquals(structuredValue, thing);
  }
  @Test public void testInvestmentOrDeposit() throws IOException {
    final InvestmentOrDeposit investmentOrDeposit = SchemaOrg.investmentOrDeposit()
      .feesAndCommissionsSpecification("Test String")
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(investmentOrDeposit));
    assertEquals(investmentOrDeposit, thing);
  }
  @Test public void testLandform() throws IOException {
    final Landform landform = SchemaOrg.landform()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(landform));
    assertEquals(landform, thing);
  }
  @Test public void testCreativeWorkSeries() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(creativeWorkSeries));
    assertEquals(creativeWorkSeries, thing);
  }
  @Test public void testCatholicChurch() throws IOException {
    final CatholicChurch catholicChurch = SchemaOrg.catholicChurch()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(catholicChurch));
    assertEquals(catholicChurch, thing);
  }
  @Test public void testSoftwareApplication() throws IOException {
    final SoftwareApplication softwareApplication = SchemaOrg.softwareApplication()
      .applicationCategory("Test String")
      .applicationSubCategory("Test String")
      .applicationSuite("Test String")
      .countriesNotSupported("Test String")
      .countriesSupported("Test String")
      .availableOnDevice("Test String")
      .downloadUrl("Test String")
      .featureList("Test String")
      .fileSize("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(softwareApplication));
    assertEquals(softwareApplication, thing);
  }
  @Test public void testAuthorizeAction() throws IOException {
    final AuthorizeAction authorizeAction = SchemaOrg.authorizeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(authorizeAction));
    assertEquals(authorizeAction, thing);
  }
  @Test public void testTVSeason() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tVSeason));
    assertEquals(tVSeason, thing);
  }
  @Test public void testWinAction() throws IOException {
    final WinAction winAction = SchemaOrg.winAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(winAction));
    assertEquals(winAction, thing);
  }
  @Test public void testEntertainmentBusiness() throws IOException {
    final EntertainmentBusiness entertainmentBusiness = SchemaOrg.entertainmentBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(entertainmentBusiness));
    assertEquals(entertainmentBusiness, thing);
  }
  @Test public void testEpisode() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(episode));
    assertEquals(episode, thing);
  }
  @Test public void testGatedResidenceCommunity() throws IOException {
    final GatedResidenceCommunity gatedResidenceCommunity = SchemaOrg.gatedResidenceCommunity()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(gatedResidenceCommunity));
    assertEquals(gatedResidenceCommunity, thing);
  }
  @Test public void testHobbyShop() throws IOException {
    final HobbyShop hobbyShop = SchemaOrg.hobbyShop()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hobbyShop));
    assertEquals(hobbyShop, thing);
  }
  @Test public void testAdultEntertainment() throws IOException {
    final AdultEntertainment adultEntertainment = SchemaOrg.adultEntertainment()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(adultEntertainment));
    assertEquals(adultEntertainment, thing);
  }
  @Test public void testSTIAccommodationOntology() throws IOException {
    final STIAccommodationOntology sTIAccommodationOntology = SchemaOrg.sTIAccommodationOntology()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sTIAccommodationOntology));
    assertEquals(sTIAccommodationOntology, thing);
  }
  @Test public void testCheckOutAction() throws IOException {
    final CheckOutAction checkOutAction = SchemaOrg.checkOutAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(checkOutAction));
    assertEquals(checkOutAction, thing);
  }
  @Test public void testVideoGallery() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(videoGallery));
    assertEquals(videoGallery, thing);
  }
  @Test public void testParkingFacility() throws IOException {
    final ParkingFacility parkingFacility = SchemaOrg.parkingFacility()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(parkingFacility));
    assertEquals(parkingFacility, thing);
  }
  @Test public void testAutomotiveBusiness() throws IOException {
    final AutomotiveBusiness automotiveBusiness = SchemaOrg.automotiveBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(automotiveBusiness));
    assertEquals(automotiveBusiness, thing);
  }
  @Test public void testNGO() throws IOException {
    final NGO nGO = SchemaOrg.nGO()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(nGO));
    assertEquals(nGO, thing);
  }
  @Test public void testRadioEpisode() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioEpisode));
    assertEquals(radioEpisode, thing);
  }
  @Test public void testTouristInformationCenter() throws IOException {
    final TouristInformationCenter touristInformationCenter = SchemaOrg.touristInformationCenter()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(touristInformationCenter));
    assertEquals(touristInformationCenter, thing);
  }
  @Test public void testRadioStation() throws IOException {
    final RadioStation radioStation = SchemaOrg.radioStation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioStation));
    assertEquals(radioStation, thing);
  }
  @Test public void testGame() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(game));
    assertEquals(game, thing);
  }
  @Test public void testBeach() throws IOException {
    final Beach beach = SchemaOrg.beach()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(beach));
    assertEquals(beach, thing);
  }
  @Test public void testUserBlocks() throws IOException {
    final UserBlocks userBlocks = SchemaOrg.userBlocks()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userBlocks));
    assertEquals(userBlocks, thing);
  }
  @Test public void testPhotograph() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(photograph));
    assertEquals(photograph, thing);
  }
  @Test public void testEducationalAudience() throws IOException {
    final EducationalAudience educationalAudience = SchemaOrg.educationalAudience()
      .educationalRole("Test String")
      .audienceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(educationalAudience));
    assertEquals(educationalAudience, thing);
  }
  @Test public void testVehicle() throws IOException {
    final Vehicle vehicle = SchemaOrg.vehicle()
      .numberOfAirbags(42)
      .vehicleIdentificationNumber("Test String")
      .vehicleConfiguration("Test String")
      .knownVehicleDamages("Test String")
      .dateVehicleFirstRegistered(NOW)
      .vehicleInteriorColor("Test String")
      .vehicleInteriorType("Test String")
      .vehicleModelDate(NOW)
      .productionDate(NOW)
      .purchaseDate(NOW)
      .vehicleSpecialUsage("Test String")
      .award("Test String")
      .category("Test String")
      .color("Test String")
      .mpn("Test String")
      .releaseDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(vehicle));
    assertEquals(vehicle, thing);
  }
  @Test public void testEmergencyService() throws IOException {
    final EmergencyService emergencyService = SchemaOrg.emergencyService()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(emergencyService));
    assertEquals(emergencyService, thing);
  }
  @Test public void testBefriendAction() throws IOException {
    final BefriendAction befriendAction = SchemaOrg.befriendAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(befriendAction));
    assertEquals(befriendAction, thing);
  }
  @Test public void testAddAction() throws IOException {
    final AddAction addAction = SchemaOrg.addAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(addAction));
    assertEquals(addAction, thing);
  }
  @Test public void testHomeAndConstructionBusiness() throws IOException {
    final HomeAndConstructionBusiness homeAndConstructionBusiness = SchemaOrg.homeAndConstructionBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(homeAndConstructionBusiness));
    assertEquals(homeAndConstructionBusiness, thing);
  }
  @Test public void testWarrantyPromise() throws IOException {
    final WarrantyPromise warrantyPromise = SchemaOrg.warrantyPromise()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(warrantyPromise));
    assertEquals(warrantyPromise, thing);
  }
  @Test public void testSourceCodeReview() throws IOException {
    final SourceCodeReview sourceCodeReview = SchemaOrg.sourceCodeReview()
      .applicationCategory("Test String")
      .applicationSubCategory("Test String")
      .applicationSuite("Test String")
      .countriesNotSupported("Test String")
      .countriesSupported("Test String")
      .availableOnDevice("Test String")
      .downloadUrl("Test String")
      .featureList("Test String")
      .fileSize("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sourceCodeReview));
    assertEquals(sourceCodeReview, thing);
  }
  @Test public void testProfilePage() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(profilePage));
    assertEquals(profilePage, thing);
  }
  @Test public void testMusicRecording() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicRecording));
    assertEquals(musicRecording, thing);
  }
  @Test public void testDeliveryChargeSpecification() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(deliveryChargeSpecification));
    assertEquals(deliveryChargeSpecification, thing);
  }
  @Test public void testHealthClub() throws IOException {
    final HealthClub healthClub = SchemaOrg.healthClub()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(healthClub));
    assertEquals(healthClub, thing);
  }
  @Test public void testAttorney() throws IOException {
    final Attorney attorney = SchemaOrg.attorney()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(attorney));
    assertEquals(attorney, thing);
  }
  @Test public void testStadiumOrArena() throws IOException {
    final StadiumOrArena stadiumOrArena = SchemaOrg.stadiumOrArena()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(stadiumOrArena));
    assertEquals(stadiumOrArena, thing);
  }
  @Test public void testEatAction() throws IOException {
    final EatAction eatAction = SchemaOrg.eatAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(eatAction));
    assertEquals(eatAction, thing);
  }
  @Test public void testMap() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(map));
    assertEquals(map, thing);
  }
  @Test public void testSeason() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(season));
    assertEquals(season, thing);
  }
  @Test public void testFlightReservation() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(flightReservation));
    assertEquals(flightReservation, thing);
  }
  @Test public void testSourceCodeRevision() throws IOException {
    final SourceCodeRevision sourceCodeRevision = SchemaOrg.sourceCodeRevision()
      .tag("Test String")
      .branch("Test String")
      .applicationCategory("Test String")
      .applicationSubCategory("Test String")
      .applicationSuite("Test String")
      .countriesNotSupported("Test String")
      .countriesSupported("Test String")
      .availableOnDevice("Test String")
      .downloadUrl("Test String")
      .featureList("Test String")
      .fileSize("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sourceCodeRevision));
    assertEquals(sourceCodeRevision, thing);
  }
  @Test public void testPublicationIssue() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(publicationIssue));
    assertEquals(publicationIssue, thing);
  }
  @Test public void testShoeStore() throws IOException {
    final ShoeStore shoeStore = SchemaOrg.shoeStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(shoeStore));
    assertEquals(shoeStore, thing);
  }
  @Test public void testSocialEvent() throws IOException {
    final SocialEvent socialEvent = SchemaOrg.socialEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(socialEvent));
    assertEquals(socialEvent, thing);
  }
  @Test public void testPawnShop() throws IOException {
    final PawnShop pawnShop = SchemaOrg.pawnShop()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(pawnShop));
    assertEquals(pawnShop, thing);
  }
  @Test public void testEvent() throws IOException {
    final Event event = SchemaOrg.event()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(event));
    assertEquals(event, thing);
  }
  @Test public void testBodyOfWater() throws IOException {
    final BodyOfWater bodyOfWater = SchemaOrg.bodyOfWater()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bodyOfWater));
    assertEquals(bodyOfWater, thing);
  }
  @Test public void testProductModel() throws IOException {
    final ProductModel productModel = SchemaOrg.productModel()
      .award("Test String")
      .category("Test String")
      .color("Test String")
      .mpn("Test String")
      .releaseDate(NOW)
      .productionDate(NOW)
      .purchaseDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(productModel));
    assertEquals(productModel, thing);
  }
  @Test public void testMusicEvent() throws IOException {
    final MusicEvent musicEvent = SchemaOrg.musicEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicEvent));
    assertEquals(musicEvent, thing);
  }
  @Test public void testBroadcastChannel() throws IOException {
    final BroadcastChannel broadcastChannel = SchemaOrg.broadcastChannel()
      .broadcastChannelId("Test String")
      .broadcastServiceTier("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(broadcastChannel));
    assertEquals(broadcastChannel, thing);
  }
  @Test public void testDataFeed() throws IOException {
    final DataFeed dataFeed = SchemaOrg.dataFeed()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dataFeed));
    assertEquals(dataFeed, thing);
  }
  @Test public void testLoseAction() throws IOException {
    final LoseAction loseAction = SchemaOrg.loseAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(loseAction));
    assertEquals(loseAction, thing);
  }
  @Test public void testCreditCard() throws IOException {
    final CreditCard creditCard = SchemaOrg.creditCard()
      .requiredCollateral("Test String")
      .feesAndCommissionsSpecification("Test String")
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(creditCard));
    assertEquals(creditCard, thing);
  }
  @Test public void testDataDownload() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dataDownload));
    assertEquals(dataDownload, thing);
  }
  @Test public void testReactAction() throws IOException {
    final ReactAction reactAction = SchemaOrg.reactAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reactAction));
    assertEquals(reactAction, thing);
  }
  @Test public void testHotel() throws IOException {
    final Hotel hotel = SchemaOrg.hotel()
      .checkinTime(NOW)
      .checkoutTime(NOW)
      .petsAllowed(true)
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hotel));
    assertEquals(hotel, thing);
  }
  @Test public void testResumeAction() throws IOException {
    final ResumeAction resumeAction = SchemaOrg.resumeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(resumeAction));
    assertEquals(resumeAction, thing);
  }
  @Test public void testDepartmentStore() throws IOException {
    final DepartmentStore departmentStore = SchemaOrg.departmentStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(departmentStore));
    assertEquals(departmentStore, thing);
  }
  @Test public void testOceanBodyOfWater() throws IOException {
    final OceanBodyOfWater oceanBodyOfWater = SchemaOrg.oceanBodyOfWater()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(oceanBodyOfWater));
    assertEquals(oceanBodyOfWater, thing);
  }
  @Test public void testBowlingAlley() throws IOException {
    final BowlingAlley bowlingAlley = SchemaOrg.bowlingAlley()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bowlingAlley));
    assertEquals(bowlingAlley, thing);
  }
  @Test public void testAquarium() throws IOException {
    final Aquarium aquarium = SchemaOrg.aquarium()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(aquarium));
    assertEquals(aquarium, thing);
  }
  @Test public void testPetStore() throws IOException {
    final PetStore petStore = SchemaOrg.petStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(petStore));
    assertEquals(petStore, thing);
  }
  @Test public void testDeleteAction() throws IOException {
    final DeleteAction deleteAction = SchemaOrg.deleteAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(deleteAction));
    assertEquals(deleteAction, thing);
  }
  @Test public void testEnergy() throws IOException {
    final Energy energy = SchemaOrg.energy()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(energy));
    assertEquals(energy, thing);
  }
  @Test public void testSchool() throws IOException {
    final School school = SchemaOrg.school()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(school));
    assertEquals(school, thing);
  }
  @Test public void testBook() throws IOException {
    final Book book = SchemaOrg.book()
      .bookEdition("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(book));
    assertEquals(book, thing);
  }
  @Test public void testChooseAction() throws IOException {
    final ChooseAction chooseAction = SchemaOrg.chooseAction()
      .actionOption("Test String")
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(chooseAction));
    assertEquals(chooseAction, thing);
  }
  @Test public void testAutoDealer() throws IOException {
    final AutoDealer autoDealer = SchemaOrg.autoDealer()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoDealer));
    assertEquals(autoDealer, thing);
  }
  @Test public void testLiteraryEvent() throws IOException {
    final LiteraryEvent literaryEvent = SchemaOrg.literaryEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(literaryEvent));
    assertEquals(literaryEvent, thing);
  }
  @Test public void testWebApplication() throws IOException {
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
      .fileSize("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(webApplication));
    assertEquals(webApplication, thing);
  }
  @Test public void testGroceryStore() throws IOException {
    final GroceryStore groceryStore = SchemaOrg.groceryStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(groceryStore));
    assertEquals(groceryStore, thing);
  }
  @Test public void testNailSalon() throws IOException {
    final NailSalon nailSalon = SchemaOrg.nailSalon()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(nailSalon));
    assertEquals(nailSalon, thing);
  }
  @Test public void testFilmAction() throws IOException {
    final FilmAction filmAction = SchemaOrg.filmAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(filmAction));
    assertEquals(filmAction, thing);
  }
  @Test public void testAchieveAction() throws IOException {
    final AchieveAction achieveAction = SchemaOrg.achieveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(achieveAction));
    assertEquals(achieveAction, thing);
  }
  @Test public void testApplyAction() throws IOException {
    final ApplyAction applyAction = SchemaOrg.applyAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(applyAction));
    assertEquals(applyAction, thing);
  }
  @Test public void testCanal() throws IOException {
    final Canal canal = SchemaOrg.canal()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(canal));
    assertEquals(canal, thing);
  }
  @Test public void testResidence() throws IOException {
    final Residence residence = SchemaOrg.residence()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(residence));
    assertEquals(residence, thing);
  }
  @Test public void testCity() throws IOException {
    final City city = SchemaOrg.city()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(city));
    assertEquals(city, thing);
  }
  @Test public void testUserPageVisits() throws IOException {
    final UserPageVisits userPageVisits = SchemaOrg.userPageVisits()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userPageVisits));
    assertEquals(userPageVisits, thing);
  }
  @Test public void testShareAction() throws IOException {
    final ShareAction shareAction = SchemaOrg.shareAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(shareAction));
    assertEquals(shareAction, thing);
  }
  @Test public void testStore() throws IOException {
    final Store store = SchemaOrg.store()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(store));
    assertEquals(store, thing);
  }
  @Test public void testGovernmentOrganization() throws IOException {
    final GovernmentOrganization governmentOrganization = SchemaOrg.governmentOrganization()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(governmentOrganization));
    assertEquals(governmentOrganization, thing);
  }
  @Test public void testLodgingReservation() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lodgingReservation));
    assertEquals(lodgingReservation, thing);
  }
  @Test public void testEntryPoint() throws IOException {
    final EntryPoint entryPoint = SchemaOrg.entryPoint()
      .actionPlatform("Test String")
      .httpMethod("Test String")
      .encodingType("Test String")
      .contentType("Test String")
      .urlTemplate("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(entryPoint));
    assertEquals(entryPoint, thing);
  }
  @Test public void testVisualArtwork() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(visualArtwork));
    assertEquals(visualArtwork, thing);
  }
  @Test public void testPayAction() throws IOException {
    final PayAction payAction = SchemaOrg.payAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(payAction));
    assertEquals(payAction, thing);
  }
  @Test public void testChildrensEvent() throws IOException {
    final ChildrensEvent childrensEvent = SchemaOrg.childrensEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(childrensEvent));
    assertEquals(childrensEvent, thing);
  }
  @Test public void testOfferCatalog() throws IOException {
    final OfferCatalog offerCatalog = SchemaOrg.offerCatalog()
      .numberOfItems(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(offerCatalog));
    assertEquals(offerCatalog, thing);
  }
  @Test public void testMusicVenue() throws IOException {
    final MusicVenue musicVenue = SchemaOrg.musicVenue()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicVenue));
    assertEquals(musicVenue, thing);
  }
  @Test public void testAgreeAction() throws IOException {
    final AgreeAction agreeAction = SchemaOrg.agreeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(agreeAction));
    assertEquals(agreeAction, thing);
  }
  @Test public void testCurrencyConversionService() throws IOException {
    final CurrencyConversionService currencyConversionService = SchemaOrg.currencyConversionService()
      .feesAndCommissionsSpecification("Test String")
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(currencyConversionService));
    assertEquals(currencyConversionService, thing);
  }
  @Test public void testChildCare() throws IOException {
    final ChildCare childCare = SchemaOrg.childCare()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(childCare));
    assertEquals(childCare, thing);
  }
  @Test public void testCheckoutPage() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(checkoutPage));
    assertEquals(checkoutPage, thing);
  }
  @Test public void testWikiDoc() throws IOException {
    final WikiDoc wikiDoc = SchemaOrg.wikiDoc()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wikiDoc));
    assertEquals(wikiDoc, thing);
  }
  @Test public void testBrewery() throws IOException {
    final Brewery brewery = SchemaOrg.brewery()
      .acceptsReservations(true)
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(brewery));
    assertEquals(brewery, thing);
  }
  @Test public void testZoo() throws IOException {
    final Zoo zoo = SchemaOrg.zoo()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(zoo));
    assertEquals(zoo, thing);
  }
  @Test public void testSportsEvent() throws IOException {
    final SportsEvent sportsEvent = SchemaOrg.sportsEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportsEvent));
    assertEquals(sportsEvent, thing);
  }
  @Test public void testReplaceAction() throws IOException {
    final ReplaceAction replaceAction = SchemaOrg.replaceAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(replaceAction));
    assertEquals(replaceAction, thing);
  }
  @Test public void testBankAccount() throws IOException {
    final BankAccount bankAccount = SchemaOrg.bankAccount()
      .feesAndCommissionsSpecification("Test String")
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bankAccount));
    assertEquals(bankAccount, thing);
  }
  @Test public void testReadAction() throws IOException {
    final ReadAction readAction = SchemaOrg.readAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(readAction));
    assertEquals(readAction, thing);
  }
  @Test public void testMusicComposition() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicComposition));
    assertEquals(musicComposition, thing);
  }
  @Test public void testHouse() throws IOException {
    final House house = SchemaOrg.house()
      .numberOfRooms(42)
      .permittedUsage("Test String")
      .petsAllowed(true)
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(house));
    assertEquals(house, thing);
  }
  @Test public void testSearchAction() throws IOException {
    final SearchAction searchAction = SchemaOrg.searchAction()
      .query("Test String")
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(searchAction));
    assertEquals(searchAction, thing);
  }
  @Test public void testRoofingContractor() throws IOException {
    final RoofingContractor roofingContractor = SchemaOrg.roofingContractor()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(roofingContractor));
    assertEquals(roofingContractor, thing);
  }
  @Test public void testOrder() throws IOException {
    final Order order = SchemaOrg.order()
      .discount(42)
      .discountCode("Test String")
      .discountCurrency("Test String")
      .isGift(true)
      .orderDate(NOW)
      .paymentMethodId("Test String")
      .paymentUrl("Test String")
      .paymentDueDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(order));
    assertEquals(order, thing);
  }
  @Test public void testEmbassy() throws IOException {
    final Embassy embassy = SchemaOrg.embassy()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(embassy));
    assertEquals(embassy, thing);
  }
  @Test public void testSportingGoodsStore() throws IOException {
    final SportingGoodsStore sportingGoodsStore = SchemaOrg.sportingGoodsStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportingGoodsStore));
    assertEquals(sportingGoodsStore, thing);
  }
  @Test public void testTravelAction() throws IOException {
    final TravelAction travelAction = SchemaOrg.travelAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(travelAction));
    assertEquals(travelAction, thing);
  }
  @Test public void testHotelRoom() throws IOException {
    final HotelRoom hotelRoom = SchemaOrg.hotelRoom()
      .numberOfRooms(42)
      .permittedUsage("Test String")
      .petsAllowed(true)
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hotelRoom));
    assertEquals(hotelRoom, thing);
  }
  @Test public void testWPHeader() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wPHeader));
    assertEquals(wPHeader, thing);
  }
  @Test public void testBusinessAudience() throws IOException {
    final BusinessAudience businessAudience = SchemaOrg.businessAudience()
      .audienceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(businessAudience));
    assertEquals(businessAudience, thing);
  }
  @Test public void testDatasetClass() throws IOException {
    final DatasetClass datasetClass = SchemaOrg.datasetClass()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(datasetClass));
    assertEquals(datasetClass, thing);
  }
  @Test public void testJobPosting() throws IOException {
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
      .validThrough(NOW)
      .workHours("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(jobPosting));
    assertEquals(jobPosting, thing);
  }
  @Test public void testMotel() throws IOException {
    final Motel motel = SchemaOrg.motel()
      .checkinTime(NOW)
      .checkoutTime(NOW)
      .petsAllowed(true)
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(motel));
    assertEquals(motel, thing);
  }
  @Test public void testSportsOrganization() throws IOException {
    final SportsOrganization sportsOrganization = SchemaOrg.sportsOrganization()
      .sport("Test String")
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportsOrganization));
    assertEquals(sportsOrganization, thing);
  }
  @Test public void testDeactivateAction() throws IOException {
    final DeactivateAction deactivateAction = SchemaOrg.deactivateAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(deactivateAction));
    assertEquals(deactivateAction, thing);
  }
  @Test public void testUserLikes() throws IOException {
    final UserLikes userLikes = SchemaOrg.userLikes()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userLikes));
    assertEquals(userLikes, thing);
  }
  @Test public void testParentAudience() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(parentAudience));
    assertEquals(parentAudience, thing);
  }
  @Test public void testHighSchool() throws IOException {
    final HighSchool highSchool = SchemaOrg.highSchool()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(highSchool));
    assertEquals(highSchool, thing);
  }
  @Test public void testDistance() throws IOException {
    final Distance distance = SchemaOrg.distance()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(distance));
    assertEquals(distance, thing);
  }
  @Test public void testDonateAction() throws IOException {
    final DonateAction donateAction = SchemaOrg.donateAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(donateAction));
    assertEquals(donateAction, thing);
  }
  @Test public void testStackExchange() throws IOException {
    final StackExchange stackExchange = SchemaOrg.stackExchange()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(stackExchange));
    assertEquals(stackExchange, thing);
  }
  @Test public void testGolfCourse() throws IOException {
    final GolfCourse golfCourse = SchemaOrg.golfCourse()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(golfCourse));
    assertEquals(golfCourse, thing);
  }
  @Test public void testMobilePhoneStore() throws IOException {
    final MobilePhoneStore mobilePhoneStore = SchemaOrg.mobilePhoneStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mobilePhoneStore));
    assertEquals(mobilePhoneStore, thing);
  }
  @Test public void testSomeProducts() throws IOException {
    final SomeProducts someProducts = SchemaOrg.someProducts()
      .award("Test String")
      .category("Test String")
      .color("Test String")
      .mpn("Test String")
      .releaseDate(NOW)
      .productionDate(NOW)
      .purchaseDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(someProducts));
    assertEquals(someProducts, thing);
  }
  @Test public void testContactPoint() throws IOException {
    final ContactPoint contactPoint = SchemaOrg.contactPoint()
      .contactType("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .telephone("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(contactPoint));
    assertEquals(contactPoint, thing);
  }
  @Test public void testSportsClub() throws IOException {
    final SportsClub sportsClub = SchemaOrg.sportsClub()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(sportsClub));
    assertEquals(sportsClub, thing);
  }
  @Test public void testPerformAction() throws IOException {
    final PerformAction performAction = SchemaOrg.performAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(performAction));
    assertEquals(performAction, thing);
  }
  @Test public void testDanceGroup() throws IOException {
    final DanceGroup danceGroup = SchemaOrg.danceGroup()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(danceGroup));
    assertEquals(danceGroup, thing);
  }
  @Test public void testLegislativeBuilding() throws IOException {
    final LegislativeBuilding legislativeBuilding = SchemaOrg.legislativeBuilding()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(legislativeBuilding));
    assertEquals(legislativeBuilding, thing);
  }
  @Test public void testCourse() throws IOException {
    final Course course = SchemaOrg.course()
      .courseCode("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(course));
    assertEquals(course, thing);
  }
  @Test public void testSoftwareApplicationBuild() throws IOException {
    final SoftwareApplicationBuild softwareApplicationBuild = SchemaOrg.softwareApplicationBuild()
      .message("Test String")
      .totalTestsCount(42)
      .successTestsCount(42)
      .failedTestsCount(42)
      .newlyFailedTestsCount(42)
      .ignoredTestsCount(42)
      .fixedTestsCount(42)
      .applicationCategory("Test String")
      .applicationSubCategory("Test String")
      .applicationSuite("Test String")
      .countriesNotSupported("Test String")
      .countriesSupported("Test String")
      .availableOnDevice("Test String")
      .downloadUrl("Test String")
      .featureList("Test String")
      .fileSize("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(softwareApplicationBuild));
    assertEquals(softwareApplicationBuild, thing);
  }
  @Test public void testInformAction() throws IOException {
    final InformAction informAction = SchemaOrg.informAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(informAction));
    assertEquals(informAction, thing);
  }
  @Test public void testEducationEvent() throws IOException {
    final EducationEvent educationEvent = SchemaOrg.educationEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(educationEvent));
    assertEquals(educationEvent, thing);
  }
  @Test public void testFireStation() throws IOException {
    final FireStation fireStation = SchemaOrg.fireStation()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(fireStation));
    assertEquals(fireStation, thing);
  }
  @Test public void testRNews() throws IOException {
    final RNews rNews = SchemaOrg.rNews()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rNews));
    assertEquals(rNews, thing);
  }
  @Test public void testEngineSpecification() throws IOException {
    final EngineSpecification engineSpecification = SchemaOrg.engineSpecification()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(engineSpecification));
    assertEquals(engineSpecification, thing);
  }
  @Test public void testFlight() throws IOException {
    final Flight flight = SchemaOrg.flight()
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(flight));
    assertEquals(flight, thing);
  }
  @Test public void testIntangible() throws IOException {
    final Intangible intangible = SchemaOrg.intangible()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(intangible));
    assertEquals(intangible, thing);
  }
  @Test public void testRightHandDriving() throws IOException {
    final RightHandDriving rightHandDriving = SchemaOrg.rightHandDriving()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rightHandDriving));
    assertEquals(rightHandDriving, thing);
  }
  @Test public void testReplyAction() throws IOException {
    final ReplyAction replyAction = SchemaOrg.replyAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(replyAction));
    assertEquals(replyAction, thing);
  }
  @Test public void testSubscribeAction() throws IOException {
    final SubscribeAction subscribeAction = SchemaOrg.subscribeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(subscribeAction));
    assertEquals(subscribeAction, thing);
  }
  @Test public void testPhysician() throws IOException {
    final Physician physician = SchemaOrg.physician()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(physician));
    assertEquals(physician, thing);
  }
  @Test public void testAPIReference() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(aPIReference));
    assertEquals(aPIReference, thing);
  }
  @Test public void testEmailMessage() throws IOException {
    final EmailMessage emailMessage = SchemaOrg.emailMessage()
      .dateRead(NOW)
      .dateReceived(NOW)
      .dateSent(NOW)
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(emailMessage));
    assertEquals(emailMessage, thing);
  }
  @Test public void testSuite() throws IOException {
    final Suite suite = SchemaOrg.suite()
      .numberOfRooms(42)
      .permittedUsage("Test String")
      .petsAllowed(true)
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(suite));
    assertEquals(suite, thing);
  }
  @Test public void testPropertyValueSpecification() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(propertyValueSpecification));
    assertEquals(propertyValueSpecification, thing);
  }
  @Test public void testScreeningEvent() throws IOException {
    final ScreeningEvent screeningEvent = SchemaOrg.screeningEvent()
      .videoFormat("Test String")
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(screeningEvent));
    assertEquals(screeningEvent, thing);
  }
  @Test public void testOutletStore() throws IOException {
    final OutletStore outletStore = SchemaOrg.outletStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(outletStore));
    assertEquals(outletStore, thing);
  }
  @Test public void testWatchAction() throws IOException {
    final WatchAction watchAction = SchemaOrg.watchAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(watchAction));
    assertEquals(watchAction, thing);
  }
  @Test public void testIgnoreAction() throws IOException {
    final IgnoreAction ignoreAction = SchemaOrg.ignoreAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(ignoreAction));
    assertEquals(ignoreAction, thing);
  }
  @Test public void testUnitPriceSpecification() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(unitPriceSpecification));
    assertEquals(unitPriceSpecification, thing);
  }
  @Test public void testSeries() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(series));
    assertEquals(series, thing);
  }
  @Test public void testDriveWheelConfigurationValue() throws IOException {
    final DriveWheelConfigurationValue driveWheelConfigurationValue = SchemaOrg.driveWheelConfigurationValue()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(driveWheelConfigurationValue));
    assertEquals(driveWheelConfigurationValue, thing);
  }
  @Test public void testHostel() throws IOException {
    final Hostel hostel = SchemaOrg.hostel()
      .checkinTime(NOW)
      .checkoutTime(NOW)
      .petsAllowed(true)
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hostel));
    assertEquals(hostel, thing);
  }
  @Test public void testScholarlyArticle() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(scholarlyArticle));
    assertEquals(scholarlyArticle, thing);
  }
  @Test public void testWPAdBlock() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wPAdBlock));
    assertEquals(wPAdBlock, thing);
  }
  @Test public void testBikeStore() throws IOException {
    final BikeStore bikeStore = SchemaOrg.bikeStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bikeStore));
    assertEquals(bikeStore, thing);
  }
  @Test public void testNightClub() throws IOException {
    final NightClub nightClub = SchemaOrg.nightClub()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(nightClub));
    assertEquals(nightClub, thing);
  }
  @Test public void testPond() throws IOException {
    final Pond pond = SchemaOrg.pond()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(pond));
    assertEquals(pond, thing);
  }
  @Test public void testTVSeries() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tVSeries));
    assertEquals(tVSeries, thing);
  }
  @Test public void testCreativeWorkSeason() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(creativeWorkSeason));
    assertEquals(creativeWorkSeason, thing);
  }
  @Test public void testBankOrCreditUnion() throws IOException {
    final BankOrCreditUnion bankOrCreditUnion = SchemaOrg.bankOrCreditUnion()
      .feesAndCommissionsSpecification("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bankOrCreditUnion));
    assertEquals(bankOrCreditUnion, thing);
  }
  @Test public void testRealEstateAgent() throws IOException {
    final RealEstateAgent realEstateAgent = SchemaOrg.realEstateAgent()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(realEstateAgent));
    assertEquals(realEstateAgent, thing);
  }
  @Test public void testElectronicsStore() throws IOException {
    final ElectronicsStore electronicsStore = SchemaOrg.electronicsStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(electronicsStore));
    assertEquals(electronicsStore, thing);
  }
  @Test public void testRearWheelDriveConfiguration() throws IOException {
    final RearWheelDriveConfiguration rearWheelDriveConfiguration = SchemaOrg.rearWheelDriveConfiguration()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rearWheelDriveConfiguration));
    assertEquals(rearWheelDriveConfiguration, thing);
  }
  @Test public void testHealthAndBeautyBusiness() throws IOException {
    final HealthAndBeautyBusiness healthAndBeautyBusiness = SchemaOrg.healthAndBeautyBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(healthAndBeautyBusiness));
    assertEquals(healthAndBeautyBusiness, thing);
  }
  @Test public void testResearcher() throws IOException {
    final Researcher researcher = SchemaOrg.researcher()
      .audienceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(researcher));
    assertEquals(researcher, thing);
  }
  @Test public void testVoteAction() throws IOException {
    final VoteAction voteAction = SchemaOrg.voteAction()
      .actionOption("Test String")
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(voteAction));
    assertEquals(voteAction, thing);
  }
  @Test public void testProject() throws IOException {
    final Project project = SchemaOrg.project()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(project));
    assertEquals(project, thing);
  }
  @Test public void testRadioClip() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioClip));
    assertEquals(radioClip, thing);
  }
  @Test public void testVideoObject() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(videoObject));
    assertEquals(videoObject, thing);
  }
  @Test public void testPermit() throws IOException {
    final Permit permit = SchemaOrg.permit()
      .validFrom(NOW)
      .validUntil(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(permit));
    assertEquals(permit, thing);
  }
  @Test public void testComment() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(comment));
    assertEquals(comment, thing);
  }
  @Test public void testGeoCircle() throws IOException {
    final GeoCircle geoCircle = SchemaOrg.geoCircle()
      .box("Test String")
      .circle("Test String")
      .elevation(42)
      .line("Test String")
      .polygon("Test String")
      .postalCode("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(geoCircle));
    assertEquals(geoCircle, thing);
  }
  @Test public void testDeliveryEvent() throws IOException {
    final DeliveryEvent deliveryEvent = SchemaOrg.deliveryEvent()
      .accessCode("Test String")
      .availableFrom(NOW)
      .availableThrough(NOW)
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(deliveryEvent));
    assertEquals(deliveryEvent, thing);
  }
  @Test public void testFindAction() throws IOException {
    final FindAction findAction = SchemaOrg.findAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(findAction));
    assertEquals(findAction, thing);
  }
  @Test public void testBeautySalon() throws IOException {
    final BeautySalon beautySalon = SchemaOrg.beautySalon()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(beautySalon));
    assertEquals(beautySalon, thing);
  }
  @Test public void testBedAndBreakfast() throws IOException {
    final BedAndBreakfast bedAndBreakfast = SchemaOrg.bedAndBreakfast()
      .checkinTime(NOW)
      .checkoutTime(NOW)
      .petsAllowed(true)
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bedAndBreakfast));
    assertEquals(bedAndBreakfast, thing);
  }
  @Test public void testAboutPage() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(aboutPage));
    assertEquals(aboutPage, thing);
  }
  @Test public void testMiddleSchool() throws IOException {
    final MiddleSchool middleSchool = SchemaOrg.middleSchool()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(middleSchool));
    assertEquals(middleSchool, thing);
  }
  @Test public void testOrganization() throws IOException {
    final Organization organization = SchemaOrg.organization()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(organization));
    assertEquals(organization, thing);
  }
  @Test public void testSynagogue() throws IOException {
    final Synagogue synagogue = SchemaOrg.synagogue()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(synagogue));
    assertEquals(synagogue, thing);
  }
  @Test public void testAutomatedTeller() throws IOException {
    final AutomatedTeller automatedTeller = SchemaOrg.automatedTeller()
      .feesAndCommissionsSpecification("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(automatedTeller));
    assertEquals(automatedTeller, thing);
  }
  @Test public void testDataFeedItem() throws IOException {
    final DataFeedItem dataFeedItem = SchemaOrg.dataFeedItem()
      .dateDeleted(NOW)
      .dateModified(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dataFeedItem));
    assertEquals(dataFeedItem, thing);
  }
  @Test public void testQualitativeValue() throws IOException {
    final QualitativeValue qualitativeValue = SchemaOrg.qualitativeValue()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(qualitativeValue));
    assertEquals(qualitativeValue, thing);
  }
  @Test public void testAggregateRating() throws IOException {
    final AggregateRating aggregateRating = SchemaOrg.aggregateRating()
      .ratingCount(42)
      .reviewCount(42)
      .bestRating(42)
      .worstRating(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(aggregateRating));
    assertEquals(aggregateRating, thing);
  }
  @Test public void testAlignmentObject() throws IOException {
    final AlignmentObject alignmentObject = SchemaOrg.alignmentObject()
      .alignmentType("Test String")
      .educationalFramework("Test String")
      .targetDescription("Test String")
      .targetName("Test String")
      .targetUrl("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(alignmentObject));
    assertEquals(alignmentObject, thing);
  }
  @Test public void testPerformingArtsTheater() throws IOException {
    final PerformingArtsTheater performingArtsTheater = SchemaOrg.performingArtsTheater()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(performingArtsTheater));
    assertEquals(performingArtsTheater, thing);
  }
  @Test public void testRentalCarReservation() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rentalCarReservation));
    assertEquals(rentalCarReservation, thing);
  }
  @Test public void testMotorcycleRepair() throws IOException {
    final MotorcycleRepair motorcycleRepair = SchemaOrg.motorcycleRepair()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(motorcycleRepair));
    assertEquals(motorcycleRepair, thing);
  }
  @Test public void testElementarySchool() throws IOException {
    final ElementarySchool elementarySchool = SchemaOrg.elementarySchool()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(elementarySchool));
    assertEquals(elementarySchool, thing);
  }
  @Test public void testSearchResultsPage() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(searchResultsPage));
    assertEquals(searchResultsPage, thing);
  }
  @Test public void testWinery() throws IOException {
    final Winery winery = SchemaOrg.winery()
      .acceptsReservations(true)
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(winery));
    assertEquals(winery, thing);
  }
  @Test public void testAggregateOffer() throws IOException {
    final AggregateOffer aggregateOffer = SchemaOrg.aggregateOffer()
      .highPrice(42)
      .lowPrice(42)
      .offerCount(42)
      .availabilityEnds(NOW)
      .availabilityStarts(NOW)
      .category("Test String")
      .mpn("Test String")
      .price(42)
      .priceValidUntil(NOW)
      .validFrom(NOW)
      .validThrough(NOW)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(aggregateOffer));
    assertEquals(aggregateOffer, thing);
  }
  @Test public void testAction() throws IOException {
    final Action action = SchemaOrg.action()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(action));
    assertEquals(action, thing);
  }
  @Test public void testDrawAction() throws IOException {
    final DrawAction drawAction = SchemaOrg.drawAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drawAction));
    assertEquals(drawAction, thing);
  }
  @Test public void testDislikeAction() throws IOException {
    final DislikeAction dislikeAction = SchemaOrg.dislikeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dislikeAction));
    assertEquals(dislikeAction, thing);
  }
  @Test public void testBridge() throws IOException {
    final Bridge bridge = SchemaOrg.bridge()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bridge));
    assertEquals(bridge, thing);
  }
  @Test public void testLegalService() throws IOException {
    final LegalService legalService = SchemaOrg.legalService()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(legalService));
    assertEquals(legalService, thing);
  }
  @Test public void testMass() throws IOException {
    final Mass mass = SchemaOrg.mass()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mass));
    assertEquals(mass, thing);
  }
  @Test public void testLRMIClass() throws IOException {
    final LRMIClass lRMIClass = SchemaOrg.lRMIClass()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lRMIClass));
    assertEquals(lRMIClass, thing);
  }
  @Test public void testMusicGroup() throws IOException {
    final MusicGroup musicGroup = SchemaOrg.musicGroup()
      .genre("Test String")
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicGroup));
    assertEquals(musicGroup, thing);
  }
  @Test public void testMeetingRoom() throws IOException {
    final MeetingRoom meetingRoom = SchemaOrg.meetingRoom()
      .numberOfRooms(42)
      .permittedUsage("Test String")
      .petsAllowed(true)
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(meetingRoom));
    assertEquals(meetingRoom, thing);
  }
  @Test public void testJewelryStore() throws IOException {
    final JewelryStore jewelryStore = SchemaOrg.jewelryStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(jewelryStore));
    assertEquals(jewelryStore, thing);
  }
  @Test public void testNutritionInformation() throws IOException {
    final NutritionInformation nutritionInformation = SchemaOrg.nutritionInformation()
      .servingSize("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(nutritionInformation));
    assertEquals(nutritionInformation, thing);
  }
  @Test public void testSelfStorage() throws IOException {
    final SelfStorage selfStorage = SchemaOrg.selfStorage()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(selfStorage));
    assertEquals(selfStorage, thing);
  }
  @Test public void testTaxiService() throws IOException {
    final TaxiService taxiService = SchemaOrg.taxiService()
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(taxiService));
    assertEquals(taxiService, thing);
  }
  @Test public void testService() throws IOException {
    final Service service = SchemaOrg.service()
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(service));
    assertEquals(service, thing);
  }
  @Test public void testPerformanceRole() throws IOException {
    final PerformanceRole performanceRole = SchemaOrg.performanceRole()
      .characterName("Test String")
      .startDate(NOW)
      .roleName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(performanceRole));
    assertEquals(performanceRole, thing);
  }
  @Test public void testCourthouse() throws IOException {
    final Courthouse courthouse = SchemaOrg.courthouse()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(courthouse));
    assertEquals(courthouse, thing);
  }
  @Test public void testCableOrSatelliteService() throws IOException {
    final CableOrSatelliteService cableOrSatelliteService = SchemaOrg.cableOrSatelliteService()
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(cableOrSatelliteService));
    assertEquals(cableOrSatelliteService, thing);
  }
  @Test public void testBrand() throws IOException {
    final Brand brand = SchemaOrg.brand()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(brand));
    assertEquals(brand, thing);
  }
  @Test public void testQuoteAction() throws IOException {
    final QuoteAction quoteAction = SchemaOrg.quoteAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(quoteAction));
    assertEquals(quoteAction, thing);
  }
  @Test public void testMusicRelease() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicRelease));
    assertEquals(musicRelease, thing);
  }
  @Test public void testTennisComplex() throws IOException {
    final TennisComplex tennisComplex = SchemaOrg.tennisComplex()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tennisComplex));
    assertEquals(tennisComplex, thing);
  }
  @Test public void testCommentAction() throws IOException {
    final CommentAction commentAction = SchemaOrg.commentAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(commentAction));
    assertEquals(commentAction, thing);
  }
  @Test public void testWPSideBar() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wPSideBar));
    assertEquals(wPSideBar, thing);
  }
  @Test public void testFlorist() throws IOException {
    final Florist florist = SchemaOrg.florist()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(florist));
    assertEquals(florist, thing);
  }
  @Test public void testInstallAction() throws IOException {
    final InstallAction installAction = SchemaOrg.installAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(installAction));
    assertEquals(installAction, thing);
  }
  @Test public void testMenu() throws IOException {
    final Menu menu = SchemaOrg.menu()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(menu));
    assertEquals(menu, thing);
  }
  @Test public void testAutoWash() throws IOException {
    final AutoWash autoWash = SchemaOrg.autoWash()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoWash));
    assertEquals(autoWash, thing);
  }
  @Test public void testBreadcrumbList() throws IOException {
    final BreadcrumbList breadcrumbList = SchemaOrg.breadcrumbList()
      .numberOfItems(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(breadcrumbList));
    assertEquals(breadcrumbList, thing);
  }
  @Test public void testPhotographAction() throws IOException {
    final PhotographAction photographAction = SchemaOrg.photographAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(photographAction));
    assertEquals(photographAction, thing);
  }
  @Test public void testPlayground() throws IOException {
    final Playground playground = SchemaOrg.playground()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(playground));
    assertEquals(playground, thing);
  }
  @Test public void testCivicStructure() throws IOException {
    final CivicStructure civicStructure = SchemaOrg.civicStructure()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(civicStructure));
    assertEquals(civicStructure, thing);
  }
  @Test public void testTieAction() throws IOException {
    final TieAction tieAction = SchemaOrg.tieAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tieAction));
    assertEquals(tieAction, thing);
  }
  @Test public void testFrontWheelDriveConfiguration() throws IOException {
    final FrontWheelDriveConfiguration frontWheelDriveConfiguration = SchemaOrg.frontWheelDriveConfiguration()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(frontWheelDriveConfiguration));
    assertEquals(frontWheelDriveConfiguration, thing);
  }
  @Test public void testGameServer() throws IOException {
    final GameServer gameServer = SchemaOrg.gameServer()
      .playersOnline(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(gameServer));
    assertEquals(gameServer, thing);
  }
  @Test public void testInviteAction() throws IOException {
    final InviteAction inviteAction = SchemaOrg.inviteAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(inviteAction));
    assertEquals(inviteAction, thing);
  }
  @Test public void testLocalBusiness() throws IOException {
    final LocalBusiness localBusiness = SchemaOrg.localBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(localBusiness));
    assertEquals(localBusiness, thing);
  }
  @Test public void testReservationPackage() throws IOException {
    final ReservationPackage reservationPackage = SchemaOrg.reservationPackage()
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reservationPackage));
    assertEquals(reservationPackage, thing);
  }
  @Test public void testTaxi() throws IOException {
    final Taxi taxi = SchemaOrg.taxi()
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(taxi));
    assertEquals(taxi, thing);
  }
  @Test public void testTattooParlor() throws IOException {
    final TattooParlor tattooParlor = SchemaOrg.tattooParlor()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tattooParlor));
    assertEquals(tattooParlor, thing);
  }
  @Test public void testCasino() throws IOException {
    final Casino casino = SchemaOrg.casino()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(casino));
    assertEquals(casino, thing);
  }
  @Test public void testPerson() throws IOException {
    final Person person = SchemaOrg.person()
      .additionalName("Test String")
      .award("Test String")
      .birthDate(NOW)
      .deathDate(NOW)
      .email("Test String")
      .familyName("Test String")
      .faxNumber("Test String")
      .givenName("Test String")
      .honorificPrefix("Test String")
      .honorificSuffix("Test String")
      .isicV4("Test String")
      .jobTitle("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(person));
    assertEquals(person, thing);
  }
  @Test public void testMotorcycleDealer() throws IOException {
    final MotorcycleDealer motorcycleDealer = SchemaOrg.motorcycleDealer()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(motorcycleDealer));
    assertEquals(motorcycleDealer, thing);
  }
  @Test public void testSingleFamilyResidence() throws IOException {
    final SingleFamilyResidence singleFamilyResidence = SchemaOrg.singleFamilyResidence()
      .numberOfRooms(42)
      .permittedUsage("Test String")
      .petsAllowed(true)
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(singleFamilyResidence));
    assertEquals(singleFamilyResidence, thing);
  }
  @Test public void testTrainTrip() throws IOException {
    final TrainTrip trainTrip = SchemaOrg.trainTrip()
      .departureTime(NOW)
      .arrivalTime(NOW)
      .trainNumber("Test String")
      .trainName("Test String")
      .departurePlatform("Test String")
      .arrivalPlatform("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(trainTrip));
    assertEquals(trainTrip, thing);
  }
  @Test public void testTouristAttraction() throws IOException {
    final TouristAttraction touristAttraction = SchemaOrg.touristAttraction()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(touristAttraction));
    assertEquals(touristAttraction, thing);
  }
  @Test public void testAudience() throws IOException {
    final Audience audience = SchemaOrg.audience()
      .audienceType("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(audience));
    assertEquals(audience, thing);
  }
  @Test public void testPaymentChargeSpecification() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(paymentChargeSpecification));
    assertEquals(paymentChargeSpecification, thing);
  }
  @Test public void testActionCollabClass() throws IOException {
    final ActionCollabClass actionCollabClass = SchemaOrg.actionCollabClass()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(actionCollabClass));
    assertEquals(actionCollabClass, thing);
  }
  @Test public void testMovingCompany() throws IOException {
    final MovingCompany movingCompany = SchemaOrg.movingCompany()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(movingCompany));
    assertEquals(movingCompany, thing);
  }
  @Test public void testBusStation() throws IOException {
    final BusStation busStation = SchemaOrg.busStation()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(busStation));
    assertEquals(busStation, thing);
  }
  @Test public void testBakery() throws IOException {
    final Bakery bakery = SchemaOrg.bakery()
      .acceptsReservations(true)
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bakery));
    assertEquals(bakery, thing);
  }
  @Test public void testLiveBlogPosting() throws IOException {
    final LiveBlogPosting liveBlogPosting = SchemaOrg.liveBlogPosting()
      .coverageStartTime(NOW)
      .coverageEndTime(NOW)
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(liveBlogPosting));
    assertEquals(liveBlogPosting, thing);
  }
  @Test public void testItemList() throws IOException {
    final ItemList itemList = SchemaOrg.itemList()
      .numberOfItems(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(itemList));
    assertEquals(itemList, thing);
  }
  @Test public void testGoodRelationsClass() throws IOException {
    final GoodRelationsClass goodRelationsClass = SchemaOrg.goodRelationsClass()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(goodRelationsClass));
    assertEquals(goodRelationsClass, thing);
  }
  @Test public void testConfirmAction() throws IOException {
    final ConfirmAction confirmAction = SchemaOrg.confirmAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(confirmAction));
    assertEquals(confirmAction, thing);
  }
  @Test public void testLeaveAction() throws IOException {
    final LeaveAction leaveAction = SchemaOrg.leaveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(leaveAction));
    assertEquals(leaveAction, thing);
  }
  @Test public void testUserComments() throws IOException {
    final UserComments userComments = SchemaOrg.userComments()
      .commentText("Test String")
      .commentTime(NOW)
      .replyToUrl("Test String")
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userComments));
    assertEquals(userComments, thing);
  }
  @Test public void testAssignAction() throws IOException {
    final AssignAction assignAction = SchemaOrg.assignAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(assignAction));
    assertEquals(assignAction, thing);
  }
  @Test public void testLikeAction() throws IOException {
    final LikeAction likeAction = SchemaOrg.likeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(likeAction));
    assertEquals(likeAction, thing);
  }
  @Test public void testReview() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(review));
    assertEquals(review, thing);
  }
  @Test public void testIceCreamShop() throws IOException {
    final IceCreamShop iceCreamShop = SchemaOrg.iceCreamShop()
      .acceptsReservations(true)
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(iceCreamShop));
    assertEquals(iceCreamShop, thing);
  }
  @Test public void testPeopleAudience() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(peopleAudience));
    assertEquals(peopleAudience, thing);
  }
  @Test public void testAirline() throws IOException {
    final Airline airline = SchemaOrg.airline()
      .iataCode("Test String")
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(airline));
    assertEquals(airline, thing);
  }
  @Test public void testMessage() throws IOException {
    final Message message = SchemaOrg.message()
      .dateRead(NOW)
      .dateReceived(NOW)
      .dateSent(NOW)
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(message));
    assertEquals(message, thing);
  }
  @Test public void testTable() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(table));
    assertEquals(table, thing);
  }
  @Test public void testElectrician() throws IOException {
    final Electrician electrician = SchemaOrg.electrician()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(electrician));
    assertEquals(electrician, thing);
  }
  @Test public void testComedyEvent() throws IOException {
    final ComedyEvent comedyEvent = SchemaOrg.comedyEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(comedyEvent));
    assertEquals(comedyEvent, thing);
  }
  @Test public void testUserPlusOnes() throws IOException {
    final UserPlusOnes userPlusOnes = SchemaOrg.userPlusOnes()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userPlusOnes));
    assertEquals(userPlusOnes, thing);
  }
  @Test public void testEnumeration() throws IOException {
    final Enumeration enumeration = SchemaOrg.enumeration()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(enumeration));
    assertEquals(enumeration, thing);
  }
  @Test public void testRVPark() throws IOException {
    final RVPark rVPark = SchemaOrg.rVPark()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(rVPark));
    assertEquals(rVPark, thing);
  }
  @Test public void testDryCleaningOrLaundry() throws IOException {
    final DryCleaningOrLaundry dryCleaningOrLaundry = SchemaOrg.dryCleaningOrLaundry()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dryCleaningOrLaundry));
    assertEquals(dryCleaningOrLaundry, thing);
  }
  @Test public void testTVEpisode() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tVEpisode));
    assertEquals(tVEpisode, thing);
  }
  @Test public void testAppendAction() throws IOException {
    final AppendAction appendAction = SchemaOrg.appendAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(appendAction));
    assertEquals(appendAction, thing);
  }
  @Test public void testMobileApplication() throws IOException {
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
      .fileSize("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mobileApplication));
    assertEquals(mobileApplication, thing);
  }
  @Test public void testTrainStation() throws IOException {
    final TrainStation trainStation = SchemaOrg.trainStation()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(trainStation));
    assertEquals(trainStation, thing);
  }
  @Test public void testTheaterEvent() throws IOException {
    final TheaterEvent theaterEvent = SchemaOrg.theaterEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(theaterEvent));
    assertEquals(theaterEvent, thing);
  }
  @Test public void testMenuItem() throws IOException {
    final MenuItem menuItem = SchemaOrg.menuItem()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(menuItem));
    assertEquals(menuItem, thing);
  }
  @Test public void testReceiveAction() throws IOException {
    final ReceiveAction receiveAction = SchemaOrg.receiveAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(receiveAction));
    assertEquals(receiveAction, thing);
  }
  @Test public void testLoanOrCredit() throws IOException {
    final LoanOrCredit loanOrCredit = SchemaOrg.loanOrCredit()
      .requiredCollateral("Test String")
      .feesAndCommissionsSpecification("Test String")
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(loanOrCredit));
    assertEquals(loanOrCredit, thing);
  }
  @Test public void testDanceEvent() throws IOException {
    final DanceEvent danceEvent = SchemaOrg.danceEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(danceEvent));
    assertEquals(danceEvent, thing);
  }
  @Test public void testDaySpa() throws IOException {
    final DaySpa daySpa = SchemaOrg.daySpa()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(daySpa));
    assertEquals(daySpa, thing);
  }
  @Test public void testTakeAction() throws IOException {
    final TakeAction takeAction = SchemaOrg.takeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(takeAction));
    assertEquals(takeAction, thing);
  }
  @Test public void testDisagreeAction() throws IOException {
    final DisagreeAction disagreeAction = SchemaOrg.disagreeAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(disagreeAction));
    assertEquals(disagreeAction, thing);
  }
  @Test public void testDataset() throws IOException {
    final Dataset dataset = SchemaOrg.dataset()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(dataset));
    assertEquals(dataset, thing);
  }
  @Test public void testQuestion() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(question));
    assertEquals(question, thing);
  }
  @Test public void testPlayAction() throws IOException {
    final PlayAction playAction = SchemaOrg.playAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(playAction));
    assertEquals(playAction, thing);
  }
  @Test public void testOffer() throws IOException {
    final Offer offer = SchemaOrg.offer()
      .availabilityEnds(NOW)
      .availabilityStarts(NOW)
      .category("Test String")
      .mpn("Test String")
      .price(42)
      .priceValidUntil(NOW)
      .validFrom(NOW)
      .validThrough(NOW)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(offer));
    assertEquals(offer, thing);
  }
  @Test public void testQuantity() throws IOException {
    final Quantity quantity = SchemaOrg.quantity()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(quantity));
    assertEquals(quantity, thing);
  }
  @Test public void testAnswer() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(answer));
    assertEquals(answer, thing);
  }
  @Test public void testClip() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(clip));
    assertEquals(clip, thing);
  }
  @Test public void testPreschool() throws IOException {
    final Preschool preschool = SchemaOrg.preschool()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(preschool));
    assertEquals(preschool, thing);
  }
  @Test public void testAudioObject() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(audioObject));
    assertEquals(audioObject, thing);
  }
  @Test public void testEmployeeRole() throws IOException {
    final EmployeeRole employeeRole = SchemaOrg.employeeRole()
      .salaryCurrency("Test String")
      .numberedPosition(42)
      .startDate(NOW)
      .roleName("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(employeeRole));
    assertEquals(employeeRole, thing);
  }
  @Test public void testFoodEstablishmentReservation() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(foodEstablishmentReservation));
    assertEquals(foodEstablishmentReservation, thing);
  }
  @Test public void testPlumber() throws IOException {
    final Plumber plumber = SchemaOrg.plumber()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(plumber));
    assertEquals(plumber, thing);
  }
  @Test public void testMediaObject() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(mediaObject));
    assertEquals(mediaObject, thing);
  }
  @Test public void testVideoGameClip() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(videoGameClip));
    assertEquals(videoGameClip, thing);
  }
  @Test public void testFoodEstablishment() throws IOException {
    final FoodEstablishment foodEstablishment = SchemaOrg.foodEstablishment()
      .acceptsReservations(true)
      .servesCuisine("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(foodEstablishment));
    assertEquals(foodEstablishment, thing);
  }
  @Test public void testFollowAction() throws IOException {
    final FollowAction followAction = SchemaOrg.followAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(followAction));
    assertEquals(followAction, thing);
  }
  @Test public void testBuyAction() throws IOException {
    final BuyAction buyAction = SchemaOrg.buyAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(buyAction));
    assertEquals(buyAction, thing);
  }
  @Test public void testPriceSpecification() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(priceSpecification));
    assertEquals(priceSpecification, thing);
  }
  @Test public void testSeaBodyOfWater() throws IOException {
    final SeaBodyOfWater seaBodyOfWater = SchemaOrg.seaBodyOfWater()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(seaBodyOfWater));
    assertEquals(seaBodyOfWater, thing);
  }
  @Test public void testNotary() throws IOException {
    final Notary notary = SchemaOrg.notary()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(notary));
    assertEquals(notary, thing);
  }
  @Test public void testPostalAddress() throws IOException {
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
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(postalAddress));
    assertEquals(postalAddress, thing);
  }
  @Test public void testMusicVideoObject() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicVideoObject));
    assertEquals(musicVideoObject, thing);
  }
  @Test public void testTypeAndQuantityNode() throws IOException {
    final TypeAndQuantityNode typeAndQuantityNode = SchemaOrg.typeAndQuantityNode()
      .amountOfThisGood(42)
      .unitCode("Test String")
      .unitText("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(typeAndQuantityNode));
    assertEquals(typeAndQuantityNode, thing);
  }
  @Test public void testHinduTemple() throws IOException {
    final HinduTemple hinduTemple = SchemaOrg.hinduTemple()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hinduTemple));
    assertEquals(hinduTemple, thing);
  }
  @Test public void testBusReservation() throws IOException {
    final BusReservation busReservation = SchemaOrg.busReservation()
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(busReservation));
    assertEquals(busReservation, thing);
  }
  @Test public void testPaintAction() throws IOException {
    final PaintAction paintAction = SchemaOrg.paintAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(paintAction));
    assertEquals(paintAction, thing);
  }
  @Test public void testPark() throws IOException {
    final Park park = SchemaOrg.park()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(park));
    assertEquals(park, thing);
  }
  @Test public void testTipAction() throws IOException {
    final TipAction tipAction = SchemaOrg.tipAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tipAction));
    assertEquals(tipAction, thing);
  }
  @Test public void testGovernmentBuilding() throws IOException {
    final GovernmentBuilding governmentBuilding = SchemaOrg.governmentBuilding()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(governmentBuilding));
    assertEquals(governmentBuilding, thing);
  }
  @Test public void testUserTweets() throws IOException {
    final UserTweets userTweets = SchemaOrg.userTweets()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userTweets));
    assertEquals(userTweets, thing);
  }
  @Test public void testAssessAction() throws IOException {
    final AssessAction assessAction = SchemaOrg.assessAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(assessAction));
    assertEquals(assessAction, thing);
  }
  @Test public void testLiquorStore() throws IOException {
    final LiquorStore liquorStore = SchemaOrg.liquorStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(liquorStore));
    assertEquals(liquorStore, thing);
  }
  @Test public void testMusicStore() throws IOException {
    final MusicStore musicStore = SchemaOrg.musicStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(musicStore));
    assertEquals(musicStore, thing);
  }
  @Test public void testLocationFeatureSpecification() throws IOException {
    final LocationFeatureSpecification locationFeatureSpecification = SchemaOrg.locationFeatureSpecification()
      .validFrom(NOW)
      .validThrough(NOW)
      .minValue(42)
      .unitCode("Test String")
      .value(42)
      .unitText("Test String")
      .propertyID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(locationFeatureSpecification));
    assertEquals(locationFeatureSpecification, thing);
  }
  @Test public void testTechArticle() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(techArticle));
    assertEquals(techArticle, thing);
  }
  @Test public void testUseAction() throws IOException {
    final UseAction useAction = SchemaOrg.useAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(useAction));
    assertEquals(useAction, thing);
  }
  @Test public void testDuration() throws IOException {
    final Duration duration = SchemaOrg.duration()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(duration));
    assertEquals(duration, thing);
  }
  @Test public void testRecipe() throws IOException {
    final Recipe recipe = SchemaOrg.recipe()
      .cookingMethod("Test String")
      .recipeCategory("Test String")
      .recipeCuisine("Test String")
      .recipeIngredient("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(recipe));
    assertEquals(recipe, thing);
  }
  @Test public void testVideoGame() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(videoGame));
    assertEquals(videoGame, thing);
  }
  @Test public void testLendAction() throws IOException {
    final LendAction lendAction = SchemaOrg.lendAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(lendAction));
    assertEquals(lendAction, thing);
  }
  @Test public void testUserInteraction() throws IOException {
    final UserInteraction userInteraction = SchemaOrg.userInteraction()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(userInteraction));
    assertEquals(userInteraction, thing);
  }
  @Test public void testBookSeries() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bookSeries));
    assertEquals(bookSeries, thing);
  }
  @Test public void testGeoShape() throws IOException {
    final GeoShape geoShape = SchemaOrg.geoShape()
      .box("Test String")
      .circle("Test String")
      .elevation(42)
      .line("Test String")
      .polygon("Test String")
      .postalCode("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(geoShape));
    assertEquals(geoShape, thing);
  }
  @Test public void testItemPage() throws IOException {
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(itemPage));
    assertEquals(itemPage, thing);
  }
  @Test public void testTravelAgency() throws IOException {
    final TravelAgency travelAgency = SchemaOrg.travelAgency()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(travelAgency));
    assertEquals(travelAgency, thing);
  }
  @Test public void testEducationalOrganization() throws IOException {
    final EducationalOrganization educationalOrganization = SchemaOrg.educationalOrganization()
      .award("Test String")
      .email("Test String")
      .faxNumber("Test String")
      .dissolutionDate(NOW)
      .foundingDate(NOW)
      .isicV4("Test String")
      .legalName("Test String")
      .naics("Test String")
      .telephone("Test String")
      .vatID("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(educationalOrganization));
    assertEquals(educationalOrganization, thing);
  }
  @Test public void testWantAction() throws IOException {
    final WantAction wantAction = SchemaOrg.wantAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(wantAction));
    assertEquals(wantAction, thing);
  }
  @Test public void testTradeAction() throws IOException {
    final TradeAction tradeAction = SchemaOrg.tradeAction()
      .price(42)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(tradeAction));
    assertEquals(tradeAction, thing);
  }
  @Test public void testGovernmentService() throws IOException {
    final GovernmentService governmentService = SchemaOrg.governmentService()
      .award("Test String")
      .category("Test String")
      .serviceType("Test String")
      .providerMobility("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(governmentService));
    assertEquals(governmentService, thing);
  }
  @Test public void testFestival() throws IOException {
    final Festival festival = SchemaOrg.festival()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(festival));
    assertEquals(festival, thing);
  }
  @Test public void testJoinAction() throws IOException {
    final JoinAction joinAction = SchemaOrg.joinAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(joinAction));
    assertEquals(joinAction, thing);
  }
  @Test public void testHVACBusiness() throws IOException {
    final HVACBusiness hVACBusiness = SchemaOrg.hVACBusiness()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(hVACBusiness));
    assertEquals(hVACBusiness, thing);
  }
  @Test public void testAccountingService() throws IOException {
    final AccountingService accountingService = SchemaOrg.accountingService()
      .feesAndCommissionsSpecification("Test String")
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(accountingService));
    assertEquals(accountingService, thing);
  }
  @Test public void testPlace() throws IOException {
    final Place place = SchemaOrg.place()
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(place));
    assertEquals(place, thing);
  }
  @Test public void testSteeringPositionValue() throws IOException {
    final SteeringPositionValue steeringPositionValue = SchemaOrg.steeringPositionValue()
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(steeringPositionValue));
    assertEquals(steeringPositionValue, thing);
  }
  @Test public void testInternetCafe() throws IOException {
    final InternetCafe internetCafe = SchemaOrg.internetCafe()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(internetCafe));
    assertEquals(internetCafe, thing);
  }
  @Test public void testBorrowAction() throws IOException {
    final BorrowAction borrowAction = SchemaOrg.borrowAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(borrowAction));
    assertEquals(borrowAction, thing);
  }
  @Test public void testAskAction() throws IOException {
    final AskAction askAction = SchemaOrg.askAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(askAction));
    assertEquals(askAction, thing);
  }
  @Test public void testBusinessEvent() throws IOException {
    final BusinessEvent businessEvent = SchemaOrg.businessEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(businessEvent));
    assertEquals(businessEvent, thing);
  }
  @Test public void testDefenceEstablishment() throws IOException {
    final DefenceEstablishment defenceEstablishment = SchemaOrg.defenceEstablishment()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(defenceEstablishment));
    assertEquals(defenceEstablishment, thing);
  }
  @Test public void testSaleEvent() throws IOException {
    final SaleEvent saleEvent = SchemaOrg.saleEvent()
      .doorTime(NOW)
      .endDate(NOW)
      .isAccessibleForFree(true)
      .maximumAttendeeCapacity(42)
      .remainingAttendeeCapacity(42)
      .previousStartDate(NOW)
      .startDate(NOW)
      .typicalAgeRange("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(saleEvent));
    assertEquals(saleEvent, thing);
  }
  @Test public void testTaxiStand() throws IOException {
    final TaxiStand taxiStand = SchemaOrg.taxiStand()
      .openingHours("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(taxiStand));
    assertEquals(taxiStand, thing);
  }
  @Test public void testReport() throws IOException {
    final Report report = SchemaOrg.report()
      .reportNumber("Test String")
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(report));
    assertEquals(report, thing);
  }
  @Test public void testListenAction() throws IOException {
    final ListenAction listenAction = SchemaOrg.listenAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(listenAction));
    assertEquals(listenAction, thing);
  }
  @Test public void testBookStore() throws IOException {
    final BookStore bookStore = SchemaOrg.bookStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(bookStore));
    assertEquals(bookStore, thing);
  }
  @Test public void testToyStore() throws IOException {
    final ToyStore toyStore = SchemaOrg.toyStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(toyStore));
    assertEquals(toyStore, thing);
  }
  @Test public void testCampground() throws IOException {
    final Campground campground = SchemaOrg.campground()
      .checkinTime(NOW)
      .checkoutTime(NOW)
      .petsAllowed(true)
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(campground));
    assertEquals(campground, thing);
  }
  @Test public void testAutoPartsStore() throws IOException {
    final AutoPartsStore autoPartsStore = SchemaOrg.autoPartsStore()
      .currenciesAccepted("Test String")
      .openingHours("Test String")
      .paymentAccepted("Test String")
      .priceRange("Test String")
      .branchCode("Test String")
      .faxNumber("Test String")
      .isicV4("Test String")
      .maximumAttendeeCapacity(42)
      .telephone("Test String")
      .smokingAllowed(true)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(autoPartsStore));
    assertEquals(autoPartsStore, thing);
  }
  @Test public void testSpreadsheetDigitalDocument() throws IOException {
    final SpreadsheetDigitalDocument spreadsheetDigitalDocument = SchemaOrg.spreadsheetDigitalDocument()
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
      .fileFormat("Test String")
      .isAccessibleForFree(true)
      .genre("Test String")
      .headline("Test String")
      .interactivityType("Test String")
      .isFamilyFriendly(true)
      .keywords("Test String")
      .learningResourceType("Test String")
      .publishingPrinciples("Test String")
      .temporalCoverage("Test String")
      .text("Test String")
      .thumbnailUrl("Test String")
      .typicalAgeRange("Test String")
      .version(42)
      .commentCount(42)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(spreadsheetDigitalDocument));
    assertEquals(spreadsheetDigitalDocument, thing);
  }
  @Test public void testReservation() throws IOException {
    final Reservation reservation = SchemaOrg.reservation()
      .reservationId("Test String")
      .bookingTime(NOW)
      .modifiedTime(NOW)
      .totalPrice(42)
      .priceCurrency("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(reservation));
    assertEquals(reservation, thing);
  }
  @Test public void testProduct() throws IOException {
    final Product product = SchemaOrg.product()
      .award("Test String")
      .category("Test String")
      .color("Test String")
      .mpn("Test String")
      .releaseDate(NOW)
      .productionDate(NOW)
      .purchaseDate(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(product));
    assertEquals(product, thing);
  }
  @Test public void testDrinkAction() throws IOException {
    final DrinkAction drinkAction = SchemaOrg.drinkAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(drinkAction));
    assertEquals(drinkAction, thing);
  }
  @Test public void testRadioChannel() throws IOException {
    final RadioChannel radioChannel = SchemaOrg.radioChannel()
      .broadcastChannelId("Test String")
      .broadcastServiceTier("Test String")
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(radioChannel));
    assertEquals(radioChannel, thing);
  }
  @Test public void testAcceptAction() throws IOException {
    final AcceptAction acceptAction = SchemaOrg.acceptAction()
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(acceptAction));
    assertEquals(acceptAction, thing);
  }
  @Test public void testPlanAction() throws IOException {
    final PlanAction planAction = SchemaOrg.planAction()
      .scheduledTime(NOW)
      .endTime(NOW)
      .startTime(NOW)
      .additionalType("Test String")
      .alternateName("Test String")
      .disambiguatingDescription("Test String")
      .name("Test String")
      .sameAs("Test String")
      .url("Test String")
      .id("Test String")
      .build();
    final Thing thing = SchemaOrg.readJson(SchemaOrg.writeJson(planAction));
    assertEquals(planAction, thing);
  }
}
