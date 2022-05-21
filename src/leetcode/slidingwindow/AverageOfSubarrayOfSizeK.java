package leetcode.slidingwindow;

import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {
    public static double[] findAverages(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd]; // find the sum of current window
            // slide the window only if we have hit the end of current window i.e; k.
            if (windowEnd >= k - 1) {
                result[windowStart] = windowSum / k; // calculate the average
                windowSum -= nums[windowStart]; // subtract the element leaving out
                windowStart++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        double result[] = AverageOfSubarrayOfSizeK.findAverages(new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 },5);
        System.out.println(Arrays.toString(result));
    }

}