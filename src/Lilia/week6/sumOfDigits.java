package Lilia.week6;

public class sumOfDigits {
    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {
        sumOfDigits("hello java 7 8 ");

    }

    public static void sumOfDigits(String s) {
        int sum = 0;
        char[] ch = s.toCharArray();
        for (char each : ch) {
            if (Character.isDigit(each)) {
                sum += Integer.valueOf("" + each);
            }
        }
        System.out.println(sum);

    }
}
