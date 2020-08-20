package com.pnm.annonymous;

import java.lang.reflect.Array;
import java.util.Arrays;

//input 0 2 1 2 0
//Output 0 0 1 2 2
public class Sort012 {

    public void sorted012 (int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <=high){
            if(arr[mid]==0){
                swap(arr[mid],arr[low]);
                mid++;
                low++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr[high],arr[mid]);
                high--;
            }
        }
    }
    public void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
    }

    public static void main(String[] args) {
        int []arr = {0,1,0,2,1,2};

        Sort012 obj = new Sort012();
        obj.sorted012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
