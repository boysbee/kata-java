package com.test.completepattern.java8;

import java.util.stream.*;

public class CompletePatternJava8 {
    public static String pattern(int n) {
        return n < 1 ? "" : IntStream.iterate(n, i -> i - 1).limit(n)
                .mapToObj(i -> line(i, n))
                .collect(Collectors.joining("\n"));
    }

    public static String line(int l, int n) {
        return IntStream.range(0, l)
                .mapToObj(i -> Integer.toString(n - i))
                .collect(Collectors.joining());
    }
}