package shafiq.week9;

import java.util.Arrays;

public class concat2Arrays {

//Write a return method that can concat two arrays

    public static int[] concatArrays2(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    public static int[] concatArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[i + arr1.length] = arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println("concatArrays(arr1,arr2) = " + Arrays.toString(concatArrays(arr1, arr2)));
        System.out.println("concatArrays(arr1,arr2) = " + Arrays.toString(concatArrays2(arr1, arr2)));

    }

}
