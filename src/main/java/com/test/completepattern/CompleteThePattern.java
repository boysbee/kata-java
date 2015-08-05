package com.test.completepattern;

/**
 * Created by boysbee on 8/6/2015 AD.
 */
public class CompleteThePattern {
    public static String pattern(int number) {

        StringBuilder sb = new StringBuilder();
        if(number <= 0){
            return "";
        }
        int counter = 1;
        while(number > counter) {
            for (int index = number; index > 0; index--) {
                sb.append(index);
                if(index == counter){
                    break;
                }

            }
            counter++;
            sb.append("\n");
        }
        sb.append(number);
        return sb.toString();
    }
}
