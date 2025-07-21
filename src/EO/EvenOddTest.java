package EO;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {
    EvenOdd evenOdd;

    @Before
    public void setUp(){
        evenOdd = new EvenOdd();
    }

    @After
    public void tearDown(){
        evenOdd = null;
    }

    @Test
    public void givenPositiveNumberIsEven(){
        boolean actualResult = evenOdd.isEven(100000);
        assertTrue(actualResult);
    }

    @Test
    public void givenNegativeNumberIsEven(){
        boolean actualResult = evenOdd.isEven(-9023);
        assertFalse(actualResult);
    }

    @Test
    public void givenPositiveNumberIsPalindrome(){
        boolean actualResult = evenOdd.isPalindrome(100000);
        assertFalse(actualResult);
    }

    @Test
    public void givenNegativeNumberIsPalindrome(){
        boolean actualResult = evenOdd.isPalindrome(-123321);
        assertFalse(actualResult);
    }

}
