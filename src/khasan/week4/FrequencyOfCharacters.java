package khasan.week4;

import org.w3c.dom.ls.LSOutput;

public class FrequencyOfCharacters {


    public static void main(String[] args) {

        //Write a return method that can find the frequency of characters
        //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String str = "AAABBCDD";
        System.out.println(frequencyOfChars(str)); // Output: A3B2C1D2
    }

    public static String frequencyOfChars(String str) {
        String result = "";
        int count;

        // Iterate through each character in the str string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count = 1;

            // Check if the character is already counted
            if (result.contains("" + ch)) {
                continue;
            }

            // Count the frequency of the current character
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            // Append the character and its frequency to the result string
            result += ch + "" + count;
        }

        return result;
    }


}




