package shafiq.week1;

public class DivisionWithoutOperator_2 {
    public static int divide(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Handle overflow cases
        if (divisor == -1 && dividend == Integer.MIN_VALUE) {
            // Special case: division of Integer.MIN_VALUE by -1
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        // Make both dividend and divisor positive
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        // Initialize the quotient
        int quotient = 0;

        // Repeat subtracting divisor from dividend until dividend becomes less than divisor
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            quotient++;
        }
        return sign * quotient;
    }

    public static void main(String[] args) {
        int dividend = 20;
        int divisor = 30;
        int result = divide(dividend, divisor);
        System.out.println("Result of " + dividend + " divided by " + divisor + " is: " + result);
    }
}

