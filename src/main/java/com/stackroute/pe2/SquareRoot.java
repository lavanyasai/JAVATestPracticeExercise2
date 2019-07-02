package main.java.com.stackroute.pe2;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Determine whether the given number is power of 4.
 */

public class SquareRoot {

    public static String checkWhetherItIsPowerOrNot(int inputNumber) {
        String result = "It is not a power of 4";
        if(inputNumber <= 0) {
            result = "It is not a power of 4";
        }
        else if((Math.ceil(Math.log(inputNumber)/Math.log(4))) == Math.floor(((Math.log(inputNumber) / Math.log(4))))) {
            result = "It is a power of 4";
        }
        return result;
    }
}
