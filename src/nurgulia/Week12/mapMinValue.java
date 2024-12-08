package nurgulia.Week12;

//Write a method that can return the minimum value from the map (DO NOT use sort method)


import java.util.HashMap;
import java.util.Map;

public class mapMinValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 50);
        map.put("banana", 20);
        map.put("cherry", 30);
        map.put("date", 10);

        System.out.println("findMinValue(map) = " + findMinValue(map));

    }

public static int findMinValue(Map<String,Integer> map){
    // Initialize min with a large value to ensure any value in the map is smaller
    int minValue = Integer.MAX_VALUE;
    for (int value : map.values()) {
        if (value < minValue){
            minValue = value;
        }
    }
    return minValue;
}
}
