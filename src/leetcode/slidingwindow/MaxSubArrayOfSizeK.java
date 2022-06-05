package leetcode.slidingwindow;
import java.util.Arrays;
public class MaxSubArrayOfSizeK {
    public static int findMaximum(int[] nums, int k) {
        int windowSum = 0;
        int maxSum=0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd]; // find the sum of current window
            // slide the window only if we have hit the end of current window i.e; k.
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum,windowSum);
                windowSum -= nums[windowStart]; // subtract the element leaving out
                windowStart++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int maximum = MaxSubArrayOfSizeK.findMaximum(new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 },5);
        System.out.println("Maximum:" +maximum);
    }
}
