package ilker.week7;

public class arrayFindMinimum {
    // Write a method that can find the minimum number from an int Array

    public static void main(String[] args) {


    int [] numbers = {45,65,87,234,756,2134,-34,0};

    int minValue = minNum(numbers);
        System.out.println(minValue);
    }

    public static int minNum(int[] num){

        int minNum= Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {

            if(num[i] < minNum){
                minNum = num[i];
            }

        }
        return minNum;
    }

}
