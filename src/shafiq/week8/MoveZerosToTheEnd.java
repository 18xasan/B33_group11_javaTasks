package shafiq.week8;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/


    public static void moveZerosToEnd(int[] array) {
        int nonZeroCount = 0;

        // Iterates over the array
        for (int i = 0; i < array.length; i++) {
            // Checking if the current element is non-zero
            if (array[i] != 0) {
                // Swapping the element at 'nonZeroCount' and 'i'
                swapElementsInArray(array, nonZeroCount, i);
                nonZeroCount++;
            }
        }
    }

    public static void swapElementsInArray(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }


    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12, 44, 0, 47, 77, 0, 3, 0};
        moveZerosToEnd(array);
        System.out.println(Arrays.toString(array));
    }
}
// completed