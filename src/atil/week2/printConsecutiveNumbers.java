package atil.week2;

public class printConsecutiveNumbers {
    public static void main(String[] args) {
      /*  Write a function: that, given a positive integer N, prints the consecutive numbers from 1 to N,
      each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
      Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5,
      it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
      For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible
      by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

        For example, here is the output for N = 24:
        1
        Codility
       Test
        Codility
        Coders
        CodilityTest
        7
        Codility
        Test
        Codi1ityCoders
        11
        CodilityTest
        13
        Codility
        TestCoders
        Codility
        17
*/

<<<<<<<<< Temporary merge branch 1
        printConsecutiveNumbers(30);
    }
        public static void printConsecutiveNumbers(int n) {
            String result = "";
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                    result = "CodibilityTestCoders";
                } else if (i % 2 == 0 && i % 3 == 0) {
                    result = "CodibilityTest";
                } else if (i % 2 == 0 && i % 5 == 0) {
                    result = "CodibilityCoders";
                } else if (i % 3 == 0 && i % 5 == 0) {
                    result = "TestCoders";
                } else if (i % 2 == 0) {
                    result = "Codibility";
                } else if (i % 3 == 0) {
                    result = "Test";
                } else if (i % 5 == 0) {
                    result = "Coders";
                } else {
                    result = i + "";
                }
                System.out.println(result);
            }
    }
}
=========
            printConsecutiveNumbers(30);
        }
        public static void printConsecutiveNumbers(int n) {
            String result = "";
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0 && i % 3 == 0 && i % 5 ==0){
                    result = "CodibilityTestCoders";
                } else if (i % 2 == 0 && i % 3 == 0 ) {
                    result = "CodibilityTest";
                } else if (i % 2 == 0 && i % 5 == 0) {
                    result = "CodibilityCoders";
                } else if (i % 3 == 0 && i % 5 == 0) {
                    result = "TestCoders";
                } else if (i % 2 == 0 ){
                    result = "Codibility";
                }else if (i % 3 == 0){
                    result = "Test";
                } else if (i % 5 == 0) {
                    result = "Coders";
                }else {
                    result = i + "";
                }
                System.out.println(result);
            }
    }

}



>>>>>>>>> Temporary merge branch 2
