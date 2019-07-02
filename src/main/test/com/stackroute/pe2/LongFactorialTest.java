package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.LongFactorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongFactorialTest {

    LongFactorial longFactorial;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        longFactorial = new LongFactorial();
    }

    @Test
    public void returnsFactorialOfNumbersUntilOutOfRange() {
        actualResult = longFactorial.longFactorial();
        expectedResult = "The factorial of 1 is 1The factorial of 2 is 2The factorial of 3 is 6The factorial of 4 is 24The factorial of 5 is 120The factorial of 6 is 720The factorial of 7 is 5040The factorial of 8 is 40320The factorial of 9 is 362880The factorial of 10 is 3628800The factorial of 11 is 39916800The factorial of 12 is 479001600The factorial of 13 is 6227020800The factorial of 14 is 87178291200The factorial of 15 is 1307674368000The factorial of 16 is 20922789888000The factorial of 17 is 355687428096000The factorial of 18 is 6402373705728000The factorial of 19 is 121645100408832000The factorial of 20 is 2432902008176640000The factorial of 21 is out of range";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        longFactorial = null;
    }
}