package nurgulia.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {

/*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/

    public static void main(String[] args) {

        List<String> newList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println("removeName(newList) = " + removeName(newList,"Ahmed"));
    }
    public static List<String> removeName(List<String> listOfNames , String name){
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < listOfNames.size(); i++) {
            if (!listOfNames.get(i).equals(name)){
                newList.add(listOfNames.get(i));

            }
        }
        return newList;
    }



}
