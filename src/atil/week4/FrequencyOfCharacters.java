package atil.week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {


    // Test method
    public static void main(String[] args) {
        String testStr = "AAABBCDD";
        System.out.println("Frequency of characters: " + frequencyOfChar1(testStr));

    }

    public static String frequencyOfChar1(String str) {

        StringBuilder result = new StringBuilder();


        while (!str.isEmpty()) {

            char ch = str.charAt(0);

            int count = 0;


            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }

            result.append(ch).append(count);

            str = str.replaceAll(Character.toString(ch), "");
        }

        return result.toString();

    }

}

