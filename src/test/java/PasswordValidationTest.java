import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void hasAtLeastEightCharactersTest_whenLengthFrom8_thenReturnTrue () {
        // GIVEN
        String password = "abcdefghij1234";

        // WHEN
        boolean pLength = PasswordValidation.hasAtLeastEightCharacters(password);

        // THEN
        assertTrue(pLength);
    }

    @Test
    void hasAtLeastEightCharactersTest_whenLengthSmallerThan8_thenReturnFalse () {
        // GIVEN
        String password = "abcdefg";

        // WHEN
        boolean pLength = PasswordValidation.hasAtLeastEightCharacters(password);

        // THEN
        assertFalse(pLength);
    }
}