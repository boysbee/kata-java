package com.test.digitalroot;

/**
 * Created by nattaporn on 28/08/2558.
 */
public class DRoot {
    public static int digital_root(int n) {
        int result = 0;
        String stringFromN = Integer.toString(n);
        int len = stringFromN.length();
        result = sum(result, stringFromN, len);
        return len == 1 ? n : digital_root(result);
    }

    private static int sum(int result, String stringFromN, int len) {
        for (int index = 0; index < len; index++) {
            result += Character.getNumericValue(stringFromN.charAt(index));
        }
        return result;
    }
}
