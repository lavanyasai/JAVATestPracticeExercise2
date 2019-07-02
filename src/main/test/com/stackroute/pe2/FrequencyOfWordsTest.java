package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.FrequencyOfWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FrequencyOfWordsTest {

    FrequencyOfWords frequencyOfWords;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        frequencyOfWords = new FrequencyOfWords();
    }

    @Test
    public void givenFileReturnsFrequencyOfWordsIsCorrect() {
        try {
            actualResult = frequencyOfWords.frequencyOfWords("src/main/java/com/stackroute/pe2/file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        expectedResult = "Calculates-1the-2frequency-1of-1the-2words-1in-1a-1given-1file\n-1";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenFileThatDoesNotExistReturnsException() {
        try {
            actualResult = frequencyOfWords.frequencyOfWords("file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        expectedResult = "Exception";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        frequencyOfWords = null;
    }
}