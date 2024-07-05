package atil.week11;

//Write a method that can sort the ArrayList in Ascending order without using the sort method

import java.util.ArrayList;

public class arrayListSortAsc {

    public static void sortArrayListAscending(ArrayList<Integer> list) {
        int n = list.size();
        boolean swapped;

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
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
        sortArrayListAscending(list);
        System.out.println("Sorted List: " + list);
    }
}
