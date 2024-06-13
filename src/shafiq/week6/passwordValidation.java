package shafiq.week6;

public class passwordValidation {
    /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns false
*/


    public static boolean isValidPasswordUsingRegEx(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$";
        return password.matches(regex);
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 6) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        return hasDigit && hasUpperCase && hasLowerCase && hasSpecialChar;
    }

    public static void main(String[] args) {

        String password = "12sffSS@";

        System.out.println("isValidPassword() = " + isValidPassword(password));
        System.out.println("isValidPasswordUsingRegEx() = " + isValidPasswordUsingRegEx(password));
    }



}
