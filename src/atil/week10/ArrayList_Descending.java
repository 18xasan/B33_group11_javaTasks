package atil.week10;

import java.util.ArrayList;

public class ArrayList_Descending {


//    Write a method that can sort the ArrayList in descending order without using the sort method

//    Solution:
// Method to sort the ArrayList in descending order
public static void sortArrayListDescending(ArrayList<Integer> list) {
    int n = list.size();
    boolean swapped;

    // Bubble Sort Algorithm for Descending Order
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - 1 - i; j++) {
            if (list.get(j) < list.get(j + 1)) {
                // Swap elements
                int temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
                swapped = true;
            }
        }
        // If no elements were swapped in the inner loop, the list is already sorted
        if (!swapped) {
            break;
        }
    }
}

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(9);
        list.add(2);

        System.out.println("Original List: " + list);
        sortArrayListDescending(list);
        System.out.println("Sorted List: " + list);
    }


}
