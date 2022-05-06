package Array;

import java.util.Arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        //int ans = removeDuplicatesMethod(nums);
        int[] result = removeDuplicates(nums);
        System.out.println(Arrays.toString(result));
        //System.out.println(ans);
    }
    public static int[] removeDuplicates(int[] nums) {
        if (nums.length == 0) return nums ;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        //return i + 1;
        return nums;
    }
}
