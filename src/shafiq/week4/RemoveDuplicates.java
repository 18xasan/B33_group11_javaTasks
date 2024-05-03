package shafiq.week4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The {@code RemoveDuplicates} class consists of several different methods to remove duplicates from a string.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        // Test input
        String testString = "AAABBBCCC";

        /**
         * Test {@code RemoveDuplicates.removeDup} method.
         */
        String result1 = RemoveDuplicates.removeDup(testString);
        System.out.println("removeDup result: " + result1);

        /**
         * Test {@code RemoveDuplicates.removeDupUsingSet} method.
         */
        String result2 = RemoveDuplicates.removeDupUsingSet(testString);
        System.out.println("removeDupUsingSet result: " + result2);

        /**
         * Test {@code RemoveDuplicates.removeDupUsingStream} method.
         */
        String result3 = RemoveDuplicates.removeDupUsingStream(testString);
        System.out.println("removeDupUsingStream result: " + result3);

        /**
         * Test {@code RemoveDuplicates.removeDupUsingHashSet} method.
         */
        String result5 = RemoveDuplicates.removeDupUsingHashSet(testString);
        System.out.println("removeDupUsingHashSet result: " + result5);

        /**
         * Test {@code RemoveDuplicates.removeDupUsingLinkedHashSet} method.
         */
        String result8 = RemoveDuplicates.removeDupUsingLinkedHashSet(testString);
        System.out.println("removeDupUsingLinkedHashSet result: " + result8);
    }


    /**
     * Removes duplicates from a string using a simple check and concatenation technique.
     * If the character at index 'i' is not already in the result, it is added.
     *
     * @param str the input string.
     * @return a string without duplicate characters.
     */
    public static String removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    /**
     * Removes duplicates using a LinkedHashSet, which maintains the order of insertion,
     * and a StringBuilder to build the final string.
     *
     * @param str the input string.
     * @return a string without duplicate characters.
     */
    public static String removeDupUsingSet(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (Character ch : set) {
            result.append(ch);
        }
        return result.toString();
    }

    /**
     * A Java 8 way to remove duplicates, using the Stream API and the 'distinct' method,
     * which returns a stream consisting of distinct elements based on an object's equals behavior.
     *
     * @param str the input string.
     * @return a string without duplicate characters.
     */
    public static String removeDupUsingStream(String str) {
        return str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }


    /**
     * Removes duplicates using HashSet, which does not maintain the order of insertion,
     * and a StringBuilder to build the final string.
     *
     * @param str the input string.
     * @return a string without duplicate characters.
     */
    public static String removeDupUsingHashSet(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (Character ch : set) {
            result.append(ch);
        }
        return result.toString();
    }


    /**
     * Removes duplicates using a LinkedHashSet (like removeDupUsingSet method).
     * Repeated for demonstrating different approaches.
     *
     * @param str the input string.
     * @return a string without duplicate characters.
     */
    public static String removeDupUsingLinkedHashSet(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (Character ch : set) {
            result.append(ch);
        }
        return result.toString();
    }

}

//String -- Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex: removeDup("AAABBBCCC") ==> ABC
