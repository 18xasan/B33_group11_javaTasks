package khasan.week7;

public class arrayFindMinimum {
    // Write a method that can find the minimum number from an int Array
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arrNumbers = {5, 2, 9, 1, 7,4,45};
        System.out.println("findMinimum(arrNumbers) = " + findMinimum(arrNumbers));
    }

}
