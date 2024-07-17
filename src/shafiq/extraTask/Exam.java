package shafiq.extraTask;

public class Exam {


    public static void consecutiveNumbers(int number, int n) {


        for (int i = 0; i <= n; i++) {


            if (number % 2 == 0) {

                String temp = String.valueOf(number);
                temp = "Codility";

            }
            if (number % 3 == 0) {

                String string = String.valueOf(number);
                string = "Test";
            }
            if (number % 5 == 0) {
                String string = String.valueOf(number);
                string = "Coders";
            }

            if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
                String string = String.valueOf(number);
                string = "Codility,Test,Coders";
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

//        System.out.println(consecutiveNumbers(2,90));

    }

}