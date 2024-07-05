package nurgulia.week7;

public class arraySortAscending {
    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};*/
//hello


    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        sortArrayAsce(arr);
        for (int i : arr) {
            System.out.println("arr[i] = " + arr[i]);
        }

    }

    public static int[] sortArrayAsce(int[] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                int temp = arr[i];
               arr[i] = min;
               arr[i-1] = temp;

            }
        }
        return arr;
    }
}
