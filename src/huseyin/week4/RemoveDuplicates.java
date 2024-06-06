package huseyin.week4;

public class RemoveDuplicates {

    public static void main(String[] args) {

        //Write a return method that can remove the duplicated values from String
        //Ex: removeDup("AAABBBCCC") ==> ABC

        String input = "AAABBBCCC";
        System.out.println(removeDup(input)); // Output: ABC
    }



        public static String removeDup(String input) {
            String result = "";

            // Iterate through each character in the input string
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);


                // Check if the character is already present in the result string
                if (result.indexOf(c) == -1) {
                    result += c; // If not present, add it to the result string
                }
            }

            return result;
        }


    }


