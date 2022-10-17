package Java8;

import java.util.ArrayList;
import java.util.List;

public class StreamMapDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Dave");
        list.add("Roger");
        list.add("Richard");
        list.add("Estella");
        // use map operation
        list.stream()
                .map(name->name.toUpperCase())
                .forEach(System.out::println);
        // use mapToInt
        list.stream()
                .mapToInt(name->name.length())
                .forEach(System.out::println);
    }
}
