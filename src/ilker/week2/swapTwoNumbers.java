package ilker.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable values without using a third variable

        int a = 21;
        int b = 10;

        System.out.println("before swap: " + a);
        System.out.println("before swap: " + b);

        b = b - a;
        a = b + a;
        b = a - b;

        System.out.println("---------------------------------");
        System.out.println("after swap: " + a);
        System.out.println("after swap: " + b);


    }
}
