package nurgulia.week4;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        //Write a return method that can remove the duplicated values from String
        //Ex: removeDup("AAABBBCCC") ==> ABC

        System.out.println(removeDup("AAABBBCCC"));

    }

    public static String removeDup(String str) {
        String result = "";
        List<String> values = new ArrayList<>(Arrays.asList(str.split("")));
        for (int i = 0; i < values.size(); i++) {

            if (!result.contains(values.get(i))) {
                result += values.get(i);

            }

        }

        return result;

    }


}
