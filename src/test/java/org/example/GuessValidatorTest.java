package org.example;

import org.example.guesser.GuessValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuessValidatorTest {

    @Test
    void testValidGuess() {
        assertTrue(GuessValidator.isValidGuess("RGBW"));
    }

    @Test
    void testInvalidGuess() {
        assertFalse(GuessValidator.isValidGuess("RGGW")); // Duplicate letter
        assertFalse(GuessValidator.isValidGuess("RGB")); // Too short
        assertFalse(GuessValidator.isValidGuess("RGBWB")); // Too long
        assertFalse(GuessValidator.isValidGuess("RGBX")); // Invalid letter
    }

    // Add more test methods as needed
}
