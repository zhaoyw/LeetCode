package com.yinzhao;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestProblem3 {

    private Problem3Solution solution;

    @Before
    public void setUp() {
        solution = new Problem3Solution();
    }

    @Test
    public void return_null_given_null_string() {
        assertEquals(0, solution.lengthOfLongestSubstring(null));
    }

    @Test
    public void return_empty_string_given_empty_string() {
        assertEquals(0, solution.lengthOfLongestSubstring(null));
    }

    @Test
    public void return_itself_given_one_len_str() {
        assertEquals(1, solution.lengthOfLongestSubstring("b"));
    }

    @Test
    public void return_b_given_repeat_b_of_subString() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void return_abc_given_abcabcabcbb_of_subString() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcabcbb"));
    }

    @Test
    public void return_wke_given_pwwkew_of_subString() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void return_au_given_au_of_subString() {
        assertEquals(2, solution.lengthOfLongestSubstring("au"));
    }

    @Test
    public void return_ab_given_aab_of_subString() {
        assertEquals(2, solution.lengthOfLongestSubstring("aab"));
    }
}
