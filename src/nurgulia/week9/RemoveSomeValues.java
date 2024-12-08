package nurgulia.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,1,101,234,7,0,-3,100,657,765);
        System.out.println("removeValuesGreaterThan100(list) = " + removeValuesGreaterThan100(list));
    }
//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

public static List<Integer> removeValuesGreaterThan100(List<Integer> numbers){
        List<Integer> result = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
        if (numbers.get(i) <= 100){
            result.add(numbers.get(i));
        }
    }
    return result;
}

}
