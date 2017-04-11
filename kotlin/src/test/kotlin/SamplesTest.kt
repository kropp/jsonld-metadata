
import org.junit.Assert.assertEquals
import org.junit.Test
import org.schema.SchemaOrg.*
import org.schema.kotlin.article
import org.schema.kotlin.nGO

class SamplesTest {
    @Test
    fun simple() {
        val article = article() // with static import you can skip `SchemaOrg.`, left here for clarity
            .name("88th Oscars ceremony will be held on February 28th")
            .text("Lorem ipsum")
            .author(nGO().name("The Academy of Motion Picture Arts and Sciences").build())
            .comment(
                // note that you may provide Builder instead of object where it is unambiguous
                comment().text("Hooray!").author(person().name("Max Mustermann"))
            ).build()

        val kotlinArticle = article {
            name = "88th Oscars ceremony will be held on February 28th"
            text = "Lorem ipsum"
            author = nGO {
                name = "The Academy of Motion Picture Arts and Sciences"
            }
            comment {
                text = "Hooray!"
                authorPerson {
                    name = "Max Mustermann"
                }
            }
        }

        assertEquals(article, kotlinArticle)
    }
}