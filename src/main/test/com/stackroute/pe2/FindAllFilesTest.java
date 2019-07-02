package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.FindAllFiles;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FindAllFilesTest {

    FindAllFiles findAllFiles;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        findAllFiles = new FindAllFiles();
    }

    @Test
    public void givenCorrectFileReturnsContentOfTheFile() throws IOException {
        actualResult = findAllFiles.findAndReadFiles(new String[] {"src/main/java/com/stackroute/pe2/", "file.txt"});
        expectedResult = "Calculates the frequency of the words in a given file\n";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenFileThatDoesNotExistReturnsException() throws IOException {
        actualResult = findAllFiles.findAndReadFiles(new String[] {"", "file.txt"});
        expectedResult = "Exception";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown()throws Exception {
        findAllFiles = null;
    }
}