package atil.week6;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("The maximum number in the array is: " + findMax(array1));

        int[] array2 = {-10, -3, -1, -7, -20};
        System.out.println("The maximum number in the array is: " + findMax(array2));

        int[] array3 = {42};
        System.out.println("The maximum number in the array is: " + findMax(array3));
    }
}