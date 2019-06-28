package main.java.com.stackroute.pe2;

import java.util.Arrays;
import java.util.Scanner;

/*
Reads number of students, their grades and displays the average, minimum and maximum.
 */

public class StudentAverage {

    public static String calculateStudentsAverage(int numberOfStudents, int[] studentsGrades) {
        float sum = 0;
        String result = "";
        for(int i=0; i<studentsGrades.length; i++) {
            sum = sum + studentsGrades[i];
        }
        Arrays.sort(studentsGrades);
        result = result + (sum/studentsGrades.length);
        result = result + studentsGrades[0];
        result = result + studentsGrades[studentsGrades.length - 1];
        System.out.println(result);
        System.out.println("The average is " + (sum/studentsGrades.length));
        System.out.println("The minimum is "+studentsGrades[0]);
        System.out.println("The maximum is "+studentsGrades[studentsGrades.length - 1]);
        return result;
    }
}
