import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void hasAtLeastEightCharactersTest_whenLengthFrom8_thenReturnTrue() {
        // GIVEN
        String password = "abcdefghij1234";

        // WHEN
        boolean pLength = PasswordValidation.hasAtLeastEightCharacters(password);

        // THEN
        assertTrue(pLength);
    }

    @Test
    void hasAtLeastEightCharactersTest_whenLengthSmallerThan8_thenReturnFalse() {
        // GIVEN
        String password = "abcdefg";

        // WHEN
        boolean validate = PasswordValidation.hasAtLeastEightCharacters(password);

        // THEN
        assertFalse(validate);
    }

    @Test
    void containsDigitsTest_whenPWDHasDigits_thenReturnTrue() {
        // GIVEN
        String password = "1akskdk345";

        // WHEN
        boolean validate = PasswordValidation.containsDigits(password);

        // THEN
        assertTrue(validate);
    }

    @Test
    void containsDigitsTest_whenPWDDoesNotDigits_thenReturnFalse() {
        // GIVEN
        String password = "akskdk";

        // WHEN
        boolean validate = PasswordValidation.containsDigits(password);

        // THEN
        assertFalse(validate);
    }

    @Test
    void hasUpperAndLowercaseTest_whenPWDWithAtLeastOneUpperAndLower_thenReturnTrue() {
        // GIVEN
        String password = "234!!AbcD";

        // WHEN
        boolean validate = PasswordValidation.hasUpperAndLowercase(password);

        // THEN
        assertTrue(validate);
    }

    @Test
    void hasUpperAndLowercaseTest_whenPWDWithoutAtLeastOneUpperAndLower_thenReturnFalse() {
        // GIVEN
        String passwordWithoutChar = "234!!!!&&";
        String passwordWithOnlyUpper = "234!ABCD";
        String passwordWithOnlyLower = "234!abcd";

        // WHEN
        boolean validateWithoutChar = PasswordValidation.hasUpperAndLowercase(passwordWithoutChar);
        boolean validateWithOnlyUpper = PasswordValidation.hasUpperAndLowercase(passwordWithOnlyUpper);
        boolean validateWithOnlyLower = PasswordValidation.hasUpperAndLowercase(passwordWithOnlyLower);

        // THEN
        assertFalse(validateWithoutChar);
        assertFalse(validateWithOnlyUpper);
        assertFalse(validateWithOnlyLower);
    }

    @Test
    void hasSpecialCharactersTest_whenPWDHasAtLeastOneSpecialCharacter_thenReturnTrue() {
        // GIVEN
        String passwordWithSpecialCharacter1 = "1sk33kedA3%&";
        String passwordWithSpecialCharacter2 = "§$1sk33kedA3";
        String passwordWithSpecialCharacter3 = "1sk33k«€edA3";

        // WHEN
        boolean validate1 = PasswordValidation.hasSpecialCharacters(passwordWithSpecialCharacter1);
        boolean validate2 = PasswordValidation.hasSpecialCharacters(passwordWithSpecialCharacter2);
        boolean validate3 = PasswordValidation.hasSpecialCharacters(passwordWithSpecialCharacter3);


        // THEN
        assertTrue(validate1);
        assertTrue(validate2);
        assertTrue(validate3);
    }

    @Test
    void hasSpecialCharactersTest_whenPWDDoesNotHaveAtLeastOneSpecialCharacter_thenReturnFalse() {
        // GIVEN
        String passwordWithOutSpecialCharacter1 = "1sk33kedA3";
        String passwordWithOutSpecialCharacter2 = "Password123";
        String passwordWithOutSpecialCharacter3 = "PAEskek334";

        // WHEN
        boolean validate1 = PasswordValidation.hasSpecialCharacters(passwordWithOutSpecialCharacter1);
        boolean validate2 = PasswordValidation.hasSpecialCharacters(passwordWithOutSpecialCharacter2);
        boolean validate3 = PasswordValidation.hasSpecialCharacters(passwordWithOutSpecialCharacter3);

        // THEN
        assertFalse(validate1);
        assertFalse(validate2);
        assertFalse(validate3);
    }

    @Test
    void detectCommonPasswordsTest_whenPWDHasWeakPWE_thenReturnTrue() {
        //GIVEN
        String weakPassword1 = "password";
        String weakPassword2 = "PASSWORD";
        String weakPassword3 = "12345678";

        // WHEN
        boolean validateWeakness1 = PasswordValidation.detectCommonPasswords(weakPassword1);
        boolean validateWeakness2 = PasswordValidation.detectCommonPasswords(weakPassword2);
        boolean validateWeakness3 = PasswordValidation.detectCommonPasswords(weakPassword3);

        // THEN
        assertTrue(validateWeakness1);
        assertTrue(validateWeakness2);
        assertTrue(validateWeakness3);
    }

    @Test
    void detectCommonPasswordsTest_whenPWDHasStrongPWE_thenReturnFalse() {
        //GIVEN
        String weakPassword1 = "PasSWoRd";
        String weakPassword2 = "Skenwmdkso";

        // WHEN
        boolean validateWeakness1 = PasswordValidation.detectCommonPasswords(weakPassword1);
        boolean validateWeakness2 = PasswordValidation.detectCommonPasswords(weakPassword2);

        // THEN
        assertFalse(validateWeakness1);
        assertFalse(validateWeakness2);
    }
}