package atil.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable


                int a = 5;
                int b = 10;

                System.out.println("Before swapping: a = " + a + ", b = " + b);

                a = a + b;
                b = a - b;
                a = a + b;

                System.out.println("After swapping: a = " + a + ", b = " + b);
            }

        }
