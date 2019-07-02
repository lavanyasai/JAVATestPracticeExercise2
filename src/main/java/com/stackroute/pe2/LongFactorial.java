package main.java.com.stackroute.pe2;

import java.text.DecimalFormat;

/*
List all the factorials that can be expressed as an int (i.e., 32-bit signed integer.
 */

public class LongFactorial {

    public static String longFactorial() {
        double result = 1;
        int inputNumber = 1;
        String longResult = "";
        DecimalFormat decimalFormat = new DecimalFormat("#");
        decimalFormat.setMaximumFractionDigits(0);
        while(true) {
            for (int i = 1; i <= inputNumber; i++) {
                result = result * i;
            }
            if (result < Long.MAX_VALUE && result > Long.MIN_VALUE) {
                longResult = longResult + "The factorial of " + inputNumber + " is " + decimalFormat.format(result);
            } else {
                longResult = longResult + "The factorial of " + inputNumber + " is out of range";
                break;
            }
            result = 1;
            inputNumber++;
        }
        return longResult;
    }
}
