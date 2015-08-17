package com.test.reversestring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by boysbee on 8/12/2015 AD.
 */
public class ReverseTest {
    private Reverse reverse = new Reverse();
    @Test
    public void it_should_return_1_when_put_1(){
     assertEquals("1",reverse.reverse("1"));
    }
    @Test
    public void it_should_return_21_when_put_12(){
     assertEquals("21",reverse.reverse("12"));
    }
    @Test
    public void it_should_return_321_when_put_123(){
     assertEquals("321",reverse.reverse("123"));
    }

}