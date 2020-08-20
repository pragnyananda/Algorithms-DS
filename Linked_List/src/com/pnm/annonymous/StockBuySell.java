package com.pnm.annonymous;

public class StockBuySell {
    public static int calcProfit(int[] arr){
        int totalProfit = 0;
        for (int i=1;i<arr.length;i++){
            int currProfit =  arr[i] - arr[i-1];
            if(currProfit > 0) totalProfit +=currProfit;
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] arr = {100,80,120,130,70,60,100,125};
        System.out.println("max prof : "+calcProfit(arr));
    }
}
