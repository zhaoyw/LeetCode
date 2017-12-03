package com.yinzhao;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhaoyongwang on 2017/12/3.
 */
public class TestProblem7 {

    private Problem7Solution solution;

    @Before
    public void setUp() {
        solution = new Problem7Solution();
    }

    @Test
    public void should_return_321_given_reverse_123()
    {
        assertEquals(321, solution.reverse(123));
    }

    @Test
    public void should_return_minus321_given_reverse_minus123() {
        assertEquals(-321, solution.reverse(-123));
    }

    @Test
    public void should_return_21_given_reverse_120() {
        assertEquals(21, solution.reverse(120));
    }

    @Test
    public void should_return_0_given_reverse_1534236469_overflow() {
        assertEquals(0, solution.reverse(1534236469));
    }
}
