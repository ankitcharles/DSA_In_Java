package HashMap;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class HashMapIterationDemo {
    public static void main(String[] args) {
        Map<String,Integer> fruits = new HashMap<>();
        fruits.put("apple",10);
        fruits.put("banana",20);
        fruits.put("pineapple",12);

        fruits.forEach((k,v) -> System.out.println("key:" +k +"value" +v));

    }
}
