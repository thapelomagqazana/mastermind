package org.example;

import org.example.codeinitializer.SecretCode;
import org.example.gameboard.GameBoard;
import org.example.guesser.Guess;
import org.example.mastermind.Mastermind;
import org.example.player.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The {@code Main} class is the entry point for the Mastermind game.
 */
public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {


        try {
            // Create and initialize a secretCode for the game
            String secretCode = SecretCode.initializeSecretCode();
            System.out.println(secretCode);

            // Create an ExecutorService with a fixed number of threads (e.g., 4 threads)
            ExecutorService executorService = Executors.newFixedThreadPool(4);

            // Create a Mastermind game with a specific GameBoard and a Player, and the ExecutorService
            Mastermind mastermind = new Mastermind(new GameBoard(secretCode), new Player(new Scanner(System.in)), executorService);

            // Start and play the Mastermind game
            mastermind.playGame();

            // Shutdown the ExecutorService when it's no longer needed
            executorService.shutdown();
        }
        catch (Exception e)
        {
            LOGGER.error("Internal Error: "+e);
        }


    }
}
