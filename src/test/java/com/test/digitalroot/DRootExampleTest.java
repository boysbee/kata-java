package com.test.digitalroot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nattaporn on 28/08/2558.
 */
public class DRootExampleTest {
    @Test
    public void test_result_is_7_put_16() {
        assertEquals("Nope!", 7, DRoot.digital_root(16));
    }

    @Test
    public void test_result_is_6_put_942() {
        assertEquals("Nope!", 6, DRoot.digital_root(942));
    }

    @Test
    public void test_result_is_6_put_132189() {
        assertEquals("Nope!", 6, DRoot.digital_root(132189));
    }
    @Test
    public void test_result_is_2_put_493193() {
        assertEquals("Nope!", 2, DRoot.digital_root(493193));
    }
}
