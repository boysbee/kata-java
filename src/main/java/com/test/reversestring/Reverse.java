package com.test.reversestring;

/**
 * Created by boysbee on 8/12/2015 AD.
 */
public class Reverse {
    public String reverse(String str) {
        return convert(str, str.length());
    }

    private static String convert(String str, int len) {
        return len == 0 ? "" : Character.toString(str.charAt(len -1)) + convert(str, len - 1);
    }


}
