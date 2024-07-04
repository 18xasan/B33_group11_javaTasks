package shafiq.week6;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array


    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaximum(new int[]{55,54,55,54,47,52,5554,669,784,44,222,45}));
    }

    /*
     * The function findMaximum is used to find the maximum value in an array of integers.
     *
     * @param arr Array of integers where the maximum value should be found.
     * This parameter should not be null.
     *
     * @return The maximum integer value found in the array. If the array is empty, the behavior is undefined,
     * as the method assumes that the first element is the maximum before starting the iteration.
     * If the array contains only one element, that element will be returned.
     *
     * Example usage:
     *
     * int[] numbers = {1, 2, 3, 4, 5};
     * int maxNumber = findMaximum(numbers);
     * System.out.println(maxNumber); // prints "5"
     *
     * Note: This function does not handle null input. When using this function, ensure the array argument is not null.
     */

}
