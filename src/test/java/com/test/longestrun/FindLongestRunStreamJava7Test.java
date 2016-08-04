package com.test.longestrun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nchatmalairut on 8/4/2016.
 */
public class FindLongestRunStreamJava7Test {
    @Test
    public void itShouldIndex() {
        assertEquals(0, FindLongestRunJava7.indexOfLongestRun("a"));
        assertEquals(6, FindLongestRunJava7.indexOfLongestRun("abbcccddddcccbba"));
    }

    @Test
    public void itShouldReturnListOfMapRepeatGroupChar() {
        assertEquals(1, FindLongestRunJava7.repeatWord("a").size());
        assertEquals(3, FindLongestRunJava7.repeatWord("baac").size());
        assertEquals(4, FindLongestRunJava7.repeatWord("baacd").size());
    }

    @Test
    public void itShouldReturnMaxRepeat() {
        assertEquals("aa", FindLongestRunJava7.maxRepeatWord("baacd"));
        assertEquals("bbb", FindLongestRunJava7.maxRepeatWord("bbbaacd"));
        assertEquals("aaaaaaaaaa", FindLongestRunJava7.maxRepeatWord("bbbaaaaaaaaaacd"));
        assertEquals("bb", FindLongestRunJava7.maxRepeatWord("bbaadd"));

    }

}
