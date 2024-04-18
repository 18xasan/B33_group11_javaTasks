package Lilia.week1;

public class divisionWithoutOperator {

    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator
// change
        division(0,24,3);
    }
    public static void division(int div, int num1, int num2){
        while (num1 >= num2) {
            num1 -= num2;
            div++;
        }
        System.out.println(div);
    }
}
