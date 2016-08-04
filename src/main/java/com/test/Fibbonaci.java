package com.test;

/**
 * Created by boysbee on 9/14/2015 AD.
 */
public class Fibbonaci {
    public int getResult(int i) {
        return i == 1 ? 1 : fibbonaci(i);
    }

    int fibbonaci(int n) {
        int prev = 0;
        int next = 1;
        int result = 0;
        for (int i = 1; i < n; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }
        return result;
    }
}
