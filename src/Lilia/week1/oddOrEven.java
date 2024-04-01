package Lilia.week1;

public class oddOrEven {

    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd
        //Write  a method which can identifies given number is even or odd

        oddOrEven(1);
    }

    public static void oddOrEven (int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        else {
            System.out.println(number + " is odd");
        }
    }
}
