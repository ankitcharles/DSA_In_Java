package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Adam",25));
        personList.add(new Person("Rogger", 26));
        personList.add(new Person("Anna",22));

        Collections.sort(personList, Comparator.comparing(Person::getName));

        personList.forEach(System.out::println);

    }
}
