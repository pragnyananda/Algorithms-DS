package com.pnm.leetcode;

import java.util.LinkedList;

public class _02_AddTwoNumbers {
    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int sum=0;
        int carry=0;
        int maxLength=0;

        LinkedList<Integer> l3 = new LinkedList<>();

        int len1=l1.size();
        int len2=l2.size();

        if(len1>=len2)
            maxLength=len2;
        else
            maxLength=len1;

        for (int i=0;i<4;i++){//0001 + 0020 = 0021 =1000+0200=1200
            sum= (l1!=null? l1.get(i):0) + (l2!=null? l2.get(i):0 ) + carry;

           // carry = (sum>=10) ? (carry+=1) : (carry+=0);
          //  sum = (sum>=10) ? (sum%10) : (sum+carry);

            if(sum>=10){
                carry=1;
                sum = sum % 10;
            }
            else {
                sum = sum + carry;
            }
            l3.add(sum);
        }
        if (carry > 0 )
            l3.add(carry);

        return  l3;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list.add(2);
        list.add(4);
        list.add(7);

        list2.add(5);
        list2.add(6);
        list2.add(4);
        list2.add(1);

        int maxLength =3;

        _02_AddTwoNumbers obj = new _02_AddTwoNumbers();
        obj.addTwoNumbers(list,list2);

        System.out.println("Final List is : "+obj.addTwoNumbers(list,list2));
    }
}
