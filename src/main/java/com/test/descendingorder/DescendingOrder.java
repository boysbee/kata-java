package com.test.descendingorder;

import java.util.Collections;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(int number) {
//        String[] spiltResult = Integer.toString(number).split("");
//        Arrays.sort(spiltResult, Collections.reverseOrder());
//        StringBuilder result = new StringBuilder();
//        for (String stringToConcat : spiltResult) {
//            result.append(stringToConcat);
//        }
//        return Integer.parseInt(result.toString());

        return Integer.parseInt(String.valueOf(number)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Collections.reverseOrder()).collect(Collectors.joining()));
    }
}
