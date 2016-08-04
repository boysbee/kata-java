package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by boysbee on 9/14/2015 AD.
 */
public class FiboTest {
    Fibbonaci fibo = new Fibbonaci();

    @Test
    public void test_0_should_be_0() {
        assertEquals(0, fibo.getResult(0));
    }

    @Test
    public void test_1_shoule_be_1() {
        assertEquals(1, fibo.getResult(1));
    }

    @Test
    public  void test_2_should_be_1(){
     assertEquals(1,fibo.getResult(2));
    }
    @Test
    public  void test_3_should_be_2(){
     assertEquals(2,fibo.getResult(3));
    }
    @Test
    public  void test_4_should_be_3(){
     assertEquals(3,fibo.getResult(4));
    }
    @Test
    public  void test_5_should_be_3(){
     assertEquals(5,fibo.getResult(5));
    }

    @Test
    public  void test_6_should_be_8(){
     assertEquals(8,fibo.getResult(6));
    }

    @Test
    public void test_9_should_be_34(){
        assertEquals(34, fibo.getResult(9));
    }

    @Test
    public void test_unreaasonable(){
        System.out.println(fibo.getResult(46));
        System.out.println(fibo.getResult(100));
    }
}
