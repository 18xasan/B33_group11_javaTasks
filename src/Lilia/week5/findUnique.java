package Lilia.week5;

public class findUnique {
    public static void main(String[] args) {
        /*Write a return method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

        unique("AAABBBCCCDEF");
    }
    public static void unique(String str) {
        String[ ] arr=str.split("");
        String unique1="";
        for(int j=0; j<arr.length; j++) {
            int num=0;
            for(int i=0; i<arr.length; i++ ) {
                if(arr[i].equals(arr[j]) )
                    num++;
            }
            if(num==1)
                unique1+=arr[j];
        }
        System.out.println(unique1);
    }
}
