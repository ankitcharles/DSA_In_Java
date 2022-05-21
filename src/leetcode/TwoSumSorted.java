package leetcode;

import java.util.Arrays;

public class TwoSumSorted {
    public static int[] twoSum(int[] nums,int target){
        int low=0;
        int high=nums.length-1;

        while (low<high){
            int currentSum = nums[low] + nums[high];
            if (currentSum==target){
                return new int[] {low+1,high+1};
            }
            else if (currentSum>target)
                high--;
            else low++;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,7,11,15};
        int target =9;
        System.out.println("resultant array:" + Arrays.toString(twoSum(arr,target)));
    }
}
