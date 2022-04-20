import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ArrayL {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");

        list.replaceAll(a ->a.toUpperCase(Locale.ROOT));
        System.out.println(list);
    }
}
