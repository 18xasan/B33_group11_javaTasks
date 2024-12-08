package nurgulia.week10;

import java.util.Arrays;
import java.util.List;

public class ArrayList_Descending {


//    Write a method that can sort the ArrayList in descending order without using the sort method

//    Solution:
public static void main(String[] args) {
    List<Integer> listOfNums = Arrays.asList(3,5,7,899,0,-4,222,-500,45464,1,3,2);
    System.out.println(sortListInDesc(listOfNums));
}

    public static List<Integer> sortListInDesc(List<Integer> nums){
        for (int i = 0; i < nums.size()-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(j)> nums.get(maxIndex)){
                    maxIndex = j;
                }
            }
            int temp = nums.get(i);
            nums.set(i,nums.get(maxIndex));
            nums.set(maxIndex,temp);
        }

        return nums;
    }

}
