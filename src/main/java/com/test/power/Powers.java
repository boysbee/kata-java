package com.test.power;

import java.math.BigInteger;

/**
 * Created by boysbee on 8/16/2015.
 */
public class Powers {
    private static final BigInteger TWO = BigInteger.valueOf(2);
    public static BigInteger powers(int[] ints) {
        return ints.length == 0 ? BigInteger.ONE : TWO.pow(ints.length);
    }
}
