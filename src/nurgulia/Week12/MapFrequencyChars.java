package nurgulia.Week12;

//Write a method that prints the frequency of each character from a String

import java.util.HashMap;
import java.util.Map;

public class MapFrequencyChars {

    public static void main(String[] args) {
        System.out.println("printFrequencyOfChar(\"hhgutgbirroiie\") = " + printFrequencyOfChar("hhgutgbirroiie"));
    }


    public static Map<Character,Integer> printFrequencyOfChar(String str){
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i)){
                count++;
                map.put(str.charAt(i),count);

            }

        }

        return map;
    }

}
