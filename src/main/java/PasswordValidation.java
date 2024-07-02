public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static boolean hasAtLeastEightCharacters (String pwd) {
        return pwd.length() >= 8;
    }

    public static boolean containsDigits () {
        return false;
    }

    public static boolean hasUpperAndLowercase () {
        return false;
    }

    public static boolean detectCommonPasswords () {
        return false;
    }
}
