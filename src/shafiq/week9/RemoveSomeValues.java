package shafiq.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSomeValues {

//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.


public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(50);
    list.add(150);
    list.add(75);
    list.add(3222);
    list.add(1);
    list.add(234);
    list = removeValuesGreaterThan100(list);
    System.out.println(list);
}

    public static List<Integer> removeValuesGreaterThan100(List<Integer> list) {
        return list.stream()
                .filter(value -> value < 100)
                .collect(Collectors.toList());
    }



}
