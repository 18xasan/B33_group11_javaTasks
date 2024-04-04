package ricardo.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable

        // My Variables
        int a = 10;
        int b = 20;


        System.out.println("Before Swaping:");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

        // I add the values of a and b and assigned the sum to a. Now a will hold the combined value of a and b.
        a = a + b;

        // I subtract original value of b from the updated value of a and assigned the result to b. Now b will hold the combined value of
        b = a - b;

        // I subtract original value of a from the updated value
        a = a - b;

        // After this the values will be swapped.
        // for verification, we print the values before and after the swap.

        System.out.println("After Swaping:");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);


    }
}
