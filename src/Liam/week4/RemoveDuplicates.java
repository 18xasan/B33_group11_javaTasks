package Liam.week4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);
        return result;
    }
    public static String removeDup2(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", " ,  "" ).replace("[","").replace("]","");
        return  str;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("aaabbbccc"));
        System.out.println(removeDup2("aaabbbccc"));
    }

}
