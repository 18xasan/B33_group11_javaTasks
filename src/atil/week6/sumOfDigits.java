package atil.week6;

public class sumOfDigits {
    //Write a method that can return the sum of the digits in a string
    public static int sumOfDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String testString = "abc123xyz";
        System.out.println("The sum of digits in the string \"" + testString + "\" is: " + sumOfDigits(testString));

        testString = "45someText67";
        System.out.println("The sum of digits in the string \"" + testString + "\" is: " + sumOfDigits(testString));
    }
}
