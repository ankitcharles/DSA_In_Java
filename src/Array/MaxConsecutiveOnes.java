package Array;

public class MaxConsecutiveOnes {
    public static int findMaxConsOnes(int[] arr){
        int count=0;
        int result=0;
        for (int i=0; i< arr.length;i++){
            if (arr[i]==1){
                count++;
                result=Math.max(result,count);
            }
            else{
                count = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1,0,1,1,1};
        System.out.println(findMaxConsOnes(arr));
    }
}
