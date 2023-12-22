package org.example.mastermind;

import org.example.Main;
import org.example.feedback.Feedback;
import org.example.gameboard.GameBoard;
import org.example.guesser.Guess;
import org.example.player.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.concurrent.ExecutorService;

/**
 * The {@code Mastermind} class orchestrates the flow of a Mastermind game.
 * It manages the interaction between the game board, player, and the game loop.
 */
public class Mastermind {

    private final GameBoard gameBoard;
    private final Player player;
    private final ExecutorService executorService;
    private static final Logger LOGGER = LoggerFactory.getLogger(Mastermind.class);

    /**
     * Constructs a new Mastermind game with the specified game board and player.
     *
     * @param gameBoard The game board that manages the state of the game.
     * @param player    The player who makes guesses in the game.
     */
    public Mastermind(GameBoard gameBoard, Player player, ExecutorService executorService) {
        this.gameBoard = Objects.requireNonNull(gameBoard, "gameBoard must not be null");
        this.player = Objects.requireNonNull(player, "player must not be null");
        this.executorService = Objects.requireNonNull(executorService, "executorService must not be null");
    }

    /**
     * Plays the Mastermind game by repeatedly taking guesses from the player
     * and providing feedback until the correct code is guessed or an invalid input is detected.
     */
    public void playGame() {
        while (true) {
            // Get a guess from the player
            Guess guessObj = player.makeGuess();
            String guess = guessObj.getGuess();

            if (executorService.isShutdown()) {
                LOGGER.warn("The thread for processing the guess has SHUTDOWN.");
                return;
            }
            // Check if the guess is valid
            else if (guess == null) {
                LOGGER.warn("Invalid input. Please enter a valid guess.");
                return;
            } else {
                // Use ExecutorService to run the game logic concurrently
                executorService.execute(() -> {
                    // Process the guess and provide feedback
                    Feedback feedback = this.gameBoard.processGuess(guess);
                    LOGGER.info(guess + " " + feedback.toString());

                    // Check if the guess is correct
                    if (feedback.isCorrect()) {
                        LOGGER.info("Congratulations! You guessed the correct code!");
                        // Shutdown the ExecutorService if needed
                        executorService.shutdown();
                    }
                });

            }
        }
    }
}
