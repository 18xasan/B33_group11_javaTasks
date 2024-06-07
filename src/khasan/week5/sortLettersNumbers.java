package khasan.week5;

import java.util.ArrayList;
import java.util.Arrays;

public class sortLettersNumbers {

    public static void main(String[] args) {


    /*Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"*/

        String result = sortAlphanumeric("DC501GCCCA098911");
        System.out.println(result);  // Output should be "CD015ACCCG011899"
    }

    public static String sortAlphanumeric(String str) {
        ArrayList<String> substrings = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        // Step 1: Split the string into substrings of consecutive letters or numbers
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                current.append(str.charAt(i));
            } else {
                char prevChar = str.charAt(i - 1);
                char currentChar = str.charAt(i);

                if (Character.isDigit(prevChar) && Character.isDigit(currentChar) ||
                        Character.isLetter(prevChar) && Character.isLetter(currentChar)) {
                    current.append(currentChar);
                } else {
                    substrings.add(current.toString());
                    current.setLength(0);
                    current.append(currentChar);
                }
            }
        }
        substrings.add(current.toString()); // Add the last collected substring

        // Step 2: Sort each substring
        for (int i = 0; i < substrings.size(); i++) {
            char[] chars = substrings.get(i).toCharArray();
            Arrays.sort(chars);
            substrings.set(i, new String(chars));
        }

        // Step 3: Append sorted substrings together
        StringBuilder sortedString = new StringBuilder();
        for (String s : substrings) {
            sortedString.append(s);
        }

        return sortedString.toString();
    }
}
