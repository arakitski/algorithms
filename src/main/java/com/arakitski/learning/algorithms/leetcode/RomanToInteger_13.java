package com.arakitski.learning.algorithms.leetcode;

class RomanToInteger_13 {
    enum Roman {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        private final int val;

        Roman(int val) {
            this.val = val;
        }


        public static Roman valueOf(char ch) {
            return valueOf(String.valueOf(ch));
        }
    }

    public int romanToInt(String s) {
        int len = s.length();
        int last = Roman.valueOf(s.charAt(len - 1)).val;
        int result = last;
        for (int i = len - 2; i >= 0; i--) {
            int cur = Roman.valueOf(s.charAt(i)).val;
            result = cur < last ? result - cur : result + cur;
            last = cur;
        }
        return result;
    }
}