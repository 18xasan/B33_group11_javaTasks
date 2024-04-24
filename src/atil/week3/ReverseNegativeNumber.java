package atil.week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        // Write a return method that can reverse negative number and return it as int


            int negativeNumber = -12345; // Example negative number
            int reversedNumber = reverseNegative(negativeNumber);
            System.out.println("Original number: " + negativeNumber);
            System.out.println("Reversed number: " + reversedNumber);
        }

        // Method to reverse a negative number and return it as an int
        public static int reverseNegative(int num) {
            if (num >= 0) {
                // If the number is non-negative, return it as is
                return num;
            }
            // Convert the negative number to a string, excluding the negative sign
            String numStr = String.valueOf(num).substring(1);
            // Reverse the string
            String reversedStr = new StringBuilder(numStr).reverse().toString();
            // Convert the reversed string back to an integer and add the negative sign
            int reversedNum = Integer.parseInt(reversedStr) * -1;
            return reversedNum;
        }
    }