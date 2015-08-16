package com.test.descendingorder;

/**
 * Created by boysbee on 8/9/2015 AD.
 */
public class DescendingOrder {
    public static int sortDesc(int i) {
        return Integer.parseInt(new StringBuilder(Integer.toString(i)).reverse().toString());
    }
}
