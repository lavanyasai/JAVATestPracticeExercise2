package main.java.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.IntegerFactorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerFactorialTest {

    IntegerFactorial integerFactorial;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        integerFactorial = new IntegerFactorial();
    }

    @Test
    public void checkWhetherResultIsCorrect() {
        actualResult = integerFactorial.integerFactorial();
        expectedResult = "The factorial of 1 is 1The factorial of 2 is 2The factorial of 3 is 6The factorial of 4 is 24The factorial of 5 is 120The factorial of 6 is 720The factorial of 7 is 5040The factorial of 8 is 40320The factorial of 9 is 362880The factorial of 10 is 3628800The factorial of 11 is 39916800The factorial of 12 is 479001600The factorial of 13 is out of range";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        integerFactorial = null;
    }
}