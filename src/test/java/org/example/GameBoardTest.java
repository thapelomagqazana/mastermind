package org.example;

import org.example.feedback.Feedback;
import org.example.gameboard.GameBoard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    @Test
    void testProcessGuess() {
        GameBoard gameBoard = new GameBoard("RGBY");
        Feedback feedback = gameBoard.processGuess("RGWB");
        assertEquals(2, feedback.getMatchingPositions());
        assertEquals(1, feedback.getMatchingLetters());
    }

    // Add more test methods as needed
    @Test
    void testProcessGuessWithEmptySecretCode() {
        GameBoard gameBoard = new GameBoard("");
        Feedback feedback = gameBoard.processGuess("YBGR");

        assertEquals(0, feedback.getMatchingPositions(), "Matching positions should be 0 for empty secret code");
        assertEquals(0, feedback.getMatchingLetters(), "Matching letters should be 0 for empty secret code");
    }

}
