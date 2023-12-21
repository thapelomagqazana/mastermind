//package org.example;
//
//import org.example.guesser.Guess;
//import org.example.player.Player;
//import org.junit.jupiter.api.Test;
//
//import java.io.ByteArrayInputStream;
//import java.io.InputStream;
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.mockito.Mockito.*;
//
//class PlayerTest {
//
//    @Test
//    void testMakeGuess() {
//        // Create a mock Scanner with different inputs for testing
//        Scanner scanner = mock(Scanner.class);
//
//        // Scenario 1: Valid guess input
//        when(scanner.nextLine()).thenReturn("RGBW");
//        Player player1 = new Player(scanner);
//        Guess guess1 = player1.makeGuess();
//        assertEquals("RGBW", guess1.getGuess());
//
//        // Scenario 2: Empty input
//        when(scanner.nextLine()).thenReturn("");
//        Player player2 = new Player(scanner);
//        Guess guess2 = player2.makeGuess();
//        assertNull(guess2);
//
//        // Scenario 3: Input with invalid characters
//        when(scanner.nextLine()).thenReturn("1234");
//        Player player3 = new Player(scanner);
//        Guess guess3 = player3.makeGuess();
//        assertNull(guess3);
//
//        // Scenario 4: NoSuchElementException (simulate end of input)
//        when(scanner.nextLine()).thenThrow(new NoSuchElementException());
//        Player player4 = new Player(scanner);
//        Guess guess4 = player4.makeGuess();
//        assertNull(guess4);
//
//        // Verify that nextLine was called the correct number of times
//        verify(scanner, times(4)).nextLine();
//    }
//}
