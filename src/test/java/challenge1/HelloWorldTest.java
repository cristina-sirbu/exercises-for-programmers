package challenge1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    HelloWorld helloWorld = new HelloWorld();

    @Test
    public void positiveTest() {
        assertEquals("Hello, Cristina, nice to meet you!",helloWorld.greet("Cristina"));
    }
}
