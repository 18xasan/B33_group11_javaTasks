package shafiq.week1;

public class divisionWithoutOperator {

//Write another method that can divide two numbers without using division operator

    public static double divide(double dividend, double divisor) {
        double quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return quotient;
    }

    public static void main(String[] args) {

        System.out.println(divide(10,50.3));
    }


}


