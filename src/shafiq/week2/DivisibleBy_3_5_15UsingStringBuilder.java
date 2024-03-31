package shafiq.week2;

public class DivisibleBy_3_5_15UsingStringBuilder {

    //using StringBuilder for string concatenation is usually much faster
    // than using +=, especially for larger data sets or in a loop, as the
    // Java compiler may not always optimize this to StringBuilder.

    public static void main(String[] args) {
        StringBuilder divisibleBy15 = new StringBuilder("Divisible By 15:");
        StringBuilder divisibleBy5 = new StringBuilder("Divisible By 5:");
        StringBuilder divisibleBy3 = new StringBuilder("Divisible By 3:");

        for (int number = 1; number <= 100; number++) {
            if (number % 15 == 0) {
                divisibleBy15.append(" ").append(number);
            }
            else if (number % 5 == 0) {
                divisibleBy5.append(" ").append(number);
            }
            else if (number % 3 == 0) {
                divisibleBy3.append(" ").append(number);
            }
        }

        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }
}