package com.pnm.leetcode;

public class _05_LongestPalendromicSubString {

    int resultStart;
    int resultLength;

    public String longestPalindrome(String s) {
        int strLength = s.length();
        if (strLength < 2) {
            return s;
        }
        for (int start = 0; start < strLength - 1; start++) {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public static void main(String[] args) {
        _05_LongestPalendromicSubString obj = new _05_LongestPalendromicSubString();
        System.out.println("Longest Substring palendrome : "+obj.longestPalindrome("abcbd"));
    }
}
