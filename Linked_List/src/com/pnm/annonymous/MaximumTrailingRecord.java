package com.pnm.annonymous;

public class MaximumTrailingRecord {
    public static int maxTrails(int[] arr){
        int maxTrailCount =0;
        int minVal =arr[0];

        for(int i=1;i<arr.length;i++){
            minVal = Math.min(minVal,arr[i]);
            maxTrailCount = Math.max(maxTrailCount,arr[i]-minVal);
        }

        return maxTrailCount >0 ? maxTrailCount : -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,6,7,4};
        System.out.println("Max Trails : "+maxTrails(arr));
    }
}
