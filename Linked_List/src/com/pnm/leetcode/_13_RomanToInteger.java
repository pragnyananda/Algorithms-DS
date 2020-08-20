package com.pnm.leetcode;

public class _13_RomanToInteger {
    public static void main(String[] args) {
        _13_RomanToInteger obj = new _13_RomanToInteger();
        System.out.println(obj.romanToInt("".toUpperCase()));

    }
        public int romanToInt(String s) {
            int getVal=0,prev = 0,sum=0;
            for(int i=s.length()-1; i >-1 ;i--){
                getVal = getRomanValue(s.charAt(i));

                if(getVal == 0)
                    return 0;

                if(getVal < prev)
                    sum -= getVal;
                else if(getVal >= prev)
                    sum += getVal;

                prev = getVal;
            }
            return sum;
        }

        public int getRomanValue(char symbol){

            switch (symbol) {
                case 'I':
                    return 1;

                case 'V':
                    return 5;

                case 'X':
                    return 10;

                case 'L':
                    return 50;

                case 'C':
                    return 100;

                case 'D':
                    return 500;

                case 'M':
                    return 1000;

                default:
                    return 0;
            }
        }
    }
