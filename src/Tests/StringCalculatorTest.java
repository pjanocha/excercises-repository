package Tests;

import Classes.StringCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator sc;

    @Before
    public void setUp() {
        sc = new StringCalculator();
    }

    @Test
    public void emptyStringAddCase() {
        Assert.assertEquals(0,sc.add(""));
    }

    @Test
    public void oneNumberAddCase() {
        Assert.assertEquals(7,sc.add("7"));
    }

    @Test
    public void twoNumbersAddCase() {
        Assert.assertEquals(15,sc.add("8,7"));
    }
}