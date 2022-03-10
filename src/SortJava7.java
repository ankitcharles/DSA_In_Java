import java.util.*;

public class SortJava7 {

public List<String> printString(List<String> list){
    list.forEach(System.out::println);
    return list;
}

    public List<String> sortedStrings(List <String> list){

        System.out.println("Java 7");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        printString(list);
        System.out.println("-------------------------");
        return list;
    }

    public static void main(String[] args) {
        SortJava7 sortJava7 = new SortJava7();
        List<String> list = Arrays.asList("Foo","Baar","Bashi","Bo");
        sortJava7.sortedStrings(list);
    }
}
