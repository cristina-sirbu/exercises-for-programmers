package challenge3;

public class Quotes {

    private final String quote;
    private final String author;

    public Quotes(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public String printQuote() {
        return author+" says, \""+quote+"\"";
    }
}
