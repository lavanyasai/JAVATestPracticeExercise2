package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.FileContent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileContentTest {

    private FileContent fileContent;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        fileContent = new FileContent();
    }

    @Test
    public void givenCorrectFileReturnsContentOfTheFile() throws IOException {
        actualResult = fileContent.readFileContent(new File("src/main/java/com/stackroute/pe2/file.txt"));
        expectedResult = "Calculates the frequency of the words in a given file\n";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenFileThatDoesNotExistReturnsIOException() throws IOException {
        actualResult = fileContent.readFileContent(new File("file.txt"));
        expectedResult = "IOException";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        fileContent = null;
    }
}