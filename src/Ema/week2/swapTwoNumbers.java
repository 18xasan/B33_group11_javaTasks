package Ema.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable

            int a = 50;
            int b = 100;

            System.out.println("Before swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Swap values without using a third variable
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }






    }

