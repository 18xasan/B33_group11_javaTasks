package nurgulia.week1;
//Numbers -- Divide without / operator
//Write a method that can divide two numbers without using division operator
public class divisionWithoutOperator {
    public static void main(String[] args) {
        divideWithoutOperator(5,8);
        divideWithoutOperator(11,8);
        divideWithoutOperator(8,8);
        divideWithoutOperator(0,8);
        divideWithoutOperator(234,50);
    }

    public static void divideWithoutOperator(int num1, int num2) {
            if(num2==0) {
                System.out.println("Invalid Number");
                return;
            }
            System.out.print(num1 +" divided by "+num2 +" is: ");
            int count =0;
            while(num1 >= num2) {
                num1 -= num2;
                count++;
            }
            System.out.println(count+" and remainder is "+num1);
        }

    }





