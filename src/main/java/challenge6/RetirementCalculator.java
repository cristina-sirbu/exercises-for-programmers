package challenge6;

import java.util.Calendar;

public class RetirementCalculator {

    private final int currentAge;
    private final int retirementAge;

    public RetirementCalculator(int currentAge, int retirementAge) {
        this.currentAge = currentAge;
        this.retirementAge = retirementAge;
    }

    public String getYearsLeft() {
        return "You have "+(retirementAge-currentAge)+" years left until you can retire.";
    }

    public int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getRetirementYear() {
        return getCurrentYear() + (retirementAge - currentAge);
    }
}
