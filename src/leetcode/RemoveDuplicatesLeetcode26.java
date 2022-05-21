package leetcode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/solution/
public class RemoveDuplicatesLeetcode26 {

        public static int removeDuplicates(int[] nums){
            if (nums.length==0) return 0;
            int index=0;
            for (int j=1;j<nums.length;j++){
                if (nums[j]!=nums[index]){
                    index++;
                    nums[index]=nums[j];
                }
            }
            return index+1;
        }
    public static void main(String[] args) {
            int[] arr = new int[]{1,1,1,2,2,3,4};
        System.out.println(removeDuplicates(arr));


    }
}
