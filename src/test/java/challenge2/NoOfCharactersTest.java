package challenge2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoOfCharactersTest {

    NoOfCharacters noOfCharacters = new NoOfCharacters("Homer");

    @Test
    public void positiveTest() {
        assertEquals("Homer has 5 characters.",noOfCharacters.getSizeOfString());
    }
}
