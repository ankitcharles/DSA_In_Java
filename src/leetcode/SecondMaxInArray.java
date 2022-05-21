package leetcode;

public class SecondMaxInArray {
    /*public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    } */

    public static int findSecondMax2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secMax = max;
                max = nums[i];
            } else if (nums[i] > secMax && nums[i] != max) {
                secMax = nums[i];
            }
        }
            return secMax;
        }

        public static void main (String[]args){
            int[] arr = new int[]{-2, -33, -10, -345};
            System.out.println(findSecondMax2(arr));
        }

    }

