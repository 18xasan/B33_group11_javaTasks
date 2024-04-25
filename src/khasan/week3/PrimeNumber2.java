package khasan.week3;

public class PrimeNumber2 {

    public static void main(String[] args) {
        // Write a method that can check if a number is prime or not

        primeOrNot(68);
    }

    public static void primeOrNot(int num) {
        int q = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                q++;
            }

        }

        if (q == 2) {
            System.out.println(num + " is a prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }

}

