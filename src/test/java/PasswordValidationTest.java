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
}