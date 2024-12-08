package nurgulia.week8;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0};
        for (int i = 0; i < moveZeroToEnd(arr).length; i++) {
             System.out.print(arr[i]);
        }
    }
    public static int[] moveZeroToEnd(int[] arr) {
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }
        return arr;
    }


}





