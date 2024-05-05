package shafiq.week1;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(checkOddOrEven(5));

    }

    public static String checkOddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }


}

//Write a method which can identifies given number is even or odd
