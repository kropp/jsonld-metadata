import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.schema.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.schema.SchemaOrg.*;

/**
 * @author Victor Kropp
 */
public class SamplesTest {
    private static final String json = "{\"comment\":{\"text\":\"Hooray!\",\"author\":{\"name\":\"Max Mustermann\",\"@type\":\"Person\",\"@context\":\"http://schema.org/\"},\"@type\":\"Comment\",\"@context\":\"http://schema.org/\"},\"text\":\"Lorem ipsum\",\"author\":{\"name\":\"The Academy of Motion Picture Arts and Sciences\",\"@type\":\"NGO\",\"@context\":\"http://schema.org/\"},\"name\":\"88th Oscars ceremony will be held on February 28th\",\"@type\":\"Article\",\"@context\":\"http://schema.org/\"}";

    @Test
    public void serializationSample() throws IOException {
        final Article article = SchemaOrg.article() // with static import you can skip `SchemaOrg.`, left here for clarity
                .name("88th Oscars ceremony will be held on February 28th")
                .text("Lorem ipsum")
                .author(nGO().name("The Academy of Motion Picture Arts and Sciences").build())
                .comment(
                        // note that you may provide Builder instead of object where it is unambiguous
                        comment().text("Hooray!").author(person().name("Max Mustermann"))
                ).build();
        final String serialized = SchemaOrg.writeJson(article);


        final Thing restored = SchemaOrg.readJson(serialized);
        assertEquals(article, restored);
    }

    @Test
    public void deserializationSample() throws IOException {
        final Article article = (Article) SchemaOrg.readJson(json);


        assertEquals("88th Oscars ceremony will be held on February 28th", article.getName());
        assertEquals("Lorem ipsum", article.getText());

        assertEquals("The Academy of Motion Picture Arts and Sciences", article.getAuthorOrganization().getName());

        assertEquals("Hooray!", article.getComment().getText());
        assertEquals("Max Mustermann", article.getComment().getAuthorPerson().getName());
    }

    @Test
    public void softwareBuildTest() {
        final SoftwareApplicationBuild build = softwareApplicationBuild()
                .id("1")
                .name("Build")
                .url("http://example.com/build/1")
                .headline("My first build")
                .totalTestsCount(100)
                .successTestsCount(96)
                .ignoredTestsCount(3)
                .failedTestsCount(1)
                .newlyFailedTestsCount(1)
                .sourceCodeRevision(sourceCodeRevision()
                        .id("deadbeef").branch("master").name("commit message")
                        .author(person().id("userId").name("Full Name"))
                        .contributor(person().id("commiterId").name("Commiter Name"))
                        .build())
                .potentialAction(viewAction()
                        .name("View")
                        .url("http://example.com/build/1/details")
                        .build())
                .build();
    }

    @Test
    public void testMultiple() throws JsonProcessingException {
        final SourceCodeRevision revision = sourceCodeRevision()
                .branch("master")
                .tag("a").tag("b").tag("c")
                .build();

        final String json = SchemaOrg.writeJson(revision);

        assertEquals("{\"@type\":\"SourceCodeRevision\",\"@context\":\"http://schema.org/\",\"tag\":[\"a\",\"b\",\"c\"],\"branch\":\"master\"}", json);

        assertEquals("a", revision.getTag());
        assertEquals(Arrays.asList("a", "b", "c"), revision.getTags());

        assertEquals(Collections.emptyList(), revision.getWorkExamples());
    }

    @Test
    public void testEnum() throws JsonProcessingException {
        final GroceryStore store = groceryStore()
                .openingHoursSpecification(openingHoursSpecification().dayOfWeek(DayOfWeek.Monday))
                .openingHoursSpecification(openingHoursSpecification().dayOfWeek(DayOfWeek.Tuesday))
                .openingHoursSpecification(openingHoursSpecification().dayOfWeek(DayOfWeek.Wednesday))
                .openingHoursSpecification(openingHoursSpecification().dayOfWeek(DayOfWeek.Thursday))
                .openingHoursSpecification(openingHoursSpecification().dayOfWeek(DayOfWeek.Friday))
                .openingHoursSpecification(openingHoursSpecification().dayOfWeek(DayOfWeek.Sunday))
                .build();

        final String json = SchemaOrg.writeJson(store);

        assertEquals("{\"@type\":\"GroceryStore\",\"@context\":\"http://schema.org/\",\"openingHoursSpecification\":[{\"@type\":\"OpeningHoursSpecification\",\"@context\":\"http://schema.org/\",\"dayOfWeek\":\"http://schema.org/Monday\"},{\"@type\":\"OpeningHoursSpecification\",\"@context\":\"http://schema.org/\",\"dayOfWeek\":\"http://schema.org/Tuesday\"},{\"@type\":\"OpeningHoursSpecification\",\"@context\":\"http://schema.org/\",\"dayOfWeek\":\"http://schema.org/Wednesday\"},{\"@type\":\"OpeningHoursSpecification\",\"@context\":\"http://schema.org/\",\"dayOfWeek\":\"http://schema.org/Thursday\"},{\"@type\":\"OpeningHoursSpecification\",\"@context\":\"http://schema.org/\",\"dayOfWeek\":\"http://schema.org/Friday\"},{\"@type\":\"OpeningHoursSpecification\",\"@context\":\"http://schema.org/\",\"dayOfWeek\":\"http://schema.org/Sunday\"}]}", json);
    }

    @Test
    public void convertToMapAndBack() throws IOException {
        final Review review = SchemaOrg.review().text("Lorem ipsum")
                .comment(SchemaOrg.comment().text("Cool!").author(SchemaOrg.person().name("John Doe")))
                .comment(SchemaOrg.comment().text("Great!").author(SchemaOrg.person().name("Jane Doe")))
                .build();

        final java.util.Map<String,Object> converted = SchemaOrg.toMap(review);

        final Thing restored = SchemaOrg.fromMap(converted);

        assertEquals(review, restored);
    }

    @Test
    public void convertDateToMapAndBack() throws IOException {
        final Review review = SchemaOrg.review().text("Very informative")
                .mainEntity(SchemaOrg.webPage().text("Lorem ipsum")
                    .comment(SchemaOrg.comment().text("Cool!").dateCreated(new Date(1234567890000L)))
                    .comment(SchemaOrg.comment().text("Great!").dateCreated(new Date(1234567890000L)))
                ).build();

        final java.util.Map<String,Object> converted = SchemaOrg.toMap(review);

        final Thing restored = SchemaOrg.fromMap(converted);

        assertEquals(review, restored);
    }
}
