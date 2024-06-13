package huseyin.week1.huseyin.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {
        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));
    }


    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

}
