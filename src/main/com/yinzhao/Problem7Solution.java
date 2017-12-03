package com.yinzhao;

/**
 * Created by zhaoyongwang on 2017/12/3.
 */
public class Problem7Solution {
    public int reverse(int x) {
        String numStr = String.valueOf(x);
        char[] array = numStr.toCharArray();

        StringBuilder builder = new StringBuilder();
        int end = 0;
        if (array[0] == '-') {
            builder.append(array[0]);
            end = 1;
        }
        for (int i = array.length-1; i >= end; i--) {
            builder.append(array[i]);
        }

        try {
            return Integer.parseInt(builder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
