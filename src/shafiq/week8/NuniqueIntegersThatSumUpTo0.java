package shafiq.week8;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/

    public static class Main {
        public static void main(String[] args) {

            int[] result = uniqueIntegers(10);
            for (int value : result) {
                System.out.print(value + " ");
            }
        }

        public static int[] uniqueIntegers(int N) {
            int[] arr = new int[N];
            int half = N / 2;
            for (int i = 0; i < half; i++) {
                arr[i] = i + 1;
                arr[N - 1 - i] = - (i + 1);
            }
            if (N % 2 != 0) {
                arr[half] = 0;
            }
            return arr;
        }
    }



}

/*
The idea is to create numbers and their negations so that they sum up to zero. To clarify with an example,
if we consider numbers 1 and -1, the sum is 0. If we consider 2 and -2, again the sum is 0. Thus, we use integers
and their negative counterparts to satisfy the conditions of the task.
As the requirements of the task also state that all integers must be unique, our code ensures that no two numbers
(positive or negative integers) are the same in the array.
The code is divided into three stages:
Initialization: We initialize an integer array arr of size N.
Assigning Values:
If the provided N is an even number, for the first half of the array, we assign each element with the corresponding
index's value + 1 (since index starts from 0, adding 1 gives us a number starting from 1). For the second half of the
array, we do the same but make the value negative.
If N is an odd number, we have an extra element in the array. In this case, we fill up the array in the same manner
as before up to (N - 1) elements. For the remaining one element, we put '0'. This is because adding 0 does not
affect the sum.
In the end, these processes ensure that we have an array with N different elements such that their sum equals 0.
Return Result: Finally, the function returns the array arr.
 */
