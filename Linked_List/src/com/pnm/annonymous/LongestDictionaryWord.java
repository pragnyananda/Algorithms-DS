package com.pnm.annonymous;

import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            List<String> d = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String item = sc.next();
                d.add(item);
            }
            String s = sc.next();
            String result = findLong(s, d);
            System.out.println(result);
            t--;
        }
    }

    public static String findLong(String s, List<String> d) {
        String longest = "";
        for (String dictWord: d) {
            int i = 0;
            for (char c: s.toCharArray()) {
                if (i < dictWord.length() && c == dictWord.charAt(i)) {
                    i++;
                }
            }

            if (i == dictWord.length() && dictWord.length() >= longest.length()) {
                if (dictWord.length() > longest.length() || dictWord.compareTo(longest) < 0)
                    longest = dictWord;
            }
        }
        return longest;
    }
}
