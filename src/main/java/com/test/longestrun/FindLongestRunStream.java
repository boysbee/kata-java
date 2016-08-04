package com.test.longestrun;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by nchatmalairut on 8/3/2016.
 */
public class FindLongestRunStream {

    public static int indexOfLongestRun(String str) {
        String result = max(str);
        return result.equals("") ? -1 : str.indexOf(result);
    }


    public static String max(String test) {
        return test.chars().mapToObj(i -> (char)i).reduce(new LinkedList<String>(), (list, ch) -> {
            addSameChar(list, ch);
            return list;
        }, (p, q) -> {
            p.addAll(q);
            return p;
        }).stream().max(Comparator.comparing(String::length)).orElse("");
    }

    private static void addSameChar(LinkedList<String> list, Character ch) {
        list.add(isEmptyOrNotSameChar(list, ch) ?
            Character.toString(ch) :
            list.removeLast().concat(Character.toString(ch)));
    }

    private static boolean isEmptyOrNotSameChar(LinkedList<String> l, Character c) {
        return l.isEmpty() || l.getLast().charAt(0) != c;
    }
}
