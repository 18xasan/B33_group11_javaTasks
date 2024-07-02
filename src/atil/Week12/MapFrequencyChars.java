package atil.Week12;

//Write a method that prints the frequency of each character from a String

import java.util.HashMap;
import java.util.Map;

public class MapFrequencyChars {

    // Method to print the frequency of each character in a string
    public static void printCharacterFrequencies(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string and count frequencies
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " Frequency: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "hello world";
        printCharacterFrequencies(str);
    }

}
