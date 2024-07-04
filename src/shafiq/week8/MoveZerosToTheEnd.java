package shafiq.week8;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/


    public static void moveZerosToEnd(int[] array) {
        int count = 0;  // This variable tracks the next position where we can put a non-zero number

        // Iterates over the array
        for (int i = 0; i < array.length; i++) {
            // Checking if the current element is non-zero
            if (array[i] != 0) {
                // Swapping the element at 'count' and 'i'
                int temp = array[count];
                array[count] = array[i];
                array[i] = temp;
                // Increasing the count. This means next time we encounter a non-zero,
                // it will be placed at the next location in the array
                count++;
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12, 44, 0, 47, 77, 0, 3, 0};
        moveZerosToEnd(array);
        System.out.println(Arrays.toString(array));
    }
}
