package com.test.longestrun;

import java.util.LinkedList;

/**
 * Created by nchatmalairut on 8/3/2016.
 */
public class FindLongestRunJava7 {

    public static int indexOfLongestRun(String str) {
        String maxRepeat = maxRepeatWord(str);
        return str.indexOf(maxRepeat);
    }

    public static String maxRepeatWord(String str) {
        LinkedList<String> repeatList = repeatWord(str);
        String result = null;
        for (String word : repeatList) {
            if (result == null) {
                result = word;
            }
            if (word.length() > result.length()) {
                result = word;
            }
        }
        return result;
    }

    public static LinkedList<String> repeatWord(String str) {
        LinkedList<String> listOfRepeadCh = new LinkedList();
        char[] chars = str.toCharArray();
        for (Character ch : chars) {
            if (listOfRepeadCh.isEmpty() || listOfRepeadCh.getLast().charAt(0) != ch) {
                listOfRepeadCh.add(Character.toString(ch));
            } else {
                String b = listOfRepeadCh.removeLast().concat(Character.toString(ch));
                listOfRepeadCh.add(b);
            }
        }
        return listOfRepeadCh;
    }

}
