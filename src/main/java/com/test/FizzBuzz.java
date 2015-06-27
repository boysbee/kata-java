package com.test;

/**
 * Created by boysbee on 6/27/15.
 */
public class FizzBuzz {
    public static String getResult(int input) {
        return isFizzBuzz(input) ? "fizzbuzz" : isBuzz(input) ? "buzz" : isFizz(input) ? "fizz" : Integer.toString(input);

    }

    private static boolean isFizzBuzz(int input) {
        return input % 15 == 0;
    }

    private static boolean isBuzz(int input) {
        return input % 5 == 0;
    }

    private static boolean isFizz(int input) {
        return input % 3 == 0;
    }
}
