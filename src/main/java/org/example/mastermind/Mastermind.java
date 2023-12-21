package org.example.mastermind;

import org.example.feedback.Feedback;
import org.example.gameboard.GameBoard;
import org.example.guesser.Guess;
import org.example.player.Player;

/**
 * The {@code Mastermind} class orchestrates the flow of a Mastermind game.
 * It manages the interaction between the game board, player, and the game loop.
 */
public class Mastermind {

    private final GameBoard gameBoard;
    private final Player player;

    /**
     * Constructs a new Mastermind game with the specified game board and player.
     *
     * @param gameBoard The game board that manages the state of the game.
     * @param player    The player who makes guesses in the game.
     */
    public Mastermind(GameBoard gameBoard, Player player) {
        this.gameBoard = gameBoard;
        this.player = player;
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

            // Check if the guess is valid
            if (guess == null) {
                System.out.println("Invalid input");
                return;
            } else {
                // Process the guess and provide feedback
                Feedback feedback = this.gameBoard.processGuess(guess);
                System.out.println(guess + " " + feedback.toString());

                // Check if the guess is correct
                if (feedback.isCorrect()) {
                    System.out.println("Congratulations! You guessed the correct code!");
                    break;
                }
            }
        }
    }
}
