package Meho.week1;

public class oddOrEven {
    public static void main(String[] args) {

        //Write  a method which can identifies given number is even or odd

        identifyOddEven(5);
        identifyOddEven(6);
    }

    public static void identifyOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}