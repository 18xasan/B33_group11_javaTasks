package khasan.week4;

public class SameLetters {

    public static void main(String[] args) {

        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false:

        System.out.println(same("abc", "cab")); // Output: true
        System.out.println(same("abc", "abb")); // Output: false
    }

    public static boolean same(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to store character counts
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count characters in str1
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

        // Decrement count for each character in str2
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}


