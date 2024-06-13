package huseyin.week1.huseyin.week2;

public class swapTwoNumbers {

    // Swap two variable' values without using a third variable
    public static void main(String[] args) {

        swapTwoNumbers(10,15);
    }


    public static void swapTwoNumbers(int num1 , int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }

}
