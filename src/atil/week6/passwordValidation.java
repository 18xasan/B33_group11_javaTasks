package atil.week6;

public class passwordValidation {
    /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
*/
    public static boolean isValidPassword(String password) {
        if (password.length() < 6) {
            return false;
        }

        if (password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        String testPassword1 = "Password1!";
        System.out.println("Is \"" + testPassword1 + "\" a valid password? " + isValidPassword(testPassword1));

        String testPassword2 = "pass";
        System.out.println("Is \"" + testPassword2 + "\" a valid password? " + isValidPassword(testPassword2));

        String testPassword3 = "Password";
        System.out.println("Is \"" + testPassword3 + "\" a valid password? " + isValidPassword(testPassword3));

        String testPassword4 = "Password 1!";
        System.out.println("Is \"" + testPassword4 + "\" a valid password? " + isValidPassword(testPassword4));
    }
}
