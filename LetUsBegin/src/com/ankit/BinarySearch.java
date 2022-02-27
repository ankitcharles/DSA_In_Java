package com.ankit;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -5, -2,0,2,4,5,9,16,18,20,22};
        int target = -5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
            return -1;
        }
    }

