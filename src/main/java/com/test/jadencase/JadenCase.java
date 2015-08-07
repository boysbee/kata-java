package com.test.jadencase;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by boysbee on 8/8/2015.
 */
public class JadenCase {
    public String toJadenCase(String input) {
        return (input == null || input.length() == 0) ? null : convert(input.split(" "));
    }

    private String convert(String[] inputs) {
        return Arrays
                .stream(inputs)
                .map(w -> {
                    char firstChar = Character.toUpperCase(w.charAt(0));
                    return firstChar + w.substring(1);
                })
                .collect(Collectors.joining(" "));
    }
}
