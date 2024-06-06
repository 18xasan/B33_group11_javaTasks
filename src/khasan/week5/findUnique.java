package khasan.week5;

public class findUnique {
    public static void main(String[] args) {
        /*Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

        String result = unique("AAABBBCCCDEF");
        System.out.println(result);  // Output should be "DEF"
    }


        public static String unique(String str) {
            // Step 1: Create an array to count occurrences of each character
            int[] charCounts = new int[256]; // Assuming ASCII characters

            // Step 2: Iterate over the string and populate the array with counts
            for (int i = 0; i < str.length(); i++) {
                charCounts[str.charAt(i)]++;
            }

            // Step 3: Build a string with characters that have a count of 1
            StringBuilder uniqueChars = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (charCounts[str.charAt(i)] == 1) {
                    uniqueChars.append(str.charAt(i));
                }
            }

            // Step 4: Return the string with unique characters
            return uniqueChars.toString();
        }


    }

