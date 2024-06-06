package Lilia.week4;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        //Write a return method that can find the frequency of characters
        //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


        FrequencyOfChars ("AAABBCDD");

    }

    public static void FrequencyOfChars (String str){
        String frequencyStr = "";
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            frequencyMap.put( each, frequency);
        }

        //String frequencyStr = frequencyMap.toString();


        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            frequencyStr += entry.getKey() + entry.getValue();
       }
        System.out.println(frequencyStr);

    }
}



