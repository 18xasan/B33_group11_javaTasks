package week5;

import java.util.*;

public class findUnique {
    public static void main(String[] args) {
        /*Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

        System.out.println("returnUniqueChars(\"AAABBBCCCDEF\") = " + returnUniqueChars("AAABBBCCCDEF"));

        String input = "AAABBBCCCDEF";
        String uniqueChars = unique(input);
        System.out.println("Unique characters: " + uniqueChars);
    }

    public static String returnUniqueChars(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
                if (str.indexOf(currChar) == str.lastIndexOf(currChar)) {
                    res+= currChar;

                }

            }
        return res;

        }

    public static String unique(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }





    }

