package challenge4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MadLibTest {

    private MadLib madLib = new MadLib();

    @Test
    public void positiveTest() {
        assertEquals("Do you walk your blue dog quickly? That's hilarious!",madLib.createStory("dog","walk", "blue","quickly"));
    }
}
