package org.example.gameboard;

import org.example.feedback.Feedback;
import org.example.guesser.Guess;

import java.util.Arrays;
import java.util.List;

/**
 * The {@code GameBoard} class manages the game state in a Mastermind game.
 * It includes a secret code that the player needs to guess and provides feedback for each guess.
 */
public class GameBoard {

    private final String secretCode;

    /**
     * Constructs a new GameBoard with the specified secret code.
     *
     * @param secretCode The secret code that the player needs to guess.
     */
    public GameBoard(String secretCode) {
        this.secretCode = secretCode;
    }

    /**
     * Processes a guess and provides feedback based on the matching positions and letters.
     *
     * @param guess The player's guess.
     * @return Feedback indicating the number of matching positions and letters.
     */
    public synchronized Feedback processGuess(String guess) {
        int matchingPositions = 0;
        int matchingLetters = 0;

        for (int i = 0; i < this.secretCode.length(); i++) {
            if (guess.charAt(i) == this.secretCode.charAt(i)) {
                matchingPositions++;
            } else if (this.secretCode.indexOf(guess.charAt(i)) > -1) {
                matchingLetters++;
            }
        }

        return new Feedback(matchingPositions, matchingLetters);
    }

    /**
     * Gets the secret code that the player is trying to guess.
     *
     * @return The secret code.
     */
    public String getSecretCode() {
        return this.secretCode;
    }
}
