package atil.week8;

public class permutationCombinations {
    //Given an array of 3 characters print all permutation combinations from the given characters

    public static void printPermutations(char[] array) {
        permute(array, 0);
    }

    private static void permute(char[] array, int start) {
        if (start == array.length - 1) {
            System.out.println(new String(array));
        } else {
            for (int i = start; i < array.length; i++) {
                swap(array, start, i);
                permute(array, start + 1);
                swap(array, start, i); // backtrack
            }
        }
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C'};
        printPermutations(array); // Output: ABC, ACB, BAC, BCA, CAB, CBA
    }
}
