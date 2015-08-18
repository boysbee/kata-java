package com.test.descendingorder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by boysbee on 8/9/2015 AD.
 */
public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
    @Test
    public void test_04() {
        assertEquals(2110, DescendingOrder.sortDesc(1201));
    }

 @Test
    public void test_05() {
        assertEquals(987654321, DescendingOrder.sortDesc(876594321));
    }


}
