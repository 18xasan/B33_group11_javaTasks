package nurgulia.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
   public static void main(String[] args) {
       String str = "ABCD";
       System.out.println(reversedString(str));

       System.out.println(reverseStringWithStringBuilder(str));
   }

    public static String reversedString(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
public static StringBuilder reverseStringWithStringBuilder(String str){
       StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        result.append(str.charAt(i));
    }
    return result.reverse();
}

}
