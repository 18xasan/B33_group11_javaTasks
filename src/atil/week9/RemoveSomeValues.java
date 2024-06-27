package atil.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {

//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.



    public static List<Integer> removeValuesGreaterThan100(List<Integer> values) {
        values.removeIf(value -> value > 100);
        return values;
    }

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(Arrays.asList(1, 50, 100, 101, 150, 200));
        List<Integer> result = removeValuesGreaterThan100(values);
        System.out.println(result); // Output: [1, 50, 100]
    }
}
