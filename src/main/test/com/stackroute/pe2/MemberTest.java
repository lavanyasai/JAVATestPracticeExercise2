package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.MemberVariable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    MemberVariable memberVariable;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        memberVariable = new MemberVariable();
    }

    @Test
    public void givenDetailsOfStudentMemberReturnsTheirDetails() {
        actualResult = memberVariable.memberDetails(new String[] {"Stackroute", "23", "20000"});
        expectedResult = "Name: StackrouteAge: 23Salary: 20000";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenEmptyDetailsOfStudentMemberReturnsNothing() {
        actualResult = memberVariable.memberDetails(new String[] {"", "", ""});
        expectedResult = "Name: Age: Salary: ";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        memberVariable = null;
    }
}