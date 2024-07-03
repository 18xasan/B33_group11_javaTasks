package Lilia.week6;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {
        maxNum(new int[]{40,5,6,10});
    }

    public static void maxNum(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n)
            if (each > max)
                max = each;

        System.out.println(max);
    }
}
