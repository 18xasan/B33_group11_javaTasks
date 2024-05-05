package shafiq.week4;

import java.util.*;

/**
 * A class providing methods to check if a string is composed of the same letters
 * as another string
 */
public class SameLetters {

    /**
     * Main method, demonstrating the usage of checking methods with example strings
     *
     * @param args command-line arguments passed to the program
     */
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(same1(str1, str2));
        System.out.println(same2(str1, str2));
        System.out.println(same3(str1, str2));
    }

    /**
     * Converts given strings to Char arrays, sorts them and compares if they are equal.
     *
     * @param str1 First input string
     * @param str2 Second input string
     * @return true if strings have the same letters, false otherwise
     */
    public static boolean same1(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    /**
     * Maps character occurrences to a HashMap for both given strings and compares these maps.
     *
     * @param str1 First input string
     * @param str2 Second input string
     * @return true if strings have the same letters occurrence, false otherwise
     */
    public static boolean same2(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);
    }

    /**
     * Maps characters to a HashSet for both given strings and compares these sets.
     * This method will return true even if the strings have different numbers of the same letters,
     * as it does not consider character occurrence.
     *
     * @param str1 First input string
     * @param str2 Second input string
     * @return true if strings have the same distinct letters, false otherwise
     */
    public static boolean same3(String str1, String str2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        return set1.equals(set2);
    }
}

//String -- Same letters
//Write a return method that checks if a string is build out of the
//same letters as another string.
//Ex: same("abc", "cab"); -> true
//same("abc", "abb"); -> false:
