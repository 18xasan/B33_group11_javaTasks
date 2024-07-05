package nurgulia.week10;

import java.util.Arrays;
import java.util.List;

public class ArrayList_Ascending {



//    Write a method that can sort the ArrayList in Ascending order without using the sort method

//    Solution:

    public static void main(String[] args) {
        List<Integer> listOfNums = Arrays.asList(3,5,7,899,0,-4,222,-500,45464,1,3,2);
      //  System.out.println("sortListInAsce(listOfNums) = " + sortListInAsce(listOfNums));
        System.out.println("sortListInAsce2(listOfNums) = " + sortListInAsce2(listOfNums));
    }

    public static List<Integer> sortListInAsce(List<Integer> nums){
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = 0; j < nums.size()-i-1; j++) {
                if(nums.get(j)>nums.get(j+1)){
                    int temp = nums.get(j);
                    nums.set(j,nums.get(j+1));
                    nums.set(j+1,temp);
                }
            }
        }

        return nums;
    }


    public static List<Integer> sortListInAsce2(List<Integer> nums){
        for (int i = 0; i < nums.size()-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < nums.size(); j++) {
                if(nums.get(minIndex)>nums.get(j)){
                    minIndex = j;
                }
            }
            int temp = nums.get(i);
            nums.set(i,nums.get(minIndex));
            nums.set(minIndex,temp);
        }
        return nums;
    }
}
