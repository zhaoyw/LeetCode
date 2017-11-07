package com.yinzhao;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by zhaoyongwang on 2017/11/7.
 */
public class TestProblem1 {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void should_return_0_and_1_given_input_target_9_and_nums() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] ret = new int[]{0, 1};

        assertTrue(Arrays.equals(ret, solution.twoSum(nums, target)));
    }

    @Test
    public void should_return_empty_array_if_not_find() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 33;

        int[] ret = new int[]{};

        assertTrue(Arrays.equals(ret, solution.twoSum(nums, target)));
    }
}
