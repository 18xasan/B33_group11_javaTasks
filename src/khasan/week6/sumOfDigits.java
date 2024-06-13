package khasan.week6;

public class sumOfDigits {
    //Write a method that can return the sum of the digits in a string
    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("sumOfDigits() = " + sumOfDigits("454212544"));
    }

}
