package com.test.eanvalidation;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by boysbee on 8/6/2015.
 * <pre>
 * Instruction:
 *     A lot of goods have an International Article Number (formerly known as "European Article Number") abbreviated "EAN". EAN is a 13-digits barcode consisting of 12-digits data followed by a single-digit checksum (EAN-8 is not considered in this kata).
 *
 * The single-digit checksum is calculated as followed (based upon the 12-digit data):
 *
 * The digit at the first, third, fifth, etc. position (i.e. at the odd position) has to be multiplied with "1".
 * The digit at the second, fourth, sixth, etc. position (i.e. at the even position) has to be multiplied with "3".
 * Sum these results.
 * If this sum is dividable by 10, the checksum is 0. Otherwise the checksum has the following formula:
 *
 * checksum = 10 - (sum mod 10)
 *
 * For example, calculate the checksum for "400330101839" (= 12-digits data):
 *
 * 4·1 + 0·3 + 0·1 + 3·3 + 3·1 + 0·3 + 1·1 + 0·3 + 1·1 + 8·3 + 3·1 + 9·3
 * = 4 + 0 + 0 + 9 + 3 + 0 + 1 + 0 + 1 + 24 + 3 + 27
 * = 72
 * 10 - (72 mod 10) = 8 ⇒ Checksum: 8
 *
 * Thus, the EAN-Code is 4003301018398 (= 12-digits data followed by single-digit checksum).
 * </pre>
 */
public class EANValidatorTest {

    @Test
    public void test_01() {
        assertTrue(EANValidator.validate("9783815820865"));
    }

    @Test
    public void test_02() {
        assertFalse(EANValidator.validate("9783815820864"));
    }

    @Test
    public void test_03() {
        assertTrue(EANValidator.validate("9783827317100"));
    }
}
