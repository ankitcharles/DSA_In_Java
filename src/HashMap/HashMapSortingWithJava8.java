package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapSortingWithJava8 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(123, "Alex");
        employeeMap.put(342, "Ryan");
        employeeMap.put(143, "Joe");
        employeeMap.put(234, "Allen");
        employeeMap.put(432, "Roy");

        System.out.println("Sorting By Key");
        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,String> comparingByKey())
                .forEach(System.out::println);

        System.out.println("Sorting By Values");
        employeeMap.entrySet()
                   .stream()
                .sorted(Map.Entry.<Integer,String> comparingByValue())
                .forEach(System.out::println);
    }
}
