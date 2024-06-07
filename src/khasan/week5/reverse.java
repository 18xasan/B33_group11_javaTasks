package khasan.week5;

public class reverse {

    public static void main(String[] args) {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
        String result = reverse("ABCD");
        System.out.println(result);  // Output should be "DCBA"
    }


    public static String reverse(String str) {
        // Create a new StringBuilder to hold the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate over the string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the StringBuilder
            reversed.append(str.charAt(i));
        }

        // Convert the StringBuilder to a String and return it
        return reversed.toString();
    }

}

