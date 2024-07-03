package Lilia.week5;

public class reverse {
    /* Write a return method that can reverse  String
     Ex: Reverse("ABCD"); ==> DCBA*/
    public static void main(String[] args) {
        strRev("ABCD");

    }
    public static void strRev(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.toCharArray()[i];
        System.out.println(reverse);;
    }
}
