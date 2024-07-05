package nurgulia.week7;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/
  public static void main(String[] args) {
      int[] arr = {10, 9, 8, 7};
      sortArrayDesc(arr);
      for (int i : arr) {
          System.out.println("arr[i] = " + i);
      }

  }

    public static int[] sortArrayDesc(int[] arr){
       for (int i = 0;i<arr.length;i++){
           for (int j = i+1; j < arr.length; j++) {
               int temp = 0;
               if (arr[i]<arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
        }
        return arr;
    }
}
