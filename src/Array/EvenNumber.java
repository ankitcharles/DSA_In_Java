package Array;

public class EvenNumber {
    public static void main(String[] args) {
        int[] nums = new int[] {12,345,2,6,7896,12,34,1234};
        int count =0;
        int finalCount=0;
        for (int i=0; i<nums.length;i++){
            int number = nums[i];
            if (number!=0){
                while (number>0){
                    number = number/10;
                    count++;
                }
                if (count%2==0)
                    finalCount++;
            }
            count=0;
        }
        System.out.println(finalCount);
    }
}
