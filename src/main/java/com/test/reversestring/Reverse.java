package com.test.reversestring;

/**
 * Created by boysbee on 8/12/2015 AD.
 */
public class Reverse {
    public static String reverse(String str) {
        int n = str.length();
        return convert(str, n);
    }

    public static String convert(String str, int n) {
        if (n == 0) {
            return "";
        }

        return str.charAt(n) + convert(str, n - 1);
    }


}
