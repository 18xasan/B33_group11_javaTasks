package nurgulia.week6;

public class sumOfDigits {
    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {
        System.out.println("sumOfDigits(\"Harold\") = " + sumOfDigits("Harold"));
        System.out.println("sumOfDigits(\"aackkdfjgljg\") = " + sumOfDigits("aackkdfjgljg"));
        System.out.println("sumOfDigits(\"t\") = " + sumOfDigits("t"));
    }

    public static int sumOfDigits(String str){
       return str.length();
    }
}
