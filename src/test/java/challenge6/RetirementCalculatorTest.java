package challenge6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RetirementCalculatorTest {
    RetirementCalculator retirementCalculator = new RetirementCalculator(25,65);

    @Test
    public void positiveTest() {
        assertEquals("You have 40 years left until you can retire.",retirementCalculator.getYearsLeft());
        assertEquals(2020,retirementCalculator.getCurrentYear());
        assertEquals(2060, retirementCalculator.getRetirementYear());
    }
}
