package shafiq.week3;

import java.util.ResourceBundle;
import java.util.Scanner;

public class ReverseNegativeNumber {

//    Write a return method that can reverse negative
//    number and return it as int

    public static int reverseNegativeNumber(int num) {
        if (num >= 0) {
            return num;
        }
        String strNum = Integer.toString(num);
        String reversedStrNum = "-" + new StringBuilder(strNum.substring(1)).reverse().toString();
        return Integer.parseInt(reversedStrNum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversedNum = reverseNegativeNumber(num);
        System.out.println("Reversed number: " + reversedNum);
    }
}
