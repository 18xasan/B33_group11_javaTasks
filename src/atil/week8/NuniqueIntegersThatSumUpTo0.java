package atil.week8;

import java.util.Arrays;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/

    public static int[] generateUniqueIntegers(int N) {
        int[] result = new int[N];
        int sum = 0;

        // Fill the array with pairs of integers
        for (int i = 0; i < N - 1; i += 2) {
            result[i] = i + 1;
            result[i + 1] = -(i + 1);
        }

        // If N is odd, include a zero in the array
        if (N % 2 != 0) {
            result[N - 1] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] result = generateUniqueIntegers(N);
        System.out.println(Arrays.toString(result)); // Output: [1, -1, 2, -2] or similar

        N = 3;
        result = generateUniqueIntegers(N);
        System.out.println(Arrays.toString(result)); // Output: [1, -1, 0] or similar
    }
}
