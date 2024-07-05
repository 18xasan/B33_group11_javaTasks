package atil.Week12;

//Write a method that can return the minimum value from ta map (DO NOT use sort method)

import java.util.HashMap;
import java.util.Map;

public class mapMinValue {

    public static <K, V extends Comparable<V>> V getMinValue(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            return null; // or throw an exception
        }

        V minValue = null;

        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (minValue == null || entry.getValue().compareTo(minValue) < 0) {
                minValue = entry.getValue();
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("k0", 10);
        map.put("k1", 5);
        map.put("k2", 20);
        map.put("k3", 1);
        map.put("k4", 15);

        Integer minValue = getMinValue(map);
        System.out.println("Minimum value in the map: " + minValue);
    }

}
