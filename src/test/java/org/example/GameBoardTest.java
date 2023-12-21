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
}
