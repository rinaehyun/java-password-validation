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

    /**
     * Name: hasUpperAndLowercase
     * @param pwd (String)
     * @return boolean
     * Validate if the password contains at least one Upper and Lower case
     */
    public static boolean hasUpperAndLowercase(String pwd) {
        boolean b = pwd.chars().anyMatch(Character::isUpperCase) &&
                pwd.chars().anyMatch(Character::isLowerCase);
        return b;
    }

    public static boolean detectCommonPasswords() {
        return false;
    }
}
