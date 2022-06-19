package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

        System.out.println(Arrays.toString(arrayList.stream()
                .filter(value -> value.matches("^[ABC]$")).toArray()));
    }
}
