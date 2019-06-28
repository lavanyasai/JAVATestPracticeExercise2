package main.java.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @Test
    public void checkWhetherStringResultIsLesser() {
        expectedResult = palindrome.checkWhetherStringIsPalindromeOrNot("12345654321");
        actualResult = "String is palindrome and sum of even numbers is less than 25";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherStringResultIsGreatee() {
        expectedResult = palindrome.checkWhetherStringIsPalindromeOrNot("2468642");
        actualResult = "String is palindrome and sum of even numbers is greater than 25";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherItIsPalindrome() {
        expectedResult = palindrome.checkWhetherStringIsPalindromeOrNot("2468");
        actualResult = "String is not palindrome";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        palindrome = null;
    }
}