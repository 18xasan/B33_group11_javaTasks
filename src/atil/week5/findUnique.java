package atil.week5;

public class findUnique {

        public static void main(String[] args) {
            // Test the method with a sample string
            String result = unique("AAABBBCCCDEF");
            System.out.println(result);  // Output should be "DEF"
        }

        public static String unique(String str) {
            StringBuilder uniqueChars = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                boolean isUnique = true;

                for (int j = 0; j < str.length(); j++) {
                    if (i != j && currentChar == str.charAt(j)) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    uniqueChars.append(currentChar);
                }
            }

            return uniqueChars.toString();
        }
    }