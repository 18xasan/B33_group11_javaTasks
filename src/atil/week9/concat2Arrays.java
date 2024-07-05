package atil.week9;

import java.util.Arrays;

public class concat2Arrays {

//Write a return method that can concate two arrays
public static int[] concatArrays(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    System.arraycopy(arr1, 0, result, 0, arr1.length);
    System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
    return result;
}

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] result = concatArrays(array1, array2);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 3, 4, 5, 6]
    }

}
