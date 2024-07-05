package nurgulia.week7;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/
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
            if(arr[i] > min){
                int temp = arr[i];
                arr[i] = min;
                arr[i-1] = temp;

            }
        }
        return arr;
    }
}
