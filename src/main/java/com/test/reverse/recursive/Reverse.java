package com.test.reverse.recursive;

/**
 * Created by duangdat on 27/08/2558.
 */
public class Reverse {

    public String reverse(String str) {
        return str.substring(str.length() - 1, str.length()) + (1 == str.length() ? "" : reverse(str.substring(0, str.length() - 1)));
    }
}
