package main.java.com.stackroute.pe2;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Determine whether the given number is power of 4.
 */

public class SquareRoot {

    public static String checkWhetherItIsPowerOrNot(int inputNumber) {
        if(inputNumber == 0) {
            return "It is not a power of 4";
        }
        if((Math.ceil(Math.log(inputNumber)/Math.log(4))) == Math.floor(((Math.log(inputNumber) / Math.log(4))))) {
            return "It is a power of 4";
        }
        return "It is not a power of 4";
    }
}
