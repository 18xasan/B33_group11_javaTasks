package huseyin.week1.huseyin.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        // Write a return method that can reverse negative number and return it as int


        int num = -12345; // Example negative number
        int reversed = reverseNegative(num);
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversed);
    }

    public static int reverseNegative(int number) {
        // Convert the number to a string
        String numberStr = String.valueOf(Math.abs(number)); // Convert to positive for reversal

        // Reverse the string
        StringBuilder reversedStr = new StringBuilder(numberStr).reverse();

        // Convert the reversed string back to an integer
        int reversedNum = Integer.parseInt(reversedStr.toString());

        // Return the reversed number with the original sign
        return number < 0 ? -reversedNum : reversedNum;
    }
}

