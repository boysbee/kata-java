package com.test.profit;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by boysbee on 8/8/2015 AD.
 */
public class MinMax {
    public static int[] minMax(int[] ints) {
        return new int[]{ Arrays.stream(ints).min().getAsInt(),
                Arrays.stream(ints).max().getAsInt()};
    }

}
