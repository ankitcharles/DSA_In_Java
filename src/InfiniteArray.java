public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,20,50,80,90};
        int target = 10;
        System.out.println(findTarget(arr,target));
    }
    static int findTarget(int[] arr,int target){
                int start = 0;
                int end =1;

                while(target>arr[end]){
                    int temp = end+1; // set next start to temp
                    // find end
                    end = end+(end-start+1)*2;
                }
                return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
