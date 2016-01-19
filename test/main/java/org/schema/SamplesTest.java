package org.schema;

import org.junit.Test;

import java.io.IOException;

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


        assertEquals(json, serialized);
    }

    @Test
    public void deserializationSample() throws IOException {
        final Article article = (Article) SchemaOrg.readJson(json);


        assertEquals("88th Oscars ceremony will be held on February 28th", article.getName());
        assertEquals("Lorem ipsum", article.getText());

        assertEquals("The Academy of Motion Picture Arts and Sciences", article.getAuthor().getOrganization().getName());

        assertEquals("Hooray!", article.getComment().getText());
        assertEquals("Max Mustermann", article.getComment().getAuthor().getPerson().getName());
    }
}
