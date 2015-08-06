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
            sum += sum(value, count);
            count++;
        }

        return lastValue == (isDividableBy10(sum) ? 0 : defaultFomular(sum));
    }

    private static int sum(int value, int count) {
        return isOdd(count + 1) ? (value * 3) : value;
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

    /**
     * java8 solution
     * private static int factor = 3;

     public static boolean validate(final String eanCode) {

     int checksum = eanCode
     .chars()
     .limit(eanCode.length() - 1)
     .map(i -> Character.getNumericValue((char) i))
     .reduce(0, (sum, i) -> {
     factor = factor == 1 ? 3 : 1;
     return sum + i * factor;
     });
     checksum = (checksum % 10 == 0 ? 0 : 10 - (checksum % 10));
     return checksum == Character.getNumericValue(eanCode.charAt(eanCode.length() - 1));
     }
     */
}
