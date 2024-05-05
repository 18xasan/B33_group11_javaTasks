package shafiq.week3;

public class PrimeNumber {

    //Write a method that can check if a number is
    //prime or not
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // number is divisible by another number, so it's not prime
            }
        }
        return true; // number is prime
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
}


