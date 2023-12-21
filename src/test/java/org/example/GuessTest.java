package org.example;

import org.example.guesser.Guess;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuessTest {

    @Test
    void testGuessConstruction() {
        Guess guess = new Guess("RGBW");
        assertEquals("RGBW", guess.getGuess());
    }

    // Add more test methods as needed
}
