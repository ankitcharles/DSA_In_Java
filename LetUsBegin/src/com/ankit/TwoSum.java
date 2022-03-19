package com.ankit;

import java.util.Arrays;

public class TwoSum {
    public static int[] findSum(int[] arr, int n){
        int [] result = new int[2];
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==n){
                    result[0]=arr[i];
                    result[1]=arr[j];
                }
            }
            return result;
        }
        return arr;
    }

    public static void main(String[] args) {
        int n =9;
        int[] arr = {2,4,5,7,8};
        int[] result = findSum(arr,n);
        System.out.println(Arrays.toString(result));
    }
}
