package shafiq.week8;

public class permutationCombinations {
    //Given an array of 3 characters print all permutation combinations from the given characters
    //various ways in which a set of items can be ordered or arranged

    public static class Main {
        public static void main(String[] args) {
            char[] array = {'a', 'b', 'c','d'};
            permute(array, 0, array.length);
        }

        private static void permute(char[] array, int l, int r) {
            if (l == r) {
                for (char c : array) {
                    System.out.print(c);
                }
                System.out.println();
            } else {
                for (int i = l; i < r; i++) {
                    // swap
                    char temp = array[l];
                    array[l] = array[i];
                    array[i] = temp;

                    // recursion
                    permute(array, l+1, r);

                    // backtrack
                    temp = array[l];
                    array[l] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
