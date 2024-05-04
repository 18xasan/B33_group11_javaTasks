package shafiq.week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {


    // Test method
    public static void main(String[] args) {
        String testStr = "AAABBCDD";
        System.out.println("Frequency of characters: " + frequencyOfChar1(testStr));
        System.out.println("Frequency of characters: " + frequencyOfChar2(testStr));

    }

    /**
     * This method calculates the frequency of each character in a string.
     *
     * @param str The input string.
     * @return A string regarding the frequency of each character in the input string.
     */

    public static String frequencyOfChar2(String str) {
        // Create an empty StringBuilder to store the final result
        StringBuilder result = new StringBuilder();

        // Continue the loop until the input string is empty
        while (!str.isEmpty()) {
            // Pick the first character of the string
            char ch = str.charAt(0);
            // Variable to store the count of occurrences of 'ch'
            int count = 0;

            // Loop through the string to count the instances of 'ch'
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }

            // Append the character and its count to the result
            result.append(ch).append(count);

            // Remove all instances of 'ch' from str
            str = str.replaceAll(Character.toString(ch), "");
        }

        // Convert the StringBuilder to string and return it
        return result.toString();
    }

    /**
     * This method calculates the frequency of characters in a string, assuming the string is not sorted.
     * It uses a HashMap to keep track of the frequency of each character.
     *
     * @param str the input string
     * @return a string representation of each character in the string and its frequency
     */
    public static String frequencyOfChar1(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }


}

//String -- Frequency of Characters
//Write a return method that can find the frequency of characters
//Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
