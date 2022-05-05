package leetcode;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray_1 {
    public static int  removeDuplicates(int[] nums) {
        if (nums.length<3) return nums.length;
        int index =2;
        for (int i=2;i<nums.length;i++){
            if (nums[i]!=nums[index-2]){
                nums[index++] = nums[i];

            }
        }
    return index;
    }

    public static void main(String[] args) {
        int [] nums = new int[] {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
        System.out.println("Array with only 2 duplicate values:" + Arrays.toString(nums));

    }
}
