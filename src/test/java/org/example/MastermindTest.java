//package org.example;
//
//import org.example.feedback.Feedback;
//import org.example.gameboard.GameBoard;
//import org.example.guesser.Guess;
//import org.example.mastermind.Mastermind;
//import org.example.player.Player;
//import org.junit.jupiter.api.Test;
//
//import java.util.Scanner;
//
//import static org.mockito.Mockito.*;
//
//class MastermindTest {
//
//    @Test
//    void testPlayGameCorrectGuess() {
//        // Mock the Player and GameBoard
////        Scanner scannerMock = mock(Scanner.class);
//        Player player = mock(Player.class);  // Use the actual constructor if it exists
//        GameBoard gameBoard = mock(GameBoard.class);
//
//        // Configure the mocks to simulate a correct guess after one attempt
//        when(player.makeGuess())
//                .thenReturn(new Guess("YBRW"));
//
//        when(gameBoard.processGuess("YBRW")).thenReturn(new Feedback(4, 0));
//
//        // Create the Mastermind instance with the mocks
//        Mastermind mastermind = new Mastermind(gameBoard, player);
//
//        // Run the playGame method
//        mastermind.playGame();
//
//        // Verify that the correct guess is printed
//        verify(gameBoard, times(1)).processGuess("YBRW");
//        verify(player, times(1)).makeGuess();
//    }
//
//    @Test
//    void testPlayGameIncorrectGuess() {
//        // Mock the Player and GameBoard
//        Player player = mock(Player.class);
//        GameBoard gameBoard = mock(GameBoard.class);
//
//        // Configure the mocks to simulate an incorrect guess followed by a correct guess
//        when(player.makeGuess())
//                .thenReturn(new Guess("RGBW"))  // Incorrect guess
//                .thenReturn(new Guess("YBRW")); // Correct guess
//        when(gameBoard.processGuess("RGBW")).thenReturn(new Feedback(2, 2));
//        when(gameBoard.processGuess("YBRW")).thenReturn(new Feedback(4, 0));
//
//        // Create the Mastermind instance with the mocks
//        Mastermind mastermind = new Mastermind(gameBoard, player);
//
//        // Run the playGame method
//        mastermind.playGame();
//
//        // Verify that both guesses are processed
//        verify(gameBoard, times(1)).processGuess("RGBW");
//        verify(gameBoard, times(1)).processGuess("YBRW");
//        verify(player, times(2)).makeGuess();
//    }
//
//    // Add more test methods as needed
//}
