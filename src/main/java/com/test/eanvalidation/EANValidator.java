package com.test.eanvalidation;

/**
 * Created by boysbee on 8/6/2015.
 */
public class EANValidator {
    public static boolean validate(final String eanCode) {
        int count = 0;
        int sum = 0;
        int eanCodeLenght = eanCode.length();
        char lastChar = eanCode.charAt(eanCodeLenght - 1);
        int lastValue = Integer.parseInt(String.valueOf(lastChar));
        while (eanCodeLenght > count && count < (eanCodeLenght - 1)) {
            char ch = eanCode.charAt(count);
            int value = Integer.parseInt(String.valueOf(ch));
            sum = sum(value,count,sum);
            count++;
        }

        return lastValue == (isDividableBy10(sum) ? 0 : defaultFomular(sum));
    }

    private static int sum(int value,int count, int sum) {
        if (isOdd(count + 1)) {
            sum = sum + (value * 3);
        } else {
            sum = sum + value;
        }
        return sum;
    }

    private static boolean isDividableBy10(int sum) {
        return (sum % 10) == 0;
    }

    private static int defaultFomular(int sum) {
        return 10 - (sum % 10);
    }

    private static boolean isOdd(int count) {
        return (count % 2) == 0;
    }
}
