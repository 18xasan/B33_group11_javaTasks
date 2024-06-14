package shafiq.week5;

import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUnique {

           /*Write a return method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {

        System.out.println("solution1(\"Test String1\") = " + solution1("AAABBBCCCDEF"));
        System.out.println("solution2(\"Test String2\") = " + solution2("AAABBBCCCDEF"));
        System.out.println("solution3(\"Test String3\") = " + solution3("AAABBBCCCDEF"));
        System.out.println("solution4(\"Test String4\") = " + solution4("AAABBBCCCDEF"));
        System.out.println("solution5(\"Test String5\") = " + solution5("AAABBBCCCDEF"));
        System.out.println("solution6(\"Test String6\") = " + solution6("AAABBBCCCDEF"));

    }


    // solution1: Uses a basic for-loop to find unique characters in a string
    public static String solution1(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += str.charAt(i);
                // If the current character at index 'i' does not exist in 'result',
                // add it to 'result'
            }
        }
        return result;
    }

    // solution2: Checks for unique characters by comparing the first and last occurrence indices of each character
    public static String solution2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    // solution3: Uses a HashSet to store the unique characters, then converts it back to a String
    public static String solution3(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            uniqueChars.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (Character c : uniqueChars) {
            result.append(c);
        }
        return result.toString();
    }

    // solution4: Uses Java 8's Stream API to filter out unique characters
    public static String solution4(String str) {
        return str.chars()  // Convert the String to a Stream of chars
                .distinct() // Filter out the unique ones
                .mapToObj(c -> String.valueOf((char) c)) // Map each integer to a character
                .collect(Collectors.joining()); // Collect the result into a String
    }

    // solution5: Similar to solution3 but uses a LinkedHashSet that maintains insertion order
    public static String solution5(String str) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            uniqueChars.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (Character c : uniqueChars) {
            result.append(c);
        }
        return result.toString();
    }

    // solution6: Uses a character array and a boolean array to track unique characters
    public static String solution6(String str) {
        boolean[] visited = new boolean[256];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!visited[c]) {
                visited[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }



}
