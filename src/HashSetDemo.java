import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(10);
        set.add(8);
        set.add(20);

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        list.forEach(System.out::println);

    }
}
