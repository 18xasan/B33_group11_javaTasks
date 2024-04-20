package nurgulia.week3;

public class PrimeNumber {
    public static void main(String[] args) {

        // Write a method that can check if a number is prime or not

        System.out.println("isPrime(21) = " + isPrime(21));
        System.out.println("isPrime(9) = " + isPrime(9));
        System.out.println("isPrime(1) = " + isPrime(1));
        System.out.println("isPrime(7) = " + isPrime(7));
        System.out.println("isPrime(2) = " + isPrime(2));
        System.out.println("isPrime(956) = " + isPrime(956));
        System.out.println("isPrime(124959) = " + isPrime(124959));
        System.out.println("isPrime(89) = " + isPrime(89));
        System.out.println("isPrime(86) = " + isPrime(86));
    }


    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;

    }
}