package main.java.com.stackroute.pe2;

/*
List all the factorials that can be expressed as an int (i.e., 32-bit signed integer.
 */

public class IntegerFactorial {

    public static String integerFactorial() {
        long result = 1;
        String integerResult = "";
        int inputNumber = 1;
        while(true) {
            for(int i=1;i<=inputNumber;i++){
                result=result*i;
            }
            if(result < Integer.MAX_VALUE && result > Integer.MIN_VALUE) {
                integerResult = integerResult + "The factorial of " + inputNumber + " is " + result;
            }
            else {
                integerResult = integerResult + "The factorial of " + inputNumber + " is out of range";
                break;
            }
            result = 1;
            inputNumber++;
        }
        return integerResult;
    }
}
