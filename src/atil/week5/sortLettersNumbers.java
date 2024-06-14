package atil.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortLettersNumbers {
    public static void main(String[] args) {
        // Test the method with a sample string
        String result = sortLettersNumbers("DC501GCCCA098911");
        System.out.println(result);  // Output should be "CD015ACCCG011899"
    }

    public static String sortLettersNumbers(String str) {
        StringBuilder sortedStr = new StringBuilder();
        List<Character> tempList = new ArrayList<>();
        boolean isDigit = Character.isDigit(str.charAt(0));

        // Use a for loop to iterate through the characters of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch) == isDigit) {
                tempList.add(ch);
            } else {
                appendSorted(tempList, sortedStr);
                tempList.clear();
                tempList.add(ch);
                isDigit = !isDigit;
            }
        }

        // Append the last collected group
        appendSorted(tempList, sortedStr);

        return sortedStr.toString();
    }

    private static void appendSorted(List<Character> tempList, StringBuilder sortedStr) {
        Collections.sort(tempList);
        for (char ch : tempList) {
            sortedStr.append(ch);
        }
    }
}