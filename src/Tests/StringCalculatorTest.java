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
    public void moreNumbersAddCase() {
        Assert.assertEquals(45,sc.add("8,7,10,20"));
    }

    @Test
    public void moreNumbersAddNewLineCase() {
        Assert.assertEquals(6,sc.add("1\n2,3"));
    }

    @Test
    public void differentDelimitersCase() {
        Assert.assertEquals(3,sc.add("//;\n1;2"));
    }

    @Test
    public void shouldHaveProperErrorMessage() {
        try {
            sc.add("//;\n1,2\n3;-4");
           Assert.fail("Exception wasn't thrown!");
        }
        catch (IllegalArgumentException exception) {
           Assert.assertEquals("negatives not allowed | [-4]", exception.getMessage());
        }
    }

    @Test
    public void shouldIgnoreAddingBigNumbers() {
        Assert.assertEquals(6,sc.add("1,2,3\n1024"));
    }
    @Test
    public void longerDelimitersCase() {
        Assert.assertEquals(6,sc.add("//[***]\n1***2***3"));
    }

    @Test
    public void moreOwnDelimitersCase() {
        Assert.assertEquals(6,sc.add("//[*][%]\n1*2%3"));
    }

}