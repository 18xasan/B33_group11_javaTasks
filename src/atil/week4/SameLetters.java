package atil.week4;

import java.util.*;


public class SameLetters {


    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(same(str1, str2));

    }


    public static boolean same(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    }

