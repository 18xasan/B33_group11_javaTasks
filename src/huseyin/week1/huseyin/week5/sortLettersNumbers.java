package huseyin.week1.huseyin.week5;

import java.util.Arrays;

public class sortLettersNumbers {
    /*Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"*/

    public static void main(String[] args) {
        System.out.println("sortLettersNumbers(\"DC501GCCCA098911\") = " + sortLettersNumbers("DC501GCCCA098911"));
    }

    public static String sortLettersNumbers(String str) {
        String[] arr = str.split("");
        Arrays.sort(arr);
        return String.join("", arr);
    }

}
