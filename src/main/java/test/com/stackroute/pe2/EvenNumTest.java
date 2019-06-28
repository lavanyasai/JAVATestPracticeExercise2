package main.java.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.EvenNum;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {

    EvenNum evenNum;
    Boolean actualResult;
    Boolean expectedResult;

    @org.junit.Before
    public void setUp() throws Exception {
        evenNum = new EvenNum();
    }

    @Test
    public void checkWhetherTheNumberIsEven() {
        actualResult = evenNum.isEven(12);;
        expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheNumberIsOdd() {
        actualResult = evenNum.isEven(13);
        expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        evenNum = null;
    }
}