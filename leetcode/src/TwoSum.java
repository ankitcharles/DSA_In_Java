import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSumNumbers(int[] nums,int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target=9;
        System.out.println("values of two sum:" +Arrays.toString(twoSumNumbers(nums, target)));
    }
}
