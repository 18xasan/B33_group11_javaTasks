package nurgulia.week4;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        //Write a return method that can find the frequency of characters
        //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        System.out.println(frequencyOfCharacters("AAABBCDD"));
        System.out.println(frequencyOfCharacters("zzzABBjjkluDD"));
        System.out.println(frequencyOfCharacters("ittihjnbslbns"));
        System.out.println(frequencyOfCharacters("ooosieji55"));
    }


    public static String frequencyOfCharacters(String str) {

         String res = "";
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            freq.put(each, frequency);
        }
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            res += entry.getKey() + entry.getValue();
        }

        return res;


        //  return map.toString();

    }
}



