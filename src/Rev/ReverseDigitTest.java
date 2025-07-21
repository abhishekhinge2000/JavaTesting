package Rev;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseDigitTest {
    ReverseDigit reverseDigit;

    @Before
    public void setUP(){
        reverseDigit = new ReverseDigit();
    }

    @After
    public void tearDown(){
        reverseDigit = null;
    }

    @Test
    public void givenPositiveNumberShouldReturnReverseNumber(){
        int result = reverseDigit.getReverse(12345);
        assertEquals(54321, result);
    }

    @Test
    public void givenSingleNumberShouldReturnSameNumber(){
        int result = reverseDigit.getReverse(8);
        assertEquals(8, result);
    }

    @Test
    public void givenZeroShouldReturnZero() {
        int result = reverseDigit.getReverse(0);
        assertEquals(0, result);
    }

    @Test
    public void givenNegativeNumberShouldReturnNegativeNumber() {
        int result = reverseDigit.getReverse(-123);
        assertEquals(-321, result);
    }

    @Test
    public void giveNumberWithTrailingZeroShouldReturnReverseNumberWithoutLeadingZero(){
        int result = reverseDigit.getReverse(1200);
        assertEquals(21, result);
    }

}
