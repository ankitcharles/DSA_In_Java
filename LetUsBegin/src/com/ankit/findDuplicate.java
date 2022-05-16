package com.ankit;

import java.util.HashSet;

public class findDuplicate {
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>(nums.length);
        for (int n:nums){
            if (set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {4,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
