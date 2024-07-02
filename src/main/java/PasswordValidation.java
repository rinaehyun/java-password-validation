public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Name: hasAtLeastEightCharacters
     * @param pwd (String)
     * @return boolean
     * Validate if the password has length, which is bigger than 8
     */
    public static boolean hasAtLeastEightCharacters(String pwd) {
        return pwd.length() >= 8;
    }

    /**
     * Name: containsDigits
     * @param pwd (String)
     * @return boolean
     * Validate if the password contains at least one number
     */
    public static boolean containsDigits(String pwd) {
        return pwd.matches(".*\\d.*");
    }

    public static boolean hasUpperAndLowercase() {
        return false;
    }

    public static boolean detectCommonPasswords() {
        return false;
    }
}
