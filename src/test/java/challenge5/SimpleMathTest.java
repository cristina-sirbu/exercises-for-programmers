package challenge5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleMathTest {
    private int x=10;
    private int y=5;
    private SimpleMath simpleMath = new SimpleMath(x,y);

    @Test
    public void positiveTest() {
        assertEquals(15,simpleMath.getSum());
        assertEquals(5,simpleMath.getDiff());
        assertEquals(50,simpleMath.getMultiply());
        assertEquals(2,simpleMath.getDivision());
    }
}
