package com.test.longestrun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nchatmalairut on 8/3/2016.
 */
public class FindLongestRunStreamTest {

    @Test
    public void indexShouldBeReturn(){
        assertEquals(0, FindLongestRunStream.indexOfLongestRun("a"));
        assertEquals(0, FindLongestRunStream.indexOfLongestRun("aa"));
        assertEquals(2, FindLongestRunStream.indexOfLongestRun("aabbb"));
        assertEquals(0, FindLongestRunStream.indexOfLongestRun("aabbcc"));
        assertEquals(1, FindLongestRunStream.indexOfLongestRun("abbccdd"));
        assertEquals(6, FindLongestRunStream.indexOfLongestRun("abbcccddddcccbba"));
        assertEquals(10, FindLongestRunStream.indexOfLongestRun("abbcccddddcccccccccccbba"));

    }
}
