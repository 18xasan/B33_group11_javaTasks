package nurgulia.week6;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {
        int[] arr = {4, 6,1000,-7, 7, 8, 9, 0, 23, 565, 0};

        System.out.println("findMax(arr) = " + findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
