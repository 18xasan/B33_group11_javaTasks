package nurgulia.week1;
//Numbers -- odd & even
//f
//Write a method which can identifies given number is even or odd
//EX:
//identify(5) -> "Odd"
//identify(6) -> "Even"
public class OddAndEven {
    public static void main(String[] args) {
        System.out.println("identifyOddEven(15) = " + identifyOddEven(15));
        System.out.println("identifyOddEven(22) = " + identifyOddEven(22));

    }

    public static String identifyOddEven(int num){
        return num%2==0 ? "Even" : "odd" ;
    }
}
