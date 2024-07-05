package nurgulia.week6;

public class passwordValidation {

    public static void main(String[] args) {
        System.out.println("verifyIfPasswordIsValid(\"hfjd5hffur\") = " + verifyIfPasswordIsValid("hfjd5hffur"));
        System.out.println("verifyIfPasswordIsValid(\"65t4654756\") = " + verifyIfPasswordIsValid("65t4654756"));
        System.out.println("verifyIfPasswordIsValid(\"757 jgk  \") = " + verifyIfPasswordIsValid("757 jgk  "));
        System.out.println("verifyIfPasswordIsValid(\"HDBFJVL76\") = " + verifyIfPasswordIsValid("HDBFJVL76"));
        System.out.println("verifyIfPasswordIsValid(\"\") = " + verifyIfPasswordIsValid(""));
        System.out.println("verifyIfPasswordIsValid(\"   \") = " + verifyIfPasswordIsValid("   "));
        System.out.println("verifyIfPasswordIsValid(\"HelloWorld11!\") = " + verifyIfPasswordIsValid("HelloWorld11!"));

    }



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



    public static boolean verifyIfPasswordIsValid(String password){
        boolean len = false;
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsDigit = false;
        boolean containsSpecialCharacters = false;
        boolean containsSpace = false;
        boolean result = false;

        if (password.length() >= 6){
            len = true;
        }

        for (int i = 0; i < password.length(); i++) {
            if(Character.isWhitespace(password.charAt(i))){
                containsSpace = true;
            }
            if(Character.isUpperCase(password.charAt(i))){
                containsUpperCase = true;
            }
            if(Character.isLowerCase(password.charAt(i))){
                    containsLowerCase = true;
                }
            if(Character.isDigit(password.charAt(i))){
                containsDigit = true;
            }
            if(!Character.isLetterOrDigit(password.charAt(i))){
                containsSpecialCharacters = true;
            }

        }
      if (containsSpace == true){
          result = false;
      }
      if (containsSpace == false && containsSpecialCharacters == true && containsUpperCase == true && containsLowerCase == true
              && containsDigit == true ){
          result = true;
      }

      return result;

    }
}
