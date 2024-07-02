package atil.week11;

import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

//Write a method that can sort the Map by values
public class sortMapbyValues {
    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("k0", 0);
        map.put("k5", 5);
        map.put("k2", 2);
        map.put("k1", 1);
        map.put("k3", 3);

        System.out.println("Original Map: " + map);
        Map<String, Integer> sortedMap = sortByValues(map);
        System.out.println("Sorted Map: " + sortedMap);
    }

}
