package shafiq.week2;

public class NumberSwapWithout3rdVariable {


        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            // Display initial values
            System.out.println("Initial values: a = " + a + ", b = " + b);

            // Swap without using a third variable (Mathematical approach)
            a = a + b;
            b = a - b;
            a = a - b;

            // Display swapped values
            System.out.println("Swapped values: a = " + a + ", b = " + b);
        }
    }

