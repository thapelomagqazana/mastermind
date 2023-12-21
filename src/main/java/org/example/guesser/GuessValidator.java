package org.example.guesser;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The {@code GuessValidator} class provides methods to validate player guesses in a Mastermind game.
 */
public class GuessValidator {

    /**
     * Validates the user's guess input.
     *
     * @param guess The user's guess input.
     * @return {@code true} if the guess is valid, {@code false} otherwise.
     */
    public static boolean isValidGuess(String guess) {
        // Check if the input is null or has exactly 4 characters
        if (guess == null || guess.length() != 4) {
            return false;
        }

        // Check if each character is a valid color.
        List<Character> validOptions = List.of('R', 'G', 'B', 'Y', 'b', 'W');
        for (int i = 0; i < guess.length(); i++) {
            if (!validOptions.contains(guess.charAt(i))) {
                return false;
            }
        }

        // Check if all colors are unique in the guess
        Set<Character> uniqueColors = new HashSet<>();
        for (char colorCode : guess.toCharArray()) {
            if (!uniqueColors.add(colorCode)) {
                return false; // Duplicate color found
            }
        }

        // The guess is valid
        return true;
    }
}
