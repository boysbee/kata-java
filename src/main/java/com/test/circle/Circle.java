package com.test.circle;

import java.math.BigDecimal;

/**
 * Created by boysbee on 8/16/2015.
 */
public class Circle {

    public static final double ZERO = 0D;
    public static final int TWO = 2;

    public static double area(double radius) {
        if(radius <= ZERO ){
            throw  new IllegalArgumentException();
        }
        return Math.PI * (BigDecimal.valueOf(radius).pow(TWO)).doubleValue();
    }
}
