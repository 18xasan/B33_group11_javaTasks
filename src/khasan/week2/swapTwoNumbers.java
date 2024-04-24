package khasan.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable
        swapTwoNum(3, 5);

    }

    public static void swapTwoNum(int num1, int num2) {
        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;


        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
