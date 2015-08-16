package com.test.circle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by boysbee on 8/16/2015.
 */
public class CircleTest {
    @Test
    public void testKnownValues() {
        try {
            Circle.area(0);
            fail("Radius of 0 should throw an IllegalArgumentException");
        } catch (IllegalArgumentException iae) {
        }
        for (int i = 0; i < 3; i++) {
            double x = 3D;
            assertEquals(28.27D, Circle.area(x), 0.01);
        }
    }
}
