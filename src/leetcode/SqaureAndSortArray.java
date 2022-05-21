package leetcode;

import java.util.Arrays;

public class SqaureAndSortArray {
    public static int[] squareAndSort(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int left =0;
        int right = n-1;
        for(int i=n-1;i>=0;i--){
            int square;
            if (Math.abs(nums[left])<Math.abs(nums[right])){
                square=nums[right];
                right--;
            }
            else{
                square=nums[left];
                left++;
            }
            result[i]=square * square;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums =  {-7,-3,2,3,11};
        System.out.println(Arrays.toString(squareAndSort(nums)));
    }
}
