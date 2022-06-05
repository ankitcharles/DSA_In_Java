package leetcode.slidingwindow;

public class MaxSubArrayOfSizeKNew {
    public static int findMax(int[] arr,int k) {
        int windowStart = 0;
        int windowSum = 0;
        int maxSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum = windowSum + arr[windowEnd]; // calculate sum of current window
            // slide window only if we have hit the window size. i.e., k
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int maximumSum = MaxSubArrayOfSizeKNew.findMax(new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 },5);
        System.out.println("Maximum:" +maximumSum);
    }
}
