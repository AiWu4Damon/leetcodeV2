package com.damon.leetcode;

/**
 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 */
class Solution1 {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        str = str.trim();
        char sum = '+';
        char sub = '-';
        int maxLength = 10;
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == sub || str.charAt(0) == sum || ('0' <= str.charAt(0) && str.charAt(0) <= '9')) {
            int index = 0;
            for (int i = 1, length = str.length(); i < length; i++) {
                char n = str.charAt(i);
                if ('0' <= n && n <= '9') {
                    index = i;
                } else {
                    break;
                }
                if (index > 10) {
                    return 0;
                }
            }
            if (str.charAt(0) == '+') {
                if (index < 10) {
                    return Integer.parseInt(str.substring(1, index + 1));
                } else {

                }
            }
            if (str.charAt(0) == '-') {
                if (index < 10) {
                    return Integer.parseInt(str.substring(1, index + 1));
                }
            }
        }


        return 0;
    }
}