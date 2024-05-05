package Meho.week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        // Write a return method that can reverse negative number and return it as int


        int num = -22334455;
        int reverse = 0;
        while (num!= 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        System.out.println(reverse);


    }
}
