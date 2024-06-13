package huseyin.week1.huseyin.week5;

public class findUnique {
    public static void main(String[] args) {
        /*Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

        System.out.println("findUnique(\"AAABBBCCCDEF\") = " + findUnique("AAABBBCCCDEF"));
    }

    public static String findUnique(String str) {

        String result ="";
        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }

        return result;
    }

}
