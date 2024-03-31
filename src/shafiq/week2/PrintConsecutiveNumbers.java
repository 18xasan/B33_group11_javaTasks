package shafiq.week2;

public class PrintConsecutiveNumbers {
    public static void main(String[] args) {
        printNumbers(30);
    }

    public static void printNumbers(int N) {
        for (int number = 1; number <= N; number++) {
            String result = "";
            if (number % 2 == 0) {
                result += "Codility";
            }else if (number % 3 == 0) {
                result += "Test";
            }else if (number % 5 == 0) {
                result += "Coders";
            }else{
                result = Integer.toString(number);
            }
            System.out.println(result);
        }
    }
}