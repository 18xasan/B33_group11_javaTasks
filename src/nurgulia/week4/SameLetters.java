package nurgulia.week4;

import java.util.HashSet;
import java.util.Set;

public class SameLetters {

    public static void main(String[] args) {

        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false:

        System.out.println("same(\"abc\", \"abb\") = " + same("abc", "abb"));
        System.out.println("same(\"abc\", \"cab\") = " + same("abc", "cab"));
    }


    public static boolean same(String str1, String str2) {
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
