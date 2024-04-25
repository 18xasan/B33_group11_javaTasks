package Lilia.week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        // Write a return method that can reverse negative number and return it as int

        int num = -1234567, reversed = 0;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);

    }
}
