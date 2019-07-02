package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.SquareRoot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareRootTest {

    SquareRoot squareRoot;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        squareRoot = new SquareRoot();
    }

    @Test
    public void givenNumberReturnItIsPowerOfFour() {
        actualResult = squareRoot.checkWhetherItIsPowerOrNot(16);
        expectedResult = "It is a power of 4";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberReturnItIsNotPowerOfFour() {
        actualResult = squareRoot.checkWhetherItIsPowerOrNot(25);
        expectedResult = "It is not a power of 4";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNegativeNumberReturnItIsNotPowerOfFour() {
        actualResult = squareRoot.checkWhetherItIsPowerOrNot(-16);
        expectedResult = "It is not a power of 4";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        squareRoot = null;
    }

}