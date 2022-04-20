import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(24);
        set.add(27);
        set.add(18);
        set.add(12);
        set.add(34);
        set.add(43);

        System.out.println("Tree set element in ascending order" +set);

        TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.add(21);
        reverseSet.add(27);
        reverseSet.add(31);
        reverseSet.add(14);
        reverseSet.add(12);
        reverseSet.add(43);

        System.out.println("Tree set elements in descending order :" +reverseSet);
    }
}
