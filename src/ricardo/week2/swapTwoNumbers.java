package ricardo.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable

        int a = 10;
        int b = 20;

        System.out.println("Before Swaping:");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swaping:");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);


    }
}
