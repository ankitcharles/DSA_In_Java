package HashMap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle",57);
        stockPrice.put("Fiserv",117);
        stockPrice.put("BMW",73);
        stockPrice.put("Microsoft",215);

        Set<Map.Entry<String,Integer>> entrySet = stockPrice.entrySet();

        for (Map.Entry<String,Integer> entry : entrySet){
            System.out.println("Company Name:" + entry.getKey() +"Stock Price" +entry.getKey());
        }
        // This will insert netflix in the stock price map
      /*  stockPrice.compute("Netflix",(k,v) -> v==null ? 175 :v+1);

        System.out.println("HashMap keys");
        Set<String> keys= stockPrice.keySet();
        for (String key : keys)
            System.out.println(key);

        Collection<Integer> values = stockPrice.values();
        for (int value :values){
            System.out.println(value); */
        }
    }
