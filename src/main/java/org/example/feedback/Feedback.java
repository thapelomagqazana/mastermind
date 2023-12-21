package org.example.feedback;

/**
 * The {@code Feedback} class represents feedback after each guess in a Mastermind game.
 * It includes information about the number of matching positions and matching letters.
 */
public class Feedback {

    private final int matchingPositions;
    private final int matchingLetters;

    /**
     * Constructs a new Feedback object with the specified matching positions and matching letters.
     *
     * @param matchingPositions The number of positions that have matching letters.
     * @param matchingLetters   The total number of matching letters, including those at different positions.
     */
    public Feedback(int matchingPositions, int matchingLetters) {
        this.matchingPositions = matchingPositions;
        this.matchingLetters = matchingLetters;
    }

    /**
     * Returns a string representation of the feedback in the format "matchingLetters/matchingPositions".
     *
     * @return A string representation of the feedback.
     */
    @Override
    public String toString() {
        return matchingLetters + "/" + matchingPositions;
    }

    /**
     * Checks if the guess is correct by comparing the number of matching positions to the total positions.
     *
     * @return {@code true} if the guess is correct, {@code false} otherwise.
     */
    public boolean isCorrect() {
        return matchingPositions == 4;
    }

    public int getMatchingPositions() {
        return matchingPositions;
    }

    public int getMatchingLetters(){
        return matchingLetters;
    }
}
