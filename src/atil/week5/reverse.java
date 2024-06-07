package atil.week5;

public class reverse {
    public static void main(String[] args) {
        // Test the method with a sample string
        String result = reverse("ABCD");
        System.out.println(result);  // Output should be "DCBA"
    }

    public static String reverse(String str) {
        StringBuilder reversedStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }

        return reversedStr.toString();
    }
}