package educative.io.slidingwindow;
// this is the sliding window approach.

public class MaxSubarrayOfSizeK {

    public static int findMaxSubarray(int k, int[] arr){
        int windowSum=0,maxSum=0;
        int windowStart=0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum+=arr[windowEnd]; // add the elements for the current window.

            // slide the window only if the window size has reached k.
            if (windowEnd>k-1){
                maxSum = Math.max(maxSum,windowSum);
                maxSum-=arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        System.out.println("Max subarray of size k:" +MaxSubarrayOfSizeK.findMaxSubarray(3,new int[]{2, 1, 5, 1, 3, 2 }));
        System.out.println("Max subarray of size k:" +MaxSubarrayOfSizeK.findMaxSubarray(2, new int[] {2, 3, 4, 1, 5 }));
    }

}
