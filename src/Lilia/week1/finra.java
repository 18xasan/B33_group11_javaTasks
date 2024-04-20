package Lilia.week1;

public class finra {

    public static void main(String[] args) {
        //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
        //print "FIN" instead of the number and
        //for numbers which are a multiple of 5, print "RA" instead of the number.
        //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

        finra();
    }
    public static void finra() {
        for (int number = 1; number <= 30; number++) {
            if (number % 3 == 0) {
                System.out.print("FIN");
            } else if (number % 5 == 0) {
                System.out.print("RA");
            } else if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("FINRA");
            } else {
                System.out.print("");
            }
        }
    }
}
