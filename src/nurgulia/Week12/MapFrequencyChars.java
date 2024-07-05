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
        for (char c : str.toCharArray()) {
           map.put(c,map.getOrDefault(c,0) + 1);

            }


        return map;
    }

}
