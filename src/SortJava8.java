import java.util.*;

public class SortJava8{

    public List<String> printString(List<String> list){
        list.forEach(System.out::println);
        return list;
    }

    public List<String> sortedStrings(List <String> list){

        System.out.println("Java 8");
        Collections.sort(list, (s1,s2) -> s1.length()-s2.length());

        //list.sort(Comparator.comparingInt(String::length));
        printString(list);
        System.out.println("-------------------------");
        return list;
    }

    public static void main(String[] args) {
        SortJava8 sortJava8 = new SortJava8();
        List<String> list = Arrays.asList("Foo","Baar","Bashi","Bo");
        sortJava8.sortedStrings(list);
    }
}
