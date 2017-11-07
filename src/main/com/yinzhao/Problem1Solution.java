package com.yinzhao;

import java.util.HashMap;
import java.util.Map;

public class Problem1Solution {
    public int[] twoSum(int[] nums, int target) {
//        return solution1(nums, target);
//        return solution2(nums, target);
        return solution3(nums, target);
    }

    private int[] solution1(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    private int[] solution2(int nums[], int target) {
        Map<Integer, Integer> valueAndIndexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (valueAndIndexMap.containsKey(value)) {
                return new int[]{valueAndIndexMap.get(value), i};
            }
            valueAndIndexMap.put(nums[i], i);
        }
        return new int[0];
    }

    private int[] solution3(int nums[], int target) {
        Map<Integer, Integer> valueAndIndexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            valueAndIndexMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (valueAndIndexMap.containsKey(value) && valueAndIndexMap.get(value) != i) {
                return new int[]{i, valueAndIndexMap.get(value)};
            }
        }
        return new int[0];
    }
}
