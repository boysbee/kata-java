package com.test.reverselonger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by boysbee on 8/7/2015.
 * <p>
 * <pre>
 *     Instruction:
 *     Given 2 strings, a and b, return a string of the form: shorter+reverse(longer)+shorter.
 *
 * In other words, the shortest string has to be put as prefix and as suffix of the reverse of the longest.
 *
 * Strings a and b may be empty, but not null (In C# strings may also be null. Treat them as if they are empty.).
 * If a and b have the same length treat a as the longer producing b+reverse(a)+b
 * </pre>
 */
public class ReverseLongerTest {
    @Test
    public void static1() {
        assertEquals("abcdetsrifabcde",ReverseLonger.shorterReverseLonger("first", "abcde"));
        assertEquals("bauollehbau",ReverseLonger.shorterReverseLonger("hello", "bau"));
        assertEquals("fghiedcbafghi",ReverseLonger.shorterReverseLonger("abcde", "fghi"));
    }
}
