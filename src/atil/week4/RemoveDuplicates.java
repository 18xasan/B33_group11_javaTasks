package atil.week4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class RemoveDuplicates {

    public static void main(String[] args) {

        String testString = "AAABBBCCC";


        String result1 = RemoveDuplicates.removeDup(testString);
        System.out.println("removeDup result: " + result1);

    }


    public static String removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}