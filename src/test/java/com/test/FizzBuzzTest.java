package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by boysbee on 6/27/15.
 */
public class FizzBuzzTest {
    @Test
    public void put_1_return_1() {
        assertEquals("1", FizzBuzz.getResult(1));
    }

    @Test
    public void put_2_return_2() {
        assertEquals("2", FizzBuzz.getResult(2));
    }

    @Test
    public void put_3_return_fizz() {
        assertEquals("fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void put_4_return_4() {
        assertEquals("4", FizzBuzz.getResult(4));
    }

    @Test
    public void put_5_return_buzz() {
        assertEquals("buzz", FizzBuzz.getResult(5));
    }

    @Test
    public void put_6_return_fizz() {
        assertEquals("fizz", FizzBuzz.getResult(6));
    }

    @Test
    public void put_8_return_8() {
        assertEquals("8", FizzBuzz.getResult(8));
    }

    @Test
    public void put_9_return_fizz() {
        assertEquals("fizz", FizzBuzz.getResult(9));
    }

    @Test
    public void put_10_return_buzz() {
        assertEquals("buzz", FizzBuzz.getResult(10));
    }

    @Test
    public void put_12_return_fizz() {
        assertEquals("fizz", FizzBuzz.getResult(12));
    }

    @Test
    public void put_15_return_fizzbuzz() {
        assertEquals("fizzbuzz", FizzBuzz.getResult(15));
    }

    @Test
    public void put_20_return_buzz() {
        assertEquals("buzz", FizzBuzz.getResult(20));
    }

    @Test
    public void put_21_return_fizz() {
        assertEquals("fizz", FizzBuzz.getResult(21));
    }

    @Test
    public void put_30_return_fizzbuzz() {
        assertEquals("fizzbuzz", FizzBuzz.getResult(30));
    }
}
