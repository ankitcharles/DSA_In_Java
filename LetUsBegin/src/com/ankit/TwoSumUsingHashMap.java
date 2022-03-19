package com.ankit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {
    public static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            int x = target-curr;
            if (map.containsKey(x)){
                return new int[] {map.get(x),i};
            }
            map.put(curr,i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
