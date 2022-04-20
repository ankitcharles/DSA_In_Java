package TreeSet;

import java.util.TreeSet;

public class NumberGreaterThen {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 2, 34, 66, 5, 4, 33, 45, 6, 8, 56, 76, 78, 98, 34, 37, 12, 12, 23, 43, 54, 56 };
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : numbers)
            set.add(num);
        System.out.println("Numbers greater than 50 are:" + set.tailSet(new Integer(50)));
    }
}
