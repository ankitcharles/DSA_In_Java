package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class SortByValues {
    public static TreeMap<String,Integer> sortByValues(TreeMap<String,Integer> map){
        Comparator<String> valueComparator = new Comparator<String>() {
            @Override
            public int compare(String key1, String key2) {
                int comp = map.get(key1).compareTo(map.get(key2));
                if (comp==0)
                    return 1;
                else
                    return comp;
            }
        };
        TreeMap<String,Integer> mapSortedByValues = new TreeMap<>(valueComparator);
        mapSortedByValues.putAll(map);
        return mapSortedByValues;
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 76);
        map.put("Novartis", 87);
        map.put("Google", 23);
        map.put("Audi", 101);
        System.out.println(sortByValues(map));
    }
}
