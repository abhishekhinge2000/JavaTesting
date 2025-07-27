package Ph1;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import  static org.junit.Assert.*;

public class PhLevelAnalyserTest {

   PhLevelAnalyser phLevelAnalyser;
    @Before
    public void setUp(){
      phLevelAnalyser = new PhLevelAnalyser();
    }

    @After
    public void tearDown(){
       phLevelAnalyser = null;

    }

    @Test
    public void testLowPhLevel(){
        String result = phLevelAnalyser.getPhValueOfWater(5);
        assertEquals("ph value is low, partial change the water", result);
    }

    @Test
    public void testNormalPhLevel(){
        String result = phLevelAnalyser.getPhValueOfWater(8);
        assertEquals("ph value is fine", result);
    }

    @Test
    public void testHighPhLevel(){
        String result = phLevelAnalyser.getPhValueOfWater(9);
        assertEquals("ph value is high, partial change the water", result);
    }
}
