package huseyin.week1.huseyin.week3;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 10; // Example number to check for prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Handling special cases for 0, 1, and negative numbers
        if (number <= 1) {
            return false;
        }

        // Checking divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, not a prime number
            }
        }

        return true; // If not divisible by any number, it's prime
    }
}