package leetcode.DS1.Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
public static Boolean findDuplicate(int[] nums){
    Set<Integer> set = new HashSet<>();
    boolean duplicate = false;
    for (int i:nums){
        if (!set.add(i)){
            duplicate=Boolean.TRUE;
            break;
        }
    }
return duplicate;
}

    public static void main(String[] args) {
    int[] nums = new int[]{1,2,3,1};
    boolean duplicate=findDuplicate(nums);
        System.out.println("Array contains duplicates:"+ duplicate);
    }

}
