package khasan.week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator

        int dividend = 15;
        int divisor = 3;
        System.out.println(divide(dividend, divisor)); // Output: 5
    }


    public static int divide(int dividend, int divisor) {
        int quotient = 0;
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return quotient * sign;
    }
}
