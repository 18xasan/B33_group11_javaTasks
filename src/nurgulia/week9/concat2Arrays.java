package nurgulia.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class concat2Arrays {

//Write a return method that can concate two arrays

    public static void main(String[] args) {
        int[] arr = {1,99,2,0,3,42,4,0};
        int[] arr2 = {1,11,2,7,3,90,4,1};

        System.out.println("concateTwoArrays(arr,arr2) = " + concateTwoArrays(arr, arr2));
    }
    public static List<Integer> concateTwoArrays(int[] arr, int[] arr2) {
        List<Integer> newArr = new ArrayList<>();

        for (int i : arr) {
            newArr.add(i);
        }

        for (int i : arr2) {
            newArr.add(i);
        }
        return newArr;
    }
}
