package Meho.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable

        //I will be using the arithmetic operator + and -

        int a = 5;
        int b = 10;
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        a = a + b;// I add a and b and then store result in a,and now a holds the
        // sum on both numbers which is 15

        b = a - b;// I subtract b from new value a and then store result in b ,
        // this assigns the orignal value of a(5) to value b

        a = a - b;// and then I subtract thr new value of b from new value of a and store the result in a,
        //so this assigns th original value of b(10) to a.

        // and now a holds 10 and b holds 5

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);

    }
}

