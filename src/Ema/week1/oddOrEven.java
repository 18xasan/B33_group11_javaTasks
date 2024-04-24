package Ema.week1;

public class oddOrEven {
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd

        oddOrEven(2);
    }

    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        } else System.out.println("odd");

    }
}
