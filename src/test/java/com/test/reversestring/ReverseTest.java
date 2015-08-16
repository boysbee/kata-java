package com.test.reversestring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by boysbee on 8/12/2015 AD.
 */
public class ReverseTest {
    @Test
    public void it_should_return_1_when_put_1(){
     assertEquals("1",Reverse.reverse("1"));
    }
    @Test
    public void it_should_return_21_when_put_12(){
     assertEquals("21",Reverse.reverse("12"));
    }
    @Test
    public void it_should_return_321_when_put_123(){
     assertEquals("321",Reverse.reverse("123"));
    }

}