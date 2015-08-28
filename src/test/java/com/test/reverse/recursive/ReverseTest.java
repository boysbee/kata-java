package com.test.reverse.recursive;
import org.junit.Test;

import static org.junit.Assert.*;

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
    @Test
    public void it_should_return_4321_when_put_1234(){
        assertEquals("4321",reverse.reverse("1234"));
    }
    @Test
    public void it_should_return_1234_when_put_4321(){
        assertEquals("1234",reverse.reverse("4321"));
    }
    @Test
    public void it_should_return_123456_when_put_654321(){
        assertEquals("123456",reverse.reverse("654321"));
    }
}