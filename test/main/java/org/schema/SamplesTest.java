package org.schema;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

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
                .description("My first build")
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
}
