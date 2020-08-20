package com.pnm.leetcode;

public class _08_StringToIntegerATOI {
    public static int myAtoi(String str) {
        str= str.trim();
        long intVal = 0;
        boolean isNegetive = false;

        for(int i=0; i<str.length() ;i++){
            if(str.charAt(i)=='-')
                isNegetive = true;
            try{
                intVal = intVal*10 + Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            catch(NumberFormatException e){
            }
        }

        if(intVal > Integer.MAX_VALUE)
            intVal = Integer.MAX_VALUE;
        if(intVal < Integer.MIN_VALUE)
            intVal = Integer.MIN_VALUE;

        return isNegetive==true ? (int)-intVal : (int)intVal;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("  abcd 10w3"));
    }
}
