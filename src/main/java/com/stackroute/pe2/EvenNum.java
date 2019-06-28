package main.java.com.stackroute.pe2;

import java.util.Scanner;

/*
Takes input as integer and returns true if input is even.
 */

public class EvenNum {
    public static boolean isEven(int inputNumber) {
        if((inputNumber%2) == 0) {
            return true;
        }
        return false;
    }
}
