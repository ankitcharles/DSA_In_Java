// Given an array, find the average of each subarray of 'K' contiguous elements in it.
package educative.io.bruteforce;

import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {
    public static double[] findAverage(int K,int[] arr){
    double [] result = new double[arr.length-K+1];
    for(int i=0;i<arr.length-K;i++){
        //find sum of next K elements
        double sum=0;
        for (int j=i;j<i+K;j++){
            sum+=arr[j];
            result[i] = sum/K;
        }
    }
        return result;
    }
    public static void main(String[] args) {
        double result[] = AverageOfSubarrayOfSizeK.findAverage(5, new int[]{1,3,2,6,-1,4,1,8,2});
        System.out.println("Average of subarray of size K: " +Arrays.toString(result));
    }
}
