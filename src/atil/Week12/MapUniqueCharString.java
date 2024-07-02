package atil.Week12;

import java.util.HashMap;
import java.util.Map;

public class MapUniqueCharString {
    public static void printUniqueCharacterFrequencies(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequencies of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print unique characters and their frequencies
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " Frequency: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("String: " + str);
        System.out.println("Unique Characters and Frequencies:");
        printUniqueCharacterFrequencies(str);
    }
}
