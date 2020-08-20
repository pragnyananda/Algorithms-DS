package com.pnm.annonymous;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSumThreeSum {
    public void twoSumCalc (int[] arr, int sum){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i< arr.length; i++){
            int complement = sum-arr[i];
            if(map.containsKey(arr[i]))
                System.out.println("pair is "+arr[i]+":"+complement);
            map.put(complement,i);
        }
    }

    public void threeSumCalc(int[] arr,int target) {

        for(int i=0;i<arr.length -2 ; i++){
            int firstVal = arr[i];
            int twoSum = target-arr[i];

            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<arr.length ; j++){
                int complement = twoSum-arr[j];
                if(set.contains(arr[j]))
                    System.out.println("Triplet is "+arr[i]+":"+arr[j]+":"+complement);
                set.add(complement);
            }
        }
    }

    public static void main(String args[]){
        TwoSumThreeSum ts = new TwoSumThreeSum() ;

        int[] arr = {3,4,7,6,5,1,2,8,5};
        int target =10;

        ts.twoSumCalc(arr,target);
        ts.threeSumCalc(arr,target);

    }
}