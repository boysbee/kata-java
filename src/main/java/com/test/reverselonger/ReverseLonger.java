package com.test.reverselonger;

/**
 * Created by boysbee on 8/7/2015.
 */
public class ReverseLonger {
    public static String shorterReverseLonger(String a, String b) {
        if( a == null || b == null || a.length() == 0 || b.length() ==0) {
            return "";
        }
        if( a.length() > b.length() || a.length() == b.length()){
            return b.concat(reverse(a)).concat(b);
        }
        return a.concat(reverse(b)).concat(a);

    }

    private static String reverse(String r){
        StringBuilder sb = new StringBuilder();
        int count = r.length();
        while(count > 0){
            sb.append(String.valueOf(r.charAt(count -1)));
            count--;
        }

        return sb.toString();
    }
}
