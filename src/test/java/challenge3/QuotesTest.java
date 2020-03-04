package challenge3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuotesTest {

    private String quote = "These aren't the droids you're looking for.";
    private String author = "Obi-Wan Kenobi";

    Quotes quotes = new Quotes(quote, author);
    @Test
    public void positiveTest() {
        assertEquals("Obi-Wan Kenobi says, \"These aren't the droids " +
                "you're looking for.\"",quotes.printQuote());
    }
}
