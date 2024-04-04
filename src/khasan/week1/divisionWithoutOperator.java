package khasan.week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator
        int a = 10;
        int b = 20;

        System.out.println("Before Swaping:");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swaping:");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

    }


}
