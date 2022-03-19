package com.ankit;

public class MergeSortedArrays {
 public  static int[] mergeArrays(int[] arr1, int[] arr2){
     int s1 = arr1.length;
     int s2 = arr2.length;
     int[] resultantArray = new int[s1+s2];
     int i=0, j=0, k=0;

   while(i<s1 && j<s2){
       if (arr1[i]<arr2[j])
           resultantArray[k++]=arr1[i++];
       else
           resultantArray[k++] = arr2[j++];

   }
    while (i<s1)
        resultantArray[k++]=arr1[i++];
    while (j<s2)
        resultantArray[k++]=arr2[j++];
    return resultantArray;
 }

    public static void main(String[] args) {
        int[] arr1 = {1,12,14,17,23};
        int[] arr2 = {11,19,27};
        int[] resultantArray = mergeArrays(arr1,arr2);

        System.out.println("Arrays after sorting:");
        for(int i=0;i<arr1.length+arr2.length;i++){
            System.out.println(resultantArray[i] + " ");
        }
    }
}
