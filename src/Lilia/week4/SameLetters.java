package Lilia.week4;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {

    public static void main(String[] args) {
        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false:

        same("abc", "cab");
        same("abc", "abb");

    }
        public static void same(String str1, String str2) {
            str1 = new TreeSet<String>(Arrays.asList( str1.split(""))).toString( );
            str2 = new TreeSet<String>(Arrays.asList( str2.split(""))).toString( );
            System.out.println(str1.equals(str2));
        }
}
