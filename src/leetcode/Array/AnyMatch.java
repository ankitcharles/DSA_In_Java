package leetcode.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnyMatch {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ankit");
        arrayList.add("Rogger");
        arrayList.add("Charles");
        arrayList.add("Darwin");
        arrayList.add("Waters");
        List<String> list= arrayList.stream()
                .filter(value->value.matches("^[ABC]$"))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
