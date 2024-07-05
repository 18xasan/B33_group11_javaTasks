package nurgulia.week7;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
//hellooo

    public static void main(String[] args) {
        int[] arr = {4, 6,1000,-7, 7, 8, 9, 0, 23, 565, 0};
        System.out.println("findMin(arr) = " + findMin(arr));
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
