package Lilia.week3;

public class PrimeNumber {
    public static void main(String[] args) {

        // Write a method that can check if a number is prime or not
        int num = 40;

        for(int i=2;i<num;i++) {

            if(num <= 1) {
                System.out.println(num + " not prime");
                return;
            }
            if(num % i == 0) {
                System.out.println(num + " not prime");
                return;
            }
        }

        System.out.println(num + " is prime");

    }
}
