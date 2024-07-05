package shafiq.week9;

import java.util.*;

public class RemoveAhmed {

/*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/

    public static void removeAhmed(List<String> names) {
        List<String> temp = new ArrayList<>();

        for (String name : names) {
            if (!name.equals("Ahmed")) {
                temp.add(name);
            }
        }

        names.clear();
        names.addAll(temp);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Ahmed");
        names.add("Sarah");
        removeAhmed(names);
        System.out.println(names);
    }


}
