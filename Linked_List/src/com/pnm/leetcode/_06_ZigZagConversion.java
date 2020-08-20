package com.pnm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _06_ZigZagConversion {
    public static String convert(String s, int numRows){
        Map<Integer,StringBuilder> map = new HashMap<>();
        int pos = 0;
        boolean incr = true;
        for(char c : s.toCharArray()){
            if (pos == numRows) incr=false;
            if (pos == 1) incr=true;

            if(incr)
                pos++;
            else
                pos--;

            if(!map.containsKey(pos))
                map.put(pos,new StringBuilder());

            map.get(pos).append(c);
        }

        StringBuilder sb =  new StringBuilder();
        for(int i: map.keySet())
            sb.append(map.get(i));

        return  sb.toString();
    }

    public static void main(String[] args) {
        String src = "PAYPALISHIRING";
        String dstn = convert(src,4);

        System.out.println("Input : "+src+"\nOutput : "+dstn);
    }
}
