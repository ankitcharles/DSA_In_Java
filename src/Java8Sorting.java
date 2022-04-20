import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Java8Sorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

      /*  List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
       */

        Collections.sort(list,Collections.reverseOrder());
        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        //System.out.println("sorted list:" +list);
        System.out.println("reverse sorted list:" + sortedList);

    }
}
