package shafiq.week1;

public class DivisionWithoutOperatorUsingMathClass {
//Write a method that can divide two numbers without using division operator, use math class
    public static int divide(int dividend, int divisor) {
        return Math.floorDiv(dividend, divisor);
    }

    public static void main(String[] args) {
        System.out.println(divide(20,2));
    }


}

