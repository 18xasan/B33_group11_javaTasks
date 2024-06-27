package atil.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {

/*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/


    public static List<String> removeAhmed(List<String> names) {
        names.removeIf(name -> name.equals("Ahmed"));
        return names;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Michael"));
        List<String> result = removeAhmed(names);
        System.out.println(result); // Output: [John, Eric, Michael]
    }
}
