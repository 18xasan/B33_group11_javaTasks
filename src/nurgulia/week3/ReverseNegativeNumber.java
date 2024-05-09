package nurgulia.week3;


public class ReverseNegativeNumber {

    public static void main(String[] args) {

        // Write a return method that can reverse negative number and return it as int
        System.out.println("reverseNegativeNumber(-4456) = " + reverseNegativeNumber(-4456));
        System.out.println("reverseNegativeNumber(-5) = " + reverseNegativeNumber(-5));
        System.out.println("reverseNegativeNumber(-1000000) = " + reverseNegativeNumber(-100000));
        System.out.println("reverseNegativeNumber(-1) = " + reverseNegativeNumber(-1));
        System.out.println("reverseNegativeNumber(-09484757667) = " + reverseNegativeNumber(-94857667));

    }
    public static int reverseNegativeNumber(int number){
        String num = String.valueOf(number);
        String reversed="";
        for(int i = num.length()-1; i>=1; i--){
            reversed += num.charAt(i);
        }
        return Integer.parseInt(reversed);
    }
}