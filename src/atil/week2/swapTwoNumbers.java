package atil.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable


        swapTwoNumbers(5,10);
    }


    public static void swapTwoNumbers(int num1 , int num2){
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

