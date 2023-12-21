package org.example.guesser;

/**
 * The {@code Guess} class represents a player's guess in a Mastermind game.
 * It encapsulates the guessed string and provides a method to retrieve the validated guess.
 */
public class Guess {

    private final String guess;

    /**
     * Constructs a new Guess object with the specified guessed string.
     *
     * @param guess The player's guessed string.
     */
    public Guess(String guess) {
        this.guess = guess;
    }

    /**
     * Gets the validated guess. Returns null if the guess is not valid.
     *
     * @return The validated guess, or null if the guess is not valid.
     */
    public String getGuess() {
        if (GuessValidator.isValidGuess(this.guess)) {
            return guess;
        }
        return null;
    }
}
