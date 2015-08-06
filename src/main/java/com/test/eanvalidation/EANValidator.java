package com.test.eanvalidation;

/**
 * Created by boysbee on 8/6/2015.
 */
public class EANValidator {
    public static boolean validate(final String eanCode) {
        int count = 0;
        int sum = 0;
        int eanCodeLenght = eanCode.length();
        char last = eanCode.charAt(eanCodeLenght -1);
        String lastChar = String.valueOf(last);
        int l = Integer.parseInt(lastChar);
        while( eanCodeLenght > count && count < (eanCodeLenght -1)) {
            char ch = eanCode.charAt(count);
            String number = String.valueOf(ch);
            int value = Integer.parseInt(number);
            if(((count + 1) % 2) == 0) {
                sum = sum + ( value * 3);
            } else {
                sum = sum + value;
            }
            count++;
        }
        int result = (sum % 10 ) == 0 ? 0 : 10 - ( sum % 10 );

        return result == l;
    }
}
