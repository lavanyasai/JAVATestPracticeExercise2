package main.java.com.stackroute.pe2;

import java.util.Scanner;

/*
To determine whether the input string is a Palindrome or not.
 */

public class Palindrome {

    public static String checkWhetherStringIsPalindromeOrNot(String inputString) {
        int sum = 0;
        String result = "";
        StringBuilder stringBuilder = new StringBuilder(inputString);
        String reverseOfAString = stringBuilder.reverse().toString();
        if(inputString.equals(reverseOfAString)) {
            for(int i=0; i< reverseOfAString.length(); i++) {
                if(Character.getNumericValue(inputString.charAt(i))%2==0) {
                    sum = sum + Character.getNumericValue(inputString.charAt(i));
                }
            }
            if(sum > 25) {
                result = result + "String is palindrome and sum of even numbers is greater than 25";
            }
            else {
                result = result + "String is palindrome and sum of even numbers is less than 25";
            }
        }
        else {
            result = result + "String is not palindrome";
        }
        return result;
    }
}
