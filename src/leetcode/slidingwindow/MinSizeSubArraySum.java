package leetcode.slidingwindow;

public class MinSizeSubArraySum {
    public static int findMinSizeArraySum(int target ,int[] arr){
        int length = arr.length;
        int lengthOfSmallestSubArray = Integer.MAX_VALUE;
        int windowStart=0;
        int windowSum=0;
        for(int windowEnd=0;windowEnd<length;windowEnd++){
            windowSum+=arr[windowEnd]; // find the sum with next element
            while (windowSum>=target){
                lengthOfSmallestSubArray=Math.min(lengthOfSmallestSubArray,windowEnd-windowStart+1);
                windowSum-=arr[windowStart];
                windowStart++;
            }
        }
            return lengthOfSmallestSubArray==Integer.MAX_VALUE ? 0:lengthOfSmallestSubArray;
    }
    public static void main(String[] args) {
        int result = MinSizeSubArraySum.findMinSizeArraySum(7, new int[] { 2, 1, 5, 2, 3, 2 });
        System.out.println("Smallest subarray length: " + result);
        result = MinSizeSubArraySum.findMinSizeArraySum(8, new int[] { 3, 4, 1, 1, 6 });
        System.out.println("Smallest subarray length: " + result);
        result = MinSizeSubArraySum.findMinSizeArraySum(8, new int[] { 2, 1, 5, 2, 3, 2});
        System.out.println("Smallest subarray length: " + result);
    }
}
