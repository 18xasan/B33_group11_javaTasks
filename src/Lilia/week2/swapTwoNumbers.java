package Lilia.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable

        int num1 = 20;
        int num2 = 60;
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

    }
}
