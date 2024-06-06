package shafiq.week5;

import java.util.Arrays;
import java.util.Stack;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {

        System.out.println("reverseString1(\"Test String 1\") = " + reverseString1("Test String 1"));
        System.out.println("reverseString2(\"Test String 2\") = " + reverseString2("Test String 2"));
        System.out.println("reverseString3(\"Test String 3\") = " + reverseString3("Test String 3"));
        System.out.println("reverseString4(\"Test String 4\") = " + reverseString4("Test String 4"));
        System.out.println("reverseString5(\"Test String 5\") = " + reverseString5("Test String 5"));
        System.out.println("reverseString6(\"Test String 6\") = " + reverseString6("Test String 6"));

    }

    /**
     * The simplest and most efficient method to reverse a string in Java
     * using StringBuilder's reverse() method.
     *
     * @param str input string
     * @return reversed string
     */
    public static String reverseString1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * The StringBuffer class in Java is the same as String class except
     * that it is mutable i.e., it can be modified.
     *
     * @param str input string
     * @return reversed string
     */
    public static String reverseString2(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    /**
     * This approach involves converting the string to a character array
     * and then swapping elements from the start with the end, gradually moving inwards.
     *
     * @param str input string
     * @return reversed string
     */
    public static String reverseString3(String str) {
        char[] strArray = str.toCharArray();
        int start = 0;
        int end = strArray.length - 1;
        char temp;

        while (start < end) {
            temp = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = temp;

            start++;
            end--;
        }

        return new String(strArray);
    }

    /**
     * In this approach, the method recursive calls itself by
     * chopping the first character off the string until
     * it’s empty, at which point it will unwind.
     *
     * @param str input string
     * @return reversed string
     */
    public static String reverseString4(String str) {
        if (str.isEmpty())
            return str;
        return reverseString4(str.substring(1)) + str.charAt(0);
    }

    /**
     * One of the direct manual methods involves using a for
     * loop to read characters in the original string
     * from end to start and append to the result.
     *
     * @param str input string
     * @return reversed string
     */
    public static String reverseString5(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    /**
     * The idea is straightforward; we first push all characters
     * of the string to a stack, then we pull all characters
     * from the stack and place them back in the string.
     *
     * @param str input string
     * @return reversed string
     */
    public static String reverseString6(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return reversed;
    }


}
