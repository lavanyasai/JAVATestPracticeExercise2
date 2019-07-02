package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.EvenNum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {

    EvenNum evenNum;
    Boolean actualResult;
    Boolean expectedResult;

    @Before
    public void setUp() {
        evenNum = new EvenNum();
    }

    @Test
    public void givenNumberReturnsNumberIsEven() {
        actualResult = evenNum.isEven(12);
        expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberReturnsNumberIsOdd() {
        actualResult = evenNum.isEven(13);
        expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        evenNum = null;
    }
}