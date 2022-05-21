package leetcode;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

public class EvenNumbersCount {
    public static void main(String[] args) {
        int[] arr = new int[]{12,345,2,6,7896};
        List<Integer> list = Arrays.stream(arr).boxed().filter(n -> n%2==0).collect(toList());
        int count = list.size();
        System.out.println(count);
       // Arrays.stream(arr).filter(n -> n%2==0).forEach(System.out::println);

    }
}
