package shafiq.week5;

import java.util.Arrays;
import java.util.Comparator;


public class sortLettersNumbers {
    /*Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
     sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"*/


//First, we need to split the string into alphabets and digits. Then we sort these splits individually
// and combine them in various ways.

    //This program:
    //Extracts digits and alphabets from the provided string.
    //Sorts them separately.
    //Print the six desired versions of the combined sorted strings.




        public static void main(String[] args) {
            String s = "DC501GCCCA098911";
            String digits = s.replaceAll("\\D+","");
            String alpha = s.replaceAll("\\d+","");

            char[] digitsArray = digits.toCharArray();
            Arrays.sort(digitsArray);
            char[] alphaArray = alpha.toCharArray();
            Arrays.sort(alphaArray);

            String sortedDigits = new String(digitsArray);
            String sortedAlpha = new String(alphaArray);

            System.out.println("1) " + sortedDigits + sortedAlpha);
            System.out.println("2) " + sortedAlpha + sortedDigits);
            System.out.println("3) " + new StringBuilder(sortedDigits).reverse().toString() + sortedAlpha);
            System.out.println("4) " + sortedDigits + new StringBuilder(sortedAlpha).reverse().toString());
            System.out.println("5) " + new StringBuilder(sortedDigits).reverse().toString() + new StringBuilder(sortedAlpha).reverse().toString());
            System.out.println("6) " + new StringBuilder(sortedAlpha).reverse().toString() + sortedDigits);
        }
        //make a method that does this

    /**
     * Given alphanumeric String, we split the string into substrings of
     * consecutive letters or numbers, sort the individual string and append
     * them back together.
     *
     * @param input The input string.
     * @return A sorted alphanumeric string.
     */
    public static String sortAlphanumeric(String input) {
        StringBuilder sb = new StringBuilder();
        int j = 0;

        for (int i = 1; i <= input.length(); i++) {
            // When the end of string is reached or character type changes, perform sorting
            if (i == input.length() || Character.isDigit(input.charAt(i)) != Character.isDigit(input.charAt(i - 1))) {
                String substring = input.substring(j, i);

                if (Character.isDigit(substring.charAt(0))) {
                    // For numbers, sort in descending order
                    substring = substring.chars()
                            .mapToObj(c -> c - '0')
                            .sorted(Comparator.reverseOrder())
                            .collect(StringBuilder::new, (sbTemp, digit) -> sbTemp.append((char) (digit + '0')), StringBuilder::append)
                            .toString();
                } else {
                    // For letters, sort in ascending order
                    substring = substring.chars()
                            .sorted()
                            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                            .toString();
                }

                sb.append(substring);
                j = i;
            }
        }

        return sb.toString();
    }

    //In this code, we scan the input string by checking whether each character is a digit or a letter.
    // When we encounter a change or reach the end of the string, we sort the collected substring.
    // If the substring consists of digits, we sort it in descending order; if it consists of letters,
    // we sort it in ascending order. The sorted substrings are added to a StringBuilder,
    // and it is returned as a string at the end.

}
