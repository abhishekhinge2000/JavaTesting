package cal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorDemoTest {

    CalculatorDemo calculatorDemo;
    @Before
    public void setUp(){
        calculatorDemo = new CalculatorDemo();
    }

    @After
    public void tearDown(){
        calculatorDemo = null;
    }

    @Test
    public void givenTwoIntegerAddNumber() {
        int actualResult = calculatorDemo.addNumber(100,100);
        assertEquals(200,actualResult);
    }
    @Test
    public void givenZeroAndOneIntegerAddNumber() {
        int actualResult = calculatorDemo.addNumber(0,100);
        assertEquals(100,actualResult);
    }
    @Test
    public void givenNegativeIntegerAddNumber() {
        int actualResult = calculatorDemo.addNumber(-123,-100);
        assertEquals(-223,actualResult);
    }
    @Test
    public void givenTwoIntegerSubtractNumber() {
        int actualResult = calculatorDemo.subtractNumber(100,100);
        assertEquals(0,actualResult);
    }
    @Test
    public void givenTwoNegativeIntegerSubtractNumber() {
        int actualResult = calculatorDemo.subtractNumber(-100,-100000);
        assertEquals(99900,actualResult);
    }

    @Test
    public void givenTwoIntegerMultiplyNumber() {
        int actualResult = calculatorDemo.multiplyNumber(200,24);
        assertEquals(4800,actualResult);
    }
    @Test
    public void givenZeroAndOneIntegerMultiplyNumber() {
        int actualResult = calculatorDemo.multiplyNumber(0,24);
        assertEquals(0,actualResult);
    }
    @Test
    public void givenTwoIntegerDivideNumber() {
        int actualResult = calculatorDemo.divideNumber(200,24);
        assertEquals(8,actualResult);
    }

}

