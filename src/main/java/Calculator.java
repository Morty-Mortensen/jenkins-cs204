import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

class Calculator {

    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        if (b == 0) {
            throw new ArithmeticException("/ by zero");
        }

        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        if (n < 2) {
            return n;
        }
        return fibonacciNumberFinder(n - 1) + fibonacciNumberFinder(n - 2);
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
        if (n == 0) {
            return "0";
        }

        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;

        // Number should be positive
        while (n > 0) {
            binary[id++] = n % 2;
            n = n / 2;
        }

        // Print Binary
        StringBuilder builder = new StringBuilder();
        for (int i = id - 1; i >= 0; i--)
            builder.append(binary[i]);

        return builder.toString();
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, StandardCharsets.UTF_8);
        return n + generatedString;
    }


}
