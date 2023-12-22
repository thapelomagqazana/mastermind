//package org.example;
//
//import org.example.codeinitializer.SecretCode;
//import org.example.gameboard.GameBoard;
//import org.example.mastermind.Mastermind;
//import org.example.player.Player;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//class MastermindIntegrationTest {
//
//    private final ByteArrayInputStream simulatedInput = new ByteArrayInputStream("RGBW\nRGBW\n".getBytes());
//    private final ByteArrayOutputStream simulatedOutput = new ByteArrayOutputStream();
//
//    @BeforeEach
//    void setUpStreams() {
//        System.setIn(simulatedInput);
//        System.setOut(new PrintStream(simulatedOutput));
//    }
//
//    @AfterEach
//    void restoreStreams() {
//        System.setIn(System.in);
//        System.setOut(System.out);
//    }
//
//    @Test
//    void testMastermindIntegration() throws InterruptedException {
//        // Create an ExecutorService with a single thread for testing
//        ExecutorService testExecutorService = Executors.newFixedThreadPool(1);
//
//        // Create and initialize a secretCode for the game
//        String secretCode = SecretCode.initializeSecretCode();
//
//        // Create a Mastermind game with a specific GameBoard and a Player, and the ExecutorService
//        Mastermind mastermind = new Mastermind(new GameBoard(secretCode), new Player(System.in), testExecutorService);
//
//        // Start and play the Mastermind game in a separate thread
//        Thread gameThread = new Thread(mastermind::playGame);
//        gameThread.start();
//
//        // Wait for the game to finish (max 5 seconds)
//        gameThread.join(TimeUnit.SECONDS.toMillis(5));
//
//        // Shutdown the ExecutorService when it's no longer needed
//        testExecutorService.shutdown();
//
//        // Check if the game output contains the success message
//        String output = simulatedOutput.toString();
//        assertTrue(output.contains("Congratulations! You guessed the correct code!"));
//    }
//}
