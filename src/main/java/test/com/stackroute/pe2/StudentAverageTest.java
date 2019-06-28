package main.java.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.StudentAverage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentAverageTest {

    StudentAverage studentAverage;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        studentAverage = new StudentAverage();
    }

    @Test
    public void checkTheAverageOfStudents() {
        actualResult = studentAverage.calculateStudentsAverage(4, new int[]{10, 20, 30, 40});
        expectedResult = "25.01040";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkTheAverageResultOfStudents() {
        actualResult = studentAverage.calculateStudentsAverage(1, new int[]{10});
        expectedResult = "10.01010";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        studentAverage = null;
    }
}