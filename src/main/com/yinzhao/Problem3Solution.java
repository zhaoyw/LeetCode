package com.yinzhao;

public class Problem3Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int i = 0;
        int start = 0;
        int len = s.length();
        int maxLen = 0;
        StringBuilder builder = new StringBuilder();
        while (i < len) {
            char c = s.charAt(i);
            if (builder.indexOf(String.valueOf(c)) == -1) {
                builder.append(c);
                i++;
                if (builder.length() > maxLen) {
                    maxLen = builder.length();
                }
            } else {
                start++;
                i = start;
                if (builder.length() > maxLen) {
                    maxLen = builder.length();
                }
                builder = new StringBuilder();
            }
        }
        return maxLen;
    }
}
